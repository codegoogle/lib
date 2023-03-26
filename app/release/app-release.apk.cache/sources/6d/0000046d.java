package com.anythink.basead.d.c;

import com.anythink.basead.d.c;
import com.anythink.basead.d.d;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.x;
import com.anythink.core.common.e.y;

/* loaded from: classes2.dex */
public final class a {
    private static void a(y yVar, c cVar) {
        if (yVar == null || cVar == null) {
            return;
        }
        yVar.s(cVar.a());
        yVar.t(cVar.b());
        yVar.a(cVar.d());
        yVar.n(cVar.c());
        yVar.m(cVar.e());
        yVar.b(cVar.f());
        yVar.l(cVar.g());
        yVar.a(cVar.h());
        yVar.b(cVar.i());
        if (cVar instanceof d) {
            yVar.b(((d) cVar).j());
        }
    }

    public static void a(j jVar, x xVar) {
        k kVar;
        if (jVar == null || xVar == null || (kVar = jVar.m) == null || !(kVar instanceof y)) {
            return;
        }
        k g = xVar.g();
        if (g != null) {
            g.s(kVar.v());
            g.t(kVar.w());
            g.n(kVar.q());
            g.a(kVar.p());
            g.o(kVar.r());
            g.m(kVar.o());
            g.b(kVar.l());
            g.l(kVar.n());
            g.b(kVar.b());
            g.a(kVar.a());
            if (jVar.f == 67) {
                g.b(kVar.B());
            }
            jVar.m = g;
            return;
        }
        xVar.a(jVar.m);
    }
}