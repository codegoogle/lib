package com.p7700g.p99005;

import com.p7700g.p99005.wy1;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes2.dex */
public class cz1 implements wy1, vy1 {
    @z1
    private final wy1 a;
    private final Object b;
    private volatile vy1 c;
    private volatile vy1 d;
    @k1("requestLock")
    private wy1.a e;
    @k1("requestLock")
    private wy1.a f;
    @k1("requestLock")
    private boolean g;

    public cz1(Object obj, @z1 wy1 wy1Var) {
        wy1.a aVar = wy1.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = wy1Var;
    }

    @k1("requestLock")
    private boolean l() {
        wy1 wy1Var = this.a;
        return wy1Var == null || wy1Var.k(this);
    }

    @k1("requestLock")
    private boolean m() {
        wy1 wy1Var = this.a;
        return wy1Var == null || wy1Var.e(this);
    }

    @k1("requestLock")
    private boolean n() {
        wy1 wy1Var = this.a;
        return wy1Var == null || wy1Var.g(this);
    }

    @Override // com.p7700g.p99005.wy1
    public void a(vy1 vy1Var) {
        synchronized (this.b) {
            if (!vy1Var.equals(this.c)) {
                this.f = wy1.a.FAILED;
                return;
            }
            this.e = wy1.a.FAILED;
            wy1 wy1Var = this.a;
            if (wy1Var != null) {
                wy1Var.a(this);
            }
        }
    }

    @Override // com.p7700g.p99005.wy1, com.p7700g.p99005.vy1
    public boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.d.b() || this.c.b();
        }
        return z;
    }

    @Override // com.p7700g.p99005.wy1
    public wy1 c() {
        wy1 c;
        synchronized (this.b) {
            wy1 wy1Var = this.a;
            c = wy1Var != null ? wy1Var.c() : this;
        }
        return c;
    }

    @Override // com.p7700g.p99005.vy1
    public void clear() {
        synchronized (this.b) {
            this.g = false;
            wy1.a aVar = wy1.a.CLEARED;
            this.e = aVar;
            this.f = aVar;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean d(vy1 vy1Var) {
        if (vy1Var instanceof cz1) {
            cz1 cz1Var = (cz1) vy1Var;
            if (this.c == null) {
                if (cz1Var.c != null) {
                    return false;
                }
            } else if (!this.c.d(cz1Var.c)) {
                return false;
            }
            if (this.d == null) {
                if (cz1Var.d != null) {
                    return false;
                }
            } else if (!this.d.d(cz1Var.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.wy1
    public boolean e(vy1 vy1Var) {
        boolean z;
        synchronized (this.b) {
            z = m() && vy1Var.equals(this.c) && !b();
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public boolean f() {
        boolean z;
        synchronized (this.b) {
            z = this.e == wy1.a.CLEARED;
        }
        return z;
    }

    @Override // com.p7700g.p99005.wy1
    public boolean g(vy1 vy1Var) {
        boolean z;
        synchronized (this.b) {
            z = n() && (vy1Var.equals(this.c) || this.e != wy1.a.SUCCESS);
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public void h() {
        synchronized (this.b) {
            this.g = true;
            if (this.e != wy1.a.SUCCESS) {
                wy1.a aVar = this.f;
                wy1.a aVar2 = wy1.a.RUNNING;
                if (aVar != aVar2) {
                    this.f = aVar2;
                    this.d.h();
                }
            }
            if (this.g) {
                wy1.a aVar3 = this.e;
                wy1.a aVar4 = wy1.a.RUNNING;
                if (aVar3 != aVar4) {
                    this.e = aVar4;
                    this.c.h();
                }
            }
            this.g = false;
        }
    }

    @Override // com.p7700g.p99005.wy1
    public void i(vy1 vy1Var) {
        synchronized (this.b) {
            if (vy1Var.equals(this.d)) {
                this.f = wy1.a.SUCCESS;
                return;
            }
            this.e = wy1.a.SUCCESS;
            wy1 wy1Var = this.a;
            if (wy1Var != null) {
                wy1Var.i(this);
            }
            if (!this.f.f()) {
                this.d.clear();
            }
        }
    }

    @Override // com.p7700g.p99005.vy1
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == wy1.a.RUNNING;
        }
        return z;
    }

    @Override // com.p7700g.p99005.vy1
    public boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == wy1.a.SUCCESS;
        }
        return z;
    }

    @Override // com.p7700g.p99005.wy1
    public boolean k(vy1 vy1Var) {
        boolean z;
        synchronized (this.b) {
            z = l() && vy1Var.equals(this.c) && this.e != wy1.a.PAUSED;
        }
        return z;
    }

    public void o(vy1 vy1Var, vy1 vy1Var2) {
        this.c = vy1Var;
        this.d = vy1Var2;
    }

    @Override // com.p7700g.p99005.vy1
    public void pause() {
        synchronized (this.b) {
            if (!this.f.f()) {
                this.f = wy1.a.PAUSED;
                this.d.pause();
            }
            if (!this.e.f()) {
                this.e = wy1.a.PAUSED;
                this.c.pause();
            }
        }
    }
}