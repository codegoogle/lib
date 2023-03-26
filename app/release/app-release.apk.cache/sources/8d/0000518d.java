package com.p7700g.p99005;

import com.p7700g.p99005.e34;
import com.p7700g.p99005.f24;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l14;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.w64;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* compiled from: IPAddressSegment.java */
/* loaded from: classes3.dex */
public abstract class n14 extends h34 implements x04 {
    private static final long K = 4;
    private final int L;
    private final int M;

    public n14(int i) {
        if (i >= 0) {
            this.M = i;
            this.L = i;
            return;
        }
        throw new c14(i);
    }

    public static Integer E5(int i, Integer num, int i2) {
        return m14.x3(i, num, i2);
    }

    public static int G5(int i, int i2, int i3) {
        return i | (i2 << i3);
    }

    public static int I5(int i) {
        return i >> 8;
    }

    public static /* synthetic */ n14 S5(l14.c cVar, int i, int i2, Integer num, int i3, int i4) {
        return (n14) cVar.c(i3 << i, (i4 << i) | i2, num);
    }

    public static /* synthetic */ Iterator T5(int i, int i2, int i3, int i4, int i5, l14.c cVar, Integer num, boolean z, boolean z2, int i6, int i7) {
        if (!z && !z2) {
            return e34.T4(null, i6 << i2, i7 << i2, i5, cVar, num, true, true);
        }
        return e34.T4(null, z ? i : i6 << i2, z2 ? i3 : (i7 << i2) | i4, i5, cVar, num, true, false);
    }

    public static /* synthetic */ n14 U5(int i, int i2, int i3, int i4, int i5, int i6, l14.c cVar, int i7, int i8, int i9) {
        if (i8 != i) {
            i2 = i8 << i3;
        }
        if (i9 != i4) {
            i5 = (i9 << i3) | i6;
        }
        return (n14) cVar.c(i2, i5, Integer.valueOf(i7));
    }

    public static w64.j W4(long j, long j2, long j3, long j4) {
        return e34.W4(j, j2, j3, j4);
    }

    public static int W5(int i) {
        return i & 255;
    }

    public static <S extends n14> x44<S> a6(S s, int i, final l14.c<?, ?, ?, S, ?> cVar, Supplier<Iterator<S>> supplier) {
        final int A0 = s.A0();
        final int i2 = A0 - i;
        final int i3 = i2 > 0 ? ~((-1) << i2) : 0;
        final Integer b = m14.b(i);
        final int i4 = i3;
        return f24.u(s, s.B1() >>> i2, s.h3() >>> i2, supplier, new f24.a() { // from class: com.p7700g.p99005.yz3
            @Override // com.p7700g.p99005.f24.a
            public final Iterator a(boolean z, boolean z2, int i5, int i6) {
                Iterator T4;
                T4 = e34.T4(null, i5 << r0, (i6 << i2) | i4, A0, cVar, b, true, true);
                return T4;
            }
        }, new f24.b() { // from class: com.p7700g.p99005.a04
            @Override // com.p7700g.p99005.f24.b
            public final x04 a(int i5, int i6) {
                return n14.S5(l14.c.this, i2, i3, b, i5, i6);
            }
        });
    }

    public static <S extends n14> x44<S> e6(S s, final int i, final l14.c<?, ?, ?, S, ?> cVar, Supplier<Iterator<S>> supplier) {
        final int A0 = s.A0();
        final int i2 = A0 - i;
        final int i3 = i2 > 0 ? ~((-1) << i2) : 0;
        final int B1 = s.B1();
        final int h3 = s.h3();
        final int i4 = B1 >>> i2;
        final int i5 = h3 >>> i2;
        final Integer b = m14.b(i);
        final int i6 = i3;
        return f24.u(s, i4, i5, supplier, new f24.a() { // from class: com.p7700g.p99005.b04
            @Override // com.p7700g.p99005.f24.a
            public final Iterator a(boolean z, boolean z2, int i7, int i8) {
                return n14.T5(B1, i2, h3, i6, A0, cVar, b, z, z2, i7, i8);
            }
        }, new f24.b() { // from class: com.p7700g.p99005.zz3
            @Override // com.p7700g.p99005.f24.b
            public final x04 a(int i7, int i8) {
                return n14.U5(i4, B1, i2, i5, h3, i3, cVar, i, i7, i8);
            }
        });
    }

