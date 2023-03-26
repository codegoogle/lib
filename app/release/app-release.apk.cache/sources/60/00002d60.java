package com.google.android.gms.internal.ads;

import com.p7700g.p99005.un3;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgp implements zzja {
    private final zzvv zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzgp() {
        zzvv zzvvVar = new zzvv(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(un3.f.v, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, un3.f.v, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzvvVar;
        this.zzb = zzeg.zzv(50000L);
        this.zzc = zzeg.zzv(50000L);
        this.zzd = zzeg.zzv(2500L);
        this.zze = zzeg.zzv(5000L);
        this.zzg = 13107200;
        this.zzf = zzeg.zzv(0L);
    }

    private static void zzj(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        zzcw.zze(z, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zze(zzjt[] zzjtVarArr, zzty zztyVar, zzvg[] zzvgVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzjtVarArr.length;
            if (i < 2) {
                if (zzvgVarArr[i] != null) {
                    i2 += zzjtVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzg(long j, long j2, float f) {
        int zza = this.zza.zza();
        int i = this.zzg;
        long j3 = this.zzb;
        if (f > 1.0f) {
            j3 = Math.min(zzeg.zzs(j3, f), this.zzc);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = zza < i;
            this.zzh = z;
            if (!z) {
                int i2 = (j2 > 500000L ? 1 : (j2 == 500000L ? 0 : -1));
            }
        } else if (j2 >= this.zzc || zza >= i) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long zzu = zzeg.zzu(j, f);
        long j3 = z ? this.zze : this.zzd;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzu >= j3 || this.zza.zza() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final zzvv zzi() {
        return this.zza;
    }
}