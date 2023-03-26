package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes.dex */
public class co0 {
    private static final po0.a a = po0.a.a("nm", "p", "s", "r", "hd");

    private co0() {
    }

    public static xl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        String str = null;
        kl0<PointF, PointF> kl0Var = null;
        dl0 dl0Var = null;
        zk0 zk0Var = null;
        boolean z = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                kl0Var = zm0.b(po0Var, ei0Var);
            } else if (w == 2) {
                dl0Var = cn0.i(po0Var, ei0Var);
            } else if (w == 3) {
                zk0Var = cn0.e(po0Var, ei0Var);
            } else if (w != 4) {
                po0Var.A();
            } else {
                z = po0Var.j();
            }
        }
        return new xl0(str, kl0Var, dl0Var, zk0Var, z);
    }
}