package com.google.android.gms.internal.ads;

import com.p7700g.p99005.yg1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzza {
    public static int zza(zzdy zzdyVar, int i) {
        switch (i) {
            case 1:
                return yg1.K;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdyVar.zzk() + 1;
            case 7:
                return zzdyVar.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzys zzysVar, zzze zzzeVar) throws IOException {
        zzysVar.zzj();
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzylVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        zzylVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzdy zzdyVar = new zzdy(i2);
        zzdyVar.zzE(zzyv.zza(zzysVar, zzdyVar.zzH(), 0, i2));
        zzysVar.zzj();
        zzyz zzyzVar = new zzyz();
        if (zzd(zzdyVar, zzzeVar, 1 == i, zzyzVar)) {
            return zzyzVar.zza;
        }
        throw zzbp.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r7 != r18.zzf) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if ((r17.zzk() * 1000) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        if (r4 == r3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzc(zzdy zzdyVar, zzze zzzeVar, int i, zzyz zzyzVar) {
        int zza;
        int zzc = zzdyVar.zzc();
        long zzs = zzdyVar.zzs();
        long j = zzs >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((zzs >> 12) & 15);
        int i3 = (int) ((zzs >> 8) & 15);
        int i4 = (int) (15 & (zzs >> 4));
        int i5 = (int) ((zzs >> 1) & 7);
        long j2 = zzs & 1;
        if (i4 > 7 ? !(i4 > 10 || zzzeVar.zzg != 2) : i4 == zzzeVar.zzg - 1) {
            if ((i5 == 0 || i5 == zzzeVar.zzi) && j2 != 1 && zzd(zzdyVar, zzzeVar, z, zzyzVar) && (zza = zza(zzdyVar, i2)) != -1 && zza <= zzzeVar.zzb) {
                int i6 = zzzeVar.zze;
                if (i3 != 0) {
                    if (i3 > 11) {
                        if (i3 != 12) {
                            if (i3 <= 14) {
                                int zzo = zzdyVar.zzo();
                                if (i3 == 14) {
                                    zzo *= 10;
                                }
                            }
                        }
                    }
                }
                if (zzdyVar.zzk() == zzeg.zzh(zzdyVar.zzH(), zzc, zzdyVar.zzc() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzdy zzdyVar, zzze zzzeVar, boolean z, zzyz zzyzVar) {
        try {
            long zzu = zzdyVar.zzu();
            if (!z) {
                zzu *= zzzeVar.zzb;
            }
            zzyzVar.zza = zzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}