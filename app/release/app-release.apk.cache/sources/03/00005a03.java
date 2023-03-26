package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: ShakeAnimator.java */
/* loaded from: classes3.dex */
public class rg3 extends og3 {
    @Override // com.p7700g.p99005.og3
    public void i(View target) {
        d().playTogether(ObjectAnimator.ofFloat(target, "translationX", 0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f));
    }
}