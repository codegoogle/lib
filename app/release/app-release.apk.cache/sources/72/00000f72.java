package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9M  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9M {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    static {
        A03();
        A01 = C9M.class.getSimpleName();
    }

    public static C9O A00(C1081Wi c1081Wi) {
        try {
            return new XO(c1081Wi);
        } catch (IOException e) {
            c1081Wi.A04().A82(A02(0, 15, 89), C04848i.A1w, new C04858j(e));
            return new XL();
        }
    }

    public static C0575Cf A01(C1081Wi c1081Wi) {
        return new C0575Cf(c1081Wi);
    }
}