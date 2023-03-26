package com.p7700g.p99005;

import com.p7700g.p99005.f54;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.n04;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Function;

/* compiled from: AddressTrie.java */
/* loaded from: classes3.dex */
public abstract class a54<E extends n04> extends t44<E> {
    private static final long v = 1;
    public static final f<?> w = new f<>(new c());
    public static final f<?> x = new f<>(Collections.reverseOrder(new c()));
    private g<E> A;
    private g54.f.a B;
    public e54<E> y;
    public b<E> z;

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public class a {
        public g54.g a;
        public f54.a<E, List<f54.a<E, ?>>> b;

        public a(g54.g gVar, f54.a<E, List<f54.a<E, ?>>> aVar) {
            this.a = gVar;
            this.b = aVar;
        }
    }

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public static class b<E extends n04> extends g54.d<E> {
        private static final long y = 1;
        public E A;
        public E B;
        public E C;
        public E z;

        public b(E e, E e2, Comparator<? super E> comparator) {
            this(e, true, e2, false, comparator);
        }

        public static <E extends n04> b<E> Q(E e, boolean z, E e2, boolean z2, Comparator<? super E> comparator) {
            E e3 = (e != null && z && e.V1()) ? null : e;
            E e4 = (e2 != null && z2 && e2.P3()) ? null : e2;
            if (e3 == null && e4 == null) {
                return null;
            }
            return new b<>(e3, z, e4, z2, comparator);
        }

        @Override // com.p7700g.p99005.g54.d
        public String L(String str) {
            m44 m44Var = m44.a;
            return N(m44Var, str, m44Var);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: P */
        public b<E> d(E e, boolean z, E e2, boolean z2, Comparator<? super E> comparator) {
            return new b<>(e, z, e2, z2, comparator);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: R */
        public b<E> h(E e, boolean z, E e2, boolean z2) {
            return (b) super.h(e, z, e2, z2);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: S */
        public boolean m(E e) {
            E e2 = this.B;
            if (e2 == null) {
                e2 = (E) a54.j3((n04) this.u);
                this.B = e2;
            }
            return e2 != null && e2.equals(e);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: T */
        public boolean n(E e) {
            E e2 = this.z;
            if (e2 == null) {
                e2 = (E) a54.j3((n04) this.v);
                this.z = e2;
            }
            return e2 != null && e2.equals(e);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: U */
        public boolean o(E e) {
            E e2 = this.C;
            if (e2 == null) {
                e2 = (E) a54.P((n04) this.u);
                this.C = e2;
            }
            return e2 != null && e2.equals(e);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: V */
        public boolean p(E e) {
            E e2 = this.A;
            if (e2 == null) {
                e2 = (E) a54.P((n04) this.v);
                this.A = e2;
            }
            return e2 != null && e2.equals(e);
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: X */
        public boolean y(E e) {
            return e.P3();
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: Z */
        public boolean A(E e) {
            return e.V1();
        }

        @Override // com.p7700g.p99005.g54.d
        /* renamed from: w0 */
        public b<E> I(E e, boolean z, E e2, boolean z2) {
            return (b) super.I(e, z, e2, z2);
        }

        public b(E e, boolean z, E e2, boolean z2, Comparator<? super E> comparator) {
            super(e, z, e2, z2, comparator);
            if (e != null) {
                t44.a(e, true);
            }
            if (e2 != null) {
                t44.a(e2, true);
            }
        }
    }

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public static class c<E extends n04> implements Comparator<E>, Serializable {
        private static final long s = 1;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
            return r14 - r15;
         */
        @Override // java.util.Comparator
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int compare(E e, E e2) {
            int B1;
            int B12;
            int intValue;
            if (e == e2) {
                return 0;
            }
            int V0 = e.V0();
            int u2 = e.u2();
            int i = 32 - u2;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                x04 D0 = e.D0(i2);
                x04 D02 = e2.D0(i2);
                Integer d3 = a54.d3(e, i3, D0);
                Integer d32 = a54.d3(e2, i3, D02);
                if (d3 != null) {
                    int intValue2 = d3.intValue();
                    if (d32 == null || (intValue = d32.intValue()) > intValue2) {
                        if (a54.Z(D0, D02, intValue2, i) < intValue2) {
                            B1 = D0.B1();
                            B12 = D02.B1();
                            break;
                        } else if (intValue2 < u2) {
                            return D02.f1(intValue2) ? -1 : 1;
                        } else {
                            i2++;
                            if (i2 == V0) {
                                return 1;
                            }
                            i3 += u2;
                        }
                    } else if (a54.Z(D0, D02, intValue, i) >= intValue) {
                        if (intValue == intValue2) {
                            return 0;
                        }
                        return D0.f1(intValue) ? 1 : -1;
                    } else {
                        B1 = D0.B1();
                        B12 = D02.B1();
                    }
                } else if (d32 == null) {
                    if (a54.Z(D0, D02, u2, i) < u2) {
                        B1 = D0.B1();
                        B12 = D02.B1();
                        break;
                    }
                    i2++;
                    if (i2 == V0) {
                        return 0;
                    }
                    i3 += u2;
                } else {
                    int intValue3 = d32.intValue();
                    if (a54.Z(D0, D02, intValue3, i) < d32.intValue()) {
                        B1 = D0.B1();
                        B12 = D02.B1();
                        break;
                    } else if (intValue3 < u2) {
                        return D0.f1(intValue3) ? 1 : -1;
                    } else {
                        i2++;
                        if (i2 == V0) {
                            return -1;
                        }
                        i3 += u2;
                    }
                }
            }
        }
    }

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public static class d<E extends n04> {
        public E a;
        public final boolean b;
        public final boolean c;
        public final e d;
        public boolean e;
        public g<E> f;
        public g<E> g;
        public g<E> h;
        public g<E> i;
        public g<E> j;
        public g<E> k;
        public g<E> l;
        public g<E> m;
        public Object n;
        public Object o;
        public g<E> p;
        public g<E> q;
        public g<E> r;
        public Function<?, ?> s;

        public d(E e, e eVar) {
            this(e, eVar, false, false);
        }

        public static <E extends n04> g<E> c(g<E> gVar) {
            while (gVar != null && !gVar.J()) {
                g<E> I = gVar.I();
                gVar = I == null ? gVar.D() : I;
            }
            return gVar;
        }

        public void a(g<E> gVar) {
            g<E> h = gVar.h();
            if (this.i == null) {
                this.i = h;
            } else {
                if (a54.t3().compare(this.j, h) > 0) {
                    this.j.W3(h);
                } else {
                    this.j.g4(h);
                }
                this.j.c(1);
            }
            this.j = h;
        }

        public g<E> b() {
            g<E> c;
            g<E> c2 = c(this.i);
            this.i = c2;
            if (c2 != null) {
                g<E> gVar = c2;
                do {
                    g<E> I = gVar.I();
                    if (I == null) {
                        g<E> D = gVar.D();
                        c = c(D);
                        if (D != c) {
                            gVar.W3(c);
                        }
                    } else {
                        c = c(I);
                        if (I != c) {
                            gVar.g4(c);
                        }
                    }
                    gVar = c;
                } while (gVar != null);
                return c2;
            }
            return c2;
        }

        public d(E e, boolean z, boolean z2) {
            this(e, e.NEAR, z, z2);
        }

        private d(E e, e eVar, boolean z, boolean z2) {
            this.a = e;
            this.d = eVar;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public enum e {
        INSERT,
        REMAP,
        LOOKUP,
        NEAR,
        CONTAINING,
        INSERTED_DELETE,
        SUBNET_DELETE
    }

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public static class f<E extends n04> implements Comparator<g54<E>>, Serializable {
        private static final long s = 1;
        public Comparator<E> t;

        public f(Comparator<E> comparator) {
            this.t = comparator;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(g54<E> g54Var, g54<E> g54Var2) {
            return this.t.compare(g54Var.getKey(), g54Var2.getKey());
        }
    }

    /* compiled from: AddressTrie.java */
    /* loaded from: classes3.dex */
    public static abstract class g<E extends n04> extends g54<E> implements d54<E> {
        private static final long I = 1;

        public g(E e) {
            super(e);
        }

        private g<E> H4(E e) {
            g<E> I4 = I4(e);
            I4.G = this.G;
            return I4;
        }

        private d<E> K4(E e) {
            d<E> dVar = new d<>(t44.a(e, true), e.LOOKUP);
            d5(dVar);
            return dVar;
        }

        private void L4(d<E> dVar) {
            dVar.f = this;
            dVar.q = this;
            w4(dVar);
        }

        private void M4(d<E> dVar, int i) {
            n04 n04Var = (n04) getKey();
            if (i < n04Var.A0() && n04Var.f1(i)) {
                if (dVar.b) {
                    dVar.h = this;
                    return;
                }
                g<E> gVar = this;
                while (true) {
                    g<E> D = gVar.D();
                    if (D == null) {
                        dVar.g = gVar;
                        return;
                    }
                    gVar = D;
                }
            } else if (!dVar.b) {
                dVar.h = this;
            } else {
                g<E> gVar2 = this;
                while (true) {
                    g<E> I2 = gVar2.I();
                    if (I2 == null) {
                        dVar.g = gVar2;
                        return;
                    }
                    gVar2 = I2;
                }
            }
        }

        private void N4(d<E> dVar) {
            if (dVar.b) {
                g<E> D = D();
                if (D == null) {
                    dVar.h = this;
                    return;
                }
                while (true) {
                    g<E> I2 = D.I();
                    if (I2 == null) {
                        dVar.g = D;
                        return;
                    }
                    D = I2;
                }
            } else {
                g<E> I3 = I();
                if (I3 == null) {
                    dVar.h = this;
                    return;
                }
                while (true) {
                    g<E> D2 = I3.D();
                    if (D2 == null) {
                        dVar.g = I3;
                        return;
                    }
                    I3 = D2;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private g<E> O4(E e, boolean z, boolean z2) {
            return P4(t44.a(e, true), z, z2);
        }

        private g<E> P4(E e, boolean z, boolean z2) {
            d<E> dVar = new d<>(e, z, z2);
            d5(dVar);
            g<E> gVar = dVar.h;
            if (gVar != null) {
                g<E> H = gVar.H();
                while (true) {
                    g<E> gVar2 = H;
                    g<E> gVar3 = gVar;
                    gVar = gVar2;
                    if (gVar != null) {
                        if (gVar3 != (z ? gVar.D() : gVar.I())) {
                            break;
                        }
                        H = gVar.H();
                    } else {
                        break;
                    }
                }
                if (gVar != null) {
                    if (gVar.J()) {
                        dVar.g = gVar;
                    } else {
                        dVar.g = z ? gVar.j3() : gVar.T();
                    }
                }
            }
            return dVar.g;
        }

        private void U4(d<E> dVar, int i) {
            e eVar = dVar.d;
            if (eVar == e.INSERT) {
                x5(dVar, i);
            } else if (eVar == e.SUBNET_DELETE) {
                v5(dVar);
            } else if (eVar == e.NEAR) {
                M4(dVar, i);
            } else if (eVar == e.REMAP) {
                s5(dVar, i);
            }
        }

        private boolean V4(d<E> dVar) {
            dVar.k = this;
            if (dVar.d == e.CONTAINING) {
                dVar.a(this);
                return true;
            }
            return false;
        }

        private void W4(d<E> dVar) {
            dVar.e = true;
            if (V4(dVar)) {
                return;
            }
            e eVar = dVar.d;
            if (eVar == e.LOOKUP) {
                h5(dVar);
            } else if (eVar == e.INSERT) {
                i5(dVar);
            } else if (eVar == e.INSERTED_DELETE) {
                u5(dVar);
            } else if (eVar == e.SUBNET_DELETE) {
                v5(dVar);
            } else if (eVar == e.NEAR) {
                if (dVar.c) {
                    N4(dVar);
                } else {
                    h5(dVar);
                }
            } else if (eVar == e.REMAP) {
                p5(dVar);
            }
        }

        private void X4(d<E> dVar, int i) {
            E e = dVar.a;
            e eVar = dVar.d;
            if (eVar == e.INSERT) {
                y5(dVar, i, H4(e));
            } else if (eVar == e.NEAR) {
                M4(dVar, i);
            } else if (eVar == e.REMAP) {
                t5(dVar, i);
            }
        }

        private void a5(d<E> dVar) {
            dVar.p = this;
            w4(dVar);
        }

        public static <E extends n04> void e5(g<E> gVar, int i, d<E> dVar) {
            while (true) {
                int f5 = gVar.f5(i, dVar);
                if (f5 < 0 || (gVar = gVar.g5(f5, dVar)) == null) {
                    return;
                }
                i = f5 + 1;
            }
        }

        private g<E> g5(int i, d<E> dVar) {
            g<E> r5;
            g<E> gVar;
            g<E> r52;
            g<E> gVar2;
            E e = dVar.a;
            if (!g54.t && isEmpty()) {
                e eVar = dVar.d;
                if (eVar == e.REMAP) {
                    q5(dVar);
                } else if (eVar == e.INSERT) {
                    U3(e);
                    L4(dVar);
                }
            } else if (i < e.A0() && e.f1(i)) {
                g<E> I2 = I();
                if (I2 != null) {
                    return I2;
                }
                e eVar2 = dVar.d;
                if (eVar2 == e.INSERT) {
                    g<E> H4 = H4(e);
                    g4(H4);
                    H4.a5(dVar);
                } else if (eVar2 == e.NEAR) {
                    if (dVar.b) {
                        if (J()) {
                            dVar.g = this;
                        } else {
                            g<E> D = D();
                            if (D != null) {
                                g<E> I3 = D.I();
                                while (true) {
                                    g<E> gVar3 = I3;
                                    gVar2 = D;
                                    D = gVar3;
                                    if (D == null) {
                                        break;
                                    }
                                    I3 = D.I();
                                }
                                dVar.g = gVar2;
                            }
                        }
                    } else {
                        dVar.h = this;
                    }
                } else if (eVar2 == e.REMAP && (r52 = r5(dVar)) != null) {
                    g4(r52);
                    r52.a5(dVar);
                }
            } else {
                g<E> D2 = D();
                if (D2 != null) {
                    return D2;
                }
                e eVar3 = dVar.d;
                if (eVar3 == e.INSERT) {
                    g<E> H42 = H4(e);
                    W3(H42);
                    H42.a5(dVar);
                } else if (eVar3 == e.NEAR) {
                    if (dVar.b) {
                        dVar.h = this;
                    } else if (J()) {
                        dVar.g = this;
                    } else {
                        g<E> I4 = I();
                        if (I4 != null) {
                            g<E> D3 = I4.D();
                            while (true) {
                                g<E> gVar4 = D3;
                                gVar = I4;
                                I4 = gVar4;
                                if (I4 == null) {
                                    break;
                                }
                                D3 = I4.D();
                            }
                            dVar.g = gVar;
                        }
                    }
                } else if (eVar3 == e.REMAP && (r5 = r5(dVar)) != null) {
                    W3(r5);
                    r5.a5(dVar);
                }
            }
            return null;
        }

        private void h5(d<E> dVar) {
            dVar.f = this;
            dVar.g = this;
        }

        private void p5(d<E> dVar) {
            dVar.f = this;
            if (o5(dVar, true)) {
                i5(dVar);
            }
        }

        private void q5(d<E> dVar) {
            if (o5(dVar, false)) {
                L4(dVar);
            }
        }

        private g<E> r5(d<E> dVar) {
            if (o5(dVar, false)) {
                return H4(dVar.a);
            }
            return null;
        }

        private void s5(d<E> dVar, int i) {
            if (o5(dVar, false)) {
                x5(dVar, i);
            }
        }

        private void t5(d<E> dVar, int i) {
            if (o5(dVar, false)) {
                y5(dVar, i, H4(dVar.a));
            }
        }

        private void v5(d<E> dVar) {
            dVar.m = this;
            clear();
        }

        private g<E> w5(E e, d<E> dVar, int i, g<E> gVar) {
            g<E> H4 = H4(e);
            H4.F = this.F;
            g<E> H = H();
            if (H.I() == this) {
                H.g4(H4);
            } else if (H.D() == this) {
                H.W3(H4);
            }
            n04 n04Var = (n04) getKey();
            if (i < n04Var.A0() && n04Var.f1(i)) {
                if (gVar != null) {
                    H4.W3(gVar);
                }
                H4.g4(this);
            } else {
                H4.W3(this);
                if (gVar != null) {
                    H4.g4(gVar);
                }
            }
            return H4;
        }

        private void x5(d<E> dVar, int i) {
            dVar.l = this;
            w5(dVar.a, dVar, i, null).a5(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void y5(d<E> dVar, int i, g<E> gVar) {
            w5(((n04) getKey()).h0(i).i0(), dVar, i, gVar);
            gVar.a5(dVar);
        }

        @Override // com.p7700g.p99005.d54
        public boolean A4(E e) {
            d<E> dVar = new d<>(t44.a(e, true), e.INSERTED_DELETE);
            d5(dVar);
            return dVar.e;
        }

        public Iterator<? extends g<E>> B4(boolean z) {
            return super.g(z, true);
        }

        public g<E> D4(E e) {
            return P4(e, false, false);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: E4 */
        public g<E> h() {
            return (g) super.clone();
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: F4 */
        public g<E> i() {
            return (g) super.i();
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: G4 */
        public g<E> n(g54.d<E> dVar) {
            return (g) super.n(dVar);
        }

        public abstract g<E> I4(E e);

        public abstract a54<E> J4();

        @Override // com.p7700g.p99005.d54
        public g<E> K(E e) {
            return K4(e).l;
        }

        @Override // com.p7700g.p99005.d54
        public boolean K1(E e) {
            return l4(e) != null;
        }

        @Override // com.p7700g.p99005.d54
        public boolean K2(E e) {
            return K4(e).e;
        }

        @Override // com.p7700g.p99005.d54
        public g<E> L2(E e) {
            d<E> dVar = new d<>(t44.a(e, true), e.CONTAINING);
            d5(dVar);
            return dVar.b();
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: M2 */
        public g<E> P() {
            return (g) super.P();
        }

        @Override // com.p7700g.p99005.d54
        public /* synthetic */ g O2(n04 n04Var) {
            return c54.a(this, n04Var);
        }

        public g<E> Q4(E e) {
            return P4(e, true, false);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: R4 */
        public g<E> D() {
            return (g) super.D();
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: S4 */
        public g<E> H() {
            return (g) super.H();
        }

        @Override // com.p7700g.p99005.d54
        public g<E> T1(E e) {
            return K4(e).k;
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: T4 */
        public g<E> I() {
            return (g) super.I();
        }

        @Override // com.p7700g.p99005.d54
        public g<E> W(E e) {
            return O4(e, true, true);
        }

        public g<E> Y4(E e) {
            return P4(e, false, true);
        }

        public void Z4(g<E> gVar) {
            n04 n04Var = (n04) gVar.getKey();
            if (n04Var.A0() > 0 && n04Var.f1(0)) {
                g4(gVar);
            } else {
                W3(gVar);
            }
            boolean J = J();
            this.F = (J ? 1 : 0) + gVar.F;
        }

        public g<E> b5(E e) {
            return P4(e, true, true);
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<E> c3() {
            return new g54.i(l5(false, true), a54.G3());
        }

        public void c5(int i, d<E> dVar) {
            e5(this, i, dVar);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: d4 */
        public g<E> Q() {
            return (g) super.Q();
        }

        public void d5(d<E> dVar) {
            c5(0, dVar);
        }

        @Override // com.p7700g.p99005.g54
        public boolean equals(Object obj) {
            return (obj instanceof g) && super.equals(obj);
        }

        @Override // com.p7700g.p99005.g54
        public <C> g54.e<? extends g<E>, E, C> f() {
            return super.f();
        }

        public int f5(int i, d<E> dVar) {
            int intValue;
            E e = dVar.a;
            e eVar = dVar.d;
            z04 z04Var = (z04) getKey();
            int u2 = z04Var.u2();
            int i2 = i / u2;
            int V0 = z04Var.V0();
            if (i2 >= V0) {
                Integer L0 = z04Var.L0();
                Integer L02 = e.L0();
                if (Objects.equals(L0, L02)) {
                    dVar.l = this;
                    W4(dVar);
                } else if (L0 == null) {
                    dVar.l = this;
                    U4(dVar, L02.intValue());
                } else {
                    V4(dVar);
                    return L0.intValue();
                }
                return -1;
            } else if (e.V0() == V0) {
                int i3 = i2 * u2;
                int i4 = 32 - u2;
                while (true) {
                    x04 D0 = z04Var.D0(i2);
                    x04 D02 = e.D0(i2);
                    Integer d3 = a54.d3(z04Var, i3, D0);
                    Integer d32 = a54.d3(e, i3, D02);
                    if (d3 != null) {
                        int intValue2 = d3.intValue();
                        if (d32 == null || (intValue = d32.intValue()) > intValue2) {
                            int Z = a54.Z(D0, D02, intValue2, i4);
                            if (Z >= intValue2) {
                                if (J()) {
                                    V4(dVar);
                                }
                                return intValue2 + i3;
                            }
                            X4(dVar, i3 + Z);
                        } else {
                            int Z2 = a54.Z(D0, D02, intValue, i4);
                            if (Z2 >= intValue) {
                                dVar.l = this;
                                if (intValue == intValue2) {
                                    if (J()) {
                                        W4(dVar);
                                    } else if (eVar == e.LOOKUP) {
                                        dVar.f = this;
                                    } else if (eVar == e.INSERT) {
                                        L4(dVar);
                                    } else if (eVar == e.SUBNET_DELETE) {
                                        v5(dVar);
                                    } else if (eVar == e.NEAR) {
                                        N4(dVar);
                                    } else if (eVar == e.REMAP) {
                                        q5(dVar);
                                    }
                                } else {
                                    U4(dVar, i3 + intValue);
                                }
                            } else {
                                X4(dVar, i3 + Z2);
                            }
                        }
                    } else if (d32 == null) {
                        int Z3 = a54.Z(D0, D02, u2, i4);
                        if (Z3 < u2) {
                            X4(dVar, i3 + Z3);
                            break;
                        }
                        i2++;
                        if (i2 == V0) {
                            dVar.l = this;
                            W4(dVar);
                            break;
                        }
                        i3 += u2;
                    } else {
                        int intValue3 = d32.intValue();
                        int Z4 = a54.Z(D0, D02, intValue3, i4);
                        if (Z4 >= intValue3) {
                            dVar.l = this;
                            U4(dVar, i3 + intValue3);
                        } else {
                            X4(dVar, i3 + Z4);
                        }
                    }
                }
                return -1;
            } else {
                throw new IllegalArgumentException(g54.E("ipaddress.error.mismatched.bit.size"));
            }
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: h2 */
        public g<E> y() {
            return (g) super.y();
        }

        public void i5(d<E> dVar) {
            dVar.f = this;
            dVar.r = this;
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends g<E>> j(boolean z) {
            return super.j(z);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: j4 */
        public g<E> A() {
            return (g) super.A();
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: j5 */
        public g<E> T() {
            return (g) super.T();
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<? extends g<E>> k(boolean z) {
            return l5(z, true);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: k5 */
        public g<E> V() {
            return (g) super.V();
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<? extends g<E>> l(boolean z) {
            return l5(z, false);
        }

        @Override // com.p7700g.p99005.d54
        public E l4(E e) {
            g<E> T1 = T1(e);
            if (T1 == null) {
                return null;
            }
            return (E) T1.getKey();
        }

        public Spliterator<? extends g<E>> l5(boolean z, boolean z2) {
            return new g54.k(z, z ? a54.t3() : a54.I3(), this, z ? A() : Q(), H(), size(), this.G, z2);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: m5 */
        public g<E> j3() {
            return (g) super.j3();
        }

        @Override // com.p7700g.p99005.d54
        public g<E> n2(E e) {
            return O4(e, false, true);
        }

        @Override // com.p7700g.p99005.g54
        /* renamed from: n5 */
        public g<E> k3() {
            return (g) super.k3();
        }

        public boolean o5(d<E> dVar, boolean z) {
            return false;
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends g<E>> q(boolean z) {
            return super.q(z);
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<? extends g<E>, E, C> r(boolean z) {
            return super.r(z);
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends g<E>> s(boolean z) {
            return super.s(z);
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54, java.lang.Iterable
        public Spliterator<E> spliterator() {
            return new g54.i(l5(true, true), a54.comparator());
        }

        @Override // com.p7700g.p99005.d54
        public g<E> t2(E e) {
            return O4(e, false, false);
        }

        @Override // com.p7700g.p99005.d54
        public g<E> u3(E e) {
            return K4(e).f;
        }

        @Override // com.p7700g.p99005.d54
        public g<E> u4(E e) {
            d<E> dVar = new d<>(t44.a(e, true), e.SUBNET_DELETE);
            d5(dVar);
            return dVar.m;
        }

        public void u5(d<E> dVar) {
            dVar.m = this;
            x3();
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends g<E>> v(boolean z) {
            return super.v(z);
        }

        @Override // com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<? extends g<E>, E, C> w(boolean z) {
            return super.w(z);
        }

        public void w4(d<E> dVar) {
            S3(true);
            c(1);
            this.G.f();
        }

        public a54<E> x4() {
            a54<E> J4 = J4();
            J4.f3(this);
            return J4;
        }

        @Override // com.p7700g.p99005.d54
        public g<E> y3(E e) {
            return O4(e, true, false);
        }

        public Iterator<? extends g<E>> y4(boolean z) {
            return super.g(z, false);
        }
    }

    public a54(g<E> gVar) {
        super(gVar);
        gVar.G = new g54.f();
    }

    private static int C3(int i) {
        if (i == 0) {
            return 16;
        }
        int i2 = 1;
        if ((i >>> 8) == 0) {
            i2 = 9;
            i <<= 8;
        }
        if ((i >>> 12) == 0) {
            i2 += 4;
            i <<= 4;
        }
        if ((i >>> 14) == 0) {
            i2 += 2;
            i <<= 2;
        }
        return i2 - (i >>> 15);
    }

    private g<E> G(E e2) {
        g<E> h = h();
        if (h != null) {
            g<E> h2 = this.z.t(e2) ? h2() : h.D4(e2);
            if (h2 == null || this.z.i((n04) h2.getKey())) {
                return null;
            }
            return h2;
        }
        return null;
    }

    public static <E extends n04> Comparator<E> G3() {
        return (Comparator<E>) x.t;
    }

    public static <E extends n04> Comparator<g54<E>> I3() {
        return x;
    }

    private Iterator<? extends g54<E>> J(boolean z, boolean z2) {
        if (z) {
            return new g54.l(this.z, true, z2, o().B(), null, o().G);
        }
        return new g54.m(this.z, false, z2, o().R(), null, o().G);
    }

    private a54<E> N(g<E> gVar) {
        a54<E> M = M(this.z);
        g<E> o = M.o();
        if (((n04) gVar.getKey()).equals(o.getKey())) {
            M.u = gVar;
        } else {
            o.Z4(gVar);
        }
        g54.f fVar = o.G;
        gVar.G = fVar;
        while (true) {
            g<E> D = gVar.D();
            if (D == null) {
                gVar = gVar.I();
                if (gVar == null) {
                    g54<E> g54Var = M.u;
                    g54Var.F = -1;
                    g54Var.size();
                    return M;
                }
            } else {
                gVar = D;
            }
            gVar.G = fVar;
        }
    }

    public static <E extends n04> E P(E e2) {
        if (e2.V1()) {
            return null;
        }
        if (e2 instanceof j14) {
            j14 j14Var = (j14) e2;
            if (e2.C0()) {
                return j14Var.m().h0(j14Var.L0().intValue() + 1).L3();
            }
            return j14Var.i4(j14Var.A0() - (j14Var.E4(true) + 1));
        } else if (e2.C0()) {
            return (E) e2.a0().h0(e2.L0().intValue() + 1).i0().b0();
        } else {
            int i = 0;
            int V0 = e2.V0() - 1;
            while (true) {
                if (V0 < 0) {
                    break;
                }
                x04 D0 = e2.D0(V0);
                if (!D0.V1()) {
                    i += Integer.numberOfTrailingZeros(D0.B1());
                    break;
                }
                i += D0.A0();
                V0--;
            }
            return (E) e2.h0(e2.A0() - (i + 1)).i0();
        }
    }

    public static void S3() {
        throw new IllegalArgumentException(t44.g("ipaddress.error.address.out.of.range"));
    }

    private g<E> T(E e2) {
        g<E> h = h();
        if (h != null) {
            g<E> M2 = this.z.i(e2) ? M2() : h.Q4(e2);
            if (M2 == null || this.z.t((n04) M2.getKey())) {
                return null;
            }
            return M2;
        }
        return null;
    }

    private g<E> V() {
        g<E> h = h();
        if (h == null) {
            return null;
        }
        if (this.z.x()) {
            b<E> bVar = this.z;
            boolean z = bVar.w;
            E e2 = (E) bVar.u;
            return z ? h.b5(e2) : h.Q4(e2);
        }
        return h.H();
    }

    public static String W3(boolean z, a54<?>... a54VarArr) {
        StringBuilder sb = new StringBuilder("\n○");
        StringBuilder F = wo1.F(gl4.R);
        F.append(n04.A);
        String sb2 = F.toString();
        boolean z2 = a54VarArr == null;
        if (!z2) {
            a54<?> a54Var = null;
            int length = a54VarArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (a54VarArr[length] != null) {
                    a54Var = a54VarArr[length];
                    break;
                } else {
                    length--;
                }
            }
            boolean z3 = a54Var == null;
            if (!z3) {
                int size = a54Var.size();
                for (int i = 0; i < length; i++) {
                    a54<?> a54Var2 = a54VarArr[i];
                    if (a54Var2 != null) {
                        size = a54Var2.size() + size;
                    }
                }
                if (z) {
                    sb.append(sb2);
                    sb.append(" (");
                    sb.append(size);
                    sb.append(')');
                }
                sb.append('\n');
                for (int i2 = 0; i2 < length; i2++) {
                    a54<?> a54Var3 = a54VarArr[i2];
                    if (a54Var3 != null) {
                        a54Var3.E3(sb, new g54.g(g54.x, g54.y), z);
                    }
                }
                a54Var.E3(sb, new g54.g(g54.z, g54.A), z);
            }
            z2 = z3;
        }
        if (z2) {
            if (z) {
                sb.append(sb2);
                sb.append(" (0)");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    private g<E> X() {
        g<E> h = h();
        if (h == null) {
            return null;
        }
        if (this.z.D()) {
            b<E> bVar = this.z;
            boolean z = bVar.x;
            E e2 = (E) bVar.v;
            return z ? h.Y4(e2) : h.D4(e2);
        }
        return h.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Z(x04 x04Var, x04 x04Var2, int i, int i2) {
        if (i == 0) {
            return 0;
        }
        int B1 = x04Var.B1() ^ x04Var2.B1();
        if (i2 == 16) {
            return C3(B1);
        }
        if (i2 == 24) {
            return x3(B1);
        }
        return Integer.numberOfLeadingZeros(B1) - i2;
    }

    public static <E extends n04> Comparator<E> comparator() {
        return (Comparator<E>) w.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer d3(z04 z04Var, int i, x04 x04Var) {
        int intValue;
        if (x04Var instanceof n14) {
            return ((n14) x04Var).D5();
        }
        if (!z04Var.C0() || (intValue = z04Var.L0().intValue()) > z04Var.u2() + i) {
            return null;
        }
        Integer valueOf = Integer.valueOf(intValue - i);
        if (valueOf.intValue() < 0) {
            return 0;
        }
        return valueOf;
    }

    private g<E> i3(E e2) {
        g<E> h = h();
        if (h != null) {
            g<E> h2 = this.z.t(e2) ? h2() : h.Y4(e2);
            if (h2 == null || this.z.i((n04) h2.getKey())) {
                return null;
            }
            return h2;
        }
        return null;
    }

    public static <E extends n04> E j3(E e2) {
        if (e2.P3()) {
            return null;
        }
        int i = 0;
        if (e2 instanceof j14) {
            j14 j14Var = (j14) e2;
            if (e2.C0()) {
                return j14Var.o().h0(j14Var.L0().intValue() + 1).Z3();
            }
            return j14Var.i4(j14Var.A0() - (j14Var.E4(false) + 1));
        } else if (e2.C0()) {
            return (E) e2.b0().h0(e2.L0().intValue() + 1).i0().a0();
        } else {
            int V0 = e2.V0() - 1;
            while (true) {
                if (V0 < 0) {
                    break;
                }
                x04 D0 = e2.D0(V0);
                if (!D0.P3()) {
                    i += Integer.numberOfTrailingZeros(~D0.B1());
                    break;
                }
                i += D0.A0();
                V0--;
            }
            return (E) e2.h0(e2.A0() - (i + 1)).i0();
        }
    }

    private g<E> n3(E e2) {
        g<E> h = h();
        if (h != null) {
            g<E> M2 = this.z.i(e2) ? M2() : h.b5(e2);
            if (M2 == null || this.z.t((n04) M2.getKey())) {
                return null;
            }
            return M2;
        }
        return null;
    }

    public static <E extends n04> Comparator<g54<E>> t3() {
        return w;
    }

    private static int x3(int i) {
        if (i == 0) {
            return 8;
        }
        int i2 = 1;
        if ((i >>> 4) == 0) {
            i2 = 5;
            i <<= 4;
        }
        if ((i >>> 6) == 0) {
            i2 += 2;
            i <<= 2;
        }
        return i2 - (i >>> 7);
    }

    public e54<E> A() {
        e54<E> e54Var = this.y;
        return e54Var == null ? new e54<>(this) : e54Var;
    }

    @Override // com.p7700g.p99005.d54
    public boolean A4(E e2) {
        if (this.z != null) {
            e2 = (E) t44.a(e2, true);
            if (!this.z.u(e2)) {
                return false;
            }
        }
        return o().A4(e2);
    }

    public Iterator<? extends g<E>> B(boolean z) {
        if (this.z == null) {
            return o().y4(z);
        }
        return new g54.c(0, this.z, false, h(), !z, o().G);
    }

    public <C> g54.e<? extends g<E>, E, C> D() {
        if (this.z == null) {
            return o().f();
        }
        throw new Error();
    }

    public Iterator<? extends g<E>> E(boolean z) {
        if (this.z == null) {
            return o().B4(z);
        }
        return new g54.c(size(), this.z, true, h(), !z, o().G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.d54.a
    public g<E> E2(E e2) {
        n04 a2 = t44.a(e2, true);
        b<E> bVar = this.z;
        if (bVar != null && !bVar.u(a2)) {
            S3();
        }
        y(a2);
        g o = o();
        d<E> dVar = new d<>(a2, e.INSERT);
        o.d5(dVar);
        g<E> gVar = dVar.f;
        return gVar == null ? dVar.p : gVar;
    }

    public void E3(StringBuilder sb, g54.g gVar, boolean z) {
        g<E> h = h();
        if (h == null) {
            return;
        }
        h.w3(sb, gVar, z, true, w(true));
    }

    @Override // com.p7700g.p99005.t44
    /* renamed from: H */
    public a54<E> f() {
        a54<E> a54Var = (a54) super.clone();
        a54Var.y = null;
        if (this.z == null) {
            a54Var.u = h().i();
        } else {
            g<E> o = o();
            if (this.z.u((n04) o.getKey())) {
                a54Var.u = o.n(this.z);
            } else {
                g54<E> g54Var = (g54<E>) o.p(new g54.f());
                a54Var.u = g54Var;
                g54Var.S3(false);
                g54Var.W3(null);
                g54Var.g4(null);
                g<E> h = h();
                if (h != null) {
                    g<E> n = h.n(this.z);
                    if (n != null) {
                        a54Var.o().Z4(n);
                    } else {
                        g54Var.F = g54Var.J() ? 1 : 0;
                    }
                } else {
                    g54Var.F = g54Var.J() ? 1 : 0;
                }
            }
            a54Var.z = null;
        }
        return a54Var;
    }

    public abstract f54<E, ? extends List<? extends f54.a<E, ?>>> I();

    @Override // com.p7700g.p99005.d54
    public g<E> K(E e2) {
        if (this.z == null) {
            return o().K(e2);
        }
        throw new Error();
    }

    @Override // com.p7700g.p99005.d54
    public boolean K1(E e2) {
        if (this.z == null) {
            return o().K1(e2);
        }
        throw new Error();
    }

    @Override // com.p7700g.p99005.d54
    public boolean K2(E e2) {
        if (this.z != null) {
            e2 = (E) t44.a(e2, true);
            if (!this.z.u(e2)) {
                return false;
            }
        }
        return o().K2(e2);
    }

    public void L(f54<E, ? extends List<? extends f54.a<E, ?>>> f54Var) {
        f54.a aVar;
        f54.a S4;
        f54Var.f3(o());
        g54.e<? extends f54.a<E, ? extends List<? extends f54.a<E, ?>>>, E, C> w2 = f54Var.w(true);
        while (w2.hasNext()) {
            f54.a aVar2 = (f54.a) w2.next();
            w2.P(aVar2);
            w2.E(aVar2);
            if (aVar2.J() && (aVar = (f54.a) w2.A()) != null) {
                while (!aVar.J() && (S4 = aVar.S4()) != null) {
                    aVar = S4;
                }
                List list = (List) aVar.getValue();
                if (list == null) {
                    list = new ArrayList(aVar2.size() - 1);
                    aVar.setValue(list);
                }
                list.add(aVar2);
            }
        }
        Iterator<? extends f54.a<E, ? extends List<? extends f54.a<E, ?>>>> v2 = f54Var.v(true);
        List<? extends f54.a<E, ?>> value = f54Var.o().getValue();
        if (value != null) {
            ((ArrayList) value).trimToSize();
        }
        while (v2.hasNext()) {
            List<? extends f54.a<E, ?>> value2 = v2.next().getValue();
            if (value2 != null) {
                ((ArrayList) value2).trimToSize();
            }
        }
    }

    @Override // com.p7700g.p99005.d54
    public g<E> L2(E e2) {
        if (this.z == null) {
            return o().L2(e2);
        }
        throw new Error();
    }

    public abstract a54<E> M(b<E> bVar);

    @Override // com.p7700g.p99005.d54
    public g<E> M2() {
        g<E> P;
        if (this.z == null) {
            return o().P();
        }
        g<E> h = h();
        if (h != null) {
            if (this.z.D()) {
                b<E> bVar = this.z;
                P = bVar.x ? h.Q4((E) bVar.v) : h.b5((E) bVar.v);
            } else {
                P = h.P();
            }
            if (P == null || this.z.t((n04) P.getKey())) {
                return null;
            }
            return P;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r5.z.u((com.p7700g.p99005.n04) r0.getKey()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        r6 = r0;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r5.z.u((com.p7700g.p99005.n04) r0.getKey()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g<E> N3(E e2) {
        g<E> T1;
        g<E> D;
        if (this.z == null) {
            return T1(e2);
        }
        g<E> h = h();
        if (h == null || (T1 = h.T1(e2)) == null) {
            return null;
        }
        if (this.z.u((n04) T1.getKey())) {
            return T1;
        }
        g<E> L2 = h.L2(e2);
        g<E> gVar = this.z.u((n04) L2.getKey()) ? L2 : null;
        do {
            D = L2.D();
            if (D == null) {
                D = L2.I();
                if (D == null) {
                    continue;
                }
            }
        } while (D != null);
        return gVar;
    }

    public abstract a54<E> O(b<E> bVar);

    public boolean Q(E e2) {
        g<E> L2;
        if (this.z == null) {
            return K1(e2);
        }
        g<E> h = h();
        if (h == null || (L2 = h.L2(e2)) == null) {
            return false;
        }
        return !N(L2).isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a54<E> R(E e2) {
        b<E> h;
        n04 t0 = e2.a0().t0();
        n04 t02 = e2.b0().t0();
        b<E> bVar = this.z;
        if (bVar == 0) {
            h = b.Q(t0, true, t02, true, comparator());
        } else {
            h = bVar.h(t0, true, t02, true);
        }
        return h == this.z ? this : O(h);
    }

    public a54<E> S(E e2) {
        if (isEmpty()) {
            return this;
        }
        g<E> h = h();
        if (h == null) {
            return M(this.z);
        }
        g<E> L2 = h.L2(e2);
        if (L2 == null) {
            return M(this.z);
        }
        return size() == L2.size() ? this : N(L2);
    }

    @Override // com.p7700g.p99005.d54
    public g<E> T1(E e2) {
        if (this.z == null) {
            return o().T1(e2);
        }
        throw new Error();
    }

    public Comparator<E> U() {
        return comparator();
    }

    public String U3() {
        a aVar;
        f54<E, ? extends List<? extends f54.a<E, ?>>> I = I();
        f54.a<E, ? extends List<? extends f54.a<E, ?>>> o = I.o();
        StringBuilder F = wo1.F('\n');
        String str = "";
        ArrayDeque arrayDeque = null;
        String str2 = "";
        while (true) {
            F.append(str);
            F.append(o.J() ? g54.w : g54.v);
            F.append(gl4.R);
            F.append(o.getKey());
            F.append('\n');
            List<? extends f54.a<E, ?>> value = o.getValue();
            if (value != null && value.size() > 0) {
                int size = value.size() - 1;
                g54.g gVar = new g54.g(wo1.t(str2, g54.z), wo1.t(str2, g54.A));
                f54.a<E, ?> aVar2 = value.get(size);
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque(I.size());
                }
                arrayDeque.addFirst(new a(gVar, aVar2));
                if (value.size() > 1) {
                    g54.g gVar2 = new g54.g(wo1.t(str2, g54.x), wo1.t(str2, g54.y));
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        arrayDeque.addFirst(new a(gVar2, value.get(size)));
                    }
                }
            }
            if (arrayDeque != null && (aVar = (a) arrayDeque.pollFirst()) != null) {
                f54.a<E, List<f54.a<E, ?>>> aVar3 = aVar.b;
                g54.g gVar3 = aVar.a;
                String str3 = gVar3.a;
                str2 = gVar3.b;
                o = aVar3;
                str = str3;
            }
        }
        return F.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.d54
    public g<E> W(E e2) {
        if (this.z == null) {
            return o().W(e2);
        }
        return n3(t44.a(e2, true));
    }

    @Override // com.p7700g.p99005.t44
    /* renamed from: X2 */
    public g<E> h() {
        if (this.z == null) {
            return o();
        }
        if (this.B != null && !o().G.i(this.B)) {
            return this.A;
        }
        g<E> o = o();
        do {
            n04 n04Var = (n04) o.getKey();
            if (this.z.x() && this.z.t(n04Var)) {
                o = o.I();
                continue;
            } else if (!this.z.D() || !this.z.i(n04Var)) {
                break;
            } else {
                o = o.D();
                continue;
            }
        } while (o != null);
        this.B = o().G.h();
        this.A = o;
        return o;
    }

    @Override // com.p7700g.p99005.t44, com.p7700g.p99005.o54
    public Spliterator<E> c3() {
        return new g54.i(w3(false, true), G3());
    }

    @Override // com.p7700g.p99005.t44
    public void clear() {
        if (this.z == null) {
            super.clear();
            return;
        }
        Iterator<? extends g<E>> q = q(true);
        while (q.hasNext()) {
            if (this.z.u((n04) q.next().getKey())) {
                q.remove();
            }
        }
    }

    @Override // com.p7700g.p99005.d54
    public g<E> d4() {
        return o().Q();
    }

    @Override // com.p7700g.p99005.t44, com.p7700g.p99005.o54
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return super.descendingIterator();
    }

    @Override // com.p7700g.p99005.t44
    public boolean equals(Object obj) {
        return (obj instanceof a54) && super.equals(obj);
    }

    @Override // com.p7700g.p99005.d54.a
    public g<E> f3(g<E> gVar) {
        return x(gVar, false);
    }

    @Override // com.p7700g.p99005.d54
    public g<E> h2() {
        g<E> y;
        if (this.z == null) {
            return o().y();
        }
        g<E> h = h();
        if (h != null) {
            if (this.z.x()) {
                b<E> bVar = this.z;
                boolean z = bVar.w;
                E e2 = (E) bVar.u;
                y = z ? h.D4(e2) : h.Y4(e2);
            } else {
                y = h.y();
            }
            if (y == null || this.z.i((n04) y.getKey())) {
                return null;
            }
            return y;
        }
        return null;
    }

    @Override // com.p7700g.p99005.t44
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.p7700g.p99005.t44
    public int i() {
        if (this.z == null) {
            return super.i();
        }
        int i = 0;
        Iterator<? extends g<E>> v2 = v(true);
        while (v2.hasNext()) {
            i++;
            v2.next();
        }
        return i;
    }

    @Override // com.p7700g.p99005.t44
    public boolean isEmpty() {
        if (this.z == null) {
            return super.isEmpty();
        }
        return h2() == null;
    }

    @Override // com.p7700g.p99005.t44, com.p7700g.p99005.o54, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends g<E>> j(boolean z) {
        if (this.z == null) {
            return o().j(z);
        }
        return (Iterator<? extends g54<E>>) J(z, true);
    }

    @Override // com.p7700g.p99005.d54
    public g<E> j4() {
        return o().A();
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<? extends g<E>> k(boolean z) {
        return w3(z, true);
    }

    public E k3(E e2) {
        g<E> N3 = N3(e2);
        if (N3 == null) {
            return null;
        }
        return (E) N3.getKey();
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<? extends g<E>> l(boolean z) {
        if (this.z == null) {
            return o().l5(z, false);
        }
        throw new Error();
    }

    @Override // com.p7700g.p99005.d54
    public E l4(E e2) {
        if (this.z == null) {
            return o().l4(e2);
        }
        throw new Error();
    }

    @Override // com.p7700g.p99005.t44
    public String n(boolean z) {
        if (this.z == null) {
            return super.n(z);
        }
        StringBuilder sb = new StringBuilder("\n");
        E3(sb, new g54.g(), z);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.d54
    public g<E> n2(E e2) {
        if (this.z == null) {
            return o().n2(e2);
        }
        return i3(t44.a(e2, true));
    }

    public g<E> o() {
        return (g) this.u;
    }

    public String p3() {
        return o().n4(true, true);
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends g<E>> q(boolean z) {
        if (this.z == null) {
            return o().q(z);
        }
        return new g54.j(z, true, z ? h2() : M2(), z ? X() : V(), o().G);
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<? extends g<E>, E, C> r(boolean z) {
        b<E> bVar = this.z;
        if (bVar == null) {
            return o().r(z);
        }
        if (z) {
            return new g54.m(bVar, true, true, o(), null, o().G);
        }
        return new g54.l(bVar, false, true, o(), null, o().G);
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends g<E>> s(boolean z) {
        if (this.z == null) {
            return o().s(z);
        }
        return (Iterator<? extends g54<E>>) J(z, false);
    }

    @Override // com.p7700g.p99005.t44
    public int size() {
        if (this.z == null) {
            return super.size();
        }
        int i = 0;
        Iterator<? extends g<E>> q = q(true);
        while (q.hasNext()) {
            g<E> next = q.next();
            if (next.J() && this.z.u((n04) next.getKey())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.p7700g.p99005.t44, com.p7700g.p99005.o54, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return new g54.i(w3(true, true), comparator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.d54
    public g<E> t2(E e2) {
        if (this.z == null) {
            return o().t2(e2);
        }
        return G(t44.a(e2, true));
    }

    @Override // com.p7700g.p99005.t44
    public String toString() {
        if (this.z == null) {
            return super.toString();
        }
        return n(true);
    }

    public g<E> u(d<E> dVar, g<E> gVar, g<E> gVar2, boolean z) {
        gVar.c5(((n04) gVar.getKey()).L0().intValue(), dVar);
        g<E> gVar3 = dVar.f;
        return gVar3 == null ? dVar.p : gVar3;
    }

    @Override // com.p7700g.p99005.d54
    public g<E> u3(E e2) {
        g<E> o;
        if (this.z != null) {
            e2 = (E) t44.a(e2, true);
            if (!this.z.u(e2) || (o = h()) == null) {
                return null;
            }
        } else {
            o = o();
        }
        return o.u3(e2);
    }

    @Override // com.p7700g.p99005.d54
    public g<E> u4(E e2) {
        if (this.z == null) {
            return o().u4(e2);
        }
        throw new Error();
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends g<E>> v(boolean z) {
        if (this.z == null) {
            return o().v(z);
        }
        throw new Error();
    }

    @Override // com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<? extends g<E>, E, C> w(boolean z) {
        b<E> bVar = this.z;
        if (bVar == null) {
            return o().w(z);
        }
        if (z) {
            return new g54.m(bVar, true, false, o(), null, o().G);
        }
        return new g54.l(bVar, false, false, o(), null, o().G);
    }

    public Spliterator<? extends g<E>> w3(boolean z, boolean z2) {
        if (this.z == null) {
            return o().l5(z, z2);
        }
        return new g54.k(z, z ? t3() : I3(), h(), z ? h2() : M2(), z ? X() : V(), size(), o().G, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<E> x(g<E> gVar, boolean z) {
        boolean z2;
        g54.e<? extends g<E>, E, C> w2 = gVar.w(true);
        g gVar2 = (g) w2.next();
        d dVar = new d((n04) gVar2.getKey(), e.INSERT);
        g<E> o = o();
        boolean J = gVar2.J();
        if (J) {
            y((n04) gVar2.getKey());
            o = u(dVar, o, gVar2, z);
            z2 = true;
        } else {
            z2 = false;
        }
        g<E> gVar3 = o;
        while (w2.hasNext()) {
            w2.P(gVar3);
            w2.E(gVar3);
            g gVar4 = (g) w2.next();
            g<E> gVar5 = (g) w2.A();
            if (gVar4.J()) {
                E e2 = (E) gVar4.getKey();
                if (!z2) {
                    y(e2);
                    z2 = true;
                }
                dVar.a = e2;
                dVar.f = null;
                dVar.p = null;
                gVar3 = u(dVar, gVar5, gVar4, z);
            } else {
                gVar3 = gVar5;
            }
        }
        return !J ? u3((n04) gVar.getKey()) : o;
    }

    public void y(E e2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.d54
    public g<E> y3(E e2) {
        if (this.z == null) {
            return o().y3(e2);
        }
        return T(t44.a(e2, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.d54.a
    public boolean z(E e2) {
        n04 a2 = t44.a(e2, true);
        b<E> bVar = this.z;
        if (bVar != null && !bVar.u(a2)) {
            S3();
        }
        y(a2);
        g o = o();
        d<E> dVar = new d<>(a2, e.INSERT);
        o.d5(dVar);
        return !dVar.e;
    }

    public a54(g<E> gVar, b<E> bVar) {
        super(gVar);
        if (gVar.G == null) {
            gVar.G = new g54.f();
        }
        this.z = bVar;
    }
}