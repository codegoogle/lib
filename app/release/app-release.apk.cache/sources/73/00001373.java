package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class QS extends animation.Animation$AnimationListenerC0794Ld {
    public final /* synthetic */ C0903Pj A00;

    public QS(C0903Pj c0903Pj) {
        this.A00 = c0903Pj;
    }

    @Override // com.facebook.ads.redexgen.X.animation.Animation$AnimationListenerC0794Ld, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0795Le.A0K(this.A00.A01);
        this.A00.A00.A9t();
    }
}