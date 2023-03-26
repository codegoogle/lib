package com.p7700g.p99005;

/* compiled from: ConditionVariable.java */
/* loaded from: classes4.dex */
public class lx5 {
    private volatile boolean a;

    public synchronized void a() throws InterruptedException {
        while (!this.a) {
            wait();
        }
    }

    public synchronized void b() {
        this.a = false;
    }

    public synchronized void c() {
        boolean z = this.a;
        this.a = true;
        if (!z) {
            notify();
        }
    }

    public synchronized void d(boolean z) {
        if (z) {
            c();
        } else {
            b();
        }
    }
}