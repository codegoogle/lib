package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleCallback {
    @x1
    @KeepForSdk
    public final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(@x1 LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @x1
    @KeepForSdk
    public static LifecycleFragment getFragment(@x1 Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @u1
    @KeepForSdk
    public void dump(@x1 String str, @x1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @x1 String[] strArr) {
    }

    @x1
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @u1
    @KeepForSdk
    public void onActivityResult(int i, int i2, @x1 Intent intent) {
    }

    @u1
    @KeepForSdk
    public void onCreate(@z1 Bundle bundle) {
    }

    @u1
    @KeepForSdk
    public void onDestroy() {
    }

    @u1
    @KeepForSdk
    public void onResume() {
    }

    @u1
    @KeepForSdk
    public void onSaveInstanceState(@x1 Bundle bundle) {
    }

    @u1
    @KeepForSdk
    public void onStart() {
    }

    @u1
    @KeepForSdk
    public void onStop() {
    }

    @x1
    @KeepForSdk
    public static LifecycleFragment getFragment(@x1 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @x1
    @KeepForSdk
    public static LifecycleFragment getFragment(@x1 LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return zzd.zzc(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return zzb.zzc(lifecycleActivity.zza());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}