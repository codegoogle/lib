package com.p7700g.p99005;

/* compiled from: AddressBitsDivision.java */
/* loaded from: classes3.dex */
public class c34 extends e34 {
    private static final long G = 4;
    public final int H;
    public final int I;
    private final int J;
    private final int K;

    public c34(int i, int i2, int i3) {
        if (i >= 0) {
            this.I = i;
            this.H = i;
            this.J = i2;
            this.K = i3;
            return;
        }
        throw new c14(i);
    }

    @Override // com.p7700g.p99005.l24
    public int A0() {
        return this.J;
    }

    @Override // com.p7700g.p99005.e34
    public long G4() {
        return this.H;
    }

    @Override // com.p7700g.p99005.f24
    public int H() {
        return this.K;
    }

    @Override // com.p7700g.p99005.e34
    public long L4() {
        return this.I;
    }

    @Override // com.p7700g.p99005.f24
    public int Q() {
        return (A0() + 3) >> 2;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c34) {
            c34 c34Var = (c34) obj;
            return A0() == c34Var.A0() && c34Var.j5(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public int hashCode() {
        return this.H | (this.I << A0());
    }

    public boolean j5(c34 c34Var) {
        return this.H == c34Var.H && this.I == c34Var.I;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public boolean x3(f24 f24Var) {
        if (f24Var instanceof c34) {
            return j5((c34) f24Var);
        }
        return false;
    }

    @Override // com.p7700g.p99005.e34, com.p7700g.p99005.f24
    public byte[] y(boolean z) {
        if (z) {
            int i = this.H;
            return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
        }
        int i2 = this.H;
        int i3 = this.I;
        return new byte[]{(byte) (i2 >>> 24), (byte) (i2 >>> 16), (byte) (i3 >>> 8), (byte) i3};
    }

    public c34(int i, int i2, int i3, int i4) {
        if (i >= 0 && i2 >= 0) {
            if (i > i2) {
                i2 = i;
                i = i2;
            }
            this.H = i;
            this.I = i2;
            this.J = i3;
            this.K = i4;
            return;
        }
        throw new c14(i < 0 ? i : i2);
    }
}