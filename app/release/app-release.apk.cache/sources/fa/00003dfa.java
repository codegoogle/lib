package com.p7700g.p99005;

import java.util.List;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes3.dex */
public class d35 {
    private static final String a = "kotlin.jvm.functions.";

    public u55 a(Class cls) {
        return new m15(cls);
    }

    public u55 b(Class cls, String str) {
        return new m15(cls);
    }

    public z55 c(x15 x15Var) {
        return x15Var;
    }

    public u55 d(Class cls) {
        return new m15(cls);
    }

    public u55 e(Class cls, String str) {
        return new m15(cls);
    }

    public y55 f(Class cls, String str) {
        return new s25(cls, str);
    }

    @tp4(version = "1.6")
    public j65 g(j65 j65Var) {
        m35 m35Var = (m35) j65Var;
        return new m35(j65Var.C3(), j65Var.n(), m35Var.k(), m35Var.i() | 2);
    }

    public b65 h(l25 l25Var) {
        return l25Var;
    }

    public c65 i(n25 n25Var) {
        return n25Var;
    }

    public d65 j(p25 p25Var) {
        return p25Var;
    }

    @tp4(version = "1.6")
    public j65 k(j65 j65Var) {
        m35 m35Var = (m35) j65Var;
        return new m35(j65Var.C3(), j65Var.n(), m35Var.k(), m35Var.i() | 4);
    }

    @tp4(version = "1.6")
    public j65 l(j65 j65Var, j65 j65Var2) {
        return new m35(j65Var.C3(), j65Var.n(), j65Var2, ((m35) j65Var).i());
    }

    public g65 m(u25 u25Var) {
        return u25Var;
    }

    public h65 n(w25 w25Var) {
        return w25Var;
    }

    public i65 o(y25 y25Var) {
        return y25Var;
    }

    @tp4(version = "1.3")
    public String p(v15 v15Var) {
        String obj = v15Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(a) ? obj.substring(21) : obj;
    }

    @tp4(version = "1.1")
    public String q(e25 e25Var) {
        return p(e25Var);
    }

    @tp4(version = "1.4")
    public void r(k65 k65Var, List<j65> list) {
        ((l35) k65Var).d(list);
    }

    @tp4(version = "1.4")
    public j65 s(x55 x55Var, List<l65> list, boolean z) {
        return new m35(x55Var, list, z);
    }

    @tp4(version = "1.4")
    public k65 t(Object obj, String str, m65 m65Var, boolean z) {
        return new l35(obj, str, m65Var, z);
    }
}