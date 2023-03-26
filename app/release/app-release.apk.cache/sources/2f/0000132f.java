package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PM implements Animator.AnimatorListener {
    public final /* synthetic */ C0674Gg A00;

    public PM(C0674Gg c0674Gg) {
        this.A00 = c0674Gg;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A0A(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = PD.A05;
        view = this.A00.A05;
        C0795Le.A0K(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}