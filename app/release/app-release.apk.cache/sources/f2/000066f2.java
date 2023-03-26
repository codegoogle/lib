package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.bc4;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.s14;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: IPv4Address.java */
/* loaded from: classes3.dex */
public class yb4 extends j14 implements Iterable<yb4> {
    private static final long U = 4;
    public static final char V = '.';
    public static final int W = 8;
    public static final int X = 1;
    public static final int Y = 4;
    public static final int Z = 4;
    public static final int u0 = 32;
    public static final int v0 = 10;
    public static final int w0 = 255;
    public static final int x0 = -1;
    public static final String y0 = ".in-addr.arpa";
    public transient bc4.c z0;

    /* compiled from: IPv4Address.java */
    /* loaded from: classes3.dex */
    public interface a {
        yb4 c(j14 j14Var);
    }

    /* compiled from: IPv4Address.java */
    /* loaded from: classes3.dex */
    public enum b {
        OCTAL,
        HEX,
        DECIMAL;

        public int f() {
            if (this == OCTAL) {
                return 8;
            }
            return this == HEX ? 16 : 10;
        }

        public String g() {
            if (this == OCTAL) {
                return "0";
            }
            if (this == HEX) {
                return n04.t;
            }
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this == OCTAL ? "octal" : this == HEX ? "hexadecimal" : "decimal";
        }
    }

    public yb4(cc4[] cc4VarArr) throws c14 {
        this(cc4VarArr, (Integer) null);
    }

    public static String B7(ac4 ac4Var, n04.b bVar, n04.b bVar2, Integer num) {
        return j14.H5(ac4Var.i(), bVar, bVar2, num, 4, 1, 8, 255, '.', 10, null);
    }

    private /* synthetic */ boolean V6(int i, cc4[] cc4VarArr) {
        return O0().l9(cc4VarArr, i);
    }

    private yb4 i6(bc4 bc4Var) {
        return bc4Var == O0() ? this : m6().Q(bc4Var);
    }

    private ni4 n6(bc4.e eVar) {
        if (eVar.a(65536)) {
            return eVar.q.d(this);
        }
        return null;
    }

    private j14[] o6(j14... j14VarArr) {
        int i = 1;
        j14[] j14VarArr2 = new j14[j14VarArr.length + 1];
        int i2 = 0;
        while (i2 < j14VarArr.length) {
            j14VarArr2[i] = n3(j14VarArr[i2]);
            i2 = i;
            i++;
        }
        j14VarArr2[0] = this;
        return j14VarArr2;
    }

    private yb4 y6(boolean z, boolean z2) {
        return O0().l8(this, z, z2);
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return 32;
    }

    @Override // com.p7700g.p99005.v24
    public Stream<yb4> A1(int i) {
        return StreamSupport.stream(l3(i), false);
    }

