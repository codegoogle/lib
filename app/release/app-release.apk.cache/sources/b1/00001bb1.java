package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaeb implements zzady {
    private final zzdy zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaeb(zzadu zzaduVar) {
        zzdy zzdyVar = zzaduVar.zza;
        this.zza = zzdyVar;
        zzdyVar.zzF(12);
        this.zzc = zzdyVar.zzn() & 255;
        this.zzb = zzdyVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzk();
        }
        if (i == 16) {
            return this.zza.zzo();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 == 0) {
            int zzk = this.zza.zzk();
            this.zze = zzk;
            return (zzk & 240) >> 4;
        }
        return this.zze & 15;
    }
}