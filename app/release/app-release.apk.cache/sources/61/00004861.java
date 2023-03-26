package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Supervisor.kt */
@vo4(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0000\u001aM\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"SupervisorJob", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "SupervisorJob0", "supervisorScope", "R", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class if5 {
    @NotNull
    public static final sb5 a(@Nullable ee5 ee5Var) {
        return new hf5(ee5Var);
    }

    public static /* synthetic */ sb5 c(ee5 ee5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ee5Var = null;
        }
        return a(ee5Var);
    }

    public static /* synthetic */ ee5 d(ee5 ee5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ee5Var = null;
        }
        return a(ee5Var);
    }

    @Nullable
    public static final <R> Object e(@NotNull j05<? super lc5, ? super uv4<? super R>, ? extends Object> j05Var, @NotNull uv4<? super R> uv4Var) {
        gf5 gf5Var = new gf5(uv4Var.getContext(), uv4Var);
        Object f = pn5.f(gf5Var, gf5Var, j05Var);
        if (f == gw4.h()) {
            ow4.c(uv4Var);
        }
        return f;
    }
}