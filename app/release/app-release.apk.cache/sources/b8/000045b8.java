package com.p7700g.p99005;

import android.animation.ValueAnimator;

/* compiled from: Pulse.java */
/* loaded from: classes2.dex */
public class h22 extends t12 {
    public h22() {
        G(0.0f);
    }

    @Override // com.p7700g.p99005.t12, com.p7700g.p99005.x12
    public ValueAnimator v() {
        float[] fArr = {0.0f, 1.0f};
        return new l12(this).m(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f)).a(fArr, 255, 0).c(1000L).d(fArr).b();
    }
}