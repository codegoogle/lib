package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public class zm0 {
    private static final po0.a a = po0.a.a("k", "x", "y");

    private zm0() {
    }

    public static cl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (po0Var.s() == po0.b.BEGIN_ARRAY) {
            po0Var.b();
            while (po0Var.h()) {
                arrayList.add(yn0.a(po0Var, ei0Var));
            }
            po0Var.e();
            tn0.b(arrayList);
        } else {
            arrayList.add(new ep0(rn0.e(po0Var, cp0.e())));
        }
        return new cl0(arrayList);
    }

    public static kl0<PointF, PointF> b(po0 po0Var, ei0 ei0Var) throws IOException {
        po0Var.d();
        cl0 cl0Var = null;
        zk0 zk0Var = null;
        zk0 zk0Var2 = null;
        boolean z = false;
        while (po0Var.s() != po0.b.END_OBJECT) {
            int w = po0Var.w(a);
            if (w == 0) {
                cl0Var = a(po0Var, ei0Var);
            } else if (w != 1) {
                if (w != 2) {
                    po0Var.z();
                    po0Var.A();
                } else if (po0Var.s() == po0.b.STRING) {
                    po0Var.A();
                    z = true;
                } else {
                    zk0Var2 = cn0.e(po0Var, ei0Var);
                }
            } else if (po0Var.s() == po0.b.STRING) {
                po0Var.A();
                z = true;
            } else {
                zk0Var = cn0.e(po0Var, ei0Var);
            }
        }
        po0Var.f();
        if (z) {
            ei0Var.a("Lottie doesn't support expressions.");
        }
        return cl0Var != null ? cl0Var : new gl0(zk0Var, zk0Var2);
    }
}