package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Ny  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0866Ny extends AnimatorListenerAdapter {
    public final /* synthetic */ C0932Qm A00;
    public final /* synthetic */ boolean A01;

    public C0866Ny(C0932Qm c0932Qm, boolean z) {
        this.A00 = c0932Qm;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        O1 o1;
        XS xs;
        XS xs2;
        super.onAnimationEnd(animator);
        o1 = this.A00.A0F;
        o1.setTranslationY(0.0f);
        this.A00.A0J();
        if (this.A01) {
            return;
        }
        xs = this.A00.A0D;
        if (xs == null) {
            return;
        }
        xs2 = this.A00.A0D;
        xs2.destroy();
    }
}