package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.util.Log;
import com.p7700g.p99005.up1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes2.dex */
public class zp1 implements up1 {
    private static final String f = "zp1";
    private static final int g = 4096;
    private static final int h = -1;
    private static final int i = -1;
    private static final int j = 4;
    private static final int k = 255;
    @w0
    private static final int l = 0;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    @z1
    private Boolean F;
    @x1
    private Bitmap.Config G;
    @w0
    private int[] m;
    @w0
    private final int[] n;
    private final up1.a o;
    private ByteBuffer p;
    private byte[] q;
    private xp1 r;
    private short[] s;
    private byte[] t;
    private byte[] u;
    private byte[] v;
    @w0
    private int[] w;
    private int x;
    private wp1 y;
    private Bitmap z;

    public zp1(@x1 up1.a aVar, wp1 wp1Var, ByteBuffer byteBuffer) {
        this(aVar, wp1Var, byteBuffer, 1);
    }

    @w0
    private int r(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.C + i2; i10++) {
            byte[] bArr = this.v;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.m[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.C + i12; i13++) {
            byte[] bArr2 = this.v;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.m[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    private void s(vp1 vp1Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.w;
        int i7 = vp1Var.h;
        int i8 = this.C;
        int i9 = i7 / i8;
        int i10 = vp1Var.f / i8;
        int i11 = vp1Var.g / i8;
        int i12 = vp1Var.e / i8;
        boolean z = this.x == 0;
        int i13 = this.E;
        int i14 = this.D;
        byte[] bArr = this.v;
        int[] iArr2 = this.m;
        Boolean bool = this.F;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i9) {
            Boolean bool2 = bool;
            if (vp1Var.i) {
                if (i17 >= i9) {
                    i2 = i9;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i17 + i15;
            } else {
                i2 = i9;
                i3 = i17;
                i17 = i16;
            }
            int i20 = i17 + i10;
            boolean z2 = i8 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i12;
                int i23 = i22 + i11;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i4 = i3;
                int i25 = i16 * i8 * vp1Var.g;
                if (z2) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i8;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i23 - i22) * i8) + i25;
                    int i30 = i22;
                    while (true) {
                        i5 = i11;
                        if (i30 < i23) {
                            int r = r(i25, i29, vp1Var.g);
                            if (r != 0) {
                                iArr[i30] = r;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i25 += i8;
                            i30++;
                            i11 = i5;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i17 = i4;
                }
            } else {
                i4 = i3;
            }
            i6 = i10;
            i5 = i11;
            bool = bool2;
            i16++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i17 = i4;
        }
        Boolean bool3 = bool;
        if (this.F == null) {
            this.F = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void t(vp1 vp1Var) {
        vp1 vp1Var2 = vp1Var;
        int[] iArr = this.w;
        int i2 = vp1Var2.h;
        int i3 = vp1Var2.f;
        int i4 = vp1Var2.g;
        int i5 = vp1Var2.e;
        boolean z = this.x == 0;
        int i6 = this.E;
        byte[] bArr = this.v;
        int[] iArr2 = this.m;
        int i7 = 0;
        byte b = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = vp1Var2.g * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b2 = bArr[i12];
                int i14 = i2;
                int i15 = b2 & 255;
                if (i15 != b) {
                    int i16 = iArr2[i15];
                    if (i16 != 0) {
                        iArr[i13] = i16;
                    } else {
                        b = b2;
                    }
                }
                i12++;
                i13++;
                i2 = i14;
            }
            i7++;
            vp1Var2 = vp1Var;
        }
        Boolean bool = this.F;
        this.F = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.F == null && z && b != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(vp1 vp1Var) {
        int i2;
        int i3;
        short s;
        zp1 zp1Var = this;
        if (vp1Var != null) {
            zp1Var.p.position(vp1Var.n);
        }
        if (vp1Var == null) {
            wp1 wp1Var = zp1Var.y;
            i2 = wp1Var.h;
            i3 = wp1Var.i;
        } else {
            i2 = vp1Var.g;
            i3 = vp1Var.h;
        }
        int i4 = i2 * i3;
        byte[] bArr = zp1Var.v;
        if (bArr == null || bArr.length < i4) {
            zp1Var.v = zp1Var.o.e(i4);
        }
        byte[] bArr2 = zp1Var.v;
        if (zp1Var.s == null) {
            zp1Var.s = new short[4096];
        }
        short[] sArr = zp1Var.s;
        if (zp1Var.t == null) {
            zp1Var.t = new byte[4096];
        }
        byte[] bArr3 = zp1Var.t;
        if (zp1Var.u == null) {
            zp1Var.u = new byte[dy.p];
        }
        byte[] bArr4 = zp1Var.u;
        int y = y();
        int i5 = 1 << y;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = y + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = zp1Var.q;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            if (i15 == 0) {
                i15 = x();
                if (i15 <= 0) {
                    zp1Var.B = 3;
                    break;
                }
                i16 = 0;
            }
            i18 += (bArr5[i16] & 255) << i17;
            i16++;
            i15--;
            int i23 = i17 + 8;
            int i24 = i13;
            int i25 = i12;
            int i26 = i20;
            int i27 = i8;
            int i28 = i21;
            while (true) {
                if (i23 < i25) {
                    i20 = i26;
                    i13 = i24;
                    i17 = i23;
                    zp1Var = this;
                    i21 = i28;
                    i8 = i27;
                    i12 = i25;
                    break;
                }
                int i29 = i7;
                int i30 = i18 & i14;
                i18 >>= i25;
                i23 -= i25;
                if (i30 == i5) {
                    i14 = i9;
                    i25 = i27;
                    i24 = i29;
                    i7 = i24;
                    i26 = -1;
                } else if (i30 == i6) {
                    i17 = i23;
                    i21 = i28;
                    i13 = i24;
                    i8 = i27;
                    i7 = i29;
                    i20 = i26;
                    i12 = i25;
                    zp1Var = this;
                    break;
                } else if (i26 == -1) {
                    bArr2[i19] = bArr3[i30];
                    i19++;
                    i10++;
                    i26 = i30;
                    i28 = i26;
                    i7 = i29;
                    i23 = i23;
                } else {
                    if (i30 >= i24) {
                        bArr4[i22] = (byte) i28;
                        i22++;
                        s = i26;
                    } else {
                        s = i30;
                    }
                    while (s >= i5) {
                        bArr4[i22] = bArr3[s];
                        i22++;
                        s = sArr[s];
                    }
                    i28 = bArr3[s] & 255;
                    byte b = (byte) i28;
                    bArr2[i19] = b;
                    while (true) {
                        i19++;
                        i10++;
                        if (i22 <= 0) {
                            break;
                        }
                        i22--;
                        bArr2[i19] = bArr4[i22];
                    }
                    byte[] bArr6 = bArr4;
                    if (i24 < 4096) {
                        sArr[i24] = (short) i26;
                        bArr3[i24] = b;
                        i24++;
                        if ((i24 & i14) == 0 && i24 < 4096) {
                            i25++;
                            i14 += i24;
                        }
                    }
                    i26 = i30;
                    i7 = i29;
                    i23 = i23;
                    bArr4 = bArr6;
                }
            }
        }
        Arrays.fill(bArr2, i19, i4, (byte) 0);
    }

    @x1
    private xp1 v() {
        if (this.r == null) {
            this.r = new xp1();
        }
        return this.r;
    }

    private Bitmap w() {
        Boolean bool = this.F;
        Bitmap a = this.o.a(this.E, this.D, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.G);
        a.setHasAlpha(true);
        return a;
    }

    private int x() {
        int y = y();
        if (y <= 0) {
            return y;
        }
        ByteBuffer byteBuffer = this.p;
        byteBuffer.get(this.q, 0, Math.min(y, byteBuffer.remaining()));
        return y;
    }

    private int y() {
        return this.p.get() & 255;
    }

    private Bitmap z(vp1 vp1Var, vp1 vp1Var2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.w;
        int i4 = 0;
        if (vp1Var2 == null) {
            Bitmap bitmap2 = this.z;
            if (bitmap2 != null) {
                this.o.c(bitmap2);
            }
            this.z = null;
            Arrays.fill(iArr, 0);
        }
        if (vp1Var2 != null && vp1Var2.k == 3 && this.z == null) {
            Arrays.fill(iArr, 0);
        }
        if (vp1Var2 != null && (i3 = vp1Var2.k) > 0) {
            if (i3 == 2) {
                if (!vp1Var.j) {
                    wp1 wp1Var = this.y;
                    int i5 = wp1Var.n;
                    if (vp1Var.o == null || wp1Var.l != vp1Var.l) {
                        i4 = i5;
                    }
                }
                int i6 = vp1Var2.h;
                int i7 = this.C;
                int i8 = i6 / i7;
                int i9 = vp1Var2.f / i7;
                int i10 = vp1Var2.g / i7;
                int i11 = vp1Var2.e / i7;
                int i12 = this.E;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.E;
                }
            } else if (i3 == 3 && (bitmap = this.z) != null) {
                int i17 = this.E;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.D);
            }
        }
        u(vp1Var);
        if (!vp1Var.i && this.C == 1) {
            t(vp1Var);
        } else {
            s(vp1Var);
        }
        if (this.A && ((i2 = vp1Var.k) == 0 || i2 == 1)) {
            if (this.z == null) {
                this.z = w();
            }
            Bitmap bitmap3 = this.z;
            int i18 = this.E;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.D);
        }
        Bitmap w = w();
        int i19 = this.E;
        w.setPixels(iArr, 0, i19, 0, 0, i19, this.D);
        return w;
    }

    @Override // com.p7700g.p99005.up1
    @z1
    public synchronized Bitmap a() {
        if (this.y.e <= 0 || this.x < 0) {
            if (Log.isLoggable(f, 3)) {
                int i2 = this.y.e;
            }
            this.B = 1;
        }
        int i3 = this.B;
        if (i3 != 1 && i3 != 2) {
            this.B = 0;
            if (this.q == null) {
                this.q = this.o.e(255);
            }
            vp1 vp1Var = this.y.g.get(this.x);
            int i4 = this.x - 1;
            vp1 vp1Var2 = i4 >= 0 ? this.y.g.get(i4) : null;
            int[] iArr = vp1Var.o;
            if (iArr == null) {
                iArr = this.y.c;
            }
            this.m = iArr;
            if (iArr == null) {
                Log.isLoggable(f, 3);
                this.B = 1;
                return null;
            }
            if (vp1Var.j) {
                System.arraycopy(iArr, 0, this.n, 0, iArr.length);
                int[] iArr2 = this.n;
                this.m = iArr2;
                iArr2[vp1Var.l] = 0;
                if (vp1Var.k == 2 && this.x == 0) {
                    this.F = Boolean.TRUE;
                }
            }
            return z(vp1Var, vp1Var2);
        }
        Log.isLoggable(f, 3);
        return null;
    }

    @Override // com.p7700g.p99005.up1
    public void b() {
        this.x = (this.x + 1) % this.y.e;
    }

    @Override // com.p7700g.p99005.up1
    public synchronized void c(@x1 wp1 wp1Var, @x1 byte[] bArr) {
        j(wp1Var, ByteBuffer.wrap(bArr));
    }

    @Override // com.p7700g.p99005.up1
    public void clear() {
        this.y = null;
        byte[] bArr = this.v;
        if (bArr != null) {
            this.o.d(bArr);
        }
        int[] iArr = this.w;
        if (iArr != null) {
            this.o.f(iArr);
        }
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            this.o.c(bitmap);
        }
        this.z = null;
        this.p = null;
        this.F = null;
        byte[] bArr2 = this.q;
        if (bArr2 != null) {
            this.o.d(bArr2);
        }
    }

    @Override // com.p7700g.p99005.up1
    public int d() {
        return this.y.e;
    }

    @Override // com.p7700g.p99005.up1
    public int e() {
        int i2;
        if (this.y.e <= 0 || (i2 = this.x) < 0) {
            return 0;
        }
        return g(i2);
    }

    @Override // com.p7700g.p99005.up1
    public void f(@x1 Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.G = config;
    }

    @Override // com.p7700g.p99005.up1
    public int g(int i2) {
        if (i2 >= 0) {
            wp1 wp1Var = this.y;
            if (i2 < wp1Var.e) {
                return wp1Var.g.get(i2).m;
            }
        }
        return -1;
    }

    @Override // com.p7700g.p99005.up1
    public int getHeight() {
        return this.y.i;
    }

    @Override // com.p7700g.p99005.up1
    public int getStatus() {
        return this.B;
    }

    @Override // com.p7700g.p99005.up1
    public int getWidth() {
        return this.y.h;
    }

    @Override // com.p7700g.p99005.up1
    @x1
    public ByteBuffer h() {
        return this.p;
    }

    @Override // com.p7700g.p99005.up1
    public void i() {
        this.x = -1;
    }

    @Override // com.p7700g.p99005.up1
    public synchronized void j(@x1 wp1 wp1Var, @x1 ByteBuffer byteBuffer) {
        l(wp1Var, byteBuffer, 1);
    }

    @Override // com.p7700g.p99005.up1
    public int k() {
        return this.x;
    }

    @Override // com.p7700g.p99005.up1
    public synchronized void l(@x1 wp1 wp1Var, @x1 ByteBuffer byteBuffer, int i2) {
        if (i2 > 0) {
            int highestOneBit = Integer.highestOneBit(i2);
            this.B = 0;
            this.y = wp1Var;
            this.x = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.p = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.p.order(ByteOrder.LITTLE_ENDIAN);
            this.A = false;
            Iterator<vp1> it = wp1Var.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().k == 3) {
                    this.A = true;
                    break;
                }
            }
            this.C = highestOneBit;
            int i3 = wp1Var.h;
            this.E = i3 / highestOneBit;
            int i4 = wp1Var.i;
            this.D = i4 / highestOneBit;
            this.v = this.o.e(i3 * i4);
            this.w = this.o.b(this.E * this.D);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
    }

    @Override // com.p7700g.p99005.up1
    public int m() {
        return this.y.o;
    }

    @Override // com.p7700g.p99005.up1
    public int n(@z1 InputStream inputStream, int i2) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2 > 0 ? i2 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.B = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.B;
    }

    @Override // com.p7700g.p99005.up1
    public int o() {
        return (this.w.length * 4) + this.p.limit() + this.v.length;
    }

    @Override // com.p7700g.p99005.up1
    public int p() {
        int i2 = this.y.o;
        if (i2 == -1) {
            return 1;
        }
        if (i2 == 0) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // com.p7700g.p99005.up1
    @Deprecated
    public int q() {
        int i2 = this.y.o;
        if (i2 == -1) {
            return 1;
        }
        return i2;
    }

    @Override // com.p7700g.p99005.up1
    public synchronized int read(@z1 byte[] bArr) {
        wp1 d = v().r(bArr).d();
        this.y = d;
        if (bArr != null) {
            c(d, bArr);
        }
        return this.B;
    }

    public zp1(@x1 up1.a aVar, wp1 wp1Var, ByteBuffer byteBuffer, int i2) {
        this(aVar);
        l(wp1Var, byteBuffer, i2);
    }

    public zp1(@x1 up1.a aVar) {
        this.n = new int[256];
        this.G = Bitmap.Config.ARGB_8888;
        this.o = aVar;
        this.y = new wp1();
    }
}