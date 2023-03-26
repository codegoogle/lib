package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: RingSprite.java */
/* loaded from: classes2.dex */
public class v12 extends w12 {
    @Override // com.p7700g.p99005.w12
    public void N(Canvas canvas, Paint paint) {
        if (h() != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(h().width(), h().height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(h().centerX(), h().centerY(), min, paint);
        }
    }

    @Override // com.p7700g.p99005.x12
    public ValueAnimator v() {
        return null;
    }
}