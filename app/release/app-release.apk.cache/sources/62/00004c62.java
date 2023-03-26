package com.p7700g.p99005;

import com.p7700g.p99005.ee5;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xv4;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@vo4(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a\u001b\u0010\u001b\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", com.anythink.expressad.d.a.b.dO, "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", qm3.b.j, "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ke5 {
    public static final boolean A(@NotNull xv4 xv4Var) {
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        return ee5Var != null && ee5Var.h();
    }

    private static final Throwable B(Throwable th, ee5 ee5Var) {
        return th == null ? new fe5("Job was cancelled", null, ee5Var) : th;
    }

    @NotNull
    public static final sb5 a(@Nullable ee5 ee5Var) {
        return new he5(ee5Var);
    }

    @fz4(name = "Job")
    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ ee5 b(ee5 ee5Var) {
        return ie5.a(ee5Var);
    }

    public static /* synthetic */ sb5 c(ee5 ee5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ee5Var = null;
        }
        return ie5.a(ee5Var);
    }

    public static /* synthetic */ ee5 d(ee5 ee5Var, int i, Object obj) {
        ee5 b;
        if ((i & 1) != 0) {
            ee5Var = null;
        }
        b = b(ee5Var);
        return b;
    }

    public static final void f(@NotNull xv4 xv4Var, @Nullable CancellationException cancellationException) {
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        if (ee5Var == null) {
            return;
        }
        ee5Var.b(cancellationException);
    }

    public static final void g(@NotNull ee5 ee5Var, @NotNull String str, @Nullable Throwable th) {
        ee5Var.b(pd5.a(str, th));
    }

    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(xv4 xv4Var, Throwable th) {
        xv4.b bVar = xv4Var.get(ee5.m0);
        me5 me5Var = bVar instanceof me5 ? (me5) bVar : null;
        if (me5Var == null) {
            return false;
        }
        me5Var.f0(B(th, me5Var));
        return true;
    }

    public static /* synthetic */ void i(xv4 xv4Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        ie5.f(xv4Var, cancellationException);
    }

    public static /* synthetic */ void j(ee5 ee5Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        ie5.g(ee5Var, str, th);
    }

    public static /* synthetic */ boolean k(xv4 xv4Var, Throwable th, int i, Object obj) {
        boolean h;
        if ((i & 1) != 0) {
            th = null;
        }
        h = h(xv4Var, th);
        return h;
    }

    @Nullable
    public static final Object l(@NotNull ee5 ee5Var, @NotNull uv4<? super yq4> uv4Var) {
        ee5.a.b(ee5Var, null, 1, null);
        Object x0 = ee5Var.x0(uv4Var);
        return x0 == gw4.h() ? x0 : yq4.a;
    }

    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(xv4 xv4Var, Throwable th) {
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        if (ee5Var == null) {
            return;
        }
        for (ee5 ee5Var2 : ee5Var.X()) {
            me5 me5Var = ee5Var2 instanceof me5 ? (me5) ee5Var2 : null;
            if (me5Var != null) {
                me5Var.f0(B(th, ee5Var));
            }
        }
    }

    public static final void o(@NotNull xv4 xv4Var, @Nullable CancellationException cancellationException) {
        g75<ee5> X;
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        if (ee5Var == null || (X = ee5Var.X()) == null) {
            return;
        }
        for (ee5 ee5Var2 : X) {
            ee5Var2.b(cancellationException);
        }
    }

    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(ee5 ee5Var, Throwable th) {
        for (ee5 ee5Var2 : ee5Var.X()) {
            me5 me5Var = ee5Var2 instanceof me5 ? (me5) ee5Var2 : null;
            if (me5Var != null) {
                me5Var.f0(B(th, ee5Var));
            }
        }
    }

    public static final void r(@NotNull ee5 ee5Var, @Nullable CancellationException cancellationException) {
        for (ee5 ee5Var2 : ee5Var.X()) {
            ee5Var2.b(cancellationException);
        }
    }

    public static /* synthetic */ void s(xv4 xv4Var, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        n(xv4Var, th);
    }

    public static /* synthetic */ void t(xv4 xv4Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        ie5.o(xv4Var, cancellationException);
    }

    public static /* synthetic */ void u(ee5 ee5Var, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        q(ee5Var, th);
    }

    public static /* synthetic */ void v(ee5 ee5Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        ie5.r(ee5Var, cancellationException);
    }

    @NotNull
    public static final gd5 w(@NotNull ee5 ee5Var, @NotNull gd5 gd5Var) {
        return ee5Var.d3(new id5(gd5Var));
    }

    public static final void x(@NotNull xv4 xv4Var) {
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        if (ee5Var == null) {
            return;
        }
        ie5.A(ee5Var);
    }

    public static final void y(@NotNull ee5 ee5Var) {
        if (!ee5Var.h()) {
            throw ee5Var.c1();
        }
    }

    @NotNull
    public static final ee5 z(@NotNull xv4 xv4Var) {
        ee5 ee5Var = (ee5) xv4Var.get(ee5.m0);
        if (ee5Var != null) {
            return ee5Var;
        }
        throw new IllegalStateException(c25.C("Current context doesn't contain Job in it: ", xv4Var).toString());
    }
}