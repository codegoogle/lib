package com.anythink.basead.d;

import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.BannerAdView;
import com.anythink.core.common.e.j;
import com.anythink.expressad.out.TemplateBannerView;

/* loaded from: classes2.dex */
public final class a extends b {
    private final String i;
    private com.anythink.expressad.out.h j;

    public a(Context context, int i, j jVar) {
        super(context, i, jVar);
        this.i = a.class.getSimpleName();
        this.j = new com.anythink.expressad.out.h() { // from class: com.anythink.basead.d.a.1
            @Override // com.anythink.expressad.out.h
            public final void a() {
            }

            @Override // com.anythink.expressad.out.h
            public final void a(final com.anythink.expressad.foundation.d.c cVar) {
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.basead.d.a.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(cVar, "");
                    }
                });
            }

            @Override // com.anythink.expressad.out.h
            public final void a(String str) {
            }

            @Override // com.anythink.expressad.out.h
            public final void b() {
                com.anythink.basead.e.a aVar = a.this.g;
                if (aVar != null) {
                    aVar.onAdShow();
                }
            }

            @Override // com.anythink.expressad.out.h
            public final void c() {
            }

            @Override // com.anythink.expressad.out.h
            public final void d() {
            }

            @Override // com.anythink.expressad.out.h
            public final void e() {
            }

            @Override // com.anythink.expressad.out.h
            public final void f() {
                com.anythink.basead.e.a aVar = a.this.g;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
            }
        };
    }

    public final View a() {
        com.anythink.core.common.a.g gVar = this.e;
        if ((gVar instanceof TemplateBannerView) && gVar != null) {
            ((TemplateBannerView) gVar).setBannerAdListener(this.j);
            return (TemplateBannerView) this.e;
        } else if (super.c()) {
            return new BannerAdView(this.a, this.b, this.d, this.g);
        } else {
            return null;
        }
    }

    @Override // com.anythink.basead.d.b
    public final void b() {
        super.b();
        com.anythink.core.common.a.g gVar = this.e;
        if (gVar instanceof TemplateBannerView) {
            ((TemplateBannerView) gVar).release();
        }
        this.e = null;
        this.g = null;
    }
}