package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckg implements zzja {
    private final zzvv zza = new zzvv(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzja
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void zze(zzjt[] zzjtVarArr, zzty zztyVar, zzvg[] zzvgVarArr) {
        int i = 0;
        this.zzf = 0;
        while (true) {
            int length = zzjtVarArr.length;
            if (i < 2) {
                if (zzvgVarArr[i] != null) {
                    this.zzf += zzjtVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                this.zza.zzf(this.zzf);
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
        boolean z = true;
        char c = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zza >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final zzvv zzi() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzb = i * 1000;
    }
}