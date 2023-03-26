package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes.dex */
public class eo0 {
    private static final po0.a a = po0.a.a("nm", "r", "hd");

    private eo0() {
    }

    @z1
    public static zl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        boolean z = false;
        String str = null;
        zk0 zk0Var = null;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                zk0Var = cn0.f(po0Var, ei0Var, true);
            } else if (w != 2) {
                po0Var.A();
            } else {
                z = po0Var.j();
            }
        }
        if (z) {
            return null;
        }
        return new zl0(str, zk0Var);
    }
}