package com.p7700g.p99005;

import com.p7700g.p99005.o04;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: Address.java */
/* loaded from: classes3.dex */
public abstract class n04 implements z04 {
    public static final String B = "¿";
    public static final char C = '%';
    private static il4 J = null;
    private static pi4 K = null;
    private static ac4 L = null;
    private static final long s = 4;
    public static final String t = "0x";
    public static final String u = "0";
    public static final char v = '-';
    public static final char x = 187;
    public final v04 M;
    public e14 N;
    public static final String w = String.valueOf('-');
    public static final String y = String.valueOf((char) 187);
    public static final char z = '*';
    public static final String A = String.valueOf((char) z);
    public static final String D = String.valueOf('%');
    public static final char E = '_';
    public static final String F = String.valueOf((char) E);
    public static final o04 G = new o04.a(true);
    public static final o04 H = new o04.b(true, false);
    public static final o04 I = new o04.b(true, true);

    /* compiled from: Address.java */
    /* loaded from: classes3.dex */
    public interface a {
        int V0();

        b W0();

        b X0();
    }

    /* compiled from: Address.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface b {
        int a(int i);
    }

    public n04(v04 v04Var) {
        this.M = v04Var;
        if (!m0().m(v04Var.m0())) {
            throw new x14(v04Var);
        }
    }

    public static ac4 g() {
        if (L == null) {
            synchronized (n04.class) {
                if (L == null) {
                    L = new ac4();
                }
            }
        }
        return L;
    }

    public static pi4 h() {
        if (K == null) {
            synchronized (n04.class) {
                if (K == null) {
                    K = new pi4();
                }
            }
        }
        return K;
    }

    public static il4 i() {
        if (J == null) {
            synchronized (n04.class) {
                if (J == null) {
                    J = new il4();
                }
            }
        }
        return J;
    }

    public static String n(String str) {
        return d14.a(str);
    }

    public boolean A(n04 n04Var) {
        return n04Var == this || O0().equals(n04Var.O0());
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return O0().A0();
    }

    @Override // com.p7700g.p99005.l24
    public byte[] A3() {
        return O0().A3();
    }

    public boolean B(n04 n04Var) {
        if (n04Var == this) {
            return true;
        }
        return O0().W1(n04Var.O0());
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Iterator<? extends n04> B0();

    @Override // com.p7700g.p99005.l24
    public boolean B3(int i) {
        return O0().B3(i);
    }

    @Override // com.p7700g.p99005.i24
    public boolean C0() {
        return O0().C0();
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger C1() {
        return O0().C1();
    }

    @Override // com.p7700g.p99005.l24
    public byte[] C2(byte[] bArr, int i) {
        return O0().C2(bArr, i);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: D */
    public abstract n04 n0();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: E */
    public abstract n04 v0(boolean z2);

