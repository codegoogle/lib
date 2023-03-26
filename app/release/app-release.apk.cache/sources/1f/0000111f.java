package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.d.a.b;
import java.util.Arrays;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Gf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0673Gf {
    public static byte[] A00;
    public static String[] A01;

    static {
        A04();
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 12, Flags.CD, 53, 27, 17, 49, 27, 17, 100, 31, 54, 99, 71, 15, 125, 51, 50, 98, 20};
    }

    public static void A04() {
        A01 = new String[]{"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};
    }

    public static C0677Gj A00(C0677Gj c0677Gj, String[] strArr, Map<String, C0677Gj> map) {
        if (c0677Gj == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (c0677Gj == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (c0677Gj == null && strArr.length > 1) {
            C0677Gj c0677Gj2 = new C0677Gj();
            int length = strArr.length;
            while (i < length) {
                String id = strArr[i];
                c0677Gj2.A0F(map.get(id));
                i++;
            }
            return c0677Gj2;
        } else if (c0677Gj != null && strArr != null && strArr.length == 1) {
            return c0677Gj.A0F(map.get(strArr[0]));
        } else {
            if (c0677Gj != null && strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c0677Gj.A0F(map.get(strArr[i]));
                    i++;
                }
                return c0677Gj;
            }
            return c0677Gj;
        }
    }

    public static String A02(String str) {
        String A012 = A01(0, 1, 106);
        String replaceAll = str.replaceAll(A01(1, 2, 93), A012).replaceAll(A01(4, 5, 103), A012);
        String A013 = A01(3, 1, 73);
        return replaceAll.replaceAll(A012, A013).replaceAll(A01(9, 11, 99), A013);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i, int i2, C0677Gj c0677Gj) {
        if (c0677Gj.A08() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c0677Gj.A08()), i, i2, 33);
        }
        if (c0677Gj.A0Q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c0677Gj.A0R()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c0677Gj.A0P()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c0677Gj.A06()), i, i2, 33);
        }
        if (c0677Gj.A0O()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c0677Gj.A05()), i, i2, 33);
        }
        if (c0677Gj.A0M() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c0677Gj.A0M()), i, i2, 33);
        }
        Layout.Alignment A09 = c0677Gj.A09();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = b.dH;
        strArr2[2] = "ujiHtYdg";
        if (A09 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c0677Gj.A09()), i, i2, 33);
        }
        int A07 = c0677Gj.A07();
        if (A07 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c0677Gj.A04(), true), i, i2, 33);
        } else if (A07 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0677Gj.A04()), i, i2, 33);
        } else if (A07 != 3) {
        } else {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0677Gj.A04() / 100.0f), i, i2, 33);
        }
    }
}