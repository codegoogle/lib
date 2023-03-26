package com.p7700g.p99005;

import android.animation.ValueAnimator;

/* compiled from: PulseRing.java */
/* loaded from: classes2.dex */
public class i22 extends v12 {
    public i22() {
        G(0.0f);
    }

    @Override // com.p7700g.p99005.v12, com.p7700g.p99005.x12
    public ValueAnimator v() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        l12 l12Var = new l12(this);
        Float valueOf = Float.valueOf(1.0f);
        return l12Var.m(fArr, Float.valueOf(0.0f), valueOf, valueOf).a(fArr, 255, 178, 0).c(1000L).h(n12.b(0.21f, 0.53f, 0.56f, 0.8f, fArr)).b();
    }
}