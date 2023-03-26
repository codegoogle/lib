package com.p7700g.p99005;

/* compiled from: IPAddressJoinedSegments.java */
/* loaded from: classes3.dex */
public abstract class j34 extends h34 {
    private static final long K = 4;
    public final int L;
    public final long M;
    public final long N;

    public j34(int i, int i2) {
        if (i2 < 0) {
            throw new c14(i2);
        }
        if (i > 0) {
            long j = i2;
            this.N = j;
            this.M = j;
            this.L = i;
            return;
        }
        throw new c14(i);
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return u2() * (this.L + 1);
    }

    @Override // com.p7700g.p99005.e34
    public long G4() {
        return this.M;
    }

    @Override // com.p7700g.p99005.e34
    public long L4() {
        return this.N;
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return f24.I(I4(), H());
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j34) {
            j34 j34Var = (j34) obj;
            return A0() == j34Var.A0() && j34Var.r5(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public int hashCode() {
        return (int) (this.M | (this.N << A0()));
    }

    public int q5() {
        return this.L;
    }

    public boolean r5(j34 j34Var) {
        return this.M == j34Var.M && this.N == j34Var.N;
    }

    public abstract int u2();

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        if (f24Var instanceof j34) {
            return r5((j34) f24Var);
        }
        return false;
    }

    public j34(int i, long j, Integer num) {
        this(i, j, j, num);
    }

    public j34(int i, long j, long j2, Integer num) {
        super(num);
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 < 0 || j2 < 0) {
            throw new c14(i2 >= 0 ? j2 : j);
        } else if (i > 0) {
            if (j > j2) {
                j = j2;
                j2 = j;
            }
            this.M = j;
            this.N = j2;
            this.L = i;
        } else {
            throw new c14(i);
        }
    }
}