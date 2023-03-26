package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgiv {
    public static int zza(byte[] bArr, int i, zzgiu zzgiuVar) throws zzglc {
        int zzj = zzj(bArr, i, zzgiuVar);
        int i2 = zzgiuVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzj) {
                if (i2 == 0) {
                    zzgiuVar.zzc = zzgji.zzb;
                    return zzj;
                }
                zzgiuVar.zzc = zzgji.zzw(bArr, zzj, i2);
                return zzj + i2;
            }
            throw zzglc.zzj();
        }
        throw zzglc.zzf();
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgmt zzgmtVar, byte[] bArr, int i, int i2, int i3, zzgiu zzgiuVar) throws IOException {
        zzgmd zzgmdVar = (zzgmd) zzgmtVar;
        Object zze = zzgmdVar.zze();
        int zzc = zzgmdVar.zzc(zze, bArr, i, i2, i3, zzgiuVar);
        zzgmdVar.zzf(zze);
        zzgiuVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzgmt zzgmtVar, byte[] bArr, int i, int i2, zzgiu zzgiuVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzgiuVar);
            i4 = zzgiuVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zze = zzgmtVar.zze();
            int i6 = i4 + i5;
            zzgmtVar.zzi(zze, bArr, i5, i6, zzgiuVar);
            zzgmtVar.zzf(zze);
            zzgiuVar.zzc = zze;
            return i6;
        }
        throw zzglc.zzj();
    }

    public static int zze(zzgmt zzgmtVar, int i, byte[] bArr, int i2, int i3, zzgkz zzgkzVar, zzgiu zzgiuVar) throws IOException {
        int zzd = zzd(zzgmtVar, bArr, i2, i3, zzgiuVar);
        zzgkzVar.add(zzgiuVar.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzgiuVar);
            if (i != zzgiuVar.zza) {
                break;
            }
            zzd = zzd(zzgmtVar, bArr, zzj, i3, zzgiuVar);
            zzgkzVar.add(zzgiuVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzgkz zzgkzVar, zzgiu zzgiuVar) throws IOException {
        zzgkr zzgkrVar = (zzgkr) zzgkzVar;
        int zzj = zzj(bArr, i, zzgiuVar);
        int i2 = zzgiuVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgiuVar);
            zzgkrVar.zzh(zzgiuVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzglc.zzj();
    }

    public static int zzg(byte[] bArr, int i, zzgiu zzgiuVar) throws zzglc {
        int zzj = zzj(bArr, i, zzgiuVar);
        int i2 = zzgiuVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgiuVar.zzc = "";
                return zzj;
            }
            zzgiuVar.zzc = new String(bArr, zzj, i2, zzgla.zzb);
            return zzj + i2;
        }
        throw zzglc.zzf();
    }

    public static int zzh(byte[] bArr, int i, zzgiu zzgiuVar) throws zzglc {
        int zzj = zzj(bArr, i, zzgiuVar);
        int i2 = zzgiuVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgiuVar.zzc = "";
                return zzj;
            }
            zzgiuVar.zzc = zzgnz.zzh(bArr, zzj, i2);
            return zzj + i2;
        }
        throw zzglc.zzf();
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzgnl zzgnlVar, zzgiu zzgiuVar) throws zzglc {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzm = zzm(bArr, i2, zzgiuVar);
                zzgnlVar.zzh(i, Long.valueOf(zzgiuVar.zzb));
                return zzm;
            } else if (i4 == 1) {
                zzgnlVar.zzh(i, Long.valueOf(zzn(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzj = zzj(bArr, i2, zzgiuVar);
                int i5 = zzgiuVar.zza;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - zzj) {
                        if (i5 == 0) {
                            zzgnlVar.zzh(i, zzgji.zzb);
                        } else {
                            zzgnlVar.zzh(i, zzgji.zzw(bArr, zzj, i5));
                        }
                        return zzj + i5;
                    }
                    throw zzglc.zzj();
                }
                throw zzglc.zzf();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzgnlVar.zzh(i, Integer.valueOf(zzb(bArr, i2)));
                    return i2 + 4;
                }
                throw zzglc.zzc();
            } else {
                int i6 = (i & (-8)) | 4;
                zzgnl zze = zzgnl.zze();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i2, zzgiuVar);
                    int i8 = zzgiuVar.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zzj2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzi(i8, bArr, zzj2, i3, zze, zzgiuVar);
                }
                if (i2 <= i3 && i7 == i6) {
                    zzgnlVar.zzh(i, zze);
                    return i2;
                }
                throw zzglc.zzg();
            }
        }
        throw zzglc.zzc();
    }

    public static int zzj(byte[] bArr, int i, zzgiu zzgiuVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzgiuVar.zza = b;
            return i2;
        }
        return zzk(b, bArr, i2, zzgiuVar);
    }

    public static int zzk(int i, byte[] bArr, int i2, zzgiu zzgiuVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgiuVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & g15.c) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgiuVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & g15.c) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgiuVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & g15.c) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgiuVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & g15.c) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgiuVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzgkz zzgkzVar, zzgiu zzgiuVar) {
        zzgkr zzgkrVar = (zzgkr) zzgkzVar;
        int zzj = zzj(bArr, i2, zzgiuVar);
        zzgkrVar.zzh(zzgiuVar.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzgiuVar);
            if (i != zzgiuVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgiuVar);
            zzgkrVar.zzh(zzgiuVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzgiu zzgiuVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzgiuVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & g15.c) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & g15.c) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzgiuVar.zzb = j2;
        return i3;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}