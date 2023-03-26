package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Os  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0886Os {
    A04(VideoStartReason.NOT_STARTED),
    A05(VideoStartReason.USER_STARTED),
    A03(VideoStartReason.AUTO_STARTED);
    
    public static byte[] A01;
    public final VideoStartReason A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{10, 30, 31, 4, 20, 24, 31, 10, 25, 31, 14, 15, 66, 67, 88, 83, 95, 88, 77, 94, 88, 73, 72, 18, 20, 2, 21, 24, 20, 19, 6, 21, 19, 2, 3};
    }

    static {
        A02();
    }

    EnumC0886Os(VideoStartReason videoStartReason) {
        this.A00 = videoStartReason;
    }

    public static EnumC0886Os A00(VideoStartReason videoStartReason) {
        EnumC0886Os[] values;
        for (EnumC0886Os enumC0886Os : values()) {
            if (enumC0886Os.A00 == videoStartReason) {
                return enumC0886Os;
            }
        }
        return A04;
    }
}