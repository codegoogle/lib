package com.p7700g.p99005;

import com.google.gson.Gson;

/* compiled from: ExternalDepsProvider.java */
/* loaded from: classes.dex */
public class j61 {
    @x1
    private static final String a = "com.anchorfree.vpnsdk.deps";
    @x1
    private final c81 b;
    @x1
    private final Gson c;

    public j61(@x1 c81 c81Var, @x1 Gson gson) {
        this.b = c81Var;
        this.c = gson;
    }

    @x1
    public h61 a() {
        try {
            h61 h61Var = (h61) this.c.n(this.b.c(a), h61.class);
            return h61Var == null ? new h61() : h61Var;
        } catch (Throwable unused) {
            return new h61();
        }
    }
}