    @Override // com.p7700g.p99005.q04
    public String E0() {
        return O0().E0();
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Iterator<? extends n04> F0();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: G */
    public abstract n04 d0(boolean z2);

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract x44<? extends n04> G0();

    @Override // com.p7700g.p99005.i24
    public /* synthetic */ int G2() {
        return h24.g(this);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.v04
    /* renamed from: H */
    public abstract n04 c0();

    @Override // com.p7700g.p99005.l24
    public boolean H0() {
        return O0().H0();
    }

    @Override // com.p7700g.p99005.z04
    public String H3() {
        return O0().H3();
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: I */
    public abstract n04 k0();

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.o34
    public boolean I0() {
        return O0().I0();
    }

    @Override // com.p7700g.p99005.z04
    public String[] I1() {
        return O0().I1();
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: J */
    public abstract n04 s0();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Stream<? extends n04> K0();

    public boolean K2(n04 n04Var) {
        if (n04Var == this) {
            return true;
        }
        return O0().y1(n04Var.O0());
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: L */
    public abstract n04 h0(int i);

    @Override // com.p7700g.p99005.i24
    public Integer L0() {
        return O0().L0();
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: M */
    public abstract n04 o0(int i, boolean z2);

    @Override // com.p7700g.p99005.i24
    public boolean M0() {
        return O0().M0();
    }

    public e14 N() {
        return this.N;
    }

    @Override // com.p7700g.p99005.q04
    public String N1(boolean z2) throws t14 {
        return O0().N1(z2);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: O */
    public abstract n04 i0();

    @Override // com.p7700g.p99005.z04
    public v04 O0() {
        return this.M;
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: P */
    public abstract n04 t0();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract Stream<? extends n04> P0();

    @Override // com.p7700g.p99005.l24
    public boolean P3() {
        return O0().P3();
    }

    @Override // com.p7700g.p99005.z04
    public /* synthetic */ boolean T0(int i) {
        return y04.g(this, i);
    }

    @Override // com.p7700g.p99005.z04
    public String U0() {
        return O0().U0();
    }

    @Override // com.p7700g.p99005.z04
    public int V0() {
        return O0().V0();
    }

    @Override // com.p7700g.p99005.l24
    public boolean V1() {
        return O0().V1();
    }

    @Override // com.p7700g.p99005.i24
    public BigInteger X1() {
        return O0().X1();
    }

    @Override // com.p7700g.p99005.l24
    public Integer X3() {
        return O0().X3();
    }

    @Override // com.p7700g.p99005.l24
    public boolean Y2(int i) {
        return O0().Y2(i);
    }

    @Override // com.p7700g.p99005.i24
    public BigInteger Z2(int i) {
        return O0().Z2(i);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: b */
    public abstract n04 r0(boolean z2);

    @Override // com.p7700g.p99005.i24
    public boolean b1() {
        return O0().b1();
    }

    @Override // com.p7700g.p99005.l24
    public int b3() {
        return O0().b3();
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: c */
    public abstract n04 q0(boolean z2, boolean z3);

    @Override // com.p7700g.p99005.l24, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(l24 l24Var) {
        int m4;
        m4 = m4(l24Var);
        return m4;
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: d */
    public abstract n04 j0(int i);

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: e */
    public abstract n04 u0(int i, boolean z2);

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l34, com.p7700g.p99005.r24, com.p7700g.p99005.o34
    public /* bridge */ /* synthetic */ k34 e0(int i) {
        return h24.d(this, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n04) {
            n04 n04Var = (n04) obj;
            if (u(n04Var.N)) {
                return true;
            }
            return A(n04Var);
        }
        return false;
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: f */
    public abstract n04 p0(int i);

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public abstract Iterable<? extends n04> f0();

    @Override // com.p7700g.p99005.z04
    public /* synthetic */ boolean f1(int i) {
        return y04.c(this, i);
    }

    @Override // com.p7700g.p99005.i24
    public int f4(i24 i24Var) {
        return O0().f4(i24Var);
    }

    @Override // com.p7700g.p99005.l24
    public int g3() {
        return O0().g3();
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public BigInteger getCount() {
        return O0().getCount();
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger getValue() {
        return O0().getValue();
    }

    @Override // com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public BigInteger h1(int i) {
        return O0().h1(i);
    }

    public int hashCode() {
        return O0().hashCode();
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract Iterator<? extends n04> iterator();

    @Override // com.p7700g.p99005.l24
    public byte[] l1(byte[] bArr) {
        return O0().l1(bArr);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: m */
    public abstract n04 a0();

    @Override // com.p7700g.p99005.l24
    public byte[] m1() {
        return O0().m1();
    }

    @Override // com.p7700g.p99005.z04
    public void m3(int i, int i2, x04[] x04VarArr, int i3) {
        O0().m3(i, i2, x04VarArr, i3);
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int m4(l24 l24Var) {
        return k24.a(this, l24Var);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    /* renamed from: o */
    public abstract n04 b0();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: p */
    public abstract n04 l0(long j) throws c14;

    @Override // com.p7700g.p99005.l34
    public int p1() {
        return O0().p1();
    }

    @Override // com.p7700g.p99005.z04
    public void r2(x04[] x04VarArr) {
        O0().r2(x04VarArr);
    }

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.q04, com.p7700g.p99005.e24, com.p7700g.p99005.v04, java.lang.Iterable
    public abstract x44<? extends n04> spliterator();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.e24, com.p7700g.p99005.v04
    public abstract Stream<? extends n04> stream();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    /* renamed from: t */
    public abstract n04 g0(long j) throws c14;

    @Override // com.p7700g.p99005.l24
    public byte[] t4(byte[] bArr) {
        return O0().t4(bArr);
    }

    public String toString() {
        return U0();
    }

    public abstract boolean u(e14 e14Var);

    @Override // com.p7700g.p99005.i24
    public String[] u1() {
        return O0().u1();
    }

    @Override // com.p7700g.p99005.l24
    public boolean v1() {
        return O0().v1();
    }

    @Override // com.p7700g.p99005.l24
    public byte[] v3(byte[] bArr, int i) {
        return O0().v3(bArr, i);
    }

    public abstract boolean x();

    @Override // com.p7700g.p99005.l24
    public boolean x1() {
        return O0().x1();
    }

    public abstract boolean y();

    @Override // com.p7700g.p99005.z04, com.p7700g.p99005.v04
    public abstract x44<? extends n04> y0();

    @Override // com.p7700g.p99005.l24
    public boolean z3() {
        return O0().z3();
    }

    public n04(Function<n04, v04> function) {
        v04 apply = function.apply(this);
        this.M = apply;
        if (!m0().m(apply.m0())) {
            throw new x14(apply);
        }
    }
}