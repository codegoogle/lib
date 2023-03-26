package com.p7700g.p99005;

import com.p7700g.p99005.t8;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public class s8 implements Comparable<s8> {
    public static final int A = 5;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 2;
    public static String[] E = {"position", "x", "y", "width", "height", "pathRotate"};
    public static final String s = "MotionPaths";
    public static final boolean t = false;
    public static final boolean u = false;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    public h9 F;
    public int G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public float R;
    public q8 S;
    public HashMap<String, p8> T;
    public int U;
    public int V;
    public double[] W;
    public double[] X;

    public s8() {
        this.G = 0;
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.P = -1;
        this.Q = -1;
        this.R = Float.NaN;
        this.S = null;
        this.T = new HashMap<>();
        this.U = 0;
        this.W = new double[18];
        this.X = new double[18];
    }

    private boolean d(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    private static final float w(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float x(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f6 - f4) * f2) + ((f5 - f3) * f) + f4;
    }

    public void a(t8 t8Var) {
        this.F = h9.c(t8Var.D.f);
        t8.a aVar = t8Var.D;
        this.P = aVar.g;
        this.Q = aVar.d;
        this.N = aVar.k;
        this.G = aVar.h;
        this.V = aVar.e;
        this.O = t8Var.E.d;
        this.R = 0.0f;
        for (String str : t8Var.j()) {
            p8 i = t8Var.i(str);
            if (i != null && i.q()) {
                this.T.put(str, i);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(s8 s8Var) {
        return Float.compare(this.I, s8Var.I);
    }

    public void c(q8 q8Var) {
        q8Var.F(this.O);
    }

    public void e(s8 s8Var, boolean[] zArr, String[] strArr, boolean z2) {
        boolean d = d(this.J, s8Var.J);
        boolean d2 = d(this.K, s8Var.K);
        zArr[0] = zArr[0] | d(this.I, s8Var.I);
        boolean z3 = d | d2 | z2;
        zArr[1] = zArr[1] | z3;
        zArr[2] = z3 | zArr[2];
        zArr[3] = zArr[3] | d(this.L, s8Var.L);
        zArr[4] = d(this.M, s8Var.M) | zArr[4];
    }

    public void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.I, this.J, this.K, this.L, this.M, this.N};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = fArr[iArr[i2]];
                i++;
            }
        }
    }

    public void g(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.L;
        float f2 = this.M;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public void h(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        q8 q8Var = this.S;
        if (q8Var != null) {
            float[] fArr2 = new float[2];
            q8Var.r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) (((Math.sin(d4) * d3) + d2) - (f3 / 2.0f));
            f2 = (float) ((f7 - (Math.cos(d4) * d3)) - (f4 / 2.0f));
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public void i(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f9 = (float) dArr[i];
            float f10 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f = f9;
                f5 = f10;
            } else if (i2 == 2) {
                f2 = f9;
                f7 = f10;
            } else if (i2 == 3) {
                f3 = f9;
                f6 = f10;
            } else if (i2 == 4) {
                f4 = f9;
                f8 = f10;
            }
        }
        float f11 = 2.0f;
        float f12 = (f6 / 2.0f) + f5;
        float f13 = (f8 / 2.0f) + f7;
        q8 q8Var = this.S;
        if (q8Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            q8Var.r(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f;
            double d3 = f2;
            float sin = (float) (((Math.sin(d3) * d2) + f14) - (f3 / 2.0f));
            f2 = (float) ((f15 - (Math.cos(d3) * d2)) - (f4 / 2.0f));
            double d4 = f5;
            double sin2 = (Math.sin(d3) * d4) + f16;
            double d5 = f7;
            f13 = (float) ((Math.sin(d3) * d5) + (f17 - (Math.cos(d3) * d4)));
            f12 = (float) ((Math.cos(d3) * d5) + sin2);
            f = sin;
            f11 = 2.0f;
        }
        fArr[0] = (f3 / f11) + f + 0.0f;
        fArr[1] = (f4 / f11) + f2 + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public void j(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        q8 q8Var = this.S;
        if (q8Var != null) {
            float[] fArr2 = new float[2];
            q8Var.r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) (((Math.sin(d4) * d3) + d2) - (f3 / 2.0f));
            f2 = (float) ((f7 - (Math.cos(d4) * d3)) - (f4 / 2.0f));
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public int k(String str, double[] dArr, int i) {
        p8 p8Var = this.T.get(str);
        int i2 = 0;
        if (p8Var == null) {
            return 0;
        }
        if (p8Var.r() == 1) {
            dArr[i] = p8Var.n();
            return 1;
        }
        int r = p8Var.r();
        float[] fArr = new float[r];
        p8Var.o(fArr);
        while (i2 < r) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    public int l(String str) {
        p8 p8Var = this.T.get(str);
        if (p8Var == null) {
            return 0;
        }
        return p8Var.r();
    }

    public void m(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        q8 q8Var = this.S;
        if (q8Var != null) {
            float s2 = q8Var.s();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.S.t() - (Math.cos(d2) * d)) - (f4 / 2.0f));
            f = (float) (((Math.sin(d2) * d) + s2) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    public boolean n(String str) {
        return this.T.containsKey(str);
    }

    public void o(y8 y8Var, s8 s8Var, s8 s8Var2) {
        float f = y8Var.t / 100.0f;
        this.H = f;
        this.G = y8Var.H;
        float f2 = Float.isNaN(y8Var.I) ? f : y8Var.I;
        float f3 = Float.isNaN(y8Var.J) ? f : y8Var.J;
        float f4 = s8Var2.L;
        float f5 = s8Var.L;
        float f6 = f4 - f5;
        float f7 = s8Var2.M;
        float f8 = s8Var.M;
        float f9 = f7 - f8;
        this.I = this.H;
        float f10 = s8Var.J;
        float f11 = s8Var.K;
        float f12 = ((f4 / 2.0f) + s8Var2.J) - ((f5 / 2.0f) + f10);
        float f13 = ((f7 / 2.0f) + s8Var2.K) - ((f8 / 2.0f) + f11);
        float f14 = f6 * f2;
        float f15 = f14 / 2.0f;
        this.J = (int) (((f12 * f) + f10) - f15);
        float f16 = (f13 * f) + f11;
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.K = (int) (f16 - f18);
        this.L = (int) (f5 + f14);
        this.M = (int) (f8 + f17);
        float f19 = Float.isNaN(y8Var.K) ? f : y8Var.K;
        float f20 = Float.isNaN(y8Var.N) ? 0.0f : y8Var.N;
        if (!Float.isNaN(y8Var.L)) {
            f = y8Var.L;
        }
        float f21 = Float.isNaN(y8Var.M) ? 0.0f : y8Var.M;
        this.U = 0;
        this.J = (int) (((f21 * f13) + ((f19 * f12) + s8Var.J)) - f15);
        this.K = (int) (((f13 * f) + ((f12 * f20) + s8Var.K)) - f18);
        this.F = h9.c(y8Var.F);
        this.P = y8Var.G;
    }

    public void p(y8 y8Var, s8 s8Var, s8 s8Var2) {
        float f;
        float f2;
        float f3 = y8Var.t / 100.0f;
        this.H = f3;
        this.G = y8Var.H;
        float f4 = Float.isNaN(y8Var.I) ? f3 : y8Var.I;
        float f5 = Float.isNaN(y8Var.J) ? f3 : y8Var.J;
        float f6 = s8Var2.L - s8Var.L;
        float f7 = s8Var2.M - s8Var.M;
        this.I = this.H;
        if (!Float.isNaN(y8Var.K)) {
            f3 = y8Var.K;
        }
        float f8 = s8Var.J;
        float f9 = s8Var.L;
        float f10 = s8Var.K;
        float f11 = s8Var.M;
        float f12 = ((s8Var2.L / 2.0f) + s8Var2.J) - ((f9 / 2.0f) + f8);
        float f13 = ((s8Var2.M / 2.0f) + s8Var2.K) - ((f11 / 2.0f) + f10);
        float f14 = f12 * f3;
        float f15 = (f6 * f4) / 2.0f;
        this.J = (int) ((f8 + f14) - f15);
        float f16 = f3 * f13;
        float f17 = (f7 * f5) / 2.0f;
        this.K = (int) ((f10 + f16) - f17);
        this.L = (int) (f9 + f);
        this.M = (int) (f11 + f2);
        float f18 = Float.isNaN(y8Var.L) ? 0.0f : y8Var.L;
        this.U = 1;
        float f19 = (int) ((s8Var.J + f14) - f15);
        this.J = f19;
        float f20 = (int) ((s8Var.K + f16) - f17);
        this.K = f20;
        this.J = f19 + ((-f13) * f18);
        this.K = f20 + (f12 * f18);
        this.Q = this.Q;
        this.F = h9.c(y8Var.F);
        this.P = y8Var.G;
    }

    public void q(int i, int i2, y8 y8Var, s8 s8Var, s8 s8Var2) {
        float min;
        float f;
        float f2 = y8Var.t / 100.0f;
        this.H = f2;
        this.G = y8Var.H;
        this.U = y8Var.O;
        float f3 = Float.isNaN(y8Var.I) ? f2 : y8Var.I;
        float f4 = Float.isNaN(y8Var.J) ? f2 : y8Var.J;
        float f5 = s8Var2.L;
        float f6 = s8Var.L;
        float f7 = s8Var2.M;
        float f8 = s8Var.M;
        this.I = this.H;
        this.L = (int) (((f5 - f6) * f3) + f6);
        this.M = (int) (((f7 - f8) * f4) + f8);
        int i3 = y8Var.O;
        if (i3 == 1) {
            float f9 = Float.isNaN(y8Var.K) ? f2 : y8Var.K;
            float f10 = s8Var2.J;
            float f11 = s8Var.J;
            this.J = wo1.a(f10, f11, f9, f11);
            if (!Float.isNaN(y8Var.L)) {
                f2 = y8Var.L;
            }
            float f12 = s8Var2.K;
            float f13 = s8Var.K;
            this.K = wo1.a(f12, f13, f2, f13);
        } else if (i3 != 2) {
            float f14 = Float.isNaN(y8Var.K) ? f2 : y8Var.K;
            float f15 = s8Var2.J;
            float f16 = s8Var.J;
            this.J = wo1.a(f15, f16, f14, f16);
            if (!Float.isNaN(y8Var.L)) {
                f2 = y8Var.L;
            }
            float f17 = s8Var2.K;
            float f18 = s8Var.K;
            this.K = wo1.a(f17, f18, f2, f18);
        } else {
            if (Float.isNaN(y8Var.K)) {
                float f19 = s8Var2.J;
                float f20 = s8Var.J;
                min = wo1.a(f19, f20, f2, f20);
            } else {
                min = Math.min(f4, f3) * y8Var.K;
            }
            this.J = min;
            if (Float.isNaN(y8Var.L)) {
                float f21 = s8Var2.K;
                float f22 = s8Var.K;
                f = wo1.a(f21, f22, f2, f22);
            } else {
                f = y8Var.L;
            }
            this.K = f;
        }
        this.Q = s8Var.Q;
        this.F = h9.c(y8Var.F);
        this.P = y8Var.G;
    }

    public void r(int i, int i2, y8 y8Var, s8 s8Var, s8 s8Var2) {
        float f = y8Var.t / 100.0f;
        this.H = f;
        this.G = y8Var.H;
        float f2 = Float.isNaN(y8Var.I) ? f : y8Var.I;
        float f3 = Float.isNaN(y8Var.J) ? f : y8Var.J;
        float f4 = s8Var2.L;
        float f5 = s8Var.L;
        float f6 = f4 - f5;
        float f7 = s8Var2.M;
        float f8 = s8Var.M;
        float f9 = f7 - f8;
        this.I = this.H;
        float f10 = s8Var.J;
        float f11 = s8Var.K;
        float f12 = (f4 / 2.0f) + s8Var2.J;
        float f13 = (f7 / 2.0f) + s8Var2.K;
        float f14 = f6 * f2;
        this.J = (int) ((((f12 - ((f5 / 2.0f) + f10)) * f) + f10) - (f14 / 2.0f));
        float f15 = f9 * f3;
        this.K = (int) ((((f13 - ((f8 / 2.0f) + f11)) * f) + f11) - (f15 / 2.0f));
        this.L = (int) (f5 + f14);
        this.M = (int) (f8 + f15);
        this.U = 2;
        if (!Float.isNaN(y8Var.K)) {
            this.J = (int) (y8Var.K * ((int) (i - this.L)));
        }
        if (!Float.isNaN(y8Var.L)) {
            this.K = (int) (y8Var.L * ((int) (i2 - this.M)));
        }
        this.Q = this.Q;
        this.F = h9.c(y8Var.F);
        this.P = y8Var.G;
    }

    public void s(float f, float f2, float f3, float f4) {
        this.J = f;
        this.K = f2;
        this.L = f3;
        this.M = f4;
    }

    public void t(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public void u(float f, t8 t8Var, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        float f4 = this.J;
        float f5 = this.K;
        float f6 = this.L;
        float f7 = this.M;
        if (iArr.length != 0 && this.W.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.W = new double[i];
            this.X = new double[i];
        }
        Arrays.fill(this.W, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.W[iArr[i2]] = dArr[i2];
            this.X[iArr[i2]] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr4 = this.W;
            if (i3 >= dArr4.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr4[i3]);
            double d = zg2.s;
            if (isNaN && (dArr3 == null || dArr3[i3] == zg2.s)) {
                f3 = f8;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.W[i3])) {
                    d = this.W[i3] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.X[i3];
                if (i3 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i3 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i3 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i3 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i3 == 5) {
                    f8 = f13;
                }
                i3++;
            }
            f8 = f3;
            i3++;
        }
        float f15 = f8;
        q8 q8Var = this.S;
        if (q8Var != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            q8Var.r(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float sin = (float) (((Math.sin(d3) * d2) + f16) - (f6 / 2.0f));
            float cos = (float) ((f17 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float cos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + f18);
            f2 = f7;
            float sin2 = (float) ((Math.sin(d3) * d2 * d5) + (f19 - (Math.cos(d3) * d4)));
            if (dArr2.length >= 2) {
                dArr2[0] = cos2;
                dArr2[1] = sin2;
            }
            if (!Float.isNaN(f15)) {
                t8Var.R((float) (Math.toDegrees(Math.atan2(sin2, cos2)) + f15));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            if (!Float.isNaN(f15)) {
                t8Var.R((float) (Math.toDegrees(Math.atan2((f12 / 2.0f) + f10, (f11 / 2.0f) + f9)) + f15 + 0.0f));
            }
        }
        float f20 = f4 + 0.5f;
        float f21 = f5 + 0.5f;
        t8Var.G((int) f20, (int) f21, (int) (f20 + f6), (int) (f21 + f2));
    }

    public void v(q8 q8Var, s8 s8Var) {
        double d = (((this.L / 2.0f) + this.J) - s8Var.J) - (s8Var.L / 2.0f);
        double d2 = (((this.M / 2.0f) + this.K) - s8Var.K) - (s8Var.M / 2.0f);
        this.S = q8Var;
        this.J = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.R)) {
            this.K = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.K = (float) Math.toRadians(this.R);
        }
    }

    public s8(int i, int i2, y8 y8Var, s8 s8Var, s8 s8Var2) {
        this.G = 0;
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.P = -1;
        this.Q = -1;
        this.R = Float.NaN;
        this.S = null;
        this.T = new HashMap<>();
        this.U = 0;
        this.W = new double[18];
        this.X = new double[18];
        if (s8Var.Q != -1) {
            q(i, i2, y8Var, s8Var, s8Var2);
            return;
        }
        int i3 = y8Var.O;
        if (i3 == 1) {
            p(y8Var, s8Var, s8Var2);
        } else if (i3 != 2) {
            o(y8Var, s8Var, s8Var2);
        } else {
            r(i, i2, y8Var, s8Var, s8Var2);
        }
    }
}