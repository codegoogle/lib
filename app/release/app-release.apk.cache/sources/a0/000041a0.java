package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.d54;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.n04;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: AssociativeAddressTrie.java */
/* loaded from: classes3.dex */
public abstract class f54<K extends n04, V> extends a54<K> implements d54.c<K, V> {
    private static final long C = 1;
    public b54<K, V> D;

    /* compiled from: AssociativeAddressTrie.java */
    /* loaded from: classes3.dex */
    public static abstract class a<K extends n04, V> extends a54.g<K> implements Map.Entry<K, V>, d54.b<K, V> {
        private static final long J = 1;
        private V K;

        public a(K k) {
            super(k);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: A5 */
        public a<K, V> t2(K k) {
            return (a) super.t2(k);
        }

        @Override // com.p7700g.p99005.a54.g
        public Iterator<? extends a<K, V>> B4(boolean z) {
            return super.B4(z);
        }

        public void B5() {
            this.K = null;
        }

        @Override // com.p7700g.p99005.g54
        public void C3() {
            super.C3();
            B5();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: C5 */
        public a<K, V> h() {
            return (a) super.h();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: D5 */
        public a<K, V> i() {
            return (a) super.i();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: E5 */
        public a<K, V> K(K k) {
            return (a) super.K(k);
        }

        @Override // com.p7700g.p99005.d54.b
        public V F(K k) {
            a54.d<E> dVar = new a54.d<>(t44.a(k, true), a54.e.LOOKUP);
            d5(dVar);
            a aVar = (a) dVar.f;
            if (aVar == null) {
                return null;
            }
            return (V) aVar.getValue();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: F5 */
        public a<K, V> L2(K k) {
            return (a) super.L2(k);
        }

        @Override // com.p7700g.p99005.g54
        public String G() {
            String G = super.G();
            V value = getValue();
            StringBuilder sb = new StringBuilder(G.length() + 3 + (value instanceof CharSequence ? ((CharSequence) value).length() : 50));
            sb.append(G);
            sb.append(" = ");
            sb.append(value);
            return sb.toString();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: G5 */
        public a<K, V> y() {
            return (a) super.y();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: H5 */
        public a<K, V> j4() {
            return (a) super.A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.g54
        public void I3(g54<K> g54Var) {
            super.I3(g54Var);
            if (g54Var == null) {
                setValue(null);
            } else {
                setValue(((a) g54Var).getValue());
            }
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: I5 */
        public a<K, V> y3(K k) {
            return (a) super.y3(k);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: J5 */
        public a<K, V> O2(K k) {
            return (a) c54.a(this, k);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: K5 */
        public a<K, V> R4() {
            return (a) super.D();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: L5 */
        public a<K, V> u3(K k) {
            return (a) super.u3(k);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: M5 */
        public a<K, V> S4() {
            return (a) super.H();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: N5 */
        public a<K, V> T4() {
            return (a) super.I();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: O5 */
        public a<K, V> n2(K k) {
            return (a) super.n2(k);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        /* renamed from: P5 */
        public a<K, V> P() {
            return (a) super.P();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: Q5 */
        public a<K, V> d4() {
            return (a) super.Q();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: R5 */
        public a<K, V> T1(K k) {
            return (a) super.T1(k);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: S5 */
        public a<K, V> W(K k) {
            return (a) super.W(k);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: T5 */
        public a<K, V> j5() {
            return (a) super.T();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: U5 */
        public a<K, V> k5() {
            return (a) super.V();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: V5 */
        public a<K, V> m5() {
            return (a) super.j3();
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: W5 */
        public a<K, V> n5() {
            return (a) super.k3();
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.d54
        /* renamed from: X5 */
        public a<K, V> u4(K k) {
            return (a) super.u4(k);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                return super.equals(obj) && Objects.equals(getValue(), ((a) obj).getValue());
            }
            return false;
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54
        public <C> g54.e<? extends a<K, V>, K, C> f() {
            return super.f();
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.K;
        }

        @Override // com.p7700g.p99005.g54, java.util.Map.Entry
        public int hashCode() {
            if (this.K == null) {
                return super.hashCode();
            }
            return super.hashCode() ^ this.K.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.a54.g
        public void i5(a54.d<K> dVar) {
            super.i5(dVar);
            dVar.o = getValue();
            setValue(dVar.n);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends a<K, V>> j(boolean z) {
            return super.j(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<? extends a<K, V>> k(boolean z) {
            return l5(z, true);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Spliterator<? extends a<K, V>> l(boolean z) {
            return l5(z, false);
        }

        @Override // com.p7700g.p99005.a54.g
        public Spliterator<? extends a<K, V>> l5(boolean z, boolean z2) {
            return super.l5(z, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.a54.g
        public boolean o5(a54.d<K> dVar, boolean z) {
            Function<?, ?> function = dVar.s;
            g54.f.a h = this.G.h();
            V value = z ? getValue() : null;
            dVar.o = value;
            Object apply = function.apply(value);
            if (apply == b.DO_NOTHING) {
                return false;
            }
            if (apply == b.REMOVE_NODE) {
                if (z) {
                    this.G.g(h);
                    B5();
                    u5(dVar);
                }
                return false;
            } else if (!z) {
                dVar.n = apply;
                return true;
            } else if (apply != value) {
                this.G.g(h);
                dVar.n = apply;
                return true;
            } else {
                return false;
            }
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends a<K, V>> q(boolean z) {
            return super.q(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<? extends a<K, V>, K, C> r(boolean z) {
            return super.r(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends a<K, V>> s(boolean z) {
            return super.s(z);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V value = getValue();
            this.K = v;
            return value;
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public Iterator<? extends a<K, V>> v(boolean z) {
            return super.v(z);
        }

        @Override // com.p7700g.p99005.a54.g, com.p7700g.p99005.g54, com.p7700g.p99005.o54
        public <C> g54.e<? extends a<K, V>, K, C> w(boolean z) {
            return super.w(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.a54.g
        public void w4(a54.d<K> dVar) {
            super.w4(dVar);
            setValue(dVar.n);
        }

        @Override // com.p7700g.p99005.a54.g
        public Iterator<? extends a<K, V>> y4(boolean z) {
            return super.y4(z);
        }

        @Override // com.p7700g.p99005.a54.g
        /* renamed from: z5 */
        public f54<K, V> x4() {
            return (f54) super.x4();
        }
    }

    /* compiled from: AssociativeAddressTrie.java */
    /* loaded from: classes3.dex */
    public enum b {
        DO_NOTHING,
        REMOVE_NODE
    }

    public f54(a<K, V> aVar) {
        super(aVar);
    }

    public static /* synthetic */ Object M4(Function function, Object obj) {
        Object apply = function.apply(obj);
        return apply == null ? b.REMOVE_NODE : apply;
    }

    public static /* synthetic */ Object N4(Supplier supplier, boolean z, Object obj) {
        Object obj2;
        return (obj != null || ((obj2 = supplier.get()) == null && !z)) ? b.DO_NOTHING : obj2;
    }

    private a<K, V> S4(K k, Function<? super V, ? extends Object> function) {
        a<K, V> o;
        n04 a2 = t44.a(k, true);
        g54.d dVar = this.z;
        if (dVar != null) {
            if (!dVar.u(a2)) {
                a54.S3();
            }
            o = h();
            if (o == null) {
                o = o();
            }
        } else {
            o = o();
        }
        a54.d<E> dVar2 = new a54.d<>(a2, a54.e.REMAP);
        dVar2.s = function;
        o.d5(dVar2);
        o54 o54Var = dVar2.f;
        if (o54Var == null) {
            o54Var = dVar2.p;
        }
        return (a) o54Var;
    }

    @Override // com.p7700g.p99005.a54
    public Iterator<? extends a<K, V>> B(boolean z) {
        return super.B(z);
    }

    @Override // com.p7700g.p99005.d54.c
    public a<K, V> B2(K k, final Function<? super V, ? extends V> function) {
        return S4(k, new Function() { // from class: com.p7700g.p99005.w34
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f54.M4(function, obj);
            }
        });
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: B4 */
    public f54<K, V> R(K k) {
        return (f54) super.R(k);
    }

    @Override // com.p7700g.p99005.a54
    public <C> g54.e<? extends a<K, V>, K, C> D() {
        return super.D();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: D4 */
    public a<K, V> L2(K k) {
        return (a) super.L2(k);
    }

    @Override // com.p7700g.p99005.a54
    public Iterator<? extends a<K, V>> E(boolean z) {
        return super.E(z);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: E4 */
    public f54<K, V> S(K k) {
        return (f54) super.S(k);
    }

    @Override // com.p7700g.p99005.d54.b
    public V F(K k) {
        a<K, V> o;
        if (this.z != null) {
            k = (K) t44.a(k, true);
            if (!this.z.u(k) || (o = h()) == null) {
                return null;
            }
        } else {
            o = o();
        }
        return o.F(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: F4 */
    public a<K, V> h2() {
        return (a) super.h2();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: G4 */
    public a<K, V> j4() {
        return (a) super.j4();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: H4 */
    public a<K, V> y3(K k) {
        return (a) super.y3(k);
    }

    @Override // com.p7700g.p99005.t44, com.p7700g.p99005.d54
    /* renamed from: I4 */
    public a<K, V> O2(K k) {
        return (a) c54.a(this, k);
    }

    @Override // com.p7700g.p99005.d54.c
    public boolean J1(K k, V v) {
        n04 a2 = t44.a(k, true);
        g54.d dVar = this.z;
        if (dVar != null && !dVar.u(a2)) {
            a54.S3();
        }
        y(a2);
        a<K, V> o = o();
        a54.d<E> dVar2 = new a54.d<>(a2, a54.e.INSERT);
        dVar2.n = v;
        o.d5(dVar2);
        return !dVar2.e;
    }

    @Override // com.p7700g.p99005.d54.c
    public a<K, V> J2(K k, final Supplier<? extends V> supplier, final boolean z) {
        return S4(k, new Function() { // from class: com.p7700g.p99005.v34
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f54.N4(supplier, z, obj);
            }
        });
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: J4 */
    public a<K, V> u3(K k) {
        return (a) super.u3(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.t44
    /* renamed from: K4 */
    public a<K, V> h() {
        return (a) super.h();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: L4 */
    public a<K, V> n2(K k) {
        return (a) super.n2(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: O4 */
    public a<K, V> M2() {
        return (a) super.M2();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: P4 */
    public a<K, V> d4() {
        return (a) super.d4();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: Q4 */
    public a<K, V> T1(K k) {
        return (a) super.T1(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: R4 */
    public a<K, V> W(K k) {
        return (a) super.W(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: T4 */
    public a<K, V> u4(K k) {
        return (a) super.u4(k);
    }

    @Override // com.p7700g.p99005.d54.c
    public a<K, V> U2(a<K, V> aVar) {
        return (a) x(aVar, true);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: U4 */
    public a<K, V> N3(K k) {
        return (a) super.N3(k);
    }

    @Override // com.p7700g.p99005.d54.c
    public V Y(K k, V v) {
        n04 a2 = t44.a(k, true);
        g54.d dVar = this.z;
        if (dVar != null && !dVar.u(a2)) {
            a54.S3();
        }
        y(a2);
        a<K, V> o = o();
        a54.d<E> dVar2 = new a54.d<>(a2, a54.e.INSERT);
        dVar2.n = v;
        o.d5(dVar2);
        return (V) dVar2.o;
    }

    @Override // com.p7700g.p99005.d54.c
    public a<K, V> a3(K k, V v) {
        n04 a2 = t44.a(k, true);
        g54.d dVar = this.z;
        if (dVar != null && !dVar.u(a2)) {
            a54.S3();
        }
        y(a2);
        a<K, V> o = o();
        a54.d<E> dVar2 = new a54.d<>(a2, a54.e.INSERT);
        dVar2.n = v;
        o.d5(dVar2);
        o54 o54Var = dVar2.f;
        if (o54Var == null) {
            o54Var = dVar2.p;
        }
        return (a) o54Var;
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: e4 */
    public a<K, V> o() {
        return (a) super.o();
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.t44
    public boolean equals(Object obj) {
        return (obj instanceof f54) && super.equals(obj);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54.a
    /* renamed from: g4 */
    public a<K, V> E2(K k) {
        return (a) super.E2(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends a<K, V>> j(boolean z) {
        return super.j(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<? extends a<K, V>> k(boolean z) {
        return w3(z, true);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Spliterator<? extends a<K, V>> l(boolean z) {
        return w3(z, false);
    }

    public b54<K, V> n4() {
        b54<K, V> b54Var = this.D;
        return b54Var == null ? new b54<>(this) : b54Var;
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: p4 */
    public a<K, V> t2(K k) {
        return (a) super.t2(k);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends a<K, V>> q(boolean z) {
        return super.q(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.t44
    /* renamed from: q4 */
    public f54<K, V> f() {
        f54<K, V> f54Var = (f54) super.f();
        f54Var.D = null;
        return f54Var;
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<? extends a<K, V>, K, C> r(boolean z) {
        return super.r(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends a<K, V>> s(boolean z) {
        return super.s(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.a54
    public a54.g<K> u(a54.d<K> dVar, a54.g<K> gVar, a54.g<K> gVar2, boolean z) {
        if (z && (gVar2 instanceof a)) {
            dVar.n = ((a) gVar2).getValue();
        }
        return super.u(dVar, gVar, gVar2, z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public Iterator<? extends a<K, V>> v(boolean z) {
        return super.v(z);
    }

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54, com.p7700g.p99005.o54
    public <C> g54.e<? extends a<K, V>, K, C> w(boolean z) {
        return super.w(z);
    }

    @Override // com.p7700g.p99005.a54
    public Spliterator<? extends a<K, V>> w3(boolean z, boolean z2) {
        return super.w3(z, z2);
    }

    @Override // com.p7700g.p99005.a54
    /* renamed from: w4 */
    public abstract f54<K, V> M(a54.b<K> bVar);

    @Override // com.p7700g.p99005.a54
    /* renamed from: x4 */
    public abstract f54<K, V> O(a54.b<K> bVar);

    @Override // com.p7700g.p99005.a54, com.p7700g.p99005.d54
    /* renamed from: y4 */
    public a<K, V> K(K k) {
        return (a) super.K(k);
    }

    public f54(a<K, V> aVar, a54.b<K> bVar) {
        super(aVar, bVar);
    }
}