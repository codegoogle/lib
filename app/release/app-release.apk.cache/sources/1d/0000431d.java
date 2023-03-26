package com.p7700g.p99005;

import com.p7700g.p99005.hp1;
import com.p7700g.p99005.ip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes2.dex */
public class fu1 {
    private final hu1 a;
    private final a b;

    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: classes2.dex */
    public static class a {
        private final Map<Class<?>, C0176a<?>> a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.p7700g.p99005.fu1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0176a<Model> {
            public final List<du1<Model, ?>> a;

            public C0176a(List<du1<Model, ?>> list) {
                this.a = list;
            }
        }

        public void a() {
            this.a.clear();
        }

        @z1
        public <Model> List<du1<Model, ?>> b(Class<Model> cls) {
            C0176a<?> c0176a = this.a.get(cls);
            if (c0176a == null) {
                return null;
            }
            return (List<du1<Model, ?>>) c0176a.a;
        }

        public <Model> void c(Class<Model> cls, List<du1<Model, ?>> list) {
            if (this.a.put(cls, new C0176a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public fu1(@x1 ip.a<List<Throwable>> aVar) {
        this(new hu1(aVar));
    }

    @x1
    private static <A> Class<A> c(@x1 A a2) {
        return (Class<A>) a2.getClass();
    }

    @x1
    private synchronized <A> List<du1<A, ?>> f(@x1 Class<A> cls) {
        List<du1<A, ?>> b;
        b = this.b.b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.a.e(cls));
            this.b.c(cls, b);
        }
        return b;
    }

    private <Model, Data> void j(@x1 List<eu1<? extends Model, ? extends Data>> list) {
        for (eu1<? extends Model, ? extends Data> eu1Var : list) {
            eu1Var.a();
        }
    }

    public synchronized <Model, Data> void a(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        this.a.b(cls, cls2, eu1Var);
        this.b.a();
    }

    public synchronized <Model, Data> du1<Model, Data> b(@x1 Class<Model> cls, @x1 Class<Data> cls2) {
        return this.a.d(cls, cls2);
    }

    @x1
    public synchronized List<Class<?>> d(@x1 Class<?> cls) {
        return this.a.g(cls);
    }

    @x1
    public <A> List<du1<A, ?>> e(@x1 A a2) {
        List<du1<A, ?>> f = f(c(a2));
        if (!f.isEmpty()) {
            int size = f.size();
            List<du1<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                du1<A, ?> du1Var = f.get(i);
                if (du1Var.a(a2)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(du1Var);
                }
            }
            if (emptyList.isEmpty()) {
                throw new hp1.c(a2, f);
            }
            return emptyList;
        }
        throw new hp1.c(a2);
    }

    public synchronized <Model, Data> void g(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        this.a.i(cls, cls2, eu1Var);
        this.b.a();
    }

    public synchronized <Model, Data> void h(@x1 Class<Model> cls, @x1 Class<Data> cls2) {
        j(this.a.j(cls, cls2));
        this.b.a();
    }

    public synchronized <Model, Data> void i(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        j(this.a.k(cls, cls2, eu1Var));
        this.b.a();
    }

    private fu1(@x1 hu1 hu1Var) {
        this.b = new a();
        this.a = hu1Var;
    }
}