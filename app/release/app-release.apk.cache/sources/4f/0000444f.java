package com.p7700g.p99005;

/* compiled from: IPv4JoinedSegments.java */
/* loaded from: classes3.dex */
public class gc4 extends j34 {
    private static final long O = 4;
    private static int[] P = new int[3];

    public gc4(int i, int i2) {
        super(i, i2);
        if (i >= 4) {
            throw new c14(i);
        }
    }

    private void s5(long j) {
        int i = this.L;
        if (this.M > (i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0L : 4294967295L : 16777215L : av5.s : 255L)) {
            throw new c14(this.M);
        }
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return 10;
    }

    @Override // com.p7700g.p99005.j34, com.p7700g.p99005.f24
    public int Q() {
        int[] iArr = P;
        int i = this.L;
        int i2 = iArr[i - 1];
        if (i2 == 0) {
            int Q = super.Q();
            iArr[i - 1] = Q;
            return Q;
        }
        return i2;
    }

    @Override // com.p7700g.p99005.j34, com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gc4) {
            gc4 gc4Var = (gc4) obj;
            return this.L == gc4Var.L && gc4Var.r5(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.h34
    public long k5(int i) {
        return ~((-1) << (((this.L + 1) * 8) - i));
    }

    @Override // com.p7700g.p99005.h34
    public long l5(int i) {
        int i2 = (this.L + 1) * 8;
        long j = ~((-1) << i2);
        return j & (j << (i2 - i));
    }

    @Override // com.p7700g.p99005.j34
    public int u2() {
        return 8;
    }

    @Override // com.p7700g.p99005.j34, com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        return (f24Var instanceof gc4) && super.x3(f24Var);
    }

    public gc4(int i, long j, Integer num) {
        super(i, j, num);
        if (i < 4) {
            if (num != null && num.intValue() > 32) {
                throw new y14(num.intValue());
            }
            s5(j);
            return;
        }
        throw new c14(i);
    }

    public gc4(int i, long j, long j2, Integer num) {
        super(i, j, j2, num);
        if (i < 4) {
            if (num != null && num.intValue() > 32) {
                throw new y14(num.intValue());
            }
            s5(L4());
            return;
        }
        throw new c14(i);
    }
}