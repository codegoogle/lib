package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadr implements zzadq {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzadr(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    @z1
    public static zzadr zza(long j, long j2, zzzk zzzkVar, zzdy zzdyVar) {
        int zzk;
        zzdyVar.zzG(10);
        int zze = zzdyVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i = zzzkVar.zzd;
        long zzw = zzeg.zzw(zze, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int zzo = zzdyVar.zzo();
        int zzo2 = zzdyVar.zzo();
        int zzo3 = zzdyVar.zzo();
        zzdyVar.zzG(2);
        long j3 = j2 + zzzkVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < zzo) {
            int i3 = zzo2;
            long j5 = j3;
            jArr[i2] = (i2 * zzw) / zzo;
            jArr2[i2] = Math.max(j4, j5);
            if (zzo3 == 1) {
                zzk = zzdyVar.zzk();
            } else if (zzo3 == 2) {
                zzk = zzdyVar.zzo();
            } else if (zzo3 == 3) {
                zzk = zzdyVar.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                zzk = zzdyVar.zzn();
            }
            j4 += zzk * i3;
            i2++;
            jArr = jArr;
            zzo2 = i3;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1) {
            int i4 = (j > j4 ? 1 : (j == j4 ? 0 : -1));
        }
        return new zzadr(jArr3, jArr2, zzw, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzc(long j) {
        return this.zza[zzeg.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        int zzd = zzeg.zzd(this.zza, j, true, true);
        zzzv zzzvVar = new zzzv(this.zza[zzd], this.zzb[zzd]);
        if (zzzvVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzd != jArr.length - 1) {
                int i = zzd + 1;
                return new zzzs(zzzvVar, new zzzv(jArr[i], this.zzb[i]));
            }
        }
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}