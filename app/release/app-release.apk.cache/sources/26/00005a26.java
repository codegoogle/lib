package com.p7700g.p99005;

import com.p7700g.p99005.f24;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.s04;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv6AddressSegment.java */
/* loaded from: classes3.dex */
public class ri4 extends n14 implements Iterable<ri4> {
    private static final long N = 4;
    public static final int O = 4;
    public static final int P = 4;

    public ri4(int i) throws c14 {
        super(i);
        if (i > 65535) {
            throw new c14(i);
        }
    }

    private <S extends x04> void D6(S[] sArr, int i, s04.a<S> aVar) {
        Integer D5 = D5();
        if (i >= 0 && i < sArr.length) {
            int I5 = n14.I5(B1());
            int I52 = n14.I5(h3());
            Integer E5 = n14.E5(8, D5, 0);
            if (I5 == I52) {
                sArr[i] = aVar.e(I5, E5);
            } else {
                sArr[i] = aVar.c(I5, I52, E5);
            }
        }
        int i2 = i + 1;
        if (i2 < 0 || i2 >= sArr.length) {
            return;
        }
        int W5 = n14.W5(B1());
        int W52 = n14.W5(h3());
        Integer E52 = n14.E5(8, D5, 1);
        if (W5 == W52) {
            sArr[i2] = aVar.e(W5, E52);
        } else {
            sArr[i2] = aVar.c(W5, W52, E52);
        }
    }

    public static StringBuilder u6(int i, int i2, StringBuilder sb) {
        return n14.u6(i, i2, sb);
    }

    public static int v6(int i, int i2) {
        return n14.v6(i, i2);
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return 16;
    }

