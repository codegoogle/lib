package com.anythink.expressad.splash.d;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements com.anythink.expressad.splash.b.c {
    private com.anythink.expressad.out.d a;
    private c b;
    private String c;
    private String d;

    public b(c cVar) {
        this.b = cVar;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        this.a = dVar;
    }

    public final void b(String str) {
        this.d = str;
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(com.anythink.expressad.foundation.d.c cVar, int i) {
        c cVar2;
        c cVar3 = this.b;
        if (cVar3 == null || !cVar3.a() || cVar == null) {
            return;
        }
        com.anythink.expressad.out.d dVar = this.a;
        if (dVar != null) {
            dVar.a();
        }
        this.b.b();
        new ArrayList().add(cVar);
        if (i != 2 || (cVar2 = this.b) == null) {
            return;
        }
        cVar2.a(cVar, true);
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(String str) {
        c cVar = this.b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        com.anythink.expressad.out.d dVar = this.a;
        if (dVar != null) {
            dVar.a(str);
        }
        this.b.b();
    }

    private void a() {
        if (this.a != null) {
            this.a = null;
        }
    }
}