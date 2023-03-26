package com.p7700g.p99005;

import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: AddressParseData.java */
/* loaded from: classes3.dex */
public class k64 implements Serializable {
    public static final int A = 4194304;
    public static final int B = 8388608;
    private static final int C = 255;
    private static final int D = 65280;
    private static final int E = 8;
    public static final int F = 0;
    public static final int G = 0;
    public static final int H = 0;
    public static final int I = 8;
    public static final int J = 2;
    public static final int K = 4;
    public static final int L = 10;
    public static final int M = 12;
    public static final int N = 1;
    public static final int O = 6;
    public static final int P = 7;
    public static final int Q = 9;
    public static final int R = 14;
    public static final int S = 15;
    private static final int T = 16;
    private static final int U = 4;
    private static final int V = 64;
    private static final int W = 128;
    private static final long s = 4;
    private static final int t = 8;
    public static final int u = 65536;
    public static final int v = 131072;
    public static final int w = 262144;
    public static final int x = 524288;
    public static final int y = 1048576;
    public static final int z = 2097152;
    public final CharSequence A0;
    private int[] X;
    private int Y;
    private boolean Z;
    private boolean u0;
    private boolean v0;
    private boolean w0;
    private int x0 = -1;
    private int y0 = -1;
    private int z0;

    public k64(CharSequence charSequence) {
        this.A0 = charSequence;
    }

    private static void d1(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, int i17, long j2) {
        iArr[i | i2] = i3;
        iArr[i | i4] = i5;
        iArr[i | i6] = i7;
        iArr[i | i8] = i9;
        iArr[i | i10] = i11;
        iArr[i | i12] = i13;
        iArr[i | i14] = i15;
        int i18 = i | i16;
        iArr[i18] = (int) (j >>> 32);
        iArr[i18 | 1] = (int) (j & (-1));
        int i19 = i | i17;
        iArr[i19] = (int) (j2 >>> 32);
        iArr[i19 | 1] = (int) (j2 & (-1));
    }

    public static int o(int i, int i2, int[] iArr) {
        return iArr[(i << 4) | i2];
    }

    public static long y(int i, int i2, int[] iArr) {
        int i3 = (i << 4) | i2;
        return (iArr[i3 | 1] & 4294967295L) | (iArr[i3] << 32);
    }

    public boolean A(int i, int i2, int i3) {
        return m(i, i2 | i3);
    }

    public boolean B(int i) {
        return A(i, 131072, 1048576);
    }

    public boolean D() {
        return this.Z;
    }

    public void D1() {
        this.w0 = true;
    }

    public void E() {
        this.Y++;
    }

    public void G(int i) {
        int i2 = 16;
        if (i == 4) {
            i2 = 64;
        } else if (i == 8) {
            i2 = 128;
        } else if (i != 1) {
            i2 = i * 16;
        }
        this.X = new int[i2];
    }

    public boolean H() {
        return this.v0;
    }

    public boolean I(int i) {
        return m(i, 4194304);
    }

    public boolean J(int i) {
        return m(i, 8388608);
    }

    public boolean L() {
        return this.w0;
    }

    public boolean M(int i) {
        return m(i, 65536);
    }

    public void N() {
        this.X = null;
    }

    public void O(int i) {
        this.z0 = i;
    }

    public void P() {
        this.v0 = true;
    }

    public void Q(int i, int i2) {
        int[] t2 = t();
        int i3 = (i << 4) | 0;
        t2[i3] = ((i2 << 8) & 65280) | t2[i3];
    }

    public void R(int i) {
        this.x0 = i;
    }

    public void S(int i) {
        this.y0 = i;
    }

    public void T(boolean z2) {
        this.u0 = z2;
    }

    public void U() {
        this.Z = true;
    }

    public void V(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14 = i << 4;
        int[] t2 = t();
        t2[i2 | i14] = i3;
        t2[i14 | i4] = i5;
        t2[i14 | i6] = i7;
        t2[i14 | i8] = i9;
        t2[i14 | i10] = i11;
        t2[i14 | i12] = i13;
    }

