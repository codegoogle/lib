package com.p7700g.p99005;

import com.p7700g.p99005.sq1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes2.dex */
public class tq1 {
    private static final sq1.a<?> a = new a();
    private final Map<Class<?>, sq1.a<?>> b = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes2.dex */
    public class a implements sq1.a<Object> {
        @Override // com.p7700g.p99005.sq1.a
        @x1
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.p7700g.p99005.sq1.a
        @x1
        public sq1<Object> b(@x1 Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes2.dex */
    public static final class b implements sq1<Object> {
        private final Object a;

        public b(@x1 Object obj) {
            this.a = obj;
        }

        @Override // com.p7700g.p99005.sq1
        @x1
        public Object a() {
            return this.a;
        }

        @Override // com.p7700g.p99005.sq1
        public void b() {
        }
    }

    @x1
    public synchronized <T> sq1<T> a(@x1 T t) {
        sq1.a<?> aVar;
        x02.d(t);
        aVar = this.b.get(t.getClass());
        if (aVar == null) {
            Iterator<sq1.a<?>> it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sq1.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = a;
        }
        return (sq1<T>) aVar.b(t);
    }

    public synchronized void b(@x1 sq1.a<?> aVar) {
        this.b.put(aVar.a(), aVar);
    }
}