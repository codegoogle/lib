package com.p7700g.p99005;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: LottieInterpolatedValue.java */
/* loaded from: classes.dex */
public abstract class jp0<T> extends np0<T> {
    private final T d;
    private final T e;
    private final Interpolator f;

    public jp0(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    @Override // com.p7700g.p99005.np0
    public T a(fp0<T> fp0Var) {
        return e(this.d, this.e, this.f.getInterpolation(fp0Var.e()));
    }

    public abstract T e(T t, T t2, float f);

    public jp0(T t, T t2, Interpolator interpolator) {
        this.d = t;
        this.e = t2;
        this.f = interpolator;
    }
}