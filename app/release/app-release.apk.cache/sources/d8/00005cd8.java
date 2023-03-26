package com.p7700g.p99005;

import com.p7700g.p99005.gw2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes3.dex */
public final class sw2 {
    private final Map<Type, qv2<?>> a;
    private final boolean b;
    private final List<gw2> c;

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class a implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new TreeSet();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class b implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class c implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new ArrayDeque();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class d implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new ArrayList();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class e implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class f implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class g implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new TreeMap();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class h implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class i implements yw2<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.p7700g.p99005.xw2] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return new xw2();
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class j implements yw2<T> {
        private final dx2 a = dx2.d();
        public final /* synthetic */ Class b;

        public j(Class cls) {
            this.b = cls;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            try {
                return this.a.e(this.b);
            } catch (Exception e) {
                StringBuilder G = wo1.G("Unable to create instance of ");
                G.append(this.b);
                G.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                throw new RuntimeException(G.toString(), e);
            }
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class k implements yw2<T> {
        public final /* synthetic */ qv2 a;
        public final /* synthetic */ Type b;

        public k(qv2 qv2Var, Type type) {
            this.a = qv2Var;
            this.b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return this.a.a(this.b);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class l implements yw2<T> {
        public final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.yw2
        public T a() {
            throw new vv2(this.a);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class m implements yw2<T> {
        public final /* synthetic */ qv2 a;
        public final /* synthetic */ Type b;

        public m(qv2 qv2Var, Type type) {
            this.a = qv2Var;
            this.b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            return this.a.a(this.b);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class n implements yw2<T> {
        public final /* synthetic */ String a;

        public n(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.yw2
        public T a() {
            throw new vv2(this.a);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class o implements yw2<T> {
        public final /* synthetic */ String a;

        public o(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.yw2
        public T a() {
            throw new vv2(this.a);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class p implements yw2<T> {
        public final /* synthetic */ Type a;

        public p(Type type) {
            this.a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                StringBuilder G = wo1.G("Invalid EnumSet type: ");
                G.append(this.a.toString());
                throw new vv2(G.toString());
            }
            StringBuilder G2 = wo1.G("Invalid EnumSet type: ");
            G2.append(this.a.toString());
            throw new vv2(G2.toString());
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class q implements yw2<T> {
        public final /* synthetic */ Type a;

        public q(Type type) {
            this.a = type;
        }

        /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.EnumMap] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                StringBuilder G = wo1.G("Invalid EnumMap type: ");
                G.append(this.a.toString());
                throw new vv2(G.toString());
            }
            StringBuilder G2 = wo1.G("Invalid EnumMap type: ");
            G2.append(this.a.toString());
            throw new vv2(G2.toString());
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class r implements yw2<T> {
        public final /* synthetic */ String a;

        public r(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.yw2
        public T a() {
            throw new vv2(this.a);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class s implements yw2<T> {
        public final /* synthetic */ String a;

        public s(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.yw2
        public T a() {
            throw new vv2(this.a);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class t implements yw2<T> {
        public final /* synthetic */ Constructor a;

        public t(Constructor constructor) {
            this.a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.yw2
        public T a() {
            try {
                return this.a.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw ix2.b(e);
            } catch (InstantiationException e2) {
                StringBuilder G = wo1.G("Failed to invoke ");
                G.append(this.a);
                G.append(" with no args");
                throw new RuntimeException(G.toString(), e2);
            } catch (InvocationTargetException e3) {
                StringBuilder G2 = wo1.G("Failed to invoke ");
                G2.append(this.a);
                G2.append(" with no args");
                throw new RuntimeException(G2.toString(), e3.getTargetException());
            }
        }
    }

    public sw2(Map<Type, qv2<?>> map, boolean z, List<gw2> list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    private static <T> yw2<T> b(Class<? super T> cls, gw2.e eVar) {
        String d2;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        boolean z = false;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            gw2.e eVar2 = gw2.e.ALLOW;
            if (eVar == eVar2 || (bx2.a(declaredConstructor, null) && (eVar != gw2.e.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                z = true;
            }
            if (z) {
                if (eVar == eVar2 && (d2 = ix2.d(declaredConstructor)) != null) {
                    return new s(d2);
                }
                return new t(declaredConstructor);
            }
            return new r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> yw2<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new b();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new c();
            }
            return new d();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new g();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(lx2.c(((ParameterizedType) type).getActualTypeArguments()[0]).f())) {
                return new h();
            }
            return new i();
        } else {
            return null;
        }
    }

    private static <T> yw2<T> d(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new p(type);
        }
        if (cls == EnumMap.class) {
            return new q(type);
        }
        return null;
    }

    private <T> yw2<T> e(Class<? super T> cls) {
        if (this.b) {
            return new j(cls);
        }
        return new l("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> yw2<T> a(lx2<T> lx2Var) {
        Type g2 = lx2Var.g();
        Class<? super T> f2 = lx2Var.f();
        qv2<?> qv2Var = this.a.get(g2);
        if (qv2Var != null) {
            return new k(qv2Var, g2);
        }
        qv2<?> qv2Var2 = this.a.get(f2);
        if (qv2Var2 != null) {
            return new m(qv2Var2, g2);
        }
        yw2<T> d2 = d(g2, f2);
        if (d2 != null) {
            return d2;
        }
        gw2.e b2 = bx2.b(this.c, f2);
        yw2<T> b3 = b(f2, b2);
        if (b3 != null) {
            return b3;
        }
        yw2<T> c2 = c(g2, f2);
        if (c2 != null) {
            return c2;
        }
        String c3 = dx2.c(f2);
        if (c3 != null) {
            return new n(c3);
        }
        if (b2 == gw2.e.ALLOW) {
            return e(f2);
        }
        return new o("Unable to create instance of " + f2 + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.a.toString();
    }
}