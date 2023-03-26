package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.g92;

/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class j92 {
    private static final long a = 10485760;
    private static final int b = 200;
    private static final int c = 10000;
    private static final long d = 604800000;
    private static final int e = 81920;
    public static final j92 f = a().f(10485760).d(200).b(10000).c(d).e(e).a();

    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract j92 a();

        public abstract a b(int i);

        public abstract a c(long j);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(long j);
    }

    public static a a() {
        return new g92.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    public a g() {
        return a().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}