package com.p7700g.p99005;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.java */
/* loaded from: classes.dex */
public class o50 implements Executor {
    private final Executor s;
    private final ArrayDeque<Runnable> t = new ArrayDeque<>();
    private Runnable u;

    /* compiled from: TransactionExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable s;

        public a(Runnable runnable) {
            this.s = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.s.run();
            } finally {
                o50.this.a();
            }
        }
    }

    public o50(@x1 Executor executor) {
        this.s = executor;
    }

    public synchronized void a() {
        Runnable poll = this.t.poll();
        this.u = poll;
        if (poll != null) {
            this.s.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.t.offer(new a(runnable));
        if (this.u == null) {
            a();
        }
    }
}