package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* loaded from: classes.dex */
public class en0 {
    private static final po0.a a = po0.a.a("nm", "p", "s", "hd", "d");

    private en0() {
    }

    public static ol0 a(po0 po0Var, ei0 ei0Var, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        kl0<PointF, PointF> kl0Var = null;
        dl0 dl0Var = null;
        boolean z2 = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                kl0Var = zm0.b(po0Var, ei0Var);
            } else if (w == 2) {
                dl0Var = cn0.i(po0Var, ei0Var);
            } else if (w == 3) {
                z2 = po0Var.j();
            } else if (w != 4) {
                po0Var.z();
                po0Var.A();
            } else {
                z = po0Var.l() == 3;
            }
        }
        return new ol0(str, kl0Var, dl0Var, z, z2);
    }
}