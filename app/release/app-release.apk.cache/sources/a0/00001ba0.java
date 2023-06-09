package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.zg2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadl implements zzadq {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzadl(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzeg.zzv(jArr2[jArr2.length - 1]) : j;
    }

    public static zzadl zza(long j, zzacf zzacfVar, long j2) {
        int length = zzacfVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzacfVar.zzb + zzacfVar.zzd[i3];
            j3 += zzacfVar.zzc + zzacfVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzadl(jArr, jArr2, j2);
    }

    private static Pair zzd(long j, long[] jArr, long[] jArr2) {
        int zzd = zzeg.zzd(jArr, j, true, true);
        long j2 = jArr[zzd];
        long j3 = jArr2[zzd];
        int i = zzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? zg2.s : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zzc(long j) {
        return zzeg.zzv(((Long) zzd(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        Pair zzd = zzd(zzeg.zzz(zzeg.zzr(j, 0L, this.zzc)), this.zzb, this.zza);
        long longValue = ((Long) zzd.first).longValue();
        zzzv zzzvVar = new zzzv(zzeg.zzv(longValue), ((Long) zzd.second).longValue());
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}