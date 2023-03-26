package com.p7700g.p99005;

/* compiled from: ImplMessages.java */
/* loaded from: classes3.dex */
public final class rx3 {
    private static final vx3 a = new vx3("com.sun.jersey.impl.impl");
    private static final wx3 b = new wx3();

    public static String A(Object obj) {
        return b.c(S0(obj));
    }

    public static tx3 A0(Object obj) {
        return a.a("bad.accept.field", obj);
    }

    public static tx3 A1(Object obj, Object obj2, Object obj3) {
        return a.a("resource.mimetype.not.in.produceMime", obj, obj2, obj3);
    }

    public static String B(Object obj) {
        return b.c(T0(obj));
    }

    public static tx3 B0(Object obj, Object obj2) {
        return a.a("bad.class.consumemime", obj, obj2);
    }

    public static tx3 B1(Object obj, Object obj2) {
        return a.a("resource.not.acceptable", obj, obj2);
    }

    public static String C(Object obj, Object obj2) {
        return b.c(U0(obj, obj2));
    }

    public static tx3 C0(Object obj, Object obj2) {
        return a.a("bad.class.producemime", obj, obj2);
    }

    public static tx3 C1(Object obj) {
        return a.a("root.res.no.public.ctor", obj);
    }

    public static String D(Object obj, Object obj2) {
        return b.c(V0(obj, obj2));
    }

    public static tx3 D0(Object obj, Object obj2, Object obj3) {
        return a.a("bad.consumemime", obj, obj2, obj3);
    }

    public static tx3 D1() {
        return a.a("sax.cannot.enable.secure.processing.feature", new Object[0]);
    }

    public static String E(Object obj) {
        return b.c(W0(obj));
    }

    public static tx3 E0(Object obj) {
        return a.a("bad.content.type", obj);
    }

    public static tx3 E1() {
        return a.a("sax.cannot.enable.security.features", new Object[0]);
    }

    public static String F(Object obj) {
        return b.c(X0(obj));
    }

    public static tx3 F0(Object obj, Object obj2, Object obj3) {
        return a.a("bad.method.consumemime", obj, obj2, obj3);
    }

    public static tx3 F1() {
        return a.a("sax.xdk.no.security.features", new Object[0]);
    }

    public static String G(Object obj) {
        return b.c(Y0(obj));
    }

    public static tx3 G0(Object obj, Object obj2, Object obj3) {
        return a.a("bad.method.httpmethod", obj, obj2, obj3);
    }

    public static tx3 G1(Object obj, Object obj2) {
        return a.a("sub.res.method.treated.as.res.method", obj, obj2);
    }

    public static String H(Object obj, Object obj2) {
        return b.c(Z0(obj, obj2));
    }

    public static tx3 H0(Object obj, Object obj2, Object obj3) {
        return a.a("bad.method.producemime", obj, obj2, obj3);
    }

    public static tx3 H1() {
        return a.a("unable.to.write.mimemultipart", new Object[0]);
    }

    public static String I(Object obj, Object obj2) {
        return b.c(a1(obj, obj2));
    }

    public static tx3 I0(Object obj) {
        return a.a("bad.mime.type", obj);
    }

    public static tx3 I1(Object obj) {
        return a.a("warning.linkfilter.processing", obj);
    }

    public static String J(Object obj) {
        return b.c(b1(obj));
    }

    public static tx3 J0(Object obj, Object obj2) {
        return a.a("bad.uritemplate", obj, obj2);
    }

    public static tx3 J1() {
        return a.a("web.app.already.initiated", new Object[0]);
    }

    public static String K() {
        return b.c(c1());
    }

    public static tx3 K0() {
        return a.a("byte.array.cannot.be.null", new Object[0]);
    }

    public static String L(Object obj) {
        return b.c(d1(obj));
    }

    public static tx3 L0(Object obj, Object obj2) {
        return a.a("default.could.not.process.constructor", obj, obj2);
    }

    public static String M(Object obj) {
        return b.c(e1(obj));
    }

    public static tx3 M0(Object obj, Object obj2) {
        return a.a("default.could.not.process.method", obj, obj2);
    }

    public static String N(Object obj, Object obj2) {
        return b.c(f1(obj, obj2));
    }

    public static tx3 N0() {
        return a.a("error.creating.default.wadl.generator", new Object[0]);
    }

    public static String O() {
        return b.c(g1());
    }

    public static tx3 O0(Object obj) {
        return a.a("error.get.consumes.entity", obj);
    }

    public static String P(Object obj) {
        return b.c(h1(obj));
    }

    public static tx3 P0(Object obj) {
        return a.a("error.get.consumes.form.param", obj);
    }

