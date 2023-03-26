package com.microsoft.appcenter.channel;

import android.content.Context;
import android.os.Handler;
import com.microsoft.appcenter.CancellationException;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.http.HttpResponse;
import com.microsoft.appcenter.http.HttpUtils;
import com.microsoft.appcenter.http.ServiceCallback;
import com.microsoft.appcenter.ingestion.AppCenterIngestion;
import com.microsoft.appcenter.ingestion.Ingestion;
import com.microsoft.appcenter.ingestion.models.Device;
import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.LogContainer;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.microsoft.appcenter.ingestion.models.one.PartAUtils;
import com.microsoft.appcenter.persistence.DatabasePersistence;
import com.microsoft.appcenter.persistence.Persistence;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.IdHelper;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public class DefaultChannel implements Channel {
    @r2
    public static final int CLEAR_BATCH_SIZE = 100;
    private static final long MINIMUM_TRANSMISSION_INTERVAL = 3000;
    @r2
    public static final String START_TIMER_PREFIX = "startTimerPrefix.";
    private final Handler mAppCenterHandler;
    private String mAppSecret;
    private final Context mContext;
    private int mCurrentState;
    private Device mDevice;
    private boolean mDiscardLogs;
    private boolean mEnabled;
    private final Map<String, GroupState> mGroupStates;
    private final Ingestion mIngestion;
    private final Set<Ingestion> mIngestions;
    private final UUID mInstallId;
    private final Collection<Channel.Listener> mListeners;
    private final Persistence mPersistence;

    @r2
    /* loaded from: classes3.dex */
    public class GroupState {
        public final long mBatchTimeInterval;
        public final Ingestion mIngestion;
        public final Channel.GroupListener mListener;
        public final int mMaxLogsPerBatch;
        public final int mMaxParallelBatches;
        public final String mName;
        public boolean mPaused;
        public int mPendingLogCount;
        public boolean mScheduled;
        public final Map<String, List<Log>> mSendingBatches = new HashMap();
        public final Collection<String> mPausedTargetKeys = new HashSet();
        public final Runnable mRunnable = new Runnable() { // from class: com.microsoft.appcenter.channel.DefaultChannel.GroupState.1
            @Override // java.lang.Runnable
            public void run() {
                GroupState groupState = GroupState.this;
                groupState.mScheduled = false;
                DefaultChannel.this.triggerIngestion(groupState);
            }
        };

        public GroupState(String str, int i, long j, int i2, Ingestion ingestion, Channel.GroupListener groupListener) {
            this.mName = str;
            this.mMaxLogsPerBatch = i;
            this.mBatchTimeInterval = j;
            this.mMaxParallelBatches = i2;
            this.mIngestion = ingestion;
            this.mListener = groupListener;
        }
    }

    public DefaultChannel(@x1 Context context, String str, @x1 LogSerializer logSerializer, @x1 HttpClient httpClient, @x1 Handler handler) {
        this(context, str, buildDefaultPersistence(context, logSerializer), new AppCenterIngestion(httpClient, logSerializer), handler);
    }

    private static Persistence buildDefaultPersistence(@x1 Context context, @x1 LogSerializer logSerializer) {
        DatabasePersistence databasePersistence = new DatabasePersistence(context);
        databasePersistence.setLogSerializer(logSerializer);
        return databasePersistence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPendingLogsAfterPost(@x1 GroupState groupState, int i) {
        if (checkStateDidNotChange(groupState, i)) {
            checkPendingLogs(groupState);
        }
    }

    private boolean checkStateDidNotChange(GroupState groupState, int i) {
        return i == this.mCurrentState && groupState == this.mGroupStates.get(groupState.mName);
    }

    private void deleteLogsOnSuspended(GroupState groupState) {
        ArrayList arrayList = new ArrayList();
        this.mPersistence.getLogs(groupState.mName, Collections.emptyList(), 100, arrayList);
        if (arrayList.size() > 0 && groupState.mListener != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Log log = (Log) it.next();
                groupState.mListener.onBeforeSending(log);
                groupState.mListener.onFailure(log, new CancellationException());
            }
        }
        if (arrayList.size() >= 100 && groupState.mListener != null) {
            deleteLogsOnSuspended(groupState);
        } else {
            this.mPersistence.deleteLogs(groupState.mName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSendingFailure(@x1 GroupState groupState, @x1 String str, @x1 Exception exc) {
        String str2 = groupState.mName;
        List<Log> remove = groupState.mSendingBatches.remove(str);
        if (remove != null) {
            AppCenterLog.error("AppCenter", wo1.w("Sending logs groupName=", str2, " id=", str, " failed"), exc);
            boolean isRecoverableError = HttpUtils.isRecoverableError(exc);
            if (isRecoverableError) {
                groupState.mPendingLogCount = remove.size() + groupState.mPendingLogCount;
            } else {
                Channel.GroupListener groupListener = groupState.mListener;
                if (groupListener != null) {
                    for (Log log : remove) {
                        groupListener.onFailure(log, exc);
                    }
                }
            }
            this.mEnabled = false;
            suspend(!isRecoverableError, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSendingSuccess(@x1 GroupState groupState, @x1 String str) {
        List<Log> remove = groupState.mSendingBatches.remove(str);
        if (remove != null) {
            this.mPersistence.deleteLogs(groupState.mName, str);
            Channel.GroupListener groupListener = groupState.mListener;
            if (groupListener != null) {
                for (Log log : remove) {
                    groupListener.onSuccess(log);
                }
            }
            checkPendingLogs(groupState);
        }
    }

    @s2
    private Long resolveCustomTriggerInterval(@x1 GroupState groupState) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder G = wo1.G(START_TIMER_PREFIX);
        G.append(groupState.mName);
        long j = SharedPreferencesManager.getLong(G.toString());
        if (groupState.mPendingLogCount <= 0) {
            if (j + groupState.mBatchTimeInterval < currentTimeMillis) {
                StringBuilder G2 = wo1.G(START_TIMER_PREFIX);
                G2.append(groupState.mName);
                SharedPreferencesManager.remove(G2.toString());
                AppCenterLog.debug("AppCenter", "The timer for " + groupState.mName + " channel finished.");
                return null;
            }
            return null;
        } else if (j != 0 && j <= currentTimeMillis) {
            return Long.valueOf(Math.max(groupState.mBatchTimeInterval - (currentTimeMillis - j), 0L));
        } else {
            StringBuilder G3 = wo1.G(START_TIMER_PREFIX);
            G3.append(groupState.mName);
            SharedPreferencesManager.putLong(G3.toString(), currentTimeMillis);
            AppCenterLog.debug("AppCenter", "The timer value for " + groupState.mName + " has been saved.");
            return Long.valueOf(groupState.mBatchTimeInterval);
        }
    }

    private Long resolveDefaultTriggerInterval(@x1 GroupState groupState) {
        int i = groupState.mPendingLogCount;
        if (i >= groupState.mMaxLogsPerBatch) {
            return 0L;
        }
        if (i > 0) {
            return Long.valueOf(groupState.mBatchTimeInterval);
        }
        return null;
    }

    @s2
    private Long resolveTriggerInterval(@x1 GroupState groupState) {
        if (groupState.mBatchTimeInterval > 3000) {
            return resolveCustomTriggerInterval(groupState);
        }
        return resolveDefaultTriggerInterval(groupState);
    }

    @u1
    private void sendLogs(final GroupState groupState, final int i, List<Log> list, final String str) {
        LogContainer logContainer = new LogContainer();
        logContainer.setLogs(list);
        groupState.mIngestion.sendAsync(this.mAppSecret, this.mInstallId, logContainer, new ServiceCallback() { // from class: com.microsoft.appcenter.channel.DefaultChannel.1
            @Override // com.microsoft.appcenter.http.ServiceCallback
            public void onCallFailed(final Exception exc) {
                DefaultChannel.this.mAppCenterHandler.post(new Runnable() { // from class: com.microsoft.appcenter.channel.DefaultChannel.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        DefaultChannel.this.handleSendingFailure(groupState, str, exc);
                    }
                });
            }

            @Override // com.microsoft.appcenter.http.ServiceCallback
            public void onCallSucceeded(HttpResponse httpResponse) {
                DefaultChannel.this.mAppCenterHandler.post(new Runnable() { // from class: com.microsoft.appcenter.channel.DefaultChannel.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        DefaultChannel.this.handleSendingSuccess(groupState, str);
                    }
                });
            }
        });
        this.mAppCenterHandler.post(new Runnable() { // from class: com.microsoft.appcenter.channel.DefaultChannel.2
            @Override // java.lang.Runnable
            public void run() {
                DefaultChannel.this.checkPendingLogsAfterPost(groupState, i);
            }
        });
    }

    private void suspend(boolean z, Exception exc) {
        Channel.GroupListener groupListener;
        this.mDiscardLogs = z;
        this.mCurrentState++;
        for (GroupState groupState : this.mGroupStates.values()) {
            cancelTimer(groupState);
            Iterator<Map.Entry<String, List<Log>>> it = groupState.mSendingBatches.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<Log>> next = it.next();
                it.remove();
                if (z && (groupListener = groupState.mListener) != null) {
                    for (Log log : next.getValue()) {
                        groupListener.onFailure(log, exc);
                    }
                }
            }
        }
        for (Ingestion ingestion : this.mIngestions) {
            try {
                ingestion.close();
            } catch (IOException e) {
                AppCenterLog.error("AppCenter", "Failed to close ingestion: " + ingestion, e);
            }
        }
        if (z) {
            for (GroupState groupState2 : this.mGroupStates.values()) {
                deleteLogsOnSuspended(groupState2);
            }
            return;
        }
        this.mPersistence.clearPendingLogState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerIngestion(@x1 GroupState groupState) {
        if (this.mEnabled) {
            if (!this.mIngestion.isEnabled()) {
                AppCenterLog.debug("AppCenter", "SDK is in offline mode.");
                return;
            }
            int i = groupState.mPendingLogCount;
            int min = Math.min(i, groupState.mMaxLogsPerBatch);
            StringBuilder G = wo1.G("triggerIngestion(");
            G.append(groupState.mName);
            G.append(") pendingLogCount=");
            G.append(i);
            AppCenterLog.debug("AppCenter", G.toString());
            cancelTimer(groupState);
            if (groupState.mSendingBatches.size() == groupState.mMaxParallelBatches) {
                StringBuilder G2 = wo1.G("Already sending ");
                G2.append(groupState.mMaxParallelBatches);
                G2.append(" batches of analytics data to the server.");
                AppCenterLog.debug("AppCenter", G2.toString());
                return;
            }
            ArrayList arrayList = new ArrayList(min);
            String logs = this.mPersistence.getLogs(groupState.mName, groupState.mPausedTargetKeys, min, arrayList);
            groupState.mPendingLogCount -= min;
            if (logs == null) {
                return;
            }
            StringBuilder G3 = wo1.G("ingestLogs(");
            wo1.h0(G3, groupState.mName, ",", logs, ") pendingLogCount=");
            G3.append(groupState.mPendingLogCount);
            AppCenterLog.debug("AppCenter", G3.toString());
            if (groupState.mListener != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    groupState.mListener.onBeforeSending((Log) it.next());
                }
            }
            groupState.mSendingBatches.put(logs, arrayList);
            sendLogs(groupState, this.mCurrentState, arrayList, logs);
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void addGroup(String str, int i, long j, int i2, Ingestion ingestion, Channel.GroupListener groupListener) {
        AppCenterLog.debug("AppCenter", "addGroup(" + str + ")");
        Ingestion ingestion2 = ingestion == null ? this.mIngestion : ingestion;
        this.mIngestions.add(ingestion2);
        GroupState groupState = new GroupState(str, i, j, i2, ingestion2, groupListener);
        this.mGroupStates.put(str, groupState);
        groupState.mPendingLogCount = this.mPersistence.countLogs(str);
        if (this.mAppSecret != null || this.mIngestion != ingestion2) {
            checkPendingLogs(groupState);
        }
        for (Channel.Listener listener : this.mListeners) {
            listener.onGroupAdded(str, groupListener, j);
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void addListener(Channel.Listener listener) {
        this.mListeners.add(listener);
    }

    @r2
    public void cancelTimer(GroupState groupState) {
        if (groupState.mScheduled) {
            groupState.mScheduled = false;
            this.mAppCenterHandler.removeCallbacks(groupState.mRunnable);
            SharedPreferencesManager.remove(START_TIMER_PREFIX + groupState.mName);
        }
    }

    @r2
    public void checkPendingLogs(@x1 GroupState groupState) {
        AppCenterLog.debug("AppCenter", String.format("checkPendingLogs(%s) pendingLogCount=%s batchTimeInterval=%s", groupState.mName, Integer.valueOf(groupState.mPendingLogCount), Long.valueOf(groupState.mBatchTimeInterval)));
        Long resolveTriggerInterval = resolveTriggerInterval(groupState);
        if (resolveTriggerInterval == null || groupState.mPaused) {
            return;
        }
        if (resolveTriggerInterval.longValue() == 0) {
            triggerIngestion(groupState);
        } else if (groupState.mScheduled) {
        } else {
            groupState.mScheduled = true;
            this.mAppCenterHandler.postDelayed(groupState.mRunnable, resolveTriggerInterval.longValue());
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void clear(String str) {
        if (this.mGroupStates.containsKey(str)) {
            AppCenterLog.debug("AppCenter", "clear(" + str + ")");
            this.mPersistence.deleteLogs(str);
            for (Channel.Listener listener : this.mListeners) {
                listener.onClear(str);
            }
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void enqueue(@x1 Log log, @x1 String str, int i) {
        boolean z;
        GroupState groupState = this.mGroupStates.get(str);
        if (groupState == null) {
            AppCenterLog.error("AppCenter", "Invalid group name:" + str);
        } else if (this.mDiscardLogs) {
            AppCenterLog.warn("AppCenter", "Channel is disabled, the log is discarded.");
            Channel.GroupListener groupListener = groupState.mListener;
            if (groupListener != null) {
                groupListener.onBeforeSending(log);
                groupState.mListener.onFailure(log, new CancellationException());
            }
        } else {
            for (Channel.Listener listener : this.mListeners) {
                listener.onPreparingLog(log, str);
            }
            if (log.getDevice() == null) {
                if (this.mDevice == null) {
                    try {
                        this.mDevice = DeviceInfoHelper.getDeviceInfo(this.mContext);
                    } catch (DeviceInfoHelper.DeviceInfoException e) {
                        AppCenterLog.error("AppCenter", "Device log cannot be generated", e);
                        return;
                    }
                }
                log.setDevice(this.mDevice);
            }
            if (log.getTimestamp() == null) {
                log.setTimestamp(new Date());
            }
            for (Channel.Listener listener2 : this.mListeners) {
                listener2.onPreparedLog(log, str, i);
            }
            loop2: while (true) {
                for (Channel.Listener listener3 : this.mListeners) {
                    z = z || listener3.shouldFilter(log);
                }
            }
            if (z) {
                StringBuilder G = wo1.G("Log of type '");
                G.append(log.getType());
                G.append("' was filtered out by listener(s)");
                AppCenterLog.debug("AppCenter", G.toString());
            } else if (this.mAppSecret == null && groupState.mIngestion == this.mIngestion) {
                StringBuilder G2 = wo1.G("Log of type '");
                G2.append(log.getType());
                G2.append("' was not filtered out by listener(s) but no app secret was provided. Not persisting/sending the log.");
                AppCenterLog.debug("AppCenter", G2.toString());
            } else {
                try {
                    this.mPersistence.putLog(log, str, i);
                    Iterator<String> it = log.getTransmissionTargetTokens().iterator();
                    String targetKey = it.hasNext() ? PartAUtils.getTargetKey(it.next()) : null;
                    if (groupState.mPausedTargetKeys.contains(targetKey)) {
                        AppCenterLog.debug("AppCenter", "Transmission target ikey=" + targetKey + " is paused.");
                        return;
                    }
                    groupState.mPendingLogCount++;
                    StringBuilder G3 = wo1.G("enqueue(");
                    G3.append(groupState.mName);
                    G3.append(") pendingLogCount=");
                    G3.append(groupState.mPendingLogCount);
                    AppCenterLog.debug("AppCenter", G3.toString());
                    if (this.mEnabled) {
                        checkPendingLogs(groupState);
                    } else {
                        AppCenterLog.debug("AppCenter", "Channel is temporarily disabled, log was saved to disk.");
                    }
                } catch (Persistence.PersistenceException e2) {
                    AppCenterLog.error("AppCenter", "Error persisting log", e2);
                    Channel.GroupListener groupListener2 = groupState.mListener;
                    if (groupListener2 != null) {
                        groupListener2.onBeforeSending(log);
                        groupState.mListener.onFailure(log, e2);
                    }
                }
            }
        }
    }

    @r2
    public GroupState getGroupState(String str) {
        return this.mGroupStates.get(str);
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void invalidateDeviceCache() {
        this.mDevice = null;
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public boolean isEnabled() {
        return this.mEnabled;
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void pauseGroup(String str, String str2) {
        GroupState groupState = this.mGroupStates.get(str);
        if (groupState != null) {
            if (str2 != null) {
                String targetKey = PartAUtils.getTargetKey(str2);
                if (groupState.mPausedTargetKeys.add(targetKey)) {
                    AppCenterLog.debug("AppCenter", wo1.w("pauseGroup(", str, ", ", targetKey, ")"));
                }
            } else if (!groupState.mPaused) {
                AppCenterLog.debug("AppCenter", "pauseGroup(" + str + ")");
                groupState.mPaused = true;
                cancelTimer(groupState);
            }
            for (Channel.Listener listener : this.mListeners) {
                listener.onPaused(str, str2);
            }
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void removeGroup(String str) {
        AppCenterLog.debug("AppCenter", "removeGroup(" + str + ")");
        GroupState remove = this.mGroupStates.remove(str);
        if (remove != null) {
            cancelTimer(remove);
        }
        for (Channel.Listener listener : this.mListeners) {
            listener.onGroupRemoved(str);
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void removeListener(Channel.Listener listener) {
        this.mListeners.remove(listener);
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void resumeGroup(String str, String str2) {
        GroupState groupState = this.mGroupStates.get(str);
        if (groupState != null) {
            if (str2 != null) {
                String targetKey = PartAUtils.getTargetKey(str2);
                if (groupState.mPausedTargetKeys.remove(targetKey)) {
                    AppCenterLog.debug("AppCenter", wo1.w("resumeGroup(", str, ", ", targetKey, ")"));
                    groupState.mPendingLogCount = this.mPersistence.countLogs(str);
                    checkPendingLogs(groupState);
                }
            } else if (groupState.mPaused) {
                AppCenterLog.debug("AppCenter", "resumeGroup(" + str + ")");
                groupState.mPaused = false;
                checkPendingLogs(groupState);
            }
            for (Channel.Listener listener : this.mListeners) {
                listener.onResumed(str, str2);
            }
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    @s2
    public void setAppSecret(@x1 String str) {
        this.mAppSecret = str;
        if (this.mEnabled) {
            for (GroupState groupState : this.mGroupStates.values()) {
                if (groupState.mIngestion == this.mIngestion) {
                    checkPendingLogs(groupState);
                }
            }
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void setEnabled(boolean z) {
        if (this.mEnabled == z) {
            return;
        }
        if (z) {
            this.mEnabled = true;
            this.mDiscardLogs = false;
            this.mCurrentState++;
            for (Ingestion ingestion : this.mIngestions) {
                ingestion.reopen();
            }
            for (GroupState groupState : this.mGroupStates.values()) {
                checkPendingLogs(groupState);
            }
        } else {
            this.mEnabled = false;
            suspend(true, new CancellationException());
        }
        for (Channel.Listener listener : this.mListeners) {
            listener.onGloballyEnabled(z);
        }
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void setLogUrl(String str) {
        this.mIngestion.setLogUrl(str);
    }

    @Override // com.microsoft.appcenter.channel.Channel
    @s2
    public boolean setMaxStorageSize(long j) {
        return this.mPersistence.setMaxStorageSize(j);
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void setNetworkRequests(boolean z) {
        if (z) {
            this.mCurrentState++;
            for (GroupState groupState : this.mGroupStates.values()) {
                checkPendingLogs(groupState);
            }
            return;
        }
        this.mEnabled = true;
        suspend(false, new CancellationException());
    }

    @Override // com.microsoft.appcenter.channel.Channel
    public void shutdown() {
        this.mEnabled = false;
        suspend(false, new CancellationException());
    }

    @r2
    public DefaultChannel(@x1 Context context, String str, @x1 Persistence persistence, @x1 Ingestion ingestion, @x1 Handler handler) {
        this.mContext = context;
        this.mAppSecret = str;
        this.mInstallId = IdHelper.getInstallId();
        this.mGroupStates = new HashMap();
        this.mListeners = new LinkedHashSet();
        this.mPersistence = persistence;
        this.mIngestion = ingestion;
        HashSet hashSet = new HashSet();
        this.mIngestions = hashSet;
        hashSet.add(ingestion);
        this.mAppCenterHandler = handler;
        this.mEnabled = true;
    }
}