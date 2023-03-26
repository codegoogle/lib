package com.p7700g.p99005;

import com.p7700g.p99005.b14;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.o64;
import com.p7700g.p99005.p64;
import com.p7700g.p99005.s14;
import com.p7700g.p99005.u64;
import com.p7700g.p99005.w14;
import java.math.BigInteger;

/* compiled from: Validator.java */
/* loaded from: classes3.dex */
public class z64 implements l64 {
    public static final o64.k[][] A;
    private static final o64.j B;
    private static final u64 C;
    private static final s14 D;
    public static final l64 E;
    private static final s14 F;
    private static final s14 G;
    private static final s14 H;
    private static final BigInteger[] I;
    private static final BigInteger J;
    private static final long[] K;
    private static final int[][] L;
    private static final int[] e = new int[128];
    private static final int[] f;
    private static final int g = 253;
    private static final int h = 127;
    private static final int i = 63;
    private static final long j = 16777215;
    private static final long k = 1099511627775L;
    private static final int l = 6;
    private static final int m = 10;
    private static final int n = 12;
    private static final int o = 16;
    private static final int p = 32;
    private static final int q = 128;
    private static final int r = 32;
    private static final int s = 20;
    private static final int t = 19;
    private static final int u = 11;
    private static final int v = 16;
    private static final int w = 64;
    private static final char x;
    private static final int[] y;
    private static final v64[] z;

