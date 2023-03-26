package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0697Hd extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 46);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -105, -47, -22, bx.j7, -12, -20, bx.j7, -33, -16, bx.j7, -32, -100};
    }

    public C0697Hd(Throwable th) {
        super(A00(2, 11, 78) + th.getClass().getSimpleName() + A00(0, 2, 73) + th.getMessage(), th);
    }
}