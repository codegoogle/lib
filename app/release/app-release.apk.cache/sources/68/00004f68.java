package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/* compiled from: ComponentConstructor.java */
/* loaded from: classes3.dex */
public class lv3<T> {
    private final ky3 a;
    private final Class<T> b;
    private final List<Method> c;
    private final ov3<T> d;

    /* compiled from: ComponentConstructor.java */
    /* loaded from: classes3.dex */
    public static class b<T> implements Comparator<c<T>> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c<T> cVar, c<T> cVar2) {
            int frequency = Collections.frequency(((c) cVar).b, null) - Collections.frequency(((c) cVar2).b, null);
            return frequency != 0 ? frequency : ((c) cVar2).a.getParameterTypes().length - ((c) cVar).a.getParameterTypes().length;
        }
    }

    /* compiled from: ComponentConstructor.java */
    /* loaded from: classes3.dex */
    public static class c<T> {
        private final Constructor<T> a;
        private final List<iy3> b;

        private c(Constructor<T> constructor, List<iy3> list) {
            this.a = constructor;
            this.b = list;
        }
    }

    public lv3(ky3 ky3Var, Class<T> cls, ov3<T> ov3Var) {
        this.a = ky3Var;
        this.b = cls;
        this.d = ov3Var;
        this.c = d(cls);
    }

    private T a() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c<T> b2 = b();
        if (b2 != null && !((c) b2).b.isEmpty()) {
            int i = 0;
            if (((c) b2).b.contains(null)) {
                for (int i2 = 0; i2 < ((c) b2).b.size(); i2++) {
                    if (((c) b2).b.get(i2) == null) {
                        gy3.l(((c) b2).a, i2);
                    }
                }
            }
            Object[] objArr = new Object[((c) b2).b.size()];
            for (iy3 iy3Var : ((c) b2).b) {
                if (iy3Var != null) {
                    objArr[i] = iy3Var.getValue();
                    i++;
                }
            }
            return (T) ((c) b2).a.newInstance(objArr);
        }
        return this.b.newInstance();
    }

    private c<T> b() {
        Constructor<?>[] constructors;
        if (this.b.getConstructors().length == 0) {
            return null;
        }
        TreeSet treeSet = new TreeSet(new b());
        kv3 kv3Var = new kv3();
        for (Constructor<?> constructor : this.b.getConstructors()) {
            ArrayList arrayList = new ArrayList();
            int length = constructor.getParameterTypes().length;
            kv3Var.b(constructor);
            int i = 0;
            while (i < length) {
                Type type = constructor.getGenericParameterTypes()[i];
                Annotation[] annotationArr = constructor.getParameterAnnotations()[i];
                kv3Var.c(annotationArr);
                int length2 = annotationArr.length;
                iy3 iy3Var = null;
                int i2 = 0;
                while (i2 < length2) {
                    Annotation annotation = annotationArr[i2];
                    iy3Var = this.a.c(annotation.annotationType(), kv3Var, annotation, type, rv3.v);
                    i2++;
                    i = i;
                    length2 = length2;
                    annotationArr = annotationArr;
                    length = length;
                }
                arrayList.add(iy3Var);
                i++;
            }
            treeSet.add(new c(constructor, arrayList));
        }
        return (c) treeSet.first();
    }

    private static List<Method> d(Class cls) {
        Class cls2 = (Class) AccessController.doPrivileged(jv3.c("javax.annotation.PostConstruct"));
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        if (cls2 != null) {
            Iterator<hv3> it = new iv3(cls, true).d(cls2).h(0).i(Void.TYPE).iterator();
            while (it.hasNext()) {
                Method f = it.next().f();
                if (hashSet.add(f.getName())) {
                    AccessController.doPrivileged(jv3.G(f));
                    linkedList.addFirst(f);
                }
            }
        }
        return linkedList;
    }

    public T c() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int modifiers = this.b.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            gy3.o(this.b);
        }
        if (Modifier.isAbstract(modifiers)) {
            if (Modifier.isInterface(modifiers)) {
                gy3.j(this.b);
            } else {
                gy3.d(this.b);
            }
        }
        if (this.b.getEnclosingClass() != null && !Modifier.isStatic(modifiers)) {
            gy3.i(this.b);
        }
        if (Modifier.isPublic(modifiers) && !Modifier.isAbstract(modifiers) && this.b.getConstructors().length == 0) {
            gy3.p(this.b);
        }
        T a2 = a();
        this.d.a(a2);
        for (Method method : this.c) {
            method.invoke(a2, new Object[0]);
        }
        return a2;
    }
}