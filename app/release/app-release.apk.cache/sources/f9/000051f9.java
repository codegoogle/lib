package com.p7700g.p99005;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes2.dex */
public final class n92 implements h62<j92> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final n92 a = new n92();

        private a() {
        }
    }

    public static n92 a() {
        return a.a;
    }

    public static j92 c() {
        return (j92) q62.c(k92.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public j92 get() {
        return c();
    }
}