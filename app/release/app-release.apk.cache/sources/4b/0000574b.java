package com.p7700g.p99005;

import com.p7700g.p99005.m14;
import com.p7700g.p99005.s04;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* compiled from: IPAddressSeqRange.java */
/* loaded from: classes3.dex */
public abstract class q14 implements v24 {
    private static final long s = 1;
    public final j14 t;
    public final j14 u;
    private transient BigInteger v;
    private transient int w;

    /* compiled from: IPAddressSeqRange.java */
    /* loaded from: classes3.dex */
    public class a implements Iterator<R> {
        public final /* synthetic */ Iterator s;

        public a(Iterator it) {
            this.s = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [R, com.p7700g.p99005.q14] */
        @Override // java.util.Iterator
        public R next() {
            return ((j14) this.s.next()).z2();
        }
    }

    /* compiled from: IPAddressSeqRange.java */
    /* loaded from: classes3.dex */
    public class b implements Iterator<q14> {
        public q14 s;

        public b() {
            q14.this = r1;
            this.s = r1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public q14 next() {
            q14 q14Var = this.s;
            if (q14Var != null) {
                this.s = null;
                return q14Var;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: IPAddressSeqRange.java */
    /* loaded from: classes3.dex */
    public class c implements Iterator<q14> {
        public Iterator<? extends j14> s;
        private boolean t = true;
        public final /* synthetic */ int u;

        public c(int i) {
            q14.this = r1;
            this.u = i;
            this.s = r1.F1(i);
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public q14 next() {
            j14 next = this.s.next();
            if (this.t) {
                this.t = false;
                j14 a0 = q14.this.a0();
                if (hasNext()) {
                    if (!a0.N2(this.u)) {
                        return q14.this.c(a0, next.o());
                    }
                } else {
                    j14 b0 = q14.this.b0();
                    if (!a0.N2(this.u) || !b0.r1(this.u)) {
                        return q14.this.c(a0, b0);
                    }
                }
            } else if (!hasNext()) {
                j14 b02 = q14.this.b0();
                if (!b02.r1(this.u)) {
                    return q14.this.c(next.m(), b02);
                }
            }
            return next.z2();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: IPAddressSeqRange.java */
    /* loaded from: classes3.dex */
    public class d implements Iterator<S> {
        public final /* synthetic */ Iterator s;
        public final /* synthetic */ boolean[] t;
        public final /* synthetic */ int u;

        public d(Iterator it, boolean[] zArr, int i) {
            this.s = it;
            this.t = zArr;
            this.u = i;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public n14 next() {
            n14 n14Var = (n14) this.s.next();
            if (!this.s.hasNext()) {
                this.t[this.u + 1] = true;
            }
            return n14Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }
    }

    /* compiled from: IPAddressSeqRange.java */
    /* loaded from: classes3.dex */
    public class e implements Iterator<S> {
        public final /* synthetic */ Iterator s;
        public final /* synthetic */ boolean[] t;
        public final /* synthetic */ int u;

        public e(Iterator it, boolean[] zArr, int i) {
            this.s = it;
            this.t = zArr;
            this.u = i;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public n14 next() {
            n14 n14Var = (n14) this.s.next();
            if (!this.s.hasNext()) {
                this.t[this.u + 1] = true;
            }
            return n14Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }
    }

    /* compiled from: IPAddressSeqRange.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface f<S, T> extends m14.h<S, T> {
    }

    /* compiled from: IPAddressSeqRange.java */
    /* loaded from: classes3.dex */
    public interface g<S, T> {
        S a();

        void b(S s, S s2);
    }

    /* compiled from: IPAddressSeqRange.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface h<T> {
        boolean a(T t, T t2, int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends j14> q14(T t, T t2, UnaryOperator<T> unaryOperator, UnaryOperator<T> unaryOperator2, UnaryOperator<T> unaryOperator3) {
        boolean h4 = t.h4(t2);
        if (!h4 && !t2.h4(t)) {
            j14 j14Var = (j14) unaryOperator.apply(t);
            j14 j14Var2 = (j14) unaryOperator.apply(t2);
            j14 j14Var3 = (j14) unaryOperator2.apply(t);
            j14 j14Var4 = (j14) unaryOperator2.apply(t2);
            j14Var = a(j14Var, j14Var2) > 0 ? j14Var2 : j14Var;
            j14Var3 = a(j14Var3, j14Var4) < 0 ? j14Var4 : j14Var3;
            this.t = (j14) unaryOperator3.apply(j14Var);
            this.u = (j14) unaryOperator3.apply(j14Var3);
            return;
        }
        j14 j14Var5 = (j14) (h4 ? unaryOperator3.apply(t) : unaryOperator3.apply(t2));
        this.t = (j14) unaryOperator.apply(j14Var5);
        this.u = (j14) unaryOperator2.apply(j14Var5);
    }

    public static <T extends n04, S extends x04> Iterator<T> D(T t, d34<T, ?, ?, S> d34Var) {
        return m14.t6(t, d34Var, null);
    }

    public static <T extends j14, S extends n14> Iterator<T> E(T t, T t2, d34<T, ?, ?, S> d34Var, m14.g<T, S> gVar, m14.g<S, Iterator<S>> gVar2, h<T> hVar, int i, int i2, m14.g<S, Iterator<S>> gVar3) {
        m14.g<T, S> gVar4;
        final m14.g<S, Iterator<S>> gVar5;
        int p1 = t.p1();
        final ArrayList arrayList = new ArrayList(p1);
        final boolean[] zArr = new boolean[p1 + 1];
        int i3 = 0;
        boolean z = true;
        zArr[0] = true;
        S s2 = null;
        final int i4 = 0;
        boolean z2 = true;
        while (i4 < p1) {
            if (gVar3 == null || i4 < i) {
                gVar4 = gVar;
                gVar5 = gVar2;
            } else {
                gVar4 = gVar;
                gVar5 = gVar3;
            }
            S a2 = gVar4.a(t, i4);
            if (z2) {
                z2 = hVar.a(t, t2, i4);
                if (z2) {
                    zArr[i4 + 1] = z;
                    final Iterator<S> a3 = gVar5.a(a2, i4);
                    arrayList.add(new Supplier() { // from class: com.p7700g.p99005.c04
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return a3;
                        }
                    });
                } else {
                    final d dVar = new d(gVar5.a(d34Var.c(a2.B1(), t2.D0(i4).B1(), null), i4), zArr, i4);
                    arrayList.add(new Supplier() { // from class: com.p7700g.p99005.f04
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return dVar;
                        }
                    });
                }
            } else {
                final Iterator<S> a4 = gVar5.a(d34Var.c(a2.B1(), t.g1(), null), i4);
                final e eVar = new e(gVar5.a(d34Var.c(i3, t2.D0(i4).B1(), null), i4), zArr, i4);
                if (s2 == null) {
                    s2 = d34Var.c(0, t.g1(), null);
                }
                final S s3 = s2;
                final int i5 = i4;
                final Supplier supplier = new Supplier() { // from class: com.p7700g.p99005.d04
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return q14.L(zArr, i5, eVar, gVar5, s3);
                    }
                };
                arrayList.add(new Supplier() { // from class: com.p7700g.p99005.e04
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ArrayList arrayList2 = arrayList;
                        int i6 = i4;
                        Supplier supplier2 = supplier;
                        Iterator it = a4;
                        arrayList2.set(i6, supplier2);
                        return it;
                    }
                });
                s2 = s3;
            }
            i4++;
            i3 = 0;
            z = true;
        }
        IntFunction intFunction = new IntFunction() { // from class: com.p7700g.p99005.g04
            @Override // java.util.function.IntFunction
            public final Object apply(int i6) {
                return q14.N(arrayList, i6);
            }
        };
        return m14.t6(null, d34Var, m14.s6(t.V0(), d34Var, intFunction, i, i2, intFunction));
    }

    public static q14[] H(q14... q14VarArr) {
        q14[] q14VarArr2 = (q14[]) q14VarArr.clone();
        int length = q14VarArr2.length - 1;
        int i = 0;
        for (int i2 = 0; i2 <= length; i2++) {
            if (q14VarArr2[i2] == null) {
                while (true) {
                    i++;
                    if (q14VarArr2[length] != null || length <= i2) {
                        break;
                    }
                    length--;
                }
                if (length > i2) {
                    q14VarArr2[i2] = q14VarArr2[length];
                    q14VarArr2[length] = null;
                    length--;
                }
            }
        }
        int length2 = q14VarArr2.length - i;
        Arrays.sort(q14VarArr2, 0, length2, n04.H);
        for (int i3 = 0; i3 < length2; i3++) {
            q14 q14Var = q14VarArr2[i3];
            if (q14Var != null) {
                j14 a0 = q14Var.a0();
                j14 b0 = q14Var.b0();
                boolean z = false;
                for (int i4 = i3 + 1; i4 < q14VarArr2.length; i4++) {
                    q14 q14Var2 = q14VarArr2[i4];
                    if (q14Var2 != null) {
                        j14 a02 = q14Var2.a0();
                        if (a(b0, a02) < 0 && !b0.p(1L).equals(a02)) {
                            break;
                        }
                        j14 b02 = q14Var2.b0();
                        if (a(b0, b02) < 0) {
                            b0 = b02;
                        }
                        q14VarArr2[i4] = null;
                        i++;
                        z = true;
                    }
                }
                if (z) {
                    q14VarArr2[i3] = q14Var.c(a0, b0);
                }
            }
        }
        if (i == 0) {
            return q14VarArr2;
        }
        int length3 = q14VarArr2.length - i;
        q14[] q14VarArr3 = new q14[length3];
        int i5 = 0;
        for (q14 q14Var3 : q14VarArr2) {
            if (q14Var3 != null) {
                int i6 = i5 + 1;
                q14VarArr3[i5] = q14Var3;
                if (i6 >= length3) {
                    break;
                }
                i5 = i6;
            }
        }
        return q14VarArr3;
    }

    public static /* synthetic */ Iterator I(Iterator it) {
        return it;
    }

    public static /* synthetic */ Iterator J(Iterator it) {
        return it;
    }

    public static /* synthetic */ Iterator L(boolean[] zArr, int i, Iterator it, m14.g gVar, n14 n14Var) {
        return zArr[i] ? it : (Iterator) gVar.a(n14Var, i);
    }

    public static /* synthetic */ Iterator N(ArrayList arrayList, int i) {
        return (Iterator) ((Supplier) arrayList.get(i)).get();
    }

    public static <R, A extends j14> Iterator<R> P(Iterator<A> it) {
        return new a(it);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <I extends q14, T extends v24, S extends x04> boolean Q(g<I, T> gVar, BiFunction<S[], S[], I> biFunction, s04.a<S> aVar, S[] sArr, S[] sArr2, int i, int i2, Integer num) {
        boolean z;
        S s2;
        S s3;
        boolean z2;
        int i3 = 0;
        while (true) {
            z = true;
            s2 = null;
            if (i3 >= i2) {
                s3 = null;
                z2 = false;
                break;
            }
            S s4 = sArr[i3];
            S s5 = sArr2[i3];
            int B1 = s4.B1();
            int B12 = s5.B1();
            if (B1 != B12) {
                int i4 = B1 + ((B12 - B1) >>> 1);
                S b2 = aVar.b(i4);
                S b3 = aVar.b(i4 + 1);
                z2 = true;
                s2 = b2;
                s3 = b3;
                break;
            }
            i3++;
        }
        if (i3 == i && !z2) {
            S s6 = sArr[i3];
            S s7 = sArr2[i3];
            int A0 = s6.A0();
            int intValue = A0 - m14.x3(A0, num, i3).intValue();
            int B13 = s6.B1() >>> intValue;
            int B14 = s7.B1() >>> intValue;
            if (B13 != B14) {
                int i5 = B13 + ((B14 - B13) >>> 1);
                s2 = aVar.b((i5 << intValue) | (~((-1) << intValue)));
                s3 = aVar.b((i5 + 1) << intValue);
                if (z) {
                    int length = sArr.length;
                    S[] d2 = aVar.d(length);
                    S[] d3 = aVar.d(length);
                    System.arraycopy(sArr, 0, d2, 0, i3);
                    System.arraycopy(sArr, 0, d3, 0, i3);
                    int i6 = i3 + 1;
                    d2[i3] = s2;
                    d3[i3] = s3;
                    Arrays.fill(d2, i6, d2.length, aVar.b(s2.g1()));
                    Arrays.fill(d3, i6, d3.length, aVar.b(0));
                    gVar.b(biFunction.apply(sArr, d2), biFunction.apply(d3, sArr2));
                }
                return z;
            }
        }
        z = z2;
        if (z) {
        }
        return z;
    }

    private static int a(j14 j14Var, j14 j14Var2) {
        return j14.j3(j14Var, j14Var2);
    }

    private boolean b(v24 v24Var) {
        return a(v24Var.a0(), a0()) >= 0 && a(v24Var.b0(), b0()) <= 0;
    }

    public static <S extends e24> x44<S> h(S s2, Predicate<g<S, S>> predicate, f<S, S> fVar, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
        return new m14.a(s2, predicate, fVar, function, predicate2, toLongFunction);
    }

    public static <S extends e24> x44<S> i(S s2, Predicate<g<S, S>> predicate, f<S, S> fVar, ToLongFunction<S> toLongFunction) {
        return new m14.a(s2, predicate, fVar, toLongFunction);
    }

    public static <S extends e24, T> v44<S, T> o(S s2, Predicate<g<S, T>> predicate, f<S, T> fVar, Function<S, BigInteger> function, Predicate<S> predicate2, ToLongFunction<S> toLongFunction) {
        return new m14.b(s2, predicate, fVar, function, predicate2, toLongFunction);
    }

    public static <S extends e24, T> v44<S, T> p(S s2, Predicate<g<S, T>> predicate, f<S, T> fVar, ToLongFunction<S> toLongFunction) {
        return new m14.b(s2, predicate, fVar, toLongFunction);
    }

    public static int x(int i, int i2, int i3) {
        return t64.c(i, i2, i3);
    }

    public static int y(int i, int i2, int i3) {
        return t64.e(i, i2, i3);
    }

    public q14 A(q14 q14Var) {
        j14 a0 = q14Var.a0();
        j14 b0 = q14Var.b0();
        j14 a02 = a0();
        j14 b02 = b0();
        if (a(a02, a0) <= 0) {
            if (a(b02, b0) >= 0) {
                return q14Var;
            }
            if (a(b02, a0) < 0) {
                return null;
            }
            return c(a0, b02);
        } else if (a(b0, b02) >= 0) {
            return this;
        } else {
            if (a(b0, a02) < 0) {
                return null;
            }
            return c(a02, b0);
        }
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return a0().A0();
    }

    @Override // com.p7700g.p99005.v24
    public abstract Stream<? extends j14> A1(int i);

    @Override // com.p7700g.p99005.l24
    public byte[] A3() {
        return b0().A3();
    }

    public boolean B(q14 q14Var) {
        return getCount().compareTo(q14Var.getCount()) > 0;
    }

    @Override // com.p7700g.p99005.l24
    public boolean B3(int i) {
        return m14.r5(i, a0(), b0());
    }

    @Override // com.p7700g.p99005.v24
    public boolean C(q14 q14Var) {
        return b(q14Var);
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger C1() {
        return b0().getValue();
    }

    @Override // com.p7700g.p99005.l24
    public byte[] C2(byte[] bArr, int i) {
        return a0().C2(bArr, i);
    }

    @Override // com.p7700g.p99005.v24
    public String E0() {
        return T(" -> ");
    }

    @Override // com.p7700g.p99005.v24
    public abstract Iterator<? extends j14> F1(int i);

    public q14 G(q14 q14Var) {
        j14 a0 = q14Var.a0();
        j14 b0 = q14Var.b0();
        j14 a02 = a0();
        j14 b02 = b0();
        int a2 = a(a02, a0);
        if (!O(q14Var)) {
            if (a2 >= 0) {
                if (b0.p(1L).equals(a02)) {
                    return c(a0, b02);
                }
                return null;
            } else if (b02.p(1L).equals(a0)) {
                return c(a02, b0);
            } else {
                return null;
            }
        }
        int a3 = a(b02, b0);
        if (a2 < 0) {
            a0 = a02;
        } else if (a2 == 0 && a3 == 0) {
            return this;
        }
        if (a3 >= 0) {
            b0 = b02;
        }
        return c(a0, b0);
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ boolean H0() {
        return k24.j(this);
    }

    @Override // com.p7700g.p99005.v24
    public boolean M0() {
        return true;
    }

    public boolean O(q14 q14Var) {
        return a(q14Var.a0(), b0()) <= 0 && a(q14Var.b0(), a0()) >= 0;
    }

    @Override // com.p7700g.p99005.l24
    public boolean P3() {
        return x1() && !z3();
    }

    @Override // com.p7700g.p99005.v24
    public abstract j14[] Q0();

    public q14[] R(q14 q14Var) {
        j14 a0 = q14Var.a0();
        j14 b0 = q14Var.b0();
        j14 a02 = a0();
        j14 b02 = b0();
        if (a(a02, a0) < 0) {
            if (a(b02, b0) > 0) {
                return g(a02, a0.p(-1L), b0.p(1L), b02);
            }
            int a2 = a(b02, a0);
            if (a2 < 0) {
                return m();
            }
            if (a2 == 0) {
                return n(a02, b02.p(-1L));
            }
            return n(a02, a0.p(-1L));
        } else if (a(b0, b02) >= 0) {
            return f();
        } else {
            int a3 = a(b0, a02);
            if (a3 < 0) {
                return m();
            }
            if (a3 == 0) {
                return n(a02.p(1L), b02);
            }
            return n(b0.p(1L), b02);
        }
    }

    public String S(String str) {
        dz3 dz3Var = dz3.a;
        return U(dz3Var, str, dz3Var);
    }

    public String T(String str) {
        i04 i04Var = i04.a;
        return U(i04Var, str, i04Var);
    }

    public String U(Function<? super j14, String> function, String str, Function<? super j14, String> function2) {
        return function.apply(a0()) + str + function2.apply(b0());
    }

    @Override // com.p7700g.p99005.v24
    public String U0() {
        return S(" -> ");
    }

    @Override // com.p7700g.p99005.l24
    public boolean V1() {
        return v1() && !z3();
    }

    @Override // com.p7700g.p99005.v24
    public Iterator<? extends q14> V2(int i) {
        if (i >= 0) {
            if (!z3()) {
                return new b();
            }
            return new c(i);
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ Integer X3() {
        return k24.i(this);
    }

    @Override // com.p7700g.p99005.l24
    public boolean Y2(int i) {
        return m14.s5(i, a0(), b0());
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int b3() {
        return k24.g(this);
    }

    public abstract q14 c(j14 j14Var, j14 j14Var2);

    @Override // com.p7700g.p99005.l24, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(l24 l24Var) {
        int m4;
        m4 = m4(l24Var);
        return m4;
    }

    @Override // com.p7700g.p99005.v24
    public abstract j14 e1();

    public boolean equals(Object obj) {
        if (obj instanceof q14) {
            q14 q14Var = (q14) obj;
            return a0().equals(q14Var.a0()) && b0().equals(q14Var.b0());
        }
        return false;
    }

    public abstract q14[] f();

    @Override // com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public abstract Iterable<? extends j14> f0();

    public abstract q14[] g(j14 j14Var, j14 j14Var2, j14 j14Var3, j14 j14Var4);

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int g3() {
        return k24.e(this);
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger getCount() {
        BigInteger bigInteger = this.v;
        if (bigInteger == null) {
            BigInteger u = u();
            this.v = u;
            return u;
        }
        return bigInteger;
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger getValue() {
        return a0().getValue();
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ BigInteger h1(int i) {
        return k24.h(this, i);
    }

    @Override // com.p7700g.p99005.v24
    public boolean h4(j14 j14Var) {
        return b(j14Var);
    }

    public int hashCode() {
        int i = this.w;
        if (i == 0) {
            int hashCode = (a0().hashCode() * 31) + b0().hashCode();
            this.w = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.p7700g.p99005.v24
    public abstract j14[] i1();

    @Override // com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract Iterator<? extends j14> iterator();

    @Override // com.p7700g.p99005.v24
    public abstract Stream<? extends q14> j2(int i);

    @Override // com.p7700g.p99005.l24
    public byte[] l1(byte[] bArr) {
        return b0().l1(bArr);
    }

    @Override // com.p7700g.p99005.v24
    public abstract v44<? extends q14, ? extends j14> l3(int i);

    public abstract q14[] m();

    @Override // com.p7700g.p99005.l24
    public byte[] m1() {
        return a0().m1();
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int m4(l24 l24Var) {
        return k24.a(this, l24Var);
    }

    public abstract q14[] n(j14 j14Var, j14 j14Var2);

    @Override // com.p7700g.p99005.v24
    public abstract x44<? extends q14> s2(int i);

    @Override // com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract v44<? extends q14, ? extends j14> spliterator();

    @Override // com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public abstract Stream<? extends j14> stream();

    /* JADX WARN: Type inference failed for: r9v2, types: [com.p7700g.p99005.j14] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.p7700g.p99005.j14] */
    public q14 t(v24 v24Var) {
        j14 a0 = v24Var.a0();
        j14 b0 = v24Var.b0();
        j14 a02 = a0();
        j14 b02 = b0();
        int a2 = a(a02, a0);
        int a3 = a(b02, b0);
        if (a2 > 0) {
            if (a3 <= 0) {
                return v24Var.z2();
            }
            if (a(a02, b0.m0().G(A0(), false)) > 0) {
                return null;
            }
            return c(a0, b02);
        } else if (a3 >= 0) {
            return this;
        } else {
            if (a(a0, b02.m0().G(A0(), false)) > 0) {
                return null;
            }
            return c(a02, b0);
        }
    }

    @Override // com.p7700g.p99005.l24
    public byte[] t4(byte[] bArr) {
        return a0().t4(bArr);
    }

    public String toString() {
        return U0();
    }

    public BigInteger u() {
        return k24.f(this);
    }

    @Override // com.p7700g.p99005.l24
    public boolean v1() {
        return a0().V1();
    }

    @Override // com.p7700g.p99005.l24
    public byte[] v3(byte[] bArr, int i) {
        return b0().v3(bArr, i);
    }

    @Override // com.p7700g.p99005.l24
    public boolean x1() {
        return b0().P3();
    }

    @Override // com.p7700g.p99005.l24
    public boolean z3() {
        if (this.v == null) {
            return !a0().equals(b0());
        }
        return k24.k(this);
    }

    @Override // com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public j14 a0() {
        return this.t;
    }

    @Override // com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public j14 b0() {
        return this.u;
    }

    public <T extends j14> q14(T t, T t2) {
        this.t = t;
        this.u = t2;
    }
}