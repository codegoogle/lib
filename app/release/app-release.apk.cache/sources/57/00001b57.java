package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaat extends zzaas {
    private final zzdy zzb;
    private final zzdy zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaat(zzzy zzzyVar) {
        super(zzzyVar);
        this.zzb = new zzdy(zzzo.zza);
        this.zzc = new zzdy(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final boolean zza(zzdy zzdyVar) throws zzaar {
        int zzk = zzdyVar.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzaar(wo1.l("Video format not supported: ", i2));
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final boolean zzb(zzdy zzdyVar, long j) throws zzbp {
        int zzk = zzdyVar.zzk();
        long zzf = (zzdyVar.zzf() * 1000) + j;
        if (zzk == 0) {
            if (!this.zze) {
                zzdy zzdyVar2 = new zzdy(new byte[zzdyVar.zza()]);
                zzdyVar.zzB(zzdyVar2.zzH(), 0, zzdyVar.zza());
                zzya zza = zzya.zza(zzdyVar2);
                this.zzd = zza.zzb;
                zzab zzabVar = new zzab();
                zzabVar.zzS("video/avc");
                zzabVar.zzx(zza.zzf);
                zzabVar.zzX(zza.zzc);
                zzabVar.zzF(zza.zzd);
                zzabVar.zzP(zza.zze);
                zzabVar.zzI(zza.zza);
                this.zza.zzk(zzabVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (this.zzf || i != 0) {
                byte[] zzH = this.zzc.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i2 = 4 - this.zzd;
                int i3 = 0;
                while (zzdyVar.zza() > 0) {
                    zzdyVar.zzB(this.zzc.zzH(), i2, this.zzd);
                    this.zzc.zzF(0);
                    int zzn = this.zzc.zzn();
                    this.zzb.zzF(0);
                    this.zza.zzq(this.zzb, 4);
                    this.zza.zzq(zzdyVar, zzn);
                    i3 = i3 + 4 + zzn;
                }
                this.zza.zzs(zzf, i, i3, 0, null);
                this.zzf = true;
                return true;
            }
            return false;
        }
        return false;
    }
}