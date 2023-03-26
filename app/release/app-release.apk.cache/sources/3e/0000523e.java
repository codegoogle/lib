package com.p7700g.p99005;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public class nf0 implements Executor {
    private final Executor t;
    private volatile Runnable v;
    private final ArrayDeque<a> s = new ArrayDeque<>();
    private final Object u = new Object();

    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final nf0 s;
        public final Runnable t;

        public a(@x1 nf0 serialExecutor, @x1 Runnable runnable) {
            this.s = serialExecutor;
            this.t = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.t.run();
            } finally {
                this.s.c();
            }
        }
    }

    public nf0(@x1 Executor executor) {
        this.t = executor;
    }

    @x1
    @r2
    public Executor a() {
        return this.t;
    }

    public boolean b() {
        boolean z;
        synchronized (this.u) {
            z = !this.s.isEmpty();
        }
        return z;
    }

    public void c() {
        synchronized (this.u) {
            a poll = this.s.poll();
            this.v = poll;
            if (poll != null) {
                this.t.execute(this.v);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@x1 Runnable command) {
        synchronized (this.u) {
            this.s.add(new a(this, command));
            if (this.v == null) {
                c();
            }
        }
    }
}