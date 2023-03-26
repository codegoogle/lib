package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxz {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
        if (r11 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        if (r11 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r11 != 8) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzxy zza(zzdx zzdxVar) {
        int i;
        int i2;
        int zzc;
        int zzc2 = zzdxVar.zzc(16);
        int zzc3 = zzdxVar.zzc(16);
        if (zzc3 == 65535) {
            zzc3 = zzdxVar.zzc(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzc3 + i;
        if (zzc2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzc4 = zzdxVar.zzc(2);
        if (zzc4 == 3) {
            int i5 = 0;
            while (true) {
                zzc = zzdxVar.zzc(2) + i5;
                if (!zzdxVar.zzl()) {
                    break;
                }
                i5 = (zzc + 1) << 2;
            }
            zzc4 = zzc + 3;
        }
        int zzc5 = zzdxVar.zzc(10);
        if (zzdxVar.zzl() && zzdxVar.zzc(3) > 0) {
            zzdxVar.zzj(2);
        }
        int i6 = true != zzdxVar.zzl() ? 44100 : 48000;
        int zzc6 = zzdxVar.zzc(4);
        if (i6 == 44100 && zzc6 == 13) {
            i2 = zzb[13];
        } else if (i6 != 48000 || zzc6 >= 14) {
            i2 = 0;
        } else {
            int i7 = zzb[zzc6];
            int i8 = zzc5 % 5;
            if (i8 != 1) {
                if (i8 == 2) {
                    if (zzc6 != 8) {
                    }
                    i7++;
                    i2 = i7;
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        if (zzc6 != 3) {
                            if (zzc6 != 8) {
                            }
                        }
                        i7++;
                    }
                    i2 = i7;
                }
            }
            if (zzc6 != 3) {
            }
            i7++;
            i2 = i7;
        }
        return new zzxy(zzc4, 2, i6, i4, i2, null);
    }

    public static void zzb(int i, zzdy zzdyVar) {
        zzdyVar.zzC(7);
        byte[] zzH = zzdyVar.zzH();
        zzH[0] = -84;
        zzH[1] = 64;
        zzH[2] = -1;
        zzH[3] = -1;
        zzH[4] = (byte) ((i >> 16) & 255);
        zzH[5] = (byte) ((i >> 8) & 255);
        zzH[6] = (byte) (i & 255);
    }
}