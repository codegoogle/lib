package com.p7700g.p99005;

/* compiled from: Synchronized.kt */
@vo4(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"synchronized", "R", "lock", "", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/StandardKt")
/* loaded from: classes3.dex */
public class wp4 extends vp4 {
    @dx4
    private static final <R> R l(Object obj, uz4<? extends R> uz4Var) {
        R x;
        c25.p(obj, "lock");
        c25.p(uz4Var, "block");
        synchronized (obj) {
            try {
                x = uz4Var.x();
                z15.d(1);
            } catch (Throwable th) {
                z15.d(1);
                z15.c(1);
                throw th;
            }
        }
        z15.c(1);
        return x;
    }
}