package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.tk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzava {
    private static final int zza = zzazo.zzg("vide");
    private static final int zzb = zzazo.zzg("soun");
    private static final int zzc = zzazo.zzg("text");
    private static final int zzd = zzazo.zzg("sbtl");
    private static final int zze = zzazo.zzg("subt");
    private static final int zzf = zzazo.zzg("clcp");
    private static final int zzg = zzazo.zzg("cenc");
    private static final int zzh = zzazo.zzg("meta");

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        if (r12 == 0) goto L419;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0830 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzavl zza(zzaur zzaurVar, zzaus zzausVar, long j, zzats zzatsVar, boolean z) throws zzarw {
        int i;
        long j2;
        int i2;
        zzaus zzausVar2;
        long j3;
        int i3;
        int i4;
        int zze2;
        int i5;
        zzauw zzauwVar;
        zzaur zza2;
        zzavl zzavlVar;
        Pair create;
        int i6;
        zzaus zzb2;
        int i7;
        boolean z2;
        int i8;
        String str;
        zzazh zzazhVar;
        Pair pair;
        zzauz zzauzVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzauw zzauwVar2;
        int i14;
        int i15;
        boolean z3;
        byte[] bArr;
        String str2;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzc2;
        int i20;
        String str3;
        int i21;
        int i22;
        int i23;
        zzauw zzauwVar3;
        int i24;
        int i25;
        String str4;
        int i26;
        String str5;
        zzauw zzauwVar4;
        int zzc3;
        String str6;
        int i27;
        int i28;
        String str7;
        String str8;
        Object obj;
        long j4;
        zzats zzatsVar2 = zzatsVar;
        zzaur zza3 = zzaurVar.zza(zzaut.zzH);
        zzazh zzazhVar2 = zza3.zzb(zzaut.zzV).zza;
        zzazhVar2.zzv(16);
        int zze3 = zzazhVar2.zze();
        int i29 = -1;
        if (zze3 == zzb) {
            i = 1;
        } else {
            i = zze3 == zza ? 2 : (zze3 == zzc || zze3 == zzd || zze3 == zze || zze3 == zzf) ? 3 : zze3 == zzh ? 4 : -1;
        }
        String str9 = null;
        if (i == -1) {
            return null;
        }
        zzazh zzazhVar3 = zzaurVar.zzb(zzaut.zzR).zza;
        zzazhVar3.zzv(8);
        int zzf2 = zzaut.zzf(zzazhVar3.zze());
        zzazhVar3.zzw(zzf2 == 0 ? 8 : 16);
        int zze4 = zzazhVar3.zze();
        zzazhVar3.zzw(4);
        int zzc4 = zzazhVar3.zzc();
        int i30 = zzf2 == 0 ? 4 : 8;
        int i31 = 0;
        while (true) {
            if (i31 < i30) {
                if (zzazhVar3.zza[zzc4 + i31] != -1) {
                    j2 = zzf2 == 0 ? zzazhVar3.zzm() : zzazhVar3.zzn();
                } else {
                    i31++;
                }
            } else {
                zzazhVar3.zzw(i30);
                break;
            }
        }
        j2 = -9223372036854775807L;
        zzazhVar3.zzw(16);
        int zze5 = zzazhVar3.zze();
        int zze6 = zzazhVar3.zze();
        zzazhVar3.zzw(4);
        int zze7 = zzazhVar3.zze();
        int zze8 = zzazhVar3.zze();
        int i32 = 65536;
        if (zze5 == 0) {
            if (zze6 != 65536) {
                zze5 = 0;
            } else if (zze7 != -65536) {
                zze5 = 0;
                zze6 = 65536;
            } else if (zze8 == 0) {
                i2 = 90;
                zzauz zzauzVar2 = new zzauz(zze4, j2, i2);
                if (j == -9223372036854775807L) {
                    j4 = zzauzVar2.zzb;
                    j3 = j4;
                    zzausVar2 = zzausVar;
                } else {
                    zzausVar2 = zzausVar;
                    j3 = j;
                }
                zzazh zzazhVar4 = zzausVar2.zza;
                zzazhVar4.zzv(8);
                zzazhVar4.zzw(zzaut.zzf(zzazhVar4.zze()) == 0 ? 8 : 16);
                long zzm = zzazhVar4.zzm();
                long zzj = j3 == -9223372036854775807L ? -9223372036854775807L : zzazo.zzj(j3, 1000000L, zzm);
                zzaur zza4 = zza3.zza(zzaut.zzI).zza(zzaut.zzJ);
                zzazh zzazhVar5 = zza3.zzb(zzaut.zzU).zza;
                zzazhVar5.zzv(8);
                int zzf3 = zzaut.zzf(zzazhVar5.zze());
                zzazhVar5.zzw(zzf3 == 0 ? 8 : 16);
                long zzm2 = zzazhVar5.zzm();
                zzazhVar5.zzw(zzf3 == 0 ? 4 : 8);
                int zzj2 = zzazhVar5.zzj();
                StringBuilder sb = new StringBuilder();
                sb.append((char) (((zzj2 >> 10) & 31) + 96));
                sb.append((char) (((zzj2 >> 5) & 31) + 96));
                sb.append((char) ((zzj2 & 31) + 96));
                Pair create2 = Pair.create(Long.valueOf(zzm2), sb.toString());
                zzazh zzazhVar6 = zza4.zzb(zzaut.zzW).zza;
                i3 = zzauzVar2.zza;
                i4 = zzauzVar2.zzc;
                String str10 = (String) create2.second;
                zzazhVar6.zzv(12);
                zze2 = zzazhVar6.zze();
                zzauw zzauwVar5 = new zzauw(zze2);
                i5 = 0;
                while (i5 < zze2) {
                    int zzc5 = zzazhVar6.zzc();
                    int zze9 = zzazhVar6.zze();
                    if (zze9 > 0) {
                        i7 = i;
                        z2 = true;
                    } else {
                        i7 = i;
                        z2 = false;
                    }
                    String str11 = "childAtomSize should be positive";
                    zzayz.zzd(z2, "childAtomSize should be positive");
                    int zze10 = zzazhVar6.zze();
                    if (zze10 != zzaut.zze && zze10 != zzaut.zzf && zze10 != zzaut.zzac && zze10 != zzaut.zzan && zze10 != zzaut.zzg && zze10 != zzaut.zzh && zze10 != zzaut.zzi && zze10 != zzaut.zzaM && zze10 != zzaut.zzaN) {
                        if (zze10 != zzaut.zzl && zze10 != zzaut.zzad && zze10 != zzaut.zzq && zze10 != zzaut.zzs && zze10 != zzaut.zzu && zze10 != zzaut.zzx && zze10 != zzaut.zzv && zze10 != zzaut.zzw && zze10 != zzaut.zzaA && zze10 != zzaut.zzaB && zze10 != zzaut.zzo && zze10 != zzaut.zzp && zze10 != zzaut.zzm && zze10 != zzaut.zzaQ) {
                            int i33 = zzaut.zzam;
                            if (zze10 != i33 && zze10 != zzaut.zzaw && zze10 != zzaut.zzax && zze10 != zzaut.zzay && zze10 != zzaut.zzaz) {
                                if (zze10 == zzaut.zzaP) {
                                    zzauwVar5.zzb = zzart.zzj(Integer.toString(i3), "application/x-camera-motion", str9, i29, zzatsVar2);
                                }
                                i14 = zze9;
                                i13 = zzc5;
                                i12 = i5;
                                zzauwVar2 = zzauwVar5;
                                i8 = zze2;
                                str = str10;
                                zzazhVar = zzazhVar6;
                                pair = create2;
                                zzauzVar = zzauzVar2;
                                zzazhVar.zzv(i13 + i14);
                                i5 = i12 + 1;
                                zzatsVar2 = zzatsVar;
                                zzazhVar6 = zzazhVar;
                                zzauwVar5 = zzauwVar2;
                                zzauzVar2 = zzauzVar;
                                i = i7;
                                zze2 = i8;
                                str10 = str;
                                create2 = pair;
                                str9 = null;
                                i29 = -1;
                            } else {
                                zzazhVar6.zzv(zzc5 + 16);
                                long j5 = Long.MAX_VALUE;
                                if (zze10 == i33) {
                                    obj = str9;
                                    str8 = "application/ttml+xml";
                                } else if (zze10 == zzaut.zzaw) {
                                    int i34 = zze9 - 16;
                                    byte[] bArr2 = new byte[i34];
                                    zzazhVar6.zzq(bArr2, 0, i34);
                                    Object singletonList = Collections.singletonList(bArr2);
                                    str8 = "application/x-quicktime-tx3g";
                                    obj = singletonList;
                                } else if (zze10 == zzaut.zzax) {
                                    str8 = "application/x-mp4-vtt";
                                    obj = str9;
                                } else if (zze10 == zzaut.zzay) {
                                    obj = str9;
                                    str8 = "application/ttml+xml";
                                    j5 = 0;
                                } else if (zze10 == zzaut.zzaz) {
                                    zzauwVar5.zzd = 1;
                                    str8 = "application/x-mp4-cea-608";
                                    obj = str9;
                                    zzauw zzauwVar6 = zzauwVar5;
                                    i8 = zze2;
                                    str2 = str10;
                                    zzauwVar6.zzb = zzart.zzk(Integer.toString(i3), str8, null, -1, 0, str10, -1, zzatsVar, j5, obj);
                                    pair = create2;
                                    zzauwVar2 = zzauwVar6;
                                    zzazhVar = zzazhVar6;
                                    i14 = zze9;
                                    zzauzVar = zzauzVar2;
                                    i12 = i5;
                                    i13 = zzc5;
                                } else {
                                    throw new IllegalStateException();
                                }
                                zzauw zzauwVar62 = zzauwVar5;
                                i8 = zze2;
                                str2 = str10;
                                zzauwVar62.zzb = zzart.zzk(Integer.toString(i3), str8, null, -1, 0, str10, -1, zzatsVar, j5, obj);
                                pair = create2;
                                zzauwVar2 = zzauwVar62;
                                zzazhVar = zzazhVar6;
                                i14 = zze9;
                                zzauzVar = zzauzVar2;
                                i12 = i5;
                                i13 = zzc5;
                            }
                        } else {
                            int i35 = i5;
                            zzauw zzauwVar7 = zzauwVar5;
                            i8 = zze2;
                            str2 = str10;
                            Pair pair2 = create2;
                            int i36 = zze9;
                            int i37 = zzc5;
                            zzazhVar6.zzv(i37 + 16);
                            if (z) {
                                i16 = zzazhVar6.zzj();
                                zzazhVar6.zzw(6);
                            } else {
                                zzazhVar6.zzw(8);
                                i16 = 0;
                            }
                            if (i16 != 0) {
                                i17 = 1;
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        zzazhVar6.zzw(16);
                                        i18 = (int) Math.round(Double.longBitsToDouble(zzazhVar6.zzl()));
                                        i19 = zzazhVar6.zzi();
                                        zzazhVar6.zzw(20);
                                        zzc2 = zzazhVar6.zzc();
                                        if (zze10 != zzaut.zzad) {
                                            i20 = i35;
                                            zze10 = zze(zzazhVar6, i37, i36, zzauwVar7, i20);
                                            zzazhVar6.zzv(zzc2);
                                        } else {
                                            i20 = i35;
                                        }
                                        if (zze10 != zzaut.zzq) {
                                            str3 = "audio/ac3";
                                        } else {
                                            str3 = zze10 == zzaut.zzs ? "audio/eac3" : zze10 == zzaut.zzu ? "audio/vnd.dts" : (zze10 == zzaut.zzv || zze10 == zzaut.zzw) ? "audio/vnd.dts.hd" : zze10 == zzaut.zzx ? "audio/vnd.dts.hd;profile=lbr" : zze10 == zzaut.zzaA ? "audio/3gpp" : zze10 == zzaut.zzaB ? "audio/amr-wb" : (zze10 == zzaut.zzo || zze10 == zzaut.zzp) ? "audio/raw" : zze10 == zzaut.zzm ? "audio/mpeg" : zze10 == zzaut.zzaQ ? "audio/alac" : null;
                                        }
                                        String str12 = str3;
                                        int i38 = i19;
                                        int i39 = i18;
                                        byte[] bArr3 = null;
                                        while (zzc2 - i37 < i36) {
                                            zzazhVar6.zzv(zzc2);
                                            int zze11 = zzazhVar6.zze();
                                            zzayz.zzd(zze11 > 0, str11);
                                            int zze12 = zzazhVar6.zze();
                                            int i40 = zzaut.zzM;
                                            if (zze12 == i40 || (z && zze12 == zzaut.zzn)) {
                                                i24 = i20;
                                                String str13 = str12;
                                                i25 = i37;
                                                str4 = str11;
                                                i26 = i36;
                                                str5 = str2;
                                                zzauwVar4 = zzauwVar7;
                                                if (zze12 != i40) {
                                                    zzc3 = zzazhVar6.zzc();
                                                    while (true) {
                                                        if (zzc3 - zzc2 >= zze11) {
                                                            zzc3 = -1;
                                                            break;
                                                        }
                                                        zzazhVar6.zzv(zzc3);
                                                        int zze13 = zzazhVar6.zze();
                                                        zzayz.zzd(zze13 > 0, str4);
                                                        if (zzazhVar6.zze() == zzaut.zzM) {
                                                            break;
                                                        }
                                                        zzc3 += zze13;
                                                    }
                                                } else {
                                                    zzc3 = zzc2;
                                                }
                                                if (zzc3 != -1) {
                                                    Pair zzf4 = zzf(zzazhVar6, zzc3);
                                                    String str14 = (String) zzf4.first;
                                                    bArr3 = (byte[]) zzf4.second;
                                                    if ("audio/mp4a-latm".equals(str14)) {
                                                        Pair zza5 = zzaza.zza(bArr3);
                                                        int intValue = ((Integer) zza5.first).intValue();
                                                        i38 = ((Integer) zza5.second).intValue();
                                                        str12 = str14;
                                                        i39 = intValue;
                                                    } else {
                                                        str12 = str14;
                                                    }
                                                } else {
                                                    str12 = str13;
                                                }
                                            } else {
                                                if (zze12 == zzaut.zzr) {
                                                    zzazhVar6.zzv(zzc2 + 8);
                                                    str6 = str2;
                                                    zzauwVar7.zzb = zzasf.zzb(zzazhVar6, Integer.toString(i3), str6, zzatsVar2);
                                                } else {
                                                    str6 = str2;
                                                    if (zze12 == zzaut.zzt) {
                                                        zzazhVar6.zzv(zzc2 + 8);
                                                        zzauwVar7.zzb = zzasf.zzc(zzazhVar6, Integer.toString(i3), str6, zzatsVar2);
                                                    } else {
                                                        if (zze12 == zzaut.zzy) {
                                                            i27 = zze11;
                                                            i28 = zzc2;
                                                            i24 = i20;
                                                            str7 = str12;
                                                            str5 = str6;
                                                            i25 = i37;
                                                            str4 = str11;
                                                            i26 = i36;
                                                            zzauwVar4 = zzauwVar7;
                                                            zzauwVar4.zzb = zzart.zzg(Integer.toString(i3), str12, null, -1, -1, i38, i39, null, zzatsVar, 0, str5);
                                                        } else {
                                                            i27 = zze11;
                                                            i28 = zzc2;
                                                            i24 = i20;
                                                            str7 = str12;
                                                            str5 = str6;
                                                            i25 = i37;
                                                            str4 = str11;
                                                            i26 = i36;
                                                            zzauwVar4 = zzauwVar7;
                                                            if (zze12 == zzaut.zzaQ) {
                                                                zze11 = i27;
                                                                byte[] bArr4 = new byte[zze11];
                                                                zzc2 = i28;
                                                                zzazhVar6.zzv(zzc2);
                                                                zzazhVar6.zzq(bArr4, 0, zze11);
                                                                bArr3 = bArr4;
                                                                str12 = str7;
                                                            }
                                                        }
                                                        zze11 = i27;
                                                        zzc2 = i28;
                                                        str12 = str7;
                                                    }
                                                }
                                                i24 = i20;
                                                str7 = str12;
                                                str5 = str6;
                                                i25 = i37;
                                                str4 = str11;
                                                i26 = i36;
                                                zzauwVar4 = zzauwVar7;
                                                str12 = str7;
                                            }
                                            zzc2 += zze11;
                                            zzauwVar7 = zzauwVar4;
                                            str11 = str4;
                                            str2 = str5;
                                            i36 = i26;
                                            i20 = i24;
                                            i37 = i25;
                                            zzatsVar2 = zzatsVar;
                                        }
                                        i21 = i20;
                                        String str15 = str12;
                                        i22 = i37;
                                        i23 = i36;
                                        str = str2;
                                        zzauwVar3 = zzauwVar7;
                                        if (zzauwVar3.zzb != null && str15 != null) {
                                            zzazhVar = zzazhVar6;
                                            pair = pair2;
                                            i11 = i23;
                                            zzauzVar = zzauzVar2;
                                            zzauwVar3.zzb = zzart.zzh(Integer.toString(i3), str15, null, -1, -1, i38, i39, true != "audio/raw".equals(str15) ? -1 : 2, -1, -1, bArr3 == null ? null : Collections.singletonList(bArr3), zzatsVar, 0, str, null);
                                            zzauwVar2 = zzauwVar3;
                                            i12 = i21;
                                            i13 = i22;
                                        } else {
                                            pair = pair2;
                                            zzazhVar = zzazhVar6;
                                            zzauzVar = zzauzVar2;
                                            zzauwVar2 = zzauwVar3;
                                            i14 = i23;
                                            i12 = i21;
                                            i13 = i22;
                                            zzazhVar.zzv(i13 + i14);
                                            i5 = i12 + 1;
                                            zzatsVar2 = zzatsVar;
                                            zzazhVar6 = zzazhVar;
                                            zzauwVar5 = zzauwVar2;
                                            zzauzVar2 = zzauzVar;
                                            i = i7;
                                            zze2 = i8;
                                            str10 = str;
                                            create2 = pair;
                                            str9 = null;
                                            i29 = -1;
                                        }
                                    } else {
                                        pair = pair2;
                                        i13 = i37;
                                        zzauwVar2 = zzauwVar7;
                                        zzazhVar = zzazhVar6;
                                        i14 = i36;
                                        zzauzVar = zzauzVar2;
                                        i12 = i35;
                                    }
                                }
                            } else {
                                i17 = 1;
                            }
                            int zzj3 = zzazhVar6.zzj();
                            zzazhVar6.zzw(6);
                            int zzh2 = zzazhVar6.zzh();
                            if (i16 == i17) {
                                zzazhVar6.zzw(16);
                            }
                            i18 = zzh2;
                            i19 = zzj3;
                            zzc2 = zzazhVar6.zzc();
                            if (zze10 != zzaut.zzad) {
                            }
                            if (zze10 != zzaut.zzq) {
                            }
                            String str122 = str3;
                            int i382 = i19;
                            int i392 = i18;
                            byte[] bArr32 = null;
                            while (zzc2 - i37 < i36) {
                            }
                            i21 = i20;
                            String str152 = str122;
                            i22 = i37;
                            i23 = i36;
                            str = str2;
                            zzauwVar3 = zzauwVar7;
                            if (zzauwVar3.zzb != null) {
                            }
                            pair = pair2;
                            zzazhVar = zzazhVar6;
                            zzauzVar = zzauzVar2;
                            zzauwVar2 = zzauwVar3;
                            i14 = i23;
                            i12 = i21;
                            i13 = i22;
                            zzazhVar.zzv(i13 + i14);
                            i5 = i12 + 1;
                            zzatsVar2 = zzatsVar;
                            zzazhVar6 = zzazhVar;
                            zzauwVar5 = zzauwVar2;
                            zzauzVar2 = zzauzVar;
                            i = i7;
                            zze2 = i8;
                            str10 = str;
                            create2 = pair;
                            str9 = null;
                            i29 = -1;
                        }
                        str = str2;
                        zzazhVar.zzv(i13 + i14);
                        i5 = i12 + 1;
                        zzatsVar2 = zzatsVar;
                        zzazhVar6 = zzazhVar;
                        zzauwVar5 = zzauwVar2;
                        zzauzVar2 = zzauzVar;
                        i = i7;
                        zze2 = i8;
                        str10 = str;
                        create2 = pair;
                        str9 = null;
                        i29 = -1;
                    } else {
                        int i41 = i5;
                        i8 = zze2;
                        str = str10;
                        zzazhVar = zzazhVar6;
                        pair = create2;
                        zzauzVar = zzauzVar2;
                        zzauw zzauwVar8 = zzauwVar5;
                        zzazhVar.zzv(zzc5 + 16);
                        zzazhVar.zzw(16);
                        int zzj4 = zzazhVar.zzj();
                        int zzj5 = zzazhVar.zzj();
                        zzazhVar.zzw(50);
                        int zzc6 = zzazhVar.zzc();
                        if (zze10 == zzaut.zzac) {
                            i9 = i41;
                            i10 = zze9;
                            zze10 = zze(zzazhVar, zzc5, i10, zzauwVar8, i9);
                            zzazhVar.zzv(zzc6);
                        } else {
                            i9 = i41;
                            i10 = zze9;
                        }
                        String str16 = null;
                        boolean z4 = false;
                        List list = null;
                        float f = 1.0f;
                        byte[] bArr5 = null;
                        int i42 = -1;
                        while (zzc6 - zzc5 < i10) {
                            zzazhVar.zzv(zzc6);
                            int zzc7 = zzazhVar.zzc();
                            int zze14 = zzazhVar.zze();
                            if (zze14 == 0) {
                                if (zzazhVar.zzc() - zzc5 == i10) {
                                    break;
                                }
                                zze14 = 0;
                            }
                            zzayz.zzd(zze14 > 0, "childAtomSize should be positive");
                            int zze15 = zzazhVar.zze();
                            int i43 = i10;
                            if (zze15 == zzaut.zzK) {
                                zzayz.zze(str16 == null);
                                zzazhVar.zzv(zzc7 + 8);
                                zzazp zza6 = zzazp.zza(zzazhVar);
                                list = zza6.zza;
                                zzauwVar8.zzc = zza6.zzb;
                                if (!z4) {
                                    f = zza6.zzc;
                                }
                                str16 = "video/avc";
                            } else if (zze15 == zzaut.zzL) {
                                zzayz.zze(str16 == null);
                                zzazhVar.zzv(zzc7 + 8);
                                zzazv zza7 = zzazv.zza(zzazhVar);
                                list = zza7.zza;
                                zzauwVar8.zzc = zza7.zzb;
                                str16 = "video/hevc";
                            } else if (zze15 == zzaut.zzaO) {
                                zzayz.zze(str16 == null);
                                str16 = zze10 == zzaut.zzaM ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            } else if (zze15 == zzaut.zzj) {
                                zzayz.zze(str16 == null);
                                str16 = "video/3gpp";
                            } else {
                                if (zze15 == zzaut.zzM) {
                                    zzayz.zze(str16 == null);
                                    Pair zzf5 = zzf(zzazhVar, zzc7);
                                    list = Collections.singletonList((byte[]) zzf5.second);
                                    i15 = zze10;
                                    str16 = (String) zzf5.first;
                                } else if (zze15 == zzaut.zzal) {
                                    zzazhVar.zzv(zzc7 + 8);
                                    f = zzazhVar.zzi() / zzazhVar.zzi();
                                    i15 = zze10;
                                    z4 = true;
                                } else if (zze15 == zzaut.zzaK) {
                                    int i44 = zzc7 + 8;
                                    while (true) {
                                        if (i44 - zzc7 >= zze14) {
                                            i15 = zze10;
                                            z3 = z4;
                                            bArr = null;
                                            break;
                                        }
                                        zzazhVar.zzv(i44);
                                        int zze16 = zzazhVar.zze();
                                        i15 = zze10;
                                        z3 = z4;
                                        if (zzazhVar.zze() == zzaut.zzaL) {
                                            bArr = Arrays.copyOfRange(zzazhVar.zza, i44, zze16 + i44);
                                            break;
                                        }
                                        i44 += zze16;
                                        z4 = z3;
                                        zze10 = i15;
                                    }
                                    z4 = z3;
                                    bArr5 = bArr;
                                } else {
                                    i15 = zze10;
                                    boolean z5 = z4;
                                    if (zze15 == zzaut.zzaJ) {
                                        int zzg2 = zzazhVar.zzg();
                                        zzazhVar.zzw(3);
                                        if (zzg2 == 0) {
                                            int zzg3 = zzazhVar.zzg();
                                            if (zzg3 == 0) {
                                                z4 = z5;
                                                i42 = 0;
                                            } else if (zzg3 == 1) {
                                                z4 = z5;
                                                i42 = 1;
                                            } else if (zzg3 == 2) {
                                                z4 = z5;
                                                i42 = 2;
                                            } else if (zzg3 == 3) {
                                                z4 = z5;
                                                i42 = 3;
                                            }
                                            zzc6 += zze14;
                                            zze10 = i15;
                                            i10 = i43;
                                        }
                                    }
                                    z4 = z5;
                                    zzc6 += zze14;
                                    zze10 = i15;
                                    i10 = i43;
                                }
                                zzc6 += zze14;
                                zze10 = i15;
                                i10 = i43;
                            }
                            i15 = zze10;
                            zzc6 += zze14;
                            zze10 = i15;
                            i10 = i43;
                        }
                        i11 = i10;
                        if (str16 != null) {
                            i14 = i11;
                            i12 = i9;
                            byte[] bArr6 = bArr5;
                            i13 = zzc5;
                            zzauwVar2 = zzauwVar8;
                            zzauwVar2.zzb = zzart.zzl(Integer.toString(i3), str16, null, -1, -1, zzj4, zzj5, -1.0f, list, i4, f, bArr6, i42, null, zzatsVar);
                            zzazhVar.zzv(i13 + i14);
                            i5 = i12 + 1;
                            zzatsVar2 = zzatsVar;
                            zzazhVar6 = zzazhVar;
                            zzauwVar5 = zzauwVar2;
                            zzauzVar2 = zzauzVar;
                            i = i7;
                            zze2 = i8;
                            str10 = str;
                            create2 = pair;
                            str9 = null;
                            i29 = -1;
                        } else {
                            i12 = i9;
                            i13 = zzc5;
                            zzauwVar2 = zzauwVar8;
                        }
                    }
                    i14 = i11;
                    zzazhVar.zzv(i13 + i14);
                    i5 = i12 + 1;
                    zzatsVar2 = zzatsVar;
                    zzazhVar6 = zzazhVar;
                    zzauwVar5 = zzauwVar2;
                    zzauzVar2 = zzauzVar;
                    i = i7;
                    zze2 = i8;
                    str10 = str;
                    create2 = pair;
                    str9 = null;
                    i29 = -1;
                }
                zzauwVar = zzauwVar5;
                int i45 = i;
                Pair pair3 = create2;
                zzauz zzauzVar3 = zzauzVar2;
                zza2 = zzaurVar.zza(zzaut.zzS);
                if (zza2 == null && (zzb2 = zza2.zzb(zzaut.zzT)) != null) {
                    zzazh zzazhVar7 = zzb2.zza;
                    zzazhVar7.zzv(8);
                    int zzf6 = zzaut.zzf(zzazhVar7.zze());
                    int zzi = zzazhVar7.zzi();
                    long[] jArr = new long[zzi];
                    long[] jArr2 = new long[zzi];
                    for (int i46 = 0; i46 < zzi; i46++) {
                        jArr[i46] = zzf6 == 1 ? zzazhVar7.zzn() : zzazhVar7.zzm();
                        jArr2[i46] = zzf6 == 1 ? zzazhVar7.zzl() : zzazhVar7.zze();
                        if (zzazhVar7.zzp() == 1) {
                            zzazhVar7.zzw(2);
                        } else {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                    }
                    create = Pair.create(jArr, jArr2);
                    zzavlVar = null;
                } else {
                    zzavlVar = null;
                    create = Pair.create(null, null);
                }
                if (zzauwVar.zzb == null) {
                    return zzavlVar;
                }
                i6 = zzauzVar3.zza;
                return new zzavl(i6, i45, ((Long) pair3.first).longValue(), zzm, zzj, zzauwVar.zzb, zzauwVar.zzd, zzauwVar.zza, zzauwVar.zzc, (long[]) create.first, (long[]) create.second);
            } else {
                zze5 = 0;
                zze6 = 65536;
                zze7 = tk.c;
            }
        }
        if (zze5 != 0) {
            i32 = zze7;
        } else if (zze6 == -65536) {
            if (zze7 != 65536) {
                i32 = zze7;
            } else if (zze8 == 0) {
                i2 = 270;
                zzauz zzauzVar22 = new zzauz(zze4, j2, i2);
                if (j == -9223372036854775807L) {
                }
                zzazh zzazhVar42 = zzausVar2.zza;
                zzazhVar42.zzv(8);
                zzazhVar42.zzw(zzaut.zzf(zzazhVar42.zze()) == 0 ? 8 : 16);
                long zzm3 = zzazhVar42.zzm();
                if (j3 == -9223372036854775807L) {
                }
                zzaur zza42 = zza3.zza(zzaut.zzI).zza(zzaut.zzJ);
                zzazh zzazhVar52 = zza3.zzb(zzaut.zzU).zza;
                zzazhVar52.zzv(8);
                int zzf32 = zzaut.zzf(zzazhVar52.zze());
                zzazhVar52.zzw(zzf32 == 0 ? 8 : 16);
                long zzm22 = zzazhVar52.zzm();
                zzazhVar52.zzw(zzf32 == 0 ? 4 : 8);
                int zzj22 = zzazhVar52.zzj();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) (((zzj22 >> 10) & 31) + 96));
                sb2.append((char) (((zzj22 >> 5) & 31) + 96));
                sb2.append((char) ((zzj22 & 31) + 96));
                Pair create22 = Pair.create(Long.valueOf(zzm22), sb2.toString());
                zzazh zzazhVar62 = zza42.zzb(zzaut.zzW).zza;
                i3 = zzauzVar22.zza;
                i4 = zzauzVar22.zzc;
                String str102 = (String) create22.second;
                zzazhVar62.zzv(12);
                zze2 = zzazhVar62.zze();
                zzauw zzauwVar52 = new zzauw(zze2);
                i5 = 0;
                while (i5 < zze2) {
                }
                zzauwVar = zzauwVar52;
                int i452 = i;
                Pair pair32 = create22;
                zzauz zzauzVar32 = zzauzVar22;
                zza2 = zzaurVar.zza(zzaut.zzS);
                if (zza2 == null) {
                }
                zzavlVar = null;
                create = Pair.create(null, null);
                if (zzauwVar.zzb == null) {
                }
            }
            zze5 = 0;
            zze6 = tk.c;
        } else {
            i32 = zze7;
            zze5 = 0;
        }
        i2 = (zze5 == -65536 && zze6 == 0 && i32 == 0 && zze8 == -65536) ? 180 : 0;
        zzauz zzauzVar222 = new zzauz(zze4, j2, i2);
        if (j == -9223372036854775807L) {
        }
        zzazh zzazhVar422 = zzausVar2.zza;
        zzazhVar422.zzv(8);
        zzazhVar422.zzw(zzaut.zzf(zzazhVar422.zze()) == 0 ? 8 : 16);
        long zzm32 = zzazhVar422.zzm();
        if (j3 == -9223372036854775807L) {
        }
        zzaur zza422 = zza3.zza(zzaut.zzI).zza(zzaut.zzJ);
        zzazh zzazhVar522 = zza3.zzb(zzaut.zzU).zza;
        zzazhVar522.zzv(8);
        int zzf322 = zzaut.zzf(zzazhVar522.zze());
        zzazhVar522.zzw(zzf322 == 0 ? 8 : 16);
        long zzm222 = zzazhVar522.zzm();
        zzazhVar522.zzw(zzf322 == 0 ? 4 : 8);
        int zzj222 = zzazhVar522.zzj();
        StringBuilder sb22 = new StringBuilder();
        sb22.append((char) (((zzj222 >> 10) & 31) + 96));
        sb22.append((char) (((zzj222 >> 5) & 31) + 96));
        sb22.append((char) ((zzj222 & 31) + 96));
        Pair create222 = Pair.create(Long.valueOf(zzm222), sb22.toString());
        zzazh zzazhVar622 = zza422.zzb(zzaut.zzW).zza;
        i3 = zzauzVar222.zza;
        i4 = zzauzVar222.zzc;
        String str1022 = (String) create222.second;
        zzazhVar622.zzv(12);
        zze2 = zzazhVar622.zze();
        zzauw zzauwVar522 = new zzauw(zze2);
        i5 = 0;
        while (i5 < zze2) {
        }
        zzauwVar = zzauwVar522;
        int i4522 = i;
        Pair pair322 = create222;
        zzauz zzauzVar322 = zzauzVar222;
        zza2 = zzaurVar.zza(zzaut.zzS);
        if (zza2 == null) {
        }
        zzavlVar = null;
        create = Pair.create(null, null);
        if (zzauwVar.zzb == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173 A[LOOP:10: B:59:0x0173->B:60:0x0175, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzavo zzb(zzavl zzavlVar, zzaur zzaurVar, zzaua zzauaVar) throws zzarw {
        zzauv zzauyVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        zzauv zzauvVar;
        long[] jArr3;
        int i9;
        int i10;
        long[] jArr4;
        int[] iArr3;
        long[] jArr5;
        boolean z2;
        int[] iArr4;
        int i11;
        int[] iArr5;
        long[] jArr6;
        int length;
        zzavl zzavlVar2 = zzavlVar;
        zzaus zzb2 = zzaurVar.zzb(zzaut.zzas);
        if (zzb2 != null) {
            zzauyVar = new zzaux(zzb2);
        } else {
            zzaus zzb3 = zzaurVar.zzb(zzaut.zzat);
            if (zzb3 != null) {
                zzauyVar = new zzauy(zzb3);
            } else {
                throw new zzarw("Track has no sample table size information");
            }
        }
        int zza2 = zzauyVar.zza();
        if (zza2 == 0) {
            return new zzavo(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzaus zzb4 = zzaurVar.zzb(zzaut.zzau);
        if (zzb4 == null) {
            zzb4 = zzaurVar.zzb(zzaut.zzav);
            z = true;
        } else {
            z = false;
        }
        zzazh zzazhVar = zzb4.zza;
        zzazh zzazhVar2 = zzaurVar.zzb(zzaut.zzar).zza;
        zzazh zzazhVar3 = zzaurVar.zzb(zzaut.zzao).zza;
        zzaus zzb5 = zzaurVar.zzb(zzaut.zzap);
        zzazh zzazhVar4 = zzb5 != null ? zzb5.zza : null;
        zzaus zzb6 = zzaurVar.zzb(zzaut.zzaq);
        zzazh zzazhVar5 = zzb6 != null ? zzb6.zza : null;
        zzauu zzauuVar = new zzauu(zzazhVar2, zzazhVar, z);
        zzazhVar3.zzv(12);
        int zzi = zzazhVar3.zzi() - 1;
        int zzi2 = zzazhVar3.zzi();
        int zzi3 = zzazhVar3.zzi();
        if (zzazhVar5 != null) {
            zzazhVar5.zzv(12);
            i = zzazhVar5.zzi();
        } else {
            i = 0;
        }
        if (zzazhVar4 != null) {
            zzazhVar4.zzv(12);
            i2 = zzazhVar4.zzi();
            if (i2 > 0) {
                i3 = zzazhVar4.zzi() - 1;
                if (zzauyVar.zzc() && "audio/raw".equals(zzavlVar2.zzf.zzf) && zzi == 0) {
                    if (i != 0 && i2 == 0) {
                        int i12 = zzauuVar.zza;
                        long[] jArr7 = new long[i12];
                        int[] iArr6 = new int[i12];
                        while (zzauuVar.zza()) {
                            int i13 = zzauuVar.zzb;
                            jArr7[i13] = zzauuVar.zzd;
                            iArr6[i13] = zzauuVar.zzc;
                        }
                        int zzb7 = zzauyVar.zzb();
                        long j2 = zzi3;
                        int i14 = 8192 / zzb7;
                        int i15 = 0;
                        for (int i16 = 0; i16 < i12; i16++) {
                            i15 += zzazo.zzd(iArr6[i16], i14);
                        }
                        jArr2 = new long[i15];
                        int[] iArr7 = new int[i15];
                        jArr = new long[i15];
                        int[] iArr8 = new int[i15];
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        while (i17 < i12) {
                            int i21 = iArr6[i17];
                            long j3 = jArr7[i17];
                            int i22 = i18;
                            int i23 = i19;
                            int i24 = i12;
                            int i25 = i23;
                            long[] jArr8 = jArr7;
                            int i26 = i21;
                            while (i26 > 0) {
                                int min = Math.min(i14, i26);
                                jArr2[i20] = j3;
                                int[] iArr9 = iArr6;
                                int i27 = zzb7 * min;
                                iArr7[i20] = i27;
                                int max = Math.max(i22, i27);
                                jArr[i20] = i25 * j2;
                                iArr8[i20] = 1;
                                j3 += iArr7[i20];
                                i25 += min;
                                i26 -= min;
                                i20++;
                                iArr6 = iArr9;
                                i22 = max;
                            }
                            i17++;
                            i18 = i22;
                            jArr7 = jArr8;
                            i19 = i25;
                            i12 = i24;
                        }
                        iArr2 = iArr8;
                        iArr = iArr7;
                        i8 = i18;
                        j = 0;
                        jArr4 = zzavlVar2.zzi;
                        if (jArr4 == null && !zzauaVar.zza()) {
                            if (jArr4.length == 1 && zzavlVar2.zzb == 1 && (length = jArr.length) >= 2) {
                                long j4 = zzavlVar2.zzj[0];
                                long zzj = j4 + zzazo.zzj(jArr4[0], zzavlVar2.zzc, zzavlVar2.zzd);
                                long j5 = jArr[0];
                                if (j5 <= j4 && j4 < jArr[1] && jArr[length - 1] < zzj && zzj <= j) {
                                    long zzj2 = zzazo.zzj(j4 - j5, zzavlVar2.zzf.zzs, zzavlVar2.zzc);
                                    long zzj3 = zzazo.zzj(j - zzj, zzavlVar2.zzf.zzs, zzavlVar2.zzc);
                                    if (zzj2 == 0) {
                                        if (zzj3 != 0) {
                                            zzj2 = 0;
                                        }
                                    }
                                    if (zzj2 <= TTL.MAX_VALUE && zzj3 <= TTL.MAX_VALUE) {
                                        zzauaVar.zzb = (int) zzj2;
                                        zzauaVar.zzc = (int) zzj3;
                                        zzazo.zzn(jArr, 1000000L, zzavlVar2.zzc);
                                        return new zzavo(jArr2, iArr, i8, jArr, iArr2);
                                    }
                                }
                            }
                            long[] jArr9 = zzavlVar2.zzi;
                            if (jArr9.length == 1) {
                                char c = 0;
                                if (jArr9[0] == 0) {
                                    int i28 = 0;
                                    while (i28 < jArr.length) {
                                        jArr[i28] = zzazo.zzj(jArr[i28] - zzavlVar2.zzj[c], 1000000L, zzavlVar2.zzc);
                                        i28++;
                                        c = 0;
                                    }
                                    return new zzavo(jArr2, iArr, i8, jArr, iArr2);
                                }
                            }
                            boolean z3 = zzavlVar2.zzb == 1;
                            int i29 = 0;
                            int i30 = 0;
                            boolean z4 = false;
                            int i31 = 0;
                            while (true) {
                                long[] jArr10 = zzavlVar2.zzi;
                                if (i31 >= jArr10.length) {
                                    break;
                                }
                                int[] iArr10 = iArr;
                                int i32 = i8;
                                long j6 = zzavlVar2.zzj[i31];
                                if (j6 != -1) {
                                    jArr6 = jArr2;
                                    long zzj4 = zzazo.zzj(jArr10[i31], zzavlVar2.zzc, zzavlVar2.zzd);
                                    int zzb8 = zzazo.zzb(jArr, j6, true, true);
                                    int zzb9 = zzazo.zzb(jArr, j6 + zzj4, z3, false);
                                    int i33 = (zzb9 - zzb8) + i29;
                                    z4 = (i30 != zzb8) | z4;
                                    i29 = i33;
                                    i30 = zzb9;
                                } else {
                                    jArr6 = jArr2;
                                }
                                i31++;
                                iArr = iArr10;
                                jArr2 = jArr6;
                                i8 = i32;
                            }
                            long[] jArr11 = jArr2;
                            int[] iArr11 = iArr;
                            int i34 = i8;
                            boolean z5 = (i29 != zza2) | z4;
                            long[] jArr12 = z5 ? new long[i29] : jArr11;
                            int[] iArr12 = z5 ? new int[i29] : iArr11;
                            int i35 = true == z5 ? 0 : i34;
                            int[] iArr13 = z5 ? new int[i29] : iArr2;
                            long[] jArr13 = new long[i29];
                            int i36 = i35;
                            long j7 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            while (true) {
                                long[] jArr14 = zzavlVar2.zzi;
                                if (i37 >= jArr14.length) {
                                    break;
                                }
                                long j8 = j7;
                                long j9 = zzavlVar2.zzj[i37];
                                long j10 = jArr14[i37];
                                if (j9 != -1) {
                                    int[] iArr14 = iArr13;
                                    i11 = i37;
                                    long zzj5 = zzazo.zzj(j10, zzavlVar2.zzc, zzavlVar2.zzd);
                                    int zzb10 = zzazo.zzb(jArr, j9, true, true);
                                    int zzb11 = zzazo.zzb(jArr, zzj5 + j9, z3, false);
                                    if (z5) {
                                        int i39 = zzb11 - zzb10;
                                        System.arraycopy(jArr11, zzb10, jArr12, i38, i39);
                                        iArr3 = iArr11;
                                        System.arraycopy(iArr3, zzb10, iArr12, i38, i39);
                                        z2 = z3;
                                        iArr5 = iArr14;
                                        System.arraycopy(iArr2, zzb10, iArr5, i38, i39);
                                    } else {
                                        iArr3 = iArr11;
                                        z2 = z3;
                                        iArr5 = iArr14;
                                    }
                                    int i40 = i36;
                                    while (zzb10 < zzb11) {
                                        long[] jArr15 = jArr11;
                                        int[] iArr15 = iArr5;
                                        long j11 = j9;
                                        jArr13[i38] = zzazo.zzj(j8, 1000000L, zzavlVar2.zzd) + zzazo.zzj(jArr[zzb10] - j9, 1000000L, zzavlVar2.zzc);
                                        if (z5 && iArr12[i38] > i40) {
                                            i40 = iArr3[zzb10];
                                        }
                                        i38++;
                                        zzb10++;
                                        j9 = j11;
                                        iArr5 = iArr15;
                                        jArr11 = jArr15;
                                    }
                                    jArr5 = jArr11;
                                    iArr4 = iArr5;
                                    i36 = i40;
                                } else {
                                    iArr3 = iArr11;
                                    jArr5 = jArr11;
                                    z2 = z3;
                                    iArr4 = iArr13;
                                    i11 = i37;
                                }
                                j7 = j8 + j10;
                                i37 = i11 + 1;
                                iArr11 = iArr3;
                                iArr13 = iArr4;
                                z3 = z2;
                                jArr11 = jArr5;
                            }
                            int[] iArr16 = iArr13;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                if (i41 < iArr16.length) {
                                    if (i42 != 0) {
                                        break;
                                    }
                                    i42 = iArr16[i41] & 1;
                                    i41++;
                                } else if (i42 == 0) {
                                    throw new zzarw("The edited sample sequence does not contain a sync sample.");
                                }
                            }
                            return new zzavo(jArr12, iArr12, i36, jArr13, iArr16);
                        }
                        zzazo.zzn(jArr, 1000000L, zzavlVar2.zzc);
                        return new zzavo(jArr2, iArr, i8, jArr, iArr2);
                    }
                    zzi = 0;
                }
                long[] jArr16 = new long[zza2];
                int[] iArr17 = new int[zza2];
                long[] jArr17 = new long[zza2];
                i4 = i2;
                int[] iArr18 = new int[zza2];
                long j12 = 0;
                j = 0;
                i5 = 0;
                i6 = 0;
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                while (i6 < zza2) {
                    while (i44 == 0) {
                        zzayz.zze(zzauuVar.zza());
                        j12 = zzauuVar.zzd;
                        i44 = zzauuVar.zzc;
                        zzi2 = zzi2;
                        zzi3 = zzi3;
                    }
                    int i46 = zzi2;
                    int i47 = zzi3;
                    if (zzazhVar5 != null) {
                        while (true) {
                            if (i43 != 0) {
                                break;
                            }
                            if (i <= 0) {
                                i43 = 0;
                                break;
                            }
                            i43 = zzazhVar5.zzi();
                            i45 = zzazhVar5.zze();
                            i--;
                        }
                        i43--;
                    }
                    int i48 = i45;
                    jArr16[i6] = j12;
                    int zzb12 = zzauyVar.zzb();
                    iArr17[i6] = zzb12;
                    if (zzb12 > i5) {
                        jArr3 = jArr16;
                        i5 = zzb12;
                        zzauvVar = zzauyVar;
                    } else {
                        zzauvVar = zzauyVar;
                        jArr3 = jArr16;
                    }
                    jArr17[i6] = j + i48;
                    iArr18[i6] = zzazhVar4 == null ? 1 : 0;
                    if (i6 == i3) {
                        iArr18[i6] = 1;
                        i4--;
                        if (i4 > 0) {
                            i3 = zzazhVar4.zzi() - 1;
                        }
                    }
                    int[] iArr19 = iArr18;
                    j += i47;
                    int i49 = i46 - 1;
                    if (i49 != 0) {
                        i9 = i47;
                        i10 = i49;
                    } else if (zzi > 0) {
                        i10 = zzazhVar3.zzi();
                        i9 = zzazhVar3.zzi();
                        zzi--;
                    } else {
                        i9 = i47;
                        i10 = 0;
                    }
                    int i50 = i10;
                    int i51 = i9;
                    j12 += iArr17[i6];
                    i44--;
                    i6++;
                    zzauyVar = zzauvVar;
                    jArr16 = jArr3;
                    iArr18 = iArr19;
                    zzi3 = i51;
                    i45 = i48;
                    zzi2 = i50;
                }
                long[] jArr18 = jArr16;
                int[] iArr20 = iArr18;
                int i52 = zzi2;
                zzayz.zzc(i43 != 0);
                while (i > 0) {
                    zzayz.zzc(zzazhVar5.zzi() == 0);
                    zzazhVar5.zze();
                    i--;
                }
                if (i4 != 0 && i52 == 0 && i44 == 0 && zzi == 0) {
                    i7 = i5;
                    zzavlVar2 = zzavlVar;
                } else {
                    i7 = i5;
                    zzavlVar2 = zzavlVar;
                    int i53 = zzavlVar2.zza;
                }
                i8 = i7;
                iArr = iArr17;
                jArr = jArr17;
                jArr2 = jArr18;
                iArr2 = iArr20;
                jArr4 = zzavlVar2.zzi;
                if (jArr4 == null) {
                }
                zzazo.zzn(jArr, 1000000L, zzavlVar2.zzc);
                return new zzavo(jArr2, iArr, i8, jArr, iArr2);
            }
            zzazhVar4 = null;
        } else {
            i2 = 0;
        }
        i3 = -1;
        if (zzauyVar.zzc()) {
            if (i != 0) {
            }
            zzi = 0;
        }
        long[] jArr162 = new long[zza2];
        int[] iArr172 = new int[zza2];
        long[] jArr172 = new long[zza2];
        i4 = i2;
        int[] iArr182 = new int[zza2];
        long j122 = 0;
        j = 0;
        i5 = 0;
        i6 = 0;
        int i432 = 0;
        int i442 = 0;
        int i452 = 0;
        while (i6 < zza2) {
        }
        long[] jArr182 = jArr162;
        int[] iArr202 = iArr182;
        int i522 = zzi2;
        zzayz.zzc(i432 != 0);
        while (i > 0) {
        }
        if (i4 != 0) {
        }
        i7 = i5;
        zzavlVar2 = zzavlVar;
        int i532 = zzavlVar2.zza;
        i8 = i7;
        iArr = iArr172;
        jArr = jArr172;
        jArr2 = jArr182;
        iArr2 = iArr202;
        jArr4 = zzavlVar2.zzi;
        if (jArr4 == null) {
        }
        zzazo.zzn(jArr, 1000000L, zzavlVar2.zzc);
        return new zzavo(jArr2, iArr, i8, jArr, iArr2);
    }

    public static zzawe zzc(zzaus zzausVar, boolean z) {
        if (z) {
            return null;
        }
        zzazh zzazhVar = zzausVar.zza;
        zzazhVar.zzv(8);
        while (zzazhVar.zza() >= 8) {
            int zzc2 = zzazhVar.zzc();
            int zze2 = zzazhVar.zze();
            if (zzazhVar.zze() == zzaut.zzaD) {
                zzazhVar.zzv(zzc2);
                int i = zzc2 + zze2;
                zzazhVar.zzw(12);
                while (zzazhVar.zzc() < i) {
                    int zzc3 = zzazhVar.zzc();
                    int zze3 = zzazhVar.zze();
                    if (zzazhVar.zze() == zzaut.zzaE) {
                        zzazhVar.zzv(zzc3);
                        int i2 = zzc3 + zze3;
                        zzazhVar.zzw(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzazhVar.zzc() < i2) {
                            zzawd zza2 = zzavg.zza(zzazhVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzawe(arrayList);
                    }
                    zzazhVar.zzw(zze3 - 8);
                }
                return null;
            }
            zzazhVar.zzw(zze2 - 8);
        }
        return null;
    }

    private static int zzd(zzazh zzazhVar) {
        int zzg2 = zzazhVar.zzg();
        int i = zzg2 & 127;
        while ((zzg2 & 128) == 128) {
            zzg2 = zzazhVar.zzg();
            i = (i << 7) | (zzg2 & 127);
        }
        return i;
    }

    private static int zze(zzazh zzazhVar, int i, int i2, zzauw zzauwVar, int i3) {
        int zzc2 = zzazhVar.zzc();
        while (true) {
            if (zzc2 - i >= i2) {
                return 0;
            }
            zzazhVar.zzv(zzc2);
            int zze2 = zzazhVar.zze();
            zzayz.zzd(zze2 > 0, "childAtomSize should be positive");
            if (zzazhVar.zze() == zzaut.zzY) {
                int i4 = zzc2 + 8;
                Pair pair = null;
                Integer num = null;
                zzavm zzavmVar = null;
                boolean z = false;
                while (i4 - zzc2 < zze2) {
                    zzazhVar.zzv(i4);
                    int zze3 = zzazhVar.zze();
                    int zze4 = zzazhVar.zze();
                    if (zze4 == zzaut.zzae) {
                        num = Integer.valueOf(zzazhVar.zze());
                    } else if (zze4 == zzaut.zzZ) {
                        zzazhVar.zzw(4);
                        z = zzazhVar.zze() == zzg;
                    } else if (zze4 == zzaut.zzaa) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= zze3) {
                                zzavmVar = null;
                                break;
                            }
                            zzazhVar.zzv(i5);
                            int zze5 = zzazhVar.zze();
                            if (zzazhVar.zze() == zzaut.zzab) {
                                zzazhVar.zzw(6);
                                boolean z2 = zzazhVar.zzg() == 1;
                                int zzg2 = zzazhVar.zzg();
                                byte[] bArr = new byte[16];
                                zzazhVar.zzq(bArr, 0, 16);
                                zzavmVar = new zzavm(z2, zzg2, bArr);
                            } else {
                                i5 += zze5;
                            }
                        }
                    }
                    i4 += zze3;
                }
                if (z) {
                    zzayz.zzd(num != null, "frma atom is mandatory");
                    zzayz.zzd(zzavmVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzavmVar);
                }
                if (pair != null) {
                    zzauwVar.zza[i3] = (zzavm) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzc2 += zze2;
        }
    }

    private static Pair zzf(zzazh zzazhVar, int i) {
        zzazhVar.zzv(i + 12);
        zzazhVar.zzw(1);
        zzd(zzazhVar);
        zzazhVar.zzw(2);
        int zzg2 = zzazhVar.zzg();
        if ((zzg2 & 128) != 0) {
            zzazhVar.zzw(2);
        }
        if ((zzg2 & 64) != 0) {
            zzazhVar.zzw(zzazhVar.zzj());
        }
        if ((zzg2 & 32) != 0) {
            zzazhVar.zzw(2);
        }
        zzazhVar.zzw(1);
        zzd(zzazhVar);
        int zzg3 = zzazhVar.zzg();
        String str = null;
        if (zzg3 == 32) {
            str = "video/mp4v-es";
        } else if (zzg3 == 33) {
            str = "video/avc";
        } else if (zzg3 != 35) {
            if (zzg3 != 64) {
                if (zzg3 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (zzg3 == 165) {
                    str = "audio/ac3";
                } else if (zzg3 != 166) {
                    switch (zzg3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (zzg3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzazhVar.zzw(12);
        zzazhVar.zzw(1);
        int zzd2 = zzd(zzazhVar);
        byte[] bArr = new byte[zzd2];
        zzazhVar.zzq(bArr, 0, zzd2);
        return Pair.create(str, bArr);
    }
}