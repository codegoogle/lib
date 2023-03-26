package com.p7700g.p99005;

import java.lang.reflect.Type;

/* compiled from: ThreadLocalSingletonContextProvider.java */
/* loaded from: classes3.dex */
public abstract class vu3<T> implements jy3<om4, Type> {
    private final Class<T> a;
    private final ThreadLocal<T> b = new a();

    /* compiled from: ThreadLocalSingletonContextProvider.java */
    /* loaded from: classes3.dex */
    public class a extends ThreadLocal<T> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        public synchronized T initialValue() {
            return (T) vu3.this.e();
        }
    }

    /* compiled from: ThreadLocalSingletonContextProvider.java */
    /* loaded from: classes3.dex */
    public class b implements iy3<T> {
        public b() {
        }

        @Override // com.p7700g.p99005.iy3
        public T getValue() {
            return (T) vu3.this.b.get();
        }
    }

    public vu3(Class<T> cls) {
        this.a = cls;
    }

    @Override // com.p7700g.p99005.jy3
    public rv3 a() {
        return rv3.Singleton;
    }

    @Override // com.p7700g.p99005.jy3
    /* renamed from: d */
    public iy3<T> b(mv3 mv3Var, om4 om4Var, Type type) {
        if (type == this.a) {
            return new b();
        }
        return null;
    }

    public abstract T e();
}