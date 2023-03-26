package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrk implements zzts {
    public final zzts[] zza;

    public zzrk(zzts[] zztsVarArr) {
        this.zza = zztsVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzts zztsVar : this.zza) {
            long zzb = zztsVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzts zztsVar : this.zza) {
            long zzc = zztsVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzm(long j) {
        for (zzts zztsVar : this.zza) {
            zztsVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j) {
        zzts[] zztsVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzts zztsVar : this.zza) {
                long zzc2 = zztsVar.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j;
                if (zzc2 == zzc || z3) {
                    z |= zztsVar.zzo(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        for (zzts zztsVar : this.zza) {
            if (zztsVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}