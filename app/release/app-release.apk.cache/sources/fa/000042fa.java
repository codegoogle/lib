package com.p7700g.p99005;

import android.util.Pair;

/* compiled from: CoordinatesUtils.java */
/* loaded from: classes3.dex */
public class fr3 {
    public static int a(@z1 pq3 pq3Var, int i) {
        if (pq3Var == null) {
            return 0;
        }
        if (pq3Var.f() == qq3.HORIZONTAL) {
            return g(pq3Var, i);
        }
        return h(pq3Var, i);
    }

    private static int b(@x1 pq3 pq3Var, float f, float f2) {
        int c = pq3Var.c();
        int l = pq3Var.l();
        int r = pq3Var.r();
        int g = pq3Var.g();
        int d = pq3Var.f() == qq3.HORIZONTAL ? pq3Var.d() : pq3Var.u();
        int i = 0;
        int i2 = 0;
        while (i < c) {
            int i3 = (r / 2) + (l * 2) + (i > 0 ? g : g / 2) + i2;
            boolean z = true;
            boolean z2 = f >= ((float) i2) && f <= ((float) i3);
            z = (f2 < 0.0f || f2 > ((float) d)) ? false : false;
            if (z2 && z) {
                return i;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    private static int c(@x1 pq3 pq3Var, int i) {
        int c = pq3Var.c();
        int l = pq3Var.l();
        int r = pq3Var.r();
        int g = pq3Var.g();
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            int i4 = r / 2;
            int i5 = l + i4 + i2;
            if (i == i3) {
                return i5;
            }
            i2 = l + g + i4 + i5;
        }
        return pq3Var.b() == eq3.DROP ? i2 + (l * 2) : i2;
    }

    public static int d(@z1 pq3 pq3Var, float f, float f2) {
        if (pq3Var == null) {
            return -1;
        }
        if (pq3Var.f() != qq3.HORIZONTAL) {
            f2 = f;
            f = f2;
        }
        return b(pq3Var, f, f2);
    }

    public static Pair<Integer, Float> e(@x1 pq3 pq3Var, int i, float f, boolean z) {
        int c = pq3Var.c();
        int p = pq3Var.p();
        if (z) {
            i = (c - 1) - i;
        }
        boolean z2 = false;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = c - 1;
            if (i > i2) {
                i = i2;
            }
        }
        boolean z3 = i > p;
        boolean z4 = !z ? i + 1 >= p : i + (-1) >= p;
        if (z3 || z4) {
            pq3Var.Q(i);
            p = i;
        }
        float f2 = 0.0f;
        if (p == i && f != 0.0f) {
            z2 = true;
        }
        if (z2) {
            i = z ? i - 1 : i + 1;
        } else {
            f = 1.0f - f;
        }
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f >= 0.0f) {
            f2 = f;
        }
        return new Pair<>(Integer.valueOf(i), Float.valueOf(f2));
    }

    private static int f(@x1 pq3 pq3Var) {
        int l = pq3Var.l();
        return pq3Var.b() == eq3.DROP ? l * 3 : l;
    }

    public static int g(@z1 pq3 pq3Var, int i) {
        int f;
        if (pq3Var == null) {
            return 0;
        }
        if (pq3Var.f() == qq3.HORIZONTAL) {
            f = c(pq3Var, i);
        } else {
            f = f(pq3Var);
        }
        return pq3Var.i() + f;
    }

    public static int h(@z1 pq3 pq3Var, int i) {
        int c;
        if (pq3Var == null) {
            return 0;
        }
        if (pq3Var.f() == qq3.HORIZONTAL) {
            c = f(pq3Var);
        } else {
            c = c(pq3Var, i);
        }
        return pq3Var.k() + c;
    }
}