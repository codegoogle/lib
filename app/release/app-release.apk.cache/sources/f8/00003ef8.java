package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: BlurEffectParser.java */
/* loaded from: classes.dex */
public class dn0 {
    private static final po0.a a = po0.a.a("ef");
    private static final po0.a b = po0.a.a("ty", com.ironsource.sdk.controller.v.a);

    @z1
    private static nl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        po0Var.d();
        nl0 nl0Var = null;
        while (true) {
            boolean z = false;
            while (po0Var.h()) {
                int w = po0Var.w(b);
                if (w != 0) {
                    if (w != 1) {
                        po0Var.z();
                        po0Var.A();
                    } else if (z) {
                        nl0Var = new nl0(cn0.e(po0Var, ei0Var));
                    } else {
                        po0Var.A();
                    }
                } else if (po0Var.l() == 0) {
                    z = true;
                }
            }
            po0Var.f();
            return nl0Var;
        }
    }

    @z1
    public static nl0 b(po0 po0Var, ei0 ei0Var) throws IOException {
        nl0 nl0Var = null;
        while (po0Var.h()) {
            if (po0Var.w(a) != 0) {
                po0Var.z();
                po0Var.A();
            } else {
                po0Var.b();
                while (po0Var.h()) {
                    nl0 a2 = a(po0Var, ei0Var);
                    if (a2 != null) {
                        nl0Var = a2;
                    }
                }
                po0Var.e();
            }
        }
        return nl0Var;
    }
}