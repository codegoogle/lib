package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Iterator;

/* compiled from: ComponentInjector.java */
/* loaded from: classes3.dex */
public class ov3<T> {
    public final ky3 a;
    public final Class<T> b;

    /* compiled from: ComponentInjector.java */
    /* loaded from: classes3.dex */
    public class a implements PrivilegedAction<Object> {
        public final /* synthetic */ Field a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public a(Field field, Object obj, Object obj2) {
            this.a = field;
            this.b = obj;
            this.c = obj2;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                if (!this.a.isAccessible()) {
                    this.a.setAccessible(true);
                }
                this.a.set(this.b, this.c);
                return null;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ov3(ky3 ky3Var, Class<T> cls) {
        this.a = ky3Var;
        this.b = cls;
    }

    private void b(Object obj, Field field, Object obj2) {
        AccessController.doPrivileged(new a(field, obj, obj2));
    }

    private void c(Object obj, hv3 hv3Var, Object obj2) {
        try {
            hv3Var.f().invoke(obj, obj2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void a(T t) {
        Field[] declaredFields;
        kv3 kv3Var = new kv3();
        for (Class<T> cls = this.b; cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                kv3Var.b(field);
                Annotation[] annotations = field.getAnnotations();
                kv3Var.c(annotations);
                int length = annotations.length;
                int i = 0;
                boolean z = false;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Annotation annotation = annotations[i];
                    int i2 = i;
                    int i3 = length;
                    Annotation[] annotationArr = annotations;
                    iy3 c = this.a.c(annotation.annotationType(), kv3Var, annotation, field.getGenericType(), rv3.v);
                    if (c != null) {
                        b(t, field, c.getValue());
                        z = false;
                        break;
                    }
                    if (this.a.d(annotation.annotationType(), field.getGenericType().getClass())) {
                        z = true;
                    }
                    i = i2 + 1;
                    annotations = annotationArr;
                    length = i3;
                }
                if (z) {
                    gy3.m(field);
                }
            }
        }
        Iterator<hv3> it = new iv3(this.b.getMethods()).g(cm4.class).f(hm4.class).h(1).i(Void.TYPE).n(la1.a).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            hv3 next = it.next();
            Annotation[] annotations2 = next.getAnnotations();
            kv3Var.b(next.f());
            kv3Var.c(annotations2);
            Type type = next.d()[0];
            int length2 = annotations2.length;
            int i5 = 0;
            boolean z2 = false;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                Annotation annotation2 = annotations2[i5];
                int i6 = i5;
                int i7 = length2;
                iy3 c2 = this.a.c(annotation2.annotationType(), kv3Var, annotation2, type, rv3.v);
                if (c2 != null) {
                    c(t, next, c2.getValue());
                    z2 = false;
                    break;
                }
                if (this.a.d(annotation2.annotationType(), type.getClass())) {
                    z2 = true;
                }
                i5 = i6 + 1;
                length2 = i7;
            }
            if (z2) {
                gy3.n(next.f(), i4);
            }
            i4++;
        }
    }
}