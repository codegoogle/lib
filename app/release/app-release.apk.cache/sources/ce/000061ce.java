package com.p7700g.p99005;

/* compiled from: TriangleEdgeTreatment.java */
/* loaded from: classes3.dex */
public class vh2 extends ih2 {
    private final float a;
    private final boolean b;

    public vh2(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // com.p7700g.p99005.ih2
    public void b(float f, float f2, float f3, @x1 sh2 sh2Var) {
        sh2Var.n(f2 - (this.a * f3), 0.0f);
        sh2Var.n(f2, (this.b ? this.a : -this.a) * f3);
        sh2Var.n((this.a * f3) + f2, 0.0f);
        sh2Var.n(f, 0.0f);
    }
}