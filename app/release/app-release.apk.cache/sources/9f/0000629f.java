package com.p7700g.p99005;

import com.p7700g.p99005.qm3;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Console.kt */
@fz4(name = "ConsoleKt")
@vo4(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0012"}, d2 = {"print", "", qm3.b.j, "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "readln", "readlnOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class vx4 {
    @dx4
    private static final void a(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @dx4
    private static final void b(char c) {
        System.out.print(c);
    }

    @dx4
    private static final void c(double d) {
        System.out.print(d);
    }

    @dx4
    private static final void d(float f) {
        System.out.print(f);
    }

    @dx4
    private static final void e(int i) {
        System.out.print(i);
    }

    @dx4
    private static final void f(long j) {
        System.out.print(j);
    }

    @dx4
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @dx4
    private static final void h(short s) {
        System.out.print(Short.valueOf(s));
    }

    @dx4
    private static final void i(boolean z) {
        System.out.print(z);
    }

    @dx4
    private static final void j(char[] cArr) {
        c25.p(cArr, qm3.b.j);
        System.out.print(cArr);
    }

    @dx4
    private static final void k() {
        System.out.println();
    }

    @dx4
    private static final void l(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @dx4
    private static final void m(char c) {
        System.out.println(c);
    }

    @dx4
    private static final void n(double d) {
        System.out.println(d);
    }

    @dx4
    private static final void o(float f) {
        System.out.println(f);
    }

    @dx4
    private static final void p(int i) {
        System.out.println(i);
    }

    @dx4
    private static final void q(long j) {
        System.out.println(j);
    }

    @dx4
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @dx4
    private static final void s(short s) {
        System.out.println(Short.valueOf(s));
    }

    @dx4
    private static final void t(boolean z) {
        System.out.println(z);
    }

    @dx4
    private static final void u(char[] cArr) {
        c25.p(cArr, qm3.b.j);
        System.out.println(cArr);
    }

    @Nullable
    public static final String v() {
        jy4 jy4Var = jy4.a;
        InputStream inputStream = System.in;
        c25.o(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        c25.o(defaultCharset, "defaultCharset()");
        return jy4Var.d(inputStream, defaultCharset);
    }

    @tp4(version = "1.6")
    @NotNull
    public static final String w() {
        String x = x();
        if (x != null) {
            return x;
        }
        throw new ny4("EOF has already been reached");
    }

    @tp4(version = "1.6")
    @Nullable
    public static final String x() {
        return v();
    }
}