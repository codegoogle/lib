package com.p7700g.p99005;

import java.util.Arrays;

/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public class p9 {
    public static String a = "Oscillator";
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public double[] l;
    public String m;
    public o9 n;
    public int o;
    public float[] j = new float[0];
    public double[] k = new double[0];
    public double p = 6.283185307179586d;
    private boolean q = false;

    public void a(double d2, float f2) {
        int length = this.j.length + 1;
        int binarySearch = Arrays.binarySearch(this.k, d2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.k = Arrays.copyOf(this.k, length);
        this.j = Arrays.copyOf(this.j, length);
        this.l = new double[length];
        double[] dArr = this.k;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.k[binarySearch] = d2;
        this.j[binarySearch] = f2;
        this.q = false;
    }

    public double b(double d2) {
        if (d2 <= zg2.s) {
            d2 = 1.0E-5d;
        } else if (d2 >= 1.0d) {
            d2 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.k, d2);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i2 = (-binarySearch) - 1;
            float[] fArr = this.j;
            int i3 = i2 - 1;
            double d3 = fArr[i2] - fArr[i3];
            double[] dArr = this.k;
            double d4 = d3 / (dArr[i2] - dArr[i3]);
            return (fArr[i3] - (d4 * dArr[i3])) + (d2 * d4);
        }
        return zg2.s;
    }

    public double c(double d2) {
        if (d2 < zg2.s) {
            d2 = 0.0d;
        } else if (d2 > 1.0d) {
            d2 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.k, d2);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i2 = (-binarySearch) - 1;
            float[] fArr = this.j;
            int i3 = i2 - 1;
            double d3 = fArr[i2] - fArr[i3];
            double[] dArr = this.k;
            double d4 = d3 / (dArr[i2] - dArr[i3]);
            return ((((d2 * d2) - (dArr[i3] * dArr[i3])) * d4) / 2.0d) + ((d2 - dArr[i3]) * (fArr[i3] - (dArr[i3] * d4))) + this.l[i3];
        }
        return zg2.s;
    }

    public double d(double d2, double d3, double d4) {
        double d5;
        double signum;
        double c2 = c(d2) + d3;
        double b2 = b(d2) + d4;
        switch (this.o) {
            case 1:
                return zg2.s;
            case 2:
                d5 = b2 * 4.0d;
                signum = Math.signum((((c2 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return b2 * 2.0d;
            case 4:
                return (-b2) * 2.0d;
            case 5:
                double d6 = this.p;
                return Math.sin(d6 * c2) * (-d6) * b2;
            case 6:
                return ((((c2 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * b2 * 4.0d;
            case 7:
                return this.n.f(c2 % 1.0d, 0);
            default:
                double d7 = this.p;
                d5 = b2 * d7;
                signum = Math.cos(d7 * c2);
                break;
        }
        return signum * d5;
    }

    public double e(double d2, double d3) {
        double abs;
        double c2 = c(d2) + d3;
        switch (this.o) {
            case 1:
                return Math.signum(0.5d - (c2 % 1.0d));
            case 2:
                abs = Math.abs((((c2 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c2 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c2 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d3 + c2) * this.p);
            case 6:
                double abs2 = 1.0d - Math.abs(((c2 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.n.c(c2 % 1.0d, 0);
            default:
                return Math.sin(this.p * c2);
        }
        return 1.0d - abs;
    }

    public void f() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i2;
        double d2 = 0.0d;
        int i3 = 0;
        while (true) {
            if (i3 >= this.j.length) {
                break;
            }
            d2 += fArr[i3];
            i3++;
        }
        double d3 = 0.0d;
        int i4 = 1;
        while (true) {
            if (i4 >= this.j.length) {
                break;
            }
            double[] dArr = this.k;
            d3 += (dArr[i4] - dArr[i4 - 1]) * ((fArr2[i2] + fArr2[i4]) / 2.0f);
            i4++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr4 = this.j;
            if (i5 >= fArr4.length) {
                break;
            }
            fArr4[i5] = (float) (fArr4[i5] * (d2 / d3));
            i5++;
        }
        this.l[0] = 0.0d;
        int i6 = 1;
        while (true) {
            if (i6 < this.j.length) {
                int i7 = i6 - 1;
                double[] dArr2 = this.k;
                double d4 = dArr2[i6] - dArr2[i7];
                double[] dArr3 = this.l;
                dArr3[i6] = (d4 * ((fArr3[i7] + fArr3[i6]) / 2.0f)) + dArr3[i7];
                i6++;
            } else {
                this.q = true;
                return;
            }
        }
    }

    public void g(int i2, String str) {
        this.o = i2;
        this.m = str;
        if (str != null) {
            this.n = o9.i(str);
        }
    }

    public String toString() {
        StringBuilder G = wo1.G("pos =");
        G.append(Arrays.toString(this.k));
        G.append(" period=");
        G.append(Arrays.toString(this.j));
        return G.toString();
    }
}