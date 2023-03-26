package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: LottieValueCallback.java */
/* loaded from: classes.dex */
public class np0<T> {
    private final fp0<T> a;
    @z1
    private tj0<?, ?> b;
    @z1
    public T c;

    public np0() {
        this.a = new fp0<>();
        this.c = null;
    }

    @z1
    public T a(fp0<T> fp0Var) {
        return this.c;
    }

    @i2({i2.a.LIBRARY})
    @z1
    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.a.h(f, f2, t, t2, f3, f4, f5));
    }

    @i2({i2.a.LIBRARY})
    public final void c(@z1 tj0<?, ?> tj0Var) {
        this.b = tj0Var;
    }

    public final void d(@z1 T t) {
        this.c = t;
        tj0<?, ?> tj0Var = this.b;
        if (tj0Var != null) {
            tj0Var.k();
        }
    }

    public np0(@z1 T t) {
        this.a = new fp0<>();
        this.c = null;
        this.c = t;
    }
}