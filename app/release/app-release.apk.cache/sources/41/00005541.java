package com.p7700g.p99005;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ModelToResourceClassCache.java */
/* loaded from: classes2.dex */
public class oy1 {
    private final AtomicReference<w02> a = new AtomicReference<>();
    private final q7<w02, List<Class<?>>> b = new q7<>();

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
    }

    @z1
    public List<Class<?>> b(@x1 Class<?> cls, @x1 Class<?> cls2, @x1 Class<?> cls3) {
        List<Class<?>> list;
        w02 andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new w02(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void c(@x1 Class<?> cls, @x1 Class<?> cls2, @x1 Class<?> cls3, @x1 List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new w02(cls, cls2, cls3), list);
        }
    }
}