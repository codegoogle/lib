package com.p7700g.p99005;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: classes2.dex */
public final class l92 implements h62<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final l92 a = new l92();

        private a() {
        }
    }

    public static l92 a() {
        return a.a;
    }

    public static String b() {
        return (String) q62.c(k92.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: c */
    public String get() {
        return b();
    }
}