package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.p7700g.p99005.ga2;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes3.dex */
public final class pc2 {
    @x1
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final qh2 f;

    private pc2(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, qh2 qh2Var, @x1 Rect rect) {
        jp.i(rect.left);
        jp.i(rect.top);
        jp.i(rect.right);
        jp.i(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = qh2Var;
    }

    @x1
    public static pc2 a(@x1 Context context, @m2 int i) {
        jp.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ga2.o.Jl);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(ga2.o.Kl, 0), obtainStyledAttributes.getDimensionPixelOffset(ga2.o.Ml, 0), obtainStyledAttributes.getDimensionPixelOffset(ga2.o.Ll, 0), obtainStyledAttributes.getDimensionPixelOffset(ga2.o.Nl, 0));
        ColorStateList a = sg2.a(context, obtainStyledAttributes, ga2.o.Ol);
        ColorStateList a2 = sg2.a(context, obtainStyledAttributes, ga2.o.Tl);
        ColorStateList a3 = sg2.a(context, obtainStyledAttributes, ga2.o.Rl);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ga2.o.Sl, 0);
        qh2 m = qh2.b(context, obtainStyledAttributes.getResourceId(ga2.o.Pl, 0), obtainStyledAttributes.getResourceId(ga2.o.Ql, 0)).m();
        obtainStyledAttributes.recycle();
        return new pc2(a, a2, a3, dimensionPixelSize, m, rect);
    }

    public int b() {
        return this.a.bottom;
    }

    public int c() {
        return this.a.left;
    }

    public int d() {
        return this.a.right;
    }

    public int e() {
        return this.a.top;
    }

    public void f(@x1 TextView textView) {
        lh2 lh2Var = new lh2();
        lh2 lh2Var2 = new lh2();
        lh2Var.setShapeAppearanceModel(this.f);
        lh2Var2.setShapeAppearanceModel(this.f);
        lh2Var.o0(this.c);
        lh2Var.E0(this.e, this.d);
        textView.setTextColor(this.b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), lh2Var, lh2Var2);
        Rect rect = this.a;
        sr.H1(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}