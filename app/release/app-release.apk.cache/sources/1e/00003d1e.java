package com.p7700g.p99005;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: Exceptions.kt */
@vo4(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0007\u001a\r\u0010\u0010\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0007\"!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"stackTrace", "", "Ljava/lang/StackTraceElement;", "", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "suppressedExceptions", "", "getSuppressedExceptions$annotations", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "addSuppressed", "", "exception", "printStackTrace", "stream", "Ljava/io/PrintStream;", "writer", "Ljava/io/PrintWriter;", "stackTraceToString", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/ExceptionsKt")
/* loaded from: classes3.dex */
public class co4 {
    @cx4
    @tp4(version = "1.1")
    public static final void a(@NotNull Throwable th, @NotNull Throwable th2) {
        c25.p(th, "<this>");
        c25.p(th2, "exception");
        if (th != th2) {
            kx4.a.a(th, th2);
        }
    }

    @NotNull
    public static final StackTraceElement[] b(@NotNull Throwable th) {
        c25.p(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        c25.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @NotNull
    public static final List<Throwable> d(@NotNull Throwable th) {
        c25.p(th, "<this>");
        return kx4.a.d(th);
    }

    @tp4(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }

    @dx4
    private static final void f(Throwable th) {
        c25.p(th, "<this>");
        th.printStackTrace();
    }

    @dx4
    private static final void g(Throwable th, PrintStream printStream) {
        c25.p(th, "<this>");
        c25.p(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @dx4
    private static final void h(Throwable th, PrintWriter printWriter) {
        c25.p(th, "<this>");
        c25.p(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @tp4(version = "1.4")
    @NotNull
    public static final String i(@NotNull Throwable th) {
        c25.p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        c25.o(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}