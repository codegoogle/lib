package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes2.dex */
public class t42 implements Executor {
    private final Executor s;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        private final Runnable s;

        public a(Runnable runnable) {
            this.s = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.s.run();
            } catch (Exception e) {
                d72.e("Executor", "Background execution failure.", e);
            }
        }
    }

    public t42(Executor executor) {
        this.s = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.s.execute(new a(runnable));
    }
}