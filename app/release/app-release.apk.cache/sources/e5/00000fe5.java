package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BF extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 108, 125, 112, 118, 77, 107, 120, 122, 114, 57, 110, 107, 112, 109, 124, 57, g15.c, 120, 112, 117, 124, 125, 35, 57};
    }

    public BF(int i) {
        super(A00(0, 25, 85) + i);
        this.A00 = i;
    }
}