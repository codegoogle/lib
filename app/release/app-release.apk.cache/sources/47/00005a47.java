package com.p7700g.p99005;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* loaded from: classes.dex */
public final class rm {

    /* compiled from: ExecutorCompat.java */
    /* loaded from: classes.dex */
    public static class a implements Executor {
        private final Handler s;

        public a(@x1 Handler handler) {
            this.s = (Handler) jp.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            if (this.s.post((Runnable) jp.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.s + " is shutting down");
        }
    }

    private rm() {
    }

    @x1
    public static Executor a(@x1 Handler handler) {
        return new a(handler);
    }
}