    public static <S extends n14> S f6(S s, boolean z, s04.a<S> aVar) {
        if (s.C0()) {
            int B1 = s.B1();
            int h3 = s.h3();
            if (z) {
                int C5 = s.C5(s.D5().intValue());
                long j = C5;
                w64.j W4 = W4(s.G4(), s.L4(), j, s.I4());
                if (W4.M0()) {
                    return aVar.c((int) W4.a(B1, j), (int) W4.b(h3, j), null);
                }
                throw new t14(s, C5, "ipaddress.error.maskMismatch");
            }
            return aVar.c(B1, h3, null);
        }
        return s;
    }

    public static int u5(j14.b bVar) {
        return bVar.f() ? 8 : 16;
    }

    public static StringBuilder u6(int i, int i2, StringBuilder sb) {
        return f24.N3(i, i2, 0, false, f24.x, sb);
    }

    public static int v5(j14.b bVar) {
        return bVar.f() ? 1 : 2;
    }

    public static int v6(int i, int i2) {
        return f24.e4(i, i2);
    }

    public static int w5(j14.b bVar) {
        return bVar.f() ? 10 : 16;
    }

    public static <S extends n14> S x6(S s, s04.a<S> aVar) {
        if (!s.C0()) {
            return s.V1() ? s : aVar.e(0, null);
        }
        int B1 = s.B1();
        int h3 = s.h3();
        Integer D5 = s.D5();
        int C5 = s.C5(D5.intValue());
        int i = B1 & C5;
        int i2 = C5 & h3;
        if (s.m0().i().f()) {
            return aVar.c(i, i2, null);
        }
        return (i == B1 && i2 == h3) ? s : aVar.c(i, i2, D5);
    }

    public static w64.c y4(long j, long j2, long j3, long j4) {
        return e34.y4(j, j2, j3, j4);
    }

    public static <S extends n14> S y5(S s, s04.a<S> aVar, boolean z) {
        boolean f = s.m0().i().f();
        if (s.z3() || (f && s.C0())) {
            return aVar.e(z ? s.B1() : s.h3(), f ? null : s.D5());
        }
        return s;
    }

    public static int z5(j14.b bVar) {
        return bVar.f() ? 255 : 65535;
    }

    public abstract Stream<? extends n14> A1(int i);

    public int A5() {
        Integer D5 = D5();
        if (D5 == null) {
            return c4();
        }
        return e34.J4(this, D5.intValue());
    }

    public abstract Iterator<? extends n14> B0();

    @Override // com.p7700g.p99005.x04
    public int B1() {
        return this.L;
    }

    public abstract int B5(int i);

    public abstract int C5(int i);

    public String D2(m14.e eVar) {
        g24.c<o34> n7 = m14.n7(eVar);
        return n7.h(new StringBuilder(n7.b(this)), this).toString();
    }

    public Integer D5() {
        return f();
    }

    @Override // com.p7700g.p99005.q04
    public String E0() {
        return D2(m14.d.i);
    }

    public abstract Iterator<? extends n14> F0();

    public abstract Iterator<? extends n14> F1(int i);

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: F5 */
    public abstract n14 b0();

    @Override // com.p7700g.p99005.f24
    public String G() {
        return n04.A;
    }

    public abstract x44<? extends n14> G0();

    @Override // com.p7700g.p99005.e34
    public long G4() {
        return B1();
    }

    @Override // com.p7700g.p99005.e34
    public long H4() {
        return c4();
    }

    public int H5() {
        return I5(B1());
    }

    @Override // com.p7700g.p99005.h34, com.p7700g.p99005.m34
    public boolean I0() {
        return (C0() && m0().i().f()) || super.I0();
    }

    @Override // com.p7700g.p99005.e34
    public long I4() {
        return g1();
    }

    @Override // com.p7700g.p99005.x04
    public boolean J3(int i, int i2) {
        return super.Y4(i, i2);
    }

    public boolean J5(int i, int i2, Integer num) throws t14 {
        return (B1() == i && h3() == i2 && (!C0() ? num != null : !D5().equals(num))) ? false : true;
    }

    public abstract Stream<? extends n14> K0();

    public boolean K5(Integer num, boolean z) {
        boolean z2 = num != null;
        if (!z2 || (num.intValue() >= 0 && num.intValue() <= A0())) {
            if (z) {
                if (C0()) {
                    return z2 && num.intValue() < D5().intValue();
                }
            } else if (C0()) {
                return (z2 && num.intValue() == D5().intValue()) ? false : true;
            }
            return z2;
        }
        throw new y14(this, num.intValue());
    }

