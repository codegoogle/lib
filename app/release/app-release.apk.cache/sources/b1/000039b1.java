package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* compiled from: FlexBuffers.java */
/* loaded from: classes.dex */
public class aw {
    public static final int A = 26;
    public static final int B = 36;
    private static final hw C = new rv(new byte[]{0}, 1);
    public static final /* synthetic */ boolean D = false;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    public static final int t = 19;
    public static final int u = 20;
    public static final int v = 21;
    public static final int w = 22;
    public static final int x = 23;
    public static final int y = 24;
    public static final int z = 25;

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class a extends h {
        public static final a e = new a(aw.C, 1, 1);
        public static final /* synthetic */ boolean f = false;

        public a(hw hwVar, int i, int i2) {
            super(hwVar, i, i2);
        }

        public static a d() {
            return e;
        }

        @Override // com.p7700g.p99005.aw.f
        public StringBuilder a(StringBuilder sb) {
            sb.append(h95.b);
            sb.append(this.a.j(this.b, b()));
            sb.append(h95.b);
            return sb;
        }

        @Override // com.p7700g.p99005.aw.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.a.i());
            wrap.position(this.b);
            wrap.limit(b() + this.b);
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i) {
            return this.a.get(this.b + i);
        }

        public byte[] f() {
            int b = b();
            byte[] bArr = new byte[b];
            for (int i = 0; i < b; i++) {
                bArr[i] = this.a.get(this.b + i);
            }
            return bArr;
        }

