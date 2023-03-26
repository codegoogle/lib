package com.p7700g.p99005;

import com.p7700g.p99005.ac4;
import com.p7700g.p99005.f34;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.o64;
import com.p7700g.p99005.pi4;
import com.p7700g.p99005.s04;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: ParsedIPAddress.java */
/* loaded from: classes3.dex */
public class w64 extends m64 implements o64 {
    private static final long O0 = 4;
    private static final f P0 = new f(true);
    private static final f Q0 = new f(false);
    private static final e[] R0 = new e[129];
    private static final e[] S0 = new e[129];
    private static final n[] T0 = new n[65];
    private static final n[] U0 = new n[65];
    private static final i[] V0 = new i[65];
    private static final i[] W0 = new i[65];
    private static final c X0 = new c(true);
    private static final c Y0 = new c(false);
    private static final h[] Z0 = new h[65];
    private static final h[] a1 = new h[65];
    private static final BigInteger b1 = new BigInteger(1, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final BigInteger c1 = new BigInteger(1, new byte[]{g15.b, 0, 0, 0, 0, 0, 0, 0});
    private static final BigInteger[] d1 = new BigInteger[64];
    private static final BigInteger[] e1 = new BigInteger[64];
    private static final BigInteger[] f1 = new BigInteger[64];
    private static final BigInteger[] g1 = new BigInteger[64];
    private final s14 h1;
    private final e14 i1;
    private m<?, ?> j1;
    private Boolean k1;
    private j[] l1;
    private j[] m1;

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public class a extends m<yb4, bc4> {
        private static final long J = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super();
            w64.this = r1;
        }

        @Override // com.p7700g.p99005.w64.m
        public s64<yb4, bc4, ?, ?> L() {
            return w64.this.Y4();
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public class b extends m<ni4, qi4> {
        private static final long J = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super();
            w64.this = r1;
        }

        @Override // com.p7700g.p99005.w64.m
        public s64<ni4, qi4, ?, ?> L() {
            return w64.this.Z4();
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class c implements Serializable {
        private static final long s = 1;
        private final boolean t;

        public c(boolean z) {
            this.t = z;
        }

        public boolean M0() {
            return this.t;
        }

        public long a(long j, long j2) {
            return j | j2;
        }

        public long b(long j, long j2) {
            return j | j2;
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class d<T extends j14> implements Serializable {
        private static final long s = 4;
        public T t;
        public T u;

        public d() {
        }

        public T f() {
            return this.t;
        }

        public T g() {
            return this.u;
        }

        public d(T t) {
            this(t, t);
        }

        public d(T t, T t2) {
            this.t = t;
            this.u = t2;
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class e extends f {
        private static final long v = 1;
        private final long w;
        private final long x;

        public e(int i, boolean z) {
            super(z);
            if (i >= 64) {
                this.x = 0L;
                this.w = (-1) >>> (i - 64);
                return;
            }
            this.x = (-1) >>> i;
            this.w = -1L;
        }

        @Override // com.p7700g.p99005.w64.j
        public long a(long j, long j2) {
            return super.a(j & (~this.w), j2);
        }

        @Override // com.p7700g.p99005.w64.j
        public long b(long j, long j2) {
            return super.b(j | this.w, j2);
        }

        @Override // com.p7700g.p99005.w64.f
        public long c(long j, long j2) {
            return super.c(j & (~this.x), j2);
        }

        @Override // com.p7700g.p99005.w64.f
        public long d(long j, long j2) {
            return super.b(j | this.x, j2);
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class f extends j {
        private static final long u = 1;

        public f(boolean z) {
            super(z);
        }

        public long c(long j, long j2) {
            return j & j2;
        }

        public long d(long j, long j2) {
            return j & j2;
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class g extends f {
        private static final long v = 1;
        private final long w;
        private final long x;
        private final long y;
        private final long z;

        public g(long j, long j2, long j3, long j4) {
            super(false);
            this.x = j2;
            this.z = j4;
            this.w = j;
            this.y = j3;
        }

        @Override // com.p7700g.p99005.w64.j
        public long a(long j, long j2) {
            return super.a(this.x, j2);
        }

        @Override // com.p7700g.p99005.w64.j
        public long b(long j, long j2) {
            return super.b(this.z, j2);
        }

        @Override // com.p7700g.p99005.w64.f
        public long c(long j, long j2) {
            return super.c(this.w, j2);
        }

        @Override // com.p7700g.p99005.w64.f
        public long d(long j, long j2) {
            return super.d(this.y, j2);
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class h extends c {
        private static final long u = 1;
        private final long v;
        public final int w;

        public h(int i, boolean z) {
            super(z);
            this.w = i;
            this.v = (-1) >>> i;
        }

        @Override // com.p7700g.p99005.w64.c
        public long a(long j, long j2) {
            return super.a(j & (~this.v), j2);
        }

        @Override // com.p7700g.p99005.w64.c
        public long b(long j, long j2) {
            return super.b(j | this.v, j2);
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class i extends j {
        private static final long u = 1;
        private final long v;
        public final int w;

        public i(int i, boolean z) {
            super(z);
            this.w = i;
            this.v = (-1) >>> i;
        }

        @Override // com.p7700g.p99005.w64.j
        public long a(long j, long j2) {
            return super.a(j & (~this.v), j2);
        }

        @Override // com.p7700g.p99005.w64.j
        public long b(long j, long j2) {
            return super.b(j | this.v, j2);
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static abstract class j implements Serializable {
        private static final long s = 1;
        private final boolean t;

        public j(boolean z) {
            this.t = z;
        }

        public boolean M0() {
            return this.t;
        }

        public long a(long j, long j2) {
            return j & j2;
        }

        public long b(long j, long j2) {
            return j & j2;
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class k extends c {
        private static final long u = 1;
        private final long v;
        private final long w;

        public k(long j, long j2) {
            super(false);
            this.v = j;
            this.w = j2;
        }

        @Override // com.p7700g.p99005.w64.c
        public long a(long j, long j2) {
            return super.a(this.v, j2);
        }

        @Override // com.p7700g.p99005.w64.c
        public long b(long j, long j2) {
            return super.b(this.w, j2);
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class l extends j {
        private static final long u = 1;
        private final long v;
        private final long w;

        public l(long j, long j2) {
            super(false);
            this.v = j;
            this.w = j2;
        }

        @Override // com.p7700g.p99005.w64.j
        public long a(long j, long j2) {
            return super.a(this.v, j2);
        }

        @Override // com.p7700g.p99005.w64.j
        public long b(long j, long j2) {
            return super.b(this.w, j2);
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public abstract class m<T extends j14, R extends m14> extends d<T> {
        private static final long v = 4;
        private t14 A;
        private t14 B;
        private t14 C;
        private t14 D;
        private q14 E;
        private T F;
        private T G;
        private r24 H;
        private R w;
        private R x;
        private R y;
        private R z;

        public m() {
            w64.this = r1;
        }

        private CharSequence N() {
            return w64.this.k3().m();
        }

        public q14 J() {
            T h = L().h(this.y, N(), null);
            this.F = h;
            if (this.z != null) {
                h = L().h(this.z, N(), null);
            }
            this.G = h;
            q14 M5 = this.F.M5(h);
            this.E = M5;
            return M5;
        }

        public abstract s64<T, R, ?, ?> L();

        public j14 M() {
            return L().h(this.y, null, null);
        }

        public boolean O() {
            return this.B == null && this.C == null && this.D == null;
        }

        public R O0() {
            return this.w;
        }

        public boolean P() {
            return this.w == null;
        }

        public boolean Q() {
            return this.H == null;
        }

        public boolean R() {
            return this.E == null;
        }

        @Override // com.p7700g.p99005.w64.d
        public T f() {
            if (this.t == null) {
                if (this.E == null) {
                    this.t = L().h(this.w, N(), w64.this.i1);
                } else {
                    this.t = L().i(this.w, N(), w64.this.i1, this.F, this.G);
                }
            }
            return this.t;
        }

        @Override // com.p7700g.p99005.w64.d
        public T g() {
            if (this.x == null) {
                return f();
            }
            if (this.u == null) {
                this.u = L().h(this.x, w64.this.k3().m(), null);
            }
            return this.u;
        }
    }

    /* compiled from: ParsedIPAddress.java */
    /* loaded from: classes3.dex */
    public static class n extends f {
        private static final long v = 1;
        private final j w;

        public n(j jVar) {
            super(jVar.M0());
            this.w = jVar;
        }

        @Override // com.p7700g.p99005.w64.j
        public long a(long j, long j2) {
            return this.w.a(j, j2);
        }

        @Override // com.p7700g.p99005.w64.j
        public long b(long j, long j2) {
            return this.w.b(j, j2);
        }
    }

    public w64(e14 e14Var, CharSequence charSequence, s14 s14Var) {
        super(charSequence);
        this.h1 = s14Var;
        this.i1 = e14Var;
    }

    public static /* synthetic */ int A5(int i2, int i3, int[] iArr, int i4) {
        if (i4 >= i2) {
            if (i4 - i2 < i3) {
                return 0;
            }
            i4 -= i3;
        }
        return (int) k64.y(i4, 10, iArr);
    }

    public static /* synthetic */ int B5(int[] iArr, int i2) {
        return (int) k64.y(i2, 2, iArr);
    }

    public static /* synthetic */ int C5(int[] iArr, int i2) {
        return (int) k64.y(i2, 10, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f D5(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        int i2;
        boolean z;
        e eVar;
        BigInteger bigInteger;
        int i3;
        long j10 = j3 ^ j5;
        if (j10 == 0) {
            j F5 = F5(j2, j4, j6, j8);
            f fVar = P0;
            if (F5 == fVar) {
                return fVar;
            }
            if (F5 instanceof i) {
                int i4 = ((i) F5).w;
                n[] nVarArr = F5.M0() ? U0 : T0;
                n nVar = nVarArr[i4];
                if (nVar == null) {
                    n nVar2 = new n(F5);
                    nVarArr[i4] = nVar2;
                    return nVar2;
                }
                return nVar;
            }
            return new n(F5);
        } else if (j3 <= j5) {
            int i5 = (j6 > j8 ? 1 : (j6 == j8 ? 0 : -1));
            if ((i5 == 0 && j7 == j9) || (j6 == 0 && j7 == 0)) {
                return P0;
            }
            int numberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
            long j11 = j7 & ((-1) >>> numberOfLeadingZeros);
            if (j11 != 0) {
                boolean z2 = j11 == 1;
                int numberOfLeadingZeros2 = Long.numberOfLeadingZeros(j11);
                int i6 = numberOfLeadingZeros2 + 1;
                long j12 = (-1) >>> i6;
                boolean z3 = z2 ? i5 == 0 : (j7 & j12) == j12 && i5 == 0;
                if (j2 == 0 && j3 == 0 && j4 == j8 && j5 == j9) {
                    if (z3) {
                        return P0;
                    }
                    return Q0;
                } else if (numberOfLeadingZeros2 > numberOfLeadingZeros) {
                    if (z3) {
                        int i7 = 64 - numberOfLeadingZeros2;
                        BigInteger[] bigIntegerArr = e1;
                        BigInteger bigInteger2 = bigIntegerArr[i7];
                        if (bigInteger2 == null) {
                            bigInteger2 = BigInteger.valueOf(1 << i7).shiftLeft(64);
                            bigIntegerArr[i7] = bigInteger2;
                        }
                        z3 = new BigInteger(1, J5(j4, j5, 16)).subtract(new BigInteger(1, J5(j2, j3, 16))).add(BigInteger.ONE).compareTo(bigInteger2) >= 0;
                    }
                    e[] eVarArr = z3 ? S0 : R0;
                    e eVar2 = eVarArr[numberOfLeadingZeros2];
                    if (eVar2 == null) {
                        e eVar3 = new e(numberOfLeadingZeros2, z3);
                        eVarArr[numberOfLeadingZeros2] = eVar3;
                        return eVar3;
                    }
                    return eVar2;
                } else if (!z3) {
                    BigInteger[] bigIntegerArr2 = g1;
                    BigInteger bigInteger3 = bigIntegerArr2[numberOfLeadingZeros2];
                    if (bigInteger3 == null) {
                        i3 = i6;
                        bigInteger3 = BigInteger.valueOf(j12).shiftLeft(64).or(new BigInteger(1, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}));
                        bigIntegerArr2[numberOfLeadingZeros2] = bigInteger3;
                    } else {
                        i3 = i6;
                    }
                    BigInteger[] bigIntegerArr3 = f1;
                    BigInteger bigInteger4 = bigIntegerArr3[numberOfLeadingZeros2];
                    if (bigInteger4 == null) {
                        bigInteger4 = bigInteger3.not();
                        bigIntegerArr3[numberOfLeadingZeros2] = bigInteger4;
                    }
                    BigInteger bigInteger5 = new BigInteger(1, J5(j4, j5, 16));
                    BigInteger bigInteger6 = new BigInteger(1, J5(j2, j3, 16));
                    BigInteger and = bigInteger5.and(bigInteger4);
                    BigInteger or = bigInteger6.or(bigInteger3);
                    BigInteger bigInteger7 = new BigInteger(1, J5(j6, j7, 16));
                    for (int i8 = (128 - i3) - 1; i8 >= 0; i8--) {
                        if (bigInteger7.testBit(i8)) {
                            BigInteger bit = and.setBit(i8);
                            if (bit.compareTo(bigInteger5) <= 0) {
                                and = bit;
                            }
                            BigInteger clearBit = or.clearBit(i8);
                            if (clearBit.compareTo(bigInteger6) >= 0) {
                                or = clearBit;
                            }
                        }
                    }
                    return new g(or.shiftRight(64).longValue(), or.longValue(), and.shiftRight(64).longValue(), and.longValue());
                } else {
                    return P0;
                }
            } else if (i2 == 0) {
                return P0;
            } else {
                int numberOfLeadingZeros3 = Long.numberOfLeadingZeros(j6);
                if (i5 != 0 && numberOfLeadingZeros3 < 63) {
                    long j13 = (-1) >>> (numberOfLeadingZeros3 + 1);
                    if ((j6 & j13) != j13) {
                        z = false;
                        if (z) {
                            if (numberOfLeadingZeros3 == 0) {
                                bigInteger = b1;
                            } else if (numberOfLeadingZeros3 == 1) {
                                bigInteger = c1;
                            } else {
                                int i9 = 64 - numberOfLeadingZeros3;
                                BigInteger[] bigIntegerArr4 = d1;
                                BigInteger bigInteger8 = bigIntegerArr4[i9];
                                if (bigInteger8 == null) {
                                    bigInteger8 = BigInteger.valueOf(1 << i9);
                                    bigIntegerArr4[i9] = bigInteger8;
                                }
                                bigInteger = bigInteger8;
                            }
                            z = new BigInteger(1, J5(j4, j5, 16)).subtract(new BigInteger(1, J5(j2, j3, 16))).add(BigInteger.ONE).compareTo(bigInteger) >= 0;
                        }
                        int i10 = numberOfLeadingZeros3 + 64;
                        e[] eVarArr2 = !z ? S0 : R0;
                        eVar = eVarArr2[i10];
                        if (eVar != null) {
                            e eVar4 = new e(i10, z);
                            eVarArr2[i10] = eVar4;
                            return eVar4;
                        }
                        return eVar;
                    }
                }
                z = true;
                if (z) {
                }
                int i102 = numberOfLeadingZeros3 + 64;
                if (!z) {
                }
                eVar = eVarArr2[i102];
                if (eVar != null) {
                }
            }
        } else {
            throw new IllegalArgumentException("value > upper value");
        }
    }

    public static j E5(long j2, long j3, long j4) {
        return F5(j2, j3, j4, -1L);
    }

    public static j F5(long j2, long j3, long j4, long j5) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 == 0) {
            return P0;
        }
        if (i2 <= 0) {
            if (j4 != 0 && j4 != j5) {
                long j6 = j2 ^ j3;
                if (j6 != 1) {
                    int numberOfLeadingZeros = Long.numberOfLeadingZeros(j6);
                    long j7 = j4 & ((-1) >>> numberOfLeadingZeros);
                    boolean z = false;
                    if (j7 != 0) {
                        int numberOfLeadingZeros2 = Long.numberOfLeadingZeros(j7);
                        long j8 = numberOfLeadingZeros2 == 63 ? 0L : (-1) >>> (numberOfLeadingZeros2 + 1);
                        boolean z2 = (j4 & j8) == j8;
                        long numberOfLeadingZeros3 = (j5 != -1 || (z2 && numberOfLeadingZeros2 <= numberOfLeadingZeros)) ? j5 : (-1) >>> Long.numberOfLeadingZeros(j3);
                        if (j2 == 0 && j3 == numberOfLeadingZeros3) {
                            if (z2) {
                                return P0;
                            }
                            return Q0;
                        } else if (numberOfLeadingZeros2 > numberOfLeadingZeros) {
                            if (!z2 || numberOfLeadingZeros2 >= 63 || (j3 - j2) + 1 >= (1 << (64 - numberOfLeadingZeros2))) {
                                z = z2;
                            }
                            i[] iVarArr = z ? W0 : V0;
                            i iVar = iVarArr[numberOfLeadingZeros2];
                            if (iVar == null) {
                                i iVar2 = new i(numberOfLeadingZeros2, z);
                                iVarArr[numberOfLeadingZeros2] = iVar2;
                                return iVar2;
                            }
                            return iVar;
                        } else if (!z2) {
                            long j9 = j3 & (~j8);
                            long j10 = j2 | j8;
                            for (long j11 = 1 << ((64 - (numberOfLeadingZeros2 + 1)) - 1); j11 != 0; j11 >>>= 1) {
                                if ((j4 & j11) != 0) {
                                    long j12 = j9 | j11;
                                    if (j12 <= j3) {
                                        j9 = j12;
                                    }
                                    long j13 = (~j11) & j10;
                                    if (j13 >= j2) {
                                        j10 = j13;
                                    }
                                }
                            }
                            return new l(j10, j9);
                        }
                    }
                }
                return P0;
            }
            return P0;
        }
        throw new IllegalArgumentException("value > upper value");
    }

    /* JADX WARN: Code restructure failed: missing block: B:572:0x01c0, code lost:
        if (r12 >= r13) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x01c3, code lost:
        if (r13 != 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x01c6, code lost:
        r6 = r20;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x01ca, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:?, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x01d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0303  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:721:0x030d -> B:716:0x0301). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Boolean G5(String str, int[] iArr) {
        boolean z;
        boolean z2;
        int o;
        int intValue;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int o2;
        int i9;
        char c2;
        char c3;
        int i10;
        char c4;
        boolean z4;
        int i11;
        int i12;
        int i13;
        char c5;
        int i14;
        char charAt;
        char charAt2;
        int i15;
        int length = str.length();
        boolean o3 = o3();
        if (length < 4 || !(str.charAt(length - 2) == '/' || str.charAt(length - 3) == '/' || (!o3 && str.charAt(length - 4) == '/'))) {
            k64 j3 = j3();
            Integer c22 = c2();
            if (c22 == null) {
                int i16 = o3 ? 4 : 8;
                i4 = i16 - 1;
                i5 = k64.o(i4, 15, iArr);
                if (length > i5) {
                    return null;
                }
                i7 = i16;
                z2 = false;
                z3 = false;
            } else if (c22.intValue() != 0) {
                if (o3) {
                    i4 = t64.e(c22.intValue(), 1, 8);
                    o = k64.o(i4, 15, iArr);
                    boolean z5 = t64.f(8, c22.intValue(), i4).intValue() != 8;
                    i2 = i4 + 1;
                    int i17 = o + 1;
                    o2 = z5 ? k64.o(i4, 6, iArr) : 0;
                    z3 = z5;
                    i3 = i17;
                    i7 = 4;
                    z2 = false;
                    intValue = 0;
                    z = false;
                } else {
                    int e2 = t64.e(c22.intValue(), 2, 16);
                    int V02 = 8 - j3.V0();
                    int i18 = i();
                    z = i18 <= e2;
                    z2 = z && i18 + V02 >= e2;
                    Integer f2 = t64.f(16, c22.intValue(), e2);
                    if (z2) {
                        z3 = f2.intValue() != 16;
                        int i19 = e2 + 1;
                        int o4 = k64.o(i18, 15, iArr) + 1;
                        int o5 = (!z3 || i18 <= 0) ? 0 : k64.o(i18, 6, iArr);
                        i3 = o4 + 1;
                        i6 = i19;
                        intValue = 0;
                        i8 = o5;
                        i5 = o4;
                        i4 = e2;
                    } else {
                        int i20 = i18 < e2 ? e2 - V02 : e2;
                        o = k64.o(i20, 15, iArr);
                        intValue = 4 - ((f2.intValue() + 3) >> 2);
                        if (intValue > 0) {
                            int o6 = k64.o(i20, 14, iArr);
                            if (o6 + intValue > o) {
                                intValue = o - o6;
                            }
                            i8 = k64.o(i20, 6, iArr);
                            i4 = e2;
                            i3 = o6;
                            i5 = o - intValue;
                            z3 = true;
                            i6 = i4;
                        } else {
                            z3 = f2.intValue() != 16;
                            i2 = i20 + 1;
                            i3 = o + 1;
                            if (z3) {
                                o2 = k64.o(i20, 6, iArr);
                                i4 = e2;
                                i7 = 8;
                            } else {
                                i4 = e2;
                                i5 = o;
                                i6 = i2;
                                i7 = 8;
                                i8 = 0;
                                CharSequence charSequence = this.A0;
                                i9 = 0;
                                int i21 = 0;
                                boolean z6 = false;
                                while (i9 < i5) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (i9 < length) {
                                        i10 = i4;
                                        c4 = str.charAt(i9);
                                    } else {
                                        i10 = i4;
                                        c4 = 0;
                                    }
                                    if (charAt3 != c4) {
                                        z4 = z2;
                                        if ((charAt3 < '1' || charAt3 > '9') && (charAt3 < 'a' || charAt3 > 'f')) {
                                            if (charAt3 < 'A' || charAt3 > 'F') {
                                                if (charAt3 > '-' || charAt3 < '%') {
                                                    i11 = intValue;
                                                    if (charAt3 == '_') {
                                                        return null;
                                                    }
                                                    if (c4 >= 'A' || c4 > 'F' || c4 != ((char) (c4 + gl4.R))) {
                                                        Boolean bool = null;
                                                        i13 = i21;
                                                        if (!B(i13)) {
                                                            return bool;
                                                        }
                                                        if ((c4 < '1' || c4 > '9') && (c4 < 'a' || c4 > 'f')) {
                                                            if (c4 > '-' || c4 < '%') {
                                                                if (c4 == '_') {
                                                                    return null;
                                                                }
                                                            } else if (c4 == '*' || c4 == '-' || c4 == '%') {
                                                                return null;
                                                            }
                                                            if (z6) {
                                                                c5 = ':';
                                                            } else if (charAt3 == '0') {
                                                                c5 = ':';
                                                                if (c4 == ':' || c4 == 0) {
                                                                    return null;
                                                                }
                                                                int i22 = i9 + 1;
                                                                if (i22 < charSequence.length() && (charAt2 = charSequence.charAt(i22)) != '.' && charAt2 != ':') {
                                                                    return null;
                                                                }
                                                            } else {
                                                                c5 = ':';
                                                                if (c4 == '0') {
                                                                    if (charAt3 == ':') {
                                                                        return null;
                                                                    }
                                                                    int i23 = i9 + 1;
                                                                    if (i23 >= length || (charAt = str.charAt(i23)) == '.' || charAt == ':') {
                                                                        return Boolean.FALSE;
                                                                    }
                                                                    return null;
                                                                }
                                                            }
                                                            if (c4 == c5) {
                                                                return Boolean.FALSE;
                                                            }
                                                            if (c4 == '.') {
                                                                if (o3) {
                                                                    i14 = i13 + 1;
                                                                    for (i15 = i9 + 1; i15 < length; i15++) {
                                                                        char charAt4 = str.charAt(i15);
                                                                        if (charAt4 == ':') {
                                                                            return Boolean.FALSE;
                                                                        }
                                                                        if (charAt4 <= '/' && charAt4 >= '%') {
                                                                            if (charAt4 == '.') {
                                                                                if (!o3) {
                                                                                    return null;
                                                                                }
                                                                                i14++;
                                                                            } else if (charAt4 == '/' || charAt4 == '*' || charAt4 == '-' || charAt4 == '%' || charAt4 == '_') {
                                                                                return null;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o3) {
                                                                        if (i14 > 0) {
                                                                            return Boolean.FALSE;
                                                                        }
                                                                        return null;
                                                                    } else if (i14 + 1 == 4) {
                                                                        return Boolean.FALSE;
                                                                    } else {
                                                                        return null;
                                                                    }
                                                                }
                                                                return null;
                                                            }
                                                        }
                                                        i14 = i13;
                                                        while (i15 < length) {
                                                        }
                                                        if (o3) {
                                                        }
                                                    }
                                                    i12 = i21;
                                                } else if (charAt3 == '*' || charAt3 == '-' || charAt3 == '%') {
                                                    return null;
                                                }
                                            } else if (charAt3 == ((char) (charAt3 + gl4.R))) {
                                                i11 = intValue;
                                                i12 = i21;
                                            }
                                        }
                                        i11 = intValue;
                                        if (c4 >= 'A') {
                                        }
                                        Boolean bool2 = null;
                                        i13 = i21;
                                        if (!B(i13)) {
                                        }
                                    } else {
                                        z4 = z2;
                                        i11 = intValue;
                                        i12 = i21;
                                        if (charAt3 != '0') {
                                            if (charAt3 == ':' || charAt3 == '.') {
                                                i21 = i12 + 1;
                                                z6 = false;
                                            } else {
                                                i21 = i12;
                                                z6 = true;
                                            }
                                            i9++;
                                            i4 = i10;
                                            z2 = z4;
                                            intValue = i11;
                                        }
                                    }
                                    i21 = i12;
                                    i9++;
                                    i4 = i10;
                                    z2 = z4;
                                    intValue = i11;
                                }
                                boolean z7 = z2;
                                int i24 = i4;
                                int i25 = intValue;
                                if (c22 != null) {
                                    if (i5 != length) {
                                        Boolean bool3 = null;
                                        if (o3) {
                                            if (c22.intValue() != 0) {
                                                int i26 = i5 + i25;
                                                if (length < i26) {
                                                    return null;
                                                }
                                                if (length != i26) {
                                                    c3 = '.';
                                                    if (str.charAt(i26) != '.') {
                                                        return null;
                                                    }
                                                    if (i5 < i26) {
                                                        if (str.charAt(i5) == c3) {
                                                            return bool3;
                                                        }
                                                        i5++;
                                                        bool3 = null;
                                                    }
                                                }
                                                c3 = '.';
                                                if (i5 < i26) {
                                                }
                                            }
                                            boolean z8 = false;
                                            int i27 = 0;
                                            int i28 = 0;
                                            for (int i29 = i3; i29 < length; i29++) {
                                                char charAt5 = str.charAt(i29);
                                                if (charAt5 <= '9' && charAt5 >= '0') {
                                                    if (i27 == 0 && charAt5 >= '3') {
                                                        z8 = true;
                                                    }
                                                    i27++;
                                                } else if (charAt5 != '.') {
                                                    return null;
                                                } else {
                                                    if (i27 == 0) {
                                                        return Boolean.FALSE;
                                                    }
                                                    if (z8) {
                                                        if (i27 >= 3) {
                                                            return Boolean.FALSE;
                                                        }
                                                    } else if (i27 > 3) {
                                                        return null;
                                                    }
                                                    i28++;
                                                    z8 = false;
                                                    i27 = 0;
                                                }
                                            }
                                            if (i27 == 0) {
                                                return Boolean.FALSE;
                                            }
                                            if (i27 > 3) {
                                                return null;
                                            }
                                            if ((z8 && i27 == 3) || i6 + i28 + 1 != i7) {
                                                return null;
                                            }
                                        } else {
                                            Boolean bool4 = null;
                                            if (c22.intValue() != 0) {
                                                int i30 = i5 + i25;
                                                if (length < i30) {
                                                    return null;
                                                }
                                                if (length != i30) {
                                                    c2 = ':';
                                                    if (str.charAt(i30) != ':') {
                                                        return null;
                                                    }
                                                } else {
                                                    c2 = ':';
                                                }
                                                while (i5 < i30) {
                                                    if (str.charAt(i5) == c2) {
                                                        return bool4;
                                                    }
                                                    i5++;
                                                    c2 = ':';
                                                    bool4 = null;
                                                }
                                            }
                                            int i31 = i3;
                                            int i32 = 0;
                                            int i33 = 0;
                                            while (i31 < length) {
                                                char charAt6 = str.charAt(i31);
                                                if (charAt6 > '9' || charAt6 < '0') {
                                                    if ((charAt6 < 'a' || charAt6 > 'f') && (charAt6 < 'A' || charAt6 > 'F')) {
                                                        if (charAt6 == '.' || charAt6 != ':' || i32 > 4) {
                                                            return null;
                                                        }
                                                        if (i32 != 0) {
                                                            i32 = 0;
                                                        } else if (z) {
                                                            return Boolean.FALSE;
                                                        } else {
                                                            z = true;
                                                        }
                                                        i33++;
                                                        i31++;
                                                    }
                                                    i32++;
                                                } else {
                                                    i32++;
                                                }
                                                i31++;
                                            }
                                            if (i32 == 0) {
                                                int i34 = i31 - 1;
                                                if (i34 < 0) {
                                                    return Boolean.FALSE;
                                                }
                                                if (str.charAt(i34) != ':') {
                                                    return Boolean.FALSE;
                                                }
                                            } else if (i32 > 4) {
                                                return null;
                                            }
                                            int i35 = i6 + i33 + 1;
                                            if (i35 > i7) {
                                                return null;
                                            }
                                            if (i35 < i7 && !z) {
                                                return null;
                                            }
                                            if (z7 && i7 - i33 <= i24) {
                                                return null;
                                            }
                                        }
                                    } else if (i6 != i7 && (!z || i6 > i7)) {
                                        return null;
                                    }
                                }
                                return Boolean.TRUE;
                            }
                        }
                    }
                    i7 = 8;
                    CharSequence charSequence2 = this.A0;
                    i9 = 0;
                    int i212 = 0;
                    boolean z62 = false;
                    while (i9 < i5) {
                    }
                    boolean z72 = z2;
                    int i242 = i4;
                    int i252 = intValue;
                    if (c22 != null) {
                    }
                    return Boolean.TRUE;
                }
                int i36 = i2;
                i8 = o2;
                i5 = o;
                i6 = i36;
                CharSequence charSequence22 = this.A0;
                i9 = 0;
                int i2122 = 0;
                boolean z622 = false;
                while (i9 < i5) {
                }
                boolean z722 = z2;
                int i2422 = i4;
                int i2522 = intValue;
                if (c22 != null) {
                }
                return Boolean.TRUE;
            } else {
                i7 = o3 ? 4 : 8;
                i5 = 0;
                z2 = false;
                z3 = false;
                i4 = 0;
            }
            i6 = 0;
            intValue = 0;
            i8 = 0;
            z = false;
            i3 = 0;
            CharSequence charSequence222 = this.A0;
            i9 = 0;
            int i21222 = 0;
            boolean z6222 = false;
            while (i9 < i5) {
            }
            boolean z7222 = z2;
            int i24222 = i4;
            int i25222 = intValue;
            if (c22 != null) {
            }
            return Boolean.TRUE;
        }
        return null;
    }

    private static <S extends n14> S[] H4(S[] sArr, S[] sArr2, s04.a<S> aVar, int i2, int i3) {
        if (sArr == null) {
            sArr = aVar.d(i2);
            if (i3 > 0) {
                System.arraycopy(sArr2, 0, sArr, 0, i3);
            }
        }
        return sArr;
    }

    private boolean H5() {
        Boolean bool = this.k1;
        if (bool != null) {
            return bool.booleanValue();
        }
        int V02 = j3().V0();
        if (o3()) {
            if (V02 != 4) {
                this.k1 = Boolean.TRUE;
                return true;
            }
        } else if (r4() || (V02 != 8 && !C3())) {
            this.k1 = Boolean.TRUE;
            return true;
        }
        j14 e3 = e3();
        if (e3 != null && e3.E3(true) == null) {
            this.k1 = Boolean.TRUE;
            return true;
        }
        this.k1 = Boolean.FALSE;
        return false;
    }

    public static c I4(long j2, long j3, long j4) {
        return J4(j2, j3, j4, -1L);
    }

    public static byte[] I5(long j2, long j3, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2 - 8;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (i4 >= i3) {
                bArr[i4] = (byte) (255 & j2);
                j2 >>>= 8;
            } else {
                bArr[i4] = (byte) (255 & j3);
                j3 >>>= 8;
            }
        }
        return bArr;
    }

    public static c J4(long j2, long j3, long j4, long j5) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 == 0) {
            return X0;
        }
        if (i2 <= 0) {
            if (j4 != 0 && j4 != j5) {
                long j6 = j2 ^ j3;
                if (j6 != 1) {
                    int numberOfLeadingZeros = Long.numberOfLeadingZeros(j6);
                    long j7 = (-1) >>> numberOfLeadingZeros;
                    long j8 = j4 & j7;
                    boolean z = false;
                    if (j8 != j7) {
                        int numberOfLeadingZeros2 = Long.numberOfLeadingZeros(j7 & (~j8));
                        long j9 = numberOfLeadingZeros2 == 63 ? 0L : (-1) >>> (numberOfLeadingZeros2 + 1);
                        boolean z2 = (j4 & j9) == 0;
                        long numberOfLeadingZeros3 = (j5 != -1 || (z2 && numberOfLeadingZeros2 <= numberOfLeadingZeros)) ? j5 : (-1) >>> Long.numberOfLeadingZeros(j3);
                        if (j2 == 0 && j3 == numberOfLeadingZeros3) {
                            if (z2) {
                                return X0;
                            }
                            return Y0;
                        } else if (numberOfLeadingZeros2 > numberOfLeadingZeros) {
                            if (!z2 || numberOfLeadingZeros2 >= 63 || (j3 - j2) + 1 >= (1 << (64 - numberOfLeadingZeros2))) {
                                z = z2;
                            }
                            h[] hVarArr = z ? a1 : Z0;
                            h hVar = hVarArr[numberOfLeadingZeros2];
                            if (hVar == null) {
                                h hVar2 = new h(numberOfLeadingZeros2, z);
                                hVarArr[numberOfLeadingZeros2] = hVar2;
                                return hVar2;
                            }
                            return hVar;
                        } else if (!z2) {
                            long j10 = j3 & (~j9);
                            long j11 = j2 | j9;
                            for (long j12 = 1 << ((64 - (numberOfLeadingZeros2 + 1)) - 1); j12 != 0; j12 >>>= 1) {
                                if ((j4 & j12) == 0) {
                                    long j13 = j10 | j12;
                                    if (j13 <= j3) {
                                        j10 = j13;
                                    }
                                    long j14 = (~j12) & j11;
                                    if (j14 >= j2) {
                                        j11 = j14;
                                    }
                                }
                            }
                            return new k(j11, j10);
                        }
                    }
                }
                return X0;
            }
            return X0;
        }
        throw new IllegalArgumentException("value > upper value");
    }

    public static byte[] J5(long j2, long j3, int i2) {
        int i3 = i2 - 8;
        int i4 = i2 + i3;
        int i5 = 1;
        int i6 = i2;
        while (i5 <= i2) {
            if (((byte) (i5 <= i3 ? j3 >>> ((i2 - i5) << 3) : j2 >>> ((i4 - i5) << 3))) != 0) {
                break;
            }
            i6--;
            i5++;
        }
        return I5(j2, j3, i6);
    }

    private static Integer K4(int i2) {
        return t64.a(i2);
    }

    private static boolean L4(m14 m14Var, int i2, int i3) {
        if (m14Var == null || i2 >= i3) {
            return false;
        }
        boolean z3 = m14Var.D0(i2).z3();
        do {
            i2++;
            n14 D0 = m14Var.D0(i2);
            if (z3) {
                if (!D0.H0()) {
                    return true;
                }
            } else {
                z3 = D0.z3();
                continue;
            }
        } while (i2 < i3);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0136, code lost:
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Boolean M4(w64 w64Var, boolean z, boolean z2) {
        int i2;
        int i3;
        l14<?, ?, ?, ?, ?> m0;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        Integer num;
        boolean z6;
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z8;
        long y;
        long y2;
        int i13;
        long y3;
        int i14;
        long j2;
        int i15;
        int i16;
        k64 j3 = j3();
        k64 j32 = w64Var.j3();
        int[] t = j3.t();
        int[] t2 = j32.t();
        if (t == null || t2 == null) {
            return null;
        }
        if (H5() || w64Var.H5()) {
            return null;
        }
        if (!w2().equals(w64Var.w2())) {
            return Boolean.FALSE;
        }
        int V02 = j3.V0();
        int V03 = j32.V0();
        s14 Y02 = Y0();
        int i17 = 8;
        if (o3()) {
            i2 = 255;
            m0 = Y02.o().m0();
            i17 = 4;
            i4 = 1;
            i3 = 8;
            z3 = true;
            z4 = true;
        } else {
            i2 = 65535;
            i3 = 16;
            m0 = Y02.p().m0();
            z3 = 8 == V02;
            z4 = 8 == V03;
            i4 = 2;
        }
        s04.c i18 = m0.i();
        boolean h2 = i18.h();
        boolean f2 = i18.f();
        Integer c2 = c2();
        Integer c22 = w64Var.c2();
        if (c2 != null) {
            if (z) {
                int c3 = t64.c(c2.intValue(), i4, i3);
                i5 = V03;
                i6 = t64.e(c2.intValue(), i4, i3);
                z7 = z3;
                z5 = z4;
                i8 = c3;
                i7 = i8;
                z6 = z;
                num = c2;
            } else {
                int c4 = t64.c(c2.intValue(), i4, i3);
                int e2 = t64.e(c2.intValue(), i4, i3);
                if (f2 || (h2 && f5(c2, m0, t))) {
                    i5 = V03;
                    i6 = e2;
                    z5 = z4;
                    i7 = c4;
                    if (z2) {
                        num = null;
                        z6 = z;
                    } else {
                        z6 = true;
                        num = null;
                    }
                    z7 = z3;
                    i8 = i17;
                } else {
                    i5 = V03;
                    i6 = e2;
                    z7 = z3;
                    z5 = z4;
                    num = null;
                    z6 = z;
                }
            }
            int i19 = i17;
            if (c22 != null || (num != null && c22.intValue() >= num.intValue())) {
                c22 = num;
            } else {
                int c5 = t64.c(c22.intValue(), i4, i3);
                if (c5 < i8 && (f2 || (h2 && w64Var.f5(c22, m0, t2)))) {
                    i8 = c5;
                }
            }
            i9 = 0;
            i10 = 0;
            int i20 = 0;
            i11 = 0;
            i12 = 0;
            while (true) {
                if ((i11 >= V02 || i12 > 0) && (!z6 || i9 <= i6)) {
                    int i21 = i6;
                    long j4 = 0;
                    if (i12 <= 0) {
                        z8 = z6;
                        y = 0;
                        y2 = 0;
                    } else {
                        z8 = z6;
                        y = k64.y(i11, 2, t);
                        y2 = k64.y(i11, 10, t);
                    }
                    if (i9 < i7) {
                        Integer g2 = t64.g(i3, c2, i9);
                        i13 = V02;
                        y &= m0.M(g2.intValue());
                        y2 |= m0.L(g2.intValue());
                    } else {
                        i13 = V02;
                    }
                    if (i9 <= i8) {
                        j2 = i2;
                        i14 = i10;
                    } else {
                        if (i20 > 0) {
                            y3 = 0;
                        } else {
                            long y4 = k64.y(i10, 2, t2);
                            y3 = k64.y(i10, 10, t2);
                            j4 = y4;
                        }
                        if (i9 == i8) {
                            Integer g3 = t64.g(i3, c22, i9);
                            i14 = i10;
                            j4 &= m0.M(g3.intValue());
                            j2 = y3 | m0.L(g3.intValue());
                        } else {
                            i14 = i10;
                            j2 = y3;
                        }
                    }
                    int i22 = (y > j4 ? 1 : (y == j4 ? 0 : -1));
                    if (!z2 ? i22 > 0 || y2 < j2 : !(i22 == 0 && y2 == j2)) {
                        break;
                    }
                    if (!z7) {
                        if (i12 > 0) {
                            i12--;
                            if (i12 == 0) {
                                z7 = true;
                            }
                        } else if (G3(i11, t)) {
                            i11++;
                            i12 = i19 - i13;
                        }
                        if (z5) {
                            if (i20 > 0) {
                                i20--;
                                i16 = i14;
                                if (i20 == 0) {
                                    z5 = true;
                                }
                            } else {
                                i15 = i14;
                                if (w64Var.G3(i15, t2)) {
                                    i16 = i15 + 1;
                                    i20 = i19 - i5;
                                }
                            }
                            i9++;
                            z6 = z8;
                            i10 = i16;
                            i6 = i21;
                            V02 = i13;
                        } else {
                            i15 = i14;
                        }
                        i16 = i15 + 1;
                        i9++;
                        z6 = z8;
                        i10 = i16;
                        i6 = i21;
                        V02 = i13;
                    }
                    i11++;
                    if (z5) {
                    }
                    i16 = i15 + 1;
                    i9++;
                    z6 = z8;
                    i10 = i16;
                    i6 = i21;
                    V02 = i13;
                }
            }
            return Boolean.FALSE;
        }
        i5 = V03;
        z7 = z3;
        z5 = z4;
        i6 = i17 - 1;
        z6 = false;
        num = null;
        i8 = i17;
        i7 = i8;
        int i192 = i17;
        if (c22 != null) {
        }
        c22 = num;
        i9 = 0;
        i10 = 0;
        int i202 = 0;
        i11 = 0;
        i12 = 0;
        while (true) {
            if (i11 >= V02) {
            }
            int i212 = i6;
            long j42 = 0;
            if (i12 <= 0) {
            }
            if (i9 < i7) {
            }
            if (i9 <= i8) {
            }
            int i222 = (y > j42 ? 1 : (y == j42 ? 0 : -1));
            if (!z2) {
                break;
            }
            break;
            i9++;
            z6 = z8;
            i10 = i16;
            i6 = i212;
            V02 = i13;
        }
        return Boolean.FALSE;
    }

    public static j14 O4(j14.b bVar, v64 v64Var, e14 e14Var, s14 s14Var) {
        int y4 = j14.y4(bVar);
        j14 g2 = v64Var.g();
        j14 j14Var = (g2 == null || g2.E3(true) == null) ? g2 : null;
        boolean z = j14Var != null;
        Integer a5 = a5(v64Var);
        if (bVar.f()) {
            ac4.a u = s14Var.o().m0().u();
            cc4[] cc4VarArr = (cc4[]) u.d(y4);
            int i2 = 0;
            while (i2 < y4) {
                int i3 = i2;
                cc4[] cc4VarArr2 = cc4VarArr;
                cc4VarArr2[i3] = (cc4) P4(bVar, 0, 255, i2, c5(i2, bVar, v64Var), z ? K4(j14Var.D0(i2).B1()) : null, u);
                i2 = i3 + 1;
                cc4VarArr = cc4VarArr2;
            }
            return (j14) u.n(cc4VarArr, e14Var, a5);
        }
        pi4.a u2 = s14Var.p().m0().u();
        ri4[] ri4VarArr = (ri4[]) u2.d(y4);
        int i4 = 0;
        while (i4 < y4) {
            int i5 = i4;
            ri4VarArr[i5] = (ri4) P4(bVar, 0, 65535, i4, c5(i4, bVar, v64Var), z ? K4(j14Var.D0(i4).B1()) : null, u2);
            i4 = i5 + 1;
        }
        return (j14) u2.o(ri4VarArr, v64Var.m(), e14Var, a5);
    }

    private static <S extends n14> S P4(j14.b bVar, int i2, int i3, int i4, Integer num, Integer num2, s64<?, ?, ?, S> s64Var) {
        int i5;
        int i6;
        if (num2 != null) {
            long j2 = i2;
            long j3 = i3;
            long intValue = num2.intValue();
            j F5 = F5(j2, j3, intValue, s64Var.E());
            if (F5.M0()) {
                int a2 = (int) F5.a(j2, intValue);
                i6 = (int) F5.b(j3, intValue);
                i5 = a2;
            } else {
                throw new t14(j2, j3, intValue, "ipaddress.error.maskMismatch");
            }
        } else {
            i5 = i2;
            i6 = i3;
        }
        return (S) S4(null, bVar, i5, i6, false, null, i4, num, s64Var);
    }

    private void Q4(boolean z, boolean z2, boolean z3) throws t14 {
        cc4[] d2;
        cc4[] cc4VarArr;
        m mVar;
        boolean z4;
        final cc4[] cc4VarArr2;
        final cc4[] cc4VarArr3;
        cc4[] cc4VarArr4;
        int i2;
        int i3;
        CharSequence charSequence;
        bc4 bc4Var;
        cc4[] cc4VarArr5;
        int i4;
        int i5;
        v64 v64Var;
        long j2;
        j14 j14Var;
        boolean z5;
        m mVar2;
        int i6;
        ac4.a aVar;
        k64 k64Var;
        boolean z6;
        ac4.a aVar2;
        long j3;
        m mVar3;
        j14 j14Var2;
        int i7;
        long j4;
        long j5;
        long j6;
        boolean z7;
        v64 v64Var2;
        int i8;
        boolean z8;
        v64 v64Var3;
        int i9;
        cc4[] cc4VarArr6;
        j14 j14Var3;
        cc4[] cc4VarArr7;
        ac4.a aVar3;
        long j7;
        m mVar4;
        cc4[] cc4VarArr8;
        cc4[] cc4VarArr9;
        cc4[] cc4VarArr10;
        cc4[] cc4VarArr11;
        long j8;
        long j9;
        m mVar5;
        int i10;
        long j10;
        cc4[] cc4VarArr12;
        int i11;
        int i12;
        k64 k64Var2;
        m mVar6;
        long j11;
        long j12;
        v64 v64Var4;
        long j13;
        int i13;
        int i14;
        int i15;
        long j14;
        ac4.a aVar4;
        int i16;
        boolean z9;
        cc4[] cc4VarArr13;
        k64 k64Var3;
        cc4[] cc4VarArr14;
        int i17;
        m mVar7;
        int i18;
        j14 j14Var4;
        cc4[] cc4VarArr15;
        cc4[] cc4VarArr16;
        ac4.a aVar5;
        cc4[] cc4VarArr17;
        int i19;
        int i20;
        int i21;
        w64 w64Var = this;
        v64 k3 = k3();
        j14 e3 = e3();
        j14 j14Var5 = (e3 == null || e3.E3(true) == null) ? e3 : null;
        boolean z10 = j14Var5 != null;
        k64 j32 = j3();
        int V02 = j32.V0();
        if (z10 && w64Var.l1 == null) {
            w64Var.l1 = new j[V02];
        }
        ac4.a Y4 = Y4();
        int i22 = 4 - V02;
        if (z) {
            cc4VarArr = Y4.d(4);
            d2 = null;
        } else if (!z2) {
            return;
        } else {
            d2 = Y4.d(4);
            cc4VarArr = null;
        }
        m mVar8 = w64Var.j1;
        if (mVar8 == null) {
            mVar8 = new a();
            w64Var.j1 = mVar8;
        }
        m mVar9 = mVar8;
        boolean z11 = i22 <= 0;
        CharSequence charSequence2 = w64Var.A0;
        int i23 = 0;
        cc4[] cc4VarArr18 = null;
        int i24 = 0;
        int i25 = -1;
        int i26 = -1;
        cc4[] cc4VarArr19 = null;
        boolean z12 = false;
        boolean z13 = z11;
        cc4[] cc4VarArr20 = d2;
        boolean z14 = z13;
        while (i24 < V02) {
            cc4[] cc4VarArr21 = cc4VarArr20;
            CharSequence charSequence3 = charSequence2;
            cc4[] cc4VarArr22 = cc4VarArr18;
            long x = j32.x(i24, 2);
            m mVar10 = mVar9;
            long x2 = j32.x(i24, 10);
            if (z14) {
                cc4VarArr5 = cc4VarArr;
                i4 = i23;
                i5 = V02;
                v64Var = k3;
                j2 = x;
                j14Var = j14Var5;
                z5 = z10;
                mVar2 = mVar10;
                i6 = i22;
                aVar = Y4;
                k64Var = j32;
                z6 = z14;
            } else {
                boolean z15 = i24 == V02 + (-1);
                boolean M = j32.M(i24);
                if (!z15) {
                    z15 = !N3() && M;
                    if (z15) {
                        for (int i27 = i24 + 1; i27 < V02; i27++) {
                            if (j32.M(i27)) {
                                z6 = false;
                                break;
                            }
                        }
                    }
                }
                z6 = z15;
                if (z6) {
                    if (M) {
                        j10 = (-1) >>> ((3 - i22) << 3);
                    } else {
                        i26 = i24 + i22;
                        i25 = i24;
                        j10 = x2;
                    }
                    char c2 = '\b';
                    int i28 = (i22 + 1) * 8;
                    if (z10) {
                        cc4VarArr12 = cc4VarArr;
                        i5 = V02;
                        k64Var2 = j32;
                        long j15 = 0;
                        int i29 = 0;
                        while (i29 <= i22) {
                            j15 = (j15 << c2) | j14Var5.D0(i23 + i29).B1();
                            i29++;
                            i22 = i22;
                            i23 = i23;
                            c2 = '\b';
                        }
                        i11 = i22;
                        i12 = i23;
                        j jVar = w64Var.l1[i24];
                        if (jVar == null) {
                            jVar = F5(x, j10, j15, i28 == 32 ? 4294967295L : ~((-1) << i28));
                            if (jVar.M0() || mVar10.D != null) {
                                mVar6 = mVar10;
                            } else {
                                mVar6 = mVar10;
                                mVar6.D = new t14(x, j10, j15, "ipaddress.error.maskMismatch");
                            }
                            w64Var.l1[i24] = jVar;
                        } else {
                            mVar6 = mVar10;
                        }
                        long a2 = jVar.a(x, j15);
                        long b2 = jVar.b(j10, j15);
                        z12 = (!z12 && a2 == x && b2 == j10) ? false : true;
                        j12 = a2;
                        j11 = b2;
                    } else {
                        cc4VarArr12 = cc4VarArr;
                        i11 = i22;
                        i12 = i23;
                        i5 = V02;
                        k64Var2 = j32;
                        mVar6 = mVar10;
                        j11 = j10;
                        j12 = x;
                    }
                    cc4[] cc4VarArr23 = cc4VarArr19;
                    cc4[] cc4VarArr24 = cc4VarArr21;
                    cc4[] cc4VarArr25 = cc4VarArr22;
                    int i30 = i11;
                    int i31 = i12;
                    int i32 = i28;
                    while (i30 >= 0) {
                        i32 -= 8;
                        cc4[] cc4VarArr26 = cc4VarArr23;
                        Integer b5 = b5(i31, 8, k3);
                        m mVar11 = mVar6;
                        int i33 = ((int) (x >>> i32)) & 255;
                        if (x == j10) {
                            i13 = i33;
                            v64Var4 = k3;
                            j13 = x;
                        } else {
                            v64Var4 = k3;
                            j13 = x;
                            i13 = ((int) (j10 >>> i32)) & 255;
                        }
                        if (z10) {
                            i14 = ((int) (j12 >>> i32)) & 255;
                            i15 = j12 == j11 ? i14 : ((int) (j11 >>> i32)) & 255;
                        } else {
                            i14 = i33;
                            i15 = i13;
                        }
                        if (z) {
                            if (z12 || b5 != null) {
                                cc4[] cc4VarArr27 = cc4VarArr24;
                                cc4[] cc4VarArr28 = cc4VarArr12;
                                cc4VarArr16 = (cc4[]) H4(cc4VarArr25, cc4VarArr28, Y4, 4, i31);
                                i20 = i28;
                                j14 = j10;
                                mVar7 = mVar11;
                                cc4VarArr13 = cc4VarArr26;
                                i18 = i11;
                                aVar4 = Y4;
                                cc4VarArr14 = cc4VarArr28;
                                j14Var4 = j14Var5;
                                cc4VarArr15 = cc4VarArr27;
                                z9 = z10;
                                k64Var3 = k64Var2;
                                i21 = i31;
                                cc4VarArr16[i21] = (cc4) T4(charSequence3, j14.b.IPV4, i33, i13, false, i24, null, aVar4);
                            } else {
                                i20 = i28;
                                j14 = j10;
                                cc4VarArr16 = cc4VarArr25;
                                aVar4 = Y4;
                                z9 = z10;
                                cc4VarArr13 = cc4VarArr26;
                                k64Var3 = k64Var2;
                                cc4VarArr14 = cc4VarArr12;
                                mVar7 = mVar11;
                                i18 = i11;
                                j14Var4 = j14Var5;
                                cc4VarArr15 = cc4VarArr24;
                                i21 = i31;
                            }
                            i17 = i20;
                            i16 = i21;
                            cc4VarArr14[i16] = (cc4) T4(charSequence3, j14.b.IPV4, i14, i15, false, i24, b5, aVar4);
                        } else {
                            j14 = j10;
                            aVar4 = Y4;
                            i16 = i31;
                            z9 = z10;
                            cc4VarArr13 = cc4VarArr26;
                            k64Var3 = k64Var2;
                            cc4VarArr14 = cc4VarArr12;
                            i17 = i28;
                            mVar7 = mVar11;
                            i18 = i11;
                            j14Var4 = j14Var5;
                            cc4VarArr15 = cc4VarArr24;
                            cc4VarArr16 = cc4VarArr25;
                        }
                        if (z2) {
                            boolean z16 = i14 != i15;
                            if (!z || z16) {
                                ac4.a aVar6 = aVar4;
                                if (z) {
                                    cc4VarArr15 = (cc4[]) H4(cc4VarArr15, cc4VarArr14, aVar6, 4, i16);
                                }
                                i19 = 4;
                                aVar4 = aVar6;
                                cc4VarArr15[i16] = (cc4) T4(charSequence3, j14.b.IPV4, i14, i14, false, i24, b5, aVar6);
                            } else {
                                if (cc4VarArr15 != null) {
                                    cc4VarArr15[i16] = cc4VarArr14[i16];
                                }
                                i19 = 4;
                            }
                            if (!z3) {
                                aVar5 = aVar4;
                                cc4VarArr17 = cc4VarArr13;
                            } else if (z16) {
                                ac4.a aVar7 = aVar4;
                                cc4[] cc4VarArr29 = (cc4[]) H4(cc4VarArr13, cc4VarArr15, aVar7, i19, i16);
                                aVar5 = aVar7;
                                cc4VarArr29[i16] = (cc4) T4(charSequence3, j14.b.IPV4, i15, i15, false, i24, b5, aVar7);
                                cc4VarArr24 = cc4VarArr15;
                                cc4VarArr23 = cc4VarArr29;
                                i31 = i16 + 1;
                                i30--;
                                Y4 = aVar5;
                                k64Var2 = k64Var3;
                                z10 = z9;
                                i28 = i17;
                                cc4VarArr25 = cc4VarArr16;
                                mVar6 = mVar7;
                                j14Var5 = j14Var4;
                                k3 = v64Var4;
                                x = j13;
                                j10 = j14;
                                cc4VarArr12 = cc4VarArr14;
                                i11 = i18;
                            } else {
                                aVar5 = aVar4;
                                cc4VarArr17 = cc4VarArr13;
                                if (cc4VarArr17 != null) {
                                    cc4VarArr17[i16] = cc4VarArr15[i16];
                                }
                            }
                        } else {
                            aVar5 = aVar4;
                            cc4VarArr17 = cc4VarArr13;
                        }
                        cc4VarArr23 = cc4VarArr17;
                        cc4VarArr24 = cc4VarArr15;
                        i31 = i16 + 1;
                        i30--;
                        Y4 = aVar5;
                        k64Var2 = k64Var3;
                        z10 = z9;
                        i28 = i17;
                        cc4VarArr25 = cc4VarArr16;
                        mVar6 = mVar7;
                        j14Var5 = j14Var4;
                        k3 = v64Var4;
                        x = j13;
                        j10 = j14;
                        cc4VarArr12 = cc4VarArr14;
                        i11 = i18;
                    }
                    v64 v64Var5 = k3;
                    z5 = z10;
                    k64Var = k64Var2;
                    cc4[] cc4VarArr30 = cc4VarArr12;
                    i6 = i11;
                    m mVar12 = mVar6;
                    j14Var3 = j14Var5;
                    k64Var.Q(i24, i28);
                    cc4VarArr19 = cc4VarArr23;
                    aVar3 = Y4;
                    i23 = i31;
                    cc4VarArr20 = cc4VarArr24;
                    z14 = z6;
                    mVar4 = mVar12;
                    v64Var3 = v64Var5;
                    cc4VarArr18 = cc4VarArr25;
                    cc4VarArr9 = cc4VarArr30;
                    i24++;
                    w64Var = this;
                    Y4 = aVar3;
                    cc4VarArr = cc4VarArr9;
                    mVar9 = mVar4;
                    j32 = k64Var;
                    z10 = z5;
                    k3 = v64Var3;
                    charSequence2 = charSequence3;
                    i22 = i6;
                    V02 = i5;
                    j14Var5 = j14Var3;
                } else {
                    cc4VarArr5 = cc4VarArr;
                    i4 = i23;
                    i5 = V02;
                    v64Var = k3;
                    j2 = x;
                    j14Var = j14Var5;
                    z5 = z10;
                    mVar2 = mVar10;
                    i6 = i22;
                    aVar = Y4;
                    k64Var = j32;
                }
            }
            cc4[] cc4VarArr31 = cc4VarArr5;
            if (z5) {
                j jVar2 = this.l1[i24];
                j14Var2 = j14Var;
                i7 = i4;
                int intValue = K4(j14Var2.D0(i7).B1()).intValue();
                if (jVar2 == null) {
                    j[] jVarArr = this.l1;
                    long j16 = intValue;
                    j F5 = F5(j2, x2, j16, aVar.E());
                    jVarArr[i24] = F5;
                    if (F5.M0() || mVar2.D != null) {
                        mVar3 = mVar2;
                    } else {
                        mVar3 = mVar2;
                        mVar3.D = new t14(j2, x2, j16, "ipaddress.error.maskMismatch");
                    }
                    jVar2 = F5;
                } else {
                    mVar3 = mVar2;
                }
                long j17 = intValue;
                j4 = j2;
                long a3 = (int) jVar2.a(j4, j17);
                aVar2 = aVar;
                j3 = x2;
                long b3 = (int) jVar2.b(j3, j17);
                boolean z17 = j4 == a3 && j3 == b3;
                j6 = b3;
                z7 = z12 || !z17;
                v64Var2 = v64Var;
                z8 = z17;
                j5 = a3;
                i8 = 8;
            } else {
                aVar2 = aVar;
                j3 = x2;
                mVar3 = mVar2;
                j14Var2 = j14Var;
                i7 = i4;
                j4 = j2;
                j5 = j4;
                j6 = j3;
                z7 = z12;
                v64Var2 = v64Var;
                i8 = 8;
                z8 = true;
            }
            Integer b52 = b5(i7, i8, v64Var2);
            if (z) {
                if (z7 || b52 != null) {
                    ac4.a aVar8 = aVar2;
                    cc4VarArr8 = (cc4[]) H4(cc4VarArr22, cc4VarArr31, aVar8, 4, i7);
                    int i34 = (int) j3;
                    v64Var3 = v64Var2;
                    j8 = j5;
                    cc4VarArr7 = cc4VarArr21;
                    aVar3 = aVar8;
                    cc4VarArr6 = cc4VarArr31;
                    j14Var3 = j14Var2;
                    j9 = j6;
                    mVar5 = mVar3;
                    i10 = i7;
                    cc4VarArr8[i10] = (cc4) T4(charSequence3, j14.b.IPV4, (int) j4, i34, true, i24, null, aVar3);
                } else {
                    v64Var3 = v64Var2;
                    j8 = j5;
                    mVar5 = mVar3;
                    cc4VarArr6 = cc4VarArr31;
                    j14Var3 = j14Var2;
                    cc4VarArr7 = cc4VarArr21;
                    j9 = j6;
                    cc4VarArr8 = cc4VarArr22;
                    aVar3 = aVar2;
                    i10 = i7;
                }
                long j18 = j8;
                j6 = j9;
                mVar4 = mVar5;
                j7 = j18;
                i9 = i10;
                cc4VarArr6[i9] = (cc4) T4(charSequence3, j14.b.IPV4, (int) j18, (int) j9, z8, i24, b52, aVar3);
            } else {
                v64Var3 = v64Var2;
                i9 = i7;
                cc4VarArr6 = cc4VarArr31;
                j14Var3 = j14Var2;
                cc4VarArr7 = cc4VarArr21;
                aVar3 = aVar2;
                j7 = j5;
                mVar4 = mVar3;
                cc4VarArr8 = cc4VarArr22;
            }
            if (z2) {
                boolean z18 = j7 != j6;
                if (!z || z18) {
                    cc4[] cc4VarArr32 = cc4VarArr7;
                    cc4[] cc4VarArr33 = cc4VarArr6;
                    if (z) {
                        cc4VarArr32 = (cc4[]) H4(cc4VarArr32, cc4VarArr33, aVar3, 4, i9);
                    }
                    cc4[] cc4VarArr34 = cc4VarArr32;
                    int i35 = (int) j7;
                    cc4VarArr9 = cc4VarArr33;
                    cc4VarArr34[i9] = (cc4) T4(charSequence3, j14.b.IPV4, i35, i35, false, i24, b52, aVar3);
                    cc4VarArr10 = cc4VarArr34;
                } else {
                    cc4[] cc4VarArr35 = cc4VarArr7;
                    if (cc4VarArr35 != null) {
                        cc4VarArr35[i9] = cc4VarArr6[i9];
                    }
                    cc4VarArr10 = cc4VarArr35;
                    cc4VarArr9 = cc4VarArr6;
                }
                if (!z3) {
                    cc4VarArr11 = cc4VarArr19;
                } else if (z18) {
                    cc4VarArr19 = (cc4[]) H4(cc4VarArr19, cc4VarArr10, aVar3, 4, i9);
                    int i36 = (int) j6;
                    cc4VarArr19[i9] = (cc4) T4(charSequence3, j14.b.IPV4, i36, i36, false, i24, b52, aVar3);
                    cc4VarArr20 = cc4VarArr10;
                } else {
                    cc4VarArr11 = cc4VarArr19;
                    if (cc4VarArr11 != null) {
                        cc4VarArr11[i9] = cc4VarArr10[i9];
                    }
                }
                cc4VarArr19 = cc4VarArr11;
                cc4VarArr20 = cc4VarArr10;
            } else {
                cc4VarArr9 = cc4VarArr6;
                cc4VarArr20 = cc4VarArr7;
            }
            i23 = i9 + 1;
            k64Var.Q(i24, 8);
            z12 = z7;
            cc4VarArr18 = cc4VarArr8;
            z14 = z6;
            i24++;
            w64Var = this;
            Y4 = aVar3;
            cc4VarArr = cc4VarArr9;
            mVar9 = mVar4;
            j32 = k64Var;
            z10 = z5;
            k3 = v64Var3;
            charSequence2 = charSequence3;
            i22 = i6;
            V02 = i5;
            j14Var5 = j14Var3;
        }
        m mVar13 = mVar9;
        v64 v64Var6 = k3;
        CharSequence charSequence4 = charSequence2;
        cc4[] cc4VarArr36 = cc4VarArr18;
        cc4[] cc4VarArr37 = cc4VarArr19;
        cc4[] cc4VarArr38 = cc4VarArr;
        ac4.a aVar9 = Y4;
        Integer a5 = a5(v64Var6);
        if (z) {
            bc4 bc4Var2 = (bc4) aVar9.p(cc4VarArr38, a5);
            mVar = mVar13;
            mVar.w = bc4Var2;
            if (cc4VarArr36 != null) {
                bc4 bc4Var3 = (bc4) aVar9.u(cc4VarArr36);
                mVar.x = bc4Var3;
                i2 = i25;
                i3 = i26;
                if (L4(bc4Var3, i2, i3)) {
                    charSequence = charSequence4;
                    mVar.A = new t14(charSequence, "ipaddress.error.invalid.joined.ranges");
                } else {
                    charSequence = charSequence4;
                }
                bc4Var = bc4Var3;
            } else {
                i2 = i25;
                i3 = i26;
                charSequence = charSequence4;
                bc4Var = null;
            }
            if (L4(bc4Var2, i2, i3)) {
                mVar.B = new t14(charSequence, "ipaddress.error.invalid.joined.ranges");
                if (bc4Var == null) {
                    mVar.A = mVar.B;
                }
            }
        } else {
            mVar = mVar13;
        }
        if (z2) {
            Integer a52 = a5(v64Var6);
            if (a52 != null) {
                ac4 m0 = Y0().o().m0();
                if (z) {
                    cc4VarArr3 = cc4VarArr38;
                    cc4VarArr2 = cc4VarArr3;
                } else {
                    cc4VarArr2 = cc4VarArr37 == null ? cc4VarArr20 : cc4VarArr37;
                    cc4VarArr3 = cc4VarArr20;
                }
                z4 = t64.h(new n04.b() { // from class: com.p7700g.p99005.g64
                    @Override // com.p7700g.p99005.n04.b
                    public final int a(int i37) {
                        int B1;
                        B1 = cc4VarArr3[i37].B1();
                        return B1;
                    }
                }, new n04.b() { // from class: com.p7700g.p99005.e64
                    @Override // com.p7700g.p99005.n04.b
                    public final int a(int i37) {
                        int h3;
                        h3 = cc4VarArr2[i37].h3();
                        return h3;
                    }
                }, cc4VarArr3.length, 1, 8, 255, a52, m0.i(), false);
                if (z4) {
                    if (cc4VarArr20 == null) {
                        cc4VarArr20 = (cc4[]) H4(cc4VarArr20, cc4VarArr38, aVar9, 4, 4);
                    }
                    if (cc4VarArr37 == null) {
                        cc4VarArr4 = (cc4[]) H4(cc4VarArr37, cc4VarArr20, aVar9, 4, 4);
                        cc4VarArr37 = cc4VarArr4;
                    }
                }
                cc4VarArr4 = cc4VarArr37;
                cc4VarArr37 = cc4VarArr4;
            } else {
                z4 = false;
            }
            if (cc4VarArr20 != null) {
                mVar.y = ((bc4) aVar9.t(cc4VarArr20, a5, true)).a0();
            }
            if (cc4VarArr37 != null) {
                bc4 bc4Var4 = (bc4) aVar9.p(cc4VarArr37, a5);
                if (z4) {
                    bc4Var4 = bc4Var4.t7();
                }
                mVar.z = bc4Var4.b0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:746:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x08cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void R4(boolean z, boolean z2, boolean z3) throws t14 {
        ri4[] d2;
        ri4[] ri4VarArr;
        pi4.a aVar;
        Integer num;
        ri4[] ri4VarArr2;
        m<?, ?> mVar;
        v64 v64Var;
        qi4 qi4Var;
        Integer num2;
        boolean z4;
        final ri4[] ri4VarArr3;
        final ri4[] ri4VarArr4;
        int i2;
        int i3;
        CharSequence charSequence;
        qi4 qi4Var2;
        int i4;
        ri4[] ri4VarArr5;
        ri4[] ri4VarArr6;
        pi4.a aVar2;
        Integer num3;
        ri4[] ri4VarArr7;
        dc4 dc4Var;
        int i5;
        ri4[] ri4VarArr8;
        m<?, ?> mVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer num4;
        int i11;
        ri4[] ri4VarArr9;
        int i12;
        v64 v64Var2;
        ri4[] ri4VarArr10;
        pi4.a aVar3;
        ri4[] ri4VarArr11;
        int i13;
        Integer num5;
        ri4[] ri4VarArr12;
        int i14;
        int i15;
        j jVar;
        int i16;
        int i17;
        int i18;
        ri4[] ri4VarArr13;
        int i19;
        int i20;
        v64 v64Var3;
        long j2;
        CharSequence charSequence2;
        boolean z5;
        ri4[] ri4VarArr14;
        m<?, ?> mVar3;
        j14 j14Var;
        int i21;
        pi4.a aVar4;
        k64 k64Var;
        int i22;
        boolean z6;
        boolean z7;
        pi4.a aVar5;
        int i23;
        j14 j14Var2;
        m<?, ?> mVar4;
        long j3;
        long j4;
        v64 v64Var4;
        int i24;
        boolean z8;
        v64 v64Var5;
        int i25;
        int i26;
        m<?, ?> mVar5;
        long j5;
        ri4[] ri4VarArr15;
        boolean z9;
        ri4[] ri4VarArr16;
        ri4[] ri4VarArr17;
        pi4.a aVar6;
        int i27;
        boolean z10;
        ri4[] ri4VarArr18;
        ri4[] ri4VarArr19;
        int i28;
        ri4[] ri4VarArr20;
        boolean z11;
        long j6;
        long j7;
        int i29;
        boolean z12;
        int i30;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        pi4.a aVar7;
        k64 k64Var2;
        int i31;
        long j14;
        j14 j14Var3;
        int i32;
        int i33;
        int i34;
        m<?, ?> mVar6;
        long j15;
        boolean z13;
        long j16;
        int i35;
        v64 v64Var6;
        ri4[] ri4VarArr21;
        int i36;
        int i37;
        long j17;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        boolean z14;
        ri4[] ri4VarArr22;
        long j18;
        int i44;
        v64 v64Var7;
        long j19;
        int i45;
        long j20;
        m<?, ?> mVar7;
        int i46;
        k64 k64Var3;
        int i47;
        int i48;
        ri4[] ri4VarArr23;
        ri4[] ri4VarArr24;
        ri4[] ri4VarArr25;
        long j21;
        pi4.a aVar8;
        ri4[] ri4VarArr26;
        int i49;
        int i50;
        ri4[] ri4VarArr27;
        long b2;
        long j22;
        boolean z15;
        long j23;
        int i51;
        int i52;
        long j24;
        long j25;
        long j26;
        f fVar;
        w64 w64Var = this;
        v64 k3 = k3();
        j14 e3 = e3();
        j14 j14Var4 = (e3 == null || e3.E3(true) == null) ? e3 : null;
        boolean z16 = j14Var4 != null;
        k64 j32 = j3();
        int V02 = j32.V0();
        if (z16 && w64Var.l1 == null) {
            w64Var.l1 = new j[V02];
        }
        pi4.a Z4 = Z4();
        if (z) {
            ri4VarArr = Z4.d(8);
            d2 = null;
        } else if (!z2) {
            return;
        } else {
            d2 = Z4.d(8);
            ri4VarArr = null;
        }
        m<?, ?> mVar8 = w64Var.j1;
        if (mVar8 == null) {
            mVar8 = new b();
            w64Var.j1 = mVar8;
        }
        m<?, ?> mVar9 = mVar8;
        boolean r4 = r4();
        int i53 = (r4 ? 6 : 8) - V02;
        boolean z17 = i53 <= 0;
        CharSequence charSequence3 = w64Var.A0;
        int i54 = 0;
        int i55 = 0;
        int i56 = -1;
        int i57 = -1;
        ri4[] ri4VarArr28 = null;
        ri4[] ri4VarArr29 = null;
        boolean z18 = false;
        boolean z19 = z17;
        ri4[] ri4VarArr30 = d2;
        boolean z20 = z19;
        while (i55 < V02) {
            m<?, ?> mVar10 = mVar9;
            ri4[] ri4VarArr31 = ri4VarArr;
            long x = j32.x(i55, 2);
            j14 j14Var5 = j14Var4;
            long x2 = j32.x(i55, 10);
            if (z20) {
                ri4VarArr13 = ri4VarArr30;
                i19 = i53;
                i20 = V02;
                v64Var3 = k3;
                j2 = x2;
                charSequence2 = charSequence3;
                z5 = z16;
                ri4VarArr14 = ri4VarArr31;
                mVar3 = mVar10;
                j14Var = j14Var5;
                i21 = i54;
                aVar4 = Z4;
                k64Var = j32;
                i22 = i55;
                z6 = z20;
            } else {
                boolean z21 = i55 == V02 + (-1);
                boolean M = j32.M(i55);
                boolean E3 = w64Var.E3(i55);
                boolean z22 = z21 || E3;
                if (z22) {
                    z10 = z22;
                } else {
                    if (M) {
                        for (int i58 = i55 + 1; i58 < V02; i58++) {
                            if (j32.M(i58) || w64Var.E3(i58)) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = M;
                }
                if (z10) {
                    long j27 = 0;
                    if (E3) {
                        ri4VarArr20 = ri4VarArr30;
                        i30 = i56;
                        i29 = i57;
                        j8 = 0;
                        j10 = 0;
                        j9 = 0;
                        j7 = 0;
                        z12 = false;
                    } else if (M) {
                        if (i53 > 3) {
                            j12 = (-1) >>> ((7 - i53) << 4);
                            j11 = -1;
                        } else {
                            j11 = (-1) >>> ((3 - i53) << 4);
                            j12 = 0;
                        }
                        ri4VarArr20 = ri4VarArr30;
                        j10 = j12;
                        i30 = i56;
                        j9 = 0;
                        j8 = j11;
                        z12 = true;
                        i29 = i57;
                        j7 = 0;
                    } else {
                        ri4VarArr20 = ri4VarArr30;
                        if (i53 > 3) {
                            j7 = j32.x(i55, 4);
                            j6 = j32.x(i55, 12);
                            z11 = (x == x2 && j7 == j6) ? false : true;
                        } else {
                            z11 = x != x2;
                            j6 = 0;
                            j7 = 0;
                        }
                        i29 = i55 + i53;
                        z12 = z11;
                        i30 = i55;
                        long j28 = j6;
                        j8 = x2;
                        j9 = x;
                        j10 = j28;
                    }
                    int i59 = i53 + 1;
                    i20 = V02;
                    int i60 = i59 * 16;
                    if (!z16) {
                        j13 = j10;
                        aVar7 = Z4;
                        k64Var2 = j32;
                        v64Var5 = k3;
                        i31 = i55;
                        charSequence2 = charSequence3;
                        z5 = z16;
                        j14 = j7;
                        j14Var3 = j14Var5;
                        i32 = i53;
                        i33 = i54;
                        i34 = i60;
                        mVar6 = mVar10;
                        j15 = j8;
                        j27 = j9;
                        z13 = z12;
                        j16 = j13;
                    } else if (E3) {
                        k64Var2 = j32;
                        w64Var.l1[i55] = P0;
                        j13 = j10;
                        aVar7 = Z4;
                        i34 = i60;
                        v64Var5 = k3;
                        i31 = i55;
                        charSequence2 = charSequence3;
                        z5 = z16;
                        j14 = j7;
                        j7 = 0;
                        j15 = 0;
                        j16 = 0;
                        j14Var3 = j14Var5;
                        z13 = false;
                        i32 = i53;
                        i33 = i54;
                        mVar6 = mVar10;
                    } else {
                        k64Var2 = j32;
                        if (i53 >= 4) {
                            f fVar2 = (f) w64Var.l1[i55];
                            charSequence2 = charSequence3;
                            int i61 = i53 - 3;
                            aVar7 = Z4;
                            v64Var5 = k3;
                            i31 = i55;
                            long j29 = 0;
                            int i62 = 0;
                            while (i62 < i61) {
                                j29 = (j29 << 16) | j14Var5.D0(i54 + i62).B1();
                                i62++;
                                i61 = i61;
                                z16 = z16;
                                j10 = j10;
                            }
                            long j30 = j10;
                            z5 = z16;
                            char c2 = 16;
                            long j31 = 0;
                            while (i61 <= i53) {
                                j31 = (j31 << c2) | j14Var5.D0(i54 + i61).B1();
                                i61++;
                                i54 = i54;
                                c2 = 16;
                            }
                            i33 = i54;
                            if (fVar2 == null) {
                                f D5 = D5(j9, j7, j8, j30, j31, j29, -1L, i60 == 64 ? -1L : ~((-1) << (i60 - 64)));
                                if (D5.M0() || ((m) mVar10).D != null) {
                                    i51 = i53;
                                    i52 = i60;
                                    fVar = D5;
                                    j14Var3 = j14Var5;
                                    j24 = j7;
                                    mVar6 = mVar10;
                                    j25 = j9;
                                    j26 = j30;
                                } else {
                                    int i63 = i59 * 2;
                                    i52 = i60;
                                    fVar = D5;
                                    j14Var3 = j14Var5;
                                    long j33 = j7;
                                    i51 = i53;
                                    j24 = j33;
                                    j25 = j9;
                                    j26 = j30;
                                    mVar6 = mVar10;
                                    ((m) mVar6).D = new t14(new BigInteger(1, J5(j9, j33, i63)).toString(), new BigInteger(1, J5(j8, j26, i63)).toString(), new BigInteger(1, J5(j31, j29, i63)).toString(), "ipaddress.error.maskMismatch");
                                }
                                w64Var.l1[i31] = fVar;
                                fVar2 = fVar;
                            } else {
                                i51 = i53;
                                i52 = i60;
                                j14Var3 = j14Var5;
                                j24 = j7;
                                mVar6 = mVar10;
                                j25 = j9;
                                j26 = j30;
                            }
                            j14 = j24;
                            long c3 = fVar2.c(j14, j29);
                            long d3 = fVar2.d(j26, j29);
                            j13 = j26;
                            j9 = j25;
                            long a2 = fVar2.a(j9, j31);
                            long b3 = fVar2.b(j8, j31);
                            z15 = (a2 == b3 && c3 == d3) ? false : true;
                            z18 = (!z18 && a2 == j9 && b3 == j8 && c3 == j14 && d3 == j13) ? false : true;
                            j27 = a2;
                            i34 = i52;
                            j22 = d3;
                            j23 = c3;
                            b2 = b3;
                            i32 = i51;
                        } else {
                            int i64 = i53;
                            j13 = j10;
                            aVar7 = Z4;
                            v64Var5 = k3;
                            i31 = i55;
                            charSequence2 = charSequence3;
                            z5 = z16;
                            j14 = j7;
                            j14Var3 = j14Var5;
                            i33 = i54;
                            mVar6 = mVar10;
                            j jVar2 = w64Var.l1[i31];
                            long j34 = 0;
                            i32 = i64;
                            for (int i65 = 0; i65 <= i32; i65++) {
                                j34 = (j34 << 16) | j14Var3.D0(i33 + i65).B1();
                            }
                            i34 = i60;
                            if (jVar2 == null) {
                                jVar2 = F5(j9, j8, j34, i34 == 64 ? -1L : ~((-1) << i34));
                                if (!jVar2.M0() && ((m) mVar6).D == null) {
                                    ((m) mVar6).D = new t14(j9, j8, j34, "ipaddress.error.maskMismatch");
                                }
                                w64Var.l1[i31] = jVar2;
                            }
                            long a3 = jVar2.a(j9, j34);
                            b2 = jVar2.b(j8, j34);
                            boolean z23 = a3 != b2;
                            z18 = (!z18 && a3 == j9 && b2 == j8) ? false : true;
                            j22 = 0;
                            z15 = z23;
                            j27 = a3;
                            j23 = 0;
                        }
                        j15 = b2;
                        j16 = j22;
                        j7 = j23;
                        z13 = z15;
                    }
                    int i66 = i32;
                    ri4[] ri4VarArr32 = ri4VarArr28;
                    ri4[] ri4VarArr33 = ri4VarArr29;
                    int i67 = i33;
                    ri4[] ri4VarArr34 = ri4VarArr20;
                    int i68 = i34;
                    while (i66 >= 0) {
                        int i69 = i32;
                        m<?, ?> mVar11 = mVar6;
                        v64 v64Var8 = v64Var5;
                        Integer b5 = b5(i67, 16, v64Var8);
                        if (E3) {
                            j17 = j8;
                            i35 = i66;
                            v64Var6 = v64Var8;
                            ri4VarArr21 = ri4VarArr33;
                            i36 = 0;
                            i39 = 0;
                            i37 = 0;
                            i38 = 0;
                        } else {
                            i68 -= 16;
                            if (i66 >= 4) {
                                int i70 = i68 - 64;
                                i35 = i66;
                                v64Var6 = v64Var8;
                                int i71 = ((int) (j14 >>> i70)) & 65535;
                                ri4VarArr21 = ri4VarArr33;
                                if (z12) {
                                    i71 = ((int) (j13 >>> i70)) & 65535;
                                }
                                if (z5) {
                                    i40 = i71;
                                    int i72 = ((int) (j7 >>> i70)) & 65535;
                                    i42 = z13 ? ((int) (j16 >>> i70)) & 65535 : i72;
                                    i41 = i72;
                                } else {
                                    i40 = i71;
                                    i41 = i71;
                                    i42 = i40;
                                }
                                i38 = i41;
                                i39 = i40;
                                i37 = i42;
                                i36 = i71;
                                j17 = j8;
                            } else {
                                i35 = i66;
                                v64Var6 = v64Var8;
                                ri4VarArr21 = ri4VarArr33;
                                i36 = ((int) (j9 >>> i68)) & 65535;
                                i37 = z12 ? ((int) (j8 >>> i68)) & 65535 : i36;
                                if (z5) {
                                    j17 = j8;
                                    int i73 = ((int) (j27 >>> i68)) & 65535;
                                    i38 = i73;
                                    if (z13) {
                                        i73 = ((int) (j15 >>> i68)) & 65535;
                                    }
                                    i39 = i37;
                                    i37 = i73;
                                } else {
                                    j17 = j8;
                                    i38 = i36;
                                    i39 = i37;
                                }
                            }
                        }
                        if (z) {
                            if (z18 || b5 != null) {
                                ri4[] ri4VarArr35 = ri4VarArr31;
                                pi4.a aVar9 = aVar7;
                                ri4VarArr24 = (ri4[]) H4(ri4VarArr32, ri4VarArr35, aVar9, 8, i67);
                                j18 = j17;
                                i44 = i69;
                                mVar7 = mVar11;
                                j19 = j13;
                                i46 = i35;
                                ri4VarArr27 = ri4VarArr35;
                                i47 = i37;
                                v64Var7 = v64Var6;
                                i43 = i38;
                                ri4VarArr22 = ri4VarArr21;
                                aVar7 = aVar9;
                                j20 = j14;
                                i48 = i34;
                                z14 = z13;
                                k64Var3 = k64Var2;
                                i45 = i67;
                                ri4VarArr24[i45] = (ri4) T4(charSequence2, j14.b.IPV6, i36, i39, false, i31, null, aVar7);
                            } else {
                                i43 = i38;
                                z14 = z13;
                                ri4VarArr27 = ri4VarArr31;
                                ri4VarArr22 = ri4VarArr21;
                                j18 = j17;
                                i44 = i69;
                                v64Var7 = v64Var6;
                                j19 = j13;
                                ri4VarArr24 = ri4VarArr32;
                                i45 = i67;
                                j20 = j14;
                                mVar7 = mVar11;
                                i46 = i35;
                                k64Var3 = k64Var2;
                                i47 = i37;
                                i48 = i34;
                            }
                            ri4VarArr23 = ri4VarArr27;
                            ri4VarArr23[i45] = (ri4) T4(charSequence2, j14.b.IPV6, i43, i47, false, i31, b5, aVar7);
                        } else {
                            i43 = i38;
                            z14 = z13;
                            ri4VarArr22 = ri4VarArr21;
                            j18 = j17;
                            i44 = i69;
                            v64Var7 = v64Var6;
                            j19 = j13;
                            i45 = i67;
                            j20 = j14;
                            mVar7 = mVar11;
                            i46 = i35;
                            k64Var3 = k64Var2;
                            i47 = i37;
                            i48 = i34;
                            ri4VarArr23 = ri4VarArr31;
                            ri4VarArr24 = ri4VarArr32;
                        }
                        if (z2) {
                            int i74 = i43;
                            int i75 = i47;
                            boolean z24 = i74 != i75;
                            if (!z || z24) {
                                pi4.a aVar10 = aVar7;
                                if (z) {
                                    ri4VarArr34 = (ri4[]) H4(ri4VarArr34, ri4VarArr23, aVar10, 8, i45);
                                }
                                j21 = j9;
                                i49 = 8;
                                aVar8 = aVar10;
                                i50 = i75;
                                ri4VarArr25 = ri4VarArr23;
                                ri4VarArr34[i45] = (ri4) T4(charSequence2, j14.b.IPV6, i74, i74, false, i31, b5, aVar8);
                            } else {
                                if (ri4VarArr34 != null) {
                                    ri4VarArr34[i45] = ri4VarArr23[i45];
                                }
                                i50 = i75;
                                ri4VarArr25 = ri4VarArr23;
                                j21 = j9;
                                aVar8 = aVar7;
                                i49 = 8;
                            }
                            if (!z3) {
                                ri4VarArr26 = ri4VarArr22;
                            } else if (z24) {
                                ri4[] ri4VarArr36 = (ri4[]) H4(ri4VarArr22, ri4VarArr34, aVar8, i49, i45);
                                ri4VarArr36[i45] = (ri4) T4(charSequence2, j14.b.IPV6, i50, i50, false, i31, b5, aVar8);
                                ri4VarArr33 = ri4VarArr36;
                                i67 = i45 + 1;
                                i66 = i46 - 1;
                                aVar7 = aVar8;
                                k64Var2 = k64Var3;
                                i34 = i48;
                                ri4VarArr32 = ri4VarArr24;
                                j14 = j20;
                                z13 = z14;
                                j8 = j18;
                                i32 = i44;
                                mVar6 = mVar7;
                                j13 = j19;
                                j9 = j21;
                                v64Var5 = v64Var7;
                                ri4VarArr31 = ri4VarArr25;
                            } else {
                                ri4VarArr26 = ri4VarArr22;
                                if (ri4VarArr26 != null) {
                                    ri4VarArr26[i45] = ri4VarArr34[i45];
                                }
                            }
                        } else {
                            ri4VarArr25 = ri4VarArr23;
                            j21 = j9;
                            aVar8 = aVar7;
                            ri4VarArr26 = ri4VarArr22;
                        }
                        ri4VarArr33 = ri4VarArr26;
                        i67 = i45 + 1;
                        i66 = i46 - 1;
                        aVar7 = aVar8;
                        k64Var2 = k64Var3;
                        i34 = i48;
                        ri4VarArr32 = ri4VarArr24;
                        j14 = j20;
                        z13 = z14;
                        j8 = j18;
                        i32 = i44;
                        mVar6 = mVar7;
                        j13 = j19;
                        j9 = j21;
                        v64Var5 = v64Var7;
                        ri4VarArr31 = ri4VarArr25;
                    }
                    i19 = i32;
                    mVar5 = mVar6;
                    int i76 = i34;
                    k64Var = k64Var2;
                    int i77 = i31;
                    k64Var.Q(i77, i76);
                    ri4VarArr29 = ri4VarArr33;
                    ri4VarArr28 = ri4VarArr32;
                    i27 = i77;
                    i54 = i67;
                    ri4VarArr30 = ri4VarArr34;
                    aVar6 = aVar7;
                    i56 = i30;
                    i57 = i29;
                    j14Var2 = j14Var3;
                    ri4VarArr16 = ri4VarArr31;
                    i55 = i27 + 1;
                    Z4 = aVar6;
                    j32 = k64Var;
                    ri4VarArr = ri4VarArr16;
                    z20 = z10;
                    j14Var4 = j14Var2;
                    i53 = i19;
                    mVar9 = mVar5;
                    V02 = i20;
                    charSequence3 = charSequence2;
                    k3 = v64Var5;
                    z16 = z5;
                    w64Var = this;
                } else {
                    ri4VarArr13 = ri4VarArr30;
                    i19 = i53;
                    i20 = V02;
                    v64Var3 = k3;
                    j2 = x2;
                    charSequence2 = charSequence3;
                    z5 = z16;
                    ri4VarArr14 = ri4VarArr31;
                    mVar3 = mVar10;
                    j14Var = j14Var5;
                    i21 = i54;
                    aVar4 = Z4;
                    k64Var = j32;
                    i22 = i55;
                    z6 = z10;
                }
            }
            if (z5) {
                j jVar3 = w64Var.l1[i22];
                i23 = i21;
                j14 j14Var6 = j14Var;
                int intValue = K4(j14Var6.D0(i23).B1()).intValue();
                if (jVar3 == null) {
                    j[] jVarArr = w64Var.l1;
                    z7 = z6;
                    j14Var2 = j14Var6;
                    long j35 = intValue;
                    aVar5 = aVar4;
                    j F5 = F5(x, j2, j35, aVar4.E());
                    jVarArr[i22] = F5;
                    if (F5.M0() || ((m) mVar3).D != null) {
                        mVar4 = mVar3;
                    } else {
                        t14 t14Var = new t14(x, j2, j35, "ipaddress.error.maskMismatch");
                        mVar4 = mVar3;
                        ((m) mVar4).D = t14Var;
                    }
                    jVar3 = F5;
                } else {
                    z7 = z6;
                    j14Var2 = j14Var6;
                    aVar5 = aVar4;
                    mVar4 = mVar3;
                }
                long j36 = intValue;
                long a4 = (int) jVar3.a(x, j36);
                long b4 = (int) jVar3.b(j2, j36);
                boolean z25 = x == a4 && j2 == b4;
                z18 = z18 || !z25;
                j4 = a4;
                z8 = z25;
                j3 = b4;
                v64Var4 = v64Var3;
                i24 = 16;
            } else {
                z7 = z6;
                aVar5 = aVar4;
                i23 = i21;
                j14Var2 = j14Var;
                mVar4 = mVar3;
                j3 = j2;
                j4 = x;
                v64Var4 = v64Var3;
                i24 = 16;
                z8 = true;
            }
            Integer b52 = b5(i23, i24, v64Var4);
            if (z) {
                if (z18 || b52 != null) {
                    v64Var5 = v64Var4;
                    ri4[] ri4VarArr37 = ri4VarArr28;
                    pi4.a aVar11 = aVar5;
                    z9 = z7;
                    ri4VarArr16 = ri4VarArr14;
                    ri4VarArr17 = (ri4[]) H4(ri4VarArr37, ri4VarArr16, aVar11, 8, i23);
                    ri4VarArr15 = ri4VarArr13;
                    mVar5 = mVar4;
                    j5 = j4;
                    aVar5 = aVar11;
                    i26 = i22;
                    i28 = i23;
                    ri4VarArr17[i28] = (ri4) T4(charSequence2, j14.b.IPV6, (int) x, (int) j2, true, i22, null, aVar5);
                } else {
                    v64Var5 = v64Var4;
                    i26 = i22;
                    mVar5 = mVar4;
                    ri4VarArr17 = ri4VarArr28;
                    j5 = j4;
                    ri4VarArr15 = ri4VarArr13;
                    i28 = i23;
                    z9 = z7;
                    ri4VarArr16 = ri4VarArr14;
                }
                i25 = i28;
                ri4VarArr16[i25] = (ri4) T4(charSequence2, j14.b.IPV6, (int) j5, (int) j3, z8, i26, b52, aVar5);
            } else {
                v64Var5 = v64Var4;
                i25 = i23;
                i26 = i22;
                mVar5 = mVar4;
                ri4[] ri4VarArr38 = ri4VarArr28;
                j5 = j4;
                ri4VarArr15 = ri4VarArr13;
                z9 = z7;
                ri4VarArr16 = ri4VarArr14;
                ri4VarArr17 = ri4VarArr38;
            }
            if (z2) {
                boolean z26 = j5 != j3;
                if (!z || z26) {
                    ri4[] ri4VarArr39 = ri4VarArr15;
                    pi4.a aVar12 = aVar5;
                    ri4[] ri4VarArr40 = z ? (ri4[]) H4(ri4VarArr39, ri4VarArr16, aVar12, 8, i25) : ri4VarArr39;
                    int i78 = (int) j5;
                    aVar6 = aVar12;
                    ri4VarArr40[i25] = (ri4) T4(charSequence2, j14.b.IPV6, i78, i78, false, i26, b52, aVar12);
                    ri4VarArr18 = ri4VarArr40;
                } else {
                    ri4[] ri4VarArr41 = ri4VarArr15;
                    if (ri4VarArr41 != null) {
                        ri4VarArr41[i25] = ri4VarArr16[i25];
                    }
                    ri4VarArr18 = ri4VarArr41;
                    aVar6 = aVar5;
                }
                if (!z3) {
                    ri4VarArr19 = ri4VarArr29;
                } else if (z26) {
                    ri4VarArr29 = (ri4[]) H4(ri4VarArr29, ri4VarArr18, aVar6, 8, i25);
                    int i79 = (int) j3;
                    ri4VarArr29[i25] = (ri4) T4(charSequence2, j14.b.IPV6, i79, i79, false, i26, b52, aVar6);
                    ri4VarArr30 = ri4VarArr18;
                } else {
                    ri4VarArr19 = ri4VarArr29;
                    if (ri4VarArr19 != null) {
                        ri4VarArr19[i25] = ri4VarArr18[i25];
                    }
                }
                ri4VarArr29 = ri4VarArr19;
                ri4VarArr30 = ri4VarArr18;
            } else {
                aVar6 = aVar5;
                ri4VarArr30 = ri4VarArr15;
            }
            i54 = i25 + 1;
            i27 = i26;
            k64Var.Q(i27, 16);
            z10 = z9;
            ri4VarArr28 = ri4VarArr17;
            i55 = i27 + 1;
            Z4 = aVar6;
            j32 = k64Var;
            ri4VarArr = ri4VarArr16;
            z20 = z10;
            j14Var4 = j14Var2;
            i53 = i19;
            mVar9 = mVar5;
            V02 = i20;
            charSequence3 = charSequence2;
            k3 = v64Var5;
            z16 = z5;
            w64Var = this;
        }
        ri4[] ri4VarArr42 = ri4VarArr30;
        m<?, ?> mVar12 = mVar9;
        int i80 = i54;
        pi4.a aVar13 = Z4;
        v64 v64Var9 = k3;
        j14 j14Var7 = j14Var4;
        CharSequence charSequence4 = charSequence3;
        boolean z27 = z16;
        ri4[] ri4VarArr43 = ri4VarArr28;
        ri4[] ri4VarArr44 = ri4VarArr29;
        ri4[] ri4VarArr45 = ri4VarArr;
        Integer a5 = a5(v64Var9);
        if (r4) {
            dc4 dc4Var2 = (dc4) this.L0.V3();
            if (z27 && this.m1 == null) {
                this.m1 = new j[4];
            }
            ri4[] ri4VarArr46 = ri4VarArr44;
            int i81 = i80;
            int i82 = 2;
            int i83 = 0;
            ri4[] ri4VarArr47 = ri4VarArr42;
            while (i83 < i82) {
                int i84 = i83 << 1;
                Integer b53 = b5(i81, 16, v64Var9);
                cc4 D0 = dc4Var2.a0().D0(i84);
                int i85 = i84 + 1;
                cc4 D02 = dc4Var2.a0().D0(i85);
                cc4 D03 = dc4Var2.b0().D0(i84);
                int i86 = i83;
                cc4 D04 = dc4Var2.b0().D0(i85);
                int B1 = D0.B1();
                int B12 = D02.B1();
                int B13 = D03.B1();
                int B14 = D04.B1();
                if (z27) {
                    num3 = a5;
                    ri4VarArr6 = ri4VarArr46;
                    int intValue2 = K4(j14Var7.D0(i81).B1()).intValue();
                    int i87 = intValue2 >> 8;
                    ri4VarArr7 = ri4VarArr47;
                    j[] jVarArr2 = this.m1;
                    j jVar4 = jVarArr2[i84];
                    if (jVar4 == null) {
                        dc4Var = dc4Var2;
                        i5 = i81;
                        long j37 = B1;
                        i15 = intValue2;
                        aVar2 = aVar13;
                        long j38 = B13;
                        ri4VarArr5 = ri4VarArr43;
                        i14 = B14;
                        long j39 = i87;
                        jVar4 = F5(j37, j38, j39, 255L);
                        jVarArr2[i84] = jVar4;
                        if (!jVar4.M0() && ((m) mVar12).D == null) {
                            mVar2 = mVar12;
                            ((m) mVar2).D = new t14(j37, j38, j39, "ipaddress.error.maskMismatch");
                            j jVar5 = jVar4;
                            long j40 = i87;
                            int a6 = (int) jVar5.a(B1, j40);
                            int b6 = (int) jVar5.b(B13, j40);
                            j[] jVarArr3 = this.m1;
                            jVar = jVarArr3[i85];
                            if (jVar != null) {
                                long j41 = B12;
                                ri4VarArr8 = ri4VarArr45;
                                i6 = i14;
                                long j42 = i6;
                                i16 = B1;
                                int i88 = i15;
                                i17 = b6;
                                long j43 = i88;
                                j F52 = F5(j41, j42, j43, 255L);
                                jVarArr3[i85] = F52;
                                if (!F52.M0() && ((m) mVar2).D == null) {
                                    ((m) mVar2).D = new t14(j41, j42, j43, "ipaddress.error.maskMismatch");
                                }
                                i18 = i88;
                                jVar = F52;
                            } else {
                                i16 = B1;
                                ri4VarArr8 = ri4VarArr45;
                                i6 = i14;
                                int i89 = i15;
                                i17 = b6;
                                i18 = i89;
                            }
                            long j44 = i18;
                            int a7 = (int) jVar.a(B12, j44);
                            int b7 = (int) jVar.b(i6, j44);
                            i4 = i16;
                            int i90 = i17;
                            i8 = i90;
                            i10 = b7;
                            i7 = a7;
                            i9 = a6;
                            z18 = (z18 && a6 == i4 && i90 == B13 && a7 == B12 && b7 == i6) ? false : true;
                        }
                    } else {
                        ri4VarArr5 = ri4VarArr43;
                        i14 = B14;
                        i15 = intValue2;
                        aVar2 = aVar13;
                        dc4Var = dc4Var2;
                        i5 = i81;
                    }
                    mVar2 = mVar12;
                    j jVar52 = jVar4;
                    long j402 = i87;
                    int a62 = (int) jVar52.a(B1, j402);
                    int b62 = (int) jVar52.b(B13, j402);
                    j[] jVarArr32 = this.m1;
                    jVar = jVarArr32[i85];
                    if (jVar != null) {
                    }
                    long j442 = i18;
                    int a72 = (int) jVar.a(B12, j442);
                    int b72 = (int) jVar.b(i6, j442);
                    i4 = i16;
                    int i902 = i17;
                    i8 = i902;
                    i10 = b72;
                    i7 = a72;
                    i9 = a62;
                    z18 = (z18 && a62 == i4 && i902 == B13 && a72 == B12 && b72 == i6) ? false : true;
                } else {
                    i4 = B1;
                    ri4VarArr5 = ri4VarArr43;
                    ri4VarArr6 = ri4VarArr46;
                    aVar2 = aVar13;
                    num3 = a5;
                    ri4VarArr7 = ri4VarArr47;
                    dc4Var = dc4Var2;
                    i5 = i81;
                    ri4VarArr8 = ri4VarArr45;
                    mVar2 = mVar12;
                    i6 = B14;
                    i7 = B12;
                    i8 = B13;
                    i9 = i4;
                    i10 = i6;
                }
                boolean z28 = (i9 == i8 && i7 == i10) ? false : true;
                if (z) {
                    boolean z29 = z18 || b53 != null;
                    i11 = i10;
                    int i91 = i5;
                    ri4[] ri4VarArr48 = ri4VarArr5;
                    pi4.a aVar14 = aVar2;
                    ri4[] ri4VarArr49 = ri4VarArr8;
                    if (z29) {
                        ri4VarArr48 = (ri4[]) H4(ri4VarArr48, ri4VarArr49, aVar14, 8, i91);
                    }
                    ri4[] ri4VarArr50 = ri4VarArr48;
                    if (!z28) {
                        if (z29) {
                            ri4VarArr50[i91] = U4(i4, B12, null, aVar14);
                        }
                        ri4VarArr49[i91] = U4(i9, i7, b53, aVar14);
                        num4 = b53;
                        i12 = i91;
                        aVar2 = aVar14;
                        ri4VarArr9 = ri4VarArr6;
                        v64Var2 = v64Var9;
                        ri4VarArr10 = ri4VarArr49;
                    } else {
                        if (z29) {
                            num4 = b53;
                            v64Var2 = v64Var9;
                            ri4VarArr12 = ri4VarArr49;
                            int i92 = i6;
                            i12 = i91;
                            aVar2 = aVar14;
                            ri4VarArr9 = ri4VarArr6;
                            ri4VarArr50[i12] = V4(mVar2, dc4Var, i4, B13, B12, i92, null, aVar14);
                        } else {
                            ri4VarArr12 = ri4VarArr49;
                            num4 = b53;
                            i12 = i91;
                            aVar2 = aVar14;
                            ri4VarArr9 = ri4VarArr6;
                            v64Var2 = v64Var9;
                        }
                        ri4VarArr10 = ri4VarArr12;
                        ri4VarArr10[i12] = V4(mVar2, dc4Var, i9, i8, i7, i11, num4, aVar2);
                    }
                    ri4VarArr43 = ri4VarArr50;
                } else {
                    num4 = b53;
                    i11 = i10;
                    ri4VarArr9 = ri4VarArr6;
                    i12 = i5;
                    ri4VarArr43 = ri4VarArr5;
                    v64Var2 = v64Var9;
                    ri4VarArr10 = ri4VarArr8;
                }
                if (z2) {
                    if (!z || z28) {
                        ri4[] ri4VarArr51 = ri4VarArr7;
                        aVar3 = aVar2;
                        i13 = 8;
                        ri4VarArr47 = z ? (ri4[]) H4(ri4VarArr51, ri4VarArr10, aVar3, 8, i12) : ri4VarArr51;
                        num5 = num4;
                        ri4VarArr47[i12] = U4(i9, i7, num5, aVar3);
                    } else {
                        if (ri4VarArr7 != null) {
                            ri4VarArr7[i12] = ri4VarArr10[i12];
                        }
                        ri4VarArr47 = ri4VarArr7;
                        num5 = num4;
                        aVar3 = aVar2;
                        i13 = 8;
                    }
                    if (!z3) {
                        ri4VarArr11 = ri4VarArr9;
                    } else if (z28) {
                        ri4VarArr46 = (ri4[]) H4(ri4VarArr9, ri4VarArr47, aVar3, i13, i12);
                        ri4VarArr46[i12] = U4(i8, i11, num5, aVar3);
                        i81 = i12 + 1;
                        i83 = i86 + 1;
                        ri4VarArr45 = ri4VarArr10;
                        mVar12 = mVar2;
                        a5 = num3;
                        v64Var9 = v64Var2;
                        dc4Var2 = dc4Var;
                        i82 = 2;
                        aVar13 = aVar3;
                    } else {
                        ri4VarArr11 = ri4VarArr9;
                        if (ri4VarArr11 != null) {
                            ri4VarArr11[i12] = ri4VarArr47[i12];
                        }
                    }
                } else {
                    aVar3 = aVar2;
                    ri4VarArr11 = ri4VarArr9;
                    ri4VarArr47 = ri4VarArr7;
                }
                ri4VarArr46 = ri4VarArr11;
                i81 = i12 + 1;
                i83 = i86 + 1;
                ri4VarArr45 = ri4VarArr10;
                mVar12 = mVar2;
                a5 = num3;
                v64Var9 = v64Var2;
                dc4Var2 = dc4Var;
                i82 = 2;
                aVar13 = aVar3;
            }
            aVar = aVar13;
            num = a5;
            ri4VarArr42 = ri4VarArr47;
            ri4VarArr2 = ri4VarArr45;
            mVar = mVar12;
            v64Var = v64Var9;
            qi4Var = null;
            ri4VarArr44 = ri4VarArr46;
        } else {
            aVar = aVar13;
            num = a5;
            ri4VarArr2 = ri4VarArr45;
            mVar = mVar12;
            v64Var = v64Var9;
            qi4Var = null;
        }
        ri4[] ri4VarArr52 = ri4VarArr42;
        if (z) {
            if (ri4VarArr43 != null) {
                qi4Var2 = (qi4) aVar.u(ri4VarArr43);
                ((m) mVar).x = qi4Var2;
                i2 = i56;
                i3 = i57;
                if (L4(qi4Var2, i2, i3)) {
                    charSequence = charSequence4;
                    ((m) mVar).A = new t14(charSequence, "ipaddress.error.invalid.joined.ranges");
                } else {
                    charSequence = charSequence4;
                }
                num2 = num;
            } else {
                i2 = i56;
                i3 = i57;
                charSequence = charSequence4;
                num2 = num;
                qi4Var2 = qi4Var;
            }
            qi4 qi4Var3 = (qi4) aVar.p(ri4VarArr2, num2);
            ((m) mVar).w = qi4Var3;
            if (L4(qi4Var3, i2, i3)) {
                ((m) mVar).B = new t14(charSequence, "ipaddress.error.invalid.joined.ranges");
                if (qi4Var2 == null) {
                    ((m) mVar).A = ((m) mVar).B;
                }
            }
        } else {
            num2 = num;
        }
        if (z2) {
            Integer a52 = a5(v64Var);
            if (a52 != null) {
                pi4 m0 = Y0().p().m0();
                if (z) {
                    ri4VarArr4 = ri4VarArr2;
                    ri4VarArr3 = ri4VarArr4;
                } else {
                    ri4VarArr3 = ri4VarArr44 == null ? ri4VarArr52 : ri4VarArr44;
                    ri4VarArr4 = ri4VarArr52;
                }
                z4 = t64.h(new n04.b() { // from class: com.p7700g.p99005.z54
                    @Override // com.p7700g.p99005.n04.b
                    public final int a(int i93) {
                        int B15;
                        B15 = ri4VarArr4[i93].B1();
                        return B15;
                    }
                }, new n04.b() { // from class: com.p7700g.p99005.i64
                    @Override // com.p7700g.p99005.n04.b
                    public final int a(int i93) {
                        int h3;
                        h3 = ri4VarArr3[i93].h3();
                        return h3;
                    }
                }, ri4VarArr4.length, 2, 16, 65535, a52, m0.i(), false);
                if (z4) {
                    if (ri4VarArr52 == null) {
                        ri4VarArr52 = (ri4[]) H4(ri4VarArr52, ri4VarArr2, aVar, 8, 8);
                    }
                    if (ri4VarArr44 == null) {
                        ri4VarArr44 = (ri4[]) H4(ri4VarArr44, ri4VarArr52, aVar, 8, 8);
                    }
                }
            } else {
                z4 = false;
            }
            if (ri4VarArr52 != null) {
                ((m) mVar).y = ((qi4) aVar.t(ri4VarArr52, num2, true)).a0();
            }
            if (ri4VarArr44 != null) {
                qi4 qi4Var4 = (qi4) aVar.p(ri4VarArr44, num2);
                if (z4) {
                    qi4Var4 = qi4Var4.t7();
                }
                ((m) mVar).z = qi4Var4.b0();
            }
        }
    }

    private static <S extends n14> S S4(CharSequence charSequence, j14.b bVar, int i2, int i3, boolean z, k64 k64Var, int i4, Integer num, s64<?, ?, ?, S> s64Var) {
        if (!z) {
            return s64Var.c(i2, i3, num);
        }
        return s64Var.B(i2, i3, num, charSequence, i2, i3, k64Var.m(i4, 262144), k64Var.m(i4, 524288), k64Var.n(i4, 6), k64Var.n(i4, 7), k64Var.n(i4, 15));
    }

    private <S extends n14> S T4(CharSequence charSequence, j14.b bVar, int i2, int i3, boolean z, int i4, Integer num, s64<?, ?, ?, S> s64Var) {
        k64 j3 = j3();
        if (i2 != i3) {
            return (S) S4(charSequence, bVar, i2, i3, z, j3, i4, num, s64Var);
        }
        if (!z) {
            return s64Var.c(i2, i2, num);
        }
        return s64Var.D(i2, num, charSequence, i2, j3.m(i4, 262144), j3.n(i4, 6), j3.n(i4, 7));
    }

    private ri4 U4(int i2, int i3, Integer num, pi4.a aVar) {
        return aVar.e((i2 << 8) | i3, num);
    }

    private ri4 V4(m<?, ?> mVar, l24 l24Var, int i2, int i3, int i4, int i5, Integer num, pi4.a aVar) throws t14 {
        if (i2 != i3) {
            if (num == null || !aVar.m0().i().f()) {
                if ((((m) mVar).C == null && i4 != 0) || i5 != 255) {
                    ((m) mVar).C = new t14(l24Var, "ipaddress.error.invalidMixedRange");
                }
            } else if (num.intValue() > 8) {
                int intValue = (255 << (8 - (num.intValue() - 8))) & 255;
                i4 &= intValue;
                i5 |= (~intValue) & 255;
                if ((((m) mVar).C == null && i4 != 0) || i5 != 255) {
                    ((m) mVar).C = new t14(l24Var, "ipaddress.error.invalidMixedRange");
                }
            } else {
                i4 = 0;
                i5 = 255;
            }
        }
        return aVar.c((i2 << 8) | i4, (i3 << 8) | i5, num);
    }

    public ac4.a Y4() {
        return Y0().o().m0().u();
    }

    public pi4.a Z4() {
        return Y0().p().m0().u();
    }

    private static Integer a5(v64 v64Var) {
        return v64Var.f();
    }

    private static Integer b5(int i2, int i3, v64 v64Var) {
        return t64.g(i3, a5(v64Var), i2);
    }

    private static Integer c5(int i2, j14.b bVar, v64 v64Var) {
        return b5(i2, m14.f5(bVar), v64Var);
    }

    private boolean e5() {
        try {
            return L1().M0();
        } catch (t14 unused) {
            return false;
        }
    }

    /* renamed from: k5 */
    public /* synthetic */ long l5(int i2, k64 k64Var, int i3) {
        if (i3 >= i2) {
            k64Var = this.L0;
            i3 -= i2;
        }
        return k64Var.x(i3, 2);
    }

    /* renamed from: m5 */
    public /* synthetic */ long n5(int i2, k64 k64Var, int i3) {
        if (i3 >= i2) {
            k64Var = this.L0;
            i3 -= i2;
        }
        return k64Var.x(i3, 4);
    }

    /* renamed from: o5 */
    public /* synthetic */ long p5(int i2, k64 k64Var, int i3) {
        if (i3 >= i2) {
            k64Var = this.L0;
            i3 -= i2;
        }
        return k64Var.x(i3, 10);
    }

    /* renamed from: q5 */
    public /* synthetic */ long r5(int i2, k64 k64Var, int i3) {
        if (i3 >= i2) {
            k64Var = this.L0;
            i3 -= i2;
        }
        return k64Var.x(i3, 12);
    }

    /* renamed from: s5 */
    public /* synthetic */ int t5(int i2, k64 k64Var, int i3) {
        if (i3 >= i2) {
            k64Var = this.L0;
            i3 -= i2;
        }
        return k64Var.g(i3);
    }

    public static /* synthetic */ long v5(k64 k64Var, int i2) {
        return k64Var.x(i2, 4);
    }

    public static /* synthetic */ long w5(k64 k64Var, int i2) {
        return k64Var.x(i2, 10);
    }

    public static /* synthetic */ int z5(int i2, int i3, int[] iArr, int i4) {
        if (i4 >= i2) {
            if (i4 - i2 < i3) {
                return 0;
            }
            i4 -= i3;
        }
        return (int) k64.y(i4, 2, iArr);
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ boolean C4() {
        return super.C4();
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ boolean E1() {
        return n64.k(this);
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ int F3(o64 o64Var) {
        return n64.z(this, o64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x011e A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x015b A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01bb A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0362 A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x040f A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0508 A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x056a A[Catch: all -> 0x056f, TryCatch #2 {all -> 0x056f, blocks: (B:286:0x003b, B:288:0x0041, B:290:0x004f, B:292:0x006f, B:294:0x0081, B:296:0x008d, B:298:0x0099, B:306:0x00ac, B:319:0x011e, B:325:0x012c, B:327:0x0134, B:329:0x013a, B:336:0x015b, B:338:0x0164, B:339:0x017e, B:344:0x018e, B:345:0x01a2, B:350:0x01bb, B:356:0x01cb, B:360:0x01d6, B:363:0x01de, B:403:0x02d8, B:405:0x02e3, B:408:0x02ed, B:417:0x033f, B:444:0x03c4, B:411:0x031b, B:413:0x031f, B:416:0x0332, B:414:0x0323, B:415:0x032e, B:418:0x0342, B:419:0x0355, B:404:0x02dd, B:422:0x0362, B:425:0x0376, B:428:0x037e, B:430:0x0386, B:438:0x03b2, B:441:0x03bb, B:431:0x0392, B:434:0x039e, B:437:0x03a8, B:366:0x01e9, B:371:0x01fe, B:374:0x020b, B:380:0x0249, B:385:0x025e, B:388:0x0265, B:392:0x0272, B:395:0x028f, B:397:0x029f, B:398:0x02a7, B:445:0x0405, B:494:0x0561, B:496:0x056a, B:446:0x040f, B:449:0x0421, B:451:0x042d, B:471:0x04b3, B:475:0x04c1, B:477:0x04c5, B:480:0x04de, B:492:0x052d, B:478:0x04cb, B:479:0x04d8, B:481:0x04ef, B:482:0x04fc, B:486:0x0508, B:489:0x051b, B:452:0x0433, B:461:0x045b, B:500:0x0570, B:464:0x0475, B:466:0x0488, B:467:0x0495, B:493:0x0558, B:346:0x01a7, B:322:0x0126, B:309:0x00ba, B:312:0x00c2, B:313:0x00ea, B:291:0x005e, B:497:0x056d), top: B:510:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0129 A[SYNTHETIC] */
    @Override // com.p7700g.p99005.o64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r24 L1() throws t14 {
        ac4 m0;
        int i2;
        j14 j14Var;
        int i3;
        final k64 k64Var;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        long j2;
        long j3;
        int i9;
        k64 k64Var2;
        w64 w64Var;
        long x;
        boolean z4;
        long x2;
        int i10;
        int i11;
        long j4;
        long j5;
        int i12;
        int g2;
        g34[] g34VarArr;
        int i13;
        Integer num;
        Integer num2;
        int i14;
        long j6;
        long x3;
        long j7;
        int i15;
        long x4;
        long x5;
        ac4 ac4Var;
        int i16;
        boolean z5;
        long j8;
        int i17;
        k64 k64Var3;
        x24[] x24VarArr;
        int i18;
        long j9;
        long j10;
        int i19;
        long j11;
        boolean z6;
        long j12;
        long j13;
        long j14;
        Integer num3;
        int i20;
        long j15;
        long j16;
        Integer num4;
        int i21;
        int intValue;
        long j17;
        long j18;
        boolean z7;
        long x6;
        long x7;
        long x8;
        long x9;
        j14 j14Var2;
        boolean J;
        boolean i22;
        r24 r24Var;
        w64 w64Var2 = this;
        m<?, ?> mVar = w64Var2.j1;
        if (mVar == null || (r24Var = ((m) mVar).H) == null) {
            if (mVar == null || (mVar.P() && mVar.R())) {
                synchronized (this) {
                    m<?, ?> mVar2 = w64Var2.j1;
                    if (mVar2 == null || (mVar2.P() && mVar2.R())) {
                        w64Var2.N4(true, false, false);
                    }
                }
            }
            m<?, ?> mVar3 = w64Var2.j1;
            r24 r24Var2 = ((m) mVar3).H;
            if (r24Var2 == null) {
                synchronized (mVar3) {
                    try {
                        r24Var2 = ((m) mVar3).H;
                        if (r24Var2 == null) {
                            v64 k3 = k3();
                            if (w2().f()) {
                                m0 = Y0().o().m0();
                                i2 = 10;
                            } else {
                                m0 = Y0().p().m0();
                                i2 = 16;
                            }
                            s04.c i23 = m0.i();
                            boolean r4 = r4();
                            final k64 j32 = j3();
                            final int V02 = j32.V0();
                            int V03 = r4 ? w64Var2.L0.V0() + V02 : V02;
                            Integer a5 = a5(k3);
                            j14 e3 = e3();
                            j14 j14Var3 = (e3 == null || e3.E3(true) == null) ? e3 : null;
                            boolean z8 = j14Var3 != null;
                            if (a5 != null) {
                                if (i23.f()) {
                                    j14Var = j14Var3;
                                    i3 = V02;
                                    k64Var = j32;
                                    z = true;
                                } else if (i23.h()) {
                                    if (r4) {
                                        j14Var = j14Var3;
                                        i3 = V02;
                                        k64Var = j32;
                                        i22 = t64.i(new f34.h() { // from class: com.p7700g.p99005.w54
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return w64.this.l5(V02, j32, i24);
                                            }
                                        }, new f34.h() { // from class: com.p7700g.p99005.s54
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return w64.this.n5(V02, j32, i24);
                                            }
                                        }, new f34.h() { // from class: com.p7700g.p99005.b64
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return w64.this.p5(V02, j32, i24);
                                            }
                                        }, new f34.h() { // from class: com.p7700g.p99005.u54
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return w64.this.r5(V02, j32, i24);
                                            }
                                        }, new f34.g() { // from class: com.p7700g.p99005.h64
                                            @Override // com.p7700g.p99005.f34.g
                                            public final int a(int i24) {
                                                return w64.this.t5(V02, j32, i24);
                                            }
                                        }, V03, a5, i23, false);
                                    } else {
                                        j14Var = j14Var3;
                                        i3 = V02;
                                        k64Var = j32;
                                        i22 = t64.i(new f34.h() { // from class: com.p7700g.p99005.y54
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return k64.this.x(i24, 2);
                                            }
                                        }, new f34.h() { // from class: com.p7700g.p99005.j64
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return w64.v5(k64.this, i24);
                                            }
                                        }, new f34.h() { // from class: com.p7700g.p99005.d64
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return w64.w5(k64.this, i24);
                                            }
                                        }, new f34.h() { // from class: com.p7700g.p99005.v54
                                            @Override // com.p7700g.p99005.f34.h
                                            public final long a(int i24) {
                                                return k64.this.x(i24, 12);
                                            }
                                        }, new f34.g() { // from class: com.p7700g.p99005.x54
                                            @Override // com.p7700g.p99005.f34.g
                                            public final int a(int i24) {
                                                return k64.this.g(i24);
                                            }
                                        }, V03, a5, i23, false);
                                    }
                                    z = i22;
                                }
                                i4 = 0;
                                while (true) {
                                    i5 = 64;
                                    if (i4 < i3) {
                                        z2 = false;
                                        break;
                                    } else if (k64Var.g(i4) >= 64) {
                                        z2 = true;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                if (r4 || !(J = k64Var.J(i3 - 1))) {
                                    i6 = i3;
                                    i7 = V03;
                                    z3 = false;
                                } else {
                                    int i24 = V03 - 1;
                                    int i25 = i3 - 1;
                                    if (z2 || k64Var.g(i25) + w64Var2.L0.g(0) < 64) {
                                        z3 = J;
                                        i6 = i25;
                                        i7 = i24;
                                    } else {
                                        z3 = J;
                                        i6 = i25;
                                        i7 = i24;
                                        z2 = true;
                                    }
                                }
                                if (z8) {
                                    i8 = i7;
                                    j2 = 0;
                                    j3 = 0;
                                    i9 = 0;
                                } else {
                                    int u2 = j14Var.u2();
                                    j2 = 0;
                                    int i26 = 0;
                                    for (int i27 = 4; i26 < i27; i27 = 4) {
                                        j2 = (j2 << u2) | j14Var2.D0(i26).B1();
                                        i26++;
                                        j14Var = j14Var;
                                        i7 = i7;
                                    }
                                    i8 = i7;
                                    j14 j14Var4 = j14Var;
                                    if (j14Var4.L4()) {
                                        long j19 = 0;
                                        int i28 = 0;
                                        while (i28 < 4) {
                                            j19 = (j19 << u2) | j14Var4.D0(i28 + 4).B1();
                                            i28++;
                                            j14Var4 = j14Var4;
                                        }
                                        i9 = u2 * 8;
                                        j3 = j19;
                                    } else {
                                        i9 = u2 * 4;
                                        j3 = j2;
                                        j2 = 0;
                                    }
                                }
                                if (!z2) {
                                    int i29 = i8;
                                    x24[] x24VarArr2 = new x24[i29];
                                    int i30 = 0;
                                    int i31 = 0;
                                    while (i30 < i29) {
                                        boolean z9 = i30 < i6;
                                        if (z9) {
                                            int g3 = k64Var.g(i30);
                                            z6 = g3 > i5;
                                            if (!k64Var.M(i30)) {
                                                i15 = i2;
                                                z7 = z9;
                                                x6 = k64Var.x(i30, 2);
                                                x7 = k64Var.x(i30, 10);
                                                x8 = k64Var.x(i30, 4);
                                                x9 = k64Var.x(i30, 12);
                                            } else if (z6) {
                                                int i32 = g3 - 64;
                                                i15 = i2;
                                                z7 = z9;
                                                x9 = i32 == i5 ? -1L : ~((-1) << i32);
                                                x6 = 0;
                                                x8 = 0;
                                                x7 = -1;
                                            } else {
                                                i15 = i2;
                                                z7 = z9;
                                                x7 = g3 == i5 ? -1L : ~((-1) << g3);
                                                x6 = 0;
                                                x8 = 0;
                                                x9 = 0;
                                            }
                                            i16 = g3;
                                            i19 = i29;
                                            z5 = z7;
                                            x24VarArr = x24VarArr2;
                                            j11 = x6;
                                            ac4Var = m0;
                                            j14 = x7;
                                            k64Var3 = k64Var;
                                            i18 = i6;
                                            j9 = x8;
                                            j10 = x9;
                                            i17 = i15;
                                        } else {
                                            i15 = i2;
                                            boolean z10 = z9;
                                            if (z3 && i30 == i6) {
                                                int g4 = w64Var2.L0.g(0) + k64Var.g(i30);
                                                z6 = g4 > i5;
                                                if (z6) {
                                                    int i33 = g4 - 64;
                                                    j13 = i33 == i5 ? -1L : ~((-1) << i33);
                                                    j12 = -1;
                                                } else {
                                                    j12 = g4 == i5 ? -1L : ~((-1) << g4);
                                                    j13 = 0;
                                                }
                                                ac4Var = m0;
                                                i16 = g4;
                                                x24VarArr = x24VarArr2;
                                                i19 = i29;
                                                j11 = 0;
                                                i17 = i15;
                                                z5 = true;
                                                j14 = j12;
                                                k64Var3 = k64Var;
                                                i18 = i6;
                                                j9 = 0;
                                                j10 = j13;
                                            } else {
                                                int i34 = i30 - i6;
                                                int g5 = w64Var2.L0.g(i34);
                                                if (w64Var2.L0.M(i34)) {
                                                    x5 = ~((-1) << g5);
                                                    x4 = 0;
                                                } else {
                                                    x4 = w64Var2.L0.x(i34, 2);
                                                    x5 = w64Var2.L0.x(i34, 10);
                                                }
                                                ac4Var = m0;
                                                i16 = g5;
                                                z5 = z10;
                                                j8 = x5;
                                                i17 = 10;
                                                k64Var3 = k64Var;
                                                x24VarArr = x24VarArr2;
                                                i18 = i6;
                                                j9 = 0;
                                                j10 = 0;
                                                i19 = i29;
                                                j11 = x4;
                                                z6 = false;
                                                if (a5 != null) {
                                                    if (z8) {
                                                        f fVar = (f) (z5 ? w64Var2.l1[i30] : w64Var2.L0.l1[i30]);
                                                        if (!fVar.M0()) {
                                                            throw new t14(j11, j8, (j2 << i5) | j3, "ipaddress.error.maskMismatch");
                                                        }
                                                        if (z6) {
                                                            int i35 = i9 - i16;
                                                            num3 = a5;
                                                            long j20 = j2 >>> i35;
                                                            i20 = i30;
                                                            long j21 = (j3 >>> i35) | (j2 << (64 - i35));
                                                            j9 = fVar.c(j9, j20);
                                                            long d2 = fVar.d(j10, j20);
                                                            j11 = fVar.a(j11, j21);
                                                            j18 = d2;
                                                            j16 = fVar.b(j8, j21);
                                                        } else {
                                                            num3 = a5;
                                                            i20 = i30;
                                                            long j22 = j8;
                                                            if (i9 > i5) {
                                                                int i36 = i9 - 64;
                                                                if (i36 >= i16) {
                                                                    j17 = j2 >>> (i36 - i16);
                                                                } else {
                                                                    int i37 = i16 - i36;
                                                                    j17 = (j2 << i37) | (j3 >> (64 - i37));
                                                                }
                                                            } else {
                                                                j17 = j3 >>> (i9 - i16);
                                                            }
                                                            j11 = fVar.a(j11, j17);
                                                            long b2 = fVar.b(j22, j17);
                                                            j18 = j10;
                                                            j16 = b2;
                                                        }
                                                        i9 -= i16;
                                                        j15 = j18;
                                                    } else {
                                                        num3 = a5;
                                                        i20 = i30;
                                                        j15 = j10;
                                                        j16 = j8;
                                                    }
                                                    num4 = null;
                                                } else {
                                                    num3 = a5;
                                                    i20 = i30;
                                                    long j23 = j8;
                                                    Integer b3 = t64.b(i16, num3.intValue() - i31);
                                                    if (!z || b3 == null || b3.intValue() >= i16) {
                                                        j15 = j10;
                                                        j16 = j23;
                                                    } else {
                                                        if (z6) {
                                                            int i38 = i16 - 64;
                                                            if (b3.intValue() > i38) {
                                                                long j24 = j10;
                                                                intValue = b3.intValue() - i38;
                                                                j15 = j24;
                                                            } else {
                                                                int intValue2 = i38 - b3.intValue();
                                                                if (intValue2 == i5) {
                                                                    j9 = 0;
                                                                    j15 = -1;
                                                                } else {
                                                                    long j25 = (-1) << intValue2;
                                                                    j9 &= j25;
                                                                    j15 = j10 | (~j25);
                                                                }
                                                                intValue = 0;
                                                            }
                                                            i21 = 64;
                                                        } else {
                                                            long j26 = j10;
                                                            i21 = i16;
                                                            intValue = b3.intValue();
                                                            j15 = j26;
                                                        }
                                                        int i39 = i21 - intValue;
                                                        if (i39 == i5) {
                                                            num4 = b3;
                                                            j11 = 0;
                                                            j16 = -1;
                                                        } else {
                                                            long j27 = (-1) << i39;
                                                            j11 &= j27;
                                                            j16 = (~j27) | j23;
                                                        }
                                                    }
                                                    num4 = b3;
                                                }
                                                int i40 = (i16 + 7) / 8;
                                                int i41 = i20;
                                                x24[] x24VarArr3 = x24VarArr;
                                                x24VarArr3[i41] = new x24(I5(j11, j9, i40), I5(j16, j15, i40), i16, i17, ac4Var, num4);
                                                i31 += i16;
                                                i30 = i41 + 1;
                                                w64Var2 = this;
                                                i6 = i18;
                                                x24VarArr2 = x24VarArr3;
                                                i29 = i19;
                                                i2 = i15;
                                                i9 = i9;
                                                m0 = ac4Var;
                                                k64Var = k64Var3;
                                                a5 = num3;
                                                i5 = 64;
                                            }
                                        }
                                        j8 = j14;
                                        if (a5 != null) {
                                        }
                                        int i402 = (i16 + 7) / 8;
                                        int i412 = i20;
                                        x24[] x24VarArr32 = x24VarArr;
                                        x24VarArr32[i412] = new x24(I5(j11, j9, i402), I5(j16, j15, i402), i16, i17, ac4Var, num4);
                                        i31 += i16;
                                        i30 = i412 + 1;
                                        w64Var2 = this;
                                        i6 = i18;
                                        x24VarArr2 = x24VarArr32;
                                        i29 = i19;
                                        i2 = i15;
                                        i9 = i9;
                                        m0 = ac4Var;
                                        k64Var = k64Var3;
                                        a5 = num3;
                                        i5 = 64;
                                    }
                                    r24Var2 = new y24(x24VarArr2, m0);
                                } else {
                                    int i42 = i9;
                                    k64 k64Var4 = k64Var;
                                    int i43 = i2;
                                    int i44 = i6;
                                    int i45 = i8;
                                    g34[] g34VarArr2 = new g34[i45];
                                    int i46 = 0;
                                    int i47 = 0;
                                    while (i46 < i45) {
                                        if (i46 < i44) {
                                            k64Var2 = k64Var4;
                                            g2 = k64Var2.g(i46);
                                            if (k64Var2.M(i46)) {
                                                x3 = ~((-1) << g2);
                                                j7 = 0;
                                            } else {
                                                long x10 = k64Var2.x(i46, 2);
                                                x3 = k64Var2.x(i46, 10);
                                                j7 = x10;
                                            }
                                            w64Var = this;
                                            z4 = z3;
                                            i10 = i44;
                                            j4 = j7;
                                            i12 = i43;
                                            j5 = x3;
                                        } else {
                                            k64Var2 = k64Var4;
                                            if (z3 && i46 == i44) {
                                                try {
                                                    w64Var = this;
                                                    g2 = k64Var2.g(i46) + w64Var.L0.g(0);
                                                    z4 = z3;
                                                    i10 = i44;
                                                    j5 = ~((-1) << g2);
                                                    j4 = 0;
                                                    i12 = i43;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            } else {
                                                w64Var = this;
                                                int i48 = i46 - i44;
                                                int g6 = w64Var.L0.g(i48);
                                                if (w64Var.L0.M(i48)) {
                                                    z4 = z3;
                                                    x2 = ~((-1) << g6);
                                                    x = 0;
                                                } else {
                                                    x = w64Var.L0.x(i48, 2);
                                                    z4 = z3;
                                                    x2 = w64Var.L0.x(i48, 10);
                                                }
                                                i10 = i44;
                                                i11 = g6;
                                                j4 = x;
                                                j5 = x2;
                                                i12 = 10;
                                                if (a5 != null) {
                                                    if (z8) {
                                                        j jVar = w64Var.l1[i46];
                                                        if (jVar.M0()) {
                                                            if (i42 > 64) {
                                                                int i49 = i42 - 64;
                                                                if (i49 >= i11) {
                                                                    j6 = j2 >>> (i49 - i11);
                                                                } else {
                                                                    int i50 = i11 - i49;
                                                                    j6 = (j2 << i50) | (j3 >> (64 - i50));
                                                                }
                                                            } else {
                                                                j6 = j3 >>> (i42 - i11);
                                                            }
                                                            g34VarArr = g34VarArr2;
                                                            i13 = i46;
                                                            long j28 = j6;
                                                            i42 -= i11;
                                                            j4 = jVar.a(j4, j28);
                                                            j5 = jVar.b(j5, j28);
                                                        } else {
                                                            throw new t14(j4, j5, j3, "ipaddress.error.maskMismatch");
                                                        }
                                                    } else {
                                                        g34VarArr = g34VarArr2;
                                                        i13 = i46;
                                                    }
                                                    i14 = i42;
                                                    num2 = null;
                                                } else {
                                                    g34VarArr = g34VarArr2;
                                                    i13 = i46;
                                                    Integer b4 = t64.b(i11, a5.intValue() - i47);
                                                    if (!z || b4 == null) {
                                                        num = b4;
                                                    } else {
                                                        num = b4;
                                                        long intValue3 = (-1) << (i11 - b4.intValue());
                                                        j4 &= intValue3;
                                                        j5 = (~intValue3) | j5;
                                                    }
                                                    num2 = num;
                                                    i14 = i42;
                                                }
                                                int i51 = i11;
                                                g34VarArr[i13] = new g34(j4, j5, i51, i12, m0, num2);
                                                i47 += i51;
                                                i46 = i13 + 1;
                                                i42 = i14;
                                                i45 = i45;
                                                k64Var4 = k64Var2;
                                                z3 = z4;
                                                g34VarArr2 = g34VarArr;
                                                i44 = i10;
                                            }
                                        }
                                        i11 = g2;
                                        if (a5 != null) {
                                        }
                                        int i512 = i11;
                                        g34VarArr[i13] = new g34(j4, j5, i512, i12, m0, num2);
                                        i47 += i512;
                                        i46 = i13 + 1;
                                        i42 = i14;
                                        i45 = i45;
                                        k64Var4 = k64Var2;
                                        z3 = z4;
                                        g34VarArr2 = g34VarArr;
                                        i44 = i10;
                                    }
                                    r24Var2 = new i34(g34VarArr2, m0);
                                }
                                ((m) mVar3).H = r24Var2;
                                if (W4()) {
                                    N();
                                }
                            }
                            j14Var = j14Var3;
                            i3 = V02;
                            k64Var = j32;
                            z = false;
                            i4 = 0;
                            while (true) {
                                i5 = 64;
                                if (i4 < i3) {
                                }
                                i4++;
                            }
                            if (r4) {
                            }
                            i6 = i3;
                            i7 = V03;
                            z3 = false;
                            if (z8) {
                            }
                            if (!z2) {
                            }
                            ((m) mVar3).H = r24Var2;
                            if (W4()) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            return r24Var2;
        }
        return r24Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.p7700g.p99005.j14, com.p7700g.p99005.n04] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.p7700g.p99005.j14, com.p7700g.p99005.n04] */
    @Override // com.p7700g.p99005.o64
    public boolean M0() {
        m<?, ?> mVar = this.j1;
        if (mVar != null) {
            if (!mVar.P()) {
                if (mVar.O()) {
                    return mVar.f().M0();
                }
                return e5();
            } else if (!mVar.Q()) {
                return e5();
            }
        }
        m<?, ?> X4 = X4();
        if (X4.O()) {
            return X4.f().M0();
        }
        return e5();
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ boolean M1(o64 o64Var) {
        return n64.A(this, o64Var);
    }

    @Override // com.p7700g.p99005.o64
    public Boolean M3(o64 o64Var) {
        if (o64Var instanceof w64) {
            m<?, ?> mVar = this.j1;
            if (mVar == null || mVar == null) {
                return M4((w64) o64Var, true, true);
            }
            return null;
        }
        return null;
    }

    public void N4(boolean z, boolean z2, boolean z3) throws t14 {
        j14.b w2 = w2();
        if (w2.f()) {
            Q4(z, z2, z3);
        } else if (w2.g()) {
            R4(z, z2, z3);
        }
    }

    @Override // com.p7700g.p99005.o64
    public Boolean P2(o64 o64Var) {
        if (o64Var instanceof w64) {
            m<?, ?> mVar = this.j1;
            if (mVar == null || mVar == null) {
                return M4((w64) o64Var, false, false);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.o64
    public j14 Q1() throws t14 {
        m<?, ?> X4 = X4();
        if (((m) X4).C == null) {
            if (((m) X4).A != null) {
                throw ((m) X4).A;
            }
            return X4.g();
        }
        throw ((m) X4).C;
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ boolean T2() {
        return n64.j(this);
    }

    @Override // com.p7700g.p99005.k64
    public /* bridge */ /* synthetic */ int V0() {
        return super.V0();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.o64
    public q14 V3() {
        m<?, ?> mVar = this.j1;
        if (mVar == null || ((m) mVar).E == null) {
            synchronized (this) {
                mVar = this.j1;
                if (mVar == null || ((m) mVar).E == null) {
                    if (mVar != null && !mVar.P() && mVar.O()) {
                        ((m) mVar).E = mVar.f().z2();
                    } else {
                        N4(false, true, true);
                        mVar = this.j1;
                        mVar.J();
                        if (W4()) {
                            N();
                        }
                    }
                }
            }
        }
        return ((m) mVar).E;
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ int W2() {
        return n64.B(this);
    }

    public boolean W4() {
        m<?, ?> mVar = this.j1;
        return !mVar.P() && (mVar.O() || !mVar.R()) && !mVar.Q();
    }

    public m<?, ?> X4() {
        m<?, ?> mVar = this.j1;
        if (mVar == null || mVar.P()) {
            synchronized (this) {
                mVar = this.j1;
                if (mVar == null || mVar.P()) {
                    N4(true, false, false);
                    mVar = this.j1;
                    if (W4()) {
                        N();
                    }
                }
            }
        }
        return mVar;
    }

    @Override // com.p7700g.p99005.o64
    public s14 Y0() {
        return this.h1;
    }

    @Override // com.p7700g.p99005.o64
    public Boolean Y3(String str) {
        Boolean o1 = o1(str);
        if (o1 == null || !o1.booleanValue()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ boolean a4() {
        return n64.t(this);
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ boolean b4() {
        return super.b4();
    }

    @Override // com.p7700g.p99005.o64
    public Integer c2() {
        return k3().f();
    }

    public j14 d5() {
        m<?, ?> mVar = this.j1;
        if (mVar == null || ((m) mVar).y == null) {
            synchronized (this) {
                mVar = this.j1;
                if (mVar == null || ((m) mVar).y == null) {
                    N4(false, true, false);
                    mVar = this.j1;
                    N();
                }
            }
        }
        return mVar.M();
    }

    @Override // com.p7700g.p99005.o64
    public j14 e3() {
        return k3().g();
    }

    public boolean f5(Integer num, l14<?, ?, ?, ?, ?> l14Var, final int[] iArr) {
        j14.b Z02 = l14Var.Z0();
        int g5 = m14.g5(Z02);
        int f5 = m14.f5(Z02);
        int z5 = n14.z5(Z02);
        s04.c i2 = l14Var.i();
        k64 j3 = j3();
        int V02 = j3.V0();
        if (C3()) {
            final int i3 = 8 - V02;
            final int i4 = j3.i();
            return t64.h(new n04.b() { // from class: com.p7700g.p99005.c64
                @Override // com.p7700g.p99005.n04.b
                public final int a(int i5) {
                    return w64.z5(i4, i3, iArr, i5);
                }
            }, new n04.b() { // from class: com.p7700g.p99005.t54
                @Override // com.p7700g.p99005.n04.b
                public final int a(int i5) {
                    return w64.A5(i4, i3, iArr, i5);
                }
            }, V02 + i3, g5, f5, z5, num, i2, false);
        }
        return t64.h(new n04.b() { // from class: com.p7700g.p99005.f64
            @Override // com.p7700g.p99005.n04.b
            public final int a(int i5) {
                return w64.B5(iArr, i5);
            }
        }, new n04.b() { // from class: com.p7700g.p99005.a64
            @Override // com.p7700g.p99005.n04.b
            public final int a(int i5) {
                return w64.C5(iArr, i5);
            }
        }, V02, g5, f5, z5, num, i2, false);
    }

    @Override // com.p7700g.p99005.o64
    public o64.i getType() {
        return o64.i.a(w2());
    }

    @Override // com.p7700g.p99005.o64
    public Boolean k2(String str) {
        int[] t = j3().t();
        if (t == null || H5() || this.I0 || this.J0 || this.K0) {
            return null;
        }
        Integer c2 = c2();
        s14 Y02 = Y0();
        l14<?, ?, ?, ?, ?> m0 = (o3() ? Y02.o() : Y02.p()).m0();
        if (c2 == null || f5(c2, m0, t)) {
            return G5(str, t);
        }
        return null;
    }

    @Override // com.p7700g.p99005.o64
    public /* synthetic */ boolean m2() {
        return n64.r(this);
    }

    @Override // com.p7700g.p99005.o64
    public j14 n1(j14.b bVar) throws t14 {
        if (bVar.equals(w2())) {
            return w1();
        }
        return null;
    }

    @Override // com.p7700g.p99005.o64
    public Boolean o1(String str) {
        int[] t = j3().t();
        if (t == null || H5() || this.I0 || this.J0 || this.K0) {
            return null;
        }
        return G5(str, t);
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ boolean o3() {
        return super.o3();
    }

    @Override // com.p7700g.p99005.o64
    public Boolean p2(o64 o64Var) {
        if (o64Var instanceof w64) {
            m<?, ?> mVar = this.j1;
            if (mVar == null || mVar == null) {
                w64 w64Var = (w64) o64Var;
                boolean z = false;
                Boolean M4 = M4(w64Var, false, true);
                if (M4 != null) {
                    if (M4.booleanValue() && Objects.equals(k3().m(), w64Var.k3().m())) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.p7700g.p99005.k64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ boolean r3() {
        return super.r3();
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ boolean r4() {
        return super.r4();
    }

    @Override // com.p7700g.p99005.o64
    public Boolean t1(o64 o64Var) {
        if (o64Var instanceof w64) {
            m<?, ?> mVar = this.j1;
            if (mVar == null || mVar == null) {
                return M4((w64) o64Var, true, false);
            }
            return null;
        }
        return null;
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.k64
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ boolean v2() {
        return super.v2();
    }

    @Override // com.p7700g.p99005.o64
    public boolean v4() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.p7700g.p99005.j14] */
    @Override // com.p7700g.p99005.o64
    public j14 w1() throws t14 {
        m<?, ?> X4 = X4();
        if (((m) X4).C == null) {
            if (((m) X4).D == null) {
                if (((m) X4).B != null) {
                    throw ((m) X4).B;
                }
                return X4.f();
            }
            throw ((m) X4).D;
        }
        throw ((m) X4).C;
    }

    @Override // com.p7700g.p99005.m64, com.p7700g.p99005.o64
    public /* bridge */ /* synthetic */ j14.b w2() {
        return super.w2();
    }
}