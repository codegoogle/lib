package com.p7700g.p99005;

import com.p7700g.p99005.fm0;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes.dex */
public class lo0 {
    private static final po0.a a = po0.a.a("s", "e", ij3.b, "nm", com.anythink.expressad.d.a.b.dH, "hd");

    private lo0() {
    }

    public static fm0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        String str = null;
        fm0.a aVar = null;
        zk0 zk0Var = null;
        zk0 zk0Var2 = null;
        zk0 zk0Var3 = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                zk0Var = cn0.f(po0Var, ei0Var, false);
            } else if (w == 1) {
                zk0Var2 = cn0.f(po0Var, ei0Var, false);
            } else if (w == 2) {
                zk0Var3 = cn0.f(po0Var, ei0Var, false);
            } else if (w == 3) {
                str = po0Var.q();
            } else if (w == 4) {
                aVar = fm0.a.b(po0Var.l());
            } else if (w != 5) {
                po0Var.A();
            } else {
                z = po0Var.j();
            }
        }
        return new fm0(str, aVar, zk0Var, zk0Var2, zk0Var3, z);
    }
}