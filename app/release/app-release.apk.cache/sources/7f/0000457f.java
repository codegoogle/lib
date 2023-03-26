package com.p7700g.p99005;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: Errors.java */
/* loaded from: classes3.dex */
public final class gy3 {
    private static final Logger a = Logger.getLogger(gy3.class.getName());
    private static ThreadLocal<gy3> b = new ThreadLocal<>();
    private final ArrayList<c> c = new ArrayList<>(0);
    private int d = -1;
    private int e = 0;
    private boolean f = true;

    /* compiled from: Errors.java */
    /* loaded from: classes3.dex */
    public interface b<T> {
        T f();
    }

    /* compiled from: Errors.java */
    /* loaded from: classes3.dex */
    public static class c {
        public final String a;
        public final boolean b;

        public boolean equals(Object obj) {
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                String str = this.a;
                if (str != null ? str.equals(cVar.a) : cVar.a == null) {
                    return this.b == cVar.b;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            return ((111 + (str != null ? str.hashCode() : 0)) * 37) + (this.b ? 1 : 0);
        }

        private c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    /* compiled from: Errors.java */
    /* loaded from: classes3.dex */
    public static class d extends RuntimeException {
        public final List<c> s;

        private d(List<c> list) {
            this.s = list;
        }
    }

    private void a() {
        this.d = this.c.size();
    }

    private void b() {
        int i = this.d;
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        ArrayList<c> arrayList = this.c;
        arrayList.subList(this.d, arrayList.size()).clear();
        c();
    }

    private void c() {
        this.d = -1;
    }

    public static void d(Class cls) {
        StringBuilder G = wo1.G("The class ");
        G.append(cls.getName());
        G.append(" is an abstract class and cannot be instantiated.");
        e(G.toString());
    }

    public static void e(String str) {
        f(str, true);
    }

    public static void f(String str, boolean z) {
        g().c.add(new c(str, z));
    }

    private static gy3 g() {
        gy3 gy3Var = b.get();
        if (gy3Var != null) {
            if (gy3Var.e != 0) {
                return gy3Var;
            }
            b.remove();
            throw new IllegalStateException("There is no error processing in scope");
        }
        throw new IllegalStateException("There is no error processing in scope");
    }

    public static boolean h() {
        return g().f;
    }

    public static void i(Class cls) {
        StringBuilder G = wo1.G("The inner class ");
        G.append(cls.getName());
        G.append(" is not a static inner class and cannot be instantiated.");
        e(G.toString());
    }

    public static void j(Class cls) {
        StringBuilder G = wo1.G("The class ");
        G.append(cls.getName());
        G.append(" is an interface and cannot be instantiated.");
        e(G.toString());
    }

    public static void k() {
        g().a();
    }

    public static void l(Constructor constructor, int i) {
        e("Missing dependency for constructor " + constructor + " at parameter index " + i);
    }

    public static void m(Field field) {
        if (h()) {
            StringBuilder G = wo1.G("Missing dependency for field: ");
            G.append(field.toGenericString());
            e(G.toString());
        }
    }

    public static void n(Method method, int i) {
        if (h()) {
            e("Missing dependency for method " + method + " at parameter at index " + i);
        }
    }

    public static void o(Class cls) {
        StringBuilder G = wo1.G("The class ");
        G.append(cls.getName());
        G.append(" is a not a public class and cannot be instantiated.");
        e(G.toString());
    }

    public static void p(Class cls) {
        StringBuilder G = wo1.G("The class ");
        G.append(cls.getName());
        G.append(" does not have a public constructor and cannot be instantiated.");
        e(G.toString());
    }

    private void r(boolean z) {
        int i = this.e - 1;
        this.e = i;
        this.f = true;
        if (i == 0) {
            try {
                if (!this.c.isEmpty()) {
                    t(z, this.c);
                }
            } finally {
                b.remove();
            }
        }
    }

    private void s() {
        this.e++;
    }

    private static void t(boolean z, List<c> list) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (c cVar : list) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(g54.A);
            if (cVar.b) {
                sb.append("SEVERE: ");
            } else {
                sb.append("WARNING: ");
            }
            z2 |= cVar.b;
            sb.append(cVar.a);
        }
        String sb2 = sb.toString();
        if (z2) {
            Logger logger = a;
            logger.severe("The following errors and warnings have been detected with resource and/or provider classes:\n" + sb2);
            if (z) {
                throw new d(new ArrayList(list));
            }
            return;
        }
        Logger logger2 = a;
        logger2.warning("The following warnings have been detected with resource and/or provider classes:\n" + sb2);
    }

    public static <T> T u(b<T> bVar) {
        gy3 gy3Var = b.get();
        if (gy3Var == null) {
            gy3Var = new gy3();
            b.set(gy3Var);
        }
        gy3Var.s();
        try {
            T f = bVar.f();
            gy3Var.r(true);
            return f;
        } catch (RuntimeException e) {
            gy3Var.r(false);
            throw e;
        } catch (Throwable th) {
            gy3Var.r(true);
            throw th;
        }
    }

    public static void v() {
        g().b();
    }

    public static void w(boolean z) {
        g().f = z;
    }

    public static void x() {
        g().c();
    }

    public int q() {
        return g().c.size();
    }
}