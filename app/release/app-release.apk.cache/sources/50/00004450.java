package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.util.List;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@vo4(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"handlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleCoroutineExceptionImpl", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class gc5 {
    @NotNull
    private static final List<fc5> a = o75.c3(m75.e(ServiceLoader.load(fc5.class, fc5.class.getClassLoader()).iterator()));

    public static final void a(@NotNull xv4 xv4Var, @NotNull Throwable th) {
        for (fc5 fc5Var : a) {
            try {
                fc5Var.handleException(xv4Var, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, hc5.c(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            qp4.a aVar = qp4.s;
            co4.a(th, new yc5(xv4Var));
            qp4.b(yq4.a);
        } catch (Throwable th3) {
            qp4.a aVar2 = qp4.s;
            qp4.b(rp4.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}