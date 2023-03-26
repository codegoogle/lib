package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public class bp0 {
    private static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    private static int f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int g(float f, float f2) {
        return h((int) f, (int) f2);
    }

    private static int h(int i, int i2) {
        return i - (i2 * f(i, i2));
    }

    public static void i(am0 am0Var, Path path) {
        path.reset();
        PointF b = am0Var.b();
        path.moveTo(b.x, b.y);
        a.set(b.x, b.y);
        for (int i = 0; i < am0Var.a().size(); i++) {
            pk0 pk0Var = am0Var.a().get(i);
            PointF a2 = pk0Var.a();
            PointF b2 = pk0Var.b();
            PointF c = pk0Var.c();
            PointF pointF = a;
            if (a2.equals(pointF) && b2.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (am0Var.d()) {
            path.close();
        }
    }

    public static double j(double d, double d2, @g1(from = 0.0d, to = 1.0d) double d3) {
        return ((d2 - d) * d3) + d;
    }

    public static float k(float f, float f2, @g1(from = 0.0d, to = 1.0d) float f3) {
        return wo1.a(f2, f, f3, f);
    }

    public static int l(int i, int i2, @g1(from = 0.0d, to = 1.0d) float f) {
        return (int) ((f * (i2 - i)) + i);
    }

    public static void m(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2, gj0 gj0Var) {
        if (tk0Var.c(gj0Var.getName(), i)) {
            list.add(tk0Var2.a(gj0Var.getName()).j(gj0Var));
        }
    }
}