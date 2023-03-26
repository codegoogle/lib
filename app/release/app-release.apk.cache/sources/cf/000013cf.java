package com.facebook.ads.redexgen.X;

import com.facebook.ads.S2SRewardedVideoAdExtendedListener;

/* renamed from: com.facebook.ads.redexgen.X.Rw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0968Rw extends AbstractC02950o {
    public final /* synthetic */ C0970Ry A00;

    public C0968Rw(C0970Ry c0970Ry) {
        this.A00 = c0970Ry;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A05() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A08() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A09() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0B() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C03291w c03291w;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        c03291w = this.A00.A06;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c03291w.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C03291w c03291w;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        c03291w = this.A00.A06;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c03291w.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0E(InterfaceC02940n interfaceC02940n) {
        Eq eq;
        C03291w c03291w;
        C03291w c03291w2;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C03291w c03291w3;
        C03291w c03291w4;
        C0970Ry c0970Ry = this.A00;
        eq = c0970Ry.A02;
        c0970Ry.A03 = eq.A0I();
        RM rm = (RM) interfaceC02940n;
        c03291w = this.A00.A06;
        if (c03291w.A03 != null) {
            c03291w4 = this.A00.A06;
            rm.A01(c03291w4.A03);
        }
        c03291w2 = this.A00.A06;
        c03291w2.A00 = rm.A0B();
        this.A00.A04 = true;
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        c03291w3 = this.A00.A06;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c03291w3.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0F(C0755Jm c0755Jm) {
        C03291w c03291w;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C03291w c03291w2;
        this.A00.A0A(true);
        c03291w = this.A00.A06;
        C0S A0A = c03291w.A0B.A0A();
        j = this.A00.A01;
        A0A.A2d(LW.A01(j), c0755Jm.A04().getErrorCode(), c0755Jm.A05());
        s2SRewardedVideoAdExtendedListener = this.A00.A05;
        c03291w2 = this.A00.A06;
        s2SRewardedVideoAdExtendedListener.onError(c03291w2.A01(), C0755Jm.A00(c0755Jm));
    }
}