package com.anythink.basead.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.a.c;
import com.anythink.basead.ui.MediaAdView;
import com.anythink.basead.ui.OwnNativeAdView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.w;
import com.anythink.core.common.e.x;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.out.o;
import java.util.List;

/* loaded from: classes2.dex */
public final class i {
    public Context a;
    public com.anythink.basead.e.a b;
    public com.anythink.core.common.j.a.c c;
    public com.anythink.basead.a.c d;
    public View e;
    public boolean f;
    public x g;
    public j h;
    public boolean i;
    public String j;
    public com.anythink.expressad.advanced.d.c k;
    public View.OnClickListener l = new View.OnClickListener() { // from class: com.anythink.basead.d.i.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (i.this.o != null) {
                Context applicationContext = view.getContext().getApplicationContext();
                i iVar = i.this;
                if (iVar.d == null) {
                    iVar.d = new com.anythink.basead.a.c(applicationContext, iVar.h, iVar.g);
                    i.this.d.a(new c.a() { // from class: com.anythink.basead.d.i.1.1
                        @Override // com.anythink.basead.a.c.a
                        public final void a() {
                            com.anythink.basead.e.a aVar = i.this.b;
                            if (aVar != null) {
                                aVar.onAdClick(1);
                            }
                        }

                        @Override // com.anythink.basead.a.c.a
                        public final void b() {
                        }

                        @Override // com.anythink.basead.a.c.a
                        public final void a(boolean z) {
                            com.anythink.basead.e.a aVar = i.this.b;
                            if (aVar != null) {
                                aVar.onDeeplinkCallback(z);
                            }
                        }
                    });
                }
                com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i(i.this.h.d, "");
                iVar2.f = i.this.o.getHeight();
                iVar2.e = i.this.o.getWidth();
                iVar2.g = i.this.o.getAdClickRecord();
                i.this.d.a(iVar2);
            }
        }
    };
    public int m;
    public int n;
    public OwnNativeAdView o;

    public i(Context context, x xVar, j jVar, com.anythink.core.common.a.g gVar) {
        this.a = context.getApplicationContext();
        this.g = xVar;
        this.h = jVar;
        if (gVar instanceof com.anythink.expressad.advanced.d.c) {
            com.anythink.expressad.advanced.d.c cVar = (com.anythink.expressad.advanced.d.c) gVar;
            this.k = cVar;
            cVar.a(new o() { // from class: com.anythink.basead.d.i.2
                @Override // com.anythink.expressad.out.o
                public final void a() {
                }

                @Override // com.anythink.expressad.out.o
                public final void a(com.anythink.expressad.foundation.d.c cVar2) {
                    Context e = m.a().e();
                    i iVar = i.this;
                    if (iVar.d == null) {
                        iVar.d = new com.anythink.basead.a.c(e, iVar.h, iVar.g);
                        i.this.d.a(new c.a() { // from class: com.anythink.basead.d.i.2.1
                            @Override // com.anythink.basead.a.c.a
                            public final void a() {
                                com.anythink.basead.e.a aVar = i.this.b;
                                if (aVar != null) {
                                    aVar.onAdClick(1);
                                }
                            }

                            @Override // com.anythink.basead.a.c.a
                            public final void b() {
                            }

                            @Override // com.anythink.basead.a.c.a
                            public final void a(boolean z) {
                                com.anythink.basead.e.a aVar = i.this.b;
                                if (aVar != null) {
                                    aVar.onDeeplinkCallback(z);
                                }
                            }
                        });
                    }
                    com.anythink.basead.d.a.b.a(i.this.d.a(), cVar2);
                    com.anythink.expressad.advanced.d.c cVar3 = i.this.k;
                    ATOutNativeAdvancedViewGroup c = cVar3 != null ? cVar3.c() : null;
                    com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i(i.this.h.d, "");
                    if (c != null) {
                        iVar2.f = c.getHeight();
                        iVar2.e = c.getWidth();
                    }
                    iVar2.g = new com.anythink.basead.c.a();
                    i.this.d.a(iVar2);
                }

                @Override // com.anythink.expressad.out.o
                public final void a(String str) {
                }

                @Override // com.anythink.expressad.out.o
                public final void b() {
                    com.anythink.basead.e.a aVar = i.this.b;
                    if (aVar != null) {
                        aVar.onAdShow();
                    }
                }

                @Override // com.anythink.expressad.out.o
                public final void c() {
                }

                @Override // com.anythink.expressad.out.o
                public final void d() {
                }

                @Override // com.anythink.expressad.out.o
                public final void e() {
                }

                @Override // com.anythink.expressad.out.o
                public final void f() {
                    com.anythink.basead.e.a aVar = i.this.b;
                    if (aVar != null) {
                        aVar.onAdClosed();
                    }
                }
            });
        }
    }

    private void m() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.g instanceof w) {
            com.anythink.basead.d.c.b a = com.anythink.basead.d.c.b.a();
            Context context = this.a;
            j jVar = this.h;
            a.a(context, com.anythink.basead.d.c.b.a(jVar.b, jVar.c), this.g, this.h.m);
        }
        com.anythink.expressad.advanced.d.c cVar = this.k;
        View c = cVar != null ? cVar.c() : this.o;
        if (c != null) {
            com.anythink.basead.c.i iVar = new com.anythink.basead.c.i(this.h.d, "");
            iVar.f = c.getHeight();
            iVar.e = c.getWidth();
            com.anythink.basead.a.b.a(8, this.g, iVar);
            com.anythink.basead.e.a aVar = this.b;
            if (aVar != null) {
                aVar.onAdShow();
            }
        }
    }

    public final void a(int i, int i2) {
        this.m = i;
        this.n = i2;
        com.anythink.expressad.advanced.d.c cVar = this.k;
        if (cVar != null) {
            cVar.a(i2, i);
        }
    }

    public final String b() {
        x xVar = this.g;
        return xVar != null ? xVar.m() : "";
    }

    public final String c() {
        x xVar = this.g;
        return xVar != null ? xVar.n() : "";
    }

    public final String d() {
        x xVar = this.g;
        return xVar != null ? xVar.r() : "";
    }

    public final String e() {
        x xVar = this.g;
        return xVar != null ? xVar.o() : "";
    }

    public final String f() {
        x xVar = this.g;
        return xVar != null ? xVar.p() : "";
    }

    public final String g() {
        x xVar = this.g;
        return xVar != null ? xVar.q() : "";
    }

    public final boolean h() {
        return this.k != null;
    }

    public final void i() {
        com.anythink.core.common.j.a.c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void j() {
        i();
        this.e = null;
        this.o = null;
        this.b = null;
        try {
            com.anythink.expressad.advanced.d.c cVar = this.k;
            if (cVar != null) {
                cVar.e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        com.anythink.basead.a.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.c();
            this.d = null;
        }
        com.anythink.core.common.j.a.c cVar3 = this.c;
        if (cVar3 != null) {
            cVar3.b();
            this.c = null;
        }
    }

    public final void k() {
        com.anythink.expressad.advanced.d.c cVar = this.k;
        if (cVar != null) {
            cVar.d(3);
        }
    }

    public final void l() {
        com.anythink.expressad.advanced.d.c cVar = this.k;
        if (cVar != null) {
            cVar.e(3);
        }
    }

    private boolean b(View view) {
        OwnNativeAdView[] ownNativeAdViewArr = new OwnNativeAdView[1];
        a(ownNativeAdViewArr, view);
        if (ownNativeAdViewArr[0] == null || ownNativeAdViewArr[0].getChildCount() == 0) {
            return false;
        }
        this.o = ownNativeAdViewArr[0];
        return true;
    }

    private void c(View view) {
        this.e = view;
        com.anythink.core.common.j.a.a aVar = new com.anythink.core.common.j.a.a() { // from class: com.anythink.basead.d.i.4
            @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
            public final void recordImpression(View view2) {
                i iVar = i.this;
                if (iVar.f) {
                    return;
                }
                iVar.f = true;
                if (iVar.g instanceof w) {
                    com.anythink.basead.d.c.b a = com.anythink.basead.d.c.b.a();
                    Context context = iVar.a;
                    j jVar = iVar.h;
                    a.a(context, com.anythink.basead.d.c.b.a(jVar.b, jVar.c), iVar.g, iVar.h.m);
                }
                com.anythink.expressad.advanced.d.c cVar = iVar.k;
                View c = cVar != null ? cVar.c() : iVar.o;
                if (c != null) {
                    com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i(iVar.h.d, "");
                    iVar2.f = c.getHeight();
                    iVar2.e = c.getWidth();
                    com.anythink.basead.a.b.a(8, iVar.g, iVar2);
                    com.anythink.basead.e.a aVar2 = iVar.b;
                    if (aVar2 != null) {
                        aVar2.onAdShow();
                    }
                }
            }
        };
        if (this.c == null) {
            view.getContext();
            this.c = new com.anythink.core.common.j.a.c();
        }
        this.c.a(view, aVar);
    }

    public final com.anythink.core.common.e.i a() {
        return this.g;
    }

    public final View a(Context context, boolean z, boolean z2, final MediaAdView.a aVar) {
        com.anythink.expressad.advanced.d.c cVar = this.k;
        if (cVar != null) {
            cVar.a(z2 ? 1 : 0);
            return this.k.c();
        } else if (!TextUtils.isEmpty(this.g.p()) && z && (this.g instanceof com.anythink.core.common.e.g)) {
            MediaAdView mediaAdView = new MediaAdView(context, this.g, this.h, z2, new MediaAdView.a() { // from class: com.anythink.basead.d.i.3
                @Override // com.anythink.basead.ui.MediaAdView.a
                public final void onClickCloseView() {
                    MediaAdView.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.onClickCloseView();
                    }
                }
            });
            mediaAdView.init(this.m, this.n);
            OwnNativeAdView ownNativeAdView = new OwnNativeAdView(this.a);
            ownNativeAdView.addView(mediaAdView, new FrameLayout.LayoutParams(this.m, this.n));
            a(ownNativeAdView, mediaAdView.getClickViews());
            return ownNativeAdView;
        } else {
            return null;
        }
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.b = aVar;
    }

    public final void a(boolean z) {
        this.i = z;
        com.anythink.expressad.advanced.d.c cVar = this.k;
        if (cVar != null) {
            cVar.b(z ? 1 : 2);
        }
    }

    public final void a(String str) {
        this.j = str;
        if (this.k != null) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.j;
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case 49:
                        if (str2.equals("1")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 50:
                        if (str2.equals("2")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 51:
                        if (str2.equals("3")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.k.c(3);
                        return;
                    case 1:
                        this.k.c(1);
                        return;
                    case 2:
                        this.k.c(2);
                        return;
                    default:
                        return;
                }
            }
            this.k.c(3);
        }
    }

    public final void a(View view, List<View> list) {
        if (b(view)) {
            c(view);
            if (list != null) {
                for (View view2 : list) {
                    if (view2 != null) {
                        view2.setOnClickListener(this.l);
                    }
                }
                return;
            }
            view.setOnClickListener(this.l);
        }
    }

    public final void a(View view) {
        if (b(view)) {
            c(view);
            a(view, this.l);
        }
    }

    private void a(OwnNativeAdView[] ownNativeAdViewArr, View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof OwnNativeAdView) {
                ownNativeAdViewArr[0] = (OwnNativeAdView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(ownNativeAdViewArr, viewGroup.getChildAt(i));
            }
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public final boolean a(boolean z, boolean z2) {
        if (this.g.i() != 67) {
            return false;
        }
        return this.g.a(z, z2);
    }

    private static /* synthetic */ void a(i iVar) {
        if (iVar.f) {
            return;
        }
        iVar.f = true;
        if (iVar.g instanceof w) {
            com.anythink.basead.d.c.b a = com.anythink.basead.d.c.b.a();
            Context context = iVar.a;
            j jVar = iVar.h;
            a.a(context, com.anythink.basead.d.c.b.a(jVar.b, jVar.c), iVar.g, iVar.h.m);
        }
        com.anythink.expressad.advanced.d.c cVar = iVar.k;
        View c = cVar != null ? cVar.c() : iVar.o;
        if (c != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i(iVar.h.d, "");
            iVar2.f = c.getHeight();
            iVar2.e = c.getWidth();
            com.anythink.basead.a.b.a(8, iVar.g, iVar2);
            com.anythink.basead.e.a aVar = iVar.b;
            if (aVar != null) {
                aVar.onAdShow();
            }
        }
    }
}