package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: FlatBufferBuilder.java */
/* loaded from: classes.dex */
public class zv {
    public static final /* synthetic */ boolean a = false;
    public ByteBuffer b;
    public int c;
    public int d;
    public int[] e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int[] j;
    public int k;
    public int l;
    public boolean m;
    public b n;
    public final ow o;

    /* compiled from: FlatBufferBuilder.java */
    /* loaded from: classes.dex */
    public static class a extends InputStream {
        public ByteBuffer s;

        public a(ByteBuffer byteBuffer) {
            this.s = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.s.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* compiled from: FlatBufferBuilder.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract ByteBuffer a(int i);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    /* compiled from: FlatBufferBuilder.java */
    /* loaded from: classes.dex */
    public static final class c extends b {
        public static final c a = new c();

        @Override // com.p7700g.p99005.zv.b
        public ByteBuffer a(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public zv(int i, b bVar) {
        this(i, bVar, null, ow.d());
    }

    @Deprecated
    private int C() {
        L();
        return this.c;
    }

    public static ByteBuffer N(ByteBuffer byteBuffer, b bVar) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer a2 = bVar.a(i);
            a2.position(a2.clear().capacity() - capacity);
            a2.put(byteBuffer);
            return a2;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean P(mw mwVar, int i) {
        return mwVar.d(i) != 0;
    }

    public int A(int[] iArr) {
        Q();
        h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n(iArr[length]);
        }
        return E();
    }

    public ByteBuffer B() {
        L();
        return this.b;
    }

    public int D() {
        int i;
        if (this.e != null && this.g) {
            j(0);
            int R = R();
            int i2 = this.f - 1;
            while (i2 >= 0 && this.e[i2] == 0) {
                i2--;
            }
            int i3 = i2 + 1;
            while (i2 >= 0) {
                int[] iArr = this.e;
                q((short) (iArr[i2] != 0 ? R - iArr[i2] : 0));
                i2--;
            }
            q((short) (R - this.i));
            q((short) ((i3 + 2) * 2));
            int i4 = 0;
            loop2: while (true) {
                if (i4 >= this.k) {
                    i = 0;
                    break;
                }
                int capacity = this.b.capacity() - this.j[i4];
                int i5 = this.c;
                short s = this.b.getShort(capacity);
                if (s == this.b.getShort(i5)) {
                    for (int i6 = 2; i6 < s; i6 += 2) {
                        if (this.b.getShort(capacity + i6) != this.b.getShort(i5 + i6)) {
                            break;
                        }
                    }
                    i = this.j[i4];
                    break loop2;
                }
                i4++;
            }
            if (i != 0) {
                int capacity2 = this.b.capacity() - R;
                this.c = capacity2;
                this.b.putInt(capacity2, i - R);
            } else {
                int i7 = this.k;
                int[] iArr2 = this.j;
                if (i7 == iArr2.length) {
                    this.j = Arrays.copyOf(iArr2, i7 * 2);
                }
                int[] iArr3 = this.j;
                int i8 = this.k;
                this.k = i8 + 1;
                iArr3[i8] = R();
                ByteBuffer byteBuffer = this.b;
                byteBuffer.putInt(byteBuffer.capacity() - R, R() - R);
            }
            this.g = false;
            return R;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public int E() {
        if (this.g) {
            this.g = false;
            Y(this.l);
            return R();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void F(int i) {
        I(i, false);
    }

    public void G(int i, String str) {
        H(i, str, false);
    }

    public void H(int i, String str, boolean z) {
        T(this.d, (z ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i2 = 3; i2 >= 0; i2--) {
                d((byte) str.charAt(i2));
            }
            I(i, z);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public void I(int i, boolean z) {
        T(this.d, (z ? 4 : 0) + 4);
        n(i);
        if (z) {
            j(this.b.capacity() - this.c);
        }
        this.b.position(this.c);
        this.h = true;
    }

    public void J(int i) {
        I(i, true);
    }

    public void K(int i, String str) {
        H(i, str, true);
    }

    public void L() {
        if (!this.h) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public zv M(boolean z) {
        this.m = z;
        return this;
    }

    public zv O(ByteBuffer byteBuffer, b bVar) {
        this.n = bVar;
        this.b = byteBuffer;
        byteBuffer.clear();
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        this.d = 1;
        this.c = this.b.capacity();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        return this;
    }

    public void Q() {
        if (this.g) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int R() {
        return this.b.capacity() - this.c;
    }

    public void S(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.b;
            int i3 = this.c - 1;
            this.c = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void T(int i, int i2) {
        if (i > this.d) {
            this.d = i;
        }
        int i3 = ((~((this.b.capacity() - this.c) + i2)) + 1) & (i - 1);
        while (this.c < i3 + i + i2) {
            int capacity = this.b.capacity();
            ByteBuffer byteBuffer = this.b;
            ByteBuffer N = N(byteBuffer, this.n);
            this.b = N;
            if (byteBuffer != N) {
                this.n.b(byteBuffer);
            }
            this.c = (this.b.capacity() - capacity) + this.c;
        }
        S(i3);
    }

    public void U(boolean z) {
        ByteBuffer byteBuffer = this.b;
        int i = this.c - 1;
        this.c = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void V(byte b2) {
        ByteBuffer byteBuffer = this.b;
        int i = this.c - 1;
        this.c = i;
        byteBuffer.put(i, b2);
    }

    public void W(double d) {
        ByteBuffer byteBuffer = this.b;
        int i = this.c - 8;
        this.c = i;
        byteBuffer.putDouble(i, d);
    }

    public void X(float f) {
        ByteBuffer byteBuffer = this.b;
        int i = this.c - 4;
        this.c = i;
        byteBuffer.putFloat(i, f);
    }

    public void Y(int i) {
        ByteBuffer byteBuffer = this.b;
        int i2 = this.c - 4;
        this.c = i2;
        byteBuffer.putInt(i2, i);
    }

    public void Z(long j) {
        ByteBuffer byteBuffer = this.b;
        int i = this.c - 8;
        this.c = i;
        byteBuffer.putLong(i, j);
    }

    public void a(int i) {
        if (i != R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void a0(short s) {
        ByteBuffer byteBuffer = this.b;
        int i = this.c - 2;
        this.c = i;
        byteBuffer.putShort(i, s);
    }

    public void b(int i, boolean z, boolean z2) {
        if (this.m || z != z2) {
            c(z);
            f0(i);
        }
    }

    public void b0(int i, int i2) {
        int capacity = this.b.capacity() - i;
        if (!(this.b.getShort((capacity - this.b.getInt(capacity)) + i2) != 0)) {
            throw new AssertionError(wo1.n("FlatBuffers: field ", i2, " must be set"));
        }
    }

    public void c(boolean z) {
        T(1, 0);
        U(z);
    }

    public byte[] c0() {
        return d0(this.c, this.b.capacity() - this.c);
    }

    public void d(byte b2) {
        T(1, 0);
        V(b2);
    }

    public byte[] d0(int i, int i2) {
        L();
        byte[] bArr = new byte[i2];
        this.b.position(i);
        this.b.get(bArr);
        return bArr;
    }

    public void e(int i, byte b2, int i2) {
        if (this.m || b2 != i2) {
            d(b2);
            f0(i);
        }
    }

    public InputStream e0() {
        L();
        ByteBuffer duplicate = this.b.duplicate();
        duplicate.position(this.c);
        duplicate.limit(this.b.capacity());
        return new a(duplicate);
    }

    public void f(double d) {
        T(8, 0);
        W(d);
    }

    public void f0(int i) {
        this.e[i] = R();
    }

    public void g(int i, double d, double d2) {
        if (this.m || d != d2) {
            f(d);
            f0(i);
        }
    }

    public void g0(int i) {
        Q();
        int[] iArr = this.e;
        if (iArr == null || iArr.length < i) {
            this.e = new int[i];
        }
        this.f = i;
        Arrays.fill(this.e, 0, i, 0);
        this.g = true;
        this.i = R();
    }

    public void h(float f) {
        T(4, 0);
        X(f);
    }

    public void h0(int i, int i2, int i3) {
        Q();
        this.l = i2;
        int i4 = i * i2;
        T(4, i4);
        T(i3, i4);
        this.g = true;
    }

    public void i(int i, float f, double d) {
        if (this.m || f != d) {
            h(f);
            f0(i);
        }
    }

    public void j(int i) {
        T(4, 0);
        Y(i);
    }

    public void k(int i, int i2, int i3) {
        if (this.m || i2 != i3) {
            j(i2);
            f0(i);
        }
    }

    public void l(int i, long j, long j2) {
        if (this.m || j != j2) {
            m(j);
            f0(i);
        }
    }

    public void m(long j) {
        T(8, 0);
        Z(j);
    }

    public void n(int i) {
        T(4, 0);
        Y((R() - i) + 4);
    }

    public void o(int i, int i2, int i3) {
        if (this.m || i2 != i3) {
            n(i2);
            f0(i);
        }
    }

    public void p(int i, short s, int i2) {
        if (this.m || s != i2) {
            q(s);
            f0(i);
        }
    }

    public void q(short s) {
        T(2, 0);
        a0(s);
    }

    public void r(int i, int i2, int i3) {
        if (i2 != i3) {
            a(i2);
            f0(i);
        }
    }

    public void s() {
        this.c = this.b.capacity();
        this.b.clear();
        this.d = 1;
        while (true) {
            int i = this.f;
            if (i <= 0) {
                this.f = 0;
                this.g = false;
                this.h = false;
                this.i = 0;
                this.k = 0;
                this.l = 0;
                return;
            }
            int[] iArr = this.e;
            int i2 = i - 1;
            this.f = i2;
            iArr[i2] = 0;
        }
    }

    public int t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.b;
        int i = this.c - remaining;
        this.c = i;
        byteBuffer2.position(i);
        this.b.put(byteBuffer);
        return E();
    }

    public int u(byte[] bArr) {
        int length = bArr.length;
        h0(1, length, 1);
        ByteBuffer byteBuffer = this.b;
        int i = this.c - length;
        this.c = i;
        byteBuffer.position(i);
        this.b.put(bArr);
        return E();
    }

    public int v(byte[] bArr, int i, int i2) {
        h0(1, i2, 1);
        ByteBuffer byteBuffer = this.b;
        int i3 = this.c - i2;
        this.c = i3;
        byteBuffer.position(i3);
        this.b.put(bArr, i, i2);
        return E();
    }

    public <T extends mw> int w(T t, int[] iArr) {
        t.t(iArr, this.b);
        return A(iArr);
    }

    public int x(CharSequence charSequence) {
        int c2 = this.o.c(charSequence);
        d((byte) 0);
        h0(1, c2, 1);
        ByteBuffer byteBuffer = this.b;
        int i = this.c - c2;
        this.c = i;
        byteBuffer.position(i);
        this.o.b(charSequence, this.b);
        return E();
    }

    public int y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        d((byte) 0);
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.b;
        int i = this.c - remaining;
        this.c = i;
        byteBuffer2.position(i);
        this.b.put(byteBuffer);
        return E();
    }

    public ByteBuffer z(int i, int i2, int i3) {
        int i4 = i * i2;
        h0(i, i2, i3);
        ByteBuffer byteBuffer = this.b;
        int i5 = this.c - i4;
        this.c = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.b.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public zv(int i, b bVar, ByteBuffer byteBuffer, ow owVar) {
        this.d = 1;
        this.e = null;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.j = new int[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        i = i <= 0 ? 1 : i;
        this.n = bVar;
        if (byteBuffer != null) {
            this.b = byteBuffer;
            byteBuffer.clear();
            this.b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.b = bVar.a(i);
        }
        this.o = owVar;
        this.c = this.b.capacity();
    }

    public zv(int i) {
        this(i, c.a, null, ow.d());
    }

    public zv() {
        this(1024);
    }

    public zv(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, ow.d());
    }

    public zv(ByteBuffer byteBuffer) {
        this(byteBuffer, new c());
    }
}