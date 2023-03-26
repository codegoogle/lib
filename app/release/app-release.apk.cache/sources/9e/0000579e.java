package com.p7700g.p99005;

import com.p7700g.p99005.l9;
import com.p7700g.p99005.m9;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Motion.java */
/* loaded from: classes.dex */
public class q8 implements aa {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    private static final int F = -1;
    private static final int G = -2;
    private static final int H = -3;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public static final int s = 5;
    public static final int t = 6;
    public static final int u = 1;
    public static final int v = 2;
    private static final String w = "MotionController";
    private static final boolean x = false;
    private static final boolean y = false;
    public static final int z = 0;
    public t8 J;
    public int K;
    public String L;
    private f9[] R;
    private f9 S;
    public float W;
    public float X;
    private int[] Y;
    private double[] Z;
    private double[] a0;
    private String[] b0;
    private int[] c0;
    private HashMap<String, x9> i0;
    private HashMap<String, s9> j0;
    private HashMap<String, l9> k0;
    private a9[] l0;
    public String[] t0;
    public q9 I = new q9();
    private int M = -1;
    private s8 N = new s8();
    private s8 O = new s8();
    private r8 P = new r8();
    private r8 Q = new r8();
    public float T = Float.NaN;
    public float U = 0.0f;
    public float V = 1.0f;
    private int d0 = 4;
    private float[] e0 = new float[4];
    private ArrayList<s8> f0 = new ArrayList<>();
    private float[] g0 = new float[1];
    private ArrayList<v8> h0 = new ArrayList<>();
    private int m0 = -1;
    private int n0 = -1;
    private t8 o0 = null;
    private int p0 = -1;
    private float q0 = Float.NaN;
    private g9 r0 = null;
    private boolean s0 = false;

    /* compiled from: Motion.java */
    /* loaded from: classes.dex */
    public static class a implements g9 {
        public float a;
        public final /* synthetic */ h9 b;

        public a(h9 h9Var) {
            this.b = h9Var;
        }

        @Override // com.p7700g.p99005.g9
        public float a() {
            return (float) this.b.b(this.a);
        }

        @Override // com.p7700g.p99005.g9
        public float getInterpolation(float f) {
            this.a = f;
            return (float) this.b.a(f);
        }
    }

    public q8(t8 t8Var) {
        c0(t8Var);
    }

    private static g9 A(int i2, String str, int i3) {
        if (i2 != -1) {
            return null;
        }
        return new a(h9.c(str));
    }

