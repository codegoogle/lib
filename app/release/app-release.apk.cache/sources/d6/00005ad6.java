package com.p7700g.p99005;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* compiled from: $Gson$Types.java */
/* loaded from: classes3.dex */
public final class rw2 {
    public static final Type[] a = new Type[0];
    public static final /* synthetic */ boolean b = false;

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes3.dex */
    public static final class a implements GenericArrayType, Serializable {
        private static final long s = 0;
        private final Type t;

        public a(Type type) {
            this.t = rw2.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && rw2.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.t;
        }

        public int hashCode() {
            return this.t.hashCode();
        }

        public String toString() {
            return rw2.t(this.t) + zq5.e;
        }
    }

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes3.dex */
    public static final class b implements ParameterizedType, Serializable {
        private static final long s = 0;
        private final Type t;
        private final Type u;
        private final Type[] v;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                qw2.a(z);
            }
            this.t = type == null ? null : rw2.b(type);
            this.u = rw2.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.v = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                qw2.b(this.v[i]);
                rw2.c(this.v[i]);
                Type[] typeArr3 = this.v;
                typeArr3[i] = rw2.b(typeArr3[i]);
            }
        }

        private static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && rw2.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.v.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.t;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.u;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.v) ^ this.u.hashCode()) ^ a(this.t);
        }

        public String toString() {
            int length = this.v.length;
            if (length == 0) {
                return rw2.t(this.u);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(rw2.t(this.u));
            sb.append("<");
            sb.append(rw2.t(this.v[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(rw2.t(this.v[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    /* loaded from: classes3.dex */
    public static final class c implements WildcardType, Serializable {
        private static final long s = 0;
        private final Type t;
        private final Type u;

        public c(Type[] typeArr, Type[] typeArr2) {
            qw2.a(typeArr2.length <= 1);
            qw2.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                qw2.b(typeArr2[0]);
                rw2.c(typeArr2[0]);
                qw2.a(typeArr[0] == Object.class);
                this.u = rw2.b(typeArr2[0]);
                this.t = Object.class;
                return;
            }
            qw2.b(typeArr[0]);
            rw2.c(typeArr[0]);
            this.u = null;
            this.t = rw2.b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && rw2.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.u;
            return type != null ? new Type[]{type} : rw2.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.t};
        }

        public int hashCode() {
            Type type = this.u;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.t.hashCode() + 31);
        }

        public String toString() {
            if (this.u != null) {
                StringBuilder G = wo1.G("? super ");
                G.append(rw2.t(this.u));
                return G.toString();
            } else if (this.t == Object.class) {
                return "?";
            } else {
                StringBuilder G2 = wo1.G("? extends ");
                G2.append(rw2.t(this.t));
                return G2.toString();
            }
        }
    }

    private rw2() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void c(Type type) {
        qw2.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f(Type type, Type type2) {
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
                return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type l = l(type, cls, Collection.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    private static Type i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type l = l(type, cls, Map.class);
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            qw2.a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? pg1.d : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    private static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        qw2.a(cls2.isAssignableFrom(cls));
        return o(type, cls, i(type, cls, cls2));
    }

    private static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    public static Type o(Type type, Class<?> cls, Type type2) {
        return p(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00de, code lost:
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e1, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type p(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type n;
        TypeVariable typeVariable = null;
        ?? r11 = type2;
        while (true) {
            if (r11 instanceof TypeVariable) {
                TypeVariable typeVariable2 = r11;
                Type type3 = (Type) map.get(typeVariable2);
                if (type3 != null) {
                    return type3 == Void.TYPE ? r11 : type3;
                }
                map.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                r11 = q(type, cls, typeVariable2);
                r11 = r11;
                if (r11 == typeVariable2) {
                    break;
                }
            } else {
                if (r11 instanceof Class) {
                    Class cls2 = r11;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type p = p(type, cls, componentType, map);
                        if (e(componentType, p)) {
                            r11 = cls2;
                        } else {
                            n = a(p);
                            r11 = n;
                        }
                    }
                }
                if (r11 instanceof GenericArrayType) {
                    r11 = (GenericArrayType) r11;
                    Type genericComponentType = r11.getGenericComponentType();
                    Type p2 = p(type, cls, genericComponentType, map);
                    if (!e(genericComponentType, p2)) {
                        n = a(p2);
                        r11 = n;
                    }
                } else {
                    if (r11 instanceof ParameterizedType) {
                        r11 = (ParameterizedType) r11;
                        Type ownerType = r11.getOwnerType();
                        Type p3 = p(type, cls, ownerType, map);
                        boolean z = !e(p3, ownerType);
                        Type[] actualTypeArguments = r11.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i = 0; i < length; i++) {
                            Type p4 = p(type, cls, actualTypeArguments[i], map);
                            if (!e(p4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = p4;
                            }
                        }
                        if (z) {
                            n = n(p3, r11.getRawType(), actualTypeArguments);
                            r11 = n;
                        }
                    } else if (r11 instanceof WildcardType) {
                        r11 = (WildcardType) r11;
                        Type[] lowerBounds = r11.getLowerBounds();
                        Type[] upperBounds = r11.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type p5 = p(type, cls, lowerBounds[0], map);
                            if (p5 != lowerBounds[0]) {
                                r11 = s(p5);
                            }
                        } else if (upperBounds.length == 1) {
                            Type p6 = p(type, cls, upperBounds[0], map);
                            if (p6 != upperBounds[0]) {
                                r11 = r(p6);
                            }
                        }
                    }
                }
            }
        }
    }

    private static Type q(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type i = i(type, cls, d);
        if (i instanceof ParameterizedType) {
            return ((ParameterizedType) i).getActualTypeArguments()[m(d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    public static WildcardType r(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, a);
    }

    public static WildcardType s(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}