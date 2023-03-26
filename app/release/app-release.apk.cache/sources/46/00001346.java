package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Pj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0903Pj extends AbstractRunnableC0770Kc {
    public final /* synthetic */ OG A00;
    public final /* synthetic */ OH A01;

    public C0903Pj(OH oh, OG og) {
        this.A01 = oh;
        this.A00 = og;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new QS(this));
        this.A01.startAnimation(alphaAnimation);
    }
}