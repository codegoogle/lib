package com.p7700g.p99005;

/* compiled from: LottieRelativeFloatValueCallback.java */
/* loaded from: classes.dex */
public class kp0 extends np0<Float> {
    public kp0() {
    }

    public Float e(fp0<Float> fp0Var) {
        T t = this.c;
        if (t != 0) {
            return (Float) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.p7700g.p99005.np0
    /* renamed from: f */
    public Float a(fp0<Float> fp0Var) {
        return Float.valueOf(e(fp0Var).floatValue() + bp0.k(fp0Var.g().floatValue(), fp0Var.b().floatValue(), fp0Var.c()));
    }

    public kp0(@x1 Float f) {
        super(f);
    }
}