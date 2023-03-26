package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@x1 String str, @x1 LifecycleCallback lifecycleCallback);

    @KeepForSdk
    @z1
    <T extends LifecycleCallback> T getCallbackOrNull(@x1 String str, @x1 Class<T> cls);

    @KeepForSdk
    @z1
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@x1 Intent intent, int i);
}