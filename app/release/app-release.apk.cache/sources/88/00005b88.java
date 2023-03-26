package com.p7700g.p99005;

import com.p7700g.p99005.m9;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class s9 {
    private static final String a = "SplineSet";
    public f9 b;
    public int[] c = new int[10];
    public float[] d = new float[10];
    private int e;
    private String f;

    /* compiled from: SplineSet.java */
    /* loaded from: classes.dex */
    public static class a extends s9 {
        public String g;
        public long h;

        public a(String str, long j) {
            this.g = str;
            this.h = j;
        }

        @Override // com.p7700g.p99005.s9
        public void h(aa aaVar, float f) {
            aaVar.b(aaVar.e(this.g), a(f));
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes.dex */
    public static class b extends s9 {
        public String g;
        public m9.a h;
        public float[] i;

        public b(String str, m9.a aVar) {
            this.g = str.split(",")[1];
            this.h = aVar;
        }

        @Override // com.p7700g.p99005.s9
        public void g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // com.p7700g.p99005.s9
        public void j(int i) {
            int f = this.h.f();
            int h = this.h.g(0).h();
            double[] dArr = new double[f];
            this.i = new float[h];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, f, h);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.h.d(i2);
                o8 g = this.h.g(i2);
                dArr[i2] = d * 0.01d;
                g.e(this.i);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.i;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.b = f9.a(i, dArr, dArr2);
        }

        public void k(int i, o8 o8Var) {
            this.h.a(i, o8Var);
        }

        public void l(mb mbVar, float f) {
            this.b.e(f, this.i);
            mbVar.z(this.h.g(0), this.i);
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes.dex */
    public static class c extends s9 {
        public String g;
        public m9.b h;
        public float[] i;

        public c(String str, m9.b bVar) {
            this.g = str.split(",")[1];
            this.h = bVar;
        }

        @Override // com.p7700g.p99005.s9
        public void g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // com.p7700g.p99005.s9
        public void h(aa aaVar, float f) {
            l((t8) aaVar, f);
        }

        @Override // com.p7700g.p99005.s9
        public void j(int i) {
            int f = this.h.f();
            int r = this.h.g(0).r();
            double[] dArr = new double[f];
            this.i = new float[r];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, f, r);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.h.d(i2);
                p8 g = this.h.g(i2);
                dArr[i2] = d * 0.01d;
                g.o(this.i);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.i;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.b = f9.a(i, dArr, dArr2);
        }

        public void k(int i, p8 p8Var) {
            this.h.a(i, p8Var);
        }

        public void l(t8 t8Var, float f) {
            this.b.e(f, this.i);
            this.h.g(0).w(t8Var, this.i);
        }
    }

    /* compiled from: SplineSet.java */
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        public static void a(int[] iArr, float[] fArr, int i, int i2) {
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

        private static int b(int[] iArr, float[] fArr, int i, int i2) {
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

        private static void c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static s9 d(String str, m9.a aVar) {
        return new b(str, aVar);
    }

    public static s9 e(String str, m9.b bVar) {
        return new c(str, bVar);
    }

    public static s9 f(String str, long j) {
        return new a(str, j);
    }

    public float a(float f) {
        return (float) this.b.c(f, 0);
    }

    public f9 b() {
        return this.b;
    }

    public float c(float f) {
        return (float) this.b.f(f, 0);
    }

    public void g(int i, float f) {
        int[] iArr = this.c;
        if (iArr.length < this.e + 1) {
            this.c = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.d;
            this.d = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.c;
        int i2 = this.e;
        iArr2[i2] = i;
        this.d[i2] = f;
        this.e = i2 + 1;
    }

    public void h(aa aaVar, float f) {
        aaVar.b(z9.a(this.f), a(f));
    }

    public void i(String str) {
        this.f = str;
    }

    public void j(int i) {
        int i2;
        int i3 = this.e;
        if (i3 == 0) {
            return;
        }
        d.a(this.c, this.d, 0, i3 - 1);
        int i4 = 1;
        for (int i5 = 1; i5 < this.e; i5++) {
            int[] iArr = this.c;
            if (iArr[i5 - 1] != iArr[i5]) {
                i4++;
            }
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i4, 1);
        int i6 = 0;
        while (i2 < this.e) {
            if (i2 > 0) {
                int[] iArr2 = this.c;
                i2 = iArr2[i2] == iArr2[i2 + (-1)] ? i2 + 1 : 0;
            }
            dArr[i6] = this.c[i2] * 0.01d;
            dArr2[i6][0] = this.d[i2];
            i6++;
        }
        this.b = f9.a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            StringBuilder L = wo1.L(str, "[");
            L.append(this.c[i]);
            L.append(" , ");
            L.append(decimalFormat.format(this.d[i]));
            L.append("] ");
            str = L.toString();
        }
        return str;
    }
}