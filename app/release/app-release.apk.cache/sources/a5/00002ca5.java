package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgib {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[1] * jArr3[0]) + (jArr2[0] * jArr3[1]);
        long j = jArr2[1];
        jArr[2] = (jArr2[2] * jArr3[0]) + (jArr2[0] * jArr3[2]) + ((j + j) * jArr3[1]);
        jArr[3] = (jArr2[3] * jArr3[0]) + (jArr2[0] * jArr3[3]) + (jArr2[2] * jArr3[1]) + (jArr2[1] * jArr3[2]);
        long j2 = jArr2[2];
        long j3 = jArr3[2];
        long j4 = (jArr2[3] * jArr3[1]) + (jArr2[1] * jArr3[3]);
        jArr[4] = (jArr2[4] * jArr3[0]) + (jArr2[0] * jArr3[4]) + j4 + j4 + (j2 * j3);
        jArr[5] = (jArr2[5] * jArr3[0]) + (jArr2[0] * jArr3[5]) + (jArr2[4] * jArr3[1]) + (jArr2[1] * jArr3[4]) + (jArr2[3] * jArr3[2]) + (jArr2[2] * jArr3[3]);
        long j5 = (jArr2[5] * jArr3[1]) + (jArr2[1] * jArr3[5]) + (jArr2[3] * jArr3[3]);
        jArr[6] = (jArr2[6] * jArr3[0]) + (jArr2[0] * jArr3[6]) + (jArr2[4] * jArr3[2]) + (jArr2[2] * jArr3[4]) + j5 + j5;
        jArr[7] = (jArr2[7] * jArr3[0]) + (jArr2[0] * jArr3[7]) + (jArr2[6] * jArr3[1]) + (jArr2[1] * jArr3[6]) + (jArr2[5] * jArr3[2]) + (jArr2[2] * jArr3[5]) + (jArr2[4] * jArr3[3]) + (jArr2[3] * jArr3[4]);
        long j6 = jArr2[4];
        long j7 = jArr3[4];
        long j8 = (jArr2[7] * jArr3[1]) + (jArr2[1] * jArr3[7]) + (jArr2[5] * jArr3[3]) + (jArr2[3] * jArr3[5]);
        long j9 = j8 + j8 + (j6 * j7);
        jArr[8] = (jArr2[8] * jArr3[0]) + (jArr2[0] * jArr3[8]) + (jArr2[6] * jArr3[2]) + (jArr2[2] * jArr3[6]) + j9;
        jArr[9] = (jArr2[9] * jArr3[0]) + (jArr2[0] * jArr3[9]) + (jArr2[8] * jArr3[1]) + (jArr2[1] * jArr3[8]) + (jArr2[7] * jArr3[2]) + (jArr2[2] * jArr3[7]) + (jArr2[6] * jArr3[3]) + (jArr2[3] * jArr3[6]) + (jArr2[5] * jArr3[4]) + (jArr2[4] * jArr3[5]);
        long j10 = (jArr2[9] * jArr3[1]) + (jArr2[1] * jArr3[9]) + (jArr2[7] * jArr3[3]) + (jArr2[3] * jArr3[7]) + (jArr2[5] * jArr3[5]);
        jArr[10] = (jArr2[8] * jArr3[2]) + (jArr2[2] * jArr3[8]) + (jArr2[6] * jArr3[4]) + (jArr2[4] * jArr3[6]) + j10 + j10;
        jArr[11] = (jArr2[9] * jArr3[2]) + (jArr2[2] * jArr3[9]) + (jArr2[8] * jArr3[3]) + (jArr2[3] * jArr3[8]) + (jArr2[7] * jArr3[4]) + (jArr2[4] * jArr3[7]) + (jArr2[6] * jArr3[5]) + (jArr2[5] * jArr3[6]);
        long j11 = jArr2[6];
        long j12 = jArr3[6];
        long j13 = (jArr2[9] * jArr3[3]) + (jArr2[3] * jArr3[9]) + (jArr2[7] * jArr3[5]) + (jArr2[5] * jArr3[7]);
        long j14 = j13 + j13 + (j11 * j12);
        jArr[12] = (jArr2[8] * jArr3[4]) + (jArr2[4] * jArr3[8]) + j14;
        jArr[13] = (jArr2[9] * jArr3[4]) + (jArr2[4] * jArr3[9]) + (jArr2[8] * jArr3[5]) + (jArr2[5] * jArr3[8]) + (jArr2[7] * jArr3[6]) + (jArr2[6] * jArr3[7]);
        long j15 = (jArr2[9] * jArr3[5]) + (jArr2[5] * jArr3[9]) + (jArr2[7] * jArr3[7]);
        jArr[14] = (jArr2[8] * jArr3[6]) + (jArr2[6] * jArr3[8]) + j15 + j15;
        jArr[15] = (jArr2[9] * jArr3[6]) + (jArr2[6] * jArr3[9]) + (jArr2[8] * jArr3[7]) + (jArr2[7] * jArr3[8]);
        long j16 = jArr2[8] * jArr3[8];
        long j17 = (jArr2[9] * jArr3[7]) + (jArr2[7] * jArr3[9]);
        jArr[16] = j17 + j17 + j16;
        jArr[17] = (jArr2[9] * jArr3[8]) + (jArr2[8] * jArr3[9]);
        long j18 = jArr2[9];
        jArr[18] = (j18 + j18) * jArr3[9];
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j5;
        long j6 = jArr[10];
        long j7 = j6 + j6 + j5;
        jArr[0] = j7;
        jArr[0] = j7 + jArr[10];
        jArr[10] = 0;
        long j8 = jArr[0];
        long j9 = j8 / 67108864;
        jArr[0] = j8 - (j9 << 26);
        jArr[1] = jArr[1] + j9;
    }

    public static void zze(long[] jArr) {
        long j = jArr[8] + (jArr[18] << 4);
        jArr[8] = j;
        long j2 = jArr[18];
        long j3 = j2 + j2 + j;
        jArr[8] = j3;
        jArr[8] = j3 + jArr[18];
        long j4 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j4;
        long j5 = jArr[17];
        long j6 = j5 + j5 + j4;
        jArr[7] = j6;
        jArr[7] = j6 + jArr[17];
        long j7 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j7;
        long j8 = jArr[16];
        long j9 = j8 + j8 + j7;
        jArr[6] = j9;
        jArr[6] = j9 + jArr[16];
        long j10 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j10;
        long j11 = jArr[15];
        long j12 = j11 + j11 + j10;
        jArr[5] = j12;
        jArr[5] = j12 + jArr[15];
        long j13 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j13;
        long j14 = jArr[14];
        long j15 = j14 + j14 + j13;
        jArr[4] = j15;
        jArr[4] = j15 + jArr[14];
        long j16 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j16;
        long j17 = jArr[13];
        long j18 = j17 + j17 + j16;
        jArr[3] = j18;
        jArr[3] = j18 + jArr[13];
        long j19 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j19;
        long j20 = jArr[12];
        long j21 = j20 + j20 + j19;
        jArr[2] = j21;
        jArr[2] = j21 + jArr[12];
        long j22 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j22;
        long j23 = jArr[11];
        long j24 = j23 + j23 + j22;
        jArr[1] = j24;
        jArr[1] = j24 + jArr[11];
        long j25 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j25;
        long j26 = jArr[10];
        long j27 = j26 + j26 + j25;
        jArr[0] = j27;
        jArr[0] = j27 + jArr[10];
    }

    public static void zzf(long[] jArr, long[] jArr2, long j) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = (jArr2[0] * jArr2[2]) + (j3 * j3);
        long j5 = (jArr2[0] * jArr2[3]) + (jArr2[1] * jArr2[2]);
        long j6 = jArr2[2];
        long j7 = jArr2[1];
        long j8 = jArr2[3];
        long j9 = jArr2[0];
        long j10 = j7 * 4 * j8;
        long j11 = (j9 + j9) * jArr2[4];
        long j12 = (jArr2[0] * jArr2[5]) + (jArr2[1] * jArr2[4]) + (jArr2[2] * jArr2[3]);
        long j13 = jArr2[3];
        long j14 = jArr2[2];
        long j15 = jArr2[4];
        long j16 = jArr2[0];
        long j17 = jArr2[6];
        long j18 = jArr2[1];
        long j19 = (j18 + j18) * jArr2[5];
        long j20 = j19 + (j16 * j17) + (j14 * j15) + (j13 * j13);
        long j21 = (jArr2[0] * jArr2[7]) + (jArr2[1] * jArr2[6]) + (jArr2[2] * jArr2[5]) + (jArr2[3] * jArr2[4]);
        long j22 = jArr2[4];
        long j23 = jArr2[2];
        long j24 = jArr2[6];
        long j25 = jArr2[0];
        long j26 = jArr2[8];
        long j27 = (jArr2[3] * jArr2[5]) + (jArr2[1] * jArr2[7]);
        long j28 = j27 + j27 + (j25 * j26) + (j23 * j24);
        long j29 = j28 + j28;
        long j30 = (jArr2[0] * jArr2[9]) + (jArr2[1] * jArr2[8]) + (jArr2[2] * jArr2[7]) + (jArr2[3] * jArr2[6]) + (jArr2[4] * jArr2[5]);
        long j31 = jArr2[5];
        long j32 = jArr2[4];
        long j33 = jArr2[6];
        long j34 = jArr2[2];
        long j35 = jArr2[8];
        long j36 = (jArr2[1] * jArr2[9]) + (jArr2[3] * jArr2[7]);
        long j37 = j36 + j36;
        long j38 = j37 + (j34 * j35) + (j32 * j33) + (j31 * j31);
        long j39 = (jArr2[2] * jArr2[9]) + (jArr2[3] * jArr2[8]) + (jArr2[4] * jArr2[7]) + (jArr2[5] * jArr2[6]);
        long j40 = jArr2[6];
        long j41 = jArr2[4];
        long j42 = jArr2[8];
        long j43 = (jArr2[3] * jArr2[9]) + (jArr2[5] * jArr2[7]);
        long j44 = j43 + j43 + (j41 * j42);
        long j45 = (jArr2[4] * jArr2[9]) + (jArr2[5] * jArr2[8]) + (jArr2[6] * jArr2[7]);
        long j46 = jArr2[7];
        long j47 = jArr2[6];
        long j48 = jArr2[8];
        long j49 = jArr2[5];
        long j50 = ((j49 + j49) * jArr2[9]) + (j47 * j48) + (j46 * j46);
        long j51 = (jArr2[6] * jArr2[9]) + (jArr2[7] * jArr2[8]);
        long j52 = jArr2[8];
        long j53 = jArr2[7] * 4 * jArr2[9];
        long j54 = jArr2[8];
        long j55 = jArr2[9];
        zzc(new long[]{j * j, (j2 + j2) * jArr2[1], j4 + j4, j5 + j5, j11 + j10 + (j6 * j6), j12 + j12, j20 + j20, j21 + j21, j29 + (j22 * j22), j30 + j30, j38 + j38, j39 + j39, j44 + j44 + (j40 * j40), j45 + j45, j50 + j50, j51 + j51, j53 + (j52 * j52), (j54 + j54) * jArr2[9], (j55 + j55) * j55}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 9) {
                long j3 = copyOf[i9];
                copyOf[i9] = j3 + (i7 << i6);
                i9++;
                copyOf[i9] = copyOf[i9] - (-((int) (((j3 >> 31) & j3) >> zzd[i9 & 1])));
            }
            long j4 = copyOf[9];
            int i10 = -((int) (((j4 >> 31) & j4) >> 25));
            copyOf[9] = j4 + (i10 << 25);
            copyOf[0] = copyOf[0] - (i10 * 19);
        }
        long j5 = copyOf[0];
        copyOf[0] = j5 + (i << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j5 >> 31) & j5) >> 26)));
        for (int i11 = 0; i11 < 2; i11++) {
            int i12 = 0;
            while (i12 < 9) {
                long j6 = copyOf[i12];
                int i13 = zzd[i12 & 1];
                copyOf[i12] = zzc[i5] & j6;
                i12++;
                copyOf[i12] = copyOf[i12] + ((int) (j6 >> i13));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (j >> 25)) * 19);
        int i14 = ~((((int) j2) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) copyOf[i15]) ^ zzc[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 + i20)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i14);
        long j7 = 33554431 & i14;
        copyOf[1] = copyOf[1] - j7;
        for (int i21 = 2; i21 < 10; i21 += 2) {
            copyOf[i21] = copyOf[i21] - (67108863 & i14);
            int i22 = i21 + 1;
            copyOf[i22] = copyOf[i22] - j7;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            copyOf[i23] = copyOf[i23] << zzb[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int[] iArr = zza;
            int i25 = iArr[i24];
            byte b = bArr[i25];
            long j8 = copyOf[i24];
            bArr[i25] = (byte) (b | (j8 & 255));
            bArr[iArr[i24] + 1] = (byte) (bArr[i2] | ((j8 >> 8) & 255));
            bArr[iArr[i24] + 2] = (byte) (bArr[i3] | ((j8 >> 16) & 255));
            bArr[iArr[i24] + 3] = (byte) (bArr[i4] | ((j8 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = zza[i];
            jArr[i] = (((((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8)) | ((bArr[i2 + 2] & 255) << 16)) | ((bArr[i2 + 3] & 255) << 24)) >> zzb[i]) & zzc[i & 1];
        }
        return jArr;
    }
}