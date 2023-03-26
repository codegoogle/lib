package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public class bk0 extends ep0<PointF> {
    @z1
    private Path s;
    private final ep0<PointF> t;

    public bk0(ei0 ei0Var, ep0<PointF> ep0Var) {
        super(ei0Var, ep0Var.d, ep0Var.e, ep0Var.f, ep0Var.g, ep0Var.h, ep0Var.i, ep0Var.j);
        this.t = ep0Var;
        i();
    }

    public void i() {
        T t;
        T t2;
        T t3 = this.e;
        boolean z = (t3 == 0 || (t2 = this.d) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.d;
        if (t4 == 0 || (t = this.e) == 0 || z) {
            return;
        }
        ep0<PointF> ep0Var = this.t;
        this.s = cp0.d((PointF) t4, (PointF) t, ep0Var.q, ep0Var.r);
    }

    @z1
    public Path j() {
        return this.s;
    }
}