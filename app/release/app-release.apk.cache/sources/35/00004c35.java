package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialColors.java */
/* loaded from: classes3.dex */
public class kc2 {
    public static final float a = 1.0f;
    public static final float b = 0.54f;
    public static final float c = 0.38f;
    public static final float d = 0.32f;
    public static final float e = 0.12f;
    private static final int f = 40;
    private static final int g = 100;
    private static final int h = 90;
    private static final int i = 10;
    private static final int j = 80;
    private static final int k = 20;
    private static final int l = 30;
    private static final int m = 90;

    private kc2() {
    }

    @w0
    public static int a(@w0 int i2, @p1(from = 0, to = 255) int i3) {
        return fj.B(i2, (Color.alpha(i2) * i3) / 255);
    }

    @w0
    public static int b(@x1 Context context, @q0 int i2, @w0 int i3) {
        TypedValue a2 = rg2.a(context, i2);
        return a2 != null ? a2.data : i3;
    }

    @w0
    public static int c(Context context, @q0 int i2, String str) {
        return rg2.g(context, i2, str);
    }

    @w0
    public static int d(@x1 View view, @q0 int i2) {
        return rg2.h(view, i2);
    }

    @w0
    public static int e(@x1 View view, @q0 int i2, @w0 int i3) {
        return b(view.getContext(), i2, i3);
    }

    @w0
    private static int f(@w0 int i2, @p1(from = 0, to = 100) int i3) {
        jc2 c2 = jc2.c(i2);
        c2.l(i3);
        return c2.m();
    }

    @x1
    public static cc2 g(@w0 int i2, boolean z) {
        if (z) {
            return new cc2(f(i2, 40), f(i2, 100), f(i2, 90), f(i2, 10));
        }
        return new cc2(f(i2, 80), f(i2, 20), f(i2, 30), f(i2, 90));
    }

    @x1
    public static cc2 h(@x1 Context context, @w0 int i2) {
        return g(i2, rg2.b(context, ga2.c.Y7, true));
    }

    @w0
    public static int i(@w0 int i2, @w0 int i3) {
        return yb2.c(i2, i3);
    }

    @w0
    public static int j(@x1 Context context, @w0 int i2) {
        return i(i2, c(context, ga2.c.f3, kc2.class.getCanonicalName()));
    }

    public static boolean k(@w0 int i2) {
        return i2 != 0 && fj.m(i2) > 0.5d;
    }

    @w0
    public static int l(@w0 int i2, @w0 int i3) {
        return fj.t(i3, i2);
    }

    @w0
    public static int m(@w0 int i2, @w0 int i3, @g1(from = 0.0d, to = 1.0d) float f2) {
        return l(i2, fj.B(i3, Math.round(Color.alpha(i3) * f2)));
    }

    @w0
    public static int n(@x1 View view, @q0 int i2, @q0 int i3) {
        return o(view, i2, i3, 1.0f);
    }

    @w0
    public static int o(@x1 View view, @q0 int i2, @q0 int i3, @g1(from = 0.0d, to = 1.0d) float f2) {
        return m(d(view, i2), d(view, i3), f2);
    }
}