    @Override // com.p7700g.p99005.j14
    public yb4 A5() {
        return this;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: A6 */
    public yb4 q4() {
        return (yb4) super.P1();
    }

    public yb4 A7() {
        return Z3();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<yb4> B0() {
        return O0().Ta(this, m6(), false);
    }

    @Override // com.p7700g.p99005.j14
    public ni4 B5() {
        return j14.R.d(this);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: B6 */
    public bc4 o2() {
        return O0().o2();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: C6 */
    public bc4 Q3(int i) throws y14 {
        return O0().Q3(i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: C7 */
    public yb4 i0() {
        Integer K3 = K3();
        return (K3 == null || m0().i().f()) ? this : i4(K3.intValue());
    }

    @Override // com.p7700g.p99005.p14
    public String D3() {
        return O0().D3();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: D6 */
    public bc4 A2(int i, boolean z) throws y14 {
        return O0().A2(i, z);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: D7 */
    public yb4 i4(int i) throws y14 {
        return i6(O0().u7(i));
    }

    public o34[] E6(bc4.e eVar) {
        o34[] t8 = O0().t8(eVar);
        ni4 n6 = n6(eVar);
        if (n6 != null) {
            o34[] K6 = n6.K6(eVar.p);
            o34[] o34VarArr = new o34[t8.length + K6.length];
            System.arraycopy(t8, 0, o34VarArr, 0, t8.length);
            System.arraycopy(K6, 0, o34VarArr, t8.length, K6.length);
            return o34VarArr;
        }
        return t8;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.v24
    /* renamed from: E7 */
    public dc4 z2() {
        return new dc4(m(), o());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Iterator<yb4> F0() {
        return O0().Ta(this, m6(), true);
    }

    @Override // com.p7700g.p99005.v24
    public Iterator<yb4> F1(int i) {
        return O0().Ua(this, m6(), true, i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04
    /* renamed from: F6 */
    public bc4 O0() {
        return (bc4) super.O0();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: F7 */
    public dc4 M5(j14 j14Var) {
        return new dc4(this, n3(j14Var));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<yb4> G0() {
        return O0().Wa(this, m6(), true);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: G6 */
    public bc4 z0(int i) {
        return O0().z0(i);
    }

    public i54 G7(bc4.e eVar) {
        bc4.g gVar = new bc4.g();
        gVar.d(O0().Fb(eVar));
        ni4 n6 = n6(eVar);
        if (n6 != null) {
            gVar.d(n6.l8(eVar.p));
        }
        return gVar;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: H6 */
    public bc4 J0(int i, int i2) {
        return O0().J0(i, i2);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: H7 */
    public Inet4Address R5() {
        return (Inet4Address) super.R5();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: I6 */
    public cc4 D0(int i) {
        return O0().D0(i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: I7 */
    public yb4 Z3() {
        return U5(false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.z04
    /* renamed from: J6 */
    public cc4[] N0() {
        return O0().N0();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: J7 */
    public yb4 T5(int i) {
        if (C0() && i == K3().intValue()) {
            return Z3();
        }
        return i6(O0().y7(i));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<yb4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    @Override // com.p7700g.p99005.j14
    public boolean K4() {
        return true;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: K6 */
    public yb4 o() {
        return y6(false, false);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: K7 */
    public yb4 U5(boolean z) {
        if (!C0()) {
            ac4 m0 = m0();
            s04.c i = m0.i();
            yb4 G = m0.G(0, !i.f());
            return i.h() ? G.m() : G;
        } else if (o4() && P4()) {
            return m();
        } else {
            return i6(O0().V7(z));
        }
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: L6 */
    public yb4 p(long j) {
        return i6(O0().l0(j));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: L7 */
    public yb4 V5() {
        if (!C0()) {
            return m0().x(A0());
        }
        return i6(O0().W7());
    }

    @Override // com.p7700g.p99005.j14
    public boolean M4() {
        return j14.R.a(this);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: M6 */
    public yb4 t(long j) {
        return i6(O0().g0(j));
    }

    public int M7() {
        return O0().Jb();
    }

    @Override // com.p7700g.p99005.j14
    public boolean N4() {
        return y() ? D0(0).s3(224) && D0(1).V1() && D0(2).V1() && D0(3).s3(252) : D0(0).s3(169) && D0(1).s3(254);
    }

    @Override // com.p7700g.p99005.j14
    public i54 N5() {
        return G7(bc4.e.m);
    }

    public int N6() {
        return O0().I8();
    }

    public long N7() {
        return O0().Kb();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Stream<yb4> O1(int i) {
        return StreamSupport.stream(y2(i), false);
    }

    @Override // com.p7700g.p99005.j14
    public boolean O4() {
        return D0(0).s3(127);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: O6 */
    public yb4 H4(j14 j14Var) throws r04 {
        bc4 J8 = O0().J8(n3(j14Var).O0());
        if (J8 == null) {
            return null;
        }
        return m6().Q(J8);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: O7 */
    public yb4 t0() {
        return v0(false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public Stream<yb4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    public boolean P6() {
        cc4 D0 = D0(0);
        cc4 D02 = D0(1);
        return D0.s3(10) || (D0.s3(172) && D02.Y5(16, 4)) || (D0.s3(yg1.K) && D02.s3(168));
    }

    @Override // com.p7700g.p99005.j14
    public String Q5() {
        return super.U0();
    }

    @Override // com.p7700g.p99005.z04
    public v44<yb4, cc4[]> R0() {
        return O0().kb(this, m6());
    }

    @Override // com.p7700g.p99005.z04
    public Stream<cc4[]> S0() {
        return StreamSupport.stream(R0(), false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Iterator<yb4> S2(int i) {
        return O0().N7(this, m6(), i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public x44<yb4> U1() {
        return super.U1();
    }

    @Override // com.p7700g.p99005.n04, com.p7700g.p99005.z04
    public int V0() {
        return 4;
    }

    @Override // com.p7700g.p99005.v24
    public Iterator<yb4> V2(int i) {
        return O0().Ua(this, m6(), false, i);
    }

    @Override // com.p7700g.p99005.z04
    public Iterator<cc4[]> W0() {
        return O0().W0();
    }

    public /* synthetic */ boolean W6(int i, cc4[] cc4VarArr) {
        return O0().l9(cc4VarArr, i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: X5 */
    public yb4 r0(boolean z) {
        return i6(O0().r0(z));
    }

    public long X6() {
        return O0().Ma();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public i54 Y1(m14.c cVar) {
        return G7(bc4.e.c(cVar));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Y5 */
    public yb4 q0(boolean z, boolean z2) {
        return i6(O0().q0(z, z2));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: Y6 */
    public yb4 V4(j14 j14Var) throws t14, r04 {
        return W4(j14Var, false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: Z5 */
    public yb4 j0(int i) {
        return i6(O0().j0(i));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: Z6 */
    public yb4 W4(j14 j14Var, boolean z) throws t14, r04 {
        return i6(O0().Oa(n3(j14Var).O0(), z));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: a6 */
    public yb4 u0(int i, boolean z) {
        return i6(O0().u0(i, z));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: a7 */
    public yb4 X4(j14 j14Var, int i) throws t14, y14, r04 {
        return i6(O0().Pa(n3(j14Var).O0(), i));
    }

    @Override // com.p7700g.p99005.p14
    public Iterator<cc4[]> b2() {
        return O0().b2();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: b6 */
    public yb4 p0(int i) throws y14 {
        return i6(O0().p0(i));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: b7 */
    public yb4[] a5(j14... j14VarArr) throws r04 {
        if (j14VarArr.length == 0 && b1()) {
            return new yb4[]{this};
        }
        List<p14> n4 = j14.n4(o6(j14VarArr));
        return (yb4[]) n4.toArray(new yb4[n4.size()]);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: c6 */
    public yb4 g2() {
        return (yb4) super.g2();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: c7 */
    public yb4[] b5(j14... j14VarArr) throws r04 {
        if (j14VarArr.length == 0 && M0()) {
            return new yb4[]{this};
        }
        List<p14> p4 = j14.p4(o6(j14VarArr), m6());
        return (yb4[]) p4.toArray(new yb4[p4.size()]);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: d6 */
    public yb4 Z() {
        return (yb4) super.F2();
    }

    @Override // com.p7700g.p99005.v24
    /* renamed from: d7 */
    public x44<yb4> l3(int i) {
        return O0().Xa(this, m6(), true, i);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: e6 */
    public yb4 w0(j14 j14Var) throws t14, r04 {
        return x0(j14Var, false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: e7 */
    public yb4 n0() {
        return v0(true);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Iterable<yb4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: f6 */
    public yb4 x0(j14 j14Var, boolean z) throws t14, r04 {
        return i6(O0().L7(n3(j14Var).O0(), z));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: f7 */
    public yb4 v0(boolean z) {
        return i6(O0().v0(z));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.l24
    public int g3() {
        return 4;
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: g6 */
    public yb4 X0(j14 j14Var, int i) throws t14, y14, r04 {
        return i6(O0().M7(n3(j14Var).O0(), i));
    }

    public yb4 g7(int i, int i2, yb4 yb4Var, int i3) {
        return i6(O0().cb(i, i2, yb4Var.O0(), i3, (i2 - i) + i3));
    }

    public void h6(yb4 yb4Var, yb4 yb4Var2) {
        O0().P7(this, yb4Var, yb4Var2);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: h7 */
    public yb4 g5(boolean z) {
        return i6(O0().d0(z));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: i7 */
    public yb4 h5() {
        return i6(O0().c0());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<yb4> iterator() {
        return O0().L8(this, m6(), null);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Iterator<yb4> j1() {
        return super.j1();
    }

    @Override // com.p7700g.p99005.v24
    public Stream<yb4> j2(int i) {
        return StreamSupport.stream(s2(i), false);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: j6 */
    public yb4 n3(j14 j14Var) throws r04 {
        yb4 A5 = j14Var.A5();
        if (A5 != null) {
            return A5;
        }
        throw new r04(this, j14Var);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: j7 */
    public yb4 k0() {
        return this;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Stream<yb4> k4() {
        return super.k4();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: k6 */
    public yb4 e1() {
        return (yb4) bc4.u5(this, m(), o());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: k7 */
    public yb4 s0() {
        return i6(O0().s0());
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: l6 */
    public yb4 p3(j14 j14Var) throws r04 {
        yb4 n3 = n3(j14Var);
        vb4 vb4Var = vb4.a;
        xb4 xb4Var = xb4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (yb4) bc4.v5(this, n3, vb4Var, xb4Var, new pb4(o04Var));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: l7 */
    public yb4 k5(int i) {
        return o0(i, true);
    }

    public ac4.a m6() {
        return m0().u();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: m7 */
    public yb4 o0(int i, boolean z) {
        return i6(O0().o0(i, z));
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: n7 */
    public yb4 m5(int i, boolean z, boolean z2) throws y14 {
        return i6(O0().d7(i, z, z2));
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: o7 */
    public yb4[] i1() {
        if (M0()) {
            return b1() ? new yb4[]{this} : p5(this);
        }
        ArrayList arrayList = (ArrayList) o5(true);
        return (yb4[]) arrayList.toArray(new yb4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    /* renamed from: p6 */
    public cc4 e0(int i) {
        return D0(i);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: p7 */
    public yb4[] p5(j14 j14Var) throws r04 {
        yb4 n3 = n3(j14Var);
        vb4 vb4Var = vb4.a;
        xb4 xb4Var = xb4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        pb4 pb4Var = new pb4(o04Var);
        ub4 ub4Var = ub4.a;
        mb4 mb4Var = mb4.a;
        final ac4.a m6 = m6();
        Objects.requireNonNull(m6);
        return (yb4[]) j14.B4(this, n3, vb4Var, xb4Var, pb4Var, ub4Var, mb4Var, new IntFunction() { // from class: com.p7700g.p99005.gb4
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return ac4.a.this.x0(i);
            }
        });
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: q6 */
    public yb4 a2() {
        return (yb4) super.a2();
    }

    @Override // com.p7700g.p99005.j14
    @Deprecated
    /* renamed from: q7 */
    public dc4 q5(j14 j14Var) throws r04 {
        return M5(j14Var);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: r6 */
    public bc4 i2() {
        return O0().i2();
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: r7 */
    public yb4[] Q0() throws r04 {
        if (M0()) {
            return new yb4[]{t0()};
        }
        ArrayList arrayList = (ArrayList) o5(false);
        return (yb4[]) arrayList.toArray(new yb4[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.v24
    public x44<yb4> s2(int i) {
        return O0().Xa(this, m6(), false, i);
    }

    @Override // com.p7700g.p99005.p14
    /* renamed from: s6 */
    public bc4 z4(int i) throws y14 {
        return O0().z4(i);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: s7 */
    public yb4[] r5(j14 j14Var) throws r04 {
        yb4 n3 = n3(j14Var);
        vb4 vb4Var = vb4.a;
        xb4 xb4Var = xb4.a;
        o04 o04Var = n04.H;
        Objects.requireNonNull(o04Var);
        return (yb4[]) j14.D4(this, n3, vb4Var, xb4Var, new pb4(o04Var), mb4.a, m6());
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public Stream<yb4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // com.p7700g.p99005.j14
    public s14 t3() {
        return new s14.a().t().F(m0()).k().u().D(v6()).k().A();
    }

    public ni4 t6() {
        pi4.a u = v6().u();
        ri4 b2 = u.b(0);
        ri4[] d = u.d(6);
        d[4] = b2;
        d[3] = b2;
        d[2] = b2;
        d[1] = b2;
        d[0] = b2;
        d[5] = u.b(65535);
        return u6(d);
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: t7 */
    public yb4[] s5(j14 j14Var) throws r04 {
        bc4[] wb = O0().wb(n3(j14Var).O0());
        if (wb == null) {
            return null;
        }
        ac4.a m6 = m6();
        int length = wb.length;
        yb4[] yb4VarArr = new yb4[length];
        for (int i = 0; i < length; i++) {
            yb4VarArr[i] = m6.Q(wb[i]);
        }
        return yb4VarArr;
    }

    @Override // com.p7700g.p99005.j14
    public i54 u5() {
        return G7(bc4.e.o);
    }

    public ni4 u6(ri4[] ri4VarArr) {
        pi4.a u = v6().u();
        return u.Q(qi4.Z7(u, ri4VarArr, this));
    }

    public yb4 u7() {
        return L3();
    }

    public pi4 v6() {
        return n04.h();
    }

    @Override // com.p7700g.p99005.j14
    /* renamed from: v7 */
    public Inet4Address C5() {
        return (Inet4Address) super.C5();
    }

    @Override // com.p7700g.p99005.j14
    public o34[] w4(m14.c cVar) {
        return E6(bc4.e.c(cVar));
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    /* renamed from: w6 */
    public yb4 m() {
        return y6(true, false);
    }

    public String w7(b bVar) {
        return O0().xb(bVar);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04
    public boolean x() {
        if (!y()) {
            return N4() || P6() || I4();
        }
        cc4 D0 = D0(0);
        if (D0.s3(239)) {
            return true;
        }
        cc4 D02 = D0(1);
        cc4 D03 = D0(2);
        if (!D0.s3(224) || !D02.V1() || !D03.V1()) {
            if (!D0.s3(232)) {
                return false;
            }
            if (D02.V1() && D03.V1()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: x6 */
    public yb4 e2() {
        return y6(true, true);
    }

    public String x7(b bVar, int i) throws t14 {
        return O0().yb(bVar, i);
    }

    @Override // com.p7700g.p99005.n04
    public boolean y() {
        return D0(0).Y5(224, 4);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public x44<yb4> y0() {
        return O0().Wa(this, m6(), false);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public x44<yb4> y2(int i) {
        return O0().O7(this, m6(), i);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: y7 */
    public yb4 L3() {
        if (!C0()) {
            yb4 x = m0().x(0);
            return m0().i().f() ? x : x.k5(0);
        } else if (q3() && P4()) {
            return o();
        } else {
            return i6(O0().U7());
        }
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    public Iterator<yb4> z1() {
        Predicate<cc4[]> predicate;
        if (o4()) {
            final int intValue = K3().intValue();
            predicate = new Predicate() { // from class: com.p7700g.p99005.i74
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return yb4.this.W6(intValue, (cc4[]) obj);
                }
            };
        } else {
            predicate = null;
        }
        return O0().L8(this, m6(), predicate);
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.q04
    /* renamed from: z6 */
    public ac4 m0() {
        return n04.g();
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.p14
    /* renamed from: z7 */
    public yb4 d2(int i) {
        if (C0() && i == K3().intValue()) {
            return L3();
        }
        return i6(O0().q7(i));
    }

    public yb4(final cc4[] cc4VarArr, final Integer num) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.h74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 U3;
                U3 = ((yb4) ((n04) obj)).m6().U3(cc4VarArr, num);
                return U3;
            }
        });
        if (V0() != 4) {
            throw new c14("ipaddress.error.ipv4.invalid.segment.count", V0());
        }
    }

    @Override // com.p7700g.p99005.j14, com.p7700g.p99005.n04, com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public x44<yb4> spliterator() {
        return O0().ub(this, m6(), false);
    }

    public yb4(bc4 bc4Var) throws c14 {
        super(bc4Var);
        if (bc4Var.V0() != 4) {
            throw new c14("ipaddress.error.ipv4.invalid.segment.count", bc4Var.V0());
        }
    }

    public yb4(int i) {
        this(i, (Integer) null);
    }

    public yb4(final int i, final Integer num) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.j74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 T4;
                T4 = ((yb4) ((n04) obj)).m6().T4(i, num);
                return T4;
            }
        });
    }

    public yb4(Inet4Address inet4Address, Integer num) {
        this(inet4Address, inet4Address.getAddress(), num);
    }

    public yb4(Inet4Address inet4Address) {
        this(inet4Address, inet4Address.getAddress(), (Integer) null);
    }

    private yb4(Inet4Address inet4Address, final byte[] bArr, final Integer num) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.l74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 G3;
                G3 = ((yb4) ((n04) obj)).m6().G3(r0, 0, bArr.length, 4, num);
                return G3;
            }
        });
        O0().M(inet4Address);
    }

    public yb4(byte[] bArr) throws c14 {
        this(bArr, (Integer) null);
    }

    public yb4(byte[] bArr, int i, int i2) throws c14 {
        this(bArr, i, i2, null);
    }

    public yb4(byte[] bArr, Integer num) throws c14 {
        this(bArr, 0, bArr.length, num);
    }

    public yb4(final byte[] bArr, final int i, final int i2, final Integer num) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.k74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 G3;
                G3 = ((yb4) ((n04) obj)).m6().G3(bArr, i, i2, 4, num);
                return G3;
            }
        });
    }

    public yb4(final n04.b bVar, final n04.b bVar2, final Integer num) throws c14 {
        super(new Function() { // from class: com.p7700g.p99005.g74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                v04 x3;
                x3 = ((yb4) ((n04) obj)).m6().x3(n04.b.this, bVar2, num);
                return x3;
            }
        });
    }

    public yb4(n04.b bVar, n04.b bVar2) {
        this(bVar, bVar2, (Integer) null);
    }

    public yb4(n04.b bVar, Integer num) throws c14 {
        this(bVar, bVar, num);
    }

    public yb4(n04.b bVar) {
        this(bVar, (Integer) null);
    }
}