    private float I() {
        char c;
        float f;
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < 100) {
            float f5 = i2 * f3;
            double d3 = f5;
            h9 h9Var = this.N.F;
            Iterator<s8> it = this.f0.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it.hasNext()) {
                s8 next = it.next();
                h9 h9Var2 = next.F;
                if (h9Var2 != null) {
                    float f8 = next.H;
                    if (f8 < f5) {
                        h9Var = h9Var2;
                        f7 = f8;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.H;
                    }
                }
            }
            if (h9Var != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d3 = (((float) h9Var.a((f5 - f7) / f2)) * (f6 - f7)) + f7;
            }
            this.R[0].d(d3, this.Z);
            float f9 = f4;
            int i3 = i2;
            this.N.h(d3, this.Y, this.Z, fArr, 0);
            if (i3 > 0) {
                c = 0;
                f = (float) (Math.hypot(d2 - fArr[1], d - fArr[0]) + f9);
            } else {
                c = 0;
                f = f9;
            }
            d = fArr[c];
            i2 = i3 + 1;
            f4 = f;
            d2 = fArr[1];
        }
        return f4;
    }

    private void P(s8 s8Var) {
        Iterator<s8> it = this.f0.iterator();
        s8 s8Var2 = null;
        while (it.hasNext()) {
            s8 next = it.next();
            if (s8Var.I == next.I) {
                s8Var2 = next;
            }
        }
        if (s8Var2 != null) {
            this.f0.remove(s8Var2);
        }
        int binarySearch = Collections.binarySearch(this.f0, s8Var);
        if (binarySearch == 0) {
            StringBuilder G2 = wo1.G(" KeyPath position \"");
            G2.append(s8Var.I);
            G2.append("\" outside of range");
            ia.f(w, G2.toString());
        }
        this.f0.add((-binarySearch) - 1, s8Var);
    }

    private void T(s8 s8Var) {
        s8Var.s(this.J.E(), this.J.F(), this.J.D(), this.J.k());
    }

    private float o(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.V;
            if (f3 != 1.0d) {
                float f4 = this.U;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        h9 h9Var = this.N.F;
        float f5 = Float.NaN;
        Iterator<s8> it = this.f0.iterator();
        while (it.hasNext()) {
            s8 next = it.next();
            h9 h9Var2 = next.F;
            if (h9Var2 != null) {
                float f6 = next.H;
                if (f6 < f) {
                    h9Var = h9Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = next.H;
                }
            }
        }
        if (h9Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) h9Var.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) h9Var.b(d);
            }
        }
        return f;
    }

    public s8 B(int i2) {
        return this.f0.get(i2);
    }

    public int C(int i2, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<v8> it = this.h0.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            v8 next = it.next();
            int i5 = next.w;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.t;
                iArr[i7] = i8;
                double d = i8 / 100.0f;
                this.R[0].d(d, this.Z);
                this.N.h(d, this.Y, this.Z, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof y8) {
                    y8 y8Var = (y8) next;
                    int i11 = i10 + 1;
                    iArr[i11] = y8Var.O;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(y8Var.K);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(y8Var.L);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    public float D(int i2, float f, float f2) {
        s8 s8Var = this.O;
        float f3 = s8Var.J;
        s8 s8Var2 = this.N;
        float f4 = s8Var2.J;
        float f5 = f3 - f4;
        float f6 = s8Var.K;
        float f7 = s8Var2.K;
        float f8 = f6 - f7;
        float f9 = (s8Var2.L / 2.0f) + f4;
        float f10 = (s8Var2.M / 2.0f) + f7;
        float hypot = (float) Math.hypot(f5, f8);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f12 * f8) + (f11 * f5);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return 0.0f;
                            }
                            return f12 / f8;
                        }
                        return f11 / f8;
                    }
                    return f12 / f5;
                }
                return f11 / f5;
            }
            return (float) Math.sqrt((hypot * hypot) - (f13 * f13));
        }
        return f13 / hypot;
    }

    public int E(int[] iArr, float[] fArr) {
        Iterator<v8> it = this.h0.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            v8 next = it.next();
            int i4 = next.t;
            iArr[i2] = (next.w * 1000) + i4;
            double d = i4 / 100.0f;
            this.R[0].d(d, this.Z);
            this.N.h(d, this.Y, this.Z, fArr, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }

    public double[] F(double d) {
        this.R[0].d(d, this.Z);
        f9 f9Var = this.S;
        if (f9Var != null) {
            double[] dArr = this.Z;
            if (dArr.length > 0) {
                f9Var.d(d, dArr);
            }
        }
        return this.Z;
    }

    public y8 G(int i2, int i3, float f, float f2) {
        i9 i9Var = new i9();
        s8 s8Var = this.N;
        float f3 = s8Var.J;
        i9Var.b = f3;
        float f4 = s8Var.K;
        i9Var.d = f4;
        i9Var.c = f3 + s8Var.L;
        i9Var.a = f4 + s8Var.M;
        i9 i9Var2 = new i9();
        s8 s8Var2 = this.O;
        float f5 = s8Var2.J;
        i9Var2.b = f5;
        float f6 = s8Var2.K;
        i9Var2.d = f6;
        i9Var2.c = f5 + s8Var2.L;
        i9Var2.a = f6 + s8Var2.M;
        Iterator<v8> it = this.h0.iterator();
        while (it.hasNext()) {
            v8 next = it.next();
            if (next instanceof y8) {
                y8 y8Var = (y8) next;
                if (y8Var.B(i2, i3, i9Var, i9Var2, f, f2)) {
                    return y8Var;
                }
            }
        }
        return null;
    }

    public void H(float f, int i2, int i3, float f2, float f3, float[] fArr) {
        float o2 = o(f, this.g0);
        HashMap<String, s9> hashMap = this.j0;
        s9 s9Var = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, s9> hashMap2 = this.j0;
        s9 s9Var2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, s9> hashMap3 = this.j0;
        s9 s9Var3 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, s9> hashMap4 = this.j0;
        s9 s9Var4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, s9> hashMap5 = this.j0;
        s9 s9Var5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, l9> hashMap6 = this.k0;
        l9 l9Var = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, l9> hashMap7 = this.k0;
        l9 l9Var2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, l9> hashMap8 = this.k0;
        l9 l9Var3 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, l9> hashMap9 = this.k0;
        l9 l9Var4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, l9> hashMap10 = this.k0;
        l9 l9Var5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        ja jaVar = new ja();
        jaVar.b();
        jaVar.d(s9Var3, o2);
        jaVar.h(s9Var, s9Var2, o2);
        jaVar.f(s9Var4, s9Var5, o2);
        jaVar.c(l9Var3, o2);
        jaVar.g(l9Var, l9Var2, o2);
        jaVar.e(l9Var4, l9Var5, o2);
        f9 f9Var = this.S;
        if (f9Var != null) {
            double[] dArr = this.Z;
            if (dArr.length > 0) {
                double d = o2;
                f9Var.d(d, dArr);
                this.S.g(d, this.a0);
                this.N.t(f2, f3, fArr, this.Y, this.a0, this.Z);
            }
            jaVar.a(f2, f3, i2, i3, fArr);
            return;
        }
        int i4 = 0;
        if (this.R != null) {
            double o3 = o(o2, this.g0);
            this.R[0].g(o3, this.a0);
            this.R[0].d(o3, this.Z);
            float f4 = this.g0[0];
            while (true) {
                double[] dArr2 = this.a0;
                if (i4 < dArr2.length) {
                    dArr2[i4] = dArr2[i4] * f4;
                    i4++;
                } else {
                    this.N.t(f2, f3, fArr, this.Y, dArr2, this.Z);
                    jaVar.a(f2, f3, i2, i3, fArr);
                    return;
                }
            }
        } else {
            s8 s8Var = this.O;
            float f5 = s8Var.J;
            s8 s8Var2 = this.N;
            float f6 = f5 - s8Var2.J;
            float f7 = s8Var.K - s8Var2.K;
            fArr[0] = (((s8Var.L - s8Var2.L) + f6) * f2) + ((1.0f - f2) * f6);
            fArr[1] = (((s8Var.M - s8Var2.M) + f7) * f3) + ((1.0f - f3) * f7);
            jaVar.b();
            jaVar.d(s9Var3, o2);
            jaVar.h(s9Var, s9Var2, o2);
            jaVar.f(s9Var4, s9Var5, o2);
            jaVar.c(l9Var3, o2);
            jaVar.g(l9Var, l9Var2, o2);
            jaVar.e(l9Var4, l9Var5, o2);
            jaVar.a(f2, f3, i2, i3, fArr);
        }
    }

    public float J() {
        return this.N.M;
    }

    public float K() {
        return this.N.L;
    }

    public float L() {
        return this.N.J;
    }

    public float M() {
        return this.N.K;
    }

    public int N() {
        return this.n0;
    }

    public t8 O() {
        return this.J;
    }

    public boolean Q(t8 t8Var, float f, long j2, k9 k9Var) {
        t8 t8Var2;
        float f2;
        float o2 = o(f, null);
        int i2 = this.p0;
        if (i2 != -1) {
            float f3 = 1.0f / i2;
            float floor = ((float) Math.floor(o2 / f3)) * f3;
            float f4 = (o2 % f3) / f3;
            if (!Float.isNaN(this.q0)) {
                f4 = (f4 + this.q0) % 1.0f;
            }
            g9 g9Var = this.r0;
            if (g9Var != null) {
                f2 = g9Var.getInterpolation(f4);
            } else {
                f2 = ((double) f4) > 0.5d ? 1.0f : 0.0f;
            }
            o2 = (f2 * f3) + floor;
        }
        HashMap<String, s9> hashMap = this.j0;
        if (hashMap != null) {
            for (s9 s9Var : hashMap.values()) {
                s9Var.h(t8Var, o2);
            }
        }
        f9[] f9VarArr = this.R;
        if (f9VarArr != null) {
            double d = o2;
            f9VarArr[0].d(d, this.Z);
            this.R[0].g(d, this.a0);
            f9 f9Var = this.S;
            if (f9Var != null) {
                double[] dArr = this.Z;
                if (dArr.length > 0) {
                    f9Var.d(d, dArr);
                    this.S.g(d, this.a0);
                }
            }
            if (!this.s0) {
                this.N.u(o2, t8Var, this.Y, this.Z, this.a0, null);
            }
            if (this.n0 != -1) {
                if (this.o0 == null) {
                    this.o0 = t8Var.n().f(this.n0);
                }
                if (this.o0 != null) {
                    float h2 = (this.o0.h() + t8Var2.w()) / 2.0f;
                    float q2 = (this.o0.q() + this.o0.l()) / 2.0f;
                    if (t8Var.q() - t8Var.l() > 0 && t8Var.h() - t8Var.w() > 0) {
                        t8Var.N(q2 - t8Var.l());
                        t8Var.O(h2 - t8Var.w());
                    }
                }
            }
            int i3 = 1;
            while (true) {
                f9[] f9VarArr2 = this.R;
                if (i3 >= f9VarArr2.length) {
                    break;
                }
                f9VarArr2[i3].e(d, this.e0);
                this.N.T.get(this.b0[i3 - 1]).w(t8Var, this.e0);
                i3++;
            }
            r8 r8Var = this.P;
            if (r8Var.y == 0) {
                if (o2 <= 0.0f) {
                    t8Var.b0(r8Var.z);
                } else if (o2 >= 1.0f) {
                    t8Var.b0(this.Q.z);
                } else if (this.Q.z != r8Var.z) {
                    t8Var.b0(4);
                }
            }
            if (this.l0 != null) {
                int i4 = 0;
                while (true) {
                    a9[] a9VarArr = this.l0;
                    if (i4 >= a9VarArr.length) {
                        break;
                    }
                    a9VarArr[i4].v(o2, t8Var);
                    i4++;
                }
            }
        } else {
            s8 s8Var = this.N;
            float f5 = s8Var.J;
            s8 s8Var2 = this.O;
            float a2 = wo1.a(s8Var2.J, f5, o2, f5);
            float f6 = s8Var.K;
            float a3 = wo1.a(s8Var2.K, f6, o2, f6);
            float f7 = s8Var.L;
            float a4 = wo1.a(s8Var2.L, f7, o2, f7);
            float f8 = s8Var.M;
            float f9 = a2 + 0.5f;
            float f10 = a3 + 0.5f;
            t8Var.G((int) f9, (int) f10, (int) (f9 + a4), (int) (f10 + wo1.a(s8Var2.M, f8, o2, f8)));
        }
        HashMap<String, l9> hashMap2 = this.k0;
        if (hashMap2 != null) {
            for (l9 l9Var : hashMap2.values()) {
                if (l9Var instanceof l9.f) {
                    l9.f fVar = (l9.f) l9Var;
                    double[] dArr2 = this.a0;
                    fVar.l(t8Var, o2, dArr2[0], dArr2[1]);
                } else {
                    l9Var.h(t8Var, o2);
                }
            }
            return false;
        }
        return false;
    }

    public String R() {
        return this.J.m();
    }

    public void S(t8 t8Var, y8 y8Var, float f, float f2, String[] strArr, float[] fArr) {
        i9 i9Var = new i9();
        s8 s8Var = this.N;
        float f3 = s8Var.J;
        i9Var.b = f3;
        float f4 = s8Var.K;
        i9Var.d = f4;
        i9Var.c = f3 + s8Var.L;
        i9Var.a = f4 + s8Var.M;
        i9 i9Var2 = new i9();
        s8 s8Var2 = this.O;
        float f5 = s8Var2.J;
        i9Var2.b = f5;
        float f6 = s8Var2.K;
        i9Var2.d = f6;
        i9Var2.c = f5 + s8Var2.L;
        i9Var2.a = f6 + s8Var2.M;
        y8Var.C(t8Var, i9Var, i9Var2, f, f2, strArr, fArr);
    }

    public void U(q9 q9Var, q9 q9Var2, int i2, int i3, int i4) {
        if (i2 == 1) {
            int i5 = q9Var.b + q9Var.c;
            q9Var2.b = ((q9Var.d + q9Var.a) - q9Var.b()) / 2;
            q9Var2.d = i4 - ((q9Var.a() + i5) / 2);
            q9Var2.c = q9Var.b() + q9Var2.b;
            q9Var2.a = q9Var.a() + q9Var2.d;
        } else if (i2 == 2) {
            int i6 = q9Var.b + q9Var.c;
            q9Var2.b = i3 - ((q9Var.b() + (q9Var.d + q9Var.a)) / 2);
            q9Var2.d = (i6 - q9Var.a()) / 2;
            q9Var2.c = q9Var.b() + q9Var2.b;
            q9Var2.a = q9Var.a() + q9Var2.d;
        } else if (i2 == 3) {
            int i7 = q9Var.b + q9Var.c;
            q9Var2.b = ((q9Var.a() / 2) + q9Var.d) - (i7 / 2);
            q9Var2.d = i4 - ((q9Var.a() + i7) / 2);
            q9Var2.c = q9Var.b() + q9Var2.b;
            q9Var2.a = q9Var.a() + q9Var2.d;
        } else if (i2 != 4) {
        } else {
            int i8 = q9Var.b + q9Var.c;
            q9Var2.b = i3 - ((q9Var.b() + (q9Var.a + q9Var.d)) / 2);
            q9Var2.d = (i8 - q9Var.a()) / 2;
            q9Var2.c = q9Var.b() + q9Var2.b;
            q9Var2.a = q9Var.a() + q9Var2.d;
        }
    }

    public void V(t8 t8Var) {
        s8 s8Var = this.N;
        s8Var.H = 0.0f;
        s8Var.I = 0.0f;
        this.s0 = true;
        s8Var.s(t8Var.E(), t8Var.F(), t8Var.D(), t8Var.k());
        this.O.s(t8Var.E(), t8Var.F(), t8Var.D(), t8Var.k());
        this.P.l(t8Var);
        this.Q.l(t8Var);
    }

    public void W(int i2) {
        this.N.G = i2;
    }

    public void X(t8 t8Var) {
        s8 s8Var = this.O;
        s8Var.H = 1.0f;
        s8Var.I = 1.0f;
        T(s8Var);
        this.O.s(t8Var.l(), t8Var.w(), t8Var.D(), t8Var.k());
        this.O.a(t8Var);
        this.Q.l(t8Var);
    }

    public void Y(int i2) {
        this.m0 = i2;
    }

    public void Z(t8 t8Var) {
        s8 s8Var = this.N;
        s8Var.H = 0.0f;
        s8Var.I = 0.0f;
        s8Var.s(t8Var.E(), t8Var.F(), t8Var.D(), t8Var.k());
        this.N.a(t8Var);
        this.P.l(t8Var);
    }

    @Override // com.p7700g.p99005.aa
    public boolean a(int i2, int i3) {
        if (i2 != 509) {
            return i2 == 704;
        }
        Y(i3);
        return true;
    }

    public void a0(ka kaVar, t8 t8Var, int i2, int i3, int i4) {
        s8 s8Var = this.N;
        s8Var.H = 0.0f;
        s8Var.I = 0.0f;
        q9 q9Var = new q9();
        if (i2 == 1) {
            int i5 = kaVar.b + kaVar.d;
            q9Var.b = ((kaVar.c + kaVar.e) - kaVar.c()) / 2;
            q9Var.d = i3 - ((kaVar.b() + i5) / 2);
            q9Var.c = kaVar.c() + q9Var.b;
            q9Var.a = kaVar.b() + q9Var.d;
        } else if (i2 == 2) {
            int i6 = kaVar.b + kaVar.d;
            q9Var.b = i4 - ((kaVar.c() + (kaVar.c + kaVar.e)) / 2);
            q9Var.d = (i6 - kaVar.b()) / 2;
            q9Var.c = kaVar.c() + q9Var.b;
            q9Var.a = kaVar.b() + q9Var.d;
        }
        this.N.s(q9Var.b, q9Var.d, q9Var.b(), q9Var.a());
        this.P.m(q9Var, t8Var, i2, kaVar.a);
    }

    @Override // com.p7700g.p99005.aa
    public boolean b(int i2, float f) {
        return false;
    }

    public void b0(int i2) {
        this.n0 = i2;
        this.o0 = null;
    }

    @Override // com.p7700g.p99005.aa
    public boolean c(int i2, String str) {
        if (705 == i2) {
            PrintStream printStream = System.out;
            printStream.println("TYPE_INTERPOLATOR  " + str);
            this.r0 = A(-1, str, 0);
        }
        return false;
    }

    public void c0(t8 t8Var) {
        this.J = t8Var;
    }

    @Override // com.p7700g.p99005.aa
    public boolean d(int i2, boolean z2) {
        return false;
    }

    public void d0(int i2, int i3, float f, long j2) {
        ArrayList arrayList;
        String[] strArr;
        p8 p8Var;
        s9 f2;
        p8 p8Var2;
        Integer num;
        Iterator<String> it;
        s9 f3;
        p8 p8Var3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i4 = this.m0;
        if (i4 != -1) {
            this.N.P = i4;
        }
        this.P.e(this.Q, hashSet2);
        ArrayList<v8> arrayList2 = this.h0;
        if (arrayList2 != null) {
            Iterator<v8> it2 = arrayList2.iterator();
            arrayList = null;
            while (it2.hasNext()) {
                v8 next = it2.next();
                if (next instanceof y8) {
                    y8 y8Var = (y8) next;
                    P(new s8(i2, i3, y8Var, this.N, this.O));
                    int i5 = y8Var.E;
                    if (i5 != -1) {
                        this.M = i5;
                    }
                } else if (next instanceof x8) {
                    next.i(hashSet3);
                } else if (next instanceof z8) {
                    next.i(hashSet);
                } else if (next instanceof a9) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((a9) next);
                } else {
                    next.q(hashMap);
                    next.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.l0 = (a9[]) arrayList.toArray(new a9[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.j0 = new HashMap<>();
            Iterator<String> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                if (next2.startsWith("CUSTOM,")) {
                    m9.b bVar = new m9.b();
                    String str = next2.split(",")[c];
                    Iterator<v8> it4 = this.h0.iterator();
                    while (it4.hasNext()) {
                        v8 next3 = it4.next();
                        Iterator<String> it5 = it3;
                        HashMap<String, p8> hashMap2 = next3.x;
                        if (hashMap2 != null && (p8Var3 = hashMap2.get(str)) != null) {
                            bVar.a(next3.t, p8Var3);
                        }
                        it3 = it5;
                    }
                    it = it3;
                    f3 = s9.e(next2, bVar);
                } else {
                    it = it3;
                    f3 = s9.f(next2, j2);
                }
                if (f3 != null) {
                    f3.i(next2);
                    this.j0.put(next2, f3);
                }
                c = 1;
                it3 = it;
            }
            ArrayList<v8> arrayList3 = this.h0;
            if (arrayList3 != null) {
                Iterator<v8> it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    v8 next4 = it6.next();
                    if (next4 instanceof w8) {
                        next4.f(this.j0);
                    }
                }
            }
            this.P.a(this.j0, 0);
            this.Q.a(this.j0, 100);
            for (String str2 : this.j0.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                s9 s9Var = this.j0.get(str2);
                if (s9Var != null) {
                    s9Var.j(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.i0 == null) {
                this.i0 = new HashMap<>();
            }
            Iterator<String> it7 = hashSet.iterator();
            while (it7.hasNext()) {
                String next5 = it7.next();
                if (!this.i0.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        m9.b bVar2 = new m9.b();
                        String str3 = next5.split(",")[1];
                        Iterator<v8> it8 = this.h0.iterator();
                        while (it8.hasNext()) {
                            v8 next6 = it8.next();
                            HashMap<String, p8> hashMap3 = next6.x;
                            if (hashMap3 != null && (p8Var2 = hashMap3.get(str3)) != null) {
                                bVar2.a(next6.t, p8Var2);
                            }
                        }
                        f2 = s9.e(next5, bVar2);
                    } else {
                        f2 = s9.f(next5, j2);
                    }
                    if (f2 != null) {
                        f2.i(next5);
                    }
                }
            }
            ArrayList<v8> arrayList4 = this.h0;
            if (arrayList4 != null) {
                Iterator<v8> it9 = arrayList4.iterator();
                while (it9.hasNext()) {
                    v8 next7 = it9.next();
                    if (next7 instanceof z8) {
                        ((z8) next7).v(this.i0);
                    }
                }
            }
            for (String str4 : this.i0.keySet()) {
                this.i0.get(str4).f(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i6 = 2;
        int size = this.f0.size() + 2;
        s8[] s8VarArr = new s8[size];
        s8VarArr[0] = this.N;
        s8VarArr[size - 1] = this.O;
        if (this.f0.size() > 0 && this.M == v8.h) {
            this.M = 0;
        }
        Iterator<s8> it10 = this.f0.iterator();
        int i7 = 1;
        while (it10.hasNext()) {
            s8VarArr[i7] = it10.next();
            i7++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.O.T.keySet()) {
            if (this.N.T.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.b0 = strArr2;
        this.c0 = new int[strArr2.length];
        int i8 = 0;
        while (true) {
            strArr = this.b0;
            if (i8 >= strArr.length) {
                break;
            }
            String str6 = strArr[i8];
            this.c0[i8] = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                if (s8VarArr[i9].T.containsKey(str6) && (p8Var = s8VarArr[i9].T.get(str6)) != null) {
                    int[] iArr = this.c0;
                    iArr[i8] = p8Var.r() + iArr[i8];
                    break;
                }
                i9++;
            }
            i8++;
        }
        boolean z2 = s8VarArr[0].P != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 1; i10 < size; i10++) {
            s8VarArr[i10].e(s8VarArr[i10 - 1], zArr, this.b0, z2);
        }
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                i11++;
            }
        }
        this.Y = new int[i11];
        int max = Math.max(2, i11);
        this.Z = new double[max];
        this.a0 = new double[max];
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                this.Y[i13] = i14;
                i13++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, size, this.Y.length);
        double[] dArr2 = new double[size];
        for (int i15 = 0; i15 < size; i15++) {
            s8VarArr[i15].f(dArr[i15], this.Y);
            dArr2[i15] = s8VarArr[i15].H;
        }
        int i16 = 0;
        while (true) {
            int[] iArr2 = this.Y;
            if (i16 >= iArr2.length) {
                break;
            }
            if (iArr2[i16] < s8.E.length) {
                String C2 = wo1.C(new StringBuilder(), s8.E[this.Y[i16]], " [");
                for (int i17 = 0; i17 < size; i17++) {
                    StringBuilder G2 = wo1.G(C2);
                    G2.append(dArr[i17][i16]);
                    C2 = G2.toString();
                }
            }
            i16++;
        }
        this.R = new f9[this.b0.length + 1];
        int i18 = 0;
        while (true) {
            String[] strArr3 = this.b0;
            if (i18 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i18];
            int i19 = 0;
            int i20 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i19 < size) {
                if (s8VarArr[i19].n(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i6];
                        iArr3[1] = s8VarArr[i19].l(str7);
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance(double.class, iArr3);
                    }
                    dArr3[i20] = s8VarArr[i19].H;
                    s8VarArr[i19].k(str7, dArr4[i20], 0);
                    i20++;
                }
                i19++;
                i6 = 2;
            }
            i18++;
            this.R[i18] = f9.a(this.M, Arrays.copyOf(dArr3, i20), (double[][]) Arrays.copyOf(dArr4, i20));
            i6 = 2;
        }
        this.R[0] = f9.a(this.M, dArr2, dArr);
        if (s8VarArr[0].P != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, size, 2);
            for (int i21 = 0; i21 < size; i21++) {
                iArr4[i21] = s8VarArr[i21].P;
                dArr5[i21] = s8VarArr[i21].H;
                dArr6[i21][0] = s8VarArr[i21].J;
                dArr6[i21][1] = s8VarArr[i21].K;
            }
            this.S = f9.b(iArr4, dArr5, dArr6);
        }
        float f4 = Float.NaN;
        this.k0 = new HashMap<>();
        if (this.h0 != null) {
            Iterator<String> it11 = hashSet3.iterator();
            while (it11.hasNext()) {
                String next8 = it11.next();
                l9 d = l9.d(next8);
                if (d != null) {
                    if (d.k() && Float.isNaN(f4)) {
                        f4 = I();
                    }
                    d.i(next8);
                    this.k0.put(next8, d);
                }
            }
            Iterator<v8> it12 = this.h0.iterator();
            while (it12.hasNext()) {
                v8 next9 = it12.next();
                if (next9 instanceof x8) {
                    ((x8) next9).v(this.k0);
                }
            }
            for (l9 l9Var : this.k0.values()) {
                l9Var.j(f4);
            }
        }
    }

    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        return 0;
    }

    public void e0(q8 q8Var) {
        this.N.v(q8Var, q8Var.N);
        this.O.v(q8Var, q8Var.O);
    }

    public void f(v8 v8Var) {
        this.h0.add(v8Var);
    }

    public void g(ArrayList<v8> arrayList) {
        this.h0.addAll(arrayList);
    }

    public void h(float[] fArr, int i2) {
        float f;
        float f2 = 1.0f / (i2 - 1);
        HashMap<String, s9> hashMap = this.j0;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, s9> hashMap2 = this.j0;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, l9> hashMap3 = this.k0;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, l9> hashMap4 = this.k0;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f3 = i3 * f2;
            float f4 = this.V;
            float f5 = 0.0f;
            if (f4 != 1.0f) {
                float f6 = this.U;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, 1.0f);
                }
            }
            double d = f3;
            h9 h9Var = this.N.F;
            float f7 = Float.NaN;
            Iterator<s8> it = this.f0.iterator();
            while (it.hasNext()) {
                s8 next = it.next();
                h9 h9Var2 = next.F;
                if (h9Var2 != null) {
                    float f8 = next.H;
                    if (f8 < f3) {
                        h9Var = h9Var2;
                        f5 = f8;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.H;
                    }
                }
            }
            if (h9Var != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) h9Var.a((f3 - f5) / f)) * (f7 - f5)) + f5;
            }
            this.R[0].d(d, this.Z);
            f9 f9Var = this.S;
            if (f9Var != null) {
                double[] dArr = this.Z;
                if (dArr.length > 0) {
                    f9Var.d(d, dArr);
                }
            }
            this.N.g(this.Y, this.Z, fArr, i3 * 2);
        }
    }

    public int i(float[] fArr, int[] iArr) {
        if (fArr != null) {
            double[] h2 = this.R[0].h();
            if (iArr != null) {
                Iterator<s8> it = this.f0.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = it.next().U;
                    i2++;
                }
            }
            int i3 = 0;
            for (double d : h2) {
                this.R[0].d(d, this.Z);
                this.N.g(this.Y, this.Z, fArr, i3);
                i3 += 2;
            }
            return i3 / 2;
        }
        return 0;
    }

    public int j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr != null) {
            double[] h2 = this.R[0].h();
            if (iArr != null) {
                Iterator<s8> it = this.f0.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = it.next().U;
                    i2++;
                }
            }
            if (iArr2 != null) {
                Iterator<s8> it2 = this.f0.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    iArr2[i3] = (int) (it2.next().I * 100.0f);
                    i3++;
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < h2.length; i5++) {
                this.R[0].d(h2[i5], this.Z);
                this.N.h(h2[i5], this.Y, this.Z, fArr, i4);
                i4 += 2;
            }
            return i4 / 2;
        }
        return 0;
    }

    public void k(float[] fArr, int i2) {
        double d;
        float f;
        float f2 = 1.0f;
        float f3 = 1.0f / (i2 - 1);
        HashMap<String, s9> hashMap = this.j0;
        s9 s9Var = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, s9> hashMap2 = this.j0;
        s9 s9Var2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, l9> hashMap3 = this.k0;
        l9 l9Var = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, l9> hashMap4 = this.k0;
        l9 l9Var2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float f4 = i3 * f3;
            float f5 = this.V;
            if (f5 != f2) {
                float f6 = this.U;
                if (f4 < f6) {
                    f4 = 0.0f;
                }
                if (f4 > f6 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f6) * f5, f2);
                }
            }
            float f7 = f4;
            double d2 = f7;
            h9 h9Var = this.N.F;
            float f8 = Float.NaN;
            Iterator<s8> it = this.f0.iterator();
            float f9 = 0.0f;
            while (it.hasNext()) {
                s8 next = it.next();
                h9 h9Var2 = next.F;
                double d3 = d2;
                if (h9Var2 != null) {
                    float f10 = next.H;
                    if (f10 < f7) {
                        f9 = f10;
                        h9Var = h9Var2;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.H;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (h9Var != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d = (((float) h9Var.a((f7 - f9) / f)) * (f8 - f9)) + f9;
            } else {
                d = d4;
            }
            this.R[0].d(d, this.Z);
            f9 f9Var = this.S;
            if (f9Var != null) {
                double[] dArr = this.Z;
                if (dArr.length > 0) {
                    f9Var.d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            int i5 = i3;
            this.N.h(d, this.Y, this.Z, fArr, i4);
            if (l9Var != null) {
                fArr[i4] = l9Var.a(f7) + fArr[i4];
            } else if (s9Var != null) {
                fArr[i4] = s9Var.a(f7) + fArr[i4];
            }
            if (l9Var2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = l9Var2.a(f7) + fArr[i6];
            } else if (s9Var2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = s9Var2.a(f7) + fArr[i7];
            }
            i3 = i5 + 1;
            f2 = 1.0f;
        }
    }

    public void l(float f, float[] fArr, int i2) {
        this.R[0].d(o(f, null), this.Z);
        this.N.m(this.Y, this.Z, fArr, i2);
    }

    public void m(float[] fArr, int i2) {
        float f = 1.0f / (i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            this.R[0].d(o(i3 * f, null), this.Z);
            this.N.m(this.Y, this.Z, fArr, i3 * 8);
        }
    }

    public void n(boolean z2) {
    }

    public int p() {
        return this.N.Q;
    }

    public int q(String str, float[] fArr, int i2) {
        s9 s9Var = this.j0.get(str);
        if (s9Var == null) {
            return -1;
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = s9Var.a(i3 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void r(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.R[0].d(d, dArr);
        this.R[0].g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.N.i(d, this.Y, dArr, fArr, dArr2, fArr2);
    }

    public float s() {
        return this.W;
    }

    public float t() {
        return this.X;
    }

    public String toString() {
        StringBuilder G2 = wo1.G(" start: x: ");
        G2.append(this.N.J);
        G2.append(" y: ");
        G2.append(this.N.K);
        G2.append(" end: x: ");
        G2.append(this.O.J);
        G2.append(" y: ");
        G2.append(this.O.K);
        return G2.toString();
    }

    public void u(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float o2 = o(f, this.g0);
        f9[] f9VarArr = this.R;
        int i2 = 0;
        if (f9VarArr != null) {
            double d = o2;
            f9VarArr[0].g(d, this.a0);
            this.R[0].d(d, this.Z);
            float f4 = this.g0[0];
            while (true) {
                dArr = this.a0;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * f4;
                i2++;
            }
            f9 f9Var = this.S;
            if (f9Var != null) {
                double[] dArr2 = this.Z;
                if (dArr2.length > 0) {
                    f9Var.d(d, dArr2);
                    this.S.g(d, this.a0);
                    this.N.t(f2, f3, fArr, this.Y, this.a0, this.Z);
                    return;
                }
                return;
            }
            this.N.t(f2, f3, fArr, this.Y, dArr, this.Z);
            return;
        }
        s8 s8Var = this.O;
        float f5 = s8Var.J;
        s8 s8Var2 = this.N;
        float f6 = f5 - s8Var2.J;
        float f7 = s8Var.K - s8Var2.K;
        fArr[0] = (((s8Var.L - s8Var2.L) + f6) * f2) + ((1.0f - f2) * f6);
        fArr[1] = (((s8Var.M - s8Var2.M) + f7) * f3) + ((1.0f - f3) * f7);
    }

    public int v() {
        int i2 = this.N.G;
        Iterator<s8> it = this.f0.iterator();
        while (it.hasNext()) {
            i2 = Math.max(i2, it.next().G);
        }
        return Math.max(i2, this.O.G);
    }

    public float w() {
        return this.O.M;
    }

    public float x() {
        return this.O.L;
    }

    public float y() {
        return this.O.J;
    }

    public float z() {
        return this.O.K;
    }
}