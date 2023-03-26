package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: SingletonTypeInjectableProvider.java */
/* loaded from: classes3.dex */
public abstract class ny3<A extends Annotation, T> implements jy3<A, Type>, iy3<T> {
    private final Type a;
    private final T b;

    public ny3(Type type, T t) {
        this.a = type;
        this.b = t;
    }

    @Override // com.p7700g.p99005.jy3
    public final rv3 a() {
        return rv3.Singleton;
    }

    @Override // com.p7700g.p99005.jy3
    /* renamed from: c */
    public final iy3<T> b(mv3 mv3Var, A a, Type type) {
        if (type.equals(this.a)) {
            return this;
        }
        return null;
    }

    @Override // com.p7700g.p99005.iy3
    public final T getValue() {
        return this.b;
    }
}