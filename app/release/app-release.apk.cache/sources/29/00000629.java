package com.anythink.core.common;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.e.af;

/* loaded from: classes2.dex */
public final class d {
    public com.anythink.core.common.e.e a;
    public af b;
    public long c;
    public ATBaseAdAdapter d;
    public int e;
    public Runnable f;
    public Runnable g;
    public boolean h;
    public boolean i;
    private Boolean j;

    private d(int i) {
        this.e = i;
    }

    private void a(com.anythink.core.common.e.e eVar) {
        this.a = eVar;
    }

    private boolean b() {
        return this.j != null;
    }

    private com.anythink.core.common.e.e c() {
        return this.a;
    }

    private long d() {
        return this.c;
    }

    private void e() {
        this.d = null;
    }

    private int f() {
        return this.e;
    }

    private void g() {
        if (this.f != null) {
            com.anythink.core.common.b.m.a().b(this.f);
            this.f = null;
        }
        if (this.g != null) {
            com.anythink.core.common.b.m.a().b(this.g);
            this.g = null;
        }
    }

    private void h() {
        if (this.f != null) {
            com.anythink.core.common.b.m.a().b(this.f);
            this.f = null;
        }
    }

    private void i() {
        if (this.g != null) {
            com.anythink.core.common.b.m.a().b(this.g);
            this.g = null;
        }
    }

    private Boolean j() {
        return this.j;
    }

    private boolean k() {
        return this.h || this.i;
    }

    private af l() {
        return this.b;
    }

    private void a(long j) {
        this.c = j;
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.d = aTBaseAdAdapter;
    }

    private void a(long j, final Runnable runnable, long j2, final Runnable runnable2) {
        if (j != -1 && runnable != null) {
            this.f = new Runnable() { // from class: com.anythink.core.common.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (d.this) {
                        d.this.i = true;
                        runnable.run();
                    }
                }
            };
            com.anythink.core.common.b.m.a().a(this.f, j);
        }
        if (j2 == -1 || runnable2 == null) {
            return;
        }
        this.g = new Runnable() { // from class: com.anythink.core.common.d.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (d.this) {
                    d.this.h = true;
                    runnable2.run();
                }
            }
        };
        com.anythink.core.common.b.m.a().a(this.g, j2);
    }

    private void a(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    private void a(af afVar) {
        this.b = afVar;
    }

    private boolean a() {
        if (this.j != null) {
            if (this.h || this.i) {
                return false;
            }
        }
        return true;
    }
}