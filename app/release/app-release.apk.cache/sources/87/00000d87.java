package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.aq3;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.19  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass19 implements Serializable {
    public static byte[] A0A = null;
    public static String[] A0B = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C1B A00;
    public C1C A01;
    public C1G A02;
    public C1I A03;
    public C1J A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    static {
        A04();
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            String[] strArr = A0B;
            if (strArr[3].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[2] = "LXXQrjhAH5CnLq5fKQjRUnrA3R85ks8i";
            strArr2[7] = "Vzc9rcIkwZ9oA3QEo9fi0aCOPKhgVZjz";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{61, 0, 84, 3, 29, 24, 24, 84, 21, 1, 0, 27, 25, 21, 0, 29, 23, 21, 24, 24, 13, 84, 27, 4, 17, 26, 84, 29, 26, 84, 47, 7, 17, 23, 7, 41, 7, 116, 113, 74, 118, 103, 112, 116, 97, 124, 99, 112, 74, 97, 108, 101, 112, 117, 120, 115, 110, 14, 12, 1, 1, 50, 25, 2, 50, 12, 14, 25, 4, 2, 3, 23, 21, 0, 17, 19, 27, 6, 13, 6, 7, 14, 3, 27, 61, 1, 14, Flags.CD, 1, 9, 61, 22, 7, 26, 22, 92, 93, 75, 76, 81, 86, 89, 76, 81, 87, 86, 103, 76, 81, 76, 84, 93, 86, 93, 87, 108, 80, 82, 65, 87, 108, 90, 94, 82, 84, 86, 64, 59, ax5.a, 60, 57, 2, 62, 50, 48, 48, 60, 51, 57, 72, 74, 65, 74, 93, 70, 76, 112, 91, 74, 87, 91, 92, 81, 93, 83, 92, 64, 34, 38, bx.W5, 44, 46, 7, 29, 49, 28, Flags.CD, 25, 15, 28, 10, Flags.CD, 10, 49, 15, 10, 64, 90, 118, 95, 64, 77, 76, 70, 118, 72, 92, 77, 64, 70, 118, 68, 92, 93, 76, 77, 60, 38, 10, 34, 52, 33, 54, 61, 10, 52, 59, 49, 10, 55, 39, 58, 34, 38, 48, 4, 23, 2, 31, 24, 17, 41, 21, 25, 3, 24, 2, 82, 65, 84, 73, 78, 71, g15.c, 86, 65, 76, 85, 69, bx.W5, 60, 58, 54, 55, 61, bx.W5, 6, ax5.a, 54, 43, 6, 43, 60, 46, 56, 43, 61, 46, 53, 50, bx.W5, 2, 56, 51, 57, 2, 62, 60, 47, 57, 67, 88, 95, 71, 111, 85, 72, 89, 68, 111, 68, 66, 81, 94, 67, 89, 68, 89, 95, 94, 9, 18, 21, 13, 37, 19, 20, 14, 8, 21, 37, 14, 8, 27, 20, 9, 19, 14, 19, 21, 20, 43, 51, 49, 40, 40, 57, 58, 52, 61, 7, 43, 61, 59, 55, 54, 60, 43, 48, 44, 32, bx.W5, 34, 47, 28, 32, 44, 45, 55, 38, 59, 55, 71, 65, 86, 64, 93, 64, 88, 81, 110, 115, 110, 118, g15.c, 64, 91, 70, 94, 92, 69, 69, 84, 87, 89, 80, 106, 70, 80, 86, 90, 91, 81, 70, 50, 53, 43, 78, 81, 92, 93, 87, 103, 89, 77, 76, 87, 72, 84, 89, 65, 103, 93, 86, 89, 90, 84, 93, 92, 118, 105, 100, 101, 111, 95, 100, 117, 114, 97, 116, 105, 111, 110, 95, 115, 101, 99, 36, 59, 54, 55, 61, 13, 34, 32, 55, 62, 61, 51, 54, 13, 33, 59, 40, 55, 13, 48, 43, 38, 55, 33, 118, 105, 100, 101, 111, 95, 117, 114, 108, 37, 59, 54, 38, 58};
    }

    public static void A04() {
        A0B = new String[]{"R5DeYR6FKIddoQ1tNFb4QO1F3D7YHRG7", "hniB1BSXMiqlCD6U", "jhH7rQZzgqsha0FGspkq8z1DrJIjsBJk", "lw6F7y1SoSoTAEcdzLyYaN1xEC1Q2oWX", "ic1GHkKPsX6vyCRQCqNODZsBJ", "Aw8qdmnq9PbtDTR9ez9n3jUjtBry3vCr", "3as5zHbOptZ96SzIdP7nSqOic", "mvWErpvjRXL0vWcjCyiUNQO7TD5zouZh"};
    }

    public static AnonymousClass19 A00(JSONObject jSONObject) {
        int optInt;
        AnonymousClass19 anonymousClass19 = new AnonymousClass19();
        anonymousClass19.A07(new C1F().A0H(jSONObject.optString(A01(aq3.a, 5, 32))).A0G(jSONObject.optString(A01(342, 8, 14))).A0B(jSONObject.optString(A01(53, 4, 45))).A0F(jSONObject.optString(A01(328, 14, 121))).A0E(jSONObject.optString(A01(227, 12, 26))).A0D(jSONObject.optString(A01(215, 12, 76))).A09(jSONObject.optString(A01(37, 16, 47))).A0A(jSONObject.optString(A01(71, 8, 78))).A0C(jSONObject.optString(A01(95, 17, 2))).A0I());
        anonymousClass19.A08(new C1I(jSONObject.optString(A01(127, 12, 103)), jSONObject.optString(A01(57, 14, 87)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(355, 19, 15);
        if (jSONObject.optInt(A01, -1) == -1) {
            if (A0B[1].length() == 16) {
                String[] strArr = A0B;
                strArr[5] = "m0SNHJxvul7tSRvrfYkKg9k0pQQtrIDe";
                strArr[5] = "m0SNHJxvul7tSRvrfYkKg9k0pQQtrIDe";
                optInt = jSONObject.optInt(A01(311, 17, 98), -1);
            }
            throw new RuntimeException();
        }
        optInt = jSONObject.optInt(A01, -1);
        C1B A0H = new C1B().A0J(jSONObject.optString(A01(441, 9, 58))).A0G(jSONObject.optLong(A01(417, 24, 104), -1L)).A0E(optInt).A0D(jSONObject.optInt(A01(239, 18, 99), Integer.MAX_VALUE)).A0H(C1S.A01(jSONObject));
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(157, 5, 113));
        if (optJSONObject != null) {
            C1B adMediaBuilder = A0H.A0I(optJSONObject.optString(A01(374, 3, 125)));
            C1B adMediaBuilder2 = adMediaBuilder.A0C(optJSONObject.optInt(A01(450, 5, 104)));
            if (A0B[1].length() == 16) {
                String[] strArr2 = A0B;
                strArr2[5] = "WsiHjZ6Ab9OhwgLQk07kFOW3FmkdrPnz";
                strArr2[5] = "WsiHjZ6Ab9OhwgLQk07kFOW3FmkdrPnz";
                adMediaBuilder2.A0B(optJSONObject.optInt(A01(151, 6, 14)));
            }
            throw new RuntimeException();
        }
        anonymousClass19.A05(A0H);
        anonymousClass19.A0D(jSONObject.optBoolean(A01(290, 21, 64)));
        anonymousClass19.A09(new C1J(LD.A04(jSONObject.optJSONArray(A01(112, 15, 9)))));
        anonymousClass19.A0A(jSONObject.optBoolean(A01(196, 19, 111)));
        return anonymousClass19;
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(79, 16, 88);
        String delayText = A01(0, 37, 78);
        String delayText2 = jSONObject.optString(A01, delayText);
        if (delayText2.equals(delayText)) {
            JSONObject genericTextObject = jSONObject.optJSONObject(A01(WKSRecord.Service.NETBIOS_SSN, 12, 21));
            if (genericTextObject != null) {
                delayText = genericTextObject.optString(A01, delayText);
            }
            return delayText;
        }
        return delayText2;
    }

    private void A05(C1B c1b) {
        this.A00 = c1b;
    }

    private final void A06(C1C c1c) {
        this.A01 = c1c;
    }

    private final void A07(C1G c1g) {
        this.A02 = c1g;
    }

    private final void A08(C1I c1i) {
        this.A03 = c1i;
    }

    private final void A09(C1J c1j) {
        this.A04 = c1j;
    }

    private final void A0A(boolean z) {
        this.A06 = z;
    }

    private final void A0B(boolean z) {
        this.A07 = z;
    }

    private final void A0C(boolean z) {
        this.A08 = z;
    }

    private final void A0D(boolean z) {
        this.A09 = z;
    }

    public final C1C A0E() {
        return this.A01;
    }

    public final C1G A0F() {
        return this.A02;
    }

    public final C1I A0G() {
        return this.A03;
    }

    public final C1J A0H() {
        return this.A04;
    }

    public final void A0I(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(377, 22, 2)));
        this.A00.A0K(jSONObject.optBoolean(A01(176, 20, 19), true));
        A06(this.A00.A0M());
        A0K(jSONObject.optBoolean(A01(162, 14, 84)));
        A0B(jSONObject.optBoolean(A01(257, 13, 103)));
        A0C(jSONObject.optBoolean(A01(270, 20, 10)));
    }

    public final void A0J(JSONObject jSONObject) {
        this.A00.A0F(jSONObject.optInt(A01(399, 18, 58)));
        this.A00.A0K(jSONObject.optBoolean(A01(176, 20, 19), true));
        A06(this.A00.A0M());
        A0B(jSONObject.optBoolean(A01(257, 13, 103)));
    }

    public final void A0K(boolean z) {
        this.A05 = z;
    }

    public final boolean A0L() {
        return this.A05;
    }

    public final boolean A0M() {
        return this.A06;
    }

    public final boolean A0N() {
        return this.A07;
    }

    public final boolean A0O() {
        return this.A09;
    }
}