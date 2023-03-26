package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagq implements zzagz {
    private zzad zza;
    private zzee zzb;
    private zzzy zzc;

    public zzagq(String str) {
        zzab zzabVar = new zzab();
        zzabVar.zzS(str);
        this.zza = zzabVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zzb);
        int i = zzeg.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd == -9223372036854775807L || zze == -9223372036854775807L) {
            return;
        }
        zzad zzadVar = this.zza;
        if (zze != zzadVar.zzq) {
            zzab zzb = zzadVar.zzb();
            zzb.zzW(zze);
            zzad zzY = zzb.zzY();
            this.zza = zzY;
            this.zzc.zzk(zzY);
        }
        int zza = zzdyVar.zza();
        zzzw.zzb(this.zzc, zzdyVar, zza);
        this.zzc.zzs(zzd, 1, zza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
        this.zzb = zzeeVar;
        zzahmVar.zzc();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}