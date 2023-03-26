package com.p7700g.p99005;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import com.p7700g.p99005.b82;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class d82 {
    private static final long a = 86400000;
    private static final long b = 30000;
    private static final long c = 1000;
    private static final long d = 10000;

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes2.dex */
    public static class a {
        private v92 a;
        private Map<d32, b> b = new HashMap();

        public a a(d32 d32Var, b bVar) {
            this.b.put(d32Var, bVar);
            return this;
        }

        public d82 b() {
            Objects.requireNonNull(this.a, "missing required property: clock");
            int size = this.b.keySet().size();
            d32.values();
            if (size >= 3) {
                Map<d32, b> map = this.b;
                this.b = new HashMap();
                return d82.d(this.a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(v92 v92Var) {
            this.a = v92Var;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* loaded from: classes2.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            return new b82.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes2.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    public static a b() {
        return new a();
    }

    public static d82 d(v92 v92Var, Map<d32, b> map) {
        return new a82(v92Var, map);
    }

    public static d82 f(v92 v92Var) {
        return b().a(d32.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(d32.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(d32.VERY_LOW, b.a().b(86400000L).d(86400000L).c(j(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).a()).c(v92Var).b();
    }

    private static <T> Set<T> j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @e2(api = 21)
    private void k(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @e2(api = 21)
    public JobInfo.Builder c(JobInfo.Builder builder, d32 d32Var, long j, int i) {
        builder.setMinimumLatency(h(d32Var, j, i));
        k(builder, i().get(d32Var).c());
        return builder;
    }

    public abstract v92 e();

    public Set<c> g(d32 d32Var) {
        return i().get(d32Var).c();
    }

    public long h(d32 d32Var, long j, int i) {
        long a2 = j - e().a();
        b bVar = i().get(d32Var);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    public abstract Map<d32, b> i();
}