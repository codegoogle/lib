package com.p7700g.p99005;

/* compiled from: RoundedCornerTreatment.java */
/* loaded from: classes3.dex */
public class ph2 extends gh2 {
    public float a;

    public ph2() {
        this.a = -1.0f;
    }

    @Override // com.p7700g.p99005.gh2
    public void b(@x1 sh2 sh2Var, float f, float f2, float f3) {
        sh2Var.q(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        sh2Var.a(0.0f, 0.0f, f4, f4, 180.0f, f);
    }

    @Deprecated
    public ph2(float f) {
        this.a = -1.0f;
        this.a = f;
    }
}