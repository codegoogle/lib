package com.p7700g.p99005;

import com.p7700g.p99005.ee5;
import com.p7700g.p99005.qm3;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NonCancellable.kt */
@vo4(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\u0018\u0010\u001c\u001a\u00020\u001f2\u000e\u0010\u001d\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017J\f\u0010\"\u001a\u00060 j\u0002`!H\u0017JA\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001f0(j\u0002`+H\u0017J1\u0010#\u001a\u00020$2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001f0(j\u0002`+H\u0017J\u0011\u0010,\u001a\u00020\u001fH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\nH\u0017J\b\u0010/\u001a\u00020\u0012H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\t\u0010\fR\u001a\u0010\r\u001a\u00020\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\u00020\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u00148VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlinx/coroutines/NonCancellable;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/Job;", "()V", "children", "Lkotlin/sequences/Sequence;", "getChildren$annotations", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "isActive$annotations", "()Z", "isCancelled", "isCancelled$annotations", "isCompleted", "isCompleted$annotations", qm3.b.j, "", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", com.anythink.expressad.d.a.b.dO, "cause", "", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.anythink.expressad.foundation.d.c.bR, "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class se5 extends rv4 implements ee5 {
    @NotNull
    public static final se5 s = new se5();
    @NotNull
    private static final String t = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private se5() {
        super(ee5.m0);
    }

    @xn4(level = zn4.WARNING, message = t)
    public static /* synthetic */ void F() {
    }

    @xn4(level = zn4.WARNING, message = t)
    public static /* synthetic */ void s() {
    }

    @xn4(level = zn4.WARNING, message = t)
    public static /* synthetic */ void v() {
    }

    @xn4(level = zn4.WARNING, message = t)
    public static /* synthetic */ void w() {
    }

    @xn4(level = zn4.WARNING, message = t)
    public static /* synthetic */ void z() {
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public g75<ee5> X() {
        return m75.g();
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.WARNING, message = t)
    @NotNull
    public gd5 X0(boolean z, boolean z2, @NotNull f05<? super Throwable, yq4> f05Var) {
        return te5.s;
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public ee5 X2(@NotNull ee5 ee5Var) {
        return ee5.a.i(this, ee5Var);
    }

    @Override // com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        return false;
    }

    @Override // com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    @xn4(level = zn4.WARNING, message = t)
    public void b(@Nullable CancellationException cancellationException) {
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.WARNING, message = t)
    @NotNull
    public CancellationException c1() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        b(null);
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.WARNING, message = t)
    @NotNull
    public gd5 d3(@NotNull f05<? super Throwable, yq4> f05Var) {
        return te5.s;
    }

    @Override // com.p7700g.p99005.ee5
    public boolean h() {
        return true;
    }

    @Override // com.p7700g.p99005.ee5
    public boolean isCancelled() {
        return false;
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public ko5 k3() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // com.p7700g.p99005.ee5
    public boolean m() {
        return false;
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.WARNING, message = t)
    public boolean start() {
        return false;
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.WARNING, message = t)
    @NotNull
    public mb5 t3(@NotNull ob5 ob5Var) {
        return te5.s;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.WARNING, message = t)
    @Nullable
    public Object x0(@NotNull uv4<? super yq4> uv4Var) {
        throw new UnsupportedOperationException("This job is always active");
    }
}