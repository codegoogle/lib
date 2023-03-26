package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class FX extends R3<AdSize> {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{99, -95, -88, -97, -97};
    }

    public FX(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.R3
    /* renamed from: A00 */
    public final C0X A06(AdSize adSize) {
        String str;
        if (adSize == null) {
            str = A01(1, 4, 35);
        } else {
            str = adSize.getWidth() + A01(0, 1, 25) + adSize.getHeight();
        }
        return new C0X(this, str);
    }
}