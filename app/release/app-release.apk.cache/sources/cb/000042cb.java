package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public class fo0 implements mo0<op0> {
    public static final fo0 a = new fo0();

    private fo0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public op0 a(po0 po0Var, float f) throws IOException {
        boolean z = po0Var.s() == po0.b.BEGIN_ARRAY;
        if (z) {
            po0Var.b();
        }
        float k = (float) po0Var.k();
        float k2 = (float) po0Var.k();
        while (po0Var.h()) {
            po0Var.A();
        }
        if (z) {
            po0Var.e();
        }
        return new op0((k / 100.0f) * f, (k2 / 100.0f) * f);
    }
}