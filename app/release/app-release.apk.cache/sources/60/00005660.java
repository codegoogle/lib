package com.p7700g.p99005;

import com.p7700g.p99005.j14;
import com.p7700g.p99005.l14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.ni4;
import com.p7700g.p99005.qi4;
import com.p7700g.p99005.s04;
import java.io.Serializable;
import java.net.Inet6Address;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: IPv6AddressNetwork.java */
/* loaded from: classes3.dex */
public class pi4 extends l14<ni4, qi4, bc4, ri4, Inet6Address> {
    private static final long E = 4;
    private static s04.c F = s04.h();
    public static final ri4[] G = new ri4[0];
    private static final qi4[] H = new qi4[0];
    private static final ni4[] I = new ni4[0];
    private static boolean J = true;
    private qi4 K;

    public pi4() {
        super(ni4.class);
    }

    private qi4 X() {
        a u = u();
        ri4 b = u.b(0);
        return u.u(new ri4[]{u.b(65152), b, b, b});
    }

    public static void d1(s04.c cVar) {
        F = cVar;
    }

    public static s04.c h() {
        return F;
    }

    @Override // com.p7700g.p99005.l14
    public Function<ni4, qi4> J() {
        return ai4.a;
    }

    @Override // com.p7700g.p99005.l14
    public BiFunction<ni4, Integer, ri4> N() {
        return bd4.a;
    }

    @Override // com.p7700g.p99005.l14
    public boolean R() {
        return true;
    }

    @Override // com.p7700g.p99005.l14
    /* renamed from: V */
    public a p() {
        return new a(this);
    }

    public boolean X0(pi4 pi4Var) {
        return super.m(pi4Var);
    }

    @Override // com.p7700g.p99005.l14
    /* renamed from: Z */
    public ni4 t() {
        a u = u();
        ri4 b = u.b(0);
        ri4[] d = u.d(8);
        d[6] = b;
        d[5] = b;
        d[4] = b;
        d[3] = b;
        d[2] = b;
        d[1] = b;
        d[0] = b;
        d[7] = u.b(1);
        return u.k3(d);
    }

    @Override // com.p7700g.p99005.l14
    public j14.b Z0() {
        return j14.b.IPV6;
    }

    @Override // com.p7700g.p99005.s04
    public s04.c i() {
        return F;
    }

    @Override // com.p7700g.p99005.l14
    /* renamed from: w0 */
    public a u() {
        return (a) super.g();
    }

    public qi4 x0() {
        if (this.K == null) {
            synchronized (this) {
                if (this.K == null) {
                    this.K = X();
                }
            }
        }
        return this.K;
    }

    /* compiled from: IPv6AddressNetwork.java */
    /* loaded from: classes3.dex */
    public static class a extends l14.c<ni4, qi4, bc4, ri4, Inet6Address> {
        private static final long w = 4;
        public C0226a x;
        public boolean y;

        /* compiled from: IPv6AddressNetwork.java */
        /* renamed from: com.p7700g.p99005.pi4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0226a implements Serializable {
            private static final long s = 1;
            private static final int t = 100;
            private transient ri4 u;
            private transient ri4 v;
            private transient ri4[][] w;
            private transient ri4[][][] x;
            private transient ri4[] y;
            private transient LinkedHashMap<String, ni4.c> z = new C0227a(16, 0.75f, true);
            private ReadWriteLock A = new ReentrantReadWriteLock();
            private transient ni4.c[] B = new ni4.c[256];

            /* compiled from: IPv6AddressNetwork.java */
            /* renamed from: com.p7700g.p99005.pi4$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0227a extends LinkedHashMap<String, ni4.c> {
                public C0227a(int i, float f, boolean z) {
                    super(i, f, z);
                }

                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, ni4.c> entry) {
                    return size() > 100;
                }
            }

            public void t() {
                this.w = null;
                this.y = null;
                this.x = null;
                this.u = null;
                this.v = null;
                ni4.c[] cVarArr = this.B;
                this.B = new ni4.c[256];
                Arrays.fill(cVarArr, (Object) null);
                Lock writeLock = this.A.writeLock();
                writeLock.lock();
                this.z.clear();
                writeLock.unlock();
            }
        }

        public a(pi4 pi4Var) {
            super(pi4Var);
            this.y = true;
            this.x = new C0226a();
        }

        private ni4.c i5(String str) {
            ni4.c cVar;
            int a = ni4.c.a(str);
            if (a >= 0) {
                if (a < this.x.B.length) {
                    cVar = this.x.B[a];
                    if (cVar == null) {
                        cVar = new ni4.c(a);
                        this.x.B[a] = cVar;
                    }
                } else {
                    cVar = new ni4.c(a);
                }
                cVar.t = str;
                return cVar;
            }
            Lock readLock = this.x.A.readLock();
            readLock.lock();
            ni4.c cVar2 = (ni4.c) this.x.z.get(str);
            readLock.unlock();
            if (cVar2 == null) {
                ni4.c cVar3 = new ni4.c(str);
                Lock writeLock = this.x.A.writeLock();
                writeLock.lock();
                ni4.c cVar4 = (ni4.c) this.x.z.get(str);
                if (cVar4 == null) {
                    this.x.z.put(str, cVar3);
                } else {
                    cVar3 = cVar4;
                }
                writeLock.unlock();
                return cVar3;
            }
            return cVar2;
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: B4 */
        public ni4 Q(qi4 qi4Var) {
            return new ni4(qi4Var);
        }

