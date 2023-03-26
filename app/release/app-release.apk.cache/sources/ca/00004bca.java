package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* compiled from: RotatingPlane.java */
/* loaded from: classes2.dex */
public class k22 extends u12 {
    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        A(a(rect));
    }

    @Override // com.p7700g.p99005.u12, com.p7700g.p99005.x12
    public ValueAnimator v() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new l12(this).k(fArr, 0, -180, -180).l(fArr, 0, 0, -180).c(1200L).d(fArr).b();
    }
}