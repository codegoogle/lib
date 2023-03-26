package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataItem.java */
/* loaded from: classes.dex */
public final class fw extends mw {

    /* compiled from: MetadataItem.java */
    /* loaded from: classes.dex */
    public static final class a extends sv {
        public a f(int i, int i2, ByteBuffer byteBuffer) {
            b(i, i2, byteBuffer);
            return this;
        }

        public fw g(int i) {
            return h(new fw(), i);
        }

        public fw h(fw fwVar, int i) {
            return fwVar.v(mw.c(a(i), this.d), this.d);
        }
    }

    public static void A(zv zvVar, boolean z) {
        zvVar.b(1, z, false);
    }

    public static void B(zv zvVar, short s) {
        zvVar.p(5, s, 0);
    }

    public static void C(zv zvVar, int i) {
        zvVar.k(0, i, 0);
    }

    public static void D(zv zvVar, short s) {
        zvVar.p(2, s, 0);
    }

    public static void E(zv zvVar, short s) {
        zvVar.p(4, s, 0);
    }

    public static int M(zv zvVar, int[] iArr) {
        zvVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            zvVar.j(iArr[length]);
        }
        return zvVar.E();
    }

    public static int N(zv zvVar, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        zvVar.g0(7);
        y(zvVar, i2);
        C(zvVar, i);
        B(zvVar, s4);
        E(zvVar, s3);
        z(zvVar, s2);
        D(zvVar, s);
        A(zvVar, z);
        return P(zvVar);
    }

    public static int P(zv zvVar) {
        return zvVar.D();
    }

    public static fw Q(ByteBuffer byteBuffer) {
        return R(byteBuffer, new fw());
    }

    public static fw R(ByteBuffer byteBuffer, fw fwVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fwVar.v(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public static void V(zv zvVar, int i) {
        zvVar.h0(4, i, 4);
    }

    public static void W(zv zvVar) {
        zvVar.g0(7);
    }

    public static void u() {
        xv.a();
    }

    public static void y(zv zvVar, int i) {
        zvVar.o(6, i, 0);
    }

    public static void z(zv zvVar, short s) {
        zvVar.p(3, s, 0);
    }

    public int F(int i) {
        int d = d(16);
        if (d != 0) {
            return this.b.getInt((i * 4) + l(d));
        }
        return 0;
    }

    public ByteBuffer G() {
        return m(16, 4);
    }

    public ByteBuffer H(ByteBuffer byteBuffer) {
        return n(byteBuffer, 16, 4);
    }

    public int I() {
        int d = d(16);
        if (d != 0) {
            return o(d);
        }
        return 0;
    }

    public dw J() {
        return K(new dw());
    }

    public dw K(dw dwVar) {
        int d = d(16);
        if (d != 0) {
            return dwVar.f(l(d), this.b);
        }
        return null;
    }

    public short L() {
        int d = d(10);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public boolean O() {
        int d = d(6);
        return (d == 0 || this.b.get(d + this.a) == 0) ? false : true;
    }

    public short S() {
        int d = d(14);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public int T() {
        int d = d(4);
        if (d != 0) {
            return this.b.getInt(d + this.a);
        }
        return 0;
    }

    public short U() {
        int d = d(8);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public short X() {
        int d = d(12);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public fw v(int i, ByteBuffer byteBuffer) {
        w(i, byteBuffer);
        return this;
    }

    public void w(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
    }
}