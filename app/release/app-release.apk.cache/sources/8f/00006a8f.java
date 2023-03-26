package com.squareup.moshi;

import com.p7700g.p99005.pg1;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes3.dex */
public final class Types {
    private Types() {
    }

    public static Type arrayComponentType(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static GenericArrayType arrayOf(Type type) {
        return new Util.GenericArrayTypeImpl(type);
    }

    public static Type collectionElementType(Type type, Class<?> cls) {
        Type supertype = getSupertype(type, cls, Collection.class);
        if (supertype instanceof WildcardType) {
            supertype = ((WildcardType) supertype).getUpperBounds()[0];
        }
        if (supertype instanceof ParameterizedType) {
            return ((ParameterizedType) supertype).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static <T extends Annotation> T createJsonQualifierImplementation(final Class<T> cls) {
        if (cls.isAnnotation()) {
            if (cls.isAnnotationPresent(JsonQualifier.class)) {
                if (cls.getDeclaredMethods().length == 0) {
                    return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.squareup.moshi.Types.1
                        @Override // java.lang.reflect.InvocationHandler
                        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                            String name = method.getName();
                            name.hashCode();
                            name.hashCode();
                            char c = 65535;
                            switch (name.hashCode()) {
                                case -1776922004:
                                    if (name.equals("toString")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -1295482945:
                                    if (name.equals("equals")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 147696667:
                                    if (name.equals("hashCode")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 1444986633:
                                    if (name.equals("annotationType")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    StringBuilder G = wo1.G("@");
                                    G.append(cls.getName());
                                    G.append("()");
                                    return G.toString();
                                case 1:
                                    return Boolean.valueOf(cls.isInstance(objArr[0]));
                                case 2:
                                    return 0;
                                case 3:
                                    return cls;
                                default:
                                    return method.invoke(obj, objArr);
                            }
                        }
                    });
                }
                throw new IllegalArgumentException(cls + " must not declare methods.");
            }
            throw new IllegalArgumentException(cls + " must have @JsonQualifier.");
        }
        throw new IllegalArgumentException(cls + " must be an annotation.");
    }

    public static boolean equals(@Nullable Type type, @Nullable Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return equals(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (parameterizedType instanceof Util.ParameterizedTypeImpl) {
                    actualTypeArguments = ((Util.ParameterizedTypeImpl) parameterizedType).typeArguments;
                } else {
                    actualTypeArguments = parameterizedType.getActualTypeArguments();
                }
                if (parameterizedType2 instanceof Util.ParameterizedTypeImpl) {
                    actualTypeArguments2 = ((Util.ParameterizedTypeImpl) parameterizedType2).typeArguments;
                } else {
                    actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                }
                return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return equals(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static String generatedJsonAdapterName(Class<?> cls) {
        if (cls.getAnnotation(JsonClass.class) != null) {
            return generatedJsonAdapterName(cls.getName());
        }
        throw new IllegalArgumentException("Class does not have a JsonClass annotation: " + cls);
    }

    public static Set<? extends Annotation> getFieldJsonQualifierAnnotations(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            LinkedHashSet linkedHashSet = new LinkedHashSet(declaredAnnotations.length);
            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (NoSuchFieldException e) {
            StringBuilder M = wo1.M("Could not access field ", str, " on class ");
            M.append(cls.getCanonicalName());
            throw new IllegalArgumentException(M.toString(), e);
        }
    }

    public static Type getGenericSuperclass(Type type) {
        Class<?> rawType = getRawType(type);
        return Util.resolve(type, rawType, rawType.getGenericSuperclass());
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? pg1.d : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return Util.resolve(type, cls, Util.getGenericSupertype(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static Type[] mapKeyAndValueTypes(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type supertype = getSupertype(type, cls, Map.class);
        return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static ParameterizedType newParameterizedType(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(type, type2, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type2);
    }

    @Nullable
    public static Set<? extends Annotation> nextAnnotations(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (cls.isAnnotationPresent(JsonQualifier.class)) {
            if (set.isEmpty()) {
                return null;
            }
            for (Annotation annotation : set) {
                if (cls.equals(annotation.annotationType())) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                    linkedHashSet.remove(annotation);
                    return Collections.unmodifiableSet(linkedHashSet);
                }
            }
            return null;
        }
        throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
    }

    public static WildcardType subtypeOf(Type type) {
        return new Util.WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, Util.EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type) {
        return new Util.WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String generatedJsonAdapterName(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }
}