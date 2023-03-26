package com.p7700g.p99005;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypeToken.java */
/* loaded from: classes3.dex */
public class lx2<T> {
    private final Class<? super T> a;
    private final Type b;
    private final int c;

    public lx2() {
        Type h = h();
        this.b = h;
        this.a = (Class<? super T>) rw2.k(h);
        this.c = h.hashCode();
    }

    private static AssertionError a(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static <T> lx2<T> b(Class<T> cls) {
        return new lx2<>(cls);
    }

    public static lx2<?> c(Type type) {
        return new lx2<>(type);
    }

    public static lx2<?> d(Type type) {
        return new lx2<>(rw2.a(type));
    }

    public static lx2<?> e(Type type, Type... typeArr) {
        return new lx2<>(rw2.n(null, type, typeArr));
    }

    private Type h() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            if (genericSuperclass == lx2.class) {
                throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
            }
        } else {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == lx2.class) {
                return rw2.b(parameterizedType.getActualTypeArguments()[0]);
            }
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean l(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type = (Class) type;
                while (type.isArray()) {
                    type = type.getComponentType();
                }
            }
            return m(type, (ParameterizedType) genericComponentType, new HashMap());
        }
        return true;
    }

    private static boolean m(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> k = rw2.k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = k.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type2 = actualTypeArguments[i];
                TypeVariable<Class<?>> typeVariable = typeParameters[i];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (o(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : k.getGenericInterfaces()) {
            if (m(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return m(k.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean n(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean o(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                if (!n(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lx2) && rw2.f(this.b, ((lx2) obj).b);
    }

    public final Class<? super T> f() {
        return this.a;
    }

    public final Type g() {
        return this.b;
    }

    public final int hashCode() {
        return this.c;
    }

    @Deprecated
    public boolean i(lx2<?> lx2Var) {
        return k(lx2Var.g());
    }

    @Deprecated
    public boolean j(Class<?> cls) {
        return k(cls);
    }

    @Deprecated
    public boolean k(Type type) {
        if (type == null) {
            return false;
        }
        if (this.b.equals(type)) {
            return true;
        }
        Type type2 = this.b;
        if (type2 instanceof Class) {
            return this.a.isAssignableFrom(rw2.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return m(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.a.isAssignableFrom(rw2.k(type)) && l(type, (GenericArrayType) this.b);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public final String toString() {
        return rw2.t(this.b);
    }

    private lx2(Type type) {
        Type b = rw2.b((Type) qw2.b(type));
        this.b = b;
        this.a = (Class<? super T>) rw2.k(b);
        this.c = b.hashCode();
    }
}