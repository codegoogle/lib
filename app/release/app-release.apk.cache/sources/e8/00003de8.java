package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.os.Build;

/* compiled from: FadingCircle.java */
/* loaded from: classes2.dex */
public class d22 extends s12 {

    /* compiled from: FadingCircle.java */
    /* loaded from: classes2.dex */
    public class a extends t12 {
        public a() {
            setAlpha(0);
        }

        @Override // com.p7700g.p99005.t12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            return new l12(this).a(fArr, 0, 0, 255, 0).c(1200L).d(fArr).b();
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