    public static String Q(Object obj) {
        return b.c(i1(obj));
    }

    public static tx3 Q0(Object obj) {
        return a.a("error.get.returns.void", obj);
    }

    public static String R(Object obj) {
        return b.c(j1(obj));
    }

    public static tx3 R0(Object obj) {
        return a.a("error.marshalling.jaxb", obj);
    }

    public static String S(Object obj, Object obj2) {
        return b.c(k1(obj, obj2));
    }

    public static tx3 S0(Object obj) {
        return a.a("error.no.sub.res.method.locator.found", obj);
    }

    public static String T(Object obj) {
        return b.c(l1(obj));
    }

    public static tx3 T0(Object obj) {
        return a.a("error.parsing.entity.tag", obj);
    }

    public static String U(Object obj) {
        return b.c(m1(obj));
    }

    public static tx3 U0(Object obj, Object obj2) {
        return a.a("error.processing.method", obj, obj2);
    }

    public static String V(Object obj) {
        return b.c(n1(obj));
    }

    public static tx3 V0(Object obj, Object obj2) {
        return a.a("error.res.uri.path.invalid", obj, obj2);
    }

    public static String W(Object obj) {
        return b.c(o1(obj));
    }

    public static tx3 W0(Object obj) {
        return a.a("error.res.uri.path.required", obj);
    }

    public static String X(Object obj) {
        return b.c(p1(obj));
    }

    public static tx3 X0(Object obj) {
        return a.a("error.subres.loc.has.entity.param", obj);
    }

    public static String Y(Object obj, Object obj2, Object obj3) {
        return b.c(q1(obj, obj2, obj3));
    }

    public static tx3 Y0(Object obj) {
        return a.a("error.subres.loc.returns.void", obj);
    }

    public static String Z(Object obj, Object obj2, Object obj3) {
        return b.c(r1(obj, obj2, obj3));
    }

    public static tx3 Z0(Object obj, Object obj2) {
        return a.a("error.subres.loc.uri.path.invalid", obj, obj2);
    }

    public static String a(Object obj) {
        return b.c(s0(obj));
    }

    public static String a0() {
        return b.c(s1());
    }

    public static tx3 a1(Object obj, Object obj2) {
        return a.a("error.subres.method.uri.path.invalid", obj, obj2);
    }

    public static String b(Object obj, Object obj2) {
        return b.c(t0(obj, obj2));
    }

    public static String b0() {
        return b.c(t1());
    }

    public static tx3 b1(Object obj) {
        return a.a("error.unmarshalling.jaxb", obj);
    }

