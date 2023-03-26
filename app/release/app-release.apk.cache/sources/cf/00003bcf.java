package com.p7700g.p99005;

import com.p7700g.p99005.gw2;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper.java */
/* loaded from: classes3.dex */
public class bx2 {

    /* compiled from: ReflectionAccessFilterHelper.java */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public static final b a;

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* loaded from: classes3.dex */
        public class a extends b {
            public final /* synthetic */ Method b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.b = method;
            }

            @Override // com.p7700g.p99005.bx2.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* renamed from: com.p7700g.p99005.bx2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0152b extends b {
            public C0152b() {
                super();
            }

            @Override // com.p7700g.p99005.bx2.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        static {
            b aVar;
            if (uw2.e()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (aVar == null) {
                    aVar = new C0152b();
                }
                a = aVar;
            }
            aVar = null;
            if (aVar == null) {
            }
            a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    private bx2() {
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.a.a(accessibleObject, obj);
    }

    public static gw2.e b(List<gw2> list, Class<?> cls) {
        for (gw2 gw2Var : list) {
            gw2.e a2 = gw2Var.a(cls);
            if (a2 != gw2.e.INDECISIVE) {
                return a2;
            }
        }
        return gw2.e.ALLOW;
    }

    public static boolean c(Class<?> cls) {
        return d(cls.getName());
    }

    private static boolean d(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || g(str);
    }

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        return d(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean f(Class<?> cls) {
        return g(cls.getName());
    }

    private static boolean g(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}