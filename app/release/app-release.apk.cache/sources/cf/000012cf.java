package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Nn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0855Nn {
    public static final int A00 = C0795Le.A02.heightPixels;
    public static final int A01 = C0795Le.A02.widthPixels;

    public static float A00(AnonymousClass19 anonymousClass19) {
        int A012 = anonymousClass19.A0E().A01();
        int height = anonymousClass19.A0E().A00();
        if (height > 0) {
            return A012 / height;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        return (int) ((A01 - (AbstractC0856No.A09 * 2)) / d);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = C0795Le.A01(16);
        int i = C0845Nd.A0B * 2;
        int ctaSpacing = AbstractC0856No.A09;
        int ctaMargin2 = ctaMargin + i + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d) {
        return d < 0.9d;
    }

    public static boolean A04(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A05(int i, int i2, double d) {
        return i == 2 || A04(d, i2);
    }
}