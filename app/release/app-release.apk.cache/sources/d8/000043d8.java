package com.p7700g.p99005;

import com.p7700g.p99005.g54;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: BinaryTreeNode.java */
/* loaded from: classes3.dex */
public class g54<E> implements o54<E>, Cloneable, Serializable {
    public static final String A = "  ";
    private static final long s = 1;
    public static boolean t = true;
    public static final int u = -1;
    public static final String v = "○";
    public static final String w = "●";
    public static final String x = "├─";
    public static final String y = "│ ";
    public static final String z = "└─";
    private E B;
    private g54<E> C;
    private g54<E> D;
    private g54<E> E;
    public int F;
    public f G;
    private boolean H;

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static abstract class a<E> implements Iterator<g54<E>> {
        private final f s;
        private f.a t;
        public g54<E> u;
        public g54<E> v;
        public g54<E> w;
        public BinaryOperator<g54<E>> x;

        public a(g54<E> g54Var, g54<E> g54Var2, f fVar) {
            this.w = g54Var2;
            this.s = fVar;
            if (fVar != null) {
                this.t = fVar.h();
            }
        }

        public g54<E> a() {
            f fVar = this.s;
            if (fVar != null) {
                fVar.g(this.t);
            }
            g54<E> g54Var = this.v;
            this.u = g54Var;
            this.v = f(g54Var);
            return this.u;
        }

        public g54<E> b(g54<E> g54Var, g54<E> g54Var2, d<E> dVar, boolean z) {
            if (g54Var == g54Var2 || g54Var == null) {
                return null;
            }
            return ((!z || g54Var.J()) && (dVar == null || dVar.u(g54Var.getKey()))) ? g54Var : f(g54Var);
        }

        public abstract BinaryOperator<g54<E>> c();

        @Override // java.util.Iterator
        /* renamed from: d */
        public g54<E> next() {
            if (hasNext()) {
                return a();
            }
            throw new NoSuchElementException();
        }

        public g54<E> e() {
            if (hasNext()) {
                return a();
            }
            return null;
        }

        public g54<E> f(g54<E> g54Var) {
            return (g54) c().apply(g54Var, this.w);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.v != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.u != null) {
                f fVar = this.s;
                if (fVar != null) {
                    fVar.g(this.t);
                }
                this.u.x3();
                this.u = null;
                if (fVar != null) {
                    this.t = fVar.h();
                    return;
                }
                return;
            }
            throw new IllegalStateException(g54.E("ipaddress.error.no.iterator.element.to.remove"));
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class c<E> extends a<E> {
        private static final Comparator<?> y = new a(false);
        private static final Comparator<?> z = new a(true);
        public PriorityQueue<g54<E>> A;
        private final boolean B;
        private final d<E> C;

        /* compiled from: BinaryTreeNode.java */
        /* loaded from: classes3.dex */
        public static class a<E extends n04> implements Comparator<g54<E>> {
            private final boolean s;

            public a(boolean z) {
                this.s = z;
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(g54<E> g54Var, g54<E> g54Var2) {
                E key = g54Var.getKey();
                E key2 = g54Var2.getKey();
                if (key == key2) {
                    return 0;
                }
                if (key.C0()) {
                    if (key2.C0()) {
                        int intValue = key.L0().intValue() - key2.L0().intValue();
                        if (intValue == 0) {
                            int t = g54.t(key, key2);
                            return this.s ? -t : t;
                        }
                        return intValue;
                    }
                    return -1;
                } else if (key2.C0()) {
                    return 1;
                } else {
                    int t2 = g54.t(key, key2);
                    return this.s ? -t2 : t2;
                }
            }
        }

        public c(int i, boolean z2, g54<E> g54Var, boolean z3, f fVar) {
            this(i, null, z2, g54Var, z3, fVar);
        }

        /* renamed from: g */
        public /* synthetic */ g54 h(g54 g54Var, g54 g54Var2) {
            g54<E> D = g54Var.D();
            if (D != null) {
                this.A.add(D);
            }
            g54<E> I = g54Var.I();
            if (I != null) {
                this.A.add(I);
            }
            g54<E> poll = this.A.poll();
            if (poll == g54Var2) {
                return null;
            }
            return poll;
        }

        public static /* synthetic */ g54 i(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.S(g54Var2, binaryOperator);
        }

        private /* synthetic */ g54 j(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.U(g54Var2, binaryOperator, this.C);
        }

        @Override // com.p7700g.p99005.g54.a
        public BinaryOperator<g54<E>> c() {
            final BinaryOperator<g54<E>> binaryOperator = this.x;
            if (binaryOperator == null) {
                binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.y34
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return g54.c.this.h((g54) obj, (g54) obj2);
                    }
                };
                if (this.B) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.a44
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.c.i(binaryOperator, (g54) obj, (g54) obj2);
                        }
                    };
                }
                if (this.C != null) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.z34
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.c.this.k(binaryOperator, (g54) obj, (g54) obj2);
                        }
                    };
                }
                this.x = binaryOperator;
            }
            return binaryOperator;
        }

        public /* synthetic */ g54 k(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.U(g54Var2, binaryOperator, this.C);
        }

        public c(int i, d<E> dVar, boolean z2, g54<E> g54Var, boolean z3, f fVar) {
            super(g54Var, null, fVar);
            this.B = z2;
            this.C = dVar;
            Comparator<?> comparator = z3 ? z : y;
            if (i > 0) {
                int i2 = i >> 1;
                this.A = new PriorityQueue<>(i2 != 0 ? i2 : 1, comparator);
            } else {
                this.A = new PriorityQueue<>((Comparator<? super g54<E>>) comparator);
            }
            this.v = b(g54Var, null, dVar, z2);
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class d<E> implements Serializable {
        private static final long s = 1;
        public final Comparator<? super E> t;
        public final E u;
        public final E v;
        public final boolean w;
        public final boolean x;

        /* compiled from: BinaryTreeNode.java */
        /* loaded from: classes3.dex */
        public enum a {
            INSIDE(false, true),
            EQUIVALENT_TO_UNBOUNDED(false, false),
            EQUIVALENT_TO_EXCLUSIVE(false, false),
            EQUIVALENT_TO_INCLUSIVE(false, false),
            SAME(false, false),
            OUTSIDE(true, false);
            
            private boolean A;
            private boolean z;

            a(boolean z, boolean z2) {
                this.z = z;
                this.A = z2;
            }

            public static a b(int i) {
                if (i > 0) {
                    return OUTSIDE;
                }
                if (i < 0) {
                    return INSIDE;
                }
                return SAME;
            }

            public boolean f() {
                return this.z;
            }

            public boolean g() {
                return this.A;
            }
        }

        public d(E e, boolean z, E e2, boolean z2, Comparator<? super E> comparator) {
            Objects.requireNonNull(comparator);
            this.t = comparator;
            this.u = e;
            this.v = e2;
            this.w = z;
            this.x = z2;
            if (e2 == null || !t(e2)) {
                return;
            }
            throw new IllegalArgumentException(g54.E("ipaddress.error.address.lower.exceeds.upper") + " " + e + ", " + e2);
        }

        public static <E> String M(E e, boolean z, E e2, boolean z2, Function<? super E, String> function, String str, Function<? super E, String> function2) {
            String str2;
            String str3 = "";
            if (e == null) {
                str2 = "";
            } else {
                String apply = function.apply(e);
                if (z) {
                    str2 = f14.u + apply;
                } else {
                    str2 = '(' + apply;
                }
            }
            if (e2 != null) {
                String apply2 = function2.apply(e2);
                if (z2) {
                    str3 = apply2 + f14.v;
                } else {
                    str3 = apply2 + ')';
                }
            }
            return wo1.u(str2, str, str3);
        }

        private int a(E e, E e2) {
            return this.t.compare(e, e2);
        }

        public boolean A(E e) {
            return false;
        }

        public boolean B() {
            return (x() || D()) ? false : true;
        }

        public boolean D() {
            return this.v != null;
        }

        public boolean E(E e) {
            return !t(e);
        }

        public boolean G(E e) {
            return !i(e);
        }

        public boolean H() {
            return this.w;
        }

        public d<E> I(E e, boolean z, E e2, boolean z2) {
            return J(e, z, e2, z2, true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0039, code lost:
            if (r2 != com.p7700g.p99005.g54.d.a.EQUIVALENT_TO_INCLUSIVE) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0072, code lost:
            if (r2 != com.p7700g.p99005.g54.d.a.EQUIVALENT_TO_INCLUSIVE) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d<E> J(E e, boolean z, E e2, boolean z2, boolean z3) {
            if (e != null) {
                a b = b(e, z);
                if (b.f()) {
                    if (z3) {
                        throw new IllegalArgumentException(g54.E("ipaddress.error.lower.below.range") + " " + e);
                    }
                } else if (!b.g()) {
                }
                e = null;
            }
            if (e2 != null) {
                a c = c(e2, z2);
                if (c.f()) {
                    if (z3) {
                        throw new IllegalArgumentException(g54.E("ipaddress.error.lower.above.range") + " " + e2);
                    }
                } else if (!c.g()) {
                }
                e2 = null;
            }
            if (e == null) {
                if (e2 == null) {
                    return null;
                }
                e = this.u;
                z = this.w;
            }
            E e3 = e;
            boolean z4 = z;
            if (e2 == null) {
                e2 = this.v;
                z2 = this.x;
            }
            return d(e3, z4, e2, z2, this.t);
        }

        public String L(String str) {
            u34 u34Var = u34.a;
            return N(u34Var, str, u34Var);
        }

        public String N(Function<? super E, String> function, String str, Function<? super E, String> function2) {
            return M(f(), H(), g(), O(), function, str, function2);
        }

        public boolean O() {
            return this.x;
        }

        public String U0() {
            return L(" -> ");
        }

        public a b(E e, boolean z) {
            if (!x()) {
                if (z && A(e)) {
                    return a.EQUIVALENT_TO_UNBOUNDED;
                }
                return a.INSIDE;
            } else if (z) {
                if (this.w) {
                    return a.b(a(this.u, e));
                }
                if (a(this.u, e) >= 0) {
                    return a.OUTSIDE;
                }
                if (m(e)) {
                    return a.EQUIVALENT_TO_EXCLUSIVE;
                }
                return a.INSIDE;
            } else if (this.w) {
                if (a(this.u, e) <= 0) {
                    return a.INSIDE;
                }
                if (o(e)) {
                    return a.EQUIVALENT_TO_INCLUSIVE;
                }
                return a.OUTSIDE;
            } else {
                return a.b(a(this.u, e));
            }
        }

        public a c(E e, boolean z) {
            if (!D()) {
                if (z && y(e)) {
                    return a.EQUIVALENT_TO_UNBOUNDED;
                }
                return a.INSIDE;
            } else if (z) {
                if (this.x) {
                    return a.b(a(e, this.v));
                }
                if (a(e, this.v) >= 0) {
                    return a.OUTSIDE;
                }
                if (p(e)) {
                    return a.EQUIVALENT_TO_EXCLUSIVE;
                }
                return a.INSIDE;
            } else if (this.x) {
                if (a(e, this.v) <= 0) {
                    return a.INSIDE;
                }
                if (n(e)) {
                    return a.EQUIVALENT_TO_INCLUSIVE;
                }
                return a.OUTSIDE;
            } else {
                return a.b(a(e, this.v));
            }
        }

        public d<E> d(E e, boolean z, E e2, boolean z2, Comparator<? super E> comparator) {
            return new d<>(e, z, e2, z2, comparator);
        }

        public E f() {
            return this.u;
        }

        public E g() {
            return this.v;
        }

        public d<E> h(E e, boolean z, E e2, boolean z2) {
            d<E> J = J(e, z, e2, z2, false);
            return J == null ? this : J;
        }

        public boolean i(E e) {
            return D() && (!this.x ? a(e, this.v) < 0 : a(e, this.v) <= 0);
        }

        public boolean m(E e) {
            return false;
        }

        public boolean n(E e) {
            return false;
        }

        public boolean o(E e) {
            return false;
        }

        public boolean p(E e) {
            return false;
        }

        public boolean t(E e) {
            return x() && (!this.w ? a(e, this.u) > 0 : a(e, this.u) >= 0);
        }

        public String toString() {
            return U0();
        }

        public boolean u(E e) {
            return E(e) && G(e);
        }

        public boolean x() {
            return this.u != null;
        }

        public boolean y(E e) {
            return false;
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public interface e<N extends g54<E>, E, C> extends Iterator<N> {
        C A();

        boolean E(C c);

        boolean P(C c);
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class f implements Serializable {
        private static final long s = 1;
        private a t = new a();

        /* compiled from: BinaryTreeNode.java */
        /* loaded from: classes3.dex */
        public static class a implements Cloneable, Serializable {
            private static final long s = 1;
            public boolean t;
            private BigInteger u = BigInteger.ZERO;
            private int v;

            public boolean equals(Object obj) {
                return (obj instanceof a) && g((a) obj);
            }

            /* renamed from: f */
            public a clone() {
                try {
                    return (a) super.clone();
                } catch (CloneNotSupportedException unused) {
                    return null;
                }
            }

            public boolean g(a aVar) {
                return this.v == aVar.v && this.u.equals(aVar.u);
            }

            public void h() {
                int i = this.v + 1;
                this.v = i;
                if (i == 0) {
                    this.u = this.u.add(BigInteger.ONE);
                }
            }

            public String toString() {
                return this.u + " " + this.v;
            }
        }

        public void f() {
            a aVar = this.t;
            if (aVar.t) {
                a clone = aVar.clone();
                clone.t = false;
                clone.h();
                this.t = clone;
            }
        }

        public void g(a aVar) throws ConcurrentModificationException {
            if (i(aVar)) {
                throw new ConcurrentModificationException();
            }
        }

        public a h() {
            a aVar = this.t;
            aVar.t = true;
            return aVar;
        }

        public boolean i(a aVar) {
            return !this.t.g(aVar);
        }

        public String toString() {
            StringBuilder G = wo1.G("current change: ");
            G.append(this.t);
            return G.toString();
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class g {
        public final String a;
        public final String b;

        public g() {
            this("", "");
        }

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class h<E> implements Iterator<E> {
        private Iterator<? extends g54<E>> s;

        public h(Iterator<? extends g54<E>> it) {
            this.s = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.s.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.s.remove();
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class i<E> implements Spliterator<E> {
        private final Spliterator<? extends g54<E>> a;
        private final Comparator<? super E> b;

        public i(Spliterator<? extends g54<E>> spliterator, Comparator<? super E> comparator) {
            this.a = spliterator;
            this.b = comparator;
        }

        public static /* synthetic */ void b(Consumer consumer, g54 g54Var) {
            consumer.accept(g54Var.getKey());
        }

        private static <E> Consumer<? super g54<E>> d(final Consumer<? super E> consumer) {
            return new Consumer() { // from class: com.p7700g.p99005.b44
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    g54.i.b(consumer, (g54) obj);
                }
            };
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.a.characteristics();
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.a.estimateSize();
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<? super E> consumer) {
            this.a.forEachRemaining(d(consumer));
        }

        @Override // java.util.Spliterator
        public Comparator<? super E> getComparator() {
            return this.b;
        }

        @Override // java.util.Spliterator
        public long getExactSizeIfKnown() {
            return this.a.getExactSizeIfKnown();
        }

        public String toString() {
            return this.a.toString();
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super E> consumer) {
            return this.a.tryAdvance(d(consumer));
        }

        @Override // java.util.Spliterator
        public Spliterator<E> trySplit() {
            Spliterator<? extends g54<E>> trySplit = this.a.trySplit();
            if (trySplit == null) {
                return null;
            }
            return new i(trySplit, this.b);
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class j<E> extends a<E> {
        public final boolean y;
        public final boolean z;

        public j(boolean z, boolean z2, g54<E> g54Var, g54<E> g54Var2, f fVar) {
            super(g54Var, g54Var2, fVar);
            this.y = z;
            this.z = z2;
            this.v = b(g54Var, g54Var2, null, z2);
        }

        @Override // com.p7700g.p99005.g54.a
        public BinaryOperator<g54<E>> c() {
            final BinaryOperator<g54<E>> binaryOperator = this.x;
            if (binaryOperator == null) {
                binaryOperator = this.y ? o44.a : n44.a;
                if (this.z) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.c44
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.b((g54) obj, (g54) obj2, binaryOperator);
                        }
                    };
                }
                this.x = binaryOperator;
            }
            return binaryOperator;
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class l<E, C> extends n<E, C> {
        public l(boolean z, boolean z2, g54<E> g54Var, g54<E> g54Var2, f fVar) {
            this(null, z, z2, g54Var, g54Var2, fVar);
        }

        private /* synthetic */ g54 l(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.U(g54Var2, binaryOperator, this.E);
        }

        @Override // com.p7700g.p99005.g54.a
        public BinaryOperator<g54<E>> c() {
            final BinaryOperator<g54<E>> binaryOperator = this.x;
            if (binaryOperator == null) {
                binaryOperator = this.G ? s44.a : p44.a;
                if (this.F) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.e44
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.b((g54) obj, (g54) obj2, binaryOperator);
                        }
                    };
                }
                if (this.E != null) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.d44
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.l.this.m(binaryOperator, (g54) obj, (g54) obj2);
                        }
                    };
                }
                this.x = binaryOperator;
            }
            return binaryOperator;
        }

        @Override // com.p7700g.p99005.g54.n
        public void i() {
            if (this.G) {
                throw new Error();
            }
        }

        @Override // com.p7700g.p99005.g54.n
        public void j() {
            if (this.G) {
                return;
            }
            super.j();
        }

        public /* synthetic */ g54 m(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.U(g54Var2, binaryOperator, this.E);
        }

        @Override // com.p7700g.p99005.g54.a, java.util.Iterator
        public void remove() {
            if (this.G && !this.F) {
                throw new UnsupportedOperationException();
            }
            super.remove();
        }

        public l(d<E> dVar, boolean z, boolean z2, g54<E> g54Var, g54<E> g54Var2, f fVar) {
            super(dVar, z, z2, g54Var, g54Var2, fVar);
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class m<E, C> extends n<E, C> {
        public m(boolean z, boolean z2, g54<E> g54Var, g54<E> g54Var2, f fVar) {
            this(null, z, z2, g54Var, g54Var2, fVar);
        }

        private /* synthetic */ g54 l(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.U(g54Var2, binaryOperator, this.E);
        }

        @Override // com.p7700g.p99005.g54.a
        public BinaryOperator<g54<E>> c() {
            final BinaryOperator<g54<E>> binaryOperator = this.x;
            if (binaryOperator == null) {
                binaryOperator = this.G ? r44.a : p34.a;
                if (this.F) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.f44
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.b((g54) obj, (g54) obj2, binaryOperator);
                        }
                    };
                }
                if (this.E != null) {
                    binaryOperator = new BinaryOperator() { // from class: com.p7700g.p99005.g44
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return g54.m.this.m(binaryOperator, (g54) obj, (g54) obj2);
                        }
                    };
                }
                this.x = binaryOperator;
            }
            return binaryOperator;
        }

        @Override // com.p7700g.p99005.g54.n
        public void i() {
            if (!this.G) {
                throw new Error();
            }
        }

        @Override // com.p7700g.p99005.g54.n
        public void j() {
            if (this.G) {
                super.j();
            }
        }

        public /* synthetic */ g54 m(BinaryOperator binaryOperator, g54 g54Var, g54 g54Var2) {
            return g54Var.U(g54Var2, binaryOperator, this.E);
        }

        @Override // com.p7700g.p99005.g54.a, java.util.Iterator
        public void remove() {
            if (!this.G && !this.F) {
                throw new UnsupportedOperationException();
            }
            super.remove();
        }

        public m(d<E> dVar, boolean z, boolean z2, g54<E> g54Var, g54<E> g54Var2, f fVar) {
            super(dVar, z, z2, g54Var, g54Var2, fVar);
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static abstract class n<E, C> extends a<E> implements e<g54<E>, E, C> {
        private static final int y = 130;
        private E A;
        private C B;
        private Object[] C;
        private int D;
        public final d<E> E;
        public final boolean F;
        public final boolean G;
        private C z;

        public n(d<E> dVar, boolean z, boolean z2, g54<E> g54Var, g54<E> g54Var2, f fVar) {
            super(g54Var, g54Var2, fVar);
            this.D = -1;
            this.G = z;
            this.F = z2;
            this.E = dVar;
            this.v = b(g54Var, g54Var2, dVar, z2);
        }

        private boolean g(C c) {
            d<E> dVar;
            i();
            g54<E> g54Var = this.u;
            if (g54Var != null) {
                g54<E> D = this.G ? g54Var.D() : g54Var.I();
                if (D != null) {
                    if ((this.F && !D.J()) || ((dVar = this.E) != null && !dVar.u(D.getKey()))) {
                        D = (g54) c().apply(D, this.u);
                    }
                    if (D != null) {
                        this.A = D.getKey();
                        this.B = c;
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        private boolean h(C c) {
            d<E> dVar;
            i();
            g54<E> g54Var = this.u;
            if (g54Var != null) {
                g54<E> I = this.G ? g54Var.I() : g54Var.D();
                if (I != null) {
                    if ((this.F && !I.J()) || ((dVar = this.E) != null && !dVar.u(I.getKey()))) {
                        I = (g54) c().apply(I, this.u);
                    }
                    if (I != null) {
                        if ((this.G ? this.u.D() : this.u.I()) == null) {
                            this.A = I.getKey();
                            this.B = c;
                        } else {
                            if (this.C == null) {
                                this.C = new Object[260];
                            }
                            int i = this.D + 1;
                            this.D = i;
                            this.C[i] = I.getKey();
                            this.C[this.D + 130] = c;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // com.p7700g.p99005.g54.e
        public C A() {
            i();
            return this.z;
        }

        @Override // com.p7700g.p99005.g54.e
        public boolean E(C c) {
            return this.G ? h(c) : g(c);
        }

        @Override // com.p7700g.p99005.g54.e
        public boolean P(C c) {
            return this.G ? g(c) : h(c);
        }

        @Override // com.p7700g.p99005.g54.a
        public g54<E> a() {
            g54<E> a = super.a();
            j();
            return a;
        }

        public abstract void i();

        public void j() {
            E e = this.A;
            if (e != null && this.u.getKey() == e) {
                this.z = this.B;
                this.B = null;
                return;
            }
            Object[] objArr = this.C;
            if (objArr != null) {
                int i = this.D;
                if (i >= 0 && objArr[i] == this.u.getKey()) {
                    int i2 = i + 130;
                    this.z = (C) objArr[i2];
                    objArr[i2] = null;
                    objArr[i] = null;
                    this.D--;
                    return;
                }
                this.z = null;
                return;
            }
            this.z = null;
        }
    }

    public g54(E e2) {
        this.B = e2;
    }

    public static String E(String str) {
        return t44.g(str);
    }

    private j<E> N(boolean z2, boolean z3) {
        return new j<>(z2, z3, z2 ? A() : Q(), H(), this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean O(d dVar, g54 g54Var) {
        return dVar.u(g54Var.getKey());
    }

    public g54<E> S(g54<E> g54Var, BinaryOperator<g54<E>> binaryOperator) {
        return d3(this, g54Var, binaryOperator, i44.a);
    }

    public g54<E> U(g54<E> g54Var, BinaryOperator<g54<E>> binaryOperator, final d<E> dVar) {
        return d3(this, g54Var, binaryOperator, new Predicate() { // from class: com.p7700g.p99005.h44
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return g54.O(g54.d.this, (g54) obj);
            }
        });
    }

    public static /* synthetic */ g54 b(g54 g54Var, g54 g54Var2, BinaryOperator binaryOperator) {
        return g54Var.S(g54Var2, binaryOperator);
    }

    private void d(g54<E> g54Var, g54<E> g54Var2, int i2, boolean z2) {
        int i3 = -this.F;
        if (g54Var2 == null) {
            if (!g54Var.J() && (!t || !g54Var.M())) {
                g54Var.F += i3;
                g54Var.G3(z2 ? g54Var.D() : g54Var.I(), i3);
            } else {
                g54Var.c(i3 + i2);
            }
        } else {
            g54Var.c(g54Var2.F + i3 + i2);
        }
        e4(null);
    }

    private static <E> g54<E> d3(g54<E> g54Var, g54<E> g54Var2, BinaryOperator<g54<E>> binaryOperator, Predicate<g54<E>> predicate) {
        do {
            g54Var = (g54) binaryOperator.apply(g54Var, g54Var2);
            if (g54Var == g54Var2 || g54Var == null) {
                return null;
            }
        } while (!predicate.test(g54Var));
        return g54Var;
    }

    public static int t(n04 n04Var, n04 n04Var2) {
        return n04.H.a(n04Var, n04Var2);
    }

    private Iterator<? extends g54<E>> u(boolean z2, boolean z3) {
        if (z2) {
            return new l(true, z3, B(), H(), this.G);
        }
        return new m(false, z3, R(), H(), this.G);
    }

    private <C> e<? extends g54<E>, E, C> x(boolean z2, boolean z3) {
        if (z2) {
            return new m(true, z3, this, H(), this.G);
        }
        return new l(false, z3, this, H(), this.G);
    }

    public g54<E> A() {
        g54<E> g54Var = this;
        while (true) {
            g54<E> D = g54Var.D();
            if (D == null) {
                return g54Var;
            }
            g54Var = D;
        }
    }

    public g54<E> B() {
        g54<E> g54Var = this;
        while (true) {
            g54<E> D = g54Var.D();
            if (D == null && (D = g54Var.I()) == null) {
                return g54Var;
            }
            g54Var = D;
        }
    }

    public void C3() {
        c(-1);
        S3(false);
        this.G.f();
    }

    public g54<E> D() {
        return this.D;
    }

    public void E3(g54<E> g54Var) {
        G3(g54Var, 0);
        this.G.f();
    }

    public String G() {
        return String.valueOf(getKey());
    }

    public void G3(g54<E> g54Var, int i2) {
        if (M()) {
            I3(g54Var);
            return;
        }
        g54<E> H = H();
        if (H.I() == this) {
            d(H, g54Var, i2, true);
            H.g4(g54Var);
        } else if (H.D() == this) {
            d(H, g54Var, i2, false);
            H.W3(g54Var);
        } else {
            throw new Error();
        }
    }

    public g54<E> H() {
        return this.C;
    }

    public g54<E> I() {
        return this.E;
    }

    public void I3(g54<E> g54Var) {
        if (g54Var == null) {
            S3(false);
            g4(null);
            W3(null);
            if (!t) {
                U3(null);
            }
            this.F = 0;
            return;
        }
        S3(g54Var.J());
        g4(g54Var.I());
        W3(g54Var.D());
        U3(g54Var.getKey());
        this.F = g54Var.F;
    }

    public boolean J() {
        return this.H;
    }

    public boolean L() {
        return J() && I() == null && D() == null;
    }

    public boolean M() {
        return this.C == null;
    }

    public void N3() {
        if (this.H) {
            return;
        }
        S3(true);
        c(1);
    }

    public g54<E> P() {
        g54<E> Q = Q();
        return Q.J() ? Q : Q.j3();
    }

    public g54<E> Q() {
        g54<E> g54Var = this;
        while (true) {
            g54<E> I = g54Var.I();
            if (I == null) {
                return g54Var;
            }
            g54Var = I;
        }
    }

    public g54<E> R() {
        g54<E> g54Var = this;
        while (true) {
            g54<E> I = g54Var.I();
            if (I == null && (I = g54Var.D()) == null) {
                return g54Var;
            }
            g54Var = I;
        }
    }

    public void S3(boolean z2) {
        this.H = z2;
    }

    public g54<E> T() {
        return S(null, o44.a);
    }

    public void U3(E e2) {
        this.B = e2;
    }

    public g54<E> V() {
        return X(null);
    }

    public void W3(g54<E> g54Var) {
        this.D = g54Var;
        if (g54Var != null) {
            g54Var.e4(this);
        }
    }

    public g54<E> X(g54<E> g54Var) {
        g54<E> I = I();
        if (I == null) {
            g54<E> H = H();
            if (H == g54Var) {
                return null;
            }
            g54<E> g54Var2 = this;
            while (H != null && g54Var2 == H.I()) {
                g54<E> H2 = H.H();
                if (H2 == g54Var) {
                    return null;
                }
                g54Var2 = H;
                H = H2;
            }
            return H;
        }
        while (true) {
            g54<E> D = I.D();
            if (D == null) {
                return I;
            }
            I = D;
        }
    }

    public g54<E> X2(g54<E> g54Var) {
        g54<E> I;
        g54<E> D = D();
        if (D == null && (D = I()) == null) {
            D = H();
            g54<E> g54Var2 = this;
            while (D != null) {
                if (D == g54Var) {
                    return null;
                }
                if (g54Var2 == D.D() && (I = D.I()) != null) {
                    return I;
                }
                g54Var2 = D;
                D = D.H();
            }
        }
        return D;
    }

    public g54<E> Z(g54<E> g54Var) {
        g54<E> I;
        g54<E> H = H();
        if (H == null || H == g54Var) {
            return null;
        }
        if (H.I() == this || (I = H.I()) == null) {
            return H;
        }
        while (true) {
            g54<E> D = I.D();
            if (D == null && (D = I.I()) == null) {
                return I;
            }
            I = D;
        }
    }

    public void c(int i2) {
        if (i2 != 0) {
            g54<E> g54Var = this;
            do {
                g54Var.F += i2;
                g54Var = g54Var.H();
            } while (g54Var != null);
        }
    }

    @Override // com.p7700g.p99005.o54
    public /* synthetic */ Spliterator c3() {
        return n54.b(this);
    }

    public void clear() {
        E3(null);
    }

    @Override // com.p7700g.p99005.o54
    public Iterator<E> descendingIterator() {
        return new h(q(false));
    }

    public void e4(g54<E> g54Var) {
        this.C = g54Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g54) {
            return getKey().equals(((g54) obj).getKey());
        }
        return false;
    }

    public <C> e<? extends g54<E>, E, C> f() {
        return new b(this, false, this.G);
    }

    public Iterator<? extends g54<E>> g(boolean z2, boolean z3) {
        return new c(z3 ? size() : 0, z3, this, !z2, this.G);
    }

    public void g4(g54<E> g54Var) {
        this.E = g54Var;
        if (g54Var != null) {
            g54Var.e4(this);
        }
    }

    public E getKey() {
        return this.B;
    }

    @Override // 
    /* renamed from: h */
    public g54<E> clone() {
        try {
            g54<E> g54Var = (g54) super.clone();
            g54Var.e4(null);
            g54Var.W3(null);
            g54Var.g4(null);
            g54Var.F = J() ? 1 : 0;
            g54Var.G = null;
            return g54Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int hashCode() {
        return getKey().hashCode();
    }

    public g54<E> i() {
        return n(null);
    }

    public int i3() {
        int i2 = 0;
        j<E> N = N(true, false);
        while (N.hasNext()) {
            i2++;
            N.next();
        }
        return i2;
    }

    public boolean isEmpty() {
        return !J() && I() == null && D() == null;
    }

    @Override // com.p7700g.p99005.o54, java.lang.Iterable
    public Iterator<E> iterator() {
        return new h(q(true));
    }

    @Override // com.p7700g.p99005.o54
    public Iterator<? extends g54<E>> j(boolean z2) {
        return u(z2, true);
    }

    public g54<E> j3() {
        return S(null, n44.a);
    }

    @Override // com.p7700g.p99005.o54
    public /* synthetic */ Spliterator k(boolean z2) {
        return n54.c(this, z2);
    }

    public g54<E> k3() {
        return n3(null);
    }

    @Override // com.p7700g.p99005.o54
    public /* synthetic */ Spliterator l(boolean z2) {
        return n54.a(this, z2);
    }

    public g54<E> n(d<E> dVar) {
        return o(new f(), dVar);
    }

    public g54<E> n3(g54<E> g54Var) {
        g54<E> D = D();
        if (D != null) {
            while (true) {
                g54<E> I = D.I();
                if (I == null) {
                    break;
                }
                D = I;
            }
        } else {
            D = H();
            if (D == g54Var) {
                return null;
            }
            g54<E> g54Var2 = this;
            while (D != null && g54Var2 == D.D()) {
                g54<E> H = D.H();
                if (H == g54Var) {
                    return null;
                }
                g54Var2 = D;
                D = H;
            }
        }
        return D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String n4(boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("\n");
        w3(sb, new g(), z2, z3, w(true));
        return sb.toString();
    }

    public g54<E> o(f fVar, d<E> dVar) {
        g54<E> p = p(fVar);
        n nVar = (n) p.w(true);
        boolean z2 = false;
        g54<E> g54Var = p;
        do {
            g54<E> D = g54Var.D();
            if (dVar != null) {
                while (true) {
                    if (D == null) {
                        break;
                    } else if (dVar.E(D.getKey())) {
                        if (!D.J()) {
                            g54<E> D2 = D.D();
                            while (true) {
                                if (!dVar.t(D2.getKey())) {
                                    break;
                                }
                                D2 = D2.I();
                                if (D2 == null) {
                                    D = D.I();
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        D = D.I();
                        z2 = true;
                    }
                }
            }
            if (D != null) {
                g54Var.W3(D.p(fVar));
            } else {
                g54Var.W3(null);
            }
            g54<E> I = g54Var.I();
            if (dVar != null) {
                while (true) {
                    if (I == null) {
                        break;
                    } else if (dVar.G(I.getKey())) {
                        if (!I.J()) {
                            g54<E> I2 = I.I();
                            while (true) {
                                if (!dVar.i(I2.getKey())) {
                                    break;
                                }
                                I2 = I2.D();
                                if (I2 == null) {
                                    I = I.D();
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        I = I.D();
                        z2 = true;
                    }
                }
            }
            if (I != null) {
                g54Var.g4(I.p(fVar));
            } else {
                g54Var.g4(null);
            }
            nVar.next();
            g54Var = nVar.v;
        } while (nVar.hasNext());
        if (!p.J() && !M()) {
            g54<E> D3 = p.D();
            if (D3 == null) {
                p = p.I();
            } else if (p.I() == null) {
                p = D3;
            }
        }
        if (z2 && p != null) {
            p.F = -1;
            p.size();
        }
        return p;
    }

    public g54<E> p(f fVar) {
        try {
            g54<E> g54Var = (g54) super.clone();
            g54Var.e4(null);
            g54Var.G = fVar;
            return g54Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public g54<E> p3(g54<E> g54Var) {
        g54<E> D;
        g54<E> I = I();
        if (I == null) {
            g54<E> D2 = D();
            if (D2 == null) {
                g54<E> H = H();
                g54<E> g54Var2 = this;
                while (H != null) {
                    if (H == g54Var) {
                        return null;
                    }
                    if (g54Var2 == H.I() && (D = H.D()) != null) {
                        return D;
                    }
                    g54Var2 = H;
                    H = H.H();
                }
                return H;
            }
            return D2;
        }
        return I;
    }

    public boolean p4(g54<?> g54Var) {
        if (g54Var == this) {
            return true;
        }
        if (g54Var.size() != size()) {
            return false;
        }
        Iterator<? extends g54<E>> q = q(true);
        Iterator<? extends g54<?>> q2 = g54Var.q(true);
        while (q.hasNext()) {
            if (!q.next().equals(q2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.o54
    public Iterator<? extends g54<E>> q(boolean z2) {
        return N(z2, true);
    }

    public int q4() {
        Iterator<? extends g54<E>> q = q(true);
        int i2 = 0;
        while (q.hasNext()) {
            i2 += q.next().hashCode();
        }
        return i2;
    }

    @Override // com.p7700g.p99005.o54
    public <C> e<? extends g54<E>, E, C> r(boolean z2) {
        return x(z2, true);
    }

    @Override // com.p7700g.p99005.o54
    public Iterator<? extends g54<E>> s(boolean z2) {
        return u(z2, false);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    public int size() {
        int i2 = this.F;
        if (i2 == -1) {
            Iterator<? extends g54<E>> s2 = s(true);
            while (s2.hasNext()) {
                g54<E> next = s2.next();
                ?? J = next.J();
                g54<E> D = next.D();
                int i3 = J;
                if (D != null) {
                    i3 = J + D.F;
                }
                g54<E> I = next.I();
                if (I != null) {
                    i3 += I.F;
                }
                next.F = i3;
            }
            return this.F;
        }
        return i2;
    }

    @Override // com.p7700g.p99005.o54, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return n54.d(this);
    }

    public g54<E> t3(g54<E> g54Var) {
        g54<E> D;
        g54<E> H = H();
        if (H == null || H == g54Var) {
            return null;
        }
        if (H.D() == this || (D = H.D()) == null) {
            return H;
        }
        while (true) {
            g54<E> I = D.I();
            if (I == null && (I = D.D()) == null) {
                return D;
            }
            D = I;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J() ? "● " : "○ ");
        sb.append(G());
        return sb.toString();
    }

    @Override // com.p7700g.p99005.o54
    public Iterator<? extends g54<E>> v(boolean z2) {
        return N(z2, false);
    }

    @Override // com.p7700g.p99005.o54
    public <C> e<? extends g54<E>, E, C> w(boolean z2) {
        return x(z2, false);
    }

    public void w3(StringBuilder sb, g gVar, boolean z2, boolean z3, e<? extends g54<E>, E, g> eVar) {
        String str;
        String str2;
        while (eVar.hasNext()) {
            g54 g54Var = (g54) eVar.next();
            g A2 = eVar.A();
            if (A2 == null) {
                str2 = gVar.a;
                str = gVar.b;
            } else {
                String str3 = A2.a;
                str = A2.b;
                str2 = str3;
            }
            if (!z2 && !g54Var.J()) {
                sb.append(str2);
                sb.append("○\n");
            } else {
                sb.append(str2);
                sb.append(g54Var);
                if (z3) {
                    sb.append(" (");
                    sb.append(g54Var.size());
                    sb.append(')');
                }
                sb.append('\n');
            }
            g54<E> I = g54Var.I();
            g54<E> D = g54Var.D();
            if (I != null) {
                if (D != null) {
                    eVar.P(new g(wo1.t(str, x), wo1.t(str, y)));
                }
                eVar.E(new g(wo1.t(str, z), wo1.t(str, A)));
            } else if (D != null) {
                eVar.P(new g(wo1.t(str, z), wo1.t(str, A)));
            }
        }
    }

    public void x3() {
        if (J()) {
            if (t && M()) {
                C3();
            } else if (I() == null) {
                E3(D());
            } else if (D() == null) {
                E3(I());
            } else {
                C3();
            }
        }
    }

    public g54<E> y() {
        g54<E> A2 = A();
        return A2.J() ? A2 : A2.T();
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class k<E> implements Spliterator<g54<E>> {
        private final f a;
        private f.a b;
        private final Comparator<? super g54<E>> c;
        private a d;
        private g54<E> e;
        private g54<E> f;
        private g54<E> g;
        private j<E> h;
        private long i;
        private final boolean j;
        private final boolean k;

        /* compiled from: BinaryTreeNode.java */
        /* loaded from: classes3.dex */
        public enum a {
            ALL,
            BEGINNING,
            ENDING
        }

        public k(boolean z, Comparator<? super g54<E>> comparator, g54<E> g54Var, g54<E> g54Var2, g54<E> g54Var3, long j, f fVar, boolean z2) {
            this(z, comparator, a.ALL, g54Var2, g54Var3, j, fVar, z2);
            this.g = g54Var;
        }

        private j<E> b() {
            return new j<>(this.k, this.j, this.e, this.f, this.a);
        }

        private g54<E> d() {
            a aVar = this.d;
            if (aVar == a.BEGINNING) {
                return this.k ? this.f.D() : this.f.I();
            } else if (aVar == a.ENDING) {
                g54<E> I = this.k ? this.e.I() : this.e.D();
                if (I == null || this.f == null || getComparator().compare(I, this.f) < 0) {
                    return I;
                }
                return null;
            } else {
                return this.g;
            }
        }

        private g54<E> e(g54<E> g54Var, g54<E> g54Var2) {
            return this.k ? g54Var.X(g54Var2) : g54Var.n3(g54Var2);
        }

        private j<E> f() {
            this.a.g(this.b);
            if (this.h == null) {
                this.h = b();
            }
            return this.h;
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.d == a.ALL ? 341 : 277;
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.i;
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<? super g54<E>> consumer) {
            g54<E> e = f().e();
            if (e != null) {
                consumer.accept(e);
                while (true) {
                    g54<E> e2 = this.h.e();
                    if (e2 == null) {
                        return;
                    }
                    consumer.accept(e2);
                }
            } else {
                Objects.requireNonNull(consumer);
            }
        }

        @Override // java.util.Spliterator
        public Comparator<? super g54<E>> getComparator() {
            return this.c;
        }

        public String toString() {
            StringBuilder G = wo1.G("spliterator from ");
            G.append(this.e);
            G.append(" to ");
            G.append(this.f);
            return G.toString();
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super g54<E>> consumer) {
            g54<E> e = f().e();
            if (e != null) {
                consumer.accept(e);
                return true;
            }
            Objects.requireNonNull(consumer);
            return false;
        }

        @Override // java.util.Spliterator
        public Spliterator<g54<E>> trySplit() {
            g54<E> g54Var;
            if (this.e == null) {
                return null;
            }
            this.a.g(this.b);
            g54<E> d = d();
            if (d == null) {
                return null;
            }
            j<E> jVar = this.h;
            if (jVar == null) {
                g54Var = this.e;
            } else {
                g54Var = jVar.v;
                if (g54Var == null) {
                    return null;
                }
            }
            if (g54Var == this.f) {
                return null;
            }
            this.d = a.ENDING;
            if (g54Var != d && getComparator().compare(g54Var, d) < 0) {
                this.e = d;
                if (this.j) {
                    while (!g54Var.J()) {
                        g54Var = e(g54Var, d);
                        if (g54Var != d) {
                            if (g54Var == null) {
                            }
                        }
                        return trySplit();
                    }
                }
                g54<E> g54Var2 = g54Var;
                if (this.j) {
                    g54<E> g54Var3 = d;
                    while (!g54Var3.J()) {
                        g54Var3 = e(g54Var3, this.f);
                        if (g54Var3 != this.f) {
                            if (g54Var3 == null) {
                            }
                        }
                        this.e = g54Var2;
                        this.f = d;
                        this.d = a.BEGINNING;
                        j<E> jVar2 = this.h;
                        if (jVar2 != null) {
                            jVar2.w = d;
                        }
                        return trySplit();
                    }
                }
                long j = this.i;
                k kVar = new k(this.k, this.c, a.BEGINNING, g54Var2, d, j >>> 1, this.a, this.j);
                this.i = (j + 1) >>> 1;
                j<E> jVar3 = this.h;
                if (jVar3 != null) {
                    kVar.h = jVar3;
                    this.h.w = d;
                }
                this.h = null;
                return kVar;
            }
            this.e = g54Var;
            return trySplit();
        }

        private k(boolean z, Comparator<? super g54<E>> comparator, a aVar, g54<E> g54Var, g54<E> g54Var2, long j, f fVar, boolean z2) {
            this.c = comparator;
            this.i = j;
            this.f = g54Var2;
            this.e = g54Var;
            this.d = aVar;
            this.a = fVar;
            this.j = z2;
            this.k = z;
            this.b = fVar.h();
        }
    }

    /* compiled from: BinaryTreeNode.java */
    /* loaded from: classes3.dex */
    public static class b<E, C> extends a<E> implements e<g54<E>, E, C> {
        private static final Comparator<?> y = new C0178b(false);
        private static final Comparator<?> z = new C0178b(true);
        private PriorityQueue<a<E, C>> A;
        private C B;
        private a<E, C> C;
        private a<E, C> D;
        private a<E, C> E;

        /* compiled from: BinaryTreeNode.java */
        /* loaded from: classes3.dex */
        public static class a<E, C> {
            public g54<E> a;
            public C b;
        }

        /* compiled from: BinaryTreeNode.java */
        /* renamed from: com.p7700g.p99005.g54$b$b */
        /* loaded from: classes3.dex */
        public static class C0178b<E extends n04> implements Comparator<a<E, ?>> {
            private final boolean s;

            public C0178b(boolean z) {
                this.s = z;
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(a<E, ?> aVar, a<E, ?> aVar2) {
                g54<E> g54Var = aVar.a;
                g54<E> g54Var2 = aVar2.a;
                E key = g54Var.getKey();
                E key2 = g54Var2.getKey();
                if (key == key2) {
                    return 0;
                }
                if (key.C0()) {
                    if (key2.C0()) {
                        int intValue = key.L0().intValue() - key2.L0().intValue();
                        if (intValue == 0) {
                            int t = g54.t(key, key2);
                            return this.s ? -t : t;
                        }
                        return intValue;
                    }
                    return -1;
                } else if (key2.C0()) {
                    return 1;
                } else {
                    int t2 = g54.t(key, key2);
                    return this.s ? -t2 : t2;
                }
            }
        }

        public b(int i, g54<E> g54Var, boolean z2, f fVar) {
            super(g54Var, null, fVar);
            Comparator<?> comparator = z2 ? z : y;
            if (i == 0) {
                this.A = new PriorityQueue<>((Comparator<? super a<E, C>>) comparator);
            } else {
                this.A = new PriorityQueue<>(i >> 1, comparator);
            }
            this.v = b(g54Var, null, null, false);
        }

        /* renamed from: g */
        public /* synthetic */ g54 h(g54 g54Var, g54 g54Var2) {
            g54<E> g54Var3;
            g54<E> D = g54Var.D();
            if (D != null) {
                a<E, C> aVar = new a<>();
                aVar.a = D;
                this.D = aVar;
                this.A.add(aVar);
            } else {
                this.D = null;
            }
            g54<E> I = g54Var.I();
            if (I != null) {
                a<E, C> aVar2 = new a<>();
                aVar2.a = I;
                this.E = aVar2;
                this.A.add(aVar2);
            } else {
                this.E = null;
            }
            a<E, C> aVar3 = this.C;
            if (aVar3 != null) {
                this.B = aVar3.b;
            }
            a<E, C> poll = this.A.poll();
            if (poll != null && (g54Var3 = poll.a) != g54Var2) {
                this.C = poll;
                return g54Var3;
            }
            this.C = null;
            return null;
        }

        @Override // com.p7700g.p99005.g54.e
        public C A() {
            return this.B;
        }

        @Override // com.p7700g.p99005.g54.e
        public boolean E(C c) {
            a<E, C> aVar = this.E;
            if (aVar != null) {
                aVar.b = c;
                return true;
            }
            return false;
        }

        @Override // com.p7700g.p99005.g54.e
        public boolean P(C c) {
            a<E, C> aVar = this.D;
            if (aVar != null) {
                aVar.b = c;
                return true;
            }
            return false;
        }

        @Override // com.p7700g.p99005.g54.a
        public BinaryOperator<g54<E>> c() {
            BinaryOperator<g54<E>> binaryOperator = this.x;
            if (binaryOperator == null) {
                BinaryOperator<g54<E>> binaryOperator2 = new BinaryOperator() { // from class: com.p7700g.p99005.x34
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return g54.b.this.h((g54) obj, (g54) obj2);
                    }
                };
                this.x = binaryOperator2;
                return binaryOperator2;
            }
            return binaryOperator;
        }

        public b(g54<E> g54Var, boolean z2, f fVar) {
            this(0, g54Var, z2, fVar);
        }
    }
}