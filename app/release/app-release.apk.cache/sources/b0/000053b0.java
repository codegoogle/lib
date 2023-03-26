package com.p7700g.p99005;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes2.dex */
public final class o52 implements h62<n52> {
    private final ol4<Context> a;
    private final ol4<l52> b;

    public o52(ol4<Context> ol4Var, ol4<l52> ol4Var2) {
        this.a = ol4Var;
        this.b = ol4Var2;
    }

    public static o52 a(ol4<Context> ol4Var, ol4<l52> ol4Var2) {
        return new o52(ol4Var, ol4Var2);
    }

    public static n52 c(Context context, Object obj) {
        return new n52(context, (l52) obj);
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public n52 get() {
        return c(this.a.get(), this.b.get());
    }
}