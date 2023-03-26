package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@vo4(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bR\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", CallMraidJS.b, "clearThreadContext", "", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sf5<T> extends wm5<T> {
    @NotNull
    private ThreadLocal<hp4<xv4, Object>> v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sf5(@NotNull xv4 xv4Var, @NotNull uv4<? super T> uv4Var) {
        super(xv4Var.get(r0) == null ? xv4Var.plus(r0) : xv4Var, uv4Var);
        tf5 tf5Var = tf5.s;
        this.v = new ThreadLocal<>();
    }

    @Override // com.p7700g.p99005.wm5, com.p7700g.p99005.qa5
    public void r1(@Nullable Object obj) {
        hp4<xv4, Object> hp4Var = this.v.get();
        if (hp4Var != null) {
            fn5.a(hp4Var.f(), hp4Var.g());
            this.v.set(null);
        }
        Object a = ac5.a(obj, this.u);
        uv4<T> uv4Var = this.u;
        xv4 context = uv4Var.getContext();
        Object c = fn5.c(context, null);
        sf5<?> g = c != fn5.a ? dc5.g(uv4Var, context, c) : null;
        try {
            this.u.u(a);
            yq4 yq4Var = yq4.a;
        } finally {
            if (g == null || g.x1()) {
                fn5.a(context, c);
            }
        }
    }

    public final boolean x1() {
        if (this.v.get() == null) {
            return false;
        }
        this.v.set(null);
        return true;
    }

    public final void y1(@NotNull xv4 xv4Var, @Nullable Object obj) {
        this.v.set(cq4.a(xv4Var, obj));
    }
}