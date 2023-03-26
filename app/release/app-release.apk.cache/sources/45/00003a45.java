package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.v32;

/* compiled from: LogEvent.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class b42 {

    /* compiled from: LogEvent.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @x1
        public abstract b42 a();

        @x1
        public abstract a b(@z1 Integer num);

        @x1
        public abstract a c(long j);

        @x1
        public abstract a d(long j);

        @x1
        public abstract a e(@z1 e42 e42Var);

        @x1
        public abstract a f(@z1 byte[] bArr);

        @x1
        public abstract a g(@z1 String str);

        @x1
        public abstract a h(long j);
    }

    private static a a() {
        return new v32.b();
    }

    @x1
    public static a i(@x1 String str) {
        return a().g(str);
    }

    @x1
    public static a j(@x1 byte[] bArr) {
        return a().f(bArr);
    }

    @z1
    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    @z1
    public abstract e42 e();

    @z1
    public abstract byte[] f();

    @z1
    public abstract String g();

    public abstract long h();
}