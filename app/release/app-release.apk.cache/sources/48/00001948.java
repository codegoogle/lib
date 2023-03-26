package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.hx;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(@x1 Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    @x1
    public final Activity zza() {
        return (Activity) this.zza;
    }

    @x1
    public final hx zzb() {
        return (hx) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof hx;
    }

    @KeepForSdk
    public LifecycleActivity(@x1 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}