        public ni4 D4(qi4 qi4Var, ni4.c cVar) {
            if (cVar == null) {
                return Q(qi4Var);
            }
            return new ni4(qi4Var, cVar);
        }

        @Override // com.p7700g.p99005.s64
        public int E() {
            return 65535;
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: E4 */
        public ni4 R(Inet6Address inet6Address) {
            return new ni4(inet6Address);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: F4 */
        public ni4 S(Inet6Address inet6Address, Integer num) {
            return new ni4(inet6Address, num);
        }

        @Override // com.p7700g.p99005.s64
        public void G(boolean z) {
            this.y = z;
        }

        public ni4 G4(ri4[] ri4VarArr, ni4.c cVar) {
            if (cVar == null) {
                return k3(ri4VarArr);
            }
            return D4(u(ri4VarArr), cVar);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: H4 */
        public ni4[] x0(int i) {
            if (i == 0) {
                return pi4.I;
            }
            return new ni4[i];
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: I4 */
        public ni4 c1(qi4 qi4Var, CharSequence charSequence) {
            if (charSequence != null && charSequence.length() != 0) {
                String trim = charSequence.toString().trim();
                if (trim.length() == 0) {
                    return Q(qi4Var);
                }
                return D4(qi4Var, i5(trim));
            }
            return Q(qi4Var);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: J4 */
        public ni4 i(qi4 qi4Var, CharSequence charSequence, e14 e14Var, ni4 ni4Var, ni4 ni4Var2) {
            ni4 h = h(qi4Var, charSequence, e14Var);
            h.i6(ni4Var, ni4Var2);
            return h;
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: K4 */
        public ni4 k3(ri4[] ri4VarArr) {
            return (ni4) super.I(ri4VarArr);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: L4 */
        public qi4 w3(m14 m14Var, ri4[] ri4VarArr) {
            return new qi4.d((qi4) m14Var, ri4VarArr, 0);
        }

        public qi4 M4(qi4 qi4Var, ri4[] ri4VarArr, int i) {
            return new qi4.d(qi4Var, ri4VarArr, i);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: N4 */
        public qi4 x3(n04.b bVar, n04.b bVar2, Integer num) {
            return new qi4(bVar, bVar2, 8, num);
        }

        @Override // com.p7700g.p99005.l14.c, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: O4 */
        public qi4 t(ri4[] ri4VarArr, Integer num, boolean z) {
            return new qi4(ri4VarArr, 0, false, num, z);
        }

        public qi4 P4(gl4 gl4Var) {
            return new qi4(gl4Var);
        }

        public qi4 Q4(jl4 jl4Var) {
            return new qi4(jl4Var);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: R4 */
        public qi4 G3(byte[] bArr, int i, int i2, int i3, Integer num) {
            return new qi4(bArr, i, i2, i3, num, true, false);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: S4 */
        public qi4 I3(byte[] bArr, int i, int i2, Integer num) {
            return new qi4(bArr, i, i2, -1, num, true, false);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: T4 */
        public qi4 N3(byte[] bArr, Integer num) {
            return new qi4(bArr, num);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: U4 */
        public qi4 S3(ri4[] ri4VarArr) {
            return new qi4(ri4VarArr);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: V4 */
        public qi4 U3(ri4[] ri4VarArr, Integer num) {
            return new qi4(ri4VarArr, num);
        }

        @Override // com.p7700g.p99005.l14.c
        /* renamed from: W4 */
        public qi4[] W3(int i) {
            if (i == 0) {
                return pi4.H;
            }
            return new qi4[i];
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: X4 */
        public qi4 M(byte[] bArr, int i, Integer num, boolean z) {
            return new qi4(bArr, i, num, false, z);
        }

        @Override // com.p7700g.p99005.l14.c, com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: Y4 */
        public qi4 u(ri4[] ri4VarArr) {
            return new qi4(ri4VarArr, 0, false);
        }

        public qi4 Z4(ri4[] ri4VarArr, int i) {
            return new qi4(ri4VarArr, i, false);
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: a5 */
        public qi4 N(ri4[] ri4VarArr, int i, boolean z) {
            return new qi4(ri4VarArr, i, false);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: b5 */
        public qi4 x(ri4[] ri4VarArr, bc4 bc4Var) {
            qi4 qi4Var = new qi4(ri4VarArr, 0, false);
            qi4Var.U = bc4Var;
            return qi4Var;
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: c5 */
        public qi4 y(ri4[] ri4VarArr, bc4 bc4Var, Integer num) {
            qi4 qi4Var = new qi4(ri4VarArr, 0, false, num, false);
            qi4Var.U = bc4Var;
            return qi4Var;
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: d5 */
        public qi4 A(ri4[] ri4VarArr, bc4 bc4Var, Integer num, boolean z) {
            qi4 qi4Var = new qi4(ri4VarArr, 0, false, num, z);
            qi4Var.U = bc4Var;
            return qi4Var;
        }

        @Override // com.p7700g.p99005.s04.a
        /* renamed from: e5 */
        public ri4 b(int i) {
            if (this.y && i >= 0 && i <= 65535) {
                ri4[][] ri4VarArr = this.x.w;
                int i2 = i >>> 8;
                int i3 = i - (i2 << 8);
                if (ri4VarArr == null) {
                    C0226a c0226a = this.x;
                    ri4[][] ri4VarArr2 = new ri4[dg.t];
                    c0226a.w = ri4VarArr2;
                    ri4[] ri4VarArr3 = new ri4[256];
                    ri4VarArr2[i2] = ri4VarArr3;
                    ri4 ri4Var = new ri4(i);
                    ri4VarArr3[i3] = ri4Var;
                    return ri4Var;
                }
                ri4[] ri4VarArr4 = ri4VarArr[i2];
                if (ri4VarArr4 == null) {
                    ri4[] ri4VarArr5 = new ri4[256];
                    ri4VarArr[i2] = ri4VarArr5;
                    ri4 ri4Var2 = new ri4(i);
                    ri4VarArr5[i3] = ri4Var2;
                    return ri4Var2;
                }
                ri4 ri4Var3 = ri4VarArr4[i3];
                if (ri4Var3 == null) {
                    ri4 ri4Var4 = new ri4(i);
                    ri4VarArr4[i3] = ri4Var4;
                    return ri4Var4;
                }
                return ri4Var3;
            }
            return new ri4(i);
        }

        @Override // com.p7700g.p99005.s64
        public void f() {
            super.f();
            this.x.t();
        }

        @Override // com.p7700g.p99005.s64, com.p7700g.p99005.s04.a
        /* renamed from: f5 */
        public ri4 c(int i, int i2, Integer num) {
            if (num == null) {
                if (i == i2) {
                    return b(i);
                }
                if (this.y && i == 0 && i2 == 65535) {
                    ri4 ri4Var = this.x.v;
                    if (ri4Var == null) {
                        C0226a c0226a = this.x;
                        ri4 ri4Var2 = new ri4(0, 65535, null);
                        c0226a.v = ri4Var2;
                        return ri4Var2;
                    }
                    return ri4Var;
                }
            } else if (i == i2) {
                return e(i, num);
            } else {
                if (this.y && i >= 0 && i <= 65535 && i2 >= 0 && i2 <= 65535 && num.intValue() >= 0 && num.intValue() <= 128) {
                    if (num.intValue() != 0 || !m0().i().f()) {
                        if (pi4.J) {
                            if (num.intValue() > 16) {
                                num = 16;
                            }
                            if (m0().i().f()) {
                                int M = m0().M(num.intValue());
                                i &= M;
                                if ((M & i2) == i) {
                                    return e(i, num);
                                }
                                i2 |= m0().L(num.intValue());
                            }
                            if (i == 0 && i2 == 65535) {
                                int intValue = num.intValue();
                                ri4[] ri4VarArr = this.x.y;
                                if (ri4VarArr == null) {
                                    ri4[] ri4VarArr2 = new ri4[17];
                                    this.x.y = ri4VarArr2;
                                    ri4 ri4Var3 = new ri4(0, 65535, num);
                                    ri4VarArr2[intValue] = ri4Var3;
                                    return ri4Var3;
                                }
                                ri4 ri4Var4 = ri4VarArr[intValue];
                                if (ri4Var4 == null) {
                                    ri4Var4 = new ri4(0, 65535, num);
                                    ri4VarArr[intValue] = ri4Var4;
                                }
                                return ri4Var4;
                            }
                        }
                    } else {
                        return e(0, num);
                    }
                }
            }
            return new ri4(i, i2, num);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        @Override // com.p7700g.p99005.s04.a
        /* renamed from: g5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ri4 e(int i, Integer num) {
            int i2;
            ri4[] ri4VarArr;
            ri4 ri4Var;
            if (num == null) {
                return b(i);
            }
            if (this.y && i >= 0 && i <= 65535 && num.intValue() >= 0 && num.intValue() <= 128) {
                if (num.intValue() != 0 || !m0().i().f()) {
                    if (pi4.J) {
                        int intValue = num.intValue();
                        boolean f = m0().i().f();
                        if (f) {
                            int M = i & m0().M(num.intValue());
                            i2 = M;
                            i = M >>> (16 - num.intValue());
                        } else {
                            i2 = i;
                        }
                        ri4[][][] ri4VarArr2 = this.x.x;
                        int i3 = i >>> 8;
                        int i4 = i - (i3 << 8);
                        if (ri4VarArr2 == null) {
                            ri4[][][] ri4VarArr3 = new ri4[17][];
                            this.x.x = ri4VarArr3;
                            ri4VarArr = null;
                            ri4VarArr2 = ri4VarArr3;
                        } else {
                            ri4[][] ri4VarArr4 = ri4VarArr2[intValue];
                            if (ri4VarArr4 != null) {
                                ri4VarArr = ri4VarArr4[i3];
                                ri4Var = ri4VarArr != null ? ri4VarArr[i4] : null;
                                r5 = ri4VarArr4;
                                if (r5 == null) {
                                    r5 = new ri4[(((f ? 1 << num.intValue() : 65536) + 256) - 1) >>> 8];
                                    ri4VarArr2[intValue] = r5;
                                }
                                if (ri4VarArr == null) {
                                    int intValue2 = f ? 1 << num.intValue() : 65536;
                                    int i5 = intValue2 >>> 8;
                                    ri4VarArr = i3 == i5 ? new ri4[intValue2 - (i5 << 8)] : new ri4[256];
                                    r5[i3] = ri4VarArr;
                                }
                                if (ri4Var != null) {
                                    ri4 ri4Var2 = new ri4(i2, num);
                                    ri4VarArr[i4] = ri4Var2;
                                    return ri4Var2;
                                }
                                return ri4Var;
                            }
                            ri4VarArr = null;
                            r5 = ri4VarArr4;
                        }
                        ri4Var = ri4VarArr;
                        if (r5 == null) {
                        }
                        if (ri4VarArr == null) {
                        }
                        if (ri4Var != null) {
                        }
                    }
                } else {
                    ri4 ri4Var3 = this.x.u;
                    if (ri4Var3 == null) {
                        C0226a c0226a = this.x;
                        ri4 ri4Var4 = new ri4(0, 0);
                        c0226a.u = ri4Var4;
                        return ri4Var4;
                    }
                    return ri4Var3;
                }
            }
            return new ri4(i, num);
        }

        @Override // com.p7700g.p99005.s64, com.p7700g.p99005.s04.a
        /* renamed from: h5 */
        public ri4[] d(int i) {
            if (i == 0) {
                return pi4.G;
            }
            return new ri4[i];
        }

        @Override // com.p7700g.p99005.l14.c, com.p7700g.p99005.d34
        /* renamed from: j5 */
        public pi4 m0() {
            return (pi4) super.m0();
        }

        @Override // com.p7700g.p99005.l14.c
        public int y4() {
            return 8;
        }

        public a(pi4 pi4Var, C0226a c0226a) {
            super(pi4Var);
            this.y = true;
            this.x = c0226a;
        }
    }
}