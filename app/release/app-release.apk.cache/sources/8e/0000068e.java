package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.b.g;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public final class i {
    private static i a;

    private i() {
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (a == null) {
                a = new i();
            }
            iVar = a;
        }
        return iVar;
    }

    public static String b() {
        return m() ? g.c.q : g.c.e;
    }

    public static String c() {
        return m() ? g.c.r : g.c.f;
    }

    public static String d() {
        return m() ? g.c.u : g.c.i;
    }

    public static String e() {
        return m() ? g.c.A : g.c.p;
    }

    public static String f() {
        com.anythink.core.common.e.n j = com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()).b(com.anythink.core.common.b.m.a().n()).j();
        String str = m() ? g.c.w : g.c.k;
        return j != null ? a(j.b(), str) : str;
    }

    public static String g() {
        com.anythink.core.common.e.n j = com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()).b(com.anythink.core.common.b.m.a().n()).j();
        String str = m() ? g.c.x : g.c.l;
        return j != null ? a(j.d(), str) : str;
    }

    public static String h() {
        com.anythink.core.common.e.n j = com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()).b(com.anythink.core.common.b.m.a().n()).j();
        String str = m() ? g.c.y : g.c.m;
        return j != null ? a(j.a(), str) : str;
    }

    public static String i() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        String str = m() ? g.c.z : g.c.o;
        return l0 != null ? a(l0.g(), str) : str;
    }

    public static String j() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        String str = m() ? g.c.t : g.c.h;
        return l0 != null ? a(l0.R(), str) : str;
    }

    public static String k() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        String str = m() ? g.c.s : g.c.g;
        return l0 != null ? a(l0.W(), str) : str;
    }

    public static String l() {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        return l0 != null ? a(l0.N(), "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html") : "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";
    }

    private static boolean m() {
        return com.anythink.core.common.b.m.a().B() && com.anythink.core.common.b.m.a().A();
    }

    private static String b(com.anythink.core.c.d dVar) {
        return dVar.l();
    }

    private static String b(String str, String str2) {
        return com.anythink.core.common.b.m.a().C() ? str2 : str;
    }

    public static String a(com.anythink.core.c.d dVar, boolean z) {
        if (z) {
            String q = dVar.q();
            String ai = dVar.ai();
            if (com.anythink.core.common.b.m.a().C()) {
                q = ai;
            }
            if (!TextUtils.isEmpty(q)) {
                return q;
            }
        }
        com.anythink.core.common.e.n j = com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()).b(com.anythink.core.common.b.m.a().n()).j();
        String str = m() ? g.c.v : g.c.j;
        return j != null ? a(j.c(), str) : str;
    }

    public static String a(com.anythink.core.c.d dVar) {
        String m = dVar.m();
        return TextUtils.isEmpty(m) ? "" : m;
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}