        @Override // com.p7700g.p99005.aw.f
        public String toString() {
            return this.a.j(this.b, b());
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class c extends f {
        private static final c d = new c(aw.C, 0, 0);

        public c(hw hwVar, int i, int i2) {
            super(hwVar, i, i2);
        }

        public static c d() {
            return d;
        }

        @Override // com.p7700g.p99005.aw.f
        public StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public int c(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.b;
            int i2 = 0;
            do {
                b = this.a.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.b == this.b && cVar.c == this.c;
            }
            return false;
        }

        public int hashCode() {
            return this.b ^ this.c;
        }

        @Override // com.p7700g.p99005.aw.f
        public String toString() {
            int i = this.b;
            while (this.a.get(i) != 0) {
                i++;
            }
            int i2 = this.b;
            return this.a.j(i2, i - i2);
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class d {
        private final i a;

        public d(i iVar) {
            this.a = iVar;
        }

        public c a(int i) {
            if (i >= b()) {
                return c.d;
            }
            i iVar = this.a;
            int i2 = (i * iVar.c) + iVar.b;
            i iVar2 = this.a;
            hw hwVar = iVar2.a;
            return new c(hwVar, aw.i(hwVar, i2, iVar2.c), 1);
        }

        public int b() {
            return this.a.b();
        }

        public String toString() {
            StringBuilder F = wo1.F(f14.u);
            for (int i = 0; i < this.a.b(); i++) {
                this.a.d(i).z(F);
                if (i != this.a.b() - 1) {
                    F.append(", ");
                }
            }
            F.append("]");
            return F.toString();
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class e extends k {
        private static final e f = new e(aw.C, 1, 1);

        public e(hw hwVar, int i, int i2) {
            super(hwVar, i, i2);
        }

        private int f(d dVar, byte[] bArr) {
            int b = dVar.b() - 1;
            int i = 0;
            while (i <= b) {
                int i2 = (i + b) >>> 1;
                int c = dVar.a(i2).c(bArr);
                if (c < 0) {
                    i = i2 + 1;
                } else if (c <= 0) {
                    return i2;
                } else {
                    b = i2 - 1;
                }
            }
            return -(i + 1);
        }

        public static e g() {
            return f;
        }

        @Override // com.p7700g.p99005.aw.k, com.p7700g.p99005.aw.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            d j = j();
            int b = b();
            k k = k();
            for (int i = 0; i < b; i++) {
                sb.append(h95.b);
                sb.append(j.a(i).toString());
                sb.append("\" : ");
                sb.append(k.d(i).toString());
                if (i != b - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public g h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public g i(byte[] bArr) {
            d j = j();
            int b = j.b();
            int f2 = f(j, bArr);
            if (f2 < 0 || f2 >= b) {
                return g.a;
            }
            return d(f2);
        }

        public d j() {
            int i = this.b - (this.c * 3);
            hw hwVar = this.a;
            int i2 = aw.i(hwVar, i, this.c);
            hw hwVar2 = this.a;
            int i3 = this.c;
            return new d(new i(hwVar, i2, aw.n(hwVar2, i + i3, i3), 4));
        }

        public k k() {
            return new k(this.a, this.b, this.c);
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public hw a;
        public int b;
        public int c;

        public f(hw hwVar, int i, int i2) {
            this.a = hwVar;
            this.b = i;
            this.c = i2;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class g {
        private static final g a = new g(aw.C, 0, 1, 0);
        private hw b;
        private int c;
        private int d;
        private int e;
        private int f;

        public g(hw hwVar, int i, int i2, int i3) {
            this(hwVar, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            hw hwVar = this.b;
            return new a(hwVar, aw.i(hwVar, this.c, this.d), this.e);
        }

        public boolean c() {
            return n() ? this.b.get(this.c) != 0 : j() != 0;
        }

        public double d() {
            int i = this.f;
            if (i == 3) {
                return aw.m(this.b, this.c, this.d);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        return Double.parseDouble(i());
                    }
                    if (i == 6) {
                        hw hwVar = this.b;
                        return aw.n(hwVar, aw.i(hwVar, this.c, this.d), this.e);
                    } else if (i == 7) {
                        hw hwVar2 = this.b;
                        return aw.p(hwVar2, aw.i(hwVar2, this.c, this.d), this.e);
                    } else if (i == 8) {
                        hw hwVar3 = this.b;
                        return aw.m(hwVar3, aw.i(hwVar3, this.c, this.d), this.e);
                    } else if (i == 10) {
                        return k().b();
                    } else {
                        if (i != 26) {
                            return zg2.s;
                        }
                    }
                }
                return aw.p(this.b, this.c, this.d);
            }
            return aw.n(this.b, this.c, this.d);
        }

        public int e() {
            long p;
            int i = this.f;
            if (i == 1) {
                return aw.n(this.b, this.c, this.d);
            }
            if (i == 2) {
                p = aw.p(this.b, this.c, this.d);
            } else if (i == 3) {
                return (int) aw.m(this.b, this.c, this.d);
            } else {
                if (i == 5) {
                    return Integer.parseInt(i());
                }
                if (i == 6) {
                    hw hwVar = this.b;
                    return aw.n(hwVar, aw.i(hwVar, this.c, this.d), this.e);
                } else if (i != 7) {
                    if (i == 8) {
                        hw hwVar2 = this.b;
                        return (int) aw.m(hwVar2, aw.i(hwVar2, this.c, this.d), this.e);
                    } else if (i != 10) {
                        if (i != 26) {
                            return 0;
                        }
                        return aw.n(this.b, this.c, this.d);
                    } else {
                        return k().b();
                    }
                } else {
                    hw hwVar3 = this.b;
                    p = aw.p(hwVar3, aw.i(hwVar3, this.c, this.d), this.d);
                }
            }
            return (int) p;
        }

        public c f() {
            if (r()) {
                hw hwVar = this.b;
                return new c(hwVar, aw.i(hwVar, this.c, this.d), this.e);
            }
            return c.d();
        }

        public long g() {
            int i = this.f;
            if (i == 1) {
                return aw.o(this.b, this.c, this.d);
            }
            if (i != 2) {
                if (i != 3) {
                    if (i == 5) {
                        try {
                            return Long.parseLong(i());
                        } catch (NumberFormatException unused) {
                            return 0L;
                        }
                    } else if (i == 6) {
                        hw hwVar = this.b;
                        return aw.o(hwVar, aw.i(hwVar, this.c, this.d), this.e);
                    } else if (i == 7) {
                        hw hwVar2 = this.b;
                        return aw.p(hwVar2, aw.i(hwVar2, this.c, this.d), this.d);
                    } else if (i == 8) {
                        hw hwVar3 = this.b;
                        return (long) aw.m(hwVar3, aw.i(hwVar3, this.c, this.d), this.e);
                    } else if (i != 10) {
                        if (i != 26) {
                            return 0L;
                        }
                        return aw.n(this.b, this.c, this.d);
                    } else {
                        return k().b();
                    }
                }
                return (long) aw.m(this.b, this.c, this.d);
            }
            return aw.p(this.b, this.c, this.d);
        }

        public e h() {
            if (s()) {
                hw hwVar = this.b;
                return new e(hwVar, aw.i(hwVar, this.c, this.d), this.e);
            }
            return e.g();
        }

        public String i() {
            if (v()) {
                int i = aw.i(this.b, this.c, this.d);
                hw hwVar = this.b;
                int i2 = this.e;
                return this.b.j(i, (int) aw.p(hwVar, i - i2, i2));
            } else if (r()) {
                int i3 = aw.i(this.b, this.c, this.e);
                int i4 = i3;
                while (this.b.get(i4) != 0) {
                    i4++;
                }
                return this.b.j(i3, i4 - i3);
            } else {
                return "";
            }
        }

        public long j() {
            int i = this.f;
            if (i == 2) {
                return aw.p(this.b, this.c, this.d);
            }
            if (i != 1) {
                if (i != 3) {
                    if (i != 10) {
                        if (i != 26) {
                            if (i != 5) {
                                if (i == 6) {
                                    hw hwVar = this.b;
                                    return aw.o(hwVar, aw.i(hwVar, this.c, this.d), this.e);
                                } else if (i == 7) {
                                    hw hwVar2 = this.b;
                                    return aw.p(hwVar2, aw.i(hwVar2, this.c, this.d), this.e);
                                } else if (i != 8) {
                                    return 0L;
                                } else {
                                    hw hwVar3 = this.b;
                                    return (long) aw.m(hwVar3, aw.i(hwVar3, this.c, this.d), this.d);
                                }
                            }
                            return Long.parseLong(i());
                        }
                        return aw.n(this.b, this.c, this.d);
                    }
                    return k().b();
                }
                return (long) aw.m(this.b, this.c, this.d);
            }
            return aw.o(this.b, this.c, this.d);
        }

        public k k() {
            if (y()) {
                hw hwVar = this.b;
                return new k(hwVar, aw.i(hwVar, this.c, this.d), this.e);
            }
            int i = this.f;
            if (i == 15) {
                hw hwVar2 = this.b;
                return new i(hwVar2, aw.i(hwVar2, this.c, this.d), this.e, 4);
            } else if (aw.k(i)) {
                hw hwVar3 = this.b;
                return new i(hwVar3, aw.i(hwVar3, this.c, this.d), this.e, aw.r(this.f));
            } else {
                return k.c();
            }
        }

        public int l() {
            return this.f;
        }

        public boolean m() {
            return this.f == 25;
        }

        public boolean n() {
            return this.f == 26;
        }

        public boolean o() {
            int i = this.f;
            return i == 3 || i == 8;
        }

        public boolean p() {
            int i = this.f;
            return i == 1 || i == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f == 4;
        }

        public boolean s() {
            return this.f == 9;
        }

        public boolean t() {
            return this.f == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f == 5;
        }

        public boolean w() {
            return aw.k(this.f);
        }

        public boolean x() {
            int i = this.f;
            return i == 2 || i == 7;
        }

        public boolean y() {
            int i = this.f;
            return i == 10 || i == 9;
        }

        public StringBuilder z(StringBuilder sb) {
            int i = this.f;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append(pg1.d);
                        return sb;
                    case 1:
                    case 6:
                        sb.append(g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(d());
                        return sb;
                    case 4:
                        c f = f();
                        sb.append(h95.b);
                        StringBuilder a2 = f.a(sb);
                        a2.append(h95.b);
                        return a2;
                    case 5:
                        sb.append(h95.b);
                        sb.append(i());
                        sb.append(h95.b);
                        return sb;
                    case 9:
                        return h().a(sb);
                    case 10:
                        return k().a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        StringBuilder G = wo1.G("not_implemented:");
                        G.append(this.f);
                        throw new b(G.toString());
                    case 25:
                        return b().a(sb);
                    case 26:
                        sb.append(c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(k());
            return sb;
        }

        public g(hw hwVar, int i, int i2, int i3, int i4) {
            this.b = hwVar;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static abstract class h extends f {
        public final int d;

        public h(hw hwVar, int i, int i2) {
            super(hwVar, i, i2);
            this.d = aw.n(this.a, i - i2, i2);
        }

        public int b() {
            return this.d;
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class i extends k {
        private static final i f = new i(aw.C, 1, 1, 1);
        private final int g;

        public i(hw hwVar, int i, int i2, int i3) {
            super(hwVar, i, i2);
            this.g = i3;
        }

        public static i f() {
            return f;
        }

        @Override // com.p7700g.p99005.aw.k
        public g d(int i) {
            if (i >= b()) {
                return g.a;
            }
            int i2 = this.b;
            return new g(this.a, (i * this.c) + i2, this.c, 1, this.g);
        }

        public int g() {
            return this.g;
        }

        public boolean h() {
            return this == f;
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class j {
        public static int a(byte b) {
            return b & 255;
        }

        public static long b(int i) {
            return i & 4294967295L;
        }

        public static int c(short s) {
            return s & tq4.u;
        }
    }

    /* compiled from: FlexBuffers.java */
    /* loaded from: classes.dex */
    public static class k extends h {
        private static final k e = new k(aw.C, 1, 1);

        public k(hw hwVar, int i, int i2) {
            super(hwVar, i, i2);
        }

        public static k c() {
            return e;
        }

        @Override // com.p7700g.p99005.aw.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int b = b();
            for (int i = 0; i < b; i++) {
                d(i).z(sb);
                if (i != b - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // com.p7700g.p99005.aw.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i) {
            long b = b();
            long j = i;
            if (j >= b) {
                return g.a;
            }
            return new g(this.a, (i * this.c) + this.b, this.c, j.a(this.a.get((int) ((b * this.c) + this.b + j))));
        }

        public boolean e() {
            return this == e;
        }

        @Override // com.p7700g.p99005.aw.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static g g(hw hwVar) {
        int a2 = hwVar.a() - 1;
        byte b2 = hwVar.get(a2);
        int i2 = a2 - 1;
        return new g(hwVar, i2 - b2, b2, j.a(hwVar.get(i2)));
    }

    @Deprecated
    public static g h(ByteBuffer byteBuffer) {
        return g(byteBuffer.hasArray() ? new rv(byteBuffer.array(), byteBuffer.limit()) : new uv(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(hw hwVar, int i2, int i3) {
        return (int) (i2 - p(hwVar, i2, i3));
    }

    public static boolean j(int i2) {
        return i2 <= 3 || i2 == 26;
    }

    public static boolean k(int i2) {
        return (i2 >= 11 && i2 <= 15) || i2 == 36;
    }

    public static boolean l(int i2) {
        return (i2 >= 1 && i2 <= 4) || i2 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double m(hw hwVar, int i2, int i3) {
        if (i3 != 4) {
            if (i3 != 8) {
                return -1.0d;
            }
            return hwVar.getDouble(i2);
        }
        return hwVar.getFloat(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(hw hwVar, int i2, int i3) {
        return (int) o(hwVar, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(hw hwVar, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = hwVar.get(i2);
        } else if (i3 == 2) {
            i4 = hwVar.getShort(i2);
        } else if (i3 != 4) {
            if (i3 != 8) {
                return -1L;
            }
            return hwVar.getLong(i2);
        } else {
            i4 = hwVar.getInt(i2);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long p(hw hwVar, int i2, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        return -1L;
                    }
                    return hwVar.getLong(i2);
                }
                return j.b(hwVar.getInt(i2));
            }
            return j.c(hwVar.getShort(i2));
        }
        return j.a(hwVar.get(i2));
    }

    public static int q(int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return 0;
                    }
                    return (i2 - 1) + 22;
                }
                return (i2 - 1) + 19;
            }
            return (i2 - 1) + 16;
        }
        return (i2 - 1) + 11;
    }

    public static int r(int i2) {
        return (i2 - 11) + 1;
    }
}