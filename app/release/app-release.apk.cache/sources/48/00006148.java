package com.p7700g.p99005;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: CircularPropagation.java */
/* loaded from: classes.dex */
public class v70 extends s90 {
    private float d = 3.0f;

    private static float h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    @Override // com.p7700g.p99005.w80
    public long c(ViewGroup viewGroup, s80 s80Var, z80 z80Var, z80 z80Var2) {
        int i;
        int round;
        int i2;
        if (z80Var == null && z80Var2 == null) {
            return 0L;
        }
        if (z80Var2 == null || e(z80Var) == 0) {
            i = -1;
        } else {
            z80Var = z80Var2;
            i = 1;
        }
        int f = f(z80Var);
        int g = g(z80Var);
        Rect S = s80Var.S();
        if (S != null) {
            i2 = S.centerX();
            round = S.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            int i3 = iArr[1];
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + i3);
            i2 = round2;
        }
        float h = h(f, g, i2, round) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long R = s80Var.R();
        if (R < 0) {
            R = 300;
        }
        return Math.round((((float) (R * i)) / this.d) * h);
    }

    public void i(float f) {
        if (f != 0.0f) {
            this.d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}