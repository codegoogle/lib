package com.p7700g.p99005;

import com.p7700g.p99005.bc4;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.s04;
import java.io.Serializable;
import java.net.Inet4Address;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: IPv4AddressNetwork.java */
/* loaded from: classes3.dex */
public class ac4 extends l14<yb4, bc4, bc4, cc4, Inet4Address> {
    private static final long E = 4;
    private static s04.c F = s04.h();
    private static boolean G = true;
    private static final cc4[] H = new cc4[0];
    private static final bc4[] I = new bc4[0];
    private static final yb4[] J = new yb4[0];

    public ac4() {
        super(yb4.class);
    }

    public static void d1(s04.c cVar) {
        F = cVar;
    }

    public static s04.c h() {
        return F;
    }

    @Override // com.p7700g.p99005.l14
    public Function<yb4, bc4> J() {
        return ib4.a;
    }

    @Override // com.p7700g.p99005.l14
    public BiFunction<yb4, Integer, cc4> N() {
        return m74.a;
    }

    @Override // com.p7700g.p99005.l14
    public boolean Q() {
        return true;
    }

    public boolean X0(ac4 ac4Var) {
        return super.m(ac4Var);
    }

    @Override // com.p7700g.p99005.l14
    /* renamed from: Z */
    public a p() {
        return new a(this);
    }

    @Override // com.p7700g.p99005.l14
    public j14.b Z0() {
        return j14.b.IPV4;
    }

    @Override // com.p7700g.p99005.s04
    public s04.c i() {
        return F;
    }

    @Override // com.p7700g.p99005.l14
    /* renamed from: w0 */
    public yb4 t() {
        a u = u();
        cc4 b = u.b(0);
        cc4[] d = u.d(4);
        d[0] = u.b(127);
        d[2] = b;
        d[1] = b;
        d[3] = u.b(1);
        return u.k3(d);
    }

    @Override // com.p7700g.p99005.l14
    /* renamed from: x0 */
    public a u() {
        return (a) super.g();
    }

    /* compiled from: IPv4AddressNetwork.java */
    /* loaded from: classes3.dex */
    public static class a extends l14.c<yb4, bc4, bc4, cc4, Inet4Address> {
        private static final long w = 4;
        public C0143a x;
        public boolean y;

