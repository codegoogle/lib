package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: Wave.java */
/* loaded from: classes2.dex */
public class n22 extends y12 {

    /* compiled from: Wave.java */
    /* loaded from: classes2.dex */
    public class a extends u12 {
        public a() {
            I(0.4f);
        }

        @Override // com.p7700g.p99005.u12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            l12 l12Var = new l12(this);
            Float valueOf = Float.valueOf(0.4f);
            return l12Var.o(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).c(1200L).d(fArr).b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        a[] aVarArr = new a[5];
        for (int i = 0; i < 5; i++) {
            aVarArr[i] = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                aVarArr[i].x((i * 100) + 600);
            } else {
                aVarArr[i].x((i * 100) - 1200);
            }
        }
        return aVarArr;
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a2 = a(rect);
        int width = a2.width() / P();
        int width2 = ((a2.width() / 5) * 3) / 5;
        for (int i = 0; i < P(); i++) {
            x12 O = O(i);
            int i2 = (width / 5) + (i * width) + a2.left;
            O.z(i2, a2.top, i2 + width2, a2.bottom);
        }
    }
}