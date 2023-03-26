package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagc implements zzaga {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzzy zzc;
    @z1
    private final zzahp zzd;
    @z1
    private final zzdy zze;
    @z1
    private final zzagp zzf;
    private final boolean[] zzg;
    private final zzagb zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzagc() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e1  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        int i;
        zzagp zzagpVar;
        int i2;
        long j;
        long j2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        int i6;
        zzcw.zzb(this.zzc);
        int zzc = zzdyVar.zzc();
        int zzd = zzdyVar.zzd();
        byte[] zzH = zzdyVar.zzH();
        this.zzi += zzdyVar.zza();
        zzzw.zzb(this.zzc, zzdyVar, zzdyVar.zza());
        while (true) {
            int zza2 = zzzo.zza(zzH, zzc, zzd, this.zzg);
            if (zza2 == zzd) {
                break;
            }
            int i7 = zza2 + 3;
            int i8 = zzdyVar.zzH()[i7] & 255;
            int i9 = zza2 - zzc;
            if (!this.zzk) {
                if (i9 > 0) {
                    this.zzh.zza(zzH, zzc, zza2);
                }
                if (this.zzh.zzc(i8, i9 < 0 ? -i9 : 0)) {
                    zzagb zzagbVar = this.zzh;
                    String str = this.zzb;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzagbVar.zzc, zzagbVar.zza);
                    byte b = copyOf[4];
                    int i10 = copyOf[5] & 255;
                    int i11 = ((b & 255) << 4) | (i10 >> 4);
                    int i12 = ((i10 & 15) << 8) | (copyOf[6] & 255);
                    int i13 = (copyOf[7] & 240) >> 4;
                    if (i13 == 2) {
                        f = i12 * 4;
                        i4 = i11 * 3;
                    } else if (i13 == 3) {
                        f = i12 * 16;
                        i4 = i11 * 9;
                    } else if (i13 != 4) {
                        f2 = 1.0f;
                        zzab zzabVar = new zzab();
                        zzabVar.zzH(str);
                        zzabVar.zzS("video/mpeg2");
                        zzabVar.zzX(i11);
                        zzabVar.zzF(i12);
                        zzabVar.zzP(f2);
                        zzabVar.zzI(Collections.singletonList(copyOf));
                        zzad zzY = zzabVar.zzY();
                        i5 = (copyOf[7] & 15) - 1;
                        long j3 = 0;
                        if (i5 >= 0 || i5 >= 8) {
                            i = i7;
                        } else {
                            double d = zza[i5];
                            byte b2 = copyOf[zzagbVar.zzb + 9];
                            int i14 = (b2 & 96) >> 5;
                            if (i14 != (b2 & 31)) {
                                i = i7;
                                d *= (i14 + 1.0d) / (i6 + 1);
                            } else {
                                i = i7;
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzY, Long.valueOf(j3));
                        this.zzc.zzk((zzad) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                        zzagpVar = this.zzf;
                        if (zzagpVar != null) {
                            if (i9 > 0) {
                                zzagpVar.zza(zzH, zzc, zza2);
                                i3 = 0;
                            } else {
                                i3 = -i9;
                            }
                            if (this.zzf.zzd(i3)) {
                                zzagp zzagpVar2 = this.zzf;
                                int zzb = zzzo.zzb(zzagpVar2.zza, zzagpVar2.zzb);
                                zzdy zzdyVar2 = this.zze;
                                int i15 = zzeg.zza;
                                zzdyVar2.zzD(this.zzf.zza, zzb);
                                this.zzd.zza(this.zzo, this.zze);
                            }
                            if (i8 == 178) {
                                if (zzdyVar.zzH()[zza2 + 2] == 1) {
                                    this.zzf.zzc(178);
                                }
                                i8 = 178;
                            }
                        }
                        if (i8 != 0 || i8 == 179) {
                            i2 = zzd - zza2;
                            if (this.zzq && this.zzk) {
                                j2 = this.zzo;
                                if (j2 != -9223372036854775807L) {
                                    this.zzc.zzs(j2, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i2, i2, null);
                                }
                            }
                            if (this.zzj || this.zzq) {
                                this.zzn = this.zzi - i2;
                                j = this.zzm;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.zzo;
                                    j = j4 != -9223372036854775807L ? j4 + this.zzl : -9223372036854775807L;
                                }
                                this.zzo = j;
                                this.zzp = false;
                                this.zzm = -9223372036854775807L;
                                this.zzj = true;
                            }
                            this.zzq = i8 == 0;
                        } else if (i8 == 184) {
                            this.zzp = true;
                        }
                        zzc = i;
                    } else {
                        f = i12 * 121;
                        i4 = i11 * 100;
                    }
                    f2 = f / i4;
                    zzab zzabVar2 = new zzab();
                    zzabVar2.zzH(str);
                    zzabVar2.zzS("video/mpeg2");
                    zzabVar2.zzX(i11);
                    zzabVar2.zzF(i12);
                    zzabVar2.zzP(f2);
                    zzabVar2.zzI(Collections.singletonList(copyOf));
                    zzad zzY2 = zzabVar2.zzY();
                    i5 = (copyOf[7] & 15) - 1;
                    long j32 = 0;
                    if (i5 >= 0) {
                    }
                    i = i7;
                    Pair create2 = Pair.create(zzY2, Long.valueOf(j32));
                    this.zzc.zzk((zzad) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                    zzagpVar = this.zzf;
                    if (zzagpVar != null) {
                    }
                    if (i8 != 0) {
                    }
                    i2 = zzd - zza2;
                    if (this.zzq) {
                        j2 = this.zzo;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzj) {
                    }
                    this.zzn = this.zzi - i2;
                    j = this.zzm;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzo = j;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    this.zzj = true;
                    this.zzq = i8 == 0;
                    zzc = i;
                }
            }
            i = i7;
            zzagpVar = this.zzf;
            if (zzagpVar != null) {
            }
            if (i8 != 0) {
            }
            i2 = zzd - zza2;
            if (this.zzq) {
            }
            if (this.zzj) {
            }
            this.zzn = this.zzi - i2;
            j = this.zzm;
            if (j == -9223372036854775807L) {
            }
            this.zzo = j;
            this.zzp = false;
            this.zzm = -9223372036854775807L;
            this.zzj = true;
            this.zzq = i8 == 0;
            zzc = i;
        }
        if (!this.zzk) {
            this.zzh.zza(zzH, zzc, zzd);
        }
        zzagp zzagpVar3 = this.zzf;
        if (zzagpVar3 != null) {
            zzagpVar3.zza(zzH, zzc, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        this.zzc = zzyuVar.zzv(zzahmVar.zza(), 2);
        zzahp zzahpVar = this.zzd;
        if (zzahpVar != null) {
            zzahpVar.zzb(zzyuVar, zzahmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzo.zze(this.zzg);
        this.zzh.zzb();
        zzagp zzagpVar = this.zzf;
        if (zzagpVar != null) {
            zzagpVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    public zzagc(@z1 zzahp zzahpVar) {
        zzdy zzdyVar;
        this.zzd = zzahpVar;
        this.zzg = new boolean[4];
        this.zzh = new zzagb(128);
        if (zzahpVar != null) {
            this.zzf = new zzagp(178, 128);
            zzdyVar = new zzdy();
        } else {
            zzdyVar = null;
            this.zzf = null;
        }
        this.zze = zzdyVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}