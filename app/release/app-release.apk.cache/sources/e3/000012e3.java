package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class O7 {
    public static byte[] A03;
    public static String[] A04;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A04();
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{37, 50, 45, 45, 14, 6, 6, 4, 19, 65, 122, 117, 118, 120, 113, 52, 96, 123, 52, 119, 102, 113, 117, 96, 113, 52, 117, 112, 112, 125, 96, 125, 123, 122, 117, 120, 93, 122, 114, 123, 89, 92, 103, 91, 74, 93, 89, 76, 81, 78, 93, 103, 76, 65, 72, 93, 12, 9, 50, Flags.CD, 2, 31, 0, 12, 25, 50, 25, 20, 29, 8, 108, 105, 82, g15.c, 104, 124, 120, 104, 126, 121, 82, 100, 105, 116, 99, 124, 111, 107, 103, 97, 99, 21, 10, 7, 6, 12};
    }

    public static void A04() {
        A04 = new String[]{"fp2CaqTj", "LAEvMYTNrmfm1C97qtviMkf2yRu1DYDl", "t6JdD3of0IxrOsKa9BA81q59Uli9AsT8", "gJC7p3UN", "wkhfqpsDh9pZ7alJINp4k3fYjwmP5ybd", "PXJ05dfTFyjTm8LhPchB38r6NC9RTsQv", "bBNwT5q5CTYqEWiLjNbWq9cYv9", "kUvPfRU87m3C3sqCb"};
    }

    public O7(String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = !TextUtils.isEmpty(str2) ? A01(91, 5, 62) : A01(86, 5, 91);
    }

    private C04858j A00(String str) {
        C04858j c04858j = new C04858j(str);
        c04858j.A05(A02());
        c04858j.A03(1);
        return c04858j;
    }

    private JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 48), this.A00);
            jSONObject.put(A01(70, 13, 80), this.A02);
            jSONObject.put(A01(40, 16, 101), this.A01);
        } catch (JSONException e) {
            Log.w(A01(0, 9, 60), A01(9, 31, 73), e);
        }
        return jSONObject;
    }

    public final void A05(int i, String str) {
        C1081Wi A00 = C8G.A00();
        if (A00 != null) {
            InterfaceC04838h A042 = A00.A04();
            String[] strArr = A04;
            if (strArr[2].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "oo4WYpYrHyZLXSXdo0EivsHVHotPm1t3";
            strArr2[1] = "oo4WYpYrHyZLXSXdo0EivsHVHotPm1t3";
            A042.A82(A01(83, 3, 77), i, A00(str));
        }
    }
}