package com.microsoft.appcenter;

import android.app.Application;
import android.content.Context;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.ingestion.models.json.LogFactory;
import com.microsoft.appcenter.utils.ApplicationLifecycleListener;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Map;

/* loaded from: classes3.dex */
public interface AppCenterService extends Application.ActivityLifecycleCallbacks, ApplicationLifecycleListener.ApplicationLifecycleCallbacks {
    @z1
    Map<String, LogFactory> getLogFactories();

    String getServiceName();

    boolean isAppSecretRequired();

    boolean isInstanceEnabled();

    @s2
    void onConfigurationUpdated(String str, String str2);

    @s2
    void onStarted(@x1 Context context, @x1 Channel channel, String str, String str2, boolean z);

    void onStarting(@x1 AppCenterHandler appCenterHandler);

    void setInstanceEnabled(boolean z);
}