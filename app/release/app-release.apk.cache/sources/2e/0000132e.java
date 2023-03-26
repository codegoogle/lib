package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* loaded from: assets/audience_network.dex */
public class PL implements Animator.AnimatorListener {
    public final /* synthetic */ C0674Gg A00;

    public PL(C0674Gg c0674Gg) {
        this.A00 = c0674Gg;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = PD.A03;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}