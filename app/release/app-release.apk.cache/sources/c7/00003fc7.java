package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;

/* compiled from: FoldingCube.java */
/* loaded from: classes2.dex */
public class e22 extends y12 {
    private boolean Y = false;

    /* compiled from: FoldingCube.java */
    /* loaded from: classes2.dex */
    public class a extends u12 {
        public a() {
            setAlpha(0);
            E(-180);
        }

        @Override // com.p7700g.p99005.u12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new l12(this).a(fArr, 0, 0, 255, 255, 0, 0).k(fArr, -180, -180, 0, 0, 0, 0).l(fArr, 0, 0, 0, 0, 180, 180).c(2400L).h(new LinearInterpolator()).b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public void N(Canvas canvas) {
        Rect a2 = a(getBounds());
        for (int i = 0; i < P(); i++) {
            int save = canvas.save();
            canvas.rotate((i * 90) + 45, a2.centerX(), a2.centerY());
            O(i).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        a[] aVarArr = new a[4];
        for (int i = 0; i < 4; i++) {
            aVarArr[i] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].x(i * 300);
            } else {
                aVarArr[i].x((i * 300) - 1200);
            }
        }
        return aVarArr;
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a2 = a(rect);
        int min = Math.min(a2.width(), a2.height());
        if (this.Y) {
            min = (int) Math.sqrt((min * min) / 2);
            int width = (a2.width() - min) / 2;
            int height = (a2.height() - min) / 2;
            a2 = new Rect(a2.left + width, a2.top + height, a2.right - width, a2.bottom - height);
        }
        int i = min / 2;
        int i2 = a2.left + i + 1;
        int i3 = a2.top + i + 1;
        for (int i4 = 0; i4 < P(); i4++) {
            x12 O = O(i4);
            O.z(a2.left, a2.top, i2, i3);
            O.B(O.h().right);
            O.C(O.h().bottom);
        }
    }
}