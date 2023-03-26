package com.p7700g.p99005;

import com.p7700g.p99005.il4;
import com.p7700g.p99005.p64;

/* compiled from: ParsedMACAddress.java */
/* loaded from: classes3.dex */
public class x64 extends p64 implements r64 {
    private static final long F0 = 4;
    private final v14 G0;
    private gl4 H0;

    public x64(v14 v14Var, CharSequence charSequence) {
        super(charSequence);
        this.G0 = v14Var;
    }

    private <S extends kl4> S C3(CharSequence charSequence, int i, int i2, boolean z, k64 k64Var, int i3, s64<?, ?, ?, S> s64Var) {
        if (!z) {
            return s64Var.c(i, i2, null);
        }
        return s64Var.B(i, i2, null, charSequence, i, i2, k64Var.m(i3, 262144), k64Var.m(i3, 524288), k64Var.n(i3, 6), k64Var.n(i3, 7), k64Var.n(i3, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (n3() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        r0 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private jl4 E3() {
        int i;
        kl4[] kl4VarArr;
        int i2;
        il4.a aVar;
        p64.a aVar2;
        int i3;
        int i4;
        il4.a aVar3;
        p64.a aVar4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        CharSequence charSequence = this.A0;
        k64 i32 = i3();
        int V0 = i32.V0();
        il4.a I3 = I3();
        p64.a j3 = j3();
        int i7 = 6;
        int i8 = 8;
        if (j3 != null) {
            if (j3 == p64.a.DOTTED) {
                int i9 = n3() ? 4 : 3;
                if (V0 > 3 || n3()) {
                    i7 = i9;
                } else {
                    i7 = i9;
                    i8 = 6;
                }
            } else {
                if (!i32.L()) {
                }
                i8 = i7;
            }
        }
        int i10 = i7 - V0;
        boolean z4 = i10 <= 0;
        kl4[] d = I3.d(i8);
        int i11 = i10;
        boolean z5 = z4;
        int i12 = 0;
        int i13 = 0;
        while (i12 < V0) {
            long x = i32.x(i12, 2);
            long x2 = i32.x(i12, 10);
            if (j3 == p64.a.DOTTED) {
                int i14 = (int) x;
                int i15 = i14 >>> 8;
                int i16 = (int) x2;
                int i17 = i16 >>> 8;
                int i18 = i14 & 255;
                int i19 = i16 & 255;
                if (i15 != i17 && i19 - i18 != 255) {
                    throw new t14(charSequence, "ipaddress.error.invalid.joined.ranges");
                }
                int i20 = i13 + 1;
                i = i12;
                kl4VarArr = d;
                il4.a aVar5 = I3;
                kl4VarArr[i13] = G3(charSequence, i15, i17, false, i32, i12, aVar5);
                kl4VarArr[i20] = G3(charSequence, i18, i19, false, i32, i12, aVar5);
                i13 = i20;
            } else {
                i = i12;
                kl4VarArr = d;
                if (i32.L() || k3()) {
                    int i21 = i;
                    int i22 = i21 == V0 + (-1) ? i11 : 2;
                    i11 -= i22;
                    boolean z6 = x != x2;
                    int i23 = i13;
                    boolean z7 = true;
                    int i24 = i22;
                    boolean z8 = false;
                    while (i24 >= 0) {
                        if (z6) {
                            int i25 = i24 << 3;
                            i4 = V0;
                            aVar3 = I3;
                            int i26 = ((int) (x >>> i25)) & 255;
                            aVar4 = j3;
                            int i27 = ((int) (x2 >>> i25)) & 255;
                            if (z8 && i27 - i26 != 255) {
                                throw new t14(charSequence, "ipaddress.error.invalid.joined.ranges");
                            }
                            boolean z9 = i26 != i27;
                            if (i24 != 0 || i26 != x) {
                                z7 = false;
                            } else if (i27 != x2) {
                                i32.d3(i21, 524288);
                            }
                            z2 = z7;
                            i6 = i27;
                            i5 = i26;
                            z = z9;
                        } else {
                            i4 = V0;
                            aVar3 = I3;
                            aVar4 = j3;
                            i5 = ((int) (x >> (i24 << 3))) & 255;
                            if (i24 == 0 && i5 == x) {
                                z = z8;
                                z2 = z7;
                                i6 = i5;
                            } else {
                                z = z8;
                                i6 = i5;
                                z2 = false;
                            }
                        }
                        kl4VarArr[i23] = G3(charSequence, i5, i6, z2, i32, i21, aVar3);
                        i23++;
                        i24--;
                        z8 = z;
                        z7 = z2;
                        i21 = i21;
                        V0 = i4;
                        I3 = aVar3;
                        j3 = aVar4;
                        x2 = x2;
                        x = x;
                    }
                    i2 = V0;
                    aVar = I3;
                    aVar2 = j3;
                    i3 = i21;
                    i13 = i23;
                    i12 = i3 + 1;
                    d = kl4VarArr;
                    V0 = i2;
                    I3 = aVar;
                    j3 = aVar2;
                } else {
                    kl4VarArr[i13] = G3(charSequence, (int) x, (int) x2, true, i32, i, I3);
                }
            }
            int i28 = i;
            if (!z5 && i32.M(i28)) {
                int i29 = i28 + 1;
                while (true) {
                    if (i29 >= V0) {
                        z3 = true;
                        break;
                    } else if (i32.M(i29)) {
                        z3 = false;
                        break;
                    } else {
                        i29++;
                    }
                }
                if (z3) {
                    int i30 = i11;
                    while (true) {
                        int i31 = i30 - 1;
                        if (i30 <= 0) {
                            break;
                        }
                        if (j3 == p64.a.DOTTED) {
                            kl4 G3 = G3(charSequence, 0, 255, false, i32, i28, I3);
                            int i33 = i13 + 1;
                            kl4VarArr[i33] = G3;
                            i13 = i33 + 1;
                            kl4VarArr[i13] = G3;
                        } else {
                            i13++;
                            kl4VarArr[i13] = G3(charSequence, 0, 255, false, i32, i28, I3);
                        }
                        i30 = i31;
                    }
                    z5 = true;
                }
            }
            i13++;
            i2 = V0;
            aVar = I3;
            aVar2 = j3;
            i3 = i28;
            i12 = i3 + 1;
            d = kl4VarArr;
            V0 = i2;
            I3 = aVar;
            j3 = aVar2;
        }
        return (jl4) I3.u(d);
    }

    private <S extends kl4> S G3(CharSequence charSequence, int i, int i2, boolean z, k64 k64Var, int i3, s64<?, ?, ?, S> s64Var) {
        if (i != i2) {
            return (S) C3(charSequence, i, i2, z, k64Var, i3, s64Var);
        }
        if (!z) {
            return s64Var.c(i, i, null);
        }
        return s64Var.D(i, null, charSequence, i, k64Var.m(i3, 262144), k64Var.n(i3, 6), k64Var.n(i3, 7));
    }

    private il4.a I3() {
        return this.G0.f().p().g();
    }

    @Override // com.p7700g.p99005.r64
    public gl4 a1() {
        if (this.H0 == null) {
            synchronized (this) {
                if (this.H0 == null) {
                    this.H0 = x3();
                    N();
                }
            }
        }
        return this.H0;
    }

    public gl4 x3() {
        return (gl4) I3().g(E3(), this.G0);
    }
}