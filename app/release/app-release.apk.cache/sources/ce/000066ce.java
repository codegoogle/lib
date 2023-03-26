package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: MotionKeyPosition.java */
/* loaded from: classes.dex */
public class y8 extends v8 {
    public static final int A = 2;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 2;
    public static final String y = "KeyPosition";
    public static final float z = 20.0f;
    public int E;
    public String F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public int O;
    private float P;
    private float Q;

    public y8() {
        int i = v8.h;
        this.E = i;
        this.F = null;
        this.G = i;
        this.H = 0;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = 0;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.w = 2;
    }

    private void v(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = Float.isNaN(this.K) ? 0.0f : this.K;
        float f8 = Float.isNaN(this.N) ? 0.0f : this.N;
        float f9 = Float.isNaN(this.L) ? 0.0f : this.L;
        this.P = (int) (((Float.isNaN(this.M) ? 0.0f : this.M) * f6) + (f7 * f5) + f);
        this.Q = (int) ((f6 * f9) + (f5 * f8) + f2);
    }

    private void w(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.K;
        float f8 = (f5 * f7) + f;
        float f9 = this.L;
        this.P = ((-f6) * f9) + f8;
        this.Q = (f5 * f9) + (f6 * f7) + f2;
    }

    private void y(int i, int i2) {
        float f = this.K;
        float f2 = 0;
        this.P = ((i - 0) * f) + f2;
        this.Q = ((i2 - 0) * f) + f2;
    }

    public float A() {
        return this.Q;
    }

    public boolean B(int i, int i2, i9 i9Var, i9 i9Var2, float f, float f2) {
        x(i, i2, i9Var.a(), i9Var.b(), i9Var2.a(), i9Var2.b());
        return Math.abs(f - this.P) < 20.0f && Math.abs(f2 - this.Q) < 20.0f;
    }

    public void C(t8 t8Var, i9 i9Var, i9 i9Var2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.O;
        if (i == 1) {
            E(i9Var, i9Var2, f, f2, strArr, fArr);
        } else if (i != 2) {
            D(i9Var, i9Var2, f, f2, strArr, fArr);
        } else {
            F(t8Var, i9Var, i9Var2, f, f2, strArr, fArr);
        }
    }

    public void D(i9 i9Var, i9 i9Var2, float f, float f2, String[] strArr, float[] fArr) {
        float a = i9Var.a();
        float b = i9Var.b();
        float a2 = i9Var2.a() - a;
        float b2 = i9Var2.b() - b;
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = (f - a) / a2;
                fArr[1] = (f2 - b) / b2;
                return;
            }
            fArr[1] = (f - a) / a2;
            fArr[0] = (f2 - b) / b2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - a) / a2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - b) / b2;
    }

    public void E(i9 i9Var, i9 i9Var2, float f, float f2, String[] strArr, float[] fArr) {
        float a = i9Var.a();
        float b = i9Var.b();
        float a2 = i9Var2.a() - a;
        float b2 = i9Var2.b() - b;
        float hypot = (float) Math.hypot(a2, b2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = a2 / hypot;
        float f4 = b2 / hypot;
        float f5 = f2 - b;
        float f6 = f - a;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f4 * f5) + (f3 * f6)) / hypot;
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f8;
        fArr[1] = f7;
    }

    public void F(t8 t8Var, i9 i9Var, i9 i9Var2, float f, float f2, String[] strArr, float[] fArr) {
        i9Var.a();
        i9Var.b();
        i9Var2.a();
        i9Var2.b();
        t8 n = t8Var.n();
        int D2 = n.D();
        int k = n.k();
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f / D2;
                fArr[1] = f2 / k;
                return;
            }
            fArr[1] = f / D2;
            fArr[0] = f2 / k;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f / D2;
        strArr[1] = "percentY";
        fArr[1] = f2 / k;
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean a(int i, int i2) {
        if (i == 100) {
            this.t = i2;
            return true;
        } else if (i == 508) {
            this.E = i2;
            return true;
        } else if (i != 510) {
            return super.a(i, i2);
        } else {
            this.O = i2;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean b(int i, float f) {
        switch (i) {
            case aa.g.k /* 503 */:
                this.I = f;
                return true;
            case aa.g.l /* 504 */:
                this.J = f;
                return true;
            case 505:
                this.I = f;
                this.J = f;
                return true;
            case 506:
                this.K = f;
                return true;
            case aa.g.o /* 507 */:
                this.L = f;
                return true;
            default:
                return super.b(i, f);
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean c(int i, String str) {
        if (i != 501) {
            return super.c(i, str);
        }
        this.F = str.toString();
        return true;
    }

    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        return fa.a(str);
    }

    @Override // com.p7700g.p99005.v8
    public void f(HashMap<String, s9> hashMap) {
    }

    @Override // com.p7700g.p99005.v8
    /* renamed from: g */
    public v8 clone() {
        return new y8().h(this);
    }

    @Override // com.p7700g.p99005.v8
    public v8 h(v8 v8Var) {
        super.h(v8Var);
        y8 y8Var = (y8) v8Var;
        this.F = y8Var.F;
        this.G = y8Var.G;
        this.H = y8Var.H;
        this.I = y8Var.I;
        this.J = Float.NaN;
        this.K = y8Var.K;
        this.L = y8Var.L;
        this.M = y8Var.M;
        this.N = y8Var.N;
        this.P = y8Var.P;
        this.Q = y8Var.Q;
        return this;
    }

    @Override // com.p7700g.p99005.v8
    public void i(HashSet<String> hashSet) {
    }

    public void x(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.O;
        if (i3 == 1) {
            w(f, f2, f3, f4);
        } else if (i3 != 2) {
            v(f, f2, f3, f4);
        } else {
            y(i, i2);
        }
    }

    public float z() {
        return this.P;
    }
}