    @Override // com.p7700g.p99005.n14
    public Stream<ri4> A1(int i) {
        return StreamSupport.stream(Z5(i), false);
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.q04
    /* renamed from: A6 */
    public pi4 m0() {
        return n04.h();
    }

    @Override // com.p7700g.p99005.n14
    public Iterator<ri4> B0() {
        return e34.U4(this, B6(), D5(), true, false);
    }

    @Override // com.p7700g.p99005.n14
    public int B5(int i) {
        return m0().L(i);
    }

    public pi4.a B6() {
        return m0().u();
    }

    @Override // com.p7700g.p99005.n14
    public int C5(int i) {
        return m0().M(i);
    }

    public <S extends x04> void C6(S[] sArr, int i, s04.a<S> aVar) {
        if (!z3()) {
            Integer D5 = D5();
            Integer E5 = n14.E5(8, D5, 0);
            Integer E52 = n14.E5(8, D5, 1);
            if (i >= 0 && i < sArr.length) {
                sArr[i] = aVar.e(H5(), E5);
            }
            int i2 = i + 1;
            if (i2 < 0 || i2 >= sArr.length) {
                return;
            }
            sArr[i2] = aVar.e(V5(), E52);
            return;
        }
        D6(sArr, i, aVar);
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: E6 */
    public ri4 b0() {
        return (ri4) n14.y5(this, B6(), false);
    }

    @Override // com.p7700g.p99005.n14
    public Iterator<ri4> F0() {
        return e34.U4(this, B6(), D5(), true, true);
    }

    @Override // com.p7700g.p99005.n14
    public Iterator<ri4> F1(int i) {
        if (i >= 0) {
            return e34.U4(this, B6(), qi4.b(i), true, true);
        }
        throw new y14(i);
    }

    public Iterator<ri4> F6() {
        return e34.N4(this);
    }

    @Override // com.p7700g.p99005.n14
    public x44<ri4> G0() {
        Integer D5 = D5();
        if (D5 == null) {
            return spliterator();
        }
        return Z5(D5.intValue());
    }

    public Iterator<ri4> G6(boolean z) {
        return e34.U4((z || !C0() || z3()) ? this : y6(), B6(), z ? D5() : null, false, false);
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return 16;
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.e34
    public long I4() {
        return av5.s;
    }

    @Override // com.p7700g.p99005.n14
    @Deprecated
    /* renamed from: J6 */
    public ri4 g6() {
        return h6(true);
    }

    @Override // com.p7700g.p99005.n14
    public Stream<ri4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    @Override // com.p7700g.p99005.e34
    public int K4() {
        int b3 = b3();
        int A0 = A0();
        if (b3 < A0 && Y2(b3) && b3 % 4 == 0) {
            return (A0 - b3) / 4;
        }
        return 0;
    }

    @Override // com.p7700g.p99005.n14
    @Deprecated
    /* renamed from: K6 */
    public ri4 h6(boolean z) {
        return (ri4) n14.f6(this, z, B6());
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: L6 */
    public ri4 i6(boolean z) {
        if (z3()) {
            if (e34.R4(this)) {
                return C0() ? (ri4) B6().c(B1(), h3(), null) : this;
            }
            throw new t14(this, "ipaddress.error.reverseRange");
        }
        pi4.a B6 = B6();
        int B1 = B1();
        int c5 = e34.c5((short) B1);
        if (z) {
            c5 = (c5 >>> 8) | ((c5 & 255) << 8);
        }
        return (B1 != c5 || C0()) ? (ri4) B6.b(c5) : this;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: M6 */
    public ri4 j6() {
        if (z3()) {
            if (e34.R4(this)) {
                return C0() ? (ri4) B6().c(B1(), h3(), null) : this;
            }
            throw new t14(this, "ipaddress.error.reverseRange");
        }
        pi4.a B6 = B6();
        int B1 = B1();
        int i = ((B1 & 255) << 8) | (B1 >>> 8);
        return (B1 != i || C0()) ? (ri4) B6.b(i) : this;
    }

    @Override // com.p7700g.p99005.n14
    public boolean N5() {
        return true;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: N6 */
    public ri4 o6(Integer num) {
        return L5(num) ? (ri4) super.p6(num, B6()) : this;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: O6 */
    public ri4 q6(Integer num) {
        return r6(num, true);
    }

    @Override // com.p7700g.p99005.n14
    public Stream<ri4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: P6 */
    public ri4 r6(Integer num, boolean z) {
        return O5(num, z) ? (ri4) super.s6(num, z, B6()) : this;
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return 4;
    }

    public ri4 Q6() {
        return B6().c(B1(), h3(), qi4.b(A0()));
    }

    @Override // com.p7700g.p99005.x04
    public boolean R1(x04 x04Var) {
        return this == x04Var || (s5(x04Var) && (x04Var instanceof ri4));
    }

    public ri4 R6(Integer num) {
        return K5(num, m0().i().f()) ? (ri4) super.t6(num, B6()) : this;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: S6 */
    public ri4 w6() {
        return (ri4) n14.x6(this, B6());
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: T6 */
    public ri4 y6() {
        return (ri4) n14.f6(this, false, B6());
    }

    @Override // com.p7700g.p99005.n14
    public j14.b Z0() {
        return j14.b.IPV6;
    }

    @Override // com.p7700g.p99005.n14
    public x44<ri4> Z5(int i) {
        return n14.a6(this, i, B6(), new Supplier() { // from class: com.p7700g.p99005.ki4
            @Override // java.util.function.Supplier
            public final Object get() {
                return ri4.this.F0();
            }
        });
    }

    @Override // com.p7700g.p99005.n14
    public boolean c6(n14 n14Var, int i) {
        return this == n14Var || (super.c6(n14Var, i) && (n14Var instanceof ri4));
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ri4) && ((ri4) obj).Q5(this));
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<ri4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04
    public boolean f2(x04 x04Var, int i) {
        return this == x04Var || (super.f2(x04Var, i) && (x04Var instanceof ri4));
    }

    @Override // com.p7700g.p99005.x04
    public int g1() {
        return n14.z5(j14.b.IPV6);
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public int g3() {
        return 2;
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<ri4> iterator() {
        return G6(!m0().i().f());
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<ri4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        return (f24Var instanceof ri4) && Q5((x04) f24Var);
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public byte[] y(boolean z) {
        int B1 = z ? B1() : h3();
        return new byte[]{(byte) (B1 >>> 8), (byte) (B1 & 255)};
    }

    @Override // com.p7700g.p99005.n14
    public x44<ri4> y0() {
        Integer D5 = D5();
        if (D5 == null) {
            return spliterator();
        }
        return n14.e6(this, D5.intValue(), B6(), new Supplier() { // from class: com.p7700g.p99005.th4
            @Override // java.util.function.Supplier
            public final Object get() {
                return ri4.this.B0();
            }
        });
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: z6 */
    public ri4 x5() {
        return (ri4) n14.y5(this, B6(), true);
    }

    public ri4(int i, Integer num) throws c14 {
        super(i, num);
        if (i <= 65535) {
            if (num != null && num.intValue() > 128) {
                throw new y14(num.intValue());
            }
            return;
        }
        throw new c14(i);
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<ri4> spliterator() {
        final pi4.a B6 = B6();
        final Integer D5 = m0().i().f() ? null : D5();
        final int A0 = A0();
        return f24.u(this, B1(), h3(), new Supplier() { // from class: com.p7700g.p99005.jc4
            @Override // java.util.function.Supplier
            public final Object get() {
                return ri4.this.iterator();
            }
        }, new f24.a() { // from class: com.p7700g.p99005.ug4
            @Override // com.p7700g.p99005.f24.a
            public final Iterator a(boolean z, boolean z2, int i, int i2) {
                Iterator T4;
                T4 = e34.T4(null, i, i2, A0, B6, D5, false, false);
                return T4;
            }
        }, new f24.b() { // from class: com.p7700g.p99005.vg4
            @Override // com.p7700g.p99005.f24.b
            public final x04 a(int i, int i2) {
                ri4 c;
                c = pi4.a.this.c(i, i2, D5);
                return c;
            }
        });
    }

    public ri4(int i, int i2, Integer num) throws c14 {
        super(i, i2, num);
        if (h3() <= 65535) {
            if (num != null && num.intValue() > 128) {
                throw new y14(num.intValue());
            }
            return;
        }
        throw new c14(h3());
    }
}