package com.p7700g.p99005;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class l9 {
    private static final String a = "KeyCycleOscillator";
    private f9 b;
    private c c;
    private String d;
    private int e = 0;
    private String f = null;
    public int g = 0;
    public ArrayList<g> h = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<g> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            return Integer.compare(gVar.a, gVar2.a);
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class b extends l9 {
        public String i;
        public int j;

        public b(String str) {
            this.i = str;
            this.j = ca.a(str);
        }

        @Override // com.p7700g.p99005.l9
        public void h(t8 t8Var, float f) {
            t8Var.b(this.j, a(f));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class c {
        public static final int a = -1;
        private static final String b = "CycleOscillator";
        private final int c;
        public p9 d;
        private final int e;
        private final int f;
        private final int g;
        public float[] h;
        public double[] i;
        public float[] j;
        public float[] k;
        public float[] l;
        public float[] m;
        public int n;
        public f9 o;
        public double[] p;
        public double[] q;
        public float r;

        public c(int i, String str, int i2, int i3) {
            p9 p9Var = new p9();
            this.d = p9Var;
            this.e = 0;
            this.f = 1;
            this.g = 2;
            this.n = i;
            this.c = i2;
            p9Var.g(i, str);
            this.h = new float[i3];
            this.i = new double[i3];
            this.j = new float[i3];
            this.k = new float[i3];
            this.l = new float[i3];
            this.m = new float[i3];
        }

        public double a() {
            return this.p[1];
        }

        public double b(float f) {
            f9 f9Var = this.o;
            if (f9Var != null) {
                double d = f;
                f9Var.g(d, this.q);
                this.o.d(d, this.p);
            } else {
                double[] dArr = this.q;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double e = this.d.e(d2, this.p[1]);
            double d3 = this.d.d(d2, this.p[1], this.q[1]);
            double[] dArr2 = this.q;
            return (d3 * this.p[2]) + (e * dArr2[2]) + dArr2[0];
        }

        public double c(float f) {
            f9 f9Var = this.o;
            if (f9Var != null) {
                f9Var.d(f, this.p);
            } else {
                double[] dArr = this.p;
                dArr[0] = this.k[0];
                dArr[1] = this.l[0];
                dArr[2] = this.h[0];
            }
            double[] dArr2 = this.p;
            return (this.d.e(f, dArr2[1]) * this.p[2]) + dArr2[0];
        }

        public void d(int i, int i2, float f, float f2, float f3, float f4) {
            this.i[i] = i2 / 100.0d;
            this.j[i] = f;
            this.k[i] = f2;
            this.l[i] = f3;
            this.h[i] = f4;
        }

        public void e(float f) {
            this.r = f;
            double[][] dArr = (double[][]) Array.newInstance(double.class, this.i.length, 3);
            float[] fArr = this.h;
            this.p = new double[fArr.length + 2];
            this.q = new double[fArr.length + 2];
            if (this.i[0] > zg2.s) {
                this.d.a(zg2.s, this.j[0]);
            }
            double[] dArr2 = this.i;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.d.a(1.0d, this.j[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = this.k[i];
                dArr[i][1] = this.l[i];
                dArr[i][2] = this.h[i];
                this.d.a(this.i[i], this.j[i]);
            }
            this.d.f();
            double[] dArr3 = this.i;
            if (dArr3.length > 1) {
                this.o = f9.a(0, dArr3, dArr);
            } else {
                this.o = null;
            }
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        private static int a(int[] iArr, float[] fArr, int i, int i2) {
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

        public static void b(int[] iArr, float[] fArr, int i, int i2) {
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
                    int a = a(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = a - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = a + 1;
                }
            }
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

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        private static int a(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    c(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            c(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        public static void b(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
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
                    int a = a(iArr, fArr, fArr2, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = a - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = a + 1;
                }
            }
        }

        private static void c(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class f extends l9 {
        public String i;
        public int j;

        public f(String str) {
            this.i = str;
            this.j = ca.a(str);
        }

        @Override // com.p7700g.p99005.l9
        public void h(t8 t8Var, float f) {
            t8Var.b(this.j, a(f));
        }

        public void l(t8 t8Var, float f, double d, double d2) {
            t8Var.R(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class g {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;

        public g(int i, float f, float f2, float f3, float f4) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public static l9 d(String str) {
        if (str.equals("pathRotate")) {
            return new f(str);
        }
        return new b(str);
    }

    public float a(float f2) {
        return (float) this.c.c(f2);
    }

    public f9 b() {
        return this.b;
    }

    public float c(float f2) {
        return (float) this.c.b(f2);
    }

    public void e(Object obj) {
    }

    public void f(int i, int i2, String str, int i3, float f2, float f3, float f4, float f5) {
        this.h.add(new g(i, f2, f3, f4, f5));
        if (i3 != -1) {
            this.g = i3;
        }
        this.e = i2;
        this.f = str;
    }

    public void g(int i, int i2, String str, int i3, float f2, float f3, float f4, float f5, Object obj) {
        this.h.add(new g(i, f2, f3, f4, f5));
        if (i3 != -1) {
            this.g = i3;
        }
        this.e = i2;
        e(obj);
        this.f = str;
    }

    public void h(t8 t8Var, float f2) {
    }

    public void i(String str) {
        this.d = str;
    }

    public void j(float f2) {
        int size = this.h.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.h, new a());
        double[] dArr = new double[size];
        char c2 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, 3);
        this.c = new c(this.e, this.f, this.g, size);
        Iterator<g> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            g next = it.next();
            float f3 = next.d;
            dArr[i] = f3 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f4 = next.b;
            dArr3[c2] = f4;
            double[] dArr4 = dArr2[i];
            float f5 = next.c;
            dArr4[1] = f5;
            double[] dArr5 = dArr2[i];
            float f6 = next.e;
            dArr5[2] = f6;
            this.c.d(i, next.a, f3, f5, f6, f4);
            i++;
            c2 = 0;
        }
        this.c.e(f2);
        this.b = f9.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.g == 1;
    }

    public String toString() {
        String str = this.d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<g> it = this.h.iterator();
        while (it.hasNext()) {
            g next = it.next();
            StringBuilder L = wo1.L(str, "[");
            L.append(next.a);
            L.append(" , ");
            L.append(decimalFormat.format(next.b));
            L.append("] ");
            str = L.toString();
        }
        return str;
    }
}