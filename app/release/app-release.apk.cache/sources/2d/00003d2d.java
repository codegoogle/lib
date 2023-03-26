package com.p7700g.p99005;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes3.dex */
public class cp2 implements mq2, lq2 {
    @k1("this")
    private final Map<Class<?>, ConcurrentHashMap<kq2<Object>, Executor>> a = new HashMap();
    @k1("this")
    private Queue<jq2<?>> b = new ArrayDeque();
    private final Executor c;

    public cp2(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<kq2<Object>, Executor>> f(jq2<?> jq2Var) {
        ConcurrentHashMap<kq2<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(jq2Var.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public static /* synthetic */ void g(Map.Entry entry, jq2 jq2Var) {
        ((kq2) entry.getKey()).a(jq2Var);
    }

    @Override // com.p7700g.p99005.mq2
    public <T> void a(Class<T> cls, kq2<? super T> kq2Var) {
        b(cls, this.c, kq2Var);
    }

    @Override // com.p7700g.p99005.mq2
    public synchronized <T> void b(Class<T> cls, Executor executor, kq2<? super T> kq2Var) {
        ip2.b(cls);
        ip2.b(kq2Var);
        ip2.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(kq2Var, executor);
    }

    @Override // com.p7700g.p99005.lq2
    public void c(final jq2<?> jq2Var) {
        ip2.b(jq2Var);
        synchronized (this) {
            Queue<jq2<?>> queue = this.b;
            if (queue != null) {
                queue.add(jq2Var);
                return;
            }
            for (final Map.Entry<kq2<Object>, Executor> entry : f(jq2Var)) {
                entry.getValue().execute(new Runnable() { // from class: com.p7700g.p99005.lo2
                    @Override // java.lang.Runnable
                    public final void run() {
                        cp2.g(entry, jq2Var);
                    }
                });
            }
        }
    }

    @Override // com.p7700g.p99005.mq2
    public synchronized <T> void d(Class<T> cls, kq2<? super T> kq2Var) {
        ip2.b(cls);
        ip2.b(kq2Var);
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap<kq2<Object>, Executor> concurrentHashMap = this.a.get(cls);
            concurrentHashMap.remove(kq2Var);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    public void e() {
        Queue<jq2<?>> queue;
        synchronized (this) {
            queue = this.b;
            if (queue != null) {
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (jq2<?> jq2Var : queue) {
                c(jq2Var);
            }
        }
    }
}