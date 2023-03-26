package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.work.ListenableWorker;
import com.p7700g.p99005.gc0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest.java */
/* loaded from: classes.dex */
public final class yb0 extends gc0 {
    @SuppressLint({"MinMaxConstant"})
    public static final long g = 900000;
    @SuppressLint({"MinMaxConstant"})
    public static final long h = 300000;

    public yb0(a builder) {
        super(builder.b, builder.c, builder.d);
    }

    /* compiled from: PeriodicWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends gc0.a<a, yb0> {
        public a(@x1 Class<? extends ListenableWorker> workerClass, long repeatInterval, @x1 TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            this.c.f(repeatIntervalTimeUnit.toMillis(repeatInterval));
        }

        @Override // com.p7700g.p99005.gc0.a
        @x1
        /* renamed from: r */
        public yb0 c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.c.m.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new yb0(this);
        }

        @Override // com.p7700g.p99005.gc0.a
        @x1
        /* renamed from: s */
        public a d() {
            return this;
        }

        @e2(26)
        public a(@x1 Class<? extends ListenableWorker> workerClass, @x1 Duration repeatInterval) {
            super(workerClass);
            this.c.f(repeatInterval.toMillis());
        }

        public a(@x1 Class<? extends ListenableWorker> workerClass, long repeatInterval, @x1 TimeUnit repeatIntervalTimeUnit, long flexInterval, @x1 TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            this.c.g(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
        }

        @e2(26)
        public a(@x1 Class<? extends ListenableWorker> workerClass, @x1 Duration repeatInterval, @x1 Duration flexInterval) {
            super(workerClass);
            this.c.g(repeatInterval.toMillis(), flexInterval.toMillis());
        }
    }
}