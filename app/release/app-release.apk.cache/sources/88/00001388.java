package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0933Qn extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0932Qm A00;
    public final /* synthetic */ boolean A01;

    public C0933Qn(C0932Qm c0932Qm, boolean z) {
        this.A00 = c0932Qm;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C0860Ns c0860Ns;
        c0860Ns = this.A00.A0E;
        M1 A08 = c0860Ns.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A01 || A08.A07()) ? false : true);
        A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}