    public static String c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return b.c(u0(obj, obj2, obj3, obj4, obj5, obj6, obj7));
    }

    public static String c0(Object obj) {
        return b.c(u1(obj));
    }

    public static tx3 c1() {
        return a.a("exception.invoking.resource.method", new Object[0]);
    }

    public static String d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return b.c(v0(obj, obj2, obj3, obj4, obj5, obj6, obj7));
    }

    public static String d0(Object obj, Object obj2) {
        return b.c(v1(obj, obj2));
    }

    public static tx3 d1(Object obj) {
        return a.a("failed.to.create.web.resource", obj);
    }

    public static String e(Object obj, Object obj2) {
        return b.c(w0(obj, obj2));
    }

    public static String e0(Object obj) {
        return b.c(w1(obj));
    }

    public static tx3 e1(Object obj) {
        return a.a("fatal.issues.found.at.res.class", obj);
    }

    public static String f(Object obj, Object obj2, Object obj3) {
        return b.c(x0(obj, obj2, obj3));
    }

    public static String f0(Object obj) {
        return b.c(x1(obj));
    }

    public static tx3 f1(Object obj, Object obj2) {
        return a.a("generic.type.not.supported", obj, obj2);
    }

    public static String g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return b.c(y0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8));
    }

    public static String g0(Object obj) {
        return b.c(y1(obj));
    }

    public static tx3 g1() {
        return a.a("illegal.config.syntax", new Object[0]);
    }

    public static String h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return b.c(z0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8));
    }

    public static String h0(Object obj, Object obj2) {
        return b.c(z1(obj, obj2));
    }

    public static tx3 h1(Object obj) {
        return a.a("illegal.initial.capacity", obj);
    }

    public static String i(Object obj) {
        return b.c(A0(obj));
    }

    public static String i0(Object obj, Object obj2, Object obj3) {
        return b.c(A1(obj, obj2, obj3));
    }

    public static tx3 i1(Object obj) {
        return a.a("illegal.load.factor", obj);
    }

    public static String j(Object obj, Object obj2) {
        return b.c(B0(obj, obj2));
    }

    public static String j0(Object obj, Object obj2) {
        return b.c(B1(obj, obj2));
    }

    public static tx3 j1(Object obj) {
        return a.a("illegal.provider.class.name", obj);
    }

    public static String k(Object obj, Object obj2) {
        return b.c(C0(obj, obj2));
    }

    public static String k0(Object obj) {
        return b.c(C1(obj));
    }

    public static tx3 k1(Object obj, Object obj2) {
        return a.a("multiple.http.method.designators", obj, obj2);
    }

    public static String l(Object obj, Object obj2, Object obj3) {
        return b.c(D0(obj, obj2, obj3));
    }

    public static String l0() {
        return b.c(D1());
    }

    public static tx3 l1(Object obj) {
        return a.a("nested.error", obj);
    }

    public static String m(Object obj) {
        return b.c(E0(obj));
    }

    public static String m0() {
        return b.c(E1());
    }

    public static tx3 m1(Object obj) {
        return a.a("new.ar.created.by.introspection.modeler", obj);
    }

    public static String n(Object obj, Object obj2, Object obj3) {
        return b.c(F0(obj, obj2, obj3));
    }

    public static String n0() {
        return b.c(F1());
    }

    public static tx3 n1(Object obj) {
        return a.a("non.pub.res.method", obj);
    }

    public static String o(Object obj, Object obj2, Object obj3) {
        return b.c(G0(obj, obj2, obj3));
    }

    public static String o0(Object obj, Object obj2) {
        return b.c(G1(obj, obj2));
    }

    public static tx3 o1(Object obj) {
        return a.a("non.pub.sub.res.loc", obj);
    }

    public static String p(Object obj, Object obj2, Object obj3) {
        return b.c(H0(obj, obj2, obj3));
    }

    public static String p0() {
        return b.c(H1());
    }

    public static tx3 p1(Object obj) {
        return a.a("non.pub.sub.res.method", obj);
    }

    public static String q(Object obj) {
        return b.c(I0(obj));
    }

    public static String q0(Object obj) {
        return b.c(I1(obj));
    }

    public static tx3 q1(Object obj, Object obj2, Object obj3) {
        return a.a("not.valid.dynamicresolvingmethod", obj, obj2, obj3);
    }

    public static String r(Object obj, Object obj2) {
        return b.c(J0(obj, obj2));
    }

    public static String r0() {
        return b.c(J1());
    }

    public static tx3 r1(Object obj, Object obj2, Object obj3) {
        return a.a("not.valid.httpmethod", obj, obj2, obj3);
    }

    public static String s() {
        return b.c(K0());
    }

    public static tx3 s0(Object obj) {
        return a.a("ambiguous.ctors", obj);
    }

    public static tx3 s1() {
        return a.a("no.root.res.in.res.cfg", new Object[0]);
    }

    public static String t(Object obj, Object obj2) {
        return b.c(L0(obj, obj2));
    }

    public static tx3 t0(Object obj, Object obj2) {
        return a.a("ambiguous.parameter", obj, obj2);
    }

    public static tx3 t1() {
        return a.a("no.webresourceclass.in.webxml", new Object[0]);
    }

    public static String u(Object obj, Object obj2) {
        return b.c(M0(obj, obj2));
    }

    public static tx3 u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return a.a("ambiguous.rms.in", obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static tx3 u1(Object obj) {
        return a.a("object.not.a.webResource", obj);
    }

    public static String v() {
        return b.c(N0());
    }

    public static tx3 v0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return a.a("ambiguous.rms.out", obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static tx3 v1(Object obj, Object obj2) {
        return a.a("provider.could.not.be.created", obj, obj2);
    }

    public static String w(Object obj) {
        return b.c(O0(obj));
    }

    public static tx3 w0(Object obj, Object obj2) {
        return a.a("ambiguous.rr.path", obj, obj2);
    }

    public static tx3 w1(Object obj) {
        return a.a("provider.not.found", obj);
    }

    public static String x(Object obj) {
        return b.c(P0(obj));
    }

    public static tx3 x0(Object obj, Object obj2, Object obj3) {
        return a.a("ambiguous.srls", obj, obj2, obj3);
    }

    public static tx3 x1(Object obj) {
        return a.a("quality.greater.than.one", obj);
    }

    public static String y(Object obj) {
        return b.c(Q0(obj));
    }

    public static tx3 y0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return a.a("ambiguous.srms.in", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static tx3 y1(Object obj) {
        return a.a("quality.more.than.three", obj);
    }

    public static String z(Object obj) {
        return b.c(R0(obj));
    }

    public static tx3 z0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return a.a("ambiguous.srms.out", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static tx3 z1(Object obj, Object obj2) {
        return a.a("resource.method", obj, obj2);
    }
}