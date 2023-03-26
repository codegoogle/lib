package com.p7700g.p99005;

import android.content.Context;

/* compiled from: CreationContextFactory.java */
/* loaded from: classes2.dex */
public class l52 {
    private final Context a;
    private final v92 b;
    private final v92 c;

    @ml4
    public l52(Context context, @ca2 v92 v92Var, @w92 v92 v92Var2) {
        this.a = context;
        this.b = v92Var;
        this.c = v92Var2;
    }

    public k52 a(String str) {
        return k52.b(this.a, this.b, this.c, str);
    }
}