package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.il4;
import com.p7700g.p99005.m14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.s04;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: MACAddressSection.java */
/* loaded from: classes3.dex */
public class jl4 extends f34 implements v04, Iterable<jl4> {
    private static final long F = 4;
    private static final long[] G;
    private static final BigInteger[] H;
    private static il4.a[][] I;
    private transient d J;
    private transient f34.k<jl4> K;
    public final int L;
    public final boolean M;

    /* compiled from: MACAddressSection.java */
    /* loaded from: classes3.dex */
    public class a extends il4.a {
        private static final long x = 4;
        public final /* synthetic */ int y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(il4 il4Var, il4.a.C0196a c0196a, int i, boolean z) {
            super(il4Var, c0196a);
            jl4.this = r1;
            this.y = i;
            this.z = z;
        }

        @Override // com.p7700g.p99005.il4.a, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: p3 */
        public jl4 u(kl4[] kl4VarArr) {
            return m0().g().N(kl4VarArr, this.y, this.z);
        }
    }

    /* compiled from: MACAddressSection.java */
    /* loaded from: classes3.dex */
    public class b extends f34 {
        public final /* synthetic */ Integer F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e34[] e34VarArr, Integer num) {
            super(e34VarArr);
            jl4.this = r1;
            this.F = num;
            this.z = num;
        }
    }

    /* compiled from: MACAddressSection.java */
    /* loaded from: classes3.dex */
    public static class c extends f34.k<gl4> {
    }

    /* compiled from: MACAddressSection.java */
    /* loaded from: classes3.dex */
    public static class d extends f34.m {
        public String k;
        public String l;
        public String m;
        public String n;
        public static final f34.n d = new e.a().f(null).b(true).c(16).j();
        public static final f34.n e = new e.a().f(null).b(true).c(16).a(n04.t).j();
        public static final f34.n h = new e.a().f(':').b(true).c(16).j();
        public static final f34.n f = new e.a().f('-').b(true).c(16).i(new f34.n.b(gl4.U, n04.A, null)).j();
        public static final f34.n g = new e.a().f(':').c(16).j();
        public static final f34.n i = new e.a().f('.').b(true).c(16).j();
        public static final f34.n j = new e.a().f(Character.valueOf(gl4.R)).b(true).c(16).j();
    }

    /* compiled from: MACAddressSection.java */
    /* loaded from: classes3.dex */
    public static class e extends f34.n {

        /* compiled from: MACAddressSection.java */
        /* loaded from: classes3.dex */
        public static class a extends f34.n.a {
            public a() {
                this(16, ':');
            }

            @Override // com.p7700g.p99005.f34.n.a
            /* renamed from: k */
            public e j() {
                return new e(this.d, this.c, this.b, this.e, this.f, this.g, this.h, this.i, this.j);
            }

            public a(int i, char c) {
                super(i, c);
            }
        }

        public e(int i, boolean z, f34.n.b bVar, String str, Character ch, String str2, boolean z2, boolean z3, boolean z4) {
            super(i, z, bVar, str, ch, str2, z2, z3, z4);
        }
    }

    static {
        long[] jArr = {0, 255, av5.s, 16777215, 4294967295L, 1099511627775L, 281474976710655L, 72057594037927935L};
        G = jArr;
        H = new BigInteger[]{BigInteger.ZERO, BigInteger.valueOf(jArr[1]), BigInteger.valueOf(jArr[2]), BigInteger.valueOf(jArr[3]), BigInteger.valueOf(jArr[4]), BigInteger.valueOf(jArr[5]), BigInteger.valueOf(jArr[6]), BigInteger.valueOf(jArr[7]), BigInteger.valueOf(1L).shiftLeft(64).subtract(BigInteger.ONE)};
        I = (il4.a[][]) Array.newInstance(il4.a.class, 2, 8);
    }

    public jl4(kl4 kl4Var) {
        super(new kl4[]{kl4Var});
        this.L = 0;
        this.M = false;
    }

    public static /* synthetic */ boolean B6(gl4 gl4Var) {
        return gl4Var.getCount().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ jl4 D6(il4.a aVar, Integer num, kl4[] kl4VarArr) {
        return (jl4) f34.V(kl4VarArr, aVar, num);
    }

    public static /* synthetic */ jl4 E6(il4.a aVar, Integer num, kl4[] kl4VarArr) {
        return (jl4) f34.V(kl4VarArr, aVar, num);
    }

    /* renamed from: H5 */
    public /* synthetic */ kl4 I5(boolean z, int i) {
        return z ? D0(i).a0() : D0(i).b0();
    }

    public static /* synthetic */ boolean H6(jl4 jl4Var) {
        return jl4Var.getCount().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ long I6(int i, jl4 jl4Var) {
        return f34.q4(jl4Var, i);
    }

    /* renamed from: J5 */
    public /* synthetic */ long K5() {
        return h5(V0());
    }

    public static /* synthetic */ gl4 J6(il4.a aVar, Integer num, kl4[] kl4VarArr) {
        return (gl4) f34.U(kl4VarArr, aVar, num);
    }

    /* renamed from: L5 */
    public /* synthetic */ BigInteger M5() {
        return g5(V0());
    }

    public static /* synthetic */ boolean M6(gl4 gl4Var) {
        return gl4Var.getCount().compareTo(g24.v) <= 0;
    }

    private /* synthetic */ Iterator N5(int i) {
        return D0(i).iterator();
    }

    public static /* synthetic */ kl4 O6(kl4 kl4Var, kl4 kl4Var2, Integer num) {
        return num.intValue() == 0 ? kl4Var : kl4Var2;
    }

    /* renamed from: P5 */
    public /* synthetic */ Iterator Q5(Integer num, int i) {
        return D0(i).F1(f34.x3(u2(), num, i).intValue());
    }

    /* renamed from: R5 */
    public /* synthetic */ Iterator S5(Integer num, int i) {
        return D0(i).V2(f34.x3(u2(), num, i).intValue());
    }

    private Iterator<jl4> R6(boolean z) {
        IntFunction intFunction;
        Iterator I4;
        final Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            il4.a W4 = W4();
            boolean b1 = z ? b1() : X1().equals(BigInteger.ONE);
            int n3 = f34.n3(L0.intValue(), Z1(), u2());
            int i3 = f34.i3(L0.intValue(), Z1(), u2());
            int V0 = V0();
            if (b1) {
                I4 = null;
            } else {
                IntFunction intFunction2 = new IntFunction() { // from class: com.p7700g.p99005.lj4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        return jl4.this.D0(i).iterator();
                    }
                };
                if (z) {
                    intFunction = new IntFunction() { // from class: com.p7700g.p99005.cj4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            return jl4.this.W5(L0, i);
                        }
                    };
                } else {
                    intFunction = new IntFunction() { // from class: com.p7700g.p99005.ak4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            return jl4.this.Y5(L0, i);
                        }
                    };
                }
                I4 = f34.I4(V0, W4, null, intFunction2, null, n3, i3, intFunction);
            }
            return f34.W3(b1, this, W4, I4, L0);
        }
        return iterator();
    }

    private /* synthetic */ Iterator T5(int i) {
        return D0(i).iterator();
    }

    private jl4 U6(final boolean z) {
        jl4 u = W4().u((kl4[]) f34.B4(this, v5(), u2(), new f34.l() { // from class: com.p7700g.p99005.bk4
            @Override // com.p7700g.p99005.f34.l
            public final Object a(Object obj, Integer num, Integer num2) {
                kl4 y5;
                y5 = ((kl4) obj).y5(num, null, z);
                return y5;
            }
        }));
        u.U4(null);
        return u;
    }

    /* renamed from: V5 */
    public /* synthetic */ Iterator W5(Integer num, int i) {
        return D0(i).F1(f34.x3(u2(), num, i).intValue());
    }

    /* renamed from: X5 */
    public /* synthetic */ Iterator Y5(Integer num, int i) {
        return D0(i).V2(f34.x3(u2(), num, i).intValue());
    }

    private BigInteger Y4(int i) {
        if (!z3()) {
            return BigInteger.ONE;
        }
        long c4 = D0(0).c4();
        for (int i2 = 1; i2 < Math.min(i, 7); i2++) {
            c4 *= D0(i2).c4();
        }
        if (i == 8) {
            long c42 = D0(7).c4();
            if (c42 != 1) {
                if (c4 > 36028797018963967L) {
                    return BigInteger.valueOf(c4).multiply(BigInteger.valueOf(c42));
                }
                c4 *= c42;
            }
        }
        return BigInteger.valueOf(c4);
    }

    private jl4 Y6(int i, int i2, jl4 jl4Var, int i3, int i4, boolean z) {
        int V0 = V0();
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 0 && i6 >= 0 && i >= 0 && i3 >= 0 && i4 <= jl4Var.V0() && i2 <= V0) {
            int i7 = i6 - i5;
            int i8 = V0 + i7;
            if (this.L + i8 <= 8) {
                if (i6 == 0) {
                    if (C0()) {
                        if (!jl4Var.C0() || jl4Var.L0().intValue() > (i4 << 3) || L0().intValue() <= (i << 3)) {
                            return this;
                        }
                    } else if (!jl4Var.C0()) {
                        return this;
                    }
                }
                if (V0 == i5 && this.L == jl4Var.L && this.M == jl4Var.M && (!C0() || (jl4Var.C0() && jl4Var.L0().intValue() == 0))) {
                    return jl4Var;
                }
                jl4 jl4Var2 = (jl4) f34.D4(this, i, i2, jl4Var, i3, i4, W4(), z, true);
                if (C0()) {
                    Integer L0 = L0();
                    int i9 = i << 3;
                    if (!z && L0.intValue() <= i9) {
                        jl4Var2.U4(L0);
                    } else if (jl4Var.C0() && jl4Var.L0().intValue() <= (i4 << 3)) {
                        jl4Var2.U4(Integer.valueOf(Math.max(0, jl4Var.L0().intValue() - (i3 << 3)) + i9));
                    } else if (L0.intValue() <= (i2 << 3)) {
                        jl4Var2.U4(Integer.valueOf(i9 + (i6 << 3)));
                    } else {
                        jl4Var2.U4(Integer.valueOf(L0.intValue() + (i7 << 3)));
                    }
                } else if (jl4Var.C0() && jl4Var.L0().intValue() <= (i4 << 3)) {
                    jl4Var2.U4(Integer.valueOf(Math.max(0, jl4Var.L0().intValue() - (i3 << 3)) + (i << 3)));
                } else {
                    jl4Var2.U4(null);
                }
                return jl4Var2;
            }
            throw new c14(this, jl4Var, this.L + i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ gl4 Z5(il4.a aVar, Integer num, kl4[] kl4VarArr) {
        return (gl4) f34.U(kl4VarArr, aVar, num);
    }

    private long c5(boolean z) {
        int V0 = V0();
        long j = 0;
        for (int i = 0; i < V0; i++) {
            kl4 D0 = D0(i);
            j = (j << u2()) | (z ? D0.B1() : D0.h3());
        }
        return j;
    }

    public static /* synthetic */ Iterator d6(boolean z, boolean z2, gl4 gl4Var) {
        return (z || z2) ? gl4Var.B0() : gl4Var.F0();
    }

    public static /* synthetic */ boolean e6(gl4 gl4Var) {
        return gl4Var.X1().compareTo(g24.v) <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0015, code lost:
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0038, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006d A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:57:0x0018, B:62:0x0023, B:72:0x003e, B:74:0x005b, B:77:0x0062, B:80:0x006d, B:81:0x0072, B:78:0x0067, B:82:0x0076, B:64:0x002d, B:67:0x0034), top: B:88:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0072 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:57:0x0018, B:62:0x0023, B:72:0x003e, B:74:0x005b, B:77:0x0062, B:80:0x006d, B:81:0x0072, B:78:0x0067, B:82:0x0076, B:64:0x002d, B:67:0x0034), top: B:88:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private jl4 f5(final boolean z) {
        Integer L0;
        jl4 jl4Var = (jl4) f34.C3(this);
        if (jl4Var == null) {
            f34.k<jl4> kVar = this.K;
            if (kVar != null) {
                jl4Var = z ? kVar.a : kVar.c;
            }
            synchronized (this) {
                f34.k<jl4> kVar2 = this.K;
                boolean z2 = false;
                boolean z3 = kVar2 == null;
                if (z3) {
                    this.K = new f34.k<>();
                } else if (z) {
                    jl4Var = kVar2.a;
                    if (jl4Var == null) {
                        z2 = true;
                    }
                    z3 = z2;
                } else {
                    jl4Var = kVar2.c;
                }
                if (z3) {
                    il4.a W4 = W4();
                    kl4[] kl4VarArr = (kl4[]) f34.c1(this, W4, new IntFunction() { // from class: com.p7700g.p99005.zj4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            return jl4.this.I5(z, i);
                        }
                    });
                    if (!m0().i().f() && (L0 = L0()) != null) {
                        jl4Var = W4.t(kl4VarArr, L0, true);
                        if (!z) {
                            this.K.a = jl4Var;
                        } else {
                            this.K.c = jl4Var;
                        }
                    }
                    jl4Var = W4.u(kl4VarArr);
                    if (!z) {
                    }
                }
            }
        }
        return jl4Var;
    }

    private static BigInteger g5(int i) {
        return H[i];
    }

    public static /* synthetic */ jl4 g6(il4.a aVar, Integer num, kl4[] kl4VarArr) {
        return (jl4) f34.V(kl4VarArr, aVar, num);
    }

    private static long h5(int i) {
        return G[i];
    }

    private jl4 h7(int i, boolean z, boolean z2) {
        boolean z3;
        if (i >= 0) {
            int A0 = A0();
            if (i > A0) {
                if (i > (this.M ? 64 : 48)) {
                    throw new y14(i);
                }
                i = A0;
            }
            Integer L0 = L0();
            boolean z4 = L0 == null || L0.intValue() > i;
            boolean f = m0().i().f();
            if (z4) {
                z3 = false;
            } else {
                z3 = !z2 && L0.intValue() < i;
                if (!z3 && !f) {
                    return this;
                }
            }
            il4.a W4 = W4();
            kl4[] v5 = v5();
            int u2 = u2();
            int Z1 = Z1();
            if (f) {
                if (z4) {
                    jl4 u = W4.u((kl4[]) f34.J4(m0(), i, (kl4[]) v5.clone(), u2, Z1, W4, dl4.a));
                    u.U4(Integer.valueOf(i));
                    return u;
                } else if (!z3) {
                    return i0();
                }
            }
            kl4[] kl4VarArr = (kl4[]) v5.clone();
            int i2 = 0;
            while (true) {
                if (i2 >= kl4VarArr.length) {
                    break;
                }
                Integer p3 = f34.p3(u2(), i, i2);
                kl4VarArr[i2] = kl4VarArr[i2].y5(L0 == null ? null : f34.p3(u2(), L0.intValue(), i2), p3, z);
                if (f && p3 != null && (i2 = i2 + 1) < kl4VarArr.length) {
                    Arrays.fill(kl4VarArr, i2, kl4VarArr.length, W4.w0(0, 255));
                    break;
                }
                i2++;
            }
            jl4 u3 = W4.u(kl4VarArr);
            u3.U4(Integer.valueOf(i));
            return u3;
        }
        throw new y14(i);
    }

    public static /* synthetic */ Iterator k6(boolean z, boolean z2, jl4 jl4Var) {
        return (z || z2) ? jl4Var.B0() : jl4Var.F0();
    }

    public static /* synthetic */ boolean l6(jl4 jl4Var) {
        return jl4Var.X1().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ long m6(int i, jl4 jl4Var) {
        return f34.w4(jl4Var, i);
    }

    private /* synthetic */ kl4 o6(boolean z, int i) {
        return D0(i).d0(z);
    }

    public static String p7(m14.e eVar, l34 l34Var) {
        return t7(eVar).f0(l34Var);
    }

    /* renamed from: q6 */
    public /* synthetic */ kl4[] r6() {
        return a0().N0();
    }

    private s04.a<kl4> r5() {
        return X4(0, false);
    }

    public static String r7(f34.n nVar, f34 f34Var) {
        return t7(nVar).f0(f34Var);
    }

    private /* synthetic */ Iterator s6(int i) {
        return D0(i).iterator();
    }

    public static g24.b<l34> t7(f34.n nVar) {
        return g24.b.e0(nVar);
    }

    public static /* synthetic */ boolean w6(jl4 jl4Var) {
        return jl4Var.getCount().compareTo(g24.v) <= 0;
    }

    public static /* synthetic */ long x6(int i, jl4 jl4Var) {
        return f34.q4(jl4Var, i);
    }

    public static /* synthetic */ gl4 y6(il4.a aVar, Integer num, kl4[] kl4VarArr) {
        return (gl4) f34.U(kl4VarArr, aVar, num);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public int A0() {
        return V0() << 3;
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: A5 */
    public jl4 g0(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i <= 0) {
            return i == 0 ? this : a0().l0(j);
        }
        return b0().l0(j);
    }

    @Override // com.p7700g.p99005.v04
    public Iterator<jl4> B0() {
        return R6(false);
    }

    public jl4 B5(int i, jl4 jl4Var) {
        return X6(i, i, jl4Var, 0, jl4Var.V0());
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public boolean C0() {
        return L0() != null;
    }

    public boolean C5(boolean z) {
        return D5(z, false);
    }

    public boolean D5(boolean z, boolean z2) {
        if (F5()) {
            int V0 = V0();
            int i = this.L;
            int i2 = V0 + i;
            if (i <= 3) {
                if (i2 > 4) {
                    int i3 = 3 - i;
                    return D0(i3 + 1).s3(z ? 255 : 254) && D0(i3).s3(255);
                } else if (z2 && i2 == 4) {
                    return D0(3 - i).s3(255);
                }
            } else if (z2 && i == 4 && i2 > 4) {
                return D0(4 - i).s3(z ? 255 : 254);
            }
            return z2;
        }
        return false;
    }

    @Override // com.p7700g.p99005.q04
    public String E0() {
        String str;
        if (y5() || (str = w5().l) == null) {
            d w5 = w5();
            String q7 = q7(d.h);
            w5.l = q7;
            return q7;
        }
        return str;
    }

    public boolean E5(boolean z) {
        return V0() == (z ? 8 : 6);
    }

    @Override // com.p7700g.p99005.v04
    public Iterator<jl4> F0() {
        return R6(true);
    }

    public boolean F5() {
        return this.M;
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean G(g24 g24Var) {
        return (g24Var instanceof jl4) && super.G(g24Var);
    }

    @Override // com.p7700g.p99005.v04
    public x44<jl4> G0() {
        return T6(true);
    }

    public Iterator<gl4> G5(gl4 gl4Var, il4.a aVar) {
        boolean z = !z3();
        return f34.U3(z, gl4Var, aVar, z ? null : W0(), m0().i().f() ? null : L0());
    }

    @Override // com.p7700g.p99005.z04
    public String H3() {
        String str;
        if (y5() || (str = w5().k) == null) {
            d w5 = w5();
            String q7 = q7(d.g);
            w5.k = q7;
            return q7;
        }
        return str;
    }

    @Override // com.p7700g.p99005.z04
    public String[] I1() {
        return u1();
    }

    @Override // com.p7700g.p99005.v04
    public Stream<jl4> K0() {
        return StreamSupport.stream(y0(), false);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public Integer L0() {
        Integer num = this.z;
        if (num == null) {
            int b3 = b3();
            if (b3 == A0()) {
                this.z = g24.t;
                return null;
            }
            Integer b2 = f34.b(b3);
            this.z = b2;
            return b2;
        } else if (num.intValue() == g24.t.intValue()) {
            return null;
        } else {
            return num;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x000f, code lost:
        if (r0 == null) goto L10;
     */
    @Override // com.p7700g.p99005.q04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String N1(boolean z) throws t14 {
        String o7;
        if (!y5()) {
            d dVar = this.J;
            o7 = z ? dVar.c : dVar.b;
        }
        o7 = o7(z, null);
        if (z) {
            this.J.c = o7;
        } else {
            this.J.b = o7;
        }
        return o7;
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: N4 */
    public jl4 r0(boolean z) {
        return q0(z, true);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: O4 */
    public jl4 q0(boolean z, boolean z2) {
        return (L0() == null && z) ? this : o0(X2(z, u2(), true), z2);
    }

    public /* synthetic */ Iterator O5(int i) {
        return D0(i).iterator();
    }

    @Override // com.p7700g.p99005.v04
    public Stream<jl4> P0() {
        return StreamSupport.stream(G0(), false);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: P4 */
    public jl4 j0(int i) {
        return u0(i, true);
    }

    public long P6() {
        return c5(true);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: Q4 */
    public jl4 u0(int i, boolean z) {
        if (i == 0) {
            return this;
        }
        int D1 = D1(i, true, false);
        if (D1 > A0()) {
            return U6(z);
        }
        return o0(D1, z);
    }

    public Iterator<gl4> Q6(gl4 gl4Var, il4.a aVar, boolean z) {
        IntFunction intFunction;
        Iterator I4;
        final Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            boolean b1 = b1();
            int n3 = f34.n3(L0.intValue(), Z1(), u2());
            int i3 = f34.i3(L0.intValue(), Z1(), u2());
            int V0 = V0();
            if (b1) {
                I4 = null;
            } else {
                IntFunction intFunction2 = new IntFunction() { // from class: com.p7700g.p99005.ok4
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        return jl4.this.D0(i).iterator();
                    }
                };
                if (z) {
                    intFunction = new IntFunction() { // from class: com.p7700g.p99005.uj4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            return jl4.this.Q5(L0, i);
                        }
                    };
                } else {
                    intFunction = new IntFunction() { // from class: com.p7700g.p99005.fj4
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            return jl4.this.S5(L0, i);
                        }
                    };
                }
                I4 = f34.I4(V0, aVar, null, intFunction2, null, n3, i3, intFunction);
            }
            return f34.U3(b1, gl4Var, aVar, I4, L0);
        }
        return G5(gl4Var, aVar);
    }

    @Override // com.p7700g.p99005.z04
    public v44<jl4, kl4[]> R0() {
        jl4 jl4Var;
        final int V0 = V0();
        final Integer L0 = L0();
        final il4.a W4 = W4();
        if (m0().i().f()) {
            L0 = null;
            jl4Var = t0();
        } else {
            jl4Var = this;
        }
        final int i = V0 - 1;
        return g24.g(jl4Var, new Predicate() { // from class: com.p7700g.p99005.mk4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.kk4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return jl4.D6(il4.a.this, r2, (kl4[]) obj2);
                    }
                }, il4.a.this, ((jl4) ((g24.e) obj).a()).v5(), i, V0, L0);
                return K4;
            }
        }, ij4.a, vi4.a, hj4.a, new ToLongFunction() { // from class: com.p7700g.p99005.sk4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return jl4.x6(V0, (jl4) obj);
            }
        });
    }

    public jl4 R4(jl4 jl4Var) {
        int V0 = V0();
        return X6(V0, V0, jl4Var, 0, jl4Var.V0());
    }

    @Override // com.p7700g.p99005.z04
    public Stream<kl4[]> S0() {
        return StreamSupport.stream(R0(), false);
    }

    public jl4 S4(jl4 jl4Var) {
        jl4 jl4Var2;
        Integer L0 = L0();
        if (L0 == null) {
            return R4(jl4Var);
        }
        int u2 = u2();
        int intValue = L0.intValue() % u2;
        if (intValue != 0) {
            L0 = Integer.valueOf((u2 - intValue) + L0.intValue());
            jl4Var2 = h7(L0.intValue(), false, false);
        } else {
            jl4Var2 = this;
        }
        int intValue2 = L0.intValue() >>> 3;
        if (jl4Var.C0() && jl4Var.L0().intValue() == 0) {
            return B5(intValue2, jl4Var);
        }
        return jl4Var2.Y6(intValue2, intValue2, jl4Var, 0, jl4Var.V0(), true);
    }

    public x44<gl4> S6(gl4 gl4Var, final il4.a aVar, boolean z) {
        g24.d dVar;
        final Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            final int intValue = L0.intValue();
            final int n3 = f34.n3(intValue, Z1(), u2());
            final int i3 = f34.i3(intValue, Z1(), u2());
            Predicate predicate = new Predicate() { // from class: com.p7700g.p99005.pk4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.yj4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return jl4.Z5(il4.a.this, r2, (kl4[]) obj2);
                        }
                    }, il4.a.this, ((gl4) ((g24.e) obj).a()).O0().v5(), n3, i3, L0);
                    return K4;
                }
            };
            if (z) {
                dVar = ek4.a;
            } else {
                dVar = !M0() ? vj4.a : qj4.a;
            }
            return g24.h(gl4Var, predicate, dVar, al4.a, xk4.a, new ToLongFunction() { // from class: com.p7700g.p99005.oj4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long w4;
                    w4 = f34.w4(((gl4) obj).O0(), intValue);
                    return w4;
                }
            });
        }
        return i7(gl4Var, aVar);
    }

    @Override // com.p7700g.p99005.z04
    public /* synthetic */ boolean T0(int i) {
        return y04.g(this, i);
    }

    @Override // com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: T4 */
    public jl4 p0(int i) {
        return h7(i, true, true);
    }

    public x44<jl4> T6(boolean z) {
        g24.d dVar;
        final Integer L0 = L0();
        if (L0 != null && L0.intValue() <= A0()) {
            final int intValue = L0.intValue();
            final il4.a W4 = W4();
            final int n3 = f34.n3(intValue, Z1(), u2());
            final int i3 = f34.i3(intValue, Z1(), u2());
            Predicate predicate = new Predicate() { // from class: com.p7700g.p99005.nj4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean K4;
                    K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.tj4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return jl4.g6(il4.a.this, r2, (kl4[]) obj2);
                        }
                    }, il4.a.this, ((jl4) ((g24.e) obj).a()).v5(), n3, i3, L0);
                    return K4;
                }
            };
            if (z) {
                dVar = uk4.a;
            } else {
                dVar = !M0() ? gk4.a : fk4.a;
            }
            return g24.h(this, predicate, dVar, el4.a, pj4.a, new ToLongFunction() { // from class: com.p7700g.p99005.ej4
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return jl4.m6(intValue, (jl4) obj);
                }
            });
        }
        return spliterator();
    }

    @Override // com.p7700g.p99005.z04
    public String U0() {
        String str;
        if (y5() || (str = w5().a) == null) {
            d w5 = w5();
            String q7 = q7(d.f);
            w5.a = q7;
            return q7;
        }
        return str;
    }

    public void U4(Integer num) {
        if (num == null) {
            this.z = g24.t;
        } else if (num.intValue() >= 0) {
            int A0 = A0();
            if (num.intValue() > A0) {
                if (num.intValue() <= (this.M ? 64 : 48)) {
                    num = Integer.valueOf(A0);
                } else {
                    throw new y14(num.intValue());
                }
            }
            this.z = num;
        } else {
            throw new y14(num.intValue());
        }
    }

    public /* synthetic */ Iterator U5(int i) {
        return D0(i).iterator();
    }

    @Override // com.p7700g.p99005.z04
    public int V0() {
        return p1();
    }

    public boolean V4(jl4 jl4Var) {
        if (this.L == jl4Var.L && F5() == jl4Var.F5() && V0() == jl4Var.V0()) {
            for (int i = 0; i < V0(); i++) {
                if (!D0(i).j5(jl4Var.D0(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: V6 */
    public jl4 n0() {
        return v0(true);
    }

    @Override // com.p7700g.p99005.z04
    public Iterator<kl4[]> W0() {
        return f34.H4(V0(), r5(), z3() ? null : new Supplier() { // from class: com.p7700g.p99005.gj4
            @Override // java.util.function.Supplier
            public final Object get() {
                return jl4.this.r6();
            }
        }, new IntFunction() { // from class: com.p7700g.p99005.mj4
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return jl4.this.D0(i).iterator();
            }
        }, null);
    }

    @Override // com.p7700g.p99005.v04
    public boolean W1(v04 v04Var) {
        jl4 jl4Var;
        int i;
        int i2;
        if (!(v04Var instanceof jl4) || (i = this.L) < (i2 = (jl4Var = (jl4) v04Var).L)) {
            return false;
        }
        return f34.y4(this, jl4Var, i - i2);
    }

    public il4.a W4() {
        return X4(this.L, this.M);
    }

    @Override // com.p7700g.p99005.v04
    @Deprecated
    /* renamed from: W6 */
    public jl4 v0(boolean z) {
        return L0() == null ? this : U6(z);
    }

    public il4.a X4(int i, boolean z) {
        il4.a aVar;
        char c2;
        il4.a g = m0().g();
        boolean z2 = i < 8;
        if (z2) {
            aVar = I[z ? 1 : 0][i];
            c2 = z ? 1 : 0;
        } else {
            aVar = null;
            c2 = 0;
        }
        if (aVar == null || (!z2 && !aVar.m0().equals(m0()))) {
            a aVar2 = new a(m0(), g.v, i, z);
            if (z2) {
                I[c2][i] = aVar2;
            }
            return aVar2;
        }
        return aVar;
    }

    public jl4 X6(int i, int i2, jl4 jl4Var, int i3, int i4) {
        return Y6(i, i2, jl4Var, i3, i4, false);
    }

    @Override // com.p7700g.p99005.z04
    public int Z1() {
        return 1;
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public BigInteger Z2(int i) {
        if (i >= 0) {
            int V0 = V0();
            if (i > V0) {
                i = V0;
            }
            return Y4(i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    /* renamed from: Z4 */
    public kl4 t(int i) {
        return (kl4) super.t(i);
    }

    public jl4 Z6(int i, jl4 jl4Var) {
        return X6(i, jl4Var.V0() + i, jl4Var, 0, jl4Var.V0());
    }

    public f34 a5() {
        e34[] e34VarArr;
        int i;
        int i2 = this.L;
        int V0 = V0();
        int u2 = u2() << 1;
        int i3 = 0;
        if ((i2 & 1) == 0) {
            e34VarArr = new e34[(V0 + 1) >>> 1];
            i = 0;
        } else {
            e34VarArr = new e34[(V0 >>> 1) + 1];
            kl4 D0 = D0(0);
            e34VarArr[0] = new c34(D0.B1(), D0.h3(), u2, 16);
            i3 = 1;
            i = 1;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i4 < V0) {
                kl4 D02 = D0(i3);
                i3 = i4 + 1;
                kl4 D03 = D0(i4);
                if (D02.z3() && !D03.H0()) {
                    throw new t14(D02, i3 - 2, D03, i3 - 1, "ipaddress.error.invalid.joined.ranges");
                }
                e34VarArr[i] = new c34((D02.B1() << u2()) | D03.B1(), (D02.h3() << u2()) | D03.h3(), u2, 16);
                i++;
            } else {
                if (i3 < V0) {
                    kl4 D04 = D0(i3);
                    e34VarArr[i] = new c34(D04.B1() << u2(), D04.h3() << u2(), u2, 16);
                }
                Integer num = this.z;
                if (num == null) {
                    return new f34(e34VarArr);
                }
                return new b(e34VarArr, num);
            }
        }
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: a7 */
    public jl4 d0(final boolean z) {
        jl4 jl4Var = (jl4) f34.E4(z, this, W4(), new IntFunction() { // from class: com.p7700g.p99005.sj4
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return jl4.this.p6(z, i);
            }
        }, false);
        jl4Var.U4(null);
        return jl4Var;
    }

    public pi4 b5() {
        return n04.h();
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: b7 */
    public jl4 c0() {
        return s0();
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: c7 */
    public jl4 k0() {
        return this;
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: d5 */
    public jl4 a0() {
        return f5(true);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: d7 */
    public jl4 s0() {
        if (V0() <= 1) {
            return this;
        }
        jl4 jl4Var = (jl4) f34.G4(this, W4(), new IntFunction() { // from class: com.p7700g.p99005.fl4
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return jl4.this.D0(i);
            }
        }, false);
        jl4Var.U4(null);
        return jl4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0015, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gl4 e5(gl4 gl4Var, boolean z) {
        jl4 f5 = f5(z);
        if (f5 == this) {
            return gl4Var;
        }
        gl4 gl4Var2 = null;
        c cVar = gl4Var.G0;
        if (cVar != null) {
            gl4Var2 = (gl4) (z ? cVar.a : cVar.c);
        }
        synchronized (this) {
            c cVar2 = gl4Var.G0;
            boolean z2 = true;
            boolean z3 = cVar2 == null;
            if (z3) {
                cVar2 = new c();
                gl4Var.G0 = cVar2;
            } else if (z) {
                gl4Var2 = (gl4) cVar2.a;
                if (gl4Var2 == null) {
                    z3 = z2;
                }
                z2 = false;
                z3 = z2;
            } else {
                gl4Var2 = (gl4) cVar2.c;
                if (gl4Var2 == null) {
                    z3 = z2;
                }
                z2 = false;
                z3 = z2;
            }
            if (z3) {
                gl4 H2 = W4().H(f5);
                if (z) {
                    cVar2.a = H2;
                } else {
                    cVar2.c = H2;
                }
                gl4Var2 = H2;
            }
        }
        return gl4Var2;
    }

    public v44<gl4, kl4[]> e7(gl4 gl4Var, final il4.a aVar) {
        final int V0 = V0();
        final Integer L0 = L0();
        if (m0().i().f()) {
            L0 = null;
            gl4Var = gl4Var.t0();
        }
        gl4 gl4Var2 = gl4Var;
        final int i = V0 - 1;
        return g24.g(gl4Var2, new Predicate() { // from class: com.p7700g.p99005.dj4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.wk4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return jl4.y6(il4.a.this, r2, (kl4[]) obj2);
                    }
                }, il4.a.this, ((gl4) ((g24.e) obj).a()).O0().v5(), i, V0, L0);
                return K4;
            }
        }, rj4.a, xi4.a, nk4.a, new ToLongFunction() { // from class: com.p7700g.p99005.lk4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long q4;
                q4 = f34.q4(((gl4) obj).O0(), V0);
                return q4;
            }
        });
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jl4) {
            jl4 jl4Var = (jl4) obj;
            return this.L == jl4Var.L && F5() == jl4Var.F5() && jl4Var.G(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.v04
    public Iterable<jl4> f0() {
        return this;
    }

    @Override // com.p7700g.p99005.z04
    public /* synthetic */ boolean f1(int i) {
        return y04.c(this, i);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: f7 */
    public jl4 h0(int i) {
        return h7(i, true, false);
    }

    @Override // com.p7700g.p99005.z04
    public int g1() {
        return 255;
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public int g3() {
        return V0();
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: g7 */
    public jl4 o0(int i, boolean z) {
        return h7(i, z, false);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.l24
    public BigInteger h1(int i) {
        g24.d(this, i);
        if (z3()) {
            int n3 = f34.n3(i, Z1(), u2());
            int i2 = 0;
            long j = 1;
            while (i2 < f34.i3(i, Z1(), u2())) {
                j *= D0(i2).c4();
                i2++;
            }
            if (i2 == n3) {
                long n5 = D0(i2).n5(f34.x3(u2(), Integer.valueOf(i), i2).intValue());
                if (n5 != 1) {
                    if (j > 36028797018963967L) {
                        return BigInteger.valueOf(j).multiply(BigInteger.valueOf(n5));
                    }
                    j *= n5;
                }
            }
            return BigInteger.valueOf(j);
        }
        return BigInteger.ONE;
    }

    @Override // com.p7700g.p99005.q04
    /* renamed from: i5 */
    public il4 m0() {
        return n04.i();
    }

    public x44<gl4> i7(gl4 gl4Var, final il4.a aVar) {
        final int V0 = V0();
        final Integer L0 = L0();
        if (m0().i().f()) {
            L0 = null;
            gl4Var = gl4Var.t0();
        }
        gl4 gl4Var2 = gl4Var;
        final int i = V0 - 1;
        return g24.h(gl4Var2, new Predicate() { // from class: com.p7700g.p99005.xj4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.jj4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return jl4.J6(il4.a.this, r2, (kl4[]) obj2);
                    }
                }, il4.a.this, ((gl4) ((g24.e) obj).a()).O0().v5(), i, V0, L0);
                return K4;
            }
        }, qk4.a, xi4.a, ck4.a, new ToLongFunction() { // from class: com.p7700g.p99005.wj4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long q4;
                q4 = f34.q4(((gl4) obj).O0(), V0);
                return q4;
            }
        });
    }

    @Override // com.p7700g.p99005.v04, java.lang.Iterable
    public Iterator<jl4> iterator() {
        il4.a W4 = W4();
        boolean z = !z3();
        return f34.W3(z, this, W4, z ? null : W0(), m0().i().f() ? null : L0());
    }

    public jl4 j5() {
        int m5 = m5();
        jl4 jl4Var = (jl4) f34.t3(m5, V0(), this, X4(this.L + m5, this.M));
        Integer L0 = L0();
        if (L0 != null && m5 > 0) {
            L0 = Integer.valueOf(Math.max(0, L0.intValue() - (m5 << 3)));
        }
        jl4Var.U4(L0);
        return jl4Var;
    }

    public String j7() {
        return E0();
    }

    public int k5() {
        return V0() - m5();
    }

    public String k7() {
        return U0();
    }

    public jl4 l5() {
        int m5 = m5();
        jl4 jl4Var = (jl4) f34.t3(0, m5, this, W4());
        Integer L0 = L0();
        if (L0 != null && L0.intValue() > (m5 << 3)) {
            L0 = null;
        }
        jl4Var.U4(L0);
        return jl4Var;
    }

    public String l7() throws t14 {
        String str;
        if (y5() || (str = w5().m) == null) {
            f34 a5 = a5();
            d w5 = w5();
            String r7 = r7(d.i, a5);
            w5.m = r7;
            return r7;
        }
        return str;
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public byte[] m(boolean z) {
        int V0 = V0();
        byte[] bArr = new byte[V0];
        for (int i = 0; i < V0; i++) {
            kl4 D0 = D0(i);
            bArr[i] = (byte) (z ? D0.B1() : D0.h3());
        }
        return bArr;
    }

    @Override // com.p7700g.p99005.z04
    public void m3(int i, int i2, x04[] x04VarArr, int i3) {
        System.arraycopy(v5(), i, x04VarArr, i3, i2 - i);
    }

    public int m5() {
        return Math.max(0, 3 - this.L);
    }

    public jl4 m7(boolean z) {
        int V0 = V0();
        if (!F5()) {
            il4.a X4 = X4(this.L, true);
            int i = this.L;
            if (i + V0 < 3 || i > 3) {
                return this;
            }
            kl4[] d2 = X4.d(V0 + 2);
            int i2 = this.L;
            int i3 = 0;
            if (i2 < 3) {
                int i4 = 3 - i2;
                m3(0, i4, d2, 0);
                i3 = i4;
            }
            kl4 b2 = X4.b(255);
            d2[i3] = b2;
            int i5 = i3 + 1;
            if (!z) {
                b2 = X4.b(254);
            }
            d2[i5] = b2;
            Integer L0 = L0();
            if (V0 > i3) {
                m3(i3, V0, d2, i3 + 2);
                if (L0 != null && L0.intValue() > (i3 << 3)) {
                    L0 = Integer.valueOf(L0.intValue() + (u2() << 1));
                }
            }
            jl4 N = X4.N(d2, this.L, true);
            N.U4(L0);
            return N;
        }
        int i6 = this.L;
        int i7 = V0 + i6;
        if (i6 <= 3) {
            if (i7 > 4) {
                int i8 = 3 - i6;
                kl4 D0 = D0(i8);
                if (!D0(i8 + 1).s3(z ? 255 : 254) || !D0.s3(255)) {
                    throw new t14(this, "ipaddress.mac.error.not.eui.convertible");
                }
            } else if (i7 == 4 && !D0(3 - i6).s3(255)) {
                throw new t14(this, "ipaddress.mac.error.not.eui.convertible");
            }
        } else if (i6 == 4 && i7 > 4) {
            if (!D0(4 - i6).s3(z ? 255 : 254)) {
                throw new t14(this, "ipaddress.mac.error.not.eui.convertible");
            }
        }
        return this;
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: n5 */
    public jl4 O0() {
        return this;
    }

    public qi4 n7() {
        return b5().u().Q4(this);
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: o5 */
    public jl4 z0(int i) {
        return J0(i, V0());
    }

    public String o7(boolean z, CharSequence charSequence) throws t14 {
        if (S3()) {
            return f34.L4(g24.b.e0(z ? d.e : d.d), a0(), b0(), null);
        }
        return q7(z ? d.e : d.d);
    }

    @Override // com.p7700g.p99005.g24
    public BigInteger p() {
        return Y4(V0());
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: p5 */
    public jl4 J0(int i, int i2) {
        jl4 jl4Var = (jl4) f34.t3(i, i2, this, X4(this.L + i, this.M));
        Integer L0 = L0();
        if (L0 != null) {
            if (i > 0) {
                L0 = Integer.valueOf(Math.max(0, L0.intValue() - (i << 3)));
            }
            if (L0.intValue() > ((i2 - i) << 3)) {
                L0 = null;
            }
        }
        jl4Var.U4(L0);
        return jl4Var;
    }

    public /* synthetic */ kl4 p6(boolean z, int i) {
        return D0(i).d0(z);
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: q5 */
    public kl4 D0(int i) {
        return (kl4) super.t(i);
    }

    public String q7(f34.n nVar) {
        return r7(nVar, this);
    }

    @Override // com.p7700g.p99005.z04
    public void r2(x04[] x04VarArr) {
        m3(0, p1(), x04VarArr, 0);
    }

    public void s5(int i, int i2, Collection<? super kl4> collection) {
        while (i < i2) {
            collection.add(D0(i));
            i++;
        }
    }

    public jl4 s7() {
        int m5 = m5();
        int V0 = V0();
        Integer L0 = L0();
        int i = m5 << 3;
        boolean z = true;
        boolean z2 = L0 == null || L0.intValue() > i;
        if (!z2) {
            i = L0.intValue();
            while (m5 < V0) {
                if (!D0(m5).H0()) {
                    break;
                }
                m5++;
            }
        }
        z = z2;
        if (z) {
            il4.a W4 = W4();
            final kl4 w0 = W4.w0(0, 255);
            jl4 u = W4.u((kl4[]) f34.J4(m0(), i, N0(), u2(), Z1(), W4, new BiFunction() { // from class: com.p7700g.p99005.vk4
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return jl4.O6(kl4.this, (kl4) obj, (Integer) obj2);
                }
            }));
            u.U4(Integer.valueOf(i));
            return u;
        }
        return this;
    }

    @Override // com.p7700g.p99005.v04
    public Stream<jl4> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    public void t5(Collection<? super kl4> collection) {
        s5(0, V0(), collection);
    }

    public /* synthetic */ Iterator t6(int i) {
        return D0(i).iterator();
    }

    @Override // com.p7700g.p99005.g24
    public String toString() {
        return E0();
    }

    @Override // com.p7700g.p99005.z04
    public int u2() {
        return 8;
    }

    @Override // com.p7700g.p99005.z04
    /* renamed from: u5 */
    public kl4[] N0() {
        return (kl4[]) u().clone();
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: u7 */
    public jl4 i0() {
        Integer L0 = L0();
        if (L0 != null) {
            int u2 = u2();
            int Z1 = Z1();
            kl4[] v5 = v5();
            for (int i3 = f34.i3(L0.intValue(), Z1, u2); i3 < v5.length; i3++) {
                Integer p3 = f34.p3(u2, L0.intValue(), i3);
                kl4 kl4Var = v5[i3];
                if (p3 != null && !kl4Var.r5(p3.intValue())) {
                    il4.a W4 = W4();
                    jl4 u = W4.u((kl4[]) f34.J4(m0(), L0.intValue(), (kl4[]) v5.clone(), u2, Z1, W4, dl4.a));
                    u.U4(L0);
                    return u;
                }
            }
        }
        return this;
    }

    public kl4[] v5() {
        return (kl4[]) super.u();
    }

    public String v7() {
        String str;
        if (y5() || (str = w5().n) == null) {
            d w5 = w5();
            String q7 = q7(d.j);
            w5.n = q7;
            return q7;
        }
        return str;
    }

    public d w5() {
        return this.J;
    }

    public long w7() {
        return c5(false);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: x5 */
    public jl4 b0() {
        return f5(false);
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: x7 */
    public jl4 t0() {
        return v0(false);
    }

    @Override // com.p7700g.p99005.g24
    public BigInteger y() {
        Integer L0 = L0();
        if (L0 != null && L0.intValue() < A0()) {
            return h1(L0.intValue());
        }
        return getCount();
    }

    @Override // com.p7700g.p99005.v04
    public x44<jl4> y0() {
        return T6(false);
    }

    @Override // com.p7700g.p99005.v04
    public boolean y1(v04 v04Var) {
        return (v04Var instanceof jl4) && V4((jl4) v04Var);
    }

    public boolean y5() {
        if (this.J == null) {
            synchronized (this) {
                if (this.J == null) {
                    this.J = new d();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.v04
    /* renamed from: z5 */
    public jl4 l0(long j) {
        if (j != 0 || z3()) {
            if (F5() && V0() >= 8) {
                BigInteger value = getValue();
                BigInteger C1 = C1();
                BigInteger count = getCount();
                BigInteger valueOf = BigInteger.valueOf(j);
                f34.T(j, valueOf, value, C1, count, new Supplier() { // from class: com.p7700g.p99005.jk4
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return jl4.this.M5();
                    }
                });
                jl4 jl4Var = (jl4) f34.d1(this, j, W4(), new Supplier() { // from class: com.p7700g.p99005.cl4
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return jl4.this.a0();
                    }
                }, new Supplier() { // from class: com.p7700g.p99005.bl4
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return jl4.this.b0();
                    }
                }, m0().i().f() ? null : L0());
                if (jl4Var != null) {
                    return jl4Var;
                }
                return (jl4) f34.G3(this, j, valueOf, W4(), new Supplier() { // from class: com.p7700g.p99005.cl4
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return jl4.this.a0();
                    }
                }, new Supplier() { // from class: com.p7700g.p99005.bl4
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return jl4.this.b0();
                    }
                }, m0().i().f() ? null : L0());
            }
            f34.S(j, P6(), w7(), getCount().longValue(), new LongSupplier() { // from class: com.p7700g.p99005.ik4
                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return jl4.this.K5();
                }
            });
            return (jl4) f34.E3(this, j, W4(), getCount().longValue(), P6(), w7(), new Supplier() { // from class: com.p7700g.p99005.cl4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return jl4.this.a0();
                }
            }, new Supplier() { // from class: com.p7700g.p99005.bl4
                @Override // java.util.function.Supplier
                public final Object get() {
                    return jl4.this.b0();
                }
            }, m0().i().f() ? null : L0());
        }
        return this;
    }

    @Override // com.p7700g.p99005.v04, java.lang.Iterable
    public x44<jl4> spliterator() {
        jl4 jl4Var;
        final int V0 = V0();
        final Integer L0 = L0();
        if (m0().i().f()) {
            L0 = null;
            jl4Var = t0();
        } else {
            jl4Var = this;
        }
        final il4.a W4 = W4();
        final int i = V0 - 1;
        return g24.h(jl4Var, new Predicate() { // from class: com.p7700g.p99005.tk4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean K4;
                K4 = f34.K4(r5, new Function() { // from class: com.p7700g.p99005.rk4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return jl4.E6(il4.a.this, r2, (kl4[]) obj2);
                    }
                }, il4.a.this, ((jl4) ((g24.e) obj).a()).v5(), i, V0, L0);
                return K4;
            }
        }, dk4.a, vi4.a, hk4.a, new ToLongFunction() { // from class: com.p7700g.p99005.kj4
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return jl4.I6(V0, (jl4) obj);
            }
        });
    }

    public jl4(kl4 kl4Var, int i, boolean z) {
        this(false, new kl4[]{kl4Var}, i, z);
    }

    public jl4(kl4[] kl4VarArr) {
        this(kl4VarArr, 0, kl4VarArr.length > 6);
    }

    public jl4(kl4[] kl4VarArr, int i, boolean z) {
        this(true, kl4VarArr, i, z);
    }

    public jl4(boolean z, kl4[] kl4VarArr, int i, boolean z2) {
        super(z ? (e34[]) kl4VarArr.clone() : kl4VarArr);
        this.L = i;
        this.M = z2;
        if (i >= 0) {
            if (i <= (z2 ? 8 : 6)) {
                if (i + kl4VarArr.length > (z2 ? 8 : 6)) {
                    throw new c14(kl4VarArr.length);
                }
                return;
            }
        }
        throw new t04(i);
    }

    public jl4(n04.b bVar) {
        this(bVar, bVar, 0, false);
    }

    public jl4(n04.b bVar, int i, boolean z) {
        this(bVar, bVar, i, z);
    }

    public jl4(n04.b bVar, n04.b bVar2, int i, boolean z) {
        super(new kl4[Math.max(0, (z ? 8 : 6) - i)], false);
        f34.X0(v5(), bVar, bVar2, Z1(), u2(), m0(), null);
        if (i >= 0) {
            if (i <= (z ? 8 : 6)) {
                this.L = i;
                this.M = z;
                return;
            }
        }
        throw new t04(i);
    }

    public jl4(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this(bArr, 0, bArr.length, i, i2, z, z2);
    }

    public jl4(byte[] bArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(new kl4[i3 >= 0 ? i3 : Math.max(0, i2 - i)], false);
        kl4[] v5 = v5();
        f34.M4(v5, bArr, i, i2, Z1(), u2(), m0(), null);
        if (i4 >= 0) {
            if (i4 <= (z ? 8 : 6)) {
                this.L = i4;
                this.M = z;
                byte[] bArr2 = bArr;
                if (bArr2.length == v5.length) {
                    J(z2 ? (byte[]) bArr.clone() : bArr2);
                    return;
                }
                return;
            }
        }
        throw new t04(i4);
    }

    public jl4(byte[] bArr, int i, boolean z) {
        this(bArr, 0, bArr.length, -1, i, z, true);
    }

    public jl4(byte[] bArr) {
        this(bArr, 0, bArr.length > 6);
    }

    public jl4(long j, int i, boolean z) {
        super(new kl4[z ? 8 : 6], false);
        if (i >= 0) {
            if (i <= (z ? 8 : 6)) {
                if (!z && (j > 281474976710655L || j < 0)) {
                    throw new c14(j);
                }
                f34.x0(v5(), 0L, j, u2(), m0(), null);
                this.L = i;
                this.M = z;
                return;
            }
        }
        throw new t04(i);
    }

    public jl4(long j) {
        this(j, 0, false);
    }
}