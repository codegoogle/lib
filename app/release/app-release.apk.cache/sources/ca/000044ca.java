package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.il4;
import com.p7700g.p99005.jl4;
import com.p7700g.p99005.n04;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: MACAddress.java */
/* loaded from: classes3.dex */
public class gl4 extends n04 implements Iterable<gl4> {
    public static final int A0 = 64;
    public static final int B0 = 16;
    public static final int C0 = 255;
    public static final int D0 = 65535;
    public static final int E0 = 3;
    public static final int F0 = 24;
    private static final long O = 4;
    public static final char P = ':';
    public static final char Q = '-';
    public static final char R = ' ';
    public static final char S = '.';
    public static final char T = '|';
    public static final String U = String.valueOf((char) T);
    public static final int V = 8;
    public static final int W = 1;
    public static final int X = 6;
    public static final int Y = 48;
    public static final int Z = 3;
    public static final int u0 = 4;
    public static final int v0 = 16;
    public static final int w0 = 2;
    public static final int x0 = 6;
    public static final int y0 = 8;
    public static final int z0 = 48;
    public transient jl4.c G0;

    public gl4(final kl4[] kl4VarArr) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.bj4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 j3;
                j3 = ((gl4) ((n04) obj)).w0().j3(kl4VarArr, r2.length == 8);
                return j3;
            }
        });
        int length = kl4VarArr.length;
        if (length != 6 && length != 8) {
            throw new c14("ipaddress.error.mac.invalid.segment.count", length);
        }
    }

    private gl4 D1(boolean z) {
        return O0().e5(this, z);
    }

    private gl4 X(jl4 jl4Var) {
        return jl4Var == O0() ? this : w0().H(jl4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jl4 Z(gl4 gl4Var, byte[] bArr) {
        int length = bArr.length;
        int i = 6;
        if (length < 8) {
            if (length > 6) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (bArr[i2] != 0) {
                        break;
                    }
                    length--;
                    if (length <= 6) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return gl4Var.w0().D1(bArr, 0, i, i != 8);
        }
        i = 8;
        return gl4Var.w0().D1(bArr, 0, i, i != 8);
    }

    public static String n(String str) {
        return n04.n(str);
    }

    public static int p4() {
        return 255;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return O0().A0();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<gl4> B0() {
        return O0().Q6(this, w0(), false);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: B4 */
    public gl4 c0() {
        return X(O0().c0());
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: C3 */
    public gl4 t(long j) {
        return X(O0().g0(j));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: D4 */
    public gl4 k0() {
        return this;
    }

    public boolean E3() {
        return O0().H0();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: E4 */
    public gl4 s0() {
        return X(O0().s0());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<gl4> F0() {
        return O0().Q6(this, w0(), true);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: F4 */
    public gl4 h0(int i) {
        return X(O0().h0(i));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<gl4> G0() {
        return O0().S6(this, w0(), true);
    }

    public boolean G3(boolean z) {
        if (I3()) {
            jl4 O0 = O0();
            kl4 D02 = O0.D0(3);
            kl4 D03 = O0.D0(4);
            if (D02.s3(255)) {
                return D03.s3(z ? 255 : 254);
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: G4 */
    public gl4 o0(int i, boolean z) {
        return X(O0().o0(i, z));
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: H4 */
    public v14 N() {
        if (this.N == null) {
            this.N = new v14(this);
        }
        return (v14) this.N;
    }

    public boolean I3() {
        return O0().F5();
    }

    public String I4() {
        return E0();
    }

    public String J4() {
        return U0();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<gl4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    public String K4() throws t14 {
        return O0().l7();
    }

    public gl4 L4(boolean z) {
        if (!I3()) {
            il4.a w02 = w0();
            kl4[] d = w02.d(8);
            jl4 O0 = O0();
            O0.m3(0, 3, d, 0);
            kl4 b = w02.b(255);
            d[3] = b;
            if (!z) {
                b = w02.b(254);
            }
            d[4] = b;
            O0.m3(3, 6, d, 5);
            Integer L0 = L0();
            if (L0 != null) {
                jl4 w3 = w02.w3(d, true);
                if (L0.intValue() >= 24) {
                    L0 = Integer.valueOf(L0.intValue() + 16);
                }
                w3.U4(L0);
            }
            return w02.I(d);
        }
        jl4 O02 = O0();
        kl4 D02 = O02.D0(3);
        kl4 D03 = O02.D0(4);
        if (D02.s3(255)) {
            if (D03.s3(z ? 255 : 254)) {
                return this;
            }
        }
        throw new t14(this, "ipaddress.mac.error.not.eui.convertible");
    }

    public qi4 M4() {
        return c1().u().P4(this);
    }

    public boolean N3() {
        return !y();
    }

    public ni4 N4() {
        pi4 c1 = c1();
        return c1.u().Q(c1.x0().J7(M4()));
    }

    public String O4(f34.n nVar) {
        return O0().q7(nVar);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<gl4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    public gl4 P4() {
        return X(O0().s7());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Q */
    public gl4 r0(boolean z) {
        return X(O0().r0(z));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Q4 */
    public gl4 i0() {
        return X(O0().i0());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: R */
    public gl4 q0(boolean z, boolean z2) {
        return X(O0().q0(z, z2));
    }

    @Override // com.p7700g.p99005.z04
    public v44<gl4, kl4[]> R0() {
        return O0().e7(this, w0());
    }

    public String R4() {
        return O0().v7();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: S */
    public gl4 j0(int i) {
        return X(O0().j0(i));
    }

    @Override // com.p7700g.p99005.z04
    public Stream<kl4[]> S0() {
        return StreamSupport.stream(R0(), false);
    }

    public boolean S3() {
        return !x();
    }

    public long S4() {
        return O0().w7();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: T */
    public gl4 u0(int i, boolean z) {
        return X(O0().u0(i, z));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: T4 */
    public gl4 t0() {
        return v0(false);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: U */
    public gl4 p0(int i) {
        return X(O0().p0(i));
    }

    public void V(e14 e14Var) {
        if (this.N instanceof v14) {
            this.N = e14Var;
        }
    }

    @Override // com.p7700g.p99005.z04
    public Iterator<kl4[]> W0() {
        return O0().W0();
    }

    public f34 X0() {
        return O0().a5();
    }

    @Override // com.p7700g.p99005.q04
    /* renamed from: X2 */
    public il4 m0() {
        return n04.i();
    }

    @Override // com.p7700g.p99005.z04
    public int Z1() {
        return 1;
    }

    public pi4 c1() {
        return n04.h();
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: d1 */
    public gl4 m() {
        return D1(true);
    }

    public jl4 d3() {
        return O0().j5();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<gl4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.z04
    public int g1() {
        return 255;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.l24
    public int g3() {
        return O0().g3();
    }

    public jl4 i3() {
        return O0().l5();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<gl4> iterator() {
        return O0().G5(this, w0());
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04
    /* renamed from: j3 */
    public jl4 O0() {
        return (jl4) super.O0();
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: k3 */
    public jl4 z0(int i) {
        return O0().z0(i);
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: n3 */
    public jl4 J0(int i, int i2) {
        return O0().J0(i, i2);
    }

    public long n4() {
        return O0().P6();
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: p3 */
    public kl4 D0(int i) {
        return O0().D0(i);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: q4 */
    public gl4 n0() {
        return v0(true);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<gl4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: t3 */
    public kl4[] N0() {
        return O0().N0();
    }

    @Override // com.p7700g.p99005.n04
    public String toString() {
        return E0();
    }

    @Override // com.p7700g.p99005.n04
    public boolean u(e14 e14Var) {
        e14 e14Var2 = this.N;
        if (e14Var2 == null || !(e14Var instanceof v14)) {
            return false;
        }
        v14 v14Var = (v14) e14Var2;
        v14 v14Var2 = (v14) e14Var;
        return v14Var == v14Var2 || (v14Var.toString().equals(v14Var2.toString()) && v14Var.f() == v14Var2.f());
    }

    @Override // com.p7700g.p99005.z04
    public int u2() {
        return 8;
    }

    public il4.a w0() {
        return m0().g();
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: w3 */
    public gl4 o() {
        return D1(false);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: w4 */
    public gl4 v0(boolean z) {
        return X(O0().v0(z));
    }

    @Override // com.p7700g.p99005.n04
    public boolean x() {
        return D0(0).J3(2, 2);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    /* renamed from: x0 */
    public kl4 e0(int i) {
        return D0(i);
    }

    @Override // com.p7700g.p99005.n04
    /* renamed from: x3 */
    public gl4 p(long j) {
        return X(O0().l0(j));
    }

    public gl4 x4(int i, int i2, gl4 gl4Var, int i3) {
        return X(O0().X6(i, i2, gl4Var.O0(), i3, (i2 - i) + i3));
    }

    @Override // com.p7700g.p99005.n04
    public boolean y() {
        return D0(0).J3(1, 1);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<gl4> y0() {
        return O0().S6(this, w0(), false);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: y4 */
    public gl4 d0(boolean z) {
        return X(O0().d0(z));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<gl4> spliterator() {
        return O0().i7(this, w0());
    }

    public gl4(jl4 jl4Var) throws c14 {
        super(jl4Var);
        int V0 = jl4Var.V0();
        if (V0 != 6 && V0 != 8) {
            throw new c14("ipaddress.error.mac.invalid.segment.count", V0);
        }
        if (jl4Var.L != 0) {
            throw new t04(jl4Var.L);
        }
    }

    public gl4(long j) throws c14 {
        this(j, false);
    }

    public gl4(NetworkInterface networkInterface) throws SocketException {
        this(networkInterface.getHardwareAddress());
    }

    public gl4(final long j, final boolean z) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.aj4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 x02;
                x02 = ((gl4) ((n04) obj)).w0().x0(j, 0, z);
                return x02;
            }
        });
    }

    public gl4(final byte[] bArr) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.zi4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 Z2;
                Z2 = gl4.Z((gl4) ((n04) obj), bArr);
                return Z2;
            }
        });
    }

    public gl4(final n04.b bVar, final n04.b bVar2, final boolean z) {
        super(new Function() { // from class: com.p7700g.p99005.yi4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 c1;
                c1 = ((gl4) ((n04) obj)).w0().c1(n04.b.this, bVar2, 0, z);
                return c1;
            }
        });
    }

    public gl4(n04.b bVar, n04.b bVar2) {
        this(bVar, bVar2, false);
    }

    public gl4(n04.b bVar, boolean z) throws c14 {
        this(bVar, bVar, z);
    }

    public gl4(n04.b bVar) {
        this(bVar, false);
    }
}