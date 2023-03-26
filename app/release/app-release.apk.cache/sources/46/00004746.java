package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.hp1;
import com.p7700g.p99005.ip;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes2.dex */
public class hu1 {
    private static final c a = new c();
    private static final du1<Object, Object> b = new a();
    private final List<b<?, ?>> c;
    private final c d;
    private final Set<b<?, ?>> e;
    private final ip.a<List<Throwable>> f;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes2.dex */
    public static class a implements du1<Object, Object> {
        @Override // com.p7700g.p99005.du1
        public boolean a(@x1 Object obj) {
            return false;
        }

        @Override // com.p7700g.p99005.du1
        @z1
        public du1.a<Object> b(@x1 Object obj, int i, int i2, @x1 jq1 jq1Var) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes2.dex */
    public static class b<Model, Data> {
        private final Class<Model> a;
        public final Class<Data> b;
        public final eu1<? extends Model, ? extends Data> c;

        public b(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
            this.a = cls;
            this.b = cls2;
            this.c = eu1Var;
        }

        public boolean a(@x1 Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(@x1 Class<?> cls, @x1 Class<?> cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes2.dex */
    public static class c {
        @x1
        public <Model, Data> gu1<Model, Data> a(@x1 List<du1<Model, Data>> list, @x1 ip.a<List<Throwable>> aVar) {
            return new gu1<>(list, aVar);
        }
    }

    public hu1(@x1 ip.a<List<Throwable>> aVar) {
        this(aVar, a);
    }

    private <Model, Data> void a(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, eu1Var);
        List<b<?, ?>> list = this.c;
        list.add(z ? list.size() : 0, bVar);
    }

    @x1
    private <Model, Data> du1<Model, Data> c(@x1 b<?, ?> bVar) {
        return (du1) x02.d(bVar.c.c(this));
    }

    @x1
    private static <Model, Data> du1<Model, Data> f() {
        return (du1<Model, Data>) b;
    }

    @x1
    private <Model, Data> eu1<Model, Data> h(@x1 b<?, ?> bVar) {
        return (eu1<Model, Data>) bVar.c;
    }

    public synchronized <Model, Data> void b(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        a(cls, cls2, eu1Var, true);
    }

    @x1
    public synchronized <Model, Data> du1<Model, Data> d(@x1 Class<Model> cls, @x1 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.c) {
                if (this.e.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.e.add(bVar);
                    arrayList.add(c(bVar));
                    this.e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.d.a(arrayList, this.f);
            } else if (arrayList.size() == 1) {
                return (du1) arrayList.get(0);
            } else if (z) {
                return f();
            } else {
                throw new hp1.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
    }

    @x1
    public synchronized <Model> List<du1<Model, ?>> e(@x1 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.c) {
                if (!this.e.contains(bVar) && bVar.a(cls)) {
                    this.e.add(bVar);
                    arrayList.add(c(bVar));
                    this.e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
        return arrayList;
    }

    @x1
    public synchronized List<Class<?>> g(@x1 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.c) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> void i(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        a(cls, cls2, eu1Var, false);
    }

    @x1
    public synchronized <Model, Data> List<eu1<? extends Model, ? extends Data>> j(@x1 Class<Model> cls, @x1 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.c.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @x1
    public synchronized <Model, Data> List<eu1<? extends Model, ? extends Data>> k(@x1 Class<Model> cls, @x1 Class<Data> cls2, @x1 eu1<? extends Model, ? extends Data> eu1Var) {
        List<eu1<? extends Model, ? extends Data>> j;
        j = j(cls, cls2);
        b(cls, cls2, eu1Var);
        return j;
    }

    @r2
    public hu1(@x1 ip.a<List<Throwable>> aVar, @x1 c cVar) {
        this.c = new ArrayList();
        this.e = new HashSet();
        this.f = aVar;
        this.d = cVar;
    }
}