    @Override // com.p7700g.p99005.e34
    public long L4() {
        return h3();
    }

    public boolean L5(Integer num) {
        boolean z = num != null;
        if (z && (num.intValue() < 0 || num.intValue() > A0())) {
            throw new y14(this, num.intValue());
        }
        if (C0()) {
            return true;
        }
        int B5 = !z ? 0 : B5(num.intValue());
        int B1 = B1();
        int h3 = h3();
        return (B1 == (B1 & B5) && h3 == (B5 & h3)) ? false : true;
    }

    public boolean M5() {
        return false;
    }

    @Override // com.p7700g.p99005.q04
    public String N1(boolean z) {
        return D2(z ? m14.d.e : m14.d.d);
    }

    public boolean N5() {
        return false;
    }

    public boolean O5(Integer num, boolean z) {
        boolean z2 = num != null;
        if (z2 && (num.intValue() < 0 || num.intValue() > A0())) {
            throw new y14(this, num.intValue());
        }
        if ((z & z2) == C0() && z2 && num == f()) {
            return !B3(num.intValue());
        }
        return true;
    }

    public abstract Stream<? extends n14> P0();

    public boolean P5(int i) {
        return (C0() && i == f().intValue() && B3(i)) ? false : true;
    }

    public boolean Q5(x04 x04Var) {
        return B1() == x04Var.B1() && h3() == x04Var.h3();
    }

    @Override // com.p7700g.p99005.x04
    public /* synthetic */ boolean T0(int i) {
        return w04.g(this, i);
    }

    public int V5() {
        return W5(B1());
    }

    public e34.g X5(int i) {
        long B1 = B1();
        long h3 = h3();
        long j = i;
        return new e34.g(B1, h3, j, e34.W4(B1, h3, j, g1()));
    }

    public boolean Y5(int i, Integer num) {
        return super.p5(i, num);
    }

    public abstract j14.b Z0();

    public abstract x44<? extends n14> Z5(int i);

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public int b3() {
        if (m0().i().f() && C0() && D5().intValue() == 0) {
            return 0;
        }
        return super.b3();
    }

    public boolean b6(n14 n14Var) {
        Integer D5 = D5();
        if (D5 == null) {
            return equals(n14Var);
        }
        return c6(n14Var, D5.intValue());
    }

    @Override // com.p7700g.p99005.x04
    public int c4() {
        return (h3() - B1()) + 1;
    }

