package com.p7700g.p99005;

/* compiled from: LottieRelativeIntegerValueCallback.java */
/* loaded from: classes.dex */
public class lp0 extends np0<Integer> {
    public Integer e(fp0<Integer> fp0Var) {
        T t = this.c;
        if (t != 0) {
            return (Integer) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.p7700g.p99005.np0
    /* renamed from: f */
    public Integer a(fp0<Integer> fp0Var) {
        return Integer.valueOf(e(fp0Var).intValue() + bp0.l(fp0Var.g().intValue(), fp0Var.b().intValue(), fp0Var.c()));
    }
}