    static {
        int i2;
        char[] cArr = x24.I;
        for (int i3 = 0; i3 < cArr.length; i3++) {
            e[cArr[i3]] = i3;
        }
        int[] iArr = new int[128];
        f = iArr;
        char c = '0';
        int i4 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= 10) {
                break;
            }
            iArr[c] = i4;
            i4++;
            c = (char) (c + 1);
        }
        char c2 = 'a';
        char c3 = 'A';
        while (i4 < 26) {
            iArr[c3] = i4;
            iArr[c2] = i4;
            i4++;
            c2 = (char) (c2 + 1);
            c3 = (char) (c3 + 1);
        }
        x = Character.toUpperCase((char) l64.d);
        int[] iArr2 = new int[0];
        y = iArr2;
        z = new v64[129];
        A = new o64.k[3];
        B = new o64.j(r14.t);
        C = new u64("", iArr2, null, u64.u);
        D = new s14.a().A();
        E = new z64();
        F = new s14.a().l(false).b(false).n(false).p(false).o(false).A();
        G = new s14.a().m(false).b(false).n(false).p(false).o(false).t().x(false).k().A();
        H = new s14.a().l(false).b(false).n(false).p(false).o(false).u().u(false).z(false).k().A();
        BigInteger[] bigIntegerArr = new BigInteger[10];
        I = bigIntegerArr;
        J = BigInteger.valueOf(-1L);
        K = new long[]{0, 255, av5.s, j, 4294967295L};
        L = new int[][]{new int[]{3, 6, 8, 11}, new int[]{8, 16, 24, 32}, new int[0], new int[0], new int[]{3, 6, 8, 11}, new int[]{3, 5, 8, 10}, new int[0], new int[0], new int[]{2, 4, 6, 8}};
        BigInteger valueOf = BigInteger.valueOf(85L);
        bigIntegerArr[0] = BigInteger.ONE;
        while (true) {
            BigInteger[] bigIntegerArr2 = I;
            if (i2 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i2] = bigIntegerArr2[i2 - 1].multiply(valueOf);
            i2++;
        }
    }

    private z64() {
    }

    private static boolean A(char c) {
        return c == 'x' || c == 'X';
    }

    public static boolean B(char c) {
        return !((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || c == '-' || c == '.' || c == '_' || c == '~'));
    }

    private static boolean C(int i2, int i3, boolean z2, int i4, int i5, ec4 ec4Var) throws a14 {
        boolean z3;
        boolean z4 = false;
        boolean z5 = i2 <= 11 || ((z3 = ec4Var.F) && i3 == 34) || (z2 && i3 == 0 && (i5 <= 11 || (z3 && i5 == 34)));
        if (z5 && z2 && i3 != 0) {
            if (!((i4 <= 11 || (ec4Var.F && i5 == 34) || i5 == 0) ? true : true)) {
                throw new a14("ipaddress.error.too.few.segments.digit.count");
            }
        }
        return z5;
    }

    private static boolean D(int i2, boolean z2, int i3, ti4 ti4Var) throws a14 {
        boolean z3;
        boolean z4 = false;
        boolean z5 = i2 == 32 || ((z3 = ti4Var.F) && i2 == 130) || (z2 && i2 == 0 && (i3 == 32 || (z3 && i3 == 130)));
        if (z5 && z2 && i2 != 0) {
            if (!((i3 == 32 || (ti4Var.F && i3 == 130) || i3 == 0) ? true : true)) {
                throw new a14("ipaddress.error.too.few.segments.digit.count");
            }
        }
        return z5;
    }

    private static v64 E(CharSequence charSequence, s14 s14Var, h14 h14Var, m64 m64Var, int i2) throws a14 {
        int n3 = m64Var.n3();
        boolean r3 = m64Var.j3().r3();
        j14.b w2 = m64Var.w2();
        if (m64Var.b4()) {
            return P(charSequence, null, s14Var, h14Var, r3, n3, i2, w2);
        }
        if (m64Var.I3()) {
            if (!m64Var.x3() || m64Var.C4()) {
                if (!r3) {
                    return T(charSequence, s14Var, r3, n3, i2, w2);
                }
                throw new a14(charSequence, "ipaddress.error.only.zone");
            }
            throw new a14(charSequence, n3 - 1);
        }
        return u64.u;
    }

    private static BigInteger F(CharSequence charSequence, int i2, int i3) {
        int i4;
        int[] iArr = e;
        BigInteger bigInteger = BigInteger.ZERO;
        while (true) {
            int i5 = i3 - i2;
            int i6 = 9;
            boolean z2 = i5 <= 9;
            if (z2) {
                i6 = i5;
                i4 = i3;
            } else {
                i4 = i2 + 9;
            }
            long j2 = iArr[charSequence.charAt(i2)];
            while (true) {
                i2++;
                if (i2 >= i4) {
                    break;
                }
                j2 = (j2 * 85) + iArr[charSequence.charAt(i2)];
            }
            bigInteger = bigInteger.multiply(I[i6]).add(BigInteger.valueOf(j2));
            if (z2) {
                return bigInteger;
            }
            i2 = i4;
        }
    }

    private static boolean G(s14 s14Var, CharSequence charSequence, int i2, int i3, m64 m64Var, int i4, int i5, int i6) throws a14 {
        long j2;
        long j3;
        long j4;
        long j5;
        int i7;
        int i8;
        int i9;
        long j6;
        long j7;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        k64 j32 = m64Var.j3();
        int i13 = 0;
        if (i12 < 0) {
            if (i5 == 20) {
                if (s14Var.K) {
                    m64Var.x4(j14.b.IPV6);
                    BigInteger F2 = F(charSequence, i2, i3);
                    long longValue = F2.and(J).longValue();
                    BigInteger shiftRight = F2.shiftRight(64);
                    long longValue2 = shiftRight.longValue();
                    if (shiftRight.shiftRight(64).equals(BigInteger.ZERO)) {
                        j32.G(1);
                        j32.E();
                        l(i2, i3, i2, j32, 0, longValue, longValue2, 85);
                        m64Var.U3(true);
                        return true;
                    }
                    throw new a14(charSequence, "ipaddress.error.address.too.large");
                }
                throw new a14(charSequence, "ipaddress.error.ipv6");
            }
        } else if (i5 == 41 || (i5 == 21 && (i12 == 0 || i12 + 1 == i11))) {
            if (s14Var.K) {
                ti4 p2 = s14Var.p();
                if (p2.x.g()) {
                    m64Var.x4(j14.b.IPV6);
                    if (i12 == i10 + 20) {
                        BigInteger F3 = F(charSequence, i10, i12);
                        BigInteger bigInteger = J;
                        long longValue3 = F3.and(bigInteger).longValue();
                        long longValue4 = F3.shiftRight(64).longValue();
                        int i14 = i12 + 1;
                        if (i14 < i11) {
                            BigInteger F4 = F(charSequence, i14, i11);
                            j6 = F4.and(bigInteger).longValue();
                            BigInteger shiftRight2 = F4.shiftRight(64);
                            j7 = shiftRight2.longValue();
                            BigInteger shiftRight3 = shiftRight2.shiftRight(64);
                            if (F3.compareTo(F4) > 0) {
                                BigInteger shiftRight4 = shiftRight2.shiftRight(64);
                                if (p2.x.h()) {
                                    if (!shiftRight4.equals(BigInteger.ZERO)) {
                                        throw new a14(charSequence, "ipaddress.error.address.too.large");
                                    }
                                } else {
                                    throw new a14(charSequence, "ipaddress.error.invalidRange");
                                }
                            } else if (!shiftRight3.equals(BigInteger.ZERO)) {
                                throw new a14(charSequence, "ipaddress.error.address.too.large");
                            } else {
                                i14 = i10;
                                i10 = i14;
                                i12 = i11;
                                i11 = i12;
                            }
                            int i15 = i12;
                            i12 = i11;
                            i11 = i15;
                        } else if (!p2.x.f()) {
                            throw new a14(charSequence, "ipaddress.error.empty.segment.at.index", i6);
                        } else {
                            j6 = -1;
                            i13 = 4194304;
                            i14 = i10;
                            i10 = i11;
                            j7 = -1;
                        }
                        i7 = i12;
                        i8 = i14;
                        j5 = j7;
                        j4 = j6;
                        j3 = longValue4;
                        j2 = longValue3;
                        i9 = i10;
                    } else if (i12 == 0) {
                        if (p2.x.f()) {
                            BigInteger F5 = F(charSequence, i12 + 1, i11);
                            long longValue5 = F5.and(J).longValue();
                            BigInteger shiftRight5 = F5.shiftRight(64);
                            long longValue6 = shiftRight5.longValue();
                            if (!shiftRight5.shiftRight(64).equals(BigInteger.ZERO)) {
                                throw new a14(charSequence, "ipaddress.error.address.too.large");
                            }
                            j2 = 0;
                            j3 = 0;
                            j4 = longValue5;
                            j5 = longValue6;
                            i13 = 2097152;
                            i7 = 0;
                            i8 = 0;
                            i9 = 1;
                        } else {
                            throw new a14(charSequence, "ipaddress.error.empty.segment.at.index", i6);
                        }
                    } else {
                        throw new a14(charSequence, i12);
                    }
                    j32.E();
                    j32.G(1);
                    j(i8, i7, i8, i9, i11, i9, j32, 0, j2, j3, j4, j5, i13 | 1048661, 85);
                    m64Var.U3(true);
                    return true;
                }
                throw new a14(charSequence, "ipaddress.error.no.range");
            }
            throw new a14(charSequence, "ipaddress.error.ipv6");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v64 H(CharSequence charSequence, s14 s14Var, boolean z2, int i2, int i3, j14.b bVar) throws a14 {
        StringBuilder sb;
        CharSequence charSequence2 = null;
        int i4 = i2;
        while (i4 < i3) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '%') {
                StringBuilder sb2 = charSequence2;
                if (i4 + 2 < i3) {
                    if (charSequence2 == null) {
                        StringBuilder sb3 = new StringBuilder(i3 - i2);
                        sb3.append(charSequence, i2, i4);
                        sb2 = sb3;
                    }
                    int[] iArr = f;
                    int i5 = i4 + 1;
                    i4 = i5 + 1;
                    charAt = (char) (iArr[charSequence.charAt(i4)] | ((char) (iArr[charSequence.charAt(i5)] << 4)));
                    sb = sb2;
                } else {
                    throw new a14(charSequence, "ipaddress.error.invalid.zone.encoding", i4);
                }
            } else if (charAt == '/') {
                if (charSequence2 == null) {
                    charSequence2 = charSequence.subSequence(i2, i4);
                }
                return P(charSequence, charSequence2, s14Var, null, z2, i4 + 1, i3, bVar);
            } else {
                sb = charSequence2;
                if (B(charAt)) {
                    throw new a14(charSequence, "ipaddress.error.invalid.zone", i4);
                }
            }
            if (sb != 0) {
                sb.append(charAt);
            }
            i4++;
            charSequence2 = sb;
        }
        if (charSequence2 == null) {
            return new v64(charSequence.subSequence(i2, i3));
        }
        return new v64(charSequence2);
    }

    private static v64 I(CharSequence charSequence, s14 s14Var, h14 h14Var, boolean z2, boolean z3, m64 m64Var, int i2, int i3) throws a14 {
        boolean r3 = m64Var.j3().r3();
        j14.b w2 = m64Var.w2();
        if (z2) {
            return P(charSequence, null, s14Var, h14Var, r3, i2, i3, w2);
        }
        if (m64Var.I3()) {
            if (!r3) {
                return H(charSequence, s14Var, r3, i2, i3, w2);
            }
            throw new a14(charSequence, "ipaddress.error.only.zone");
        } else if (z3) {
            return O(charSequence, null, h14Var, i2, i3);
        } else {
            return u64.u;
        }
    }

    private static v64 J(CharSequence charSequence, s14 s14Var, h14 h14Var, boolean z2, boolean z3, boolean z4, int i2, int i3, j14.b bVar) throws a14 {
        if (z2) {
            return P(charSequence, null, s14Var, h14Var, z4, i2, i3, bVar);
        }
        if (z3) {
            return O(charSequence, null, h14Var, i2, i3);
        }
        return u64.u;
    }

    private static long K(CharSequence charSequence, int i2, int i3) {
        int[] iArr;
        long j2 = f[charSequence.charAt(i2)];
        while (true) {
            i2++;
            if (i2 >= i3) {
                return j2;
            }
            j2 = (j2 * 10) + iArr[charSequence.charAt(i2)];
        }
    }

    private static long L(CharSequence charSequence, int i2, int i3) {
        int[] iArr;
        long j2 = f[charSequence.charAt(i2)];
        while (true) {
            i2++;
            if (i2 >= i3) {
                return j2;
            }
            j2 = (j2 << 4) | iArr[charSequence.charAt(i2)];
        }
    }

    private static long M(CharSequence charSequence, int i2, int i3) {
        long j2 = f[charSequence.charAt(i2)];
        while (true) {
            i2++;
            if (i2 >= i3) {
                return j2;
            }
            j2 = charSequence.charAt(i2) == '1' ? (j2 << 1) | 1 : j2 << 1;
        }
    }

    private static long N(CharSequence charSequence, int i2, int i3) {
        int[] iArr;
        long j2 = f[charSequence.charAt(i2)];
        while (true) {
            i2++;
            if (i2 >= i3) {
                return j2;
            }
            j2 = (j2 << 3) | iArr[charSequence.charAt(i2)];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
        if (r18.I == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d3, code lost:
        if (r12 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
        if (r12 > 65535) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00df, code lost:
        return new com.p7700g.p99005.v64(r17, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00eb, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.invalidPort.too.large");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f7, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.invalidPort.no.digits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.port");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0106, code lost:
        if (r18.J == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0108, code lost:
        if (r13 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
        if (r13 > 15) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010e, code lost:
        if (r7 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0119, code lost:
        return new com.p7700g.p99005.v64(r17, r16.subSequence(r19, r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0125, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.invalidService.no.letter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0131, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.invalidService.too.long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013d, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.invalidService.no.chars");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0149, code lost:
        throw new com.p7700g.p99005.a14(r16.toString(), "ipaddress.host.error.service");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static v64 O(CharSequence charSequence, CharSequence charSequence2, h14 h14Var, int i2, int i3) throws a14 {
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr = f;
        int i4 = -1;
        int i5 = i2;
        boolean z5 = true;
        boolean z6 = false;
        int i6 = 0;
        int i7 = 0;
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            if (i5 >= i3) {
                z2 = z5;
                z3 = z7;
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt < '1' || charAt > '9') {
                if (charAt != '0') {
                    if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                        z4 = charAt == '-';
                        if (!z4) {
                            boolean z9 = charAt == '*';
                            if (!z9) {
                                throw new a14(charSequence.toString(), "ipaddress.host.error.invalid.port.service", i5);
                            }
                            z8 = z9;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (i5 == i2) {
                            throw new a14(charSequence.toString(), "ipaddress.host.error.invalid.service.hyphen.start");
                        }
                        if (i5 - 1 == i4) {
                            throw new a14(charSequence.toString(), "ipaddress.host.error.invalid.service.hyphen.consecutive");
                        }
                        if (i5 == i3 - 1) {
                            throw new a14(charSequence.toString(), "ipaddress.host.error.invalid.service.hyphen.end");
                        }
                        i4 = i5;
                    } else if (!z8) {
                        z7 = true;
                    } else if (i5 > i2) {
                        throw new a14((CharSequence) charSequence.toString(), i5, true);
                    } else {
                        int i8 = i5 + 1;
                        if (i8 < i3) {
                            throw new a14((CharSequence) charSequence.toString(), i8, true);
                        }
                        i7++;
                        z2 = false;
                        z3 = true;
                    }
                    i7++;
                    z5 = false;
                    i5++;
                } else if (z5 && z6) {
                    i6 *= 10;
                }
            } else if (z5) {
                i6 = (i6 * 10) + iArr[charAt];
                z6 = true;
            }
            i7++;
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r10.f() != r14.f()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r10.g() != r14.g()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
        throw new com.p7700g.p99005.a14(r7, "ipaddress.error.ipMismatch");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static v64 P(CharSequence charSequence, CharSequence charSequence2, s14 s14Var, h14 h14Var, boolean z2, int i2, int i3, j14.b bVar) throws a14 {
        v64 g0;
        if (!s14Var.I || (g0 = g0(charSequence, charSequence2, s14Var, h14Var, i2, i3, bVar)) == null) {
            if (!z2) {
                if (s14Var.J) {
                    try {
                        s14 a0 = a0(s14Var, bVar);
                        w64 w64Var = new w64(null, charSequence, a0);
                        e0(a0, charSequence, i2, i3, w64Var, false);
                        k64 j3 = w64Var.j3();
                        if (!j3.r3()) {
                            if (!j3.H()) {
                                p(charSequence, a0, w64Var);
                                int f2 = j3.f();
                                if (f2 == i3) {
                                    j14.b w2 = w64Var.w2();
                                    if (w2.f() && j3.V0() == 1 && !j3.D() && !s14Var.o().P) {
                                        throw new a14(charSequence, "ipaddress.error.mask.single.segment");
                                    }
                                    return new v64(w64Var, charSequence2);
                                }
                                throw new a14(charSequence, "ipaddress.error.invalid.mask.extra.chars", f2 + 1);
                            }
                            throw new a14(charSequence, "ipaddress.error.invalid.mask.wildcard");
                        }
                        throw new a14(charSequence, "ipaddress.error.invalid.mask.empty");
                    } catch (a14 e2) {
                        throw new a14(charSequence, "ipaddress.error.invalidCIDRPrefixOrMask", e2);
                    }
                }
                throw new a14(charSequence, s14Var.I ? "ipaddress.error.invalidCIDRPrefixOrMask" : "ipaddress.error.CIDRNotAllowed");
            }
            throw new a14(charSequence, "ipaddress.error.invalid.mask.address.empty");
        }
        return g0;
    }

    private static void Q(long j2, CharSequence charSequence, int i2, int i3, int i4, k64 k64Var, int i5, int i6, b14.a aVar) throws a14 {
        long j3;
        long j4;
        long j5;
        long j6;
        int i7 = i3 - i4;
        r(charSequence, i2, i3, i7, aVar);
        if (i4 < 16) {
            int i8 = i3 - 16;
            int i9 = i4 << 2;
            long L2 = L(charSequence, i8, i7) << i9;
            j3 = (~((-1) << i9)) | L2;
            j4 = L(charSequence, i2, i8);
            j6 = L2;
            j5 = j4;
        } else {
            if (i4 == 16) {
                j5 = j2;
                j4 = j5;
                j3 = -1;
            } else {
                int i10 = (i4 - 16) << 2;
                long j7 = j2 << i10;
                j3 = -1;
                j4 = (~((-1) << i10)) | j7;
                j5 = j7;
            }
            j6 = 0;
        }
        i(i2, i3, i6, i2, i3, i6, k64Var, i5, j6, j5, j3, j4, 131072);
    }

    private static void R(CharSequence charSequence, int i2, int i3, int i4, k64 k64Var, int i5, int i6, b14.a aVar) throws a14 {
        long M;
        long j2;
        long j3;
        int i7 = i3 - i4;
        r(charSequence, i2, i3, i7, aVar);
        int i8 = i3 - 64;
        long j4 = 0;
        if (i4 < 64) {
            j4 = M(charSequence, i8, i7) << i4;
            j3 = (~((-1) << i4)) | j4;
            M = M(charSequence, i2, i8);
            j2 = M;
        } else {
            if (i4 == 64) {
                M = M(charSequence, i2, i8);
                j2 = M;
            } else {
                int i9 = i4 - 64;
                M = M(charSequence, i2, i8 - i9) << i9;
                j2 = (~((-1) << i9)) | M;
            }
            j3 = -1;
        }
        i(i2, i3, i6, i2, i3, i6, k64Var, i5, j4, M, j3, j2, 131072);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r0 < com.p7700g.p99005.z64.z.length) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
        if (r0 < com.p7700g.p99005.z64.z.length) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static v64 S(int i2, CharSequence charSequence, CharSequence charSequence2, s14 s14Var, h14 h14Var, int i3, int i4, int i5, int i6, j14.b bVar) throws a14 {
        if (i5 == 0) {
            i6--;
        }
        boolean z2 = true;
        if (bVar != null && bVar.f()) {
            if (i6 > 0 && !s14Var.o().H) {
                throw new a14(charSequence.toString(), "ipaddress.error.ipv4.prefix.leading.zeros");
            }
            if (!s14Var.o().G && i2 > 32) {
                if (s14Var.y) {
                    return null;
                }
                throw new a14(charSequence.toString(), "ipaddress.error.prefixSize");
            }
        } else if (i6 > 0 && !s14Var.p().H) {
            throw new a14(charSequence.toString(), "ipaddress.error.ipv6.prefix.leading.zeros");
        } else {
            if (s14Var.p().G || i2 <= 128) {
                if (charSequence2 == null) {
                }
                z2 = false;
                if (z2) {
                    v64[] v64VarArr = z;
                    v64 v64Var = v64VarArr[i2];
                    if (v64Var == null) {
                        v64 v64Var2 = new v64(n(i2), (CharSequence) null);
                        v64VarArr[i2] = v64Var2;
                        return v64Var2;
                    }
                    return v64Var;
                }
                return new v64(n(i2), charSequence2);
            }
            throw new a14(charSequence.toString(), "ipaddress.error.prefixSize");
        }
    }

    private static v64 T(CharSequence charSequence, s14 s14Var, boolean z2, int i2, int i3, j14.b bVar) throws a14 {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '/') {
                return P(charSequence, charSequence.subSequence(i2, i4), s14Var, null, z2, i4 + 1, i3, bVar);
            }
            if (charAt == ':') {
                throw new a14(charSequence, "ipaddress.error.invalid.zone", i4);
            }
        }
        return new v64(charSequence.subSequence(i2, i3));
    }

    private static void U(long j2, CharSequence charSequence, int i2, int i3, int i4, k64 k64Var, int i5, int i6, b14.a aVar) throws a14 {
        long j3;
        long j4;
        long j5;
        int i7 = i3 - i4;
        r(charSequence, i2, i3, i7, aVar);
        long X = i2 < i7 ? X(j2, charSequence, i7 - i2) : 0L;
        if (i4 == 1) {
            j3 = X * 10;
            j4 = 9;
        } else if (i4 == 2) {
            j3 = X * 100;
            j4 = 99;
        } else if (i4 != 3) {
            long pow = (long) Math.pow(10.0d, i4);
            j3 = X * pow;
            j5 = (pow + j3) - 1;
            h(i2, i3, i6, i2, i3, i6, k64Var, i5, j3, j5, 131082, 10);
        } else {
            j3 = X * 1000;
            j4 = 999;
        }
        j5 = j4 + j3;
        h(i2, i3, i6, i2, i3, i6, k64Var, i5, j3, j5, 131082, 10);
    }

    private static void V(long j2, CharSequence charSequence, int i2, int i3, int i4, k64 k64Var, int i5, int i6, b14.a aVar) throws a14 {
        long j3;
        int i7 = i3 - i4;
        r(charSequence, i2, i3, i7, aVar);
        long Y = (i2 < i7 ? Y(j2, charSequence, i7 - i2) : 0L) << i4;
        switch (i4) {
            case 1:
                j3 = 1;
                break;
            case 2:
                j3 = 3;
                break;
            case 3:
                j3 = 7;
                break;
            case 4:
                j3 = 15;
                break;
            case 5:
                j3 = 31;
                break;
            case 6:
                j3 = 63;
                break;
            case 7:
                j3 = 127;
                break;
            case 8:
                j3 = 255;
                break;
            case 9:
                j3 = 511;
                break;
            case 10:
                j3 = 1023;
                break;
            case 11:
                j3 = 2047;
                break;
            case 12:
                j3 = 4095;
                break;
            case 13:
                j3 = 8191;
                break;
            case 14:
                j3 = 16383;
                break;
            case 15:
                j3 = 32767;
                break;
            case 16:
                j3 = av5.s;
                break;
            default:
                j3 = ~((-1) << i4);
                break;
        }
        h(i2, i3, i6, i2, i3, i6, k64Var, i5, Y, j3 | Y, 131074, 2);
    }

    private static void W(long j2, CharSequence charSequence, int i2, int i3, int i4, k64 k64Var, int i5, int i6, b14.a aVar) throws a14 {
        long j3;
        long j4;
        long j5;
        long j6;
        int i7 = i3 - i4;
        r(charSequence, i2, i3, i7, aVar);
        long Z = i2 < i7 ? Z(j2, charSequence, i7 - i2) : 0L;
        if (i4 == 1) {
            j3 = Z << 3;
            j4 = 7;
        } else if (i4 == 2) {
            j3 = Z << 6;
            j4 = 63;
        } else if (i4 != 3) {
            int i8 = i4 * 3;
            long j7 = Z << i8;
            j5 = (~((-1) << i8)) | j7;
            j6 = j7;
            h(i2, i3, i6, i2, i3, i6, k64Var, i5, j6, j5, 131080, 8);
        } else {
            j3 = Z << 9;
            j4 = 511;
        }
        j5 = j4 | j3;
        j6 = j3;
        h(i2, i3, i6, i2, i3, i6, k64Var, i5, j6, j5, 131080, 8);
    }

    private static long X(long j2, CharSequence charSequence, int i2) throws a14 {
        long j3 = 15;
        long j4 = j2 & 15;
        if (j4 >= 10) {
            throw new a14(charSequence, "ipaddress.error.ipv4.invalid.decimal.digit");
        }
        int i3 = i2 - 1;
        if (i3 <= 0) {
            return j4;
        }
        int i4 = 10;
        long j5 = j4;
        long j6 = j2;
        while (true) {
            j6 >>>= 4;
            long j7 = j6 & j3;
            if (j7 >= 10) {
                throw new a14(charSequence, "ipaddress.error.ipv4.invalid.decimal.digit");
            }
            j5 += j7 * i4;
            i3--;
            if (i3 == 0) {
                return j5;
            }
            i4 = i4 == 10 ? 100 : i4 == 100 ? 1000 : i4 * 10;
            j3 = 15;
        }
    }

    private static long Y(long j2, CharSequence charSequence, int i2) throws a14 {
        long j3 = j2 & 15;
        if (j3 > 1) {
            throw new a14(charSequence, "ipaddress.error.ipv4.invalid.binary.digit");
        }
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 <= 0) {
                return j3;
            }
            i3++;
            j2 >>>= 4;
            int i4 = ((j2 & 15) > 1L ? 1 : ((j2 & 15) == 1L ? 0 : -1));
            if (i4 >= 0) {
                if (i4 != 0) {
                    throw new a14(charSequence, "ipaddress.error.ipv4.invalid.binary.digit");
                }
                j3 |= 1 << i3;
            }
        }
    }

    private static long Z(long j2, CharSequence charSequence, int i2) throws a14 {
        long j3 = j2 & 15;
        if (j3 >= 8) {
            throw new a14(charSequence, "ipaddress.error.ipv4.invalid.octal.digit");
        }
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 <= 0) {
                return j3;
            }
            i3 += 3;
            j2 >>>= 4;
            long j4 = j2 & 15;
            if (j4 >= 8) {
                throw new a14(charSequence, "ipaddress.error.ipv4.invalid.octal.digit");
            }
            j3 |= j4 << i3;
        }
    }

    private static s14 a0(s14 s14Var, j14.b bVar) {
        s14.a aVar = null;
        if (bVar == null || bVar.g()) {
            ti4 p2 = s14Var.p();
            if (!p2.x.t()) {
                aVar = s14Var.u();
                aVar.u().l(b14.c.t);
            }
            if (p2.M && !p2.h().o().x.t()) {
                if (aVar == null) {
                    aVar = s14Var.u();
                }
                aVar.u().l(b14.c.t);
            }
        }
        if ((bVar == null || bVar.f()) && !s14Var.o().x.t()) {
            if (aVar == null) {
                aVar = s14Var.u();
            }
            aVar.t().l(b14.c.t);
        }
        if (s14Var.x) {
            if (aVar == null) {
                aVar = s14Var.u();
            }
            aVar.a(false);
        }
        return aVar == null ? s14Var : aVar.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:1169:0x1969, code lost:
        if (r22 > 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1217:0x1a48, code lost:
        throw new com.p7700g.p99005.a14(r9, r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06d4, code lost:
        throw new com.p7700g.p99005.a14(r15, r11, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x07a2, code lost:
        throw new com.p7700g.p99005.a14(r15, r22, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0d5e, code lost:
        throw new com.p7700g.p99005.a14(r9, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0f4c, code lost:
        if (r8 > 19) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x0fbc, code lost:
        if (r44 < 0) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0fbe, code lost:
        r44 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x0fc0, code lost:
        r1 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x100d, code lost:
        throw new com.p7700g.p99005.a14(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x101b, code lost:
        if (r44 < 0) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1052, code lost:
        throw new com.p7700g.p99005.a14(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x10d6, code lost:
        throw new com.p7700g.p99005.a14(r9, r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01da, code lost:
        if (r46 <= 0) goto L1218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01de, code lost:
        if (r10 > 0) goto L1220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x12fd, code lost:
        throw new com.p7700g.p99005.a14(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if (r10 > 0) goto L1220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:922:0x134f, code lost:
        throw new com.p7700g.p99005.a14(r9, "ipaddress.mac.error.mix.format.characters.at.index", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:981:0x14cc, code lost:
        throw new com.p7700g.p99005.a14(r9, r2, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:1081:0x17b8  */
    /* JADX WARN: Removed duplicated region for block: B:1271:0x11fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1297:0x1340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1300:0x034a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1358:0x1af3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1365:0x0680 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1372:0x0de6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1380:0x050a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:873:0x12a2  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x12d7  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x12e4  */
    /* JADX WARN: Removed duplicated region for block: B:914:0x131c  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x131e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b0(s14 s14Var, w14 w14Var, CharSequence charSequence, int i2, int i3, m64 m64Var, p64 p64Var, boolean z2) throws a14 {
        boolean z3;
        ec4 o2;
        ti4 ti4Var;
        k64 k64Var;
        w14 w14Var2;
        w14.c cVar;
        w14.c cVar2;
        String str;
        int i4;
        k64 k64Var2;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        w14.c cVar3;
        ec4 ec4Var;
        ti4 ti4Var2;
        ti4 ti4Var3;
        int i9;
        int i10;
        char c;
        s14 s14Var2;
        char charAt;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str3;
        int i11;
        m64 m64Var2;
        String str4;
        ti4 ti4Var4;
        p64.a aVar;
        j14.b bVar;
        p64.a aVar2;
        ec4 ec4Var2;
        boolean z8;
        boolean z9;
        int i12;
        int i13;
        ti4 ti4Var5;
        int i14;
        ti4 ti4Var6;
        CharSequence charSequence2;
        int i15;
        long j2;
        int i16;
        ec4 ec4Var3;
        int i17;
        int i18;
        long j3;
        w14.c cVar4;
        p64.a aVar3;
        boolean z10;
        k64 k64Var3;
        int i19;
        int i20;
        ec4 ec4Var4;
        w14.c cVar5;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        String str5;
        String str6;
        int i26;
        w14.c cVar6;
        m64 m64Var3;
        int i27;
        int i28;
        m64 m64Var4;
        w14.c cVar7;
        ti4 ti4Var7;
        String str7;
        long j4;
        boolean z11;
        int i29;
        int i30;
        int i31;
        boolean z12;
        int i32;
        long j5;
        int i33;
        int i34;
        boolean z13;
        int i35;
        boolean z14;
        boolean z15;
        long Y;
        int i36;
        int i37;
        int i38;
        ec4 ec4Var5;
        int i39;
        int i40;
        int i41;
        ti4 ti4Var8;
        String str8;
        String str9;
        int i42;
        int i43;
        long j6;
        int i44;
        boolean z16;
        long j7;
        long j8;
        int i45;
        int i46;
        boolean z17;
        int i47;
        long j9;
        int i48;
        int i49;
        long j10;
        int i50;
        int i51;
        int i52;
        int i53;
        boolean z18;
        long Y2;
        int i54;
        w14 w14Var3;
        int i55;
        int i56;
        int i57;
        String str10;
        int i58;
        ti4 ti4Var9;
        ti4 ti4Var10;
        k64 k64Var4;
        String str11;
        String str12;
        boolean z19;
        int i59;
        long j11;
        boolean z20;
        int i60;
        String str13;
        boolean z21;
        ti4 ti4Var11;
        boolean z22;
        s14 s14Var3;
        int i61;
        int i62;
        boolean z23;
        ti4 ti4Var12;
        boolean z24;
        ti4 ti4Var13;
        boolean z25;
        j14.b bVar2;
        k64 k64Var5;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        long j12;
        boolean z26;
        boolean z27;
        int i69;
        int i70;
        int i71;
        int i72;
        String str14;
        int i73;
        ti4 ti4Var14;
        int i74;
        long j13;
        int i75;
        w14.c cVar8;
        String str15;
        int i76;
        String str16;
        long j14;
        int i77;
        int i78;
        int i79;
        int i80;
        boolean z28;
        int i81;
        int i82;
        long j15;
        boolean z29;
        int i83;
        long j16;
        int i84;
        int i85;
        int i86;
        int i87;
        long Y3;
        m64 m64Var5;
        int i88;
        boolean z30;
        long j17;
        m64 m64Var6;
        int i89;
        w14.c cVar9;
        long j18;
        int i90;
        long j19;
        int compare;
        long j20;
        int i91;
        boolean z31;
        int i92;
        boolean z32;
        long j21;
        long j22;
        long j23;
        int compare2;
        boolean z33;
        int compare3;
        int compare4;
        int i93;
        long j24;
        int i94;
        int i95;
        long j25;
        int i96;
        int i97;
        ti4 ti4Var15;
        String str17;
        int i98;
        int i99;
        long j26;
        long j27;
        long j28;
        long j29;
        int i100;
        j14.b bVar3;
        boolean z34;
        int i101;
        boolean z35;
        String str18;
        int i102;
        p64.a aVar4;
        int i103;
        boolean z36;
        ti4 ti4Var16;
        int i104;
        long j30;
        int i105;
        boolean z37;
        int i106;
        int i107;
        boolean z38;
        boolean z39;
        int i108;
        char c2;
        s14 s14Var4 = s14Var;
        w14 w14Var4 = w14Var;
        CharSequence charSequence3 = charSequence;
        int i109 = i2;
        p64 p64Var2 = p64Var;
        boolean z40 = p64Var2 != null;
        if (z40) {
            cVar = w14Var.o();
            cVar2 = cVar;
            k64Var = p64Var.i3();
            w14Var2 = w14Var4;
            z3 = false;
            o2 = null;
            ti4Var = null;
        } else {
            k64 j32 = m64Var.j3();
            ti4 p2 = s14Var.p();
            z3 = p2.O;
            o2 = s14Var.o();
            ti4Var = p2;
            k64Var = j32;
            w14Var2 = s14Var4;
            cVar = null;
            cVar2 = null;
        }
        int[] iArr = f;
        w14.c cVar10 = cVar;
        boolean z41 = z3;
        ec4 ec4Var6 = o2;
        w14.c cVar11 = cVar2;
        int i110 = i109;
        int i111 = i110;
        int i112 = i111;
        long j31 = 0;
        long j33 = 0;
        long j34 = 0;
        int i113 = -1;
        int i114 = 0;
        int i115 = 0;
        int i116 = 0;
        int i117 = -1;
        boolean z42 = false;
        boolean z43 = false;
        boolean z44 = false;
        boolean z45 = true;
        boolean z46 = false;
        boolean z47 = false;
        int i118 = 0;
        j14.b bVar4 = null;
        boolean z48 = false;
        int i119 = 0;
        int i120 = -1;
        int i121 = 0;
        boolean z49 = false;
        boolean z50 = false;
        int i122 = -1;
        int i123 = -1;
        int i124 = 0;
        boolean z51 = false;
        boolean z52 = false;
        boolean z53 = false;
        int i125 = i3;
        p64.a aVar5 = null;
        while (true) {
            if (i111 >= i125) {
                z46 = i111 == i125;
                if (!z46) {
                    return;
                }
            }
            boolean z54 = z46;
            int i126 = i125;
            ti4 ti4Var17 = ti4Var;
            int i127 = i113;
            if (z54) {
                k64Var.O(i111);
                if (z42) {
                    if (z40) {
                        char f2 = aVar5.f();
                        if (k64Var.V0() == 1 && f2 == '-') {
                            z39 = true;
                            p64Var2.p3(z39);
                            boolean z55 = z39;
                            if (z39) {
                                i108 = i112;
                                c2 = f2;
                            } else {
                                i108 = i112;
                                c2 = f2;
                                p64Var2.t3(i111 - i108 == 10);
                            }
                            k64Var2 = k64Var;
                            i5 = i114;
                            i10 = i108;
                            i6 = i115;
                            z4 = z43;
                            z5 = z44;
                            z6 = z45;
                            i8 = i126;
                            cVar3 = cVar11;
                            ec4Var = ec4Var6;
                            ti4Var2 = cVar10;
                            z7 = z55;
                            ti4Var3 = ti4Var17;
                            i9 = i127;
                            charAt = c2;
                            str2 = "ipaddress.mac.error.format";
                            str = "ipaddress.error.too.many.segments";
                            s14Var2 = w14Var2;
                        }
                        z39 = false;
                        p64Var2.p3(z39);
                        boolean z552 = z39;
                        if (z39) {
                        }
                        k64Var2 = k64Var;
                        i5 = i114;
                        i10 = i108;
                        i6 = i115;
                        z4 = z43;
                        z5 = z44;
                        z6 = z45;
                        i8 = i126;
                        cVar3 = cVar11;
                        ec4Var = ec4Var6;
                        ti4Var2 = cVar10;
                        z7 = z552;
                        ti4Var3 = ti4Var17;
                        i9 = i127;
                        charAt = c2;
                        str2 = "ipaddress.mac.error.format";
                        str = "ipaddress.error.too.many.segments";
                        s14Var2 = w14Var2;
                    } else {
                        int i128 = i112;
                        if (i117 < 0) {
                            if (bVar4.f()) {
                                s14Var2 = w14Var2;
                                k64Var2 = k64Var;
                                i5 = i114;
                                i10 = i128;
                                i6 = i115;
                                z4 = z43;
                                z5 = z44;
                                z6 = z45;
                                i8 = i126;
                                cVar3 = cVar11;
                                ec4Var = ec4Var6;
                                ti4Var2 = cVar10;
                                z7 = z47;
                                ti4Var3 = ti4Var17;
                                i9 = i127;
                                str2 = "ipaddress.mac.error.format";
                                str = "ipaddress.error.too.many.segments";
                                charAt = '.';
                            } else if (i111 == i110) {
                                if (i111 != k64Var.h() + 2) {
                                    throw new a14(charSequence3, "ipaddress.error.cannot.end.with.single.separator");
                                }
                                return;
                            } else if (m64Var.r4()) {
                                return;
                            } else {
                                s14Var2 = w14Var2;
                                k64Var2 = k64Var;
                                i5 = i114;
                                i10 = i128;
                                i6 = i115;
                                z4 = z43;
                                z5 = z44;
                                z6 = z45;
                                i8 = i126;
                                cVar3 = cVar11;
                                ec4Var = ec4Var6;
                                ti4Var2 = cVar10;
                                z7 = z47;
                                ti4Var3 = ti4Var17;
                                i9 = i127;
                                str2 = "ipaddress.mac.error.format";
                                str = "ipaddress.error.too.many.segments";
                                charAt = ':';
                            }
                        } else {
                            throw new a14(charSequence3, i117);
                        }
                    }
                    i4 = i110;
                    i7 = i116;
                    c = '.';
                    if (charAt <= '9' || charAt < '0') {
                        long j35 = j31;
                        if (charAt >= 'a' || charAt > 'f') {
                            if (charAt != c) {
                                int V0 = k64Var2.V0();
                                if (!z40) {
                                    p64.a aVar6 = aVar5;
                                    str3 = "ipaddress.error.empty.segment.at.index";
                                    String str19 = str;
                                    k64 k64Var6 = k64Var2;
                                    if (V0 == 0) {
                                        if (s14Var4.L) {
                                            j14.b bVar5 = j14.b.IPV4;
                                            i11 = i117;
                                            m64Var2 = m64Var;
                                            m64Var2.x4(bVar5);
                                            k64Var6.G(4);
                                            bVar = bVar5;
                                            aVar2 = aVar6;
                                            k64Var2 = k64Var6;
                                            str4 = "ipaddress.error.segment.too.long.at.index";
                                            ec4Var2 = ec4Var;
                                            ti4Var4 = ti4Var3;
                                            z8 = true;
                                            z9 = false;
                                            if (i7 <= 0) {
                                            }
                                            k64Var2.E();
                                            i110 = i14 + 1;
                                            i10 = i110;
                                            cVar10 = ti4Var6;
                                            j33 = j2;
                                            aVar3 = aVar2;
                                            z10 = z50;
                                            ti4Var3 = ti4Var5;
                                            i116 = i18;
                                            z42 = z8;
                                            z41 = z9;
                                            bVar4 = bVar;
                                            k64Var3 = k64Var2;
                                            z45 = z6;
                                            i122 = i13;
                                            i19 = i15;
                                            i111 = i10;
                                            i20 = i121;
                                            ec4Var4 = ec4Var3;
                                            i113 = i17;
                                            w14.c cVar12 = cVar4;
                                            i115 = i16;
                                            cVar5 = cVar12;
                                        } else {
                                            throw new a14(charSequence3, "ipaddress.error.ipv4");
                                        }
                                    } else {
                                        i11 = i117;
                                        m64Var2 = m64Var;
                                        if (m64Var.w2().g()) {
                                            ti4 ti4Var18 = ti4Var3;
                                            if (!ti4Var18.M) {
                                                throw new a14(charSequence3, "ipaddress.error.no.mixed");
                                            }
                                            int i129 = V0 + 2;
                                            if (i129 <= 8) {
                                                if (i7 > 0 && k64Var6.h() < 0 && i129 < 8 && ti4Var18.y) {
                                                    k64Var6.U();
                                                    g(i4, i111, i4, i4, i111, i4, k64Var6, V0, 0L, av5.s, 8454144);
                                                    k64Var6.E();
                                                }
                                                s14 h2 = ti4Var18.h();
                                                w64 w64Var = new w64(null, charSequence3, h2);
                                                e0(h2, charSequence, i4, i8, w64Var, true);
                                                w64Var.i3();
                                                p(charSequence3, h2, w64Var);
                                                m64Var2.p4(w64Var);
                                                i111 = w64Var.j3().f();
                                                aVar5 = aVar6;
                                                i117 = i11;
                                                w14Var2 = s14Var2;
                                                z46 = z54;
                                                i125 = i8;
                                                z43 = z4;
                                                i116 = i7;
                                                i110 = i4;
                                                ec4Var6 = ec4Var;
                                                z44 = z5;
                                                cVar10 = ti4Var2;
                                                k64Var = k64Var6;
                                                i114 = i5;
                                                cVar11 = cVar3;
                                                i112 = i10;
                                                i113 = i9;
                                                z45 = z6;
                                                z47 = z7;
                                                i109 = i2;
                                                j31 = j35;
                                                ti4Var = ti4Var18;
                                                i115 = i6;
                                            } else {
                                                throw new a14(charSequence3, str19);
                                            }
                                        } else {
                                            k64Var2 = k64Var6;
                                            str4 = "ipaddress.error.segment.too.long.at.index";
                                            ti4Var4 = ti4Var3;
                                            aVar = aVar6;
                                            if (V0 >= 4) {
                                                throw new a14(charSequence3, "ipaddress.error.ipv4.too.many.segments");
                                            }
                                        }
                                    }
                                } else if (V0 == 0) {
                                    if (w14Var4.J) {
                                        p64.a aVar7 = p64.a.DOTTED;
                                        p64Var2.w3(aVar7);
                                        str3 = "ipaddress.error.empty.segment.at.index";
                                        k64Var2.G(4);
                                        i11 = i117;
                                        str4 = "ipaddress.error.segment.too.long.at.index";
                                        bVar = bVar4;
                                        ec4Var2 = ti4Var2;
                                        ti4Var4 = ti4Var3;
                                        z8 = true;
                                        m64Var2 = m64Var;
                                        aVar2 = aVar7;
                                        z9 = z41;
                                        if (i7 <= 0) {
                                            int i130 = i122;
                                            int i131 = i7;
                                            int i132 = i10;
                                            int i133 = i132 + i121;
                                            int i134 = i111 - i133;
                                            if (z49) {
                                                if (i134 == 1) {
                                                    i21 = i9;
                                                    if (i121 == 0 && i21 < 0 && i130 < 0) {
                                                        f(i133, i111, k64Var2, V0, 10, i132);
                                                        k64Var2.E();
                                                        i111++;
                                                        i122 = i130;
                                                        i116 = i131;
                                                        cVar10 = ec4Var2;
                                                        aVar5 = aVar2;
                                                        i117 = i11;
                                                        w14Var2 = s14Var2;
                                                        z46 = z54;
                                                        i125 = i8;
                                                        z43 = z4;
                                                        ec4Var6 = ec4Var;
                                                        z44 = z5;
                                                        z42 = z8;
                                                        z41 = z9;
                                                        bVar4 = bVar;
                                                        k64Var = k64Var2;
                                                        i114 = i5;
                                                        cVar11 = cVar3;
                                                        z45 = z6;
                                                        z47 = z7;
                                                        z49 = false;
                                                        i109 = i2;
                                                        i112 = i111;
                                                        i113 = i21;
                                                        j31 = j35;
                                                        ti4Var = ti4Var4;
                                                        i115 = i6;
                                                        s14Var4 = s14Var;
                                                        i110 = i112;
                                                    }
                                                } else {
                                                    i21 = i9;
                                                    i121++;
                                                    i133++;
                                                    i134--;
                                                }
                                                i22 = i121;
                                                z49 = false;
                                            } else {
                                                i21 = i9;
                                                i22 = i121;
                                            }
                                            if (i134 != 0) {
                                                String str20 = str3;
                                                boolean z56 = i22 > 0;
                                                boolean z57 = i118 > 0;
                                                if (z40 || i130 >= 0) {
                                                    boolean z58 = z56;
                                                    i18 = i131;
                                                    i23 = i21;
                                                    ti4Var5 = ti4Var4;
                                                    i24 = i22;
                                                    i25 = V0;
                                                    i14 = i111;
                                                    charSequence2 = charSequence3;
                                                    str5 = str20;
                                                    String str21 = str4;
                                                    str6 = "ipaddress.error.segment.leading.zeros";
                                                    ec4Var3 = ec4Var;
                                                    i26 = i132;
                                                    ti4 ti4Var19 = ec4Var2;
                                                    if (!z40) {
                                                        cVar6 = cVar3;
                                                        if (ti4Var19.z) {
                                                            if (ec4Var3.L) {
                                                                if (z58 && !ec4Var3.N) {
                                                                    throw new a14(charSequence2, str6);
                                                                }
                                                                if (i134 <= 8) {
                                                                    m64Var3 = m64Var;
                                                                    i27 = i134;
                                                                    m64Var3.B4(true);
                                                                } else {
                                                                    throw new a14(charSequence2, str21, i26);
                                                                }
                                                            } else {
                                                                throw new a14(charSequence2, "ipaddress.error.ipv4.segment.hex");
                                                            }
                                                        } else {
                                                            throw new a14(charSequence2, str6);
                                                        }
                                                    } else if (i134 > 4) {
                                                        throw new a14(charSequence2, str21, i26);
                                                    } else {
                                                        int i135 = i134 + i24;
                                                        if (i130 < 0) {
                                                            if (i24 > 0 && !ti4Var19.z) {
                                                                throw new a14(charSequence2, str6);
                                                            }
                                                            if (!ti4Var19.A && i135 > 4) {
                                                                throw new a14(charSequence2, str21, i26);
                                                            }
                                                            w14.c cVar13 = cVar3;
                                                            if (!cVar13.D && i135 < 4) {
                                                                throw new a14(charSequence2, "ipaddress.error.segment.too.short.at.index", i26);
                                                            }
                                                            i27 = i134;
                                                            cVar6 = cVar13;
                                                            m64Var3 = m64Var;
                                                        } else {
                                                            throw new a14(charSequence2, i130);
                                                        }
                                                    }
                                                    if (!z57) {
                                                        i28 = i133;
                                                        m64Var4 = m64Var3;
                                                        cVar7 = cVar6;
                                                        ti4Var7 = ti4Var19;
                                                        str7 = str21;
                                                        j4 = j35;
                                                        z11 = false;
                                                    } else if (i23 < 0) {
                                                        m64Var4 = m64Var3;
                                                        int i136 = i133;
                                                        i28 = i133;
                                                        cVar7 = cVar6;
                                                        ti4Var7 = ti4Var19;
                                                        m(j35, charSequence, i136, i14, i118, k64Var2, i25, i26, ti4Var7);
                                                        str7 = str21;
                                                        j4 = 0;
                                                        z11 = true;
                                                        i118 = 0;
                                                    } else {
                                                        throw new a14(charSequence2, i14, true);
                                                    }
                                                    i29 = i27;
                                                    i30 = 0;
                                                    i13 = -1;
                                                    i31 = 16;
                                                    int i137 = i28;
                                                    z12 = z11;
                                                    i32 = i137;
                                                } else {
                                                    if (z56) {
                                                        ti4Var5 = ti4Var4;
                                                        ec4 ec4Var7 = ec4Var;
                                                        boolean z59 = ec4Var7.F && z(charSequence3, i133);
                                                        i18 = i131;
                                                        if (!z59 && !ec4Var7.M) {
                                                            z15 = z56;
                                                            i23 = i21;
                                                            ec4Var3 = ec4Var7;
                                                            i24 = i22;
                                                            i25 = V0;
                                                            i14 = i111;
                                                            charSequence2 = charSequence3;
                                                            str5 = str20;
                                                            str6 = "ipaddress.error.segment.leading.zeros";
                                                            i13 = i130;
                                                        } else if (!ec4Var2.z) {
                                                            throw new a14(charSequence3, "ipaddress.error.segment.leading.zeros");
                                                        } else {
                                                            if (!z59) {
                                                                int i138 = i21;
                                                                i25 = V0;
                                                                i14 = i111;
                                                                m64 m64Var7 = m64Var2;
                                                                str5 = str20;
                                                                String str22 = str4;
                                                                i13 = i130;
                                                                i26 = i132;
                                                                int i139 = i22;
                                                                charSequence2 = charSequence3;
                                                                if (i139 > 1) {
                                                                    ec4Var3 = ec4Var7;
                                                                    if (!ec4Var3.N) {
                                                                        throw new a14(charSequence2, "ipaddress.error.segment.leading.zeros");
                                                                    }
                                                                    i18 = i18;
                                                                    str6 = "ipaddress.error.segment.leading.zeros";
                                                                } else {
                                                                    ec4Var3 = ec4Var7;
                                                                    str6 = "ipaddress.error.segment.leading.zeros";
                                                                    i18 = i18;
                                                                }
                                                                if (i134 <= 11) {
                                                                    m64Var7.B4(true);
                                                                    if (z57) {
                                                                        i23 = i138;
                                                                        if (i23 < 0) {
                                                                            i24 = i139;
                                                                            ti4 ti4Var20 = ec4Var2;
                                                                            W(j35, charSequence, i133, i14, i118, k64Var2, i25, i26, ti4Var20);
                                                                            ti4Var7 = ti4Var20;
                                                                            i32 = i133;
                                                                            i29 = i134;
                                                                            m64Var4 = m64Var7;
                                                                            str7 = str22;
                                                                            j4 = 0;
                                                                            cVar7 = cVar3;
                                                                            i30 = 0;
                                                                            z12 = true;
                                                                            i118 = 0;
                                                                            i31 = 8;
                                                                        } else {
                                                                            throw new a14(charSequence2, i14, true);
                                                                        }
                                                                    } else {
                                                                        i24 = i139;
                                                                        i23 = i138;
                                                                        ti4Var7 = ec4Var2;
                                                                        i32 = i133;
                                                                        i29 = i134;
                                                                        j4 = Z(j35, charSequence2, i134);
                                                                        m64Var4 = m64Var7;
                                                                        cVar7 = cVar3;
                                                                        z12 = false;
                                                                        i31 = 8;
                                                                        str7 = str22;
                                                                        i30 = 0;
                                                                    }
                                                                } else {
                                                                    throw new a14(charSequence2, str22, i26);
                                                                }
                                                            } else if (i134 <= 33) {
                                                                int i140 = i133 + 1;
                                                                int i141 = i134 - 1;
                                                                m64Var2.e4(true);
                                                                if (!z57) {
                                                                    int i142 = i21;
                                                                    int i143 = i22;
                                                                    i25 = V0;
                                                                    i14 = i111;
                                                                    charSequence2 = charSequence3;
                                                                    str5 = str20;
                                                                    String str23 = str4;
                                                                    i13 = i130;
                                                                    m64Var4 = m64Var2;
                                                                    if (i141 > 16) {
                                                                        i32 = i140;
                                                                        Y = M(charSequence2, i32, i14);
                                                                    } else {
                                                                        i32 = i140;
                                                                        Y = Y(j35, charSequence2, i141);
                                                                    }
                                                                    i18 = i18;
                                                                    j4 = Y;
                                                                    i29 = i141;
                                                                    ti4Var7 = ec4Var2;
                                                                    i24 = i143;
                                                                    i26 = i132;
                                                                    ec4Var3 = ec4Var7;
                                                                    cVar7 = cVar3;
                                                                    i23 = i142;
                                                                    str6 = "ipaddress.error.segment.leading.zeros";
                                                                    str7 = str23;
                                                                    i30 = 0;
                                                                    z12 = false;
                                                                } else if (i21 >= 0) {
                                                                    throw new a14(charSequence3, i111, true);
                                                                } else {
                                                                    if (i141 > 16) {
                                                                        i36 = i132;
                                                                        i37 = i21;
                                                                        i38 = i140;
                                                                        ec4Var5 = ec4Var7;
                                                                        str5 = str20;
                                                                        i41 = i141;
                                                                        i39 = i22;
                                                                        i13 = i130;
                                                                        ti4Var8 = ec4Var2;
                                                                        R(charSequence, i140, i111, i118, k64Var2, V0, i36, ti4Var8);
                                                                        i25 = V0;
                                                                        i14 = i111;
                                                                        m64Var4 = m64Var2;
                                                                        charSequence2 = charSequence3;
                                                                        str8 = str4;
                                                                        str9 = "ipaddress.error.segment.leading.zeros";
                                                                        i40 = i18;
                                                                    } else {
                                                                        i36 = i132;
                                                                        i37 = i21;
                                                                        i38 = i140;
                                                                        ec4Var5 = ec4Var7;
                                                                        i39 = i22;
                                                                        i25 = V0;
                                                                        i14 = i111;
                                                                        str5 = str20;
                                                                        i13 = i130;
                                                                        i40 = i18;
                                                                        i41 = i141;
                                                                        m64Var4 = m64Var2;
                                                                        ti4Var8 = ec4Var2;
                                                                        str8 = str4;
                                                                        str9 = "ipaddress.error.segment.leading.zeros";
                                                                        charSequence2 = charSequence3;
                                                                        V(j35, charSequence, i38, i14, i118, k64Var2, i25, i36, ti4Var8);
                                                                    }
                                                                    i32 = i38;
                                                                    i18 = i40;
                                                                    ti4Var7 = ti4Var8;
                                                                    i29 = i41;
                                                                    i24 = i39;
                                                                    i26 = i36;
                                                                    j4 = 0;
                                                                    ec4Var3 = ec4Var5;
                                                                    cVar7 = cVar3;
                                                                    i23 = i37;
                                                                    str6 = str9;
                                                                    str7 = str8;
                                                                    i30 = 0;
                                                                    z12 = true;
                                                                    i118 = 0;
                                                                }
                                                                i31 = 2;
                                                            } else {
                                                                throw new a14(charSequence3, str4, i132);
                                                            }
                                                        }
                                                    } else {
                                                        z15 = z56;
                                                        i13 = i130;
                                                        i18 = i131;
                                                        i23 = i21;
                                                        ti4Var5 = ti4Var4;
                                                        i24 = i22;
                                                        i25 = V0;
                                                        i14 = i111;
                                                        charSequence2 = charSequence3;
                                                        str5 = str20;
                                                        str6 = "ipaddress.error.segment.leading.zeros";
                                                        ec4Var3 = ec4Var;
                                                    }
                                                    i26 = i132;
                                                    m64 m64Var8 = m64Var2;
                                                    ti4 ti4Var21 = ec4Var2;
                                                    String str24 = str4;
                                                    if (z15) {
                                                        if (ti4Var21.z) {
                                                            m64Var8.g4(true);
                                                        } else {
                                                            throw new a14(charSequence2, str6);
                                                        }
                                                    }
                                                    if (i134 > 10) {
                                                        throw new a14(charSequence2, str24, i26);
                                                    }
                                                    if (!z57) {
                                                        i32 = i133;
                                                        i29 = i134;
                                                        j4 = X(j35, charSequence2, i134);
                                                        ti4Var7 = ti4Var21;
                                                        cVar7 = cVar3;
                                                        str7 = str24;
                                                        i30 = 262144;
                                                        z12 = false;
                                                    } else if (i23 < 0) {
                                                        U(j35, charSequence, i133, i14, i118, k64Var2, i25, i26, ec4Var3);
                                                        i32 = i133;
                                                        i29 = i134;
                                                        ti4Var7 = ti4Var21;
                                                        j4 = 0;
                                                        cVar7 = cVar3;
                                                        str7 = str24;
                                                        i30 = 0;
                                                        z12 = true;
                                                        i118 = 0;
                                                    } else {
                                                        throw new a14(charSequence2, i14, true);
                                                    }
                                                    i31 = 10;
                                                    m64Var4 = m64Var;
                                                }
                                                j5 = j4;
                                                i33 = i118;
                                                j3 = 0;
                                                i34 = 0;
                                                z13 = false;
                                                i35 = i32;
                                                z14 = z12;
                                            } else if (i21 < 0 || i130 >= 0 || !ec4Var2.x.f()) {
                                                break;
                                            } else {
                                                if (z40) {
                                                    i54 = 16;
                                                    j5 = av5.s;
                                                } else {
                                                    i54 = 10;
                                                    j5 = 255;
                                                }
                                                i34 = 4194304;
                                                i31 = i54;
                                                i13 = i130;
                                                i18 = i131;
                                                i23 = i21;
                                                i35 = i133;
                                                j3 = j35;
                                                ti4Var5 = ti4Var4;
                                                i24 = i22;
                                                i25 = V0;
                                                i14 = i111;
                                                charSequence2 = charSequence3;
                                                str7 = str4;
                                                str6 = "ipaddress.error.segment.leading.zeros";
                                                str5 = str3;
                                                i33 = i118;
                                                z13 = z50;
                                                ec4Var3 = ec4Var;
                                                cVar7 = cVar3;
                                                z14 = false;
                                                i26 = i132;
                                                i29 = i134;
                                                m64Var4 = m64Var2;
                                                ti4Var7 = ec4Var2;
                                                i30 = 0;
                                            }
                                            if (i23 >= 0) {
                                                int i144 = i6;
                                                int i145 = i23 - i144;
                                                int i146 = i5;
                                                int i147 = i145 - i146;
                                                int i148 = i26;
                                                int i149 = i35;
                                                ti4Var6 = ti4Var7;
                                                if (!ti4Var6.x.g()) {
                                                    throw new a14(charSequence2, "ipaddress.error.no.range");
                                                }
                                                if (i124 > 0 || i119 > 0) {
                                                    break;
                                                }
                                                boolean z60 = i145 == i23;
                                                boolean z61 = i146 > 0;
                                                w14.c cVar14 = cVar7;
                                                if (!z40) {
                                                    int i150 = i123;
                                                    if (i150 >= 0) {
                                                        i123 = i150;
                                                    } else {
                                                        if (!z61) {
                                                            i43 = i145;
                                                            z18 = z60;
                                                            i16 = i144;
                                                            j6 = j33;
                                                        } else if (ti4Var6.z) {
                                                            if (!ec4Var3.F || !z(charSequence2, i145)) {
                                                                z18 = z60;
                                                                i16 = i144;
                                                                j6 = j33;
                                                                i43 = i145;
                                                                if (ec4Var3.M) {
                                                                    if (i146 > 1 && !ec4Var3.N) {
                                                                        throw new a14(charSequence2, str6);
                                                                    }
                                                                    if (i16 <= 11) {
                                                                        m64Var4.B4(true);
                                                                        long Z = Z(j6, charSequence2, i16);
                                                                        j8 = Z;
                                                                        z16 = i29 != 0 && Z > j5;
                                                                        i45 = 8;
                                                                    } else {
                                                                        throw new a14(charSequence2, str7, i147);
                                                                    }
                                                                }
                                                            } else if (i144 <= 33) {
                                                                m64Var4.e4(true);
                                                                int i151 = i145 + 1;
                                                                i16 = i144 - 1;
                                                                if (i16 > 16) {
                                                                    Y2 = M(charSequence2, i151, i23);
                                                                    z18 = z60;
                                                                    j6 = j33;
                                                                } else {
                                                                    z18 = z60;
                                                                    j6 = j33;
                                                                    Y2 = Y(j6, charSequence2, i16);
                                                                }
                                                                z16 = i29 != 0 && Y2 > j5;
                                                                j8 = Y2;
                                                                i43 = i151;
                                                                i45 = 2;
                                                            } else {
                                                                throw new a14(charSequence2, str7, i147);
                                                            }
                                                            if (i45 == 0) {
                                                                i44 = i23;
                                                            } else if (!z18) {
                                                                i45 = 10;
                                                                if (i16 <= 10) {
                                                                    j8 = X(j6, charSequence2, i16);
                                                                    if (z61) {
                                                                        if (ti4Var6.z) {
                                                                            m64Var4.g4(true);
                                                                        } else {
                                                                            throw new a14(charSequence2, str6);
                                                                        }
                                                                    }
                                                                    boolean z62 = i29 != 0 && j8 > j5;
                                                                    if (!z62) {
                                                                        i34 = (i24 != 0 || (i30 & 262144) == 0) ? i34 | 262144 : i34 | 786432;
                                                                    }
                                                                    i44 = i23;
                                                                    z16 = z62;
                                                                } else {
                                                                    throw new a14(charSequence2, str7, i147);
                                                                }
                                                            } else if (!ti4Var6.x.f()) {
                                                                throw new a14(charSequence2, str5, i14);
                                                            } else {
                                                                i34 |= 2097152;
                                                                i44 = i23;
                                                                i5 = i146;
                                                                i15 = i150;
                                                                cVar4 = cVar14;
                                                                i45 = 10;
                                                                if (z16) {
                                                                    i47 = i43;
                                                                    j9 = j8;
                                                                    i48 = i148;
                                                                    i49 = i44;
                                                                    j10 = j5;
                                                                    i50 = i31;
                                                                    i51 = i149;
                                                                    i52 = i14;
                                                                    i53 = i147;
                                                                    i31 = i45;
                                                                } else if (!ti4Var6.x.h()) {
                                                                    throw new a14(charSequence2, "ipaddress.error.invalidRange");
                                                                } else {
                                                                    i47 = i149;
                                                                    i49 = i14;
                                                                    i48 = i147;
                                                                    i50 = i45;
                                                                    j9 = j5;
                                                                    long j36 = j8;
                                                                    i51 = i43;
                                                                    i53 = i148;
                                                                    i52 = i44;
                                                                    j10 = j36;
                                                                }
                                                                h(i47, i49, i53, i51, i52, i48, k64Var2, i25, j9, j10, i34 | 1048576 | i31, i50);
                                                                j2 = j6;
                                                                i17 = -1;
                                                            }
                                                            i5 = i146;
                                                            i15 = i150;
                                                            cVar4 = cVar14;
                                                            if (z16) {
                                                            }
                                                            h(i47, i49, i53, i51, i52, i48, k64Var2, i25, j9, j10, i34 | 1048576 | i31, i50);
                                                            j2 = j6;
                                                            i17 = -1;
                                                        } else {
                                                            throw new a14(charSequence2, str6);
                                                        }
                                                        j8 = 0;
                                                        i45 = 0;
                                                        z16 = false;
                                                        if (i45 == 0) {
                                                        }
                                                        i5 = i146;
                                                        i15 = i150;
                                                        cVar4 = cVar14;
                                                        if (z16) {
                                                        }
                                                        h(i47, i49, i53, i51, i52, i48, k64Var2, i25, j9, j10, i34 | 1048576 | i31, i50);
                                                        j2 = j6;
                                                        i17 = -1;
                                                    }
                                                }
                                                i43 = i145;
                                                boolean z63 = z60;
                                                i16 = i144;
                                                j6 = j33;
                                                String str25 = str5;
                                                if (z40) {
                                                    int i152 = i16 + i146;
                                                    if (i123 < 0) {
                                                        i5 = i146;
                                                        if (z61 && !ti4Var6.z) {
                                                            throw new a14(charSequence2, str6);
                                                        }
                                                        if (ti4Var6.A) {
                                                            i46 = 4;
                                                        } else {
                                                            i46 = 4;
                                                            if (i152 > 4) {
                                                                throw new a14(charSequence2, str7, i147);
                                                            }
                                                        }
                                                        i44 = i23;
                                                        cVar4 = cVar14;
                                                        if (!cVar4.D && i152 < i46) {
                                                            throw new a14(charSequence2, "ipaddress.error.segment.too.short.at.index", i147);
                                                        }
                                                        if (z63) {
                                                            if (!ti4Var6.x.f()) {
                                                                throw new a14(charSequence2, str25, i14);
                                                            }
                                                            i34 |= 2097152;
                                                            j7 = 0;
                                                            z17 = false;
                                                        } else if (i16 > 4) {
                                                            throw new a14(charSequence2, str7, i147);
                                                        } else {
                                                            z17 = j6 > j5 && i29 != 0;
                                                            j7 = j6;
                                                        }
                                                        z16 = z17;
                                                        i15 = i123;
                                                    } else {
                                                        throw new a14(charSequence2, i123);
                                                    }
                                                } else {
                                                    i44 = i23;
                                                    i5 = i146;
                                                    i15 = i123;
                                                    cVar4 = cVar14;
                                                    if (ti4Var6.z) {
                                                        if (ec4Var3.L) {
                                                            if (z61 && !ec4Var3.N) {
                                                                throw new a14(charSequence2, str6);
                                                            }
                                                            if (z63) {
                                                                throw new a14(charSequence2, str25, i14);
                                                            }
                                                            if (i16 <= 8) {
                                                                m64Var4.B4(true);
                                                                z16 = j6 > j5 && i29 != 0;
                                                                j7 = j6;
                                                            } else {
                                                                throw new a14(charSequence2, str7, i147);
                                                            }
                                                        } else {
                                                            throw new a14(charSequence2, "ipaddress.error.ipv4.segment.hex");
                                                        }
                                                    } else {
                                                        throw new a14(charSequence2, str6);
                                                    }
                                                }
                                                j8 = j7;
                                                i45 = 16;
                                                if (z16) {
                                                }
                                                h(i47, i49, i53, i51, i52, i48, k64Var2, i25, j9, j10, i34 | 1048576 | i31, i50);
                                                j2 = j6;
                                                i17 = -1;
                                            } else {
                                                i17 = i23;
                                                cVar4 = cVar7;
                                                int i153 = i26;
                                                int i154 = i35;
                                                ti4Var6 = ti4Var7;
                                                i15 = i123;
                                                long j37 = j33;
                                                int i155 = i6;
                                                if (z14) {
                                                    i42 = i155;
                                                    j2 = j37;
                                                } else {
                                                    j2 = j37;
                                                    i42 = i155;
                                                    k(i154, i14, i153, k64Var2, i25, j5, i30 | i31);
                                                }
                                                i16 = i42;
                                            }
                                            z50 = z13;
                                            i118 = i33;
                                            i121 = 0;
                                        } else if (!ec4Var2.x.n()) {
                                            throw new a14(charSequence3, "ipaddress.error.no.wildcard");
                                        } else {
                                            int i156 = i7;
                                            if (i156 != i111 - i4 || (i12 = i122) >= 0) {
                                                break;
                                            }
                                            k64Var2.U();
                                            int i157 = i111 - i156;
                                            g(i157, i111, i157, i157, i111, i157, k64Var2, V0, 0L, z40 ? av5.s : 255L, 65536);
                                            i13 = i12;
                                            ti4Var5 = ti4Var4;
                                            i14 = i111;
                                            ti4Var6 = ec4Var2;
                                            charSequence2 = charSequence3;
                                            i15 = i123;
                                            j2 = j33;
                                            i16 = i6;
                                            ec4Var3 = ec4Var;
                                            i17 = i9;
                                            i18 = 0;
                                            j3 = j35;
                                            cVar4 = cVar3;
                                        }
                                        k64Var2.E();
                                        i110 = i14 + 1;
                                        i10 = i110;
                                        cVar10 = ti4Var6;
                                        j33 = j2;
                                        aVar3 = aVar2;
                                        z10 = z50;
                                        ti4Var3 = ti4Var5;
                                        i116 = i18;
                                        z42 = z8;
                                        z41 = z9;
                                        bVar4 = bVar;
                                        k64Var3 = k64Var2;
                                        z45 = z6;
                                        i122 = i13;
                                        i19 = i15;
                                        i111 = i10;
                                        i20 = i121;
                                        ec4Var4 = ec4Var3;
                                        i113 = i17;
                                        w14.c cVar122 = cVar4;
                                        i115 = i16;
                                        cVar5 = cVar122;
                                    } else {
                                        throw new a14(charSequence3, str2);
                                    }
                                } else {
                                    str3 = "ipaddress.error.empty.segment.at.index";
                                    k64 k64Var7 = k64Var2;
                                    p64.a aVar8 = aVar5;
                                    if (aVar8 == p64.a.DOTTED) {
                                        if (V0 >= (w14Var4.F == w14.a.MAC ? 3 : 4)) {
                                            throw new a14(charSequence3, str);
                                        }
                                        k64Var2 = k64Var7;
                                        i11 = i117;
                                        str4 = "ipaddress.error.segment.too.long.at.index";
                                        ti4Var4 = ti4Var3;
                                        m64Var2 = m64Var;
                                        aVar = aVar8;
                                    } else {
                                        throw new a14(charSequence3, "ipaddress.mac.error.mix.format.characters.at.index", i111);
                                    }
                                }
                                z8 = z42;
                                bVar = bVar4;
                                aVar2 = aVar;
                                ec4Var2 = ti4Var2;
                                z9 = z41;
                                if (i7 <= 0) {
                                }
                                k64Var2.E();
                                i110 = i14 + 1;
                                i10 = i110;
                                cVar10 = ti4Var6;
                                j33 = j2;
                                aVar3 = aVar2;
                                z10 = z50;
                                ti4Var3 = ti4Var5;
                                i116 = i18;
                                z42 = z8;
                                z41 = z9;
                                bVar4 = bVar;
                                k64Var3 = k64Var2;
                                z45 = z6;
                                i122 = i13;
                                i19 = i15;
                                i111 = i10;
                                i20 = i121;
                                ec4Var4 = ec4Var3;
                                i113 = i17;
                                w14.c cVar1222 = cVar4;
                                i115 = i16;
                                cVar5 = cVar1222;
                            } else {
                                int i158 = i111;
                                i11 = i117;
                                charSequence2 = charSequence3;
                                int i159 = i122;
                                int i160 = i7;
                                String str26 = str;
                                ti4 ti4Var22 = ti4Var3;
                                int i161 = i10;
                                i113 = i9;
                                p64.a aVar9 = aVar5;
                                int i162 = i123;
                                int i163 = i6;
                                if (charAt == ':') {
                                    w14Var3 = w14Var;
                                    i55 = i158;
                                    i56 = i161;
                                    i57 = i160;
                                    str10 = "ipaddress.error.empty.segment.at.index";
                                    i58 = i159;
                                    ti4Var9 = ti4Var22;
                                    ti4Var10 = ti4Var2;
                                    k64Var4 = k64Var2;
                                    str11 = str2;
                                    z45 = z6;
                                    str12 = "ipaddress.error.segment.too.long.at.index";
                                    z19 = false;
                                    i59 = i113;
                                    j11 = j35;
                                    z20 = z48;
                                    i60 = i4;
                                    str13 = "ipaddress.error.segment.leading.zeros";
                                    z21 = false;
                                } else {
                                    boolean z64 = charAt == '-';
                                    if (z64 || (z40 && charAt == '|')) {
                                        boolean z65 = !z64;
                                        if (z40) {
                                            if (aVar9 != null) {
                                                z34 = z64;
                                                i57 = i160;
                                                str10 = "ipaddress.error.empty.segment.at.index";
                                                i58 = i159;
                                                ti4Var9 = ti4Var22;
                                                ti4Var10 = ti4Var2;
                                                k64Var4 = k64Var2;
                                                str11 = str2;
                                                str12 = "ipaddress.error.segment.too.long.at.index";
                                                w14Var3 = w14Var;
                                                j11 = j35;
                                                str13 = "ipaddress.error.segment.leading.zeros";
                                                if (aVar9 == p64.a.DASHED) {
                                                    i101 = i161;
                                                    z35 = z48;
                                                    i55 = i158;
                                                    z45 = z6;
                                                } else if (z65) {
                                                    throw new a14(charSequence2, i158);
                                                } else {
                                                    i55 = i158;
                                                }
                                            } else if (i113 < 0 || z48) {
                                                z34 = z64;
                                                i57 = i160;
                                                str10 = "ipaddress.error.empty.segment.at.index";
                                                i58 = i159;
                                                ti4Var9 = ti4Var22;
                                                ti4Var10 = ti4Var2;
                                                k64Var4 = k64Var2;
                                                str11 = str2;
                                                str12 = "ipaddress.error.segment.too.long.at.index";
                                                w14Var3 = w14Var;
                                                j11 = j35;
                                                str13 = "ipaddress.error.segment.leading.zeros";
                                                if (z65) {
                                                    i101 = i161;
                                                    i55 = i158;
                                                    z45 = z6;
                                                    z35 = true;
                                                    z48 = false;
                                                    if (z48) {
                                                        if (i11 >= 0) {
                                                            i111 = i55 + 1;
                                                            cVar10 = ti4Var10;
                                                            z48 = z35;
                                                            k64Var = k64Var4;
                                                            i123 = i162;
                                                            i122 = i58;
                                                            aVar5 = aVar9;
                                                            i117 = i11;
                                                        } else if (i113 < 0) {
                                                            int i164 = ((i55 - i101) - i121) - i57;
                                                            if (z49 && i164 != 1) {
                                                                i121++;
                                                                i164--;
                                                            }
                                                            i115 = i164;
                                                            i111 = i55 + 1;
                                                            z53 = z34;
                                                            p64Var2 = p64Var;
                                                            cVar10 = ti4Var10;
                                                            i113 = i55;
                                                            z48 = z35;
                                                            k64Var = k64Var4;
                                                            i123 = i58;
                                                            aVar5 = aVar9;
                                                            ti4Var = ti4Var9;
                                                            i124 = i118;
                                                            i117 = i11;
                                                            w14Var2 = s14Var2;
                                                            i114 = i121;
                                                            z52 = z51;
                                                            z46 = z54;
                                                            i125 = i8;
                                                            z43 = z4;
                                                            i119 = i57;
                                                            i110 = i4;
                                                            ec4Var6 = ec4Var;
                                                            z44 = z5;
                                                            j33 = j11;
                                                            cVar11 = cVar3;
                                                            z47 = z7;
                                                            i116 = 0;
                                                            i118 = 0;
                                                            i121 = 0;
                                                            z49 = false;
                                                            z50 = false;
                                                            i122 = -1;
                                                            z51 = false;
                                                            s14Var4 = s14Var;
                                                            i109 = i2;
                                                            i112 = i111;
                                                            j31 = 0;
                                                            w14 w14Var5 = w14Var3;
                                                            charSequence3 = charSequence2;
                                                            w14Var4 = w14Var5;
                                                        } else if (!z41) {
                                                            throw new a14(charSequence2, i55, true);
                                                        } else {
                                                            i111 = i55 + 1;
                                                            cVar10 = ti4Var10;
                                                            i117 = i55;
                                                            z48 = z35;
                                                            k64Var = k64Var4;
                                                            i123 = i162;
                                                            i122 = i58;
                                                            aVar5 = aVar9;
                                                        }
                                                        w14Var2 = s14Var2;
                                                        i125 = i8;
                                                        z43 = z4;
                                                        i116 = i57;
                                                        i110 = i4;
                                                        ec4Var6 = ec4Var;
                                                        z44 = z5;
                                                        j31 = j11;
                                                        i114 = i5;
                                                        cVar11 = cVar3;
                                                        z47 = z7;
                                                        s14Var4 = s14Var;
                                                        i109 = i2;
                                                        i115 = i163;
                                                        i112 = i101;
                                                        ti4Var = ti4Var9;
                                                        z46 = z54;
                                                        p64Var2 = p64Var;
                                                        w14 w14Var52 = w14Var3;
                                                        charSequence3 = charSequence2;
                                                        w14Var4 = w14Var52;
                                                    } else {
                                                        z20 = z35;
                                                        i56 = i101;
                                                        z19 = false;
                                                        z21 = z34;
                                                        i59 = i113;
                                                        i60 = i4;
                                                    }
                                                } else {
                                                    i101 = i161;
                                                    z35 = z48;
                                                    i55 = i158;
                                                    z45 = z6;
                                                    if (z48) {
                                                    }
                                                }
                                            } else if (i162 >= 0) {
                                                throw new a14(charSequence2, i162);
                                            } else {
                                                if (i159 < 0) {
                                                    if (w14Var.G) {
                                                        p64.a aVar10 = p64.a.DASHED;
                                                        z34 = z64;
                                                        p64Var.w3(aVar10);
                                                        k64Var4 = k64Var2;
                                                        k64Var4.G(8);
                                                        if (i119 > 0) {
                                                            ti4Var10 = ti4Var2;
                                                            if (!ti4Var10.x.n()) {
                                                                throw new a14(charSequence2, "ipaddress.error.no.wildcard");
                                                            }
                                                            if (i124 > 0 || i5 > 0 || i163 > 0 || i162 >= 0) {
                                                                break;
                                                            }
                                                            k64Var4.U();
                                                            int i165 = i113 - i119;
                                                            g(i165, i113, i165, i165, i113, i165, k64Var4, 0, 0L, (z7 || i158 - i161 == 6) ? 16777215L : 255L, 65536);
                                                            i102 = i158;
                                                            i57 = i160;
                                                            str10 = "ipaddress.error.empty.segment.at.index";
                                                            i58 = i159;
                                                            j11 = j35;
                                                            aVar4 = aVar10;
                                                            ti4Var9 = ti4Var22;
                                                            str12 = "ipaddress.error.segment.too.long.at.index";
                                                            str18 = "ipaddress.error.segment.leading.zeros";
                                                        } else {
                                                            ti4Var10 = ti4Var2;
                                                            if (!ti4Var10.z && i5 > 0) {
                                                                throw new a14(charSequence2, "ipaddress.error.segment.leading.zeros");
                                                            }
                                                            str18 = "ipaddress.error.segment.leading.zeros";
                                                            int i166 = i113 - i163;
                                                            int i167 = i166 - i5;
                                                            if (i124 > 0) {
                                                                i102 = i158;
                                                                i57 = i160;
                                                                str10 = "ipaddress.error.empty.segment.at.index";
                                                                i58 = i159;
                                                                j11 = j35;
                                                                aVar4 = aVar10;
                                                                ti4Var9 = ti4Var22;
                                                                str12 = "ipaddress.error.segment.too.long.at.index";
                                                                m(j33, charSequence, i166, i113, i118, k64Var4, 0, i167, ti4Var10);
                                                            } else {
                                                                i102 = i158;
                                                                i57 = i160;
                                                                str10 = "ipaddress.error.empty.segment.at.index";
                                                                i58 = i159;
                                                                j11 = j35;
                                                                aVar4 = aVar10;
                                                                ti4Var9 = ti4Var22;
                                                                str12 = "ipaddress.error.segment.too.long.at.index";
                                                                if (z52) {
                                                                    i103 = 0;
                                                                } else if (i163 == 0) {
                                                                    throw new a14(charSequence2, str10, i166);
                                                                } else {
                                                                    i103 = 262144;
                                                                }
                                                                k(i166, i113, i167, k64Var4, 0, j33, i103);
                                                                k64Var4.E();
                                                                w14Var3 = w14Var;
                                                                i101 = i113 + 1;
                                                                i4 = i101;
                                                                str13 = str18;
                                                                aVar9 = aVar4;
                                                                z35 = z48;
                                                                i55 = i102;
                                                                str11 = str2;
                                                                i113 = -1;
                                                                z42 = true;
                                                                z45 = false;
                                                            }
                                                        }
                                                        k64Var4.E();
                                                        w14Var3 = w14Var;
                                                        i101 = i113 + 1;
                                                        i4 = i101;
                                                        str13 = str18;
                                                        aVar9 = aVar4;
                                                        z35 = z48;
                                                        i55 = i102;
                                                        str11 = str2;
                                                        i113 = -1;
                                                        z42 = true;
                                                        z45 = false;
                                                    } else {
                                                        throw new a14(charSequence2, str2);
                                                    }
                                                } else {
                                                    throw new a14(charSequence2, i159);
                                                }
                                            }
                                            z48 = z34;
                                            if (z48) {
                                            }
                                        } else {
                                            z34 = z64;
                                            i55 = i158;
                                            i57 = i160;
                                            str10 = "ipaddress.error.empty.segment.at.index";
                                            i58 = i159;
                                            ti4Var9 = ti4Var22;
                                            ti4Var10 = ti4Var2;
                                            k64Var4 = k64Var2;
                                            str11 = str2;
                                            str12 = "ipaddress.error.segment.too.long.at.index";
                                            w14Var3 = w14Var;
                                            j11 = j35;
                                            str13 = "ipaddress.error.segment.leading.zeros";
                                        }
                                        i101 = i161;
                                        z35 = z48;
                                        z45 = z6;
                                        z48 = false;
                                        if (z48) {
                                        }
                                    } else if (z40 && charAt == ' ') {
                                        w14Var3 = w14Var;
                                        i55 = i158;
                                        i56 = i161;
                                        i57 = i160;
                                        str10 = "ipaddress.error.empty.segment.at.index";
                                        i58 = i159;
                                        ti4Var9 = ti4Var22;
                                        k64Var4 = k64Var2;
                                        str11 = str2;
                                        z45 = z6;
                                        str12 = "ipaddress.error.segment.too.long.at.index";
                                        z19 = true;
                                        i59 = i113;
                                        z20 = z48;
                                        i60 = i4;
                                        z21 = z64;
                                        ti4Var10 = ti4Var2;
                                        str13 = "ipaddress.error.segment.leading.zeros";
                                        j11 = j35;
                                    } else {
                                        if (charAt == '/') {
                                            if (!z40) {
                                                m64Var.n4(true);
                                                m64Var.w4(i158 + 1);
                                                i125 = i158;
                                                i123 = i162;
                                                i116 = i160;
                                                charSequence3 = charSequence2;
                                                aVar5 = aVar9;
                                                w14Var2 = s14Var2;
                                                z46 = z54;
                                                z43 = z4;
                                                ec4Var6 = ec4Var;
                                                z44 = z5;
                                                cVar10 = ti4Var2;
                                                i114 = i5;
                                                cVar11 = cVar3;
                                                z45 = z6;
                                                z47 = z7;
                                                s14Var4 = s14Var;
                                                w14Var4 = w14Var;
                                                i109 = i2;
                                                i112 = i161;
                                                i115 = i163;
                                                ti4Var = ti4Var22;
                                                i110 = i4;
                                                k64Var = k64Var2;
                                                i122 = i159;
                                                i111 = i125;
                                            } else {
                                                throw new a14(charSequence2, i158);
                                            }
                                        } else if (charAt < 'A' || charAt > 'F') {
                                            boolean z66 = charAt == '*';
                                            if (z66) {
                                                z36 = false;
                                            } else {
                                                z66 = charAt == '%';
                                                z36 = z66;
                                            }
                                            if (z66) {
                                                if (!z36 || z40) {
                                                    ti4Var16 = ti4Var22;
                                                } else {
                                                    ti4Var16 = ti4Var22;
                                                    if (ti4Var16.N) {
                                                        if (k64Var2.V0() <= 0 || (!z2 && m64Var.w2() != j14.b.IPV6)) {
                                                            if (!D(i158 - i161, i113 >= 0, i5 + i163, ti4Var16)) {
                                                                if (i160 == i158) {
                                                                }
                                                            }
                                                        }
                                                        m64Var.y4(true);
                                                        m64Var.w4(i158 + 1);
                                                        i125 = i158;
                                                        i116 = i160;
                                                        i122 = i159;
                                                        z41 = false;
                                                        i111 = i125;
                                                        s14Var4 = s14Var;
                                                        i123 = i162;
                                                        aVar5 = aVar9;
                                                        w14Var2 = s14Var2;
                                                        z46 = z54;
                                                        z43 = z4;
                                                        i110 = i4;
                                                        ec4Var6 = ec4Var;
                                                        z44 = z5;
                                                        cVar10 = ti4Var2;
                                                        i114 = i5;
                                                        cVar11 = cVar3;
                                                        z45 = z6;
                                                        z47 = z7;
                                                        i109 = i2;
                                                        i112 = i161;
                                                        i115 = i163;
                                                        ti4Var = ti4Var16;
                                                        k64Var = k64Var2;
                                                        charSequence3 = charSequence2;
                                                        w14Var4 = w14Var;
                                                    }
                                                }
                                                i116 = i160 + 1;
                                                i104 = i158 + 1;
                                                i122 = i159;
                                                i125 = i8;
                                                i111 = i104;
                                                s14Var4 = s14Var;
                                                i123 = i162;
                                                aVar5 = aVar9;
                                                w14Var2 = s14Var2;
                                                z46 = z54;
                                                z43 = z4;
                                                i110 = i4;
                                                ec4Var6 = ec4Var;
                                                z44 = z5;
                                                cVar10 = ti4Var2;
                                                i114 = i5;
                                                cVar11 = cVar3;
                                                z45 = z6;
                                                z47 = z7;
                                                i109 = i2;
                                                i112 = i161;
                                                i115 = i163;
                                                ti4Var = ti4Var16;
                                                k64Var = k64Var2;
                                                charSequence3 = charSequence2;
                                                w14Var4 = w14Var;
                                            } else {
                                                ti4Var16 = ti4Var22;
                                                if (charAt == '_') {
                                                    i104 = i158 + 1;
                                                    i118++;
                                                    i116 = i160;
                                                    i122 = i159;
                                                    i125 = i8;
                                                    z50 = true;
                                                    i111 = i104;
                                                    s14Var4 = s14Var;
                                                    i123 = i162;
                                                    aVar5 = aVar9;
                                                    w14Var2 = s14Var2;
                                                    z46 = z54;
                                                    z43 = z4;
                                                    i110 = i4;
                                                    ec4Var6 = ec4Var;
                                                    z44 = z5;
                                                    cVar10 = ti4Var2;
                                                    i114 = i5;
                                                    cVar11 = cVar3;
                                                    z45 = z6;
                                                    z47 = z7;
                                                    i109 = i2;
                                                    i112 = i161;
                                                    i115 = i163;
                                                    ti4Var = ti4Var16;
                                                    k64Var = k64Var2;
                                                    charSequence3 = charSequence2;
                                                    w14Var4 = w14Var;
                                                } else {
                                                    if (A(charAt)) {
                                                        if (!z50 && z49 && i121 <= 0 && i159 < 0 && i118 <= 0) {
                                                            if (z40) {
                                                                if (k64Var2.V0() > 0) {
                                                                    throw new a14(charSequence2, i158);
                                                                }
                                                            } else if (bVar4 != null && bVar4.g()) {
                                                                throw new a14(charSequence2, i158);
                                                            }
                                                            i111 = i158 + 1;
                                                            i122 = i158;
                                                            i116 = i160;
                                                            i161 = i111;
                                                            i125 = i8;
                                                            z49 = false;
                                                            s14Var4 = s14Var;
                                                            i123 = i162;
                                                            aVar5 = aVar9;
                                                            w14Var2 = s14Var2;
                                                            z46 = z54;
                                                            z43 = z4;
                                                            i110 = i4;
                                                            ec4Var6 = ec4Var;
                                                            z44 = z5;
                                                            cVar10 = ti4Var2;
                                                            i114 = i5;
                                                            cVar11 = cVar3;
                                                            z45 = z6;
                                                            z47 = z7;
                                                            i109 = i2;
                                                            i112 = i161;
                                                            i115 = i163;
                                                            ti4Var = ti4Var16;
                                                            k64Var = k64Var2;
                                                            charSequence3 = charSequence2;
                                                            w14Var4 = w14Var;
                                                        } else if (!z41) {
                                                            throw new a14(charSequence2, i158, true);
                                                        }
                                                    } else if (charAt == 187) {
                                                        if (!z41) {
                                                            throw new a14(charSequence2, i158);
                                                        }
                                                        if (i11 < 0) {
                                                            i11 = i158;
                                                        } else if (i120 >= 0) {
                                                            throw new a14(charSequence2, i158, true);
                                                        }
                                                        i104 = i158 + 1;
                                                        i120 = i158;
                                                    } else if (charAt == 167) {
                                                        if (!z41 || z40 || !ti4Var16.N) {
                                                            break;
                                                        }
                                                        m64Var.y4(true);
                                                        m64Var.W3(true);
                                                        m64Var.w4(i158 + 1);
                                                        i125 = i158;
                                                        i116 = i160;
                                                        i122 = i159;
                                                        i111 = i125;
                                                        s14Var4 = s14Var;
                                                        i123 = i162;
                                                        aVar5 = aVar9;
                                                        w14Var2 = s14Var2;
                                                        z46 = z54;
                                                        z43 = z4;
                                                        i110 = i4;
                                                        ec4Var6 = ec4Var;
                                                        z44 = z5;
                                                        cVar10 = ti4Var2;
                                                        i114 = i5;
                                                        cVar11 = cVar3;
                                                        z45 = z6;
                                                        z47 = z7;
                                                        i109 = i2;
                                                        i112 = i161;
                                                        i115 = i163;
                                                        ti4Var = ti4Var16;
                                                        k64Var = k64Var2;
                                                        charSequence3 = charSequence2;
                                                        w14Var4 = w14Var;
                                                    } else if (!z41) {
                                                        throw new a14(charSequence2, i158);
                                                    } else {
                                                        if (charAt < 0) {
                                                            break;
                                                        }
                                                        int[] iArr2 = e;
                                                        if (charAt >= iArr2.length) {
                                                            break;
                                                        } else if (iArr2[charAt] == 0) {
                                                            throw new a14(charSequence2, i158);
                                                        }
                                                    }
                                                    i116 = i160;
                                                    i122 = i159;
                                                    i125 = i8;
                                                    i111 = i104;
                                                    s14Var4 = s14Var;
                                                    i123 = i162;
                                                    aVar5 = aVar9;
                                                    w14Var2 = s14Var2;
                                                    z46 = z54;
                                                    z43 = z4;
                                                    i110 = i4;
                                                    ec4Var6 = ec4Var;
                                                    z44 = z5;
                                                    cVar10 = ti4Var2;
                                                    i114 = i5;
                                                    cVar11 = cVar3;
                                                    z45 = z6;
                                                    z47 = z7;
                                                    i109 = i2;
                                                    i112 = i161;
                                                    i115 = i163;
                                                    ti4Var = ti4Var16;
                                                    k64Var = k64Var2;
                                                    charSequence3 = charSequence2;
                                                    w14Var4 = w14Var;
                                                }
                                            }
                                        } else {
                                            int i168 = i158 + 1;
                                            p64Var2 = p64Var;
                                            i123 = i162;
                                            i116 = i160;
                                            charSequence3 = charSequence2;
                                            aVar5 = aVar9;
                                            i117 = i11;
                                            z46 = z54;
                                            z43 = z4;
                                            ec4Var6 = ec4Var;
                                            z44 = z5;
                                            cVar10 = ti4Var2;
                                            i114 = i5;
                                            cVar11 = cVar3;
                                            z45 = z6;
                                            z47 = z7;
                                            z50 = true;
                                            z51 = true;
                                            s14Var4 = s14Var;
                                            w14Var4 = w14Var;
                                            i109 = i2;
                                            j31 = iArr[charAt] | (j35 << 4);
                                            i115 = i163;
                                            ti4Var = ti4Var22;
                                            i125 = i8;
                                            i110 = i4;
                                            i122 = i159;
                                            i111 = i168;
                                            w14Var2 = s14Var2;
                                            i112 = i161;
                                            k64Var = k64Var2;
                                        }
                                        p64Var2 = p64Var;
                                        i117 = i11;
                                        j31 = j35;
                                    }
                                }
                                int V02 = k64Var4.V0();
                                if (z40) {
                                    if (V02 != 0) {
                                        ti4Var11 = ti4Var10;
                                        if (z21) {
                                            if (aVar9 != p64.a.DASHED) {
                                                break;
                                            }
                                            if (V02 >= (w14Var3.F != w14.a.MAC ? 6 : 8)) {
                                                throw new a14(charSequence2, str26);
                                            }
                                        } else {
                                            if (aVar9 != (z19 ? p64.a.SPACE_DELIMITED : p64.a.COLON_DELIMITED)) {
                                                break;
                                            }
                                            if (V02 >= (w14Var3.F != w14.a.MAC ? 6 : 8)) {
                                            }
                                        }
                                    } else if (z4) {
                                        ti4Var11 = ti4Var10;
                                        k64Var4.G(1);
                                    } else {
                                        ti4Var11 = ti4Var10;
                                        if (i58 >= 0) {
                                            throw new a14(charSequence2, i58);
                                        }
                                        if (z21) {
                                            if (!w14Var3.G) {
                                                break;
                                            }
                                            if (z21) {
                                                p64.a aVar11 = p64.a.DASHED;
                                                p64Var.w3(aVar11);
                                                aVar9 = aVar11;
                                                i64 = 8;
                                                z45 = false;
                                            } else {
                                                p64.a aVar12 = z19 ? p64.a.SPACE_DELIMITED : p64.a.COLON_DELIMITED;
                                                p64Var.w3(aVar12);
                                                aVar9 = aVar12;
                                                i64 = 8;
                                            }
                                            k64Var4.G(i64);
                                            z22 = true;
                                        } else if (z19) {
                                            if (!w14Var3.K) {
                                                break;
                                            }
                                            if (z21) {
                                            }
                                            k64Var4.G(i64);
                                            z22 = true;
                                        } else {
                                            if (!w14Var3.I) {
                                                break;
                                            }
                                            if (z21) {
                                            }
                                            k64Var4.G(i64);
                                            z22 = true;
                                        }
                                        s14Var3 = s14Var;
                                        i61 = i163;
                                        i62 = i162;
                                        z23 = z22;
                                        aVar3 = aVar9;
                                        ti4Var12 = ti4Var11;
                                        z24 = z45;
                                        ti4Var13 = ti4Var9;
                                        z25 = z41;
                                        bVar2 = bVar4;
                                        k64Var5 = k64Var4;
                                        i63 = 2;
                                    }
                                    z22 = z42;
                                    s14Var3 = s14Var;
                                    i61 = i163;
                                    i62 = i162;
                                    z23 = z22;
                                    aVar3 = aVar9;
                                    ti4Var12 = ti4Var11;
                                    z24 = z45;
                                    ti4Var13 = ti4Var9;
                                    z25 = z41;
                                    bVar2 = bVar4;
                                    k64Var5 = k64Var4;
                                    i63 = 2;
                                } else {
                                    ti4 ti4Var23 = ti4Var10;
                                    if (V02 == 0) {
                                        s14Var3 = s14Var;
                                        ti4Var13 = ti4Var9;
                                        if (s14Var3.K) {
                                            j14.b bVar6 = j14.b.IPV6;
                                            i62 = i162;
                                            k64Var5 = k64Var4;
                                            m64Var.x4(bVar6);
                                            i61 = i163;
                                            if (i55 == i2) {
                                                int i169 = i55 + 1;
                                                int i170 = i8;
                                                if (i169 != i170) {
                                                    if (charSequence2.charAt(i169) == ':') {
                                                        k64Var5.G(8);
                                                        k64Var5.S(0);
                                                        k64Var5.R(i55);
                                                        e(i169, i169, k64Var5, 0, i169);
                                                        k64Var5.E();
                                                        i123 = i62;
                                                        bVar4 = bVar6;
                                                        i125 = i170;
                                                        cVar10 = ti4Var13;
                                                        aVar5 = aVar9;
                                                        i117 = i11;
                                                        w14Var2 = s14Var2;
                                                        z46 = z54;
                                                        z43 = z4;
                                                        i116 = i57;
                                                        ec4Var6 = ec4Var;
                                                        z44 = z5;
                                                        j31 = j11;
                                                        i114 = i5;
                                                        cVar11 = cVar3;
                                                        z47 = z7;
                                                        z42 = true;
                                                        z41 = false;
                                                        i110 = i169 + 1;
                                                        i112 = i110;
                                                        i109 = i2;
                                                        ti4Var = cVar10;
                                                        i111 = i112;
                                                        i113 = i59;
                                                        k64Var = k64Var5;
                                                        i115 = i61;
                                                        z48 = z20;
                                                        i122 = i58;
                                                        s14Var4 = s14Var3;
                                                        p64Var2 = p64Var;
                                                        w14 w14Var522 = w14Var3;
                                                        charSequence3 = charSequence2;
                                                        w14Var4 = w14Var522;
                                                    } else {
                                                        throw new a14(charSequence2, "ipaddress.error.ipv6.cannot.start.with.single.separator");
                                                    }
                                                } else {
                                                    throw new a14(charSequence2, "ipaddress.error.too.few.segments");
                                                }
                                            } else {
                                                if (z4) {
                                                    bVar3 = bVar6;
                                                    k64Var5.G(1);
                                                } else {
                                                    bVar3 = bVar6;
                                                    if (i58 < 0) {
                                                        k64Var5.G(8);
                                                    } else {
                                                        throw new a14(charSequence2, i58);
                                                    }
                                                }
                                                ti4Var23 = ti4Var13;
                                                bVar4 = bVar3;
                                                z42 = true;
                                                z41 = false;
                                            }
                                        } else {
                                            throw new a14(charSequence2, "ipaddress.error.ipv6");
                                        }
                                    } else {
                                        s14Var3 = s14Var;
                                        i61 = i163;
                                        i62 = i162;
                                        ti4Var13 = ti4Var9;
                                        k64Var5 = k64Var4;
                                        if (m64Var.w2().f()) {
                                            throw new a14(charSequence2, "ipaddress.error.ipv6.separator");
                                        }
                                        if (V02 >= 8) {
                                            throw new a14(charSequence2, str26);
                                        }
                                    }
                                    aVar3 = aVar9;
                                    z23 = z42;
                                    ti4Var12 = ti4Var23;
                                    z24 = z45;
                                    z25 = z41;
                                    bVar2 = bVar4;
                                    i63 = 4;
                                }
                                if (i55 == i60) {
                                    if (!z40) {
                                        if (k64Var5.h() < 0) {
                                            k64Var5.S(V02);
                                            k64Var5.R(i55 - 1);
                                            e(i55, i55, k64Var5, V02, i55);
                                            k64Var5.E();
                                            i65 = i55;
                                            i66 = i59;
                                            i67 = i58;
                                            ti4Var3 = ti4Var13;
                                            i68 = i121;
                                            j12 = j34;
                                            ec4Var4 = ec4Var;
                                            cVar5 = cVar3;
                                        } else {
                                            throw new a14(charSequence2, "ipaddress.error.ipv6.ambiguous");
                                        }
                                    } else {
                                        throw new a14(charSequence2, str10, i55);
                                    }
                                } else if (i57 > 0 && !z5) {
                                    if (!ti4Var12.x.n()) {
                                        throw new a14(charSequence2, "ipaddress.error.no.wildcard");
                                    }
                                    int i171 = i57;
                                    if (i171 != i55 - i60 || i58 >= 0) {
                                        break;
                                    }
                                    k64Var5.U();
                                    int i172 = i55 - i171;
                                    g(i172, i55, i172, i172, i55, i172, k64Var5, V02, 0L, z40 ? z7 ? 16777215L : 255L : av5.s, 65536);
                                    k64Var5.E();
                                    i65 = i55;
                                    i66 = i59;
                                    i67 = i58;
                                    ti4Var3 = ti4Var13;
                                    i68 = i121;
                                    j12 = j34;
                                    ec4Var4 = ec4Var;
                                    cVar5 = cVar3;
                                    i57 = 0;
                                } else {
                                    int i173 = i57;
                                    int i174 = i56;
                                    int i175 = i55 - i174;
                                    i67 = i58;
                                    if (z49) {
                                        if (i175 != 1) {
                                            if (z50) {
                                                i121++;
                                            }
                                            i100 = i174 + i121;
                                            i175 -= i121;
                                        } else if (i121 != 0 || i59 >= 0) {
                                            i100 = i174;
                                        } else {
                                            e(i174, i55, k64Var5, V02, i174);
                                            k64Var5.E();
                                            i110 = i55 + 1;
                                            cVar10 = ti4Var12;
                                            i113 = i59;
                                            k64Var = k64Var5;
                                            ti4Var = ti4Var13;
                                            s14Var4 = s14Var3;
                                            i116 = i173;
                                            i115 = i61;
                                            i117 = i11;
                                            w14Var2 = s14Var2;
                                            z48 = z20;
                                            z46 = z54;
                                            i125 = i8;
                                            z43 = z4;
                                            ec4Var6 = ec4Var;
                                            z44 = z5;
                                            z42 = z23;
                                            j31 = j11;
                                            z45 = z24;
                                            z41 = z25;
                                            bVar4 = bVar2;
                                            i114 = i5;
                                            cVar11 = cVar3;
                                            z47 = z7;
                                            i122 = i67;
                                            z49 = false;
                                            i109 = i2;
                                            p64Var2 = p64Var;
                                            i111 = i110;
                                            i112 = i111;
                                            p64.a aVar13 = aVar3;
                                            i123 = i62;
                                            aVar5 = aVar13;
                                            w14 w14Var6 = w14Var3;
                                            charSequence3 = charSequence2;
                                            w14Var4 = w14Var6;
                                        }
                                        i70 = i121;
                                        i69 = i100;
                                        z49 = false;
                                    } else {
                                        i69 = i174;
                                        i70 = i121;
                                    }
                                    if (i70 != 0) {
                                        int i176 = i63;
                                        i71 = V02;
                                        ti4 ti4Var24 = ti4Var13;
                                        String str27 = str13;
                                        i57 = i173;
                                        int i177 = i69;
                                        String str28 = str12;
                                        if (i70 == 1) {
                                            if (i175 != 17 && i175 != 129) {
                                                i72 = i62;
                                                str14 = str10;
                                                i73 = i59;
                                                ti4Var14 = ti4Var24;
                                                k64Var3 = k64Var5;
                                                i74 = i70;
                                                i63 = i176;
                                                i115 = i61;
                                                ec4Var4 = ec4Var;
                                                j13 = j11;
                                                i75 = i5;
                                                cVar8 = cVar3;
                                                str15 = str27;
                                                i76 = i174;
                                                i65 = i55;
                                                str16 = str28;
                                                if (i175 <= i63 && z24) {
                                                    throw new a14(charSequence2, str16, i76);
                                                }
                                                if (!ti4Var12.z) {
                                                    if (!ti4Var12.A && z24 && i175 + i74 > i63) {
                                                        throw new a14(charSequence2, str16, i76);
                                                    }
                                                    if (i118 > 0) {
                                                        i81 = i73;
                                                        if (i81 >= 0) {
                                                            throw new a14(charSequence2, i65, true);
                                                        }
                                                        if (z5) {
                                                            i84 = i177;
                                                            Q(j13, charSequence, i177, i65, i118, k64Var3, i71, i76, ti4Var12);
                                                        } else {
                                                            i84 = i177;
                                                            m(j13, charSequence, i84, i65, i118, k64Var3, i71, i76, ti4Var12);
                                                        }
                                                        i82 = i84;
                                                        j15 = 0;
                                                        z29 = true;
                                                        i83 = 0;
                                                        i118 = 0;
                                                    } else {
                                                        i81 = i73;
                                                        if (z5) {
                                                            int i178 = i65 - 16;
                                                            i82 = i177;
                                                            if (i82 < i178) {
                                                                j34 = L(charSequence2, i82, i178);
                                                                j16 = L(charSequence2, i178, i65);
                                                            } else {
                                                                j16 = j13;
                                                            }
                                                            j15 = j16;
                                                            z29 = false;
                                                            i83 = 0;
                                                        } else {
                                                            i82 = i177;
                                                            if (z51) {
                                                                j15 = j13;
                                                                z29 = false;
                                                                i83 = 0;
                                                            } else {
                                                                j15 = j13;
                                                                z29 = false;
                                                                i83 = 262144;
                                                            }
                                                        }
                                                        i78 = i83;
                                                        j14 = j15;
                                                        j11 = 0;
                                                        j12 = j34;
                                                        i79 = i82;
                                                        z28 = z29;
                                                        i77 = i118;
                                                        z26 = z51;
                                                        i80 = 0;
                                                        z27 = false;
                                                    }
                                                    z51 = false;
                                                    i78 = i83;
                                                    j14 = j15;
                                                    j11 = 0;
                                                    j12 = j34;
                                                    i79 = i82;
                                                    z28 = z29;
                                                    i77 = i118;
                                                    z26 = z51;
                                                    i80 = 0;
                                                    z27 = false;
                                                } else {
                                                    throw new a14(charSequence2, str15);
                                                }
                                            } else if (ti4Var24.F && z(charSequence2, i177)) {
                                                if (ti4Var12.z) {
                                                    int i179 = i177 + 1;
                                                    int i180 = i175 - 1;
                                                    if (i118 <= 0) {
                                                        i72 = i62;
                                                        str14 = str10;
                                                        i85 = i59;
                                                        ti4Var14 = ti4Var24;
                                                        k64Var3 = k64Var5;
                                                        i74 = i70;
                                                        i86 = i179;
                                                        i87 = i176;
                                                        i115 = i61;
                                                        ec4Var4 = ec4Var;
                                                        i75 = i5;
                                                        cVar8 = cVar3;
                                                        i76 = i174;
                                                        i65 = i55;
                                                        str16 = str28;
                                                        if (z5) {
                                                            int i181 = i65 - 64;
                                                            j34 = M(charSequence2, i86, i181);
                                                            Y3 = M(charSequence2, i181, i65);
                                                        } else {
                                                            Y3 = Y(j11, charSequence2, i180);
                                                        }
                                                        m64Var5 = m64Var;
                                                        i88 = 2;
                                                        z28 = false;
                                                        z30 = true;
                                                    } else if (i59 >= 0) {
                                                        throw new a14(charSequence2, i55, true);
                                                    } else {
                                                        if (z5) {
                                                            ec4Var4 = ec4Var;
                                                            ti4 ti4Var25 = ti4Var12;
                                                            i72 = i62;
                                                            i85 = i59;
                                                            cVar8 = cVar3;
                                                            ti4Var14 = ti4Var24;
                                                            i74 = i70;
                                                            i87 = i176;
                                                            str14 = str10;
                                                            k64Var3 = k64Var5;
                                                            i75 = i5;
                                                            R(charSequence, i179, i55, i118, k64Var5, i71, i174, ti4Var25);
                                                            i115 = i61;
                                                            i65 = i55;
                                                            ti4Var12 = ti4Var25;
                                                            i76 = i174;
                                                            str16 = str28;
                                                            i86 = i179;
                                                        } else {
                                                            i72 = i62;
                                                            i65 = i55;
                                                            str14 = str10;
                                                            i85 = i59;
                                                            ti4Var14 = ti4Var24;
                                                            k64Var3 = k64Var5;
                                                            i74 = i70;
                                                            i87 = i176;
                                                            i115 = i61;
                                                            ec4Var4 = ec4Var;
                                                            i75 = i5;
                                                            cVar8 = cVar3;
                                                            i76 = i174;
                                                            str16 = str28;
                                                            i86 = i179;
                                                            V(j11, charSequence, i179, i65, i118, k64Var3, i71, i76, ti4Var12);
                                                        }
                                                        m64Var5 = m64Var;
                                                        Y3 = 0;
                                                        i88 = 0;
                                                        z28 = true;
                                                        z30 = true;
                                                        i118 = 0;
                                                    }
                                                    m64Var5.e4(z30);
                                                    i79 = i86;
                                                    j14 = Y3;
                                                    i78 = i88;
                                                    j11 = 0;
                                                    j12 = j34;
                                                    str15 = str27;
                                                    i81 = i85;
                                                    i63 = i87;
                                                    i80 = 0;
                                                    i77 = i118;
                                                    z26 = z51;
                                                    z27 = false;
                                                } else {
                                                    throw new a14(charSequence2, str27);
                                                }
                                            }
                                        }
                                        i72 = i62;
                                        str14 = str10;
                                        i73 = i59;
                                        ti4Var14 = ti4Var24;
                                        k64Var3 = k64Var5;
                                        i74 = i70;
                                        i115 = i61;
                                        ec4Var4 = ec4Var;
                                        j13 = j11;
                                        i75 = i5;
                                        cVar8 = cVar3;
                                        str15 = str27;
                                        i76 = i174;
                                        i65 = i55;
                                        str16 = str28;
                                        i63 = i176;
                                        if (i175 <= i63) {
                                        }
                                        if (!ti4Var12.z) {
                                        }
                                    } else if (i175 == 0) {
                                        if (!ti4Var12.x.f()) {
                                            throw new a14(charSequence2, str10, i55);
                                        }
                                        if (z40) {
                                            if (z4) {
                                                j29 = p64Var.n3() ? -1L : 281474976710655L;
                                            } else {
                                                j29 = 255;
                                            }
                                            long j38 = j29;
                                            j27 = j34;
                                            j28 = j38;
                                        } else if (z5) {
                                            j28 = -1;
                                            j27 = -1;
                                        } else {
                                            j27 = j34;
                                            j28 = av5.s;
                                        }
                                        i72 = i62;
                                        str14 = str10;
                                        i81 = i59;
                                        i74 = i70;
                                        i71 = V02;
                                        ti4Var14 = ti4Var13;
                                        str15 = str13;
                                        i57 = i173;
                                        j12 = j27;
                                        i79 = i69;
                                        j14 = j28;
                                        ec4Var4 = ec4Var;
                                        i75 = i5;
                                        cVar8 = cVar3;
                                        z28 = false;
                                        i80 = 4194304;
                                        i78 = 0;
                                        i76 = i174;
                                        i65 = i55;
                                        i77 = i118;
                                        z26 = z51;
                                        str16 = str12;
                                        z27 = z50;
                                        k64Var3 = k64Var5;
                                        i115 = i61;
                                    } else if (i175 > i63 && z24) {
                                        throw new a14(charSequence2, str12, i174);
                                    } else {
                                        String str29 = str12;
                                        if (i118 <= 0) {
                                            i97 = i63;
                                            i71 = V02;
                                            ti4Var15 = ti4Var13;
                                            str17 = str13;
                                            i57 = i173;
                                            if (z5) {
                                                int i182 = i55 - 16;
                                                i98 = i69;
                                                if (i98 < i182) {
                                                    j34 = L(charSequence2, i98, i182);
                                                    j26 = L(charSequence2, i182, i55);
                                                } else {
                                                    j26 = j11;
                                                }
                                                j11 = j26;
                                                z28 = false;
                                                i99 = 0;
                                            } else {
                                                i98 = i69;
                                                if (z51) {
                                                    z28 = false;
                                                    i99 = 0;
                                                } else {
                                                    z28 = false;
                                                    i99 = 262144;
                                                }
                                            }
                                            i72 = i62;
                                            str14 = str10;
                                            ti4Var14 = ti4Var15;
                                            k64Var3 = k64Var5;
                                            i74 = i70;
                                            i78 = i99;
                                            i79 = i98;
                                            i63 = i97;
                                            i115 = i61;
                                            j12 = j34;
                                            ec4Var4 = ec4Var;
                                            j14 = j11;
                                            i75 = i5;
                                            cVar8 = cVar3;
                                            str15 = str17;
                                            i80 = 0;
                                            i77 = i118;
                                            j11 = 0;
                                            z26 = z51;
                                            z27 = false;
                                            int i183 = i59;
                                            i76 = i174;
                                            i65 = i55;
                                            str16 = str29;
                                            i81 = i183;
                                        } else if (i59 >= 0) {
                                            throw new a14(charSequence2, i55, true);
                                        } else {
                                            if (z5) {
                                                i97 = i63;
                                                i71 = V02;
                                                ti4Var15 = ti4Var13;
                                                str17 = str13;
                                                i57 = i173;
                                                Q(j11, charSequence, i69, i55, i118, k64Var5, i71, i174, ti4Var12);
                                            } else {
                                                i97 = i63;
                                                i71 = V02;
                                                ti4Var15 = ti4Var13;
                                                str17 = str13;
                                                i57 = i173;
                                                m(j11, charSequence, i69, i55, i118, k64Var5, i71, i174, ti4Var12);
                                            }
                                            i98 = i69;
                                            j11 = 0;
                                            z28 = true;
                                            i99 = 0;
                                            i118 = 0;
                                        }
                                        z51 = false;
                                        i72 = i62;
                                        str14 = str10;
                                        ti4Var14 = ti4Var15;
                                        k64Var3 = k64Var5;
                                        i74 = i70;
                                        i78 = i99;
                                        i79 = i98;
                                        i63 = i97;
                                        i115 = i61;
                                        j12 = j34;
                                        ec4Var4 = ec4Var;
                                        j14 = j11;
                                        i75 = i5;
                                        cVar8 = cVar3;
                                        str15 = str17;
                                        i80 = 0;
                                        i77 = i118;
                                        j11 = 0;
                                        z26 = z51;
                                        z27 = false;
                                        int i1832 = i59;
                                        i76 = i174;
                                        i65 = i55;
                                        str16 = str29;
                                        i81 = i1832;
                                    }
                                    if (i81 >= 0) {
                                        int i184 = i81 - i115;
                                        int i185 = i75;
                                        int i186 = i184 - i185;
                                        int i187 = i76;
                                        int i188 = i115 + i185;
                                        int i189 = i79;
                                        if (!ti4Var12.x.g()) {
                                            throw new a14(charSequence2, "ipaddress.error.no.range");
                                        }
                                        int i190 = i72;
                                        if (i190 >= 0 && !z4) {
                                            throw new a14(charSequence2, i190);
                                        }
                                        if (i124 > 0 || i119 > 0) {
                                            break;
                                        }
                                        String str30 = str16;
                                        w14.c cVar15 = cVar8;
                                        if (z40 && !cVar15.D) {
                                            if (i188 < 2) {
                                                throw new a14(charSequence2, "ipaddress.error.segment.too.short.at.index", i186);
                                            }
                                        }
                                        boolean z67 = i184 == i81;
                                        if (!z67) {
                                            if (i185 == 1 && i115 == 17) {
                                                i89 = i80;
                                                ti4 ti4Var26 = ti4Var14;
                                                if (ti4Var26.F && z(charSequence2, i184)) {
                                                    int i191 = i184 + 1;
                                                    i115--;
                                                    long Y4 = Y(j33, charSequence2, i115);
                                                    ti4Var3 = ti4Var26;
                                                    m64Var.e4(true);
                                                    long j39 = j14;
                                                    compare4 = Long.compare(Y4 ^ Long.MIN_VALUE, j39 ^ Long.MIN_VALUE);
                                                    i91 = i191;
                                                    i90 = i81;
                                                    cVar9 = cVar15;
                                                    j21 = 0;
                                                    z31 = true;
                                                    i92 = 2;
                                                    z32 = compare4 > 0;
                                                    j18 = j39;
                                                    j19 = j33;
                                                    i89 = 2;
                                                    j20 = Y4;
                                                } else {
                                                    ti4Var3 = ti4Var26;
                                                    cVar9 = cVar15;
                                                    j18 = j14;
                                                    m64Var6 = m64Var;
                                                }
                                            } else {
                                                m64Var6 = m64Var;
                                                i89 = i80;
                                                cVar9 = cVar15;
                                                ti4Var3 = ti4Var14;
                                                j18 = j14;
                                            }
                                            if (z5) {
                                                if (i115 == 129) {
                                                    i184++;
                                                    i115--;
                                                    m64Var6.e4(true);
                                                    int i192 = i81 - 64;
                                                    long M = M(charSequence2, i184, i192);
                                                    i90 = i81;
                                                    i92 = 2;
                                                    j23 = M(charSequence2, i192, i81);
                                                    j22 = M;
                                                    i89 = 2;
                                                } else {
                                                    int i193 = i81 - 16;
                                                    if (i184 < i193) {
                                                        long L2 = L(charSequence2, i184, i193);
                                                        i90 = i81;
                                                        i92 = 0;
                                                        j23 = L(charSequence2, i193, i81);
                                                        j22 = L2;
                                                    } else {
                                                        i90 = i81;
                                                        j22 = 0;
                                                        j23 = j33;
                                                        i92 = 0;
                                                    }
                                                }
                                                compare2 = Long.compare(j22 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
                                                if (compare2 <= 0) {
                                                    if (compare2 == 0) {
                                                        compare3 = Long.compare(j23 ^ Long.MIN_VALUE, j18 ^ Long.MIN_VALUE);
                                                    }
                                                    z33 = false;
                                                    z31 = false;
                                                    boolean z68 = z33;
                                                    i91 = i184;
                                                    z32 = z68;
                                                    long j40 = j22;
                                                    j19 = j33;
                                                    j20 = j23;
                                                    j21 = j40;
                                                }
                                                z33 = true;
                                                z31 = false;
                                                boolean z682 = z33;
                                                i91 = i184;
                                                z32 = z682;
                                                long j402 = j22;
                                                j19 = j33;
                                                j20 = j23;
                                                j21 = j402;
                                            } else {
                                                i90 = i81;
                                                if (!ti4Var12.z && i185 > 0) {
                                                    throw new a14(charSequence2, str15);
                                                }
                                                if (z24) {
                                                    if (i115 <= i63) {
                                                        if (!ti4Var12.A && i188 > i63) {
                                                            throw new a14(charSequence2, str30, i186);
                                                        }
                                                    } else {
                                                        throw new a14(charSequence2, str30, i186);
                                                    }
                                                }
                                                j19 = j33;
                                                compare = Long.compare(j19 ^ Long.MIN_VALUE, j18 ^ Long.MIN_VALUE);
                                                j20 = j19;
                                                i91 = i184;
                                                z31 = false;
                                                i92 = 0;
                                                z32 = compare > 0;
                                                j21 = 0;
                                            }
                                        } else if (!ti4Var12.x.f()) {
                                            throw new a14(charSequence2, str14, i65);
                                        } else {
                                            i89 = 2097152 | i80;
                                            i90 = i81;
                                            i91 = i184;
                                            cVar9 = cVar15;
                                            j21 = 0;
                                            j19 = j33;
                                            ti4Var3 = ti4Var14;
                                            j18 = j14;
                                            z32 = false;
                                            z31 = false;
                                            i92 = 0;
                                            j20 = 0;
                                        }
                                        if (!z32) {
                                            i93 = i65;
                                            j24 = j21;
                                            i94 = i187;
                                            i95 = i189;
                                            i189 = i91;
                                            j25 = j20;
                                            i96 = i90;
                                            j20 = j18;
                                        } else if (!ti4Var12.x.h()) {
                                            throw new a14(charSequence2, "ipaddress.error.invalidRange");
                                        } else {
                                            i94 = i186;
                                            j25 = j18;
                                            j24 = j12;
                                            i186 = i187;
                                            i95 = i91;
                                            i93 = i90;
                                            i96 = i65;
                                            j12 = j21;
                                        }
                                        if (z5) {
                                            j(i189, i96, i186, i95, i93, i94, k64Var3, i71, j25, j24, j20, j12, i89 | 1048576, i92);
                                        } else {
                                            if (!z52 && !z67 && !z32 && !z31) {
                                                i89 = (i74 == 0 && (i78 & 262144) != 0 && z53) ? i89 | 786432 : i89 | 262144;
                                            }
                                            h(i189, i96, i186, i95, i93, i94, k64Var3, i71, j25, j20, i89 | 1048576, i92);
                                        }
                                        j33 = j19;
                                        i5 = i185;
                                        cVar5 = cVar9;
                                        i19 = i190;
                                        i66 = -1;
                                    } else {
                                        int i194 = i76;
                                        i66 = i81;
                                        int i195 = i79;
                                        long j41 = j33;
                                        w14.c cVar16 = cVar8;
                                        ti4Var3 = ti4Var14;
                                        int i196 = i75;
                                        long j42 = j14;
                                        if (!z28) {
                                            if (z5) {
                                                l(i195, i65, i194, k64Var3, i71, j42, j12, i78);
                                            } else {
                                                j33 = j41;
                                                cVar5 = cVar16;
                                                i19 = i72;
                                                i5 = i196;
                                                j17 = j12;
                                                k(i195, i65, i194, k64Var3, i71, j42, i78);
                                                j12 = j17;
                                            }
                                        }
                                        j33 = j41;
                                        i5 = i196;
                                        j17 = j12;
                                        cVar5 = cVar16;
                                        i19 = i72;
                                        j12 = j17;
                                    }
                                    k64Var3.E();
                                    i118 = i77;
                                    i68 = 0;
                                    i111 = i65 + 1;
                                    cVar10 = ti4Var12;
                                    i113 = i66;
                                    i20 = i68;
                                    i110 = i111;
                                    i10 = i110;
                                    z48 = z20;
                                    z10 = z27;
                                    z51 = z26;
                                    i116 = i57;
                                    z42 = z23;
                                    j3 = j11;
                                    z45 = z24;
                                    z41 = z25;
                                    bVar4 = bVar2;
                                    i122 = i67;
                                    j34 = j12;
                                }
                                i19 = i62;
                                z26 = z51;
                                z27 = z50;
                                k64Var3 = k64Var5;
                                i115 = i61;
                                i111 = i65 + 1;
                                cVar10 = ti4Var12;
                                i113 = i66;
                                i20 = i68;
                                i110 = i111;
                                i10 = i110;
                                z48 = z20;
                                z10 = z27;
                                z51 = z26;
                                i116 = i57;
                                z42 = z23;
                                j3 = j11;
                                z45 = z24;
                                z41 = z25;
                                bVar4 = bVar2;
                                i122 = i67;
                                j34 = j12;
                            }
                            s14Var4 = s14Var;
                        } else {
                            i111++;
                            i11 = i117;
                            charSequence2 = charSequence3;
                            i19 = i123;
                            i115 = i6;
                            i116 = i7;
                            i110 = i4;
                            cVar10 = ti4Var2;
                            k64Var3 = k64Var2;
                            cVar5 = cVar3;
                            z45 = z6;
                            z10 = true;
                            aVar3 = aVar5;
                            i20 = i121;
                            ec4Var4 = ec4Var;
                            i113 = i9;
                            j3 = (j35 << 4) | iArr[charAt];
                        }
                    } else {
                        if (z50) {
                            j30 = (j31 << 4) | iArr[charAt];
                        } else {
                            long j43 = j31;
                            if (charAt != '0') {
                                j30 = (j43 << 4) | iArr[charAt];
                                z50 = true;
                            } else if (z49) {
                                i121++;
                                j30 = j43;
                            } else {
                                j30 = j43;
                                z49 = true;
                            }
                        }
                        i111++;
                        charSequence2 = charSequence3;
                        i20 = i121;
                        z10 = z50;
                        i19 = i123;
                        i115 = i6;
                        i116 = i7;
                        i110 = i4;
                        ec4Var4 = ec4Var;
                        cVar10 = ti4Var2;
                        k64Var3 = k64Var2;
                        cVar5 = cVar3;
                        i113 = i9;
                        z45 = z6;
                        aVar3 = aVar5;
                        j3 = j30;
                        i11 = i117;
                    }
                    i109 = i2;
                    p64Var2 = p64Var;
                    cVar11 = cVar5;
                    charSequence3 = charSequence2;
                    i117 = i11;
                    ec4Var6 = ec4Var4;
                    k64Var = k64Var3;
                    aVar5 = aVar3;
                    z46 = z54;
                    i125 = i8;
                    z43 = z4;
                    z44 = z5;
                    i114 = i5;
                    ti4Var = ti4Var3;
                    j31 = j3;
                    z47 = z7;
                    w14Var4 = w14Var;
                    i121 = i20;
                    i123 = i19;
                    z50 = z10;
                    w14Var2 = s14Var2;
                    i112 = i10;
                    s14Var4 = s14Var;
                } else {
                    int i197 = i112;
                    int i198 = i111 - i109;
                    if (i198 == 0) {
                        if (!z40 && m64Var.b4()) {
                            if (!s14Var4.G) {
                                throw new a14(charSequence3, "ipaddress.error.prefix.only");
                            }
                        } else if (!w14Var2.w) {
                            throw new a14(charSequence3, "ipaddress.error.empty");
                        }
                        k64Var.T(true);
                        return;
                    } else if (i116 == i198 && i116 <= 19) {
                        if (w14Var2.x) {
                            k64Var.U();
                            k64Var.P();
                            return;
                        }
                        throw new a14(charSequence3, "ipaddress.error.all");
                    } else {
                        int i199 = i111 - i197;
                        int i200 = i114 + i115;
                        if (z40) {
                            int i201 = 6;
                            if (i199 != 6) {
                                if (i199 == 10) {
                                    i201 = 6;
                                } else {
                                    i201 = 6;
                                    if (i200 == i201) {
                                    }
                                    if (i119 > 0) {
                                    }
                                    if (i119 > 0 && i116 <= 0) {
                                        if (!w14Var2.y) {
                                            throw new a14(charSequence3, "ipaddress.error.single.segment");
                                        }
                                        int i202 = i110;
                                        boolean z69 = i199 == 12;
                                        boolean z70 = i199 == 16;
                                        boolean z71 = i199 == 0;
                                        if (!z69 && !z70 && !z71) {
                                            throw new a14("ipaddress.error.too.few.segments.digit.count");
                                        }
                                        if (i127 >= 0) {
                                            i106 = i114;
                                            i107 = i115;
                                            boolean z72 = i200 == 12;
                                            z38 = i200 == 16;
                                            boolean z73 = i200 == 0;
                                            if (z69) {
                                                if (!z72 && !z73) {
                                                    throw new a14("ipaddress.error.front.digit.count");
                                                }
                                            } else if (z70) {
                                                if (!z38 && !z73) {
                                                    throw new a14("ipaddress.error.front.digit.count");
                                                }
                                            } else if (z71 && !z72 && !z38) {
                                                throw new a14("ipaddress.error.front.digit.count");
                                            }
                                        } else {
                                            i106 = i114;
                                            i107 = i115;
                                            if (z71) {
                                                throw new a14("ipaddress.error.too.few.segments.digit.count");
                                            }
                                            z38 = false;
                                        }
                                        k64Var.D1();
                                        p64Var2.t3(z70 || z38);
                                        s14Var2 = w14Var2;
                                        k64Var2 = k64Var;
                                        str2 = "ipaddress.mac.error.format";
                                        i7 = i116;
                                        i8 = i126;
                                        cVar3 = cVar11;
                                        ti4Var2 = cVar10;
                                        ti4Var3 = ti4Var17;
                                        i9 = i127;
                                        str = "ipaddress.error.too.many.segments";
                                        i10 = i197;
                                        i6 = i107;
                                        i4 = i202;
                                        i5 = i106;
                                        charAt = ':';
                                        c = '.';
                                        z43 = true;
                                        z45 = false;
                                    } else {
                                        int i203 = i110;
                                        int i204 = i114;
                                        int i205 = i115;
                                        if (w14Var4.H) {
                                            throw new a14(charSequence3, "ipaddress.mac.error.format");
                                        }
                                        s14Var2 = w14Var2;
                                        k64Var2 = k64Var;
                                        str2 = "ipaddress.mac.error.format";
                                        i7 = i116;
                                        i8 = i126;
                                        cVar3 = cVar11;
                                        ti4Var2 = cVar10;
                                        ti4Var3 = ti4Var17;
                                        i9 = i127;
                                        str = "ipaddress.error.too.many.segments";
                                        i10 = i197;
                                        i6 = i205;
                                        i4 = i203;
                                        i5 = i204;
                                        charAt = '-';
                                        c = '.';
                                    }
                                    ec4Var = ec4Var6;
                                }
                            }
                            if (i200 != i201) {
                            }
                            if (!z48) {
                                w14.a aVar14 = w14Var4.F;
                                if (aVar14 == w14.a.EUI64 && i199 == 6) {
                                    throw new a14(charSequence3, "ipaddress.error.too.few.segments");
                                }
                                if (aVar14 == w14.a.MAC && i199 == 10) {
                                    throw new a14(charSequence3, "ipaddress.error.too.many.segments");
                                }
                                if (w14Var4.H) {
                                    p64Var2.p3(true);
                                    p64Var2.t3(i199 == 10);
                                    s14Var2 = w14Var2;
                                    i4 = i110;
                                    k64Var2 = k64Var;
                                    i5 = i114;
                                    i10 = i197;
                                    i6 = i115;
                                    str = "ipaddress.error.too.many.segments";
                                    i8 = i126;
                                    cVar3 = cVar11;
                                    ec4Var = ec4Var6;
                                    ti4Var2 = cVar10;
                                    ti4Var3 = ti4Var17;
                                    i9 = i127;
                                    str2 = "ipaddress.mac.error.format";
                                    charAt = '-';
                                    z45 = false;
                                    z47 = true;
                                    i7 = i116;
                                    c = '.';
                                } else {
                                    throw new a14(charSequence3, "ipaddress.mac.error.format");
                                }
                            }
                            if (i119 > 0) {
                            }
                            int i2032 = i110;
                            int i2042 = i114;
                            int i2052 = i115;
                            if (w14Var4.H) {
                            }
                        } else {
                            int i206 = i110;
                            int i207 = i114;
                            int i208 = i115;
                            if (w14Var2.y) {
                                boolean z74 = i127 >= 0;
                                if (!D(i199, z74, i200, ti4Var17)) {
                                    if (z41) {
                                        ti4Var2 = cVar10;
                                        s14Var2 = w14Var2;
                                        i7 = i116;
                                        i8 = i126;
                                        str = "ipaddress.error.too.many.segments";
                                        c = '.';
                                        i105 = i199;
                                        i4 = i206;
                                        ec4Var = ec4Var6;
                                        k64Var2 = k64Var;
                                        cVar3 = cVar11;
                                        i5 = i207;
                                        z37 = z74;
                                        str2 = "ipaddress.mac.error.format";
                                        ti4Var3 = ti4Var17;
                                        i10 = i197;
                                        i9 = i127;
                                        i6 = i208;
                                        if (G(s14Var, charSequence, i2, i8, m64Var, i120, i198, i111)) {
                                            return;
                                        }
                                    } else {
                                        s14Var2 = w14Var2;
                                        ti4Var3 = ti4Var17;
                                        k64Var2 = k64Var;
                                        str2 = "ipaddress.mac.error.format";
                                        i7 = i116;
                                        i8 = i126;
                                        cVar3 = cVar11;
                                        ti4Var2 = cVar10;
                                        i9 = i127;
                                        str = "ipaddress.error.too.many.segments";
                                        i10 = i197;
                                        i6 = i208;
                                        i4 = i206;
                                        i5 = i207;
                                        c = '.';
                                        i105 = i199;
                                        z37 = z74;
                                        ec4Var = ec4Var6;
                                    }
                                    if (!C(i105 - (z49 ? i121 + 1 : i121), i105, z37, i6, i200, ec4Var)) {
                                        throw new a14("ipaddress.error.too.few.segments.digit.count");
                                    }
                                    if (i117 >= 0) {
                                        throw new a14(charSequence3, i117);
                                    }
                                    charAt = '.';
                                } else if (i117 >= 0) {
                                    throw new a14(charSequence3, i117);
                                } else {
                                    s14Var2 = w14Var2;
                                    ti4Var3 = ti4Var17;
                                    k64Var2 = k64Var;
                                    str2 = "ipaddress.mac.error.format";
                                    i7 = i116;
                                    i8 = i126;
                                    cVar3 = cVar11;
                                    ti4Var2 = cVar10;
                                    i9 = i127;
                                    str = "ipaddress.error.too.many.segments";
                                    i10 = i197;
                                    i6 = i208;
                                    i4 = i206;
                                    i5 = i207;
                                    charAt = ':';
                                    c = '.';
                                    z44 = true;
                                    ec4Var = ec4Var6;
                                }
                                k64Var2.D1();
                                z43 = true;
                                z45 = false;
                            } else {
                                throw new a14(charSequence3, "ipaddress.error.single.segment");
                            }
                        }
                    }
                }
            } else {
                str = "ipaddress.error.too.many.segments";
                i4 = i110;
                k64Var2 = k64Var;
                i5 = i114;
                str2 = "ipaddress.mac.error.format";
                i6 = i115;
                i7 = i116;
                i8 = i126;
                cVar3 = cVar11;
                ec4Var = ec4Var6;
                ti4Var2 = cVar10;
                ti4Var3 = ti4Var17;
                i9 = i127;
                i10 = i112;
                c = '.';
                s14Var2 = w14Var2;
                charAt = charSequence3.charAt(i111);
            }
            z4 = z43;
            z5 = z44;
            z6 = z45;
            z7 = z47;
            if (charAt <= '9') {
            }
            long j352 = j31;
            if (charAt >= 'a') {
            }
            if (charAt != c) {
            }
            s14Var4 = s14Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01bb, code lost:
        throw new com.p7700g.p99005.g14(r45, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x027c, code lost:
        r4 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02e0, code lost:
        throw new com.p7700g.p99005.g14(r45, "ipaddress.host.error.bracketed.missing.end");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:314:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0532 A[Catch: a14 -> 0x056d, TRY_ENTER, TryCatch #7 {a14 -> 0x056d, blocks: (B:385:0x0532, B:386:0x053a, B:387:0x053b), top: B:500:0x04b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x053a A[Catch: a14 -> 0x056d, TryCatch #7 {a14 -> 0x056d, blocks: (B:385:0x0532, B:386:0x053a, B:387:0x053b), top: B:500:0x04b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x053b A[Catch: a14 -> 0x056d, TRY_LEAVE, TryCatch #7 {a14 -> 0x056d, blocks: (B:385:0x0532, B:386:0x053a, B:387:0x053b), top: B:500:0x04b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0594 A[Catch: a14 -> 0x0663, TryCatch #2 {a14 -> 0x0663, blocks: (B:405:0x0581, B:407:0x0594, B:409:0x0598, B:411:0x059c, B:412:0x05a0, B:413:0x05ab, B:414:0x05b2, B:417:0x05b7, B:419:0x05bd, B:445:0x060c, B:450:0x0615, B:451:0x061b, B:453:0x0620, B:455:0x062c, B:458:0x0634, B:463:0x063c, B:464:0x0643, B:465:0x0644, B:466:0x064b, B:467:0x064c, B:471:0x0653, B:474:0x065f, B:454:0x0627, B:421:0x05c7, B:423:0x05cc, B:425:0x05d5, B:479:0x0665), top: B:491:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0665 A[Catch: a14 -> 0x0663, TRY_LEAVE, TryCatch #2 {a14 -> 0x0663, blocks: (B:405:0x0581, B:407:0x0594, B:409:0x0598, B:411:0x059c, B:412:0x05a0, B:413:0x05ab, B:414:0x05b2, B:417:0x05b7, B:419:0x05bd, B:445:0x060c, B:450:0x0615, B:451:0x061b, B:453:0x0620, B:455:0x062c, B:458:0x0634, B:463:0x063c, B:464:0x0643, B:465:0x0644, B:466:0x064b, B:467:0x064c, B:471:0x0653, B:474:0x065f, B:454:0x0627, B:421:0x05c7, B:423:0x05cc, B:425:0x05d5, B:479:0x0665), top: B:491:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0501 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x04b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static u64 c0(f14 f14Var, String str, h14 h14Var) throws g14 {
        int i2;
        int[] iArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int[] iArr2;
        s14 s14Var;
        boolean z6;
        boolean z7;
        boolean z8;
        int i5;
        w64 w64Var;
        s14 s14Var2;
        w64 w64Var2;
        int length;
        w64 w64Var3;
        v64 v64Var;
        boolean z9;
        v64 v64Var2;
        int length2;
        v64 v64Var3;
        v64 v64Var4;
        v64 v64Var5;
        w64 w64Var4;
        v64 v64Var6;
        s14 s14Var3;
        int i6;
        char c;
        int i7;
        v64 I2;
        int i8;
        v64 v64Var7;
        int i9;
        int[] iArr3;
        boolean[] zArr;
        int i10;
        v64 v64Var8;
        v64 v64Var9;
        int i11;
        a14 a14Var;
        boolean z10;
        int i12;
        char charAt;
        char c2;
        boolean z11;
        int i13;
        int length3 = str.length();
        if (length3 <= 253) {
            int i14 = 1;
            int i15 = length3;
            int i16 = -1;
            boolean z12 = true;
            int i17 = -1;
            boolean z13 = true;
            boolean z14 = true;
            int[] iArr4 = null;
            int i18 = -1;
            int i19 = 0;
            boolean[] zArr2 = null;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int i20 = -1;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            while (true) {
                i16 += i14;
                i2 = "ipaddress.host.error.invalid";
                if (i16 > i15) {
                    iArr = iArr4;
                    z2 = false;
                    break;
                }
                if (i16 != i15) {
                    charAt = str.charAt(i16);
                    c2 = 'a';
                } else if (i16 == 0) {
                    iArr = iArr4;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    z5 = true;
                    break;
                } else {
                    boolean z25 = (z12 && i19 + 1 == 4) || ((i13 = i19 + 1) < 4 && i18 >= 0) || ((i13 < 4 && h14Var.L.o().O) || (i19 == 0 && h14Var.L.y));
                    if (z13) {
                        if (z12 && z25) {
                            iArr = iArr4;
                            z2 = false;
                            z3 = true;
                            z4 = false;
                        } else if (!z15 || !z14) {
                            throw new g14(str, "ipaddress.host.error.invalid");
                        } else {
                            iArr = iArr4;
                            z2 = false;
                            z12 = false;
                            z3 = false;
                            z4 = true;
                        }
                        z5 = false;
                    } else {
                        z12 &= z25;
                        c2 = 'a';
                        charAt = '.';
                    }
                }
                if (charAt < c2 || charAt > 'z') {
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'Z') {
                            if (charAt > 'F') {
                                z12 &= charAt == 'X' && h14Var.L.o().L;
                                z14 = false;
                            } else if (charAt == 'B') {
                                z12 &= h14Var.L.o().F;
                            }
                            z13 = false;
                            z16 = true;
                        } else if (charAt == '.') {
                            int i27 = (i16 - i17) - 1;
                            if (i27 > 63) {
                                throw new g14(str, "ipaddress.error.segment.too.long");
                            }
                            if (i27 == 0) {
                                throw new g14(str, "ipaddress.host.error.segment.too.short");
                            }
                            if (i19 < 6) {
                                if (i19 < 3) {
                                    if (i19 == 0) {
                                        i21 = i16;
                                        z22 = z16;
                                    } else if (i19 == 1) {
                                        i22 = i16;
                                        z23 = z16;
                                    } else {
                                        i23 = i16;
                                        z24 = z16;
                                    }
                                } else if (i19 == 3) {
                                    i24 = i16;
                                    i19++;
                                    z19 = z16;
                                } else if (i19 == 4) {
                                    i25 = i16;
                                    z20 = z16;
                                } else {
                                    i26 = i16;
                                    z21 = z16;
                                }
                                z16 = z19;
                                i19++;
                                z19 = z16;
                            } else if (i19 == 6) {
                                iArr4 = new int[128];
                                iArr4[i19] = i16;
                                if (h14Var.G) {
                                    zArr2 = new boolean[128];
                                    zArr2[i19] = !z16;
                                    z17 |= z16;
                                }
                                i19++;
                            } else {
                                iArr4[i19] = i16;
                                if (zArr2 != null) {
                                    zArr2[i19] = !z16;
                                    z17 |= z16;
                                }
                                i19++;
                                if (i19 > 127) {
                                    throw new g14(str, "ipaddress.host.error.too.many.segments");
                                }
                            }
                            i17 = i16;
                            z14 = (i16 == i15) & z14;
                            z16 = false;
                        } else {
                            if (charAt != '_') {
                                if (charAt == '-') {
                                    if (i16 == i17 + 1 || i16 == i15 - 1 || str.charAt(i16 + 1) == '.') {
                                        break;
                                    }
                                } else if (charAt == '[') {
                                    if (i16 != 0 || i19 != 0 || i15 <= 2) {
                                        throw new g14(str, i16);
                                    }
                                    iArr = iArr4;
                                    z2 = true;
                                } else if (charAt == '/') {
                                    i20 = i16 + 1;
                                    i15 = i16;
                                    i16--;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    if (charAt != '*') {
                                        boolean z26 = charAt == '%';
                                        if (z26) {
                                            z11 = z26;
                                        } else if (charAt == ':') {
                                            if (h14Var.I || h14Var.J) {
                                                i20 = i16 + 1;
                                                i15 = i16;
                                                i16--;
                                                z15 = true;
                                                z17 = true;
                                            } else if (!z14) {
                                                throw new g14(str, i16);
                                            }
                                        } else if (charAt != 187) {
                                            throw new g14(str, i16);
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                    s14 s14Var4 = h14Var.L;
                                    if (!z11 || !s14Var4.p().N) {
                                        if (!z12 || !s14Var4.o().x.n()) {
                                            z12 = false;
                                        } else if (i18 < 0) {
                                            i18 = i16;
                                        }
                                        if (!z14 || !s14Var4.p().x.n()) {
                                            if (!z12) {
                                                throw new g14(str, i16);
                                            }
                                            z14 = false;
                                        } else if (i18 < 0) {
                                            i18 = i16;
                                        }
                                    } else if (!z14 || i19 >= 8) {
                                        throw new g14(str, i16);
                                    }
                                }
                            }
                            z13 = false;
                        }
                    }
                } else if (charAt > 'f') {
                    z12 &= charAt == 'x' && h14Var.L.o().L;
                    z14 = false;
                    z13 = false;
                } else {
                    if (charAt == 'b') {
                        z12 &= h14Var.L.o().F;
                    }
                    z13 = false;
                }
                i14 = 1;
            }
            iArr = iArr4;
            z2 = false;
            z12 = false;
            z3 = false;
            z4 = true;
            z5 = false;
            s14 s14Var5 = h14Var.L;
            boolean z27 = z2 || z3 || z4;
            try {
                try {
                    if (h14Var.H) {
                        if (z27 || z12 || z14) {
                            try {
                                w64 w64Var5 = new w64(f14Var, str, s14Var5);
                                v64 v64Var10 = u64.u;
                                try {
                                    if (z2) {
                                        int i28 = i15 - 1;
                                        try {
                                            boolean z28 = str.charAt(i28) != ']';
                                            if (z28) {
                                                while (true) {
                                                    i28--;
                                                    if (str.charAt(i28) == ']') {
                                                        break;
                                                    } else if (i28 == 1) {
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!str.startsWith(l64.c, 1)) {
                                                char charAt2 = str.charAt(1);
                                                if (charAt2 != 'v') {
                                                    i7 = charAt2 != x ? 1 : 1;
                                                }
                                                throw new g14(str, "ipaddress.host.error.invalid.mechanism");
                                            }
                                            i7 = 6;
                                            i3 = i18;
                                            iArr2 = iArr;
                                            try {
                                                e0(s14Var5, str, i7, i28, w64Var5, false);
                                                if (z28) {
                                                    int i29 = i28 + 1;
                                                    char charAt3 = str.charAt(i29);
                                                    if (charAt3 == '/') {
                                                        z18 = true;
                                                    } else if (charAt3 != ':') {
                                                        throw new g14(str, i29);
                                                    } else {
                                                        z15 = true;
                                                    }
                                                    i20 = i29 + 1;
                                                    int i30 = i19;
                                                    i4 = i15;
                                                    v64Var7 = J(str, s14Var5, h14Var, z18, z15, w64Var5.j3().r3(), i20, str.length(), w64Var5.w2());
                                                    int n3 = w64Var5.n3();
                                                    if (w64Var5.I3() && str.charAt(n3) == '2' && str.charAt(n3 + 1) == '5') {
                                                        n3 += 2;
                                                    }
                                                    I2 = I(str, s14Var5, null, w64Var5.b4(), false, w64Var5, n3, i29 - 1);
                                                    if (!z18) {
                                                        v64Var10 = v64Var7;
                                                        i8 = i30;
                                                    } else if (I2 != u64.u) {
                                                        I2.o(v64Var7);
                                                        i8 = i30;
                                                    } else {
                                                        i9 = i30;
                                                        if (w64Var5.w2() != j14.b.IPV6 && !h14Var.E) {
                                                            throw new g14(str, "ipaddress.host.error.bracketed.not.ipv6");
                                                        }
                                                        v64Var5 = v64Var7;
                                                        w64Var4 = w64Var5;
                                                        v64Var6 = v64Var10;
                                                        s14Var = s14Var5;
                                                        i2 = i9;
                                                    }
                                                } else {
                                                    i4 = i15;
                                                    i2 = i19;
                                                    int n32 = w64Var5.n3();
                                                    try {
                                                        boolean b4 = w64Var5.b4();
                                                        z15 = false;
                                                        try {
                                                            if (w64Var5.I3() && str.charAt(n32) == '2') {
                                                                if (str.charAt(n32 + 1) == '5') {
                                                                    n32 += 2;
                                                                }
                                                            }
                                                            i20 = n32;
                                                            try {
                                                                I2 = I(str, s14Var5, h14Var, b4, false, w64Var5, i20, i28);
                                                                z18 = b4;
                                                                i8 = i2;
                                                            } catch (a14 e2) {
                                                                e = e2;
                                                                z18 = b4;
                                                                s14Var = s14Var5;
                                                                if (z27) {
                                                                }
                                                            }
                                                        } catch (a14 e3) {
                                                            e = e3;
                                                            i20 = n32;
                                                        }
                                                    } catch (a14 e4) {
                                                        e = e4;
                                                        i20 = n32;
                                                    }
                                                }
                                                v64Var7 = I2;
                                                i9 = i8;
                                                if (w64Var5.w2() != j14.b.IPV6) {
                                                    throw new g14(str, "ipaddress.host.error.bracketed.not.ipv6");
                                                }
                                                v64Var5 = v64Var7;
                                                w64Var4 = w64Var5;
                                                v64Var6 = v64Var10;
                                                s14Var = s14Var5;
                                                i2 = i9;
                                            } catch (a14 e5) {
                                                e = e5;
                                                i4 = i15;
                                                i2 = i19;
                                            }
                                        } catch (a14 e6) {
                                            e = e6;
                                            i3 = i18;
                                            i4 = i15;
                                            iArr2 = iArr;
                                            i2 = i19;
                                            s14Var = s14Var5;
                                            if (z27) {
                                                z6 = z15;
                                                v64 J2 = J(str, s14Var, h14Var, z18, z6, z5, i20, str.length(), null);
                                                if (!z5) {
                                                }
                                            } else {
                                                throw e;
                                            }
                                        }
                                    } else {
                                        i3 = i18;
                                        i4 = i15;
                                        iArr2 = iArr;
                                        i2 = i19;
                                        try {
                                            if (!z14 && !z4) {
                                                z7 = false;
                                                if (z7) {
                                                    z8 = z15;
                                                    i5 = i20;
                                                    s14Var5 = s14Var5;
                                                } else if (z18 || !(h14Var.I || h14Var.J)) {
                                                    i5 = -1;
                                                    z8 = false;
                                                    s14Var5 = s14Var5;
                                                } else {
                                                    int i31 = 1;
                                                    int length4 = str.length() - 1;
                                                    char c3 = s14Var5;
                                                    while (length4 >= 0) {
                                                        char charAt4 = str.charAt(length4);
                                                        if (charAt4 == ':') {
                                                            i6 = length4 + i31;
                                                            z8 = true;
                                                            s14Var3 = c3;
                                                            break;
                                                        }
                                                        if (charAt4 < '0' || charAt4 > '9') {
                                                            c = 'A';
                                                            c = 'A';
                                                            c = 'A';
                                                            c3 = 65;
                                                            if (charAt4 < 'A' || charAt4 > 'Z') {
                                                                if ((charAt4 < 'a' || charAt4 > 'z') && charAt4 != '-') {
                                                                    if (charAt4 != '*') {
                                                                        break;
                                                                    }
                                                                }
                                                                length4--;
                                                                i31 = 1;
                                                                c3 = c;
                                                            }
                                                        } else {
                                                            c = 'A';
                                                        }
                                                        length4--;
                                                        i31 = 1;
                                                        c3 = c;
                                                    }
                                                    i6 = -1;
                                                    z8 = false;
                                                    s14Var3 = c3;
                                                    i5 = i6;
                                                    s14Var5 = s14Var3;
                                                }
                                                if (!z8) {
                                                    try {
                                                        v64 O = O(str, null, h14Var, i5, str.length());
                                                        if (z7) {
                                                            boolean z29 = h14Var.K;
                                                            if (z29) {
                                                                length2 = i5 - 1;
                                                                v64Var3 = O;
                                                            } else {
                                                                try {
                                                                    length2 = str.length();
                                                                    v64Var3 = u64.u;
                                                                } catch (a14 unused) {
                                                                    v64Var2 = O;
                                                                    w64Var = w64Var5;
                                                                    s14Var2 = s14Var5;
                                                                    try {
                                                                        w64Var2 = new w64(f14Var, str, s14Var2);
                                                                        if (z29) {
                                                                        }
                                                                        z9 = false;
                                                                        v64Var10 = v64Var4;
                                                                        w64Var3 = w64Var2;
                                                                    } catch (a14 e7) {
                                                                        e = e7;
                                                                        w64Var2 = w64Var;
                                                                        if (!z7) {
                                                                        }
                                                                    }
                                                                    if (z9) {
                                                                    }
                                                                    w64Var4 = w64Var3;
                                                                    v64Var6 = v64Var10;
                                                                    i2 = i2;
                                                                    return new u64(str, t(f14Var, str, s14Var, w64Var4, v64Var5), v64Var6);
                                                                }
                                                            }
                                                            v64Var2 = O;
                                                            int i32 = length2;
                                                            try {
                                                                e0(s14Var5, str, 0, length2, w64Var5, false);
                                                                w64Var = w64Var5;
                                                                s14Var2 = s14Var5;
                                                                try {
                                                                    w64Var2 = w64Var;
                                                                    z9 = true;
                                                                    v64Var = E(str, s14Var2, null, w64Var, i32);
                                                                    length = i32;
                                                                    v64Var4 = v64Var3;
                                                                } catch (a14 unused2) {
                                                                    w64Var2 = new w64(f14Var, str, s14Var2);
                                                                    if (z29) {
                                                                    }
                                                                    z9 = false;
                                                                    v64Var10 = v64Var4;
                                                                    w64Var3 = w64Var2;
                                                                    if (z9) {
                                                                    }
                                                                    w64Var4 = w64Var3;
                                                                    v64Var6 = v64Var10;
                                                                    i2 = i2;
                                                                    return new u64(str, t(f14Var, str, s14Var, w64Var4, v64Var5), v64Var6);
                                                                }
                                                            } catch (a14 unused3) {
                                                                w64Var = w64Var5;
                                                                s14Var2 = s14Var5;
                                                                w64Var2 = new w64(f14Var, str, s14Var2);
                                                                if (z29) {
                                                                    try {
                                                                        v64Var4 = u64.u;
                                                                        length = str.length();
                                                                        v64Var = null;
                                                                    } catch (a14 e8) {
                                                                        e = e8;
                                                                        if (!z7) {
                                                                            v64Var10 = u64.u;
                                                                            length = str.length();
                                                                            w64Var3 = w64Var2;
                                                                            v64Var = null;
                                                                            z9 = false;
                                                                            if (z9) {
                                                                            }
                                                                            w64Var4 = w64Var3;
                                                                            v64Var6 = v64Var10;
                                                                            i2 = i2;
                                                                            return new u64(str, t(f14Var, str, s14Var, w64Var4, v64Var5), v64Var6);
                                                                        }
                                                                        throw e;
                                                                    }
                                                                } else {
                                                                    length = i5 - 1;
                                                                    v64Var4 = v64Var2;
                                                                    v64Var = null;
                                                                }
                                                                z9 = false;
                                                                v64Var10 = v64Var4;
                                                                w64Var3 = w64Var2;
                                                                if (z9) {
                                                                }
                                                                w64Var4 = w64Var3;
                                                                v64Var6 = v64Var10;
                                                                i2 = i2;
                                                                return new u64(str, t(f14Var, str, s14Var, w64Var4, v64Var5), v64Var6);
                                                            }
                                                            v64Var10 = v64Var4;
                                                        } else {
                                                            s14Var2 = s14Var5;
                                                            length = i5 - 1;
                                                            w64Var2 = w64Var5;
                                                            v64Var10 = O;
                                                            v64Var = null;
                                                            z9 = false;
                                                        }
                                                        w64Var3 = w64Var2;
                                                    } catch (a14 e9) {
                                                        e = e9;
                                                        w64Var = w64Var5;
                                                        s14Var2 = s14Var5;
                                                    }
                                                    if (z9) {
                                                        s14Var = s14Var2;
                                                        v64Var5 = v64Var;
                                                    } else {
                                                        s14Var = s14Var2;
                                                        try {
                                                            e0(s14Var2, str, 0, length, w64Var3, false);
                                                            v64Var5 = E(str, s14Var, null, w64Var3, length);
                                                        } catch (a14 e10) {
                                                            e = e10;
                                                            if (z27) {
                                                            }
                                                        }
                                                    }
                                                    w64Var4 = w64Var3;
                                                    v64Var6 = v64Var10;
                                                    i2 = i2;
                                                } else {
                                                    s14Var2 = s14Var5;
                                                    length = str.length();
                                                    w64Var3 = w64Var5;
                                                }
                                                v64Var = null;
                                                z9 = false;
                                                if (z9) {
                                                }
                                                w64Var4 = w64Var3;
                                                v64Var6 = v64Var10;
                                                i2 = i2;
                                            }
                                            if (!z8) {
                                            }
                                            v64Var = null;
                                            z9 = false;
                                            if (z9) {
                                            }
                                            w64Var4 = w64Var3;
                                            v64Var6 = v64Var10;
                                            i2 = i2;
                                        } catch (a14 e11) {
                                            e = e11;
                                            s14Var = s14Var5;
                                            if (z27) {
                                            }
                                        }
                                        z7 = true;
                                        if (z7) {
                                        }
                                    }
                                    return new u64(str, t(f14Var, str, s14Var, w64Var4, v64Var5), v64Var6);
                                } catch (a14 e12) {
                                    e = e12;
                                }
                            } catch (a14 e13) {
                                e = e13;
                                i3 = i18;
                                i4 = i15;
                                iArr2 = iArr;
                                s14Var = s14Var5;
                                i2 = i19;
                            }
                        }
                    } else if (z27) {
                        throw new g14(str, "ipaddress.host.error.ipaddress");
                    }
                    i3 = i18;
                    i4 = i15;
                    z6 = z15;
                    iArr2 = iArr;
                    s14Var = s14Var5;
                    i2 = i19;
                    v64 J22 = J(str, s14Var, h14Var, z18, z6, z5, i20, str.length(), null);
                    if (!z5) {
                        if (h14Var.C) {
                            if (J22 == u64.u) {
                                return C;
                            }
                            return new u64(str, y, null, J22);
                        }
                        throw new g14(str, "ipaddress.host.error.empty");
                    }
                    if (i2 <= 6) {
                        int[] iArr5 = new int[i2];
                        if (h14Var.G) {
                            iArr3 = iArr5;
                            zArr = new boolean[i2];
                            i10 = i2;
                        } else {
                            iArr3 = iArr5;
                            i10 = i2;
                            zArr = zArr2;
                        }
                    } else {
                        iArr3 = iArr2;
                        if (i2 != iArr3.length) {
                            int[] iArr6 = new int[i2];
                            int i33 = i2 - 6;
                            System.arraycopy(iArr3, 6, iArr6, 6, i33);
                            if (zArr2 != null) {
                                zArr = new boolean[i2];
                                System.arraycopy(zArr2, 6, zArr, 6, i33);
                                iArr3 = iArr6;
                                i10 = 6;
                            } else {
                                iArr3 = iArr6;
                            }
                        }
                        zArr = zArr2;
                        i10 = 6;
                    }
                    for (int i34 = 0; i34 < i10; i34++) {
                        if (i34 < 2) {
                            if (i34 == 0) {
                                i12 = i21;
                                z10 = z22;
                            } else {
                                i12 = i22;
                                z10 = z23;
                            }
                        } else if (i34 < 4) {
                            if (i34 == 2) {
                                i12 = i23;
                                z10 = z24;
                            } else {
                                z10 = z19;
                                i12 = i24;
                            }
                        } else if (i34 == 4) {
                            z10 = z20;
                            i12 = i25;
                        } else {
                            z10 = z21;
                            i12 = i26;
                        }
                        iArr3[i34] = i12;
                        if (zArr != null) {
                            zArr[i34] = !z10;
                            z17 |= z10;
                        }
                    }
                    if (z18) {
                        v64Var9 = u64.u;
                        i11 = i4;
                        v64Var8 = J22;
                    } else {
                        v64Var8 = u64.u;
                        v64Var9 = J22;
                        i11 = i4;
                    }
                    u64.a s2 = s(str, i11, v64Var8);
                    if (i3 >= 0) {
                        if (s2 != null) {
                            a14Var = s2.v;
                            if (a14Var != null) {
                            }
                        } else {
                            a14Var = null;
                        }
                        if (a14Var != null) {
                            throw new g14(str, i3, a14Var);
                        }
                        throw new g14(str, i3);
                    }
                    u64 u64Var = new u64(str, iArr3, zArr, s2 == null ? J22 : v64Var9, s2);
                    if (!z17 && s2 == null) {
                        u64Var.B = str;
                    }
                    return u64Var;
                } catch (a14 e14) {
                    e = e14;
                    throw new g14(str, e, "ipaddress.host.error.invalid");
                }
            } catch (a14 e15) {
                e = e15;
            }
        } else {
            throw new g14(str, "ipaddress.host.error.invalid.length");
        }
    }

    public static u64 d0(f14 f14Var) throws g14 {
        return c0(f14Var, f14Var.toString(), f14Var.E());
    }

    private static void e(int i2, int i3, k64 k64Var, int i4, int i5) {
        k64Var.V(i4, 1, i5, 6, i2, 7, i3, 9, i5, 14, i2, 15, i3);
    }

    private static void e0(s14 s14Var, CharSequence charSequence, int i2, int i3, m64 m64Var, boolean z2) throws a14 {
        b0(s14Var, null, charSequence, i2, i3, m64Var, null, z2);
    }

    private static void f(int i2, int i3, k64 k64Var, int i4, int i5, int i6) {
        k64Var.X(i4, 0, i5, 1, i6, 6, i2, 7, i3, 9, i6, 14, i2, 15, i3);
    }

    private static void f0(w14 w14Var, String str, int i2, int i3, p64 p64Var) throws a14 {
        b0(null, w14Var, str, i2, i3, null, p64Var, false);
    }

    private static void g(int i2, int i3, int i4, int i5, int i6, int i7, k64 k64Var, int i8, long j2, long j3, int i9) {
        k64Var.X0(i8, 0, i9, 1, i4, 6, i2, 7, i3, 9, i7, 14, i5, 15, i6, 2, j2, 10, j3);
    }

    private static v64 g0(CharSequence charSequence, CharSequence charSequence2, s14 s14Var, h14 h14Var, int i2, int i3, j14.b bVar) throws a14 {
        v64 v64Var;
        if (i2 == charSequence.length()) {
            return null;
        }
        int[] iArr = f;
        boolean z2 = false;
        int i4 = i2;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        while (true) {
            if (i4 >= i3) {
                i4 = i3;
                v64Var = null;
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt >= '1' && charAt <= '9') {
                i5 = (i5 * 10) + iArr[charAt];
                z3 = true;
            } else if (charAt == '0') {
                if (z3) {
                    i5 *= 10;
                } else {
                    i6++;
                }
            } else if (charAt != ':' || h14Var == null || (!(h14Var.I || h14Var.J) || i4 <= i2)) {
                i4 = i3;
                v64Var = null;
            } else {
                try {
                    v64Var = O(charSequence, charSequence2, h14Var, i4 + 1, i3);
                } catch (a14 unused) {
                    return null;
                }
            }
            i4++;
        }
        z2 = true;
        if (z2) {
            v64 S = S(i5, charSequence, charSequence2, s14Var, h14Var, i2, i4, i4 - i2, i6, bVar);
            if (v64Var != null) {
                v64Var.t(S);
                return v64Var;
            }
            return S;
        }
        return null;
    }

    private static void h(int i2, int i3, int i4, int i5, int i6, int i7, k64 k64Var, int i8, long j2, long j3, int i9, int i10) {
        k64Var.w0(i8, 0, i9, 1, i4, 6, i2, 7, i3, 8, i10, 9, i7, 14, i5, 15, i6, 2, j2, 10, j3);
    }

    public static int h0(CharSequence charSequence, j14.b bVar) throws a14 {
        v64 g0 = g0(charSequence, null, D, null, 0, charSequence.length(), bVar);
        if (g0 != null) {
            return g0.K3().intValue();
        }
        throw new a14(charSequence.toString(), "ipaddress.error.invalidCIDRPrefix");
    }

    private static void i(int i2, int i3, int i4, int i5, int i6, int i7, k64 k64Var, int i8, long j2, long j3, long j4, long j5, int i9) {
        k64Var.c1(i8, 0, i9, 1, i4, 6, i2, 7, i3, 9, i7, 14, i5, 15, i6, 2, j2, 4, j3, 10, j4, 12, j5);
    }

    public static int i0(CharSequence charSequence) {
        int i2 = 0;
        while (i2 < charSequence.length()) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '/' || charAt == ':') {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static void j(int i2, int i3, int i4, int i5, int i6, int i7, k64 k64Var, int i8, long j2, long j3, long j4, long j5, int i9, int i10) {
        k64Var.x0(i8, 0, i9, 1, i4, 6, i2, 7, i3, 8, i10, 9, i7, 14, i5, 15, i6, 2, j2, 4, j3, 10, j4, 12, j5);
    }

    private static void k(int i2, int i3, int i4, k64 k64Var, int i5, long j2, int i6) {
        k64Var.X0(i5, 0, i6, 9, i4, 1, i4, 14, i2, 6, i2, 15, i3, 7, i3, 2, j2, 10, j2);
    }

    private static void l(int i2, int i3, int i4, k64 k64Var, int i5, long j2, long j3, int i6) {
        k64Var.c1(i5, 0, i6, 1, i4, 6, i2, 7, i3, 9, i4, 14, i2, 15, i3, 2, j2, 4, j3, 10, j2, 12, j3);
    }

    private static void m(long j2, CharSequence charSequence, int i2, int i3, int i4, k64 k64Var, int i5, int i6, b14.a aVar) throws a14 {
        r(charSequence, i2, i3, i3 - i4, aVar);
        int i7 = i4 << 2;
        long j3 = j2 << i7;
        g(i2, i3, i6, i2, i3, i6, k64Var, i5, j3, j3 | (~((-1) << i7)), 131072);
    }

    private static Integer n(int i2) {
        return t64.a(i2);
    }

    private static void o(CharSequence charSequence, k64 k64Var, int i2, b14.a aVar, long j2, long j3, long j4) throws a14 {
        if (k64Var.m(i2, 131072)) {
            if (k64Var.x(i2, 2) <= j2) {
                if (k64Var.x(i2, 10) > j2) {
                    k64Var.X2(i2, 10, j2);
                }
                if (aVar.A) {
                    return;
                }
                if ((k64Var.n(i2, 7) - k64Var.n(i2, 1)) - y(k64Var.p(i2, 0)) > j3) {
                    throw new a14(charSequence, "ipaddress.error.segment.too.long");
                }
                return;
            }
            throw new a14(charSequence, "ipaddress.error.ipv4.segment.too.large");
        } else if (k64Var.x(i2, 10) <= j2) {
            if (aVar.A) {
                return;
            }
            int p2 = k64Var.p(i2, 0);
            int n2 = k64Var.n(i2, 7);
            int n3 = k64Var.n(i2, 15);
            if ((n2 - k64Var.n(i2, 1)) - y(p2) > j3) {
                throw new a14(charSequence, "ipaddress.error.segment.too.long");
            }
            if (n2 != n3) {
                if ((n3 - k64Var.n(i2, 9)) - y(k64Var.p(i2, 8)) > j4) {
                    throw new a14(charSequence, "ipaddress.error.segment.too.long");
                }
            }
        } else {
            throw new a14(charSequence, "ipaddress.error.ipv4.segment.too.large");
        }
    }

    private static void p(CharSequence charSequence, s14 s14Var, m64 m64Var) throws a14 {
        long j2;
        k64 j3 = m64Var.j3();
        int V0 = j3.V0();
        boolean z2 = false;
        if (m64Var.w2().f()) {
            int i2 = 4 - V0;
            ec4 o2 = s14Var.o();
            boolean z3 = j3.D() && o2.y;
            if (i2 > 0 && V0 > 1) {
                if (o2.O) {
                    m64Var.D4(true);
                } else if (!z3) {
                    throw new a14(charSequence, "ipaddress.error.ipv4.too.few.segments");
                }
            }
            boolean z4 = !o2.A;
            boolean z5 = i2 > 0 && o2.O;
            for (int i3 = 0; i3 < V0; i3++) {
                if (z5 && i3 == V0 - 1) {
                    j2 = x(i2 + 1);
                    if (j3.I(i3)) {
                        m64Var.X2(i3, 10, j2);
                    }
                } else {
                    j2 = 255;
                }
                if (m64Var.m(i3, 131072)) {
                    if (m64Var.x(i3, 2) <= j2) {
                        if (m64Var.x(i3, 10) > j2) {
                            m64Var.X2(i3, 10, j2);
                        }
                        if (z4) {
                            int p2 = j3.p(i3, 0);
                            if ((m64Var.n(i3, 7) - m64Var.n(i3, 1)) - y(p2) > w(i2, p2)) {
                                throw new a14(charSequence, "ipaddress.error.segment.too.long");
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new a14(charSequence, "ipaddress.error.ipv4.segment.too.large");
                    }
                } else if (m64Var.x(i3, 10) > j2) {
                    throw new a14(charSequence, "ipaddress.error.ipv4.segment.too.large");
                } else {
                    if (z4) {
                        int p3 = j3.p(i3, 0);
                        int w2 = w(i2, p3);
                        int n2 = m64Var.n(i3, 7);
                        int n3 = m64Var.n(i3, 15);
                        if ((n2 - m64Var.n(i3, 1)) - y(p3) > w2) {
                            throw new a14(charSequence, "ipaddress.error.segment.too.long");
                        }
                        if (n2 != n3) {
                            int p4 = m64Var.p(i3, 8);
                            if ((n3 - m64Var.n(i3, 9)) - y(p4) > w(i2, p4)) {
                                throw new a14(charSequence, "ipaddress.error.segment.too.long");
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return;
        }
        if (m64Var.r4()) {
            V0 += 2;
        }
        if (j3.D() && s14Var.p().y) {
            z2 = true;
        }
        if (!z2 && V0 != 1 && V0 < 8 && !m64Var.C3()) {
            throw new a14(charSequence, "ipaddress.error.too.few.segments");
        }
    }

    private static void q(String str, w14 w14Var, x64 x64Var) throws a14 {
        p64.a j3 = x64Var.j3();
        if (j3 != null) {
            k64 i3 = x64Var.i3();
            boolean z2 = i3.D() && w14Var.o().y;
            int V0 = i3.V0();
            if (j3 == p64.a.DOTTED) {
                if (V0 <= 3 && w14Var.F != w14.a.EUI64) {
                    if (!z2 && V0 != 3) {
                        throw new a14(str, "ipaddress.error.too.few.segments");
                    }
                } else if (!z2 && V0 < 4) {
                    throw new a14(str, "ipaddress.error.too.few.segments");
                } else {
                    x64Var.t3(true);
                }
            } else if (V0 > 2) {
                if (V0 > 6 || w14Var.F == w14.a.EUI64) {
                    if (!z2 && V0 < 8) {
                        throw new a14(str, "ipaddress.error.too.few.segments");
                    }
                    x64Var.t3(true);
                } else if (!z2 && V0 != 6) {
                    throw new a14(str, "ipaddress.error.too.few.segments");
                }
                if (x64Var.j3() == p64.a.DASHED) {
                    for (int i2 = 0; i2 < V0; i2++) {
                        o(str, i3, i2, w14Var.o(), 255L, 2L, 2L);
                    }
                }
            } else {
                if (x64Var.j3() == p64.a.DASHED) {
                    if (x64Var.k3()) {
                        w14.c o2 = w14Var.o();
                        o(str, i3, 0, o2, j, 6L, 6L);
                        if (x64Var.n3()) {
                            o(str, i3, 1, o2, k, 10L, 10L);
                        } else {
                            o(str, i3, 1, o2, j, 6L, 6L);
                        }
                    }
                } else if (!z2) {
                    throw new a14(str, "ipaddress.error.too.few.segments");
                }
                if (w14Var.F == w14.a.EUI64) {
                    x64Var.t3(true);
                }
            }
        }
    }

    private static void r(CharSequence charSequence, int i2, int i3, int i4, b14.a aVar) throws a14 {
        if (!aVar.x.i()) {
            throw new a14(charSequence, "ipaddress.error.no.single.wildcard");
        }
        while (i4 < i3) {
            if (charSequence.charAt(i4) != '_') {
                throw new a14(charSequence, "ipaddress.error.single.wildcard.order");
            }
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r18.regionMatches(true, r15, com.p7700g.p99005.ni4.x0, 0, 9) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static u64.a s(String str, int i2, v64 v64Var) {
        u64.a aVar;
        CharSequence v2;
        s14 s14Var;
        u64.a aVar2 = null;
        if (i2 > 17) {
            try {
                int i3 = i2 - 17;
                if (str.regionMatches(true, i3, ni4.w0, 0, 17)) {
                    StringBuilder sb = new StringBuilder(str.substring(0, i3));
                    for (int i4 = 0; i4 < sb.length(); i4++) {
                        char charAt = sb.charAt(i4);
                        if (charAt == '-') {
                            sb.setCharAt(i4, ':');
                        } else if (charAt == 187) {
                            sb.setCharAt(i4, '-');
                        } else if (charAt == 's') {
                            sb.setCharAt(i4, '%');
                        }
                    }
                    u64.a aVar3 = new u64.a();
                    try {
                        aVar3.t = true;
                        s14 s14Var2 = F;
                        w64 w64Var = new w64(null, str, s14Var2);
                        e0(s14Var2, sb, 0, sb.length(), w64Var, false);
                        v64 E2 = E(sb, s14Var2, null, w64Var, sb.length());
                        v64 v64Var2 = u64.u;
                        if (E2 == v64Var2) {
                            E2 = v64Var;
                        } else if (v64Var != v64Var2) {
                            E2.t(v64Var);
                        }
                        aVar3.w = t(null, sb, s14Var2, w64Var, E2);
                        aVar = aVar3;
                        if (i2 > 8) {
                            return aVar;
                        }
                        try {
                            int i5 = i2 - 13;
                            boolean regionMatches = str.regionMatches(true, i5, yb4.y0, 0, 13);
                            if (!regionMatches) {
                                if (i2 > 9) {
                                    i5 = i2 - 9;
                                }
                                if (i2 <= 8) {
                                    return aVar;
                                }
                                i5 = i2 - 8;
                                if (!str.regionMatches(true, i5, ni4.y0, 0, 8)) {
                                    return aVar;
                                }
                            }
                            u64.a aVar4 = new u64.a();
                            try {
                                aVar4.u = true;
                                if (regionMatches) {
                                    v2 = u(str, i5);
                                    s14Var = G;
                                } else {
                                    v2 = v(str, i5);
                                    s14Var = H;
                                }
                                w64 w64Var2 = new w64(null, v2, s14Var);
                                e0(s14Var, v2, 0, v2.length(), w64Var2, false);
                                aVar4.w = t(null, v2, s14Var, w64Var2, v64Var != null ? v64Var : u64.u);
                                return aVar4;
                            } catch (a14 e2) {
                                e = e2;
                                aVar2 = aVar4;
                                aVar2.v = e;
                                return aVar2;
                            }
                        } catch (a14 e3) {
                            e = e3;
                            aVar2 = aVar;
                        }
                    } catch (a14 e4) {
                        e = e4;
                        aVar2 = aVar3;
                        aVar2.v = e;
                        return aVar2;
                    }
                }
            } catch (a14 e5) {
                e = e5;
            }
        }
        aVar = null;
        if (i2 > 8) {
        }
    }

    private static o64 t(e14 e14Var, CharSequence charSequence, s14 s14Var, w64 w64Var, v64 v64Var) throws a14 {
        char c;
        j14.b w2 = w64Var.w2();
        if (w2 == null) {
            j14.b n2 = v64Var.n(s14Var);
            j14.b t2 = s14Var.t();
            if (n2 == null) {
                w64Var.x4(t2);
                n2 = t2;
            } else if (t2 != null && !n2.equals(t2)) {
                throw new a14(charSequence, n2 == j14.b.IPV6 ? "ipaddress.error.ipv6" : "ipaddress.error.ipv4");
            }
            if (w64Var.j3().r3()) {
                Integer K3 = v64Var.K3();
                if (K3 != null) {
                    int intValue = K3.intValue();
                    s14 s14Var2 = r14.t;
                    if (s14Var == s14Var2 && K3.intValue() <= 128) {
                        if (n2 == null) {
                            c = 0;
                        } else {
                            c = n2.f() ? (char) 1 : (char) 2;
                        }
                        o64.k[][] kVarArr = A;
                        o64.k[] kVarArr2 = kVarArr[c];
                        if (kVarArr2 == null) {
                            kVarArr2 = new o64.k[129];
                            kVarArr[c] = kVarArr2;
                        }
                        o64.k kVar = kVarArr2[intValue];
                        if (kVar == null) {
                            o64.k kVar2 = new o64.k(K3, n2, s14Var2);
                            kVarArr2[intValue] = kVar2;
                            return kVar2;
                        }
                        return kVar;
                    }
                    return new o64.k(K3, n2, s14Var);
                } else if (s14Var.H) {
                    if (s14Var == r14.t) {
                        return B;
                    }
                    return new o64.j(s14Var);
                } else {
                    return o64.i0;
                }
            }
            return new o64.f(v64Var, n2, e14Var, s14Var);
        } else if (w64Var.I3() && w2.f()) {
            throw new a14(charSequence, "ipaddress.error.only.ipv6.has.zone");
        } else {
            w64Var.q4(v64Var);
            p(charSequence, s14Var, w64Var);
            return w64Var;
        }
    }

    private static CharSequence u(String str, int i2) throws a14 {
        StringBuilder sb = new StringBuilder(i2);
        int i3 = 0;
        for (int i4 = i2 - 1; i4 > 0; i4--) {
            char charAt = str.charAt(i4);
            if (charAt == '.') {
                if (i2 - i4 > 1) {
                    for (int i5 = i4 + 1; i5 < i2; i5++) {
                        sb.append(str.charAt(i5));
                    }
                    sb.append(charAt);
                    i3++;
                    i2 = i4;
                } else {
                    throw new a14(str, i4);
                }
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            sb.append(str.charAt(i6));
        }
        if (i3 + 1 == 4) {
            return sb;
        }
        throw new a14(str, 0);
    }

    private static CharSequence v(String str, int i2) throws a14 {
        StringBuilder sb = new StringBuilder(i2);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i3 >= 0) {
            boolean z2 = false;
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = i3 - 1;
                char charAt = str.charAt(i3);
                if (i6 >= 0) {
                    int i7 = i6 - 1;
                    char charAt2 = str.charAt(i6);
                    if (charAt2 == '.') {
                        if (charAt == '*') {
                            sb2.append('0');
                            sb3.append('f');
                        } else if (!z2) {
                            sb2.append(charAt);
                            sb3.append(charAt);
                            i3 = i7;
                        } else {
                            throw new a14(str, i7 + 1);
                        }
                    } else if (charAt2 == '-') {
                        sb3.append(charAt);
                        if (i7 >= 1) {
                            int i8 = i7 - 1;
                            char charAt3 = str.charAt(i7);
                            sb2.append(charAt3);
                            boolean z3 = charAt3 == '0' && charAt == 'f';
                            if (z2 && !z3) {
                                throw new a14(str, i8 + 1);
                            }
                            i7 = i8 - 1;
                            if (str.charAt(i8) != '.') {
                                throw new a14(str, i7 + 1);
                            }
                        } else {
                            throw new a14(str, i7);
                        }
                    } else {
                        throw new a14(str, i7 + 1);
                    }
                    z2 = true;
                    i3 = i7;
                } else if (i5 < 3) {
                    throw new a14(str, i6 + 1);
                } else {
                    if (charAt == '*') {
                        sb2.append('0');
                        sb3.append('f');
                        i3 = i6;
                        z2 = true;
                    } else if (!z2) {
                        sb2.append(charAt);
                        sb3.append(charAt);
                        i3 = i6;
                    } else {
                        throw new a14(str, 0);
                    }
                }
            }
            i4++;
            if (sb.length() > 0) {
                sb.append(':');
            }
            sb.append((CharSequence) sb2);
            if (z2) {
                sb.append('-');
                sb.append((CharSequence) sb3);
            }
            sb2.setLength(0);
            sb3.setLength(0);
        }
        if (i4 == 8) {
            return sb;
        }
        throw new a14(str, 0);
    }

    private static int w(int i2, int i3) {
        try {
            return L[i3 >>> 1][i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 0;
        }
    }

    private static long x(int i2) {
        return K[i2];
    }

    private static int y(int i2) {
        if (i2 != 2) {
            if (i2 == 10) {
                return 0;
            }
            if (i2 != 16) {
                return 1;
            }
        }
        return 2;
    }

    private static boolean z(CharSequence charSequence, int i2) {
        char charAt = charSequence.charAt(i2);
        return charAt == 'b' || charAt == 'B';
    }

    @Override // com.p7700g.p99005.l64
    public int a(CharSequence charSequence, j14.b bVar) throws a14 {
        return h0(charSequence, bVar);
    }

    @Override // com.p7700g.p99005.l64
    public o64 b(r14 r14Var) throws a14 {
        String r14Var2 = r14Var.toString();
        s14 A2 = r14Var.A();
        w64 w64Var = new w64(r14Var, r14Var2, A2);
        e0(A2, r14Var2, 0, r14Var2.length(), w64Var, false);
        return t(r14Var, r14Var2, A2, w64Var, E(r14Var2, A2, null, w64Var, r14Var2.length()));
    }

    @Override // com.p7700g.p99005.l64
    public r64 c(v14 v14Var) throws a14 {
        String v14Var2 = v14Var.toString();
        w14 f2 = v14Var.f();
        x64 x64Var = new x64(v14Var, v14Var2);
        f0(f2, v14Var2, 0, v14Var2.length(), x64Var);
        k64 i3 = x64Var.i3();
        if (i3.r3()) {
            return r64.j0;
        }
        if (i3.H()) {
            return q64.a(f2);
        }
        q(v14Var.toString(), v14Var.f(), x64Var);
        return x64Var;
    }

    @Override // com.p7700g.p99005.l64
    public u64 d(f14 f14Var) throws g14 {
        return d0(f14Var);
    }
}