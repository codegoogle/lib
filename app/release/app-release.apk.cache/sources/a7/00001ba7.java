package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzads implements zzadq {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    @z1
    private final long[] zzf;

    private zzads(long j, int i, long j2, long j3, @z1 long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    @z1
    public static zzads zza(long j, long j2, zzzk zzzkVar, zzdy zzdyVar) {
        int zzn;
        int i = zzzkVar.zzg;
        int i2 = zzzkVar.zzd;
        int zze = zzdyVar.zze();
        if ((zze & 1) != 1 || (zzn = zzdyVar.zzn()) == 0) {
            return null;
        }
        long zzw = zzeg.zzw(zzn, i * 1000000, i2);
        if ((zze & 6) != 6) {
            return new zzads(j2, zzzkVar.zzc, zzw, -1L, null);
        }
        long zzs = zzdyVar.zzs();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = zzdyVar.zzk();
        }
        if (j != -1) {
            int i4 = (j > (j2 + zzs) ? 1 : (j == (j2 + zzs) ? 0 : -1));
        }
        return new zzads(j2, zzzkVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzc(long j) {
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzcw.zzb(this.zzf);
        double d = (j2 * 256.0d) / this.zzd;
        int zzd = zzeg.zzd(jArr, (long) d, true, true);
        long zzd2 = zzd(zzd);
        long j3 = jArr[zzd];
        int i = zzd + 1;
        long zzd3 = zzd(i);
        long j4 = zzd == 99 ? 256L : jArr[i];
        return Math.round((j3 == j4 ? zg2.s : (d - j3) / (j4 - j3)) * (zzd3 - zzd2)) + zzd2;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        long[] jArr;
        if (!zzh()) {
            zzzv zzzvVar = new zzzv(0L, this.zza + this.zzb);
            return new zzzs(zzzvVar, zzzvVar);
        }
        long zzr = zzeg.zzr(j, 0L, this.zzc);
        double d = (zzr * 100.0d) / this.zzc;
        double d2 = zg2.s;
        if (d > zg2.s) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) zzcw.zzb(this.zzf))[i];
                d2 = d3 + (((i == 99 ? 256.0d : jArr[i + 1]) - d3) * (d - i));
            }
        }
        zzzv zzzvVar2 = new zzzv(zzr, this.zza + zzeg.zzr(Math.round((d2 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzzs(zzzvVar2, zzzvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.zzf != null;
    }
}