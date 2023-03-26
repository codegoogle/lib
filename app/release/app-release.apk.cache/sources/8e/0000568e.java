package com.p7700g.p99005;

import com.p7700g.p99005.em0;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: GradientStrokeParser.java */
/* loaded from: classes.dex */
public class pn0 {
    private static final po0.a a = po0.a.a("nm", com.anythink.basead.d.g.i, ij3.b, "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final po0.a b = po0.a.a("p", "k");
    private static final po0.a c = po0.a.a("n", com.ironsource.sdk.controller.v.a);

    private pn0() {
    }

    public static sl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        al0 al0Var;
        ArrayList arrayList = new ArrayList();
        String str = null;
        tl0 tl0Var = null;
        al0 al0Var2 = null;
        dl0 dl0Var = null;
        dl0 dl0Var2 = null;
        zk0 zk0Var = null;
        em0.b bVar = null;
        em0.c cVar = null;
        float f = 0.0f;
        zk0 zk0Var2 = null;
        boolean z = false;
        bl0 bl0Var = null;
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
                        if (w != 0) {
                            al0Var = al0Var2;
                            if (w != 1) {
                                po0Var.z();
                                po0Var.A();
                            } else {
                                al0Var2 = cn0.g(po0Var, ei0Var, i);
                            }
                        } else {
                            al0Var = al0Var2;
                            i = po0Var.l();
                        }
                        al0Var2 = al0Var;
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
                    zk0Var = cn0.e(po0Var, ei0Var);
                    break;
                case 7:
                    bVar = em0.b.values()[po0Var.l() - 1];
                    break;
                case 8:
                    cVar = em0.c.values()[po0Var.l() - 1];
                    break;
                case 9:
                    f = (float) po0Var.k();
                    break;
                case 10:
                    z = po0Var.j();
                    break;
                case 11:
                    po0Var.b();
                    while (po0Var.h()) {
                        po0Var.d();
                        String str2 = null;
                        zk0 zk0Var3 = null;
                        while (po0Var.h()) {
                            int w2 = po0Var.w(c);
                            if (w2 != 0) {
                                zk0 zk0Var4 = zk0Var2;
                                if (w2 != 1) {
                                    po0Var.z();
                                    po0Var.A();
                                } else {
                                    zk0Var3 = cn0.e(po0Var, ei0Var);
                                }
                                zk0Var2 = zk0Var4;
                            } else {
                                str2 = po0Var.q();
                            }
                        }
                        zk0 zk0Var5 = zk0Var2;
                        po0Var.f();
                        if (str2.equals(ij3.b)) {
                            zk0Var2 = zk0Var3;
                        } else {
                            if (str2.equals("d") || str2.equals(com.anythink.basead.d.g.i)) {
                                ei0Var.y(true);
                                arrayList.add(zk0Var3);
                            }
                            zk0Var2 = zk0Var5;
                        }
                    }
                    zk0 zk0Var6 = zk0Var2;
                    po0Var.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((zk0) arrayList.get(0));
                    }
                    zk0Var2 = zk0Var6;
                    break;
                default:
                    po0Var.z();
                    po0Var.A();
                    break;
            }
        }
        if (bl0Var == null) {
            bl0Var = new bl0(Collections.singletonList(new ep0(100)));
        }
        return new sl0(str, tl0Var, al0Var2, bl0Var, dl0Var, dl0Var2, zk0Var, bVar, cVar, f, arrayList, zk0Var2, z);
    }
}