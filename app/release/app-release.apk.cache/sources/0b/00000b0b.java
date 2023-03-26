package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.c;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j {
    private static Map<String, Boolean> b = new HashMap();
    private Map<String, Boolean> a;
    private Map<String, Boolean> c;
    private Map<String, Boolean> d;
    private Map<String, Boolean> e;

    /* loaded from: classes2.dex */
    public static final class a {
        public static j a = new j((byte) 0);

        private a() {
        }
    }

    public /* synthetic */ j(byte b2) {
        this();
    }

    public static j a() {
        return a.a;
    }

    public static void c(String str) {
        if (b == null) {
            b = new HashMap();
        }
        b.put(str, Boolean.TRUE);
    }

    private void e(String str) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, Boolean.FALSE);
    }

    private void f(String str) {
        if (this.e.containsKey(str)) {
            this.e.remove(str);
        }
    }

    private static boolean g(String str) {
        boolean a2 = a(b, str);
        if (a2 || com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d()).b(str)) {
            return true;
        }
        return a2;
    }

    private static boolean h(String str) {
        String d = com.anythink.expressad.foundation.h.l.d(str);
        StringBuilder sb = new StringBuilder();
        sb.append(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC));
        File file = new File(wo1.C(sb, File.separator, d));
        try {
            if (file.exists() && file.isFile()) {
                return file.canRead();
            }
            return false;
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
                return false;
            }
            return false;
        }
    }

    public final boolean b(String str) {
        if (this.c == null || TextUtils.isEmpty(str) || !this.c.containsKey(str)) {
            return false;
        }
        return this.c.get(str).booleanValue();
    }

    public final boolean d(String str) {
        if (!TextUtils.isEmpty(str) && this.e.containsKey(str)) {
            return this.e.get(str).booleanValue();
        }
        return false;
    }

    private j() {
        this.a = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public final boolean a(String str) {
        if (this.a == null || TextUtils.isEmpty(str) || !this.a.containsKey(str)) {
            return false;
        }
        return this.a.get(str).booleanValue();
    }

    public final void b(String str, boolean z) {
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, Boolean.valueOf(z));
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (cVar != null) {
                b(cVar);
                e(cVar.aZ());
            }
        }
    }

    public final void c(String str, boolean z) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, Boolean.valueOf(z));
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        List<c.C0061c.a> f;
        if (cVar != null) {
            String R = cVar.R();
            Map<String, Boolean> map = this.a;
            if (map != null && !map.containsKey(R)) {
                this.a.put(R, Boolean.FALSE);
            }
            String G = cVar.G();
            Map<String, Boolean> map2 = this.c;
            if (map2 != null && !map2.containsKey(G)) {
                this.c.put(G, Boolean.FALSE);
            }
            c.C0061c L = cVar.L();
            if (L == null || (f = L.f()) == null) {
                return;
            }
            for (c.C0061c.a aVar : f) {
                if (aVar != null) {
                    b(aVar.b);
                }
            }
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            b(cVar);
            e(cVar.aZ());
        }
    }

    public final void a(String str, boolean z) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Boolean.valueOf(z));
    }

    private static boolean a(Map<String, Boolean> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (map != null) {
            if (map.containsKey(str)) {
                return map.get(str).booleanValue();
            }
            map.put(str, Boolean.FALSE);
            return false;
        }
        new HashMap().put(str, Boolean.FALSE);
        return false;
    }

    private static void b(List<String> list) {
        Map<String, Boolean> map;
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (map = b) != null && !map.containsKey(str)) {
                b.put(str, Boolean.valueOf(com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d()).b(str)));
            }
        }
    }

    private boolean a(boolean z, String str) {
        boolean a2 = a(this.c, str);
        if (a2 || !z || TextUtils.isEmpty(g.a().c(str))) {
            return a2;
        }
        this.c.put(str, Boolean.TRUE);
        return true;
    }

    private static boolean a(c.C0061c c0061c) {
        List<c.C0061c.a> f;
        List<String> list;
        if (c0061c != null && (f = c0061c.f()) != null) {
            for (c.C0061c.a aVar : f) {
                if (aVar != null && (list = aVar.b) != null) {
                    for (String str : list) {
                        boolean a2 = a(b, str);
                        if (a2 || com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d()).b(str)) {
                            a2 = true;
                            continue;
                        }
                        if (!a2) {
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        return true;
    }
}