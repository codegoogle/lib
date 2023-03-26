package com.p7700g.p99005;

import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: Easing.java */
/* loaded from: classes.dex */
public class h9 {
    private static final String b = "cubic(0.4, 0.0, 0.2, 1)";
    private static final String c = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String d = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String e = "cubic(1, 1, 0, 0)";
    private static final String f = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String g = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String l = "anticipate";
    private static final String m = "overshoot";
    public String o = "identity";
    public static h9 a = new h9();
    private static final String j = "standard";
    private static final String i = "accelerate";
    private static final String h = "decelerate";
    private static final String k = "linear";
    public static String[] n = {j, i, h, k};

    public static h9 c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new u9(str);
        }
        if (str.startsWith("Schlick")) {
            return new r9(str);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(i)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(h)) {
                    c2 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(l)) {
                    c2 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(k)) {
                    c2 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(m)) {
                    c2 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(j)) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new a(c);
            case 1:
                return new a(d);
            case 2:
                return new a(f);
            case 3:
                return new a(e);
            case 4:
                return new a(g);
            case 5:
                return new a(b);
            default:
                PrintStream printStream = System.err;
                StringBuilder G = wo1.G("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                G.append(Arrays.toString(n));
                printStream.println(G.toString());
                return a;
        }
    }

    public double a(double d2) {
        return d2;
    }

    public double b(double d2) {
        return 1.0d;
    }

    public String toString() {
        return this.o;
    }

    /* compiled from: Easing.java */
    /* loaded from: classes.dex */
    public static class a extends h9 {
        private static double p = 0.01d;
        private static double q = 1.0E-4d;
        public double r;
        public double s;
        public double t;
        public double u;

        public a(String str) {
            this.o = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.r = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.s = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.t = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.u = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        private double d(double d) {
            double d2 = 1.0d - d;
            double d3 = this.r;
            double d4 = d2 * 3.0d * d2 * d3;
            double d5 = this.t;
            return ((1.0d - d5) * 3.0d * d * d) + ((d5 - d3) * d2 * 6.0d * d) + d4;
        }

        private double e(double d) {
            double d2 = 1.0d - d;
            double d3 = this.s;
            double d4 = d2 * 3.0d * d2 * d3;
            double d5 = this.u;
            return ((1.0d - d5) * 3.0d * d * d) + ((d5 - d3) * d2 * 6.0d * d) + d4;
        }

        private double f(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.t * d5) + (this.r * d4) + (d * d * d);
        }

        private double g(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.u * d5) + (this.s * d4) + (d * d * d);
        }

        @Override // com.p7700g.p99005.h9
        public double a(double d) {
            if (d <= zg2.s) {
                return zg2.s;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > p) {
                d2 *= 0.5d;
                d3 = f(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double f = f(d4);
            double d5 = d3 + d2;
            double f2 = f(d5);
            double g = g(d4);
            return (((d - f) * (g(d5) - g)) / (f2 - f)) + g;
        }

        @Override // com.p7700g.p99005.h9
        public double b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > q) {
                d2 *= 0.5d;
                d3 = f(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (g(d5) - g(d4)) / (f(d5) - f(d4));
        }

        public void h(double d, double d2, double d3, double d4) {
            this.r = d;
            this.s = d2;
            this.t = d3;
            this.u = d4;
        }

        public a(double d, double d2, double d3, double d4) {
            h(d, d2, d3, d4);
        }
    }
}