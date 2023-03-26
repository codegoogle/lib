package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.f54;
import com.p7700g.p99005.g54;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: IPv6AddressAssociativeTrie.java */
/* loaded from: classes3.dex */
public class oi4<V> extends f54<ni4, V> {
    private static final long E = 1;
    private static final ni4 F = ui4.D;

    /* compiled from: IPv6AddressAssociativeTrie.java */
    /* loaded from: classes3.dex */
    public static class a<V> extends f54.a<ni4, V> {
        private static final long L = 1;

        public a(ni4 ni4Var) {
            super(ni4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        public Iterator<a<V>> B4(boolean z) {
            return super.B4(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.g54
        public void I3(g54<ni4> g54Var) {
            super.I3(g54Var);
            if (g54.t || g54Var != null) {
                return;
            }
            U3(oi4.F);
        }

        @Override // com.p7700g.p99005.f54.a
        /* renamed from: Y5 */
        public oi4<V> z5() {
            return (oi4) super.x4();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: Z5 */
        public a<V> t2(ni4 ni4Var) {
            return (a) super.t2(ni4Var);
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
        public a<V> I4(ni4 ni4Var) {
            return new a<>(ni4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: d6 */
        public oi4<V> J4() {
            return new oi4<>();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: e6 */
        public a<V> K(ni4 ni4Var) {
            return (a) super.K(ni4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public boolean equals(Object obj) {
            return (obj instanceof a) && super.equals(obj);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public <C> g54.e<a<V>, ni4, C> f() {
            return super.f();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: f6 */
        public a<V> L2(ni4 ni4Var) {
            return (a) super.L2(ni4Var);
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
        public a<V> y3(ni4 ni4Var) {
            return (a) super.y3(ni4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a<V>> j(boolean z) {
            return super.j(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: j6 */
        public a<V> O2(ni4 ni4Var) {
            return (a) super.O2(ni4Var);
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
        public a<V> u3(ni4 ni4Var) {
            return (a) super.u3(ni4Var);
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
        public a<V> n2(ni4 ni4Var) {
            return (a) super.n2(ni4Var);
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
        public <C> g54.e<a<V>, ni4, C> r(boolean z) {
            return super.r(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: r6 */
        public a<V> T1(ni4 ni4Var) {
            return (a) super.T1(ni4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a<V>> s(boolean z) {
            return super.s(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: s6 */
        public a<V> W(ni4 ni4Var) {
            return (a) super.W(ni4Var);
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
        public <C> g54.e<a<V>, ni4, C> w(boolean z) {
            return super.w(z);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        /* renamed from: w6 */
        public a<V> n5() {
            return (a) super.n5();
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: x6 */
        public a<V> u4(ni4 ni4Var) {
            return (a) super.u4(ni4Var);
        }

        @Override // com.p7700g.p99005.f54.a, com.p7700g.p99005.a54.g
        public Iterator<a<V>> y4(boolean z) {
            return super.y4(z);
        }

        public a() {
            super(oi4.F);
        }
    }

    public oi4() {
        super(new a());
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    public Iterator<a<V>> B(boolean z) {
        return super.B(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    public <C> g54.e<a<V>, ni4, C> D() {
        return super.D();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    public Iterator<a<V>> E(boolean z) {
        return super.E(z);
    }

    @Override // com.p7700g.p99005.a54
    public f54<ni4, List<a<?>>> I() {
        oi4 oi4Var = new oi4();
        L(oi4Var);
        return oi4Var;
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54
    /* renamed from: V4 */
    public a<V> o() {
        return (a) super.o();
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: X4 */
    public a<V> g4(ni4 ni4Var) {
        return (a) super.E2(ni4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54.a
    /* renamed from: Y4 */
    public a<V> f3(a54.g<ni4> gVar) {
        return (a) super.f3(gVar);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: Z4 */
    public a<V> t2(ni4 ni4Var) {
        return (a) super.t2(ni4Var);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: a5 */
    public oi4<V> q4() {
        return (oi4) super.f();
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: b5 */
    public oi4<V> w4(a54.b<ni4> bVar) {
        return new oi4<>(bVar);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: c5 */
    public oi4<V> x4(a54.b<ni4> bVar) {
        return new oi4<>(o(), bVar);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: d5 */
    public a<V> y4(ni4 ni4Var) {
        return (a) super.K(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: e5 */
    public a<V> L2(ni4 ni4Var) {
        return (a) super.L2(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.t44
    public boolean equals(Object obj) {
        return (obj instanceof oi4) && super.equals(obj);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: f5 */
    public a<V> h2() {
        return (a) super.h2();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: g5 */
    public a<V> j4() {
        return (a) super.j4();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: h5 */
    public a<V> y3(ni4 ni4Var) {
        return (a) super.y3(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.t44, com.p7700g.p99005.d54
    /* renamed from: i5 */
    public a<V> O2(ni4 ni4Var) {
        return (a) super.O2(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> j(boolean z) {
        return super.j(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: j5 */
    public a<V> u3(ni4 ni4Var) {
        return (a) super.u3(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<a<V>> k(boolean z) {
        return super.k(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.t44
    /* renamed from: k5 */
    public a<V> h() {
        return (a) super.h();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<a<V>> l(boolean z) {
        return super.l(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: l5 */
    public a<V> n2(ni4 ni4Var) {
        return (a) super.n2(ni4Var);
    }

    @Override // com.p7700g.p99005.f54
    /* renamed from: m5 */
    public a<V> O4() {
        return (a) super.M2();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: n5 */
    public a<V> d4() {
        return (a) super.d4();
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: o5 */
    public a<V> T1(ni4 ni4Var) {
        return (a) super.T1(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: p5 */
    public a<V> W(ni4 ni4Var) {
        return (a) super.W(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> q(boolean z) {
        return super.q(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: q5 */
    public a<V> a3(ni4 ni4Var, V v) {
        return (a) super.a3(ni4Var, v);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<a<V>, ni4, C> r(boolean z) {
        return super.r(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: r5 */
    public a<V> U2(f54.a<ni4, V> aVar) {
        return (a) super.U2(aVar);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> s(boolean z) {
        return super.s(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: s5 */
    public a<V> B2(ni4 ni4Var, Function<? super V, ? extends V> function) {
        return (a) super.B2(ni4Var, function);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.d54.c
    /* renamed from: t5 */
    public a<V> J2(ni4 ni4Var, Supplier<? extends V> supplier, boolean z) {
        return (a) super.J2(ni4Var, supplier, z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: u5 */
    public a<V> u4(ni4 ni4Var) {
        return (a) super.u4(ni4Var);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a<V>> v(boolean z) {
        return super.v(z);
    }

    @Override // com.p7700g.p99005.f54, com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<a<V>, ni4, C> w(boolean z) {
        return super.w(z);
    }

    public oi4(a54.b<ni4> bVar) {
        super(new a(), bVar);
    }

    public oi4(a<V> aVar, a54.b<ni4> bVar) {
        super(aVar, bVar);
    }
}