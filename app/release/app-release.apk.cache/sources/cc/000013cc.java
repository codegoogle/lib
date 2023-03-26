package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.InterstitialAdExtendedListener;

/* renamed from: com.facebook.ads.redexgen.X.Rt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0965Rt extends AbstractC02950o {
    public final /* synthetic */ C0967Rv A00;

    public C0965Rt(C0967Rv c0967Rv) {
        this.A00 = c0967Rv;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A00() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        this.A00.A02 = false;
        interstitialAdExtendedListener = this.A00.A05;
        interstitialAdExtendedListener.onInterstitialActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A02() {
        C0637Et c0637Et;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C03251s c03251s;
        C0637Et c0637Et2;
        C0637Et c0637Et3;
        this.A00.A02 = false;
        c0637Et = this.A00.A01;
        if (c0637Et != null) {
            c0637Et2 = this.A00.A01;
            c0637Et2.A0R(new C0964Rs(this));
            c0637Et3 = this.A00.A01;
            c0637Et3.A0L();
            this.A00.A01 = null;
        }
        interstitialAdExtendedListener = this.A00.A05;
        c03251s = this.A00.A06;
        interstitialAdExtendedListener.onInterstitialDismissed(c03251s.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A04() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C03251s c03251s;
        interstitialAdExtendedListener = this.A00.A05;
        c03251s = this.A00.A06;
        interstitialAdExtendedListener.onInterstitialDisplayed(c03251s.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A05;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A05;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A05;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0B() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C03251s c03251s;
        this.A00.A04.A0A().A2Y();
        interstitialAdExtendedListener = this.A00.A05;
        c03251s = this.A00.A06;
        interstitialAdExtendedListener.onAdClicked(c03251s.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C03251s c03251s;
        interstitialAdExtendedListener = this.A00.A05;
        c03251s = this.A00.A06;
        interstitialAdExtendedListener.onLoggingImpression(c03251s.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0D(View view) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0E(InterfaceC02940n interfaceC02940n) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C03251s c03251s;
        this.A00.A03 = true;
        interstitialAdExtendedListener = this.A00.A05;
        c03251s = this.A00.A06;
        interstitialAdExtendedListener.onAdLoaded(c03251s.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0F(C0755Jm c0755Jm) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C03251s c03251s;
        C0S A0A = this.A00.A04.A0A();
        j = this.A00.A00;
        A0A.A2d(LW.A01(j), c0755Jm.A04().getErrorCode(), c0755Jm.A05());
        interstitialAdExtendedListener = this.A00.A05;
        c03251s = this.A00.A06;
        interstitialAdExtendedListener.onError(c03251s.A01(), C0755Jm.A00(c0755Jm));
    }
}