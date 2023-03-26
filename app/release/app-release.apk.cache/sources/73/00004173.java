package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.m14;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.function.Supplier;
import org.xbill.DNS.TTL;

/* compiled from: AddressDivisionBase.java */
/* loaded from: classes3.dex */
public abstract class f24 implements j24 {
    private static TreeMap<Long, BigInteger> A = null;
    private static final long s = 4;
    private static final m14.e t;
    private static final m14.e u;
    private static final m14.e v;
    private static final String[] w;
    public static final char[] x;
    public static final char[] y;
    private static TreeMap<Long, Integer> z;
    public transient String B;
    private transient byte[] C;
    private transient byte[] D;
    public transient int E;

    /* compiled from: AddressDivisionBase.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface a<R> {
        Iterator<R> a(boolean z, boolean z2, int i, int i2);
    }

    /* compiled from: AddressDivisionBase.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface b<R extends x04> {
        R a(int i, int i2);
    }

    static {
        f34.n.b bVar = new f34.n.b(n04.w);
        t = new m14.e.a(8).e("0").i(bVar).j();
        u = new m14.e.a(16).e(n04.t).i(bVar).j();
        v = new m14.e.a(10).i(bVar).j();
        String[] strArr = new String[20];
        w = strArr;
        strArr[0] = "";
        for (int i = 1; i < 20; i++) {
            String[] strArr2 = w;
            strArr2[i] = wo1.B(new StringBuilder(), strArr2[i - 1], '0');
        }
        x = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', ni4.Z, 't', 'u', l64.d, 'w', 'x', 'y', 'z'};
        y = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        z = new TreeMap<>();
        A = new TreeMap<>();
    }

    public static boolean E3(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
        BigInteger shiftLeft = g24.u.shiftLeft(i - i2);
        return G3(bigInteger, bigInteger2, bigInteger3, shiftLeft, shiftLeft.not());
    }

    public static boolean G3(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return bigInteger.equals(bigInteger.and(bigInteger4)) && bigInteger3.equals(bigInteger2.or(bigInteger5));
    }

    public static int I(long j, int i) {
        int i2 = 1;
        if (i == 16) {
            while (true) {
                j >>>= 4;
                if (j == 0) {
                    break;
                }
                i2++;
            }
        } else {
            if (i == 10) {
                if (j < 10) {
                    return 1;
                }
                if (j < 100) {
                    return 2;
                }
                if (j < 1000) {
                    return 3;
                }
                j /= 1000;
                i2 = 3;
            } else if (i == 8) {
                while (true) {
                    j >>>= 3;
                    if (j == 0) {
                        return i2;
                    }
                    i2++;
                }
            }
            while (true) {
                j /= i;
                if (j == 0) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    public static g24.b<o34> I3(m14.e eVar) {
        g24.b<o34> bVar = (g24.b) g24.o(eVar);
        if (bVar == null) {
            g24.c cVar = new g24.c(eVar.d, eVar.f, eVar.j);
            cVar.J(eVar.c);
            cVar.c0(eVar.b);
            cVar.X(eVar.e);
            cVar.T(eVar.g);
            cVar.V(eVar.h);
            cVar.a0(eVar.i);
            cVar.U(eVar.d);
            cVar.b0(eVar.j);
            cVar.Z(eVar.f);
            cVar.d0(eVar.m);
            g24.L(eVar, cVar);
            return cVar;
        }
        return bVar;
    }

    public static int J(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 1;
        if (bigInteger.equals(BigInteger.ZERO) || bigInteger.equals(BigInteger.ONE)) {
            return 1;
        }
        while (true) {
            bigInteger = bigInteger.divide(bigInteger2);
            if (bigInteger.equals(BigInteger.ZERO)) {
                return i;
            }
            i++;
        }
    }

    private static int L(String str, StringBuilder sb) {
        if (sb == null) {
            return str.length();
        }
        sb.append(str);
        return 0;
    }

    public static void M(int i, StringBuilder sb) {
        if (i > 0) {
            String[] strArr = w;
            if (i >= strArr.length) {
                int length = strArr.length - 1;
                String str = strArr[length];
                while (i >= length) {
                    sb.append(str);
                    i -= length;
                }
                sb.append(strArr[i]);
                return;
            }
            sb.append(strArr[i]);
        }
    }

    public static StringBuilder N3(long j, int i, int i2, boolean z2, char[] cArr, StringBuilder sb) {
        if (j > av5.s || !U3((int) j, i, i2, z2, cArr, sb)) {
            S3(j, i, i2, cArr, sb);
        }
        return sb;
    }

    public static int R(int i, int i2, long j) {
        long j2 = (i << 32) | i2;
        Integer num = z.get(Long.valueOf(j2));
        if (num == null) {
            num = g24.b(I(j, i));
            z.put(Long.valueOf(j2), num);
        }
        return num.intValue();
    }

    public static int S(int i, int i2, BigInteger bigInteger) {
        long j = i;
        long j2 = (j << 32) | i2;
        Integer num = z.get(Long.valueOf(j2));
        if (num == null) {
            if (bigInteger == null) {
                bigInteger = T(i2);
            }
            num = Integer.valueOf(J(bigInteger, BigInteger.valueOf(j)));
            z.put(Long.valueOf(j2), num);
        }
        return num.intValue();
    }

    private static void S3(long j, int i, int i2, char[] cArr, StringBuilder sb) {
        int length = sb.length();
        o(j, i, i2, cArr, sb);
        for (int length2 = sb.length() - 1; length < length2; length2--) {
            char charAt = sb.charAt(length);
            sb.setCharAt(length, sb.charAt(length2));
            sb.setCharAt(length2, charAt);
            length++;
        }
    }

    public static BigInteger T(int i) {
        int i2 = (i + 7) / 8;
        int i3 = i % 8;
        int i4 = i3 != 0 ? i3 : 8;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) (~((-1) << i4));
        for (int i5 = 1; i5 < i2; i5++) {
            bArr[i5] = -1;
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger U(BigInteger bigInteger, int i) {
        long intValue = (bigInteger.intValue() << 32) | i;
        BigInteger bigInteger2 = A.get(Long.valueOf(intValue));
        if (bigInteger2 == null) {
            if (i != 1) {
                if ((i & 1) == 0) {
                    BigInteger U = U(bigInteger, i >> 1);
                    bigInteger = U.multiply(U);
                } else {
                    BigInteger U2 = U(bigInteger, (i - 1) >> 1);
                    bigInteger = U2.multiply(U2).multiply(bigInteger);
                }
            }
            A.put(Long.valueOf(intValue), bigInteger);
            return bigInteger;
        }
        return bigInteger2;
    }

    private static boolean U3(int i, int i2, int i3, boolean z2, char[] cArr, StringBuilder sb) {
        if (W3(i, i2, z2, cArr, sb)) {
            if (i3 > 0) {
                sb.setLength(sb.length() - i3);
                return true;
            }
            return true;
        }
        return false;
    }

    private static boolean W3(int i, int i2, boolean z2, char[] cArr, StringBuilder sb) {
        if (i <= 1) {
            if (i == 0) {
                sb.append('0');
            } else {
                sb.append('1');
            }
            return true;
        } else if (i2 == 10) {
            if (i < 10) {
                sb.append(cArr[i]);
                return true;
            }
            if (i < 100) {
                sb.append(g54.A);
            } else if (i < 1000) {
                if (i == 127) {
                    sb.append("127");
                    return true;
                } else if (i == 255) {
                    sb.append("255");
                    return true;
                } else {
                    sb.append("   ");
                }
            } else if (i < 10000) {
                sb.append("    ");
            } else {
                sb.append("     ");
            }
            int length = sb.length();
            while (true) {
                int i3 = (52429 * i) >>> 19;
                length--;
                sb.setCharAt(length, cArr[i - ((i3 << 3) + (i3 << 1))]);
                if (i3 == 0) {
                    return true;
                }
                i = i3;
            }
        } else if (i2 == 16) {
            if (i < 10) {
                sb.append(cArr[i]);
                return true;
            } else if (i < 16) {
                sb.append(cArr[i]);
                return true;
            } else {
                if (i < 256) {
                    sb.append(g54.A);
                } else if (i < 4096) {
                    sb.append("   ");
                } else if (i == 65535) {
                    sb.append(z2 ? "FFFF" : "ffff");
                    return true;
                } else {
                    sb.append("    ");
                }
                int length2 = sb.length();
                while (true) {
                    int i4 = i >>> 4;
                    length2--;
                    sb.setCharAt(length2, cArr[i - (i4 << 4)]);
                    if (i4 == 0) {
                        return true;
                    }
                    i = i4;
                }
            }
        } else if (i2 != 8) {
            if (i2 == 2) {
                int i5 = 15;
                int i6 = i >>> 8;
                if (i6 == 0) {
                    i5 = 7;
                    i6 = i;
                }
                int i7 = i6 >>> 4;
                if (i7 == 0) {
                    i5 -= 4;
                } else {
                    i6 = i7;
                }
                int i8 = i6 >>> 2;
                if (i8 == 0) {
                    i5 -= 2;
                } else {
                    i6 = i8;
                }
                if ((2 & i6) == 0) {
                    i5--;
                }
                sb.append('1');
                while (i5 > 0) {
                    i5--;
                    sb.append(cArr[(i >>> i5) & 1]);
                }
                return true;
            }
            return false;
        } else if (i < 8) {
            sb.append(cArr[i]);
            return true;
        } else {
            if (i < 64) {
                sb.append(g54.A);
            } else if (i < 512) {
                sb.append("   ");
            } else if (i < 4096) {
                sb.append("    ");
            } else if (i < 32768) {
                sb.append("     ");
            } else {
                sb.append("      ");
            }
            int length3 = sb.length();
            while (true) {
                int i9 = i >>> 3;
                length3--;
                sb.setCharAt(length3, cArr[i - (i9 << 3)]);
                if (i9 == 0) {
                    return true;
                }
                i = i9;
            }
        }
    }

    private static void X0(int i, char c, char c2, String str, StringBuilder sb) {
        int length = str.length();
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                if (length > 0) {
                    sb.append(str);
                }
                sb.append(c2);
                sb.append(c);
                i = i2;
            } else {
                sb.setLength(sb.length() - 1);
                return;
            }
        }
    }

    private static void c1(int i, char c, String str, String str2, StringBuilder sb) {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                if (str2.length() > 0) {
                    sb.append(str2);
                }
                sb.append(str);
                sb.append(c);
                i = i2;
            } else {
                sb.setLength(sb.length() - 1);
                return;
            }
        }
    }

    private static void d1(int i, char c, String str, StringBuilder sb) {
        X0(i, c, '0', str, sb);
    }

    public static int e4(long j, int i) {
        int g4;
        return (j > av5.s || (g4 = g4((int) j, i)) < 0) ? n4(j, i) : g4;
    }

    public static int g4(int i, int i2) {
        if (i <= 1) {
            return 1;
        }
        if (i2 == 10) {
            if (i < 10) {
                return 1;
            }
            if (i < 100) {
                return 2;
            }
            if (i < 1000) {
                return 3;
            }
            return i < 10000 ? 4 : 5;
        } else if (i2 == 16) {
            if (i < 16) {
                return 1;
            }
            if (i < 256) {
                return 2;
            }
            return i < 4096 ? 3 : 4;
        } else if (i2 == 8) {
            if (i < 8) {
                return 1;
            }
            if (i < 64) {
                return 2;
            }
            if (i < 512) {
                return 3;
            }
            if (i < 4096) {
                return 4;
            }
            return i < 32768 ? 5 : 6;
        } else if (i2 == 2) {
            int i3 = 15;
            int i4 = i >>> 8;
            if (i4 == 0) {
                i3 = 7;
            } else {
                i = i4;
            }
            int i5 = i >>> 4;
            if (i5 == 0) {
                i3 -= 4;
            } else {
                i = i5;
            }
            int i6 = i >>> 2;
            if (i6 == 0) {
                i3 -= 2;
            } else {
                i = i6;
            }
            return (i & 2) != 0 ? i3 + 1 : i3;
        } else {
            return -1;
        }
    }

    public static int h(int i, long j, long j2) {
        long j3 = j >>> 32;
        int i2 = (i * 31) + ((int) (j3 == 0 ? j : j3 ^ j));
        if (j2 != j) {
            long j4 = j2 >>> 32;
            if (j4 != 0) {
                j2 ^= j4;
            }
            return (i2 * 31) + ((int) j2);
        }
        return i2;
    }

    private static int n4(long j, int i) {
        boolean z2 = j <= TTL.MAX_VALUE;
        int i2 = z2 ? (int) j : i;
        int i3 = 1;
        while (i2 >= i) {
            if (z2) {
                i2 /= i;
            } else {
                j /= i;
                if (j <= TTL.MAX_VALUE) {
                    i2 = (int) j;
                    z2 = true;
                }
            }
            i3++;
        }
        return i3;
    }

    private static void o(long j, int i, int i2, char[] cArr, StringBuilder sb) {
        int i3;
        int i4;
        boolean z2 = j <= TTL.MAX_VALUE;
        int i5 = z2 ? (int) j : i;
        while (i5 >= i) {
            if (z2) {
                i3 = i5 / i;
                if (i2 > 0) {
                    i2--;
                    i5 = i3;
                } else {
                    i4 = i5 % i;
                }
            } else {
                long j2 = i;
                long j3 = j / j2;
                if (j3 <= TTL.MAX_VALUE) {
                    i5 = (int) j3;
                    z2 = true;
                }
                if (i2 > 0) {
                    i2--;
                    j = j3;
                } else {
                    i3 = i5;
                    i4 = (int) (j % j2);
                    j = j3;
                }
            }
            sb.append(cArr[i4]);
            i5 = i3;
        }
        if (i2 == 0) {
            sb.append(cArr[i5]);
        }
    }

    public static int t(long j, long j2) {
        return h(1, j, j2);
    }

    public static <T extends x04> x44<T> u(T t2, int i, int i2, Supplier<Iterator<T>> supplier, a<T> aVar, b<T> bVar) {
        return new o24(t2, i, i2, supplier, aVar, bVar);
    }

    private byte[] x(byte[] bArr, int i, byte[] bArr2) {
        int A0 = (A0() + 7) >> 3;
        if (bArr != null && bArr.length >= A0 + i) {
            System.arraycopy(bArr2, 0, bArr, i, A0);
            return bArr;
        } else if (i > 0) {
            byte[] bArr3 = new byte[A0 + i];
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, 0, Math.min(i, bArr.length));
            }
            System.arraycopy(bArr2, 0, bArr3, i, bArr2.length);
            return bArr3;
        } else {
            return (byte[]) bArr2.clone();
        }
    }

    public String A() {
        String str = this.B;
        if (str == null) {
            synchronized (this) {
                str = this.B;
                if (str == null) {
                    str = B();
                    this.B = str;
                }
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.l24
    public byte[] A3() {
        if (!z3()) {
            return m1();
        }
        byte[] bArr = this.D;
        if (bArr == null) {
            bArr = y(false);
            this.D = bArr;
        }
        return (byte[]) bArr.clone();
    }

    public abstract String B();

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ boolean B3(int i) {
        return k24.c(this, i);
    }

    @Override // com.p7700g.p99005.l24
    public byte[] C2(byte[] bArr, int i) {
        byte[] bArr2 = this.C;
        if (bArr2 == null) {
            bArr2 = y(true);
            this.C = bArr2;
        }
        return x(bArr, i, bArr2);
    }

    public void C3() {
        String G;
        if (this.B != null || (G = G()) == null) {
            return;
        }
        synchronized (this) {
            this.B = G;
        }
    }

    public abstract String D();

    public abstract void D1(int i, int i2, boolean z2, char c, boolean z3, String str, StringBuilder sb);

    public abstract String E();

    public String G() {
        return null;
    }

    public abstract int H();

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ boolean H0() {
        return k24.j(this);
    }

    public abstract void N(int i, int i2, boolean z2, StringBuilder sb);

    public abstract void O(int i, boolean z2, StringBuilder sb);

    public abstract int P(int i);

    public abstract int Q();

    public abstract int V(int i);

    public int X(int i, z44 z44Var, StringBuilder sb) {
        int p = z44Var.p();
        int i2 = i(z44Var.u(i), p);
        String t2 = z44Var.t();
        int length = t2.length();
        f34.n.b o = z44Var.o();
        int m = m(V(p));
        if (sb == null) {
            return P(p) + i2 + length;
        }
        if (length > 0) {
            sb.append(t2);
        }
        if (i2 > 0) {
            M(i2, sb);
        }
        N(p, m, z44Var.c(), sb);
        for (int i3 = 0; i3 < m; i3++) {
            sb.append(o.c);
        }
        return 0;
    }

    public int X2(int i, z44 z44Var, StringBuilder sb) {
        int p = z44Var.p();
        int i2 = i(z44Var.u(i), p);
        String t2 = z44Var.t();
        if (sb == null) {
            int P = P(p) + i2;
            int i3 = (P << 1) - 1;
            int length = t2.length();
            return length > 0 ? i3 + (P * length) : i3;
        }
        f34.n.b o = z44Var.o();
        int m = m(V(p));
        char charValue = z44Var.f() == null ? (char) 0 : z44Var.f().charValue();
        boolean g = z44Var.g();
        boolean c = z44Var.c();
        if (g) {
            c1(m, charValue, o.c, t2, sb);
            sb.append(charValue);
            D1(p, m, c, charValue, g, t2, sb);
            if (i2 > 0) {
                sb.append(charValue);
                d1(i2, charValue, t2, sb);
            }
        } else {
            if (i2 != 0) {
                d1(i2, charValue, t2, sb);
                sb.append(charValue);
            }
            D1(p, m, c, charValue, g, t2, sb);
            sb.append(charValue);
            c1(m, charValue, o.c, t2, sb);
        }
        return 0;
    }

    public /* synthetic */ Integer X3() {
        return k24.i(this);
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ boolean Y2(int i) {
        return k24.d(this, i);
    }

    public int Z(int i, z44 z44Var, int i2, int i3, boolean z2, StringBuilder sb) {
        return x0(z44Var.o().a, i2, i3, z44Var.t(), z44Var.p(), z44Var.c(), z2, sb);
    }

    @Override // com.p7700g.p99005.k34
    public int a(int i, z44 z44Var, StringBuilder sb) {
        String str;
        int P;
        if (!z3()) {
            if (z44Var.e()) {
                int p = z44Var.p();
                int i2 = i(z44Var.u(i), p);
                String t2 = z44Var.t();
                int length = t2.length();
                if (sb == null) {
                    if (i2 == 0) {
                        P = P(p);
                    } else if (i2 < 0) {
                        P = b(p);
                    } else {
                        P = i2 + P(p);
                    }
                    int i3 = (P << 1) - 1;
                    return length > 0 ? i3 + (P * length) : i3;
                }
                char charValue = z44Var.f() == null ? (char) 0 : z44Var.f().charValue();
                boolean g = z44Var.g();
                boolean c = z44Var.c();
                if (g) {
                    D1(p, 0, c, charValue, g, t2, sb);
                    if (i2 != 0) {
                        sb.append(charValue);
                        d1(i2, charValue, t2, sb);
                    }
                } else {
                    if (i2 != 0) {
                        d1(i2, charValue, t2, sb);
                        sb.append(charValue);
                    }
                    D1(p, 0, c, charValue, g, t2, sb);
                }
                return 0;
            }
            return e(i, z44Var, sb);
        } else if (H0() && (str = z44Var.o().b) != null) {
            if (str.equals(G())) {
                C3();
            }
            if (z44Var.e()) {
                int p2 = z44Var.p();
                if (sb == null) {
                    return ((str.length() + 1) * b(p2)) - 1;
                }
                c1(b(p2), z44Var.f() == null ? (char) 0 : z44Var.f().charValue(), str, "", sb);
                return 0;
            }
            return L(str, sb);
        } else {
            return w0(i, z44Var, sb);
        }
    }

    public /* synthetic */ int b3() {
        return k24.g(this);
    }

    @Override // com.p7700g.p99005.l24, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(l24 l24Var) {
        int m4;
        m4 = m4(l24Var);
        return m4;
    }

