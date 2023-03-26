package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzso implements zzry, zzrx {
    private final zzry zza;
    private final long zzb;
    private zzrx zzc;

    public zzso(zzry zzryVar, long j) {
        this.zza = zzryVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j, zzjw zzjwVar) {
        return this.zza.zza(j - this.zzb, zzjwVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j) {
        zztq[] zztqVarArr2 = new zztq[zztqVarArr.length];
        int i = 0;
        while (true) {
            zztq zztqVar = null;
            if (i >= zztqVarArr.length) {
                break;
            }
            zzsp zzspVar = (zzsp) zztqVarArr[i];
            if (zzspVar != null) {
                zztqVar = zzspVar.zzc();
            }
            zztqVarArr2[i] = zztqVar;
            i++;
        }
        long zzf = this.zza.zzf(zzvgVarArr, zArr, zztqVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zztqVarArr.length; i2++) {
            zztq zztqVar2 = zztqVarArr2[i2];
            if (zztqVar2 == null) {
                zztqVarArr[i2] = null;
            } else {
                zztq zztqVar3 = zztqVarArr[i2];
                if (zztqVar3 == null || ((zzsp) zztqVar3).zzc() != zztqVar2) {
                    zztqVarArr[i2] = new zzsp(zztqVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
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
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j) {
        this.zzc = zzrxVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zza.zzp();
    }
}