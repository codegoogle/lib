package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MD implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass51 A00;
    public final /* synthetic */ ZY A01;
    public final /* synthetic */ ZY A02;

    public MD(ZY zy, ZY zy2, AnonymousClass51 anonymousClass51) {
        this.A01 = zy;
        this.A02 = zy2;
        this.A00 = anonymousClass51;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        C0795Le.A0K(this.A02);
        new Handler().postDelayed(new C1153Zc(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}