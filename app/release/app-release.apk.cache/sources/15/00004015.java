package com.p7700g.p99005;

import java.util.Arrays;

/* compiled from: ArcCurveFit.java */
/* loaded from: classes.dex */
public class e9 extends f9 {
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private final double[] k;
    public a[] l;
    private boolean m = true;

    /* compiled from: ArcCurveFit.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final String a = "Arc";
        private static double[] b = new double[91];
        private static final double c = 0.001d;
        public double[] d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public double q;
        public double r;
        public double s;
        public boolean t;
        public boolean u;

        public a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.u = false;
            this.t = i == 1;
            this.f = d;
            this.g = d2;
            this.l = 1.0d / (d2 - d);
            if (3 == i) {
                this.u = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (!this.u && Math.abs(d7) >= c && Math.abs(d8) >= c) {
                this.d = new double[101];
                boolean z = this.t;
                this.m = d7 * (z ? -1 : 1);
                this.n = d8 * (z ? 1 : -1);
                this.o = z ? d5 : d3;
                this.p = z ? d4 : d6;
                a(d3, d4, d5, d6);
                this.q = this.e * this.l;
                return;
            }
            this.u = true;
            this.h = d3;
            this.i = d5;
            this.j = d4;
            this.k = d6;
            double hypot = Math.hypot(d8, d7);
            this.e = hypot;
            this.q = hypot * this.l;
            double d9 = this.g;
            double d10 = this.f;
            this.o = d7 / (d9 - d10);
            this.p = d8 / (d9 - d10);
        }

        private void a(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = zg2.s;
            double d9 = zg2.s;
            double d10 = zg2.s;
            while (true) {
                if (i >= b.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    b[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.e = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = b;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.d.length) {
                    return;
                }
                double length = i3 / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(b, length);
                if (binarySearch >= 0) {
                    this.d[i3] = binarySearch / (b.length - 1);
                } else if (binarySearch == -1) {
                    this.d[i3] = 0.0d;
                } else {
                    int i4 = -binarySearch;
                    int i5 = i4 - 2;
                    double[] dArr4 = b;
                    this.d[i3] = (((length - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5])) + i5) / (dArr4.length - 1);
                }
                i3++;
            }
        }

        public double b() {
            double d = this.m * this.s;
            double hypot = this.q / Math.hypot(d, (-this.n) * this.r);
            if (this.t) {
                d = -d;
            }
            return d * hypot;
        }

        public double c() {
            double d = this.m * this.s;
            double d2 = (-this.n) * this.r;
            double hypot = this.q / Math.hypot(d, d2);
            return this.t ? (-d2) * hypot : d2 * hypot;
        }

        public double d(double d) {
            return this.o;
        }

        public double e(double d) {
            return this.p;
        }

        public double f(double d) {
            double d2 = (d - this.f) * this.l;
            double d3 = this.h;
            return ((this.i - d3) * d2) + d3;
        }

        public double g(double d) {
            double d2 = (d - this.f) * this.l;
            double d3 = this.j;
            return ((this.k - d3) * d2) + d3;
        }

        public double h() {
            return (this.m * this.r) + this.o;
        }

        public double i() {
            return (this.n * this.s) + this.p;
        }

        public double j(double d) {
            if (d <= zg2.s) {
                return zg2.s;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.d;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            return ((dArr[i + 1] - dArr[i]) * d2) + dArr[i];
        }

        public void k(double d) {
            double j = j((this.t ? this.g - d : d - this.f) * this.l) * 1.5707963267948966d;
            this.r = Math.sin(j);
            this.s = Math.cos(j);
        }
    }

    public e9(int[] iArr, double[] dArr, double[][] dArr2) {
        this.k = dArr;
        this.l = new a[dArr.length - 1];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            a[] aVarArr = this.l;
            if (i2 >= aVarArr.length) {
                return;
            }
            int i5 = iArr[i2];
            if (i5 == 0) {
                i4 = 3;
            } else if (i5 == 1) {
                i3 = 1;
                i4 = 1;
            } else if (i5 == 2) {
                i3 = 2;
                i4 = 2;
            } else if (i5 == 3) {
                i3 = i3 == 1 ? 2 : 1;
                i4 = i3;
            }
            int i6 = i2 + 1;
            aVarArr[i2] = new a(i4, dArr[i2], dArr[i6], dArr2[i2][0], dArr2[i2][1], dArr2[i6][0], dArr2[i6][1]);
            i2 = i6;
        }
    }

    @Override // com.p7700g.p99005.f9
    public double c(double d2, int i2) {
        int i3 = 0;
        if (this.m) {
            a[] aVarArr = this.l;
            if (d2 < aVarArr[0].f) {
                double d3 = aVarArr[0].f;
                double d4 = d2 - aVarArr[0].f;
                if (aVarArr[0].u) {
                    if (i2 == 0) {
                        return (this.l[0].d(d3) * d4) + aVarArr[0].f(d3);
                    }
                    return (this.l[0].e(d3) * d4) + aVarArr[0].g(d3);
                }
                aVarArr[0].k(d3);
                if (i2 == 0) {
                    return (this.l[0].b() * d4) + this.l[0].h();
                }
                return (this.l[0].c() * d4) + this.l[0].i();
            } else if (d2 > aVarArr[aVarArr.length - 1].g) {
                double d5 = aVarArr[aVarArr.length - 1].g;
                double d6 = d2 - d5;
                int length = aVarArr.length - 1;
                if (i2 == 0) {
                    return (this.l[length].d(d5) * d6) + aVarArr[length].f(d5);
                }
                return (this.l[length].e(d5) * d6) + aVarArr[length].g(d5);
            }
        } else {
            a[] aVarArr2 = this.l;
            if (d2 < aVarArr2[0].f) {
                d2 = aVarArr2[0].f;
            } else if (d2 > aVarArr2[aVarArr2.length - 1].g) {
                d2 = aVarArr2[aVarArr2.length - 1].g;
            }
        }
        while (true) {
            a[] aVarArr3 = this.l;
            if (i3 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d2 <= aVarArr3[i3].g) {
                if (aVarArr3[i3].u) {
                    if (i2 == 0) {
                        return aVarArr3[i3].f(d2);
                    }
                    return aVarArr3[i3].g(d2);
                }
                aVarArr3[i3].k(d2);
                if (i2 == 0) {
                    return this.l[i3].h();
                }
                return this.l[i3].i();
            }
            i3++;
        }
    }

    @Override // com.p7700g.p99005.f9
    public void d(double d2, double[] dArr) {
        if (this.m) {
            a[] aVarArr = this.l;
            if (d2 < aVarArr[0].f) {
                double d3 = aVarArr[0].f;
                double d4 = d2 - aVarArr[0].f;
                if (aVarArr[0].u) {
                    dArr[0] = (this.l[0].d(d3) * d4) + aVarArr[0].f(d3);
                    dArr[1] = (this.l[0].e(d3) * d4) + this.l[0].g(d3);
                    return;
                }
                aVarArr[0].k(d3);
                dArr[0] = (this.l[0].b() * d4) + this.l[0].h();
                dArr[1] = (this.l[0].c() * d4) + this.l[0].i();
                return;
            } else if (d2 > aVarArr[aVarArr.length - 1].g) {
                double d5 = aVarArr[aVarArr.length - 1].g;
                double d6 = d2 - d5;
                int length = aVarArr.length - 1;
                if (aVarArr[length].u) {
                    dArr[0] = (this.l[length].d(d5) * d6) + aVarArr[length].f(d5);
                    dArr[1] = (this.l[length].e(d5) * d6) + this.l[length].g(d5);
                    return;
                }
                aVarArr[length].k(d2);
                dArr[0] = (this.l[length].b() * d6) + this.l[length].h();
                dArr[1] = (this.l[length].c() * d6) + this.l[length].i();
                return;
            }
        } else {
            a[] aVarArr2 = this.l;
            if (d2 < aVarArr2[0].f) {
                d2 = aVarArr2[0].f;
            }
            if (d2 > aVarArr2[aVarArr2.length - 1].g) {
                d2 = aVarArr2[aVarArr2.length - 1].g;
            }
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr3 = this.l;
            if (i2 >= aVarArr3.length) {
                return;
            }
            if (d2 <= aVarArr3[i2].g) {
                if (aVarArr3[i2].u) {
                    dArr[0] = aVarArr3[i2].f(d2);
                    dArr[1] = this.l[i2].g(d2);
                    return;
                }
                aVarArr3[i2].k(d2);
                dArr[0] = this.l[i2].h();
                dArr[1] = this.l[i2].i();
                return;
            }
            i2++;
        }
    }

    @Override // com.p7700g.p99005.f9
    public void e(double d2, float[] fArr) {
        if (this.m) {
            a[] aVarArr = this.l;
            if (d2 < aVarArr[0].f) {
                double d3 = aVarArr[0].f;
                double d4 = d2 - aVarArr[0].f;
                if (aVarArr[0].u) {
                    fArr[0] = (float) ((this.l[0].d(d3) * d4) + aVarArr[0].f(d3));
                    fArr[1] = (float) ((this.l[0].e(d3) * d4) + this.l[0].g(d3));
                    return;
                }
                aVarArr[0].k(d3);
                fArr[0] = (float) ((this.l[0].b() * d4) + this.l[0].h());
                fArr[1] = (float) ((this.l[0].c() * d4) + this.l[0].i());
                return;
            } else if (d2 > aVarArr[aVarArr.length - 1].g) {
                double d5 = aVarArr[aVarArr.length - 1].g;
                double d6 = d2 - d5;
                int length = aVarArr.length - 1;
                if (aVarArr[length].u) {
                    fArr[0] = (float) ((this.l[length].d(d5) * d6) + aVarArr[length].f(d5));
                    fArr[1] = (float) ((this.l[length].e(d5) * d6) + this.l[length].g(d5));
                    return;
                }
                aVarArr[length].k(d2);
                fArr[0] = (float) this.l[length].h();
                fArr[1] = (float) this.l[length].i();
                return;
            }
        } else {
            a[] aVarArr2 = this.l;
            if (d2 < aVarArr2[0].f) {
                d2 = aVarArr2[0].f;
            } else if (d2 > aVarArr2[aVarArr2.length - 1].g) {
                d2 = aVarArr2[aVarArr2.length - 1].g;
            }
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr3 = this.l;
            if (i2 >= aVarArr3.length) {
                return;
            }
            if (d2 <= aVarArr3[i2].g) {
                if (aVarArr3[i2].u) {
                    fArr[0] = (float) aVarArr3[i2].f(d2);
                    fArr[1] = (float) this.l[i2].g(d2);
                    return;
                }
                aVarArr3[i2].k(d2);
                fArr[0] = (float) this.l[i2].h();
                fArr[1] = (float) this.l[i2].i();
                return;
            }
            i2++;
        }
    }

    @Override // com.p7700g.p99005.f9
    public double f(double d2, int i2) {
        a[] aVarArr = this.l;
        int i3 = 0;
        if (d2 < aVarArr[0].f) {
            d2 = aVarArr[0].f;
        }
        if (d2 > aVarArr[aVarArr.length - 1].g) {
            d2 = aVarArr[aVarArr.length - 1].g;
        }
        while (true) {
            a[] aVarArr2 = this.l;
            if (i3 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d2 <= aVarArr2[i3].g) {
                if (aVarArr2[i3].u) {
                    if (i2 == 0) {
                        return aVarArr2[i3].d(d2);
                    }
                    return aVarArr2[i3].e(d2);
                }
                aVarArr2[i3].k(d2);
                if (i2 == 0) {
                    return this.l[i3].b();
                }
                return this.l[i3].c();
            }
            i3++;
        }
    }

    @Override // com.p7700g.p99005.f9
    public void g(double d2, double[] dArr) {
        a[] aVarArr = this.l;
        if (d2 < aVarArr[0].f) {
            d2 = aVarArr[0].f;
        } else if (d2 > aVarArr[aVarArr.length - 1].g) {
            d2 = aVarArr[aVarArr.length - 1].g;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.l;
            if (i2 >= aVarArr2.length) {
                return;
            }
            if (d2 <= aVarArr2[i2].g) {
                if (aVarArr2[i2].u) {
                    dArr[0] = aVarArr2[i2].d(d2);
                    dArr[1] = this.l[i2].e(d2);
                    return;
                }
                aVarArr2[i2].k(d2);
                dArr[0] = this.l[i2].b();
                dArr[1] = this.l[i2].c();
                return;
            }
            i2++;
        }
    }

    @Override // com.p7700g.p99005.f9
    public double[] h() {
        return this.k;
    }
}