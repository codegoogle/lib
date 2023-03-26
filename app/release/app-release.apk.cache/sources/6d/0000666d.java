package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* loaded from: classes2.dex */
public class xy1<R> implements uy1<R>, yy1<R> {
    private static final a s = new a();
    @k1("this")
    private boolean A;
    @k1("this")
    private boolean B;
    @z1
    @k1("this")
    private xr1 C;
    private final int t;
    private final int u;
    private final boolean v;
    private final a w;
    @z1
    @k1("this")
    private R x;
    @z1
    @k1("this")
    private vy1 y;
    @k1("this")
    private boolean z;

    /* compiled from: RequestFutureTarget.java */
    @r2
    /* loaded from: classes2.dex */
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public xy1(int i, int i2) {
        this(i, i2, true, s);
    }

    private synchronized R f(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.v && !isDone()) {
            z02.a();
        }
        if (!this.z) {
            if (!this.B) {
                if (this.A) {
                    return this.x;
                }
                if (l == null) {
                    this.w.b(this, 0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        this.w.b(this, longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.B) {
                        if (!this.z) {
                            if (this.A) {
                                return this.x;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.C);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.C);
        }
        throw new CancellationException();
    }

    @Override // com.p7700g.p99005.sz1
    public void b(@x1 rz1 rz1Var) {
    }

    @Override // com.p7700g.p99005.sz1
    public synchronized void c(@x1 R r, @z1 a02<? super R> a02Var) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.z = true;
            this.w.a(this);
            vy1 vy1Var = null;
            if (z) {
                vy1 vy1Var2 = this.y;
                this.y = null;
                vy1Var = vy1Var2;
            }
            if (vy1Var != null) {
                vy1Var.clear();
            }
            return true;
        }
    }

    @Override // com.p7700g.p99005.yy1
    public synchronized boolean d(@z1 xr1 xr1Var, Object obj, sz1<R> sz1Var, boolean z) {
        this.B = true;
        this.C = xr1Var;
        this.w.a(this);
        return false;
    }

    @Override // com.p7700g.p99005.yy1
    public synchronized boolean e(R r, Object obj, sz1<R> sz1Var, aq1 aq1Var, boolean z) {
        this.A = true;
        this.x = r;
        this.w.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return f(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.z;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.z && !this.A) {
            z = this.B;
        }
        return z;
    }

    @Override // com.p7700g.p99005.sz1
    public synchronized void j(@z1 vy1 vy1Var) {
        this.y = vy1Var;
    }

    @Override // com.p7700g.p99005.sz1
    public synchronized void k(@z1 Drawable drawable) {
    }

    @Override // com.p7700g.p99005.sz1
    public void l(@z1 Drawable drawable) {
    }

    @Override // com.p7700g.p99005.sz1
    @z1
    public synchronized vy1 m() {
        return this.y;
    }

    @Override // com.p7700g.p99005.wx1
    public void onDestroy() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStart() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStop() {
    }

    @Override // com.p7700g.p99005.sz1
    public void p(@z1 Drawable drawable) {
    }

    @Override // com.p7700g.p99005.sz1
    public void q(@x1 rz1 rz1Var) {
        rz1Var.e(this.t, this.u);
    }

    public String toString() {
        vy1 vy1Var;
        String str;
        String C = wo1.C(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            vy1Var = null;
            if (this.z) {
                str = "CANCELLED";
            } else if (this.B) {
                str = "FAILURE";
            } else if (this.A) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                vy1Var = this.y;
            }
        }
        if (vy1Var != null) {
            return C + str + ", request=[" + vy1Var + "]]";
        }
        return wo1.u(C, str, "]");
    }

    public xy1(int i, int i2, boolean z, a aVar) {
        this.t = i;
        this.u = i2;
        this.v = z;
        this.w = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @x1 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return f(Long.valueOf(timeUnit.toMillis(j)));
    }
}