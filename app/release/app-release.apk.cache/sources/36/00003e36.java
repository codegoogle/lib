package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.p7700g.p99005.m80;

/* compiled from: GhostViewPort.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class d80 extends ViewGroup implements a80 {
    public ViewGroup s;
    public View t;
    public final View u;
    public int v;
    @z1
    private Matrix w;
    private final ViewTreeObserver.OnPreDrawListener x;

    /* compiled from: GhostViewPort.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            sr.m1(d80.this);
            d80 d80Var = d80.this;
            ViewGroup viewGroup = d80Var.s;
            if (viewGroup == null || (view = d80Var.t) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            sr.m1(d80.this.s);
            d80 d80Var2 = d80.this;
            d80Var2.s = null;
            d80Var2.t = null;
            return true;
        }
    }

    public d80(View view) {
        super(view.getContext());
        this.x = new a();
        this.u = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public static d80 b(View view, ViewGroup viewGroup, Matrix matrix) {
        b80 b80Var;
        if (view.getParent() instanceof ViewGroup) {
            b80 b = b80.b(viewGroup);
            d80 e = e(view);
            int i = 0;
            if (e != null && (b80Var = (b80) e.getParent()) != b) {
                i = e.v;
                b80Var.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e = new d80(view);
                e.h(matrix);
                if (b == null) {
                    b = new b80(viewGroup);
                } else {
                    b.g();
                }
                d(viewGroup, b);
                d(viewGroup, e);
                b.a(e);
                e.v = i;
            } else if (matrix != null) {
                e.h(matrix);
            }
            e.v++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        k90.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        k90.k(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        k90.g(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    public static d80 e(View view) {
        return (d80) view.getTag(m80.e.j);
    }

    public static void f(View view) {
        d80 e = e(view);
        if (e != null) {
            int i = e.v - 1;
            e.v = i;
            if (i <= 0) {
                ((b80) e.getParent()).removeView(e);
            }
        }
    }

    public static void g(@x1 View view, @z1 d80 d80Var) {
        view.setTag(m80.e.j, d80Var);
    }

    @Override // com.p7700g.p99005.a80
    public void a(ViewGroup viewGroup, View view) {
        this.s = viewGroup;
        this.t = view;
    }

    public void h(@x1 Matrix matrix) {
        this.w = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.u, this);
        this.u.getViewTreeObserver().addOnPreDrawListener(this.x);
        k90.i(this.u, 4);
        if (this.u.getParent() != null) {
            ((View) this.u.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.u.getViewTreeObserver().removeOnPreDrawListener(this.x);
        k90.i(this.u, 0);
        g(this.u, null);
        if (this.u.getParent() != null) {
            ((View) this.u.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        p70.a(canvas, true);
        canvas.setMatrix(this.w);
        k90.i(this.u, 0);
        this.u.invalidate();
        k90.i(this.u, 4);
        drawChild(canvas, this.u, getDrawingTime());
        p70.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, com.p7700g.p99005.a80
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (e(this.u) == this) {
            k90.i(this.u, i == 0 ? 4 : 0);
        }
    }
}