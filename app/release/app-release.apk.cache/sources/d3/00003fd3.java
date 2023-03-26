package com.p7700g.p99005;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p7700g.p99005.s04;
import com.p7700g.p99005.w64;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.xbill.DNS.TTL;

/* compiled from: AddressDivision.java */
/* loaded from: classes3.dex */
public abstract class e34 extends f24 {
    private static final long F = 4;

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public class a implements Iterator<S> {
        public boolean s;
        public final /* synthetic */ x04 t;

        public a(x04 x04Var) {
            this.t = x04Var;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TS; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public x04 next() {
            if (hasNext()) {
                this.s = true;
                return this.t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public class b implements Iterator<S> {
        public final /* synthetic */ x04 A;
        public boolean s;
        public final /* synthetic */ boolean t;
        public final /* synthetic */ s04.a u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;
        public final /* synthetic */ Integer z;

        public b(boolean z, s04.a aVar, int i, int i2, int i3, int i4, Integer num, x04 x04Var) {
            this.t = z;
            this.u = aVar;
            this.v = i;
            this.w = i2;
            this.x = i3;
            this.y = i4;
            this.z = num;
            this.A = x04Var;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TS; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public x04 next() {
            if (hasNext()) {
                this.s = true;
                if (this.t) {
                    return this.u.c(this.v & this.w, this.x | this.y, this.z);
                }
                return this.A;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public class c implements Iterator<S> {
        public final /* synthetic */ Integer A;
        private boolean s = true;
        private int t;
        private int u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ s04.a y;
        public final /* synthetic */ int z;

        public c(int i, int i2, int i3, s04.a aVar, int i4, Integer num) {
            this.v = i;
            this.w = i2;
            this.x = i3;
            this.y = aVar;
            this.z = i4;
            this.A = num;
            this.t = i;
            this.u = i2;
            this.t = i >>> i3;
            this.u = i2 >>> i3;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TS; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public x04 next() {
            if (this.s) {
                int i = this.t;
                int i2 = i << this.x;
                x04 c = this.y.c(i2, this.z | i2, this.A);
                int i3 = i + 1;
                if (i3 > this.u) {
                    this.s = false;
                } else {
                    this.t = i3;
                }
                return c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public class d implements Iterator<S> {
        public final /* synthetic */ s04.a A;
        public final /* synthetic */ Integer B;
        private boolean s = true;
        private boolean t;
        private int u;
        private int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        public d(int i, int i2, int i3, int i4, s04.a aVar, Integer num) {
            this.w = i;
            this.x = i2;
            this.y = i3;
            this.z = i4;
            this.A = aVar;
            this.B = num;
            this.u = i;
            this.v = i2;
            this.u = i >>> i3;
            this.v = i2 >>> i3;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TS; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public x04 next() {
            if (this.s) {
                int i = this.u;
                int i2 = i << this.y;
                int i3 = this.z | i2;
                int i4 = i + 1;
                this.u = i4;
                if (!this.t) {
                    i2 = this.w;
                    this.t = true;
                }
                if (!(i4 <= this.v)) {
                    i3 = this.x;
                    this.s = false;
                }
                return this.A.c(i2, i3, this.B);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public class e implements Iterator<S> {
        private boolean s = true;
        private int t;
        private int u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ s04.a x;
        public final /* synthetic */ Integer y;

        public e(int i, int i2, s04.a aVar, Integer num) {
            this.v = i;
            this.w = i2;
            this.x = aVar;
            this.y = num;
            this.t = i;
            this.u = i2;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TS; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public x04 next() {
            if (this.s) {
                x04 e = this.x.e(this.t, this.y);
                int i = this.t + 1;
                this.t = i;
                this.s = i <= this.u;
                return e;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public static class f {
        private final long a;
        private final long b;
        private final long c;
        private final w64.c d;

        public f(long j, long j2, long j3, w64.c cVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = cVar;
        }

        public long a() {
            return this.d.a(this.a, this.c);
        }

        public long b() {
            return this.d.b(this.b, this.c);
        }

        public boolean c() {
            return this.d.M0();
        }
    }

    /* compiled from: AddressDivision.java */
    /* loaded from: classes3.dex */
    public static class g {
        private final long a;
        private final long b;
        private final long c;
        private final w64.j d;

        public g(long j, long j2, long j3, w64.j jVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = jVar;
        }

        public long a() {
            return this.d.a(this.a, this.c);
        }

        public long b() {
            return this.d.b(this.b, this.c);
        }

        public boolean c() {
            return this.d.M0();
        }
    }

    private String B4(int i) {
        StringBuilder sb = new StringBuilder(20);
        x0(n04.w, 0, 0, "", i, false, false, sb);
        return sb.toString();
    }

    private static int D4(int i, long j, long j2, long j3) {
        int i2 = 1;
        int i3 = i;
        while (true) {
            long j4 = i3;
            if (j % j4 != 0) {
                return 0;
            }
            long j5 = j3 / j4 == j2 / j4 ? j3 % j4 : i3 - 1;
            long j6 = j2 % j4;
            if (j6 != j5) {
                return 0;
            }
            if (j2 - j6 == j) {
                return i2;
            }
            i2++;
            i3 *= i;
        }
    }

    public static <S extends x04> int J4(S s, int i) {
        int A0 = s.A0() - i;
        return ((s.h3() >>> A0) - (s.B1() >>> A0)) + 1;
    }

    public static <S extends x04> Iterator<S> N4(S s) {
        return new a(s);
    }

    public static <S extends x04> boolean R4(S s) {
        return s.B1() <= 1 && s.h3() >= s.g1() - 1;
    }

    public static <S extends x04> Iterator<S> T4(S s, int i, int i2, int i3, s04.a<S> aVar, Integer num, boolean z, boolean z2) {
        int i4;
        int i5;
        int i6;
        if (z) {
            int intValue = i3 - num.intValue();
            int i7 = (-1) << intValue;
            i4 = intValue;
            i5 = i7;
            i6 = ~i7;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (s == null || s.z3()) {
            if (z) {
                if (z2) {
                    return new c(i, i2, i4, aVar, i6, num);
                }
                return new d(i, i2, i4, i6, aVar, num);
            }
            return new e(i, i2, aVar, num);
        }
        return new b(z2, aVar, i, i5, i2, i6, num, s);
    }

    public static BigInteger U(BigInteger bigInteger, int i) {
        return f24.U(bigInteger, i);
    }

    public static <S extends x04> Iterator<S> U4(S s, s04.a<S> aVar, Integer num, boolean z, boolean z2) {
        return T4(s, s.B1(), s.h3(), s.A0(), aVar, num, z, z2);
    }

    public static g V4(long j, long j2, long j3) {
        return new g(j, j2, j3, w64.E5(j, j2, j3));
    }

    public static w64.j W4(long j, long j2, long j3, long j4) {
        return w64.F5(j, j2, j3, j4);
    }

    public static int a5(byte b2) {
        int i = ((b2 & 85) << 1) | ((b2 & 170) >>> 1);
        int i2 = ((i & 51) << 2) | ((i & 204) >>> 2);
        return ((i2 << 4) | (i2 >>> 4)) & 255;
    }

    public static int b5(int i) {
        int i2 = ((i & 1431655765) << 1) | (((-1431655766) & i) >>> 1);
        int i3 = ((i2 & 858993459) << 2) | (((-858993460) & i2) >>> 2);
        int i4 = ((i3 & 252645135) << 4) | (((-252645136) & i3) >>> 4);
        int i5 = ((i4 & 16711935) << 8) | (((-16711936) & i4) >>> 8);
        return (i5 << 16) | (i5 >>> 16);
    }

    public static int c5(short s) {
        int i = ((s & 21845) << 1) | ((43690 & s) >>> 1);
        int i2 = ((i & 13107) << 2) | ((52428 & i) >>> 2);
        int i3 = ((i2 & 3855) << 4) | ((61680 & i2) >>> 4);
        return ((i3 << 8) | (i3 >>> 8)) & 65535;
    }

    public static <S extends x04> S d5(S s, Integer num, Integer num2, boolean z, s04.a<S> aVar) {
        int B1;
        int h3;
        int intValue;
        int i;
        if (Objects.equals(num, num2)) {
            return s;
        }
        if (z) {
            int A0 = s.A0();
            if (num == null) {
                intValue = num2.intValue();
            } else if (num2 == null) {
                intValue = num.intValue();
            } else {
                if (num.intValue() > num2.intValue()) {
                    i = (~((-1) << (A0 - num.intValue()))) | ((-1) << (A0 - num2.intValue()));
                } else {
                    i = ((-1) << (A0 - num.intValue())) | (~((-1) << (A0 - num2.intValue())));
                }
                B1 = s.B1() & i;
                h3 = s.h3() & i;
            }
            i = (-1) << (A0 - intValue);
            B1 = s.B1() & i;
            h3 = s.h3() & i;
        } else {
            B1 = s.B1();
            h3 = s.h3();
        }
        return aVar.c(B1, h3, num2);
    }

    public static boolean e5(long j, long j2, long j3, long j4, long j5) {
        return j == (j4 & j) && j3 == (j2 | j5);
    }

    public static String f5(long j, int i) {
        int i2;
        int i3;
        if (j == 0) {
            return "0";
        }
        if (j == 1) {
            return "1";
        }
        int i4 = 2;
        if (i == 10) {
            if (j < 10) {
                return String.valueOf(f24.x, (int) j, 1);
            }
            if (j < 100) {
                i3 = (int) j;
            } else if (j >= 1000) {
                return Long.toString(j, i);
            } else {
                i3 = (int) j;
                i4 = 3;
            }
            char[] cArr = new char[i4];
            char[] cArr2 = f24.x;
            while (true) {
                int i5 = (52429 * i3) >>> 19;
                i4--;
                cArr[i4] = cArr2[i3 - ((i5 << 3) + (i5 << 1))];
                if (i5 == 0) {
                    return new String(cArr);
                }
                i3 = i5;
            }
        } else if (i != 16) {
            return Long.toString(j, i);
        } else {
            if (j < 16) {
                return String.valueOf(f24.x, (int) j, 1);
            }
            if (j < 256) {
                i2 = (int) j;
            } else if (j < PlaybackStateCompat.E) {
                i2 = (int) j;
                i4 = 3;
            } else if (j >= PlaybackStateCompat.I) {
                return Long.toString(j, i);
            } else {
                if (j == av5.s) {
                    return "ffff";
                }
                i2 = (int) j;
                i4 = 4;
            }
            char[] cArr3 = new char[i4];
            char[] cArr4 = f24.x;
            while (true) {
                int i6 = i2 >>> 4;
                i4--;
                cArr3[i4] = cArr4[i2 - (i6 << 4)];
                if (i6 == 0) {
                    return new String(cArr3);
                }
                i2 = i6;
            }
        }
    }

    private static void g5(long j, int i, int i2, boolean z, char c2, boolean z2, String str, StringBuilder sb) {
        int length = sb.length();
        q4(j, i, i2, z, c2, str, sb);
        if (z2) {
            return;
        }
        int length2 = str.length();
        int i3 = length + length2;
        for (int length3 = sb.length() - 1; i3 < length3; length3 = (length3 - 2) - length2) {
            char charAt = sb.charAt(i3);
            sb.setCharAt(i3, sb.charAt(length3));
            sb.setCharAt(length3, charAt);
            i3 = i3 + 2 + length2;
        }
    }

    private static void h5(long j, long j2, String str, String str2, int i, boolean z, char c2, boolean z2, String str3, StringBuilder sb) {
        int length = sb.length();
        w4(j, j2, str, str2, i, z, c2, z2, str3, sb);
        if (z2) {
            return;
        }
        for (int length2 = sb.length() - 1; length < length2; length2--) {
            char charAt = sb.charAt(length);
            sb.setCharAt(length, sb.charAt(length2));
            sb.setCharAt(length2, charAt);
            length++;
        }
    }

    private static int i5(long j, long j2, String str, String str2, int i, int i2, boolean z, char c2, boolean z2, String str3) {
        int length = str3.length();
        int i3 = -1;
        do {
            long j3 = i2;
            i3 = (((int) (j % j3)) == 0 && ((int) (j2 % j3)) == i2 + (-1) ? str2.length() + 1 : (length << 1) + 4) + i3;
            j2 /= j3;
            j /= j3;
        } while (j2 != j);
        int e4 = (j2 != 0 ? f24.e4(j2, i2) : 0) + i;
        return e4 > 0 ? i3 + ((length + 2) * e4) : i3;
    }

    private int p4(int i, long j, int i2) {
        if (i < 0) {
            return Math.max(0, b(i2) - f24.I(j, i2));
        }
        return i;
    }

    private static void q4(long j, int i, int i2, boolean z, char c2, String str, StringBuilder sb) {
        char[] cArr;
        int i3;
        boolean z2;
        int i4;
        long j2 = j;
        boolean z3 = j2 <= TTL.MAX_VALUE;
        int i5 = z3 ? (int) j2 : i;
        char[] cArr2 = z ? f24.y : f24.x;
        int length = str.length();
        int i6 = i5;
        boolean z4 = z3;
        int i7 = i2;
        while (i6 >= i) {
            if (z4) {
                int i8 = i6 / i;
                if (i7 > 0) {
                    i7--;
                    i6 = i8;
                } else {
                    cArr = cArr2;
                    i4 = i6 % i;
                    i6 = i8;
                }
            } else {
                long j3 = i;
                boolean z5 = z4;
                cArr = cArr2;
                long j4 = j2 / j3;
                if (j4 <= TTL.MAX_VALUE) {
                    i3 = (int) j4;
                    z2 = true;
                } else {
                    i3 = i6;
                    z2 = z5;
                }
                if (i7 > 0) {
                    i7--;
                    j2 = j4;
                    z4 = z2;
                    i6 = i3;
                    cArr2 = cArr;
                } else {
                    i4 = (int) (j2 % j3);
                    j2 = j4;
                    z4 = z2;
                    i6 = i3;
                }
            }
            if (length > 0) {
                sb.append(str);
            }
            sb.append(cArr[i4]);
            sb.append(c2);
            cArr2 = cArr;
        }
        char[] cArr3 = cArr2;
        if (i7 == 0) {
            if (length > 0) {
                sb.append(str);
            }
            sb.append(cArr3[i6]);
        }
    }

    private static void w4(long j, long j2, String str, String str2, int i, boolean z, char c2, boolean z2, String str3, StringBuilder sb) {
        long j3;
        int i2;
        int i3;
        int i4;
        long j4;
        long j5;
        boolean z3;
        long j6;
        int i5;
        long j7;
        int i6;
        int i7;
        long j8 = j2;
        char[] cArr = z ? f24.y : f24.x;
        long j9 = TTL.MAX_VALUE;
        boolean z4 = j8 <= TTL.MAX_VALUE;
        if (z4) {
            i3 = (int) j8;
            j3 = j;
            i2 = (int) j3;
        } else {
            j3 = j;
            i2 = i;
            i3 = i2;
        }
        int length = str3.length();
        boolean z5 = true;
        while (true) {
            if (z4) {
                int i8 = i3 % i;
                i5 = i3 / i;
                if (i3 == i2) {
                    i6 = i8;
                    i2 = i5;
                } else {
                    i6 = i2 % i;
                    i2 /= i;
                }
                j6 = j8;
                z3 = z4;
                j7 = j3;
                i7 = i8;
                j5 = j9;
            } else {
                boolean z6 = z4;
                long j10 = i;
                int i9 = (int) (j8 % j10);
                long j11 = j8 / j10;
                if (j8 == j3) {
                    i4 = i9;
                    j4 = j11;
                } else {
                    i4 = (int) (j3 % j10);
                    j4 = j3 / j10;
                }
                j5 = TTL.MAX_VALUE;
                if (j11 <= TTL.MAX_VALUE) {
                    i2 = (int) j4;
                    i5 = (int) j11;
                    i6 = i4;
                    j6 = j11;
                    j7 = j4;
                    z3 = true;
                } else {
                    z3 = z6;
                    j6 = j11;
                    i5 = i3;
                    j7 = j4;
                    i6 = i4;
                }
                i7 = i9;
            }
            if (i6 == i7) {
                if (z2) {
                    if (length > 0) {
                        sb.append(str3);
                    }
                    sb.append(cArr[i6]);
                } else {
                    sb.append(cArr[i6]);
                    for (int i10 = length - 1; i10 >= 0; i10--) {
                        sb.append(str3.charAt(i10));
                    }
                }
                z5 = false;
            } else if (!z5) {
                throw new t14(j7, j6, "ipaddress.error.splitMismatch");
            } else {
                boolean z7 = i6 == 0 && i7 == i + (-1);
                if (!z7 || str2 == null) {
                    if (z2) {
                        if (length > 0) {
                            sb.append(str3);
                        }
                        sb.append(cArr[i6]);
                        sb.append(str);
                        sb.append(cArr[i7]);
                    } else {
                        sb.append(cArr[i7]);
                        sb.append(str);
                        sb.append(cArr[i6]);
                        for (int i11 = length - 1; i11 >= 0; i11--) {
                            sb.append(str3.charAt(i11));
                        }
                    }
                } else if (z2) {
                    sb.append(str2);
                } else {
                    for (int length2 = str2.length() - 1; length2 >= 0; length2--) {
                        sb.append(str2.charAt(length2));
                    }
                }
                z5 = z7;
            }
            if (i5 == 0) {
                return;
            }
            sb.append(c2);
            j9 = j5;
            i3 = i5;
            j3 = j7;
            z4 = z3;
            j8 = j6;
        }
    }

    public static f x4(long j, long j2, long j3) {
        return new f(j, j2, j3, w64.I4(j, j2, j3));
    }

    public static w64.c y4(long j, long j2, long j3, long j4) {
        return w64.J4(j, j2, j3, j4);
    }

    @Override // com.p7700g.p99005.f24
    public String B() {
        return f5(G4(), H());
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger C1() {
        return BigInteger.valueOf(L4());
    }

    @Override // com.p7700g.p99005.f24
    public String D() {
        return n04.w;
    }

    @Override // com.p7700g.p99005.f24
    public void D1(int i, int i2, boolean z, char c2, boolean z2, String str, StringBuilder sb) {
        g5(G4(), i, i2, z, c2, z2, str, sb);
    }

    @Override // com.p7700g.p99005.f24
    public String E() {
        return E4(G4(), L4(), H());
    }

    public String E4(long j, long j2, int i) {
        int i2;
        int i3;
        int i4 = 2;
        if (i == 10) {
            if (j2 < 10) {
                i3 = 1;
            } else if (j2 < 100) {
                i3 = 2;
            } else if (j2 >= 1000) {
                return B4(i);
            } else {
                i3 = 3;
            }
            int i5 = (int) j2;
            if (j < 10) {
                i4 = 1;
            } else if (j >= 100) {
                if (j >= 1000) {
                    return B4(i);
                }
                i4 = 3;
            }
            int i6 = (int) j;
            int i7 = i4 + 1 + i3;
            char[] cArr = new char[i7];
            cArr[i4] = '-';
            char[] cArr2 = f24.x;
            while (true) {
                int i8 = (i6 * 52429) >>> 19;
                i4--;
                cArr[i4] = cArr2[i6 - ((i8 << 3) + (i8 << 1))];
                if (i8 == 0) {
                    break;
                }
                i6 = i8;
            }
            while (true) {
                int i9 = (i5 * 52429) >>> 19;
                i7--;
                cArr[i7] = cArr2[i5 - ((i9 << 3) + (i9 << 1))];
                if (i9 == 0) {
                    return new String(cArr);
                }
                i5 = i9;
            }
        } else if (i == 16) {
            if (j2 < 16) {
                i2 = 1;
            } else if (j2 < 256) {
                i2 = 2;
            } else if (j2 < PlaybackStateCompat.E) {
                i2 = 3;
            } else if (j2 >= PlaybackStateCompat.I) {
                return B4(i);
            } else {
                i2 = 4;
            }
            int i10 = (int) j2;
            if (j < 16) {
                i4 = 1;
            } else if (j >= 256) {
                if (j < PlaybackStateCompat.E) {
                    i4 = 3;
                } else if (j >= PlaybackStateCompat.I) {
                    return B4(i);
                } else {
                    i4 = 4;
                }
            }
            int i11 = (int) j;
            int i12 = i4 + 1 + i2;
            char[] cArr3 = new char[i12];
            cArr3[i4] = '-';
            char[] cArr4 = f24.x;
            while (true) {
                int i13 = i11 >>> 4;
                i4--;
                cArr3[i4] = cArr4[i11 - (i13 << 4)];
                if (i13 == 0) {
                    break;
                }
                i11 = i13;
            }
            while (true) {
                int i14 = i10 >>> 4;
                i12--;
                cArr3[i12] = cArr4[i10 - (i14 << 4)];
                if (i14 == 0) {
                    return new String(cArr3);
                }
                i10 = i14;
            }
        } else {
            return B4(i);
        }
    }

    public long F4(int i) {
        if (i >= 0) {
            int A0 = A0();
            if (A0 <= i) {
                return H4();
            }
            int i2 = A0 - i;
            return ((L4() >>> i2) - (G4() >>> i2)) + 1;
        }
        throw new y14(this, i);
    }

    public abstract long G4();

    public long H4() {
        return (L4() - G4()) + 1;
    }

    public long I4() {
        return ~((-1) << A0());
    }

    public int K4() {
        return D4(H(), G4(), L4(), I4());
    }

    public abstract long L4();

    public boolean M4(int i, boolean z) {
        int i2;
        long j;
        boolean z2;
        if (i > 1) {
            if (i <= 10) {
                return false;
            }
            if (i != 16) {
                z2 = ((i + (-1)) & i) == 0;
                if (z2) {
                    i2 = Integer.numberOfTrailingZeros(i);
                    j = ~((-1) << i2);
                } else {
                    j = 0;
                    i2 = 0;
                }
            } else {
                i2 = 4;
                j = 15;
                z2 = true;
            }
            long G4 = G4();
            boolean z3 = false;
            while (true) {
                if (G4 > 0) {
                    if ((z2 ? j & G4 : G4 % i) >= 10) {
                        return true;
                    }
                    G4 = z2 ? G4 >>> i2 : G4 / i;
                } else if (z3 || z) {
                    break;
                } else {
                    G4 = L4();
                    z3 = true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.f24
    public void N(int i, int i2, boolean z, StringBuilder sb) {
        f24.N3(G4(), i, i2, z, z ? f24.y : f24.x, sb);
    }

    @Override // com.p7700g.p99005.f24
    public void O(int i, boolean z, StringBuilder sb) {
        f24.N3(G4(), i, 0, z, z ? f24.y : f24.x, sb);
    }

    public boolean O4(int i) {
        if (z3()) {
            return y4(G4(), L4(), (long) i, I4()) != null;
        }
        return true;
    }

    @Override // com.p7700g.p99005.f24
    public int P(int i) {
        return f24.e4(G4(), i);
    }

    @Override // com.p7700g.p99005.l24
    public boolean P3() {
        return !z3() && x1();
    }

    public boolean P4(int i) {
        return W4(G4(), L4(), i, I4()).M0();
    }

    public boolean Q4(long j, long j2, int i) {
        if (i == 0) {
            return j == 0 && j2 == I4();
        }
        long j3 = ~((-1) << A0());
        long A0 = (-1) << (A0() - i);
        return e5(j, j2, j2, A0 & j3, ~A0);
    }

    public boolean S4(long j, long j2, int i) {
        long j3 = ~((-1) << A0());
        long A0 = (-1) << (A0() - i);
        return e5(j, j, j2, A0 & j3, ~A0);
    }

    @Override // com.p7700g.p99005.f24
    public int V(int i) {
        if (z3()) {
            if (i == H()) {
                return K4();
            }
            return D4(i, G4(), L4(), I4());
        }
        return 0;
    }

    @Override // com.p7700g.p99005.l24
    public boolean V1() {
        return !z3() && v1();
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public Integer X3() {
        int b3 = b3();
        long G4 = G4();
        long L4 = L4();
        int A0 = A0();
        if (b3 == A0) {
            if (G4 == L4) {
                return f34.b(b3);
            }
            return null;
        }
        int i = A0 - b3;
        if ((G4 >>> i) == (L4 >>> i)) {
            return f34.b(b3);
        }
        return null;
    }

    public boolean X4(long j) {
        return !z3() && j == G4();
    }

    public boolean Y4(long j, long j2) {
        return (!z3() || (((-1) >>> Long.numberOfLeadingZeros(G4() ^ L4())) & j2) == 0) && j == (j2 & G4());
    }

    public boolean Z4(long j, long j2, long j3) {
        if (j == j2) {
            return Y4(j, j3);
        }
        if (z3()) {
            long G4 = G4();
            long L4 = L4();
            w64.j W4 = W4(G4, L4, j3, I4());
            return W4.M0() && j == W4.a(G4, j3) && j2 == W4.b(L4, j3);
        }
        return false;
    }

    @Override // com.p7700g.p99005.k34
    public int b(int i) {
        if (i == H()) {
            return Q();
        }
        return f24.R(i, A0(), I4());
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public int b3() {
        int numberOfTrailingZeros;
        int A0 = A0();
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(G4());
        return (numberOfTrailingZeros2 == 0 || (numberOfTrailingZeros = Long.numberOfTrailingZeros(~L4())) == 0) ? A0 : A0 - Math.min(numberOfTrailingZeros2, numberOfTrailingZeros);
    }

    @Override // com.p7700g.p99005.k34
    public int c(int i) {
        if (!z3() && i == H()) {
            return w3().length();
        }
        return f24.I(L4(), i);
    }

    @Override // com.p7700g.p99005.k34
    public boolean d(int i) {
        return L4() < ((long) i);
    }

    @Override // com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e34) {
            e34 e34Var = (e34) obj;
            return A0() == e34Var.A0() && e34Var.x3(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public BigInteger getCount() {
        return BigInteger.valueOf(H4());
    }

    @Override // com.p7700g.p99005.l24
    public BigInteger getValue() {
        return BigInteger.valueOf(G4());
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public BigInteger h1(int i) {
        return BigInteger.valueOf(F4(i));
    }

    @Override // com.p7700g.p99005.f24
    public int hashCode() {
        int i = this.E;
        if (i == 0) {
            int t = f24.t(G4(), L4());
            this.E = t;
            return t;
        }
        return i;
    }

    @Override // com.p7700g.p99005.f24
    public int i(int i, int i2) {
        return p4(i, G4(), i2);
    }

    @Override // com.p7700g.p99005.f24
    public void i3(String str, String str2, int i, boolean z, char c2, boolean z2, String str3, StringBuilder sb) {
        h5(G4(), L4(), str, str2, i, z, c2, z2, str3, sb);
    }

    @Override // com.p7700g.p99005.f24
    public int j3(String str, String str2, int i, int i2, boolean z, char c2, boolean z2, String str3) {
        return i5(G4(), L4(), str, str2, i, i2, z, c2, z2, str3);
    }

    @Override // com.p7700g.p99005.f24
    public int n(int i, int i2) {
        return p4(i, L4(), i2);
    }

    @Override // com.p7700g.p99005.f24
    public void n3(int i, boolean z, StringBuilder sb) {
        f24.N3(L4(), i, 0, z, z ? f24.y : f24.x, sb);
    }

    @Override // com.p7700g.p99005.f24
    public int p3(int i) {
        return f24.e4(L4(), i);
    }

    @Override // com.p7700g.p99005.f24
    public void t3(int i, boolean z, StringBuilder sb) {
        n3(i, z, sb);
    }

    @Override // com.p7700g.p99005.l24
    public boolean v1() {
        return G4() == 0;
    }

    @Override // com.p7700g.p99005.f24
    public String w3() {
        return super.w3();
    }

    @Override // com.p7700g.p99005.l24
    public boolean x1() {
        return L4() == I4();
    }

    @Override // com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        if (f24Var instanceof e34) {
            e34 e34Var = (e34) f24Var;
            return G4() == e34Var.G4() && L4() == e34Var.L4();
        }
        return false;
    }

    @Override // com.p7700g.p99005.f24
    public byte[] y(boolean z) {
        int A0 = A0();
        int i = (A0 + 7) >> 3;
        byte[] bArr = new byte[i];
        int i2 = i - 1;
        long G4 = z ? G4() : L4();
        while (true) {
            bArr[i2] = (byte) (bArr[i2] | (G4 << 0));
            G4 >>= 8;
            if (A0 <= 8) {
                return bArr;
            }
            A0 -= 8;
            i2--;
        }
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean z3() {
        return G4() != L4();
    }
}