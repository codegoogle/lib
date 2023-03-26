package com.p7700g.p99005;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: ServiceMethod.java */
/* loaded from: classes4.dex */
public abstract class zz5<T> {
    public static <T> zz5<T> b(yz5 yz5Var, Method method) {
        wz5 b = wz5.b(yz5Var, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!c06.j(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return oz5.f(yz5Var, method, b);
            }
            throw c06.m(method, "Service methods cannot return void.", new Object[0]);
        }
        throw c06.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}