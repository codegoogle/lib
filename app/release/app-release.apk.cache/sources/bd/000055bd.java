package com.p7700g.p99005;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SidePropagation.java */
/* loaded from: classes.dex */
public class p80 extends s90 {
    private float d = 3.0f;
    private int e = 80;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        if ((com.p7700g.p99005.sr.Y(r7) == 1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((com.p7700g.p99005.sr.Y(r7) == 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int h(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.e;
        if (i9 != 8388611) {
            if (i9 == 8388613) {
            }
        }
        if (i9 == 3) {
            return Math.abs(i4 - i2) + (i7 - i);
        } else if (i9 == 5) {
            return Math.abs(i4 - i2) + (i - i5);
        } else if (i9 == 48) {
            return Math.abs(i3 - i) + (i8 - i2);
        } else if (i9 != 80) {
            return 0;
        } else {
            return Math.abs(i3 - i) + (i2 - i6);
        }
    }

    private int i(ViewGroup viewGroup) {
        int i = this.e;
        if (i != 3 && i != 5 && i != 8388611 && i != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }

    @Override // com.p7700g.p99005.w80
    public long c(ViewGroup viewGroup, s80 s80Var, z80 z80Var, z80 z80Var2) {
        int i;
        int i2;
        int i3;
        z80 z80Var3 = z80Var;
        if (z80Var3 == null && z80Var2 == null) {
            return 0L;
        }
        Rect S = s80Var.S();
        if (z80Var2 == null || e(z80Var3) == 0) {
            i = -1;
        } else {
            z80Var3 = z80Var2;
            i = 1;
        }
        int f = f(z80Var3);
        int g = g(z80Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (S != null) {
            i2 = S.centerX();
            i3 = S.centerY();
        } else {
            i2 = (round + width) / 2;
            i3 = (round2 + height) / 2;
        }
        float h = h(viewGroup, f, g, i2, i3, round, round2, width, height) / i(viewGroup);
        long R = s80Var.R();
        if (R < 0) {
            R = 300;
        }
        return Math.round((((float) (R * i)) / this.d) * h);
    }

    public void j(float f) {
        if (f != 0.0f) {
            this.d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void k(int i) {
        this.e = i;
    }
}