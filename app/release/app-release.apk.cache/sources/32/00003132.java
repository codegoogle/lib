package com.google.android.gms.internal.measurement;

import com.p7700g.p99005.ax5;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzmw {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zze(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & ax5.a) << 12) | ((b3 & ax5.a) << 6) | (b4 & ax5.a);
                cArr[i] = (char) ((i2 >>> 10) + ax5.d);
                cArr[i + 1] = (char) ((i2 & 1023) + ax5.e);
                return;
            }
        }
        throw zzkm.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zze(b2)) {
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
            if (!zze(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & ax5.a) << 6) | (b3 & ax5.a));
                return;
            }
        }
        throw zzkm.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !zze(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & ax5.a));
            return;
        }
        throw zzkm.zzc();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b > -65;
    }
}