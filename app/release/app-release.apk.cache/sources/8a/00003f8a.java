package com.p7700g.p99005;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes3.dex */
public abstract class dx2 {

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    public class a extends dx2 {
        public final /* synthetic */ Method a;
        public final /* synthetic */ Object b;

        public a(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }

        @Override // com.p7700g.p99005.dx2
        public <T> T e(Class<T> cls) throws Exception {
            dx2.b(cls);
            return (T) this.a.invoke(this.b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    public class b extends dx2 {
        public final /* synthetic */ Method a;
        public final /* synthetic */ int b;

        public b(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.p7700g.p99005.dx2
        public <T> T e(Class<T> cls) throws Exception {
            dx2.b(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    public class c extends dx2 {
        public final /* synthetic */ Method a;

        public c(Method method) {
            this.a = method;
        }

        @Override // com.p7700g.p99005.dx2
        public <T> T e(Class<T> cls) throws Exception {
            dx2.b(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    public class d extends dx2 {
        @Override // com.p7700g.p99005.dx2
        public <T> T e(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String c2 = c(cls);
        if (c2 != null) {
            throw new AssertionError(wo1.t("UnsafeAllocator is used for non-instantiable type: ", c2));
        }
    }

    public static String c(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder G = wo1.G("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            G.append(cls.getName());
            return G.toString();
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder G2 = wo1.G("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
            G2.append(cls.getName());
            return G2.toString();
        } else {
            return null;
        }
    }

    public static dx2 d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T e(Class<T> cls) throws Exception;
}