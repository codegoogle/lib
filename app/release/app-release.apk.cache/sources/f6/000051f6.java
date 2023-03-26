package com.p7700g.p99005;

/* compiled from: LinearCurveFit.java */
/* loaded from: classes.dex */
public class n9 extends f9 {
    private static final String d = "LinearCurveFit";
    private double[] e;
    private double[][] f;
    private double g;
    private boolean h = true;
    public double[] i;

    public n9(double[] dArr, double[][] dArr2) {
        this.g = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.i = new double[length2];
        this.e = dArr;
        this.f = dArr2;
        if (length2 > 2) {
            double d2 = 0.0d;
            double d3 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d4 = dArr2[i][0];
                double d5 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d4 - d2, d5 - d3);
                }
                i++;
                d2 = d4;
                d3 = d5;
            }
            this.g = zg2.s;
        }
    }

    private double i(double d2) {
        if (Double.isNaN(this.g)) {
            return zg2.s;
        }
        double[] dArr = this.e;
        int length = dArr.length;
        if (d2 <= dArr[0]) {
            return zg2.s;
        }
        int i = length - 1;
        if (d2 >= dArr[i]) {
            return this.g;
        }
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i2 = 0;
        while (i2 < i) {
            double[][] dArr2 = this.f;
            double d6 = dArr2[i2][0];
            double d7 = dArr2[i2][1];
            if (i2 > 0) {
                d3 += Math.hypot(d6 - d4, d7 - d5);
            }
            double[] dArr3 = this.e;
            if (d2 == dArr3[i2]) {
                return d3;
            }
            int i3 = i2 + 1;
            if (d2 < dArr3[i3]) {
                double d8 = (d2 - dArr3[i2]) / (dArr3[i3] - dArr3[i2]);
                double[][] dArr4 = this.f;
                double d9 = dArr4[i2][0];
                double d10 = dArr4[i3][0];
                double d11 = 1.0d - d8;
                return Math.hypot(d7 - ((dArr4[i3][1] * d8) + (dArr4[i2][1] * d11)), d6 - ((d10 * d8) + (d9 * d11))) + d3;
            }
            i2 = i3;
            d4 = d6;
            d5 = d7;
        }
        return zg2.s;
    }

    @Override // com.p7700g.p99005.f9
    public double c(double d2, int i) {
        double[] dArr = this.e;
        int length = dArr.length;
        int i2 = 0;
        if (this.h) {
            if (d2 <= dArr[0]) {
                return (f(dArr[0], i) * (d2 - dArr[0])) + this.f[0][i];
            }
            int i3 = length - 1;
            if (d2 >= dArr[i3]) {
                return (f(dArr[i3], i) * (d2 - dArr[i3])) + this.f[i3][i];
            }
        } else if (d2 <= dArr[0]) {
            return this.f[0][i];
        } else {
            int i4 = length - 1;
            if (d2 >= dArr[i4]) {
                return this.f[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.e;
            if (d2 == dArr2[i2]) {
                return this.f[i2][i];
            }
            int i5 = i2 + 1;
            if (d2 < dArr2[i5]) {
                double d3 = (d2 - dArr2[i2]) / (dArr2[i5] - dArr2[i2]);
                double[][] dArr3 = this.f;
                return (dArr3[i5][i] * d3) + ((1.0d - d3) * dArr3[i2][i]);
            }
            i2 = i5;
        }
        return zg2.s;
    }

    @Override // com.p7700g.p99005.f9
    public void d(double d2, double[] dArr) {
        double[] dArr2 = this.e;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f[0].length;
        if (this.h) {
            if (d2 <= dArr2[0]) {
                g(dArr2[0], this.i);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = ((d2 - this.e[0]) * this.i[i2]) + this.f[0][i2];
                }
                return;
            }
            int i3 = length - 1;
            if (d2 >= dArr2[i3]) {
                g(dArr2[i3], this.i);
                while (i < length2) {
                    dArr[i] = ((d2 - this.e[i3]) * this.i[i]) + this.f[i3][i];
                    i++;
                }
                return;
            }
        } else if (d2 <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d2 >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d2 == this.e[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f[i6][i7];
                }
            }
            double[] dArr3 = this.e;
            int i8 = i6 + 1;
            if (d2 < dArr3[i8]) {
                double d3 = (d2 - dArr3[i6]) / (dArr3[i8] - dArr3[i6]);
                while (i < length2) {
                    double[][] dArr4 = this.f;
                    dArr[i] = (dArr4[i8][i] * d3) + ((1.0d - d3) * dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // com.p7700g.p99005.f9
    public void e(double d2, float[] fArr) {
        double[] dArr = this.e;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f[0].length;
        if (this.h) {
            if (d2 <= dArr[0]) {
                g(dArr[0], this.i);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (((d2 - this.e[0]) * this.i[i2]) + this.f[0][i2]);
                }
                return;
            }
            int i3 = length - 1;
            if (d2 >= dArr[i3]) {
                g(dArr[i3], this.i);
                while (i < length2) {
                    fArr[i] = (float) (((d2 - this.e[i3]) * this.i[i]) + this.f[i3][i]);
                    i++;
                }
                return;
            }
        } else if (d2 <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d2 >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d2 == this.e[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f[i6][i7];
                }
            }
            double[] dArr2 = this.e;
            int i8 = i6 + 1;
            if (d2 < dArr2[i8]) {
                double d3 = (d2 - dArr2[i6]) / (dArr2[i8] - dArr2[i6]);
                while (i < length2) {
                    double[][] dArr3 = this.f;
                    fArr[i] = (float) ((dArr3[i8][i] * d3) + ((1.0d - d3) * dArr3[i6][i]));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // com.p7700g.p99005.f9
    public double f(double d2, int i) {
        double[] dArr = this.e;
        int length = dArr.length;
        int i2 = 0;
        if (d2 < dArr[0]) {
            d2 = dArr[0];
        } else {
            int i3 = length - 1;
            if (d2 >= dArr[i3]) {
                d2 = dArr[i3];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.e;
            int i4 = i2 + 1;
            if (d2 <= dArr2[i4]) {
                double d3 = dArr2[i4] - dArr2[i2];
                double d4 = dArr2[i2];
                double[][] dArr3 = this.f;
                return (dArr3[i4][i] - dArr3[i2][i]) / d3;
            }
            i2 = i4;
        }
        return zg2.s;
    }

    @Override // com.p7700g.p99005.f9
    public void g(double d2, double[] dArr) {
        double[] dArr2 = this.e;
        int length = dArr2.length;
        int length2 = this.f[0].length;
        if (d2 <= dArr2[0]) {
            d2 = dArr2[0];
        } else {
            int i = length - 1;
            if (d2 >= dArr2[i]) {
                d2 = dArr2[i];
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.e;
            int i3 = i2 + 1;
            if (d2 <= dArr3[i3]) {
                double d3 = dArr3[i3] - dArr3[i2];
                double d4 = dArr3[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d3;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // com.p7700g.p99005.f9
    public double[] h() {
        return this.e;
    }
}