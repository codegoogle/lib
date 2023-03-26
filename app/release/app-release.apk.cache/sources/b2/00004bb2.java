package com.p7700g.p99005;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class k00 {
    @z1
    private final Map<String, Object> a;
    @z1
    private final Set<Closeable> b;
    private volatile boolean c;

    public k00() {
        this.a = new HashMap();
        this.b = new LinkedHashSet();
        this.c = false;
    }

    private static void c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void a(@x1 Closeable closeable) {
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                this.b.add(closeable);
            }
        }
    }

    @u1
    public final void b() {
        this.c = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.a.values()) {
                    c(obj);
                }
            }
        }
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.b) {
                    c(closeable);
                }
            }
        }
        e();
    }

    public <T> T d(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    public void e() {
    }

    public <T> T f(String str, T t) {
        Object obj;
        synchronized (this.a) {
            obj = this.a.get(str);
            if (obj == null) {
                this.a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.c) {
            c(t);
        }
        return t;
    }

    public k00(@x1 Closeable... closeableArr) {
        this.a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}