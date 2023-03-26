package com.p7700g.p99005;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LoadPathCache.java */
/* loaded from: classes2.dex */
public class ny1 {
    private static final as1<?, ?, ?> a = new as1<>(Object.class, Object.class, Object.class, Collections.singletonList(new pr1(Object.class, Object.class, Object.class, Collections.emptyList(), new jx1(), null)), null);
    private final q7<w02, as1<?, ?, ?>> b = new q7<>();
    private final AtomicReference<w02> c = new AtomicReference<>();

    private w02 b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        w02 andSet = this.c.getAndSet(null);
        if (andSet == null) {
            andSet = new w02();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    @z1
    public <Data, TResource, Transcode> as1<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        as1<Data, TResource, Transcode> as1Var;
        w02 b = b(cls, cls2, cls3);
        synchronized (this.b) {
            as1Var = (as1<Data, TResource, Transcode>) this.b.get(b);
        }
        this.c.set(b);
        return as1Var;
    }

    public boolean c(@z1 as1<?, ?, ?> as1Var) {
        return a.equals(as1Var);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @z1 as1<?, ?, ?> as1Var) {
        synchronized (this.b) {
            q7<w02, as1<?, ?, ?>> q7Var = this.b;
            w02 w02Var = new w02(cls, cls2, cls3);
            if (as1Var == null) {
                as1Var = a;
            }
            q7Var.put(w02Var, as1Var);
        }
    }
}