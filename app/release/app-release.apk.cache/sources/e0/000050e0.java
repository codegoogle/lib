package com.p7700g.p99005;

import android.graphics.PointF;

/* compiled from: LottieRelativePointValueCallback.java */
/* loaded from: classes.dex */
public class mp0 extends np0<PointF> {
    private final PointF d;

    public mp0() {
        this.d = new PointF();
    }

    public PointF e(fp0<PointF> fp0Var) {
        T t = this.c;
        if (t != 0) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.p7700g.p99005.np0
    /* renamed from: f */
    public final PointF a(fp0<PointF> fp0Var) {
        this.d.set(bp0.k(fp0Var.g().x, fp0Var.b().x, fp0Var.c()), bp0.k(fp0Var.g().y, fp0Var.b().y, fp0Var.c()));
        PointF e = e(fp0Var);
        this.d.offset(e.x, e.y);
        return this.d;
    }

    public mp0(@x1 PointF pointF) {
        super(pointF);
        this.d = new PointF();
    }
}