    public boolean c6(n14 n14Var, int i) {
        if (i >= 0) {
            int A0 = A0() - i;
            if (A0 <= 0) {
                return R1(n14Var);
            }
            return (n14Var.B1() >>> A0) >= (B1() >>> A0) && (n14Var.h3() >>> A0) <= (h3() >>> A0);
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.k34
    public boolean d(int i) {
        return h3() < i;
    }

    public boolean d6(n14 n14Var) {
        Integer D5 = D5();
        if (D5 == null) {
            return equals(n14Var);
        }
        return f2(n14Var, D5.intValue());
    }

    public abstract Iterable<? extends n14> f0();

    @Override // com.p7700g.p99005.x04
    public /* synthetic */ boolean f1(int i) {
        return w04.c(this, i);
    }

    public boolean f2(x04 x04Var, int i) {
        if (i >= 0) {
            int A0 = A0() - i;
            if (A0 <= 0) {
                return Q5(x04Var);
            }
            return (x04Var.B1() >>> A0) == (B1() >>> A0) && (x04Var.h3() >>> A0) == (h3() >>> A0);
        }
        throw new y14(i);
    }

    @Deprecated
    public abstract n14 g6();

    @Override // com.p7700g.p99005.x04
    public int h3() {
        return this.M;
    }

    @Deprecated
    public abstract n14 h6(boolean z);

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public int hashCode() {
        return G5(B1(), h3(), A0());
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: i6 */
    public abstract n14 d0(boolean z);

    public abstract Iterator<? extends n14> iterator();

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: j6 */
    public abstract n14 c0();

    @Override // com.p7700g.p99005.h34
    public long k5(int i) {
        return B5(i);
    }

    public void k6(CharSequence charSequence, boolean z, int i, int i2, int i3) {
        if (this.I == null && z && i3 == G4()) {
            this.I = charSequence.subSequence(i, i2).toString();
        }
    }

    @Override // com.p7700g.p99005.h34
    public long l5(int i) {
        return C5(i);
    }

    public void l6(CharSequence charSequence, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
        if (this.I == null) {
            if (b1()) {
                if (z && i4 == G4()) {
                    this.I = charSequence.subSequence(i, i2).toString();
                }
            } else if (H0()) {
                this.I = n04.A;
            } else if (z2 && i4 == G4()) {
                long L4 = L4();
                if (C0()) {
                    L4 &= l5(f().intValue());
                }
                if (i5 == L4) {
                    this.I = charSequence.subSequence(i, i3).toString();
                }
            }
        }
    }

    @Override // com.p7700g.p99005.q04
    public abstract l14<?, ?, ?, ?, ?> m0();

    public void m6(CharSequence charSequence, boolean z, int i, int i2, int i3) {
        if (this.B == null && z) {
            long j = i3;
            if (j == G4() && j == L4()) {
                this.B = charSequence.subSequence(i, i2).toString();
            }
        }
    }

    public void n6(CharSequence charSequence, boolean z, int i, int i2, int i3, int i4) {
        if (this.B == null) {
            if (H0()) {
                this.B = n04.A;
            } else if (z && i3 == G4() && i4 == L4()) {
                this.B = charSequence.subSequence(i, i2).toString();
            }
        }
    }

    public abstract n14 o6(Integer num);

    public <S extends n14> S p6(Integer num, s04.a<S> aVar) {
        int B5 = num == null ? 0 : B5(num.intValue());
        int B1 = B1() & B5;
        int h3 = B5 & h3();
        if (B1 != h3) {
            return aVar.c(B1, h3, null);
        }
        return aVar.b(B1);
    }

    public e34.f q5(int i) {
        long B1 = B1();
        long h3 = h3();
        long j = i;
        return new e34.f(B1, h3, j, e34.y4(B1, h3, j, g1()));
    }

    public n14 q6(Integer num) {
        return r6(num, true);
    }

    public boolean r5(int i, int i2, int i3) {
        return Q4(i, i2, i3);
    }

    public abstract n14 r6(Integer num, boolean z);

    @Override // com.p7700g.p99005.x04
    public boolean s1(int i, int i2, int i3) {
        return super.Z4(i, i2, i3);
    }

    @Override // com.p7700g.p99005.x04
    public boolean s3(int i) {
        return super.X4(i);
    }

    public boolean s5(x04 x04Var) {
        return x04Var.B1() >= B1() && x04Var.h3() <= h3();
    }

    public <S extends n14> S s6(Integer num, boolean z, s04.a<S> aVar) {
        int B1 = B1();
        int h3 = h3();
        if (num != null) {
            B1 &= C5(num.intValue());
            h3 |= B5(num.intValue());
        }
        boolean z2 = z & (num != null);
        if (B1 == h3) {
            return z2 ? aVar.e(B1, num) : aVar.b(B1);
        } else if (!z2) {
            return aVar.c(B1, h3, null);
        } else {
            return aVar.c(B1, h3, num);
        }
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract x44<? extends n14> spliterator();

    public abstract Stream<? extends n14> stream();

    public boolean t5(int i, int i2, int i3) {
        return S4(i, i2, i3);
    }

    public <S extends n14> S t6(Integer num, s04.a<S> aVar) {
        int B1 = B1();
        int h3 = h3();
        boolean z = num != null;
        if (B1 == h3) {
            return z ? aVar.e(B1, num) : aVar.b(B1);
        } else if (!z) {
            return aVar.c(B1, h3, null);
        } else {
            return aVar.c(B1, h3, num);
        }
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.l24
    public boolean v1() {
        return B1() == 0;
    }

    public abstract n14 w6();

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.l24
    public boolean x1() {
        return h3() == g1();
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: x5 */
    public abstract n14 a0();

    public abstract x44<? extends n14> y0();

    public abstract n14 y6();

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean z3() {
        return B1() != h3();
    }

    public n14(int i, Integer num) {
        this(i, i, num);
    }

    public n14(int i, int i2, Integer num) {
        super(num);
        if (i >= 0 && i2 >= 0) {
            if (i > i2) {
                i2 = i;
                i = i2;
            }
            Integer D5 = D5();
            if (D5 != null && D5.intValue() < A0() && m0().i().f()) {
                this.L = i & C5(D5.intValue());
                this.M = B5(D5.intValue()) | i2;
                return;
            }
            this.L = i;
            this.M = i2;
            return;
        }
        throw new c14(i < 0 ? i : i2);
    }
}