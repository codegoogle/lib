package com.anythink.expressad.d;

import android.content.Context;
import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    public static final String a = "b";
    public static final int b = 500;
    public static final String c = "anythink";
    private static b d;
    private static HashMap<String, c> e = new HashMap<>();
    private static a f = null;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (d == null) {
                d = new b();
            }
            bVar = d;
        }
        return bVar;
    }

    public static a b() {
        if (f == null) {
            f = c();
        }
        return f;
    }

    public static c c(String str, String str2) {
        c g = g(str, str2);
        if (g != null && g.k() == 0) {
            g.l();
        }
        return g;
    }

    public static c d(String str, String str2) {
        return g(str, str2);
    }

    public static void e(String str, String str2) {
        com.anythink.expressad.foundation.a.a.a.a().a("ivreward_".concat(String.valueOf(str)), str2);
    }

    private static void f(String str, String str2) {
        com.anythink.expressad.foundation.a.a.a.a().a(str, str2);
        a b2 = a.b(str2);
        f = b2;
        if (b2 != null) {
            b2.H();
        }
    }

    private static c g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.b().e();
        }
        String u = wo1.u(str, "_", str2);
        c cVar = null;
        if (e.containsKey(u)) {
            return e.get(u);
        }
        try {
            cVar = c.b(com.anythink.expressad.foundation.a.a.a.a().a(u));
            e.put(u, cVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return cVar;
    }

    private static c d(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.v();
        cVar.u();
        cVar.a(str);
        cVar.a(arrayList);
        cVar.b(arrayList2);
        cVar.p();
        cVar.r();
        cVar.q();
        cVar.o();
        cVar.n();
        cVar.j();
        cVar.l();
        cVar.c(100);
        cVar.d(0);
        cVar.h();
        cVar.e();
        cVar.c();
        cVar.w();
        cVar.x();
        return cVar;
    }

    public static String a(String str) {
        return str == null ? "" : b().T();
    }

    public static String b(String str) {
        return com.anythink.expressad.foundation.a.a.a.a().a("ivreward_".concat(String.valueOf(str)));
    }

    public static void c(String str) {
        com.anythink.expressad.foundation.a.a.a.a().b("ivreward_".concat(String.valueOf(str)));
    }

    public static c b(String str, String str2) {
        c g = g(str, str2);
        return g == null ? new c() : g;
    }

    public static a c() {
        a aVar = new a();
        aVar.B();
        aVar.C();
        aVar.z();
        aVar.A();
        aVar.x();
        aVar.v();
        aVar.n();
        aVar.a("anythink");
        aVar.j();
        aVar.q();
        aVar.p();
        aVar.t();
        aVar.e();
        aVar.d();
        aVar.f();
        aVar.g();
        aVar.h();
        aVar.i();
        aVar.c();
        aVar.c(com.anythink.expressad.d.a.b.df);
        aVar.a(120);
        aVar.Q();
        aVar.P();
        aVar.a(100);
        aVar.S();
        aVar.e(com.anythink.expressad.foundation.g.a.cH);
        aVar.d(com.anythink.expressad.foundation.g.a.cJ);
        aVar.c(com.anythink.expressad.foundation.g.a.cI);
        aVar.a();
        aVar.f(com.anythink.expressad.foundation.g.a.cO);
        aVar.b(10);
        return aVar;
    }

    private static void a(Context context, String str) {
        try {
            Map<String, ?> all = context.getSharedPreferences(com.anythink.expressad.foundation.g.a.o, 0).getAll();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "_")) {
                    e.put(str2, c.b((String) all.get(str2)));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static c a(String str, String str2) {
        c c2 = c(str, str2);
        return c2 == null ? new c() : c2;
    }

    private static void a(String str, String str2, String str3) {
        String u = wo1.u(str, "_", str2);
        com.anythink.expressad.foundation.a.a.a.a().a(u, str3);
        e.put(u, c.b(str3));
    }
}