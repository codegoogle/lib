package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import com.p7700g.p99005.en4;
import com.p7700g.p99005.ym4;
import java.lang.reflect.ReflectPermission;
import java.net.URL;

/* compiled from: RuntimeDelegate.java */
/* loaded from: classes3.dex */
public abstract class mn4 {
    public static final String a = "javax.ws.rs.ext.RuntimeDelegate";
    private static final String b = "com.sun.ws.rs.ext.RuntimeDelegateImpl";
    private static ReflectPermission c = new ReflectPermission("suppressAccessChecks");
    private static volatile mn4 d;

    /* compiled from: RuntimeDelegate.java */
    /* loaded from: classes3.dex */
    public interface a<T> {
        T a(String str) throws IllegalArgumentException;

        String b(T t);
    }

    private static mn4 f() {
        try {
            Object a2 = hn4.a(a, b);
            if (!(a2 instanceof mn4)) {
                String str = mn4.class.getName().replace('.', j14.P) + ".class";
                ClassLoader classLoader = mn4.class.getClassLoader();
                if (classLoader == null) {
                    classLoader = ClassLoader.getSystemClassLoader();
                }
                URL resource = classLoader.getResource(str);
                throw new LinkageError("ClassCastException: attempting to cast" + a2.getClass().getClassLoader().getResource(str) + aa.h.d + resource.toString());
            }
            return (mn4) a2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static mn4 g() {
        mn4 mn4Var = d;
        if (mn4Var == null) {
            synchronized (mn4.class) {
                mn4Var = d;
                if (mn4Var == null) {
                    mn4Var = f();
                    d = mn4Var;
                }
            }
        }
        return mn4Var;
    }

    public static void h(mn4 mn4Var) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(c);
        }
        synchronized (mn4.class) {
            d = mn4Var;
        }
    }

    public abstract <T> T a(mm4 mm4Var, Class<T> cls) throws IllegalArgumentException, UnsupportedOperationException;

    public abstract <T> a<T> b(Class<T> cls);

    public abstract ym4.a c();

    public abstract bn4 d();

    public abstract en4.a e();
}