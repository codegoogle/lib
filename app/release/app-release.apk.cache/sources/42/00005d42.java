package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: CircleSprite.java */
/* loaded from: classes2.dex */
public class t12 extends w12 {
    @Override // com.p7700g.p99005.w12
    public void N(Canvas canvas, Paint paint) {
        if (h() != null) {
            canvas.drawCircle(h().centerX(), h().centerY(), Math.min(h().width(), h().height()) / 2, paint);
        }
    }

    @Override // com.p7700g.p99005.x12
    public ValueAnimator v() {
        return null;
    }
}