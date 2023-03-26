package com.p7700g.p99005;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes2.dex */
public final class q92 implements h62<p92> {
    private final ol4<v92> a;
    private final ol4<v92> b;
    private final ol4<j92> c;
    private final ol4<r92> d;

    public q92(ol4<v92> ol4Var, ol4<v92> ol4Var2, ol4<j92> ol4Var3, ol4<r92> ol4Var4) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
        this.d = ol4Var4;
    }

    public static q92 a(ol4<v92> ol4Var, ol4<v92> ol4Var2, ol4<j92> ol4Var3, ol4<r92> ol4Var4) {
        return new q92(ol4Var, ol4Var2, ol4Var3, ol4Var4);
    }

    public static p92 c(v92 v92Var, v92 v92Var2, Object obj, Object obj2) {
        return new p92(v92Var, v92Var2, (j92) obj, (r92) obj2);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public p92 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}