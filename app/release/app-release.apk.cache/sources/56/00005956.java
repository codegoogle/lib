package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes2.dex */
public final class r42 implements h62<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final r42 a = new r42();

        private a() {
        }
    }

    public static r42 a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) q62.c(q42.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}