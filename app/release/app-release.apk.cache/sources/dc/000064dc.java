package com.p7700g.p99005;

import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: IPAddressLargeDivision.java */
/* loaded from: classes3.dex */
public class x24 extends f24 implements t24 {
    public static final char G = 187;
    private static final long J = 4;
    private final BigInteger K;
    private final BigInteger L;
    private final BigInteger M;
    private final BigInteger N;
    private final BigInteger O;
    private final int P;
    private final Integer Q;
    private final boolean R;
    private final boolean S;
    public transient String T;
    private static final BigInteger F = BigInteger.valueOf(Long.MAX_VALUE);
    public static final String H = String.valueOf((char) 187);
    public static final char[] I = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', ni4.Z, 't', 'u', l64.d, 'w', 'x', 'y', 'z', '!', '#', h95.c, '%', h95.d, '(', ')', n04.z, '+', '-', ';', h95.e, '=', h95.f, '?', '@', '^', n04.E, '`', '{', gl4.T, '}', '~'};

    public x24(byte[] bArr, int i, int i2) throws c14 {
        if (bArr.length != 0 && i != 0) {
            BigInteger T = f24.T(i);
            this.M = T;
            this.P = i;
            this.O = BigInteger.valueOf(i2);
            this.R = false;
            this.S = false;
            BigInteger bigInteger = new BigInteger(1, bArr);
            this.K = bigInteger;
            this.L = bigInteger;
            this.N = bigInteger;
            this.Q = null;
            if (bigInteger.compareTo(T) > 0) {
                throw new c14(bigInteger);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private static int B4(BigInteger bigInteger, int i) {
        return f24.J(bigInteger, BigInteger.valueOf(i));
    }

    private static char[] D4(int i, boolean z) {
        if (F4(i)) {
            return I;
        }
        return z ? f24.y : f24.x;
    }

    private boolean E4() {
        return F4(this.O.intValue());
    }

    private static boolean F4(int i) {
        return i > 36;
    }

    private static boolean G4(byte[] bArr, byte[] bArr2, int i, Integer num, boolean z, boolean z2) {
        if (num == null) {
            return false;
        }
        int intValue = i - num.intValue();
        int length = bArr.length - ((intValue + 7) / 8);
        int i2 = ((-1) << (((intValue - 1) % 8) + 1)) & 255;
        int i3 = bArr[length];
        int i4 = bArr2[length];
        if (z) {
            if ((i3 & i2) != (i4 & i2)) {
                return false;
            }
            for (int i5 = length - 1; i5 >= 0; i5--) {
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
            }
        }
        if (z2) {
            int i6 = (~i2) & 255;
            int i7 = i4 & i6;
            if ((i3 & i6) == 0 && i7 == i6) {
                for (int i8 = length + 1; i8 < bArr.length; i8++) {
                    if (bArr[i8] == 0 && bArr2[i8] == -1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private String H4(BigInteger bigInteger, int i, boolean z, int i2) {
        return I4(bigInteger, this.O.intValue() == i ? this.O : BigInteger.valueOf(i), z, i2, f24.S(i, this.P, null));
    }

    private static String I4(BigInteger bigInteger, BigInteger bigInteger2, boolean z, int i, int i2) {
        StringBuilder sb;
        if (bigInteger.equals(BigInteger.ZERO)) {
            return "0";
        }
        if (bigInteger.equals(BigInteger.ONE)) {
            return "1";
        }
        char[] D4 = D4(bigInteger2.intValue(), z);
        if (i2 <= 0) {
            StringBuilder sb2 = null;
            do {
                BigInteger[] divideAndRemainder = bigInteger.divideAndRemainder(bigInteger2);
                BigInteger bigInteger3 = divideAndRemainder[0];
                BigInteger bigInteger4 = divideAndRemainder[1];
                if (i > 0) {
                    i--;
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(D4[bigInteger4.intValue()]);
                    bigInteger = bigInteger3;
                }
            } while (!bigInteger.equals(BigInteger.ZERO));
            if (sb2 == null) {
                return "";
            }
            sb2.reverse();
            sb = sb2;
        } else if (i2 <= i) {
            return "";
        } else {
            sb = new StringBuilder();
            J4(bigInteger, bigInteger2, z, i, i2, D4, true, sb);
        }
        return sb.toString();
    }

    private static void J4(BigInteger bigInteger, BigInteger bigInteger2, boolean z, int i, int i2, char[] cArr, boolean z2, StringBuilder sb) {
        if (bigInteger.compareTo(F) <= 0) {
            long longValue = bigInteger.longValue();
            int intValue = bigInteger2.intValue();
            if (!z2) {
                f24.M(i2 - f24.e4(longValue, intValue), sb);
            }
            f24.N3(longValue, intValue, i, z, cArr, sb);
            return;
        }
        int i3 = i2 >>> 1;
        if (i3 > i) {
            BigInteger[] divideAndRemainder = bigInteger.divideAndRemainder(f24.U(bigInteger2, i3));
            BigInteger bigInteger3 = divideAndRemainder[0];
            BigInteger bigInteger4 = divideAndRemainder[1];
            if (z2 && bigInteger3.equals(BigInteger.ZERO)) {
                J4(bigInteger4, bigInteger2, z, i, i3, cArr, true, sb);
                return;
            }
            if (i2 > i) {
                J4(bigInteger3, bigInteger2, z, Math.max(0, i - i3), i2 - i3, cArr, z2, sb);
            }
            J4(bigInteger4, bigInteger2, z, i, i3, cArr, false, sb);
        }
    }

    private int p4(int i, BigInteger bigInteger, int i2) {
        if (i < 0) {
            return Math.max(0, b(i2) - y4(bigInteger, i2));
        }
        return i;
    }

    private static byte[] q4(byte[] bArr, int i, String str) {
        int length = bArr.length;
        int i2 = 0;
        if (length < i) {
            byte[] bArr2 = new byte[i];
            int length2 = i - bArr.length;
            if ((bArr[0] & g15.b) != 0) {
                Arrays.fill(bArr2, 0, length2, (byte) -1);
            }
            System.arraycopy(bArr, 0, bArr2, length2, bArr.length);
            return bArr2;
        } else if (length <= i) {
            return bArr;
        } else {
            while (true) {
                int i3 = i2 + 1;
                if (bArr[i2] != 0) {
                    throw new c14(str, length);
                }
                length--;
                if (length <= i) {
                    return Arrays.copyOfRange(bArr, i3, bArr.length);
                }
                i2 = i3;
            }
        }
    }

    private static byte[] w4(byte[] bArr, int i) {
        return q4(bArr, (i + 7) / 8, "");
    }

    private int y4(BigInteger bigInteger, int i) {
        return f24.J(bigInteger, this.O.intValue() == i ? this.O : BigInteger.valueOf(i));
    }

    @Override // com.p7700g.p99005.f24
    public String A() {
        String str = this.T;
        if (str == null) {
            synchronized (this) {
                str = this.T;
                if (str == null) {
                    str = B();
                    this.T = str;
                }
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return this.P;
    }

    @Override // com.p7700g.p99005.f24
    public String B() {
        return I4(getValue(), this.O, false, 0, Q());
    }

    @Override // com.p7700g.p99005.t24
    public boolean C0() {
        return this.Q != null;
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger C1() {
        return this.L;
    }

    @Override // com.p7700g.p99005.f24
    public String D() {
        return E4() ? H : n04.w;
    }

    @Override // com.p7700g.p99005.f24
    public void D1(int i, int i2, boolean z, char c, boolean z2, String str, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        N(i, i2, z, sb2);
        int length = str.length();
        for (int i3 = 0; i3 < sb2.length(); i3++) {
            if (i3 > 0) {
                sb.append(c);
            }
            if (length > 0) {
                sb.append(str);
            }
            sb.append(sb2.charAt(z2 ? (sb2.length() - i3) - 1 : i3));
        }
    }

    @Override // com.p7700g.p99005.f24
    public String E() {
        int Q = Q();
        return I4(getValue(), this.O, false, 0, Q) + D() + I4(C1(), this.O, false, 0, Q);
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return this.O.intValue();
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public /* synthetic */ boolean H0() {
        return s24.a(this);
    }

    @Override // com.p7700g.p99005.m34
    public boolean I0() {
        return this.S;
    }

    @Override // com.p7700g.p99005.f24
    public void N(int i, int i2, boolean z, StringBuilder sb) {
        sb.append(H4(getValue(), i, z, i2));
    }

    @Override // com.p7700g.p99005.f24
    public void O(int i, boolean z, StringBuilder sb) {
        sb.append(H4(getValue(), i, z, 0));
    }

    @Override // com.p7700g.p99005.f24
    public int P(int i) {
        return f24.J(getValue(), this.O);
    }

    @Override // com.p7700g.p99005.l24
    public boolean P3() {
        return x1() && !z3();
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return f24.S(this.O.intValue(), this.P, this.M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        return 0;
     */
    @Override // com.p7700g.p99005.f24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int V(int i) {
        if (!z3()) {
            return 0;
        }
        BigInteger value = getValue();
        BigInteger C1 = C1();
        BigInteger valueOf = BigInteger.valueOf(i);
        BigInteger valueOf2 = BigInteger.valueOf(i - 1);
        int i2 = 1;
        while (true) {
            BigInteger[] divideAndRemainder = value.divideAndRemainder(valueOf);
            BigInteger bigInteger = divideAndRemainder[0];
            if (!divideAndRemainder[1].equals(BigInteger.ZERO)) {
                break;
            }
            BigInteger[] divideAndRemainder2 = C1.divideAndRemainder(valueOf);
            C1 = divideAndRemainder2[0];
            if (!divideAndRemainder2[1].equals(valueOf2)) {
                break;
            } else if (bigInteger.equals(C1)) {
                return i2;
            } else {
                i2++;
                value = bigInteger;
            }
        }
    }

    @Override // com.p7700g.p99005.l24
    public boolean V1() {
        return v1() && !z3();
    }

    @Override // com.p7700g.p99005.k34
    public int b(int i) {
        return f24.S(i, this.P, this.M);
    }

    @Override // com.p7700g.p99005.m34
    public boolean b1() {
        return this.R;
    }

    @Override // com.p7700g.p99005.k34
    public int c(int i) {
        if (!z3() && i == H()) {
            return k3().length();
        }
        return B4(C1(), i);
    }

    @Override // com.p7700g.p99005.k34
    public boolean d(int i) {
        return C1().compareTo(BigInteger.valueOf((long) i)) < 0;
    }

    @Override // com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x24) {
            x24 x24Var = (x24) obj;
            return A0() == x24Var.A0() && x24Var.x3(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.m34
    public Integer f() {
        return this.Q;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.m34
    public int g(int i, z44 z44Var, StringBuilder sb) {
        return super.g(i, z44Var, sb);
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger getValue() {
        return this.K;
    }

    @Override // com.p7700g.p99005.f24
    public int i(int i, int i2) {
        return p4(i, getValue(), i2);
    }

    @Override // com.p7700g.p99005.f24
    public void i3(String str, String str2, int i, boolean z, char c, boolean z2, String str3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        O(i, z, sb2);
        n3(i, z, sb3);
        int length = sb3.length() - sb2.length();
        if (length > 0) {
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    break;
                }
                sb4.append('0');
                length = i2;
            }
            sb4.append((CharSequence) sb2);
            sb2 = sb4;
        }
        char[] D4 = D4(i, z);
        char c2 = D4[0];
        int i3 = 1;
        char c3 = D4[i - 1];
        int length2 = sb2.length();
        int length3 = str3.length();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = true;
        while (i4 < length2) {
            int i5 = z2 ? (length2 - i4) - i3 : i4;
            char charAt = sb2.charAt(i5);
            char charAt2 = sb3.charAt(i5);
            if (i4 > 0) {
                sb.append(c);
            }
            if (charAt != charAt2) {
                boolean z5 = charAt == c2 && charAt2 == c3;
                if (z5) {
                    sb.append(str2);
                } else if (!z3) {
                    if (length3 > 0) {
                        sb.append(str3);
                    }
                    sb.append(charAt);
                    sb.append(str);
                    sb.append(charAt2);
                } else {
                    throw new t14(charAt, charAt2, "ipaddress.error.splitMismatch");
                }
                if (!z2) {
                    z3 = true;
                } else if (!z4) {
                    throw new t14(charAt, charAt2, "ipaddress.error.splitMismatch");
                } else {
                    z4 = z5;
                }
            } else if (!z3) {
                if (length3 > 0) {
                    sb.append(str3);
                }
                sb.append(charAt);
            } else {
                throw new t14(charAt, charAt2, "ipaddress.error.splitMismatch");
            }
            i4++;
            i3 = 1;
        }
    }

    @Override // com.p7700g.p99005.f24
    public int j3(String str, String str2, int i, int i2, boolean z, char c, boolean z2, String str3) {
        int i3;
        int length = str3.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        O(i2, z, sb);
        n3(i2, z, sb2);
        char[] D4 = D4(i2, z);
        char c2 = D4[0];
        char c3 = D4[i2 - 1];
        int i4 = -1;
        int i5 = 1;
        while (true) {
            if (i5 > sb2.length()) {
                break;
            }
            char charAt = i5 <= sb.length() ? sb.charAt(sb.length() - i5) : (char) 0;
            int length2 = sb2.length() - i5;
            char charAt2 = sb2.charAt(length2);
            if (!(charAt == c2 && charAt2 == c3)) {
                if (charAt == charAt2) {
                    i += length2 + 1;
                    break;
                }
                i3 = (length << 1) + 4;
            } else {
                i3 = str2.length() + 1;
            }
            i4 = i3 + i4;
            i5++;
        }
        return i > 0 ? i4 + ((length + 2) * i) : i4;
    }

    @Override // com.p7700g.p99005.f24
    public String k3() {
        String str = this.T;
        if (str == null) {
            synchronized (this) {
                str = this.T;
                if (str == null) {
                    if (!b1() && z3()) {
                        if (!H0() || (str = G()) == null) {
                            if (I0()) {
                                str = x4();
                            } else {
                                str = E();
                            }
                        }
                        this.T = str;
                    }
                    str = B();
                    this.T = str;
                }
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.f24
    public int n(int i, int i2) {
        return p4(i, C1(), i2);
    }

    @Override // com.p7700g.p99005.f24
    public void n3(int i, boolean z, StringBuilder sb) {
        sb.append(H4(C1(), i, z, 0));
    }

    @Override // com.p7700g.p99005.f24
    public void p(CharSequence charSequence, int i, StringBuilder sb) {
        if (i > 10 && !E4()) {
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

    @Override // com.p7700g.p99005.f24
    public int p3(int i) {
        return f24.J(C1(), this.O);
    }

    @Override // com.p7700g.p99005.f24
    public void t3(int i, boolean z, StringBuilder sb) {
        sb.append(H4(this.N, i, z, 0));
    }

    @Override // com.p7700g.p99005.l24
    public boolean v1() {
        return getValue().equals(BigInteger.ZERO);
    }

    @Override // com.p7700g.p99005.f24
    public String w3() {
        String str = this.B;
        if (str == null) {
            synchronized (this) {
                str = this.B;
                if (str == null) {
                    if (C0() && z3()) {
                        if (!H0() || (str = G()) == null) {
                            str = E();
                        }
                        this.B = str;
                    }
                    str = k3();
                    this.B = str;
                }
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.l24
    public boolean x1() {
        return C1().equals(this.M);
    }

    @Override // com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        return (f24Var instanceof x24) && super.x3(f24Var);
    }

    public String x4() {
        int Q = Q();
        return I4(getValue(), this.O, false, 0, Q) + D() + I4(this.N, this.O, false, 0, Q);
    }

    @Override // com.p7700g.p99005.f24
    public byte[] y(boolean z) {
        return q4((z ? getValue() : C1()).toByteArray(), (this.P + 7) / 8, "");
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean z3() {
        return !getValue().equals(C1());
    }

    public x24(byte[] bArr, int i, int i2, l14<?, ?, ?, ?, ?> l14Var, Integer num) throws c14 {
        if (num != null && num.intValue() < 0) {
            throw new y14(num.intValue());
        }
        BigInteger T = f24.T(i);
        this.M = T;
        this.P = i;
        this.O = BigInteger.valueOf(i2);
        if (num != null && num.intValue() < i) {
            byte[] w4 = w4(bArr, i);
            byte[] bArr2 = (byte[]) w4.clone();
            int intValue = i - num.intValue();
            int length = w4.length - ((intValue + 7) / 8);
            int i3 = ((-1) << (((intValue - 1) % 8) + 1)) & 255;
            if (l14Var.i().f()) {
                w4[length] = (byte) (w4[length] & i3);
                int i4 = length + 1;
                Arrays.fill(w4, i4, w4.length, (byte) 0);
                BigInteger bigInteger = new BigInteger(1, w4);
                this.K = bigInteger;
                this.N = bigInteger;
                bArr2[length] = (byte) ((~i3) | bArr2[length]);
                Arrays.fill(bArr2, i4, w4.length, (byte) -1);
                this.L = new BigInteger(1, bArr2);
                this.R = true;
                this.S = true;
            } else {
                byte[] bArr3 = (byte[]) bArr2.clone();
                bArr3[length] = (byte) (i3 & bArr3[length]);
                Arrays.fill(bArr3, length + 1, w4.length, (byte) 0);
                this.N = new BigInteger(1, bArr3);
                BigInteger bigInteger2 = new BigInteger(1, w4);
                this.K = bigInteger2;
                this.L = bigInteger2;
                this.R = false;
                this.S = false;
            }
        } else {
            if (num != null && num.intValue() > i) {
                num = Integer.valueOf(i);
            }
            boolean z = num != null;
            this.R = z;
            this.S = z;
            BigInteger bigInteger3 = new BigInteger(1, bArr);
            this.K = bigInteger3;
            this.L = bigInteger3;
            this.N = bigInteger3;
        }
        if (this.L.compareTo(T) <= 0) {
            this.Q = num;
            return;
        }
        throw new c14(this.L);
    }

    public x24(byte[] bArr, byte[] bArr2, int i, int i2, l14<?, ?, ?, ?, ?> l14Var, Integer num) throws c14 {
        Integer valueOf;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        if (num != null && num.intValue() < 0) {
            throw new y14(num.intValue());
        }
        byte[] w4 = w4(bArr, i);
        byte[] w42 = w4(bArr2, i);
        this.M = f24.T(i);
        this.P = i;
        this.O = BigInteger.valueOf(i2);
        if (num != null && num.intValue() < i) {
            int intValue = i - num.intValue();
            int i3 = (intValue + 7) / 8;
            int length = w4.length - i3;
            int i4 = ((-1) << (((intValue - 1) % 8) + 1)) & 255;
            int length2 = w42.length - i3;
            if (l14Var.i().f()) {
                byte[] bArr3 = w42;
                while (true) {
                    w4[length] = (byte) (w4[length] & i4);
                    Arrays.fill(w4, length + 1, w4.length, (byte) 0);
                    bigInteger5 = new BigInteger(1, w4);
                    bArr3[length2] = (byte) (bArr3[length2] | (~i4));
                    int i5 = length2 + 1;
                    Arrays.fill(bArr3, i5, bArr3.length, (byte) -1);
                    bigInteger6 = new BigInteger(1, bArr3);
                    byte[] bArr4 = (byte[]) bArr3.clone();
                    bArr4[length2] = (byte) (bArr4[length2] & i4);
                    Arrays.fill(bArr4, i5, bArr3.length, (byte) 0);
                    bigInteger7 = new BigInteger(1, bArr4);
                    if (bigInteger5.compareTo(bigInteger6) <= 0) {
                        break;
                    }
                    byte[] bArr5 = w4;
                    w4 = bArr3;
                    bArr3 = bArr5;
                }
                this.K = bigInteger5;
                this.L = bigInteger6;
                this.N = bigInteger7;
                this.S = true;
                this.R = G4(w4, bArr3, i, num, true, false);
            } else {
                if (Arrays.equals(w4, w42)) {
                    bigInteger4 = new BigInteger(1, w4);
                    this.R = false;
                    this.S = false;
                    bigInteger3 = bigInteger4;
                } else {
                    bigInteger3 = new BigInteger(1, w4);
                    BigInteger bigInteger8 = new BigInteger(1, w42);
                    if (G4(w4, w42, i, num, false, true)) {
                        this.S = true;
                        this.R = G4(w4, w42, i, num, true, false);
                    } else {
                        this.R = false;
                        this.S = false;
                    }
                    if (bigInteger3.compareTo(bigInteger8) > 0) {
                        bigInteger4 = bigInteger8;
                    } else {
                        bigInteger4 = bigInteger3;
                        bigInteger3 = bigInteger8;
                    }
                }
                this.K = bigInteger4;
                this.L = bigInteger3;
                byte[] bArr6 = (byte[]) w42.clone();
                bArr6[length] = (byte) (bArr6[length] & i4);
                Arrays.fill(bArr6, length + 1, w4.length, (byte) 0);
                this.N = new BigInteger(1, bArr6);
            }
            valueOf = num;
        } else {
            valueOf = (num == null || num.intValue() <= i) ? num : Integer.valueOf(i);
            if (Arrays.equals(w4, w42)) {
                bigInteger = new BigInteger(1, w4);
                this.R = valueOf != null;
                bigInteger2 = bigInteger;
            } else {
                bigInteger = new BigInteger(1, w4);
                bigInteger2 = new BigInteger(1, w42);
                if (bigInteger.compareTo(bigInteger2) > 0) {
                    bigInteger2 = bigInteger;
                    bigInteger = bigInteger2;
                }
                this.R = false;
            }
            this.S = valueOf != null;
            this.K = bigInteger;
            this.L = bigInteger2;
            this.N = bigInteger2;
        }
        if (this.L.compareTo(this.M) <= 0) {
            this.Q = valueOf;
            return;
        }
        throw new c14(this.L);
    }
}