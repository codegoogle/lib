package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafy implements zzaga {
    @z1
    private final String zzb;
    private String zzc;
    private zzzy zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzad zzi;
    private int zzj;
    private final zzdy zza = new zzdy(new byte[18]);
    private int zze = 0;
    private long zzk = -9223372036854775807L;

    public zzafy(@z1 String str) {
        this.zzb = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        int i;
        byte b;
        boolean z;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        int i5;
        zzcw.zzb(this.zzd);
        while (zzdyVar.zza() > 0) {
            int i6 = this.zze;
            if (i6 == 0) {
                while (zzdyVar.zza() > 0) {
                    int i7 = this.zzg << 8;
                    this.zzg = i7;
                    int zzk = i7 | zzdyVar.zzk();
                    this.zzg = zzk;
                    int i8 = zzyp.zza;
                    if (zzk == 2147385345 || zzk == -25230976 || zzk == 536864768 || zzk == -14745368) {
                        byte[] zzH = this.zza.zzH();
                        int i9 = this.zzg;
                        zzH[0] = (byte) ((i9 >> 24) & 255);
                        zzH[1] = (byte) ((i9 >> 16) & 255);
                        zzH[2] = (byte) ((i9 >> 8) & 255);
                        zzH[3] = (byte) (i9 & 255);
                        this.zzf = 4;
                        this.zzg = 0;
                        this.zze = 1;
                        break;
                    }
                    while (zzdyVar.zza() > 0) {
                    }
                }
            } else if (i6 != 1) {
                int min = Math.min(zzdyVar.zza(), this.zzj - this.zzf);
                zzzw.zzb(this.zzd, zzdyVar, min);
                int i10 = this.zzf + min;
                this.zzf = i10;
                int i11 = this.zzj;
                if (i10 == i11) {
                    long j = this.zzk;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i11, 0, null);
                        this.zzk += this.zzh;
                    }
                    this.zze = 0;
                }
            } else {
                byte[] zzH2 = this.zza.zzH();
                int min2 = Math.min(zzdyVar.zza(), 18 - this.zzf);
                zzdyVar.zzB(zzH2, this.zzf, min2);
                int i12 = this.zzf + min2;
                this.zzf = i12;
                if (i12 == 18) {
                    byte[] zzH3 = this.zza.zzH();
                    if (this.zzi == null) {
                        zzad zza = zzyp.zza(zzH3, this.zzc, this.zzb, null);
                        this.zzi = zza;
                        this.zzd.zzk(zza);
                    }
                    int i13 = zzyp.zza;
                    byte b5 = zzH3[0];
                    if (b5 == -2) {
                        i = ((zzH3[4] & 3) << 12) | ((zzH3[7] & 255) << 4);
                        b = zzH3[6];
                    } else {
                        if (b5 == -1) {
                            i5 = ((zzH3[7] & 3) << 12) | ((zzH3[6] & 255) << 4) | ((zzH3[9] & 60) >> 2);
                        } else if (b5 != 31) {
                            i = ((zzH3[5] & 3) << 12) | ((zzH3[6] & 255) << 4);
                            b = zzH3[7];
                        } else {
                            i5 = ((zzH3[8] & 60) >> 2) | ((3 & zzH3[6]) << 12) | ((zzH3[7] & 255) << 4);
                        }
                        i2 = i5 + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.zzj = i2;
                        b2 = zzH3[0];
                        if (b2 != -2) {
                            i3 = (zzH3[5] & 1) << 6;
                            b3 = zzH3[4];
                        } else {
                            if (b2 == -1) {
                                i3 = (zzH3[4] & 7) << 4;
                                b4 = zzH3[7];
                            } else if (b2 != 31) {
                                i3 = (zzH3[4] & 1) << 6;
                                b3 = zzH3[5];
                            } else {
                                i3 = (zzH3[5] & 7) << 4;
                                b4 = zzH3[6];
                            }
                            i4 = b4 & 60;
                            this.zzh = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.zzi.zzA);
                            this.zza.zzF(0);
                            zzzw.zzb(this.zzd, this.zza, 18);
                            this.zze = 2;
                        }
                        i4 = b3 & 252;
                        this.zzh = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.zzi.zzA);
                        this.zza.zzF(0);
                        zzzw.zzb(this.zzd, this.zza, 18);
                        this.zze = 2;
                    }
                    i2 = (i | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                    }
                    this.zzj = i2;
                    b2 = zzH3[0];
                    if (b2 != -2) {
                    }
                    i4 = b3 & 252;
                    this.zzh = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.zzi.zzA);
                    this.zza.zzF(0);
                    zzzw.zzb(this.zzd, this.zza, 18);
                    this.zze = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzc = zzahmVar.zzb();
        this.zzd = zzyuVar.zzv(zzahmVar.zza(), 1);
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
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
    }
}