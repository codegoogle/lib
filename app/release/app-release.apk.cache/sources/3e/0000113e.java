package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HC {
    public final int A00;
    public final H9 A01;
    public final Object A02;
    public final C0531Ad[] A03;

    public HC(C0531Ad[] c0531AdArr, H8[] h8Arr, Object obj) {
        this.A03 = c0531AdArr;
        this.A01 = new H9(h8Arr);
        this.A02 = obj;
        this.A00 = c0531AdArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(HC hc) {
        if (hc == null || hc.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(hc, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(HC hc, int i) {
        return hc != null && C0726Ig.A0h(this.A03[i], hc.A03[i]) && C0726Ig.A0h(this.A01.A01(i), hc.A01.A01(i));
    }
}