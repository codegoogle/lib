package com.p7700g.p99005;

import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class uj0 extends zj0<Integer> {
    public uj0(List<ep0<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(ep0<Integer> ep0Var, float f) {
        Integer num;
        if (ep0Var.d != null && ep0Var.e != null) {
            np0<A> np0Var = this.e;
            if (np0Var != 0 && (num = (Integer) np0Var.b(ep0Var.i, ep0Var.j.floatValue(), ep0Var.d, ep0Var.e, f, e(), f())) != null) {
                return num.intValue();
            }
            return wo0.c(bp0.c(f, 0.0f, 1.0f), ep0Var.d.intValue(), ep0Var.e.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: r */
    public Integer i(ep0<Integer> ep0Var, float f) {
        return Integer.valueOf(q(ep0Var, f));
    }
}