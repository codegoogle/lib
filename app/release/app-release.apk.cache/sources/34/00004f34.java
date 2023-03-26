package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.hs2;

/* compiled from: TokenResult.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class ls2 {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        @x1
        public abstract ls2 a();

        @x1
        public abstract a b(@x1 b bVar);

        @x1
        public abstract a c(@x1 String str);

        @x1
        public abstract a d(long j);
    }

    /* compiled from: TokenResult.java */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @x1
    public static a a() {
        return new hs2.b().d(0L);
    }

    @z1
    public abstract b b();

    @z1
    public abstract String c();

    @x1
    public abstract long d();

    @x1
    public abstract a e();
}