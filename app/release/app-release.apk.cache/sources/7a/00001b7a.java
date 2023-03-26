package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaca {
    public static final zzaby zza = zzabx.zza;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if ((r6 & 64) != 0) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzbl zza(byte[] bArr, int i, zzaby zzabyVar, zzabb zzabbVar) {
        zzabz zzabzVar;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int unused;
        ArrayList arrayList = new ArrayList();
        zzdy zzdyVar = new zzdy(bArr, i);
        boolean z2 = false;
        if (zzdyVar.zza() >= 10) {
            int zzm = zzdyVar.zzm();
            if (zzm == 4801587) {
                int zzk = zzdyVar.zzk();
                zzdyVar.zzG(1);
                int zzk2 = zzdyVar.zzk();
                int zzj = zzdyVar.zzj();
                if (zzk != 2) {
                    if (zzk == 3) {
                        if ((zzk2 & 64) != 0) {
                            int zze = zzdyVar.zze();
                            zzdyVar.zzG(zze);
                            zzj -= zze + 4;
                        }
                    } else if (zzk == 4) {
                        if ((zzk2 & 64) != 0) {
                            int zzj2 = zzdyVar.zzj();
                            zzdyVar.zzG(zzj2 - 4);
                            zzj -= zzj2;
                        }
                        if ((zzk2 & 16) != 0) {
                            zzj -= 10;
                        }
                    }
                    zzabzVar = new zzabz(zzk, zzk < 4 && (zzk2 & 128) != 0, zzj);
                }
                if (zzabzVar != null) {
                    return null;
                }
                int zzc = zzdyVar.zzc();
                i2 = zzabzVar.zza;
                int i8 = i2 == 2 ? 6 : 10;
                i3 = zzabzVar.zzc;
                z = zzabzVar.zzb;
                if (z) {
                    i7 = zzabzVar.zzc;
                    i3 = zze(zzdyVar, i7);
                }
                zzdyVar.zzE(zzc + i3);
                i4 = zzabzVar.zza;
                if (!zzj(zzdyVar, i4, i8, false)) {
                    i6 = zzabzVar.zza;
                    if (i6 != 4 || !zzj(zzdyVar, 4, i8, true)) {
                        unused = zzabzVar.zza;
                        return null;
                    }
                    z2 = true;
                }
                while (zzdyVar.zza() >= i8) {
                    i5 = zzabzVar.zza;
                    zzacb zzf = zzf(i5, zzdyVar, z2, i8, zzabyVar);
                    if (zzf != null) {
                        arrayList.add(zzf);
                    }
                }
                return new zzbl(arrayList);
            }
            "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(zzm))));
        }
        zzabzVar = null;
        if (zzabzVar != null) {
        }
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzdy zzdyVar, int i) {
        byte[] zzH = zzdyVar.zzH();
        int zzc = zzdyVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzH[i2] & 255) == 255 && zzH[i3] == 0) {
                System.arraycopy(zzH, i2 + 2, zzH, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0261, code lost:
        if (r9 == 67) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04fa A[Catch: all -> 0x0500, UnsupportedEncodingException -> 0x0504, TRY_LEAVE, TryCatch #4 {UnsupportedEncodingException -> 0x0504, all -> 0x0500, blocks: (B:223:0x04fa, B:150:0x02c4, B:162:0x02f1, B:170:0x033b, B:173:0x036e, B:176:0x037f, B:177:0x0387, B:179:0x038d, B:181:0x0394, B:182:0x0398, B:189:0x03ba, B:193:0x03e5, B:195:0x03ef, B:196:0x0424, B:197:0x0432, B:199:0x0438, B:201:0x043f, B:202:0x0443, B:206:0x0458, B:215:0x0486, B:217:0x04c1, B:218:0x04d0, B:221:0x04e8), top: B:239:0x00f1 }] */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzacb zzf(int i, zzdy zzdyVar, boolean z, int i2, @z1 zzaby zzabyVar) {
        int zzm;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        zzacb zzabqVar;
        int zzd;
        String zza2;
        zzacb zzachVar;
        int zzk = zzdyVar.zzk();
        int zzk2 = zzdyVar.zzk();
        int zzk3 = zzdyVar.zzk();
        int zzk4 = i >= 3 ? zzdyVar.zzk() : 0;
        if (i == 4) {
            zzm = zzdyVar.zzn();
            if (!z) {
                zzm = ((zzm >> 24) << 21) | (zzm & 255) | (((zzm >> 8) & 255) << 7) | (((zzm >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            zzm = zzdyVar.zzn();
        } else {
            zzm = zzdyVar.zzm();
        }
        int zzo = i >= 3 ? zzdyVar.zzo() : 0;
        zzacb zzacbVar = null;
        if (zzk == 0 && zzk2 == 0 && zzk3 == 0 && zzk4 == 0 && zzm == 0 && zzo == 0) {
            zzdyVar.zzF(zzdyVar.zzd());
            return null;
        }
        int zzc = zzdyVar.zzc() + zzm;
        if (zzc > zzdyVar.zzd()) {
            zzdyVar.zzF(zzdyVar.zzd());
            return null;
        } else if (zzabyVar == null) {
            if (i == 3) {
                i3 = (zzo & 128) != 0 ? 1 : 0;
                z3 = (zzo & 64) != 0;
                z4 = false;
                z2 = (zzo & 32) != 0;
                i4 = i3;
            } else if (i == 4) {
                boolean z6 = (zzo & 64) != 0;
                int i12 = (zzo & 8) != 0 ? 1 : 0;
                z3 = (zzo & 4) != 0;
                z4 = (zzo & 2) != 0;
                i4 = zzo & 1;
                int i13 = i12;
                z2 = z6;
                i3 = i13;
            } else {
                i3 = 0;
                i4 = 0;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i3 == 0 && !z3) {
                if (z2) {
                    zzm--;
                    zzdyVar.zzG(1);
                }
                if (i4 != 0) {
                    zzm -= 4;
                    zzdyVar.zzG(4);
                }
                if (z4) {
                    zzm = zze(zzdyVar, zzm);
                }
                try {
                    try {
                        if (zzk == 84 && zzk2 == 88 && zzk3 == 88 && (i == 2 || zzk4 == 88)) {
                            if (zzm > 0) {
                                int zzk5 = zzdyVar.zzk();
                                String zzh = zzh(zzk5);
                                int i14 = zzm - 1;
                                byte[] bArr = new byte[i14];
                                zzdyVar.zzB(bArr, 0, i14);
                                int zzc2 = zzc(bArr, 0, zzk5);
                                String str = new String(bArr, 0, zzc2, zzh);
                                int zzb = zzc2 + zzb(zzk5);
                                zzachVar = new zzacj("TXXX", str, zzg(bArr, zzb, zzc(bArr, zzb, zzk5), zzh));
                                zzacbVar = zzachVar;
                            }
                            i7 = zzk;
                            i10 = zzk2;
                            i9 = zzk3;
                        } else {
                            if (zzk == 84) {
                                String zzi = zzi(i, 84, zzk2, zzk3, zzk4);
                                if (zzm > 0) {
                                    int zzk6 = zzdyVar.zzk();
                                    String zzh2 = zzh(zzk6);
                                    int i15 = zzm - 1;
                                    byte[] bArr2 = new byte[i15];
                                    zzdyVar.zzB(bArr2, 0, i15);
                                    zzachVar = new zzacj(zzi, null, new String(bArr2, 0, zzc(bArr2, 0, zzk6), zzh2));
                                }
                                i7 = zzk;
                                i10 = zzk2;
                                i9 = zzk3;
                            } else {
                                if (zzk != 87) {
                                    i5 = zzk;
                                } else if (zzk2 != 88 || zzk3 != 88 || (i != 2 && zzk4 != 88)) {
                                    i5 = 87;
                                } else if (zzm > 0) {
                                    int zzk7 = zzdyVar.zzk();
                                    String zzh3 = zzh(zzk7);
                                    int i16 = zzm - 1;
                                    byte[] bArr3 = new byte[i16];
                                    zzdyVar.zzB(bArr3, 0, i16);
                                    int zzc3 = zzc(bArr3, 0, zzk7);
                                    String str2 = new String(bArr3, 0, zzc3, zzh3);
                                    int zzb2 = zzc3 + zzb(zzk7);
                                    zzachVar = new zzacl("WXXX", str2, zzg(bArr3, zzb2, zzd(bArr3, zzb2), "ISO-8859-1"));
                                } else {
                                    i7 = zzk;
                                    i10 = zzk2;
                                    i9 = zzk3;
                                    i8 = zzk4;
                                    i6 = zzc;
                                    zzacbVar = null;
                                    if (zzacbVar == null) {
                                        zzi(i, i7, i10, i9, i8);
                                    }
                                    zzdyVar.zzF(i6);
                                    return zzacbVar;
                                }
                                if (i5 != 87) {
                                    if (i5 == 80) {
                                        if (zzk2 == 82 && zzk3 == 73 && zzk4 == 86) {
                                            byte[] bArr4 = new byte[zzm];
                                            zzdyVar.zzB(bArr4, 0, zzm);
                                            int zzd2 = zzd(bArr4, 0);
                                            zzachVar = new zzach(new String(bArr4, 0, zzd2, "ISO-8859-1"), zzk(bArr4, zzd2 + 1, zzm));
                                        } else {
                                            i5 = 80;
                                        }
                                    }
                                    if (i5 == 71) {
                                        if (zzk2 == 69 && zzk3 == 79 && (zzk4 == 66 || i == 2)) {
                                            int zzk8 = zzdyVar.zzk();
                                            String zzh4 = zzh(zzk8);
                                            int i17 = zzm - 1;
                                            byte[] bArr5 = new byte[i17];
                                            zzdyVar.zzB(bArr5, 0, i17);
                                            int zzd3 = zzd(bArr5, 0);
                                            String str3 = new String(bArr5, 0, zzd3, "ISO-8859-1");
                                            int i18 = zzd3 + 1;
                                            int zzc4 = zzc(bArr5, i18, zzk8);
                                            String zzg = zzg(bArr5, i18, zzc4, zzh4);
                                            int zzb3 = zzc4 + zzb(zzk8);
                                            int zzc5 = zzc(bArr5, zzb3, zzk8);
                                            zzacb zzabwVar = new zzabw(str3, zzg, zzg(bArr5, zzb3, zzc5, zzh4), zzk(bArr5, zzc5 + zzb(zzk8), i17));
                                            i7 = zzk;
                                            i10 = zzk2;
                                            i9 = zzk3;
                                            zzacbVar = zzabwVar;
                                        } else {
                                            i5 = 71;
                                        }
                                    }
                                    if (i != 2) {
                                        if (i5 == 65) {
                                            if (zzk2 == 80) {
                                                if (zzk3 == 73) {
                                                }
                                            }
                                        }
                                        i6 = zzc;
                                        if (i5 != 67) {
                                        }
                                        if (i5 != 67) {
                                        }
                                        if (i5 != 67) {
                                        }
                                        i7 = zzk;
                                        int i19 = zzk4;
                                        if (i5 != 77) {
                                        }
                                        String zzi2 = zzi(i, i5, i10, i9, i8);
                                        byte[] bArr6 = new byte[zzm];
                                        zzdyVar.zzB(bArr6, 0, zzm);
                                        zzacbVar = new zzabo(zzi2, bArr6);
                                        if (zzacbVar == null) {
                                        }
                                        zzdyVar.zzF(i6);
                                        return zzacbVar;
                                    }
                                    if (i5 == 80 && zzk2 == 73 && zzk3 == 67) {
                                        int zzk9 = zzdyVar.zzk();
                                        String zzh5 = zzh(zzk9);
                                        int i20 = zzm - 1;
                                        byte[] bArr7 = new byte[i20];
                                        zzdyVar.zzB(bArr7, 0, i20);
                                        if (i == 2) {
                                            zza2 = "image/".concat(String.valueOf(zzfoc.zza(new String(bArr7, 0, 3, "ISO-8859-1"))));
                                            if ("image/jpg".equals(zza2)) {
                                                zza2 = "image/jpeg";
                                            }
                                            zzd = 2;
                                        } else {
                                            zzd = zzd(bArr7, 0);
                                            zza2 = zzfoc.zza(new String(bArr7, 0, zzd, "ISO-8859-1"));
                                            if (zza2.indexOf(47) == -1) {
                                                zza2 = "image/".concat(zza2);
                                            }
                                        }
                                        int i21 = bArr7[zzd + 1] & 255;
                                        int i22 = zzd + 2;
                                        int zzc6 = zzc(bArr7, i22, zzk9);
                                        i6 = zzc;
                                        zzabqVar = new zzabm(zza2, new String(bArr7, i22, zzc6 - i22, zzh5), i21, zzk(bArr7, zzc6 + zzb(zzk9), i20));
                                        zzacbVar = zzabqVar;
                                        i7 = zzk;
                                        i10 = zzk2;
                                        i9 = zzk3;
                                        i8 = zzk4;
                                        if (zzacbVar == null) {
                                        }
                                        zzdyVar.zzF(i6);
                                        return zzacbVar;
                                    }
                                    i6 = zzc;
                                    if (i5 != 67 && zzk2 == 79 && zzk3 == 77 && (zzk4 == 77 || i == 2)) {
                                        if (zzm >= 4) {
                                            int zzk10 = zzdyVar.zzk();
                                            String zzh6 = zzh(zzk10);
                                            byte[] bArr8 = new byte[3];
                                            zzdyVar.zzB(bArr8, 0, 3);
                                            String str4 = new String(bArr8, 0, 3);
                                            int i23 = zzm - 4;
                                            byte[] bArr9 = new byte[i23];
                                            zzdyVar.zzB(bArr9, 0, i23);
                                            int zzc7 = zzc(bArr9, 0, zzk10);
                                            String str5 = new String(bArr9, 0, zzc7, zzh6);
                                            int zzb4 = zzc7 + zzb(zzk10);
                                            zzabqVar = new zzabu(str4, str5, zzg(bArr9, zzb4, zzc(bArr9, zzb4, zzk10), zzh6));
                                        } else {
                                            i7 = zzk;
                                            i10 = zzk2;
                                            i9 = zzk3;
                                            i8 = zzk4;
                                            zzacbVar = null;
                                            if (zzacbVar == null) {
                                            }
                                            zzdyVar.zzF(i6);
                                            return zzacbVar;
                                        }
                                    } else if (i5 != 67 && zzk2 == 72 && zzk3 == 65 && zzk4 == 80) {
                                        int zzc8 = zzdyVar.zzc();
                                        int zzd4 = zzd(zzdyVar.zzH(), zzc8);
                                        String str6 = new String(zzdyVar.zzH(), zzc8, zzd4 - zzc8, "ISO-8859-1");
                                        zzdyVar.zzF(zzd4 + 1);
                                        int zze = zzdyVar.zze();
                                        int zze2 = zzdyVar.zze();
                                        long zzs = zzdyVar.zzs();
                                        if (zzs == 4294967295L) {
                                            zzs = -1;
                                        }
                                        long j = zzs;
                                        long zzs2 = zzdyVar.zzs();
                                        if (zzs2 == 4294967295L) {
                                            zzs2 = -1;
                                        }
                                        long j2 = zzs2;
                                        ArrayList arrayList = new ArrayList();
                                        int i24 = zzc8 + zzm;
                                        while (zzdyVar.zzc() < i24) {
                                            zzacb zzf = zzf(i, zzdyVar, z, i2, null);
                                            if (zzf != null) {
                                                arrayList.add(zzf);
                                            }
                                        }
                                        zzabqVar = new zzabq(str6, zze, zze2, j, j2, (zzacb[]) arrayList.toArray(new zzacb[0]));
                                    } else {
                                        if (i5 != 67 && zzk2 == 84 && zzk3 == 79 && zzk4 == 67) {
                                            int zzc9 = zzdyVar.zzc();
                                            int zzd5 = zzd(zzdyVar.zzH(), zzc9);
                                            String str7 = new String(zzdyVar.zzH(), zzc9, zzd5 - zzc9, "ISO-8859-1");
                                            zzdyVar.zzF(zzd5 + 1);
                                            int zzk11 = zzdyVar.zzk();
                                            if ((zzk11 & 2) != 0) {
                                                i11 = 1;
                                                z5 = true;
                                            } else {
                                                i11 = 1;
                                                z5 = false;
                                            }
                                            int i25 = zzk11 & i11;
                                            int zzk12 = zzdyVar.zzk();
                                            String[] strArr = new String[zzk12];
                                            int i26 = 0;
                                            while (i26 < zzk12) {
                                                int i27 = zzk12;
                                                int zzc10 = zzdyVar.zzc();
                                                int i28 = zzk;
                                                int zzd6 = zzd(zzdyVar.zzH(), zzc10);
                                                strArr[i26] = new String(zzdyVar.zzH(), zzc10, zzd6 - zzc10, "ISO-8859-1");
                                                zzdyVar.zzF(zzd6 + 1);
                                                i26++;
                                                zzk12 = i27;
                                                zzk = i28;
                                                zzk4 = zzk4;
                                                zzk3 = zzk3;
                                                zzk2 = zzk2;
                                            }
                                            i7 = zzk;
                                            int i29 = zzk2;
                                            int i30 = zzk3;
                                            int i31 = zzk4;
                                            ArrayList arrayList2 = new ArrayList();
                                            int i32 = zzc9 + zzm;
                                            while (zzdyVar.zzc() < i32) {
                                                zzacb zzf2 = zzf(i, zzdyVar, z, i2, null);
                                                if (zzf2 != null) {
                                                    arrayList2.add(zzf2);
                                                }
                                            }
                                            zzacbVar = new zzabs(str7, z5, 1 == i25, strArr, (zzacb[]) arrayList2.toArray(new zzacb[0]));
                                            i8 = i31;
                                            i9 = i30;
                                            i10 = i29;
                                        } else {
                                            i7 = zzk;
                                            int i192 = zzk4;
                                            if (i5 != 77) {
                                                i10 = zzk2;
                                                if (i10 == 76) {
                                                    i9 = zzk3;
                                                    i8 = i192;
                                                    if (i9 == 76 && i8 == 84) {
                                                        int zzo2 = zzdyVar.zzo();
                                                        int zzm2 = zzdyVar.zzm();
                                                        int zzm3 = zzdyVar.zzm();
                                                        int zzk13 = zzdyVar.zzk();
                                                        int zzk14 = zzdyVar.zzk();
                                                        zzdx zzdxVar = new zzdx();
                                                        zzdxVar.zzg(zzdyVar.zzH(), zzdyVar.zzd());
                                                        zzdxVar.zzh(zzdyVar.zzc() * 8);
                                                        int i33 = ((zzm - 10) * 8) / (zzk13 + zzk14);
                                                        int[] iArr = new int[i33];
                                                        int[] iArr2 = new int[i33];
                                                        for (int i34 = 0; i34 < i33; i34++) {
                                                            int zzc11 = zzdxVar.zzc(zzk13);
                                                            int zzc12 = zzdxVar.zzc(zzk14);
                                                            iArr[i34] = zzc11;
                                                            iArr2[i34] = zzc12;
                                                        }
                                                        zzacbVar = new zzacf(zzo2, zzm2, zzm3, iArr, iArr2);
                                                    }
                                                } else {
                                                    i8 = i192;
                                                    i9 = zzk3;
                                                }
                                            } else {
                                                i8 = i192;
                                                i9 = zzk3;
                                                i10 = zzk2;
                                            }
                                            String zzi22 = zzi(i, i5, i10, i9, i8);
                                            byte[] bArr62 = new byte[zzm];
                                            zzdyVar.zzB(bArr62, 0, zzm);
                                            zzacbVar = new zzabo(zzi22, bArr62);
                                        }
                                        if (zzacbVar == null) {
                                        }
                                        zzdyVar.zzF(i6);
                                        return zzacbVar;
                                    }
                                    zzacbVar = zzabqVar;
                                    i7 = zzk;
                                    i10 = zzk2;
                                    i9 = zzk3;
                                    i8 = zzk4;
                                    if (zzacbVar == null) {
                                    }
                                    zzdyVar.zzF(i6);
                                    return zzacbVar;
                                }
                                String zzi3 = zzi(i, 87, zzk2, zzk3, zzk4);
                                byte[] bArr10 = new byte[zzm];
                                zzdyVar.zzB(bArr10, 0, zzm);
                                zzachVar = new zzacl(zzi3, null, new String(bArr10, 0, zzd(bArr10, 0), "ISO-8859-1"));
                            }
                            zzacbVar = zzachVar;
                            i7 = zzk;
                            i10 = zzk2;
                            i9 = zzk3;
                        }
                        i8 = zzk4;
                        i6 = zzc;
                        if (zzacbVar == null) {
                        }
                        zzdyVar.zzF(i6);
                        return zzacbVar;
                    } catch (UnsupportedEncodingException unused) {
                        zzdyVar.zzF(zzc);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        zzdyVar.zzF(zzc);
                        throw th;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    zzc = i6;
                    zzdyVar.zzF(zzc);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    zzc = i6;
                    zzdyVar.zzF(zzc);
                    throw th;
                }
            }
            zzdyVar.zzF(zzc);
            return null;
        } else {
            zzdyVar.zzF(zzc);
            return null;
        }
    }

    private static String zzg(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static String zzh(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzj(zzdy zzdyVar, int i, int i2, boolean z) {
        int zzm;
        long zzm2;
        int i3;
        int i4;
        int zzc = zzdyVar.zzc();
        while (true) {
            try {
                if (zzdyVar.zza() < i2) {
                    return true;
                }
                if (i >= 3) {
                    zzm = zzdyVar.zze();
                    zzm2 = zzdyVar.zzs();
                    i3 = zzdyVar.zzo();
                } else {
                    zzm = zzdyVar.zzm();
                    zzm2 = zzdyVar.zzm();
                    i3 = 0;
                }
                if (zzm == 0 && zzm2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & zzm2) != 0) {
                        return false;
                    }
                    zzm2 = ((zzm2 >> 24) << 21) | ((255 & (zzm2 >> 16)) << 14) | (zzm2 & 255) | (((zzm2 >> 8) & 255) << 7);
                }
                if (i == 4) {
                    r4 = i3 & 1;
                    i4 = (i3 & 64) == 0 ? 0 : 1;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                    }
                    r4 = 0;
                }
                if (r4 != 0) {
                    i4 += 4;
                }
                if (zzm2 < i4) {
                    return false;
                }
                if (zzdyVar.zza() < zzm2) {
                    return false;
                }
                zzdyVar.zzG((int) zzm2);
            } finally {
                zzdyVar.zzF(zzc);
            }
        }
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzeg.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }
}