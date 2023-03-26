package com.p7700g.p99005;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: GenericEntity.java */
/* loaded from: classes3.dex */
public class rm4<T> {
    public final Class<?> a;
    public final Type b;
    public final T c;

    public rm4(T t) {
        if (t != null) {
            this.c = t;
            this.b = d(getClass());
            this.a = t.getClass();
            return;
        }
        throw new IllegalArgumentException("The entity must not be null");
    }

    private void a(Class<?> cls, Type type) {
        if (type instanceof Class) {
            if (((Class) type).isAssignableFrom(cls)) {
                return;
            }
        } else if (type instanceof ParameterizedType) {
            a(cls, ((ParameterizedType) type).getRawType());
            return;
        } else if (cls.isArray() && (type instanceof GenericArrayType)) {
            a(cls.getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            return;
        }
        throw new IllegalArgumentException("The type is incompatible with the class of the entity");
    }

    private static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final T b() {
        return this.c;
    }

    public final Class<?> c() {
        return this.a;
    }

    public final Type e() {
        return this.b;
    }

    public rm4(T t, Type type) {
        if (t != null && type != null) {
            this.c = t;
            Class<?> cls = t.getClass();
            this.a = cls;
            a(cls, type);
            this.b = type;
            return;
        }
        throw new IllegalArgumentException("Arguments must not be null");
    }
}