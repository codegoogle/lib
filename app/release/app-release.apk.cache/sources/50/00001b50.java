package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaam implements zzyr {
    public static final zzyy zza = zzaal.zza;
    private final byte[] zzb;
    private final zzdy zzc;
    private final zzyz zzd;
    private zzyu zze;
    private zzzy zzf;
    private int zzg;
    @z1
    private zzbl zzh;
    private zzze zzi;
    private int zzj;
    private int zzk;
    private zzaak zzl;
    private int zzm;
    private long zzn;

    public zzaam() {
        this(0);
    }

    public zzaam(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzdy(new byte[32768], 0);
        this.zzd = new zzyz();
        this.zzg = 0;
    }

    private final long zze(zzdy zzdyVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzc = zzdyVar.zzc();
        while (zzc <= zzdyVar.zzd() - 16) {
            zzdyVar.zzF(zzc);
            if (zzza.zzc(zzdyVar, this.zzi, this.zzk, this.zzd)) {
                zzdyVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (z) {
            while (zzc <= zzdyVar.zzd() - this.zzj) {
                zzdyVar.zzF(zzc);
                try {
                    z2 = zzza.zzc(zzdyVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzdyVar.zzc() <= zzdyVar.zzd() && z2) {
                    zzdyVar.zzF(zzc);
                    return this.zzd.zza;
                }
                zzc++;
            }
            zzdyVar.zzF(zzdyVar.zzd());
            return -1L;
        }
        zzdyVar.zzF(zzc);
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn;
        zzze zzzeVar = this.zzi;
        int i = zzeg.zza;
        this.zzf.zzs((j * 1000000) / zzzeVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        boolean zzl;
        zzzu zzztVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzysVar.zzj();
            long zze = zzysVar.zze();
            zzbl zza2 = zzzb.zza(zzysVar, true);
            ((zzyl) zzysVar).zzo((int) (zzysVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzyl) zzysVar).zzm(this.zzb, 0, 42, false);
            zzysVar.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzdy zzdyVar = new zzdy(4);
            ((zzyl) zzysVar).zzn(zzdyVar.zzH(), 0, 4, false);
            if (zzdyVar.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbp.zza("Failed to read FLAC stream marker.", null);
        } else if (i == 3) {
            zzze zzzeVar = this.zzi;
            do {
                zzysVar.zzj();
                zzdx zzdxVar = new zzdx(new byte[4], 4);
                zzyl zzylVar = (zzyl) zzysVar;
                zzylVar.zzm(zzdxVar.zza, 0, 4, false);
                zzl = zzdxVar.zzl();
                int zzc = zzdxVar.zzc(7);
                int zzc2 = zzdxVar.zzc(24) + 4;
                if (zzc == 0) {
                    byte[] bArr = new byte[38];
                    zzylVar.zzn(bArr, 0, 38, false);
                    zzzeVar = new zzze(bArr, 4);
                } else if (zzzeVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzc == 3) {
                        zzdy zzdyVar2 = new zzdy(zzc2);
                        zzylVar.zzn(zzdyVar2.zzH(), 0, zzc2, false);
                        zzzeVar = zzzeVar.zzf(zzzb.zzb(zzdyVar2));
                    } else if (zzc == 4) {
                        zzdy zzdyVar3 = new zzdy(zzc2);
                        zzylVar.zzn(zzdyVar3.zzH(), 0, zzc2, false);
                        zzdyVar3.zzG(4);
                        zzzeVar = zzzeVar.zzg(Arrays.asList(zzaae.zzc(zzdyVar3, false, false).zzb));
                    } else if (zzc == 6) {
                        zzdy zzdyVar4 = new zzdy(zzc2);
                        zzylVar.zzn(zzdyVar4.zzH(), 0, zzc2, false);
                        zzdyVar4.zzG(4);
                        zzzeVar = zzzeVar.zze(zzfrj.zzp(zzabg.zzb(zzdyVar4)));
                    } else {
                        zzylVar.zzo(zzc2, false);
                    }
                }
                int i2 = zzeg.zza;
                this.zzi = zzzeVar;
            } while (!zzl);
            Objects.requireNonNull(zzzeVar);
            this.zzj = Math.max(zzzeVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i != 4) {
            Objects.requireNonNull(this.zzf);
            zzze zzzeVar2 = this.zzi;
            Objects.requireNonNull(zzzeVar2);
            zzaak zzaakVar = this.zzl;
            if (zzaakVar == null || !zzaakVar.zze()) {
                if (this.zzn == -1) {
                    this.zzn = zzza.zzb(zzysVar, zzzeVar2);
                    return 0;
                }
                zzdy zzdyVar5 = this.zzc;
                int zzd = zzdyVar5.zzd();
                if (zzd < 32768) {
                    int zza3 = zzysVar.zza(zzdyVar5.zzH(), zzd, 32768 - zzd);
                    z = zza3 == -1;
                    if (!z) {
                        this.zzc.zzE(zzd + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzdy zzdyVar6 = this.zzc;
                int zzc3 = zzdyVar6.zzc();
                int i3 = this.zzm;
                int i4 = this.zzj;
                if (i3 < i4) {
                    zzdyVar6.zzG(Math.min(i4 - i3, zzdyVar6.zza()));
                }
                long zze2 = zze(this.zzc, z);
                zzdy zzdyVar7 = this.zzc;
                int zzc4 = zzdyVar7.zzc() - zzc3;
                zzdyVar7.zzF(zzc3);
                zzzw.zzb(this.zzf, this.zzc, zzc4);
                this.zzm += zzc4;
                if (zze2 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze2;
                }
                zzdy zzdyVar8 = this.zzc;
                if (zzdyVar8.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzdyVar8.zza();
                System.arraycopy(zzdyVar8.zzH(), zzdyVar8.zzc(), zzdyVar8.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            return zzaakVar.zza(zzysVar, zzzrVar);
        } else {
            zzysVar.zzj();
            zzdy zzdyVar9 = new zzdy(2);
            ((zzyl) zzysVar).zzm(zzdyVar9.zzH(), 0, 2, false);
            int zzo = zzdyVar9.zzo();
            if ((zzo >> 2) == 16382) {
                zzysVar.zzj();
                this.zzk = zzo;
                zzyu zzyuVar = this.zze;
                int i5 = zzeg.zza;
                long zzf = zzysVar.zzf();
                long zzd2 = zzysVar.zzd();
                zzze zzzeVar3 = this.zzi;
                Objects.requireNonNull(zzzeVar3);
                if (zzzeVar3.zzk != null) {
                    zzztVar = new zzzc(zzzeVar3, zzf);
                } else if (zzd2 != -1 && zzzeVar3.zzj > 0) {
                    zzaak zzaakVar2 = new zzaak(zzzeVar3, this.zzk, zzf, zzd2);
                    this.zzl = zzaakVar2;
                    zzztVar = zzaakVar2.zzb();
                } else {
                    zzztVar = new zzzt(zzzeVar3.zza(), 0L);
                }
                zzyuVar.zzL(zzztVar);
                this.zzg = 5;
                return 0;
            }
            zzysVar.zzj();
            throw zzbp.zza("First frame does not start with sync code.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zze = zzyuVar;
        this.zzf = zzyuVar.zzv(0, 1);
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaak zzaakVar = this.zzl;
            if (zzaakVar != null) {
                zzaakVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        zzzb.zza(zzysVar, false);
        zzdy zzdyVar = new zzdy(4);
        ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, 4, false);
        return zzdyVar.zzs() == 1716281667;
    }
}