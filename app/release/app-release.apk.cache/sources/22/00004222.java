package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.f54;
import com.p7700g.p99005.g54;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/* compiled from: IPv4AddressTrie.java */
/* loaded from: classes3.dex */
public class fc4 extends a54<yb4> {
    private static final long C = 1;
    public static final yb4 D = new r14("0.0.0.0/0").a1().A5();

    /* compiled from: IPv4AddressTrie.java */
    /* loaded from: classes3.dex */
    public static class a extends a54.g<yb4> {
        private static final long J = 1;

        public a(yb4 yb4Var) {
            super(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: A5 */
        public a t2(yb4 yb4Var) {
            return (a) super.t2(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        public Iterator<? extends a54.g<yb4>> B4(boolean z) {
            return super.B4(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: B5 */
        public a h() {
            return (a) super.h();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: C5 */
        public a i() {
            return (a) super.i();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: D5 */
        public a I4(yb4 yb4Var) {
            return new a(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: E5 */
        public fc4 J4() {
            return new fc4();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: F5 */
        public a K(yb4 yb4Var) {
            return (a) super.K(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: G5 */
        public a L2(yb4 yb4Var) {
            return (a) super.L2(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: H5 */
        public a j4() {
            return (a) super.A();
        }

        @Override // com.p7700g.p99005.g54
        public void I3(g54<yb4> g54Var) {
            super.I3(g54Var);
            if (g54.t || g54Var != null) {
                return;
            }
            U3(fc4.D);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: I5 */
        public a y3(yb4 yb4Var) {
            return (a) super.y3(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: J5 */
        public a O2(yb4 yb4Var) {
            return (a) c54.a(this, yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: K5 */
        public a R4() {
            return (a) super.D();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: L5 */
        public a u3(yb4 yb4Var) {
            return (a) super.u3(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: M5 */
        public a S4() {
            return (a) super.H();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: N5 */
        public a T4() {
            return (a) super.I();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: O5 */
        public a n2(yb4 yb4Var) {
            return (a) super.n2(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: P5 */
        public a d4() {
            return (a) super.Q();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: Q5 */
        public a T1(yb4 yb4Var) {
            return (a) super.T1(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: R5 */
        public a W(yb4 yb4Var) {
            return (a) super.W(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: S5 */
        public a j5() {
            return (a) super.T();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: T5 */
        public a k5() {
            return (a) super.V();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: U5 */
        public a m5() {
            return (a) super.j3();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: V5 */
        public a n5() {
            return (a) super.k3();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: W5 */
        public a u4(yb4 yb4Var) {
            return (a) super.u4(yb4Var);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public boolean equals(Object obj) {
            return (obj instanceof a) && super.equals(obj);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public <C> g54.e<a, yb4, C> f() {
            return super.f();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a> j(boolean z) {
            return super.j(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<a> k(boolean z) {
            return super.k(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<a> l(boolean z) {
            return super.l(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a> q(boolean z) {
            return super.q(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<a, yb4, C> r(boolean z) {
            return super.r(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a> s(boolean z) {
            return super.s(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<a> v(boolean z) {
            return super.v(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<a, yb4, C> w(boolean z) {
            return super.w(z);
        }

        @Override // com.p7700g.p99005.a54.g
        public Iterator<? extends a54.g<yb4>> y4(boolean z) {
            return super.y4(z);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: z5 */
        public fc4 x4() {
            return (fc4) super.x4();
        }

        public a() {
            super(fc4.D);
        }
    }

    public fc4() {
        super(new a());
    }

    @Override // com.p7700g.p99005.a54
    public Iterator<? extends a54.g<yb4>> B(boolean z) {
        return super.B(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: B4 */
    public a L2(yb4 yb4Var) {
        return (a) super.L2(yb4Var);
    }

    @Override // com.p7700g.p99005.a54
    public <C> g54.e<a, yb4, C> D() {
        return super.D();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: D4 */
    public a j4() {
        return (a) super.j4();
    }

    @Override // com.p7700g.p99005.a54
    public Iterator<? extends a54.g<yb4>> E(boolean z) {
        return super.E(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: E4 */
    public a y3(yb4 yb4Var) {
        return (a) super.y3(yb4Var);
    }

    @Override // com.p7700g.p99005.t44, com.p7700g.p99005.d54
    /* renamed from: F4 */
    public a O2(yb4 yb4Var) {
        return (a) c54.a(this, yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: G4 */
    public a u3(yb4 yb4Var) {
        return (a) super.u3(yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.t44
    /* renamed from: H4 */
    public a h() {
        return (a) super.h();
    }

    @Override // com.p7700g.p99005.a54
    public f54<yb4, ? extends List<? extends f54.a<yb4, ?>>> I() {
        zb4 zb4Var = new zb4();
        L(zb4Var);
        return zb4Var;
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: I4 */
    public a n2(yb4 yb4Var) {
        return (a) super.n2(yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: J4 */
    public a d4() {
        return (a) super.d4();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: K4 */
    public a T1(yb4 yb4Var) {
        return (a) super.T1(yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: L4 */
    public a W(yb4 yb4Var) {
        return (a) super.W(yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: M4 */
    public a u4(yb4 yb4Var) {
        return (a) super.u4(yb4Var);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: e4 */
    public a o() {
        return (a) super.o();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.t44
    public boolean equals(Object obj) {
        return (obj instanceof fc4) && super.equals(obj);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54.a
    /* renamed from: g4 */
    public a E2(yb4 yb4Var) {
        return (a) super.E2(yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a> j(boolean z) {
        return super.j(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<a> k(boolean z) {
        return super.k(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<a> l(boolean z) {
        return super.l(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54.a
    /* renamed from: n4 */
    public a f3(a54.g<yb4> gVar) {
        return (a) super.f3(gVar);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: p4 */
    public a t2(yb4 yb4Var) {
        return (a) super.t2(yb4Var);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a> q(boolean z) {
        return super.q(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.t44
    /* renamed from: q4 */
    public fc4 f() {
        return (fc4) super.f();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<a, yb4, C> r(boolean z) {
        return super.r(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a> s(boolean z) {
        return super.s(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<a> v(boolean z) {
        return super.v(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<a, yb4, C> w(boolean z) {
        return super.w(z);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: w4 */
    public fc4 M(a54.b<yb4> bVar) {
        return new fc4(bVar);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: x4 */
    public fc4 O(a54.b<yb4> bVar) {
        return new fc4(o(), bVar);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: y4 */
    public a K(yb4 yb4Var) {
        return (a) super.K(yb4Var);
    }

    public fc4(a54.b<yb4> bVar) {
        super(new a(), bVar);
    }

    public fc4(a aVar, a54.b<yb4> bVar) {
        super(aVar, bVar);
    }
}