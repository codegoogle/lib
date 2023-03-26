package com.p7700g.p99005;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: CancellationTokenSource.java */
/* loaded from: classes.dex */
public class yp0 implements Closeable {
    private final Object s = new Object();
    private final List<xp0> t = new ArrayList();
    private final ScheduledExecutorService u = up0.d();
    @z1
    private ScheduledFuture<?> v;
    private boolean w;
    private boolean x;

    /* compiled from: CancellationTokenSource.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (yp0.this.s) {
                yp0.this.v = null;
            }
            yp0.this.d();
        }
    }

    private void f(long j, TimeUnit timeUnit) {
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if (j == 0) {
            d();
            return;
        }
        synchronized (this.s) {
            if (this.w) {
                return;
            }
            h();
            if (i != 0) {
                this.v = this.u.schedule(new a(), j, timeUnit);
            }
        }
    }

    private void h() {
        ScheduledFuture<?> scheduledFuture = this.v;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.v = null;
        }
    }

    private void l(List<xp0> list) {
        for (xp0 xp0Var : list) {
            xp0Var.a();
        }
    }

    private void r() {
        if (this.x) {
            throw new IllegalStateException("Object already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.s) {
            if (this.x) {
                return;
            }
            h();
            Iterator it = new ArrayList(this.t).iterator();
            while (it.hasNext()) {
                ((xp0) it.next()).close();
            }
            this.t.clear();
            this.x = true;
        }
    }

    public void d() {
        synchronized (this.s) {
            r();
            if (this.w) {
                return;
            }
            h();
            this.w = true;
            l(new ArrayList(this.t));
        }
    }

    public void e(long j) {
        f(j, TimeUnit.MILLISECONDS);
    }

    @x1
    public wp0 j() {
        wp0 wp0Var;
        synchronized (this.s) {
            r();
            wp0Var = new wp0(this);
        }
        return wp0Var;
    }

    public boolean k() {
        boolean z;
        synchronized (this.s) {
            r();
            z = this.w;
        }
        return z;
    }

    public xp0 m(Runnable runnable) {
        xp0 xp0Var;
        synchronized (this.s) {
            r();
            xp0Var = new xp0(this, runnable);
            if (this.w) {
                xp0Var.a();
            } else {
                this.t.add(xp0Var);
            }
        }
        return xp0Var;
    }

    public void q() throws CancellationException {
        synchronized (this.s) {
            r();
            if (this.w) {
                throw new CancellationException();
            }
        }
    }

    public void s(xp0 xp0Var) {
        synchronized (this.s) {
            r();
            this.t.remove(xp0Var);
        }
    }

    @x1
    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(k()));
    }
}