        /* compiled from: IPv4AddressNetwork.java */
        /* renamed from: com.p7700g.p99005.ac4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0143a implements Serializable {
            private static final long s = 1;
            private transient cc4 t;
            private transient cc4 u;
            private transient cc4[] v;
            private transient cc4[][] w;
            private transient cc4[] x;

            public void n() {
                this.v = null;
                this.x = null;
                this.w = null;
                this.t = null;
                this.u = null;
            }
        }

        public a(ac4 ac4Var) {
            super(ac4Var);
            this.y = true;
            this.x = new C0143a();
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: B4 */
        public yb4 Q(bc4 bc4Var) {
            return new yb4(bc4Var);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: D4 */
        public yb4 R(Inet4Address inet4Address) {
            return new yb4(inet4Address);
        }

        @Override // com.p7700g.p99005.s64
        public int E() {
            return 255;
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: E4 */
        public yb4 S(Inet4Address inet4Address, Integer num) {
            return new yb4(inet4Address, num);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: F4 */
        public yb4[] x0(int i) {
            if (i == 0) {
                return ac4.J;
            }
            return new yb4[i];
        }

        @Override // com.p7700g.p99005.s64
        public void G(boolean z) {
            this.y = z;
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: G4 */
        public yb4 c1(bc4 bc4Var, CharSequence charSequence) {
            return Q(bc4Var);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: H4 */
        public yb4 i(bc4 bc4Var, CharSequence charSequence, e14 e14Var, yb4 yb4Var, yb4 yb4Var2) {
            yb4 g = g(bc4Var, e14Var);
            g.h6(yb4Var, yb4Var2);
            return g;
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: I4 */
        public yb4 k3(cc4[] cc4VarArr) {
            return (yb4) super.I(cc4VarArr);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: J4 */
        public bc4 w3(m14 m14Var, cc4[] cc4VarArr) {
            return new bc4.b(m14Var, cc4VarArr);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: K4 */
        public bc4 x3(n04.b bVar, n04.b bVar2, Integer num) {
            return new bc4(bVar, bVar2, 4, num);
        }

        @Override // com.p7700g.p99005.l14.c, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: L4 */
        public bc4 t(cc4[] cc4VarArr, Integer num, boolean z) {
            return new bc4(cc4VarArr, false, num, z);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: M4 */
        public bc4 G3(byte[] bArr, int i, int i2, int i3, Integer num) {
            return new bc4(bArr, i, i2, i3, num);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: N4 */
        public bc4 I3(byte[] bArr, int i, int i2, Integer num) {
            return new bc4(bArr, i, i2, -1, num, true, false);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: O4 */
        public bc4 N3(byte[] bArr, Integer num) {
            return new bc4(bArr, num);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: P4 */
        public bc4 S3(cc4[] cc4VarArr) {
            return new bc4(cc4VarArr);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: Q4 */
        public bc4 U3(cc4[] cc4VarArr, Integer num) {
            return new bc4(cc4VarArr, num);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: R4 */
        public bc4[] W3(int i) {
            if (i == 0) {
                return ac4.I;
            }
            return new bc4[i];
        }

        public bc4 S4(int i) {
            return new bc4(i);
        }

        public bc4 T4(int i, Integer num) {
            return new bc4(i, num);
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: U4 */
        public bc4 M(byte[] bArr, int i, Integer num, boolean z) {
            return new bc4(bArr, i, num, false, z);
        }

        @Override // com.p7700g.p99005.l14.c, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: V4 */
        public bc4 u(cc4[] cc4VarArr) {
            return new bc4(cc4VarArr, false);
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: W4 */
        public bc4 N(cc4[] cc4VarArr, int i, boolean z) {
            return new bc4(cc4VarArr);
        }

        @Override // com.p7700g.p99005.s04.a
        /* renamed from: X4 */
        public cc4 b(int i) {
            if (this.y && i >= 0 && i <= 255) {
                cc4[] cc4VarArr = this.x.v;
                if (cc4VarArr == null) {
                    cc4[] cc4VarArr2 = new cc4[256];
                    this.x.v = cc4VarArr2;
                    cc4 cc4Var = new cc4(i);
                    cc4VarArr2[i] = cc4Var;
                    return cc4Var;
                }
                cc4 cc4Var2 = cc4VarArr[i];
                if (cc4Var2 == null) {
                    cc4Var2 = new cc4(i);
                    cc4VarArr[i] = cc4Var2;
                }
                return cc4Var2;
            }
            return new cc4(i);
        }

        @Override // com.p7700g.p99005.s64, com.p7700g.p99005.s04.a
        /* renamed from: Y4 */
        public cc4 c(int i, int i2, Integer num) {
            if (num == null) {
                if (i == i2) {
                    return b(i);
                }
                if (this.y && i == 0 && i2 == 255) {
                    cc4 cc4Var = this.x.u;
                    if (cc4Var == null) {
                        C0143a c0143a = this.x;
                        cc4 cc4Var2 = new cc4(0, 255, null);
                        c0143a.u = cc4Var2;
                        return cc4Var2;
                    }
                    return cc4Var;
                }
            } else if (i == i2) {
                return e(i, num);
            } else {
                if (this.y && i >= 0 && i <= 255 && i2 >= 0 && i2 <= 255 && num.intValue() >= 0 && num.intValue() <= 32) {
                    if (num.intValue() != 0 || !m0().i().f()) {
                        if (ac4.G) {
                            if (num.intValue() > 8) {
                                num = 8;
                            }
                            if (m0().i().f()) {
                                int M = m0().M(num.intValue());
                                i &= M;
                                if ((i2 & M) == i) {
                                    return e(i, num);
                                }
                                if (i == 0 && i2 >= M) {
                                    int intValue = num.intValue();
                                    cc4[] cc4VarArr = this.x.x;
                                    if (cc4VarArr == null) {
                                        cc4[] cc4VarArr2 = new cc4[9];
                                        this.x.x = cc4VarArr2;
                                        cc4 cc4Var3 = new cc4(0, 255, num);
                                        cc4VarArr2[intValue] = cc4Var3;
                                        return cc4Var3;
                                    }
                                    cc4 cc4Var4 = cc4VarArr[intValue];
                                    if (cc4Var4 == null) {
                                        cc4Var4 = new cc4(0, 255, num);
                                        cc4VarArr[intValue] = cc4Var4;
                                    }
                                    return cc4Var4;
                                }
                            } else if (i == 0 && i2 == 255) {
                                int intValue2 = num.intValue();
                                cc4[] cc4VarArr3 = this.x.x;
                                if (cc4VarArr3 == null) {
                                    cc4[] cc4VarArr4 = new cc4[9];
                                    this.x.x = cc4VarArr4;
                                    cc4 cc4Var5 = new cc4(0, 255, num);
                                    cc4VarArr4[intValue2] = cc4Var5;
                                    return cc4Var5;
                                }
                                cc4 cc4Var6 = cc4VarArr3[intValue2];
                                if (cc4Var6 == null) {
                                    cc4Var6 = new cc4(0, 255, num);
                                    cc4VarArr3[intValue2] = cc4Var6;
                                }
                                return cc4Var6;
                            }
                        }
                    } else {
                        return e(0, l14.o(0));
                    }
                }
            }
            return new cc4(i, i2, num);
        }

        @Override // com.p7700g.p99005.s04.a
        /* renamed from: Z4 */
        public cc4 e(int i, Integer num) {
            int i2;
            if (num == null) {
                return b(i);
            }
            if (this.y && i >= 0 && i <= 255 && num.intValue() >= 0 && num.intValue() <= 32) {
                if (num.intValue() != 0 || !m0().i().f()) {
                    if (ac4.G) {
                        int M = m0().M(num.intValue());
                        int intValue = num.intValue();
                        boolean f = m0().i().f();
                        if (f) {
                            int i3 = i & M;
                            i2 = i3;
                            i = i3 >>> (8 - num.intValue());
                        } else {
                            i2 = i;
                        }
                        cc4[][] cc4VarArr = this.x.w;
                        if (cc4VarArr == null) {
                            cc4[][] cc4VarArr2 = new cc4[9];
                            this.x.w = cc4VarArr2;
                            cc4[] cc4VarArr3 = new cc4[f ? 1 << intValue : 256];
                            cc4VarArr2[intValue] = cc4VarArr3;
                            cc4 cc4Var = new cc4(i2, num);
                            cc4VarArr3[i] = cc4Var;
                            return cc4Var;
                        }
                        cc4[] cc4VarArr4 = cc4VarArr[intValue];
                        if (cc4VarArr4 == null) {
                            cc4[] cc4VarArr5 = new cc4[f ? 1 << intValue : 256];
                            cc4VarArr[intValue] = cc4VarArr5;
                            cc4 cc4Var2 = new cc4(i2, num);
                            cc4VarArr5[i] = cc4Var2;
                            return cc4Var2;
                        }
                        cc4 cc4Var3 = cc4VarArr4[i];
                        if (cc4Var3 == null) {
                            cc4 cc4Var4 = new cc4(i2, num);
                            cc4VarArr4[i] = cc4Var4;
                            return cc4Var4;
                        }
                        return cc4Var3;
                    }
                } else {
                    cc4 cc4Var5 = this.x.t;
                    if (cc4Var5 == null) {
                        C0143a c0143a = this.x;
                        cc4 cc4Var6 = new cc4(0, 0);
                        c0143a.t = cc4Var6;
                        return cc4Var6;
                    }
                    return cc4Var5;
                }
            }
            return new cc4(i, num);
        }

        @Override // com.p7700g.p99005.s64, com.p7700g.p99005.s04.a
        /* renamed from: a5 */
        public cc4[] d(int i) {
            if (i == 0) {
                return ac4.H;
            }
            return new cc4[i];
        }

        @Override // com.p7700g.p99005.l14.c, com.p7700g.p99005.d34
        /* renamed from: b5 */
        public ac4 m0() {
            return (ac4) super.m0();
        }

        @Override // com.p7700g.p99005.s64
        public void f() {
            super.f();
            this.x.n();
        }

        @Override // com.p7700g.p99005.l14.c
        public int y4() {
            return 4;
        }

        public a(ac4 ac4Var, C0143a c0143a) {
            super(ac4Var);
            this.y = true;
            this.x = c0143a;
        }
    }
}