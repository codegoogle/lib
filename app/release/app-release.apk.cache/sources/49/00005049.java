package com.p7700g.p99005;

import com.p7700g.p99005.qm3;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineScope.kt */
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0002\u001aM\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\bH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0002\u001a\u0015\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"isActive", "", "Lkotlinx/coroutines/CoroutineScope;", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "CoroutineScope", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.anythink.expressad.d.a.b.dO, "", qm3.b.j, "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ensureActive", "plus", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class mc5 {
    @NotNull
    public static final lc5 a(@NotNull xv4 xv4Var) {
        sb5 c;
        if (xv4Var.get(ee5.m0) == null) {
            c = ke5.c(null, 1, null);
            xv4Var = xv4Var.plus(c);
        }
        return new sl5(xv4Var);
    }

    @NotNull
    public static final lc5 b() {
        return new sl5(if5.c(null, 1, null).plus(dd5.e()));
    }

    public static final void c(@NotNull lc5 lc5Var, @NotNull String str, @Nullable Throwable th) {
        d(lc5Var, pd5.a(str, th));
    }

    public static final void d(@NotNull lc5 lc5Var, @Nullable CancellationException cancellationException) {
        ee5 ee5Var = (ee5) lc5Var.y().get(ee5.m0);
        if (ee5Var != null) {
            ee5Var.b(cancellationException);
            return;
        }
        throw new IllegalStateException(c25.C("Scope cannot be cancelled because it does not have a job: ", lc5Var).toString());
    }

    public static /* synthetic */ void e(lc5 lc5Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        c(lc5Var, str, th);
    }

    public static /* synthetic */ void f(lc5 lc5Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        d(lc5Var, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull j05<? super lc5, ? super uv4<? super R>, ? extends Object> j05Var, @NotNull uv4<? super R> uv4Var) {
        wm5 wm5Var = new wm5(uv4Var.getContext(), uv4Var);
        Object f = pn5.f(wm5Var, wm5Var, j05Var);
        if (f == gw4.h()) {
            ow4.c(uv4Var);
        }
        return f;
    }

    @Nullable
    public static final Object h(@NotNull uv4<? super xv4> uv4Var) {
        return uv4Var.getContext();
    }

    private static final Object i(uv4<? super xv4> uv4Var) {
        z15.e(3);
        throw null;
    }

    public static final void j(@NotNull lc5 lc5Var) {
        ie5.z(lc5Var.y());
    }

    public static final boolean k(@NotNull lc5 lc5Var) {
        ee5 ee5Var = (ee5) lc5Var.y().get(ee5.m0);
        if (ee5Var == null) {
            return true;
        }
        return ee5Var.h();
    }

    public static /* synthetic */ void l(lc5 lc5Var) {
    }

    @NotNull
    public static final lc5 m(@NotNull lc5 lc5Var, @NotNull xv4 xv4Var) {
        return new sl5(lc5Var.y().plus(xv4Var));
    }
}