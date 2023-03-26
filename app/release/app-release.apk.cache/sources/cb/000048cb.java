package com.p7700g.p99005;

import com.p7700g.p99005.n04;
import com.p7700g.p99005.s04;
import java.io.Serializable;

/* compiled from: MACAddressNetwork.java */
/* loaded from: classes3.dex */
public class il4 extends s04<kl4> {
    private static final long u = 4;
    private static s04.c v = s04.h();
    private static final kl4[] w = new kl4[0];
    private a x = p();

    public static s04.c h() {
        return v;
    }

    public static void u(s04.c cVar) {
        v = cVar;
    }

    @Override // com.p7700g.p99005.s04
    public s04.c i() {
        return v;
    }

    @Override // com.p7700g.p99005.s04
    public boolean m(s04<?> s04Var) {
        return super.m(s04Var);
    }

    public a p() {
        return new a(this);
    }

    @Override // com.p7700g.p99005.s04
    /* renamed from: t */
    public a g() {
        return this.x;
    }

    /* compiled from: MACAddressNetwork.java */
    /* loaded from: classes3.dex */
    public static class a extends d34<gl4, jl4, jl4, kl4> implements s04.a<kl4> {
        private static final long u = 4;
        public C0196a v;
        private final il4 w;

        /* compiled from: MACAddressNetwork.java */
        /* renamed from: com.p7700g.p99005.il4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0196a implements Serializable {
            private static final long s = 1;
            private transient kl4 t;
            private transient kl4[] u;

            public void f() {
                this.u = null;
                this.t = null;
            }
        }

        public a(il4 il4Var) {
            this.w = il4Var;
            this.v = new C0196a();
        }

        @Override // com.p7700g.p99005.s64, com.p7700g.p99005.s04.a
        /* renamed from: C3 */
        public kl4 c(int i, int i2, Integer num) {
            if (num == null) {
                return w0(i, i2);
            }
            if (num.intValue() >= 0) {
                if (num.intValue() <= 64) {
                    if (m0().i().f()) {
                        if (num.intValue() == 0) {
                            kl4 kl4Var = this.v.t;
                            if (kl4Var == null) {
                                C0196a c0196a = this.v;
                                kl4 kl4Var2 = new kl4(0, 255);
                                c0196a.t = kl4Var2;
                                return kl4Var2;
                            }
                            return kl4Var;
                        }
                        int intValue = ((-1) << (8 - num.intValue())) & 255;
                        return w0(i & intValue, i2 | ((~intValue) & 255));
                    }
                    return w0(i, i2);
                }
                throw new y14(num.intValue());
            }
            throw new y14(num.intValue());
        }

        public jl4 D1(byte[] bArr, int i, int i2, boolean z) {
            return new jl4(bArr, 0, bArr.length, i2, i, z, true);
        }

        @Override // com.p7700g.p99005.s64
        public int E() {
            return 255;
        }

        @Override // com.p7700g.p99005.s04.a
        /* renamed from: E3 */
        public kl4 e(int i, Integer num) {
            if (num != null) {
                if (num.intValue() >= 0) {
                    if (num.intValue() <= 64) {
                        if (m0().i().f()) {
                            if (num.intValue() == 0) {
                                kl4 kl4Var = this.v.t;
                                if (kl4Var == null) {
                                    C0196a c0196a = this.v;
                                    kl4 kl4Var2 = new kl4(0, 255);
                                    c0196a.t = kl4Var2;
                                    return kl4Var2;
                                }
                                return kl4Var;
                            }
                            int intValue = (-1) << (8 - num.intValue());
                            return w0(i & intValue, i | (~intValue));
                        }
                    } else {
                        throw new y14(num.intValue());
                    }
                } else {
                    throw new y14(num.intValue());
                }
            }
            return b(i);
        }