    public int V0() {
        return this.Y;
    }

    public void X(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i << 4;
        int[] t2 = t();
        t2[i16 | i2] = i3;
        t2[i16 | i4] = i5;
        t2[i16 | i6] = i7;
        t2[i16 | i8] = i9;
        t2[i16 | i10] = i11;
        t2[i16 | i12] = i13;
        t2[i16 | i14] = i15;
    }

    public void X0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, int i17, long j2) {
        d1(i << 4, t(), i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, j, i17, j2);
    }

    public void X2(int i, int i2, long j) {
        int i3 = (i << 4) | i2;
        int i4 = (int) (j & (-1));
        int[] t2 = t();
        t2[i3] = (int) (j >>> 32);
        t2[i3 | 1] = i4;
    }

    public void Z(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i << 4;
        int[] t2 = t();
        t2[i18 | i2] = i3;
        t2[i18 | i4] = i5;
        t2[i18 | i6] = i7;
        t2[i18 | i8] = i9;
        t2[i18 | i10] = i11;
        t2[i18 | i12] = i13;
        t2[i18 | i14] = i15;
        t2[i18 | i16] = i17;
    }

    public void c1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, int i17, long j2, int i18, long j3, int i19, long j4) {
        int i20 = i << 4;
        int[] t2 = t();
        d1(i20, t2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, j, i17, j2);
        int i21 = i20 | i18;
        t2[i21] = (int) (j3 >>> 32);
        t2[i21 | 1] = (int) (j3 & (-1));
        int i22 = i20 | i19;
        t2[i22] = (int) (j4 >>> 32);
        t2[i22 | 1] = (int) (j4 & (-1));
    }

    public void d3(int i, int i2) {
        int i3 = (i << 4) | 0;
        int[] t2 = t();
        t2[i3] = (~i2) & t2[i3];
    }

    public int f() {
        return this.z0;
    }

    public int g(int i) {
        return (t()[(i << 4) | 0] & 65280) >>> 8;
    }

    public int h() {
        return this.x0;
    }

    public int i() {
        return this.y0;
    }

    public boolean m(int i, int i2) {
        return (t()[(i << 4) | 0] & i2) != 0;
    }

    public int n(int i, int i2) {
        return o(i, i2, t());
    }

    public int p(int i, int i2) {
        int i3 = t()[(i << 4) | i2] & 255;
        if (i3 == 0) {
            return 16;
        }
        return i3;
    }

    public boolean r3() {
        return this.u0;
    }

    public int[] t() {
        return this.X;
    }

    public String toString() {
        char c;
        BigInteger bigInteger;
        int i;
        char c2;
        StringBuilder sb = new StringBuilder();
        CharSequence u2 = u();
        sb.append("address string: ");
        sb.append(u2);
        char c3 = '\n';
        sb.append('\n');
        int f = f();
        if (f > 0 && f < u2.length()) {
            sb.append("address end: ");
            sb.append(u2.subSequence(f, u2.length()));
            sb.append('\n');
        }
        int V0 = V0();
        sb.append("segment count: ");
        sb.append(V0);
        sb.append('\n');
        if (V0 > 0) {
            int i2 = 0;
            while (i2 < V0) {
                sb.append("segment ");
                sb.append(i2);
                sb.append(":\n");
                if (M(i2)) {
                    sb.append("\tis wildcard");
                    sb.append(c3);
                    i = V0;
                } else {
                    long x2 = x(i2, 2);
                    long x3 = x(i2, c3);
                    long x4 = x(i2, 12);
                    long x5 = x(i2, 4);
                    if (x5 != 0) {
                        bigInteger = BigInteger.valueOf(x5).shiftLeft(64).or(BigInteger.valueOf(x2));
                        sb.append("\tvalue: ");
                        sb.append(bigInteger);
                        c = '\n';
                        sb.append('\n');
                        sb.append("\tvalue in hex: ");
                        sb.append(bigInteger.toString(16));
                        sb.append('\n');
                    } else {
                        c = '\n';
                        sb.append("\tvalue: ");
                        sb.append(x2);
                        sb.append('\n');
                        sb.append("\tvalue in hex: ");
                        sb.append(Long.toHexString(x2));
                        sb.append('\n');
                        bigInteger = null;
                    }
                    sb.append("\tstring: ");
                    sb.append(u2.subSequence(n(i2, 6), n(i2, 7)));
                    sb.append(c);
                    sb.append("\tradix: ");
                    sb.append(p(i2, 0));
                    sb.append(c);
                    sb.append("\tis standard: ");
                    sb.append(m(i2, 262144));
                    sb.append(c);
                    i = V0;
                    if (x4 != 0) {
                        BigInteger or = BigInteger.valueOf(x4).shiftLeft(64).or(BigInteger.valueOf(x3));
                        if (or.equals(bigInteger)) {
                            c2 = '\n';
                        } else {
                            sb.append("\tupper value: ");
                            sb.append(or);
                            c2 = '\n';
                            sb.append('\n');
                            sb.append("\tupper value in hex: ");
                            sb.append(or.toString(16));
                            sb.append('\n');
                            sb.append("\tupper string: ");
                            sb.append(u2.subSequence(n(i2, 14), n(i2, 15)));
                            sb.append('\n');
                            sb.append("\tupper radix: ");
                            sb.append(p(i2, 8));
                            sb.append('\n');
                            sb.append("\tis standard range: ");
                            sb.append(m(i2, 524288));
                            sb.append('\n');
                        }
                    } else {
                        c2 = '\n';
                        if (x3 != x2) {
                            sb.append("\tupper value: ");
                            sb.append(x3);
                            sb.append('\n');
                            sb.append("\tupper value in hex: ");
                            sb.append(Long.toHexString(x3));
                            sb.append('\n');
                            sb.append("\tupper string: ");
                            sb.append(u2.subSequence(n(i2, 14), n(i2, 15)));
                            sb.append('\n');
                            sb.append("\tupper radix: ");
                            sb.append(p(i2, 8));
                            sb.append('\n');
                            sb.append("\tis standard range: ");
                            sb.append(m(i2, 524288));
                            sb.append('\n');
                        }
                    }
                    if (m(i2, 131072)) {
                        sb.append("\thas single wildcard: ");
                        sb.append(c2);
                    }
                }
                i2++;
                V0 = i;
                c3 = '\n';
            }
            sb.append("has a wildcard segment: ");
            sb.append(D());
            sb.append('\n');
            int h = h();
            if (h >= 0) {
                sb.append("has compressed segment(s) at character ");
                sb.append(h + 1);
                sb.append('\n');
            }
            if (L()) {
                sb.append("is single segment");
                sb.append('\n');
            }
        } else if (r3()) {
            sb.append("is empty");
            sb.append('\n');
        } else if (H()) {
            sb.append("is all addresses");
            sb.append('\n');
        }
        return sb.toString();
    }

    public CharSequence u() {
        return this.A0;
    }

    public void w0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j, int i19, long j2) {
        int i20 = i << 4;
        int[] t2 = t();
        d1(i20, t2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i18, j, i19, j2);
        t2[i20 | i16] = i17;
    }

    public long x(int i, int i2) {
        return y(i, i2, t());
    }

    public void x0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j, int i19, long j2, int i20, long j3, int i21, long j4) {
        int i22 = i << 4;
        int[] t2 = t();
        d1(i22, t2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i18, j, i19, j2);
        t2[i22 | i16] = i17;
        int i23 = i22 | i20;
        t2[i23] = (int) (j3 >>> 32);
        t2[i23 | 1] = (int) (j3 & (-1));
        int i24 = i22 | i21;
        t2[i24] = (int) (j4 >>> 32);
        t2[i24 | 1] = (int) (j4 & (-1));
    }
}