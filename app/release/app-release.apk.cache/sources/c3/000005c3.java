package com.anythink.core.common.a;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.c.i;
import com.anythink.core.common.j.n;

/* loaded from: classes2.dex */
public final class a {
    private static a a;
    private i b;

    private a() {
        if (m.a().e() != null) {
            this.b = i.a(com.anythink.core.common.c.c.a(m.a().e()));
        }
    }

    private static void c(Context context, String str) {
        n.a(context, com.anythink.core.common.b.g.z, str + g.o.n, 1);
    }

    private static boolean d(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(g.o.n);
        return n.b(context, com.anythink.core.common.b.g.z, sb.toString(), 0) == 1;
    }

    public final void b(final Context context, final String str) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.b == null) {
                    a.this.b = i.a(com.anythink.core.common.c.c.a(context.getApplicationContext()));
                }
                a.this.b.a(str);
            }
        });
        n.a(context, com.anythink.core.common.b.g.z, str + g.o.n);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
            aVar = a;
        }
        return aVar;
    }

    public final void a(Context context, int i, String str, String str2, String str3) {
        if (this.b == null) {
            this.b = i.a(com.anythink.core.common.c.c.a(context.getApplicationContext()));
        }
        h hVar = new h();
        hVar.a(str2);
        hVar.b(str);
        hVar.a(i);
        hVar.c(str3);
        this.b.a(hVar);
    }

    public final String a(Context context, String str) {
        if (this.b == null) {
            this.b = i.a(com.anythink.core.common.c.c.a(context.getApplicationContext()));
        }
        return this.b.b(str);
    }
}