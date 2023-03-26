package com.p7700g.p99005;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes2.dex */
public final class qs1 implements is1 {
    private static final int b = 4194304;
    @r2
    public static final int c = 8;
    private static final int d = 2;
    private final os1<a, Object> e;
    private final b f;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> g;
    private final Map<Class<?>, hs1<?>> h;
    private final int i;
    private int j;

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes2.dex */
    public static final class a implements ts1 {
        private final b a;
        public int b;
        private Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.p7700g.p99005.ts1
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder G = wo1.G("Key{size=");
            G.append(this.b);
            G.append("array=");
            G.append(this.c);
            G.append('}');
            return G.toString();
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes2.dex */
    public static final class b extends ks1<a> {
        @Override // com.p7700g.p99005.ks1
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i, Class<?> cls) {
            a b = b();
            b.b(i, cls);
            return b;
        }
    }

    @r2
    public qs1() {
        this.e = new os1<>();
        this.f = new b();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = 4194304;
    }

    private void a(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> o = o(cls);
        Integer num = (Integer) o.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                o.remove(Integer.valueOf(i));
                return;
            } else {
                o.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    private void b() {
        i(this.i);
    }

    private void i(int i) {
        while (this.j > i) {
            Object f = this.e.f();
            x02.d(f);
            hs1 j = j(f);
            this.j -= j.a() * j.b(f);
            a(j.b(f), f.getClass());
            if (Log.isLoggable(j.getTag(), 2)) {
                j.getTag();
                j.b(f);
            }
        }
    }

    private <T> hs1<T> j(T t) {
        return k(t.getClass());
    }

    private <T> hs1<T> k(Class<T> cls) {
        ps1 ps1Var = (hs1<T>) this.h.get(cls);
        if (ps1Var == null) {
            if (cls.equals(int[].class)) {
                ps1Var = new ps1();
            } else if (cls.equals(byte[].class)) {
                ps1Var = new ns1();
            } else {
                StringBuilder G = wo1.G("No array pool found for: ");
                G.append(cls.getSimpleName());
                throw new IllegalArgumentException(G.toString());
            }
            this.h.put(cls, ps1Var);
        }
        return ps1Var;
    }

    @z1
    private <T> T l(a aVar) {
        return (T) this.e.a(aVar);
    }

    private <T> T n(a aVar, Class<T> cls) {
        hs1<T> k = k(cls);
        T t = (T) l(aVar);
        if (t != null) {
            this.j -= k.a() * k.b(t);
            a(k.b(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(k.getTag(), 2)) {
                k.getTag();
                int i = aVar.b;
            }
            return k.newArray(aVar.b);
        }
        return t;
    }

    private NavigableMap<Integer, Integer> o(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.g.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.g.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private boolean p() {
        int i = this.j;
        return i == 0 || this.i / i >= 2;
    }

    private boolean q(int i) {
        return i <= this.i / 2;
    }

    private boolean r(int i, Integer num) {
        return num != null && (p() || num.intValue() <= i * 8);
    }

    @Override // com.p7700g.p99005.is1
    public synchronized void c(int i) {
        try {
            if (i >= 40) {
                d();
            } else if (i >= 20 || i == 15) {
                i(this.i / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p7700g.p99005.is1
    public synchronized void d() {
        i(0);
    }

    @Override // com.p7700g.p99005.is1
    public synchronized <T> T e(int i, Class<T> cls) {
        return (T) n(this.f.e(i, cls), cls);
    }

    @Override // com.p7700g.p99005.is1
    public synchronized <T> void f(T t) {
        Class<?> cls = t.getClass();
        hs1<T> k = k(cls);
        int b2 = k.b(t);
        int a2 = k.a() * b2;
        if (q(a2)) {
            a e = this.f.e(b2, cls);
            this.e.d(e, t);
            NavigableMap<Integer, Integer> o = o(cls);
            Integer num = (Integer) o.get(Integer.valueOf(e.b));
            Integer valueOf = Integer.valueOf(e.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            o.put(valueOf, Integer.valueOf(i));
            this.j += a2;
            b();
        }
    }

    @Override // com.p7700g.p99005.is1
    @Deprecated
    public <T> void g(T t, Class<T> cls) {
        f(t);
    }

    @Override // com.p7700g.p99005.is1
    public synchronized <T> T h(int i, Class<T> cls) {
        a e;
        Integer ceilingKey = o(cls).ceilingKey(Integer.valueOf(i));
        if (r(i, ceilingKey)) {
            e = this.f.e(ceilingKey.intValue(), cls);
        } else {
            e = this.f.e(i, cls);
        }
        return (T) n(e, cls);
    }

    public int m() {
        int i = 0;
        for (Class<?> cls : this.g.keySet()) {
            for (Integer num : this.g.get(cls).keySet()) {
                hs1 k = k(cls);
                int intValue = num.intValue();
                i += k.a() * ((Integer) this.g.get(cls).get(num)).intValue() * intValue;
            }
        }
        return i;
    }

    public qs1(int i) {
        this.e = new os1<>();
        this.f = new b();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = i;
    }
}