package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzard implements zzary, zzarz {
    private final int zza;
    private zzasa zzb;
    private int zzc;
    private int zzd;
    private zzaxl zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzard(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final boolean zzA() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final boolean zzB() {
        return this.zzh;
    }

    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzary, com.google.android.gms.internal.ads.zzarz
    public final int zzc() {
        return this.zza;
    }

    public final int zzd(zzaru zzaruVar, zzato zzatoVar, boolean z) {
        int zzb = this.zze.zzb(zzaruVar, zzatoVar, z);
        if (zzb == -4) {
            if (zzatoVar.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzatoVar.zzc += this.zzf;
        } else if (zzb == -5) {
            zzart zzartVar = zzaruVar.zza;
            long j = zzartVar.zzw;
            if (j != Long.MAX_VALUE) {
                zzaruVar.zza = new zzart(zzartVar.zza, zzartVar.zze, zzartVar.zzf, zzartVar.zzc, zzartVar.zzb, zzartVar.zzg, zzartVar.zzj, zzartVar.zzk, zzartVar.zzl, zzartVar.zzm, zzartVar.zzn, zzartVar.zzp, zzartVar.zzo, zzartVar.zzq, zzartVar.zzr, zzartVar.zzs, zzartVar.zzt, zzartVar.zzu, zzartVar.zzv, zzartVar.zzx, zzartVar.zzy, zzartVar.zzz, j + this.zzf, zzartVar.zzh, zzartVar.zzi, zzartVar.zzd);
                return -5;
            }
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarz
    public int zze() throws zzarf {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzarz zzf() {
        return this;
    }

    public final zzasa zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzaxl zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public zzazd zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzj() {
        zzayz.zze(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzk(zzasa zzasaVar, zzart[] zzartVarArr, zzaxl zzaxlVar, long j, boolean z, long j2) throws zzarf {
        zzayz.zze(this.zzd == 0);
        this.zzb = zzasaVar;
        this.zzd = 1;
        zzo(z);
        zzt(zzartVarArr, zzaxlVar, j2);
        zzp(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public void zzl(int i, Object obj) throws zzarf {
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    public void zzn() {
        throw null;
    }

    public void zzo(boolean z) throws zzarf {
    }

    public void zzp(long j, boolean z) throws zzarf {
        throw null;
    }

    public void zzq() throws zzarf {
    }

    public void zzr() throws zzarf {
    }

    public void zzs(zzart[] zzartVarArr, long j) throws zzarf {
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzt(zzart[] zzartVarArr, zzaxl zzaxlVar, long j) throws zzarf {
        zzayz.zze(!this.zzh);
        this.zze = zzaxlVar;
        this.zzg = false;
        this.zzf = j;
        zzs(zzartVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzu(long j) throws zzarf {
        this.zzh = false;
        this.zzg = false;
        zzp(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzv() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzw(int i) {
        this.zzc = i;
    }

    public final void zzx(long j) {
        this.zze.zzd(j - this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzy() throws zzarf {
        zzayz.zze(this.zzd == 1);
        this.zzd = 2;
        zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzz() throws zzarf {
        zzayz.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}