package com.p7700g.p99005;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes2.dex */
public final class m52 implements h62<l52> {
    private final ol4<Context> a;
    private final ol4<v92> b;
    private final ol4<v92> c;

    public m52(ol4<Context> ol4Var, ol4<v92> ol4Var2, ol4<v92> ol4Var3) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
    }

    public static m52 a(ol4<Context> ol4Var, ol4<v92> ol4Var2, ol4<v92> ol4Var3) {
        return new m52(ol4Var, ol4Var2, ol4Var3);
    }

    public static l52 c(Context context, v92 v92Var, v92 v92Var2) {
        return new l52(context, v92Var, v92Var2);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public l52 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}