package com.p7700g.p99005;

import android.graphics.Path;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.Collections;

/* compiled from: GradientFillParser.java */
/* loaded from: classes.dex */
public class on0 {
    private static final po0.a a = po0.a.a("nm", com.anythink.basead.d.g.i, ij3.b, "t", "s", "e", "r", "hd");
    private static final po0.a b = po0.a.a("p", "k");

    private on0() {
    }

    public static rl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        bl0 bl0Var = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        tl0 tl0Var = null;
        al0 al0Var = null;
        dl0 dl0Var = null;
        dl0 dl0Var2 = null;
        boolean z = false;
        while (po0Var.h()) {
            switch (po0Var.w(a)) {
                case 0:
                    str = po0Var.q();
                    break;
                case 1:
                    int i = -1;
                    po0Var.d();
                    while (po0Var.h()) {
                        int w = po0Var.w(b);
                        if (w == 0) {
                            i = po0Var.l();
                        } else if (w != 1) {
                            po0Var.z();
                            po0Var.A();
                        } else {
                            al0Var = cn0.g(po0Var, ei0Var, i);
                        }
                    }
                    po0Var.f();
                    break;
                case 2:
                    bl0Var = cn0.h(po0Var, ei0Var);
                    break;
                case 3:
                    tl0Var = po0Var.l() == 1 ? tl0.LINEAR : tl0.RADIAL;
                    break;
                case 4:
                    dl0Var = cn0.i(po0Var, ei0Var);
                    break;
                case 5:
                    dl0Var2 = cn0.i(po0Var, ei0Var);
                    break;
                case 6:
                    fillType = po0Var.l() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = po0Var.j();
                    break;
                default:
                    po0Var.z();
                    po0Var.A();
                    break;
            }
        }
        return new rl0(str, tl0Var, fillType, al0Var, bl0Var == null ? new bl0(Collections.singletonList(new ep0(100))) : bl0Var, dl0Var, dl0Var2, null, null, z);
    }
}