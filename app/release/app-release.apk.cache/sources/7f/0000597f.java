package com.p7700g.p99005;

import com.p7700g.p99005.s9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
public class r8 implements Comparable<r8> {
    public static final String s = "MotionPaths";
    public static final boolean t = false;
    public static final int u = 1;
    public static final int v = 2;
    public static String[] w = {"position", "x", "y", "width", "height", "pathRotate"};
    private h9 M;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    public int z;
    private float x = 1.0f;
    public int y = 0;
    private boolean A = false;
    private float B = 0.0f;
    private float C = 0.0f;
    private float D = 0.0f;
    public float E = 0.0f;
    private float F = 1.0f;
    private float G = 1.0f;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = 0.0f;
    private float K = 0.0f;
    private float L = 0.0f;
    private int N = 0;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private int V = -1;
    public LinkedHashMap<String, p8> W = new LinkedHashMap<>();
    public int X = 0;
    public double[] Y = new double[18];
    public double[] Z = new double[18];

    private boolean d(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public void a(HashMap<String, s9> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            s9 s9Var = hashMap.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    s9Var.g(i, Float.isNaN(this.D) ? 0.0f : this.D);
                    break;
                case 1:
                    s9Var.g(i, Float.isNaN(this.E) ? 0.0f : this.E);
                    break;
                case 2:
                    s9Var.g(i, Float.isNaN(this.C) ? 0.0f : this.C);
                    break;
                case 3:
                    s9Var.g(i, Float.isNaN(this.J) ? 0.0f : this.J);
                    break;
                case 4:
                    s9Var.g(i, Float.isNaN(this.K) ? 0.0f : this.K);
                    break;
                case 5:
                    s9Var.g(i, Float.isNaN(this.L) ? 0.0f : this.L);
                    break;
                case 6:
                    s9Var.g(i, Float.isNaN(this.U) ? 0.0f : this.U);
                    break;
                case 7:
                    s9Var.g(i, Float.isNaN(this.H) ? 0.0f : this.H);
                    break;
                case '\b':
                    s9Var.g(i, Float.isNaN(this.I) ? 0.0f : this.I);
                    break;
                case '\t':
                    s9Var.g(i, Float.isNaN(this.F) ? 1.0f : this.F);
                    break;
                case '\n':
                    s9Var.g(i, Float.isNaN(this.G) ? 1.0f : this.G);
                    break;
                case 11:
                    s9Var.g(i, Float.isNaN(this.x) ? 1.0f : this.x);
                    break;
                case '\f':
                    s9Var.g(i, Float.isNaN(this.T) ? 0.0f : this.T);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        ia.f("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    } else {
                        String str2 = str.split(",")[1];
                        if (this.W.containsKey(str2)) {
                            p8 p8Var = this.W.get(str2);
                            if (s9Var instanceof s9.c) {
                                ((s9.c) s9Var).k(i, p8Var);
                                break;
                            } else {
                                ia.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + p8Var.n() + s9Var);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public void b(t8 t8Var) {
        this.z = t8Var.B();
        this.x = t8Var.B() != 4 ? 0.0f : t8Var.g();
        this.A = false;
        this.C = t8Var.t();
        this.D = t8Var.r();
        this.E = t8Var.s();
        this.F = t8Var.u();
        this.G = t8Var.v();
        this.H = t8Var.o();
        this.I = t8Var.p();
        this.J = t8Var.x();
        this.K = t8Var.y();
        this.L = t8Var.z();
        for (String str : t8Var.j()) {
            p8 i = t8Var.i(str);
            if (i != null && i.q()) {
                this.W.put(str, i);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(r8 r8Var) {
        return Float.compare(this.O, r8Var.O);
    }

    public void e(r8 r8Var, HashSet<String> hashSet) {
        if (d(this.x, r8Var.x)) {
            hashSet.add("alpha");
        }
        if (d(this.B, r8Var.B)) {
            hashSet.add("translationZ");
        }
        int i = this.z;
        int i2 = r8Var.z;
        if (i != i2 && this.y == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (d(this.C, r8Var.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.T) || !Float.isNaN(r8Var.T)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.U) || !Float.isNaN(r8Var.U)) {
            hashSet.add("progress");
        }
        if (d(this.D, r8Var.D)) {
            hashSet.add("rotationX");
        }
        if (d(this.E, r8Var.E)) {
            hashSet.add("rotationY");
        }
        if (d(this.H, r8Var.H)) {
            hashSet.add("pivotX");
        }
        if (d(this.I, r8Var.I)) {
            hashSet.add("pivotY");
        }
        if (d(this.F, r8Var.F)) {
            hashSet.add("scaleX");
        }
        if (d(this.G, r8Var.G)) {
            hashSet.add("scaleY");
        }
        if (d(this.J, r8Var.J)) {
            hashSet.add("translationX");
        }
        if (d(this.K, r8Var.K)) {
            hashSet.add("translationY");
        }
        if (d(this.L, r8Var.L)) {
            hashSet.add("translationZ");
        }
        if (d(this.B, r8Var.B)) {
            hashSet.add("elevation");
        }
    }

    public void f(r8 r8Var, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | d(this.O, r8Var.O);
        zArr[1] = zArr[1] | d(this.P, r8Var.P);
        zArr[2] = zArr[2] | d(this.Q, r8Var.Q);
        zArr[3] = zArr[3] | d(this.R, r8Var.R);
        zArr[4] = d(this.S, r8Var.S) | zArr[4];
    }

    public void g(double[] dArr, int[] iArr) {
        float[] fArr = {this.O, this.P, this.Q, this.R, this.S, this.x, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.T};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 18) {
                dArr[i] = fArr[iArr[i2]];
                i++;
            }
        }
    }

    public int h(String str, double[] dArr, int i) {
        p8 p8Var = this.W.get(str);
        if (p8Var.r() == 1) {
            dArr[i] = p8Var.n();
            return 1;
        }
        int r = p8Var.r();
        float[] fArr = new float[r];
        p8Var.o(fArr);
        int i2 = 0;
        while (i2 < r) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    public int i(String str) {
        return this.W.get(str).r();
    }

    public boolean j(String str) {
        return this.W.containsKey(str);
    }

    public void k(float f, float f2, float f3, float f4) {
        this.P = f;
        this.Q = f2;
        this.R = f3;
        this.S = f4;
    }

    public void l(t8 t8Var) {
        k(t8Var.E(), t8Var.F(), t8Var.D(), t8Var.k());
        b(t8Var);
    }

    public void m(q9 q9Var, t8 t8Var, int i, float f) {
        k(q9Var.b, q9Var.d, q9Var.b(), q9Var.a());
        b(t8Var);
        this.H = Float.NaN;
        this.I = Float.NaN;
        if (i == 1) {
            this.C = f - 90.0f;
        } else if (i != 2) {
        } else {
            this.C = f + 90.0f;
        }
    }
}