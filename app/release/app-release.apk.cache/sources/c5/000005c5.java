package com.anythink.core.common.a;

import com.anythink.core.common.b.m;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private static b b;
    public final String a = b.class.getName();
    private com.anythink.core.common.c.f c;
    private com.anythink.core.common.c.e d;

    private b() {
        if (m.a().e() != null) {
            this.c = com.anythink.core.common.c.f.a(com.anythink.core.common.c.c.a(m.a().e()));
            this.d = com.anythink.core.common.c.e.a(com.anythink.core.common.c.c.a(m.a().e()));
        }
    }

    public final void c(final com.anythink.core.common.e.g gVar) {
        if (gVar.P() == 1) {
            if (gVar.y() != 1 && gVar.y() != 4) {
                String str = this.a;
                com.anythink.core.common.j.e.a(str, "adxOffer.getClickType = " + gVar.y() + ",not need to record install");
                return;
            }
            m.a();
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = b.this.a;
                    com.anythink.core.common.j.e.a(str2, "insertDspOfferInstallRecord dspOfferId:" + gVar.N());
                    e eVar = new e();
                    eVar.a = gVar.M();
                    eVar.b = gVar.N();
                    eVar.c = gVar.w();
                    b.this.d.a(eVar);
                }
            });
            return;
        }
        String str2 = this.a;
        com.anythink.core.common.j.e.a(str2, "adxOffer.getDspInstallIdUploadSwitch() = " + gVar.P() + ",not need to record install");
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    public final void b(final com.anythink.core.common.e.g gVar) {
        String str = this.a;
        com.anythink.core.common.j.e.a(str, "updateDspOfferShowRecord dspOfferId:" + gVar.N());
        m.a();
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = new f();
                fVar.a = gVar.M();
                fVar.b = gVar.N();
                fVar.c = gVar.O();
                fVar.d = 1;
                b.this.c.b(fVar);
            }
        });
    }

    public final void a(final com.anythink.core.common.e.g gVar) {
        String str = this.a;
        com.anythink.core.common.j.e.a(str, "insertDspOfferShowRecord dspOfferId:" + gVar.N());
        m.a();
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = new f();
                fVar.a = gVar.M();
                fVar.b = gVar.N();
                fVar.c = gVar.O();
                fVar.d = 0;
                b.this.c.a(fVar);
            }
        });
    }

    public final void b() {
        com.anythink.core.common.j.e.a(this.a, "clearExpireDspOfferShowRecord");
        m.a();
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.this.c.c();
            }
        });
    }

    public final List<d> a(int i) {
        return this.c.a(i);
    }

    public final List<d> b(int i) {
        return this.d.a(i);
    }
}