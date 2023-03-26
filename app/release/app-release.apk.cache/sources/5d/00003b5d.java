package com.p7700g.p99005;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.Map;

/* compiled from: UriBuilder.java */
/* loaded from: classes3.dex */
public abstract class bn4 {
    public static bn4 g(String str) throws IllegalArgumentException {
        bn4 m = m();
        m.p(str);
        return m;
    }

    public static bn4 h(Class<?> cls) throws IllegalArgumentException {
        bn4 m = m();
        m.n(cls);
        return m;
    }

    public static bn4 i(String str) throws IllegalArgumentException {
        try {
            return j(URI.create(str));
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public static bn4 j(URI uri) throws IllegalArgumentException {
        bn4 m = m();
        m.B(uri);
        return m;
    }

    public static bn4 m() {
        return mn4.g().d();
    }

    public abstract bn4 A(String... strArr) throws IllegalArgumentException;

    public abstract bn4 B(URI uri) throws IllegalArgumentException;

    public abstract bn4 C(String str);

    public abstract URI a(Object... objArr) throws IllegalArgumentException, cn4;

    public abstract URI b(Object... objArr) throws IllegalArgumentException, cn4;

    public abstract URI c(Map<String, ? extends Object> map) throws IllegalArgumentException, cn4;

    public abstract URI d(Map<String, ? extends Object> map) throws IllegalArgumentException, cn4;

    @Override // 
    /* renamed from: e */
    public abstract bn4 clone();

    public abstract bn4 f(String str);

    public abstract bn4 k(String str) throws IllegalArgumentException;

    public abstract bn4 l(String str, Object... objArr) throws IllegalArgumentException;

    public abstract bn4 n(Class cls) throws IllegalArgumentException;

    public abstract bn4 o(Class cls, String str) throws IllegalArgumentException;

    public abstract bn4 p(String str) throws IllegalArgumentException;

    public abstract bn4 q(Method method) throws IllegalArgumentException;

    public abstract bn4 r(int i) throws IllegalArgumentException;

    public abstract bn4 s(String str, Object... objArr) throws IllegalArgumentException;

    public abstract bn4 t(String str) throws IllegalArgumentException;

    public abstract bn4 u(String str, Object... objArr) throws IllegalArgumentException;

    public abstract bn4 v(String str);

    public abstract bn4 w(String str) throws IllegalArgumentException;

    public abstract bn4 x(String str, Object... objArr) throws IllegalArgumentException;

    public abstract bn4 y(String str) throws IllegalArgumentException;

    public abstract bn4 z(String str) throws IllegalArgumentException;
}