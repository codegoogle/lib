package com.p7700g.p99005;

import com.p7700g.p99005.m14;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.q14;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv6AddressSeqRange.java */
/* loaded from: classes3.dex */
public class si4 extends q14 implements Iterable<ni4> {
    private static final long x = 1;
    private static final BigInteger y = BigInteger.valueOf(Long.MAX_VALUE);
    private static final si4[] z = new si4[0];

    public si4(ni4 ni4Var, ni4 ni4Var2) {
        super(ni4Var, ni4Var2, tc4.a, hi4.a, lh4.a);
        if (!ni4Var.m0().X0(ni4Var2.m0())) {
            throw new x14(ni4Var, ni4Var2);
        }
    }

    public static /* synthetic */ Iterator C3(int i, boolean z2, boolean z3, si4 si4Var) {
        return si4Var.F1(i);
    }

    public static /* synthetic */ BigInteger E3(int i, si4 si4Var) {
        return si4Var.h1(i);
    }

    public static /* synthetic */ boolean G3(int i, si4 si4Var) {
        return si4Var.h1(i).compareTo(y) <= 0;
    }

    public static /* synthetic */ long I3(int i, si4 si4Var) {
        return si4Var.h1(i).longValue();
    }

    public static /* synthetic */ si4 N3(pi4.a aVar, ri4[] ri4VarArr, ri4[] ri4VarArr2) {
        return new si4(aVar.k3(ri4VarArr), aVar.k3(ri4VarArr2));
    }

