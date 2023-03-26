package com.p7700g.p99005;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes3.dex */
public class hh2 extends gh2 {
    public float a;

    public hh2() {
        this.a = -1.0f;
    }

    @Override // com.p7700g.p99005.gh2
    public void b(@x1 sh2 sh2Var, float f, float f2, float f3) {
        sh2Var.q(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        sh2Var.n((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }

    @Deprecated
    public hh2(float f) {
        this.a = -1.0f;
        this.a = f;
    }
}