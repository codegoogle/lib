package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: FontCharacterParser.java */
/* loaded from: classes.dex */
public class ln0 {
    private static final po0.a a = po0.a.a("ch", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "w", com.anythink.expressad.foundation.h.h.e, "fFamily", "data");
    private static final po0.a b = po0.a.a("shapes");

    private ln0() {
    }

    public static sk0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        po0Var.d();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                c = po0Var.q().charAt(0);
            } else if (w == 1) {
                d = po0Var.k();
            } else if (w == 2) {
                d2 = po0Var.k();
            } else if (w == 3) {
                str = po0Var.q();
            } else if (w == 4) {
                str2 = po0Var.q();
            } else if (w != 5) {
                po0Var.z();
                po0Var.A();
            } else {
                po0Var.d();
                while (po0Var.h()) {
                    if (po0Var.w(b) != 0) {
                        po0Var.z();
                        po0Var.A();
                    } else {
                        po0Var.b();
                        while (po0Var.h()) {
                            arrayList.add((cm0) gn0.a(po0Var, ei0Var));
                        }
                        po0Var.e();
                    }
                }
                po0Var.f();
            }
        }
        po0Var.f();
        return new sk0(arrayList, c, d, d2, str, str2);
    }
}