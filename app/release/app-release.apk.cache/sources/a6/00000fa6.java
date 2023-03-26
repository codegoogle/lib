package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class AC {
    public int A00;
    public int A01;
    public AO A02;
    public boolean A03;

    public AC() {
    }

    public /* synthetic */ AC(A9 a9) {
        this();
    }

    public static /* synthetic */ int A00(AC ac) {
        return ac.A01;
    }

    public static /* synthetic */ int A01(AC ac) {
        return ac.A00;
    }

    public static /* synthetic */ boolean A02(AC ac) {
        return ac.A03;
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            I1.A03(i == 4);
            return;
        }
        this.A03 = true;
        this.A00 = i;
    }

    public final void A05(AO ao) {
        this.A02 = ao;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(AO ao) {
        return ao != this.A02 || this.A01 > 0 || this.A03;
    }
}