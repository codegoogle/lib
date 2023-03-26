package com.p7700g.p99005;

/* compiled from: TimeModule_EventClockFactory.java */
/* loaded from: classes2.dex */
public final class z92 implements h62<v92> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final z92 a = new z92();

        private a() {
        }
    }

    public static z92 a() {
        return a.a;
    }

    public static v92 b() {
        return (v92) q62.c(y92.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: c */
    public v92 get() {
        return b();
    }
}