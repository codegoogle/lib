package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.os.Build;

/* compiled from: Circle.java */
/* loaded from: classes2.dex */
public class a22 extends s12 {

    /* compiled from: Circle.java */
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
            return l12Var.m(fArr, valueOf, Float.valueOf(1.0f), valueOf).c(1200L).d(fArr).b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        a[] aVarArr = new a[12];
        for (int i = 0; i < 12; i++) {
            aVarArr[i] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].x(i * 100);
            } else {
                aVarArr[i].x((i * 100) - 1200);
            }
        }
        return aVarArr;
    }
}