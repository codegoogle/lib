package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes2.dex */
public final class h82 implements h62<g82> {
    private final ol4<Executor> a;
    private final ol4<i92> b;
    private final ol4<i82> c;
    private final ol4<u92> d;

    public h82(ol4<Executor> ol4Var, ol4<i92> ol4Var2, ol4<i82> ol4Var3, ol4<u92> ol4Var4) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
        this.d = ol4Var4;
    }

    public static h82 a(ol4<Executor> ol4Var, ol4<i92> ol4Var2, ol4<i82> ol4Var3, ol4<u92> ol4Var4) {
        return new h82(ol4Var, ol4Var2, ol4Var3, ol4Var4);
    }

    public static g82 c(Executor executor, i92 i92Var, i82 i82Var, u92 u92Var) {
        return new g82(executor, i92Var, i82Var, u92Var);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public g82 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}