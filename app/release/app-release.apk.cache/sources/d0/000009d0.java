package com.anythink.expressad.video.dynview.b;

import android.view.View;
import com.anythink.expressad.video.dynview.c;

/* loaded from: classes2.dex */
public class b {
    private static volatile b a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
                bVar = a;
            }
            return bVar;
        }
        return a;
    }

    private static void b(View view, c cVar) {
        new com.anythink.expressad.video.dynview.i.b().a(view, cVar);
    }

    private static void c(View view, c cVar) {
        new com.anythink.expressad.video.dynview.i.b().b(view, cVar);
    }

    private static void d(View view, c cVar) {
        new com.anythink.expressad.video.dynview.i.b().c(view, cVar);
    }

    public static void b() {
        if (a != null) {
            a = null;
        }
    }

    public static void a(View view, c cVar) {
        if (cVar == null) {
            return;
        }
        int h = cVar.h();
        if (h == 1) {
            new com.anythink.expressad.video.dynview.i.b().a(view);
        } else if (h == 102 || h == 202 || h == 302 || h == 802 || h == 904) {
            new com.anythink.expressad.video.dynview.i.b().a(view, cVar);
        } else if (h == 3) {
            new com.anythink.expressad.video.dynview.i.b().b(view, cVar);
        } else if (h != 4) {
        } else {
            new com.anythink.expressad.video.dynview.i.b().c(view, cVar);
        }
    }

    private static void a(View view) {
        new com.anythink.expressad.video.dynview.i.b().a(view);
    }
}