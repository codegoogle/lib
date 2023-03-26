package com.p7700g.p99005;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* compiled from: Okio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u0010\u001a\u00028\u0001\"\u0010\b\u0000\u0010\f*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\r*\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/uv5;", "c", "(Lcom/p7700g/p99005/xw5;)Lcom/p7700g/p99005/uv5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/tv5;", "b", "(Lcom/p7700g/p99005/vw5;)Lcom/p7700g/p99005/tv5;", "a", "()Lcom/p7700g/p99005/vw5;", "Ljava/io/Closeable;", "Lokio/Closeable;", "T", "R", "Lkotlin/Function1;", "block", "d", "(Ljava/io/Closeable;Lcom/p7700g/p99005/f05;)Ljava/lang/Object;", "okio"}, k = 5, mv = {1, 4, 1}, xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class lw5 {
    @fz4(name = "blackhole")
    @NotNull
    public static final vw5 a() {
        return new rv5();
    }

    @NotNull
    public static final tv5 b(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "$this$buffer");
        return new qw5(vw5Var);
    }

    @NotNull
    public static final uv5 c(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, "$this$buffer");
        return new rw5(xw5Var);
    }

    public static final <T extends Closeable, R> R d(T t, @NotNull f05<? super T, ? extends R> f05Var) {
        R r;
        c25.p(f05Var, "block");
        Throwable th = null;
        try {
            r = f05Var.M(t);
        } catch (Throwable th2) {
            th = th2;
            r = null;
        }
        if (t != null) {
            try {
                t.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    co4.a(th, th3);
                }
            }
        }
        if (th == null) {
            c25.m(r);
            return r;
        }
        throw th;
    }
}