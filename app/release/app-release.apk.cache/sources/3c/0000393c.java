package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes.dex */
public class an0 {
    private static final po0.a a = po0.a.a("a");
    private static final po0.a b = po0.a.a("fc", com.anythink.expressad.d.a.b.bH, "sw", "t");

    private an0() {
    }

    public static il0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        po0Var.d();
        il0 il0Var = null;
        while (po0Var.h()) {
            if (po0Var.w(a) != 0) {
                po0Var.z();
                po0Var.A();
            } else {
                il0Var = b(po0Var, ei0Var);
            }
        }
        po0Var.f();
        return il0Var == null ? new il0(null, null, null, null) : il0Var;
    }

    private static il0 b(po0 po0Var, ei0 ei0Var) throws IOException {
        po0Var.d();
        yk0 yk0Var = null;
        yk0 yk0Var2 = null;
        zk0 zk0Var = null;
        zk0 zk0Var2 = null;
        while (po0Var.h()) {
            int w = po0Var.w(b);
            if (w == 0) {
                yk0Var = cn0.c(po0Var, ei0Var);
            } else if (w == 1) {
                yk0Var2 = cn0.c(po0Var, ei0Var);
            } else if (w == 2) {
                zk0Var = cn0.e(po0Var, ei0Var);
            } else if (w != 3) {
                po0Var.z();
                po0Var.A();
            } else {
                zk0Var2 = cn0.e(po0Var, ei0Var);
            }
        }
        po0Var.f();
        return new il0(yk0Var, yk0Var2, zk0Var, zk0Var2);
    }
}