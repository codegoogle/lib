package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class TM implements InterfaceC04085a {
    public static byte[] A02;
    public static String[] A03;
    public final EnumC04095b A00;
    public final String A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{5, 10, 1, -10, 78, 75, 69};
    }

    public static void A03() {
        A03 = new String[]{"TFthAsyh9DXeOXmOSrI", "6fWFj2GuIp8edYChPrJEmZ0EGdAH52zr", "1W8BLXCecsGswLg5J6ItB4TJ0IeP92", "LJOYl73w1qtKK7uJcnV", "z6IkqPokH6efARGWKazebLzdy8d5mCY", "2wZEZTk79zqBVt75gMVieTbdYLiT7Zir", "bDoQVkMDKn3JHFmlXSVDRiBYbpx4sGCA", "L28Z4g4sdLlGf5SKMowSfgQKz11TtxJ4"};
    }

    public TM(EnumC04095b enumC04095b, String str) {
        this.A00 = enumC04095b;
        this.A01 = str;
    }

    @Nullable
    public static TM A00(JSONObject jSONObject) {
        EnumC04095b A00 = EnumC04095b.A00(jSONObject.optString(A01(0, 4, 21)));
        String optString = jSONObject.optString(A01(4, 3, 93));
        if (A00 == null || optString == null) {
            String[] strArr = A03;
            String str = strArr[7];
            String url = strArr[5];
            if (str.charAt(27) != url.charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "YX1kth4";
            strArr2[2] = "YX1kth4";
            return null;
        }
        return new TM(A00, optString);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04085a
    public final EnumC04095b A7B() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r4 != r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r4 != r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        r7 = (com.facebook.ads.redexgen.X.TM) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r6.A00 == r7.A00) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        return r6.A01.equals(r7.A01);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            if (A03[4].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "7vOCIJjJCX9CoY0eg8O";
            strArr[3] = "3BsZIpiI9Segj8T9GPE";
            return true;
        }
        String[] strArr2 = A03;
        if (strArr2[7].charAt(27) != strArr2[5].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A03;
        strArr3[0] = "CUYUmjEQroJXgi3huLe";
        strArr3[3] = "AnYHMDp1ebtK81SsggF";
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A03[2].length() != 31) {
                String[] strArr4 = A03;
                strArr4[4] = "McBoxOwAJvKvGI9HKqBnGpNAZAcduNL";
                strArr4[4] = "McBoxOwAJvKvGI9HKqBnGpNAZAcduNL";
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04085a
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}