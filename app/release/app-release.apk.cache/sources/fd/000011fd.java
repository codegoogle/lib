package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum KL {
    A09,
    A07,
    A06,
    A08,
    A05,
    A0B,
    A0A,
    A02,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-101, -85, -88, -80, -84, -98, -85, -41, -20, bx.j7, -44, -32, -36, -42, -14, -36, bx.j7, -25, -40, -27, -26, -25, -36, -25, -36, -44, -33, -80, -59, -70, -83, -71, -75, -81, -53, -66, -79, -61, -83, -66, -80, -79, -80, -53, -62, -75, -80, -79, -69, -47, -32, -41, -41, -22, -34, -50, -35, -48, -48, bx.l7, -22, bx.j7, -44, -49, -48, -38, -61, -56, -50, -65, -52, -51, -50, -61, -50, -61, -69, -58, bx.l7, -56, -69, -50, -61, -48, -65, bx.l7, -67, -69, -52, -55, -49, -51, -65, -58, -86, -81, -75, -90, -77, -76, -75, -86, -75, -86, -94, -83, -64, -81, -94, -75, -86, -73, -90, -64, -86, -82, -94, -88, -90, -46, -41, -35, -50, -37, -36, -35, -46, -35, -46, -54, -43, -24, -41, -54, -35, -46, -33, -50, -24, bx.l7, -43, -54, -30, -54, -53, -43, -50, -57, -52, -46, -61, -48, -47, -46, -57, -46, -57, -65, -54, -35, -52, -65, -46, -57, -44, -61, -35, -44, -57, -62, -61, -51, -91, -104, -86, -108, -91, -105, -104, -105, -78, -93, -97, -108, -84, -108, -107, -97, -104, 122, 109, g15.c, 105, 122, 108, 109, 108, -121, 126, 113, 108, 109, 119};
    }

    static {
        A01();
    }
}