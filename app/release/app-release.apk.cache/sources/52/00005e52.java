package com.p7700g.p99005;

import android.graphics.RectF;

/* compiled from: FitModeEvaluators.java */
/* loaded from: classes3.dex */
public class tj2 {
    private static final sj2 a = new a();
    private static final sj2 b = new b();

    /* compiled from: FitModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class a implements sj2 {
        @Override // com.p7700g.p99005.sj2
        public uj2 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = hk2.m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new uj2(f8, f9, m, f5 * f8, m, f7 * f9);
        }

        @Override // com.p7700g.p99005.sj2
        public boolean b(uj2 uj2Var) {
            return uj2Var.d > uj2Var.f;
        }

        @Override // com.p7700g.p99005.sj2
        public void c(RectF rectF, float f, uj2 uj2Var) {
            rectF.bottom -= Math.abs(uj2Var.f - uj2Var.d) * f;
        }
    }

    /* compiled from: FitModeEvaluators.java */
    /* loaded from: classes3.dex */
    public class b implements sj2 {
        @Override // com.p7700g.p99005.sj2
        public uj2 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = hk2.m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new uj2(f8, f9, f4 * f8, m, f6 * f9, m);
        }

        @Override // com.p7700g.p99005.sj2
        public boolean b(uj2 uj2Var) {
            return uj2Var.c > uj2Var.e;
        }

        @Override // com.p7700g.p99005.sj2
        public void c(RectF rectF, float f, uj2 uj2Var) {
            float abs = (Math.abs(uj2Var.e - uj2Var.c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    private tj2() {
    }

    public static sj2 a(int i, boolean z, RectF rectF, RectF rectF2) {
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