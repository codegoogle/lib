package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* loaded from: classes.dex */
public class do0 {
    private static final po0.a a = po0.a.a("nm", "c", ij3.b, "tr", "hd");

    private do0() {
    }

    public static yl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        String str = null;
        zk0 zk0Var = null;
        zk0 zk0Var2 = null;
        jl0 jl0Var = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                zk0Var = cn0.f(po0Var, ei0Var, false);
            } else if (w == 2) {
                zk0Var2 = cn0.f(po0Var, ei0Var, false);
            } else if (w == 3) {
                jl0Var = bn0.g(po0Var, ei0Var);
            } else if (w != 4) {
                po0Var.A();
            } else {
                z = po0Var.j();
            }
        }
        return new yl0(str, zk0Var, zk0Var2, jl0Var, z);
    }
}