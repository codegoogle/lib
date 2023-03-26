package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y1 extends AbstractRunnableC0770Kc {
    public static byte[] A01;
    public final /* synthetic */ C1118Xt A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -10, -15, -14, -4, -83, 4, -18, 0, -83, -5, -14, 3, -14, -1, -83, -3, -1, -14, -3, -18, -1, -14, -15};
    }

    public Y1(C1118Xt c1118Xt) {
        this.A00 = c1118Xt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        boolean z;
        z = this.A00.A0G;
        if (!z) {
            this.A00.A0e(A00(0, 24, 64));
        }
    }
}