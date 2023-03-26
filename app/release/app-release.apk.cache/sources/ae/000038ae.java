package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Builders.kt */
@vo4(d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"runBlocking", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ab5 {
    public static final <T> T a(@NotNull xv4 xv4Var, @NotNull j05<? super lc5, ? super uv4<? super T>, ? extends Object> j05Var) throws InterruptedException {
        kd5 a;
        xv4 e;
        Thread currentThread = Thread.currentThread();
        vv4 vv4Var = (vv4) xv4Var.get(vv4.k0);
        if (vv4Var == null) {
            a = lf5.a.b();
            e = dc5.e(vd5.s, xv4Var.plus(a));
        } else {
            kd5 kd5Var = null;
            kd5 kd5Var2 = vv4Var instanceof kd5 ? (kd5) vv4Var : null;
            if (kd5Var2 != null && kd5Var2.e2()) {
                kd5Var = kd5Var2;
            }
            a = kd5Var == null ? lf5.a.a() : kd5Var;
            e = dc5.e(vd5.s, xv4Var);
        }
        xa5 xa5Var = new xa5(e, currentThread, a);
        xa5Var.v1(nc5.DEFAULT, xa5Var, j05Var);
        return (T) xa5Var.w1();
    }

    public static /* synthetic */ Object b(xv4 xv4Var, j05 j05Var, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            xv4Var = zv4.s;
        }
        return za5.f(xv4Var, j05Var);
    }
}