        @Override // com.p7700g.p99005.s64, com.p7700g.p99005.s04.a
        /* renamed from: G3 */
        public kl4[] d(int i) {
            if (i == 0) {
                return il4.w;
            }
            return new kl4[i];
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: I3 */
        public kl4 B(int i, int i2, Integer num, CharSequence charSequence, int i3, int i4, boolean z, boolean z2, int i5, int i6, int i7) {
            kl4 c = c(i, i2, num);
            c.A5(charSequence, z2, i5, i7, i3, i4);
            return c;
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: N3 */
        public kl4 D(int i, Integer num, CharSequence charSequence, int i2, boolean z, int i3, int i4) {
            kl4 e = e(i, num);
            e.z5(charSequence, z, i3, i4, i2);
            return e;
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: O */
        public gl4 H(jl4 jl4Var) {
            return new gl4(jl4Var);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: P */
        public gl4 g(jl4 jl4Var, e14 e14Var) {
            gl4 H = H(jl4Var);
            H.V(e14Var);
            return H;
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: Q */
        public gl4 h(jl4 jl4Var, CharSequence charSequence, e14 e14Var) {
            gl4 H = H(jl4Var);
            H.V(e14Var);
            return H;
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: R */
        public gl4 i(jl4 jl4Var, CharSequence charSequence, e14 e14Var, gl4 gl4Var, gl4 gl4Var2) {
            return h(jl4Var, charSequence, e14Var);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: S */
        public gl4 m(byte[] bArr, CharSequence charSequence) {
            return H(new jl4(bArr, bArr.length, 0, bArr.length > 6, false));
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: S3 */
        public il4 m0() {
            return this.w;
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: T */
        public gl4 I(kl4[] kl4VarArr) {
            return H(u(kl4VarArr));
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: U */
        public gl4 J(kl4[] kl4VarArr, Integer num) {
            return H(p(kl4VarArr, num));
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: V */
        public gl4 L(kl4[] kl4VarArr, Integer num, boolean z) {
            return J(kl4VarArr, num);
        }

        @Override // com.p7700g.p99005.s64
        /* renamed from: X */
        public jl4 p(kl4[] kl4VarArr, Integer num) {
            jl4 jl4Var = new jl4(false, kl4VarArr, 0, kl4VarArr.length > 6);
            jl4Var.U4(num);
            return jl4Var;
        }

        public jl4 X0(long j, int i, boolean z, Integer num) {
            jl4 jl4Var = new jl4(j, i, z);
            jl4Var.U4(num);
            return jl4Var;
        }

        public jl4 X2(byte[] bArr, int i, int i2, boolean z, Integer num) {
            jl4 jl4Var = new jl4(bArr, 0, bArr.length, i2, i, z, true);
            jl4Var.U4(num);
            return jl4Var;
        }

        @Override // com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: Z */
        public jl4 t(kl4[] kl4VarArr, Integer num, boolean z) {
            return p(kl4VarArr, num);
        }

        public jl4 c1(n04.b bVar, n04.b bVar2, int i, boolean z) {
            return new jl4(bVar, bVar2, i, z);
        }

        public jl4 d1(n04.b bVar, n04.b bVar2, int i, boolean z, Integer num) {
            jl4 jl4Var = new jl4(bVar, bVar2, i, z);
            jl4Var.U4(num);
            return jl4Var;
        }

        public jl4 d3(byte[] bArr, int i, boolean z) {
            return new jl4(bArr, i, z);
        }

        @Override // com.p7700g.p99005.s64
        public void f() {
            super.f();
            this.v.f();
        }

        public jl4 i3(byte[] bArr, int i, boolean z, Integer num) {
            jl4 jl4Var = new jl4(bArr, i, z);
            jl4Var.U4(num);
            return jl4Var;
        }

        public jl4 j3(kl4[] kl4VarArr, boolean z) {
            return new jl4(kl4VarArr, 0, z);
        }

        public jl4 k3(kl4[] kl4VarArr, boolean z, Integer num) {
            jl4 jl4Var = new jl4(kl4VarArr, 0, z);
            jl4Var.U4(num);
            return jl4Var;
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: n3 */
        public jl4 M(byte[] bArr, int i, Integer num, boolean z) {
            jl4 jl4Var = new jl4(bArr, i, 0, i > 6, false);
            jl4Var.U4(num);
            return jl4Var;
        }

        @Override // com.p7700g.p99005.d34, com.p7700g.p99005.s64
        /* renamed from: p3 */
        public jl4 u(kl4[] kl4VarArr) {
            return new jl4(false, kl4VarArr, 0, kl4VarArr.length > 6);
        }

        @Override // com.p7700g.p99005.d34
        /* renamed from: t3 */
        public jl4 N(kl4[] kl4VarArr, int i, boolean z) {
            return new jl4(false, kl4VarArr, i, z);
        }

        public kl4 w0(int i, int i2) {
            if (i != i2) {
                if (i == 0 && i2 == 255) {
                    kl4 kl4Var = this.v.t;
                    if (kl4Var == null) {
                        C0196a c0196a = this.v;
                        kl4 kl4Var2 = new kl4(0, i2);
                        c0196a.t = kl4Var2;
                        return kl4Var2;
                    }
                    return kl4Var;
                }
                return new kl4(i, i2);
            }
            return b(i);
        }

        public jl4 w3(kl4[] kl4VarArr, boolean z) {
            return new jl4(false, kl4VarArr, 0, z);
        }

        public jl4 x0(long j, int i, boolean z) {
            return new jl4(j, i, z);
        }

        @Override // com.p7700g.p99005.s04.a
        /* renamed from: x3 */
        public kl4 b(int i) {
            if (i >= 0 && i <= 255) {
                kl4[] kl4VarArr = this.v.u;
                if (kl4VarArr == null) {
                    kl4[] kl4VarArr2 = new kl4[256];
                    this.v.u = kl4VarArr2;
                    kl4 kl4Var = new kl4(i);
                    kl4VarArr2[i] = kl4Var;
                    return kl4Var;
                }
                kl4 kl4Var2 = kl4VarArr[i];
                if (kl4Var2 == null) {
                    kl4Var2 = new kl4(i);
                    kl4VarArr[i] = kl4Var2;
                }
                return kl4Var2;
            }
            return new kl4(i);
        }

        public a(il4 il4Var, C0196a c0196a) {
            this.w = il4Var;
            this.v = c0196a;
        }
    }
}