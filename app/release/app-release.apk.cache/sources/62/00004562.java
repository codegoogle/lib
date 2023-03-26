package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ContextResolverFactory.java */
/* loaded from: classes3.dex */
public class gw3 {
    private static final c a = new c(null);
    private final Map<Type, Map<tm4, fn4>> b = new HashMap(4);
    private final Map<Type, ConcurrentHashMap<tm4, fn4>> c = new HashMap(4);

    /* compiled from: ContextResolverFactory.java */
    /* loaded from: classes3.dex */
    public class a implements jy3<om4, Type> {

        /* compiled from: ContextResolverFactory.java */
        /* renamed from: com.p7700g.p99005.gw3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0185a implements iy3 {
            public C0185a() {
            }

            @Override // com.p7700g.p99005.iy3
            public Object getValue() {
                return null;
            }
        }

        /* compiled from: ContextResolverFactory.java */
        /* loaded from: classes3.dex */
        public class b implements iy3 {
            public final /* synthetic */ fn4 a;

            public b(fn4 fn4Var) {
                this.a = fn4Var;
            }

            @Override // com.p7700g.p99005.iy3
            public Object getValue() {
                return this.a;
            }
        }

        public a() {
        }

        @Override // com.p7700g.p99005.jy3
        public rv3 a() {
            return rv3.Singleton;
        }

        @Override // com.p7700g.p99005.jy3
        /* renamed from: c */
        public iy3 b(mv3 mv3Var, om4 om4Var, Type type) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() != fn4.class) {
                    return null;
                }
                fn4 e = e(mv3Var, parameterizedType.getActualTypeArguments()[0]);
                if (e == null) {
                    return new C0185a();
                }
                return new b(e);
            }
            return null;
        }

        public List<tm4> d(mv3 mv3Var) {
            jm4 jm4Var;
            Annotation[] annotations = mv3Var.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jm4Var = null;
                    break;
                }
                Annotation annotation = annotations[i];
                if (annotation instanceof jm4) {
                    jm4Var = (jm4) annotation;
                    break;
                }
                i++;
            }
            return ct3.d(jm4Var);
        }

        public fn4 e(mv3 mv3Var, Type type) {
            Map map = (Map) gw3.this.b.get(type);
            if (map == null) {
                return null;
            }
            List<tm4> d = d(mv3Var);
            if (d.size() == 1) {
                return gw3.this.f(type, d.get(0));
            }
            TreeSet treeSet = new TreeSet(ct3.f);
            for (tm4 tm4Var : d) {
                if (tm4Var.g()) {
                    treeSet.add(ct3.h);
                } else if (tm4Var.f()) {
                    treeSet.add(new tm4(tm4Var.d(), tm4.g));
                    treeSet.add(ct3.h);
                } else {
                    treeSet.add(new tm4(tm4Var.d(), tm4Var.c()));
                    treeSet.add(new tm4(tm4Var.d(), tm4.g));
                    treeSet.add(ct3.h);
                }
            }
            ArrayList arrayList = new ArrayList(treeSet.size());
            for (tm4 tm4Var2 : d) {
                fn4 fn4Var = (fn4) map.get(tm4Var2);
                if (fn4Var != null) {
                    arrayList.add(fn4Var);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b(arrayList);
        }
    }

    /* compiled from: ContextResolverFactory.java */
    /* loaded from: classes3.dex */
    public static final class b implements fn4 {
        private final fn4[] a;

        public b(fn4... fn4VarArr) {
            this(c(fn4VarArr));
        }

        private static List<fn4> c(fn4... fn4VarArr) {
            ArrayList arrayList = new ArrayList(fn4VarArr.length);
            for (fn4 fn4Var : fn4VarArr) {
                if (fn4Var != null) {
                    arrayList.add(fn4Var);
                }
            }
            return arrayList;
        }

        @Override // com.p7700g.p99005.fn4
        public Object a(Class cls) {
            for (fn4 fn4Var : this.a) {
                Object a = fn4Var.a(cls);
                if (a != null) {
                    return a;
                }
            }
            return null;
        }

        public fn4 b() {
            fn4[] fn4VarArr = this.a;
            if (fn4VarArr.length == 0) {
                return gw3.a;
            }
            return fn4VarArr.length == 1 ? fn4VarArr[0] : this;
        }

        public b(List<fn4> list) {
            this.a = (fn4[]) list.toArray(new fn4[list.size()]);
        }
    }

    /* compiled from: ContextResolverFactory.java */
    /* loaded from: classes3.dex */
    public static final class c implements fn4 {
        private c() {
        }

        @Override // com.p7700g.p99005.fn4
        public Object a(Class cls) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    private Type c(Class cls) {
        Type[] t = jv3.t(jv3.j(cls, fn4.class));
        return t != null ? t[0] : Object.class;
    }

    private fn4 e(List<fn4> list) {
        if (list.size() == 1) {
            return list.iterator().next();
        }
        return new b(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(tv3 tv3Var, hw3 hw3Var) {
        HashMap hashMap = new HashMap();
        for (fn4 fn4Var : tv3Var.l(fn4.class)) {
            List<tm4> d = ct3.d((jm4) fn4Var.getClass().getAnnotation(jm4.class));
            Type c2 = c(fn4Var.getClass());
            Map map = (Map) hashMap.get(c2);
            if (map == null) {
                map = new HashMap();
                hashMap.put(c2, map);
            }
            for (tm4 tm4Var : d) {
                List list = (List) map.get(tm4Var);
                if (list == null) {
                    list = new ArrayList();
                    map.put(tm4Var, list);
                }
                list.add(fn4Var);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            cx3 cx3Var = new cx3(4, iw3.a);
            this.b.put(entry.getKey(), cx3Var);
            this.c.put(entry.getKey(), new ConcurrentHashMap(4));
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                cx3Var.put(entry2.getKey(), e((List) entry2.getValue()));
            }
        }
        hw3Var.f(new a());
    }

    public <T> fn4<T> f(Type type, tm4 tm4Var) {
        fn4 b2;
        ConcurrentHashMap<tm4, fn4> concurrentHashMap = this.c.get(type);
        if (concurrentHashMap == null) {
            return null;
        }
        if (tm4Var == null) {
            tm4Var = ct3.h;
        }
        fn4 fn4Var = concurrentHashMap.get(tm4Var);
        if (fn4Var == null) {
            Map<tm4, fn4> map = this.b.get(type);
            if (tm4Var.g()) {
                b2 = map.get(ct3.h);
                if (b2 == null) {
                    b2 = a;
                }
            } else if (tm4Var.f()) {
                b2 = new b(map.get(tm4Var), map.get(ct3.h)).b();
            } else {
                b2 = new b(map.get(tm4Var), map.get(new tm4(tm4Var.d(), tm4.g)), map.get(tm4.i)).b();
            }
            fn4Var = b2;
            fn4 putIfAbsent = concurrentHashMap.putIfAbsent(tm4Var, fn4Var);
            if (putIfAbsent != null) {
                fn4Var = putIfAbsent;
            }
        }
        if (fn4Var != a) {
            return fn4Var;
        }
        return null;
    }
}