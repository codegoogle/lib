package com.p7700g.p99005;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes2.dex */
public final class n72 implements h62<d82> {
    private final ol4<v92> a;

    public n72(ol4<v92> ol4Var) {
        this.a = ol4Var;
    }

    public static d82 a(v92 v92Var) {
        return (d82) q62.c(m72.a(v92Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static n72 b(ol4<v92> ol4Var) {
        return new n72(ol4Var);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: c */
    public d82 get() {
        return a(this.a.get());
    }
}