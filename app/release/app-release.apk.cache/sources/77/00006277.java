package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.pu;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class vu implements tu {
    public static final float a = 10000.0f;
    public static final float b = 1500.0f;
    public static final float c = 200.0f;
    public static final float d = 50.0f;
    public static final float e = 0.2f;
    public static final float f = 0.5f;
    public static final float g = 0.75f;
    public static final float h = 1.0f;
    private static final double i = 62.5d;
    private static final double j = Double.MAX_VALUE;
    public double k;
    public double l;
    private boolean m;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private final pu.p t;

    public vu() {
        this.k = Math.sqrt(1500.0d);
        this.l = 0.5d;
        this.m = false;
        this.s = Double.MAX_VALUE;
        this.t = new pu.p();
    }

    private void f() {
        if (this.m) {
            return;
        }
        if (this.s != Double.MAX_VALUE) {
            double d2 = this.l;
            if (d2 > 1.0d) {
                double d3 = this.k;
                this.p = (Math.sqrt((d2 * d2) - 1.0d) * d3) + ((-d2) * d3);
                double d4 = this.l;
                double d5 = this.k;
                this.q = ((-d4) * d5) - (Math.sqrt((d4 * d4) - 1.0d) * d5);
            } else if (d2 >= zg2.s && d2 < 1.0d) {
                this.r = Math.sqrt(1.0d - (d2 * d2)) * this.k;
            }
            this.m = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    @Override // com.p7700g.p99005.tu
    @i2({i2.a.LIBRARY})
    public boolean a(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.o && ((double) Math.abs(f2 - d())) < this.n;
    }

    @Override // com.p7700g.p99005.tu
    @i2({i2.a.LIBRARY})
    public float b(float f2, float f3) {
        float d2 = f2 - d();
        double d3 = this.k;
        return (float) (((-(d3 * d3)) * d2) - (((d3 * 2.0d) * this.l) * f3));
    }

    public float c() {
        return (float) this.l;
    }

    public float d() {
        return (float) this.s;
    }

    public float e() {
        double d2 = this.k;
        return (float) (d2 * d2);
    }

    public vu g(@g1(from = 0.0d) float f2) {
        if (f2 >= 0.0f) {
            this.l = f2;
            this.m = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public vu h(float f2) {
        this.s = f2;
        return this;
    }

    public vu i(@g1(from = 0.0d, fromInclusive = false) float f2) {
        if (f2 > 0.0f) {
            this.k = Math.sqrt(f2);
            this.m = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void j(double d2) {
        double abs = Math.abs(d2);
        this.n = abs;
        this.o = abs * i;
    }

    public pu.p k(double d2, double d3, long j2) {
        double cos;
        double d4;
        f();
        double d5 = j2 / 1000.0d;
        double d6 = d2 - this.s;
        double d7 = this.l;
        if (d7 > 1.0d) {
            double d8 = this.q;
            double d9 = this.p;
            double d10 = d6 - (((d8 * d6) - d3) / (d8 - d9));
            double d11 = ((d6 * d8) - d3) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, this.p * d5) * d11) + (Math.pow(2.718281828459045d, d8 * d5) * d10);
            double d12 = this.q;
            double pow = Math.pow(2.718281828459045d, d12 * d5) * d10 * d12;
            double d13 = this.p;
            cos = (Math.pow(2.718281828459045d, d13 * d5) * d11 * d13) + pow;
        } else if (d7 == 1.0d) {
            double d14 = this.k;
            double d15 = (d14 * d6) + d3;
            double d16 = (d15 * d5) + d6;
            double pow2 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow3 = Math.pow(2.718281828459045d, (-this.k) * d5) * d16;
            double d17 = this.k;
            cos = (Math.pow(2.718281828459045d, (-d17) * d5) * d15) + (pow3 * (-d17));
            d4 = pow2;
        } else {
            double d18 = 1.0d / this.r;
            double d19 = this.k;
            double d20 = ((d7 * d19 * d6) + d3) * d18;
            double sin = ((Math.sin(this.r * d5) * d20) + (Math.cos(this.r * d5) * d6)) * Math.pow(2.718281828459045d, (-d7) * d19 * d5);
            double d21 = this.k;
            double d22 = this.l;
            double d23 = (-d21) * sin * d22;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d24 = this.r;
            double d25 = (-d24) * d6;
            double d26 = this.r;
            cos = (((Math.cos(d26 * d5) * d20 * d26) + (Math.sin(d24 * d5) * d25)) * pow4) + d23;
            d4 = sin;
        }
        pu.p pVar = this.t;
        pVar.a = (float) (d4 + this.s);
        pVar.b = (float) cos;
        return pVar;
    }

    public vu(float f2) {
        this.k = Math.sqrt(1500.0d);
        this.l = 0.5d;
        this.m = false;
        this.s = Double.MAX_VALUE;
        this.t = new pu.p();
        this.s = f2;
    }
}