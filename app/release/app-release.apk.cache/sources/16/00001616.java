package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1261bS extends AbstractC02950o {
    public static byte[] A01;
    public final /* synthetic */ C1267bZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, bx.W5, 61, 50, ax5.a, 46, -23, bx.W5, 45, 60, -23, 54, bx.W5, 55, bx.W5, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public C1261bS(C1267bZ c1267bZ) {
        this.A00 = c1267bZ;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0A(RG rg) {
        InterfaceC1268ba interfaceC1268ba;
        this.A00.A0d(rg, true);
        interfaceC1268ba = this.A00.A0F;
        if (interfaceC1268ba != null && rg.A0V() != null) {
            C1260bR c1260bR = new C1260bR(this);
            for (C1267bZ c1267bZ : rg.A0V()) {
                c1267bZ.A0e(c1260bR);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0B() {
        InterfaceC1268ba interfaceC1268ba;
        InterfaceC1268ba interfaceC1268ba2;
        interfaceC1268ba = this.A00.A0F;
        if (interfaceC1268ba == null) {
            return;
        }
        interfaceC1268ba2 = this.A00.A0F;
        interfaceC1268ba2.A8k();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0C() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0E(InterfaceC02940n interfaceC02940n) {
        C0636Es c0636Es;
        C0636Es c0636Es2;
        c0636Es = this.A00.A09;
        if (c0636Es == null) {
            return;
        }
        c0636Es2 = this.A00.A09;
        c0636Es2.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0F(C0755Jm c0755Jm) {
        long j;
        InterfaceC1268ba interfaceC1268ba;
        InterfaceC1268ba interfaceC1268ba2;
        C0S A0A = this.A00.A0x().A0A();
        j = this.A00.A00;
        A0A.A2d(LW.A01(j), c0755Jm.A04().getErrorCode(), c0755Jm.A05());
        interfaceC1268ba = this.A00.A0F;
        if (interfaceC1268ba == null) {
            return;
        }
        interfaceC1268ba2 = this.A00.A0F;
        interfaceC1268ba2.A9X(c0755Jm);
    }
}