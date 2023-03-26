package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* compiled from: CubeGrid.java */
/* loaded from: classes2.dex */
public class b22 extends y12 {

    /* compiled from: CubeGrid.java */
    /* loaded from: classes2.dex */
    public class b extends u12 {
        private b() {
        }

        @Override // com.p7700g.p99005.u12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            l12 l12Var = new l12(this);
            Float valueOf = Float.valueOf(1.0f);
            return l12Var.m(fArr, valueOf, Float.valueOf(0.0f), valueOf, valueOf).c(1300L).d(fArr).b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
        b[] bVarArr = new b[9];
        for (int i = 0; i < 9; i++) {
            bVarArr[i] = new b();
            bVarArr[i].x(iArr[i]);
        }
        return bVarArr;
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a2 = a(rect);
        int width = (int) (a2.width() * 0.33f);
        int height = (int) (a2.height() * 0.33f);
        for (int i = 0; i < P(); i++) {
            int i2 = ((i % 3) * width) + a2.left;
            int i3 = ((i / 3) * height) + a2.top;
            O(i).z(i2, i3, i2 + width, i3 + height);
        }
    }
}