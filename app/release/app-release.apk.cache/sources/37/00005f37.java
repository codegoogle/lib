package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: RectSprite.java */
/* loaded from: classes2.dex */
public class u12 extends w12 {
    @Override // com.p7700g.p99005.w12
    public void N(Canvas canvas, Paint paint) {
        if (h() != null) {
            canvas.drawRect(h(), paint);
        }
    }

    @Override // com.p7700g.p99005.x12
    public ValueAnimator v() {
        return null;
    }
}