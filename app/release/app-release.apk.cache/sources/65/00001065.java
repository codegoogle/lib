package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DZ {
    public static byte[] A02;
    public final List<Format> A00;
    public final CW[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-91, -54, -46, -67, -56, -59, -64, 124, -65, -56, -53, -49, -63, -64, 124, -65, -67, -52, -48, -59, -53, -54, 124, -55, -59, -55, -63, 124, -48, -43, -52, -63, 124, -52, -50, -53, -46, -59, -64, -63, -64, -106, 124, -110, -95, -95, -99, -102, -108, -110, -91, -102, -96, -97, 96, -108, -106, -110, 94, 103, 97, 105, -33, -18, -18, -22, -25, bx.j7, -33, -14, -25, -19, -20, -83, bx.j7, -29, -33, -85, -75, -82, -74};
    }

    public DZ(List<Format> list) {
        this.A00 = list;
        this.A01 = new CW[list.size()];
    }

    public final void A02(long j, IQ iq) {
        GQ.A04(j, iq, this.A01);
    }

    public final void A03(CM cm, C0600De c0600De) {
        for (int i = 0; i < this.A01.length; i++) {
            c0600De.A06();
            CW ADY = cm.ADY(c0600De.A04(), 3);
            Format format = this.A00.get(i);
            String str = format.A0O;
            boolean z = A00(43, 19, 42).equals(str) || A00(62, 19, 119).equals(str);
            I1.A05(z, A00(0, 43, 85) + str);
            ADY.A5A(Format.A08(format.A0M != null ? format.A0M : c0600De.A05(), str, null, -1, format.A0D, format.A0N, format.A03, null));
            this.A01[i] = ADY;
        }
    }
}