package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: Utils.java */
/* loaded from: classes4.dex */
public final class c06 {
    public static final Type[] a = new Type[0];

    /* compiled from: Utils.java */
    /* loaded from: classes4.dex */
    public static final class a implements GenericArrayType {
        private final Type s;

        public a(Type type) {
            this.s = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && c06.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.s;
        }

        public int hashCode() {
            return this.s.hashCode();
        }

        public String toString() {
            return c06.t(this.s) + zq5.e;
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes4.dex */
    public static final class b implements ParameterizedType {
        @Nullable
        private final Type s;
        private final Type t;
        private final Type[] u;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                c06.b(type3);
            }
            this.s = type;
            this.t = type2;
            this.u = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && c06.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.u.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.s;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.t;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.u) ^ this.t.hashCode();
            Type type = this.s;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.u;
            if (typeArr.length == 0) {
                return c06.t(this.t);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(c06.t(this.t));
            sb.append("<");
            sb.append(c06.t(this.u[0]));
            for (int i = 1; i < this.u.length; i++) {
                sb.append(", ");
                sb.append(c06.t(this.u[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes4.dex */
    public static final class c implements WildcardType {
        private final Type s;
        @Nullable
        private final Type t;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Objects.requireNonNull(typeArr2[0]);
                        c06.b(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.t = typeArr2[0];
                            this.s = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Objects.requireNonNull(typeArr[0]);
                    c06.b(typeArr[0]);
                    this.t = null;
                    this.s = typeArr[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && c06.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.t;
            return type != null ? new Type[]{type} : c06.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.s};
        }

        public int hashCode() {
            Type type = this.t;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.s.hashCode() + 31);
        }

        public String toString() {
            if (this.t != null) {
                StringBuilder G = wo1.G("? super ");
                G.append(c06.t(this.t));
                return G.toString();
            } else if (this.s == Object.class) {
                return "?";
            } else {
                StringBuilder G2 = wo1.G("? extends ");
                G2.append(c06.t(this.s));
                return G2.toString();
            }
        }
    }

    private c06() {
    }

    public static kr5 a(kr5 kr5Var) throws IOException {
        sv5 sv5Var = new sv5();
        kr5Var.A().F1(sv5Var);
        return kr5.m(kr5Var.k(), kr5Var.j(), sv5Var);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @Nullable
    private static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type f(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static Type g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder H = wo1.H("Index ", i, " not in range [0,");
        H.append(actualTypeArguments.length);
        H.append(") for ");
        H.append(parameterizedType);
        throw new IllegalArgumentException(H.toString());
    }

    public static Class<?> h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return h(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return q(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? pg1.d : type.getClass().getName()));
        }
    }

    private static int k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException m(Method method, String str, Object... objArr) {
        return n(method, null, str, objArr);
    }

    public static RuntimeException n(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder L = wo1.L(String.format(str, objArr), "\n    for method ");
        L.append(method.getDeclaringClass().getSimpleName());
        L.append(CryptoConstants.ALIAS_SEPARATOR);
        L.append(method.getName());
        return new IllegalArgumentException(L.toString(), th);
    }

    public static RuntimeException o(Method method, int i, String str, Object... objArr) {
        StringBuilder L = wo1.L(str, " (parameter #");
        L.append(i + 1);
        L.append(")");
        return m(method, L.toString(), objArr);
    }

    public static RuntimeException p(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder L = wo1.L(str, " (parameter #");
        L.append(i + 1);
        L.append(")");
        return n(method, th, L.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type q(Type type, Class<?> cls, Type type2) {
        Type type3;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type r = r(type, cls, typeVariable);
            if (r == typeVariable) {
                return r;
            }
            type3 = r;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type q = q(type, cls, componentType);
                return componentType == q ? cls2 : new a(q);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type q2 = q(type, cls, genericComponentType);
            return genericComponentType == q2 ? genericArrayType : new a(q2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type q3 = q(type, cls, ownerType);
            boolean z = q3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type q4 = q(type, cls, actualTypeArguments[i]);
                if (q4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = q4;
                }
            }
            return z ? new b(q3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type3 instanceof WildcardType;
        WildcardType wildcardType = type3;
        if (z2) {
            WildcardType wildcardType2 = (WildcardType) type3;
            Type[] lowerBounds = wildcardType2.getLowerBounds();
            Type[] upperBounds = wildcardType2.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type q5 = q(type, cls, lowerBounds[0]);
                wildcardType = wildcardType2;
                if (q5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{q5});
                }
            } else {
                wildcardType = wildcardType2;
                if (upperBounds.length == 1) {
                    Type q6 = q(type, cls, upperBounds[0]);
                    wildcardType = wildcardType2;
                    if (q6 != upperBounds[0]) {
                        return new c(new Type[]{q6}, a);
                    }
                }
            }
        }
        return wildcardType;
    }

    private static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c2 = c(typeVariable);
        if (c2 == null) {
            return typeVariable;
        }
        Type e = e(type, cls, c2);
        if (e instanceof ParameterizedType) {
            return ((ParameterizedType) e).getActualTypeArguments()[k(c2.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    public static void s(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (th instanceof LinkageError) {
                    throw ((LinkageError) th);
                }
                return;
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}