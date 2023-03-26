package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class OM implements InterfaceC04074z {
    public final /* synthetic */ AnonymousClass51 A00;
    public final /* synthetic */ AnonymousClass83 A01;

    public OM(AnonymousClass83 anonymousClass83, AnonymousClass51 anonymousClass51) {
        this.A01 = anonymousClass83;
        this.A00 = anonymousClass51;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04074z
    public final boolean A7U() {
        boolean A0V;
        boolean A0W;
        if (!this.A01.A0U()) {
            A0V = this.A01.A0V();
            if (A0V) {
                return true;
            }
            A0W = this.A01.A0W();
            return A0W;
        }
        this.A01.A0T(this.A00);
        return true;
    }
}