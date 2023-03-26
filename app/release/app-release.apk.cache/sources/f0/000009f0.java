package com.anythink.expressad.video.dynview.g;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.e.d;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {
    public a(Context context, List<c> list, d dVar, Map<String, Object> map) {
        c cVar;
        new com.anythink.expressad.video.dynview.i.c();
        float f = s.f(m.a().e());
        float e = s.e(m.a().e());
        int c = (list == null || list.size() <= 0 || (cVar = list.get(0)) == null || cVar.L() == null) ? 1 : cVar.L().c();
        String str = com.anythink.expressad.video.dynview.a.a.i;
        if (c == 1) {
            str = com.anythink.expressad.video.dynview.a.a.j;
        } else if (c != 2) {
            if (com.anythink.expressad.video.dynview.h.c.a(context)) {
                c = 2;
            } else {
                str = com.anythink.expressad.video.dynview.a.a.j;
                c = 1;
            }
        }
        a(new c.a().a(context).a(str).a(1).a(e).b(f).a(list).b(c).a(), dVar, map);
    }

    private void a(com.anythink.expressad.video.dynview.c cVar, d dVar) {
        a(cVar, dVar, null);
    }

    private void a(com.anythink.expressad.video.dynview.c cVar, final d dVar, Map<String, Object> map) {
        if (dVar == null) {
            return;
        }
        if (cVar == null) {
            dVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
        } else if (cVar.a() == null) {
            dVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_CONTEXT);
        } else if (TextUtils.isEmpty(cVar.b())) {
            dVar.a(com.anythink.expressad.video.dynview.c.a.NOT_FOUND_LAYOUTNAME);
        } else {
            View inflate = LayoutInflater.from(cVar.a()).inflate(h.a(cVar.a(), cVar.b(), "layout"), (ViewGroup) null);
            com.anythink.expressad.video.dynview.b.b.a();
            com.anythink.expressad.video.dynview.b.b.a(inflate, cVar);
            com.anythink.expressad.video.dynview.b.a.a();
            com.anythink.expressad.video.dynview.b.a.a(inflate, cVar, map, new com.anythink.expressad.video.dynview.e.b() { // from class: com.anythink.expressad.video.dynview.g.a.1
                @Override // com.anythink.expressad.video.dynview.e.b
                public final void a(View view, List<View> list) {
                    com.anythink.expressad.video.dynview.a aVar = new com.anythink.expressad.video.dynview.a();
                    aVar.a(view);
                    aVar.a(list);
                    dVar.a(aVar);
                }

                @Override // com.anythink.expressad.video.dynview.e.b
                public final void a(com.anythink.expressad.video.dynview.c.a aVar) {
                    dVar.a(aVar);
                }
            });
        }
    }

    public a(com.anythink.expressad.video.dynview.c cVar, d dVar, Map<String, Object> map) {
        a(cVar, dVar, map);
    }
}