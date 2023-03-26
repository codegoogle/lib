package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: CircleLayoutContainer.java */
/* loaded from: classes2.dex */
public abstract class s12 extends y12 {
    @Override // com.p7700g.p99005.y12
    public void N(Canvas canvas) {
        for (int i = 0; i < P(); i++) {
            x12 O = O(i);
            int save = canvas.save();
            canvas.rotate((i * 360) / P(), getBounds().centerX(), getBounds().centerY());
            O.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a = a(rect);
        int width = (int) (((a.width() * 3.141592653589793d) / 3.5999999046325684d) / P());
        int centerX = a.centerX() - width;
        int centerX2 = a.centerX() + width;
        for (int i = 0; i < P(); i++) {
            x12 O = O(i);
            int i2 = a.top;
            O.z(centerX, i2, centerX2, (width * 2) + i2);
        }
    }
}