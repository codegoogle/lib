package com.anythink.basead.d;

import android.content.Context;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.BaseAdActivity;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes2.dex */
public class g extends b {
    public static final String i = "g";

    public g(Context context, int i2, j jVar) {
        super(context, i2, jVar);
    }

    public final void a(Map<String, Object> map) {
        try {
            if (!c()) {
                com.anythink.basead.e.a aVar = this.g;
                if (aVar != null && (aVar instanceof com.anythink.basead.e.g)) {
                    ((com.anythink.basead.e.g) aVar).onVideoShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.i, com.anythink.basead.c.f.u));
                }
                this.d = null;
                return;
            }
            final String obj = map.get("extra_scenario").toString();
            int intValue = ((Integer) map.get(com.anythink.basead.f.c.j)).intValue();
            final String a = a(this.d);
            com.anythink.core.common.a.g gVar = this.e;
            if (gVar instanceof com.anythink.expressad.reward.b.a) {
                ((com.anythink.expressad.reward.b.a) gVar).a(new com.anythink.expressad.videocommon.d.a() { // from class: com.anythink.basead.d.g.1
                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a(String str) {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a(boolean z, String str, float f) {
                        com.anythink.basead.e.a aVar2;
                        if (z && (aVar2 = g.this.g) != null && (aVar2 instanceof com.anythink.basead.e.g)) {
                            ((com.anythink.basead.e.g) aVar2).onRewarded();
                        }
                        com.anythink.basead.e.a aVar3 = g.this.g;
                        if (aVar3 != null) {
                            aVar3.onAdClosed();
                        }
                        com.anythink.basead.a.c cVar = g.this.f;
                        if (cVar != null) {
                            cVar.c();
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void b(String str) {
                        com.anythink.basead.e.a aVar2 = g.this.g;
                        if (aVar2 != null && (aVar2 instanceof com.anythink.basead.e.g)) {
                            ((com.anythink.basead.e.g) aVar2).onVideoShowFailed(com.anythink.basead.c.f.a(com.anythink.basead.c.f.k, str));
                        }
                        g.this.d = null;
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void c() {
                        com.anythink.basead.e.a aVar2 = g.this.g;
                        if (aVar2 != null) {
                            aVar2.onAdShow();
                        }
                        com.anythink.basead.e.a aVar3 = g.this.g;
                        if (aVar3 != null && (aVar3 instanceof com.anythink.basead.e.g)) {
                            ((com.anythink.basead.e.g) aVar3).onVideoAdPlayStart();
                        }
                        g.this.d = null;
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void d() {
                        com.anythink.basead.e.a aVar2 = g.this.g;
                        if (aVar2 == null || !(aVar2 instanceof com.anythink.basead.e.g)) {
                            return;
                        }
                        ((com.anythink.basead.e.g) aVar2).onVideoAdPlayEnd();
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void e() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void f() {
                    }

                    @Override // com.anythink.expressad.videocommon.d.a
                    public final void a(final com.anythink.expressad.foundation.d.c cVar) {
                        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.basead.d.g.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                g.this.a(cVar, obj);
                            }
                        });
                    }
                });
                ((com.anythink.expressad.reward.b.a) this.e).a("", "", "");
                return;
            }
            com.anythink.basead.e.b.a().a(a, new b.InterfaceC0030b() { // from class: com.anythink.basead.d.g.2
                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a() {
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 != null) {
                        aVar2.onAdShow();
                    }
                    g.this.d = null;
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void b() {
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 == null || !(aVar2 instanceof com.anythink.basead.e.g)) {
                        return;
                    }
                    ((com.anythink.basead.e.g) aVar2).onVideoAdPlayStart();
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void c() {
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 == null || !(aVar2 instanceof com.anythink.basead.e.g)) {
                        return;
                    }
                    ((com.anythink.basead.e.g) aVar2).onVideoAdPlayEnd();
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void d() {
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 == null || !(aVar2 instanceof com.anythink.basead.e.g)) {
                        return;
                    }
                    ((com.anythink.basead.e.g) aVar2).onRewarded();
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void e() {
                    com.anythink.core.common.j.e.a(g.i, "onClose.......");
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 != null) {
                        aVar2.onAdClosed();
                    }
                    com.anythink.basead.e.b.a().b(a);
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a(com.anythink.basead.c.e eVar) {
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 != null && (aVar2 instanceof com.anythink.basead.e.g)) {
                        ((com.anythink.basead.e.g) aVar2).onVideoShowFailed(eVar);
                    }
                    g.this.d = null;
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a(int i2) {
                    com.anythink.core.common.j.e.a(g.i, "onClick.......");
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 != null) {
                        aVar2.onAdClick(i2);
                    }
                }

                @Override // com.anythink.basead.e.b.InterfaceC0030b
                public final void a(boolean z) {
                    com.anythink.core.common.j.e.a(g.i, "onDeeplinkCallback.......:".concat(String.valueOf(z)));
                    com.anythink.basead.e.a aVar2 = g.this.g;
                    if (aVar2 != null) {
                        aVar2.onDeeplinkCallback(z);
                    }
                }
            });
            com.anythink.core.basead.b.a aVar2 = new com.anythink.core.basead.b.a();
            aVar2.c = this.d;
            aVar2.d = a;
            aVar2.a = 1;
            aVar2.h = this.b;
            aVar2.e = intValue;
            aVar2.b = obj;
            BaseAdActivity.a(this.a, aVar2);
        } catch (Exception e) {
            e.printStackTrace();
            com.anythink.basead.e.a aVar3 = this.g;
            if (aVar3 != null && (aVar3 instanceof com.anythink.basead.e.g)) {
                ((com.anythink.basead.e.g) aVar3).onVideoShowFailed(com.anythink.basead.c.f.a("-9999", e.getMessage()));
            }
            this.d = null;
        }
    }

    @Override // com.anythink.basead.d.b
    public final void b() {
        super.b();
        this.g = null;
    }
}