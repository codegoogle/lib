package com.p7700g.p99005;

/* compiled from: ReportUrlPrefs.java */
/* loaded from: classes.dex */
public class s41 {
    @x1
    public static final String a = "pref:sdk:report:";
    @x1
    private final x31 b;

    public s41(@x1 x31 x31Var) {
        this.b = x31Var;
    }

    public long a(@x1 String str) {
        x31 x31Var = this.b;
        return x31Var.a(a + str, 0L);
    }

    public void b(@x1 String str, @z1 Throwable th) {
        this.b.c().c(wo1.t(a, str), System.currentTimeMillis()).a();
    }

    public void c(@x1 String str) {
    }
}