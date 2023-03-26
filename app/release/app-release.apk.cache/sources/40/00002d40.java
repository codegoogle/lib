package com.google.android.gms.internal.ads;

import com.p7700g.p99005.ax5;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgnv {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zzg(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zzg(b3) && !zzg(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & ax5.a) << 12) | ((b3 & ax5.a) << 6) | (b4 & ax5.a);
                cArr[i] = (char) ((i2 >>> 10) + ax5.d);
                cArr[i + 1] = (char) ((i2 & 1023) + ax5.e);
                return;
            }
        }
        throw zzglc.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zzg(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zzg(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & ax5.a) << 6) | (b3 & ax5.a));
                return;
            }
        }
        throw zzglc.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !zzg(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & ax5.a));
            return;
        }
        throw zzglc.zzd();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b) {
        return b < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b) {
        return b < -32;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}