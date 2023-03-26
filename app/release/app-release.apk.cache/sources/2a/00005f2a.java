package com.p7700g.p99005;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes2.dex */
public class u02<T, Y> {
    private final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    /* compiled from: LruCache.java */
    /* loaded from: classes2.dex */
    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public u02(long j) {
        this.b = j;
        this.c = j;
    }

    private void j() {
        q(this.c);
    }

    public synchronized long a() {
        return this.d;
    }

    public void d() {
        q(0L);
    }

    public synchronized void e(float f) {
        if (f >= 0.0f) {
            this.c = Math.round(((float) this.b) * f);
            j();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    public synchronized long f() {
        return this.c;
    }

    public synchronized boolean i(@x1 T t) {
        return this.a.containsKey(t);
    }

    @z1
    public synchronized Y k(@x1 T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public synchronized int l() {
        return this.a.size();
    }

    public int m(@z1 Y y) {
        return 1;
    }

    public void n(@x1 T t, @z1 Y y) {
    }

    @z1
    public synchronized Y o(@x1 T t, @z1 Y y) {
        int m = m(y);
        long j = m;
        if (j >= this.c) {
            n(t, y);
            return null;
        }
        if (y != null) {
            this.d += j;
        }
        a<Y> put = this.a.put(t, y == null ? null : new a<>(y, m));
        if (put != null) {
            this.d -= put.b;
            if (!put.a.equals(y)) {
                n(t, put.a);
            }
        }
        j();
        return put != null ? put.a : null;
    }

    @z1
    public synchronized Y p(@x1 T t) {
        a<Y> remove = this.a.remove(t);
        if (remove == null) {
            return null;
        }
        this.d -= remove.b;
        return remove.a;
    }

    public synchronized void q(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= value.b;
            T key = next.getKey();
            it.remove();
            n(key, value.a);
        }
    }
}