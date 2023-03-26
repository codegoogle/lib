package com.p7700g.p99005;

/* compiled from: SimpleTarget.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class qz1<Z> extends ez1<Z> {
    private final int t;
    private final int u;

    public qz1() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.p7700g.p99005.sz1
    public void b(@x1 rz1 rz1Var) {
    }

    @Override // com.p7700g.p99005.sz1
    public final void q(@x1 rz1 rz1Var) {
        if (z02.w(this.t, this.u)) {
            rz1Var.e(this.t, this.u);
            return;
        }
        StringBuilder G = wo1.G("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        G.append(this.t);
        G.append(" and height: ");
        throw new IllegalArgumentException(wo1.z(G, this.u, ", either provide dimensions in the constructor or call override()"));
    }

    public qz1(int i, int i2) {
        this.t = i;
        this.u = i2;
    }
}