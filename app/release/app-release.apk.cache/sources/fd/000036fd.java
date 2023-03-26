package com.microsoft.appcenter.channel;

import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.ingestion.Ingestion;
import com.microsoft.appcenter.ingestion.OneCollectorIngestion;
import com.microsoft.appcenter.ingestion.models.Log;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.microsoft.appcenter.ingestion.models.one.CommonSchemaLog;
import com.microsoft.appcenter.ingestion.models.one.SdkExtension;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class OneCollectorChannelListener extends AbstractChannelListener {
    @r2
    public static final String ONE_COLLECTOR_GROUP_NAME_SUFFIX = "/one";
    @r2
    public static final int ONE_COLLECTOR_TRIGGER_COUNT = 50;
    @r2
    public static final int ONE_COLLECTOR_TRIGGER_MAX_PARALLEL_REQUESTS = 2;
    private final Channel mChannel;
    private final Map<String, EpochAndSeq> mEpochsAndSeqsByIKey;
    private final Ingestion mIngestion;
    private final UUID mInstallId;
    private final LogSerializer mLogSerializer;

    /* loaded from: classes3.dex */
    public static class EpochAndSeq {
        public final String epoch;
        public long seq;

        public EpochAndSeq(String str) {
            this.epoch = str;
        }
    }

    public OneCollectorChannelListener(@x1 Channel channel, @x1 LogSerializer logSerializer, @x1 HttpClient httpClient, @x1 UUID uuid) {
        this(new OneCollectorIngestion(httpClient, logSerializer), channel, logSerializer, uuid);
    }

    private static String getOneCollectorGroupName(@x1 String str) {
        return wo1.t(str, ONE_COLLECTOR_GROUP_NAME_SUFFIX);
    }

    private static boolean isOneCollectorCompatible(@x1 Log log) {
        return ((log instanceof CommonSchemaLog) || log.getTransmissionTargetTokens().isEmpty()) ? false : true;
    }

    private static boolean isOneCollectorGroup(@x1 String str) {
        return str.endsWith(ONE_COLLECTOR_GROUP_NAME_SUFFIX);
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onClear(@x1 String str) {
        if (isOneCollectorGroup(str)) {
            return;
        }
        this.mChannel.clear(getOneCollectorGroupName(str));
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onGloballyEnabled(boolean z) {
        if (z) {
            return;
        }
        this.mEpochsAndSeqsByIKey.clear();
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onGroupAdded(@x1 String str, Channel.GroupListener groupListener, long j) {
        if (isOneCollectorGroup(str)) {
            return;
        }
        this.mChannel.addGroup(getOneCollectorGroupName(str), 50, j, 2, this.mIngestion, groupListener);
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onGroupRemoved(@x1 String str) {
        if (isOneCollectorGroup(str)) {
            return;
        }
        this.mChannel.removeGroup(getOneCollectorGroupName(str));
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onPaused(@x1 String str, String str2) {
        if (isOneCollectorGroup(str)) {
            return;
        }
        this.mChannel.pauseGroup(getOneCollectorGroupName(str), str2);
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onPreparedLog(@x1 Log log, @x1 String str, int i) {
        if (isOneCollectorCompatible(log)) {
            try {
                Collection<CommonSchemaLog> commonSchemaLog = this.mLogSerializer.toCommonSchemaLog(log);
                for (CommonSchemaLog commonSchemaLog2 : commonSchemaLog) {
                    commonSchemaLog2.setFlags(Long.valueOf(i));
                    EpochAndSeq epochAndSeq = this.mEpochsAndSeqsByIKey.get(commonSchemaLog2.getIKey());
                    if (epochAndSeq == null) {
                        epochAndSeq = new EpochAndSeq(UUID.randomUUID().toString());
                        this.mEpochsAndSeqsByIKey.put(commonSchemaLog2.getIKey(), epochAndSeq);
                    }
                    SdkExtension sdk = commonSchemaLog2.getExt().getSdk();
                    sdk.setEpoch(epochAndSeq.epoch);
                    long j = epochAndSeq.seq + 1;
                    epochAndSeq.seq = j;
                    sdk.setSeq(Long.valueOf(j));
                    sdk.setInstallId(this.mInstallId);
                }
                String oneCollectorGroupName = getOneCollectorGroupName(str);
                for (CommonSchemaLog commonSchemaLog3 : commonSchemaLog) {
                    this.mChannel.enqueue(commonSchemaLog3, oneCollectorGroupName, i);
                }
            } catch (IllegalArgumentException e) {
                StringBuilder G = wo1.G("Cannot send a log to one collector: ");
                G.append(e.getMessage());
                AppCenterLog.error("AppCenter", G.toString());
            }
        }
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public void onResumed(@x1 String str, String str2) {
        if (isOneCollectorGroup(str)) {
            return;
        }
        this.mChannel.resumeGroup(getOneCollectorGroupName(str), str2);
    }

    public void setLogUrl(@x1 String str) {
        this.mIngestion.setLogUrl(str);
    }

    @Override // com.microsoft.appcenter.channel.AbstractChannelListener, com.microsoft.appcenter.channel.Channel.Listener
    public boolean shouldFilter(@x1 Log log) {
        return isOneCollectorCompatible(log);
    }

    @r2
    public OneCollectorChannelListener(@x1 OneCollectorIngestion oneCollectorIngestion, @x1 Channel channel, @x1 LogSerializer logSerializer, @x1 UUID uuid) {
        this.mEpochsAndSeqsByIKey = new HashMap();
        this.mChannel = channel;
        this.mLogSerializer = logSerializer;
        this.mInstallId = uuid;
        this.mIngestion = oneCollectorIngestion;
    }
}