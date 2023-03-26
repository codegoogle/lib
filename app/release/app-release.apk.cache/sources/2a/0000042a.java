package com.anythink.basead.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class d {
    public static final String a = "d";
    private static d c;
    public ConcurrentHashMap<String, com.anythink.basead.c.d> b = new ConcurrentHashMap<>();

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    public final void a(int i, String str, com.anythink.basead.c.d dVar) {
        ConcurrentHashMap<String, com.anythink.basead.c.d> concurrentHashMap = this.b;
        concurrentHashMap.put(i + str, dVar);
    }

    public final com.anythink.basead.c.d a(int i, String str) {
        ConcurrentHashMap<String, com.anythink.basead.c.d> concurrentHashMap = this.b;
        return concurrentHashMap.get(i + str);
    }
}