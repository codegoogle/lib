package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.f54;
import com.p7700g.p99005.g54;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: MACAddressAssociativeTrie.java */
/* loaded from: classes3.dex */
public class hl4<V> extends f54<gl4, V> {
    private static final long E = 1;
    private static final gl4 F = ll4.D;
    private static final gl4 G = ll4.E;

    /* compiled from: MACAddressAssociativeTrie.java */
    /* loaded from: classes3.dex */
    public static class a<V> extends f54.a<gl4, V> {
        private static final long L = 1;

        public a(gl4 gl4Var) {
            super(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        public Iterator<a<V>> B4(boolean z) {
            return super.B4(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.g54
        public void I3(g54<gl4> g54Var) {
            super.I3(g54Var);
            if (g54.t || g54Var != null) {
                return;
            }
            U3(hl4.F);
        }

        @Override // com.p7700g.p99005.f54.a
        /* renamed from: Y5 */
        public hl4<V> z5() {
            return (hl4) super.x4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: Z5 */
        public a<V> t2(gl4 gl4Var) {
            return (a) super.t2(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: a6 */
        public a<V> h() {
            return (a) super.h();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: b6 */
        public a<V> i() {
            return (a) super.i();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: c6 */
        public a<V> I4(gl4 gl4Var) {
            return new a<>(gl4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: d6 */
        public hl4<V> J4() {
            return new hl4<>();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: e6 */
        public a<V> K(gl4 gl4Var) {
            return (a) super.K(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public boolean equals(Object obj) {
            return (obj instanceof a) && super.equals(obj);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public <C> g54.e<a<V>, gl4, C> f() {
            return super.f();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: f6 */
        public a<V> L2(gl4 gl4Var) {
            return (a) super.L2(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: g6 */
        public a<V> y() {
            return (a) super.y();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: h6 */
        public a<V> j4() {
            return (a) super.j4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: i6 */
        public a<V> y3(gl4 gl4Var) {
            return (a) super.y3(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a<V>> j(boolean z) {
            return super.j(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: j6 */
        public a<V> O2(gl4 gl4Var) {
            return (a) super.O2(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<a<V>> k(boolean z) {
            return super.k(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: k6 */
        public a<V> R4() {
            return (a) super.R4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<a<V>> l(boolean z) {
            return super.l(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: l6 */
        public a<V> u3(gl4 gl4Var) {
            return (a) super.u3(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: m6 */
        public a<V> S4() {
            return (a) super.S4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: n6 */
        public a<V> T4() {
            return (a) super.T4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: o6 */
        public a<V> n2(gl4 gl4Var) {
            return (a) super.n2(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a
        /* renamed from: p6 */
        public a<V> P5() {
            return (a) super.P();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a<V>> q(boolean z) {
            return super.q(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: q6 */
        public a<V> d4() {
            return (a) super.d4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<a<V>, gl4, C> r(boolean z) {
            return super.r(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: r6 */
        public a<V> T1(gl4 gl4Var) {
            return (a) super.T1(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a<V>> s(boolean z) {
            return super.s(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: s6 */
        public a<V> W(gl4 gl4Var) {
            return (a) super.W(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: t6 */
        public a<V> j5() {
            return (a) super.j5();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: u6 */
        public a<V> k5() {
            return (a) super.k5();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a<V>> v(boolean z) {
            return super.v(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: v6 */
        public a<V> m5() {
            return (a) super.m5();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<a<V>, gl4, C> w(boolean z) {
            return super.w(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: w6 */
        public a<V> n5() {
            return (a) super.n5();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: x6 */
        public a<V> u4(gl4 gl4Var) {
            return (a) super.u4(gl4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        public Iterator<a<V>> y4(boolean z) {
            return super.y4(z);
        }

        public void y6() {
            U3(hl4.G);
        }

        public a() {
            super(hl4.F);
        }
    }

    public hl4() {
        super(new a());
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    public Iterator<a<V>> B(boolean z) {
        return super.B(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    public <C> g54.e<a<V>, gl4, C> D() {
        return super.D();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    public Iterator<a<V>> E(boolean z) {
        return super.E(z);
    }

    @Override // com.p7700g.p99005.a54
    public f54<gl4, List<a<?>>> I() {
        hl4 hl4Var = new hl4();
        L(hl4Var);
        return hl4Var;
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    /* renamed from: V4 */
    public a<V> o() {
        return (a) super.o();
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: Y4 */
    public a<V> g4(gl4 gl4Var) {
        return (a) super.E2(gl4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54.a
    /* renamed from: Z4 */
    public a<V> f3(a54.g<gl4> gVar) {
        return (a) super.f3(gVar);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: a5 */
    public void y(gl4 gl4Var) {
        if (isEmpty() && gl4Var.V0() == 8) {
            o().y6();
        }
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: b5 */
    public a<V> t2(gl4 gl4Var) {
        return (a) super.t2(gl4Var);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: c5 */
    public hl4<V> q4() {
        return (hl4) super.f();
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: d5 */
    public hl4<V> w4(a54.b<gl4> bVar) {
        return new hl4<>(bVar);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: e5 */
    public hl4<V> x4(a54.b<gl4> bVar) {
        return new hl4<>(o(), bVar);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.t44
    public boolean equals(Object obj) {
        return (obj instanceof hl4) && super.equals(obj);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: f5 */
    public a<V> y4(gl4 gl4Var) {
        return (a) super.K(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: g5 */
    public a<V> L2(gl4 gl4Var) {
        return (a) super.L2(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: h5 */
    public a<V> h2() {
        return (a) super.h2();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: i5 */
    public a<V> j4() {
        return (a) super.j4();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> j(boolean z) {
        return super.j(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: j5 */
    public a<V> y3(gl4 gl4Var) {
        return (a) super.y3(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<a<V>> k(boolean z) {
        return super.k(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.t44, com.p7700g.p99005.d54
    /* renamed from: k5 */
    public a<V> O2(gl4 gl4Var) {
        return (a) super.O2(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<a<V>> l(boolean z) {
        return super.l(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: l5 */
    public a<V> u3(gl4 gl4Var) {
        return (a) super.u3(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.t44
    /* renamed from: m5 */
    public a<V> h() {
        return (a) super.h();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: n5 */
    public a<V> n2(gl4 gl4Var) {
        return (a) super.n2(gl4Var);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: o5 */
    public a<V> O4() {
        return (a) super.M2();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: p5 */
    public a<V> d4() {
        return (a) super.d4();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> q(boolean z) {
        return super.q(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: q5 */
    public a<V> T1(gl4 gl4Var) {
        return (a) super.T1(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<a<V>, gl4, C> r(boolean z) {
        return super.r(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: r5 */
    public a<V> W(gl4 gl4Var) {
        return (a) super.W(gl4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> s(boolean z) {
        return super.s(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: s5 */
    public a<V> a3(gl4 gl4Var, V v) {
        return (a) super.a3(gl4Var, v);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: t5 */
    public a<V> U2(f54.a<gl4, V> aVar) {
        return (a) super.U2(aVar);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: u5 */
    public a<V> B2(gl4 gl4Var, Function<? super V, ? extends V> function) {
        return (a) super.B2(gl4Var, function);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> v(boolean z) {
        return super.v(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: v5 */
    public a<V> J2(gl4 gl4Var, Supplier<? extends V> supplier, boolean z) {
        return (a) super.J2(gl4Var, supplier, z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<a<V>, gl4, C> w(boolean z) {
        return super.w(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: w5 */
    public a<V> u4(gl4 gl4Var) {
        return (a) super.u4(gl4Var);
    }

    public hl4(a54.b<gl4> bVar) {
        super(new a(), bVar);
    }

    public hl4(a<V> aVar, a54.b<gl4> bVar) {
        super(aVar, bVar);
    }
}