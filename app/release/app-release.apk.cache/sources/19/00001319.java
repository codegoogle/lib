package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class P0 extends AbstractRunnableC0770Kc {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass85 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 69, 83, 65, 18, 92, 87, 68, 87, 64, 18, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public P0(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        boolean z;
        z = this.A00.A06;
        if (!z) {
            this.A00.A0H(A00(0, 24, 76));
        }
    }
}