package com.p7700g.p99005;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes2.dex */
public final class f82 implements h62<e82> {
    private final ol4<Context> a;
    private final ol4<g52> b;
    private final ol4<i92> c;
    private final ol4<i82> d;
    private final ol4<Executor> e;
    private final ol4<u92> f;
    private final ol4<v92> g;

    public f82(ol4<Context> ol4Var, ol4<g52> ol4Var2, ol4<i92> ol4Var3, ol4<i82> ol4Var4, ol4<Executor> ol4Var5, ol4<u92> ol4Var6, ol4<v92> ol4Var7) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
        this.d = ol4Var4;
        this.e = ol4Var5;
        this.f = ol4Var6;
        this.g = ol4Var7;
    }

    public static f82 a(ol4<Context> ol4Var, ol4<g52> ol4Var2, ol4<i92> ol4Var3, ol4<i82> ol4Var4, ol4<Executor> ol4Var5, ol4<u92> ol4Var6, ol4<v92> ol4Var7) {
        return new f82(ol4Var, ol4Var2, ol4Var3, ol4Var4, ol4Var5, ol4Var6, ol4Var7);
    }

    public static e82 c(Context context, g52 g52Var, i92 i92Var, i82 i82Var, Executor executor, u92 u92Var, v92 v92Var) {
        return new e82(context, g52Var, i92Var, i82Var, executor, u92Var, v92Var);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public e82 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}