package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes2.dex */
public class cb2 extends ih2 implements Cloneable {
    private static final int s = 90;
    private static final int t = 180;
    private static final int u = 270;
    private static final int v = 180;
    private static final float w = 1.75f;
    private float A;
    private float B;
    private float C = -1.0f;
    private float x;
    private float y;
    private float z;

    public cb2(float f, float f2, float f3) {
        this.y = f;
        this.x = f2;
        n(f3);
        this.B = 0.0f;
    }

    @Override // com.p7700g.p99005.ih2
    public void b(float f, float f2, float f3, @x1 sh2 sh2Var) {
        float f4;
        float f5;
        float f6 = this.z;
        if (f6 == 0.0f) {
            sh2Var.n(f, 0.0f);
            return;
        }
        float f7 = ((this.y * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.x;
        float f9 = f2 + this.B;
        float a = wo1.a(1.0f, f3, f7, this.A * f3);
        if (a / f7 >= 1.0f) {
            sh2Var.n(f, 0.0f);
            return;
        }
        float f10 = this.C;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = 0.0f;
            f5 = a;
        } else {
            f4 = w;
            f5 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f5 + f8;
        float sqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - sqrt;
        float f15 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f13));
        float f16 = (90.0f - degrees) + f4;
        sh2Var.n(f14, 0.0f);
        float f17 = f8 * 2.0f;
        sh2Var.a(f14 - f8, 0.0f, f14 + f8, f17, 270.0f, degrees);
        if (z) {
            sh2Var.a(f9 - f7, (-f7) - f5, f9 + f7, f7 - f5, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f18 = this.y;
            float f19 = f11 * 2.0f;
            float f20 = f9 - f7;
            sh2Var.a(f20, -(f11 + f18), f20 + f18 + f19, f18 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f21 = f9 + f7;
            float f22 = this.y;
            sh2Var.n(f21 - ((f22 / 2.0f) + f11), f22 + f11);
            float f23 = this.y;
            sh2Var.a(f21 - (f19 + f23), -(f11 + f23), f21, f23 + f11, 90.0f, f16 - 90.0f);
        }
        sh2Var.a(f15 - f8, 0.0f, f15 + f8, f17, 270.0f - degrees, degrees);
        sh2Var.n(f, 0.0f);
    }

    public float d() {
        return this.A;
    }

    public float e() {
        return this.C;
    }

    public float f() {
        return this.y;
    }

    public float g() {
        return this.x;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public float h() {
        return this.z;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public float i() {
        return this.B;
    }

    public void n(@g1(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.A = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void o(float f) {
        this.C = f;
    }

    public void p(float f) {
        this.y = f;
    }

    public void t(float f) {
        this.x = f;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void u(float f) {
        this.z = f;
    }

    public void x(float f) {
        this.B = f;
    }
}