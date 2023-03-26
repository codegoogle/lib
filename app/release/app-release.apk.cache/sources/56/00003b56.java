package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes.dex */
public class bn0 {
    private static final po0.a a = po0.a.a("a", "p", "s", "rz", "r", ij3.b, "so", "eo", "sk", "sa");
    private static final po0.a b = po0.a.a("k");

    private bn0() {
    }

    private static boolean a(cl0 cl0Var) {
        return cl0Var == null || (cl0Var.c() && cl0Var.b().get(0).d.equals(0.0f, 0.0f));
    }

    private static boolean b(kl0<PointF, PointF> kl0Var) {
        return kl0Var == null || (!(kl0Var instanceof gl0) && kl0Var.c() && kl0Var.b().get(0).d.equals(0.0f, 0.0f));
    }

    private static boolean c(zk0 zk0Var) {
        return zk0Var == null || (zk0Var.c() && ((Float) ((ep0) zk0Var.b().get(0)).d).floatValue() == 0.0f);
    }

    private static boolean d(el0 el0Var) {
        return el0Var == null || (el0Var.c() && ((op0) ((ep0) el0Var.b().get(0)).d).a(1.0f, 1.0f));
    }

    private static boolean e(zk0 zk0Var) {
        return zk0Var == null || (zk0Var.c() && ((Float) ((ep0) zk0Var.b().get(0)).d).floatValue() == 0.0f);
    }

    private static boolean f(zk0 zk0Var) {
        return zk0Var == null || (zk0Var.c() && ((Float) ((ep0) zk0Var.b().get(0)).d).floatValue() == 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jl0 g(po0 po0Var, ei0 ei0Var) throws IOException {
        zk0 f;
        boolean z = false;
        boolean z2 = po0Var.s() == po0.b.BEGIN_OBJECT;
        if (z2) {
            po0Var.d();
        }
        zk0 zk0Var = null;
        cl0 cl0Var = null;
        kl0<PointF, PointF> kl0Var = null;
        el0 el0Var = null;
        zk0 zk0Var2 = null;
        zk0 zk0Var3 = null;
        bl0 bl0Var = null;
        zk0 zk0Var4 = null;
        zk0 zk0Var5 = null;
        while (po0Var.h()) {
            switch (po0Var.w(a)) {
                case 0:
                    po0Var.d();
                    while (po0Var.h()) {
                        if (po0Var.w(b) != 0) {
                            po0Var.z();
                            po0Var.A();
                        } else {
                            cl0Var = zm0.a(po0Var, ei0Var);
                        }
                    }
                    po0Var.f();
                    break;
                case 1:
                    kl0Var = zm0.b(po0Var, ei0Var);
                    break;
                case 2:
                    el0Var = cn0.j(po0Var, ei0Var);
                    break;
                case 3:
                    ei0Var.a("Lottie doesn't support 3D layers.");
                    f = cn0.f(po0Var, ei0Var, z);
                    if (!f.b().isEmpty()) {
                        f.b().add(new ep0(ei0Var, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(ei0Var.f())));
                    } else if (((ep0) f.b().get(0)).d == 0) {
                        f.b().set(0, new ep0(ei0Var, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(ei0Var.f())));
                        zk0Var = f;
                        break;
                    }
                    zk0Var = f;
                case 4:
                    f = cn0.f(po0Var, ei0Var, z);
                    if (!f.b().isEmpty()) {
                    }
                    zk0Var = f;
                    break;
                case 5:
                    bl0Var = cn0.h(po0Var, ei0Var);
                    continue;
                case 6:
                    zk0Var4 = cn0.f(po0Var, ei0Var, z);
                    continue;
                case 7:
                    zk0Var5 = cn0.f(po0Var, ei0Var, z);
                    continue;
                case 8:
                    zk0Var2 = cn0.f(po0Var, ei0Var, z);
                    continue;
                case 9:
                    zk0Var3 = cn0.f(po0Var, ei0Var, z);
                    continue;
                default:
                    po0Var.z();
                    po0Var.A();
                    break;
            }
            z = false;
        }
        if (z2) {
            po0Var.f();
        }
        cl0 cl0Var2 = a(cl0Var) ? null : cl0Var;
        kl0<PointF, PointF> kl0Var2 = b(kl0Var) ? null : kl0Var;
        zk0 zk0Var6 = c(zk0Var) ? null : zk0Var;
        if (d(el0Var)) {
            el0Var = null;
        }
        return new jl0(cl0Var2, kl0Var2, el0Var, zk0Var6, bl0Var, zk0Var4, zk0Var5, f(zk0Var2) ? null : zk0Var2, e(zk0Var3) ? null : zk0Var3);
    }
}