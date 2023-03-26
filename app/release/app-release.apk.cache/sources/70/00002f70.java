package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.l;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.yg1;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxw {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, yg1.K, 224, 256, 320, 384, l.a.a, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, WKSRecord.Service.NETBIOS_SSN, 174, 208, WKSRecord.Service.SUR_MEAS, a.aS, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & ax5.a);
    }

    public static zzad zzc(zzdy zzdyVar, String str, String str2, @z1 zzv zzvVar) {
        int i = zzc[(zzdyVar.zzk() & yg1.K) >> 6];
        int zzk = zzdyVar.zzk();
        int i2 = zze[(zzk & 56) >> 3];
        if ((zzk & 4) != 0) {
            i2++;
        }
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS("audio/ac3");
        zzabVar.zzw(i2);
        zzabVar.zzT(i);
        zzabVar.zzB(zzvVar);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }

    public static zzad zzd(zzdy zzdyVar, String str, String str2, @z1 zzv zzvVar) {
        zzdyVar.zzG(2);
        int i = zzc[(zzdyVar.zzk() & yg1.K) >> 6];
        int zzk = zzdyVar.zzk();
        int i2 = zze[(zzk & 14) >> 1];
        if ((zzk & 1) != 0) {
            i2++;
        }
        if (((zzdyVar.zzk() & 30) >> 1) > 0 && (2 & zzdyVar.zzk()) != 0) {
            i2 += 2;
        }
        String str3 = (zzdyVar.zza() <= 0 || (zzdyVar.zzk() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS(str3);
        zzabVar.zzw(i2);
        zzabVar.zzT(i);
        zzabVar.zzB(zzvVar);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }

    public static zzxv zze(zzdx zzdxVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int zzc2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzb2 = zzdxVar.zzb();
        zzdxVar.zzj(40);
        int zzc3 = zzdxVar.zzc(5);
        zzdxVar.zzh(zzb2);
        int i11 = -1;
        if (zzc3 > 10) {
            zzdxVar.zzj(16);
            int zzc4 = zzdxVar.zzc(2);
            if (zzc4 == 0) {
                i11 = 0;
            } else if (zzc4 == 1) {
                i11 = 1;
            } else if (zzc4 == 2) {
                i11 = 2;
            }
            zzdxVar.zzj(3);
            int zzc5 = zzdxVar.zzc(11) + 1;
            int i12 = zzc5 + zzc5;
            int zzc6 = zzdxVar.zzc(2);
            if (zzc6 == 3) {
                i7 = zzd[zzdxVar.zzc(2)];
                zzc2 = 3;
                i6 = 6;
            } else {
                zzc2 = zzdxVar.zzc(2);
                i6 = zzb[zzc2];
                i7 = zzc[zzc6];
            }
            int i13 = i6 * 256;
            int zzc7 = zzdxVar.zzc(3);
            boolean zzl = zzdxVar.zzl();
            int i14 = zze[zzc7] + (zzl ? 1 : 0);
            zzdxVar.zzj(10);
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(8);
            }
            if (zzc7 == 0) {
                zzdxVar.zzj(5);
                if (zzdxVar.zzl()) {
                    zzdxVar.zzj(8);
                }
                i8 = 0;
                zzc7 = 0;
            } else {
                i8 = zzc7;
            }
            if (i11 == 1) {
                if (zzdxVar.zzl()) {
                    zzdxVar.zzj(16);
                }
                i9 = 1;
            } else {
                i9 = i11;
            }
            if (zzdxVar.zzl()) {
                if (i8 > 2) {
                    zzdxVar.zzj(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    zzdxVar.zzj(6);
                }
                if ((i8 & 4) != 0) {
                    zzdxVar.zzj(6);
                }
                if (zzl && zzdxVar.zzl()) {
                    zzdxVar.zzj(5);
                }
                if (i9 == 0) {
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    if (i8 == 0 && zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    int zzc8 = zzdxVar.zzc(2);
                    if (zzc8 == 1) {
                        zzdxVar.zzj(5);
                    } else if (zzc8 == 2) {
                        zzdxVar.zzj(12);
                    } else if (zzc8 == 3) {
                        int zzc9 = zzdxVar.zzc(5);
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(5);
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(4);
                                }
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(4);
                                }
                            }
                        }
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(5);
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(7);
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(8);
                                    zzdxVar.zzj((zzc9 + 2) * 8);
                                    zzdxVar.zzd();
                                }
                            }
                        }
                        zzdxVar.zzj((zzc9 + 2) * 8);
                        zzdxVar.zzd();
                    }
                    if (i8 < 2) {
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(14);
                        }
                        if (zzc7 == 0 && zzdxVar.zzl()) {
                            zzdxVar.zzj(14);
                        }
                    }
                    if (zzdxVar.zzl()) {
                        if (zzc2 == 0) {
                            zzdxVar.zzj(5);
                            i9 = 0;
                            zzc2 = 0;
                        } else {
                            for (int i15 = 0; i15 < i6; i15++) {
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(5);
                                }
                            }
                        }
                    }
                    i9 = 0;
                }
            }
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(5);
                if (i8 == 2) {
                    zzdxVar.zzj(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    zzdxVar.zzj(2);
                }
                if (zzdxVar.zzl()) {
                    i10 = 8;
                    zzdxVar.zzj(8);
                } else {
                    i10 = 8;
                }
                if (i8 == 0 && zzdxVar.zzl()) {
                    zzdxVar.zzj(i10);
                }
                if (zzc6 < 3) {
                    zzdxVar.zzi();
                }
            }
            if (i9 == 0 && zzc2 != 3) {
                zzdxVar.zzi();
            }
            if (i9 == 2 && (zzc2 == 3 || zzdxVar.zzl())) {
                zzdxVar.zzj(6);
            }
            str = (zzdxVar.zzl() && zzdxVar.zzc(6) == 1 && zzdxVar.zzc(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
            i = i12;
            i5 = i13;
            i2 = i7;
            i3 = i14;
        } else {
            zzdxVar.zzj(32);
            int zzc10 = zzdxVar.zzc(2);
            String str2 = zzc10 == 3 ? null : "audio/ac3";
            int zzf2 = zzf(zzc10, zzdxVar.zzc(6));
            zzdxVar.zzj(8);
            int zzc11 = zzdxVar.zzc(3);
            if ((zzc11 & 1) != 0 && zzc11 != 1) {
                zzdxVar.zzj(2);
            }
            if ((zzc11 & 4) != 0) {
                zzdxVar.zzj(2);
            }
            if (zzc11 == 2) {
                zzdxVar.zzj(2);
            }
            str = str2;
            i = zzf2;
            i2 = zzc10 < 3 ? zzc[zzc10] : -1;
            i3 = zze[zzc11] + (zzdxVar.zzl() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new zzxv(str, i4, i3, i2, i, i5, null);
    }

    private static int zzf(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}