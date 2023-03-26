package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.f24;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.pi4;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv4AddressSegment.java */
/* loaded from: classes3.dex */
public class cc4 extends n14 implements Iterable<cc4> {
    private static final long N = 4;
    public static final int O = 3;

    public cc4(int i) throws c14 {
        super(i);
        if (i > 255) {
            throw new c14(i);
        }
    }

    public static Integer z6(int i, Integer num, Integer num2) {
        if (num2 == null) {
            return null;
        }
        return num2.intValue() == 0 ? num : bc4.b(num2.intValue() + i);
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return 8;
    }

    @Override // com.p7700g.p99005.n14
    public Stream<cc4> A1(int i) {
        return StreamSupport.stream(Z5(i), false);
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: A6 */
    public cc4 x5() {
        return (cc4) n14.y5(this, C6(), true);
    }

    @Override // com.p7700g.p99005.n14
    public Iterator<cc4> B0() {
        return e34.U4(this, C6(), D5(), true, false);
    }

    @Override // com.p7700g.p99005.n14
    public int B5(int i) {
        return m0().L(i);
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.q04
    /* renamed from: B6 */
    public ac4 m0() {
        return n04.g();
    }

    @Override // com.p7700g.p99005.n14
    public int C5(int i) {
        return m0().M(i);
    }

    public ac4.a C6() {
        return m0().u();
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: D6 */
    public cc4 b0() {
        return (cc4) n14.y5(this, C6(), false);
    }

    public Iterator<cc4> E6() {
        return e34.N4(this);
    }

    @Override // com.p7700g.p99005.n14
    public Iterator<cc4> F0() {
        return e34.U4(this, C6(), D5(), true, true);
    }

    @Override // com.p7700g.p99005.n14
    public Iterator<cc4> F1(int i) {
        if (i >= 0) {
            return e34.U4(this, C6(), bc4.b(i), true, true);
        }
        throw new y14(i);
    }

    public Iterator<cc4> F6(boolean z) {
        return e34.U4((z || !C0() || z3()) ? this : y6(), C6(), z ? D5() : null, false, false);
    }

    @Override // com.p7700g.p99005.n14
    public x44<cc4> G0() {
        Integer D5 = D5();
        if (D5 == null) {
            return spliterator();
        }
        return Z5(D5.intValue());
    }

    public ri4 G6(pi4.a aVar, cc4 cc4Var) throws t14 {
        Integer z6 = z6(8, D5(), cc4Var.D5());
        if (z3() && !cc4Var.H0()) {
            throw new t14(this, cc4Var, "ipaddress.error.invalidMixedRange");
        }
        return aVar.c((B1() << 8) | cc4Var.B1(), cc4Var.h3() | (h3() << 8), z6);
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return 10;
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.e34
    public long I4() {
        return 255L;
    }

    @Override // com.p7700g.p99005.n14
    @Deprecated
    /* renamed from: J6 */
    public cc4 g6() {
        return h6(true);
    }

    @Override // com.p7700g.p99005.n14
    public Stream<cc4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    @Override // com.p7700g.p99005.n14
    @Deprecated
    /* renamed from: K6 */
    public cc4 h6(boolean z) {
        return (cc4) n14.f6(this, z, C6());
    }

    public cc4 L6() {
        if (z3()) {
            if (e34.R4(this)) {
                return C0() ? (cc4) C6().c(B1(), h3(), null) : this;
            }
            throw new t14(this, "ipaddress.error.reverseRange");
        }
        int B1 = B1();
        int a5 = e34.a5((byte) B1);
        return (B1 != a5 || C0()) ? (cc4) C6().b(a5) : this;
    }

    @Override // com.p7700g.p99005.n14
    public boolean M5() {
        return true;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: M6 */
    public cc4 i6(boolean z) {
        return L6();
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: N6 */
    public cc4 j6() {
        return (cc4) n14.f6(this, false, C6());
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: O6 */
    public cc4 o6(Integer num) {
        return L5(num) ? (cc4) super.p6(num, C6()) : this;
    }

    @Override // com.p7700g.p99005.n14
    public Stream<cc4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: P6 */
    public cc4 q6(Integer num) {
        return r6(num, true);
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return 3;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: Q6 */
    public cc4 r6(Integer num, boolean z) {
        return O5(num, z) ? (cc4) super.s6(num, z, C6()) : this;
    }

    @Override // com.p7700g.p99005.x04
    public boolean R1(x04 x04Var) {
        return this == x04Var || (s5(x04Var) && (x04Var instanceof cc4));
    }

    public cc4 R6() {
        return C6().c(B1(), h3(), bc4.b(A0()));
    }

    public cc4 S6(Integer num) {
        return K5(num, m0().i().f()) ? (cc4) super.t6(num, C6()) : this;
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: T6 */
    public cc4 w6() {
        return (cc4) n14.x6(this, C6());
    }

    @Override // com.p7700g.p99005.n14
    /* renamed from: U6 */
    public cc4 y6() {
        return (cc4) n14.f6(this, false, C6());
    }

    @Override // com.p7700g.p99005.n14
    public j14.b Z0() {
        return j14.b.IPV4;
    }

    @Override // com.p7700g.p99005.n14
    public x44<cc4> Z5(int i) {
        return n14.a6(this, i, C6(), new Supplier() { // from class: com.p7700g.p99005.jb4
            @Override // java.util.function.Supplier
            public final Object get() {
                return cc4.this.F0();
            }
        });
    }

    @Override // com.p7700g.p99005.n14
    public boolean c6(n14 n14Var, int i) {
        return this == n14Var || (super.c6(n14Var, i) && (n14Var instanceof cc4));
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof cc4) && ((cc4) obj).Q5(this));
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<cc4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04
    public boolean f2(x04 x04Var, int i) {
        return this == x04Var || (super.f2(x04Var, i) && (x04Var instanceof cc4));
    }

    @Override // com.p7700g.p99005.x04
    public int g1() {
        return n14.z5(j14.b.IPV4);
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public int g3() {
        return 1;
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<cc4> iterator() {
        return F6(!m0().i().f());
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<cc4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        return (f24Var instanceof cc4) && Q5((x04) f24Var);
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public byte[] y(boolean z) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) (z ? B1() : h3());
        return bArr;
    }

    @Override // com.p7700g.p99005.n14
    public x44<cc4> y0() {
        Integer D5 = D5();
        if (D5 == null) {
            return spliterator();
        }
        return n14.e6(this, D5.intValue(), C6(), new Supplier() { // from class: com.p7700g.p99005.ob4
            @Override // java.util.function.Supplier
            public final Object get() {
                return cc4.this.B0();
            }
        });
    }

    public cc4(int i, Integer num) throws c14 {
        super(i, num);
        if (i <= 255) {
            if (num != null && num.intValue() > 32) {
                throw new y14(num.intValue());
            }
            return;
        }
        throw new c14(i);
    }

    @Override // com.p7700g.p99005.n14, com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<cc4> spliterator() {
        final ac4.a C6 = C6();
        final Integer D5 = m0().i().f() ? null : D5();
        final int A0 = A0();
        return f24.u(this, B1(), h3(), new Supplier() { // from class: com.p7700g.p99005.a74
            @Override // java.util.function.Supplier
            public final Object get() {
                return cc4.this.iterator();
            }
        }, new f24.a() { // from class: com.p7700g.p99005.la4
            @Override // com.p7700g.p99005.f24.a
            public final Iterator a(boolean z, boolean z2, int i, int i2) {
                Iterator T4;
                T4 = e34.T4(null, i, i2, A0, C6, D5, false, false);
                return T4;
            }
        }, new f24.b() { // from class: com.p7700g.p99005.ma4
            @Override // com.p7700g.p99005.f24.b
            public final x04 a(int i, int i2) {
                cc4 c;
                c = ac4.a.this.c(i, i2, D5);
                return c;
            }
        });
    }

    public cc4(int i, int i2, Integer num) throws c14 {
        super(i, i2, num);
        if (h3() <= 255) {
            if (num != null && num.intValue() > 32) {
                throw new y14(num.intValue());
            }
            return;
        }
        throw new c14(h3());
    }
}