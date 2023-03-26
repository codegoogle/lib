package com.p7700g.p99005;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes2.dex */
public final class b52 implements h62<z42> {
    private final ol4<v92> a;
    private final ol4<v92> b;
    private final ol4<l72> c;
    private final ol4<e82> d;
    private final ol4<g82> e;

    public b52(ol4<v92> ol4Var, ol4<v92> ol4Var2, ol4<l72> ol4Var3, ol4<e82> ol4Var4, ol4<g82> ol4Var5) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
        this.d = ol4Var4;
        this.e = ol4Var5;
    }

    public static b52 a(ol4<v92> ol4Var, ol4<v92> ol4Var2, ol4<l72> ol4Var3, ol4<e82> ol4Var4, ol4<g82> ol4Var5) {
        return new b52(ol4Var, ol4Var2, ol4Var3, ol4Var4, ol4Var5);
    }

    public static z42 c(v92 v92Var, v92 v92Var2, l72 l72Var, e82 e82Var, g82 g82Var) {
        return new z42(v92Var, v92Var2, l72Var, e82Var, g82Var);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public z42 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}