package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzauu {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzazh zzf;
    private final zzazh zzg;
    private int zzh;
    private int zzi;

    public zzauu(zzazh zzazhVar, zzazh zzazhVar2, boolean z) {
        this.zzg = zzazhVar;
        this.zzf = zzazhVar2;
        this.zze = z;
        zzazhVar2.zzv(12);
        this.zza = zzazhVar2.zzi();
        zzazhVar.zzv(12);
        this.zzi = zzazhVar.zzi();
        zzayz.zzf(zzazhVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzn() : this.zzf.zzm();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzi();
            this.zzg.zzw(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzi() : -1;
        }
        return true;
    }
}