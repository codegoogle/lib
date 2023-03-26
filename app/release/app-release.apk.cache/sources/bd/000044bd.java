package com.p7700g.p99005;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class gk0 extends tj0<PointF, PointF> {
    private final PointF i;
    private final PointF j;
    private final tj0<Float, Float> k;
    private final tj0<Float, Float> l;
    @z1
    public np0<Float> m;
    @z1
    public np0<Float> n;

    public gk0(tj0<Float, Float> tj0Var, tj0<Float, Float> tj0Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = tj0Var;
        this.l = tj0Var2;
        m(f());
    }

    @Override // com.p7700g.p99005.tj0
    public void m(float f) {
        this.k.m(f);
        this.l.m(f);
        this.i.set(this.k.h().floatValue(), this.l.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: q */
    public PointF i(ep0<PointF> ep0Var, float f) {
        Float f2;
        ep0<Float> b;
        ep0<Float> b2;
        Float f3 = null;
        if (this.m == null || (b2 = this.k.b()) == null) {
            f2 = null;
        } else {
            float d = this.k.d();
            Float f4 = b2.j;
            np0<Float> np0Var = this.m;
            float f5 = b2.i;
            f2 = np0Var.b(f5, f4 == null ? f5 : f4.floatValue(), b2.d, b2.e, f, f, d);
        }
        if (this.n != null && (b = this.l.b()) != null) {
            float d2 = this.l.d();
            Float f6 = b.j;
            np0<Float> np0Var2 = this.n;
            float f7 = b.i;
            f3 = np0Var2.b(f7, f6 == null ? f7 : f6.floatValue(), b.d, b.e, f, f, d2);
        }
        if (f2 == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.j;
    }

    public void r(@z1 np0<Float> np0Var) {
        np0<Float> np0Var2 = this.m;
        if (np0Var2 != null) {
            np0Var2.c(null);
        }
        this.m = np0Var;
        if (np0Var != null) {
            np0Var.c(this);
        }
    }

    public void s(@z1 np0<Float> np0Var) {
        np0<Float> np0Var2 = this.n;
        if (np0Var2 != null) {
            np0Var2.c(null);
        }
        this.n = np0Var;
        if (np0Var != null) {
            np0Var.c(this);
        }
    }
}