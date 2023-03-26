package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;
import com.ironsource.sdk.controller.v;

/* renamed from: com.facebook.ads.redexgen.X.Mh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0824Mh {
    public static String[] A00;
    public static final int A01;
    public static final int A02;
    public static final int A03;

    public static void A03() {
        A00 = new String[]{"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", v.a, "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    }

    static {
        A03();
        A01 = (int) (C0795Le.A01 * 200.0f);
        A03 = (int) (C0795Le.A01 * 200.0f);
        A02 = (int) (C0795Le.A01 * 50.0f);
    }

    public static AnonymousClass10 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass10.A05;
        }
        if (A04(nativeAdLayout)) {
            return AnonymousClass10.A06;
        }
        return AnonymousClass10.A04;
    }

    @Nullable
    public static AbstractC0823Mg A01(C1080Wh c1080Wh, JE je, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int i = A01;
        if (width >= i && height >= i) {
            return new XT(c1080Wh, je, str);
        }
        if (width < A03 || height < A02) {
            return null;
        }
        return new XU(c1080Wh, je, str);
    }

    public static AbstractC0823Mg A02(C1080Wh c1080Wh, JE je, String str, C1Q c1q, M7 m7, M6 m6) {
        return new XX(c1080Wh, je, str, c1q, m7, m6);
    }

    public static boolean A04(NativeAdLayout nativeAdLayout) {
        int h = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h < i || w < i) {
            if (h >= A03) {
                int i2 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[5] = "hhrIY4o6fKEkU42z4UVpb3";
                strArr[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (w < i2) {
                }
            }
            return true;
        }
        return false;
    }
}