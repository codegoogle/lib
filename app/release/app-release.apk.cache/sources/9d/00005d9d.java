package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SetFactory.java */
/* loaded from: classes2.dex */
public final class t62<T> implements h62<Set<T>> {
    private static final h62<Set<Object>> a = k62.a(Collections.emptySet());
    private final List<ol4<T>> b;
    private final List<ol4<Collection<T>>> c;

    /* compiled from: SetFactory.java */
    /* loaded from: classes2.dex */
    public static final class b<T> {
        public static final /* synthetic */ boolean a = false;
        private final List<ol4<T>> b;
        private final List<ol4<Collection<T>>> c;

        public b<T> a(ol4<? extends Collection<? extends T>> ol4Var) {
            this.c.add(ol4Var);
            return this;
        }

        public b<T> b(ol4<? extends T> ol4Var) {
            this.b.add(ol4Var);
            return this;
        }

        public t62<T> c() {
            return new t62<>(this.b, this.c);
        }

        private b(int i, int i2) {
            this.b = e62.e(i);
            this.c = e62.e(i2);
        }
    }

    public static <T> b<T> a(int i, int i2) {
        return new b<>(i, i2);
    }

    public static <T> h62<Set<T>> b() {
        return (h62<Set<T>>) a;
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: c */
    public Set<T> get() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.c.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c = e62.c(size);
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            c.add(q62.b(this.b.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                c.add(q62.b(obj));
            }
        }
        return Collections.unmodifiableSet(c);
    }

    private t62(List<ol4<T>> list, List<ol4<Collection<T>>> list2) {
        this.b = list;
        this.c = list2;
    }
}