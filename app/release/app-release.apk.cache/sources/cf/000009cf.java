package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private static volatile a a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
                aVar = a;
            }
            return aVar;
        }
        return a;
    }

    private static void b(c cVar, View view, com.anythink.expressad.video.dynview.e.b bVar) {
        new com.anythink.expressad.video.dynview.i.a().b(cVar, view, bVar);
    }

    public static void b() {
        if (a != null) {
            a = null;
        }
    }

    public static void a(View view, c cVar, Map map, com.anythink.expressad.video.dynview.e.b bVar) {
        int h = cVar.h();
        if (h == 1) {
            new com.anythink.expressad.video.dynview.i.a().a(cVar, view, map, bVar);
        } else if (h == 4) {
            new com.anythink.expressad.video.dynview.i.a().b(cVar, view, bVar);
        } else if (h != 102 && h != 202 && h != 302 && h != 802 && h != 904) {
            bVar.a(view, new ArrayList());
        } else {
            new com.anythink.expressad.video.dynview.i.a().a(cVar, view, bVar);
        }
    }

    private static void a(c cVar, View view, Map map, com.anythink.expressad.video.dynview.e.b bVar) {
        new com.anythink.expressad.video.dynview.i.a().a(cVar, view, map, bVar);
    }

    private static void a(c cVar, View view, com.anythink.expressad.video.dynview.e.b bVar) {
        new com.anythink.expressad.video.dynview.i.a().a(cVar, view, bVar);
    }
}