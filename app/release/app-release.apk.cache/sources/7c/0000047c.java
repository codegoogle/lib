package com.anythink.basead.d;

import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.ui.AsseblemSplashAdView;
import com.anythink.basead.ui.BaseSplashAdView;
import com.anythink.basead.ui.SinglePictureSplashAdView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.j;

/* loaded from: classes2.dex */
public final class h extends b {
    public BaseSplashAdView i;
    public boolean j;

    public h(Context context, int i, j jVar) {
        super(context, i, jVar);
    }

    public final void a() {
        this.j = true;
    }

    @Override // com.anythink.basead.d.b
    public final void b() {
        BaseSplashAdView baseSplashAdView = this.i;
        if (baseSplashAdView != null) {
            baseSplashAdView.destroy();
            this.i = null;
        }
        com.anythink.core.common.a.g gVar = this.e;
        if (gVar == null || !(gVar instanceof com.anythink.expressad.splash.d.c)) {
            return;
        }
        ((com.anythink.expressad.splash.d.c) gVar).g();
    }

    public final boolean e() {
        return this.e == null;
    }

    public final void a(final ViewGroup viewGroup) {
        if (super.c()) {
            m.a().a(new Runnable() { // from class: com.anythink.basead.d.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    h hVar = h.this;
                    com.anythink.core.common.a.g gVar = hVar.e;
                    if (gVar instanceof com.anythink.expressad.splash.d.c) {
                        ((com.anythink.expressad.splash.d.c) gVar).a(new com.anythink.expressad.out.e() { // from class: com.anythink.basead.d.h.1.1
                            @Override // com.anythink.expressad.out.e
                            public final void a() {
                                com.anythink.basead.e.a aVar = h.this.g;
                                if (aVar != null) {
                                    aVar.onAdShow();
                                }
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void b() {
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void c() {
                                com.anythink.basead.e.a aVar = h.this.g;
                                if (aVar != null) {
                                    aVar.onAdClosed();
                                }
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void d() {
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void e() {
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void f() {
                            }

                            @Override // com.anythink.expressad.out.e
                            public final void a(com.anythink.expressad.foundation.d.c cVar) {
                                com.anythink.basead.a.c cVar2 = h.this.f;
                                if (cVar2 != null) {
                                    com.anythink.basead.d.a.b.a(cVar2.a(), cVar);
                                    com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(h.this.b.d, "");
                                    iVar.g = new com.anythink.basead.c.a();
                                    h.this.f.a(iVar);
                                }
                            }
                        });
                        ((com.anythink.expressad.splash.d.c) h.this.e).a(viewGroup);
                        return;
                    }
                    if (BaseSplashAdView.isSinglePicture(hVar.d, hVar.b.m)) {
                        h hVar2 = h.this;
                        Context context = viewGroup.getContext();
                        h hVar3 = h.this;
                        hVar2.i = new SinglePictureSplashAdView(context, hVar3.b, hVar3.d, hVar3.g);
                    } else {
                        h hVar4 = h.this;
                        Context context2 = viewGroup.getContext();
                        h hVar5 = h.this;
                        hVar4.i = new AsseblemSplashAdView(context2, hVar5.b, hVar5.d, hVar5.g);
                    }
                    h hVar6 = h.this;
                    hVar6.i.setDontCountDown(hVar6.j);
                    viewGroup.addView(h.this.i);
                }
            });
        }
    }
}