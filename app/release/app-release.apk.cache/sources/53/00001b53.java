package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaap implements zzyr {
    public static final zzyy zza = zzaao.zza;
    private zzyu zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzaan zzp;
    private zzaat zzq;
    private final zzdy zzb = new zzdy(4);
    private final zzdy zzc = new zzdy(9);
    private final zzdy zzd = new zzdy(11);
    private final zzdy zze = new zzdy();
    private final zzaaq zzf = new zzaaq();
    private int zzh = 1;

    private final zzdy zze(zzys zzysVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzdy zzdyVar = this.zze;
            int zzb = zzdyVar.zzb();
            zzdyVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzyl) zzysVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzL(new zzzt(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        long j;
        boolean zzf;
        boolean z;
        zzcw.zzb(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zzyl) zzysVar).zzo(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i != 3) {
                    if (i == 4) {
                        if (this.zzi) {
                            j = this.zzj + this.zzn;
                        } else {
                            j = this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                        }
                        int i3 = this.zzl;
                        if (i3 != 8) {
                            i2 = i3;
                        } else if (this.zzp != null) {
                            zzf();
                            zzf = this.zzp.zzf(zze(zzysVar), j);
                            z = true;
                            if (!this.zzi && zzf) {
                                this.zzi = true;
                                this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                            }
                            this.zzk = 4;
                            this.zzh = 2;
                            if (!z) {
                                return 0;
                            }
                        }
                        if (i2 != 9) {
                            if (i2 == 18 && !this.zzo) {
                                zzf = this.zzf.zzf(zze(zzysVar), j);
                                zzaaq zzaaqVar = this.zzf;
                                long zzc = zzaaqVar.zzc();
                                if (zzc != -9223372036854775807L) {
                                    this.zzg.zzL(new zzzj(zzaaqVar.zzd(), zzaaqVar.zze(), zzc));
                                    this.zzo = true;
                                }
                                z = true;
                            }
                            ((zzyl) zzysVar).zzo(this.zzm, false);
                            zzf = false;
                            z = false;
                        } else {
                            if (this.zzq != null) {
                                zzf();
                                zzf = this.zzq.zzf(zze(zzysVar), j);
                                z = true;
                            }
                            ((zzyl) zzysVar).zzo(this.zzm, false);
                            zzf = false;
                            z = false;
                        }
                        if (!this.zzi) {
                            this.zzi = true;
                            this.zzj = this.zzf.zzc() != -9223372036854775807L ? -this.zzn : 0L;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (!z) {
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!zzysVar.zzn(this.zzd.zzH(), 0, 11, true)) {
                    return -1;
                } else {
                    this.zzd.zzF(0);
                    this.zzl = this.zzd.zzk();
                    this.zzm = this.zzd.zzm();
                    this.zzn = this.zzd.zzm();
                    this.zzn = ((this.zzd.zzk() << 24) | this.zzn) * 1000;
                    this.zzd.zzG(3);
                    this.zzh = 4;
                }
            } else if (!zzysVar.zzn(this.zzc.zzH(), 0, 9, true)) {
                return -1;
            } else {
                this.zzc.zzF(0);
                this.zzc.zzG(4);
                int zzk = this.zzc.zzk();
                int i4 = zzk & 1;
                if ((zzk & 4) != 0 && this.zzp == null) {
                    this.zzp = new zzaan(this.zzg.zzv(8, 1));
                }
                if (i4 != 0 && this.zzq == null) {
                    this.zzq = new zzaat(this.zzg.zzv(9, 2));
                }
                this.zzg.zzB();
                this.zzk = this.zzc.zze() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzg = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzylVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & 250) != 0) {
            return false;
        }
        zzylVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzysVar.zzj();
        zzyl zzylVar2 = (zzyl) zzysVar;
        zzylVar2.zzl(zze, false);
        zzylVar2.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}