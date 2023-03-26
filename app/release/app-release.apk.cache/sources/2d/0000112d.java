package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.anythink.expressad.foundation.g.a;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.gl4;
import com.p7700g.p99005.h95;
import com.p7700g.p99005.yg1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Gt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0687Gt {
    public static byte[] A01;
    public static String[] A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 22, 48, 76, 56, 55, 79, 91, 77, 94, 76, 56, 55, 79, 77, 66, 54, bx.W5, 35, 4, 28, Flags.CD, 6, 3, 14, 74, Flags.CD, 6, 3, 13, 4, 7, 15, 4, 30, 74, 28, Flags.CD, 6, 31, 15, 80, 74, 106, 77, 85, 66, 79, 74, 71, 3, 66, 77, 64, 75, 76, 81, 3, 85, 66, 79, 86, 70, 25, 3, bx.W5, 18, 16, 9, 9, 16, 23, 30, 89, 27, 24, 29, 89, 26, 12, 28, 89, 10, 28, 13, 13, 16, 23, 30, 67, 89, 118, 78, 76, 85, 85, 76, 75, 66, 5, 70, 80, 64, 5, 82, 76, 81, 77, 5, 71, 68, 65, 5, 77, 64, 68, 65, 64, 87, 31, 5, 22, 45, 40, 45, 44, 52, 45, 99, 32, 54, 38, 99, 48, 38, 55, 55, bx.W5, 45, 36, 99, 51, 1, 6, 18, 16, 16, 39, 17, 1, 52, 5, 22, 23, 1, 22, 36, 95, 35, 81, 34, 59, 77, 57, 54, 78, 76, 57, 22, 78, 72, 72, 91, 57, 22, 78, 77, 57, 54, 78, 76, 77, 75, 79, 76, 90, 65, 41, 36, 33, 47, 38, 120, 116, 105, 82, 18, 19, 21, 30, 4, 21, 2, 91, 80, 90, 103, 116, 99, 56, 54, ax5.a, 62, 35, 56, ax5.a, 54, 113, 36, ax5.a, 34, 36, 33, 33, 62, 35, 37, 52, 53, 113, 52, ax5.a, 37, 56, 37, 40, 107, 113, 118, 119, 33, 44, 35, bx.W5, 44, 37, 38, 52, 23, 18, 21, 30, 49, 41, 74, 78, 67, 67, 75, 66, 7, Flags.CD, 26, 25, Flags.CD, 20, 8, 18, 15, 18, 20, 21, 67, 88, 86, 89, 69, 109, 119, 100, 123, 121, 126, 107, 120, 126, 99, 52};
    }

    public static void A06() {
        A02 = new String[]{"BH2zNHpX", "Dnuq9wFIL2", "vBkvmD9EAd5t9FTNthVuCuoibAfWrGUa", "Nhu3hv03L3KjBzyMucsPwsjdroL1", "9TVwE8RhMB8DaYr8DWqJ6OPYy1", "9JupfOkL4WUcaojH", "ecCz7RACP0dYyLgy5uflHn", "VPA8JBGLf77hbCQNqSGQ8FIxNIe4WZlE"};
    }

    static {
        A06();
        A05();
        A03 = Pattern.compile(A03(161, 26, 61));
        A04 = Pattern.compile(A03(3, 12, 60));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 40))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1074341483:
                if (str.equals(A03(254, 6, 127))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                boolean equals = str.equals(A03(203, 3, 102));
                if (A02[3].length() != 10) {
                    String[] strArr = A02;
                    strArr[5] = "MJ40TcK0DidUTvS4";
                    strArr[5] = "MJ40TcK0DidUTvS4";
                    if (equals) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 109757538:
                if (str.equals(A03(281, 5, 82))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1 || c == 2) {
                return 1;
            }
            if (c != 3) {
                Log.w(A03(WKSRecord.Service.EMFIS_CNTL, 15, 60), A03(43, 22, 123) + str);
                return Integer.MIN_VALUE;
            }
            return 2;
        }
        return 0;
    }

    public static int A01(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment A02(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 40))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1074341483:
                if (str.equals(A03(254, 6, 127))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals(A03(203, 3, 102))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (str.equals(A03(244, 4, 24))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals(A03(272, 5, 105))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals(A03(281, 5, 82))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (c != 4 && c != 5) {
            Log.w(A03(WKSRecord.Service.EMFIS_CNTL, 15, 60), A03(18, 25, 50) + str);
            return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static String A04(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return C0726Ig.A0n(trim, A03(156, 5, 39))[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r4 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        r5.setSpan(new android.text.style.StrikethroughSpan(), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r6.A0Q() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        r5.setSpan(new android.text.style.UnderlineSpan(), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r6.A0O() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        r5.setSpan(new android.text.style.ForegroundColorSpan(r6.A07()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        r4 = r6.A0N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (com.facebook.ads.redexgen.X.C0687Gt.A02[2].charAt(8) == 'y') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
        r2 = com.facebook.ads.redexgen.X.C0687Gt.A02;
        r2[3] = "V2wLbBmXpgkEOhtSXmoT1";
        r2[3] = "V2wLbBmXpgkEOhtSXmoT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
        r5.setSpan(new android.text.style.BackgroundColorSpan(r6.A06()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r4 = r6.A0I();
        r2 = com.facebook.ads.redexgen.X.C0687Gt.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r2[0].length() == r2[6].length()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r2 = com.facebook.ads.redexgen.X.C0687Gt.A02;
        r2[3] = "i3U";
        r2[3] = "i3U";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        r5.setSpan(new android.text.style.TypefaceSpan(r6.A0I()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
        if (r6.A0B() == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
        r5.setSpan(new android.text.style.AlignmentSpan.Standard(r6.A0B()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
        r1 = r6.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
        if (r1 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
        if (r1 == 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
        if (r1 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
        r5.setSpan(new android.text.style.RelativeSizeSpan(r6.A05() / 100.0f), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0107, code lost:
        r5.setSpan(new android.text.style.RelativeSizeSpan(r6.A05()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
        r5.setSpan(new android.text.style.AbsoluteSizeSpan((int) r6.A05(), true), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r2 = com.facebook.ads.redexgen.X.C0687Gt.A02;
        r2[0] = "Zhb0mUGg";
        r2[6] = "DqzbmkeRFCAudTa8qvbD1E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
        if (r4 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0147, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A07(SpannableStringBuilder spannableStringBuilder, C0682Go c0682Go, int i, int i2) {
        if (c0682Go == null) {
            return;
        }
        int A09 = c0682Go.A09();
        if (A02[3].length() == 10) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "Ny9QBL6T";
        strArr[6] = "KFko697awYGF5JioqkD8Fp";
        if (A09 != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c0682Go.A09()), i, i2, 33);
        }
        boolean A0P = c0682Go.A0P();
        if (A02[2].charAt(8) != 'y') {
            String[] strArr2 = A02;
            strArr2[3] = "U9AYrt";
            strArr2[3] = "U9AYrt";
        } else {
            String[] strArr3 = A02;
            strArr3[5] = "BCFo0CwtxewMjRes";
            strArr3[5] = "BCFo0CwtxewMjRes";
        }
    }

    public static void A08(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 3309) {
            if (str.equals(A03(206, 2, 88))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3464) {
            if (str.equals(A03(252, 2, 5))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 96708) {
            if (hashCode == 3374865 && str.equals(A03(260, 4, 49))) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(A03(yg1.K, 3, 65))) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0) {
            spannableStringBuilder.append(h95.e);
        } else if (c == 1) {
            spannableStringBuilder.append(h95.f);
        } else if (c == 2) {
            spannableStringBuilder.append(gl4.R);
        } else if (c != 3) {
            Log.w(A03(WKSRecord.Service.EMFIS_CNTL, 15, 60), A03(209, 31, 9) + str + A03(16, 2, 85));
        } else {
            spannableStringBuilder.append(h95.d);
        }
    }

    public static void A09(String str, C0684Gq c0684Gq) {
        String A032 = A03(WKSRecord.Service.EMFIS_CNTL, 15, 60);
        Matcher matcher = A04.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if (A03(248, 4, 35).equals(group)) {
                    A0A(group2, c0684Gq);
                } else if (A03(187, 5, 16).equals(group)) {
                    c0684Gq.A0C(A02(group2));
                } else if (A03(264, 8, 35).equals(group)) {
                    A0B(group2, c0684Gq);
                } else if (A03(277, 4, 70).equals(group)) {
                    c0684Gq.A06(C0688Gu.A00(group2));
                } else {
                    Log.w(A032, A03(121, 20, 27) + group + A03(15, 1, 32) + group2);
                }
            } catch (NumberFormatException unused) {
                Log.w(A032, A03(65, 26, 33) + matcher.group());
            }
        }
    }

    public static void A0A(String str, C0684Gq c0684Gq) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0684Gq.A07(A00(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c0684Gq.A07(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 77))) {
            c0684Gq.A04(C0688Gu.A00(str)).A08(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        C0684Gq A042 = c0684Gq.A04(parseInt);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "nfwpqDM6";
        strArr2[6] = "ldPC0GHiWge259aJMdVkFd";
        A042.A08(1);
    }

    public static void A0B(String str, C0684Gq c0684Gq) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0684Gq.A09(A00(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c0684Gq.A09(Integer.MIN_VALUE);
        }
        c0684Gq.A05(C0688Gu.A00(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129 A[LOOP:0: B:51:0x0127->B:52:0x0129, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0C(String str, C0685Gr c0685Gr, SpannableStringBuilder spannableStringBuilder, List<C0682Go> list, List<C0686Gs> list2) {
        char c;
        int size;
        int i;
        int i2 = c0685Gr.A00;
        int length = spannableStringBuilder.length();
        String str2 = c0685Gr.A01;
        int hashCode = str2.hashCode();
        if (hashCode == 0) {
            if (str2.equals(A03(0, 0, 62))) {
                c = 6;
                switch (c) {
                }
                list2.clear();
                A0E(list, str, c0685Gr, list2);
                size = list2.size();
                while (i < size) {
                }
            }
            c = 65535;
            switch (c) {
            }
            list2.clear();
            A0E(list, str, c0685Gr, list2);
            size = list2.size();
            while (i < size) {
            }
        } else if (hashCode == 105) {
            String[] strArr = A02;
            if (strArr[0].length() != strArr[6].length()) {
                String[] strArr2 = A02;
                strArr2[0] = "yJm7VGyE";
                strArr2[6] = "ntBBgOdztc05yiWRpthqz9";
                if (str2.equals(A03(208, 1, 82))) {
                    c = 1;
                    switch (c) {
                    }
                    list2.clear();
                    A0E(list, str, c0685Gr, list2);
                    size = list2.size();
                    while (i < size) {
                    }
                }
                c = 65535;
                switch (c) {
                }
                list2.clear();
                A0E(list, str, c0685Gr, list2);
                size = list2.size();
                while (i < size) {
                }
            }
            throw new RuntimeException();
        } else if (hashCode == 3314158) {
            if (str2.equals(A03(240, 4, 21))) {
                c = 4;
                switch (c) {
                }
                list2.clear();
                A0E(list, str, c0685Gr, list2);
                size = list2.size();
                while (i < size) {
                }
            }
            c = 65535;
            switch (c) {
            }
            list2.clear();
            A0E(list, str, c0685Gr, list2);
            size = list2.size();
            while (i < size) {
            }
        } else if (hashCode == 98) {
            String A032 = A03(yg1.N, 1, 104);
            String[] strArr3 = A02;
            if (strArr3[0].length() != strArr3[6].length()) {
                String[] strArr4 = A02;
                strArr4[3] = "i60gfkl";
                strArr4[3] = "i60gfkl";
                if (str2.equals(A032)) {
                    c = 0;
                    switch (c) {
                    }
                    list2.clear();
                    A0E(list, str, c0685Gr, list2);
                    size = list2.size();
                    while (i < size) {
                    }
                }
                c = 65535;
                switch (c) {
                }
                list2.clear();
                A0E(list, str, c0685Gr, list2);
                size = list2.size();
                while (i < size) {
                }
            }
            throw new RuntimeException();
        } else if (hashCode != 99) {
            String[] strArr5 = A02;
            if (strArr5[0].length() != strArr5[6].length()) {
                String[] strArr6 = A02;
                strArr6[1] = "ltHV0yT78X";
                strArr6[4] = "DsRTdIPJp1zaSNw1phhgrckLmu";
                if (hashCode != 117) {
                    if (hashCode == 118 && str2.equals(A03(a.aU, 1, 26))) {
                        c = 5;
                        switch (c) {
                            case 0:
                                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                                break;
                            case 1:
                                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                                break;
                            case 2:
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                return;
                        }
                        list2.clear();
                        A0E(list, str, c0685Gr, list2);
                        size = list2.size();
                        for (i = 0; i < size; i++) {
                            A07(spannableStringBuilder, list2.get(i).A01, i2, length);
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                    list2.clear();
                    A0E(list, str, c0685Gr, list2);
                    size = list2.size();
                    while (i < size) {
                    }
                }
                if (str2.equals(A03(286, 1, 78))) {
                    c = 2;
                    switch (c) {
                    }
                    list2.clear();
                    A0E(list, str, c0685Gr, list2);
                    size = list2.size();
                    while (i < size) {
                    }
                }
                c = 65535;
                switch (c) {
                }
                list2.clear();
                A0E(list, str, c0685Gr, list2);
                size = list2.size();
                while (i < size) {
                }
            }
            throw new RuntimeException();
        } else {
            if (str2.equals(A03(196, 1, 41))) {
                c = 3;
                switch (c) {
                }
                list2.clear();
                A0E(list, str, c0685Gr, list2);
                size = list2.size();
                while (i < size) {
                }
            }
            c = 65535;
            switch (c) {
            }
            list2.clear();
            A0E(list, str, c0685Gr, list2);
            size = list2.size();
            while (i < size) {
            }
        }
    }

    public static void A0D(String str, String str2, C0684Gq c0684Gq, List<C0682Go> list) {
        C0685Gr startTag;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i + 1);
                int indexOf2 = str2.indexOf(32, i + 1);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    int entityEndIndex = i + 1;
                    A08(str2.substring(entityEndIndex, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) A03(1, 1, 110));
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                    i++;
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                int length = str2.length();
                if (A02[3].length() == 10) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[7] = "huABVhch9erSIKd70DjqaQjDgv4JUQcV";
                strArr[7] = "huABVhch9erSIKd70DjqaQjDgv4JUQcV";
                if (i2 >= length) {
                    i++;
                } else {
                    int i3 = i;
                    boolean z = str2.charAt(i3 + 1) == '/';
                    i = A01(str2, i3 + 1);
                    boolean z2 = str2.charAt(i + (-2)) == '/';
                    String substring = str2.substring((z ? 2 : 1) + i3, z2 ? i - 2 : i - 1);
                    String A042 = A04(substring);
                    if (A042 != null && A0F(A042)) {
                        if (z) {
                            do {
                                boolean isEmpty = arrayDeque.isEmpty();
                                String fullTagExpression = A02[5];
                                if (fullTagExpression.length() != 16) {
                                    String[] strArr2 = A02;
                                    strArr2[0] = "eUUkvlij";
                                    strArr2[6] = "fkUA9DE8mZusd0jqihcBtc";
                                    if (isEmpty) {
                                        break;
                                    }
                                    startTag = (C0685Gr) arrayDeque.pop();
                                    A0C(str, startTag, spannableStringBuilder, list, arrayList);
                                } else {
                                    String[] strArr3 = A02;
                                    strArr3[7] = "xjA9LPEJe2T86ajW2mUni2naxM9TfZ4G";
                                    strArr3[7] = "xjA9LPEJe2T86ajW2mUni2naxM9TfZ4G";
                                    if (isEmpty) {
                                        break;
                                    }
                                    startTag = (C0685Gr) arrayDeque.pop();
                                    A0C(str, startTag, spannableStringBuilder, list, arrayList);
                                }
                            } while (!startTag.A01.equals(A042));
                        } else if (!z2) {
                            arrayDeque.push(C0685Gr.A01(substring, spannableStringBuilder.length()));
                        }
                    }
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0C(str, (C0685Gr) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0C(str, C0685Gr.A00(), spannableStringBuilder, list, arrayList);
        c0684Gq.A0D(spannableStringBuilder);
    }

    public static void A0E(List<C0682Go> list, String str, C0685Gr c0685Gr, List<C0686Gs> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0682Go c0682Go = list.get(i);
            int A0A = c0682Go.A0A(str, c0685Gr.A01, c0685Gr.A03, c0685Gr.A02);
            if (A0A > 0) {
                list2.add(new C0686Gs(A0A, c0682Go));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0F(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 98) {
            if (str.equals(A03(yg1.N, 1, 104))) {
                c = 0;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 99) {
            if (str.equals(A03(196, 1, 41))) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 105) {
            boolean equals = str.equals(A03(208, 1, 82));
            if (A02[3].length() == 10) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "tlO5iwEB";
            strArr[6] = "pEnQwZlkHTTTq7cfdXWDKW";
            if (equals) {
                c = 2;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 3314158) {
            if (str.equals(A03(240, 4, 21))) {
                c = 3;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 117) {
            if (str.equals(A03(286, 1, 78))) {
                c = 4;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (hashCode == 118 && str.equals(A03(a.aU, 1, 26))) {
                c = 5;
                return c != 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5;
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    public static boolean A0G(String str, Matcher matcher, IQ iq, C0684Gq c0684Gq, StringBuilder sb, List<C0682Go> list) {
        try {
            c0684Gq.A0B(C0688Gu.A01(matcher.group(1))).A0A(C0688Gu.A01(matcher.group(2)));
            A09(matcher.group(3), c0684Gq);
            sb.setLength(0);
            while (true) {
                String A0Q = iq.A0Q();
                if (!TextUtils.isEmpty(A0Q)) {
                    if (sb.length() > 0) {
                        sb.append(A03(0, 1, 38));
                    }
                    sb.append(A0Q.trim());
                } else {
                    A0D(str, sb.toString(), c0684Gq, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(WKSRecord.Service.EMFIS_CNTL, 15, 60), A03(91, 30, 125) + matcher.group());
            return false;
        }
    }

    public final boolean A0H(IQ iq, C0684Gq c0684Gq, List<C0682Go> list) {
        String A0Q = iq.A0Q();
        if (A0Q == null) {
            return false;
        }
        Matcher matcher = A03.matcher(A0Q);
        if (matcher.matches()) {
            return A0G(null, matcher, iq, c0684Gq, this.A00, list);
        }
        String A0Q2 = iq.A0Q();
        if (A0Q2 == null) {
            return false;
        }
        Matcher matcher2 = A03.matcher(A0Q2);
        if (matcher2.matches()) {
            return A0G(A0Q.trim(), matcher2, iq, c0684Gq, this.A00, list);
        }
        return false;
    }
}