package com.anythink.core.common;

import com.anythink.core.common.e.af;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c {
    private static c c;
    public ConcurrentHashMap<String, Long> a = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (c == null) {
                c = new c();
            }
            cVar = c;
        }
        return cVar;
    }

    public final boolean b(af afVar) {
        if (afVar.l() == 7) {
            return false;
        }
        if (afVar.I() == 0) {
            return false;
        }
        return afVar.I() + (this.b.get(afVar.t()) != null ? this.b.get(afVar.t()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public final boolean a(af afVar) {
        if (afVar.H() == 0) {
            return false;
        }
        return afVar.H() + (this.a.get(afVar.t()) != null ? this.a.get(afVar.t()).longValue() : 0L) >= System.currentTimeMillis();
    }

    private void b(String str, long j) {
        this.b.put(str, Long.valueOf(j));
    }

    public final void a(String str, long j) {
        this.a.put(str, Long.valueOf(j));
    }
}