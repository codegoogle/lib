package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgo {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzgo(float f, float f2, long j, float f3, long j2, long j3, float f4, zzgn zzgnVar) {
        this.zza = j2;
        this.zzb = j3;
    }

    private static long zzf(long j, long j2, float f) {
        return (((float) j2) * 9.999871E-4f) + (((float) j) * 0.999f);
    }

    private final void zzg() {
        long j = this.zzc;
        if (j != -9223372036854775807L) {
            long j2 = this.zzd;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.zzf;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.zzg;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j, long j2) {
        long zzr;
        if (this.zzc != -9223372036854775807L) {
            long j3 = j - j2;
            long j4 = this.zzm;
            if (j4 == -9223372036854775807L) {
                this.zzm = j3;
                this.zzn = 0L;
            } else {
                long max = Math.max(j3, zzf(j4, j3, 0.999f));
                this.zzm = max;
                this.zzn = zzf(this.zzn, Math.abs(j3 - max), 0.999f);
            }
            if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
                return this.zzk;
            }
            this.zzl = SystemClock.elapsedRealtime();
            long j5 = (this.zzn * 3) + this.zzm;
            if (this.zzh > j5) {
                float zzv = (float) zzeg.zzv(1000L);
                long[] jArr = {j5, this.zze, this.zzh - (((this.zzk - 1.0f) * zzv) + ((this.zzi - 1.0f) * zzv))};
                zzr = jArr[0];
                for (int i = 1; i < 3; i++) {
                    long j6 = jArr[i];
                    if (j6 > zzr) {
                        zzr = j6;
                    }
                }
                this.zzh = zzr;
            } else {
                zzr = zzeg.zzr(j - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), this.zzh, j5);
                this.zzh = zzr;
                long j7 = this.zzg;
                if (j7 != -9223372036854775807L && zzr > j7) {
                    this.zzh = j7;
                    zzr = j7;
                }
            }
            long j8 = j - zzr;
            if (Math.abs(j8) < this.zza) {
                this.zzk = 1.0f;
                return 1.0f;
            }
            float zza = zzeg.zza((((float) j8) * 1.0E-7f) + 1.0f, this.zzj, this.zzi);
            this.zzk = zza;
            return zza;
        }
        return 1.0f;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.zzb;
        this.zzh = j2;
        long j3 = this.zzg;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.zzh = j3;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzau zzauVar) {
        long j = zzauVar.zzc;
        this.zzc = zzeg.zzv(-9223372036854775807L);
        this.zzf = zzeg.zzv(-9223372036854775807L);
        this.zzg = zzeg.zzv(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }
}