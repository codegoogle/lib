package com.p7700g.p99005;

import com.p7700g.p99005.zb;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class fc {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 32;
    public static final int h = 64;
    public static final int i = 128;
    public static final int j = 256;
    public static final int k = 512;
    public static final int l = 1024;
    public static final int m = 257;
    public static boolean[] n = new boolean[3];
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;

    public static void a(ac acVar, i8 i8Var, zb zbVar) {
        zbVar.Z = -1;
        zbVar.a0 = -1;
        zb.b bVar = acVar.H0[0];
        zb.b bVar2 = zb.b.WRAP_CONTENT;
        if (bVar != bVar2 && zbVar.H0[0] == zb.b.MATCH_PARENT) {
            int i2 = zbVar.w0.i;
            int m0 = acVar.m0() - zbVar.y0.i;
            yb ybVar = zbVar.w0;
            ybVar.k = i8Var.u(ybVar);
            yb ybVar2 = zbVar.y0;
            ybVar2.k = i8Var.u(ybVar2);
            i8Var.f(zbVar.w0.k, i2);
            i8Var.f(zbVar.y0.k, m0);
            zbVar.Z = 2;
            zbVar.C1(i2, m0);
        }
        if (acVar.H0[1] == bVar2 || zbVar.H0[1] != zb.b.MATCH_PARENT) {
            return;
        }
        int i3 = zbVar.x0.i;
        int D = acVar.D() - zbVar.z0.i;
        yb ybVar3 = zbVar.x0;
        ybVar3.k = i8Var.u(ybVar3);
        yb ybVar4 = zbVar.z0;
        ybVar4.k = i8Var.u(ybVar4);
        i8Var.f(zbVar.x0.k, i3);
        i8Var.f(zbVar.z0.k, D);
        if (zbVar.T0 > 0 || zbVar.l0() == 8) {
            yb ybVar5 = zbVar.A0;
            ybVar5.k = i8Var.u(ybVar5);
            i8Var.f(zbVar.A0.k, zbVar.T0 + i3);
        }
        zbVar.a0 = 2;
        zbVar.X1(i3, D);
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}