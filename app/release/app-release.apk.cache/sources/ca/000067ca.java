package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes3.dex */
public class yo2 {

    /* compiled from: CycleDetector.java */
    /* loaded from: classes3.dex */
    public static class b {
        private final so2<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        public b(so2<?> so2Var) {
            this.a = so2Var;
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public void b(b bVar) {
            this.c.add(bVar);
        }

        public so2<?> c() {
            return this.a;
        }

        public Set<b> d() {
            return this.b;
        }

        public boolean e() {
            return this.b.isEmpty();
        }

        public boolean f() {
            return this.c.isEmpty();
        }

        public void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    /* compiled from: CycleDetector.java */
    /* loaded from: classes3.dex */
    public static class c {
        private final Class<?> a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.a.equals(this.a) && cVar.b == this.b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }
    }

    public static void a(List<so2<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b2.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c2) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new ap2(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<so2<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (so2<?> so2Var : list) {
            b bVar = new b(so2Var);
            for (Class<? super Object> cls : so2Var.e()) {
                c cVar = new c(cls, !so2Var.l());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (zo2 zo2Var : bVar2.c().c()) {
                    if (zo2Var.e() && (set = (Set) hashMap.get(new c(zo2Var.c(), zo2Var.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}