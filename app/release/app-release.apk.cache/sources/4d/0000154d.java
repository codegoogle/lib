package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y9 extends AbstractRunnableC0770Kc {
    public static byte[] A01;
    public final /* synthetic */ C1118Xt A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 92, 87, 68, 87, 64, 18, 65, 70, 83, 64, 70, 87, 86, 18, 66, 94, 83, 75, 91, 92, 85};
    }

    public Y9(C1118Xt c1118Xt) {
        this.A00 = c1118Xt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        boolean z;
        z = this.A00.A0J;
        if (!z) {
            this.A00.A0e(A00(0, 27, 112));
        }
    }
}