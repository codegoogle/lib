package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.q14;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv4AddressSeqRange.java */
/* loaded from: classes3.dex */
public class dc4 extends q14 implements Iterable<yb4> {
    private static final long x = 1;
    private static final dc4[] y = new dc4[0];

    public dc4(yb4 yb4Var, yb4 yb4Var2) {
        super(yb4Var, yb4Var2, vb4.a, xb4.a, mb4.a);
        if (!yb4Var.m0().X0(yb4Var2.m0())) {
            throw new x14(yb4Var, yb4Var2);
        }
    }

    public static /* synthetic */ long C3(int i, dc4 dc4Var) {
        return dc4Var.D1(i);
    }

    public static /* synthetic */ dc4 E3(ac4.a aVar, cc4[] cc4VarArr, cc4[] cc4VarArr2) {
        return new dc4(aVar.k3(cc4VarArr), aVar.k3(cc4VarArr2));
    }

    public static /* synthetic */ boolean G3(final ac4.a aVar, int i, int i2, Integer num, q14.g gVar) {
        dc4 dc4Var = (dc4) gVar.a();
        return q14.Q(gVar, new BiFunction() { // from class: com.p7700g.p99005.wa4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return dc4.E3(ac4.a.this, (cc4[]) obj, (cc4[]) obj2);
            }
        }, aVar, dc4Var.a0().O0().O5(), dc4Var.b0().O0().O5(), i, i2, num);
    }

    public static /* synthetic */ dc4 I3(ac4.a aVar, cc4[] cc4VarArr, cc4[] cc4VarArr2) {
        return new dc4(aVar.k3(cc4VarArr), aVar.k3(cc4VarArr2));
    }

    public static /* synthetic */ boolean N3(final ac4.a aVar, int i, int i2, Integer num, q14.g gVar) {
        dc4 dc4Var = (dc4) gVar.a();
        return q14.Q(gVar, new BiFunction() { // from class: com.p7700g.p99005.oa4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return dc4.I3(ac4.a.this, (cc4[]) obj, (cc4[]) obj2);
            }
        }, aVar, dc4Var.a0().O0().O5(), dc4Var.b0().O0().O5(), i, i2, num);
    }

    public static /* synthetic */ Iterator S3(int i, boolean z, boolean z2, dc4 dc4Var) {
        return (z || z2) ? dc4Var.V2(i) : q14.P(dc4Var.F1(i));
    }

    public static /* synthetic */ long U3(int i, dc4 dc4Var) {
        return dc4Var.D1(i);
    }

    public static /* synthetic */ dc4 W3(ac4.a aVar, cc4[] cc4VarArr, cc4[] cc4VarArr2) {
        return new dc4(aVar.k3(cc4VarArr), aVar.k3(cc4VarArr2));
    }

    private ac4.a c1() {
        return a0().m0().u();
    }

    public static /* synthetic */ boolean e4(final ac4.a aVar, int i, int i2, q14.g gVar) {
        dc4 dc4Var = (dc4) gVar.a();
        return q14.Q(gVar, new BiFunction() { // from class: com.p7700g.p99005.xa4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return dc4.W3(ac4.a.this, (cc4[]) obj, (cc4[]) obj2);
            }
        }, aVar, dc4Var.a0().O0().O5(), dc4Var.b0().O0().O5(), i, i2, null);
    }

    public static /* synthetic */ boolean n3(yb4 yb4Var, yb4 yb4Var2, int i) {
        return yb4Var.D0(i).B1() == yb4Var2.D0(i).B1();
    }

    public static /* synthetic */ boolean t3(Integer[] numArr, int[] iArr, yb4 yb4Var, yb4 yb4Var2, int i) {
        if (numArr[i] == null) {
            return yb4Var.D0(i).B1() == yb4Var2.D0(i).B1();
        }
        int i2 = iArr[i];
        return (yb4Var.D0(i).B1() >>> i2) == (yb4Var2.D0(i).B1() >>> i2);
    }

    public static /* synthetic */ Iterator w3(Integer[] numArr, cc4 cc4Var, int i) {
        Integer num = numArr[i];
        if (num == null) {
            return cc4Var.iterator();
        }
        return cc4Var.F1(num.intValue());
    }

    public static /* synthetic */ Iterator x3(int i, boolean z, boolean z2, dc4 dc4Var) {
        return dc4Var.F1(i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Stream<yb4> A1(int i) {
        return StreamSupport.stream(l3(i), false);
    }

    public long D1(int i) {
        if (i >= 0) {
            int A0 = A0();
            if (A0 <= i) {
                return d1();
            }
            int i2 = A0 - i;
            return ((b0().X6() >>> i2) - (a0().X6() >>> i2)) + 1;
        }
        throw new y14(this, i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Iterator<yb4> F1(int i) {
        if (i >= 0) {
            yb4 a0 = a0();
            yb4 b0 = b0();
            ac4.a c1 = c1();
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
            return q14.E(a0, b0, c1, e74.a, va4.a, new q14.h() { // from class: com.p7700g.p99005.cb4
                @Override // com.p7700g.p99005.q14.h
                public final boolean a(Object obj, Object obj2, int i3) {
                    return dc4.t3(numArr, iArr, (yb4) obj, (yb4) obj2, i3);
                }
            }, q14.y(i, Z1, u2), q14.x(i, Z1, u2), new m14.g() { // from class: com.p7700g.p99005.za4
                @Override // com.p7700g.p99005.m14.g
                public final Object a(Object obj, int i3) {
                    return dc4.w3(numArr, (cc4) obj, i3);
                }
            });
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    /* renamed from: V */
    public yb4 e1() {
        return a0().p3(b0());
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Iterator<dc4> V2(int i) {
        return super.V2(i);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: X */
    public dc4 c(j14 j14Var, j14 j14Var2) {
        return new dc4(j14Var, j14Var2);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: X0 */
    public dc4[] n(j14 j14Var, j14 j14Var2) {
        return new dc4[]{c(j14Var, j14Var2)};
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: X2 */
    public yb4 a0() {
        return (yb4) super.a0();
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.l24
    public Integer X3() {
        int b3 = b3();
        int N6 = a0().N6();
        int N62 = b0().N6();
        int A0 = A0();
        if (b3 == A0) {
            if (N6 == N62) {
                return bc4.b(b3);
            }
            return null;
        }
        int i = A0 - b3;
        if ((N6 >>> i) == (N62 >>> i)) {
            return bc4.b(b3);
        }
        return null;
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: Z */
    public dc4[] f() {
        return y;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.l24
    public int b3() {
        int numberOfTrailingZeros;
        int A0 = A0();
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(a0().N6());
        return (numberOfTrailingZeros2 == 0 || (numberOfTrailingZeros = Integer.numberOfTrailingZeros(~b0().N6())) == 0) ? A0 : A0 - Math.min(numberOfTrailingZeros2, numberOfTrailingZeros);
    }

    public long d1() {
        return (b0().X6() - a0().X6()) + 1;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: d3 */
    public yb4 b0() {
        return (yb4) super.b0();
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<yb4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.l24
    public BigInteger h1(int i) {
        return BigInteger.valueOf(D1(i));
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: i3 */
    public dc4 A(q14 q14Var) {
        return (dc4) super.A(q14Var);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<yb4> iterator() {
        yb4 a0 = a0();
        yb4 b0 = b0();
        ac4.a c1 = c1();
        if (!z3()) {
            return q14.D(a0, c1);
        }
        int V0 = a0.V0();
        return q14.E(a0, b0, c1, e74.a, pa4.a, qa4.a, V0 - 1, V0, null);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public Stream<dc4> j2(int i) {
        return StreamSupport.stream(s2(i), false);
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: j3 */
    public dc4 G(q14 q14Var) {
        return (dc4) super.G(q14Var);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public v44<dc4, yb4> l3(final int i) {
        if (i >= 0) {
            yb4 a0 = a0();
            int u2 = a0.u2();
            int Z1 = a0.Z1();
            final ac4.a c1 = c1();
            final Integer b = bc4.b(i);
            final int y2 = q14.y(b.intValue(), Z1, u2);
            final int x2 = q14.x(b.intValue(), Z1, u2);
            return q14.p(this, new Predicate() { // from class: com.p7700g.p99005.ua4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return dc4.G3(ac4.a.this, y2, x2, b, (q14.g) obj);
                }
            }, new q14.f() { // from class: com.p7700g.p99005.sa4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z, boolean z2, Object obj) {
                    return dc4.x3(i, z, z2, (dc4) obj);
                }
            }, new ToLongFunction() { // from class: com.p7700g.p99005.ra4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return dc4.C3(i, (dc4) obj);
                }
            });
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    /* renamed from: n4 */
    public yb4[] i1() {
        return a0().p5(b0());
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    /* renamed from: p4 */
    public yb4[] Q0() {
        return a0().r5(b0());
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: q4 */
    public dc4[] R(q14 q14Var) {
        return (dc4[]) super.R(q14Var);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24
    public x44<dc4> s2(final int i) {
        if (i >= 0) {
            yb4 a0 = a0();
            int u2 = a0.u2();
            int Z1 = a0.Z1();
            final ac4.a c1 = c1();
            final Integer b = bc4.b(i);
            final int y2 = q14.y(b.intValue(), Z1, u2);
            final int x2 = q14.x(b.intValue(), Z1, u2);
            return q14.i(this, new Predicate() { // from class: com.p7700g.p99005.bb4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return dc4.N3(ac4.a.this, y2, x2, b, (q14.g) obj);
                }
            }, new q14.f() { // from class: com.p7700g.p99005.ta4
                @Override // com.p7700g.p99005.g24.d
                public final Iterator a(boolean z, boolean z2, Object obj) {
                    return dc4.S3(i, z, z2, (dc4) obj);
                }
            }, new ToLongFunction() { // from class: com.p7700g.p99005.ab4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return dc4.U3(i, (dc4) obj);
                }
            });
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<yb4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.q14
    public BigInteger u() {
        return BigInteger.valueOf(d1());
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: w0 */
    public dc4[] g(j14 j14Var, j14 j14Var2, j14 j14Var3, j14 j14Var4) {
        return new dc4[]{c(j14Var, j14Var2), c(j14Var3, j14Var4)};
    }

    public String w4(Function<yb4, String> function, String str, Function<yb4, String> function2) {
        return function.apply(a0()) + str + function2.apply(b0());
    }

    @Override // com.p7700g.p99005.q14
    /* renamed from: x0 */
    public dc4[] m() {
        return new dc4[]{this};
    }

    @Override // com.p7700g.p99005.v24
    /* renamed from: x4 */
    public dc4 z2() {
        return this;
    }

    @Override // com.p7700g.p99005.q14, com.p7700g.p99005.v24, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public v44<dc4, yb4> spliterator() {
        final int V0 = a0().V0();
        final ac4.a c1 = c1();
        final int i = V0 - 1;
        return q14.p(this, new Predicate() { // from class: com.p7700g.p99005.ya4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return dc4.e4(ac4.a.this, i, V0, (q14.g) obj);
            }
        }, na4.a, fb4.a);
    }

    private dc4(j14 j14Var, j14 j14Var2) {
        super(j14Var, j14Var2);
    }
}