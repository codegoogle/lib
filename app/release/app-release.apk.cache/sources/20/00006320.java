package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.p7700g.p99005.m80;

/* compiled from: Explode.java */
/* loaded from: classes.dex */
public class w70 extends r90 {
    private static final TimeInterpolator P0 = new DecelerateInterpolator();
    private static final TimeInterpolator Q0 = new AccelerateInterpolator();
    private static final String R0 = "android:explode:screenBounds";
    private int[] S0;

    public w70() {
        this.S0 = new int[2];
        L0(new v70());
    }

    private void Q0(z80 z80Var) {
        View view = z80Var.b;
        view.getLocationOnScreen(this.S0);
        int[] iArr = this.S0;
        int i = iArr[0];
        int i2 = iArr[1];
        z80Var.a.put(R0, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    private static float a1(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    private static float b1(View view, int i, int i2) {
        return a1(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    private void e1(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.S0);
        int[] iArr2 = this.S0;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect S = S();
        if (S == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i2;
        } else {
            centerX = S.centerX();
            centerY = S.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a1 = a1(centerX2, centerY2);
        float b1 = b1(view, centerX - i, centerY - i2);
        iArr[0] = Math.round((centerX2 / a1) * b1);
        iArr[1] = Math.round(b1 * (centerY2 / a1));
    }

    @Override // com.p7700g.p99005.r90
    public Animator U0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        if (z80Var2 == null) {
            return null;
        }
        Rect rect = (Rect) z80Var2.a.get(R0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        e1(viewGroup, rect, this.S0);
        int[] iArr = this.S0;
        return b90.a(view, z80Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, P0, this);
    }

    @Override // com.p7700g.p99005.r90
    public Animator W0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        float f;
        float f2;
        if (z80Var == null) {
            return null;
        }
        Rect rect = (Rect) z80Var.a.get(R0);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) z80Var.b.getTag(m80.e.J);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        e1(viewGroup, rect, this.S0);
        int[] iArr2 = this.S0;
        return b90.a(view, z80Var, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], Q0, this);
    }

    @Override // com.p7700g.p99005.r90, com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        super.n(z80Var);
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.r90, com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        super.t(z80Var);
        Q0(z80Var);
    }

    public w70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S0 = new int[2];
        L0(new v70());
    }
}