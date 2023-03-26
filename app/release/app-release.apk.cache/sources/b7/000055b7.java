package com.p7700g.p99005;

import android.content.Context;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes2.dex */
public final class p72 implements h62<i82> {
    private final ol4<Context> a;
    private final ol4<i92> b;
    private final ol4<d82> c;
    private final ol4<v92> d;

    public p72(ol4<Context> ol4Var, ol4<i92> ol4Var2, ol4<d82> ol4Var3, ol4<v92> ol4Var4) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
        this.d = ol4Var4;
    }

    public static p72 a(ol4<Context> ol4Var, ol4<i92> ol4Var2, ol4<d82> ol4Var3, ol4<v92> ol4Var4) {
        return new p72(ol4Var, ol4Var2, ol4Var3, ol4Var4);
    }

    public static i82 c(Context context, i92 i92Var, d82 d82Var, v92 v92Var) {
        return (i82) q62.c(o72.b(context, i92Var, d82Var, v92Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public i82 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}