package com.anythink.core.basead;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.n;

/* loaded from: classes2.dex */
public final class b {
    private static b a;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    private static void b(Context context, String str) {
        n.a(context, g.w, str);
    }

    private static void a(Context context, String str, String str2) {
        n.a(context, g.w, str, str2);
    }

    private static String a(Context context, String str) {
        return n.b(context, g.w, str, "");
    }

    public static String a(j jVar) {
        return jVar == null ? "" : a(jVar.b, jVar.c, jVar.f);
    }

    public static String a(String str, String str2, int i) {
        return str + "_" + str2 + "_" + i;
    }
}