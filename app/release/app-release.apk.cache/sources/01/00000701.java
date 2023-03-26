package com.anythink.core.common;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.common.e.aa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class t {
    private static t a;
    private ConcurrentHashMap<String, aa> b = new ConcurrentHashMap<>(4);

    private t() {
    }

    public static synchronized t a() {
        t tVar;
        synchronized (t.class) {
            if (a == null) {
                a = new t();
            }
            tVar = a;
        }
        return tVar;
    }

    private synchronized aa h(String str) {
        aa aaVar;
        aaVar = this.b.get(str);
        if (aaVar == null) {
            aaVar = new aa();
            this.b.put(str, aaVar);
        }
        return aaVar;
    }

    public final f b(String str) {
        return h(str).b();
    }

    public final synchronized Map<String, Object> c(String str) {
        HashMap hashMap;
        hashMap = new HashMap(2);
        Map<String, Object> c = h(str).c();
        if (c != null) {
            hashMap.putAll(c);
        }
        return hashMap;
    }

    public final com.anythink.core.common.e.d d(String str) {
        return h(str).d();
    }

    public final void e(String str) {
        h(str).a((ATAdInfo) null);
    }

    public final boolean f(String str) {
        return h(str).e();
    }

    public final String g(String str) {
        return h(str).f();
    }

    public final Object a(String str) {
        return h(str).a();
    }

    public final void a(String str, f fVar) {
        h(str).a(fVar);
    }

    public final synchronized void a(String str, Map<String, Object> map) {
        ConcurrentHashMap concurrentHashMap = null;
        if (map != null) {
            try {
                concurrentHashMap = new ConcurrentHashMap(map);
            } catch (Throwable unused) {
            }
        }
        h(str).a(concurrentHashMap);
    }

    private synchronized void a(String str, String str2, Object obj) {
        h(str).a(str2, obj);
    }

    public final void a(String str, ATAdInfo aTAdInfo) {
        h(str).a(aTAdInfo);
    }

    public final void a(String str, String str2, String str3) {
        h(str).a(str2, str3);
    }

    public final String a(String str, String str2) {
        return h(str).a(str2);
    }

    public final void a(String str, boolean z) {
        h(str).a(z);
    }

    public final void a(String str, Object[] objArr) {
        h(str).a(objArr);
    }

    public final void a(String str, int i, String str2) {
        h(str).b(String.valueOf(i), str2);
    }

    public final String a(String str, int i) {
        return h(str).b(String.valueOf(i));
    }
}