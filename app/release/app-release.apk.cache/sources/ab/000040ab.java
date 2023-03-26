package com.p7700g.p99005;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public class ek0 extends zj0<op0> {
    private final op0 i;

    public ek0(List<ep0<op0>> list) {
        super(list);
        this.i = new op0();
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public op0 i(ep0<op0> ep0Var, float f) {
        op0 op0Var;
        op0 op0Var2;
        op0 op0Var3 = ep0Var.d;
        if (op0Var3 != null && (op0Var = ep0Var.e) != null) {
            op0 op0Var4 = op0Var3;
            op0 op0Var5 = op0Var;
            np0<A> np0Var = this.e;
            if (np0Var == 0 || (op0Var2 = (op0) np0Var.b(ep0Var.i, ep0Var.j.floatValue(), op0Var4, op0Var5, f, e(), f())) == null) {
                this.i.d(bp0.k(op0Var4.b(), op0Var5.b(), f), bp0.k(op0Var4.c(), op0Var5.c(), f));
                return this.i;
            }
            return op0Var2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}