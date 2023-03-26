package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzado implements zzyr {
    public static final zzyy zza = zzadm.zza;
    private static final zzaby zzb = zzadn.zza;
    private final zzdy zzc;
    private final zzzk zzd;
    private final zzzg zze;
    private final zzzi zzf;
    private final zzzy zzg;
    private zzyu zzh;
    private zzzy zzi;
    private zzzy zzj;
    private int zzk;
    @z1
    private zzbl zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzadq zzq;
    private boolean zzr;

    public zzado() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzf(zzys zzysVar) throws IOException {
        zzzk zzzkVar;
        int i;
        int i2;
        zzads zza2;
        zzadq zzh;
        int i3;
        int i4;
        zzbl zzblVar;
        zzadl zzadlVar;
        long j;
        if (this.zzk == 0) {
            try {
                zzk(zzysVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzdy zzdyVar = new zzdy(this.zzd.zzc);
            ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, this.zzd.zzc, false);
            zzzk zzzkVar2 = this.zzd;
            if ((zzzkVar2.zza & 1) == 0) {
                if (zzzkVar2.zze == 1) {
                    i = 13;
                    if (zzdyVar.zzd() >= i + 4) {
                    }
                    if (zzdyVar.zzd() >= 40) {
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i5 = i2;
                    zza2 = zzads.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                    if (zza2 != null) {
                    }
                    ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                    if (zza2 == null) {
                    }
                    zzblVar = this.zzl;
                    long zzf = zzysVar.zzf();
                    if (zzblVar != null) {
                    }
                    zzadlVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzL(zzh);
                    zzzy zzzyVar = this.zzj;
                    zzab zzabVar = new zzab();
                    zzabVar.zzS(this.zzd.zzb);
                    zzabVar.zzL(4096);
                    zzabVar.zzw(this.zzd.zze);
                    zzabVar.zzT(this.zzd.zzd);
                    zzabVar.zzC(this.zze.zza);
                    zzabVar.zzD(this.zze.zzb);
                    zzabVar.zzM(this.zzl);
                    zzzyVar.zzk(zzabVar.zzY());
                    this.zzo = zzysVar.zzf();
                }
                i = 21;
                if (zzdyVar.zzd() >= i + 4) {
                }
                if (zzdyVar.zzd() >= 40) {
                }
                i2 = 0;
                if (i2 != 1483304551) {
                }
                int i52 = i2;
                zza2 = zzads.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                if (zza2 != null) {
                }
                ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                if (zza2 == null) {
                }
                zzblVar = this.zzl;
                long zzf2 = zzysVar.zzf();
                if (zzblVar != null) {
                }
                zzadlVar = null;
                if (this.zzr) {
                }
                this.zzq = zzh;
                this.zzh.zzL(zzh);
                zzzy zzzyVar2 = this.zzj;
                zzab zzabVar2 = new zzab();
                zzabVar2.zzS(this.zzd.zzb);
                zzabVar2.zzL(4096);
                zzabVar2.zzw(this.zzd.zze);
                zzabVar2.zzT(this.zzd.zzd);
                zzabVar2.zzC(this.zze.zza);
                zzabVar2.zzD(this.zze.zzb);
                zzabVar2.zzM(this.zzl);
                zzzyVar2.zzk(zzabVar2.zzY());
                this.zzo = zzysVar.zzf();
            } else {
                if (zzzkVar2.zze != 1) {
                    i = 36;
                    if (zzdyVar.zzd() >= i + 4) {
                        zzdyVar.zzF(i);
                        int zze = zzdyVar.zze();
                        if (zze == 1483304551) {
                            i2 = zze;
                        } else if (zze == 1231971951) {
                            i2 = 1231971951;
                        }
                        if (i2 != 1483304551 || i2 == 1231971951) {
                            int i522 = i2;
                            zza2 = zzads.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                            if (zza2 != null && !this.zze.zza()) {
                                zzysVar.zzj();
                                zzyl zzylVar = (zzyl) zzysVar;
                                zzylVar.zzl(i + WKSRecord.Service.EMFIS_CNTL, false);
                                zzylVar.zzm(this.zzc.zzH(), 0, 3, false);
                                this.zzc.zzF(0);
                                zzzg zzzgVar = this.zze;
                                int zzm = this.zzc.zzm();
                                i3 = zzm >> 12;
                                i4 = zzm & 4095;
                                if (i3 <= 0 || i4 > 0) {
                                    zzzgVar.zza = i3;
                                    zzzgVar.zzb = i4;
                                }
                            }
                            ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                            zzh = (zza2 == null && !zza2.zzh() && i522 == 1231971951) ? zzh(zzysVar, false) : zza2;
                        } else if (i2 == 1447187017) {
                            zzh = zzadr.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                            ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                        } else {
                            zzysVar.zzj();
                            zzh = null;
                        }
                        zzblVar = this.zzl;
                        long zzf22 = zzysVar.zzf();
                        if (zzblVar != null) {
                            int zza3 = zzblVar.zza();
                            for (int i6 = 0; i6 < zza3; i6++) {
                                zzbk zzb2 = zzblVar.zzb(i6);
                                if (zzb2 instanceof zzacf) {
                                    zzacf zzacfVar = (zzacf) zzb2;
                                    int zza4 = zzblVar.zza();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= zza4) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzbk zzb3 = zzblVar.zzb(i7);
                                        if (zzb3 instanceof zzacj) {
                                            zzacj zzacjVar = (zzacj) zzb3;
                                            if (zzacjVar.zzf.equals("TLEN")) {
                                                j = zzeg.zzv(Long.parseLong(zzacjVar.zzb));
                                                break;
                                            }
                                        }
                                        i7++;
                                    }
                                    zzadlVar = zzadl.zza(zzf22, zzacfVar, j);
                                    if (this.zzr) {
                                        zzh = new zzadp();
                                    } else {
                                        if (zzadlVar != null) {
                                            zzh = zzadlVar;
                                        } else if (zzh == null) {
                                            zzh = null;
                                        }
                                        if (zzh != null) {
                                            zzh.zzh();
                                        } else {
                                            zzh = zzh(zzysVar, false);
                                        }
                                    }
                                    this.zzq = zzh;
                                    this.zzh.zzL(zzh);
                                    zzzy zzzyVar22 = this.zzj;
                                    zzab zzabVar22 = new zzab();
                                    zzabVar22.zzS(this.zzd.zzb);
                                    zzabVar22.zzL(4096);
                                    zzabVar22.zzw(this.zzd.zze);
                                    zzabVar22.zzT(this.zzd.zzd);
                                    zzabVar22.zzC(this.zze.zza);
                                    zzabVar22.zzD(this.zze.zzb);
                                    zzabVar22.zzM(this.zzl);
                                    zzzyVar22.zzk(zzabVar22.zzY());
                                    this.zzo = zzysVar.zzf();
                                }
                            }
                        }
                        zzadlVar = null;
                        if (this.zzr) {
                        }
                        this.zzq = zzh;
                        this.zzh.zzL(zzh);
                        zzzy zzzyVar222 = this.zzj;
                        zzab zzabVar222 = new zzab();
                        zzabVar222.zzS(this.zzd.zzb);
                        zzabVar222.zzL(4096);
                        zzabVar222.zzw(this.zzd.zze);
                        zzabVar222.zzT(this.zzd.zzd);
                        zzabVar222.zzC(this.zze.zza);
                        zzabVar222.zzD(this.zze.zzb);
                        zzabVar222.zzM(this.zzl);
                        zzzyVar222.zzk(zzabVar222.zzY());
                        this.zzo = zzysVar.zzf();
                    }
                    if (zzdyVar.zzd() >= 40) {
                        zzdyVar.zzF(36);
                        if (zzdyVar.zze() == 1447187017) {
                            i2 = 1447187017;
                            if (i2 != 1483304551) {
                            }
                            int i5222 = i2;
                            zza2 = zzads.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                            if (zza2 != null) {
                                zzysVar.zzj();
                                zzyl zzylVar2 = (zzyl) zzysVar;
                                zzylVar2.zzl(i + WKSRecord.Service.EMFIS_CNTL, false);
                                zzylVar2.zzm(this.zzc.zzH(), 0, 3, false);
                                this.zzc.zzF(0);
                                zzzg zzzgVar2 = this.zze;
                                int zzm2 = this.zzc.zzm();
                                i3 = zzm2 >> 12;
                                i4 = zzm2 & 4095;
                                if (i3 <= 0) {
                                }
                                zzzgVar2.zza = i3;
                                zzzgVar2.zzb = i4;
                            }
                            ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                            if (zza2 == null) {
                            }
                            zzblVar = this.zzl;
                            long zzf222 = zzysVar.zzf();
                            if (zzblVar != null) {
                            }
                            zzadlVar = null;
                            if (this.zzr) {
                            }
                            this.zzq = zzh;
                            this.zzh.zzL(zzh);
                            zzzy zzzyVar2222 = this.zzj;
                            zzab zzabVar2222 = new zzab();
                            zzabVar2222.zzS(this.zzd.zzb);
                            zzabVar2222.zzL(4096);
                            zzabVar2222.zzw(this.zzd.zze);
                            zzabVar2222.zzT(this.zzd.zzd);
                            zzabVar2222.zzC(this.zze.zza);
                            zzabVar2222.zzD(this.zze.zzb);
                            zzabVar2222.zzM(this.zzl);
                            zzzyVar2222.zzk(zzabVar2222.zzY());
                            this.zzo = zzysVar.zzf();
                        }
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i52222 = i2;
                    zza2 = zzads.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                    if (zza2 != null) {
                    }
                    ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                    if (zza2 == null) {
                    }
                    zzblVar = this.zzl;
                    long zzf2222 = zzysVar.zzf();
                    if (zzblVar != null) {
                    }
                    zzadlVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzL(zzh);
                    zzzy zzzyVar22222 = this.zzj;
                    zzab zzabVar22222 = new zzab();
                    zzabVar22222.zzS(this.zzd.zzb);
                    zzabVar22222.zzL(4096);
                    zzabVar22222.zzw(this.zzd.zze);
                    zzabVar22222.zzT(this.zzd.zzd);
                    zzabVar22222.zzC(this.zze.zza);
                    zzabVar22222.zzD(this.zze.zzb);
                    zzabVar22222.zzM(this.zzl);
                    zzzyVar22222.zzk(zzabVar22222.zzY());
                    this.zzo = zzysVar.zzf();
                }
                i = 21;
                if (zzdyVar.zzd() >= i + 4) {
                }
                if (zzdyVar.zzd() >= 40) {
                }
                i2 = 0;
                if (i2 != 1483304551) {
                }
                int i522222 = i2;
                zza2 = zzads.zza(zzysVar.zzd(), zzysVar.zzf(), this.zzd, zzdyVar);
                if (zza2 != null) {
                }
                ((zzyl) zzysVar).zzo(this.zzd.zzc, false);
                if (zza2 == null) {
                }
                zzblVar = this.zzl;
                long zzf22222 = zzysVar.zzf();
                if (zzblVar != null) {
                }
                zzadlVar = null;
                if (this.zzr) {
                }
                this.zzq = zzh;
                this.zzh.zzL(zzh);
                zzzy zzzyVar222222 = this.zzj;
                zzab zzabVar222222 = new zzab();
                zzabVar222222.zzS(this.zzd.zzb);
                zzabVar222222.zzL(4096);
                zzabVar222222.zzw(this.zzd.zze);
                zzabVar222222.zzT(this.zzd.zzd);
                zzabVar222222.zzC(this.zze.zza);
                zzabVar222222.zzD(this.zze.zzb);
                zzabVar222222.zzM(this.zzl);
                zzzyVar222222.zzk(zzabVar222222.zzY());
                this.zzo = zzysVar.zzf();
            }
        } else {
            long j2 = this.zzo;
            if (j2 != 0) {
                long zzf3 = zzysVar.zzf();
                if (zzf3 < j2) {
                    ((zzyl) zzysVar).zzo((int) (j2 - zzf3), false);
                }
            }
        }
        int i8 = this.zzp;
        if (i8 == 0) {
            zzysVar.zzj();
            if (zzj(zzysVar)) {
                return -1;
            }
            this.zzc.zzF(0);
            int zze2 = this.zzc.zze();
            if (zzi(zze2, this.zzk) && zzzl.zzb(zze2) != -1) {
                this.zzd.zza(zze2);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzq.zzc(zzysVar.zzf());
                }
                int i9 = this.zzd.zzc;
                this.zzp = i9;
                zzadq zzadqVar = this.zzq;
                if (zzadqVar instanceof zzadk) {
                    zzadk zzadkVar = (zzadk) zzadqVar;
                    zzg(this.zzn + zzzkVar.zzg);
                    throw null;
                }
                i8 = i9;
            } else {
                ((zzyl) zzysVar).zzo(1, false);
                this.zzk = 0;
                return 0;
            }
        }
        int zze3 = this.zzj.zze(zzysVar, i8, true);
        if (zze3 == -1) {
            return -1;
        }
        int i10 = this.zzp - zze3;
        this.zzp = i10;
        if (i10 <= 0) {
            this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
            this.zzn += this.zzd.zzg;
            this.zzp = 0;
            return 0;
        }
        return 0;
    }

    private final long zzg(long j) {
        return ((j * 1000000) / this.zzd.zzd) + this.zzm;
    }

    private final zzadq zzh(zzys zzysVar, boolean z) throws IOException {
        ((zzyl) zzysVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzadj(zzysVar.zzd(), zzysVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzys zzysVar) throws IOException {
        zzadq zzadqVar = this.zzq;
        if (zzadqVar != null) {
            long zzb2 = zzadqVar.zzb();
            if (zzb2 != -1 && zzysVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzysVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzys zzysVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        int i3 = true != z ? 131072 : 32768;
        zzysVar.zzj();
        if (zzysVar.zzf() == 0) {
            zzbl zza2 = this.zzf.zza(zzysVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzysVar.zze();
            if (!z) {
                ((zzyl) zzysVar).zzo(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!zzj(zzysVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i == 0 || zzi(zze, i)) && (zzb2 = zzzl.zzb(zze)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i = zze;
                    }
                    ((zzyl) zzysVar).zzl(zzb2 - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw zzbp.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzysVar.zzj();
                        ((zzyl) zzysVar).zzl(i2 + i6, false);
                    } else {
                        ((zzyl) zzysVar).zzo(1, false);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzyl) zzysVar).zzo(i2 + i5, false);
        } else {
            zzysVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzi);
        int i = zzeg.zza;
        int zzf = zzf(zzysVar);
        if (zzf == -1 && (this.zzq instanceof zzadk)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzadk zzadkVar = (zzadk) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzh = zzyuVar;
        zzzy zzv = zzyuVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzadq zzadqVar = this.zzq;
        if (zzadqVar instanceof zzadk) {
            zzadk zzadkVar = (zzadk) zzadqVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzk(zzysVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzado(int i) {
        this.zzc = new zzdy(10);
        this.zzd = new zzzk();
        this.zze = new zzzg();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzi();
        zzyq zzyqVar = new zzyq();
        this.zzg = zzyqVar;
        this.zzj = zzyqVar;
    }
}