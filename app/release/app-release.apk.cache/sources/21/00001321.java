package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class P8 extends AbstractRunnableC0770Kc {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass85 A00;
    public final /* synthetic */ C04737s A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public P8(AnonymousClass85 anonymousClass85, C04737s c04737s) {
        this.A00 = anonymousClass85;
        this.A01 = c04737s;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C0792Lb c0792Lb;
        C0792Lb c0792Lb2;
        c0792Lb = this.A00.A0A;
        if (c0792Lb.getState() == EnumC0898Pe.A02) {
            c0792Lb2 = this.A00.A0A;
            if (c0792Lb2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0H(A00(0, 22, 11));
            }
        }
    }
}