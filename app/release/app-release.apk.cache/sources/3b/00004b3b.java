package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.gs2;

/* compiled from: InstallationResponse.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class js2 {

    /* compiled from: InstallationResponse.java */
    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        @x1
        public abstract js2 a();

        @x1
        public abstract a b(@x1 ls2 ls2Var);

        @x1
        public abstract a c(@x1 String str);

        @x1
        public abstract a d(@x1 String str);

        @x1
        public abstract a e(@x1 b bVar);

        @x1
        public abstract a f(@x1 String str);
    }

    /* compiled from: InstallationResponse.java */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    @x1
    public static a a() {
        return new gs2.b();
    }

    @z1
    public abstract ls2 b();

    @z1
    public abstract String c();

    @z1
    public abstract String d();

    @z1
    public abstract b e();

    @z1
    public abstract String f();

    @x1
    public abstract a g();
}