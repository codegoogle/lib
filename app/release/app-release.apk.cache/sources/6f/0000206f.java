package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbx {
    public static final zzbx zza = new zzbv().zze();
    public static final zzl zzb = zzbu.zza;
    private final zzy zzc;

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbx) {
            return this.zzc.equals(((zzbx) obj).zzc);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }
}