package com.p7700g.p99005;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public class u20 implements i30 {
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    public final i30 w;
    public int x = 0;
    public int y = -1;
    public int z = -1;
    public Object A = null;

    public u20(@x1 i30 i30Var) {
        this.w = i30Var;
    }

    @Override // com.p7700g.p99005.i30
    public void a(int i, int i2) {
        c();
        this.w.a(i, i2);
    }

    @Override // com.p7700g.p99005.i30
    public void b(int i, int i2) {
        int i3;
        if (this.x == 1 && i >= (i3 = this.y)) {
            int i4 = this.z;
            if (i <= i3 + i4) {
                this.z = i4 + i2;
                this.y = Math.min(i, i3);
                return;
            }
        }
        c();
        this.y = i;
        this.z = i2;
        this.x = 1;
    }

    public void c() {
        int i = this.x;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.w.b(this.y, this.z);
        } else if (i == 2) {
            this.w.d(this.y, this.z);
        } else if (i == 3) {
            this.w.f(this.y, this.z, this.A);
        }
        this.A = null;
        this.x = 0;
    }

    @Override // com.p7700g.p99005.i30
    public void d(int i, int i2) {
        int i3;
        if (this.x == 2 && (i3 = this.y) >= i && i3 <= i + i2) {
            this.z += i2;
            this.y = i;
            return;
        }
        c();
        this.y = i;
        this.z = i2;
        this.x = 2;
    }

    @Override // com.p7700g.p99005.i30
    public void f(int i, int i2, Object obj) {
        int i3;
        if (this.x == 3) {
            int i4 = this.y;
            int i5 = this.z;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.A == obj) {
                this.y = Math.min(i, i4);
                this.z = Math.max(i5 + i4, i3) - this.y;
                return;
            }
        }
        c();
        this.y = i;
        this.z = i2;
        this.A = obj;
        this.x = 3;
    }
}