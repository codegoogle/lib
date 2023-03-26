package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagn implements zzaga {
    @z1
    private final String zza;
    private final zzdy zzb;
    private final zzdx zzc;
    private zzzy zzd;
    private String zze;
    private zzad zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    @z1
    private String zzu;

    public zzagn(@z1 String str) {
        this.zza = str;
        zzdy zzdyVar = new zzdy(1024);
        this.zzb = zzdyVar;
        byte[] zzH = zzdyVar.zzH();
        this.zzc = new zzdx(zzH, zzH.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzdx zzdxVar) throws zzbp {
        int zza = zzdxVar.zza();
        zzxs zzb = zzxt.zzb(zzdxVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzdxVar.zza();
    }

    private static long zzg(zzdx zzdxVar) {
        return zzdxVar.zzc((zzdxVar.zzc(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.zzl == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) throws zzbp {
        int i;
        int i2;
        int i3;
        boolean zzl;
        zzcw.zzb(this.zzd);
        while (zzdyVar.zza() > 0) {
            int i4 = this.zzg;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzk = zzdyVar.zzk();
                    if ((zzk & 224) == 224) {
                        this.zzj = zzk;
                        this.zzg = 2;
                    } else if (zzk != 86) {
                        this.zzg = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzdyVar.zza(), this.zzi - this.zzh);
                    zzdyVar.zzB(this.zzc.zza, this.zzh, min);
                    int i5 = this.zzh + min;
                    this.zzh = i5;
                    if (i5 == this.zzi) {
                        this.zzc.zzh(0);
                        zzdx zzdxVar = this.zzc;
                        if (!zzdxVar.zzl()) {
                            this.zzl = true;
                            int zzc = zzdxVar.zzc(1);
                            if (zzc == 1) {
                                i3 = zzdxVar.zzc(1);
                                i2 = 1;
                            } else {
                                i2 = zzc;
                                i3 = 0;
                            }
                            this.zzm = i3;
                            if (i3 == 0) {
                                if (i2 == 1) {
                                    zzg(zzdxVar);
                                    i2 = 1;
                                }
                                if (zzdxVar.zzl()) {
                                    this.zzn = zzdxVar.zzc(6);
                                    int zzc2 = zzdxVar.zzc(4);
                                    int zzc3 = zzdxVar.zzc(3);
                                    if (zzc2 == 0 && zzc3 == 0) {
                                        if (i2 == 0) {
                                            int zzb = zzdxVar.zzb();
                                            int zzf = zzf(zzdxVar);
                                            zzdxVar.zzh(zzb);
                                            byte[] bArr = new byte[(zzf + 7) / 8];
                                            zzdxVar.zzf(bArr, 0, zzf);
                                            zzab zzabVar = new zzab();
                                            zzabVar.zzH(this.zze);
                                            zzabVar.zzS("audio/mp4a-latm");
                                            zzabVar.zzx(this.zzu);
                                            zzabVar.zzw(this.zzt);
                                            zzabVar.zzT(this.zzr);
                                            zzabVar.zzI(Collections.singletonList(bArr));
                                            zzabVar.zzK(this.zza);
                                            zzad zzY = zzabVar.zzY();
                                            if (!zzY.equals(this.zzf)) {
                                                this.zzf = zzY;
                                                this.zzs = 1024000000 / zzY.zzA;
                                                this.zzd.zzk(zzY);
                                            }
                                        } else {
                                            zzdxVar.zzj(((int) zzg(zzdxVar)) - zzf(zzdxVar));
                                        }
                                        int zzc4 = zzdxVar.zzc(3);
                                        this.zzo = zzc4;
                                        if (zzc4 == 0) {
                                            zzdxVar.zzj(8);
                                        } else if (zzc4 == 1) {
                                            zzdxVar.zzj(9);
                                        } else if (zzc4 == 3 || zzc4 == 4 || zzc4 == 5) {
                                            zzdxVar.zzj(6);
                                        } else if (zzc4 != 6 && zzc4 != 7) {
                                            throw new IllegalStateException();
                                        } else {
                                            zzdxVar.zzj(1);
                                        }
                                        boolean zzl2 = zzdxVar.zzl();
                                        this.zzp = zzl2;
                                        this.zzq = 0L;
                                        if (zzl2) {
                                            if (i2 != 1) {
                                                do {
                                                    zzl = zzdxVar.zzl();
                                                    this.zzq = (this.zzq << 8) + zzdxVar.zzc(8);
                                                } while (zzl);
                                            } else {
                                                this.zzq = zzg(zzdxVar);
                                            }
                                        }
                                        if (zzdxVar.zzl()) {
                                            zzdxVar.zzj(8);
                                        }
                                    } else {
                                        throw zzbp.zza(null, null);
                                    }
                                } else {
                                    throw zzbp.zza(null, null);
                                }
                            } else {
                                throw zzbp.zza(null, null);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzbp.zza(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzbp.zza(null, null);
                        }
                        if (this.zzo == 0) {
                            int i6 = 0;
                            while (true) {
                                int zzc5 = zzdxVar.zzc(8);
                                i = i6 + zzc5;
                                if (zzc5 != 255) {
                                    break;
                                }
                                i6 = i;
                            }
                            int zzb2 = zzdxVar.zzb();
                            if ((zzb2 & 7) == 0) {
                                this.zzb.zzF(zzb2 >> 3);
                            } else {
                                zzdxVar.zzf(this.zzb.zzH(), 0, i * 8);
                                this.zzb.zzF(0);
                            }
                            zzzw.zzb(this.zzd, this.zzb, i);
                            long j = this.zzk;
                            if (j != -9223372036854775807L) {
                                this.zzd.zzs(j, 1, i, 0, null);
                                this.zzk += this.zzs;
                            }
                            if (this.zzp) {
                                zzdxVar.zzj((int) this.zzq);
                            }
                            this.zzg = 0;
                        } else {
                            throw zzbp.zza(null, null);
                        }
                    } else {
                        continue;
                    }
                } else {
                    int zzk2 = ((this.zzj & (-225)) << 8) | zzdyVar.zzk();
                    this.zzi = zzk2;
                    zzdy zzdyVar2 = this.zzb;
                    if (zzk2 > zzdyVar2.zzH().length) {
                        zzdyVar2.zzC(zzk2);
                        zzdx zzdxVar2 = this.zzc;
                        byte[] zzH = this.zzb.zzH();
                        zzdxVar2.zzg(zzH, zzH.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzdyVar.zzk() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzd = zzyuVar.zzv(zzahmVar.zza(), 1);
        this.zze = zzahmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}