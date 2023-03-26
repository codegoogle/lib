package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import com.p7700g.p99005.wl0;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes.dex */
public class bo0 {
    private static final po0.a a = po0.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    private bo0() {
    }

    public static wl0 a(po0 po0Var, ei0 ei0Var, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        wl0.a aVar = null;
        zk0 zk0Var = null;
        kl0<PointF, PointF> kl0Var = null;
        zk0 zk0Var2 = null;
        zk0 zk0Var3 = null;
        zk0 zk0Var4 = null;
        zk0 zk0Var5 = null;
        zk0 zk0Var6 = null;
        boolean z2 = false;
        while (po0Var.h()) {
            switch (po0Var.w(a)) {
                case 0:
                    str = po0Var.q();
                    break;
                case 1:
                    aVar = wl0.a.b(po0Var.l());
                    break;
                case 2:
                    zk0Var = cn0.f(po0Var, ei0Var, false);
                    break;
                case 3:
                    kl0Var = zm0.b(po0Var, ei0Var);
                    break;
                case 4:
                    zk0Var2 = cn0.f(po0Var, ei0Var, false);
                    break;
                case 5:
                    zk0Var4 = cn0.e(po0Var, ei0Var);
                    break;
                case 6:
                    zk0Var6 = cn0.f(po0Var, ei0Var, false);
                    break;
                case 7:
                    zk0Var3 = cn0.e(po0Var, ei0Var);
                    break;
                case 8:
                    zk0Var5 = cn0.f(po0Var, ei0Var, false);
                    break;
                case 9:
                    z2 = po0Var.j();
                    break;
                case 10:
                    if (po0Var.l() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    po0Var.z();
                    po0Var.A();
                    break;
            }
        }
        return new wl0(str, aVar, zk0Var, kl0Var, zk0Var2, zk0Var3, zk0Var4, zk0Var5, zk0Var6, z2, z);
    }
}