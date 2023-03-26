package com.microsoft.appcenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.anythink.expressad.video.module.a.a.m;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.ingestion.models.json.LogFactory;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.PrefStorageConstants;
import com.microsoft.appcenter.utils.async.AppCenterFuture;
import com.microsoft.appcenter.utils.async.DefaultAppCenterFuture;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AbstractAppCenterService implements AppCenterService {
    private static final String PREFERENCE_KEY_SEPARATOR = "_";
    public Channel mChannel;
    private AppCenterHandler mHandler;

    @s2
    public synchronized void applyEnabledState(boolean z) {
    }

    public Channel.GroupListener getChannelListener() {
        return null;
    }

    @x1
    public String getEnabledPreferenceKey() {
        StringBuilder G = wo1.G("enabled_");
        G.append(getServiceName());
        return G.toString();
    }

    public abstract String getGroupName();

    @Override // com.microsoft.appcenter.AppCenterService
    public Map<String, LogFactory> getLogFactories() {
        return null;
    }

    public abstract String getLoggerTag();

    public int getTriggerCount() {
        return 50;
    }

    public long getTriggerInterval() {
        return m.af;
    }

    public int getTriggerMaxParallelRequests() {
        return 3;
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public boolean isAppSecretRequired() {
        return true;
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public synchronized boolean isInstanceEnabled() {
        return SharedPreferencesManager.getBoolean(getEnabledPreferenceKey(), true);
    }

    public synchronized AppCenterFuture<Boolean> isInstanceEnabledAsync() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        postAsyncGetter(new Runnable() { // from class: com.microsoft.appcenter.AbstractAppCenterService.1
            @Override // java.lang.Runnable
            public void run() {
                defaultAppCenterFuture.complete(Boolean.TRUE);
            }
        }, defaultAppCenterFuture, Boolean.FALSE);
        return defaultAppCenterFuture;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.microsoft.appcenter.utils.ApplicationLifecycleListener.ApplicationLifecycleCallbacks
    public void onApplicationEnterBackground() {
    }

    @Override // com.microsoft.appcenter.utils.ApplicationLifecycleListener.ApplicationLifecycleCallbacks
    public void onApplicationEnterForeground() {
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public void onConfigurationUpdated(String str, String str2) {
    }

    @Override // com.microsoft.appcenter.AppCenterService
    @s2
    public synchronized void onStarted(@x1 Context context, @x1 Channel channel, String str, String str2, boolean z) {
        String groupName = getGroupName();
        boolean isInstanceEnabled = isInstanceEnabled();
        if (groupName != null) {
            channel.removeGroup(groupName);
            if (isInstanceEnabled) {
                channel.addGroup(groupName, getTriggerCount(), getTriggerInterval(), getTriggerMaxParallelRequests(), null, getChannelListener());
            } else {
                channel.clear(groupName);
            }
        }
        this.mChannel = channel;
        applyEnabledState(isInstanceEnabled);
    }

    @Override // com.microsoft.appcenter.AppCenterService
    public final synchronized void onStarting(@x1 AppCenterHandler appCenterHandler) {
        this.mHandler = appCenterHandler;
    }

    public synchronized void post(Runnable runnable) {
        post(runnable, null, null);
    }

    public synchronized <T> void postAsyncGetter(final Runnable runnable, final DefaultAppCenterFuture<T> defaultAppCenterFuture, final T t) {
        Runnable runnable2 = new Runnable() { // from class: com.microsoft.appcenter.AbstractAppCenterService.5
            @Override // java.lang.Runnable
            public void run() {
                defaultAppCenterFuture.complete(t);
            }
        };
        if (!post(new Runnable() { // from class: com.microsoft.appcenter.AbstractAppCenterService.6
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
            }
        }, runnable2, runnable2)) {
            runnable2.run();
        }
    }

    @Override // com.microsoft.appcenter.AppCenterService
    @s2
    public synchronized void setInstanceEnabled(boolean z) {
        if (z == isInstanceEnabled()) {
            String loggerTag = getLoggerTag();
            Object[] objArr = new Object[2];
            objArr[0] = getServiceName();
            objArr[1] = z ? PrefStorageConstants.KEY_ENABLED : "disabled";
            AppCenterLog.info(loggerTag, String.format("%s service has already been %s.", objArr));
            return;
        }
        String groupName = getGroupName();
        Channel channel = this.mChannel;
        if (channel != null && groupName != null) {
            if (z) {
                channel.addGroup(groupName, getTriggerCount(), getTriggerInterval(), getTriggerMaxParallelRequests(), null, getChannelListener());
            } else {
                channel.clear(groupName);
                this.mChannel.removeGroup(groupName);
            }
        }
        SharedPreferencesManager.putBoolean(getEnabledPreferenceKey(), z);
        String loggerTag2 = getLoggerTag();
        Object[] objArr2 = new Object[2];
        objArr2[0] = getServiceName();
        objArr2[1] = z ? PrefStorageConstants.KEY_ENABLED : "disabled";
        AppCenterLog.info(loggerTag2, String.format("%s service has been %s.", objArr2));
        if (this.mChannel != null) {
            applyEnabledState(z);
        }
    }

    public final synchronized AppCenterFuture<Void> setInstanceEnabledAsync(final boolean z) {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        Runnable runnable = new Runnable() { // from class: com.microsoft.appcenter.AbstractAppCenterService.2
            @Override // java.lang.Runnable
            public void run() {
                AppCenterLog.error("AppCenter", "App Center SDK is disabled.");
                defaultAppCenterFuture.complete(null);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: com.microsoft.appcenter.AbstractAppCenterService.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractAppCenterService.this.setInstanceEnabled(z);
                defaultAppCenterFuture.complete(null);
            }
        };
        if (!post(runnable2, runnable, runnable2)) {
            defaultAppCenterFuture.complete(null);
        }
        return defaultAppCenterFuture;
    }

    public synchronized boolean post(final Runnable runnable, Runnable runnable2, final Runnable runnable3) {
        AppCenterHandler appCenterHandler = this.mHandler;
        if (appCenterHandler == null) {
            AppCenterLog.error("AppCenter", getServiceName() + " needs to be started before it can be used.");
            return false;
        }
        appCenterHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AbstractAppCenterService.4
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractAppCenterService.this.isInstanceEnabled()) {
                    runnable.run();
                    return;
                }
                Runnable runnable4 = runnable3;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                AppCenterLog.info("AppCenter", AbstractAppCenterService.this.getServiceName() + " service disabled, discarding calls.");
            }
        }, runnable2);
        return true;
    }
}