package com.p7700g.p99005;

import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes2.dex */
public final class k72 implements h62<j72> {
    private final ol4<Executor> a;
    private final ol4<g52> b;
    private final ol4<i82> c;
    private final ol4<i92> d;
    private final ol4<u92> e;

    public k72(ol4<Executor> ol4Var, ol4<g52> ol4Var2, ol4<i82> ol4Var3, ol4<i92> ol4Var4, ol4<u92> ol4Var5) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
        this.d = ol4Var4;
        this.e = ol4Var5;
    }

    public static k72 a(ol4<Executor> ol4Var, ol4<g52> ol4Var2, ol4<i82> ol4Var3, ol4<i92> ol4Var4, ol4<u92> ol4Var5) {
        return new k72(ol4Var, ol4Var2, ol4Var3, ol4Var4, ol4Var5);
    }

    public static j72 c(Executor executor, g52 g52Var, i82 i82Var, i92 i92Var, u92 u92Var) {
        return new j72(executor, g52Var, i82Var, i92Var, u92Var);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public j72 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}