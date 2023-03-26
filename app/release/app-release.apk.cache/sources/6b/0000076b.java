package com.anythink.expressad.atsignalcommon.b;

import com.anythink.expressad.atsignalcommon.b.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class c {
    private static a a;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes2.dex */
    public static abstract class b {

        /* loaded from: classes2.dex */
        public static class a extends Throwable {
            private static final long d = 1;
            private Class<?> a;
            private String b;
            private String c;

            public a(String str) {
                super(str);
            }

            public final Class<?> a() {
                return this.a;
            }

            public final String b() {
                return this.c;
            }

            public final String c() {
                return this.b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() != null) {
                    return a.class.getName() + ": " + getCause();
                }
                return super.toString();
            }

            public a(Exception exc) {
                super(exc);
            }

            public final void a(Class<?> cls) {
                this.a = cls;
            }

            public final void b(String str) {
                this.b = str;
            }

            public final void a(String str) {
                this.c = str;
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0057c<C> {
        public Class<C> a;

        public C0057c(Class<C> cls) {
            this.a = cls;
        }

        private e<C, Object> a(String str) {
            return new e<>(this.a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.a, clsArr);
        }

        private Class<C> a() {
            return this.a;
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public Constructor<?> a;

        public d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e) {
                b.a aVar = new b.a(e);
                aVar.a(cls);
                c.b(aVar);
            }
        }

        private Object a(Object... objArr) {
            this.a.setAccessible(true);
            try {
                return this.a.newInstance(objArr);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.a aVar) {
        a aVar2 = a;
        if (aVar2 == null || !aVar2.a()) {
            throw aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class e<C, T> {
        private Object a;
        private final Field b;

        public e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                return;
            }
            try {
                this.a = null;
                field = cls.getDeclaredField(str);
                if (i > 0 && (field.getModifiers() & i) != i) {
                    c.b(new b.a(field + " does not match modifiers: " + i));
                }
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                b.a aVar = new b.a(e);
                aVar.a((Class<?>) cls);
                aVar.b(str);
                c.b(aVar);
            } finally {
                this.b = field;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.b;
                if (field != null && !cls.isAssignableFrom(field.getType())) {
                    c.b(new b.a(new ClassCastException(this.b + " is not of type " + cls)));
                }
                return this;
            } catch (ClassNotFoundException e) {
                c.b(new b.a(e));
                return this;
            }
        }

        private e<C, T> b(C c) {
            this.a = c;
            return this;
        }

        private Field b() {
            return this.b;
        }

        private T a() {
            try {
                return (T) this.b.get(this.a);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.b.set(this.a, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        private void a(b.AbstractC0056b<?> abstractC0056b) {
            T a = a();
            if (a != null) {
                try {
                    this.b.set(this.a, com.anythink.expressad.atsignalcommon.b.b.a(a, abstractC0056b, a.getClass().getInterfaces()));
                    return;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return;
                }
            }
            throw new IllegalStateException("Cannot mapping null");
        }
    }

    /* loaded from: classes2.dex */
    public static class f {
        public final Method a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i) {
            Method method = null;
            if (cls == null) {
                return;
            }
            try {
                method = cls.getDeclaredMethod(str, clsArr);
                if (i > 0 && (method.getModifiers() & i) != i) {
                    c.b(new b.a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                b.a aVar = new b.a(e);
                aVar.a(cls);
                aVar.a(str);
                c.b(aVar);
            } finally {
                this.a = method;
            }
        }

        public final Object a(Object obj, Object... objArr) {
            try {
                return this.a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        private Method a() {
            return this.a;
        }
    }

    private static <T> C0057c<T> a(Class<T> cls) {
        return new C0057c<>(cls);
    }

    private static <T> C0057c<T> a(String str) {
        try {
            return new C0057c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            b(new b.a(e2));
            return new C0057c<>(null);
        }
    }

    public static <T> C0057c<T> a(ClassLoader classLoader, String str) {
        try {
            return new C0057c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            b(new b.a(e2));
            return new C0057c<>(null);
        }
    }

    private static void a(a aVar) {
        a = aVar;
    }
}