package com.p7700g.p99005;

/* compiled from: Schlick.java */
/* loaded from: classes.dex */
public class r9 extends h9 {
    private static final boolean p = false;
    public double q;
    public double r;
    public double s;

    public r9(String str) {
        this.o = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.q = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.r = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double d(double d) {
        double d2 = this.r;
        if (d < d2) {
            double d3 = this.q;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * (((d2 - d) * d3) + d));
        }
        double d4 = this.q;
        double d5 = d2 - d;
        return ((d2 - 1.0d) * ((d2 - 1.0d) * d4)) / (((((d2 - d) * (-d4)) - d) + 1.0d) * (((d5 * (-d4)) - d) + 1.0d));
    }

    private double e(double d) {
        double d2 = this.r;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * this.q) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * this.q));
    }

    @Override // com.p7700g.p99005.h9
    public double a(double d) {
        return e(d);
    }

    @Override // com.p7700g.p99005.h9
    public double b(double d) {
        return d(d);
    }
}