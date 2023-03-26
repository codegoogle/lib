package com.p7700g.p99005;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes.dex */
public class cv {
    private static final int a = 15;

    /* compiled from: ConcurrencyHelpers.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private cv() {
    }

    @x1
    @Deprecated
    public static Executor a(@x1 final Handler handler) {
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.p7700g.p99005.bv
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public static ThreadPoolExecutor b(@x1 final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.p7700g.p99005.yu
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return cv.c(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static /* synthetic */ Thread c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    public static Handler d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}