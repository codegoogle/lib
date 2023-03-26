package com.p7700g.p99005;

/* compiled from: RemoteConfigAccess.java */
/* loaded from: classes.dex */
public class i41 {
    @x1
    private static final String a = "pref:config:remote";
    @x1
    private static final String b = "pref:config:remote:time:";
    @x1
    private static final String c = "pref:config:remote:defaults:";
    private static final int d = 1;
    @x1
    private final x31 e;

    public i41(@x1 x31 x31Var) {
        this.e = x31Var;
    }

    @x1
    private String b(@x1 String str, @x1 String str2) {
        return wo1.n(str2, 1, str);
    }

    public void a(@x1 String str) {
        this.e.c().remove(b(str, a)).remove(b(str, b)).d();
    }

    public String c(@x1 String str) {
        return this.e.e(b(str, c), "");
    }

    public long d(@x1 String str) {
        return this.e.a(b(str, b), 0L);
    }

    @x1
    public String e(@x1 String str) {
        return this.e.e(b(str, a), "");
    }

    public void f(@x1 String str, @x1 String str2) {
        this.e.c().b(b(str, c), str2).a();
    }

    public void g(@x1 String str, @x1 String str2) {
        this.e.c().b(b(str, a), str2).c(b(str, b), System.currentTimeMillis()).d();
    }
}