package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: Reflection.java */
/* loaded from: classes3.dex */
public class c35 {
    private static final d35 a;
    public static final String b = " (Kotlin reflection is not available)";
    private static final u55[] c;

    static {
        d35 d35Var = null;
        try {
            d35Var = (d35) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (d35Var == null) {
            d35Var = new d35();
        }
        a = d35Var;
        c = new u55[0];
    }

    @tp4(version = "1.4")
    public static j65 A(Class cls) {
        return a.s(d(cls), Collections.emptyList(), false);
    }

    @tp4(version = "1.4")
    public static j65 B(Class cls, l65 l65Var) {
        return a.s(d(cls), Collections.singletonList(l65Var), false);
    }

    @tp4(version = "1.4")
    public static j65 C(Class cls, l65 l65Var, l65 l65Var2) {
        return a.s(d(cls), Arrays.asList(l65Var, l65Var2), false);
    }

    @tp4(version = "1.4")
    public static j65 D(Class cls, l65... l65VarArr) {
        return a.s(d(cls), as4.iz(l65VarArr), false);
    }

    @tp4(version = "1.4")
    public static j65 E(x55 x55Var) {
        return a.s(x55Var, Collections.emptyList(), false);
    }

    @tp4(version = "1.4")
    public static k65 F(Object obj, String str, m65 m65Var, boolean z) {
        return a.t(obj, str, m65Var, z);
    }

    public static u55 a(Class cls) {
        return a.a(cls);
    }

    public static u55 b(Class cls, String str) {
        return a.b(cls, str);
    }

    public static z55 c(x15 x15Var) {
        return a.c(x15Var);
    }

    public static u55 d(Class cls) {
        return a.d(cls);
    }

    public static u55 e(Class cls, String str) {
        return a.e(cls, str);
    }

    public static u55[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return c;
        }
        u55[] u55VarArr = new u55[length];
        for (int i = 0; i < length; i++) {
            u55VarArr[i] = d(clsArr[i]);
        }
        return u55VarArr;
    }

    @tp4(version = "1.4")
    public static y55 g(Class cls) {
        return a.f(cls, "");
    }

    public static y55 h(Class cls, String str) {
        return a.f(cls, str);
    }

    @tp4(version = "1.6")
    public static j65 i(j65 j65Var) {
        return a.g(j65Var);
    }

    public static b65 j(l25 l25Var) {
        return a.h(l25Var);
    }

    public static c65 k(n25 n25Var) {
        return a.i(n25Var);
    }

    public static d65 l(p25 p25Var) {
        return a.j(p25Var);
    }

    @tp4(version = "1.6")
    public static j65 m(j65 j65Var) {
        return a.k(j65Var);
    }

    @tp4(version = "1.4")
    public static j65 n(Class cls) {
        return a.s(d(cls), Collections.emptyList(), true);
    }

    @tp4(version = "1.4")
    public static j65 o(Class cls, l65 l65Var) {
        return a.s(d(cls), Collections.singletonList(l65Var), true);
    }

    @tp4(version = "1.4")
    public static j65 p(Class cls, l65 l65Var, l65 l65Var2) {
        return a.s(d(cls), Arrays.asList(l65Var, l65Var2), true);
    }

    @tp4(version = "1.4")
    public static j65 q(Class cls, l65... l65VarArr) {
        return a.s(d(cls), as4.iz(l65VarArr), true);
    }

    @tp4(version = "1.4")
    public static j65 r(x55 x55Var) {
        return a.s(x55Var, Collections.emptyList(), true);
    }

    @tp4(version = "1.6")
    public static j65 s(j65 j65Var, j65 j65Var2) {
        return a.l(j65Var, j65Var2);
    }

    public static g65 t(u25 u25Var) {
        return a.m(u25Var);
    }

    public static h65 u(w25 w25Var) {
        return a.n(w25Var);
    }

    public static i65 v(y25 y25Var) {
        return a.o(y25Var);
    }

    @tp4(version = "1.3")
    public static String w(v15 v15Var) {
        return a.p(v15Var);
    }

    @tp4(version = "1.1")
    public static String x(e25 e25Var) {
        return a.q(e25Var);
    }

    @tp4(version = "1.4")
    public static void y(k65 k65Var, j65 j65Var) {
        a.r(k65Var, Collections.singletonList(j65Var));
    }

    @tp4(version = "1.4")
    public static void z(k65 k65Var, j65... j65VarArr) {
        a.r(k65Var, as4.iz(j65VarArr));
    }
}