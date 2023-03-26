package com.p7700g.p99005;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* loaded from: classes2.dex */
public final class aa2 implements h62<v92> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final aa2 a = new aa2();

        private a() {
        }
    }

    public static aa2 a() {
        return a.a;
    }

    public static v92 c() {
        return (v92) q62.c(y92.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public v92 get() {
        return c();
    }
}