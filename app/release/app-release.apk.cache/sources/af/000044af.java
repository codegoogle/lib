package com.p7700g.p99005;

/* compiled from: ExceptionReporter.java */
/* loaded from: classes2.dex */
public class gj1 {
    private static ij1 a = ij1.a;
    @x1
    private final String b;

    public gj1(@x1 String str) {
        this.b = str;
    }

    public static void b(@x1 ij1 ij1Var) {
        a = ij1Var;
    }

    public void a(@x1 Throwable th) {
        String message = th.getMessage();
        ij1 ij1Var = a;
        String str = this.b;
        if (message == null) {
            message = "";
        }
        ij1Var.a(str, message, th);
    }
}