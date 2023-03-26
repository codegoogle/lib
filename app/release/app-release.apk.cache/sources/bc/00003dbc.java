package com.p7700g.p99005;

import com.p7700g.p99005.mz;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
public final class cz {
    public static cz a = new cz();
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private final Map<Class<?>, a> e = new HashMap();
    private final Map<Class<?>, Boolean> f = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
        public final Map<mz.b, List<b>> a = new HashMap();
        public final Map<b, mz.b> b;

        public a(Map<b, mz.b> map) {
            this.b = map;
            for (Map.Entry<b, mz.b> entry : map.entrySet()) {
                mz.b value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, qz qzVar, mz.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(qzVar, bVar, obj);
                }
            }
        }

        public void a(qz qzVar, mz.b bVar, Object obj) {
            b(this.a.get(bVar), qzVar, bVar, obj);
            b(this.a.get(mz.b.ON_ANY), qzVar, bVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(qz qzVar, mz.b bVar, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.b.invoke(obj, qzVar);
                } else if (i != 2) {
                } else {
                    this.b.invoke(obj, qzVar, bVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
            }
            return false;
        }

        public int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    private a a(Class<?> cls, @z1 Method[] methodArr) {
        int i;
        a c2;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c2 = c(superclass)) != null) {
            hashMap.putAll(c2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, mz.b> entry : c(cls2).b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            zz zzVar = (zz) method.getAnnotation(zz.class);
            if (zzVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(qz.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                mz.b value = zzVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(mz.b.class)) {
                        if (value != mz.b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.e.put(cls, aVar);
        this.f.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    private void e(Map<b, mz.b> map, b bVar, mz.b bVar2, Class<?> cls) {
        mz.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        Method method = bVar.b;
        StringBuilder G = wo1.G("Method ");
        G.append(method.getName());
        G.append(" in ");
        G.append(cls.getName());
        G.append(" already declared with different @OnLifecycleEvent value: previous value ");
        G.append(bVar3);
        G.append(", new value ");
        G.append(bVar2);
        throw new IllegalArgumentException(G.toString());
    }

    public a c(Class<?> cls) {
        a aVar = this.e.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method method : b2) {
            if (((zz) method.getAnnotation(zz.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f.put(cls, Boolean.FALSE);
        return false;
    }
}