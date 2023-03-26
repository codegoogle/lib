package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.p7700g.p99005.z1;

@Keep
/* loaded from: classes2.dex */
public interface InitApi {
    public static final int INIT_TYPE_CONTENT_PROVIDER = 0;
    public static final int INIT_TYPE_INTERNAL_API = 3;
    public static final int INIT_TYPE_PUBLIC_API = 1;
    public static final int INIT_TYPE_REMOTE_PROCESS = 2;

    void initialize(Context context, @z1 MultithreadedBundleWrapper multithreadedBundleWrapper, @z1 AudienceNetworkAds.InitListener initListener, int i);

    boolean isInitialized();

    void maybeAttachCrashListener(Context context);

    void onAdEventManagerCreated(Context context);

    void onAdLoadInvoked(Context context);

    void onContentProviderCreated(Context context);
}