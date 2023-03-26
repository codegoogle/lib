package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RO implements NT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RP A01;
    public final /* synthetic */ C1267bZ A02;

    public RO(RP rp, int i, C1267bZ c1267bZ) {
        this.A01 = rp;
        this.A00 = i;
        this.A02 = c1267bZ;
    }

    @Override // com.facebook.ads.redexgen.X.NT
    public final void A9g(boolean z) {
        AbstractC0900Pg abstractC0900Pg;
        if (this.A00 == 0) {
            C1267bZ c1267bZ = this.A02;
            abstractC0900Pg = this.A01.A04;
            c1267bZ.A1R(abstractC0900Pg);
        }
        this.A02.A1U(z, true);
    }
}