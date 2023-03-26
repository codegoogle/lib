package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaft implements zzaga {
    private final zzdx zza;
    private final zzdy zzb;
    @z1
    private final String zzc;
    private String zzd;
    private zzzy zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzad zzj;
    private int zzk;
    private long zzl;

    public zzaft() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zze);
        while (zzdyVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (zzdyVar.zza() > 0) {
                    if (!this.zzh) {
                        this.zzh = zzdyVar.zzk() == 172;
                    } else {
                        int zzk = zzdyVar.zzk();
                        this.zzh = zzk == 172;
                        if (zzk != 64) {
                            if (zzk == 65) {
                                zzk = 65;
                            }
                        }
                        this.zzf = 1;
                        zzdy zzdyVar2 = this.zzb;
                        zzdyVar2.zzH()[0] = -84;
                        zzdyVar2.zzH()[1] = zzk == 65 ? (byte) 65 : (byte) 64;
                        this.zzg = 2;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzdyVar.zza(), this.zzk - this.zzg);
                zzzw.zzb(this.zze, zzdyVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzdyVar.zza(), 16 - this.zzg);
                zzdyVar.zzB(zzH, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzh(0);
                    zzxy zza = zzxz.zza(this.zza);
                    zzad zzadVar = this.zzj;
                    if (zzadVar == null || zzadVar.zzz != 2 || zza.zza != zzadVar.zzA || !"audio/ac4".equals(zzadVar.zzm)) {
                        zzab zzabVar = new zzab();
                        zzabVar.zzH(this.zzd);
                        zzabVar.zzS("audio/ac4");
                        zzabVar.zzw(2);
                        zzabVar.zzT(zza.zza);
                        zzabVar.zzK(this.zzc);
                        zzad zzY = zzabVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zza.zzb;
                    this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    zzzw.zzb(this.zze, this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzd = zzahmVar.zzb();
        this.zze = zzyuVar.zzv(zzahmVar.zza(), 1);
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
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzaft(@z1 String str) {
        zzdx zzdxVar = new zzdx(new byte[16], 16);
        this.zza = zzdxVar;
        this.zzb = new zzdy(zzdxVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}