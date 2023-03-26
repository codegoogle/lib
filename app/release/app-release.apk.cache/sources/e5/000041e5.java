package com.p7700g.p99005;

/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class f9 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    /* compiled from: CurveFit.java */
    /* loaded from: classes.dex */
    public static class a extends f9 {
        public double d;
        public double[] e;

        public a(double d, double[] dArr) {
            this.d = d;
            this.e = dArr;
        }

        @Override // com.p7700g.p99005.f9
        public double c(double d, int i) {
            return this.e[i];
        }

        @Override // com.p7700g.p99005.f9
        public void d(double d, double[] dArr) {
            double[] dArr2 = this.e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // com.p7700g.p99005.f9
        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.e;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // com.p7700g.p99005.f9
        public double f(double d, int i) {
            return zg2.s;
        }

        @Override // com.p7700g.p99005.f9
        public void g(double d, double[] dArr) {
            for (int i = 0; i < this.e.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // com.p7700g.p99005.f9
        public double[] h() {
            return new double[]{this.d};
        }
    }

    public static f9 a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i != 2) {
                return new n9(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new o9(dArr, dArr2);
    }

    public static f9 b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new e9(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract double f(double d, int i);

    public abstract void g(double d, double[] dArr);

    public abstract double[] h();
}