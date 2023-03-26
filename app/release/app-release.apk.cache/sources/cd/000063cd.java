package com.p7700g.p99005;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public class wj0 extends zj0<Float> {
    public wj0(List<ep0<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    public float q(ep0<Float> ep0Var, float f) {
        Float f2;
        if (ep0Var.d != null && ep0Var.e != null) {
            np0<A> np0Var = this.e;
            if (np0Var != 0 && (f2 = (Float) np0Var.b(ep0Var.i, ep0Var.j.floatValue(), ep0Var.d, ep0Var.e, f, e(), f())) != null) {
                return f2.floatValue();
            }
            return bp0.k(ep0Var.f(), ep0Var.c(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: r */
    public Float i(ep0<Float> ep0Var, float f) {
        return Float.valueOf(q(ep0Var, f));
    }
}