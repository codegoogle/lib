package com.p7700g.p99005;

import com.p7700g.p99005.il4;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.qi4;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.s14;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.xbill.DNS.TTL;

/* compiled from: IPv6Address.java */
/* loaded from: classes3.dex */
public class ni4 extends j14 implements Iterable<ni4> {
    public static final int A0 = 2;
    public static final int B0 = 8;
    public static final int C0 = 2;
    public static final int D0 = 6;
    public static final int E0 = 16;
    public static final int F0 = 128;
    public static final int G0 = 16;
    public static final int H0 = 85;
    public static final int I0 = 65535;
    private static final long U = 4;
    public static final char V = ':';
    public static final char W = '%';
    public static final char X = 167;
    public static final char Y = '-';
    public static final char Z = 's';
    public static final char u0 = 187;
    public static final String v0 = String.valueOf((char) 187);
    public static final String w0 = ".ipv6-literal.net";
    public static final String x0 = ".ip6.arpa";
    public static final String y0 = ".ip6.int";
    public static final int z0 = 16;
    private final c J0;
    private transient qi4.i K0;
    public transient qi4.e L0;

    /* compiled from: IPv6Address.java */
    /* loaded from: classes3.dex */
    public class a extends pi4.a {
        private static final long z = 4;

        public a(pi4 pi4Var, pi4.a.C0226a c0226a) {
            super(pi4Var, c0226a);
        }

        @Override // com.p7700g.p99005.pi4.a, com.p7700g.p99005.l14.c
        /* renamed from: B4 */
        public ni4 Q(qi4 qi4Var) {
            return ni4.this.s6().D4(qi4Var, ni4.this.J0);
        }

        @Override // com.p7700g.p99005.pi4.a, com.p7700g.p99005.l14.c
        /* renamed from: K4 */
        public ni4 k3(ri4[] ri4VarArr) {
            return ni4.this.s6().G4(ri4VarArr, ni4.this.J0);
        }
    }

