package com.p7700g.p99005;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes2.dex */
public class xp1 {
    private static final String a = "GifHeaderParser";
    private static final int b = 255;
    private static final int c = 44;
    private static final int d = 33;
    private static final int e = 59;
    private static final int f = 249;
    private static final int g = 255;
    private static final int h = 254;
    private static final int i = 1;
    private static final int j = 28;
    private static final int k = 2;
    private static final int l = 1;
    private static final int m = 128;
    private static final int n = 64;
    private static final int o = 7;
    private static final int p = 128;
    private static final int q = 7;
    public static final int r = 2;
    public static final int s = 10;
    private static final int t = 256;
    private ByteBuffer v;
    private wp1 w;
    private final byte[] u = new byte[256];
    private int x = 0;

    private boolean b() {
        return this.w.d != 0;
    }

    private int e() {
        try {
            return this.v.get() & 255;
        } catch (Exception unused) {
            this.w.d = 1;
            return 0;
        }
    }

    private void f() {
        this.w.f.e = o();
        this.w.f.f = o();
        this.w.f.g = o();
        this.w.f.h = o();
        int e2 = e();
        boolean z = (e2 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (e2 & 7) + 1);
        vp1 vp1Var = this.w.f;
        vp1Var.i = (e2 & 64) != 0;
        if (z) {
            vp1Var.o = h(pow);
        } else {
            vp1Var.o = null;
        }
        this.w.f.n = this.v.position();
        t();
        if (b()) {
            return;
        }
        wp1 wp1Var = this.w;
        wp1Var.e++;
        wp1Var.g.add(wp1Var.f);
    }

    private void g() {
        int e2 = e();
        this.x = e2;
        if (e2 <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.x;
                if (i2 >= i3) {
                    return;
                }
                int i4 = i3 - i2;
                this.v.get(this.u, i2, i4);
                i2 += i4;
            } catch (Exception unused) {
                Log.isLoggable(a, 3);
                this.w.d = 1;
                return;
            }
        }
    }

    @z1
    private int[] h(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.v.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | sr.t | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable(a, 3);
            this.w.d = 1;
        }
        return iArr;
    }

    private void i() {
        j(Integer.MAX_VALUE);
    }

    private void j(int i2) {
        boolean z = false;
        while (!z && !b() && this.w.e <= i2) {
            int e2 = e();
            if (e2 == 33) {
                int e3 = e();
                if (e3 == 1) {
                    s();
                } else if (e3 == 249) {
                    this.w.f = new vp1();
                    k();
                } else if (e3 == 254) {
                    s();
                } else if (e3 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 11; i3++) {
                        sb.append((char) this.u[i3]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (e2 == 44) {
                wp1 wp1Var = this.w;
                if (wp1Var.f == null) {
                    wp1Var.f = new vp1();
                }
                f();
            } else if (e2 != 59) {
                this.w.d = 1;
            } else {
                z = true;
            }
        }
    }

    private void k() {
        e();
        int e2 = e();
        vp1 vp1Var = this.w.f;
        int i2 = (e2 & 28) >> 2;
        vp1Var.k = i2;
        if (i2 == 0) {
            vp1Var.k = 1;
        }
        vp1Var.j = (e2 & 1) != 0;
        int o2 = o();
        if (o2 < 2) {
            o2 = 10;
        }
        vp1 vp1Var2 = this.w.f;
        vp1Var2.m = o2 * 10;
        vp1Var2.l = e();
        e();
    }

    private void l() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) e());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.w.d = 1;
            return;
        }
        m();
        if (!this.w.j || b()) {
            return;
        }
        wp1 wp1Var = this.w;
        wp1Var.c = h(wp1Var.k);
        wp1 wp1Var2 = this.w;
        wp1Var2.n = wp1Var2.c[wp1Var2.l];
    }

    private void m() {
        this.w.h = o();
        this.w.i = o();
        int e2 = e();
        wp1 wp1Var = this.w;
        wp1Var.j = (e2 & 128) != 0;
        wp1Var.k = (int) Math.pow(2.0d, (e2 & 7) + 1);
        this.w.l = e();
        this.w.m = e();
    }

    private void n() {
        do {
            g();
            byte[] bArr = this.u;
            if (bArr[0] == 1) {
                this.w.o = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.x <= 0) {
                return;
            }
        } while (!b());
    }

    private int o() {
        return this.v.getShort();
    }

    private void p() {
        this.v = null;
        Arrays.fill(this.u, (byte) 0);
        this.w = new wp1();
        this.x = 0;
    }

    private void s() {
        int e2;
        do {
            e2 = e();
            this.v.position(Math.min(this.v.position() + e2, this.v.limit()));
        } while (e2 > 0);
    }

    private void t() {
        e();
        s();
    }

    public void a() {
        this.v = null;
        this.w = null;
    }

    public boolean c() {
        l();
        if (!b()) {
            j(2);
        }
        return this.w.e > 1;
    }

    @x1
    public wp1 d() {
        if (this.v != null) {
            if (b()) {
                return this.w;
            }
            l();
            if (!b()) {
                i();
                wp1 wp1Var = this.w;
                if (wp1Var.e < 0) {
                    wp1Var.d = 1;
                }
            }
            return this.w;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public xp1 q(@x1 ByteBuffer byteBuffer) {
        p();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.v = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.v.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public xp1 r(@z1 byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
        } else {
            this.v = null;
            this.w.d = 2;
        }
        return this;
    }
}