package com.p7700g.p99005;

import com.p7700g.p99005.qm3;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

/* compiled from: TaskLogger.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/p7700g/p99005/cs5;", "task", "Lcom/p7700g/p99005/es5;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lcom/p7700g/p99005/yq4;", "e", "(Lcom/p7700g/p99005/cs5;Lcom/p7700g/p99005/es5;Lcom/p7700g/p99005/uz4;)V", "T", "block", "d", "(Lcom/p7700g/p99005/cs5;Lcom/p7700g/p99005/es5;Lcom/p7700g/p99005/uz4;)Ljava/lang/Object;", qm3.b.j, "c", "(Lcom/p7700g/p99005/cs5;Lcom/p7700g/p99005/es5;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ds5 {
    @NotNull
    public static final String b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / ((long) q95.a)) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / ((long) q95.a)) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        j35 j35Var = j35.a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        c25.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final void c(cs5 cs5Var, es5 es5Var, String str) {
        Logger a = fs5.c.a();
        StringBuilder sb = new StringBuilder();
        sb.append(es5Var.h());
        sb.append(gl4.R);
        j35 j35Var = j35.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        c25.o(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(cs5Var.b());
        a.fine(sb.toString());
    }

    public static final <T> T d(@NotNull cs5 cs5Var, @NotNull es5 es5Var, @NotNull uz4<? extends T> uz4Var) {
        long j;
        c25.p(cs5Var, "task");
        c25.p(es5Var, "queue");
        c25.p(uz4Var, "block");
        boolean isLoggable = fs5.c.a().isLoggable(Level.FINE);
        if (isLoggable) {
            j = es5Var.k().h().nanoTime();
            c(cs5Var, es5Var, "starting");
        } else {
            j = -1;
        }
        try {
            T x = uz4Var.x();
            z15.d(1);
            if (isLoggable) {
                StringBuilder G = wo1.G("finished run in ");
                G.append(b(es5Var.k().h().nanoTime() - j));
                c(cs5Var, es5Var, G.toString());
            }
            z15.c(1);
            return x;
        } catch (Throwable th) {
            z15.d(1);
            if (isLoggable) {
                StringBuilder G2 = wo1.G("failed a run in ");
                G2.append(b(es5Var.k().h().nanoTime() - j));
                c(cs5Var, es5Var, G2.toString());
            }
            z15.c(1);
            throw th;
        }
    }

    public static final void e(@NotNull cs5 cs5Var, @NotNull es5 es5Var, @NotNull uz4<String> uz4Var) {
        c25.p(cs5Var, "task");
        c25.p(es5Var, "queue");
        c25.p(uz4Var, "messageBlock");
        if (fs5.c.a().isLoggable(Level.FINE)) {
            c(cs5Var, es5Var, uz4Var.x());
        }
    }
}