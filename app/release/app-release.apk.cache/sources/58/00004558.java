package com.p7700g.p99005;

import com.p7700g.p99005.fw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataList.java */
/* loaded from: classes.dex */
public final class gw extends mw {

    /* compiled from: MetadataList.java */
    /* loaded from: classes.dex */
    public static final class a extends sv {
        public a f(int i, int i2, ByteBuffer byteBuffer) {
            b(i, i2, byteBuffer);
            return this;
        }

        public gw g(int i) {
            return h(new gw(), i);
        }

        public gw h(gw gwVar, int i) {
            return gwVar.v(mw.c(a(i), this.d), this.d);
        }
    }

    public static void A(zv zvVar, int i) {
        zvVar.k(0, i, 0);
    }

    public static int B(zv zvVar, int[] iArr) {
        zvVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            zvVar.n(iArr[length]);
        }
        return zvVar.E();
    }

    public static int C(zv zvVar, int i, int i2, int i3) {
        zvVar.g0(3);
        z(zvVar, i3);
        y(zvVar, i2);
        A(zvVar, i);
        return D(zvVar);
    }

    public static int D(zv zvVar) {
        return zvVar.D();
    }

    public static void E(zv zvVar, int i) {
        zvVar.F(i);
    }

    public static void F(zv zvVar, int i) {
        zvVar.J(i);
    }

    public static gw G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new gw());
    }

    public static gw H(ByteBuffer byteBuffer, gw gwVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return gwVar.v(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public static void Q(zv zvVar, int i) {
        zvVar.h0(4, i, 4);
    }

    public static void R(zv zvVar) {
        zvVar.g0(3);
    }

    public static void u() {
        xv.a();
    }

    public static void y(zv zvVar, int i) {
        zvVar.o(1, i, 0);
    }

    public static void z(zv zvVar, int i) {
        zvVar.o(2, i, 0);
    }

    public fw I(int i) {
        return J(new fw(), i);
    }

    public fw J(fw fwVar, int i) {
        int d = d(6);
        if (d != 0) {
            return fwVar.v(b((i * 4) + l(d)), this.b);
        }
        return null;
    }

    public int K() {
        int d = d(6);
        if (d != 0) {
            return o(d);
        }
        return 0;
    }

    public fw.a L() {
        return M(new fw.a());
    }

    public fw.a M(fw.a aVar) {
        int d = d(6);
        if (d != 0) {
            return aVar.f(l(d), 4, this.b);
        }
        return null;
    }

    public String N() {
        int d = d(8);
        if (d != 0) {
            return h(d + this.a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int d = d(4);
        if (d != 0) {
            return this.b.getInt(d + this.a);
        }
        return 0;
    }

    public gw v(int i, ByteBuffer byteBuffer) {
        w(i, byteBuffer);
        return this;
    }

    public void w(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
    }
}