package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;
import com.anythink.expressad.video.module.a.a.m;

/* renamed from: com.facebook.ads.redexgen.X.4q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class animation.Animation$AnimationListenerC03984q implements Animation.AnimationListener {
    public final /* synthetic */ C04014t A00;

    public animation.Animation$AnimationListenerC03984q(C04014t c04014t) {
        this.A00 = c04014t;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        new Handler().postDelayed(new C0983So(this), m.af);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}