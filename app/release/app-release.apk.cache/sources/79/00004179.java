package com.p7700g.p99005;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class f30 extends RecyclerView.b0 {
    private static final boolean i = false;
    private static final float j = 25.0f;
    private static final int k = 10000;
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 0;
    private static final float o = 1.2f;
    public PointF r;
    private final DisplayMetrics s;
    private float u;
    public final LinearInterpolator p = new LinearInterpolator();
    public final DecelerateInterpolator q = new DecelerateInterpolator();
    private boolean t = false;
    public int v = 0;
    public int w = 0;

    public f30(Context context) {
        this.s = context.getResources().getDisplayMetrics();
    }

    private float B() {
        if (!this.t) {
            this.u = w(this.s);
            this.t = true;
        }
        return this.u;
    }

    private int z(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    public int A() {
        PointF pointF = this.r;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int C() {
        PointF pointF = this.r;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void D(RecyclerView.b0.a aVar) {
        PointF a = a(f());
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            j(a);
            this.r = a;
            this.v = (int) (a.x * 10000.0f);
            this.w = (int) (a.y * 10000.0f);
            aVar.l((int) (this.v * o), (int) (this.w * o), (int) (y(10000) * o), this.p);
            return;
        }
        aVar.f(f());
        s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    public void m(int i2, int i3, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.v = z(this.v, i2);
        int z = z(this.w, i3);
        this.w = z;
        if (this.v == 0 && z == 0) {
            D(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    public void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    public void o() {
        this.w = 0;
        this.v = 0;
        this.r = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    public void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        int u = u(view, A());
        int v = v(view, C());
        int x = x((int) Math.sqrt((v * v) + (u * u)));
        if (x > 0) {
            aVar.l(-u, -v, x, this.q);
        }
    }

    public int t(int i2, int i3, int i4, int i5, int i6) {
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 == 1) {
                    return i5 - i3;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        }
        return i4 - i2;
    }

    public int u(View view, int i2) {
        RecyclerView.o e = e();
        if (e == null || !e.n()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return t(e.Y(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e.b0(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e.o0(), e.z0() - e.p0(), i2);
    }

    public int v(View view, int i2) {
        RecyclerView.o e = e();
        if (e == null || !e.o()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return t(e.c0(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e.W(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e.r0(), e.e0() - e.m0(), i2);
    }

    public float w(DisplayMetrics displayMetrics) {
        return j / displayMetrics.densityDpi;
    }

    public int x(int i2) {
        return (int) Math.ceil(y(i2) / 0.3356d);
    }

    public int y(int i2) {
        return (int) Math.ceil(Math.abs(i2) * B());
    }
}