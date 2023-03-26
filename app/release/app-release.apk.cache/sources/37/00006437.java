package com.p7700g.p99005;

/* compiled from: EngineResource.java */
/* loaded from: classes2.dex */
public class wr1<Z> implements cs1<Z> {
    private final boolean s;
    private final boolean t;
    private final cs1<Z> u;
    private final a v;
    private final gq1 w;
    private int x;
    private boolean y;

    /* compiled from: EngineResource.java */
    /* loaded from: classes2.dex */
    public interface a {
        void d(gq1 gq1Var, wr1<?> wr1Var);
    }

    public wr1(cs1<Z> cs1Var, boolean z, boolean z2, gq1 gq1Var, a aVar) {
        this.u = (cs1) x02.d(cs1Var);
        this.s = z;
        this.t = z2;
        this.w = gq1Var;
        this.v = (a) x02.d(aVar);
    }

    @Override // com.p7700g.p99005.cs1
    public synchronized void a() {
        if (this.x <= 0) {
            if (!this.y) {
                this.y = true;
                if (this.t) {
                    this.u.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public synchronized void b() {
        if (!this.y) {
            this.x++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return this.u.c();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<Z> d() {
        return this.u.d();
    }

    public cs1<Z> e() {
        return this.u;
    }

    public boolean f() {
        return this.s;
    }

    public void g() {
        boolean z;
        synchronized (this) {
            int i = this.x;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.x = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.v.d(this.w, this);
        }
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Z get() {
        return this.u.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.s + ", listener=" + this.v + ", key=" + this.w + ", acquired=" + this.x + ", isRecycled=" + this.y + ", resource=" + this.u + '}';
    }
}