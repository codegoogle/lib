package com.anythink.basead.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.c.c;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.e.q;
import com.p7700g.p99005.wo1;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class b {
    private static b a;
    private Context b;
    private ConcurrentHashMap<String, c> d = new ConcurrentHashMap<>();
    private SimpleDateFormat c = new SimpleDateFormat("yyyyMMdd");

    private b(Context context) {
        this.b = context.getApplicationContext();
    }

    public final boolean b(q qVar) {
        c d = d(qVar);
        int i = qVar.L;
        return i != -1 && d.d >= i;
    }

    public final boolean c(q qVar) {
        return System.currentTimeMillis() - d(qVar).e <= qVar.M;
    }

    public final c d(q qVar) {
        String j = wo1.j(System.currentTimeMillis(), this.c);
        c cVar = this.d.get(qVar.k());
        if (cVar == null) {
            cVar = com.anythink.basead.b.c.a(this.b).a(qVar.k());
            if (cVar == null) {
                cVar = new c();
                cVar.a = qVar.k();
                cVar.b = qVar.L;
                cVar.c = qVar.M;
                cVar.e = 0L;
                cVar.d = 0;
                cVar.f = j;
            }
            this.d.put(qVar.k(), cVar);
        }
        if (!TextUtils.equals(j, cVar.f)) {
            cVar.f = j;
            cVar.d = 0;
        }
        return cVar;
    }

    public static b a(Context context) {
        if (a == null) {
            a = new b(context);
        }
        return a;
    }

    public final void a(q qVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String j = wo1.j(currentTimeMillis, this.c);
        final c d = d(qVar);
        if (d.f.equals(j)) {
            d.d++;
        } else {
            d.d = 1;
            d.f = j;
        }
        d.e = currentTimeMillis;
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.basead.f.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.b.c.a(b.this.b).c(d.f);
                com.anythink.basead.b.c.a(b.this.b).a(d);
            }
        });
    }

    public final String a() {
        List<c> b = com.anythink.basead.b.c.a(this.b).b(wo1.j(System.currentTimeMillis(), this.c));
        JSONArray jSONArray = new JSONArray();
        if (b != null) {
            for (c cVar : b) {
                jSONArray.put(cVar.a);
            }
        }
        return jSONArray.toString();
    }

    public final boolean a(String str) {
        List<q> z;
        d a2 = e.a(this.b).a(str);
        if (a2 == null || (z = a2.z()) == null || z.size() <= 0) {
            return false;
        }
        for (q qVar : z) {
            if (!b(qVar)) {
                return false;
            }
        }
        return true;
    }
}