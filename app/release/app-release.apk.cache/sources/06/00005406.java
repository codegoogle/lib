package com.p7700g.p99005;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: MonotonicCurveFit.java */
/* loaded from: classes.dex */
public class o9 extends f9 {
    private static final String d = "MonotonicCurveFit";
    private double[] e;
    private double[][] f;
    private double[][] g;
    private boolean h = true;
    public double[] i;

    public o9(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.i = new double[length2];
        int i = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(double.class, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                dArr3[i3][i2] = (dArr2[i4][i2] - dArr2[i3][i2]) / (dArr[i4] - dArr[i3]);
                if (i3 == 0) {
                    dArr4[i3][i2] = dArr3[i3][i2];
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + dArr3[i3][i2]) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                if (dArr3[i5][i6] == zg2.s) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d2 = dArr4[i5][i6] / dArr3[i5][i6];
                    int i7 = i5 + 1;
                    double d3 = dArr4[i7][i6] / dArr3[i5][i6];
                    double hypot = Math.hypot(d2, d3);
                    if (hypot > 9.0d) {
                        double d4 = 3.0d / hypot;
                        dArr4[i5][i6] = d2 * d4 * dArr3[i5][i6];
                        dArr4[i7][i6] = d4 * d3 * dArr3[i5][i6];
                    }
                }
            }
        }
        this.e = dArr;
        this.f = dArr2;
        this.g = dArr4;
    }

    public static o9 i(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return j(Arrays.copyOf(dArr, i + 1));
    }

    private static o9 j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d2 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d3 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d3;
            double d4 = i * d2;
            dArr3[i2] = d4;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d3 + 1.0d;
                dArr3[i3] = d4 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d3 - 1.0d) - d2;
                dArr3[i4] = (d4 - 1.0d) - d2;
            }
        }
        return new o9(dArr3, dArr2);
    }

    private static double k(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 * d3;
        double d9 = d3 * 6.0d;
        double d10 = 6.0d * d8 * d4;
        double d11 = 3.0d * d2;
        double d12 = d11 * d6 * d8;
        return (d2 * d6) + (((d12 + (((d11 * d7) * d8) + ((d10 + ((d9 * d5) + (((-6.0d) * d8) * d5))) - (d9 * d4)))) - (((2.0d * d2) * d7) * d3)) - (((4.0d * d2) * d6) * d3));
    }

    private static double l(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d3 * d3;
        double d9 = d8 * d3;
        double d10 = 3.0d * d8;
        double d11 = d10 * d5;
        double d12 = d2 * d7;
        double d13 = d12 * d9;
        double d14 = d2 * d6;
        return (d14 * d3) + ((((d9 * d14) + (d13 + (((((d9 * 2.0d) * d4) + (d11 + (((-2.0d) * d9) * d5))) - (d10 * d4)) + d4))) - (d12 * d8)) - (((2.0d * d2) * d6) * d8));
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
                double d3 = dArr2[i5] - dArr2[i2];
                double d4 = (d2 - dArr2[i2]) / d3;
                double[][] dArr3 = this.f;
                double d5 = dArr3[i2][i];
                double d6 = dArr3[i5][i];
                double[][] dArr4 = this.g;
                return l(d3, d4, d5, d6, dArr4[i2][i], dArr4[i5][i]);
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
                double d3 = dArr3[i8] - dArr3[i6];
                double d4 = (d2 - dArr3[i6]) / d3;
                while (i < length2) {
                    double[][] dArr4 = this.f;
                    double d5 = dArr4[i6][i];
                    double d6 = dArr4[i8][i];
                    double[][] dArr5 = this.g;
                    dArr[i] = l(d3, d4, d5, d6, dArr5[i6][i], dArr5[i8][i]);
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
                double d3 = dArr2[i8] - dArr2[i6];
                double d4 = (d2 - dArr2[i6]) / d3;
                while (i < length2) {
                    double[][] dArr3 = this.f;
                    double d5 = dArr3[i6][i];
                    double d6 = dArr3[i8][i];
                    double[][] dArr4 = this.g;
                    fArr[i] = (float) l(d3, d4, d5, d6, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // com.p7700g.p99005.f9
    public double f(double d2, int i) {
        double d3;
        double[] dArr = this.e;
        int length = dArr.length;
        int i2 = 0;
        if (d2 < dArr[0]) {
            d3 = dArr[0];
        } else {
            int i3 = length - 1;
            d3 = d2 >= dArr[i3] ? dArr[i3] : d2;
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.e;
            int i4 = i2 + 1;
            if (d3 <= dArr2[i4]) {
                double d4 = dArr2[i4] - dArr2[i2];
                double[][] dArr3 = this.f;
                double d5 = dArr3[i2][i];
                double d6 = dArr3[i4][i];
                double[][] dArr4 = this.g;
                return k(d4, (d3 - dArr2[i2]) / d4, d5, d6, dArr4[i2][i], dArr4[i4][i]) / d4;
            }
            i2 = i4;
        }
        return zg2.s;
    }

    @Override // com.p7700g.p99005.f9
    public void g(double d2, double[] dArr) {
        double d3;
        double[] dArr2 = this.e;
        int length = dArr2.length;
        int length2 = this.f[0].length;
        if (d2 <= dArr2[0]) {
            d3 = dArr2[0];
        } else {
            int i = length - 1;
            d3 = d2 >= dArr2[i] ? dArr2[i] : d2;
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.e;
            int i3 = i2 + 1;
            if (d3 <= dArr3[i3]) {
                double d4 = dArr3[i3] - dArr3[i2];
                double d5 = (d3 - dArr3[i2]) / d4;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f;
                    double d6 = dArr4[i2][i4];
                    double d7 = dArr4[i3][i4];
                    double[][] dArr5 = this.g;
                    dArr[i4] = k(d4, d5, d6, d7, dArr5[i2][i4], dArr5[i3][i4]) / d4;
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