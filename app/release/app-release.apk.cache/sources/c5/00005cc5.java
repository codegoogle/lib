package com.p7700g.p99005;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LazySingletonContextProvider.java */
/* loaded from: classes3.dex */
public abstract class su3<T> implements jy3<om4, Type> {
    private final Class<T> a;
    private final AtomicReference<T> b = new AtomicReference<>();

    /* compiled from: LazySingletonContextProvider.java */
    /* loaded from: classes3.dex */
    public class a implements iy3<T> {
        public a() {
        }

        @Override // com.p7700g.p99005.iy3
        public T getValue() {
            return (T) su3.this.d();
        }
    }

    public su3(Class<T> cls) {
        this.a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public T d() {
        T t = this.b.get();
        if (t == null) {
            this.b.compareAndSet(null, f());
            return this.b.get();
        }
        return t;
    }

    @Override // com.p7700g.p99005.jy3
    public rv3 a() {
        return rv3.Singleton;
    }

    @Override // com.p7700g.p99005.jy3
    /* renamed from: e */
    public iy3<T> b(mv3 mv3Var, om4 om4Var, Type type) {
        if (type == this.a) {
            return new a();
        }
        return null;
    }

    public abstract T f();
}