package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: FadeInAnimator.java */
/* loaded from: classes3.dex */
public class qg3 extends og3 {
    @Override // com.p7700g.p99005.og3
    public void i(View target) {
        d().playTogether(ObjectAnimator.ofFloat(target, "alpha", 0.0f, 1.0f));
    }
}