package com.p7700g.p99005;

import android.animation.ValueAnimator;

/* compiled from: RotatingCircle.java */
/* loaded from: classes2.dex */
public class j22 extends t12 {
    @Override // com.p7700g.p99005.t12, com.p7700g.p99005.x12
    public ValueAnimator v() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new l12(this).k(fArr, 0, -180, -180).l(fArr, 0, 0, -180).c(1200L).d(fArr).b();
    }
}