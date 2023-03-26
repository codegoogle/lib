package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzr {
    public static final zzr zza = new zzr(0, 0, 0);
    public static final zzl zzb = zzq.zza;
    public final int zzc = 0;
    public final int zzd;
    public final int zze;

    public zzr(int i, int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            int i = zzrVar.zzc;
            return this.zzd == zzrVar.zzd && this.zze == zzrVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzd + 16337) * 31) + this.zze;
    }
}