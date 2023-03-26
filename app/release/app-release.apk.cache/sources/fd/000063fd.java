package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scopes.kt */
@vo4(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bR\u0019\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "isScopedCoroutine", "", "()Z", "parent", "Lkotlinx/coroutines/Job;", "getParent$kotlinx_coroutines_core", "()Lkotlinx/coroutines/Job;", "afterCompletion", "", CallMraidJS.b, "", "afterResume", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class wm5<T> extends qa5<T> implements lw4 {
    @cz4
    @NotNull
    public final uv4<T> u;

    /* JADX WARN: Multi-variable type inference failed */
    public wm5(@NotNull xv4 xv4Var, @NotNull uv4<? super T> uv4Var) {
        super(xv4Var, true, true);
        this.u = uv4Var;
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public final StackTraceElement H() {
        return null;
    }

    @Override // com.p7700g.p99005.me5
    public final boolean I0() {
        return true;
    }

    @Override // com.p7700g.p99005.me5
    public void a0(@Nullable Object obj) {
        vl5.g(fw4.d(this.u), ac5.a(obj, this.u), null, 2, null);
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public final lw4 o() {
        uv4<T> uv4Var = this.u;
        if (uv4Var instanceof lw4) {
            return (lw4) uv4Var;
        }
        return null;
    }

    @Override // com.p7700g.p99005.qa5
    public void r1(@Nullable Object obj) {
        uv4<T> uv4Var = this.u;
        uv4Var.u(ac5.a(obj, uv4Var));
    }

    @Nullable
    public final ee5 w1() {
        mb5 B0 = B0();
        if (B0 == null) {
            return null;
        }
        return B0.getParent();
    }
}