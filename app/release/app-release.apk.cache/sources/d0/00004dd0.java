package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* compiled from: ThreeBounce.java */
/* loaded from: classes2.dex */
public class l22 extends y12 {

    /* compiled from: ThreeBounce.java */
    /* loaded from: classes2.dex */
    public class a extends t12 {
        public a() {
            G(0.0f);
        }

        @Override // com.p7700g.p99005.t12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            l12 l12Var = new l12(this);
            Float valueOf = Float.valueOf(0.0f);
            return l12Var.m(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).c(1400L).d(fArr).b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public void R(x12... x12VarArr) {
        super.R(x12VarArr);
        x12VarArr[1].x(160);
        x12VarArr[2].x(320);
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        return new x12[]{new a(), new a(), new a()};
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a2 = a(rect);
        int width = a2.width() / 8;
        int centerY = a2.centerY() - width;
        int centerY2 = a2.centerY() + width;
        for (int i = 0; i < P(); i++) {
            int width2 = ((a2.width() * i) / 3) + a2.left;
            O(i).z(width2, centerY, (width * 2) + width2, centerY2);
        }
    }
}