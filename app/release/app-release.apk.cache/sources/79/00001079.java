package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.yg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Dt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0615Dt {
    public static int A00;
    public static byte[] A01;
    public static String[] A02;
    public static final SparseIntArray A03;
    public static final SparseIntArray A04;
    public static final C0604Di A05;
    public static final HashMap<C0612Dq, List<C0604Di>> A06;
    public static final Map<String, Integer> A07;
    public static final Pattern A08;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{-73, -65, -87, -79, -17, -22, -14, -11, -18, -19, -87, -3, -8, -87, -6, -2, -18, -5, 2, -87, -20, -22, -7, -22, -21, -14, -11, -14, -3, -14, -18, -4, -78, -115, -59, -73, -40, 10, 10, 12, 4, 0, 5, -2, -47, -73, -40, 29, 15, 13, 31, 28, 15, -46, -83, -58, -62, -58, -27, -43, -67, -67, -65, -64, bx.j7, -33, -21, -32, bx.j7, -18, -22, -40, -36, -41, -37, -105, -123, -119, -124, -119, -10, -28, -23, -29, -25, -78, -96, -91, -97, -92, -18, bx.j7, bx.j7, -37, -35, -107, -120, -120, -126, -123, -11, -24, -24, -30, -24, -53, -66, -66, -71, -66, -75, -69, -62, -77, -77, -75, -74, -41, -43, bx.j7, -42, -41, -28, -16, -10, -3, -18, -6, -1, -5, -17, -15, 18, 16, 28, 17, 18, 31, -80, -74, -67, -70, -67, -96, -79, -46, -48, -36, -47, -46, -33, -76, -70, -63, -57, -32, -29, -45, -38, -28, -75, -42, -44, -32, -43, -42, -29, -77, -50, -42, bx.l7, -46, -47, -115, bx.j7, -36, -115, -34, -30, -46, -33, -26, -115, -48, -36, -47, -46, -48, -115, -7, -30, -29, bx.j7, -55, -78, -77, -76, -70, -93, -89, -94, -4, -27, -23, -25, -93, -116, -112, -111, 10, -13, -6, -14, -71, -94, -87, -92, -16, bx.l7, -32, -34, -5, -26, -29, -10, -28, -34, -48, -66, -69, 18, 3, -6, -47, -62, -68, -86, -81, Flags.CD, 41, 48, 49, 52, 43, 48, 41, -30, 47, 35, 46, 40, 49, 52, 47, 39, 38, -30, 3, 24, 5, -30, 37, 49, 38, 39, 37, -30, 53, 54, 52, 43, 48, 41, -4, -30, -36, -6, 1, 2, 5, -4, 1, -6, -77, 0, -12, -1, -7, 2, 5, 0, -8, -9, -77, -37, -40, -23, -42, -77, -10, 2, -9, -8, -10, -77, 6, 7, 5, -4, 1, -6, -51, -77, -34, -61, -60, -62, -78, -105, -104, -103, -24, -51, -47, -52, -82, -109, -105, -107, -17, -44, -40, bx.l7, -70, -97, -90, -98, -66, -93, -86, -91, -81, -108, -101, -103, -42, -67, -70, 4, -21, -18, 32, -93, -115, -121, -21, -43, -46, -37, -56, -65, -15, -34, -40, -62, -59, -88, -71, -38, -40, -28, bx.l7, -38, -25, 7, 31, 30, 35, 27, -3, 41, 30, 31, 29, 6, 35, 45, 46, -38, -5, 10, 3, -38, 30, 35, 30, 40, bx.j7, 46, -38, 38, 35, 45, 46, -38, 45, 31, 29, 47, 44, 31, -38, 30, 31, 29, 41, 30, 31, 44, -38, 32, 41, 44, -12, -38, -28, -4, -5, 0, -8, -38, 6, -5, -4, -6, -20, Flags.CD, 0, 3, -91, -68, -49, -52, -54, 119, -120, -121, -10, -21, -7, -10, -16, -21, -44, -1, -4, -38, -77, -79, -68, -110, -87, -36, -35, -46, -45, -41, -110, -91, -91, -89, -110, -88, -55, -57, -45, -56, -55, -42, 25, 23, 34, -8, 15, 66, 67, 56, 57, 61, -8, Flags.CD, 32, 13, -8, 14, 47, 45, 57, 46, 47, 60, 21, 19, 30, -12, Flags.CD, 62, ax5.a, 52, 53, 57, -12, 7, 28, 9, -12, 10, 43, 41, 53, bx.W5, 43, 56, -12, 57, 43, 41, 59, 56, 43, 3, 1, 12, -30, 1, 8, -1, -30, -11, 9, -8, -3, 3, -30, -8, -7, -9, 3, -8, -7, 6, -30, -11, -11, -9, -20, -22, -11, -53, -22, -15, -24, -53, -34, -14, bx.j7, -26, -20, -53, bx.j7, -30, -32, -20, bx.j7, -30, -17, -53, bx.j7, -16, -19, -34, -32, -48, -38, -40, -29, -71, -40, -33, -42, -71, -52, -32, -49, -44, -38, -71, -49, -48, -50, -38, -49, -48, -35, -71, -35, -52, -30, -23, -25, -14, -56, -19, -33, -35, -56, -25, -22, -51, -56, -34, -1, -3, 9, -2, -1, 12, -61, -63, -52, -94, -57, -71, -73, -94, -43, -43, -41, -94, -40, bx.l7, -41, -89, -91, -80, -122, -85, -99, -101, -122, -50, -56, -112, -122, -68, -67, -69, -43, -45, -34, -76, -19, -11, -11, -19, -14, -21, -76, -8, -25, -3, -76, -22, -21, -23, -11, -22, -21, -8, 24, 22, 33, -9, 58, 44, 56, 54, -9, bx.W5, 62, 45, 50, 56, -9, 45, 46, 44, 56, 45, 46, 59, -9, bx.W5, bx.W5, 44, -87, -89, -78, -120, -53, -67, -55, -57, -120, -69, -49, -66, -61, -55, -120, -66, -65, -67, -55, -66, -65, -52, -120, -57, -54, -115, -84, -86, -75, -117, -50, -64, -52, -54, -117, -45, -58, -63, -62, -52, -117, -63, -62, -64, -52, -63, -62, -49, -117, -45, -51, -107, -51, -67, -89, -86, -82, -63, -67, -83, -105, -102, -97, -79, 33, 17, 36, 1, -1, 5, 1, -33, -30, -28, -9, -21, 3, 1, 8, 8, 1, 6, -1, -72, -5, 7, -4, -3, -5, -72, -20, 5, 2, 5, 6, 14, 5, -73, -40, -19, -38, -73, 3, -4, 13, -4, 3, -47, -73, -78, -53, -56, -53, -52, -44, -53, 125, -98, -77, -96, 125, -51, -49, -52, -61, -58, -55, -62, -105, 125, 23, 48, 45, 48, 49, 57, 48, -30, 10, 7, 24, 5, -30, 46, 39, 56, 39, 46, -30, 53, 54, 52, 43, 48, 41, -4, -30, -30, -5, -8, -5, -4, 4, -5, -83, -43, -46, -29, -48, -83, -3, -1, -4, -13, -10, -7, -14, -83, 0, 1, -1, -10, -5, -12, -57, -83, -37, -20, -28, -14, -16, -20, -2, -48, -8, -10, -34, bx.l7, -62, -10, -2, -59, -61, -66, Flags.CD, bx.j7, -38, 34, 54, 37, bx.W5, 48, -16, 38, 34, 36, -12, -56, -36, -53, -48, -42, -106, -52, -56, -54, -102, -108, -47, -42, -54, 38, 59, 40, -10, 9, 30, Flags.CD, -38, -15, -65, -32, -24, -12, -15, -4, -6, -6, -44, -47, -30, -99, -7, 7, -12, -62, 7, 3, 9, 17, 2, 25, 13, 30, 21, 26, 17, 24, 32, 17, 13, 32, 32, 52, 54, 51, 56, 51, 57, -30, -48, -36, -30, -28, -35, -42, -52, -70, -57, -51, -56, -52, 15, 1, 14, 
        14, -3, 10, Flags.CD, 27, -41, -42, -55, -60, -59, -49, -113, -63, -42, -61, 25, 12, 15, 15, 8, 57, 44, 47, 47, 40, 38, -11, 7, -6, -3, -3, -10, 1, -3, 6, 4, -41, -62, -53, -55, -47, -62, 55, 34, 47, 44, 35, 41, 49, 34, 51, 30, 43, 40, 37, 45, 30};
    }

    public static void A0B() {
        A02 = new String[]{"PUk6Ycp3IyZuDM2vxEClNB7s", "Cor2Bf7UAjKBCW6KQ3kJAY2", "tBvhUMYEWbjuF5bg8fuW6r", "p", "", "fIpZ4gAxwncTaI4Qx56KLzmZZ7uUPeai", "EGElOHn6uGhmkRxS9uXWLb9eFH9So4cV", "7k7mDGZCg"};
    }

    static {
        A0B();
        A0A();
        A05 = C0604Di.A01(A07(657, 22, 55));
        A08 = Pattern.compile(A07(899, 10, 75));
        A06 = new HashMap<>();
        A00 = -1;
        A04 = new SparseIntArray();
        A04.put(66, 1);
        A04.put(77, 2);
        A04.put(88, 4);
        A04.put(100, 8);
        A03 = new SparseIntArray();
        A03.put(10, 1);
        A03.put(11, 4);
        A03.put(12, 8);
        A03.put(13, 16);
        A03.put(20, 32);
        A03.put(21, 64);
        A03.put(22, 128);
        A03.put(30, 256);
        A03.put(31, 512);
        A03.put(32, 1024);
        A03.put(40, 2048);
        A03.put(41, 4096);
        A03.put(42, 8192);
        A03.put(50, 16384);
        A03.put(51, 32768);
        A03.put(52, 65536);
        A07 = new HashMap();
        A07.put(A07(345, 3, 59), 1);
        A07.put(A07(352, 3, 8), 4);
        A07.put(A07(355, 3, 80), 16);
        A07.put(A07(358, 3, 64), 64);
        A07.put(A07(361, 3, 86), 256);
        A07.put(A07(313, 4, 67), 1024);
        A07.put(A07(aa.a.r, 4, 23), 4096);
        A07.put(A07(321, 4, 77), 16384);
        A07.put(A07(325, 4, 19), 65536);
        A07.put(A07(329, 4, 84), 262144);
        A07.put(A07(333, 4, 31), 1048576);
        A07.put(A07(337, 4, 35), 4194304);
        A07.put(A07(341, 4, 20), 16777216);
        A07.put(A07(221, 3, 100), 2);
        A07.put(A07(224, 3, 95), 8);
        A07.put(A07(227, 3, 57), 32);
        A07.put(A07(230, 3, 123), 128);
        A07.put(A07(233, 3, 58), 512);
        A07.put(A07(189, 4, 98), 2048);
        A07.put(A07(yg1.L, 4, 50), 8192);
        A07.put(A07(197, 4, 35), 32768);
        A07.put(A07(201, 4, 101), 131072);
        A07.put(A07(205, 4, 12), 524288);
        A07.put(A07(209, 4, 115), 2097152);
        A07.put(A07(213, 4, 34), 8388608);
        A07.put(A07(217, 4, 89), 33554432);
    }

    public static int A00() throws C0613Dr {
        if (A00 == -1) {
            int i = 0;
            C0604Di A062 = A06(A07(1006, 9, 17), false);
            if (A062 != null) {
                MediaCodecInfo.CodecProfileLevel[] A0K = A062.A0K();
                String[] strArr = A02;
                String str = strArr[6];
                String str2 = strArr[5];
                int result = str.charAt(20);
                if (result != str2.charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "KZ3htwrCZaN4pnqbUvwqLO4F2z8ifUlK";
                strArr2[5] = "b2BkF0yBOqWKoYmDncjILGp6agQJiwPk";
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0K) {
                    i = Math.max(A01(codecProfileLevel.level), i);
                }
                i = Math.max(i, C0726Ig.A02 >= 21 ? 345600 : 172800);
            }
            A00 = i;
        }
        return A00;
    }

    public static int A01(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
                return 414720;
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r7.equals(A07(953, 4, 29)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> A02(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(A07(897, 2, 83));
        char c = 0;
        String str2 = split[0];
        switch (str2.hashCode()) {
            case 3006243:
                String A072 = A07(936, 4, 118);
                String[] strArr = A02;
                if (strArr[2].length() != strArr[3].length()) {
                    String[] strArr2 = A02;
                    strArr2[6] = "URe3HeFimxZDPUOt0d5oLD2A6pzKN2og";
                    strArr2[5] = "XxvGV8PZkl56DMpAUShQLpZcYfSVK56v";
                    if (str2.equals(A072)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 3006244:
                if (str2.equals(A07(940, 4, 89))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                break;
            case 3214780:
                if (str2.equals(A07(957, 4, 66))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return A04(str, split);
        }
        if (c != 2 && c != 3) {
            return null;
        }
        return A03(str, split);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r0 == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
        android.util.Log.w(r4, A07(795, 19, 72) + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fd, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
        if (r0 == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
        return new android.util.Pair<>(java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer valueOf;
        Integer valueOf2;
        int level;
        int length = strArr.length;
        String A072 = A07(238, 37, 115);
        String A073 = A07(aa.c.w, 14, 72);
        if (length < 2) {
            Log.w(A073, A072 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                int length2 = strArr.length;
                String[] strArr2 = A02;
                if (strArr2[1].length() == strArr2[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A02;
                strArr3[2] = "q6TgT0Zl1BFx8Drr2JTlp2";
                strArr3[3] = "f";
                if (length2 >= 3) {
                    valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                    valueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
                } else {
                    Log.w(A073, A072 + str);
                    return null;
                }
            }
            int profile = A04.get(valueOf.intValue(), -1);
            if (profile == -1) {
                Log.w(A073, A07(814, 21, 14) + valueOf);
                return null;
            }
            SparseIntArray sparseIntArray = A03;
            int intValue = valueOf2.intValue();
            String[] strArr4 = A02;
            if (strArr4[1].length() != strArr4[4].length()) {
                String[] strArr5 = A02;
                strArr5[6] = "OIveFKmAPVIRESrbGac3LUkj9r6x05YL";
                strArr5[5] = "ikuxhPNUokluk07GzS0qL2IBF7JsSDB6";
                level = sparseIntArray.get(intValue, -1);
            } else {
                level = sparseIntArray.get(intValue, -1);
            }
        } catch (NumberFormatException unused) {
            Log.w(A073, A072 + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A04(String str, String[] strArr) {
        int i;
        int length = strArr.length;
        String A072 = A07(275, 38, 68);
        String A073 = A07(aa.c.w, 14, 72);
        if (length < 4) {
            Log.w(A073, A072 + str);
            return null;
        }
        Matcher matcher = A08.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(A073, A072 + str);
            return null;
        }
        String group = matcher.group(1);
        if (A07(53, 1, 82).equals(group)) {
            i = 1;
        } else if (A07(54, 1, 44).equals(group)) {
            i = 2;
        } else {
            Log.w(A073, A07(862, 29, 62) + group);
            return null;
        }
        Integer num = A07.get(strArr[3]);
        if (num == null) {
            Log.w(A073, A07(835, 27, 115) + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i), num);
    }

    public static C0604Di A05() {
        return A05;
    }

    @Nullable
    public static C0604Di A06(String str, boolean z) throws C0613Dr {
        List<C0604Di> A09 = A09(str, z);
        if (A09.isEmpty()) {
            return null;
        }
        return A09.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 != r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: Exception -> 0x010f, TRY_ENTER, TryCatch #0 {Exception -> 0x010f, blocks: (B:6:0x0022, B:8:0x002a, B:10:0x0032, B:31:0x008e, B:34:0x009e, B:36:0x00a4, B:40:0x00d5, B:41:0x010b, B:37:0x00cc, B:38:0x00d0), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<C0604Di> A08(C0612Dq c0612Dq, InterfaceC0614Ds interfaceC0614Ds, String str) throws C0613Dr {
        String[] supportedTypes;
        int i;
        String A072;
        try {
            ArrayList<C0604Di> arrayList = new ArrayList<>();
            String str2 = c0612Dq.A00;
            int A5k = interfaceC0614Ds.A5k();
            boolean ACh = interfaceC0614Ds.ACh();
            for (int i2 = 0; i2 < A5k; i2++) {
                MediaCodecInfo A5l = interfaceC0614Ds.A5l(i2);
                String name = A5l.getName();
                try {
                    if (A0D(A5l, name, ACh, str)) {
                        for (String str3 : A5l.getSupportedTypes()) {
                            if (str3.equalsIgnoreCase(str2)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = A5l.getCapabilitiesForType(str3);
                                    boolean A7l = interfaceC0614Ds.A7l(str2, capabilitiesForType);
                                    boolean A0E = A0E(name);
                                    if (ACh) {
                                        try {
                                            boolean secure = c0612Dq.A01;
                                        } catch (Exception e) {
                                            e = e;
                                            i = C0726Ig.A02;
                                            A072 = A07(aa.c.w, 14, 72);
                                            if (i <= 23 && !arrayList.isEmpty()) {
                                                Log.e(A072, A07(780, 15, 73) + name + A07(2, 31, 58));
                                            } else {
                                                Log.e(A072, A07(167, 22, 30) + name + A07(0, 2, 72) + str3 + A07(33, 1, 21));
                                                throw e;
                                            }
                                        }
                                    }
                                    if (!ACh) {
                                        try {
                                            boolean secure2 = c0612Dq.A01;
                                            if (!secure2) {
                                                try {
                                                    arrayList.add(C0604Di.A02(name, str2, capabilitiesForType, A0E, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i = C0726Ig.A02;
                                                    A072 = A07(aa.c.w, 14, 72);
                                                    if (i <= 23) {
                                                    }
                                                    Log.e(A072, A07(167, 22, 30) + name + A07(0, 2, 72) + str3 + A07(33, 1, 21));
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            i = C0726Ig.A02;
                                            A072 = A07(aa.c.w, 14, 72);
                                            if (i <= 23) {
                                            }
                                            Log.e(A072, A07(167, 22, 30) + name + A07(0, 2, 72) + str3 + A07(33, 1, 21));
                                            throw e;
                                        }
                                    }
                                    if (!ACh && A7l) {
                                        arrayList.add(C0604Di.A02(name + A07(46, 7, 91), str2, capabilitiesForType, A0E, true));
                                        return arrayList;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            }
                        }
                        continue;
                    }
                } catch (Exception e5) {
                    e = e5;
                    throw new C0613Dr(e);
                }
            }
            return arrayList;
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static synchronized List<C0604Di> A09(String str, boolean z) throws C0613Dr {
        synchronized (C0615Dt.class) {
            C0612Dq c0612Dq = new C0612Dq(str, z);
            List<C0604Di> list = A06.get(c0612Dq);
            if (list != null) {
                return list;
            }
            InterfaceC0614Ds zj = C0726Ig.A02 >= 21 ? new ZJ(z) : new ZI();
            ArrayList<C0604Di> A082 = A08(c0612Dq, zj, str);
            if (z && A082.isEmpty() && 21 <= C0726Ig.A02 && C0726Ig.A02 <= 23) {
                zj = new ZI();
                A082 = A08(c0612Dq, zj, str);
                if (!A082.isEmpty()) {
                    String A072 = A07(aa.c.w, 14, 72);
                    Log.w(A072, A07(374, 51, 107) + str + A07(34, 12, 72) + A082.get(0).A02);
                }
            }
            if (A07(922, 14, 24).equals(str)) {
                A082.addAll(A08(new C0612Dq(A07(912, 10, 114), c0612Dq.A01), zj, str));
            }
            A0C(A082);
            List<C0604Di> unmodifiableList = Collections.unmodifiableList(A082);
            A06.put(c0612Dq, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static void A0C(List<C0604Di> list) {
        if (C0726Ig.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 60).equals(list.get(0).A02)) {
                int i = 1;
                while (true) {
                    int size = list.size();
                    String[] strArr = A02;
                    String str = strArr[2];
                    String str2 = strArr[3];
                    int i2 = str.length();
                    if (i2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[2] = "0x3TFANg8Ut6JiiOQttPnD";
                    strArr2[3] = "p";
                    if (i < size) {
                        C0604Di c0604Di = list.get(i);
                        if (A07(657, 22, 55).equals(c0604Di.A02)) {
                            list.remove(i);
                            list.add(0, c0604Di);
                            return;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02da, code lost:
        if (A07(457, 22, 21).equals(r8) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e2, code lost:
        if (r6.equals(com.facebook.ads.redexgen.X.C0726Ig.A05) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02f4, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 8, 110)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0305, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, 7, 106)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0316, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 6, 14)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0327, code lost:
        if (A07(763, 6, 27).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0339, code lost:
        if (A07(966, 12, 93).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034a, code lost:
        if (A07(55, 5, 67).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035b, code lost:
        if (A07(757, 6, 43).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036c, code lost:
        if (A07(769, 5, 127).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x036e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x037b, code lost:
        if (r4 < 24) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037f, code lost:
        r3 = com.facebook.ads.redexgen.X.C0726Ig.A02;
        r4 = A07(961, 5, 78);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x038c, code lost:
        if (r3 > 19) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x039c, code lost:
        if (A07(642, 15, 9).equals(r8) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03a4, code lost:
        if (r6.equals(com.facebook.ads.redexgen.X.C0726Ig.A05) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03b5, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(944, 2, 62)) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03c6, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(997, 7, 77)) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03ce, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(r4) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03df, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(991, 6, 10)) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03f0, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(A07(1004, 2, 88)) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03f2, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03f5, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A02 > 19) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03fd, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A03.startsWith(r4) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040d, code lost:
        if (A07(731, 26, 14).equals(r8) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x040f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x041e, code lost:
        if (A07(922, 14, 24).equals(r10) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042e, code lost:
        if (A07(555, 28, 78).equals(r8) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0430, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0431, code lost:
        r2 = com.facebook.ads.redexgen.X.C0615Dt.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0442, code lost:
        if (r2[1].length() == r2[4].length()) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0444, code lost:
        r2 = com.facebook.ads.redexgen.X.C0615Dt.A02;
        r2[1] = "urMU5pp8oH4FNiT48xzV1CX";
        r2[4] = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0450, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0451, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (A07(364, 10, 38).equals(r8) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
        if (r3 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012d, code lost:
        if (r3 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022e, code lost:
        if (A07(774, 6, 99).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x028c, code lost:
        if (A07(85, 5, 32).equals(com.facebook.ads.redexgen.X.C0726Ig.A03) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ba, code lost:
        if (r4 < 24) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ca, code lost:
        if (A07(627, 15, 37).equals(r8) != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0D(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(A07(46, 7, 91)))) {
            return false;
        }
        if (C0726Ig.A02 < 21) {
            if (!A07(110, 13, 35).equals(str)) {
                boolean equals = A07(WKSRecord.Service.NETBIOS_DGM, 13, 30).equals(str);
                String[] strArr = A02;
                if (strArr[2].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "Xrnxd6TTPw0VRIzrl38SAVr";
                strArr2[4] = "";
                if (!equals) {
                    if (!A07(151, 16, 34).equals(str)) {
                        if (!A07(123, 15, 94).equals(str)) {
                            if (!A07(60, 10, 45).equals(str)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (C0726Ig.A02 < 18 && A07(608, 19, 75).equals(str)) {
            return false;
        }
        if (C0726Ig.A02 < 18 && A07(530, 25, 101).equals(str)) {
            if (!A07(909, 3, 91).equals(C0726Ig.A03)) {
                if (A07(891, 6, 52).equals(C0726Ig.A05)) {
                    boolean startsWith = C0726Ig.A03.startsWith(A07(236, 2, 19));
                    String[] strArr3 = A02;
                    if (strArr3[2].length() != strArr3[3].length()) {
                        String[] strArr4 = A02;
                        strArr4[6] = "rdXjReJBq8aAQw8lIZ8zL01sxRhhynRR";
                        strArr4[5] = "BQiQiLPkKNHtfe5iDR7FLrkkpu9i3G1e";
                    } else {
                        String[] strArr5 = A02;
                        strArr5[7] = "uVqatwOWW";
                        strArr5[0] = "KICdfFxbcAJgSXxY4Hh9gxj0";
                    }
                }
            }
            return false;
        }
        if (C0726Ig.A02 == 16 && A07(aa.h.o, 26, 11).equals(str)) {
            if (!A07(946, 4, 45).equals(C0726Ig.A03)) {
                if (!A07(978, 6, 117).equals(C0726Ig.A03)) {
                    if (!A07(1015, 5, 84).equals(C0726Ig.A03)) {
                        if (!A07(IronSourceError.ERROR_RV_LOAD_DURING_SHOW, 9, 66).equals(C0726Ig.A03)) {
                            if (!A07(1020, 7, 116).equals(C0726Ig.A03) && !C0726Ig.A03.startsWith(A07(950, 3, 70))) {
                                if (!A07(90, 5, 92).equals(C0726Ig.A03)) {
                                    if (!A07(95, 5, 3).equals(C0726Ig.A03)) {
                                        String str3 = C0726Ig.A03;
                                        String[] strArr6 = A02;
                                        if (strArr6[2].length() == strArr6[3].length()) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr7 = A02;
                                        strArr7[7] = "oPZDRSzo0";
                                        strArr7[0] = "0InYg9JEpbCusmdZKGYCVfcU";
                                        if (!A07(100, 5, 99).equals(str3)) {
                                            if (!A07(105, 5, 57).equals(C0726Ig.A03)) {
                                                if (!A07(348, 4, 105).equals(C0726Ig.A03)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (C0726Ig.A02 == 16 && A07(679, 26, 122).equals(str)) {
            if (!A07(70, 5, 88).equals(C0726Ig.A03)) {
                if (!A07(75, 5, 5).equals(C0726Ig.A03)) {
                    if (!A07(80, 5, 100).equals(C0726Ig.A03)) {
                    }
                }
            }
            return false;
        }
        int i = C0726Ig.A02;
        String A072 = A07(984, 7, 32);
        String[] strArr8 = A02;
        if (strArr8[7].length() != strArr8[0].length()) {
            String[] strArr9 = A02;
            strArr9[2] = "83Lf9GdFIttz9eWPc99Cly";
            strArr9[3] = bx.B4;
        } else {
            String[] strArr10 = A02;
            strArr10[2] = "vJAWmKb5TlARTgLq6rNVbe";
            strArr10[3] = "X";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (A07(439, 8, 8).equals(r3) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0E(String str) {
        if (C0726Ig.A02 <= 22) {
            if (!A07(447, 10, 88).equals(C0726Ig.A06)) {
                String str2 = C0726Ig.A06;
                String[] strArr = A02;
                if (strArr[6].charAt(20) != strArr[5].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "WIAIQszHPLNREe1YP7XBIT7";
                strArr2[4] = "";
            }
            if (A07(479, 22, 123).equals(str) || A07(501, 29, 119).equals(str)) {
                return true;
            }
        }
        return false;
    }
}