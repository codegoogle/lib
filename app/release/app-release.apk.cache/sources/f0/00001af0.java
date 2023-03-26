package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Wrappers {
    private static Wrappers zza = new Wrappers();
    @z1
    private PackageManagerWrapper zzb = null;

    @x1
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@x1 Context context) {
        return zza.zza(context);
    }

    @x1
    @VisibleForTesting
    public final synchronized PackageManagerWrapper zza(@x1 Context context) {
        if (this.zzb == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzb = new PackageManagerWrapper(context);
        }
        return this.zzb;
    }
}