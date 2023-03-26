package com.anythink.expressad.video.dynview.i;

import android.content.Context;
import android.view.View;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.videocommon.e.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    private static com.anythink.expressad.video.dynview.c a(Context context, List<com.anythink.expressad.foundation.d.c> list) {
        com.anythink.expressad.foundation.d.c cVar;
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
        return new c.a().a(context).a(str).a(1).a(e).b(f).a(list).b(c).a();
    }

    private static String a(int i) {
        return i != 3 ? i != 302 ? i != 802 ? "anythink_reward_layer_floor" : com.anythink.expressad.video.dynview.a.a.f : com.anythink.expressad.video.dynview.a.a.e : com.anythink.expressad.video.dynview.a.a.h;
    }

    public static com.anythink.expressad.video.dynview.c b(View view, com.anythink.expressad.foundation.d.c cVar) {
        String str;
        String str2 = "";
        if (cVar != null) {
            str2 = cVar.I();
            str = a(3);
        } else {
            str = "";
        }
        d a = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), str2, false);
        int h = a != null ? a.h() : 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        return new c.a().a(str).a(3).a(arrayList).a(view.getContext()).a(view).c(h).b(j.b(view.getContext())).d(3).a();
    }

    public static com.anythink.expressad.video.dynview.c a(View view, com.anythink.expressad.foundation.d.c cVar) {
        String str;
        boolean z;
        int i;
        String str2 = "";
        int i2 = 102;
        if (cVar != null) {
            String I = cVar.I();
            if (cVar.L() != null) {
                i2 = cVar.L().b();
                str2 = cVar.L().e();
            }
            str = a(i2);
            int i3 = i2;
            z = com.anythink.expressad.video.dynview.h.c.a(str2);
            str2 = I;
            i = i3;
        } else {
            str = "";
            z = false;
            i = 102;
        }
        d a = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), str2, false);
        int h = a != null ? a.h() : 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        return new c.a().a(str).a(i).a(arrayList).a(view.getContext()).a(view).c(h).b(j.b(view.getContext())).d(i).a(z).a();
    }

    private static com.anythink.expressad.video.dynview.c a(Context context) {
        return new c.a().a(j.b(context) == 1 ? com.anythink.expressad.video.dynview.a.a.b : com.anythink.expressad.video.dynview.a.a.a).a(4).a(context).b(j.b(context)).a();
    }
}