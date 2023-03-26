package com.anythink.expressad.foundation.g.f;

/* loaded from: classes2.dex */
public final class k<T> {
    public T a;
    public com.anythink.expressad.foundation.g.f.a.a b;
    public com.anythink.expressad.foundation.g.f.f.c c;

    private k(T t, com.anythink.expressad.foundation.g.f.f.c cVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = t;
        this.c = cVar;
    }

    private boolean a() {
        return this.b == null;
    }

    public static <T> k<T> a(T t, com.anythink.expressad.foundation.g.f.f.c cVar) {
        return new k<>(t, cVar);
    }

    public static <T> k<T> a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return new k<>(aVar);
    }

    private k(com.anythink.expressad.foundation.g.f.a.a aVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.b = aVar;
    }
}