package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* loaded from: assets/audience_network.dex */
public class PF implements Animator.AnimatorListener {
    public final /* synthetic */ C0679Gl A00;

    public PF(C0679Gl c0679Gl) {
        this.A00 = c0679Gl;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = PD.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}