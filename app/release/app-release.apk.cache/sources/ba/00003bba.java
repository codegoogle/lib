package com.p7700g.p99005;

import com.p7700g.p99005.aw;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.xbill.DNS.TTL;

/* compiled from: FlexBuffersBuilder.java */
/* loaded from: classes.dex */
public class bw {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 7;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    public static final /* synthetic */ boolean k = false;
    private final iw l;
    private final ArrayList<b> m;
    private final HashMap<String, Integer> n;
    private final HashMap<String, Integer> o;
    private final int p;
    private boolean q;
    private Comparator<b> r;

    /* compiled from: FlexBuffersBuilder.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            byte b;
            byte b2;
            int i = bVar.f;
            int i2 = bVar2.f;
            do {
                b = bw.this.l.get(i);
                b2 = bw.this.l.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    public bw(int i2) {
        this(new rv(i2), 1);
    }

    private void A(String str, long j2) {
        this.m.add(b.w(u(str), j2));
    }

    public static int E(long j2) {
        if (j2 <= aw.j.a((byte) -1)) {
            return 0;
        }
        if (j2 <= aw.j.c((short) -1)) {
            return 1;
        }
        return j2 <= aw.j.b(-1) ? 2 : 3;
    }

    private void F(b bVar, int i2) {
        int i3 = bVar.b;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                H(bVar.d, i2);
                return;
            } else if (i3 != 26) {
                J(bVar.e, i2);
                return;
            }
        }
        I(bVar.e, i2);
    }

    private b G(int i2, byte[] bArr, int i3, boolean z) {
        int E = E(bArr.length);
        I(bArr.length, b(E));
        int p = this.l.p();
        this.l.t(bArr, 0, bArr.length);
        if (z) {
            this.l.u((byte) 0);
        }
        return b.f(i2, p, i3, E);
    }

    private void H(double d2, int i2) {
        if (i2 == 4) {
            this.l.r((float) d2);
        } else if (i2 == 8) {
            this.l.f(d2);
        }
    }

    private void I(long j2, int i2) {
        if (i2 == 1) {
            this.l.u((byte) j2);
        } else if (i2 == 2) {
            this.l.g((short) j2);
        } else if (i2 == 4) {
            this.l.s((int) j2);
        } else if (i2 != 8) {
        } else {
            this.l.v(j2);
        }
    }

    private void J(long j2, int i2) {
        I((int) (this.l.p() - j2), i2);
    }

    private b K(int i2, String str) {
        return G(i2, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i2) {
        int i3 = 1 << i2;
        int q = b.q(this.l.p(), i3);
        while (true) {
            int i4 = q - 1;
            if (q == 0) {
                return i3;
            }
            this.l.u((byte) 0);
            q = i4;
        }
    }

    private b c(int i2, int i3) {
        long j2 = i3;
        int max = Math.max(0, E(j2));
        int i4 = i2;
        while (i4 < this.m.size()) {
            i4++;
            max = Math.max(max, b.i(4, 0, this.m.get(i4).f, this.l.p(), i4));
        }
        int b2 = b(max);
        I(j2, b2);
        int p = this.l.p();
        while (i2 < this.m.size()) {
            int i5 = this.m.get(i2).f;
            J(this.m.get(i2).f, b2);
            i2++;
        }
        return new b(-1, aw.q(4, 0), max, p);
    }

    private b d(int i2, int i3, int i4, boolean z, boolean z2, b bVar) {
        int i5;
        int i6;
        int i7 = i4;
        long j2 = i7;
        int max = Math.max(0, E(j2));
        if (bVar != null) {
            max = Math.max(max, bVar.h(this.l.p(), 0));
            i5 = 3;
        } else {
            i5 = 1;
        }
        int i8 = 4;
        int i9 = max;
        for (int i10 = i3; i10 < this.m.size(); i10++) {
            i9 = Math.max(i9, this.m.get(i10).h(this.l.p(), i10 + i5));
            if (z && i10 == i3) {
                i8 = this.m.get(i10).b;
                if (!aw.l(i8)) {
                    throw new aw.b("TypedVector does not support this element type");
                }
            }
        }
        int i11 = i3;
        int b2 = b(i9);
        if (bVar != null) {
            J(bVar.e, b2);
            I(1 << bVar.c, b2);
        }
        if (!z2) {
            I(j2, b2);
        }
        int p = this.l.p();
        for (int i12 = i11; i12 < this.m.size(); i12++) {
            F(this.m.get(i12), b2);
        }
        if (!z) {
            while (i11 < this.m.size()) {
                this.l.u(this.m.get(i11).s(i9));
                i11++;
            }
        }
        if (bVar != null) {
            i6 = 9;
        } else if (z) {
            if (!z2) {
                i7 = 0;
            }
            i6 = aw.q(i8, i7);
        } else {
            i6 = 10;
        }
        return new b(i2, i6, i9, p);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int p = this.l.p();
        if ((this.p & 1) != 0) {
            Integer num = this.n.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.l.t(bytes, 0, bytes.length);
                this.l.u((byte) 0);
                this.n.put(str, Integer.valueOf(p));
                return p;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.l.t(bytes2, 0, bytes2.length);
        this.l.u((byte) 0);
        this.n.put(str, Integer.valueOf(p));
        return p;
    }

    private void z(String str, long j2) {
        b w;
        int u = u(str);
        int E = E(j2);
        if (E == 0) {
            w = b.x(u, (int) j2);
        } else if (E == 1) {
            w = b.u(u, (int) j2);
        } else if (E == 2) {
            w = b.v(u, (int) j2);
        } else {
            w = b.w(u, j2);
        }
        this.m.add(w);
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.m.size();
    }

    public int D() {
        return this.m.size();
    }

    public int e(String str, int i2) {
        int u = u(str);
        ArrayList<b> arrayList = this.m;
        Collections.sort(arrayList.subList(i2, arrayList.size()), this.r);
        b d2 = d(u, i2, this.m.size() - i2, false, false, c(i2, this.m.size() - i2));
        while (this.m.size() > i2) {
            ArrayList<b> arrayList2 = this.m;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.m.add(d2);
        return (int) d2.e;
    }

    public int f(String str, int i2, boolean z, boolean z2) {
        b d2 = d(u(str), i2, this.m.size() - i2, z, z2, null);
        while (this.m.size() > i2) {
            ArrayList<b> arrayList = this.m;
            arrayList.remove(arrayList.size() - 1);
        }
        this.m.add(d2);
        return (int) d2.e;
    }

    public ByteBuffer g() {
        int b2 = b(this.m.get(0).h(this.l.p(), 0));
        F(this.m.get(0), b2);
        this.l.u(this.m.get(0).r());
        this.l.u((byte) b2);
        this.q = true;
        return ByteBuffer.wrap(this.l.i(), 0, this.l.p());
    }

    public iw h() {
        return this.l;
    }

    public int i(String str, byte[] bArr) {
        b G = G(u(str), bArr, 25, false);
        this.m.add(G);
        return (int) G.e;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z) {
        this.m.add(b.g(u(str), z));
    }

    public void l(boolean z) {
        k(null, z);
    }

    public void m(double d2) {
        o(null, d2);
    }

    public void n(float f2) {
        p(null, f2);
    }

    public void o(String str, double d2) {
        this.m.add(b.k(u(str), d2));
    }

    public void p(String str, float f2) {
        this.m.add(b.j(u(str), f2));
    }

    public void q(int i2) {
        s(null, i2);
    }

    public void r(long j2) {
        t(null, j2);
    }

    public void s(String str, int i2) {
        t(str, i2);
    }

    public void t(String str, long j2) {
        int u = u(str);
        if (-128 <= j2 && j2 <= 127) {
            this.m.add(b.o(u, (int) j2));
        } else if (-32768 <= j2 && j2 <= 32767) {
            this.m.add(b.l(u, (int) j2));
        } else if (-2147483648L <= j2 && j2 <= TTL.MAX_VALUE) {
            this.m.add(b.m(u, (int) j2));
        } else {
            this.m.add(b.n(u, j2));
        }
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        long j2;
        int u = u(str);
        if ((this.p & 2) != 0) {
            Integer num = this.o.get(str2);
            if (num == null) {
                b K = K(u, str2);
                this.o.put(str2, Integer.valueOf((int) K.e));
                this.m.add(K);
                j2 = K.e;
            } else {
                this.m.add(b.f(u, num.intValue(), 5, E(str2.length())));
                return num.intValue();
            }
        } else {
            b K2 = K(u, str2);
            this.m.add(K2);
            j2 = K2.e;
        }
        return (int) j2;
    }

    public void x(int i2) {
        z(null, i2);
    }

    public void y(long j2) {
        z(null, j2);
    }

    public bw() {
        this(256);
    }

    @Deprecated
    public bw(ByteBuffer byteBuffer, int i2) {
        this(new rv(byteBuffer.array()), i2);
    }

    public bw(iw iwVar, int i2) {
        this.m = new ArrayList<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.q = false;
        this.r = new a();
        this.l = iwVar;
        this.p = i2;
    }

    /* compiled from: FlexBuffersBuilder.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final /* synthetic */ boolean a = false;
        public final int b;
        public final int c;
        public final double d;
        public long e;
        public int f;

