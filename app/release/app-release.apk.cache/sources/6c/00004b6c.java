package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ReflectionHelper.java */
/* loaded from: classes3.dex */
public class jv3 {
    private static final Logger a = Logger.getLogger(jv3.class.getName());
    private static final PrivilegedAction b = new a();

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class a implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            return null;
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class b implements PrivilegedAction<Class<?>> {
        public final /* synthetic */ ClassLoader a;
        public final /* synthetic */ String b;

        public b(ClassLoader classLoader, String str) {
            this.a = classLoader;
            this.b = str;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public Class<?> run() {
            ClassLoader classLoader = this.a;
            if (classLoader != null) {
                try {
                    return Class.forName(this.b, false, classLoader);
                } catch (ClassNotFoundException e) {
                    Logger logger = jv3.a;
                    Level level = Level.FINE;
                    if (logger.isLoggable(level)) {
                        Logger logger2 = jv3.a;
                        StringBuilder G = wo1.G("Unable to load class ");
                        G.append(this.b);
                        G.append(" using the supplied class loader ");
                        G.append(this.a.getClass().getName());
                        G.append(CryptoConstants.ALIAS_SEPARATOR);
                        logger2.log(level, G.toString(), (Throwable) e);
                    }
                }
            }
            try {
                return Class.forName(this.b);
            } catch (ClassNotFoundException e2) {
                Logger logger3 = jv3.a;
                Level level2 = Level.FINE;
                if (logger3.isLoggable(level2)) {
                    jv3.a.log(level2, wo1.C(wo1.G("Unable to load class "), this.b, " using the current class loader."), (Throwable) e2);
                    return null;
                }
                return null;
            }
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class c implements PrivilegedExceptionAction<Class<T>> {
        public final /* synthetic */ ClassLoader a;
        public final /* synthetic */ String b;

        public c(ClassLoader classLoader, String str) {
            this.a = classLoader;
            this.b = str;
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Class<T> run() throws ClassNotFoundException {
            ClassLoader classLoader = this.a;
            if (classLoader != null) {
                try {
                    return Class.forName(this.b, false, classLoader);
                } catch (ClassNotFoundException unused) {
                }
            }
            return Class.forName(this.b);
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class d implements PrivilegedAction<ClassLoader> {
        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public ClassLoader run() {
            return Thread.currentThread().getContextClassLoader();
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class e implements PrivilegedAction<Object> {
        public final /* synthetic */ Method a;

        public e(Method method) {
            this.a = method;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            if (!this.a.isAccessible()) {
                this.a.setAccessible(true);
            }
            return this.a;
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class f implements PrivilegedAction<Method> {
        public final /* synthetic */ Class a;

        public f(Class cls) {
            this.a = cls;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public Method run() {
            try {
                Method declaredMethod = this.a.getDeclaredMethod("valueOf", String.class);
                if (!Modifier.isStatic(declaredMethod.getModifiers())) {
                    if (declaredMethod.getReturnType() == this.a) {
                        return null;
                    }
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class g implements PrivilegedAction<Method> {
        public final /* synthetic */ Class a;

        public g(Class cls) {
            this.a = cls;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public Method run() {
            try {
                Method declaredMethod = this.a.getDeclaredMethod("fromString", String.class);
                if (!Modifier.isStatic(declaredMethod.getModifiers())) {
                    if (declaredMethod.getReturnType() == this.a) {
                        return null;
                    }
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class h implements PrivilegedAction<Constructor> {
        public final /* synthetic */ Class a;

        public h(Class cls) {
            this.a = cls;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public Constructor run() {
            try {
                return this.a.getConstructor(String.class);
            } catch (SecurityException e) {
                throw e;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class i implements PrivilegedAction<Method> {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Method b;

        public i(Class cls, Method method) {
            this.a = cls;
            this.b = method;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public Method run() {
            Method[] methods;
            try {
                return this.a.getMethod(this.b.getName(), this.b.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                for (Method method : this.a.getMethods()) {
                    if (method.getName().equals(this.b.getName()) && method.getParameterTypes().length == this.b.getParameterTypes().length && jv3.g(this.b.getGenericParameterTypes(), method.getGenericParameterTypes())) {
                        return method;
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class j {
        public final Class a;
        public final Type b;

        public j(Class cls) {
            this(cls, cls);
        }

        public j(Class cls, Type type) {
            this.a = cls;
            this.b = type;
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static class k {
        public final Class a;
        public final Class b;
        public final Type c;

        public /* synthetic */ k(Class cls, Class cls2, Type type, a aVar) {
            this(cls, cls2, type);
        }

        private k(Class cls, Class cls2, Type type) {
            this.a = cls;
            this.b = cls2;
            this.c = type;
        }
    }

    /* compiled from: ReflectionHelper.java */
    /* loaded from: classes3.dex */
    public static final class l {
        public final Type a;
        public final Class b;

        public l(Type type, Class cls) {
            this.a = type;
            this.b = cls;
        }
    }

    public static PrivilegedAction<Method> A(Class<?> cls) {
        return new f(cls);
    }

    public static String B(Object obj, Method method) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(obj.hashCode()));
        stringBuffer.append('.');
        stringBuffer.append(method.getName());
        stringBuffer.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            stringBuffer.append(z(parameterTypes[i2]));
            if (i2 < parameterTypes.length - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public static String C(Object obj) {
        if (obj == null) {
            return pg1.d;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(obj.hashCode()));
        return stringBuffer.toString();
    }

    public static j D(Class cls, Class cls2, TypeVariable typeVariable) {
        return E(cls, cls2, typeVariable, new HashMap());
    }

    private static j E(Class cls, Class cls2, TypeVariable typeVariable, Map<TypeVariable, Type> map) {
        Type[] genericInterfaces;
        for (Type type : cls.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                j F = F(parameterizedType, (Class) parameterizedType.getRawType(), cls2, typeVariable, map);
                if (F != null) {
                    return F;
                }
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return F((ParameterizedType) genericSuperclass, cls.getSuperclass(), cls2, typeVariable, map);
        }
        if (genericSuperclass instanceof Class) {
            return E(cls.getSuperclass(), cls2, typeVariable, map);
        }
        return null;
    }

    private static j F(ParameterizedType parameterizedType, Class cls, Class cls2, TypeVariable typeVariable, Map<TypeVariable, Type> map) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            if (actualTypeArguments[i2] instanceof TypeVariable) {
                hashMap.put(typeParameters[i2], map.get(actualTypeArguments[i2]));
            } else {
                hashMap.put(typeParameters[i2], actualTypeArguments[i2]);
            }
        }
        if (cls == cls2) {
            Type type = (Type) hashMap.get(typeVariable);
            if (type instanceof Class) {
                return new j((Class) type);
            }
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                if (genericComponentType instanceof Class) {
                    try {
                        return new j(i((Class) genericComponentType));
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (genericComponentType instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                    if (rawType instanceof Class) {
                        try {
                            return new j(i((Class) rawType), genericComponentType);
                        } catch (Exception unused2) {
                        }
                    }
                }
                return null;
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType2 = (ParameterizedType) type;
                if (parameterizedType2.getRawType() instanceof Class) {
                    return new j((Class) parameterizedType2.getRawType(), parameterizedType2);
                }
            }
            return null;
        }
        return E(cls, cls2, typeVariable, hashMap);
    }

    public static PrivilegedAction G(Method method) {
        if (Modifier.isPublic(method.getModifiers())) {
            return b;
        }
        return new e(method);
    }

    public static PrivilegedAction<Class<?>> c(String str) {
        return d(str, m());
    }

    public static PrivilegedAction<Class<?>> d(String str, ClassLoader classLoader) {
        return new b(classLoader, str);
    }

    public static <T> PrivilegedExceptionAction<Class<T>> e(String str) throws ClassNotFoundException {
        return f(str, m());
    }

    public static <T> PrivilegedExceptionAction<Class<T>> f(String str, ClassLoader classLoader) throws ClassNotFoundException {
        return new c(classLoader, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Type[] typeArr, Type[] typeArr2) {
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            if (!typeArr[i2].equals(typeArr2[i2]) && !(typeArr2[i2] instanceof TypeVariable)) {
                return false;
            }
        }
        return true;
    }

    public static PrivilegedAction<Method> h(Class<?> cls, Method method) {
        return new i(cls, method);
    }

    public static Class i(Class cls) {
        try {
            return Array.newInstance(cls, 0).getClass();
        } catch (Exception e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static k j(Class cls, Class cls2) {
        return k(cls, cls2, cls);
    }

    private static k k(Class cls, Class cls2, Class cls3) {
        k w = w(cls, cls2, cls3, cls3.getGenericInterfaces());
        if (w != null) {
            return w;
        }
        Class superclass = cls3.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return k(cls, cls2, superclass);
    }

    private static Class l(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof Class) {
                return i((Class) genericComponentType);
            }
            return null;
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            return null;
        } else {
            return null;
        }
    }

    private static ClassLoader m() {
        return (ClassLoader) AccessController.doPrivileged(n());
    }

    public static PrivilegedAction<ClassLoader> n() {
        return new d();
    }

    public static Class o(AccessibleObject accessibleObject) {
        if (accessibleObject instanceof Method) {
            return ((Method) accessibleObject).getDeclaringClass();
        }
        if (accessibleObject instanceof Field) {
            return ((Field) accessibleObject).getDeclaringClass();
        }
        if (accessibleObject instanceof Constructor) {
            return ((Constructor) accessibleObject).getDeclaringClass();
        }
        throw new RuntimeException();
    }

    public static PrivilegedAction<Method> p(Class<?> cls) {
        return new g(cls);
    }

    public static Class q(Type type) throws IllegalArgumentException {
        Type y = y(type);
        if (y == null) {
            return null;
        }
        Class l2 = l(y);
        if (l2 != null) {
            return l2;
        }
        throw new IllegalArgumentException(rx3.N(y, type));
    }

    public static zu3 r() {
        try {
            Class.forName("org.osgi.framework.BundleReference");
            return zu3.g();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class[] s(k kVar) {
        Type type = kVar.c;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            Class[] clsArr = new Class[actualTypeArguments.length];
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                Type type2 = actualTypeArguments[i2];
                if (type2 instanceof Class) {
                    clsArr[i2] = (Class) type2;
                } else if (type2 instanceof ParameterizedType) {
                    clsArr[i2] = (Class) ((ParameterizedType) type2).getRawType();
                } else if (type2 instanceof TypeVariable) {
                    j D = D(kVar.a, kVar.b, (TypeVariable) type2);
                    clsArr[i2] = D != null ? D.a : Object.class;
                }
            }
            return clsArr;
        }
        return null;
    }

    public static Type[] t(k kVar) {
        Type type = kVar.c;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            Type[] typeArr = new Type[actualTypeArguments.length];
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                Type type2 = actualTypeArguments[i2];
                if (type2 instanceof Class) {
                    typeArr[i2] = type2;
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    typeArr[i2] = type2;
                } else if (type2 instanceof TypeVariable) {
                    typeArr[i2] = D(kVar.a, kVar.b, (TypeVariable) type2).b;
                }
            }
            return typeArr;
        }
        return null;
    }

    public static PrivilegedAction<Constructor> u(Class<?> cls) {
        return new h(cls);
    }

    private static k v(Class cls, Class cls2, Class cls3, Type type) {
        if (type instanceof Class) {
            if (type == cls2) {
                return new k(cls, cls3, type, null);
            }
            return k(cls, cls2, (Class) type);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == cls2) {
                return new k(cls, cls3, type, null);
            }
            return k(cls, cls2, (Class) parameterizedType.getRawType());
        } else {
            return null;
        }
    }

    private static k w(Class cls, Class cls2, Class cls3, Type[] typeArr) {
        for (Type type : typeArr) {
            k v = v(cls, cls2, cls3, type);
            if (v != null) {
                return v;
            }
        }
        return null;
    }

    public static l x(Type type) throws IllegalArgumentException {
        Type y = y(type);
        if (y == null) {
            return null;
        }
        Class l2 = l(y);
        if (l2 != null) {
            return new l(y, l2);
        }
        throw new IllegalArgumentException(rx3.N(y, type));
    }

    private static Type y(Type type) {
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length != 1) {
                return null;
            }
            return actualTypeArguments[0];
        }
        return null;
    }

    private static String z(Class cls) {
        if (cls.isArray()) {
            int i2 = 0;
            Class cls2 = cls;
            while (cls2.isArray()) {
                try {
                    i2++;
                    cls2 = cls2.getComponentType();
                } catch (Throwable unused) {
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls2.getName());
            for (int i3 = 0; i3 < i2; i3++) {
                stringBuffer.append(zq5.e);
            }
            return stringBuffer.toString();
        }
        return cls.getName();
    }
}