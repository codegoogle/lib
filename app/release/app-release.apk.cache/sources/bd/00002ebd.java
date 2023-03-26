package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrf implements zzry, zzrx {
    public final zzry zza;
    public long zzb;
    @z1
    private zzrx zzc;
    private zzre[] zzd = new zzre[0];
    private long zze = 0;

    public zzrf(zzry zzryVar, boolean z, long j, long j2) {
        this.zza = zzryVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j, zzjw zzjwVar) {
        if (j != 0) {
            long zzr = zzeg.zzr(zzjwVar.zzf, 0L, j);
            long j2 = zzjwVar.zzg;
            long j3 = this.zzb;
            long zzr2 = zzeg.zzr(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
            if (zzr != zzjwVar.zzf || zzr2 != zzjwVar.zzg) {
                zzjwVar = new zzjw(zzr, zzr2);
            }
            return this.zza.zza(j, zzjwVar);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        zzcw.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        zzcw.zzf((j2 == Long.MIN_VALUE || zzd2 <= j2) ? true : true);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        zzre[] zzreVarArr;
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzre zzreVar : this.zzd) {
            if (zzreVar != null) {
                zzreVar.zzc();
            }
        }
        long zze = this.zza.zze(j);
        if (zze != j) {
            if (zze >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            zzcw.zzf(z);
            return zze;
        }
        z = true;
        zzcw.zzf(z);
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4 > r7) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j) {
        int length = zztqVarArr.length;
        this.zzd = new zzre[length];
        zztq[] zztqVarArr2 = new zztq[length];
        int i = 0;
        while (true) {
            zztq zztqVar = null;
            if (i >= zztqVarArr.length) {
                break;
            }
            zzre[] zzreVarArr = this.zzd;
            zzre zzreVar = (zzre) zztqVarArr[i];
            zzreVarArr[i] = zzreVar;
            if (zzreVar != null) {
                zztqVar = zzreVar.zza;
            }
            zztqVarArr2[i] = zztqVar;
            i++;
        }
        long zzf = this.zza.zzf(zzvgVarArr, zArr, zztqVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (zzf != j2) {
            if (zzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
        }
        zzcw.zzf(z);
        for (int i2 = 0; i2 < zztqVarArr.length; i2++) {
            zztq zztqVar2 = zztqVarArr2[i2];
            if (zztqVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzre[] zzreVarArr2 = this.zzd;
                zzre zzreVar2 = zzreVarArr2[i2];
                if (zzreVar2 == null || zzreVar2.zza != zztqVar2) {
                    zzreVarArr2[i2] = new zzre(this, zztqVar2);
                }
            }
            zztqVarArr[i2] = this.zzd[i2];
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final /* bridge */ /* synthetic */ void zzg(zzts zztsVar) {
        zzry zzryVar = (zzry) zztsVar;
        zzrx zzrxVar = this.zzc;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzryVar) {
        zzrx zzrxVar = this.zzc;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j) {
        this.zzc = zzrxVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j) {
        return this.zza.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}