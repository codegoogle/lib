package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaho {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzdy zzdyVar, int i, int i2) {
        zzdyVar.zzF(i);
        if (zzdyVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzdyVar.zze();
        if ((8388608 & zze) == 0 && ((zze >> 8) & 8191) == i2 && (zze & 32) != 0 && zzdyVar.zzk() >= 7 && zzdyVar.zza() >= 7 && (zzdyVar.zzk() & 16) == 16) {
            byte[] bArr = new byte[6];
            zzdyVar.zzB(bArr, 0, 6);
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            long j = bArr[3] & 255;
            return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}