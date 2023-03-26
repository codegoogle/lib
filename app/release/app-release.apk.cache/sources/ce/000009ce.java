package com.anythink.expressad.video.dynview;

import android.content.Context;
import com.anythink.expressad.video.dynview.e.d;
import java.util.List;
import java.util.Map;

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

    private static void b() {
        com.anythink.expressad.video.dynview.b.b.a();
        com.anythink.expressad.video.dynview.b.b.b();
        com.anythink.expressad.video.dynview.b.a.a();
        com.anythink.expressad.video.dynview.b.a.b();
    }

    public static void a(Context context, List<com.anythink.expressad.foundation.d.c> list, d dVar, Map<String, Object> map) {
        new com.anythink.expressad.video.dynview.g.a(context, list, dVar, map);
    }

    public static void a(c cVar, d dVar) {
        new com.anythink.expressad.video.dynview.g.a(cVar, dVar, null);
    }

    private static void a(c cVar, d dVar, Map<String, Object> map) {
        new com.anythink.expressad.video.dynview.g.a(cVar, dVar, map);
    }
}