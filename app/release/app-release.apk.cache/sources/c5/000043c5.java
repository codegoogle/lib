package com.p7700g.p99005;

/* compiled from: IPAddressBitsDivision.java */
/* loaded from: classes3.dex */
public class g34 extends h34 {
    private static final long K = 4;
    private final int L;
    private final int M;
    private final int N;
    private final long O;
    private final long P;
    private final long Q;

    public g34(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, null, null);
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return this.L;
    }

    @Override // com.p7700g.p99005.e34
    public long G4() {
        return this.O;
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return this.M;
    }

    @Override // com.p7700g.p99005.e34
    public long L4() {
        return this.P;
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return this.N;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g34) {
            g34 g34Var = (g34) obj;
            return A0() == g34Var.A0() && g34Var.q5(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.h34
    public long k5(int i) {
        return ~((-1) << (this.L - i));
    }

    @Override // com.p7700g.p99005.h34
    public long l5(int i) {
        return this.Q & ((-1) << (this.L - i));
    }

    public boolean q5(g34 g34Var) {
        return this.O == g34Var.O && this.P == g34Var.P;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        if (f24Var instanceof g34) {
            return q5((g34) f24Var);
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g34(long j, long j2, int i, int i2, l14<?, ?, ?, ?, ?> l14Var, Integer num) {
        super(num);
        if (num == null) {
            num = null;
        } else if (i < num.intValue()) {
            num = f34.b(i);
        }
        this.L = i;
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 < 0 || j2 < 0) {
            throw new c14(i3 >= 0 ? j2 : j);
        }
        if (j <= j2) {
            j = j2;
            j2 = j;
        }
        long j3 = ~((-1) << i);
        if (j <= j3) {
            Integer f = f();
            if (f != null && f.intValue() < i && l14Var.i().f()) {
                long intValue = (-1) << (i - f.intValue());
                this.O = j2 & intValue;
                this.P = j | (~intValue);
            } else {
                this.O = j2;
                this.P = j;
            }
            this.M = i2;
            this.Q = j3;
            this.N = f24.R(i2, i, j3);
            return;
        }
        throw new c14(j);
    }
}