package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class hb0 {
    @SuppressLint({"MinMaxConstant"})
    public static final int a = 20;
    @x1
    public final Executor b;
    @x1
    public final Executor c;
    @x1
    public final hc0 d;
    @x1
    public final sb0 e;
    @x1
    public final bc0 f;
    @z1
    public final qb0 g;
    @z1
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    private final boolean m;

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);
        public final /* synthetic */ boolean b;

        public a(final boolean val$isTaskExecutor) {
            this.b = val$isTaskExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder G = wo1.G(this.b ? "WM.task-" : "androidx.work-");
            G.append(this.a.incrementAndGet());
            return new Thread(runnable, G.toString());
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface c {
        @x1
        hb0 a();
    }

    public hb0(@x1 b builder) {
        Executor executor = builder.a;
        if (executor == null) {
            this.b = a(false);
        } else {
            this.b = executor;
        }
        Executor executor2 = builder.d;
        if (executor2 == null) {
            this.m = true;
            this.c = a(true);
        } else {
            this.m = false;
            this.c = executor2;
        }
        hc0 hc0Var = builder.b;
        if (hc0Var == null) {
            this.d = hc0.c();
        } else {
            this.d = hc0Var;
        }
        sb0 sb0Var = builder.c;
        if (sb0Var == null) {
            this.e = sb0.c();
        } else {
            this.e = sb0Var;
        }
        bc0 bc0Var = builder.e;
        if (bc0Var == null) {
            this.f = new ic0();
        } else {
            this.f = bc0Var;
        }
        this.i = builder.h;
        this.j = builder.i;
        this.k = builder.j;
        this.l = builder.k;
        this.g = builder.f;
        this.h = builder.g;
    }

    @x1
    private Executor a(boolean isTaskExecutor) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(isTaskExecutor));
    }

    @x1
    private ThreadFactory b(boolean isTaskExecutor) {
        return new a(isTaskExecutor);
    }

    @z1
    public String c() {
        return this.h;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public qb0 d() {
        return this.g;
    }

    @x1
    public Executor e() {
        return this.b;
    }

    @x1
    public sb0 f() {
        return this.e;
    }

    public int g() {
        return this.k;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @p1(from = com.anythink.expressad.d.a.b.aV, to = 50)
    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.l / 2;
        }
        return this.l;
    }

    public int i() {
        return this.j;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public int j() {
        return this.i;
    }

    @x1
    public bc0 k() {
        return this.f;
    }

    @x1
    public Executor l() {
        return this.c;
    }

    @x1
    public hc0 m() {
        return this.d;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean n() {
        return this.m;
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public static final class b {
        public Executor a;
        public hc0 b;
        public sb0 c;
        public Executor d;
        public bc0 e;
        @z1
        public qb0 f;
        @z1
        public String g;
        public int h;
        public int i;
        public int j;
        public int k;

        public b() {
            this.h = 4;
            this.i = 0;
            this.j = Integer.MAX_VALUE;
            this.k = 20;
        }

        @x1
        public hb0 a() {
            return new hb0(this);
        }

        @x1
        public b b(@x1 String processName) {
            this.g = processName;
            return this;
        }

        @x1
        public b c(@x1 Executor executor) {
            this.a = executor;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        public b d(@x1 qb0 exceptionHandler) {
            this.f = exceptionHandler;
            return this;
        }

        @x1
        public b e(@x1 sb0 inputMergerFactory) {
            this.c = inputMergerFactory;
            return this;
        }

        @x1
        public b f(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId >= 1000) {
                this.i = minJobSchedulerId;
                this.j = maxJobSchedulerId;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }

        @x1
        public b g(int maxSchedulerLimit) {
            if (maxSchedulerLimit >= 20) {
                this.k = Math.min(maxSchedulerLimit, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
        }

        @x1
        public b h(int loggingLevel) {
            this.h = loggingLevel;
            return this;
        }

        @x1
        public b i(@x1 bc0 runnableScheduler) {
            this.e = runnableScheduler;
            return this;
        }

        @x1
        public b j(@x1 Executor taskExecutor) {
            this.d = taskExecutor;
            return this;
        }

        @x1
        public b k(@x1 hc0 workerFactory) {
            this.b = workerFactory;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP})
        public b(@x1 hb0 configuration) {
            this.a = configuration.b;
            this.b = configuration.d;
            this.c = configuration.e;
            this.d = configuration.c;
            this.h = configuration.i;
            this.i = configuration.j;
            this.j = configuration.k;
            this.k = configuration.l;
            this.e = configuration.f;
            this.f = configuration.g;
            this.g = configuration.h;
        }
    }
}