package com.p7700g.p99005;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes2.dex */
public final class s92 implements h62<r92> {
    private final ol4<Context> a;
    private final ol4<String> b;
    private final ol4<Integer> c;

    public s92(ol4<Context> ol4Var, ol4<String> ol4Var2, ol4<Integer> ol4Var3) {
        this.a = ol4Var;
        this.b = ol4Var2;
        this.c = ol4Var3;
    }

    public static s92 a(ol4<Context> ol4Var, ol4<String> ol4Var2, ol4<Integer> ol4Var3) {
        return new s92(ol4Var, ol4Var2, ol4Var3);
    }

    public static r92 c(Context context, String str, int i) {
        return new r92(context, str, i);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public r92 get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}