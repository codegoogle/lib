package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainDispatchers.kt */
@vo4(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0002J\u001e\u0010 \u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "cause", "", "errorHint", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "isDispatchNeeded", "", "limitedParallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", "", "missing", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class pm5 extends qe5 implements vc5 {
    @Nullable
    private final Throwable t;
    @Nullable
    private final String u;

    public /* synthetic */ pm5(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str);
    }

    private final Void J1() {
        String C;
        if (this.t != null) {
            String str = this.u;
            String str2 = "";
            if (str != null && (C = c25.C(". ", str)) != null) {
                str2 = C;
            }
            throw new IllegalStateException(c25.C("Module with the Main dispatcher had failed to initialize", str2), this.t);
        }
        om5.e();
        throw new lo4();
    }

    @Override // com.p7700g.p99005.qe5
    @NotNull
    public qe5 K() {
        return this;
    }

    @Override // com.p7700g.p99005.vc5
    @NotNull
    /* renamed from: K1 */
    public Void j(long j, @NotNull gb5<? super yq4> gb5Var) {
        J1();
        throw new lo4();
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    /* renamed from: Y */
    public Void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        J1();
        throw new lo4();
    }

    @Override // com.p7700g.p99005.vc5
    @NotNull
    public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
        J1();
        throw new lo4();
    }

    @Override // com.p7700g.p99005.vc5
    @Nullable
    public Object r(long j, @NotNull uv4<?> uv4Var) {
        J1();
        throw new lo4();
    }

    @Override // com.p7700g.p99005.qe5, com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Dispatchers.Main[missing");
        Throwable th = this.t;
        return wo1.B(G, th != null ? c25.C(", cause=", th) : "", f14.v);
    }

    @Override // com.p7700g.p99005.ec5
    public boolean w(@NotNull xv4 xv4Var) {
        J1();
        throw new lo4();
    }

    @Override // com.p7700g.p99005.qe5, com.p7700g.p99005.ec5
    @NotNull
    public ec5 z(int i) {
        J1();
        throw new lo4();
    }

    public pm5(@Nullable Throwable th, @Nullable String str) {
        this.t = th;
        this.u = str;
    }
}