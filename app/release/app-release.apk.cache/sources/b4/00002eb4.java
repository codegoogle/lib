package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.anythink.expressad.foundation.g.a;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.u0;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzqx {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    @k1("MediaCodecUtil.class")
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzqr {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzqf zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzeg.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x042a, code lost:
        if (r1.equals("L150") != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02bb A[Catch: NumberFormatException -> 0x02cb, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x02cb, blocks: (B:148:0x0260, B:150:0x0272, B:161:0x028e, B:177:0x02bb), top: B:488:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzb(zzad zzadVar) {
        char c;
        int parseInt;
        int parseInt2;
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c2;
        Integer num2;
        Integer num3;
        String str = zzadVar.zzj;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i10 = 2048;
        int i11 = 2;
        int i12 = 1;
        if ("video/dolby-vision".equals(zzadVar.zzm)) {
            String str2 = zzadVar.zzj;
            if (split.length < 3) {
                "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2));
            } else {
                Matcher matcher = zzb.matcher(split[1]);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            "Unknown Dolby Vision profile string: ".concat(String.valueOf(group));
                        } else {
                            String str3 = split[2];
                            if (str3 != null) {
                                int hashCode = str3.hashCode();
                                switch (hashCode) {
                                    case 1537:
                                        if (str3.equals("01")) {
                                            num3 = 1;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str3.equals("02")) {
                                            num3 = 2;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (str3.equals("03")) {
                                            num3 = 4;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (str3.equals("04")) {
                                            num3 = 8;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (str3.equals("05")) {
                                            num3 = 16;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (str3.equals("06")) {
                                            num3 = 32;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (str3.equals("07")) {
                                            num3 = 64;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (str3.equals("08")) {
                                            num3 = 128;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (str3.equals("09")) {
                                            num3 = 256;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1567:
                                                if (str3.equals("10")) {
                                                    num3 = 512;
                                                    break;
                                                }
                                                break;
                                            case 1568:
                                                if (str3.equals("11")) {
                                                    num3 = 1024;
                                                    break;
                                                }
                                                break;
                                            case 1569:
                                                if (str3.equals("12")) {
                                                    num3 = 2048;
                                                    break;
                                                }
                                                break;
                                            case 1570:
                                                if (str3.equals("13")) {
                                                    num3 = 4096;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                                if (num3 != null) {
                                    "Unknown Dolby Vision level string: ".concat(String.valueOf(str3));
                                } else {
                                    return new Pair(num2, num3);
                                }
                            }
                            num3 = null;
                            if (num3 != null) {
                            }
                        }
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                } else {
                    "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2));
                }
            }
            return null;
        }
        String str4 = split[0];
        switch (str4.hashCode()) {
            case 3004662:
                if (str4.equals("av01")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3006243:
                if (str4.equals("avc1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3624515:
                if (str4.equals("vp09")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                String str5 = zzadVar.zzj;
                int length = split.length;
                if (length < 2) {
                    "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5));
                } else {
                    try {
                        if (split[1].length() == 6) {
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else if (length >= 3) {
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        }
                        if (parseInt == 66) {
                            i = -1;
                            i11 = 1;
                        } else if (parseInt == 77) {
                            i = -1;
                        } else if (parseInt == 88) {
                            i = -1;
                            i11 = 4;
                        } else if (parseInt == 100) {
                            i = -1;
                            i11 = 8;
                        } else if (parseInt == 110) {
                            i = -1;
                            i11 = 16;
                        } else if (parseInt == 122) {
                            i = -1;
                            i11 = 32;
                        } else if (parseInt != 244) {
                            i = -1;
                            i11 = -1;
                        } else {
                            i = -1;
                            i11 = 64;
                        }
                        if (i11 != i) {
                            switch (parseInt2) {
                                case 10:
                                    i2 = -1;
                                    break;
                                case 11:
                                    i2 = -1;
                                    i12 = 4;
                                    break;
                                case 12:
                                    i2 = -1;
                                    i12 = 8;
                                    break;
                                case 13:
                                    i2 = -1;
                                    i12 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i2 = -1;
                                            i12 = 32;
                                            break;
                                        case 21:
                                            i2 = -1;
                                            i12 = 64;
                                            break;
                                        case 22:
                                            i2 = -1;
                                            i12 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i2 = -1;
                                                    i12 = 256;
                                                    break;
                                                case 31:
                                                    i2 = -1;
                                                    i12 = 512;
                                                    break;
                                                case 32:
                                                    i2 = -1;
                                                    i12 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i2 = -1;
                                                            i12 = 2048;
                                                            break;
                                                        case 41:
                                                            i2 = -1;
                                                            i12 = 4096;
                                                            break;
                                                        case 42:
                                                            i2 = -1;
                                                            i12 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i12 = 16384;
                                                                    i2 = -1;
                                                                    break;
                                                                case 51:
                                                                    i12 = 32768;
                                                                    i2 = -1;
                                                                    break;
                                                                case 52:
                                                                    i12 = 65536;
                                                                    i2 = -1;
                                                                    break;
                                                                default:
                                                                    i2 = -1;
                                                                    i12 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i12 != i2) {
                                return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
                            }
                        }
                    } catch (NumberFormatException unused) {
                        "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5));
                    }
                }
                return null;
            case 2:
                String str6 = zzadVar.zzj;
                if (split.length < 3) {
                    "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6));
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i13 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i13 != -1) {
                            if (parseInt4 == 10) {
                                i3 = -1;
                                i10 = 1;
                            } else if (parseInt4 == 11) {
                                i3 = -1;
                                i10 = 2;
                            } else if (parseInt4 == 20) {
                                i3 = -1;
                                i10 = 4;
                            } else if (parseInt4 == 21) {
                                i3 = -1;
                                i10 = 8;
                            } else if (parseInt4 == 30) {
                                i3 = -1;
                                i10 = 16;
                            } else if (parseInt4 == 31) {
                                i3 = -1;
                                i10 = 32;
                            } else if (parseInt4 == 40) {
                                i3 = -1;
                                i10 = 64;
                            } else if (parseInt4 == 41) {
                                i3 = -1;
                                i10 = 128;
                            } else if (parseInt4 == 50) {
                                i3 = -1;
                                i10 = 256;
                            } else if (parseInt4 != 51) {
                                switch (parseInt4) {
                                    case 60:
                                        i3 = -1;
                                        break;
                                    case 61:
                                        i3 = -1;
                                        i10 = 4096;
                                        break;
                                    case 62:
                                        i3 = -1;
                                        i10 = 8192;
                                        break;
                                    default:
                                        i3 = -1;
                                        i10 = -1;
                                        break;
                                }
                            } else {
                                i3 = -1;
                                i10 = 512;
                            }
                            if (i10 != i3) {
                                return new Pair(Integer.valueOf(i13), Integer.valueOf(i10));
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6));
                    }
                }
                return null;
            case 3:
            case 4:
                char c3 = 7;
                String str7 = zzadVar.zzj;
                if (split.length < 4) {
                    "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str7));
                } else {
                    Matcher matcher2 = zzb.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            i4 = 1;
                        } else if ("2".equals(group2)) {
                            i4 = 2;
                        } else {
                            "Unknown HEVC profile string: ".concat(String.valueOf(group2));
                        }
                        String str8 = split[3];
                        if (str8 != null) {
                            switch (str8.hashCode()) {
                                case 70821:
                                    if (str8.equals("H30")) {
                                        c3 = '\r';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 70914:
                                    if (str8.equals("H60")) {
                                        c3 = 14;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 70917:
                                    if (str8.equals("H63")) {
                                        c3 = 15;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 71007:
                                    if (str8.equals("H90")) {
                                        c3 = 16;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 71010:
                                    if (str8.equals("H93")) {
                                        c3 = 17;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74665:
                                    if (str8.equals("L30")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74758:
                                    if (str8.equals("L60")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74761:
                                    if (str8.equals("L63")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74851:
                                    if (str8.equals("L90")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74854:
                                    if (str8.equals("L93")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193639:
                                    if (str8.equals("H120")) {
                                        c3 = 18;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193642:
                                    if (str8.equals("H123")) {
                                        c3 = 19;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193732:
                                    if (str8.equals("H150")) {
                                        c3 = 20;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193735:
                                    if (str8.equals("H153")) {
                                        c3 = 21;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193738:
                                    if (str8.equals("H156")) {
                                        c3 = 22;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193825:
                                    if (str8.equals("H180")) {
                                        c3 = 23;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193828:
                                    if (str8.equals("H183")) {
                                        c3 = 24;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193831:
                                    if (str8.equals("H186")) {
                                        c3 = 25;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312803:
                                    if (str8.equals("L120")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312806:
                                    if (str8.equals("L123")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312896:
                                    break;
                                case 2312899:
                                    if (str8.equals("L153")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312902:
                                    if (str8.equals("L156")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312989:
                                    if (str8.equals("L180")) {
                                        c3 = '\n';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312992:
                                    if (str8.equals("L183")) {
                                        c3 = 11;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312995:
                                    if (str8.equals("L186")) {
                                        c3 = '\f';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    num = 1;
                                    break;
                                case 1:
                                    num = 4;
                                    break;
                                case 2:
                                    num = 16;
                                    break;
                                case 3:
                                    num = 64;
                                    break;
                                case 4:
                                    num = 256;
                                    break;
                                case 5:
                                    num = 1024;
                                    break;
                                case 6:
                                    num = 4096;
                                    break;
                                case 7:
                                    num = 16384;
                                    break;
                                case '\b':
                                    num = 65536;
                                    break;
                                case '\t':
                                    num = 262144;
                                    break;
                                case '\n':
                                    num = 1048576;
                                    break;
                                case 11:
                                    num = 4194304;
                                    break;
                                case '\f':
                                    num = 16777216;
                                    break;
                                case '\r':
                                    num = 2;
                                    break;
                                case 14:
                                    num = 8;
                                    break;
                                case 15:
                                    num = 32;
                                    break;
                                case 16:
                                    num = 128;
                                    break;
                                case 17:
                                    num = 512;
                                    break;
                                case 18:
                                    num = 2048;
                                    break;
                                case 19:
                                    num = 8192;
                                    break;
                                case 20:
                                    num = 32768;
                                    break;
                                case 21:
                                    num = 131072;
                                    break;
                                case 22:
                                    num = 524288;
                                    break;
                                case 23:
                                    num = 2097152;
                                    break;
                                case 24:
                                    num = 8388608;
                                    break;
                                case 25:
                                    num = 33554432;
                                    break;
                            }
                            if (num != null) {
                                "Unknown HEVC level string: ".concat(String.valueOf(str8));
                            } else {
                                return new Pair(Integer.valueOf(i4), num);
                            }
                        }
                        num = null;
                        if (num != null) {
                        }
                    } else {
                        "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str7));
                    }
                }
                return null;
            case 5:
                String str9 = zzadVar.zzj;
                zzo zzoVar = zzadVar.zzy;
                if (split.length < 4) {
                    "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9));
                } else {
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 == 0) {
                            if (parseInt7 == 8) {
                                i5 = 1;
                            } else if (parseInt7 == 10) {
                                i5 = (zzoVar == null || !(zzoVar.zze != null || (i7 = zzoVar.zzd) == 7 || i7 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i6 = -1;
                                    break;
                                case 1:
                                    i6 = -1;
                                    i12 = 2;
                                    break;
                                case 2:
                                    i6 = -1;
                                    i12 = 4;
                                    break;
                                case 3:
                                    i6 = -1;
                                    i12 = 8;
                                    break;
                                case 4:
                                    i6 = -1;
                                    i12 = 16;
                                    break;
                                case 5:
                                    i6 = -1;
                                    i12 = 32;
                                    break;
                                case 6:
                                    i6 = -1;
                                    i12 = 64;
                                    break;
                                case 7:
                                    i6 = -1;
                                    i12 = 128;
                                    break;
                                case 8:
                                    i6 = -1;
                                    i12 = 256;
                                    break;
                                case 9:
                                    i6 = -1;
                                    i12 = 512;
                                    break;
                                case 10:
                                    i6 = -1;
                                    i12 = 1024;
                                    break;
                                case 11:
                                    i6 = -1;
                                    i12 = 2048;
                                    break;
                                case 12:
                                    i6 = -1;
                                    i12 = 4096;
                                    break;
                                case 13:
                                    i6 = -1;
                                    i12 = 8192;
                                    break;
                                case 14:
                                    i12 = 16384;
                                    i6 = -1;
                                    break;
                                case 15:
                                    i12 = 32768;
                                    i6 = -1;
                                    break;
                                case 16:
                                    i12 = 65536;
                                    i6 = -1;
                                    break;
                                case 17:
                                    i12 = 131072;
                                    i6 = -1;
                                    break;
                                case 18:
                                    i12 = 262144;
                                    i6 = -1;
                                    break;
                                case 19:
                                    i12 = 524288;
                                    i6 = -1;
                                    break;
                                case 20:
                                    i12 = 1048576;
                                    i6 = -1;
                                    break;
                                case 21:
                                    i12 = 2097152;
                                    i6 = -1;
                                    break;
                                case 22:
                                    i12 = 4194304;
                                    i6 = -1;
                                    break;
                                case 23:
                                    i12 = 8388608;
                                    i6 = -1;
                                    break;
                                default:
                                    i6 = -1;
                                    i12 = -1;
                                    break;
                            }
                            if (i12 != i6) {
                                return new Pair(Integer.valueOf(i5), Integer.valueOf(i12));
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9));
                    }
                }
                return null;
            case 6:
                String str10 = zzadVar.zzj;
                if (split.length != 3) {
                    "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str10));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(zzbo.zzd(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 != 17) {
                                if (parseInt8 == 20) {
                                    i9 = -1;
                                    i8 = 20;
                                } else if (parseInt8 == 23) {
                                    i8 = 23;
                                } else if (parseInt8 == 29) {
                                    i8 = 29;
                                } else if (parseInt8 == 39) {
                                    i8 = 39;
                                } else if (parseInt8 != 42) {
                                    switch (parseInt8) {
                                        case 1:
                                            i9 = -1;
                                            i8 = 1;
                                            break;
                                        case 2:
                                            i9 = -1;
                                            i8 = 2;
                                            break;
                                        case 3:
                                            i9 = -1;
                                            i8 = 3;
                                            break;
                                        case 4:
                                            i9 = -1;
                                            i8 = 4;
                                            break;
                                        case 5:
                                            i9 = -1;
                                            i8 = 5;
                                            break;
                                        case 6:
                                            i9 = -1;
                                            i8 = 6;
                                            break;
                                        default:
                                            i9 = -1;
                                            i8 = -1;
                                            break;
                                    }
                                } else {
                                    i8 = 42;
                                }
                                if (i8 != i9) {
                                    return new Pair(Integer.valueOf(i8), 0);
                                }
                            } else {
                                i8 = 17;
                            }
                            i9 = -1;
                            if (i8 != i9) {
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str10));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    @z1
    public static zzqf zzc(String str, boolean z, boolean z2) throws zzqr {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqf) zzf.get(0);
    }

    @z1
    public static zzqf zzd() throws zzqr {
        return zzc("audio/raw", false, false);
    }

    @z1
    public static String zze(zzad zzadVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzadVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzadVar.zzm) || (zzb2 = zzb(zzadVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzqr {
        zzqs zzquVar;
        synchronized (zzqx.class) {
            zzqp zzqpVar = new zzqp(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzqpVar);
            if (list != null) {
                return list;
            }
            int i = zzeg.zza;
            if (i >= 21) {
                zzquVar = new zzqv(z, z2);
            } else {
                zzquVar = new zzqu(null);
            }
            ArrayList zzh = zzh(zzqpVar, zzquVar);
            if (z && zzh.isEmpty() && i >= 21 && i <= 23) {
                zzh = zzh(zzqpVar, new zzqu(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzqf) zzh.get(0)).zza;
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && zzeg.zzb.equals("R9") && zzh.size() == 1 && ((zzqf) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqf.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, zzqn.zza);
            }
            if (i < 21 && zzh.size() > 1) {
                String str3 = ((zzqf) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzh, zzqo.zza);
                }
            }
            if (i < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqf) zzh.get(0)).zza)) {
                zzh.add((zzqf) zzh.remove(0));
            }
            zzfrj zzm = zzfrj.zzm(zzh);
            hashMap.put(zzqpVar, zzm);
            return zzm;
        }
    }

    @u0
    public static List zzg(List list, final zzad zzadVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzqw() { // from class: com.google.android.gms.internal.ads.zzql
            @Override // com.google.android.gms.internal.ads.zzqw
            public final int zza(Object obj) {
                zzad zzadVar2 = zzad.this;
                zzqf zzqfVar = (zzqf) obj;
                int i = zzqx.zza;
                try {
                    return !zzqfVar.zzd(zzadVar2) ? 0 : 1;
                } catch (zzqr unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        if ("SCV31".equals(r11) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        if (r8.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e8 A[Catch: Exception -> 0x0281, TryCatch #2 {Exception -> 0x0281, blocks: (B:116:0x01b7, B:122:0x01ce, B:128:0x01e2, B:130:0x01e8, B:135:0x01fa, B:137:0x0202, B:147:0x022c, B:150:0x0232, B:138:0x0207, B:140:0x0217, B:142:0x021f, B:131:0x01ef), top: B:178:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ef A[Catch: Exception -> 0x0281, TryCatch #2 {Exception -> 0x0281, blocks: (B:116:0x01b7, B:122:0x01ce, B:128:0x01e2, B:130:0x01e8, B:135:0x01fa, B:137:0x0202, B:147:0x022c, B:150:0x0232, B:138:0x0207, B:140:0x0217, B:142:0x021f, B:131:0x01ef), top: B:178:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0202 A[Catch: Exception -> 0x0281, TryCatch #2 {Exception -> 0x0281, blocks: (B:116:0x01b7, B:122:0x01ce, B:128:0x01e2, B:130:0x01e8, B:135:0x01fa, B:137:0x0202, B:147:0x022c, B:150:0x0232, B:138:0x0207, B:140:0x0217, B:142:0x021f, B:131:0x01ef), top: B:178:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0207 A[Catch: Exception -> 0x0281, TryCatch #2 {Exception -> 0x0281, blocks: (B:116:0x01b7, B:122:0x01ce, B:128:0x01e2, B:130:0x01e8, B:135:0x01fa, B:137:0x0202, B:147:0x022c, B:150:0x0232, B:138:0x0207, B:140:0x0217, B:142:0x021f, B:131:0x01ef), top: B:178:0x01b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzqp zzqpVar, zzqs zzqsVar) throws zzqr {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd2;
        boolean zzc2;
        int i3;
        boolean z;
        boolean zzj;
        boolean z2;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = zzqpVar.zza;
            int zza2 = zzqsVar.zza();
            boolean zze = zzqsVar.zze();
            int i4 = 0;
            while (i4 < zza2) {
                MediaCodecInfo zzb2 = zzqsVar.zzb(i4);
                int i5 = zzeg.zza;
                if (i5 < 29 || !zzb2.isAlias()) {
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && ((zze || !name.endsWith(".secure")) && (i5 >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))))) {
                        if (i5 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzeg.zzc))) {
                            String str5 = zzeg.zzb;
                            if (!str5.startsWith("zeroflte")) {
                                if (!str5.startsWith("zerolte")) {
                                    if (!str5.startsWith("zenlte")) {
                                        if (!"SC-05G".equals(str5)) {
                                            if (!"marinelteatt".equals(str5)) {
                                                if (!"404SC".equals(str5)) {
                                                    if (!"SC-04G".equals(str5)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i5 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzeg.zzc)) {
                            String str6 = zzeg.zzb;
                            if (!str6.startsWith(a.O)) {
                                if (!str6.startsWith("serrano")) {
                                    if (!str6.startsWith("jflte")) {
                                        if (!str6.startsWith("santos")) {
                                        }
                                    }
                                }
                            }
                        }
                        if ((i5 > 19 || !zzeg.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (i5 > 23 || !"audio/eac3-joc".equals(str4) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                            String[] supportedTypes = zzb2.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    str2 = supportedTypes[i6];
                                    if (str2.equalsIgnoreCase(str4)) {
                                        break;
                                    }
                                    i6++;
                                } else if (str4.equals("video/dolby-vision")) {
                                    if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        str = "video/hevcdv";
                                    } else {
                                        if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            str = "video/dv_hevc";
                                        }
                                        str2 = null;
                                    }
                                    str2 = str;
                                } else {
                                    if (str4.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                        str = "audio/x-lg-alac";
                                    } else if (str4.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        str = "audio/x-lg-flac";
                                    } else {
                                        if (str4.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                            str = "audio/lg-ac3";
                                        }
                                        str2 = null;
                                    }
                                    str2 = str;
                                }
                            }
                            if (str2 != null) {
                                try {
                                    capabilitiesForType = zzb2.getCapabilitiesForType(str2);
                                    zzd2 = zzqsVar.zzd("tunneled-playback", str2, capabilitiesForType);
                                    zzc2 = zzqsVar.zzc("tunneled-playback", str2, capabilitiesForType);
                                } catch (Exception e) {
                                    e = e;
                                    i = i4;
                                    i2 = zza2;
                                    str3 = str4;
                                }
                                if (zzqpVar.zzc) {
                                    if (!zzd2) {
                                    }
                                    boolean zzd3 = zzqsVar.zzd("secure-playback", str2, capabilitiesForType);
                                    boolean zzc3 = zzqsVar.zzc("secure-playback", str2, capabilitiesForType);
                                    if (zzqpVar.zzb) {
                                    }
                                    i4 = i + 1;
                                    zza2 = i2;
                                    str4 = str3;
                                } else if (!zzc2) {
                                    boolean zzd32 = zzqsVar.zzd("secure-playback", str2, capabilitiesForType);
                                    boolean zzc32 = zzqsVar.zzc("secure-playback", str2, capabilitiesForType);
                                    if (zzqpVar.zzb) {
                                        if (!zzc32) {
                                            i3 = zzeg.zza;
                                            if (i3 < 29) {
                                                z = zzb2.isHardwareAccelerated();
                                            } else {
                                                z = !zzj(zzb2, str4);
                                            }
                                            zzj = zzj(zzb2, str4);
                                            if (i3 < 29) {
                                                z2 = zzb2.isVendor();
                                            } else {
                                                String zza3 = zzfoc.zza(zzb2.getName());
                                                z2 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                            }
                                            if ((zze || zzqpVar.zzb != zzd32) && (zze || zzqpVar.zzb)) {
                                                i = i4;
                                                i2 = zza2;
                                                str3 = str4;
                                                if (!zze && zzd32) {
                                                    arrayList.add(zzqf.zzc(name + ".secure", str3, str2, capabilitiesForType, z, zzj, z2, false, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i = i4;
                                                i2 = zza2;
                                                str3 = str4;
                                                try {
                                                    arrayList.add(zzqf.zzc(name, str4, str2, capabilitiesForType, z, zzj, z2, false, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    if (zzeg.zza > 23 || arrayList.isEmpty()) {
                                                        throw e;
                                                    }
                                                    i4 = i + 1;
                                                    zza2 = i2;
                                                    str4 = str3;
                                                }
                                            }
                                        }
                                    } else if (zzd32) {
                                        zzd32 = true;
                                        i3 = zzeg.zza;
                                        if (i3 < 29) {
                                        }
                                        zzj = zzj(zzb2, str4);
                                        if (i3 < 29) {
                                        }
                                        if (zze) {
                                        }
                                        i = i4;
                                        i2 = zza2;
                                        str3 = str4;
                                        if (!zze) {
                                            arrayList.add(zzqf.zzc(name + ".secure", str3, str2, capabilitiesForType, z, zzj, z2, false, true));
                                            return arrayList;
                                        }
                                        continue;
                                    }
                                    i4 = i + 1;
                                    zza2 = i2;
                                    str4 = str3;
                                }
                            }
                        }
                    }
                }
                i = i4;
                i2 = zza2;
                str3 = str4;
                i4 = i + 1;
                zza2 = i2;
                str4 = str3;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new zzqr(e3, null);
        }
    }

    private static void zzi(List list, final zzqw zzqwVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzqm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzqw zzqwVar2 = zzqw.this;
                int i = zzqx.zza;
                return zzqwVar2.zza(obj2) - zzqwVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzeg.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbo.zzg(str)) {
            return true;
        }
        String zza2 = zzfoc.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}