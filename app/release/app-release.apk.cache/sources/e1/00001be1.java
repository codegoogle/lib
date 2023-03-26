package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafw implements zzaga {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzdx zzc = new zzdx(new byte[7], 7);
    private final zzdy zzd = new zzdy(Arrays.copyOf(zza, 10));
    @z1
    private final String zze;
    private String zzf;
    private zzzy zzg;
    private zzzy zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzzy zzu;
    private long zzv;

    public zzafw(boolean z, @z1 String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzzy zzzyVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzzyVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzdy zzdyVar, byte[] bArr, int i) {
        int min = Math.min(zzdyVar.zza(), i - this.zzj);
        zzdyVar.zzB(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzdy zzdyVar, byte[] bArr, int i) {
        if (zzdyVar.zza() < i) {
            return false;
        }
        zzdyVar.zzB(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) throws zzbp {
        int i;
        int i2;
        int i3;
        Objects.requireNonNull(this.zzg);
        int i4 = zzeg.zza;
        while (zzdyVar.zza() > 0) {
            int i5 = this.zzi;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzH = zzdyVar.zzH();
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        i = zzc + 1;
                        i2 = zzH[zzc] & 255;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i2)) {
                            if (!this.zzm) {
                                int i8 = i - 2;
                                zzdyVar.zzF(i8 + 1);
                                if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                    this.zzc.zzh(4);
                                    int zzc2 = this.zzc.zzc(1);
                                    int i9 = this.zzn;
                                    if (i9 == -1 || zzc2 == i9) {
                                        if (this.zzo != -1) {
                                            if (!zzm(zzdyVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzh(i7);
                                            if (this.zzc.zzc(4) == this.zzo) {
                                                zzdyVar.zzF(i8 + 2);
                                            }
                                        }
                                        if (!zzm(zzdyVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzh(14);
                                        int zzc3 = this.zzc.zzc(i6);
                                        if (zzc3 >= 7) {
                                            byte[] zzH2 = zzdyVar.zzH();
                                            int zzd2 = zzdyVar.zzd();
                                            int i10 = i8 + zzc3;
                                            if (i10 < zzd2) {
                                                byte b = zzH2[i10];
                                                if (b != -1) {
                                                    if (b == 73) {
                                                        int i11 = i10 + 1;
                                                        if (i11 == zzd2) {
                                                            break;
                                                        } else if (zzH2[i11] == 68) {
                                                            int i12 = i10 + 2;
                                                            if (i12 == zzd2) {
                                                                break;
                                                            } else if (zzH2[i12] == 51) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i13 = i10 + 1;
                                                    if (i13 == zzd2) {
                                                        break;
                                                    }
                                                    byte b2 = zzH2[i13];
                                                    if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzc2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i14 = this.zzk;
                        int i15 = i14 | i2;
                        if (i15 == 329) {
                            i3 = 768;
                        } else if (i15 == 511) {
                            i3 = 512;
                        } else if (i15 == 836) {
                            i3 = 1024;
                        } else if (i15 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzF(0);
                            zzdyVar.zzF(i);
                            break;
                        } else if (i14 != 256) {
                            this.zzk = 256;
                            zzc = i - 1;
                            i6 = 13;
                            i7 = 2;
                        } else {
                            zzc = i;
                            i6 = 13;
                            i7 = 2;
                        }
                        this.zzk = i3;
                        zzc = i;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        zzdyVar.zzF(zzc);
                        break;
                    }
                }
                this.zzp = (i2 & 8) >> 3;
                this.zzl = 1 == ((i2 & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzdyVar.zzF(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(zzdyVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzdyVar, min);
                        int i16 = this.zzj + min;
                        this.zzj = i16;
                        int i17 = this.zzs;
                        if (i16 == i17) {
                            long j = this.zzt;
                            if (j != -9223372036854775807L) {
                                this.zzu.zzs(j, 1, i17, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzdyVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzh(0);
                            if (!this.zzq) {
                                int zzc4 = this.zzc.zzc(2) + 1;
                                this.zzc.zzj(5);
                                int zzc5 = this.zzc.zzc(3);
                                int i18 = this.zzo;
                                int i19 = zzxt.zza;
                                byte[] bArr = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((zzc5 << 3) & 120) | ((i18 << 7) & 128))};
                                zzxs zza2 = zzxt.zza(bArr);
                                zzab zzabVar = new zzab();
                                zzabVar.zzH(this.zzf);
                                zzabVar.zzS("audio/mp4a-latm");
                                zzabVar.zzx(zza2.zzc);
                                zzabVar.zzw(zza2.zzb);
                                zzabVar.zzT(zza2.zza);
                                zzabVar.zzI(Collections.singletonList(bArr));
                                zzabVar.zzK(this.zze);
                                zzad zzY = zzabVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            } else {
                                this.zzc.zzj(10);
                            }
                            this.zzc.zzj(4);
                            int zzc6 = this.zzc.zzc(13) - 7;
                            if (this.zzl) {
                                zzc6 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzc6);
                        }
                    }
                } else if (zzk(zzdyVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzj());
                }
            } else if (zzdyVar.zza() != 0) {
                zzdx zzdxVar = this.zzc;
                zzdxVar.zza[0] = zzdyVar.zzH()[zzdyVar.zzc()];
                zzdxVar.zzh(2);
                int zzc7 = this.zzc.zzc(4);
                int i20 = this.zzo;
                if (i20 != -1 && zzc7 != i20) {
                    zzg();
                } else {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzc7;
                    }
                    zzi();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzf = zzahmVar.zzb();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzyq();
            return;
        }
        zzahmVar.zzc();
        zzzy zzv2 = zzyuVar.zzv(zzahmVar.zza(), 5);
        this.zzh = zzv2;
        zzab zzabVar = new zzab();
        zzabVar.zzH(zzahmVar.zzb());
        zzabVar.zzS("application/id3");
        zzv2.zzk(zzabVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}