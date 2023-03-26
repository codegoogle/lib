package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class DX {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final DQ A05;
    public final IP A06 = new IP(new byte[64]);
    public final C0722Ic A07;

    public DX(DQ dq, C0722Ic c0722Ic) {
        this.A05 = dq;
        this.A07 = c0722Ic;
    }

    private void A00() {
        this.A06.A09(8);
        this.A03 = this.A06.A0G();
        this.A02 = this.A06.A0G();
        this.A06.A09(6);
        this.A00 = this.A06.A05(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A09(4);
            this.A06.A09(1);
            this.A06.A09(1);
            long A05 = (this.A06.A05(3) << 30) | (this.A06.A05(15) << 15) | this.A06.A05(15);
            this.A06.A09(1);
            if (!this.A04 && this.A02) {
                this.A06.A09(4);
                this.A06.A09(1);
                this.A06.A09(1);
                this.A06.A09(1);
                this.A07.A08((this.A06.A05(3) << 30) | (this.A06.A05(15) << 15) | this.A06.A05(15));
                this.A04 = true;
            }
            long pts = this.A07.A08(A05);
            this.A01 = pts;
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.ACi();
    }

    public final void A03(IQ iq) throws AN {
        iq.A0d(this.A06.A00, 0, 3);
        this.A06.A08(0);
        A00();
        iq.A0d(this.A06.A00, 0, this.A00);
        this.A06.A08(0);
        A01();
        this.A05.ABW(this.A01, true);
        this.A05.A48(iq);
        this.A05.ABV();
    }
}