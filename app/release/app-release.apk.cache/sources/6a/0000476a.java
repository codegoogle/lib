package com.p7700g.p99005;

import com.p7700g.p99005.jv3;
import com.p7700g.p99005.ky3;
import com.p7700g.p99005.tv3;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: InjectableProviderFactory.java */
/* loaded from: classes3.dex */
public class hw3 implements ky3 {
    private final Map<Class<? extends Annotation>, LinkedList<c>> a = new HashMap();

    /* compiled from: InjectableProviderFactory.java */
    /* loaded from: classes3.dex */
    public class a implements tv3.b<jy3> {
        public a() {
        }

        @Override // com.p7700g.p99005.tv3.b
        /* renamed from: b */
        public void a(jy3 jy3Var) {
            hw3.this.f(jy3Var);
        }
    }

    /* compiled from: InjectableProviderFactory.java */
    /* loaded from: classes3.dex */
    public class b implements tv3.b<jy3> {
        public b() {
        }

        @Override // com.p7700g.p99005.tv3.b
        /* renamed from: b */
        public void a(jy3 jy3Var) {
            hw3.this.f(jy3Var);
        }
    }

    /* compiled from: InjectableProviderFactory.java */
    /* loaded from: classes3.dex */
    public static final class c {
        public final jy3 a;
        public final Class<? extends Annotation> b;
        public final Class<?> c;

        public c(jy3 jy3Var, Class<? extends Annotation> cls, Class<?> cls2) {
            this.a = jy3Var;
            this.b = cls;
            this.c = cls2;
        }
    }

    private List<c> i(Class<? extends Annotation> cls, Class<?> cls2, rv3 rv3Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = j(cls).iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (rv3Var == next.a.a() && next.c.isAssignableFrom(cls2)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private LinkedList<c> j(Class<? extends Annotation> cls) {
        LinkedList<c> linkedList = this.a.get(cls);
        if (linkedList == null) {
            LinkedList<c> linkedList2 = new LinkedList<>();
            this.a.put(cls, linkedList2);
            return linkedList2;
        }
        return linkedList;
    }

    private Type[] k(Class<? extends jy3> cls) {
        Type[] genericInterfaces;
        for (Class<? extends jy3> cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            for (Type type : cls2.getGenericInterfaces()) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == jy3.class) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        for (int i = 0; i < actualTypeArguments.length; i++) {
                            actualTypeArguments[i] = l(actualTypeArguments[i], cls, cls2);
                        }
                        if ((actualTypeArguments[0] instanceof Class) && (actualTypeArguments[1] instanceof Class)) {
                            return actualTypeArguments;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private Type l(Type type, Class cls, Class cls2) {
        if (type instanceof Class) {
            return type;
        }
        if (!(type instanceof TypeVariable)) {
            return type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType() : type;
        }
        jv3.j D = jv3.D(cls, cls2, (TypeVariable) type);
        return D != null ? D.a : type;
    }

    @Override // com.p7700g.p99005.ky3
    public boolean a(Class<? extends Annotation> cls, Class<?> cls2, rv3 rv3Var) {
        return !i(cls, cls2, rv3Var).isEmpty();
    }

    @Override // com.p7700g.p99005.ky3
    public <A extends Annotation, C> ky3.a b(Class<? extends Annotation> cls, mv3 mv3Var, A a2, C c2, List<rv3> list) {
        for (rv3 rv3Var : list) {
            iy3 e = e(cls, mv3Var, a2, c2, rv3Var);
            if (e != null) {
                return new ky3.a(e, rv3Var);
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.ky3
    public final <A extends Annotation, C> iy3 c(Class<? extends Annotation> cls, mv3 mv3Var, A a2, C c2, List<rv3> list) {
        for (rv3 rv3Var : list) {
            iy3 e = e(cls, mv3Var, a2, c2, rv3Var);
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    @Override // com.p7700g.p99005.ky3
    public boolean d(Class<? extends Annotation> cls, Class<?> cls2) {
        Iterator<c> it = j(cls).iterator();
        while (it.hasNext()) {
            if (it.next().c.isAssignableFrom(cls2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.ky3
    public final <A extends Annotation, C> iy3 e(Class<? extends Annotation> cls, mv3 mv3Var, A a2, C c2, rv3 rv3Var) {
        for (c cVar : i(cls, c2.getClass(), rv3Var)) {
            iy3 b2 = cVar.a.b(mv3Var, a2, c2);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(jy3 jy3Var) {
        Type[] k = k(jy3Var.getClass());
        if (k != null) {
            c cVar = new c(jy3Var, (Class) k[0], (Class) k[1]);
            j(cVar.b).add(cVar);
        }
    }

    public final void g(tv3 tv3Var) {
        tv3Var.o(jy3.class, new a());
    }

    public final void h(tv3 tv3Var) {
        tv3Var.m(jy3.class, new b());
    }

    public final void m(hw3 hw3Var) {
        for (Map.Entry<Class<? extends Annotation>, LinkedList<c>> entry : hw3Var.a.entrySet()) {
            j(entry.getKey()).addAll(entry.getValue());
        }
    }
}