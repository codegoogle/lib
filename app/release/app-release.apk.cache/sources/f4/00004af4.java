package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* loaded from: classes.dex */
public class jo0 {
    public static po0.a a = po0.a.a("nm", "ind", "ks", "hd");

    private jo0() {
    }

    public static dm0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        int i = 0;
        String str = null;
        fl0 fl0Var = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                i = po0Var.l();
            } else if (w == 2) {
                fl0Var = cn0.k(po0Var, ei0Var);
            } else if (w != 3) {
                po0Var.A();
            } else {
                z = po0Var.j();
            }
        }
        return new dm0(str, i, fl0Var, z);
    }
}