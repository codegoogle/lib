package com.p7700g.p99005;

import org.jetbrains.annotations.Nullable;

/* compiled from: AutoCloseable.kt */
@fz4(name = "AutoCloseableKt")
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aH\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"closeFinally", "", "Ljava/lang/AutoCloseable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 6, 0}, pn = "kotlin", xi = 48)
/* loaded from: classes3.dex */
public final class wy4 {
    @np4
    @tp4(version = "1.2")
    public static final void a(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            co4.a(th, th2);
        }
    }

    @dx4
    @tp4(version = "1.2")
    private static final <T extends AutoCloseable, R> R b(T t, f05<? super T, ? extends R> f05Var) {
        c25.p(f05Var, "block");
        try {
            R M = f05Var.M(t);
            z15.d(1);
            a(t, null);
            z15.c(1);
            return M;
        } finally {
        }
    }
}