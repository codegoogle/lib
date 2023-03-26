package com.p7700g.p99005;

/* compiled from: StopLogicEngine.java */
/* loaded from: classes.dex */
public class w9 implements v9 {
    private static final float a = 1.0E-5f;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private String l;
    private float n;
    private float o;
    private boolean m = false;
    private boolean p = false;

    private float e(float f) {
        this.p = false;
        float f2 = this.e;
        if (f <= f2) {
            float f3 = this.b;
            return ((((this.c - f3) * f) * f) / (f2 * 2.0f)) + (f3 * f);
        }
        int i = this.k;
        if (i == 1) {
            return this.h;
        }
        float f4 = f - f2;
        float f5 = this.f;
        if (f4 < f5) {
            float f6 = this.h;
            float f7 = this.c;
            return ((((this.d - f7) * f4) * f4) / (f5 * 2.0f)) + (f7 * f4) + f6;
        } else if (i == 2) {
            return this.i;
        } else {
            float f8 = f4 - f5;
            float f9 = this.g;
            if (f8 <= f9) {
                float f10 = this.i;
                float f11 = this.d;
                return ((f11 * f8) + f10) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.p = true;
            return this.j;
        }
    }

    private void g(float f, float f2, float f3, float f4, float f5) {
        this.p = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.b = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.l = "backward accelerate, decelerate";
                this.k = 2;
                this.b = f;
                this.c = sqrt;
                this.d = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.e = f8;
                this.f = sqrt / f3;
                this.h = ((f + sqrt) * f8) / 2.0f;
                this.i = f2;
                this.j = f2;
                return;
            }
            this.l = "backward accelerate cruse decelerate";
            this.k = 3;
            this.b = f;
            this.c = f4;
            this.d = f4;
            float f9 = (f4 - f) / f3;
            this.e = f9;
            float f10 = f4 / f3;
            this.g = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f = ((f2 - f11) - f12) / f4;
            this.h = f11;
            this.i = f2 - f12;
            this.j = f2;
        } else if (f7 >= f2) {
            this.l = "hard stop";
            this.k = 1;
            this.b = f;
            this.c = 0.0f;
            this.h = f2;
            this.e = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.l = "cruse decelerate";
                this.k = 2;
                this.b = f;
                this.c = f;
                this.d = 0.0f;
                this.h = f13;
                this.i = f2;
                this.e = f14;
                this.f = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
            float f15 = (sqrt2 - f) / f3;
            this.e = f15;
            float f16 = sqrt2 / f3;
            this.f = f16;
            if (sqrt2 < f4) {
                this.l = "accelerate decelerate";
                this.k = 2;
                this.b = f;
                this.c = sqrt2;
                this.d = 0.0f;
                this.e = f15;
                this.f = f16;
                this.h = ((f + sqrt2) * f15) / 2.0f;
                this.i = f2;
                return;
            }
            this.l = "accelerate cruse decelerate";
            this.k = 3;
            this.b = f;
            this.c = f4;
            this.d = f4;
            float f17 = (f4 - f) / f3;
            this.e = f17;
            float f18 = f4 / f3;
            this.g = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f = ((f2 - f19) - f20) / f4;
            this.h = f19;
            this.i = f2 - f20;
            this.j = f2;
        }
    }

    @Override // com.p7700g.p99005.v9
    public float a() {
        return this.m ? -c(this.o) : c(this.o);
    }

    @Override // com.p7700g.p99005.v9
    public String b(String str, float f) {
        StringBuilder L = wo1.L(wo1.C(wo1.L(str, " ===== "), this.l, "\n"), str);
        L.append(this.m ? "backwards" : "forward ");
        L.append(" time = ");
        L.append(f);
        L.append("  stages ");
        StringBuilder M = wo1.M(wo1.z(L, this.k, "\n"), str, " dur ");
        M.append(this.e);
        M.append(" vel ");
        M.append(this.b);
        M.append(" pos ");
        M.append(this.h);
        M.append("\n");
        String sb = M.toString();
        if (this.k > 1) {
            StringBuilder M2 = wo1.M(sb, str, " dur ");
            M2.append(this.f);
            M2.append(" vel ");
            M2.append(this.c);
            M2.append(" pos ");
            M2.append(this.i);
            M2.append("\n");
            sb = M2.toString();
        }
        if (this.k > 2) {
            StringBuilder M3 = wo1.M(sb, str, " dur ");
            M3.append(this.g);
            M3.append(" vel ");
            M3.append(this.d);
            M3.append(" pos ");
            M3.append(this.j);
            M3.append("\n");
            sb = M3.toString();
        }
        float f2 = this.e;
        if (f <= f2) {
            return wo1.u(sb, str, "stage 0\n");
        }
        int i = this.k;
        if (i == 1) {
            return wo1.u(sb, str, "end stage 0\n");
        }
        float f3 = f - f2;
        float f4 = this.f;
        if (f3 < f4) {
            return wo1.u(sb, str, " stage 1\n");
        }
        if (i == 2) {
            return wo1.u(sb, str, "end stage 1\n");
        }
        if (f3 - f4 < this.g) {
            return wo1.u(sb, str, " stage 2\n");
        }
        return wo1.u(sb, str, " end stage 2\n");
    }

    @Override // com.p7700g.p99005.v9
    public float c(float f) {
        float f2;
        float f3;
        float f4 = this.e;
        if (f <= f4) {
            f2 = this.b;
            f3 = this.c;
        } else {
            int i = this.k;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f;
            if (f >= f4) {
                if (i == 2) {
                    return this.i;
                }
                float f5 = f - f4;
                float f6 = this.g;
                if (f5 < f6) {
                    float f7 = this.d;
                    return f7 - ((f5 * f7) / f6);
                }
                return this.j;
            }
            f2 = this.c;
            f3 = this.d;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // com.p7700g.p99005.v9
    public boolean d() {
        return a() < a && Math.abs(this.j - this.o) < a;
    }

    public void f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.p = false;
        this.n = f;
        boolean z = f > f2;
        this.m = z;
        if (z) {
            g(-f3, f - f2, f5, f6, f4);
        } else {
            g(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // com.p7700g.p99005.v9
    public float getInterpolation(float f) {
        float e = e(f);
        this.o = f;
        return this.m ? this.n - e : this.n + e;
    }
}