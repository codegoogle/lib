package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.cs2;
import com.p7700g.p99005.es2;

/* compiled from: PersistedInstallationEntry.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class fs2 {
    @x1
    public static fs2 a = a().a();

    /* compiled from: PersistedInstallationEntry.java */
    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        @x1
        public abstract fs2 a();

        @x1
        public abstract a b(@z1 String str);

        @x1
        public abstract a c(long j);

        @x1
        public abstract a d(@x1 String str);

        @x1
        public abstract a e(@z1 String str);

        @x1
        public abstract a f(@z1 String str);

        @x1
        public abstract a g(@x1 es2.a aVar);

        @x1
        public abstract a h(long j);
    }

    @x1
    public static a a() {
        return new cs2.b().h(0L).g(es2.a.ATTEMPT_MIGRATION).c(0L);
    }

    @z1
    public abstract String b();

    public abstract long c();

    @z1
    public abstract String d();

    @z1
    public abstract String e();

    @z1
    public abstract String f();

    @x1
    public abstract es2.a g();

    public abstract long h();

    public boolean i() {
        return g() == es2.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == es2.a.NOT_GENERATED || g() == es2.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == es2.a.REGISTERED;
    }

    public boolean l() {
        return g() == es2.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == es2.a.ATTEMPT_MIGRATION;
    }

    @x1
    public abstract a n();

    @x1
    public fs2 o(@x1 String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    @x1
    public fs2 p() {
        return n().b(null).a();
    }

    @x1
    public fs2 q(@x1 String str) {
        return n().e(str).g(es2.a.REGISTER_ERROR).a();
    }

    @x1
    public fs2 r() {
        return n().g(es2.a.NOT_GENERATED).a();
    }

    @x1
    public fs2 s(@x1 String str, @x1 String str2, long j, @z1 String str3, long j2) {
        return n().d(str).g(es2.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    @x1
    public fs2 t(@x1 String str) {
        return n().d(str).g(es2.a.UNREGISTERED).a();
    }
}