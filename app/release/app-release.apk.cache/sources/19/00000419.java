package com.anythink.basead.a.a;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class c {
    public static final String a = "c";
    private static c b;
    private List<a> c = new CopyOnWriteArrayList();

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        void a(String str, com.anythink.basead.c.e eVar);
    }

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (b == null) {
                b = new c();
            }
            cVar = b;
        }
        return cVar;
    }

    public final synchronized void b(a aVar) {
        int size = this.c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (aVar == this.c.get(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.c.remove(i);
        }
    }

    public final synchronized void a(a aVar) {
        this.c.add(aVar);
    }

    public final void a(String str) {
        List<a> list = this.c;
        if (list != null) {
            for (a aVar : list) {
                aVar.a(str);
            }
        }
    }

    public final void a(String str, com.anythink.basead.c.e eVar) {
        List<a> list = this.c;
        if (list != null) {
            for (a aVar : list) {
                aVar.a(str, eVar);
            }
        }
    }
}