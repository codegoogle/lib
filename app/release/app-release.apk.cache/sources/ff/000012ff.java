package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Oa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0868Oa {
    public static byte[] A00;
    public static String[] A01;

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 93);
            String[] strArr = A01;
            if (strArr[3].charAt(25) == strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "ZkkNqMbSq2X5uLLX3N";
            strArr2[7] = "ZkkNqMbSq2X5uLLX3N";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{17, 10, 13, 13, 10, 12, -38, 7, -3, Flags.CD, 8, 2, -3, 34, 49, 49, 32, 47, 34, 46, 38, bx.W5, 43, 60, 47, 41, 43, 37, 51, 53, bx.W5, 43, 50, 69, 72, 60, 58, 69, 62, 50, 54, 33, 37, 17, 40, 23, 36, -14, -29, -12, -10, -16, -25, -12, bx.j7, -25, -16, -26, -14, -15, -21, -16, -10, 10, 6, -5, 19, -5, -4, 6, -1, -7, 8, -5, 7, -1, -22, -38, -23, -36, -36, -27, -42, -33, -36, -32, -34, -33, -21, -48, -64, -49, -62, -62, -53, -68, -44, -58, -63, -47, -59, 13, -2, 5, -7, 16, -1, 12, 13, 3, 9, 8, 1, -13, 1, 1, -9, -3, -4, -19, -9, -14};
    }

    public static void A03() {
        A01 = new String[]{"FlapraKYinr7Nj6zb2x", "Je7Oc75DeV26JYLGdoAYQBFZl5wXaWlc", "6eSxJX", "aEepWtzNMaW6JZj4waJ23HNf2aIS7LoC", "JwlyhY0m7wRpvvwBZvP15fqQyn91MpTE", "PlE1oLNOrYKtW3AWK6zlObYGaKJphnE8", "QTcNGp4T1DOVQL9", "izKSydL2onnSjNYNNJlTpUx2BXz"};
    }

    public static Map<String, String> A01(C8H c8h, String str, String str2) {
        HashMap hashMap = new HashMap();
        C04948s c04948s = new C04948s(c8h);
        int i = c8h.getResources().getDisplayMetrics().widthPixels;
        int i2 = c8h.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A00(112, 10, 49), c8h.A05().A02());
        hashMap.put(A00(63, 13, 61), str2);
        hashMap.put(A00(47, 16, 37), str);
        hashMap.put(A00(21, 12, 105), String.valueOf(c04948s.A09()));
        hashMap.put(A00(89, 12, 0), String.valueOf((int) (i / C0795Le.A01)));
        hashMap.put(A00(76, 13, 26), String.valueOf((int) (i2 / C0795Le.A01)));
        hashMap.put(A00(39, 2, 102), A00(6, 7, 60));
        hashMap.put(A00(41, 6, 85), C04948s.A03);
        hashMap.put(A00(33, 6, 124), Locale.getDefault().toString());
        hashMap.put(A00(101, 11, 61), A00(0, 6, 127));
        hashMap.put(A00(13, 8, 100), c04948s.A05());
        return hashMap;
    }
}