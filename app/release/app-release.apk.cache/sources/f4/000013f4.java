package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class SZ extends AbstractC03813z {
    public SZ(C4F c4f) {
        super(c4f, null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A06() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A07() {
        return this.A02.A0Y() - this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A08() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A09() {
        return this.A02.A0Z();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0A() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0B() {
        return (this.A02.A0Y() - this.A02.A0h()) - this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0C(View view) {
        return this.A02.A0k(view) + ((C4G) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0D(View view) {
        C4G c4g = (C4G) view.getLayoutParams();
        return this.A02.A0m(view) + c4g.topMargin + c4g.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0E(View view) {
        C4G c4g = (C4G) view.getLayoutParams();
        return this.A02.A0n(view) + c4g.leftMargin + c4g.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0F(View view) {
        return this.A02.A0p(view) - ((C4G) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0G(View view) {
        this.A02.A1F(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final int A0H(View view) {
        this.A02.A1F(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03813z
    public final void A0J(int i) {
        this.A02.A11(i);
    }
}