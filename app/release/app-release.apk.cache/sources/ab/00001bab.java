package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadw {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private int zzh;
    private int zzi;

    public zzadw(zzdy zzdyVar, zzdy zzdyVar2, boolean z) throws zzbp {
        this.zzg = zzdyVar;
        this.zzf = zzdyVar2;
        this.zze = z;
        zzdyVar2.zzF(12);
        this.zza = zzdyVar2.zzn();
        zzdyVar.zzF(12);
        this.zzi = zzdyVar.zzn();
        zzyv.zzb(zzdyVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzt() : this.zzf.zzs();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzn() : -1;
        }
        return true;
    }
}