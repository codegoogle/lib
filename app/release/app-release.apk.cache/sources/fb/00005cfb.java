package com.p7700g.p99005;

import com.p7700g.p99005.wy1;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes2.dex */
public final class sy1 implements wy1, vy1 {
    private final Object a;
    @z1
    private final wy1 b;
    private volatile vy1 c;
    private volatile vy1 d;
    @k1("requestLock")
    private wy1.a e;
    @k1("requestLock")
    private wy1.a f;

    public sy1(Object obj, @z1 wy1 wy1Var) {
        wy1.a aVar = wy1.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = wy1Var;
    }

    @k1("requestLock")
    private boolean l(vy1 vy1Var) {
        return vy1Var.equals(this.c) || (this.e == wy1.a.FAILED && vy1Var.equals(this.d));
    }

    @k1("requestLock")
    private boolean m() {
        wy1 wy1Var = this.b;
        return wy1Var == null || wy1Var.k(this);
    }

    @k1("requestLock")
    private boolean n() {
        wy1 wy1Var = this.b;
        return wy1Var == null || wy1Var.e(this);
    }

    @k1("requestLock")
    private boolean o() {
        wy1 wy1Var = this.b;
        return wy1Var == null || wy1Var.g(this);
    }

    @Override // com.p7700g.p99005.wy1
    public void a(vy1 vy1Var) {
        synchronized (this.a) {
            if (!vy1Var.equals(this.d)) {
                this.e = wy1.a.FAILED;
                wy1.a aVar = this.f;
                wy1.a aVar2 = wy1.a.RUNNING;
                if (aVar != aVar2) {
                    this.f = aVar2;
                    this.d.h();
                }
                return;
            }
            this.f = wy1.a.FAILED;
            wy1 wy1Var = this.b;
            if (wy1Var != null) {
                wy1Var.a(this);
            }
        }
    }

    @Override // com.p7700g.p99005.wy1, com.p7700g.p99005.vy1
    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c.b() || this.d.b();
        }
        return z;
    }

    @Override // com.p7700g.p99005.wy1
    public wy1 c() {
        wy1 c;
        synchronized (this.a) {
            wy1 wy1Var = this.b;
            c = wy1Var != null ? wy1Var.c() : this;
        }
        return c;
    }

    @Override // com.p7700g.p99005.vy1
    public void clear() {
        synchronized (this.a) {
            wy1.a aVar = wy1.a.CLEARED;
            this.e = aVar;
            this.c.clear();
            if (this.f != aVar) {
                this.f = aVar;
                this.d.clear();
            }
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean d(vy1 vy1Var) {
        if (vy1Var instanceof sy1) {
            sy1 sy1Var = (sy1) vy1Var;
            return this.c.d(sy1Var.c) && this.d.d(sy1Var.d);
        }
        return false;
    }

    @Override // com.p7700g.p99005.wy1
    public boolean e(vy1 vy1Var) {
        boolean z;
        synchronized (this.a) {
            z = n() && l(vy1Var);
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public boolean f() {
        boolean z;
        synchronized (this.a) {
            wy1.a aVar = this.e;
            wy1.a aVar2 = wy1.a.CLEARED;
            z = aVar == aVar2 && this.f == aVar2;
        }
        return z;
    }

    @Override // com.p7700g.p99005.wy1
    public boolean g(vy1 vy1Var) {
        boolean z;
        synchronized (this.a) {
            z = o() && l(vy1Var);
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public void h() {
        synchronized (this.a) {
            wy1.a aVar = this.e;
            wy1.a aVar2 = wy1.a.RUNNING;
            if (aVar != aVar2) {
                this.e = aVar2;
                this.c.h();
            }
        }
    }

    @Override // com.p7700g.p99005.wy1
    public void i(vy1 vy1Var) {
        synchronized (this.a) {
            if (vy1Var.equals(this.c)) {
                this.e = wy1.a.SUCCESS;
            } else if (vy1Var.equals(this.d)) {
                this.f = wy1.a.SUCCESS;
            }
            wy1 wy1Var = this.b;
            if (wy1Var != null) {
                wy1Var.i(this);
            }
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            wy1.a aVar = this.e;
            wy1.a aVar2 = wy1.a.RUNNING;
            z = aVar == aVar2 || this.f == aVar2;
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public boolean j() {
        boolean z;
        synchronized (this.a) {
            wy1.a aVar = this.e;
            wy1.a aVar2 = wy1.a.SUCCESS;
            z = aVar == aVar2 || this.f == aVar2;
        }
        return z;
    }

    @Override // com.p7700g.p99005.wy1
    public boolean k(vy1 vy1Var) {
        boolean z;
        synchronized (this.a) {
            z = m() && l(vy1Var);
        }
        return z;
    }

    public void p(vy1 vy1Var, vy1 vy1Var2) {
        this.c = vy1Var;
        this.d = vy1Var2;
    }

    @Override // com.p7700g.p99005.vy1
    public void pause() {
        synchronized (this.a) {
            wy1.a aVar = this.e;
            wy1.a aVar2 = wy1.a.RUNNING;
            if (aVar == aVar2) {
                this.e = wy1.a.PAUSED;
                this.c.pause();
            }
            if (this.f == aVar2) {
                this.f = wy1.a.PAUSED;
                this.d.pause();
            }
        }
    }
}