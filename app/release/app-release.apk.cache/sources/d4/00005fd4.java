package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.p7700g.p99005.ga2;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes3.dex */
public class ud2 {
    private static final float a = 4.5f;
    private static final float b = 2.0f;
    private static final int c = (int) Math.round(5.1000000000000005d);
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;

    public ud2(@x1 Context context) {
        this(rg2.b(context, ga2.c.s5, false), kc2.b(context, ga2.c.r5, 0), kc2.b(context, ga2.c.q5, 0), kc2.b(context, ga2.c.o3, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean m(@w0 int i) {
        return fj.B(i, 255) == this.g;
    }

    public int a(float f) {
        return Math.round(b(f) * 255.0f);
    }

    public float b(float f) {
        float f2 = this.h;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @w0
    public int c(@w0 int i, float f) {
        int i2;
        float b2 = b(f);
        int alpha = Color.alpha(i);
        int m = kc2.m(fj.B(i, 255), this.e, b2);
        if (b2 > 0.0f && (i2 = this.f) != 0) {
            m = kc2.l(m, fj.B(i2, c));
        }
        return fj.B(m, alpha);
    }

    @w0
    public int d(@w0 int i, float f, @x1 View view) {
        return c(i, i(view) + f);
    }

    @w0
    public int e(@w0 int i, float f) {
        return (this.d && m(i)) ? c(i, f) : i;
    }

    @w0
    public int f(@w0 int i, float f, @x1 View view) {
        return e(i, i(view) + f);
    }

    @w0
    public int g(float f) {
        return e(this.g, f);
    }

    @w0
    public int h(float f, @x1 View view) {
        return g(i(view) + f);
    }

    public float i(@x1 View view) {
        return kf2.j(view);
    }

    @w0
    public int j() {
        return this.e;
    }

    @w0
    public int k() {
        return this.g;
    }

    public boolean l() {
        return this.d;
    }

    public ud2(boolean z, @w0 int i, @w0 int i2, @w0 int i3, float f) {
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = f;
    }
}