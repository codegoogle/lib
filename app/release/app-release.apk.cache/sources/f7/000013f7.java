package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0973Sc implements C3Z {
    public final /* synthetic */ ES A00;

    public C0973Sc(ES es) {
        this.A00 = es;
    }

    private final void A00(C03573a c03573a) {
        int i = c03573a.A00;
        if (i == 1) {
            this.A00.A06.A1R(this.A00, c03573a.A02, c03573a.A01);
        } else if (i == 2) {
            this.A00.A06.A1S(this.A00, c03573a.A02, c03573a.A01);
        } else if (i == 4) {
            this.A00.A06.A1U(this.A00, c03573a.A02, c03573a.A01, c03573a.A03);
        } else if (i != 8) {
        } else {
            this.A00.A06.A1T(this.A00, c03573a.A02, c03573a.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final C4X A57(int i) {
        C4X A1H = this.A00.A1H(i, true);
        if (A1H == null || this.A00.A01.A0L(A1H.A0H)) {
            return null;
        }
        return A1H;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8S(int i, int i2, Object obj) {
        this.A00.A1g(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8g(int i, int i2) {
        this.A00.A1d(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8h(int i, int i2) {
        this.A00.A1e(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8i(int i, int i2) {
        this.A00.A1h(i, i2, true);
        ES es = this.A00;
        es.A0G = true;
        es.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A8j(int i, int i2) {
        this.A00.A1h(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A9K(C03573a c03573a) {
        A00(c03573a);
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A9M(C03573a c03573a) {
        A00(c03573a);
    }
}