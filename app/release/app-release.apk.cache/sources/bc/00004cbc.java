package com.p7700g.p99005;

/* compiled from: MarkerEdgeTreatment.java */
/* loaded from: classes3.dex */
public final class kh2 extends ih2 {
    private final float a;

    public kh2(float f) {
        this.a = f - 0.001f;
    }

    @Override // com.p7700g.p99005.ih2
    public boolean a() {
        return true;
    }

    @Override // com.p7700g.p99005.ih2
    public void b(float f, float f2, float f3, @x1 sh2 sh2Var) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.a) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.a, 2.0d) - Math.pow(sqrt, 2.0d));
        sh2Var.p(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.a) - this.a))) + sqrt2);
        sh2Var.n(f2, (float) (-((Math.sqrt(2.0d) * this.a) - this.a)));
        sh2Var.n(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.a) - this.a))) + sqrt2);
    }
}