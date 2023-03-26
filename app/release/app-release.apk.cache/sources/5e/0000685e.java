package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;

/* compiled from: ChasingDots.java */
/* loaded from: classes2.dex */
public class z12 extends y12 {

    /* compiled from: ChasingDots.java */
    /* loaded from: classes2.dex */
    public class a extends t12 {
        public a() {
            G(0.0f);
        }

        @Override // com.p7700g.p99005.t12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            l12 l12Var = new l12(this);
            Float valueOf = Float.valueOf(0.0f);
            return l12Var.m(fArr, valueOf, Float.valueOf(1.0f), valueOf).c(2000L).d(fArr).b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public void R(x12... x12VarArr) {
        super.R(x12VarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            x12VarArr[1].x(1000);
        } else {
            x12VarArr[1].x(pg.o);
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        return new x12[]{new a(), new a()};
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a2 = a(rect);
        int width = (int) (a2.width() * 0.6f);
        x12 O = O(0);
        int i = a2.right;
        int i2 = a2.top;
        O.z(i - width, i2, i, i2 + width);
        x12 O2 = O(1);
        int i3 = a2.right;
        int i4 = a2.bottom;
        O2.z(i3 - width, i4 - width, i3, i4);
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12
    public ValueAnimator v() {
        return new l12(this).j(new float[]{0.0f, 1.0f}, 0, 360).c(2000L).h(new LinearInterpolator()).b();
    }
}