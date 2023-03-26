package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T7 extends KP {
    public final /* synthetic */ TA A00;
    public final /* synthetic */ C0755Jm A01;

    public T7(TA ta, C0755Jm c0755Jm) {
        this.A00 = ta;
        this.A01 = c0755Jm;
    }

    @Override // com.facebook.ads.redexgen.X.KP
    public final void A04() {
        C5H c5h;
        C5H c5h2;
        c5h = this.A00.A00;
        if (c5h.A02() == null) {
            return;
        }
        c5h2 = this.A00.A00;
        c5h2.A02().onAdError(C0755Jm.A00(this.A01));
    }
}