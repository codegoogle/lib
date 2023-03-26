package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.e.af;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class u {
    private static u a;
    private final String c = "Waterfall_Final";
    private ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public class a {
        public String a;
        public ConcurrentHashMap<String, C0052a> b = new ConcurrentHashMap<>();

        /* renamed from: com.anythink.core.common.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0052a {
            public com.anythink.core.c.d a;
            public CopyOnWriteArrayList<af> b;
            public boolean c;

            public C0052a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public synchronized void b() {
                if (this.c) {
                    return;
                }
                this.c = true;
            }

            private boolean c() {
                return this.c;
            }

            private List<af> a() {
                return this.b;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public synchronized void a(af afVar) {
                com.anythink.core.common.j.g.a((List<af>) this.b, afVar, true);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public synchronized void a(List<af> list) {
                CopyOnWriteArrayList<af> copyOnWriteArrayList = this.b;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    this.b.removeAll(list);
                }
            }
        }

        public a() {
        }

        private boolean b(String str) {
            C0052a c0052a = this.b.get(str);
            if (c0052a != null) {
                return c0052a.c;
            }
            return false;
        }

        private void c(String str) {
            C0052a c0052a = this.b.get(str);
            if (c0052a != null) {
                c0052a.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void d(String str) {
            Iterator<Map.Entry<String, C0052a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (key != null) {
                    String obj = key.toString();
                    if (this.b.get(obj).c && !TextUtils.equals(str, obj)) {
                        it.remove();
                    }
                }
            }
        }

        private void a(String str, com.anythink.core.c.d dVar, List<af> list) {
            C0052a c0052a = new C0052a();
            c0052a.a = dVar;
            CopyOnWriteArrayList<af> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.addAll(list);
            c0052a.b = copyOnWriteArrayList;
            this.b.put(str, c0052a);
        }

        public static /* synthetic */ void b(a aVar, String str) {
            C0052a c0052a = aVar.b.get(str);
            if (c0052a != null) {
                c0052a.b();
            }
        }

        public static /* synthetic */ List c(a aVar, String str) {
            C0052a c0052a = aVar.b.get(str);
            if (c0052a != null) {
                return c0052a.b;
            }
            return null;
        }

        private List<af> a(String str) {
            C0052a c0052a = this.b.get(str);
            if (c0052a != null) {
                return c0052a.b;
            }
            return null;
        }

        private void a(String str, af afVar) {
            C0052a c0052a = this.b.get(str);
            if (c0052a != null) {
                c0052a.a(afVar);
            }
        }

        private static /* synthetic */ boolean d(a aVar, String str) {
            C0052a c0052a = aVar.b.get(str);
            if (c0052a != null) {
                return c0052a.c;
            }
            return false;
        }

        private void a(String str, List<af> list) {
            C0052a c0052a = this.b.get(str);
            if (c0052a != null) {
                c0052a.a(list);
            }
        }

        private static /* synthetic */ void a(a aVar, String str, com.anythink.core.c.d dVar, List list) {
            C0052a c0052a = new C0052a();
            c0052a.a = dVar;
            CopyOnWriteArrayList<af> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.addAll(list);
            c0052a.b = copyOnWriteArrayList;
            aVar.b.put(str, c0052a);
        }

        private static /* synthetic */ void a(a aVar, String str, af afVar) {
            C0052a c0052a = aVar.b.get(str);
            if (c0052a != null) {
                c0052a.a(afVar);
            }
        }

        public static /* synthetic */ void a(a aVar, String str, List list) {
            C0052a c0052a = aVar.b.get(str);
            if (c0052a != null) {
                c0052a.a(list);
            }
        }
    }

    private u() {
    }

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            if (a == null) {
                a = new u();
            }
            uVar = a;
        }
        return uVar;
    }

    public final synchronized void b(String str, String str2, List<af> list) {
        a aVar = this.b.get(str);
        if (aVar == null) {
            return;
        }
        a.a(aVar, str2, list);
        a(str, str2, list);
    }

    public final synchronized void a(String str, String str2, com.anythink.core.c.d dVar, List<af> list) {
        a aVar = this.b.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        a.C0052a c0052a = aVar.b.get(str2);
        boolean z = c0052a != null ? c0052a.c : false;
        a.C0052a c0052a2 = new a.C0052a();
        c0052a2.a = dVar;
        CopyOnWriteArrayList<af> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(list);
        c0052a2.b = copyOnWriteArrayList;
        aVar.b.put(str2, c0052a2);
        aVar.a = str2;
        this.b.put(str, aVar);
        aVar.d(str2);
        if (z) {
            a.b(aVar, str2);
        }
    }

    public final List<af> b(String str, String str2) {
        a aVar = this.b.get(str);
        if (aVar != null) {
            return a.c(aVar, str2);
        }
        return null;
    }

    public final String b(String str) {
        a aVar = this.b.get(str);
        return aVar != null ? aVar.a : "";
    }

    public final synchronized void a(String str, String str2, List<af> list) {
        a aVar = this.b.get(str);
        if (aVar == null) {
            return;
        }
        for (af afVar : list) {
            a.C0052a c0052a = aVar.b.get(str2);
            if (c0052a != null) {
                c0052a.a(afVar);
            }
        }
    }

    public final synchronized void a(String str, String str2, af afVar) {
        a aVar = this.b.get(str);
        if (aVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(afVar);
        a.a(aVar, str2, arrayList);
    }

    public final synchronized void a(String str, String str2) {
        a aVar = this.b.get(str);
        if (aVar == null) {
            return;
        }
        a.b(aVar, str2);
    }

    public final List<af> a(String str) {
        a aVar = this.b.get(str);
        if (aVar != null && a.c(aVar, aVar.a) != null) {
            List c = a.c(aVar, aVar.a);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c);
            return arrayList;
        }
        com.anythink.core.c.d a2 = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(str);
        if (a2 != null) {
            return a2.A();
        }
        return null;
    }
}