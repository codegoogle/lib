package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.af;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public class he implements Comparable<he> {
    public static final int A = 5;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 2;
    public static String[] E = {"position", "x", "y", "width", "height", "pathRotate"};
    public static final String s = "MotionPaths";
    public static final boolean t = false;
    public static final boolean u = false;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    public h9 F;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int P;
    public int Q;
    public float R;
    public ce S;
    public LinkedHashMap<String, we> T;
    public int U;
    public int V;
    public double[] W;
    public double[] X;
    public int G = 0;
    public float N = Float.NaN;
    public float O = Float.NaN;

    public he() {
        int i = td.a;
        this.P = i;
        this.Q = i;
        this.R = Float.NaN;
        this.S = null;
        this.T = new LinkedHashMap<>();
        this.U = 0;
        this.W = new double[18];
        this.X = new double[18];
    }

    private boolean d(float a, float b) {
        return (Float.isNaN(a) || Float.isNaN(b)) ? Float.isNaN(a) != Float.isNaN(b) : Math.abs(a - b) > 1.0E-6f;
    }

    private static final float w(float sin, float cos, float cx, float cy, float x2, float y2) {
        return (((x2 - cx) * cos) - ((y2 - cy) * sin)) + cx;
    }

    private static final float x(float sin, float cos, float cx, float cy, float x2, float y2) {
        return ((y2 - cy) * cos) + ((x2 - cx) * sin) + cy;
    }

    public void a(af.a c) {
        this.F = h9.c(c.d.r);
        af.c cVar = c.d;
        this.P = cVar.s;
        this.Q = cVar.p;
        this.N = cVar.w;
        this.G = cVar.t;
        this.V = cVar.q;
        this.O = c.c.e;
        this.R = c.e.W0;
        for (String str : c.g.keySet()) {
            we weVar = c.g.get(str);
            if (weVar != null && weVar.n()) {
                this.T.put(str, weVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(@x1 he o) {
        return Float.compare(this.I, o.I);
    }

    public void c(ce toOrbit) {
        toOrbit.A(this.O);
    }

    public void e(he points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean d = d(this.J, points.J);
        boolean d2 = d(this.K, points.K);
        mask[0] = mask[0] | d(this.I, points.I);
        boolean z2 = d | d2 | arcMode;
        mask[1] = mask[1] | z2;
        mask[2] = z2 | mask[2];
        mask[3] = mask[3] | d(this.L, points.L);
        mask[4] = d(this.M, points.M) | mask[4];
    }

    public void f(double[] data, int[] toUse) {
        float[] fArr = {this.I, this.J, this.K, this.L, this.M, this.N};
        int i = 0;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            if (toUse[i2] < 6) {
                data[i] = fArr[toUse[i2]];
                i++;
            }
        }
    }

    public void g(int[] toUse, double[] data, float[] point, int offset) {
        float f = this.L;
        float f2 = this.M;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        point[offset] = f;
        point[offset + 1] = f2;
    }

    public void h(double p, int[] toUse, double[] data, float[] point, int offset) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        for (int i = 0; i < toUse.length; i++) {
            float f5 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f5;
            } else if (i2 == 2) {
                f2 = f5;
            } else if (i2 == 3) {
                f3 = f5;
            } else if (i2 == 4) {
                f4 = f5;
            }
        }
        ce ceVar = this.S;
        if (ceVar != null) {
            float[] fArr = new float[2];
            ceVar.m(p, fArr, new float[2]);
            float f6 = fArr[0];
            float f7 = fArr[1];
            double d = f6;
            double d2 = f;
            double d3 = f2;
            f = (float) (((Math.sin(d3) * d2) + d) - (f3 / 2.0f));
            f2 = (float) ((f7 - (Math.cos(d3) * d2)) - (f4 / 2.0f));
        }
        point[offset] = (f3 / 2.0f) + f + 0.0f;
        point[offset + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public void i(double p, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i = 0; i < toUse.length; i++) {
            float f9 = (float) data[i];
            float f10 = (float) vdata[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f9;
                f5 = f10;
            } else if (i2 == 2) {
                f2 = f9;
                f7 = f10;
            } else if (i2 == 3) {
                f3 = f9;
                f6 = f10;
            } else if (i2 == 4) {
                f4 = f9;
                f8 = f10;
            }
        }
        float f11 = 2.0f;
        float f12 = (f6 / 2.0f) + f5;
        float f13 = (f8 / 2.0f) + f7;
        ce ceVar = this.S;
        if (ceVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            ceVar.m(p, fArr, fArr2);
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d = f;
            double d2 = f2;
            float sin = (float) (((Math.sin(d2) * d) + f14) - (f3 / 2.0f));
            f2 = (float) ((f15 - (Math.cos(d2) * d)) - (f4 / 2.0f));
            double d3 = f5;
            double sin2 = (Math.sin(d2) * d3) + f16;
            double d4 = f7;
            f13 = (float) ((Math.sin(d2) * d4) + (f17 - (Math.cos(d2) * d3)));
            f12 = (float) ((Math.cos(d2) * d4) + sin2);
            f = sin;
            f11 = 2.0f;
        }
        point[0] = (f3 / f11) + f + 0.0f;
        point[1] = (f4 / f11) + f2 + 0.0f;
        velocity[0] = f12;
        velocity[1] = f13;
    }

    public void j(double p, int[] toUse, double[] data, float[] point, int offset) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        for (int i = 0; i < toUse.length; i++) {
            float f5 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f5;
            } else if (i2 == 2) {
                f2 = f5;
            } else if (i2 == 3) {
                f3 = f5;
            } else if (i2 == 4) {
                f4 = f5;
            }
        }
        ce ceVar = this.S;
        if (ceVar != null) {
            float[] fArr = new float[2];
            ceVar.m(p, fArr, new float[2]);
            float f6 = fArr[0];
            float f7 = fArr[1];
            double d = f6;
            double d2 = f;
            double d3 = f2;
            f = (float) (((Math.sin(d3) * d2) + d) - (f3 / 2.0f));
            f2 = (float) ((f7 - (Math.cos(d3) * d2)) - (f4 / 2.0f));
        }
        point[offset] = (f3 / 2.0f) + f + 0.0f;
        point[offset + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public int k(String name, double[] value, int offset) {
        we weVar = this.T.get(name);
        int i = 0;
        if (weVar == null) {
            return 0;
        }
        if (weVar.p() == 1) {
            value[offset] = weVar.k();
            return 1;
        }
        int p = weVar.p();
        float[] fArr = new float[p];
        weVar.l(fArr);
        while (i < p) {
            value[offset] = fArr[i];
            i++;
            offset++;
        }
        return p;
    }

    public int l(String name) {
        we weVar = this.T.get(name);
        if (weVar == null) {
            return 0;
        }
        return weVar.p();
    }

    public void m(int[] toUse, double[] data, float[] path, int offset) {
        float f = this.J;
        float f2 = this.K;
        float f3 = this.L;
        float f4 = this.M;
        for (int i = 0; i < toUse.length; i++) {
            float f5 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f5;
            } else if (i2 == 2) {
                f2 = f5;
            } else if (i2 == 3) {
                f3 = f5;
            } else if (i2 == 4) {
                f4 = f5;
            }
        }
        ce ceVar = this.S;
        if (ceVar != null) {
            float n = ceVar.n();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.S.o() - (Math.cos(d2) * d)) - (f4 / 2.0f));
            f = (float) (((Math.sin(d2) * d) + n) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i3 = offset + 1;
        path[offset] = f + 0.0f;
        int i4 = i3 + 1;
        path[i3] = f2 + 0.0f;
        int i5 = i4 + 1;
        path[i4] = f6 + 0.0f;
        int i6 = i5 + 1;
        path[i5] = f2 + 0.0f;
        int i7 = i6 + 1;
        path[i6] = f6 + 0.0f;
        int i8 = i7 + 1;
        path[i7] = f7 + 0.0f;
        path[i8] = f + 0.0f;
        path[i8 + 1] = f7 + 0.0f;
    }

    public boolean n(String name) {
        return this.T.containsKey(name);
    }

    public void o(xd c, he startTimePoint, he endTimePoint) {
        float f = c.y / 100.0f;
        this.H = f;
        this.G = c.U;
        float f2 = Float.isNaN(c.V) ? f : c.V;
        float f3 = Float.isNaN(c.W) ? f : c.W;
        float f4 = endTimePoint.L;
        float f5 = startTimePoint.L;
        float f6 = f4 - f5;
        float f7 = endTimePoint.M;
        float f8 = startTimePoint.M;
        float f9 = f7 - f8;
        this.I = this.H;
        float f10 = startTimePoint.J;
        float f11 = startTimePoint.K;
        float f12 = ((f4 / 2.0f) + endTimePoint.J) - ((f5 / 2.0f) + f10);
        float f13 = ((f7 / 2.0f) + endTimePoint.K) - ((f8 / 2.0f) + f11);
        float f14 = f6 * f2;
        float f15 = f14 / 2.0f;
        this.J = (int) (((f12 * f) + f10) - f15);
        float f16 = (f13 * f) + f11;
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.K = (int) (f16 - f18);
        this.L = (int) (f5 + f14);
        this.M = (int) (f8 + f17);
        float f19 = Float.isNaN(c.X) ? f : c.X;
        float f20 = Float.isNaN(c.a0) ? 0.0f : c.a0;
        if (!Float.isNaN(c.Y)) {
            f = c.Y;
        }
        float f21 = Float.isNaN(c.Z) ? 0.0f : c.Z;
        this.U = 0;
        this.J = (int) (((f21 * f13) + ((f19 * f12) + startTimePoint.J)) - f15);
        this.K = (int) (((f13 * f) + ((f12 * f20) + startTimePoint.K)) - f18);
        this.F = h9.c(c.S);
        this.P = c.T;
    }

    public void p(xd c, he startTimePoint, he endTimePoint) {
        float f;
        float f2;
        float f3 = c.y / 100.0f;
        this.H = f3;
        this.G = c.U;
        float f4 = Float.isNaN(c.V) ? f3 : c.V;
        float f5 = Float.isNaN(c.W) ? f3 : c.W;
        float f6 = endTimePoint.L - startTimePoint.L;
        float f7 = endTimePoint.M - startTimePoint.M;
        this.I = this.H;
        if (!Float.isNaN(c.X)) {
            f3 = c.X;
        }
        float f8 = startTimePoint.J;
        float f9 = startTimePoint.L;
        float f10 = startTimePoint.K;
        float f11 = startTimePoint.M;
        float f12 = ((endTimePoint.L / 2.0f) + endTimePoint.J) - ((f9 / 2.0f) + f8);
        float f13 = ((endTimePoint.M / 2.0f) + endTimePoint.K) - ((f11 / 2.0f) + f10);
        float f14 = f12 * f3;
        float f15 = (f6 * f4) / 2.0f;
        this.J = (int) ((f8 + f14) - f15);
        float f16 = f3 * f13;
        float f17 = (f7 * f5) / 2.0f;
        this.K = (int) ((f10 + f16) - f17);
        this.L = (int) (f9 + f);
        this.M = (int) (f11 + f2);
        float f18 = Float.isNaN(c.Y) ? 0.0f : c.Y;
        this.U = 1;
        float f19 = (int) ((startTimePoint.J + f14) - f15);
        this.J = f19;
        float f20 = (int) ((startTimePoint.K + f16) - f17);
        this.K = f20;
        this.J = f19 + ((-f13) * f18);
        this.K = f20 + (f12 * f18);
        this.Q = this.Q;
        this.F = h9.c(c.S);
        this.P = c.T;
    }

    public void q(int parentWidth, int parentHeight, xd c, he s2, he e) {
        float min;
        float f;
        float f2 = c.y / 100.0f;
        this.H = f2;
        this.G = c.U;
        this.U = c.b0;
        float f3 = Float.isNaN(c.V) ? f2 : c.V;
        float f4 = Float.isNaN(c.W) ? f2 : c.W;
        float f5 = e.L;
        float f6 = s2.L;
        float f7 = e.M;
        float f8 = s2.M;
        this.I = this.H;
        this.L = (int) (((f5 - f6) * f3) + f6);
        this.M = (int) (((f7 - f8) * f4) + f8);
        int i = c.b0;
        if (i == 1) {
            float f9 = Float.isNaN(c.X) ? f2 : c.X;
            float f10 = e.J;
            float f11 = s2.J;
            this.J = wo1.a(f10, f11, f9, f11);
            if (!Float.isNaN(c.Y)) {
                f2 = c.Y;
            }
            float f12 = e.K;
            float f13 = s2.K;
            this.K = wo1.a(f12, f13, f2, f13);
        } else if (i != 2) {
            float f14 = Float.isNaN(c.X) ? f2 : c.X;
            float f15 = e.J;
            float f16 = s2.J;
            this.J = wo1.a(f15, f16, f14, f16);
            if (!Float.isNaN(c.Y)) {
                f2 = c.Y;
            }
            float f17 = e.K;
            float f18 = s2.K;
            this.K = wo1.a(f17, f18, f2, f18);
        } else {
            if (Float.isNaN(c.X)) {
                float f19 = e.J;
                float f20 = s2.J;
                min = wo1.a(f19, f20, f2, f20);
            } else {
                min = Math.min(f4, f3) * c.X;
            }
            this.J = min;
            if (Float.isNaN(c.Y)) {
                float f21 = e.K;
                float f22 = s2.K;
                f = wo1.a(f21, f22, f2, f22);
            } else {
                f = c.Y;
            }
            this.K = f;
        }
        this.Q = s2.Q;
        this.F = h9.c(c.S);
        this.P = c.T;
    }

    public void r(int parentWidth, int parentHeight, xd c, he startTimePoint, he endTimePoint) {
        float f = c.y / 100.0f;
        this.H = f;
        this.G = c.U;
        float f2 = Float.isNaN(c.V) ? f : c.V;
        float f3 = Float.isNaN(c.W) ? f : c.W;
        float f4 = endTimePoint.L;
        float f5 = startTimePoint.L;
        float f6 = f4 - f5;
        float f7 = endTimePoint.M;
        float f8 = startTimePoint.M;
        float f9 = f7 - f8;
        this.I = this.H;
        float f10 = startTimePoint.J;
        float f11 = startTimePoint.K;
        float f12 = (f4 / 2.0f) + endTimePoint.J;
        float f13 = (f7 / 2.0f) + endTimePoint.K;
        float f14 = f6 * f2;
        this.J = (int) ((((f12 - ((f5 / 2.0f) + f10)) * f) + f10) - (f14 / 2.0f));
        float f15 = f9 * f3;
        this.K = (int) ((((f13 - ((f8 / 2.0f) + f11)) * f) + f11) - (f15 / 2.0f));
        this.L = (int) (f5 + f14);
        this.M = (int) (f8 + f15);
        this.U = 2;
        if (!Float.isNaN(c.X)) {
            this.J = (int) (c.X * ((int) (parentWidth - this.L)));
        }
        if (!Float.isNaN(c.Y)) {
            this.K = (int) (c.Y * ((int) (parentHeight - this.M)));
        }
        this.Q = this.Q;
        this.F = h9.c(c.S);
        this.P = c.T;
    }

    public void s(float x2, float y2, float w2, float h) {
        this.J = x2;
        this.K = y2;
        this.L = w2;
        this.M = h;
    }

    public void t(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < toUse.length; i++) {
            float f5 = (float) deltaData[i];
            double d = data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f5;
            } else if (i2 == 2) {
                f3 = f5;
            } else if (i2 == 3) {
                f2 = f5;
            } else if (i2 == 4) {
                f4 = f5;
            }
        }
        float f6 = f - ((0.0f * f2) / 2.0f);
        float f7 = f3 - ((0.0f * f4) / 2.0f);
        mAnchorDpDt[0] = (((f2 * 1.0f) + f6) * locationX) + ((1.0f - locationX) * f6) + 0.0f;
        mAnchorDpDt[1] = (((f4 * 1.0f) + f7) * locationY) + ((1.0f - locationY) * f7) + 0.0f;
    }

    public void u(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f;
        boolean z2;
        float f2;
        float f3 = this.J;
        float f4 = this.K;
        float f5 = this.L;
        float f6 = this.M;
        if (toUse.length != 0 && this.W.length <= toUse[toUse.length - 1]) {
            int i = toUse[toUse.length - 1] + 1;
            this.W = new double[i];
            this.X = new double[i];
        }
        Arrays.fill(this.W, Double.NaN);
        for (int i2 = 0; i2 < toUse.length; i2++) {
            this.W[toUse[i2]] = data[i2];
            this.X[toUse[i2]] = slope[i2];
        }
        float f7 = Float.NaN;
        int i3 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr = this.W;
            if (i3 >= dArr.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr[i3]);
            double d = zg2.s;
            if (isNaN && (cycle == null || cycle[i3] == zg2.s)) {
                f2 = f7;
            } else {
                if (cycle != null) {
                    d = cycle[i3];
                }
                if (!Double.isNaN(this.W[i3])) {
                    d = this.W[i3] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.X[i3];
                if (i3 == 1) {
                    f7 = f2;
                    f8 = f13;
                    f3 = f12;
                } else if (i3 == 2) {
                    f7 = f2;
                    f9 = f13;
                    f4 = f12;
                } else if (i3 == 3) {
                    f7 = f2;
                    f10 = f13;
                    f5 = f12;
                } else if (i3 == 4) {
                    f7 = f2;
                    f11 = f13;
                    f6 = f12;
                } else if (i3 == 5) {
                    f7 = f12;
                }
                i3++;
            }
            f7 = f2;
            i3++;
        }
        float f14 = f7;
        ce ceVar = this.S;
        if (ceVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            ceVar.m(position, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f3;
            double d3 = f4;
            float sin = (float) (((Math.sin(d3) * d2) + f15) - (f5 / 2.0f));
            float cos = (float) ((f16 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f8;
            double d5 = f9;
            float cos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + f17);
            f = f6;
            float sin2 = (float) ((Math.sin(d3) * d2 * d5) + (f18 - (Math.cos(d3) * d4)));
            if (slope.length >= 2) {
                slope[0] = cos2;
                z2 = true;
                slope[1] = sin2;
            } else {
                z2 = true;
            }
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(sin2, cos2)) + f14));
            }
            f3 = sin;
            f4 = cos;
        } else {
            f = f6;
            z2 = true;
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2((f11 / 2.0f) + f9, (f10 / 2.0f) + f8)) + f14 + 0.0f));
            }
        }
        if (view instanceof sd) {
            ((sd) view).a(f3, f4, f5 + f3, f4 + f);
            return;
        }
        float f19 = f3 + 0.5f;
        int i4 = (int) f19;
        float f20 = f4 + 0.5f;
        int i5 = (int) f20;
        int i6 = (int) (f19 + f5);
        int i7 = (int) (f20 + f);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight()) {
            z2 = false;
        }
        if (z2 || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view.layout(i4, i5, i6, i7);
    }

    public void v(ce mc, he relative) {
        double d = (((this.L / 2.0f) + this.J) - relative.J) - (relative.L / 2.0f);
        double d2 = (((this.M / 2.0f) + this.K) - relative.K) - (relative.M / 2.0f);
        this.S = mc;
        this.J = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.R)) {
            this.K = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.K = (float) Math.toRadians(this.R);
        }
    }

    public he(int parentWidth, int parentHeight, xd c, he startTimePoint, he endTimePoint) {
        int i = td.a;
        this.P = i;
        this.Q = i;
        this.R = Float.NaN;
        this.S = null;
        this.T = new LinkedHashMap<>();
        this.U = 0;
        this.W = new double[18];
        this.X = new double[18];
        if (startTimePoint.Q != td.a) {
            q(parentWidth, parentHeight, c, startTimePoint, endTimePoint);
            return;
        }
        int i2 = c.b0;
        if (i2 == 1) {
            p(c, startTimePoint, endTimePoint);
        } else if (i2 != 2) {
            o(c, startTimePoint, endTimePoint);
        } else {
            r(parentWidth, parentHeight, c, startTimePoint, endTimePoint);
        }
    }
}