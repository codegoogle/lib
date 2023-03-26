package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzo {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzcw.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zze(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zze(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zze(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        zze(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
            return i2;
        }
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzd[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    public static zzzm zzc(byte[] bArr, int i, int i2) {
        zzzq zzzqVar = new zzzq(bArr, 4, i2);
        int zzc2 = zzzqVar.zzc();
        int zzc3 = zzzqVar.zzc();
        zzzqVar.zzd();
        return new zzzm(zzc2, zzc3, zzzqVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzzn zzd(byte[] bArr, int i, int i2) {
        int zzc2;
        int i3;
        boolean z;
        boolean z2;
        int zzc3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean zzf;
        float f;
        int zza2;
        zzzq zzzqVar = new zzzq(bArr, i, i2);
        int zza3 = zzzqVar.zza(8);
        int zza4 = zzzqVar.zza(8);
        int zza5 = zzzqVar.zza(8);
        int zzc4 = zzzqVar.zzc();
        if (zza3 != 100 && zza3 != 110 && zza3 != 122 && zza3 != 244 && zza3 != 44 && zza3 != 83 && zza3 != 86 && zza3 != 118 && zza3 != 128) {
            if (zza3 != 138) {
                zzc2 = 1;
                z2 = false;
                int zzc5 = zzzqVar.zzc() + 4;
                zzc3 = zzzqVar.zzc();
                if (zzc3 != 0) {
                    i4 = zza3;
                    i5 = zza4;
                    i6 = zzc3;
                    i7 = zzzqVar.zzc() + 4;
                } else if (zzc3 == 1) {
                    boolean zzf2 = zzzqVar.zzf();
                    zzzqVar.zzb();
                    zzzqVar.zzb();
                    i4 = zza3;
                    long zzc6 = zzzqVar.zzc();
                    i5 = zza4;
                    for (int i8 = 0; i8 < zzc6; i8++) {
                        zzzqVar.zzc();
                    }
                    z3 = zzf2;
                    i6 = 1;
                    i7 = 0;
                    int zzc7 = zzzqVar.zzc();
                    zzzqVar.zzd();
                    int zzc8 = zzzqVar.zzc() + 1;
                    int zzc9 = zzzqVar.zzc();
                    zzf = zzzqVar.zzf();
                    int i9 = 2 - (zzf ? 1 : 0);
                    int i10 = (zzc9 + 1) * i9;
                    if (!zzf) {
                        zzzqVar.zzd();
                    }
                    zzzqVar.zzd();
                    int i11 = zzc8 * 16;
                    int i12 = i10 * 16;
                    if (zzzqVar.zzf()) {
                        int zzc10 = zzzqVar.zzc();
                        int zzc11 = zzzqVar.zzc();
                        int zzc12 = zzzqVar.zzc();
                        int zzc13 = zzzqVar.zzc();
                        if (zzc2 != 0) {
                            int i13 = zzc2 == 3 ? 1 : 2;
                            i9 *= zzc2 == 1 ? 2 : 1;
                            r10 = i13;
                        }
                        i11 -= (zzc10 + zzc11) * r10;
                        i12 -= (zzc12 + zzc13) * i9;
                    }
                    int i14 = i11;
                    int i15 = i12;
                    if (zzzqVar.zzf() && zzzqVar.zzf()) {
                        zza2 = zzzqVar.zza(8);
                        if (zza2 != 255) {
                            int zza6 = zzzqVar.zza(16);
                            int zza7 = zzzqVar.zza(16);
                            if (zza6 != 0 && zza7 != 0) {
                                f = zza6 / zza7;
                            }
                        } else if (zza2 < 17) {
                            f = zzb[zza2];
                        }
                        return new zzzn(i4, i5, zza5, zzc4, zzc7, i14, i15, f, z2, zzf, zzc5, i6, i7, z3);
                    }
                    f = 1.0f;
                    return new zzzn(i4, i5, zza5, zzc4, zzc7, i14, i15, f, z2, zzf, zzc5, i6, i7, z3);
                } else {
                    i4 = zza3;
                    i5 = zza4;
                    i6 = zzc3;
                    i7 = 0;
                }
                z3 = false;
                int zzc72 = zzzqVar.zzc();
                zzzqVar.zzd();
                int zzc82 = zzzqVar.zzc() + 1;
                int zzc92 = zzzqVar.zzc();
                zzf = zzzqVar.zzf();
                int i92 = 2 - (zzf ? 1 : 0);
                int i102 = (zzc92 + 1) * i92;
                if (!zzf) {
                }
                zzzqVar.zzd();
                int i112 = zzc82 * 16;
                int i122 = i102 * 16;
                if (zzzqVar.zzf()) {
                }
                int i142 = i112;
                int i152 = i122;
                if (zzzqVar.zzf()) {
                    zza2 = zzzqVar.zza(8);
                    if (zza2 != 255) {
                    }
                    return new zzzn(i4, i5, zza5, zzc4, zzc72, i142, i152, f, z2, zzf, zzc5, i6, i7, z3);
                }
                f = 1.0f;
                return new zzzn(i4, i5, zza5, zzc4, zzc72, i142, i152, f, z2, zzf, zzc5, i6, i7, z3);
            }
            zza3 = WKSRecord.Service.NETBIOS_DGM;
        }
        zzc2 = zzzqVar.zzc();
        if (zzc2 == 3) {
            z = zzzqVar.zzf();
            i3 = 3;
        } else {
            i3 = zzc2;
            z = false;
        }
        zzzqVar.zzc();
        zzzqVar.zzc();
        zzzqVar.zzd();
        if (zzzqVar.zzf()) {
            int i16 = i3 != 3 ? 8 : 12;
            int i17 = 0;
            while (i17 < i16) {
                if (zzzqVar.zzf()) {
                    int i18 = i17 < 6 ? 16 : 64;
                    int i19 = 8;
                    int i20 = 8;
                    for (int i21 = 0; i21 < i18; i21++) {
                        if (i19 != 0) {
                            i19 = ((zzzqVar.zzb() + i20) + 256) % 256;
                        }
                        if (i19 != 0) {
                            i20 = i19;
                        }
                    }
                }
                i17++;
            }
        }
        z2 = z;
        int zzc52 = zzzqVar.zzc() + 4;
        zzc3 = zzzqVar.zzc();
        if (zzc3 != 0) {
        }
        z3 = false;
        int zzc722 = zzzqVar.zzc();
        zzzqVar.zzd();
        int zzc822 = zzzqVar.zzc() + 1;
        int zzc922 = zzzqVar.zzc();
        zzf = zzzqVar.zzf();
        int i922 = 2 - (zzf ? 1 : 0);
        int i1022 = (zzc922 + 1) * i922;
        if (!zzf) {
        }
        zzzqVar.zzd();
        int i1122 = zzc822 * 16;
        int i1222 = i1022 * 16;
        if (zzzqVar.zzf()) {
        }
        int i1422 = i1122;
        int i1522 = i1222;
        if (zzzqVar.zzf()) {
        }
        f = 1.0f;
        return new zzzn(i4, i5, zza5, zzc4, zzc722, i1422, i1522, f, z2, zzf, zzc52, i6, i7, z3);
    }

    public static void zze(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}