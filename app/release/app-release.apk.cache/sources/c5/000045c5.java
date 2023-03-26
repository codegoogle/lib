package com.p7700g.p99005;

/* compiled from: IPAddressDivision.java */
/* loaded from: classes3.dex */
public abstract class h34 extends e34 implements t24 {
    private static final long G = 4;
    private final Integer H;
    public transient String I;
    private transient Boolean J;

    public h34() {
        this(null);
    }

    @Override // com.p7700g.p99005.f24
    public String A() {
        String str = this.I;
        if (str == null) {
            synchronized (this) {
                str = this.I;
                if (str == null) {
                    str = B();
                    this.I = str;
                }
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean B3(int i) {
        return Q4(G4(), L4(), i);
    }

    @Override // com.p7700g.p99005.t24
    public boolean C0() {
        return this.H != null;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public /* synthetic */ boolean H0() {
        return s24.a(this);
    }

    @Override // com.p7700g.p99005.m34
    public boolean I0() {
        return C0() && B3(f().intValue());
    }

    @Override // com.p7700g.p99005.e34
    public boolean Q4(long j, long j2, int i) {
        if (i == 0) {
            return j == 0 && j2 == I4();
        }
        return e34.e5(j, j2, j2, l5(i), k5(i));
    }

    @Override // com.p7700g.p99005.e34
    public boolean S4(long j, long j2, int i) {
        return e34.e5(j, j, j2, l5(i), k5(i));
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.l24
    public boolean Y2(int i) {
        return S4(G4(), L4(), i);
    }

    @Override // com.p7700g.p99005.m34
    public boolean b1() {
        if (this.J == null) {
            this.J = Boolean.valueOf(C0() && Y2(f().intValue()));
        }
        return this.J.booleanValue();
    }

    @Override // com.p7700g.p99005.m34
    public Integer f() {
        return this.H;
    }

    @Override // com.p7700g.p99005.f24, com.p7700g.p99005.m34
    public int g(int i, z44 z44Var, StringBuilder sb) {
        return super.g(i, z44Var, sb);
    }

    public Integer j5(boolean z) {
        long G4;
        int n5 = n5(z);
        if (z) {
            G4 = (~G4()) & I4();
        } else {
            G4 = G4();
        }
        if ((G4 >>> n5) == 0) {
            return f34.b(A0() - n5);
        }
        return null;
    }

    @Override // com.p7700g.p99005.f24
    public String k3() {
        String str = this.I;
        if (str == null) {
            synchronized (this) {
                str = this.I;
                if (str == null) {
                    if (!b1() && z3()) {
                        if (!H0() || (str = G()) == null) {
                            long L4 = L4();
                            if (I0()) {
                                L4 &= l5(f().intValue());
                            }
                            str = E4(G4(), L4, H());
                        }
                        this.I = str;
                    }
                    str = B();
                    this.I = str;
                }
            }
        }
        return str;
    }

    public abstract long k5(int i);

    public abstract long l5(int i);

    public int m5(boolean z) {
        int numberOfLeadingZeros;
        int A0 = 64 - A0();
        if (z) {
            numberOfLeadingZeros = Long.numberOfLeadingZeros((~G4()) & I4());
        } else {
            numberOfLeadingZeros = Long.numberOfLeadingZeros(G4());
        }
        return numberOfLeadingZeros - A0;
    }

    public int n5(boolean z) {
        if (z) {
            return Long.numberOfTrailingZeros(G4() | ((-1) << A0()));
        }
        return Long.numberOfTrailingZeros(~G4());
    }

    public boolean o5(long j, int i) {
        return S4(j, L4(), i);
    }

    public boolean p5(long j, Integer num) {
        if (num == null) {
            return X4(j);
        }
        long l5 = l5(num.intValue());
        long j2 = j & l5;
        return j2 == (G4() & l5) && j2 == (l5 & L4());
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public void t3(int i, boolean z, StringBuilder sb) {
        f24.N3(L4() & l5(f().intValue()), i, 0, z, z ? f24.y : f24.x, sb);
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public String w3() {
        String str = this.B;
        if (str == null) {
            synchronized (this) {
                str = this.B;
                if (str == null) {
                    if (C0() && z3()) {
                        if (!H0() || (str = G()) == null) {
                            str = E();
                        }
                        this.B = str;
                    }
                    str = k3();
                    this.B = str;
                }
            }
        }
        return str;
    }

    public h34(Integer num) {
        if (num != null && num.intValue() < 0) {
            throw new y14(num.intValue());
        }
        this.H = num;
    }
}