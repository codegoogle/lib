package com.p7700g.p99005;

import com.p7700g.p99005.m9;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class x9 {
    private static final String a = "SplineSet";
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static float e = 6.2831855f;
    public f9 f;
    public int j;
    public String k;
    public long n;
    public int g = 0;
    public int[] h = new int[10];
    public float[][] i = (float[][]) Array.newInstance(float.class, 10, 3);
    public float[] l = new float[3];
    public boolean m = false;
    public float o = Float.NaN;

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes.dex */
    public static class a extends x9 {
        public String p;
        public m9.a q;
        public m9.c r = new m9.c();
        public float[] s;
        public float[] t;

        public a(String str, m9.a aVar) {
            this.p = str.split(",")[1];
            this.q = aVar;
        }

        @Override // com.p7700g.p99005.x9
        public void c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // com.p7700g.p99005.x9
        public void f(int i) {
            int f = this.q.f();
            int h = this.q.g(0).h();
            double[] dArr = new double[f];
            int i2 = h + 2;
            this.s = new float[i2];
            this.t = new float[h];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, f, i2);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.q.d(i3);
                o8 g = this.q.g(i3);
                float[] g2 = this.r.g(i3);
                dArr[i3] = d * 0.01d;
                g.e(this.s);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.s;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                dArr2[i3][h] = g2[0];
                dArr2[i3][h + 1] = g2[1];
            }
            this.f = f9.a(i, dArr, dArr2);
        }

        public void g(int i, o8 o8Var, float f, int i2, float f2) {
            this.q.a(i, o8Var);
            this.r.a(i, new float[]{f, f2});
            this.g = Math.max(this.g, i2);
        }

        public boolean h(t8 t8Var, float f, long j, k9 k9Var) {
            this.f.e(f, this.s);
            float[] fArr = this.s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.n;
            if (Float.isNaN(this.o)) {
                float a = k9Var.a(t8Var, this.p, 0);
                this.o = a;
                if (Float.isNaN(a)) {
                    this.o = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.o) % 1.0d);
            this.o = f4;
            this.n = j;
            float a2 = a(f4);
            this.m = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.m;
                float[] fArr3 = this.s;
                this.m = z | (((double) fArr3[i]) != zg2.s);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            t8Var.M(this.q.g(0), this.t);
            if (f2 != 0.0f) {
                this.m = true;
            }
            return this.m;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes.dex */
    public static class b extends x9 {
        public String p;
        public m9.b q;
        public m9.c r = new m9.c();
        public float[] s;
        public float[] t;

        public b(String str, m9.b bVar) {
            this.p = str.split(",")[1];
            this.q = bVar;
        }

        @Override // com.p7700g.p99005.x9
        public void c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // com.p7700g.p99005.x9
        public void f(int i) {
            int f = this.q.f();
            int r = this.q.g(0).r();
            double[] dArr = new double[f];
            int i2 = r + 2;
            this.s = new float[i2];
            this.t = new float[r];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, f, i2);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.q.d(i3);
                p8 g = this.q.g(i3);
                float[] g2 = this.r.g(i3);
                dArr[i3] = d * 0.01d;
                g.o(this.s);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.s;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                dArr2[i3][r] = g2[0];
                dArr2[i3][r + 1] = g2[1];
            }
            this.f = f9.a(i, dArr, dArr2);
        }

        public void g(int i, p8 p8Var, float f, int i2, float f2) {
            this.q.a(i, p8Var);
            this.r.a(i, new float[]{f, f2});
            this.g = Math.max(this.g, i2);
        }

        public boolean h(t8 t8Var, float f, long j, k9 k9Var) {
            this.f.e(f, this.s);
            float[] fArr = this.s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.n;
            if (Float.isNaN(this.o)) {
                float a = k9Var.a(t8Var, this.p, 0);
                this.o = a;
                if (Float.isNaN(a)) {
                    this.o = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.o) % 1.0d);
            this.o = f4;
            this.n = j;
            float a2 = a(f4);
            this.m = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.m;
                float[] fArr3 = this.s;
                this.m = z | (((double) fArr3[i]) != zg2.s);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            this.q.g(0).w(t8Var, this.t);
            if (f2 != 0.0f) {
                this.m = true;
            }
            return this.m;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            c(iArr, fArr, i4, i2);
            return i4;
        }

        private static void c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    public float a(float f) {
        float abs;
        switch (this.g) {
            case 1:
                return Math.signum(f * e);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * e);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * e);
        }
        return 1.0f - abs;
    }

    public f9 b() {
        return this.f;
    }

    public void c(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.h;
        int i3 = this.j;
        iArr[i3] = i;
        float[][] fArr = this.i;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.g = Math.max(this.g, i2);
        this.j++;
    }

    public void d(long j) {
        this.n = j;
    }

    public void e(String str) {
        this.k = str;
    }

    public void f(int i) {
        int i2;
        int i3 = this.j;
        if (i3 == 0) {
            PrintStream printStream = System.err;
            StringBuilder G = wo1.G("Error no points added to ");
            G.append(this.k);
            printStream.println(G.toString());
            return;
        }
        c.a(this.h, this.i, 0, i3 - 1);
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] != iArr[i4 - 1]) {
                i5++;
            }
            i4++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        double[] dArr = new double[i5];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i5, 3);
        int i6 = 0;
        while (i2 < this.j) {
            if (i2 > 0) {
                int[] iArr2 = this.h;
                i2 = iArr2[i2] == iArr2[i2 + (-1)] ? i2 + 1 : 0;
            }
            dArr[i6] = this.h[i2] * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[][] fArr = this.i;
            dArr3[0] = fArr[i2][0];
            dArr2[i6][1] = fArr[i2][1];
            dArr2[i6][2] = fArr[i2][2];
            i6++;
        }
        this.f = f9.a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.k;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.j; i++) {
            StringBuilder L = wo1.L(str, "[");
            L.append(this.h[i]);
            L.append(" , ");
            L.append(decimalFormat.format(this.i[i]));
            L.append("] ");
            str = L.toString();
        }
        return str;
    }
}