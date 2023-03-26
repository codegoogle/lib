package com.p7700g.p99005;

import android.graphics.RectF;

/* compiled from: FitModeEvaluators.java */
@e2(21)
/* loaded from: classes3.dex */
public class pk2 {
    private static final ok2 a = new a();
    private static final ok2 b = new b();

    /* compiled from: FitModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class a implements ok2 {
        @Override // com.p7700g.p99005.ok2
        public qk2 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = el2.m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new qk2(f8, f9, m, f5 * f8, m, f7 * f9);
        }

        @Override // com.p7700g.p99005.ok2
        public boolean b(qk2 qk2Var) {
            return qk2Var.d > qk2Var.f;
        }

        @Override // com.p7700g.p99005.ok2
        public void c(RectF rectF, float f, qk2 qk2Var) {
            rectF.bottom -= Math.abs(qk2Var.f - qk2Var.d) * f;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class b implements ok2 {
        @Override // com.p7700g.p99005.ok2
        public qk2 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = el2.m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new qk2(f8, f9, f4 * f8, m, f6 * f9, m);
        }

        @Override // com.p7700g.p99005.ok2
        public boolean b(qk2 qk2Var) {
            return qk2Var.c > qk2Var.e;
        }

        @Override // com.p7700g.p99005.ok2
        public void c(RectF rectF, float f, qk2 qk2Var) {
            float abs = (Math.abs(qk2Var.e - qk2Var.c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    private pk2() {
    }

    public static ok2 a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return b(z, rectF, rectF2) ? a : b;
        } else if (i != 1) {
            if (i == 2) {
                return b;
            }
            throw new IllegalArgumentException(wo1.l("Invalid fit mode: ", i));
        } else {
            return a;
        }
    }

    private static boolean b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }
}