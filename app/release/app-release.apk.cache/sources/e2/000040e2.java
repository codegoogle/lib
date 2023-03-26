package com.p7700g.p99005;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class ep0<T> {
    private static final float a = -3987645.8f;
    private static final int b = 784923401;
    @z1
    private final ei0 c;
    @z1
    public final T d;
    @z1
    public T e;
    @z1
    public final Interpolator f;
    @z1
    public final Interpolator g;
    @z1
    public final Interpolator h;
    public final float i;
    @z1
    public Float j;
    private float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private float p;
    public PointF q;
    public PointF r;

    public ep0(ei0 ei0Var, @z1 T t, @z1 T t2, @z1 Interpolator interpolator, float f, @z1 Float f2) {
        this.k = a;
        this.l = a;
        this.m = b;
        this.n = b;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.q = null;
        this.r = null;
        this.c = ei0Var;
        this.d = t;
        this.e = t2;
        this.f = interpolator;
        this.g = null;
        this.h = null;
        this.i = f;
        this.j = f2;
    }

    public boolean a(@g1(from = 0.0d, to = 1.0d) float f) {
        return f >= e() && f < b();
    }

    public float b() {
        if (this.c == null) {
            return 1.0f;
        }
        if (this.p == Float.MIN_VALUE) {
            if (this.j == null) {
                this.p = 1.0f;
            } else {
                this.p = ((this.j.floatValue() - this.i) / this.c.e()) + e();
            }
        }
        return this.p;
    }

    public float c() {
        if (this.l == a) {
            this.l = ((Float) this.e).floatValue();
        }
        return this.l;
    }

    public int d() {
        if (this.n == b) {
            this.n = ((Integer) this.e).intValue();
        }
        return this.n;
    }

    public float e() {
        ei0 ei0Var = this.c;
        if (ei0Var == null) {
            return 0.0f;
        }
        if (this.o == Float.MIN_VALUE) {
            this.o = (this.i - ei0Var.r()) / this.c.e();
        }
        return this.o;
    }

    public float f() {
        if (this.k == a) {
            this.k = ((Float) this.d).floatValue();
        }
        return this.k;
    }

    public int g() {
        if (this.m == b) {
            this.m = ((Integer) this.d).intValue();
        }
        return this.m;
    }

    public boolean h() {
        return this.f == null && this.g == null && this.h == null;
    }

    public String toString() {
        StringBuilder G = wo1.G("Keyframe{startValue=");
        G.append(this.d);
        G.append(", endValue=");
        G.append(this.e);
        G.append(", startFrame=");
        G.append(this.i);
        G.append(", endFrame=");
        G.append(this.j);
        G.append(", interpolator=");
        G.append(this.f);
        G.append('}');
        return G.toString();
    }

    public ep0(ei0 ei0Var, @z1 T t, @z1 T t2, @z1 Interpolator interpolator, @z1 Interpolator interpolator2, float f, @z1 Float f2) {
        this.k = a;
        this.l = a;
        this.m = b;
        this.n = b;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.q = null;
        this.r = null;
        this.c = ei0Var;
        this.d = t;
        this.e = t2;
        this.f = null;
        this.g = interpolator;
        this.h = interpolator2;
        this.i = f;
        this.j = f2;
    }

    public ep0(ei0 ei0Var, @z1 T t, @z1 T t2, @z1 Interpolator interpolator, @z1 Interpolator interpolator2, @z1 Interpolator interpolator3, float f, @z1 Float f2) {
        this.k = a;
        this.l = a;
        this.m = b;
        this.n = b;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.q = null;
        this.r = null;
        this.c = ei0Var;
        this.d = t;
        this.e = t2;
        this.f = interpolator;
        this.g = interpolator2;
        this.h = interpolator3;
        this.i = f;
        this.j = f2;
    }

    public ep0(T t) {
        this.k = a;
        this.l = a;
        this.m = b;
        this.n = b;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.q = null;
        this.r = null;
        this.c = null;
        this.d = t;
        this.e = t;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = Float.MIN_VALUE;
        this.j = Float.valueOf(Float.MAX_VALUE);
    }
}