    public int d3(int i, z44 z44Var, StringBuilder sb) {
        boolean z2;
        String t2 = z44Var.t();
        int p = z44Var.p();
        int n = n(z44Var.u(i), p);
        f34.n.b o = z44Var.o();
        boolean c = z44Var.c();
        char charValue = z44Var.f() == null ? (char) 0 : z44Var.f().charValue();
        boolean g = z44Var.g();
        String str = o.a;
        if (sb == null) {
            return j3(str, o.b, n, p, c, charValue, g, t2);
        }
        boolean z3 = n != 0;
        if (!z3 || g) {
            z2 = z3;
        } else {
            d1(n, charValue, t2, sb);
            sb.append(charValue);
            z2 = false;
        }
        i3(str, o.b, p, c, charValue, g, t2, sb);
        if (z2) {
            sb.append(charValue);
            d1(n, charValue, t2, sb);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // com.p7700g.p99005.k34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int e(int i, z44 z44Var, StringBuilder sb) {
        int i2;
        int p;
        int i3;
        int P;
        String t2 = z44Var.t();
        int length = t2.length();
        if (length > 0) {
            if (sb != null) {
                sb.append(t2);
            } else {
                i2 = length + 0;
                p = z44Var.p();
                i3 = i(z44Var.u(i), p);
                if (i3 != 0) {
                    if (sb != null) {
                        M(i(i3, p), sb);
                    } else if (i3 < 0) {
                        P = b(p);
                        return P + i2;
                    } else {
                        i2 += i3;
                    }
                }
                boolean c = z44Var.c();
                if (p == H()) {
                    if (sb == null) {
                        P = P(p);
                        return P + i2;
                    }
                    O(p, c, sb);
                    return 0;
                }
                String A2 = A();
                if (sb == null) {
                    P = A2.length();
                    return P + i2;
                }
                if (c) {
                    p(A2, p, sb);
                } else {
                    sb.append(A2);
                }
                return 0;
            }
        }
        i2 = 0;
        p = z44Var.p();
        i3 = i(z44Var.u(i), p);
        if (i3 != 0) {
        }
        boolean c2 = z44Var.c();
        if (p == H()) {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f24) {
            f24 f24Var = (f24) obj;
            return A0() == f24Var.A0() && f24Var.x3(this);
        }
        return false;
    }

    public int g(int i, z44 z44Var, StringBuilder sb) {
        int u2 = z44Var.u(i);
        int p = z44Var.p();
        int i2 = i(u2, p);
        int n = n(u2, p);
        f34.n.b o = z44Var.o();
        String str = o.a;
        int V = o.c == null ? 0 : V(p);
        if (V == 0 && p == H() && !H0()) {
            String k3 = k3();
            String D = D();
            String t2 = z44Var.t();
            int length = t2.length();
            if (i2 == 0 && n == 0 && D.equals(str) && length == 0) {
                if (sb == null) {
                    return k3.length();
                }
                if (z44Var.c()) {
                    p(k3, p, sb);
                } else {
                    sb.append(k3);
                }
                return 0;
            } else if (sb == null) {
                int length2 = (str.length() - D.length()) + k3.length() + i2 + n;
                return length > 0 ? length2 + (length << 1) : length2;
            } else {
                int indexOf = k3.indexOf(D);
                if (length > 0) {
                    sb.append(t2);
                }
                if (i2 > 0) {
                    M(i2, sb);
                }
                sb.append(k3.substring(0, indexOf));
                sb.append(str);
                if (length > 0) {
                    sb.append(t2);
                }
                if (n > 0) {
                    M(n, sb);
                }
                sb.append(k3.substring(D.length() + indexOf));
                return 0;
            }
        }
        int m = m(V);
        if (u2 >= 0 || sb != null) {
            if (m != 0) {
                return X(i, z44Var, sb);
            }
            return Z(i, z44Var, i2, n, true, sb);
        }
        int b2 = b(p);
        int length3 = z44Var.t().length();
        if (m != 0) {
            return length3 > 0 ? b2 + length3 : b2;
        }
        int i3 = b2 << 1;
        if (length3 > 0) {
            i3 += length3 << 1;
        }
        return str.length() + i3;
    }

    public /* synthetic */ int g3() {
        return k24.e(this);
    }

    public /* synthetic */ BigInteger getCount() {
        return k24.f(this);
    }

    public /* synthetic */ BigInteger h1(int i) {
        return k24.h(this, i);
    }

    public int hashCode() {
        int i = this.E;
        if (i == 0) {
            i = 1;
            BigInteger value = getValue();
            BigInteger C1 = C1();
            do {
                long longValue = value.longValue();
                long longValue2 = C1.longValue();
                value = value.shiftRight(64);
                C1 = C1.shiftRight(64);
                i = h(i, longValue, longValue2);
            } while (!C1.equals(BigInteger.ZERO));
            this.E = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    public abstract void i3(String str, String str2, int i, boolean z2, char c, boolean z3, String str3, StringBuilder sb);

    public abstract int j3(String str, String str2, int i, int i2, boolean z2, char c, boolean z3, String str3);

    public String k3() {
        String str = this.B;
        if (str == null) {
            synchronized (this) {
                str = this.B;
                if (str == null) {
                    if (!z3()) {
                        str = B();
                    } else if (!H0() || (str = G()) == null) {
                        str = E();
                    }
                    this.B = str;
                }
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.l24
    public byte[] l1(byte[] bArr) {
        return v3(bArr, 0);
    }

    public int m(int i) {
        if (i != 0) {
            if (!v1() || i == 1) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.p7700g.p99005.l24
    public byte[] m1() {
        byte[] bArr = this.C;
        if (bArr == null) {
            bArr = y(true);
            this.C = bArr;
        }
        return (byte[]) bArr.clone();
    }

    @Override // com.p7700g.p99005.l24
    public /* synthetic */ int m4(l24 l24Var) {
        return k24.a(this, l24Var);
    }

    public abstract int n(int i, int i2);

    public abstract void n3(int i, boolean z2, StringBuilder sb);

    public void p(CharSequence charSequence, int i, StringBuilder sb) {
        if (i > 10) {
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 'a' && charAt <= 'z') {
                    charAt = (char) (charAt - ' ');
                }
                sb.append(charAt);
            }
            return;
        }
        sb.append(charSequence);
    }

    public abstract int p3(int i);

    public abstract void t3(int i, boolean z2, StringBuilder sb);

    @Override // com.p7700g.p99005.l24
    public byte[] t4(byte[] bArr) {
        return C2(bArr, 0);
    }

    public String toString() {
        m14.e eVar;
        int H = H();
        if (H == 8) {
            eVar = t;
        } else if (H == 10) {
            eVar = v;
        } else if (H != 16) {
            eVar = new m14.e.a(H).i(new f34.n.b(n04.w)).j();
        } else {
            eVar = u;
        }
        StringBuilder sb = new StringBuilder(34);
        I3(eVar).E(this, sb);
        return sb.toString();
    }

    @Override // com.p7700g.p99005.l24
    public byte[] v3(byte[] bArr, int i) {
        if (!z3()) {
            return C2(bArr, i);
        }
        byte[] bArr2 = this.D;
        if (bArr2 == null) {
            bArr2 = y(false);
            this.D = bArr2;
        }
        return x(bArr, i, bArr2);
    }

    public int w0(int i, z44 z44Var, StringBuilder sb) {
        boolean e = z44Var.e();
        int p = z44Var.p();
        int u2 = z44Var.u(i);
        f34.n.b o = z44Var.o();
        String str = o.a;
        int V = o.c == null ? 0 : V(p);
        int i2 = i(u2, p);
        int n = n(u2, p);
        if (V != 0 || p != H() || e || H0()) {
            if (!e && u2 < 0 && sb == null) {
                int length = z44Var.t().length();
                int b2 = b(p);
                if (V != 0) {
                    return length > 0 ? b2 + length : b2;
                }
                int i3 = b2 << 1;
                if (length > 0) {
                    i3 += length << 1;
                }
                return str.length() + i3;
            } else if (m(V) != 0) {
                if (e) {
                    return X2(i, z44Var, sb);
                }
                return X(i, z44Var, sb);
            } else if (e) {
                return d3(i, z44Var, sb);
            } else {
                return Z(i, z44Var, i2, n, false, sb);
            }
        }
        String w3 = w3();
        String D = D();
        String t2 = z44Var.t();
        int length2 = t2.length();
        if (i2 == 0 && n == 0 && length2 == 0 && str.equals(D)) {
            if (sb == null) {
                return w3.length();
            }
            sb.append(w3);
            return 0;
        } else if (sb == null) {
            int length3 = (str.length() - D.length()) + w3.length() + i2 + n;
            return length2 > 0 ? length3 + (length2 << 1) : length3;
        } else {
            int indexOf = w3.indexOf(D);
            if (length2 > 0) {
                sb.append(t2);
            }
            if (i2 > 0) {
                M(i2, sb);
            }
            sb.append(w3.substring(0, indexOf));
            sb.append(str);
            if (length2 > 0) {
                sb.append(t2);
            }
            if (n > 0) {
                M(n, sb);
            }
            sb.append(w3.substring(D.length() + indexOf));
            return 0;
        }
    }

    public String w3() {
        return k3();
    }

    public int x0(String str, int i, int i2, String str2, int i3, boolean z2, boolean z3, StringBuilder sb) {
        int length = str2.length();
        boolean z4 = length > 0;
        if (sb == null) {
            int length2 = str.length() + p3(i3) + P(i3) + i + i2;
            return z4 ? length2 + (length << 1) : length2;
        }
        if (z4) {
            sb.append(str2);
        }
        if (i > 0) {
            M(i, sb);
        }
        O(i3, z2, sb);
        sb.append(str);
        if (z4) {
            sb.append(str2);
        }
        if (i2 > 0) {
            M(i2, sb);
        }
        if (z3) {
            t3(i3, z2, sb);
        } else {
            n3(i3, z2, sb);
        }
        return 0;
    }

    public boolean x3(f24 f24Var) {
        return getValue().equals(f24Var.getValue()) && C1().equals(f24Var.C1());
    }

    public abstract byte[] y(boolean z2);

    public /* synthetic */ boolean z3() {
        return k24.k(this);
    }
}