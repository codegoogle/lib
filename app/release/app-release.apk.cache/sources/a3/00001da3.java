package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawn implements zzaxn {
    private final zzaxn[] zza;

    public zzawn(zzaxn[] zzaxnVarArr) {
        this.zza = zzaxnVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzaxn zzaxnVar : this.zza) {
            long zza = zzaxnVar.zza();
            if (zza != Long.MIN_VALUE) {
                j = Math.min(j, zza);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long j) {
        zzaxn[] zzaxnVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzaxn zzaxnVar : this.zza) {
                if (zzaxnVar.zza() == zza) {
                    z |= zzaxnVar.zzbj(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}