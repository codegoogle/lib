package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes3.dex */
public final class so2<T> {
    private final Set<Class<? super T>> a;
    private final Set<zo2> b;
    private final int c;
    private final int d;
    private final vo2<T> e;
    private final Set<Class<?>> f;

    /* compiled from: Component.java */
    /* loaded from: classes3.dex */
    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<zo2> b;
        private int c;
        private int d;
        private vo2<T> e;
        private Set<Class<?>> f;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.d = 1;
            return this;
        }

        private b<T> i(int i) {
            ip2.d(this.c == 0, "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        private void j(Class<?> cls) {
            ip2.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(zo2 zo2Var) {
            ip2.c(zo2Var, "Null dependency");
            j(zo2Var.c());
            this.b.add(zo2Var);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public so2<T> d() {
            ip2.d(this.e != null, "Missing required property: factory.");
            return new so2<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(vo2<T> vo2Var) {
            this.e = (vo2) ip2.c(vo2Var, "Null factory");
            return this;
        }

        public b<T> h(Class<?> cls) {
            this.f.add(cls);
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            ip2.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                ip2.c(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> so2<T> g(final T t, Class<T> cls) {
        return h(cls).f(new vo2() { // from class: com.p7700g.p99005.co2
            @Override // com.p7700g.p99005.vo2
            public final Object a(to2 to2Var) {
                return t;
            }
        }).d();
    }

    public static <T> b<T> h(Class<T> cls) {
        return a(cls).g();
    }

    public static /* synthetic */ Object m(Object obj, to2 to2Var) {
        return obj;
    }

    public static /* synthetic */ Object n(Object obj, to2 to2Var) {
        return obj;
    }

    public static /* synthetic */ Object o(Object obj, to2 to2Var) {
        return obj;
    }

    @Deprecated
    public static <T> so2<T> p(Class<T> cls, final T t) {
        return a(cls).f(new vo2() { // from class: com.p7700g.p99005.do2
            @Override // com.p7700g.p99005.vo2
            public final Object a(to2 to2Var) {
                return t;
            }
        }).d();
    }

    @SafeVarargs
    public static <T> so2<T> q(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return b(cls, clsArr).f(new vo2() { // from class: com.p7700g.p99005.eo2
            @Override // com.p7700g.p99005.vo2
            public final Object a(to2 to2Var) {
                return t;
            }
        }).d();
    }

    public Set<zo2> c() {
        return this.b;
    }

    public vo2<T> d() {
        return this.e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f;
    }

    public boolean i() {
        return this.c == 1;
    }

    public boolean j() {
        return this.c == 2;
    }

    public boolean k() {
        return this.c == 0;
    }

    public boolean l() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }

    private so2(Set<Class<? super T>> set, Set<zo2> set2, int i, int i2, vo2<T> vo2Var, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        this.e = vo2Var;
        this.f = Collections.unmodifiableSet(set3);
    }
}