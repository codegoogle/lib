package com.anythink.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.c.d;
import com.anythink.core.common.b.g;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.n;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {
    private static b c;
    public final String a = b.class.getSimpleName();
    public ConcurrentHashMap<String, com.anythink.core.common.e.c> b = new ConcurrentHashMap<>();

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }

    public final void b(Context context, String str, d dVar) {
        com.anythink.core.common.e.c cVar = this.b.get(str);
        if (cVar == null) {
            String b = n.b(context, g.t, str, "");
            com.anythink.core.common.e.c cVar2 = new com.anythink.core.common.e.c();
            if (!TextUtils.isEmpty(b)) {
                cVar2.a(b);
            }
            this.b.put(str, cVar2);
            cVar = cVar2;
        }
        if (System.currentTimeMillis() - cVar.b > dVar.ag()) {
            cVar.b = System.currentTimeMillis();
            cVar.a = 0;
        }
        cVar.a++;
        e.b(this.a, "After save load cap:" + str + ":" + cVar.toString());
        n.a(context, g.t, str, cVar.toString());
    }

    public final boolean a(Context context, String str, d dVar) {
        if (dVar.af() <= 0) {
            return false;
        }
        com.anythink.core.common.e.c cVar = this.b.get(str);
        if (cVar == null) {
            String b = n.b(context, g.t, str, "");
            cVar = new com.anythink.core.common.e.c();
            if (!TextUtils.isEmpty(b)) {
                cVar.a(b);
            }
            this.b.put(str, cVar);
        }
        String str2 = this.a;
        e.b(str2, "Load Cap info:" + str + ":" + cVar.toString());
        return cVar.a >= dVar.af() && System.currentTimeMillis() - cVar.b <= dVar.ag();
    }
}