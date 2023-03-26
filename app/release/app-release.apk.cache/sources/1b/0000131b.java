package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class P2 extends AnimatorListenerAdapter {
    public final /* synthetic */ C04617c A00;

    public P2(C04617c c04617c) {
        this.A00 = c04617c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0696Hc(this), 2000L);
    }
}