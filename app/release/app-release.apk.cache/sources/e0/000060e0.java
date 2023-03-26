package com.p7700g.p99005;

import java.io.Closeable;
import org.jetbrains.annotations.Nullable;

/* compiled from: Closeable.kt */
@fz4(name = "CloseableKt")
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aK\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u000f\n\u0005\b\u009920\u0001\n\u0006\b\u0011(\u000b0\u0001¨\u0006\f"}, d2 = {"closeFinally", "", "Ljava/io/Closeable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Requires newer compiler version to be inlined correctly.", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ux4 {
    @np4
    @tp4(version = "1.1")
    public static final void a(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                co4.a(th, th2);
            }
        }
    }

    @dx4
    private static final <T extends Closeable, R> R b(T t, f05<? super T, ? extends R> f05Var) {
        c25.p(f05Var, "block");
        try {
            R M = f05Var.M(t);
            z15.d(1);
            if (kx4.a(1, 1, 0)) {
                a(t, null);
            } else if (t != null) {
                t.close();
            }
            z15.c(1);
            return M;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                z15.d(1);
                if (kx4.a(1, 1, 0)) {
                    a(t, th);
                } else if (t != null) {
                    try {
                        t.close();
                    } catch (Throwable unused) {
                    }
                }
                z15.c(1);
                throw th2;
            }
        }
    }
}