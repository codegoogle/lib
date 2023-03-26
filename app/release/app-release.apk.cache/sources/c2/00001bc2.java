package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaes {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzys zzysVar) throws IOException {
        return zzc(zzysVar, true, false);
    }

    public static boolean zzb(zzys zzysVar, boolean z) throws IOException {
        return zzc(zzysVar, false, false);
    }

    private static boolean zzc(zzys zzysVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long zzd = zzysVar.zzd();
        long j = -1;
        long j2 = PlaybackStateCompat.E;
        int i = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        if (i != 0 && zzd <= PlaybackStateCompat.E) {
            j2 = zzd;
        }
        int i2 = (int) j2;
        zzdy zzdyVar = new zzdy(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            zzdyVar.zzC(8);
            if (!zzysVar.zzm(zzdyVar.zzH(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long zzs = zzdyVar.zzs();
            int zze = zzdyVar.zze();
            int i4 = 16;
            if (zzs == 1) {
                zzysVar.zzh(zzdyVar.zzH(), 8, 8);
                zzdyVar.zzE(16);
                zzs = zzdyVar.zzr();
            } else {
                if (zzs == 0) {
                    long zzd2 = zzysVar.zzd();
                    if (zzd2 != j) {
                        zzs = (zzd2 - zzysVar.zze()) + 8;
                    }
                }
                i4 = 8;
            }
            long j3 = i4;
            if (zzs < j3) {
                return z4;
            }
            i3 += i4;
            if (zze == 1836019574) {
                i2 += (int) zzs;
                if (i != 0 && i2 > zzd) {
                    i2 = (int) zzd;
                }
                j = -1;
            } else if (zze == 1836019558 || zze == 1836475768) {
                z3 = true;
                break;
            } else {
                long j4 = zzd;
                if ((i3 + zzs) - j3 >= i2) {
                    break;
                }
                int i5 = (int) (zzs - j3);
                i3 += i5;
                if (zze == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    zzdyVar.zzC(i5);
                    zzysVar.zzh(zzdyVar.zzH(), 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 == 1) {
                            zzdyVar.zzG(4);
                        } else {
                            int zze2 = zzdyVar.zze();
                            if ((zze2 >>> 8) != 3368816) {
                                if (zze2 == 1751476579) {
                                    zze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i8 = 0; i8 < 29; i8++) {
                                    if (iArr[i8] != zze2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i5 != 0) {
                    zzysVar.zzg(i5);
                }
                zzd = j4;
                j = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}