package com.p7700g.p99005;

import com.p7700g.p99005.f24;
import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.il4;
import com.p7700g.p99005.jl4;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: MACAddressSegment.java */
/* loaded from: classes3.dex */
public class kl4 extends e34 implements x04, Iterable<kl4> {
    private static final long G = 4;
    public static final int H = 2;
    private final int I;
    private final int J;

    public kl4(int i) {
        if (i >= 0 && i <= 255) {
            this.J = i;
            this.I = i;
            return;
        }
        throw new c14(i);
    }

    private kl4 l5(boolean z) {
        if (z3()) {
            return o5().b(z ? B1() : h3());
        }
        return this;
    }

    private il4.a o5() {
        return m0().g();
    }

    public static int q5(int i, int i2, int i3) {
        return i | (i2 << i3);
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return 8;
    }

    public void A5(CharSequence charSequence, boolean z, int i, int i2, int i3, int i4) {
        if (this.B == null) {
            if (H0()) {
                this.B = n04.A;
            } else if (z && i3 == G4() && i4 == L4()) {
                this.B = charSequence.subSequence(i, i2).toString();
            }
        }
    }

    @Override // com.p7700g.p99005.x04
    public int B1() {
        return this.I;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean B3(int i) {
        return Q4(G4(), L4(), i);
    }

    public String B5(f34.n nVar) {
        g24.b<l34> t7 = jl4.t7(nVar);
        return t7.h(new StringBuilder(t7.b(this)), this).toString();
    }

    public kl4 C5(int i) {
        if (i >= 8 || r5(i)) {
            return this;
        }
        int B1 = B1();
        int h3 = h3();
        int i2 = (-1) << (8 - i);
        return o5().w0(B1 & i2, (~i2) | h3);
    }

    @Override // com.p7700g.p99005.q04
    public String E0() {
        return B5(jl4.d.f);
    }

    public Iterator<kl4> F1(int i) {
        return e34.U4(this, o5(), Integer.valueOf(i), true, true);
    }

    @Override // com.p7700g.p99005.f24
    public String G() {
        return n04.A;
    }

    @Override // com.p7700g.p99005.e34
    public long G4() {
        return B1();
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return 16;
    }

    @Override // com.p7700g.p99005.e34
    public long H4() {
        return c4();
    }

    @Override // com.p7700g.p99005.e34
    public long I4() {
        return 255L;
    }

    @Override // com.p7700g.p99005.x04
    public boolean J3(int i, int i2) {
        return super.Y4(i, i2);
    }

    @Override // com.p7700g.p99005.e34
    public long L4() {
        return h3();
    }

    @Override // com.p7700g.p99005.q04
    public String N1(boolean z) {
        return B5(z ? jl4.d.e : jl4.d.d);
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return 2;
    }

    @Override // com.p7700g.p99005.x04
    public boolean R1(x04 x04Var) {
        return (x04Var instanceof kl4) && x04Var.B1() >= this.I && x04Var.h3() <= this.J;
    }

    @Override // com.p7700g.p99005.x04
    public /* synthetic */ boolean T0(int i) {
        return w04.g(this, i);
    }

    public Iterator<kl4> V2(int i) {
        return e34.U4(this, o5(), Integer.valueOf(i), true, false);
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean Y2(int i) {
        return S4(G4(), L4(), i);
    }

    @Override // com.p7700g.p99005.x04
    public int c4() {
        return (h3() - B1()) + 1;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.k34
    public boolean d(int i) {
        return h3() < i;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof kl4) && ((kl4) obj).s5(this));
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<kl4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.x04
    public /* synthetic */ boolean f1(int i) {
        return w04.c(this, i);
    }

    @Override // com.p7700g.p99005.x04
    public boolean f2(x04 x04Var, int i) {
        if (i >= 0) {
            if (x04Var instanceof kl4) {
                kl4 kl4Var = (kl4) x04Var;
                int A0 = A0() - i;
                if (A0 <= 0) {
                    return s5(kl4Var);
                }
                return (kl4Var.B1() >>> A0) == (B1() >>> A0) && (kl4Var.h3() >>> A0) <= (h3() >>> A0);
            }
            return false;
        }
        throw new y14(i);
    }

    @Override // com.p7700g.p99005.x04
    public int g1() {
        return 255;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public int g3() {
        return 1;
    }

    @Override // com.p7700g.p99005.x04
    public int h3() {
        return this.J;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public int hashCode() {
        return q5(this.I, this.J, A0());
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<kl4> iterator() {
        return e34.U4(this, o5(), null, false, false);
    }

    public boolean j5(kl4 kl4Var) {
        return kl4Var.I >= this.I && kl4Var.J <= this.J;
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: k5 */
    public kl4 a0() {
        return l5(true);
    }

    @Override // com.p7700g.p99005.q04
    /* renamed from: m5 */
    public il4 m0() {
        return n04.i();
    }

    public int n5(int i) {
        return e34.J4(this, i);
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: p5 */
    public kl4 b0() {
        return l5(false);
    }

    public boolean r5(int i) {
        if (i < 8) {
            int i2 = (-1) << (8 - i);
            int B1 = B1();
            if (B1 != (B1 & i2)) {
                return false;
            }
            int h3 = h3();
            return h3 == ((~i2) | h3);
        }
        return true;
    }

    @Override // com.p7700g.p99005.x04
    public boolean s1(int i, int i2, int i3) {
        return super.Z4(i, i2, i3);
    }

    @Override // com.p7700g.p99005.x04
    public boolean s3(int i) {
        return super.X4(i);
    }

    public boolean s5(kl4 kl4Var) {
        return this.I == kl4Var.I && this.J == kl4Var.J;
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<kl4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    public kl4 v5() {
        if (z3()) {
            if (e34.R4(this)) {
                return this;
            }
            throw new t14(this, "ipaddress.error.reverseRange");
        }
        int i = this.I;
        int a5 = e34.a5((byte) i);
        return i == a5 ? this : o5().b(a5);
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: w5 */
    public kl4 d0(boolean z) {
        return v5();
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        return (f24Var instanceof kl4) && s5((kl4) f24Var);
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: x5 */
    public kl4 c0() {
        return this;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public byte[] y(boolean z) {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) (z ? B1() : h3());
        return bArr;
    }

    public kl4 y5(Integer num, Integer num2, boolean z) {
        return (kl4) e34.d5(this, num, num2, z, o5());
    }

    public void z5(CharSequence charSequence, boolean z, int i, int i2, int i3) {
        if (this.B == null && z && i3 == G4()) {
            this.B = charSequence.subSequence(i, i2).toString();
        }
    }

    @Override // com.p7700g.p99005.x04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<kl4> spliterator() {
        final il4.a o5 = o5();
        final int A0 = A0();
        return f24.u(this, B1(), h3(), new Supplier() { // from class: com.p7700g.p99005.wi4
            @Override // java.util.function.Supplier
            public final Object get() {
                return kl4.this.iterator();
            }
        }, new f24.a() { // from class: com.p7700g.p99005.zk4
            @Override // com.p7700g.p99005.f24.a
            public final Iterator a(boolean z, boolean z2, int i, int i2) {
                Iterator T4;
                T4 = e34.T4(null, i, i2, A0, o5, null, false, false);
                return T4;
            }
        }, new f24.b() { // from class: com.p7700g.p99005.yk4
            @Override // com.p7700g.p99005.f24.b
            public final x04 a(int i, int i2) {
                kl4 c;
                c = il4.a.this.c(i, i2, null);
                return c;
            }
        });
    }

    public kl4(int i, int i2) {
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        if (i >= 0 && i2 >= 0 && i2 <= 255) {
            this.I = i;
            this.J = i2;
            return;
        }
        throw new c14(i < 0 ? i : i2);
    }
}