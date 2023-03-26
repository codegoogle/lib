package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: FloatParser.java */
/* loaded from: classes.dex */
public class kn0 implements mo0<Float> {
    public static final kn0 a = new kn0();

    private kn0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public Float a(po0 po0Var, float f) throws IOException {
        return Float.valueOf(rn0.g(po0Var) * f);
    }
}