    public static /* synthetic */ boolean S3(final pi4.a aVar, int i, int i2, Integer num, q14.g gVar) {
        si4 si4Var = (si4) gVar.a();
        return q14.Q(gVar, new BiFunction() { // from class: com.p7700g.p99005.zg4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return si4.N3(pi4.a.this, (ri4[]) obj, (ri4[]) obj2);
            }
        }, aVar, si4Var.a0().O0().O5(), si4Var.b0().O0().O5(), i, i2, num);
    }

    public static /* synthetic */ Iterator U3(int i, boolean z2, boolean z3, si4 si4Var) {
        return (z2 || z3) ? si4Var.V2(i) : q14.P(si4Var.F1(i));
    }

    public static /* synthetic */ BigInteger W3(int i, si4 si4Var) {
        return si4Var.h1(i);
    }

    private pi4.a c1() {
        return a0().s6();
    }

    public static /* synthetic */ boolean e4(int i, si4 si4Var) {
        return si4Var.h1(i).compareTo(y) <= 0;
    }

    public static /* synthetic */ long g4(int i, si4 si4Var) {
        return si4Var.h1(i).longValue();
    }

    public static /* synthetic */ boolean j3(ni4 ni4Var, ni4 ni4Var2, int i) {
        return ni4Var.D0(i).B1() == ni4Var2.D0(i).B1();
    }

    public static /* synthetic */ Iterator n3(Integer[] numArr, ri4 ri4Var, int i) {
        Integer num = numArr[i];
        if (num == null) {
            return ri4Var.iterator();
        }
        return ri4Var.F1(num.intValue());
    }

    public static /* synthetic */ si4 n4(pi4.a aVar, ri4[] ri4VarArr, ri4[] ri4VarArr2) {
        return new si4(aVar.k3(ri4VarArr), aVar.k3(ri4VarArr2));
    }

    public static /* synthetic */ boolean p4(final pi4.a aVar, int i, int i2, q14.g gVar) {
        si4 si4Var = (si4) gVar.a();
        return q14.Q(gVar, new BiFunction() { // from class: com.p7700g.p99005.yg4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return si4.n4(pi4.a.this, (ri4[]) obj, (ri4[]) obj2);
            }
        }, aVar, si4Var.a0().O0().O5(), si4Var.b0().O0().O5(), i, i2, null);
    }

    public static /* synthetic */ boolean t3(Integer[] numArr, int[] iArr, ni4 ni4Var, ni4 ni4Var2, int i) {
        if (numArr[i] == null) {
            return ni4Var.D0(i).B1() == ni4Var2.D0(i).B1();
        }
        int i2 = iArr[i];
        return (ni4Var.D0(i).B1() >>> i2) == (ni4Var2.D0(i).B1() >>> i2);
    }

    public static /* synthetic */ si4 w3(pi4.a aVar, ri4[] ri4VarArr, ri4[] ri4VarArr2) {
        return new si4(aVar.k3(ri4VarArr), aVar.k3(ri4VarArr2));
    }

    public static /* synthetic */ boolean w4(si4 si4Var) {
        return si4Var.getCount().compareTo(y) <= 0;
    }

    public static /* synthetic */ boolean x3(final pi4.a aVar, int i, int i2, Integer num, q14.g gVar) {
        si4 si4Var = (si4) gVar.a();
        return q14.Q(gVar, new BiFunction() { // from class: com.p7700g.p99005.jh4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return si4.w3(pi4.a.this, (ri4[]) obj, (ri4[]) obj2);
            }
        }, aVar, si4Var.a0().O0().O5(), si4Var.b0().O0().O5(), i, i2, num);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Stream<ni4> A1(int i) {
        return StreamSupport.stream(l3(i), false);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    /* renamed from: B4 */
    public ni4[] Q0() {
        return a0().r5(b0());
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: D1 */
    public ni4 b0() {
        return (ni4) super.b0();
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: D4 */
    public si4[] R(q14 q14Var) {
        return (si4[]) super.R(q14Var);
    }

    public String E4(Function<ni4, String> function, String str, Function<ni4, String> function2) {
        return function.apply(a0()) + str + function2.apply(b0());
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Iterator<ni4> F1(int i) {
        if (i >= 0) {
            ni4 a0 = a0();
            ni4 b0 = b0();
            pi4.a c1 = c1();
            int u2 = a0.u2();
            int Z1 = a0.Z1();
            int V0 = a0.V0();
            final Integer[] numArr = new Integer[V0];
            final int[] iArr = new int[V0];
            for (int i2 = 0; i2 < V0; i2++) {
                Integer f = t64.f(u2, i, i2);
                numArr[i2] = f;
                if (f != null) {
                    iArr[i2] = u2 - f.intValue();
                }
            }
            return q14.E(a0, b0, c1, zh4.a, rh4.a, new q14.h() { // from class: com.p7700g.p99005.sh4
                @Override // com.p7700g.p99005.q14.h
                public final boolean a(Object obj, Object obj2, int i3) {
                    return si4.t3(numArr, iArr, (ni4) obj, (ni4) obj2, i3);
                }
            }, q14.y(i, Z1, u2), q14.x(i, Z1, u2), new m14.g() { // from class: com.p7700g.p99005.eh4
                @Override // com.p7700g.p99005.m14.g
                public final Object a(Object obj, int i3) {
                    return si4.n3(numArr, (ri4) obj, i3);
                }
            });
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.v24
    /* renamed from: F4 */
    public si4 z2() {
        return this;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    /* renamed from: V */
    public ni4 e1() {
        return a0().p3(b0());
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Iterator<si4> V2(int i) {
        return super.V2(i);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: X */
    public si4 c(j14 j14Var, j14 j14Var2) {
        return new si4(j14Var, j14Var2);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: X0 */
    public si4[] n(j14 j14Var, j14 j14Var2) {
        return new si4[]{c(j14Var, j14Var2)};
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: X2 */
    public si4 A(q14 q14Var) {
        return (si4) super.A(q14Var);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: Z */
    public si4[] f() {
        return z;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: d1 */
    public ni4 a0() {
        return (ni4) super.a0();
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: d3 */
    public si4 G(q14 q14Var) {
        return (si4) super.G(q14Var);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<ni4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<ni4> iterator() {
        ni4 a0 = a0();
        ni4 b0 = b0();
        pi4.a c1 = c1();
        if (!z3()) {
            return q14.D(a0, c1);
        }
        int V0 = a0.V0();
        return q14.E(a0, b0, c1, zh4.a, dh4.a, hh4.a, V0 - 1, V0, null);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Stream<si4> j2(int i) {
        return StreamSupport.stream(s2(i), false);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public v44<si4, ni4> l3(final int i) {
        if (i >= 0) {
            ni4 a0 = a0();
            int u2 = a0.u2();
            int Z1 = a0.Z1();
            final pi4.a c1 = c1();
            final Integer b = qi4.b(i);
            final int y2 = q14.y(i, Z1, u2);
            final int x2 = q14.x(i, Z1, u2);
            return q14.o(this, new Predicate() { // from class: com.p7700g.p99005.bh4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return si4.x3(pi4.a.this, y2, x2, b, (q14.g) obj);
                }
            }, new q14.f() { // from class: com.p7700g.p99005.gh4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z2, boolean z3, Object obj) {
                    return si4.C3(i, z2, z3, (si4) obj);
                }
            }, new Function() { // from class: com.p7700g.p99005.wg4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return si4.E3(i, (si4) obj);
                }
            }, new Predicate() { // from class: com.p7700g.p99005.oh4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return si4.G3(i, (si4) obj);
                }
            }, new ToLongFunction() { // from class: com.p7700g.p99005.nh4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return si4.I3(i, (si4) obj);
                }
            });
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public x44<si4> s2(final int i) {
        if (i >= 0) {
            ni4 a0 = a0();
            int u2 = a0.u2();
            int Z1 = a0.Z1();
            final pi4.a c1 = c1();
            final Integer b = qi4.b(i);
            final int y2 = q14.y(i, Z1, u2);
            final int x2 = q14.x(i, Z1, u2);
            return q14.h(this, new Predicate() { // from class: com.p7700g.p99005.ah4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return si4.S3(pi4.a.this, y2, x2, b, (q14.g) obj);
                }
            }, new q14.f() { // from class: com.p7700g.p99005.fh4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z2, boolean z3, Object obj) {
                    return si4.U3(i, z2, z3, (si4) obj);
                }
            }, new Function() { // from class: com.p7700g.p99005.xg4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return si4.W3(i, (si4) obj);
                }
            }, new Predicate() { // from class: com.p7700g.p99005.ch4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return si4.e4(i, (si4) obj);
                }
            }, new ToLongFunction() { // from class: com.p7700g.p99005.ph4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return si4.g4(i, (si4) obj);
                }
            });
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<ni4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: w0 */
    public si4[] g(j14 j14Var, j14 j14Var2, j14 j14Var3, j14 j14Var4) {
        return new si4[]{c(j14Var, j14Var2), c(j14Var3, j14Var4)};
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: x0 */
    public si4[] m() {
        return new si4[]{this};
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    /* renamed from: y4 */
    public ni4[] i1() {
        return a0().p5(b0());
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public v44<si4, ni4> spliterator() {
        final int V0 = a0().V0();
        final pi4.a c1 = c1();
        final int i = V0 - 1;
        return q14.o(this, new Predicate() { // from class: com.p7700g.p99005.mh4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return si4.p4(pi4.a.this, i, V0, (q14.g) obj);
            }
        }, ih4.a, vh4.a, qh4.a, kh4.a);
    }

    private si4(j14 j14Var, j14 j14Var2) {
        super(j14Var, j14Var2);
    }
}