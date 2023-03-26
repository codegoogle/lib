package com.p7700g.p99005;

import java.io.PrintStream;

/* compiled from: SpringStopEngine.java */
/* loaded from: classes.dex */
public class t9 implements v9 {
    private static final double a = Double.MAX_VALUE;
    private double d;
    private double e;
    private double f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    public double b = 0.5d;
    private boolean c = false;
    private int l = 0;

    private void e(double d) {
        double d2 = this.d;
        double d3 = this.b;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.j) * d) * 4.0d)) + 1.0d);
        double d4 = d / sqrt;
        int i = 0;
        while (i < sqrt) {
            float f = this.h;
            double d5 = this.e;
            float f2 = this.i;
            double d6 = d2;
            float f3 = this.j;
            double d7 = d3;
            double d8 = ((((((-d2) * (f - d5)) - (f2 * d3)) / f3) * d4) / 2.0d) + f2;
            double d9 = ((((-((((d4 * d8) / 2.0d) + f) - d5)) * d6) - (d8 * d7)) / f3) * d4;
            float f4 = (float) (f2 + d9);
            this.i = f4;
            float f5 = (float) ((((d9 / 2.0d) + f2) * d4) + f);
            this.h = f5;
            int i2 = this.l;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.h = -f5;
                    this.i = -f4;
                }
                float f6 = this.h;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.h = 2.0f - f6;
                    this.i = -this.i;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    @Override // com.p7700g.p99005.v9
    public float a() {
        return 0.0f;
    }

    @Override // com.p7700g.p99005.v9
    public String b(String str, float f) {
        return null;
    }

    @Override // com.p7700g.p99005.v9
    public float c(float f) {
        return this.i;
    }

    @Override // com.p7700g.p99005.v9
    public boolean d() {
        double d = this.h - this.e;
        double d2 = this.d;
        double d3 = this.i;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.j))) / d2) <= ((double) this.k);
    }

    public float f() {
        double d = this.d;
        return ((float) (((-d) * (this.h - this.e)) - (this.b * this.i))) / this.j;
    }

    public void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(") ");
        G.append(stackTraceElement.getMethodName());
        G.append("() ");
        String sb = G.toString();
        PrintStream printStream = System.out;
        printStream.println(sb + str);
    }

    @Override // com.p7700g.p99005.v9
    public float getInterpolation(float f) {
        e(f - this.g);
        this.g = f;
        return this.h;
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.e = f2;
        this.b = f6;
        this.c = false;
        this.h = f;
        this.f = f3;
        this.d = f5;
        this.j = f4;
        this.k = f7;
        this.l = i;
        this.g = 0.0f;
    }
}