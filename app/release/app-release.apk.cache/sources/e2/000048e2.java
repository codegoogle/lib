package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser.java */
/* loaded from: classes.dex */
public class io0 {
    private static final po0.a a = po0.a.a("nm", "hd", "it");

    private io0() {
    }

    public static cm0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                z = po0Var.j();
            } else if (w != 2) {
                po0Var.A();
            } else {
                po0Var.b();
                while (po0Var.h()) {
                    pl0 a2 = gn0.a(po0Var, ei0Var);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                po0Var.e();
            }
        }
        return new cm0(str, arrayList, z);
    }
}