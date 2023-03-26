package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PerRequestTypeInjectableProvider.java */
/* loaded from: classes3.dex */
public abstract class ly3<A extends Annotation, T> implements jy3<A, Type> {
    private final Type a;

    public ly3(Type type) {
        this.a = type;
    }

    @Override // com.p7700g.p99005.jy3
    public final rv3 a() {
        return rv3.PerRequest;
    }

    public abstract iy3<T> c(mv3 mv3Var, A a);

    @Override // com.p7700g.p99005.jy3
    /* renamed from: d */
    public final iy3 b(mv3 mv3Var, A a, Type type) {
        if (type.equals(this.a)) {
            return c(mv3Var, a);
        }
        return null;
    }
}