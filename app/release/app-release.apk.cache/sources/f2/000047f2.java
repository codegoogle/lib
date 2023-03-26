package com.p7700g.p99005;

import java.util.HashMap;
import java.util.Map;

/* compiled from: DepsLocator.java */
/* loaded from: classes.dex */
public class i61 {
    @z1
    private static i61 a;
    @x1
    private final Map<Class, b> b = new HashMap();

    /* compiled from: DepsLocator.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        @z1
        T a(@z1 Map<String, Object> map);
    }

    /* compiled from: DepsLocator.java */
    /* loaded from: classes.dex */
    public static class b {
        @z1
        public final Object a;
        @z1
        public final a b;

        public b(@z1 Object obj, @z1 a aVar) {
            this.a = obj;
            this.b = aVar;
        }
    }

    public static synchronized i61 a() {
        i61 i61Var;
        synchronized (i61.class) {
            if (a == null) {
                a = new i61();
            }
            i61Var = a;
        }
        return i61Var;
    }

    @z1
    public <T> T b(@x1 Class<T> cls) {
        return (T) c(cls, null);
    }

    @z1
    public <T> T c(@x1 Class<T> cls, @z1 Map<String, Object> map) {
        b bVar = this.b.get(cls);
        if (bVar != null) {
            T t = (T) bVar.a;
            if (t != null) {
                return t;
            }
            a aVar = bVar.b;
            if (aVar != null) {
                return (T) aVar.a(map);
            }
            return null;
        }
        return null;
    }

    @x1
    public <T> T d(@x1 Class<T> cls) {
        return (T) e(cls, null);
    }

    @x1
    public <T> T e(@x1 Class<T> cls, @z1 Map<String, Object> map) {
        T t = (T) c(cls, map);
        if (t != null) {
            return t;
        }
        StringBuilder G = wo1.G("Cannot find instance/factory for ");
        G.append(cls.getCanonicalName());
        throw new IllegalArgumentException(G.toString());
    }

    public <T> void f(@x1 Class<T> cls, @x1 a<T> aVar) {
        this.b.put(cls, new b(null, aVar));
    }

    public void g(@x1 Class cls, @x1 Object obj) {
        this.b.put(cls, new b(obj, null));
    }

    @x1
    public <T> T h(@x1 Class<T> cls, @z1 T t, @x1 T t2) {
        if (t == null) {
            this.b.put(cls, new b(t2, null));
            return t2;
        }
        this.b.put(cls, new b(t, null));
        return t;
    }
}