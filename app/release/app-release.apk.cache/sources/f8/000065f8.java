package com.p7700g.p99005;

import java.io.Closeable;

/* compiled from: CancellationTokenRegistration.java */
/* loaded from: classes.dex */
public class xp0 implements Closeable {
    private final Object s = new Object();
    @z1
    private yp0 t;
    @z1
    private Runnable u;
    private boolean v;

    public xp0(yp0 yp0Var, Runnable runnable) {
        this.t = yp0Var;
        this.u = runnable;
    }

    private void b() {
        if (this.v) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void a() {
        synchronized (this.s) {
            b();
            this.u.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.s) {
            if (this.v) {
                return;
            }
            this.v = true;
            this.t.s(this);
            this.t = null;
            this.u = null;
        }
    }
}