package com.p7700g.p99005;

/* compiled from: SpiMessages.java */
/* loaded from: classes3.dex */
public final class sx3 {
    private static final vx3 a = new vx3("com.sun.jersey.impl.spi");
    private static final wx3 b = new wx3();

    public static String a(Object obj, Object obj2, Object obj3) {
        return b.c(l(obj, obj2, obj3));
    }

    public static String b(Object obj, Object obj2, Object obj3) {
        return b.c(m(obj, obj2, obj3));
    }

    public static String c() {
        return b.c(n());
    }

    public static String d(Object obj) {
        return b.c(o(obj));
    }

    public static String e(Object obj) {
        return b.c(p(obj));
    }

    public static String f(Object obj) {
        return b.c(q(obj));
    }

    public static String g(Object obj, Object obj2, Object obj3) {
        return b.c(r(obj, obj2, obj3));
    }

    public static String h(Object obj, Object obj2, Object obj3) {
        return b.c(s(obj, obj2, obj3));
    }

    public static String i(Object obj, Object obj2) {
        return b.c(t(obj, obj2));
    }

    public static String j() {
        return b.c(u());
    }

    public static String k() {
        return b.c(v());
    }

    public static tx3 l(Object obj, Object obj2, Object obj3) {
        return a.a("dependent.class.of.provider.format.error", obj, obj2, obj3);
    }

    public static tx3 m(Object obj, Object obj2, Object obj3) {
        return a.a("dependent.class.of.provider.not.found", obj, obj2, obj3);
    }

    public static tx3 n() {
        return a.a("illegal.config.syntax", new Object[0]);
    }

    public static tx3 o(Object obj) {
        return a.a("illegal.provider.class.name", obj);
    }

    public static tx3 p(Object obj) {
        return a.a("osgi.registry.error.opening.resource.stream", obj);
    }

    public static tx3 q(Object obj) {
        return a.a("osgi.registry.error.processing.resource.stream", obj);
    }

    public static tx3 r(Object obj, Object obj2, Object obj3) {
        return a.a("provider.class.could.not.be.loaded", obj, obj2, obj3);
    }

    public static tx3 s(Object obj, Object obj2, Object obj3) {
        return a.a("provider.could.not.be.created", obj, obj2, obj3);
    }

    public static tx3 t(Object obj, Object obj2) {
        return a.a("provider.not.found", obj, obj2);
    }

    public static tx3 u() {
        return a.a("template.name.to.value.not.null", new Object[0]);
    }

    public static tx3 v() {
        return a.a("uritemplate.cannot.be.null", new Object[0]);
    }
}