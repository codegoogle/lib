package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public class ZB implements DY {
    public final IP A00 = new IP(new byte[4]);
    public final /* synthetic */ ZD A01;

    public ZB(ZD zd) {
        this.A01 = zd;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A48(IQ iq) {
        int i;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (iq.A0F() != 0) {
            return;
        }
        iq.A0a(7);
        int A05 = iq.A05() / 4;
        for (int i2 = 0; i2 < A05; i2++) {
            iq.A0b(this.A00, 4);
            int A052 = this.A00.A05(16);
            this.A00.A09(3);
            if (A052 == 0) {
                this.A00.A09(13);
            } else {
                int A053 = this.A00.A05(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(A053, new Z8(new ZC(this.A01, A053)));
                ZD.A01(this.A01);
            }
        }
        i = this.A01.A05;
        if (i == 2) {
            return;
        }
        sparseArray = this.A01.A06;
        sparseArray.remove(0);
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A7S(C0722Ic c0722Ic, CM cm, C0600De c0600De) {
    }
}