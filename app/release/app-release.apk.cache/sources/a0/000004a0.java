package com.anythink.basead.f;

import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.ui.AsseblemSplashAdView;
import com.anythink.basead.ui.BaseSplashAdView;
import com.anythink.basead.ui.SinglePictureSplashAdView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends c {
    public com.anythink.basead.e.a a;
    public BaseSplashAdView k;
    public boolean l;

    public g(Context context, j jVar, String str) {
        super(context, jVar, str, false);
    }

    public final void a(final ViewGroup viewGroup) {
        m.a().a(new Runnable() { // from class: com.anythink.basead.f.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                if (BaseSplashAdView.isSinglePicture(gVar.g, gVar.d.m)) {
                    g gVar2 = g.this;
                    Context context = viewGroup.getContext();
                    g gVar3 = g.this;
                    gVar2.k = new SinglePictureSplashAdView(context, gVar3.d, gVar3.g, gVar3.a);
                } else {
                    g gVar4 = g.this;
                    Context context2 = viewGroup.getContext();
                    g gVar5 = g.this;
                    gVar4.k = new AsseblemSplashAdView(context2, gVar5.d, gVar5.g, gVar5.a);
                }
                g gVar6 = g.this;
                gVar6.k.setDontCountDown(gVar6.l);
                viewGroup.addView(g.this.k);
            }
        });
    }

    @Override // com.anythink.basead.f.a
    public final void a(Map<String, Object> map) {
    }

    public final void b() {
        this.l = true;
    }

    public final void f() {
        this.a = null;
        BaseSplashAdView baseSplashAdView = this.k;
        if (baseSplashAdView != null) {
            baseSplashAdView.destroy();
            this.k = null;
        }
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.a = aVar;
    }

    @Override // com.anythink.basead.f.c, com.anythink.basead.f.a
    public final boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.f.a.a.a(this.c).a(this.g, this.d.m, this.f);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}