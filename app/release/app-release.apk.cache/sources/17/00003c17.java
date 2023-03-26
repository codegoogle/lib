package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.Arrays;

/* compiled from: Intrinsics.java */
/* loaded from: classes3.dex */
public class c25 {

    /* compiled from: Intrinsics.java */
    @tp4(version = "1.4")
    /* loaded from: classes3.dex */
    public static class a {
        private a() {
        }
    }

    private c25() {
    }

    private static <T extends Throwable> T A(T t) {
        return (T) B(t, c25.class.getName());
    }

    public static <T extends Throwable> T B(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @tp4(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @tp4(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((mo4) A(new mo4()));
    }

    public static void M(String str) {
        throw ((mo4) A(new mo4(str)));
    }

    private static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    private static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((xq4) A(new xq4(str)));
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
    }

    @tp4(version = "1.1")
    public static boolean a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @tp4(version = "1.1")
    public static boolean b(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    @tp4(version = "1.1")
    public static boolean c(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @tp4(version = "1.1")
    public static boolean d(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    @tp4(version = "1.1")
    public static boolean e(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    @tp4(version = "1.1")
    public static boolean f(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(wo1.t(str, " must not be null"))));
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(wo1.v("Field specified as non-null is null: ", str, CryptoConstants.ALIAS_SEPARATOR, str2))));
        }
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace(j14.P, '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException(wo1.u("Class ", replace, " is not found. Please update the Kotlin runtime to the latest version"), e)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace(j14.P, '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException(wo1.v("Class ", replace, " is not found: this code requires the Kotlin runtime of version at least ", str2), e)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) A(new NullPointerException(wo1.t(str, " must not be null"))));
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void s(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(wo1.v("Method specified as non-null returned null: ", str, CryptoConstants.ALIAS_SEPARATOR, str2))));
        }
    }

    public static int t(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int u(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    private static String v(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder N = wo1.N("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), CryptoConstants.ALIAS_SEPARATOR, stackTraceElement.getMethodName(), ", parameter ");
        N.append(str);
        return N.toString();
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i, String str) {
        P();
    }

    public static void z(int i, String str, String str2) {
        Q(str2);
    }
}