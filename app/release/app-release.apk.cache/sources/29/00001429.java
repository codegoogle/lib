package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TR extends AbstractRunnableC0770Kc {
    public static byte[] A03;
    public final /* synthetic */ AnonymousClass60 A00;
    public final /* synthetic */ C1081Wi A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{53, 55, 60, 55, 32, 59, 49};
    }

    public TR(AnonymousClass60 anonymousClass60, String str, C1081Wi c1081Wi) {
        this.A00 = anonymousClass60;
        this.A02 = str;
        this.A01 = c1081Wi;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        try {
            this.A00.A07(this.A02);
        } catch (Throwable th) {
            this.A01.A04().A82(A00(0, 7, 2), C04848i.A10, new C04858j(th));
        }
    }
}