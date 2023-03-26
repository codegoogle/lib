package com.p7700g.p99005;

import com.p7700g.p99005.aa;

/* compiled from: CustomVariable.java */
/* loaded from: classes.dex */
public class p8 {
    private static final String a = "TransitionLayout";
    public String b;
    private int c;
    private int d;
    private float e;
    private String f;
    public boolean g;

    public p8(p8 p8Var) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = p8Var.b;
        this.c = p8Var.c;
        this.d = p8Var.d;
        this.e = p8Var.e;
        this.f = p8Var.f;
        this.g = p8Var.g;
    }

    private static int b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String c(int i) {
        StringBuilder G = wo1.G("00000000");
        G.append(Integer.toHexString(i));
        String sb = G.toString();
        StringBuilder G2 = wo1.G("#");
        G2.append(sb.substring(sb.length() - 8));
        return G2.toString();
    }

    public static int p(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int a2 = (int) wo1.a(1.0f, f2, f6, 0.5f);
        int i2 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i3 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i4 = (int) (f6 + 0.5f);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0;
                            }
                            return ((i4 << 16) + (a2 << 8) + i2) | sr.t;
                        }
                        return ((i3 << 16) + (a2 << 8) + i4) | sr.t;
                    }
                    return ((a2 << 16) + (i2 << 8) + i4) | sr.t;
                }
                return ((a2 << 16) + (i4 << 8) + i3) | sr.t;
            }
            return ((i2 << 16) + (i4 << 8) + a2) | sr.t;
        }
        return ((i4 << 16) + (i3 << 8) + a2) | sr.t;
    }

    public static int s(float f, float f2, float f3, float f4) {
        int b = b((int) (f * 255.0f));
        int b2 = b((int) (f2 * 255.0f));
        return (b << 16) | (b((int) (f4 * 255.0f)) << 24) | (b2 << 8) | b((int) (f3 * 255.0f));
    }

    public void a(t8 t8Var) {
        int i = this.c;
        switch (i) {
            case 900:
            case aa.b.l /* 902 */:
            case aa.b.p /* 906 */:
                t8Var.J(this.b, i, this.d);
                return;
            case aa.b.k /* 901 */:
            case aa.b.o /* 905 */:
                t8Var.I(this.b, i, this.e);
                return;
            case aa.b.m /* 903 */:
                t8Var.K(this.b, i, this.f);
                return;
            case 904:
                t8Var.L(this.b, i, this.g);
                return;
            default:
                return;
        }
    }

    public p8 d() {
        return new p8(this);
    }

    public boolean e(p8 p8Var) {
        int i;
        if (p8Var == null || (i = this.c) != p8Var.c) {
            return false;
        }
        switch (i) {
            case 900:
            case aa.b.p /* 906 */:
                return this.d == p8Var.d;
            case aa.b.k /* 901 */:
                return this.e == p8Var.e;
            case aa.b.l /* 902 */:
                return this.d == p8Var.d;
            case aa.b.m /* 903 */:
                return this.d == p8Var.d;
            case 904:
                return this.g == p8Var.g;
            case aa.b.o /* 905 */:
                return this.e == p8Var.e;
            default:
                return false;
        }
    }

    public boolean f() {
        return this.g;
    }

    public int g() {
        return this.d;
    }

    public float h() {
        return this.e;
    }

    public int i() {
        return this.d;
    }

    public int j(float[] fArr) {
        int b = b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
        int b2 = b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.b;
    }

    public String l() {
        return this.f;
    }

    public int m() {
        return this.c;
    }

    public float n() {
        switch (this.c) {
            case 900:
                return this.d;
            case aa.b.k /* 901 */:
                return this.e;
            case aa.b.l /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case aa.b.m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                return this.g ? 1.0f : 0.0f;
            case aa.b.o /* 905 */:
                return this.e;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.c) {
            case 900:
                fArr[0] = this.d;
                return;
            case aa.b.k /* 901 */:
                fArr[0] = this.e;
                return;
            case aa.b.l /* 902 */:
                int i = this.d;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case aa.b.m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                fArr[0] = this.g ? 1.0f : 0.0f;
                return;
            case aa.b.o /* 905 */:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i = this.c;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    public int r() {
        return this.c != 902 ? 1 : 4;
    }

    public void t(boolean z) {
        this.g = z;
    }

    public String toString() {
        String B = wo1.B(new StringBuilder(), this.b, ':');
        switch (this.c) {
            case 900:
                StringBuilder G = wo1.G(B);
                G.append(this.d);
                return G.toString();
            case aa.b.k /* 901 */:
                StringBuilder G2 = wo1.G(B);
                G2.append(this.e);
                return G2.toString();
            case aa.b.l /* 902 */:
                StringBuilder G3 = wo1.G(B);
                G3.append(c(this.d));
                return G3.toString();
            case aa.b.m /* 903 */:
                StringBuilder G4 = wo1.G(B);
                G4.append(this.f);
                return G4.toString();
            case 904:
                StringBuilder G5 = wo1.G(B);
                G5.append(Boolean.valueOf(this.g));
                return G5.toString();
            case aa.b.o /* 905 */:
                StringBuilder G6 = wo1.G(B);
                G6.append(this.e);
                return G6.toString();
            default:
                return wo1.t(B, "????");
        }
    }

    public void u(float f) {
        this.e = f;
    }

    public void v(int i) {
        this.d = i;
    }

    public void w(t8 t8Var, float[] fArr) {
        int i = this.c;
        switch (i) {
            case 900:
                t8Var.J(this.b, i, (int) fArr[0]);
                return;
            case aa.b.k /* 901 */:
            case aa.b.o /* 905 */:
                t8Var.I(this.b, i, fArr[0]);
                return;
            case aa.b.l /* 902 */:
                int b = b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                int b2 = b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                t8Var.J(this.b, this.c, (b((int) (fArr[3] * 255.0f)) << 24) | (b << 16) | (b2 << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case aa.b.m /* 903 */:
            case aa.b.p /* 906 */:
                StringBuilder G = wo1.G("unable to interpolate ");
                G.append(this.b);
                throw new RuntimeException(G.toString());
            case 904:
                t8Var.L(this.b, i, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f = str;
    }

    public void y(Object obj) {
        switch (this.c) {
            case 900:
            case aa.b.p /* 906 */:
                this.d = ((Integer) obj).intValue();
                return;
            case aa.b.k /* 901 */:
                this.e = ((Float) obj).floatValue();
                return;
            case aa.b.l /* 902 */:
                this.d = ((Integer) obj).intValue();
                return;
            case aa.b.m /* 903 */:
                this.f = (String) obj;
                return;
            case 904:
                this.g = ((Boolean) obj).booleanValue();
                return;
            case aa.b.o /* 905 */:
                this.e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void z(float[] fArr) {
        switch (this.c) {
            case 900:
            case aa.b.p /* 906 */:
                this.d = (int) fArr[0];
                return;
            case aa.b.k /* 901 */:
            case aa.b.o /* 905 */:
                this.e = fArr[0];
                return;
            case aa.b.l /* 902 */:
                this.d = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case aa.b.m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                this.g = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public p8(String str, int i, String str2) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = str;
        this.c = i;
        this.f = str2;
    }

    public p8(String str, int i, int i2) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = str;
        this.c = i;
        if (i == 901) {
            this.e = i2;
        } else {
            this.d = i2;
        }
    }

    public p8(String str, int i, float f) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = str;
        this.c = i;
        this.e = f;
    }

    public p8(String str, int i, boolean z) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = str;
        this.c = i;
        this.g = z;
    }

    public p8(String str, int i) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = str;
        this.c = i;
    }

    public p8(String str, int i, Object obj) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = str;
        this.c = i;
        y(obj);
    }

    public p8(p8 p8Var, Object obj) {
        this.d = Integer.MIN_VALUE;
        this.e = Float.NaN;
        this.f = null;
        this.b = p8Var.b;
        this.c = p8Var.c;
        y(obj);
    }
}