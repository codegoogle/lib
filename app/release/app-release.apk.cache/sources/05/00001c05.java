package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahe {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    public zzahe(int i) {
    }

    private final int zze(zzys zzysVar) {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
        this.zzc = true;
        zzysVar.zzj();
        return 0;
    }

    public final int zza(zzys zzysVar, zzzr zzzrVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzysVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzysVar);
                return 0;
            } else if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzysVar);
                    return 0;
                }
                long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j2);
                this.zzh = zzb;
                if (zzb < 0) {
                    this.zzh = -9223372036854775807L;
                }
                zze(zzysVar);
                return 0;
            } else {
                int min = (int) Math.min(112800L, zzysVar.zzd());
                if (zzysVar.zzf() != 0) {
                    zzzrVar.zza = 0L;
                    return 1;
                }
                this.zzb.zzC(min);
                zzysVar.zzj();
                ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
                zzdy zzdyVar = this.zzb;
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc >= zzd) {
                        break;
                    }
                    if (zzdyVar.zzH()[zzc] == 71) {
                        long zzb2 = zzaho.zzb(zzdyVar, zzc, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzc++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
        }
        long zzd2 = zzysVar.zzd();
        int min2 = (int) Math.min(112800L, zzd2);
        long j3 = zzd2 - min2;
        if (zzysVar.zzf() != j3) {
            zzzrVar.zza = j3;
            return 1;
        }
        this.zzb.zzC(min2);
        zzysVar.zzj();
        ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min2, false);
        zzdy zzdyVar2 = this.zzb;
        int zzc2 = zzdyVar2.zzc();
        int zzd3 = zzdyVar2.zzd();
        int i2 = zzd3 - 188;
        while (true) {
            if (i2 < zzc2) {
                break;
            }
            byte[] zzH = zzdyVar2.zzH();
            int i3 = -4;
            int i4 = 0;
            while (true) {
                if (i3 > 4) {
                    break;
                }
                int i5 = (i3 * 188) + i2;
                if (i5 < zzc2 || i5 >= zzd3 || zzH[i5] != 71) {
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 5) {
                        long zzb3 = zzaho.zzb(zzdyVar2, i2, i);
                        if (zzb3 != -9223372036854775807L) {
                            j = zzb3;
                            break;
                        }
                    }
                }
                i3++;
            }
            i2--;
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}