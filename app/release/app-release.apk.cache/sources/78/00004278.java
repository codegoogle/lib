package com.p7700g.p99005;

import android.graphics.Color;
import java.util.Objects;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class fj {
    private static final double a = 95.047d;
    private static final double b = 100.0d;
    private static final double c = 108.883d;
    private static final double d = 0.008856d;
    private static final double e = 903.3d;
    private static final int f = 10;
    private static final int g = 1;
    private static final ThreadLocal<double[]> h = new ThreadLocal<>();

    /* compiled from: ColorUtils.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Color a(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = (1.0f - alpha) * color2.alpha();
                int componentCount = color2.getComponentCount() - 1;
                components2[componentCount] = alpha + alpha2;
                if (components2[componentCount] > 0.0f) {
                    alpha /= components2[componentCount];
                    alpha2 /= components2[componentCount];
                }
                for (int i = 0; i < componentCount; i++) {
                    components2[i] = (components2[i] * alpha2) + (components[i] * alpha);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            StringBuilder G = wo1.G("Color models must match (");
            G.append(color.getModel());
            G.append(" vs. ");
            G.append(color2.getModel());
            G.append(")");
            throw new IllegalArgumentException(G.toString());
        }
    }

    private fj() {
    }

    private static double A(double d2) {
        return d2 > d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * e) + 16.0d) / 116.0d;
    }

    @w0
    public static int B(@w0 int i, @p1(from = 0, to = 255) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & sr.s) | (i2 << 24);
    }

    @w0
    public static int a(@x1 float[] fArr) {
        int round;
        int round2;
        int round3;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float abs = (1.0f - Math.abs((f4 * 2.0f) - 1.0f)) * f3;
        float f5 = f4 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f2) / 60) {
            case 0:
                round = Math.round((abs + f5) * 255.0f);
                round2 = Math.round((abs2 + f5) * 255.0f);
                round3 = Math.round(f5 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f5) * 255.0f);
                round2 = Math.round((abs + f5) * 255.0f);
                round3 = Math.round(f5 * 255.0f);
                break;
            case 2:
                round = Math.round(f5 * 255.0f);
                round2 = Math.round((abs + f5) * 255.0f);
                round3 = Math.round((abs2 + f5) * 255.0f);
                break;
            case 3:
                round = Math.round(f5 * 255.0f);
                round2 = Math.round((abs2 + f5) * 255.0f);
                round3 = Math.round((abs + f5) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f5) * 255.0f);
                round2 = Math.round(f5 * 255.0f);
                round3 = Math.round((abs + f5) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f5) * 255.0f);
                round2 = Math.round(f5 * 255.0f);
                round3 = Math.round((abs2 + f5) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(x(round, 0, 255), x(round2, 0, 255), x(round3, 0, 255));
    }

    @w0
    public static int b(@g1(from = 0.0d, to = 100.0d) double d2, @g1(from = -128.0d, to = 127.0d) double d3, @g1(from = -128.0d, to = 127.0d) double d4) {
        double[] z = z();
        c(d2, d3, d4, z);
        return g(z[0], z[1], z[2]);
    }

    public static void c(@g1(from = 0.0d, to = 100.0d) double d2, @g1(from = -128.0d, to = 127.0d) double d3, @g1(from = -128.0d, to = 127.0d) double d4, @x1 double[] dArr) {
        double d5 = (d2 + 16.0d) / 116.0d;
        double d6 = (d3 / 500.0d) + d5;
        double d7 = d5 - (d4 / 200.0d);
        double pow = Math.pow(d6, 3.0d);
        if (pow <= d) {
            pow = ((d6 * 116.0d) - 16.0d) / e;
        }
        double pow2 = d2 > 7.9996247999999985d ? Math.pow(d5, 3.0d) : d2 / e;
        double pow3 = Math.pow(d7, 3.0d);
        if (pow3 <= d) {
            pow3 = ((d7 * 116.0d) - 16.0d) / e;
        }
        dArr[0] = pow * a;
        dArr[1] = pow2 * b;
        dArr[2] = pow3 * c;
    }

    public static void d(@p1(from = 0, to = 255) int i, @p1(from = 0, to = 255) int i2, @p1(from = 0, to = 255) int i3, @x1 float[] fArr) {
        float f2;
        float abs;
        float f3 = i / 255.0f;
        float f4 = i2 / 255.0f;
        float f5 = i3 / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            abs = 0.0f;
        } else {
            f2 = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            abs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = w(f8, 0.0f, 360.0f);
        fArr[1] = w(abs, 0.0f, 1.0f);
        fArr[2] = w(f7, 0.0f, 1.0f);
    }

    public static void e(@p1(from = 0, to = 255) int i, @p1(from = 0, to = 255) int i2, @p1(from = 0, to = 255) int i3, @x1 double[] dArr) {
        f(i, i2, i3, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@p1(from = 0, to = 255) int i, @p1(from = 0, to = 255) int i2, @p1(from = 0, to = 255) int i3, @x1 double[] dArr) {
        if (dArr.length == 3) {
            double d2 = i / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = i2 / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = i3 / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * b;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * b;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * b;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @w0
    public static int g(@g1(from = 0.0d, to = 95.047d) double d2, @g1(from = 0.0d, to = 100.0d) double d3, @g1(from = 0.0d, to = 108.883d) double d4) {
        double d5 = (((-0.4986d) * d4) + (((-1.5372d) * d3) + (3.2406d * d2))) / b;
        double d6 = ((0.0415d * d4) + ((1.8758d * d3) + ((-0.9689d) * d2))) / b;
        double d7 = ((1.057d * d4) + (((-0.204d) * d3) + (0.0557d * d2))) / b;
        return Color.rgb(x((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@g1(from = 0.0d, to = 95.047d) double d2, @g1(from = 0.0d, to = 100.0d) double d3, @g1(from = 0.0d, to = 108.883d) double d4, @x1 double[] dArr) {
        if (dArr.length == 3) {
            double A = A(d2 / a);
            double A2 = A(d3 / b);
            double A3 = A(d4 / c);
            dArr[0] = Math.max((double) zg2.s, (116.0d * A2) - 16.0d);
            dArr[1] = (A - A2) * 500.0d;
            dArr[2] = (A2 - A3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @w0
    public static int i(@w0 int i, @w0 int i2, @g1(from = 0.0d, to = 1.0d) float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), (int) ((Color.red(i2) * f2) + (Color.red(i) * f3)), (int) ((Color.green(i2) * f2) + (Color.green(i) * f3)), (int) ((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static void j(@x1 float[] fArr, @x1 float[] fArr2, @g1(from = 0.0d, to = 1.0d) float f2, @x1 float[] fArr3) {
        if (fArr3.length == 3) {
            float f3 = 1.0f - f2;
            fArr3[0] = o(fArr[0], fArr2[0], f2);
            fArr3[1] = (fArr2[1] * f2) + (fArr[1] * f3);
            fArr3[2] = (fArr2[2] * f2) + (fArr[2] * f3);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void k(@x1 double[] dArr, @x1 double[] dArr2, @g1(from = 0.0d, to = 1.0d) double d2, @x1 double[] dArr3) {
        if (dArr3.length == 3) {
            double d3 = 1.0d - d2;
            dArr3[0] = (dArr2[0] * d2) + (dArr[0] * d3);
            dArr3[1] = (dArr2[1] * d2) + (dArr[1] * d3);
            dArr3[2] = (dArr2[2] * d2) + (dArr[2] * d3);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    public static double l(@w0 int i, @w0 int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = t(i, i2);
            }
            double m = m(i) + 0.05d;
            double m2 = m(i2) + 0.05d;
            return Math.max(m, m2) / Math.min(m, m2);
        }
        StringBuilder G = wo1.G("background can not be translucent: #");
        G.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(G.toString());
    }

    @g1(from = zg2.s, to = 1.0d)
    public static double m(@w0 int i) {
        double[] z = z();
        r(i, z);
        return z[1] / b;
    }

    public static int n(@w0 int i, @w0 int i2, float f2) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d2 = f2;
            if (l(B(i, 255), i2) < d2) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (l(B(i, i6), i2) < d2) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder G = wo1.G("background can not be translucent: #");
        G.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(G.toString());
    }

    @r2
    public static float o(float f2, float f3, float f4) {
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > f2) {
                f2 += 360.0f;
            } else {
                f3 += 360.0f;
            }
        }
        return (((f3 - f2) * f4) + f2) % 360.0f;
    }

    public static void p(@w0 int i, @x1 float[] fArr) {
        d(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void q(@w0 int i, @x1 double[] dArr) {
        e(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static void r(@w0 int i, @x1 double[] dArr) {
        f(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    private static int s(int i, int i2) {
        return 255 - (((255 - i) * (255 - i2)) / 255);
    }

    public static int t(@w0 int i, @w0 int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int s = s(alpha2, alpha);
        return Color.argb(s, v(Color.red(i), alpha2, Color.red(i2), alpha, s), v(Color.green(i), alpha2, Color.green(i2), alpha, s), v(Color.blue(i), alpha2, Color.blue(i2), alpha, s));
    }

    @e2(26)
    @x1
    public static Color u(@x1 Color color, @x1 Color color2) {
        return a.a(color, color2);
    }

    private static int v(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    private static float w(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : Math.min(f2, f4);
    }

    private static int x(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    public static double y(@x1 double[] dArr, @x1 double[] dArr2) {
        double pow = Math.pow(dArr[0] - dArr2[0], 2.0d);
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + pow);
    }

    private static double[] z() {
        ThreadLocal<double[]> threadLocal = h;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}