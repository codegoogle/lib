package com.p7700g.p99005;

/* compiled from: Retries.java */
/* loaded from: classes2.dex */
public final class f72 {
    private f72() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, e72<TInput, TResult, TException> e72Var, g72<TInput, TResult> g72Var) throws Throwable {
        TResult apply;
        if (i < 1) {
            return e72Var.apply(tinput);
        }
        do {
            apply = e72Var.apply(tinput);
            tinput = g72Var.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}