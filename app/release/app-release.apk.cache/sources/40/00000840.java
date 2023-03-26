package com.anythink.expressad.foundation.g.f;

import android.os.Process;
import com.anythink.expressad.foundation.h.n;

/* loaded from: classes2.dex */
public class h {
    private static final String a = "h";
    private com.anythink.expressad.foundation.g.f.e.a b = new com.anythink.expressad.foundation.g.f.e.b();
    private g c;
    private c d;

    public h(c cVar) {
        this.c = new com.anythink.expressad.foundation.g.f.f.a(this.b, cVar);
        this.d = cVar;
    }

    private void b(i iVar) {
        try {
            this.d.c(iVar);
            if (iVar.f()) {
                iVar.c();
                this.d.b(iVar);
                this.d.a(iVar);
                return;
            }
            this.d.d(iVar);
            this.d.a(iVar, iVar.a(this.c.a(iVar)));
        } catch (com.anythink.expressad.foundation.g.f.a.a e) {
            this.d.a(iVar, i.a(e));
        } catch (Exception e2) {
            String str = a;
            n.d(str, "Unhandled exception " + e2.getMessage());
            this.d.a(iVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public final void a(i iVar) {
        Process.setThreadPriority(10);
        try {
            this.d.c(iVar);
            if (iVar.f()) {
                iVar.c();
                this.d.b(iVar);
                this.d.a(iVar);
                return;
            }
            this.d.d(iVar);
            this.d.a(iVar, iVar.a(this.c.a(iVar)));
        } catch (com.anythink.expressad.foundation.g.f.a.a e) {
            this.d.a(iVar, i.a(e));
        } catch (Exception e2) {
            String str = a;
            n.d(str, "Unhandled exception " + e2.getMessage());
            this.d.a(iVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }
}