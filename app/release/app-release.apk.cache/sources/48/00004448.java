package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.work.ListenableWorker;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class gc0 {
    public static final long a = 30000;
    @SuppressLint({"MinMaxConstant"})
    public static final long b = 18000000;
    @SuppressLint({"MinMaxConstant"})
    public static final long c = 10000;
    @x1
    private UUID d;
    @x1
    private we0 e;
    @x1
    private Set<String> f;

    /* compiled from: WorkRequest.java */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends gc0> {
        public we0 c;
        public Class<? extends ListenableWorker> e;
        public boolean a = false;
        public Set<String> d = new HashSet();
        public UUID b = UUID.randomUUID();

        public a(@x1 Class<? extends ListenableWorker> workerClass) {
            this.e = workerClass;
            this.c = new we0(this.b.toString(), workerClass.getName());
            a(workerClass.getName());
        }

        @x1
        public final B a(@x1 String tag) {
            this.d.add(tag);
            return d();
        }

        @x1
        public final W b() {
            W c = c();
            ib0 ib0Var = this.c.m;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && ib0Var.e()) || ib0Var.f() || ib0Var.g() || (i >= 23 && ib0Var.h());
            if (this.c.t && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.b = UUID.randomUUID();
            we0 we0Var = new we0(this.c);
            this.c = we0Var;
            we0Var.d = this.b.toString();
            return c;
        }

        @x1
        public abstract W c();

        @x1
        public abstract B d();

        @x1
        public final B e(long duration, @x1 TimeUnit timeUnit) {
            this.c.r = timeUnit.toMillis(duration);
            return d();
        }

        @e2(26)
        @x1
        public final B f(@x1 Duration duration) {
            this.c.r = duration.toMillis();
            return d();
        }

        @x1
        public final B g(@x1 gb0 backoffPolicy, long backoffDelay, @x1 TimeUnit timeUnit) {
            this.a = true;
            we0 we0Var = this.c;
            we0Var.o = backoffPolicy;
            we0Var.e(timeUnit.toMillis(backoffDelay));
            return d();
        }

        @e2(26)
        @x1
        public final B h(@x1 gb0 backoffPolicy, @x1 Duration duration) {
            this.a = true;
            we0 we0Var = this.c;
            we0Var.o = backoffPolicy;
            we0Var.e(duration.toMillis());
            return d();
        }

        @x1
        public final B i(@x1 ib0 constraints) {
            this.c.m = constraints;
            return d();
        }

        @x1
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B j(@x1 xb0 policy) {
            we0 we0Var = this.c;
            we0Var.t = true;
            we0Var.u = policy;
            return d();
        }

        @x1
        public B k(long duration, @x1 TimeUnit timeUnit) {
            this.c.j = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.j) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @e2(26)
        @x1
        public B l(@x1 Duration duration) {
            this.c.j = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.j) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        @r2
        public final B m(int runAttemptCount) {
            this.c.n = runAttemptCount;
            return d();
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        @r2
        public final B n(@x1 dc0.a state) {
            this.c.e = state;
            return d();
        }

        @x1
        public final B o(@x1 kb0 inputData) {
            this.c.h = inputData;
            return d();
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        @r2
        public final B p(long periodStartTime, @x1 TimeUnit timeUnit) {
            this.c.q = timeUnit.toMillis(periodStartTime);
            return d();
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        @r2
        public final B q(long scheduleRequestedAt, @x1 TimeUnit timeUnit) {
            this.c.s = timeUnit.toMillis(scheduleRequestedAt);
            return d();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public gc0(@x1 UUID id, @x1 we0 workSpec, @x1 Set<String> tags) {
        this.d = id;
        this.e = workSpec;
        this.f = tags;
    }

    @x1
    public UUID a() {
        return this.d;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public String b() {
        return this.d.toString();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public Set<String> c() {
        return this.f;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public we0 d() {
        return this.e;
    }
}