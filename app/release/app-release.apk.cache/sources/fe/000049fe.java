package com.p7700g.p99005;

/* compiled from: VelocityMatrix.java */
/* loaded from: classes.dex */
public class ja {
    private static String a = "VelocityMatrix";
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    public void a(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.d;
        float f8 = f5 + this.e;
        float f9 = (this.b * (f - 0.5f) * 2.0f) + f7;
        float f10 = (this.c * f6) + f8;
        float radians = (float) Math.toRadians(this.g);
        float radians2 = (float) Math.toRadians(this.f);
        double d = radians;
        double sin = Math.sin(d);
        double d2 = i2 * f6;
        double cos = Math.cos(d);
        fArr[0] = (((float) ((sin * ((-i) * f3)) - (Math.cos(d) * d2))) * radians2) + f9;
        fArr[1] = (radians2 * ((float) ((cos * (i * f3)) - (Math.sin(d) * d2)))) + f10;
    }

    public void b() {
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
    }

    public void c(l9 l9Var, float f) {
        if (l9Var != null) {
            this.f = l9Var.c(f);
        }
    }

    public void d(s9 s9Var, float f) {
        if (s9Var != null) {
            this.f = s9Var.c(f);
            this.g = s9Var.a(f);
        }
    }

    public void e(l9 l9Var, l9 l9Var2, float f) {
        if (l9Var != null) {
            this.b = l9Var.c(f);
        }
        if (l9Var2 != null) {
            this.c = l9Var2.c(f);
        }
    }

    public void f(s9 s9Var, s9 s9Var2, float f) {
        if (s9Var != null) {
            this.b = s9Var.c(f);
        }
        if (s9Var2 != null) {
            this.c = s9Var2.c(f);
        }
    }

    public void g(l9 l9Var, l9 l9Var2, float f) {
        if (l9Var != null) {
            this.d = l9Var.c(f);
        }
        if (l9Var2 != null) {
            this.e = l9Var2.c(f);
        }
    }

    public void h(s9 s9Var, s9 s9Var2, float f) {
        if (s9Var != null) {
            this.d = s9Var.c(f);
        }
        if (s9Var2 != null) {
            this.e = s9Var2.c(f);
        }
    }
}