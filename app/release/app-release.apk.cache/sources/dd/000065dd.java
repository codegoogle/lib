package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import com.p7700g.p99005.vl0;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* loaded from: classes.dex */
public class xn0 {
    private static final po0.a a = po0.a.a("nm", "mm", "hd");

    private xn0() {
    }

    public static vl0 a(po0 po0Var) throws IOException {
        String str = null;
        vl0.a aVar = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                aVar = vl0.a.b(po0Var.l());
            } else if (w != 2) {
                po0Var.z();
                po0Var.A();
            } else {
                z = po0Var.j();
            }
        }
        return new vl0(str, aVar, z);
    }
}