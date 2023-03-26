package com.p7700g.p99005;

import com.p7700g.p99005.em0;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeStrokeParser.java */
/* loaded from: classes.dex */
public class ko0 {
    private static final po0.a a = po0.a.a("nm", "c", "w", ij3.b, "lc", "lj", "ml", "hd", "d");
    private static final po0.a b = po0.a.a("n", com.ironsource.sdk.controller.v.a);

    private ko0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static em0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        zk0 zk0Var = null;
        yk0 yk0Var = null;
        zk0 zk0Var2 = null;
        em0.b bVar = null;
        em0.c cVar = null;
        float f = 0.0f;
        boolean z = false;
        bl0 bl0Var = null;
        while (po0Var.h()) {
            switch (po0Var.w(a)) {
                case 0:
                    str = po0Var.q();
                    break;
                case 1:
                    yk0Var = cn0.c(po0Var, ei0Var);
                    break;
                case 2:
                    zk0Var2 = cn0.e(po0Var, ei0Var);
                    break;
                case 3:
                    bl0Var = cn0.h(po0Var, ei0Var);
                    break;
                case 4:
                    bVar = em0.b.values()[po0Var.l() - 1];
                    break;
                case 5:
                    cVar = em0.c.values()[po0Var.l() - 1];
                    break;
                case 6:
                    f = (float) po0Var.k();
                    break;
                case 7:
                    z = po0Var.j();
                    break;
                case 8:
                    po0Var.b();
                    while (po0Var.h()) {
                        po0Var.d();
                        String str2 = null;
                        zk0 zk0Var3 = null;
                        while (po0Var.h()) {
                            int w = po0Var.w(b);
                            if (w == 0) {
                                str2 = po0Var.q();
                            } else if (w != 1) {
                                po0Var.z();
                                po0Var.A();
                            } else {
                                zk0Var3 = cn0.e(po0Var, ei0Var);
                            }
                        }
                        po0Var.f();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 103:
                                if (str2.equals(com.anythink.basead.d.g.i)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 111:
                                if (str2.equals(ij3.b)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                ei0Var.y(true);
                                arrayList.add(zk0Var3);
                                break;
                            case 2:
                                zk0Var = zk0Var3;
                                break;
                        }
                    }
                    po0Var.e();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((zk0) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    po0Var.A();
                    break;
            }
        }
        if (bl0Var == null) {
            bl0Var = new bl0(Collections.singletonList(new ep0(100)));
        }
        return new em0(str, zk0Var, arrayList, yk0Var, bl0Var, zk0Var2, bVar, cVar, f, z);
    }
}