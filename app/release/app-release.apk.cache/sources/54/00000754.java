package com.anythink.expressad.advanced.d;

import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.out.o;
import java.util.Random;

/* loaded from: classes2.dex */
public final class d implements com.anythink.expressad.advanced.b.b {
    private static final String a = "NativeAdvancedShowListenerImpl";
    private o b;
    private com.anythink.expressad.foundation.d.c c;
    private boolean d;
    private c e;

    public d(c cVar, o oVar, double d, com.anythink.expressad.foundation.d.c cVar2) {
        this.e = cVar;
        this.b = oVar;
        this.c = cVar2;
        this.d = a(d, cVar2);
    }

    private void g() {
        if (this.b != null) {
            this.b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.d = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=0&allow_skip=");
        stringBuffer.append(this.e.d());
        stringBuffer.append("&");
        o oVar = this.b;
        if (oVar == null || this.d) {
            return;
        }
        oVar.b();
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void b() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void c() {
        o oVar = this.b;
        if (oVar != null) {
            oVar.f();
            c cVar = this.e;
            if (cVar != null) {
                cVar.d = false;
            }
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void d() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void e() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void f() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        o oVar = this.b;
        if (oVar == null || this.d) {
            return;
        }
        oVar.a(cVar);
    }

    private static boolean a(double d, com.anythink.expressad.foundation.d.c cVar) {
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.a c = com.anythink.expressad.d.b.c();
            long m = c.m() * 1000;
            long y = c.y() * 1000;
            n.d(a, "cbp : " + d + " plct : " + y + " plctb : " + m);
            if (cVar != null) {
                if (cVar.a(y, m)) {
                    cVar.d(1);
                    return true;
                }
                cVar.d(0);
            }
            if (cVar == null || cVar.y() || d == 1.0d) {
                return false;
            }
            double nextDouble = new Random().nextDouble();
            StringBuilder sb = new StringBuilder("hit : ");
            sb.append(nextDouble);
            sb.append(" ");
            int i = (nextDouble > d ? 1 : (nextDouble == d ? 0 : -1));
            sb.append(i > 0);
            n.d(a, sb.toString());
            return i > 0;
        } catch (Exception e) {
            n.b(a, "CBPERROR", e);
            return false;
        }
    }
}