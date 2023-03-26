package com.anythink.basead.f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.a.c;
import com.anythink.basead.c.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.q;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends c {
    public com.anythink.basead.e.a a;
    public com.anythink.core.common.j.a.c k;
    public com.anythink.basead.a.c l;
    public View m;
    public boolean n;
    public View.OnClickListener o;
    private final String p;

    public e(Context context, j jVar, String str, boolean z) {
        super(context, jVar, str, z);
        this.p = e.class.getSimpleName();
        this.o = new View.OnClickListener() { // from class: com.anythink.basead.f.e.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e eVar = e.this;
                if (eVar.l == null) {
                    eVar.l = new com.anythink.basead.a.c(eVar.c, eVar.d, eVar.g);
                    e.this.l.a(new c.a() { // from class: com.anythink.basead.f.e.1.1
                        @Override // com.anythink.basead.a.c.a
                        public final void a() {
                            com.anythink.basead.e.a aVar = e.this.a;
                            if (aVar != null) {
                                aVar.onAdClick(1);
                            }
                        }

                        @Override // com.anythink.basead.a.c.a
                        public final void b() {
                        }

                        @Override // com.anythink.basead.a.c.a
                        public final void a(boolean z2) {
                            com.anythink.basead.e.a aVar = e.this.a;
                            if (aVar != null) {
                                aVar.onDeeplinkCallback(z2);
                            }
                        }
                    });
                }
                e eVar2 = e.this;
                eVar2.l.a(new i(eVar2.d.d, ""));
            }
        };
    }

    private static View m() {
        return null;
    }

    private void n() {
        if (this.n) {
            return;
        }
        this.n = true;
        com.anythink.basead.f.a.b.a(this.c).a(this.g);
        com.anythink.basead.a.b.a(8, this.g, new i(this.d.d, ""));
        com.anythink.basead.e.a aVar = this.a;
        if (aVar != null) {
            aVar.onAdShow();
        }
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.a = aVar;
    }

    @Override // com.anythink.basead.f.a
    public final void a(Map<String, Object> map) {
    }

    public final String b() {
        q qVar = this.g;
        return qVar != null ? qVar.m() : "";
    }

    public final String f() {
        q qVar = this.g;
        return qVar != null ? qVar.n() : "";
    }

    public final String g() {
        q qVar = this.g;
        return qVar != null ? qVar.r() : "";
    }

    public final String h() {
        q qVar = this.g;
        return qVar != null ? qVar.o() : "";
    }

    public final String i() {
        q qVar = this.g;
        return qVar != null ? qVar.p() : "";
    }

    public final String j() {
        q qVar = this.g;
        return qVar != null ? qVar.q() : "";
    }

    public final void k() {
        com.anythink.core.common.j.a.c cVar = this.k;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void l() {
        k();
        this.a = null;
        com.anythink.basead.a.c cVar = this.l;
        if (cVar != null) {
            cVar.c();
            this.l = null;
        }
        this.k = null;
    }

    public final void a(View view, List<View> list) {
        b(view);
        if (list != null) {
            for (View view2 : list) {
                if (view2 != null) {
                    view2.setOnClickListener(this.o);
                }
            }
            return;
        }
        view.setOnClickListener(this.o);
    }

    private void b(View view) {
        this.m = view;
        com.anythink.core.common.j.a.a aVar = new com.anythink.core.common.j.a.a() { // from class: com.anythink.basead.f.e.2
            @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
            public final void recordImpression(View view2) {
                e.a(e.this);
            }
        };
        if (this.k == null) {
            view.getContext();
            this.k = new com.anythink.core.common.j.a.c();
        }
        this.k.a(view, aVar);
    }

    public final void a(View view) {
        b(view);
        a(view, this.o);
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

    public static /* synthetic */ void a(e eVar) {
        if (eVar.n) {
            return;
        }
        eVar.n = true;
        com.anythink.basead.f.a.b.a(eVar.c).a(eVar.g);
        com.anythink.basead.a.b.a(8, eVar.g, new i(eVar.d.d, ""));
        com.anythink.basead.e.a aVar = eVar.a;
        if (aVar != null) {
            aVar.onAdShow();
        }
    }
}