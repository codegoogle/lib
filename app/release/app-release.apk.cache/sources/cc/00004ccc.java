package com.p7700g.p99005;

import java.io.File;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public final class kj1 {
    private static jj1 a = jj1.a;
    @x1
    private final String b;

    private kj1(@x1 String str) {
        this.b = str;
    }

    @x1
    public static kj1 a(@x1 Class cls) {
        return new kj1(cls.getSimpleName());
    }

    @x1
    public static kj1 b(@x1 String str) {
        return new kj1(str);
    }

    public static void k(@x1 jj1 jj1Var) {
        a = jj1Var;
    }

    public void c(@x1 String str, @z1 Object... objArr) {
        d(null, str, objArr);
    }

    public void d(@z1 Throwable th, @x1 String str, @z1 Object... objArr) {
        a.a(3, th, this.b, str, objArr);
    }

    public void e(@x1 String str, @z1 Object... objArr) {
        g(null, str, objArr);
    }

    public void f(@x1 Throwable th) {
        g(th, "", new Object[0]);
    }

    public void g(@z1 Throwable th, @x1 String str, @z1 Object... objArr) {
        a.a(6, th, this.b, str, objArr);
    }

    @z1
    public File h(@x1 File file) {
        return a.b(file);
    }

    public void i(@x1 String str, @z1 Object... objArr) {
        j(null, str, objArr);
    }

    public void j(@z1 Throwable th, @x1 String str, @z1 Object... objArr) {
        a.a(4, th, this.b, str, objArr);
    }

    public void l(@x1 String str, @z1 Object... objArr) {
        m(null, str, objArr);
    }

    public void m(@z1 Throwable th, @x1 String str, @z1 Object... objArr) {
        a.a(2, th, this.b, str, objArr);
    }

    public void n(@x1 String str, @z1 Object... objArr) {
        p(null, str, objArr);
    }

    public void o(@x1 Throwable th) {
        p(th, "", new Object[0]);
    }

    public void p(@z1 Throwable th, @x1 String str, @z1 Object... objArr) {
        a.a(5, th, this.b, str, objArr);
    }
}