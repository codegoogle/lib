package com.anythink.expressad.mbbanner.a.c;

import com.anythink.expressad.foundation.h.n;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public class e implements c {
    private static final String a = "e";
    private c b;
    private com.anythink.expressad.d.c c;
    private boolean d = false;

    public e(c cVar, com.anythink.expressad.d.c cVar2) {
        this.c = cVar2;
        this.b = cVar;
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    com.anythink.expressad.d.c cVar = this.c;
                    boolean z = false;
                    if (!list.get(0).y() && cVar != null && cVar.a() != 1.0d) {
                        if (new Random().nextDouble() > cVar.a()) {
                            z = true;
                        }
                    }
                    this.d = z;
                    String str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.d);
                    n.d(str, sb.toString());
                }
            } catch (Exception e) {
                n.b(a, "Exception", e);
            }
        }
        c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void b() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void c() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void d() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(String str) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        c cVar2 = this.b;
        if (cVar2 == null || this.d) {
            return;
        }
        cVar2.a(cVar);
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z) {
        c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.a(cVar, this.d);
        }
    }

    private static boolean a(com.anythink.expressad.d.c cVar, boolean z) {
        if (z || cVar == null || cVar.a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.a();
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(boolean z) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(z);
        }
    }
}