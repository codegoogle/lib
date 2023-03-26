package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzago implements zzaga {
    private final zzdy zza;
    private final zzzk zzb;
    @z1
    private final String zzc;
    private zzzy zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzago() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzzk zzzkVar;
        zzcw.zzb(this.zzd);
        while (zzdyVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] zzH = zzdyVar.zzH();
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        byte b = zzH[zzc];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.zzi && (b & 224) == 224;
                        this.zzi = z;
                        if (z2) {
                            zzdyVar.zzF(zzc + 1);
                            this.zzi = false;
                            this.zza.zzH()[1] = zzH[zzc];
                            this.zzg = 2;
                            this.zzf = 1;
                            break;
                        }
                        zzc++;
                    } else {
                        zzdyVar.zzF(zzd);
                        break;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzdyVar.zza(), this.zzk - this.zzg);
                zzzw.zzb(this.zzd, zzdyVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzdyVar.zza(), 4 - this.zzg);
                zzdyVar.zzB(this.zza.zzH(), this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzF(0);
                    if (this.zzb.zza(this.zza.zze())) {
                        this.zzk = this.zzb.zzc;
                        if (!this.zzh) {
                            this.zzj = (zzzkVar.zzg * 1000000) / zzzkVar.zzd;
                            zzab zzabVar = new zzab();
                            zzabVar.zzH(this.zze);
                            zzabVar.zzS(this.zzb.zzb);
                            zzabVar.zzL(4096);
                            zzabVar.zzw(this.zzb.zze);
                            zzabVar.zzT(this.zzb.zzd);
                            zzabVar.zzK(this.zzc);
                            this.zzd.zzk(zzabVar.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        zzzw.zzb(this.zzd, this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zze = zzahmVar.zzb();
        this.zzd = zzyuVar.zzv(zzahmVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzago(@z1 String str) {
        this.zzf = 0;
        zzdy zzdyVar = new zzdy(4);
        this.zza = zzdyVar;
        zzdyVar.zzH()[0] = -1;
        this.zzb = new zzzk();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}