    /* compiled from: IPv6Address.java */
    /* loaded from: classes3.dex */
    public interface b {
        ni4 d(j14 j14Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ni4(qi4 qi4Var, CharSequence charSequence, boolean z) throws c14 {
        this(qi4Var, r2);
        c cVar;
        if (z) {
            cVar = k6(charSequence);
        } else {
            cVar = (charSequence == null || charSequence.length() <= 0) ? null : new c(charSequence.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ni4 D6(boolean z, boolean z2) {
        Object obj;
        qi4 O0 = O0();
        qi4 w8 = O0.w8(z, z2);
        if (w8 == O0) {
            return this;
        }
        ni4 ni4Var = null;
        if (w8 == null) {
            return null;
        }
        qi4.e eVar = this.L0;
        if (eVar != null) {
            if (z) {
                obj = z2 ? eVar.b : eVar.a;
            } else {
                obj = eVar.c;
            }
            ni4Var = (ni4) obj;
        }
        synchronized (this) {
            qi4.e eVar2 = this.L0;
            boolean z3 = true;
            boolean z4 = eVar2 == null;
            if (z4) {
                eVar2 = new qi4.e();
                this.L0 = eVar2;
            } else if (!z) {
                ni4Var = (ni4) eVar2.c;
                if (ni4Var == null) {
                    z4 = z3;
                }
                z3 = false;
                z4 = z3;
            } else if (z2) {
                ni4Var = (ni4) eVar2.b;
                if (ni4Var == null) {
                    z4 = z3;
                }
                z3 = false;
                z4 = z3;
            } else {
                ni4Var = (ni4) eVar2.a;
                if (ni4Var == null) {
                    z4 = z3;
                }
                z3 = false;
                z4 = z3;
            }
            if (z4) {
                ni4Var = r6().Q(w8);
                if (!z) {
                    eVar2.c = ni4Var;
                } else if (z2) {
                    eVar2.b = ni4Var;
                } else {
                    eVar2.a = ni4Var;
                }
            }
        }
        return ni4Var;
    }

    private static c R6(Inet6Address inet6Address) {
        NetworkInterface scopedInterface = inet6Address.getScopedInterface();
        if (scopedInterface != null) {
            return new c(scopedInterface);
        }
        int scopeId = inet6Address.getScopeId();
        if (scopeId != 0) {
            return new c(scopeId);
        }
        return null;
    }

    private String T6() {
        if (W6()) {
            return this.J0.i();
        }
        return null;
    }

    private boolean U6() {
        if (this.K0 == null) {
            synchronized (this) {
                if (this.K0 == null) {
                    if (W6()) {
                        this.K0 = new qi4.i();
                        return true;
                    }
                    qi4 O0 = O0();
                    boolean Z5 = O0.Z5();
                    this.K0 = O0.U5();
                    return Z5;
                }
                return false;
            }
        }
        return false;
    }

    public static ri4[] W7(ri4[] ri4VarArr, int i, jl4 jl4Var, int i2, boolean z, pi4.a aVar, il4.a aVar2, Integer num) throws t14 {
        kl4 kl4Var;
        int i3;
        int i4;
        kl4 kl4Var2;
        int i5;
        kl4 kl4Var3;
        int i6;
        kl4 kl4Var4;
        int i7;
        kl4 kl4Var5;
        int i8;
        kl4 kl4Var6;
        int i9;
        kl4 kl4Var7;
        int i10;
        int i11;
        int V0 = jl4Var.V0();
        if (i2 != 0 || V0 <= 0) {
            kl4Var = null;
            i3 = 0;
        } else {
            kl4Var = jl4Var.D0(0);
            i3 = 1;
        }
        if (i2 > 1 || i3 >= V0) {
            i4 = i3;
            kl4Var2 = null;
        } else {
            i4 = i3 + 1;
            kl4Var2 = jl4Var.D0(i3);
        }
        if (i2 > 2 || i4 >= V0) {
            i5 = i4;
            kl4Var3 = null;
        } else {
            i5 = i4 + 1;
            kl4Var3 = jl4Var.D0(i4);
        }
        if (i2 > 3 || i5 >= V0) {
            i6 = i5;
            kl4Var4 = null;
        } else {
            i6 = i5 + 1;
            kl4Var4 = jl4Var.D0(i5);
        }
        if (i2 > 4 || i6 >= V0) {
            i7 = i6;
            kl4Var5 = null;
        } else {
            i7 = i6 + 1;
            kl4Var5 = jl4Var.D0(i6);
        }
        if (i2 > 5 || i7 >= V0) {
            i8 = i7;
            kl4Var6 = null;
        } else {
            i8 = i7 + 1;
            kl4Var6 = jl4Var.D0(i7);
        }
        if (i2 > 6 || i8 >= V0) {
            i9 = i8;
            kl4Var7 = null;
        } else {
            i9 = i8 + 1;
            kl4Var7 = jl4Var.D0(i8);
        }
        kl4 D02 = (i2 > 7 || i9 >= V0) ? null : jl4Var.D0(i9);
        kl4 b2 = aVar2.b(0);
        kl4 b3 = aVar2.b(255);
        kl4 b4 = aVar2.b(254);
        Integer num2 = num != null ? 0 : null;
        boolean z2 = kl4Var != null;
        if (z2 || kl4Var2 != null) {
            if (!z2) {
                kl4Var = b2;
            } else if (kl4Var2 == null) {
                kl4Var2 = b2;
            }
            i10 = i + 1;
            ri4VarArr[i] = n7(aVar, kl4Var, kl4Var2, true, num2);
        } else {
            i10 = i;
        }
        if (z) {
            boolean z3 = kl4Var3 != null;
            if (z3 || kl4Var4 != null) {
                if (!z3) {
                    if (!kl4Var4.s3(255)) {
                        throw new t14(jl4Var, "ipaddress.mac.error.not.eui.convertible");
                    }
                    kl4Var3 = b2;
                }
                ri4VarArr[i10] = m7(aVar, kl4Var3, b3, num2);
                i10++;
            }
            boolean z4 = kl4Var5 != null;
            if (z4 || kl4Var6 != null) {
                if (z4) {
                    if (!kl4Var5.s3(254)) {
                        throw new t14(jl4Var, "ipaddress.mac.error.not.eui.convertible");
                    }
                    if (kl4Var6 == null) {
                        kl4Var6 = b2;
                    }
                }
                i11 = i10 + 1;
                ri4VarArr[i10] = m7(aVar, b4, kl4Var6, num2);
                i10 = i11;
            }
        } else {
            if (kl4Var3 != null) {
                ri4VarArr[i10] = m7(aVar, kl4Var3, b3, num2);
                i10++;
            }
            if (kl4Var4 != null) {
                ri4VarArr[i10] = m7(aVar, b4, kl4Var4, num2);
                i10++;
            }
            boolean z5 = kl4Var5 != null;
            if (z5 || kl4Var6 != null) {
                if (!z5) {
                    kl4Var5 = b2;
                } else if (kl4Var6 == null) {
                    kl4Var6 = b2;
                }
                i11 = i10 + 1;
                ri4VarArr[i10] = m7(aVar, kl4Var5, kl4Var6, num2);
                i10 = i11;
            }
        }
        boolean z6 = kl4Var7 != null;
        if (z6 || D02 != null) {
            if (!z6) {
                kl4Var7 = b2;
            } else if (D02 == null) {
                D02 = b2;
            }
            ri4VarArr[i10] = m7(aVar, kl4Var7, D02, num2);
        }
        return ri4VarArr;
    }

    private static qi4 X7(qi4 qi4Var, jl4 jl4Var, pi4.a aVar, il4.a aVar2) throws c14, t14 {
        boolean F5 = jl4Var.F5();
        if (jl4Var.L == 0) {
            if (qi4Var.W == 0) {
                if (qi4Var.V0() >= 4) {
                    if (jl4Var.V0() == (F5 ? 8 : 6)) {
                        ri4[] d = aVar.d(8);
                        qi4Var.m3(0, 4, d, 0);
                        Integer K3 = qi4Var.K3();
                        W7(d, 4, jl4Var, 0, jl4Var.F5(), aVar, aVar2, (K3 == null || K3.intValue() > 64) ? null : null);
                        return aVar.u(d);
                    }
                    throw new c14(jl4Var, "ipaddress.mac.error.not.eui.convertible");
                }
                throw new c14(qi4Var, "ipaddress.mac.error.not.eui.convertible");
            }
            throw new t04(qi4Var, qi4Var.W);
        }
        throw new t04(jl4Var, jl4Var.L);
    }

    public static String e8(pi4 pi4Var, n04.b bVar, n04.b bVar2, Integer num, CharSequence charSequence) {
        return j14.H5(pi4Var.i(), bVar, bVar2, num, 8, 2, 16, 65535, ':', 16, charSequence);
    }

    private boolean h7(ni4 ni4Var) {
        return Objects.equals(this.J0, ni4Var.J0);
    }

    private ni4 j6(qi4 qi4Var) {
        return qi4Var == O0() ? this : r6().Q(qi4Var);
    }

    public static c k6(CharSequence charSequence) throws c14 {
        if (charSequence == null) {
            return null;
        }
        String trim = charSequence.toString().trim();
        if (charSequence.length() == 0) {
            return null;
        }
        int i0 = z64.i0(trim);
        if (i0 < 0) {
            return new c(trim);
        }
        throw new c14("ipaddress.error.invalid.zone", i0);
    }

    private static ri4 m7(pi4.a aVar, kl4 kl4Var, kl4 kl4Var2, Integer num) {
        return n7(aVar, kl4Var, kl4Var2, false, num);
    }

    private static ri4 n7(pi4.a aVar, kl4 kl4Var, kl4 kl4Var2, boolean z, Integer num) {
        int B1 = kl4Var.B1();
        int h3 = kl4Var.h3();
        if (z) {
            if (!kl4Var.J3(B1 & 2, 2)) {
                throw new t14(kl4Var, "ipaddress.mac.error.not.eui.convertible");
            }
            B1 ^= 2;
            h3 ^= 2;
        }
        return aVar.c((B1 << 8) | kl4Var2.B1(), kl4Var2.h3() | (h3 << 8), num);
    }

    private yb4 p6(qi4.h hVar) {
        if (W6() || !hVar.a(65536)) {
            return null;
        }
        return hVar.s.c(this);
    }

    private j14[] q6(j14... j14VarArr) {
        int i = 1;
        j14[] j14VarArr2 = new j14[j14VarArr.length + 1];
        int i2 = 0;
        while (i2 < j14VarArr.length) {
            j14VarArr2[i] = n3(j14VarArr[i2]).E7();
            i2 = i;
            i++;
        }
        j14VarArr2[0] = E7();
        return j14VarArr2;
    }

    public static /* synthetic */ v04 t7(qi4 qi4Var, jl4 jl4Var, n04 n04Var) {
        ni4 ni4Var = (ni4) n04Var;
        return X7(qi4Var, jl4Var, ni4Var.s6(), ni4Var.E6().g());
    }

    private /* synthetic */ boolean u7(int i, ri4[] ri4VarArr) {
        return O0().gb(ri4VarArr, i);
    }

    @Override // com.p7700g.p99005.n04
    public boolean A(n04 n04Var) {
        return (n04Var instanceof ni4) && super.A(n04Var) && h7((ni4) n04Var);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return 128;
    }

    @Override // com.p7700g.p99005.v24
    public Stream<ni4> A1(int i) {
        return StreamSupport.stream(l3(i), false);
    }

    @Override // com.p7700g.p99005.j14
    public yb4 A5() {
        return j14.R.c(this);
    }

    public c A6() {
        return this.J0;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: A7 */
    public ni4[] b5(j14... j14VarArr) throws r04 {
        if (j14VarArr.length == 0 && M0()) {
            return new ni4[]{E7()};
        }
        j14[] j14VarArr2 = (j14[]) j14VarArr.clone();
        for (int i = 0; i < j14VarArr2.length; i++) {
            j14VarArr2[i] = n3(j14VarArr2[i]).E7();
        }
        List<p14> p4 = j14.p4(q6(j14VarArr2), s6());
        return (ni4[]) p4.toArray(new ni4[p4.size()]);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<ni4> B0() {
        return O0().Fb(this, r6(), false);
    }

    @Override // com.p7700g.p99005.j14
    public ni4 B5() {
        return this;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: B6 */
    public ni4 m() {
        return D6(true, false);
    }

    @Override // com.p7700g.p99005.v24
    /* renamed from: B7 */
    public x44<ni4> l3(int i) {
        return O0().Jb(this, r6(), true, i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: C6 */
    public ni4 e2() {
        return D6(true, true);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: C7 */
    public ni4 n0() {
        return v0(true);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String D2(m14.e eVar) {
        return O0().sc(eVar, T6());
    }

    @Override // com.p7700g.p99005.p14
    public String D3() {
        String str;
        if (U6() || (str = this.K0.q) == null) {
            if (W6()) {
                String yc = O0().yc(this.J0.i());
                this.K0.q = yc;
                return yc;
            }
            return O0().D3();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: D7 */
    public ni4 v0(boolean z) {
        return j6(O0().v0(z));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.q04
    public String E0() {
        String str;
        if (U6() || (str = this.K0.F) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.t);
                iVar.F = f8;
                return f8;
            }
            return O0().E0();
        }
        return str;
    }

    public il4 E6() {
        return n04.i();
    }

    public ni4 E7() {
        return W6() ? s6().Q(O0()) : this;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<ni4> F0() {
        return O0().Fb(this, r6(), true);
    }

    @Override // com.p7700g.p99005.v24
    public Iterator<ni4> F1(int i) {
        return O0().Gb(this, r6(), true, i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.q04
    /* renamed from: F6 */
    public pi4 m0() {
        return n04.h();
    }

    public ni4 F7(int i, int i2, ni4 ni4Var, int i3) {
        return j6(O0().Ob(i, i2, ni4Var.O0(), i3, (i2 - i) + i3));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<ni4> G0() {
        return O0().Ib(this, r6(), true);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String G1() {
        String str;
        if (U6() || (str = this.K0.j) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.x);
                iVar.j = f8;
                return f8;
            }
            return O0().G1();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: G6 */
    public ni4 q4() {
        return (ni4) super.P1();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: G7 */
    public ni4 g5(boolean z) {
        return r6().Q(O0().d0(z));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String H2() {
        return x2();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04
    public String H3() {
        String str;
        if (U6() || (str = this.K0.G) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.w);
                iVar.G = f8;
                return f8;
            }
            return O0().H3();
        }
        return str;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: H6 */
    public qi4 o2() {
        return O0().o2();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: H7 */
    public ni4 h5() {
        return j6(O0().c0());
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: I6 */
    public qi4 Q3(int i) throws y14 {
        return O0().Q3(i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: I7 */
    public ni4 k0() {
        return j6(O0().k0());
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: J6 */
    public qi4 A2(int i, boolean z) throws y14 {
        return O0().A2(i, z);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: J7 */
    public ni4 s0() {
        return j6(O0().s0());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<ni4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    @Override // com.p7700g.p99005.n04
    public boolean K2(n04 n04Var) {
        if (super.K2(n04Var)) {
            if (n04Var == this || !W6()) {
                return true;
            }
            return h7((ni4) n04Var);
        }
        return false;
    }

    @Override // com.p7700g.p99005.j14
    public boolean K4() {
        return j14.R.b(this);
    }

    public o34[] K6(qi4.h hVar) {
        o34[] F8 = O0().F8(hVar);
        yb4 p6 = p6(hVar);
        if (p6 != null) {
            o34[] E6 = p6.E6(hVar.r);
            o34[] o34VarArr = new o34[F8.length + E6.length];
            System.arraycopy(F8, 0, o34VarArr, 0, F8.length);
            System.arraycopy(E6, 0, o34VarArr, F8.length, E6.length);
            return o34VarArr;
        }
        return F8;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: K7 */
    public ni4 k5(int i) throws y14 {
        return o0(i, true);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04
    /* renamed from: L6 */
    public qi4 O0() {
        return (qi4) super.O0();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: L7 */
    public ni4 o0(int i, boolean z) throws y14 {
        return j6(O0().o0(i, z));
    }

    @Override // com.p7700g.p99005.j14
    public boolean M4() {
        return true;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: M6 */
    public qi4 z0(int i) {
        return O0().z0(i);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: M7 */
    public ni4 m5(int i, boolean z, boolean z2) throws y14 {
        return j6(O0().d7(i, z, z2));
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.q04
    public String N1(boolean z) throws t14 {
        if (!U6()) {
            qi4.i iVar = this.K0;
            String str = z ? iVar.c : iVar.b;
            if (str != null) {
                return str;
            }
        }
        if (W6()) {
            String m7 = O0().m7(z, this.J0.i());
            if (z) {
                this.K0.c = m7;
                return m7;
            }
            this.K0.b = m7;
            return m7;
        }
        return O0().N1(z);
    }

    @Override // com.p7700g.p99005.j14
    public boolean N4() {
        ri4 D02 = D0(0);
        return (y() && D02.J3(2, 15)) || D02.Y5(65152, 10);
    }

    @Override // com.p7700g.p99005.j14
    public i54 N5() {
        return l8(qi4.h.n);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: N6 */
    public qi4 J0(int i, int i2) {
        return O0().J0(i, i2);
    }

    public ni4 N7(c cVar) {
        if (cVar == null) {
            return E7();
        }
        return s6().D4(O0(), cVar);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Stream<ni4> O1(int i) {
        return StreamSupport.stream(y2(i), false);
    }

    @Override // com.p7700g.p99005.j14
    public boolean O4() {
        int i = 0;
        while (i < V0() - 1) {
            if (!D0(i).V1()) {
                return false;
            }
            i++;
        }
        return D0(i).s3(1);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: O6 */
    public ri4 D0(int i) {
        return O0().D0(i);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: O7 */
    public ni4[] i1() {
        if (M0()) {
            return b1() ? new ni4[]{E7()} : p5(this);
        }
        ArrayList arrayList = (ArrayList) E7().o5(true);
        return (ni4[]) arrayList.toArray(new ni4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<ni4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: P6 */
    public ri4[] N0() {
        return O0().N0();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: P7 */
    public ni4[] p5(j14 j14Var) throws r04 {
        ni4 E7 = E7();
        ni4 E72 = n3(j14Var).E7();
        tc4 tc4Var = tc4.a;
        hi4 hi4Var = hi4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        yh4 yh4Var = new yh4(o04Var);
        kc4 kc4Var = kc4.a;
        ji4 ji4Var = ji4.a;
        final pi4.a r6 = r6();
        Objects.requireNonNull(r6);
        return (ni4[]) j14.B4(E7, E72, tc4Var, hi4Var, yh4Var, kc4Var, ji4Var, new IntFunction() { // from class: com.p7700g.p99005.lc4
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return pi4.a.this.x0(i);
            }
        });
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String Q2() {
        String str;
        if (U6() || (str = this.K0.k) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.s);
                iVar.k = f8;
                return f8;
            }
            return O0().Q2();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14
    public String Q5() {
        String str;
        if (U6() || (str = this.K0.M) == null) {
            String replace = W6() ? this.J0.i().replace('%', Z).replace(':', '-') : null;
            qi4.i iVar = this.K0;
            String vc = O0().vc(qi4.i.v, replace);
            iVar.M = vc;
            return vc;
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: Q6 */
    public ni4 o() {
        return D6(false, false);
    }

    @Override // com.p7700g.p99005.j14
    @Deprecated
    /* renamed from: Q7 */
    public si4 q5(j14 j14Var) throws r04 {
        return M5(j14Var);
    }

    @Override // com.p7700g.p99005.z04
    public v44<ni4, ri4[]> R0() {
        return O0().Xb(this, r6());
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: R7 */
    public ni4[] Q0() throws r04 {
        if (M0()) {
            return new ni4[]{t0().E7()};
        }
        ArrayList arrayList = (ArrayList) E7().o5(false);
        return (ni4[]) arrayList.toArray(new ni4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.z04
    public Stream<ri4[]> S0() {
        return StreamSupport.stream(R0(), false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String S1() {
        String str;
        if (U6() || (str = this.K0.J) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.y);
                iVar.J = f8;
                return f8;
            }
            return O0().S1();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Iterator<ni4> S2(int i) {
        return O0().R7(this, r6(), i);
    }

    public String S6() {
        return T6();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: S7 */
    public ni4[] r5(j14 j14Var) throws r04 {
        ni4 E7 = E7();
        ni4 E72 = n3(j14Var).E7();
        tc4 tc4Var = tc4.a;
        hi4 hi4Var = hi4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (ni4[]) j14.D4(E7, E72, tc4Var, hi4Var, new yh4(o04Var), ji4.a, s6());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String T3() {
        String str;
        if (U6() || (str = this.K0.l) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.z);
                iVar.l = f8;
                return f8;
            }
            return O0().T3();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: T7 */
    public ni4[] s5(j14 j14Var) throws r04 {
        qi4[] jc = O0().jc(n3(j14Var).O0());
        if (jc == null) {
            return null;
        }
        int length = jc.length;
        ni4[] ni4VarArr = new ni4[length];
        for (int i = 0; i < length; i++) {
            ni4VarArr[i] = r6().Q(jc[i]);
        }
        return ni4VarArr;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04
    public String U0() {
        String str;
        if (U6() || (str = this.K0.a) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.u);
                iVar.a = f8;
                return f8;
            }
            return O0().U0();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public x44<ni4> U1() {
        return super.U1();
    }

    public String U7() throws t14 {
        String str;
        r14 w3 = w3();
        if (w3 != null && ((!C0() || K3().intValue() == 128) && w3.E())) {
            return w3.toString();
        }
        if (U6() || (str = this.K0.L) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String lc = O0().lc(S6());
                iVar.L = lc;
                return lc;
            }
            return O0().kc();
        }
        return str;
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04
    public int V0() {
        return 8;
    }

    @Override // com.p7700g.p99005.v24
    public Iterator<ni4> V2(int i) {
        return O0().Gb(this, r6(), false, i);
    }

    public boolean V6() {
        if (this.L0 == null) {
            synchronized (this) {
                if (this.L0 == null) {
                    this.L0 = new qi4.e();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public gl4 V7(boolean z) {
        jl4 mc = O0().mc(z);
        if (mc == null) {
            return null;
        }
        return E6().g().H(mc);
    }

    @Override // com.p7700g.p99005.z04
    public Iterator<ri4[]> W0() {
        return O0().W0();
    }

    public boolean W6() {
        return this.J0 != null;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: X6 */
    public ni4 p(long j) {
        return j6(O0().l0(j));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public i54 Y1(m14.c cVar) {
        return l8(qi4.h.c(cVar));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Y5 */
    public ni4 r0(boolean z) {
        return j6(O0().r0(z));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: Y6 */
    public ni4 t(long j) {
        return j6(O0().g0(j));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: Y7 */
    public Inet6Address C5() {
        Inet6Address inet6Address;
        if (W6()) {
            if (V6() || (inet6Address = this.L0.e) == null) {
                qi4.e eVar = this.L0;
                Inet6Address D5 = D5();
                eVar.e = D5;
                return D5;
            }
            return inet6Address;
        }
        return (Inet6Address) super.C5();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Z5 */
    public ni4 q0(boolean z, boolean z2) {
        return j6(O0().q0(z, z2));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: Z6 */
    public ni4 H4(j14 j14Var) throws r04 {
        qi4 O0 = O0();
        ni4 n3 = n3(j14Var);
        qi4 W8 = O0.W8(n3.O0());
        if (W8 == null) {
            return null;
        }
        return (h7(n3) ? r6() : s6()).Q(W8);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: Z7 */
    public Inet6Address D5() {
        Object obj = null;
        try {
            byte[] n = O0().n();
            if (W6()) {
                if (this.J0.n()) {
                    obj = Inet6Address.getByAddress((String) null, n, this.J0.h());
                } else if (this.J0.m() && this.J0.f() != null) {
                    obj = Inet6Address.getByAddress((String) null, n, this.J0.f());
                } else {
                    obj = InetAddress.getByName(m().t0().E0());
                }
            } else {
                obj = InetAddress.getByAddress(n);
            }
        } catch (UnknownHostException unused) {
        }
        return (Inet6Address) obj;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: a6 */
    public ni4 j0(int i) {
        return j6(O0().j0(i));
    }

    public boolean a7() {
        return D0(0).s3(65152) && D0(1).V1() && D0(2).V1() && D0(3).V1() && D0(4).V1() && D0(5).V1();
    }

    public bc4 a8() {
        if (e7()) {
            return O0().l8();
        }
        return null;
    }

    @Override // com.p7700g.p99005.p14
    public Iterator<ri4[]> b2() {
        return O0().b2();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: b6 */
    public ni4 u0(int i, boolean z) {
        return j6(O0().u0(i, z));
    }

    public boolean b7() {
        return D0(0).s3(8194);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: b8 */
    public ni4 L3() {
        if (!C0()) {
            ni4 x = m0().x(0);
            return m0().i().f() ? x : x.k5(0);
        } else if (q3() && P4()) {
            return o();
        } else {
            return j6(O0().X7());
        }
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: c6 */
    public ni4 p0(int i) throws y14 {
        return j6(O0().p0(i));
    }

    public boolean c7() {
        return O0().X8();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: c8 */
    public ni4 d2(int i) {
        if (C0() && i == K3().intValue()) {
            return L3();
        }
        return j6(O0().q7(i));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: d6 */
    public ni4 g2() {
        return (ni4) super.g2();
    }

    public boolean d7() {
        return D0(0).V1() && D0(1).V1() && D0(2).V1() && D0(3).V1() && D0(4).V1() && D0(5).V1();
    }

    public String d8() {
        String str;
        if (U6() || (str = this.K0.H) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.r);
                iVar.H = f8;
                return f8;
            }
            return O0().qc();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: e6 */
    public ni4 Z() {
        return (ni4) super.F2();
    }

    public boolean e7() {
        if (D0(5).s3(65535)) {
            for (int i = 0; i < 5; i++) {
                if (!D0(i).V1()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<ni4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: f6 */
    public ni4 w0(j14 j14Var) throws t14, r04 {
        return x0(j14Var, false);
    }

    public boolean f7() {
        return D0(4).s3(65535) && D0(5).V1() && D0(0).V1() && D0(1).V1() && D0(2).V1() && D0(3).V1();
    }

    public String f8(qi4.l lVar) {
        return O0().vc(lVar, T6());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.l24
    public int g3() {
        return 16;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: g6 */
    public ni4 x0(j14 j14Var, boolean z) throws t14, r04 {
        return j6(O0().P7(n3(j14Var).O0(), z));
    }

    public boolean g7() {
        if (D0(0).s3(65152) && D0(1).V1() && D0(2).V1() && D0(3).V1()) {
            return (D0(4).V1() || D0(4).s3(512)) && D0(5).s3(24318);
        }
        return false;
    }

    public String g8(boolean z, qi4.l lVar) {
        qi4.l lVar2 = lVar;
        if (z && this.N != null && w3().N() && !lVar.e()) {
            lVar2 = new qi4.l(lVar2.d, lVar2.c, lVar2.l, lVar2.b, lVar2.e, true, lVar2.n, lVar2.o, lVar2.f, lVar2.m, lVar2.g, lVar2.k, lVar2.h, lVar2.i, lVar2.j);
        }
        return f8(lVar2);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: h6 */
    public ni4 X0(j14 j14Var, int i) throws t14, y14, r04 {
        return j6(O0().Q7(n3(j14Var).O0(), i));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: h8 */
    public ni4 i0() {
        Integer K3 = K3();
        return (K3 == null || m0().i().f()) ? this : i4(K3.intValue());
    }

    @Override // com.p7700g.p99005.n04
    public int hashCode() {
        int hashCode = super.hashCode();
        return W6() ? hashCode * this.J0.i().hashCode() : hashCode;
    }

    public void i6(ni4 ni4Var, ni4 ni4Var2) {
        if (!(ni4Var == null && ni4Var2 == null) && O0().P8() == null) {
            O0().T7(ni4Var != null ? ni4Var.O0() : null, ni4Var2 != null ? ni4Var2.O0() : null);
            qi4.e eVar = this.L0;
            if (eVar == null || ((ni4Var != null && eVar.a == 0) || (ni4Var2 != null && eVar.c == 0))) {
                synchronized (this) {
                    qi4.e eVar2 = this.L0;
                    if (eVar2 == null) {
                        qi4.e eVar3 = new qi4.e();
                        this.L0 = eVar3;
                        eVar3.a = ni4Var;
                        eVar3.c = ni4Var2;
                    } else {
                        if (eVar2.a == 0) {
                            eVar2.a = ni4Var;
                        }
                        if (eVar2.c == 0) {
                            eVar2.c = ni4Var2;
                        }
                    }
                }
            }
        }
    }

    public boolean i7() {
        ri4 D02 = D0(0);
        return (y() && D02.J3(5, 15)) || D02.Y5(65216, 10);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: i8 */
    public ni4 i4(int i) throws y14 {
        return j6(O0().u7(i));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<ni4> iterator() {
        return O0().a9(this, r6(), null);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Iterator<ni4> j1() {
        return super.j1();
    }

    @Override // com.p7700g.p99005.v24
    public Stream<ni4> j2(int i) {
        return StreamSupport.stream(s2(i), false);
    }

    public boolean j7() {
        return D0(0).s3(8193) && D0(1).V1();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.v24
    /* renamed from: j8 */
    public si4 z2() {
        return new si4(m(), o());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String k1() throws t14 {
        String str;
        if (U6() || (str = this.K0.p) == null) {
            if (W6()) {
                String k7 = O0().k7(this.J0.i());
                this.K0.p = k7;
                return k7;
            }
            return O0().k1();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Stream<ni4> k4() {
        return super.k4();
    }

    public boolean k7() {
        return D0(0).Y5(64512, 7);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: k8 */
    public si4 M5(j14 j14Var) {
        return new si4(this, n3(j14Var));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String l2() {
        String str;
        if (U6() || (str = this.K0.I) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.A);
                iVar.I = f8;
                return f8;
            }
            return O0().l2();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: l6 */
    public ni4 n3(j14 j14Var) throws r04 {
        ni4 B5 = j14Var.B5();
        if (B5 != null) {
            return B5;
        }
        throw new r04(this, j14Var);
    }

    public boolean l7() {
        if (D0(0).s3(100) && D0(1).s3(65435)) {
            for (int i = 2; i <= 5; i++) {
                if (!D0(i).V1()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public i54 l8(qi4.h hVar) {
        qi4.j Ac = O0().Ac(hVar, T6());
        yb4 p6 = p6(hVar);
        if (p6 != null) {
            Ac.d(p6.G7(hVar.r));
        }
        return Ac;
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: m6 */
    public ni4 e1() {
        return (ni4) qi4.u5(this, m(), o());
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: m8 */
    public Inet6Address R5() {
        return (Inet6Address) super.R5();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: n6 */
    public ni4 p3(j14 j14Var) throws r04 {
        ni4 E7 = E7();
        ni4 E72 = n3(j14Var).E7();
        tc4 tc4Var = tc4.a;
        hi4 hi4Var = hi4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (ni4) qi4.v5(E7, E72, tc4Var, hi4Var, new yh4(o04Var));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: n8 */
    public ni4 Z3() {
        return U5(false);
    }

    public yb4 o6() {
        return v6(2);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: o8 */
    public ni4 T5(int i) {
        if (C0() && i == K3().intValue()) {
            return Z3();
        }
        return j6(O0().y7(i));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: p8 */
    public ni4 U5(boolean z) {
        if (!C0()) {
            pi4 m0 = m0();
            s04.c i = m0.i();
            ni4 G = m0.G(0, !i.f());
            return i.h() ? G.m() : G;
        } else if (o4() && P4()) {
            return m();
        } else {
            return j6(O0().b8(z));
        }
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String q2(boolean z) throws t14 {
        if (!U6()) {
            qi4.i iVar = this.K0;
            String str = z ? iVar.n : iVar.o;
            if (str != null) {
                return str;
            }
        }
        if (W6()) {
            String s7 = O0().s7(z, this.J0.i());
            if (z) {
                this.K0.n = s7;
                return s7;
            }
            this.K0.o = s7;
            return s7;
        }
        return O0().q2(z);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: q8 */
    public ni4 V5() {
        if (!C0()) {
            return m0().x(A0());
        }
        return j6(O0().c8());
    }

    public pi4.a r6() {
        pi4.a s6 = s6();
        if (W6()) {
            a aVar = new a(m0(), s6.x);
            aVar.y = s6.y;
            return aVar;
        }
        return s6;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: r8 */
    public ni4 t0() {
        return v0(false);
    }

    @Override // com.p7700g.p99005.v24
    public x44<ni4> s2(int i) {
        return O0().Jb(this, r6(), false, i);
    }

    public pi4.a s6() {
        return m0().u();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<ni4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.j14
    public s14 t3() {
        return new s14.a().t().F(z6()).k().u().D(m0()).k().A();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    /* renamed from: t6 */
    public ri4 e0(int i) {
        return D0(i);
    }

    @Override // com.p7700g.p99005.j14
    public i54 u5() {
        return l8(qi4.h.o);
    }

    public yb4 u6() {
        return z6().u().Q(O0().l8());
    }

    public yb4 v6(int i) {
        if (i == 12) {
            return u6();
        }
        return z6().u().Q(O0().m8(i, i + 4));
    }

    public /* synthetic */ boolean v7(int i, ri4[] ri4VarArr) {
        return O0().gb(ri4VarArr, i);
    }

    @Override // com.p7700g.p99005.j14
    public o34[] w4(m14.c cVar) {
        return K6(qi4.h.c(cVar));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: w6 */
    public ni4 a2() {
        return (ni4) super.a2();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: w7 */
    public ni4 V4(j14 j14Var) throws t14, r04 {
        return W4(j14Var, false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    public boolean x() {
        if (y()) {
            ri4 D02 = D0(0);
            if (D02.J3(8, 15)) {
                return true;
            }
            if (D02.c4() <= 5 && (D02.B1() & 15) >= 1 && (D02.h3() & 15) <= 5) {
                return true;
            }
            if (D02.Y5(65328, 12) && D0(6).Y5(32768, 1)) {
                return true;
            }
        }
        return N4() || i7() || k7() || I4();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public String x2() {
        String str;
        if (U6() || (str = this.K0.K) == null) {
            if (W6()) {
                qi4.i iVar = this.K0;
                String f8 = f8(qi4.i.B);
                iVar.K = f8;
                return f8;
            }
            return O0().x2();
        }
        return str;
    }

    @Override // com.p7700g.p99005.j14
    public String x5() {
        if (K4()) {
            return d8();
        }
        return E0();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: x6 */
    public qi4 i2() {
        return O0().i2();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: x7 */
    public ni4 W4(j14 j14Var, boolean z) throws t14, r04 {
        return j6(O0().zb(n3(j14Var).O0(), z));
    }

    @Override // com.p7700g.p99005.n04
    public boolean y() {
        return D0(0).Y5(65280, 8);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<ni4> y0() {
        return O0().Ib(this, r6(), false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public x44<ni4> y2(int i) {
        return O0().S7(this, r6(), i);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: y6 */
    public qi4 z4(int i) throws y14 {
        return O0().z4(i);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: y7 */
    public ni4 X4(j14 j14Var, int i) throws t14, y14, r04 {
        return j6(O0().Ab(n3(j14Var).O0(), i));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Iterator<ni4> z1() {
        Predicate<ri4[]> predicate;
        if (o4()) {
            final int intValue = K3().intValue();
            predicate = new Predicate() { // from class: com.p7700g.p99005.ad4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ni4.this.v7(intValue, (ri4[]) obj);
                }
            };
        } else {
            predicate = null;
        }
        return O0().a9(this, r6(), predicate);
    }

    public ac4 z6() {
        return n04.g();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: z7 */
    public ni4[] a5(j14... j14VarArr) throws r04 {
        if (j14VarArr.length == 0 && b1()) {
            return new ni4[]{E7()};
        }
        List<p14> n4 = j14.n4(q6(j14VarArr));
        return (ni4[]) n4.toArray(new ni4[n4.size()]);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<ni4> spliterator() {
        return O0().hc(this, r6(), false);
    }

    /* compiled from: IPv6Address.java */
    /* loaded from: classes3.dex */
    public static class c implements Serializable {
        private static final long s = 1;
        public String t;
        private int u;
        private transient NetworkInterface v;
        private Boolean w;

        public c(String str) {
            Objects.requireNonNull(str);
            this.t = str.trim();
            this.u = -1;
        }

        public static int a(String str) {
            int length = str.length();
            long j = 0;
            for (int i = 0; i < length; i++) {
                int digit = Character.digit(str.charAt(i), 10);
                if (digit < 0) {
                    return -1;
                }
                j = (j * 10) + digit;
                if (j > TTL.MAX_VALUE) {
                    return -1;
                }
            }
            return (int) j;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && toString().equals(obj.toString());
        }

        public NetworkInterface f() {
            try {
                if (m()) {
                    if (this.v == null) {
                        this.v = NetworkInterface.getByName(this.t);
                    }
                } else if (this.v == null) {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    loop0: while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface nextElement = networkInterfaces.nextElement();
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if ((nextElement2 instanceof Inet6Address) && ((Inet6Address) nextElement2).getScopeId() == this.u) {
                                this.v = nextElement;
                                break loop0;
                            }
                        }
                    }
                }
            } catch (SocketException unused) {
            }
            return this.v;
        }

        public gl4 g() {
            NetworkInterface f = f();
            if (f != null) {
                try {
                    byte[] hardwareAddress = f.getHardwareAddress();
                    if (hardwareAddress != null) {
                        return new gl4(hardwareAddress);
                    }
                    return null;
                } catch (SocketException unused) {
                    return null;
                }
            }
            return null;
        }

        public int h() {
            NetworkInterface f;
            int scopeId;
            if (m() && this.u == -1 && (f = f()) != null) {
                Enumeration<InetAddress> inetAddresses = f.getInetAddresses();
                int i = -1;
                while (true) {
                    if (!inetAddresses.hasMoreElements()) {
                        break;
                    }
                    InetAddress nextElement = inetAddresses.nextElement();
                    if ((nextElement instanceof Inet6Address) && (scopeId = ((Inet6Address) nextElement).getScopeId()) != 0) {
                        if (i != -1 && scopeId != i) {
                            i = -1;
                            break;
                        }
                        i = scopeId;
                    }
                }
                if (i != -1) {
                    this.u = i;
                }
            }
            return this.u;
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String i() {
            if (this.t == null) {
                if (m()) {
                    this.t = this.v.getName();
                } else {
                    int i = this.u;
                    this.t = ri4.u6(i, 10, new StringBuilder(ri4.v6(i, 10))).toString();
                }
            }
            return this.t;
        }

        public boolean m() {
            if (this.w == null) {
                int a = a(this.t);
                this.u = a;
                this.w = Boolean.valueOf(a < 0);
            }
            return this.w.booleanValue();
        }

        public boolean n() {
            return !m();
        }

        public String toString() {
            return i();
        }

        public c(int i) {
            if (i >= 0) {
                this.u = i;
                this.w = Boolean.FALSE;
                return;
            }
            throw new IllegalArgumentException();
        }

        public c(NetworkInterface networkInterface) {
            Objects.requireNonNull(networkInterface);
            this.v = networkInterface;
            this.w = Boolean.TRUE;
            this.u = -1;
            this.t = networkInterface.getName();
        }
    }

    public ni4(qi4 qi4Var, c cVar) throws c14 {
        super(qi4Var);
        if (qi4Var.V0() == 8) {
            if (qi4Var.W == 0) {
                this.J0 = cVar;
                return;
            }
            throw new t04(qi4Var.W);
        }
        throw new c14("ipaddress.error.ipv6.invalid.segment.count", qi4Var.V0());
    }

    @Deprecated
    public ni4(qi4 qi4Var, CharSequence charSequence) throws c14 {
        this(qi4Var, charSequence, true);
    }

    public ni4(qi4 qi4Var) throws c14 {
        this(qi4Var, (CharSequence) null);
    }

    public ni4(ri4[] ri4VarArr) throws c14 {
        this(ri4VarArr, (Integer) null, (c) null);
    }

    public ni4(ri4[] ri4VarArr, Integer num) throws c14 {
        this(ri4VarArr, num, (c) null);
    }

    @Deprecated
    public ni4(ri4[] ri4VarArr, CharSequence charSequence) throws c14 {
        this(ri4VarArr, k6(charSequence));
    }

    public ni4(ri4[] ri4VarArr, c cVar) throws c14 {
        this(ri4VarArr, (Integer) null, cVar);
    }

    private ni4(final ri4[] ri4VarArr, final Integer num, c cVar) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.uc4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 U3;
                U3 = ((ni4) ((n04) obj)).s6().U3(ri4VarArr, num);
                return U3;
            }
        });
        if (ri4VarArr.length == 8) {
            this.J0 = cVar;
            return;
        }
        throw new c14("ipaddress.error.ipv6.invalid.segment.count", ri4VarArr.length);
    }

    public ni4(Inet6Address inet6Address) {
        this(inet6Address, inet6Address.getAddress(), (Integer) null, R6(inet6Address));
    }

    public ni4(Inet6Address inet6Address, Integer num) {
        this(inet6Address, inet6Address.getAddress(), num, R6(inet6Address));
    }

    private ni4(Inet6Address inet6Address, final byte[] bArr, final Integer num, c cVar) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.vc4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 G3;
                G3 = ((ni4) ((n04) obj)).s6().G3(r0, 0, bArr.length, 8, num);
                return G3;
            }
        });
        this.J0 = cVar;
        O0().M(inet6Address);
    }

    @Deprecated
    public ni4(byte[] bArr, CharSequence charSequence) throws c14 {
        this(bArr, k6(charSequence));
    }

    public ni4(byte[] bArr, c cVar) throws c14 {
        this(bArr, (Integer) null, cVar);
    }

    public ni4(byte[] bArr) throws c14 {
        this(bArr, (Integer) null, (c) null);
    }

    public ni4(byte[] bArr, int i, int i2) throws c14 {
        this(bArr, i, i2, null, null);
    }

    public ni4(byte[] bArr, Integer num) throws c14 {
        this(bArr, num, (c) null);
    }

    public ni4(byte[] bArr, int i, int i2, Integer num) throws c14 {
        this(bArr, i, i2, num, null);
    }

    public ni4(BigInteger bigInteger) throws c14 {
        this(bigInteger, (Integer) null, (c) null);
    }

    public ni4(BigInteger bigInteger, Integer num) throws c14 {
        this(bigInteger, num, (c) null);
    }

    @Deprecated
    public ni4(BigInteger bigInteger, CharSequence charSequence) throws c14 {
        this(bigInteger, k6(charSequence));
    }

    public ni4(BigInteger bigInteger, c cVar) throws c14 {
        this(bigInteger, (Integer) null, cVar);
    }

    @Deprecated
    public ni4(BigInteger bigInteger, Integer num, CharSequence charSequence) throws c14 {
        this(bigInteger, num, k6(charSequence));
    }

    public ni4(final BigInteger bigInteger, final Integer num, c cVar) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.xc4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 M;
                M = ((ni4) ((n04) obj)).s6().M(bigInteger.toByteArray(), 8, num, false);
                return M;
            }
        });
        this.J0 = cVar;
    }

    private ni4(byte[] bArr, Integer num, c cVar) throws c14 {
        this(bArr, 0, bArr.length, num, cVar);
    }

    private ni4(final byte[] bArr, final int i, final int i2, final Integer num, c cVar) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.wc4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 G3;
                G3 = ((ni4) ((n04) obj)).s6().G3(bArr, i, i2, 8, num);
                return G3;
            }
        });
        this.J0 = cVar;
    }

    public ni4(n04.b bVar, n04.b bVar2, Integer num) throws c14 {
        this(bVar, bVar2, num, (c) null);
    }

    public ni4(n04.b bVar, n04.b bVar2) {
        this(bVar, bVar2, (Integer) null, (c) null);
    }

    public ni4(n04.b bVar, Integer num) throws c14 {
        this(bVar, bVar, num);
    }

    public ni4(n04.b bVar) {
        this(bVar, (Integer) null);
    }

    @Deprecated
    public ni4(n04.b bVar, n04.b bVar2, CharSequence charSequence) throws c14 {
        this(bVar, bVar2, k6(charSequence));
    }

    public ni4(n04.b bVar, n04.b bVar2, c cVar) throws c14 {
        this(bVar, bVar2, (Integer) null, cVar);
    }

    private ni4(final n04.b bVar, final n04.b bVar2, final Integer num, c cVar) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.zc4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 x3;
                x3 = ((ni4) ((n04) obj)).s6().x3(n04.b.this, bVar2, num);
                return x3;
            }
        });
        this.J0 = cVar;
    }

    public ni4(ni4 ni4Var, gl4 gl4Var) throws t14 {
        this(ni4Var.O0(), gl4Var.O0());
    }

    public ni4(qi4 qi4Var, gl4 gl4Var) throws t14, c14 {
        this(qi4Var, gl4Var.O0());
    }

    public ni4(qi4 qi4Var, jl4 jl4Var) throws t14, c14 {
        this(qi4Var, jl4Var, (c) null);
    }

    @Deprecated
    public ni4(qi4 qi4Var, jl4 jl4Var, CharSequence charSequence) throws t14, c14 {
        this(qi4Var, jl4Var, k6(charSequence));
    }

    public ni4(final qi4 qi4Var, final jl4 jl4Var, c cVar) throws t14, c14 {
        super(new Function() { // from class: com.p7700g.p99005.yc4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ni4.t7(qi4.this, jl4Var, (n04) obj);
            }
        });
        this.J0 = cVar;
    }
}