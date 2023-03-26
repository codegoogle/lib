package com.p7700g.p99005;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class xj0 extends zj0<ql0> {
    private final ql0 i;

    public xj0(List<ep0<ql0>> list) {
        super(list);
        ql0 ql0Var = list.get(0).d;
        int c = ql0Var != null ? ql0Var.c() : 0;
        this.i = new ql0(new float[c], new int[c]);
    }

    @Override // com.p7700g.p99005.tj0
    /* renamed from: p */
    public ql0 i(ep0<ql0> ep0Var, float f) {
        this.i.d(ep0Var.d, ep0Var.e, f);
        return this.i;
    }
}