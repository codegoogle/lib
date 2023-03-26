package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: IntegerParser.java */
/* loaded from: classes.dex */
public class qn0 implements mo0<Integer> {
    public static final qn0 a = new qn0();

    private qn0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public Integer a(po0 po0Var, float f) throws IOException {
        return Integer.valueOf(Math.round(rn0.g(po0Var) * f));
    }
}