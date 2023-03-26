package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: BounceAnimator.java */
/* loaded from: classes3.dex */
public class pg3 extends og3 {
    @Override // com.p7700g.p99005.og3
    public void i(View target) {
        d().playTogether(ObjectAnimator.ofFloat(target, "translationY", 0.0f, 0.0f, -30.0f, 0.0f, -15.0f, 0.0f, 0.0f));
    }
}