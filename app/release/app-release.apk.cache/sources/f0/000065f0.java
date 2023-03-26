package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes3.dex */
public class xo2 extends qo2 implements op2 {
    private static final er2<Set<Object>> a = mo2.a;
    private final Map<so2<?>, er2<?>> b;
    private final Map<Class<?>, er2<?>> c;
    private final Map<Class<?>, fp2<?>> d;
    private final List<er2<wo2>> e;
    private final cp2 f;
    private final AtomicReference<Boolean> g;

    /* compiled from: ComponentRuntime.java */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Executor a;
        private final List<er2<wo2>> b = new ArrayList();
        private final List<so2<?>> c = new ArrayList();

        public b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ wo2 e(wo2 wo2Var) {
            return wo2Var;
        }

        public b a(so2<?> so2Var) {
            this.c.add(so2Var);
            return this;
        }

        public b b(final wo2 wo2Var) {
            this.b.add(new er2() { // from class: com.p7700g.p99005.io2
                @Override // com.p7700g.p99005.er2
                public final Object get() {
                    return wo2.this;
                }
            });
            return this;
        }

        public b c(Collection<er2<wo2>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public xo2 d() {
            return new xo2(this.a, this.b, this.c);
        }
    }

    public static b g(Executor executor) {
        return new b(executor);
    }

    private void h(List<so2<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<er2<wo2>> it = this.e.iterator();
            while (it.hasNext()) {
                try {
                    wo2 wo2Var = it.next().get();
                    if (wo2Var != null) {
                        list.addAll(wo2Var.getComponents());
                        it.remove();
                    }
                } catch (dp2 unused) {
                    it.remove();
                }
            }
            if (this.b.isEmpty()) {
                yo2.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.b.keySet());
                arrayList2.addAll(list);
                yo2.a(arrayList2);
            }
            for (final so2<?> so2Var : list) {
                this.b.put(so2Var, new ep2(new er2() { // from class: com.p7700g.p99005.go2
                    @Override // com.p7700g.p99005.er2
                    public final Object get() {
                        return xo2.this.n(so2Var);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        r();
    }

    private void i(Map<so2<?>, er2<?>> map, boolean z) {
        for (Map.Entry<so2<?>, er2<?>> entry : map.entrySet()) {
            so2<?> key = entry.getKey();
            er2<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.f.e();
    }

    private static <T> List<T> l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: m */
    public /* synthetic */ Object n(so2 so2Var) {
        return so2Var.d().a(new kp2(so2Var, this));
    }

    public static /* synthetic */ void o(hp2 hp2Var, er2 er2Var) {
        hp2Var.g(er2Var);
    }

    public static /* synthetic */ void p(fp2 fp2Var, er2 er2Var) {
        fp2Var.a(er2Var);
    }

    public static /* synthetic */ wo2 q(wo2 wo2Var) {
        return wo2Var;
    }

    private void r() {
        Boolean bool = this.g.get();
        if (bool != null) {
            i(this.b, bool.booleanValue());
        }
    }

    private void s() {
        for (so2<?> so2Var : this.b.keySet()) {
            for (zo2 zo2Var : so2Var.c()) {
                if (zo2Var.g() && !this.d.containsKey(zo2Var.c())) {
                    this.d.put(zo2Var.c(), fp2.b(Collections.emptySet()));
                } else if (this.c.containsKey(zo2Var.c())) {
                    continue;
                } else if (!zo2Var.f()) {
                    if (!zo2Var.g()) {
                        this.c.put(zo2Var.c(), hp2.b());
                    }
                } else {
                    throw new gp2(String.format("Unsatisfied dependency for component %s: %s", so2Var, zo2Var.c()));
                }
            }
        }
    }

    private List<Runnable> t(List<so2<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (so2<?> so2Var : list) {
            if (so2Var.l()) {
                final er2<?> er2Var = this.b.get(so2Var);
                for (Class<? super Object> cls : so2Var.e()) {
                    if (!this.c.containsKey(cls)) {
                        this.c.put(cls, er2Var);
                    } else {
                        final hp2 hp2Var = (hp2) this.c.get(cls);
                        arrayList.add(new Runnable() { // from class: com.p7700g.p99005.ko2
                            @Override // java.lang.Runnable
                            public final void run() {
                                xo2.o(hp2.this, er2Var);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> u() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<so2<?>, er2<?>> entry : this.b.entrySet()) {
            so2<?> key = entry.getKey();
            if (!key.l()) {
                er2<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.d.containsKey(entry2.getKey())) {
                this.d.put((Class) entry2.getKey(), fp2.b((Collection) entry2.getValue()));
            } else {
                final fp2<?> fp2Var = this.d.get(entry2.getKey());
                for (final er2 er2Var : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.p7700g.p99005.jo2
                        @Override // java.lang.Runnable
                        public final void run() {
                            xo2.p(fp2.this, er2Var);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    private static Iterable<er2<wo2>> v(Iterable<wo2> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final wo2 wo2Var : iterable) {
            arrayList.add(new er2() { // from class: com.p7700g.p99005.ho2
                @Override // com.p7700g.p99005.er2
                public final Object get() {
                    wo2 wo2Var2 = wo2.this;
                    xo2.q(wo2Var2);
                    return wo2Var2;
                }
            });
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.qo2, com.p7700g.p99005.to2
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.p7700g.p99005.to2
    public synchronized <T> er2<T> b(Class<T> cls) {
        ip2.c(cls, "Null interface requested.");
        return (er2<T>) this.c.get(cls);
    }

    @Override // com.p7700g.p99005.op2
    public void c() {
        synchronized (this) {
            if (this.e.isEmpty()) {
                return;
            }
            h(new ArrayList());
        }
    }

    @Override // com.p7700g.p99005.to2
    public synchronized <T> er2<Set<T>> d(Class<T> cls) {
        fp2<?> fp2Var = this.d.get(cls);
        if (fp2Var != null) {
            return fp2Var;
        }
        return (er2<Set<T>>) a;
    }

    @Override // com.p7700g.p99005.qo2, com.p7700g.p99005.to2
    public /* bridge */ /* synthetic */ Set e(Class cls) {
        return super.e(cls);
    }

    @Override // com.p7700g.p99005.to2
    public <T> dr2<T> f(Class<T> cls) {
        er2<T> b2 = b(cls);
        if (b2 == null) {
            return hp2.b();
        }
        if (b2 instanceof hp2) {
            return (hp2) b2;
        }
        return hp2.f(b2);
    }

    @i2({i2.a.TESTS})
    @r2
    public void j() {
        for (er2<?> er2Var : this.b.values()) {
            er2Var.get();
        }
    }

    public void k(boolean z) {
        HashMap hashMap;
        if (this.g.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.b);
            }
            i(hashMap, z);
        }
    }

    @Deprecated
    public xo2(Executor executor, Iterable<wo2> iterable, so2<?>... so2VarArr) {
        this(executor, v(iterable), Arrays.asList(so2VarArr));
    }

    private xo2(Executor executor, Iterable<er2<wo2>> iterable, Collection<so2<?>> collection) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.g = new AtomicReference<>();
        cp2 cp2Var = new cp2(executor);
        this.f = cp2Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(so2.q(cp2Var, cp2.class, mq2.class, lq2.class));
        arrayList.add(so2.q(this, op2.class, new Class[0]));
        for (so2<?> so2Var : collection) {
            if (so2Var != null) {
                arrayList.add(so2Var);
            }
        }
        this.e = l(iterable);
        h(arrayList);
    }
}