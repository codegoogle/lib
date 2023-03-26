package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagv {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    public static long zzc(zzdy zzdyVar) {
        int zzc = zzdyVar.zzc();
        if (zzdyVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzdyVar.zzB(bArr, 0, 9);
        zzdyVar.zzF(zzc);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j = bArr[0];
            byte b = bArr[1];
            long j2 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzys zzysVar) {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
        this.zzc = true;
        zzysVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzysVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzysVar.zzf() != j2) {
                zzzrVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzysVar.zzj();
            ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
            zzdy zzdyVar = this.zzb;
            int zzc = zzdyVar.zzc();
            int zzd2 = zzdyVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzdyVar.zzH(), zzd2) == 442) {
                    zzdyVar.zzF(zzd2 + 4);
                    long zzc2 = zzc(zzdyVar);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzysVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzysVar);
                return 0;
            }
            long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb;
            if (zzb < 0) {
                this.zzh = -9223372036854775807L;
            }
            zzf(zzysVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zzysVar.zzd());
            if (zzysVar.zzf() != 0) {
                zzzrVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzysVar.zzj();
            ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdyVar2 = this.zzb;
            int zzc3 = zzdyVar2.zzc();
            int zzd3 = zzdyVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzdyVar2.zzH(), zzc3) == 442) {
                    zzdyVar2.zzF(zzc3 + 4);
                    long zzc4 = zzc(zzdyVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}