        public b(int i, int i2, int i3, long j) {
            this.f = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.d = Double.MIN_VALUE;
        }

        public static b f(int i, int i2, int i3, int i4) {
            return new b(i, i3, i4, i2);
        }

        public static b g(int i, boolean z) {
            return new b(i, 26, 0, z ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i, int i2) {
            return i(this.b, this.c, this.e, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i, int i2, long j, int i3, int i4) {
            if (aw.j(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int E = bw.E((int) (((i4 * i5) + (q(i3, i5) + i3)) - j));
                if ((1 << E) == i5) {
                    return E;
                }
            }
            return 3;
        }

        public static b j(int i, float f) {
            return new b(i, 3, 2, f);
        }

        public static b k(int i, double d) {
            return new b(i, 3, 3, d);
        }

        public static b l(int i, int i2) {
            return new b(i, 1, 1, i2);
        }

        public static b m(int i, int i2) {
            return new b(i, 1, 2, i2);
        }

        public static b n(int i, long j) {
            return new b(i, 1, 3, j);
        }

        public static b o(int i, int i2) {
            return new b(i, 1, 0, i2);
        }

        private static byte p(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte r() {
            return s(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s(int i) {
            return p(t(i), this.b);
        }

        private int t(int i) {
            if (aw.j(this.b)) {
                return Math.max(this.c, i);
            }
            return this.c;
        }

        public static b u(int i, int i2) {
            return new b(i, 2, 1, i2);
        }

        public static b v(int i, int i2) {
            return new b(i, 2, 2, i2);
        }

        public static b w(int i, long j) {
            return new b(i, 2, 3, j);
        }

        public static b x(int i, int i2) {
            return new b(i, 2, 0, i2);
        }

        public b(int i, int i2, int i3, double d) {
            this.f = i;
            this.b = i2;
            this.c = i3;
            this.d = d;
            this.e = Long.MIN_VALUE;
        }
    }

    public bw(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}