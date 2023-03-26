package com.p7700g.p99005;

import android.graphics.Path;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes.dex */
public class ho0 {
    private static final po0.a a = po0.a.a("nm", "c", ij3.b, "fillEnabled", "r", "hd");

    private ho0() {
    }

    public static bm0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        bl0 bl0Var = null;
        String str = null;
        yk0 yk0Var = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                yk0Var = cn0.c(po0Var, ei0Var);
            } else if (w == 2) {
                bl0Var = cn0.h(po0Var, ei0Var);
            } else if (w == 3) {
                z = po0Var.j();
            } else if (w == 4) {
                i = po0Var.l();
            } else if (w != 5) {
                po0Var.z();
                po0Var.A();
            } else {
                z2 = po0Var.j();
            }
        }
        return new bm0(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, yk0Var, bl0Var == null ? new bl0(Collections.singletonList(new ep0(100))) : bl0Var, z2);
    }
}