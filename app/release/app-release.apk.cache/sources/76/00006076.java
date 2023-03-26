package com.p7700g.p99005;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: BoltsExecutors.java */
/* loaded from: classes.dex */
public final class up0 {
    private static final up0 a = new up0();
    @x1
    private final ExecutorService b;
    private final ScheduledExecutorService c;
    @x1
    private final Executor d;

    /* compiled from: BoltsExecutors.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        private static final int s = 15;
        @x1
        private ThreadLocal<Integer> t;

        private b() {
            this.t = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.t.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.t.remove();
            } else {
                this.t.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.t.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.t.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    up0.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    private up0() {
        ExecutorService b2;
        if (!c()) {
            b2 = Executors.newCachedThreadPool();
        } else {
            b2 = tp0.b();
        }
        this.b = b2;
        this.c = Executors.newSingleThreadScheduledExecutor();
        this.d = new b();
    }

    @x1
    public static ExecutorService a() {
        return a.b;
    }

    @x1
    public static Executor b() {
        return a.d;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(pt0.a);
    }

    public static ScheduledExecutorService d() {
        return a.c;
    }
}