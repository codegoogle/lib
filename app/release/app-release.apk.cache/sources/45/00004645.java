package com.p7700g.p99005;

import com.p7700g.p99005.fc5;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u001a\b\u0004\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\b\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000¨\u0006\r"}, d2 = {"CoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "", "", "handleCoroutineException", "context", "exception", "handlerException", "originalException", "thrownException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class hc5 {

    /* compiled from: CoroutineExceptionHandler.kt */
    @vo4(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a extends rv4 implements fc5 {
        public final /* synthetic */ j05<xv4, Throwable, yq4> s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j05<? super xv4, ? super Throwable, yq4> j05Var, fc5.b bVar) {
            super(bVar);
            this.s = j05Var;
        }

        @Override // com.p7700g.p99005.fc5
        public void handleException(@NotNull xv4 xv4Var, @NotNull Throwable th) {
            this.s.w3(xv4Var, th);
        }
    }

    @NotNull
    public static final fc5 a(@NotNull j05<? super xv4, ? super Throwable, yq4> j05Var) {
        return new a(j05Var, fc5.l0);
    }

    @zd5
    public static final void b(@NotNull xv4 xv4Var, @NotNull Throwable th) {
        try {
            fc5 fc5Var = (fc5) xv4Var.get(fc5.l0);
            if (fc5Var == null) {
                gc5.a(xv4Var, th);
            } else {
                fc5Var.handleException(xv4Var, th);
            }
        } catch (Throwable th2) {
            gc5.a(xv4Var, c(th, th2));
        }
    }

    @NotNull
    public static final Throwable c(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        co4.a(runtimeException, th);
        return runtimeException;
    }
}