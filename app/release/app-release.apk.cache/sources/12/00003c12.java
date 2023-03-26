package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.os.Build;

/* compiled from: DoubleBounce.java */
/* loaded from: classes2.dex */
public class c22 extends y12 {

    /* compiled from: DoubleBounce.java */
    /* loaded from: classes2.dex */
    public class a extends t12 {
        public a() {
            setAlpha(153);
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
}