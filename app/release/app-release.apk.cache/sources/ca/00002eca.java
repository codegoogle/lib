package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrs implements zzry, zzrx {
    public final zzsa zza;
    private final long zzb;
    private zzsc zzc;
    private zzry zzd;
    @z1
    private zzrx zze;
    private long zzf = -9223372036854775807L;
    private final zzvv zzg;

    public zzrs(zzsa zzsaVar, zzvv zzvvVar, long j, byte[] bArr) {
        this.zza = zzsaVar;
        this.zzg = zzvvVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j, zzjw zzjwVar) {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zza(j, zzjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j) {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] zzvgVarArr, boolean[] zArr, zztq[] zztqVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zzf(zzvgVarArr, zArr, zztqVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final /* bridge */ /* synthetic */ void zzg(zzts zztsVar) {
        zzry zzryVar = (zzry) zztsVar;
        zzrx zzrxVar = this.zze;
        int i = zzeg.zza;
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        return zzryVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzryVar) {
        zzrx zzrxVar = this.zze;
        int i = zzeg.zza;
        zzrxVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j, boolean z) {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        zzryVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        try {
            zzry zzryVar = this.zzd;
            if (zzryVar != null) {
                zzryVar.zzk();
                return;
            }
            zzsc zzscVar = this.zzc;
            if (zzscVar != null) {
                zzscVar.zzw();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j) {
        this.zze = zzrxVar;
        zzry zzryVar = this.zzd;
        if (zzryVar != null) {
            zzryVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j) {
        zzry zzryVar = this.zzd;
        int i = zzeg.zza;
        zzryVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j) {
        zzry zzryVar = this.zzd;
        return zzryVar != null && zzryVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        zzry zzryVar = this.zzd;
        return zzryVar != null && zzryVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzsa zzsaVar) {
        long zzv = zzv(this.zzb);
        zzsc zzscVar = this.zzc;
        Objects.requireNonNull(zzscVar);
        zzry zzD = zzscVar.zzD(zzsaVar, this.zzg, zzv);
        this.zzd = zzD;
        if (this.zze != null) {
            zzD.zzl(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzt() {
        zzry zzryVar = this.zzd;
        if (zzryVar != null) {
            zzsc zzscVar = this.zzc;
            Objects.requireNonNull(zzscVar);
            zzscVar.zzB(zzryVar);
        }
    }

    public final void zzu(zzsc zzscVar) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzscVar;
    }
}