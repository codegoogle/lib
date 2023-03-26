package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: AnnotatedMethod.java */
/* loaded from: classes3.dex */
public final class hv3 implements AnnotatedElement {
    private static final Set<Class<? extends Annotation>> s = i(cm4.class);
    private static final Set<Class<? extends Annotation>> t = i(hm4.class, jm4.class, tl4.class);
    private static final Set<Class<? extends Annotation>> u = i(om4.class, xl4.class, wl4.class, dm4.class, km4.class, ul4.class, bm4.class, im4.class, yl4.class);
    private final Method v;
    private final Method w;
    private final Annotation[] x;
    private final Annotation[][] y;

    public hv3(Method method) {
        this.v = method;
        Method c = c(method);
        this.w = c;
        if (method.equals(c)) {
            this.x = method.getAnnotations();
            this.y = method.getParameterAnnotations();
            return;
        }
        this.x = p(method, c);
        this.y = q(method, c);
    }

    private static <T> List<T> a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t2 : tArr) {
            arrayList.add(t2);
        }
        return arrayList;
    }

    private static Method b(Class<?> cls, Method method) {
        Method method2;
        Method b;
        if (cls == Object.class || (method2 = (Method) AccessController.doPrivileged(jv3.h(cls, method))) == null) {
            return null;
        }
        if (k(method2)) {
            return method2;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class || (b = b(superclass, method2)) == null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                Method b2 = b(cls2, method2);
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        }
        return b;
    }

    private static Method c(Method method) {
        Method b = b(method.getDeclaringClass(), method);
        return b != null ? b : method;
    }

    private static Set<Class<? extends Annotation>> i(Class<? extends Annotation>... clsArr) {
        HashSet hashSet = new HashSet();
        for (Class<? extends Annotation> cls : clsArr) {
            hashSet.add(cls);
        }
        return hashSet;
    }

    private static boolean k(Method method) {
        return l(method) || m(method) || n(method);
    }

    private static boolean l(Method method) {
        Iterator<Class<? extends Annotation>> it = s.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            Class next = it.next();
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation.annotationType().getAnnotation(next) != null) {
                    return true;
                }
            }
        }
    }

    private static boolean m(Method method) {
        for (Class<? extends Annotation> cls : t) {
            if (method.isAnnotationPresent(cls)) {
                return true;
            }
        }
        return false;
    }

    private static boolean n(Method method) {
        Annotation[][] parameterAnnotations;
        for (Annotation[] annotationArr : method.getParameterAnnotations()) {
            for (Annotation annotation : annotationArr) {
                if (u.contains(annotation.annotationType())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean o(Class<? extends Annotation> cls, List<Annotation> list) {
        for (Annotation annotation : list) {
            if (cls == annotation.getClass()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Annotation[] p(Method method, Method method2) {
        Annotation[] annotations;
        List a = a(method.getAnnotations());
        for (Annotation annotation : method2.getAnnotations()) {
            if (!method.isAnnotationPresent(annotation.getClass())) {
                a.add(annotation);
            }
        }
        return (Annotation[]) a.toArray(new Annotation[0]);
    }

    private static Annotation[][] q(Method method, Method method2) {
        Annotation[] annotationArr;
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Annotation[][] parameterAnnotations2 = method2.getParameterAnnotations();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < parameterAnnotations.length; i++) {
            List a = a(parameterAnnotations[i]);
            for (Annotation annotation : parameterAnnotations2[i]) {
                if (!o(annotation.getClass(), a)) {
                    a.add(annotation);
                }
            }
            arrayList.add(a);
        }
        Annotation[][] annotationArr2 = new Annotation[parameterAnnotations.length];
        for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
            annotationArr2[i2] = (Annotation[]) ((List) arrayList.get(i2)).toArray(new Annotation[0]);
        }
        return annotationArr2;
    }

    public Type[] d() {
        return this.w.getGenericParameterTypes();
    }

    public <T extends Annotation> List<T> e(Class<T> cls) {
        Annotation[] annotationArr;
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : this.x) {
            if (annotation.annotationType().getAnnotation(cls) != null) {
                arrayList.add(annotation.annotationType().getAnnotation(cls));
            }
        }
        return arrayList;
    }

    public Method f() {
        return this.w;
    }

    public Annotation[][] g() {
        return (Annotation[][]) this.y.clone();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Annotation[] annotationArr;
        for (Annotation annotation : this.x) {
            if (annotation.annotationType() == cls) {
                return cls.cast(annotation);
            }
        }
        return (T) this.w.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return (Annotation[]) this.x.clone();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return getAnnotations();
    }

    public Class<?>[] h() {
        return this.w.getParameterTypes();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        for (Annotation annotation : this.x) {
            if (annotation.annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    public TypeVariable<Method>[] j() {
        return this.w.getTypeParameters();
    }

    public String toString() {
        return this.v.toString();
    }
}