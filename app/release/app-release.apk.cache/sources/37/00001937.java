package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class ActivityLifecycleObserver {
    @x1
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@x1 Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    @x1
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@x1 Runnable runnable);
}