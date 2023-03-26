package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.p7700g.p99005.ee5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuationImpl.kt */
@np4
@vo4(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u008a\u00012\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\u00060tj\u0002`uB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010+J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ8\u0010F\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bJ\u0010KJB\u0010L\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00105\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u001fH\u0001¢\u0006\u0004\bU\u0010IJ<\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bY\u0010ZJ \u0010]\u001a\u00020\u00112\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010)JZ\u0010`\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020^2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010_\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bb\u0010:J\u000f\u0010d\u001a\u00020NH\u0016¢\u0006\u0004\bd\u0010PJ\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010IJ#\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010fJH\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\be\u0010gJJ\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010IJ\u001b\u0010p\u001a\u00020\u0011*\u00020o2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u0011*\u00020o2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010sR\u001c\u0010x\u001a\n\u0018\u00010tj\u0004\u0018\u0001`u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u0003\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0082\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00105\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0088\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "cause", "", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", "", com.anythink.expressad.d.a.b.dO, "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", CallMraidJS.b, "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "()Z", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "releaseClaimedReusableContinuation", "resetStateReusable", "value", com.anythink.expressad.foundation.d.c.ca, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class hb5<T> extends ad5<T> implements gb5<T>, lw4 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(hb5.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(hb5.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ int _decision;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull
    private final uv4<T> x;
    @NotNull
    private final xv4 y;
    @Nullable
    private gd5 z;

    /* JADX WARN: Multi-variable type inference failed */
    public hb5(@NotNull uv4<? super T> uv4Var, int i) {
        super(i);
        this.x = uv4Var;
        this.y = uv4Var.getContext();
        this._decision = 0;
        this._state = ta5.s;
    }

    private final gd5 A() {
        ee5 ee5Var = (ee5) getContext().get(ee5.m0);
        if (ee5Var == null) {
            return null;
        }
        gd5 f = ee5.a.f(ee5Var, true, false, new lb5(this), 2, null);
        this.z = f;
        return f;
    }

    private final boolean B() {
        return bd5.d(this.u) && ((ul5) this.x).r();
    }

    private final eb5 C(f05<? super Throwable, yq4> f05Var) {
        return f05Var instanceof eb5 ? (eb5) f05Var : new be5(f05Var);
    }

    private final void E(f05<? super Throwable, yq4> f05Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f05Var + ", already has " + obj).toString());
    }

    private final void I() {
        uv4<T> uv4Var = this.x;
        ul5 ul5Var = uv4Var instanceof ul5 ? (ul5) uv4Var : null;
        Throwable y = ul5Var != null ? ul5Var.y(this) : null;
        if (y == null) {
            return;
        }
        s();
        a(y);
    }

    private final void L(Object obj, int i, f05<? super Throwable, yq4> f05Var) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof ue5) {
            } else {
                if (obj2 instanceof kb5) {
                    kb5 kb5Var = (kb5) obj2;
                    if (kb5Var.c()) {
                        if (f05Var == null) {
                            return;
                        }
                        q(f05Var, kb5Var.b);
                        return;
                    }
                }
                j(obj);
                throw new lo4();
            }
        } while (!w.compareAndSet(this, obj2, O((ue5) obj2, obj, i, f05Var, null)));
        t();
        v(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void M(hb5 hb5Var, Object obj, int i, f05 f05Var, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            f05Var = null;
        }
        hb5Var.L(obj, i, f05Var);
    }

    private final Object O(ue5 ue5Var, Object obj, int i, f05<? super Throwable, yq4> f05Var, Object obj2) {
        if (obj instanceof ub5) {
            return obj;
        }
        if (bd5.c(i) || obj2 != null) {
            if (f05Var != null || (((ue5Var instanceof eb5) && !(ue5Var instanceof wa5)) || obj2 != null)) {
                return new tb5(obj, ue5Var instanceof eb5 ? (eb5) ue5Var : null, f05Var, obj2, null, 16, null);
            }
            return obj;
        }
        return obj;
    }

    private final boolean P() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!v.compareAndSet(this, 0, 2));
        return true;
    }

    private final an5 Q(Object obj, Object obj2, f05<? super Throwable, yq4> f05Var) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof ue5) {
            } else if ((obj3 instanceof tb5) && obj2 != null && ((tb5) obj3).d == obj2) {
                return ib5.d;
            } else {
                return null;
            }
        } while (!w.compareAndSet(this, obj3, O((ue5) obj3, obj, this.u, f05Var, obj2)));
        t();
        return ib5.d;
    }

    private final boolean U() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!v.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(c25.C("Already resumed, but proposed with update ", obj).toString());
    }

    private final void k(f05<? super Throwable, yq4> f05Var, Throwable th) {
        try {
            f05Var.M(th);
        } catch (Throwable th2) {
            hc5.b(getContext(), new xb5(c25.C("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final void p(uz4<yq4> uz4Var) {
        try {
            uz4Var.x();
        } catch (Throwable th) {
            hc5.b(getContext(), new xb5(c25.C("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    private final boolean r(Throwable th) {
        if (B()) {
            return ((ul5) this.x).s(th);
        }
        return false;
    }

    private final void t() {
        if (B()) {
            return;
        }
        s();
    }

    private final void v(int i) {
        if (P()) {
            return;
        }
        bd5.a(this, i);
    }

    private final String z() {
        Object y = y();
        return y instanceof ue5 ? "Active" : y instanceof kb5 ? "Cancelled" : "Completed";
    }

    @Override // com.p7700g.p99005.gb5
    public void D(@NotNull f05<? super Throwable, yq4> f05Var) {
        eb5 C = C(f05Var);
        while (true) {
            Object obj = this._state;
            if (obj instanceof ta5) {
                if (w.compareAndSet(this, obj, C)) {
                    return;
                }
            } else if (obj instanceof eb5) {
                E(f05Var, obj);
            } else {
                boolean z = obj instanceof ub5;
                if (z) {
                    ub5 ub5Var = (ub5) obj;
                    if (!ub5Var.b()) {
                        E(f05Var, obj);
                    }
                    if (obj instanceof kb5) {
                        if (!z) {
                            ub5Var = null;
                        }
                        k(f05Var, ub5Var != null ? ub5Var.b : null);
                        return;
                    }
                    return;
                } else if (obj instanceof tb5) {
                    tb5 tb5Var = (tb5) obj;
                    if (tb5Var.b != null) {
                        E(f05Var, obj);
                    }
                    if (C instanceof wa5) {
                        return;
                    }
                    if (tb5Var.h()) {
                        k(f05Var, tb5Var.e);
                        return;
                    } else {
                        if (w.compareAndSet(this, obj, tb5.g(tb5Var, null, C, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (C instanceof wa5) {
                    return;
                } else {
                    if (w.compareAndSet(this, obj, new tb5(obj, C, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @NotNull
    public String F() {
        return "CancellableContinuation";
    }

    public final void G(@NotNull Throwable th) {
        if (r(th)) {
            return;
        }
        a(th);
        t();
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public StackTraceElement H() {
        return null;
    }

    @Override // com.p7700g.p99005.gb5
    @Nullable
    public Object J(@NotNull Throwable th) {
        return Q(new ub5(th, false, 2, null), null, null);
    }

    @fz4(name = "resetStateReusable")
    public final boolean K() {
        Object obj = this._state;
        if ((obj instanceof tb5) && ((tb5) obj).d != null) {
            s();
            return false;
        }
        this._decision = 0;
        this._state = ta5.s;
        return true;
    }

    @Override // com.p7700g.p99005.gb5
    @Nullable
    public Object N(T t, @Nullable Object obj, @Nullable f05<? super Throwable, yq4> f05Var) {
        return Q(t, obj, f05Var);
    }

    @Override // com.p7700g.p99005.gb5
    public void R(@NotNull ec5 ec5Var, @NotNull Throwable th) {
        uv4<T> uv4Var = this.x;
        ul5 ul5Var = uv4Var instanceof ul5 ? (ul5) uv4Var : null;
        M(this, new ub5(th, false, 2, null), (ul5Var != null ? ul5Var.w : null) == ec5Var ? 4 : this.u, null, 4, null);
    }

    @Override // com.p7700g.p99005.gb5
    public void S(@NotNull ec5 ec5Var, T t) {
        uv4<T> uv4Var = this.x;
        ul5 ul5Var = uv4Var instanceof ul5 ? (ul5) uv4Var : null;
        M(this, t, (ul5Var != null ? ul5Var.w : null) == ec5Var ? 4 : this.u, null, 4, null);
    }

    @Override // com.p7700g.p99005.gb5
    public void T() {
        gd5 A = A();
        if (A != null && m()) {
            A.w();
            this.z = te5.s;
        }
    }

    @Override // com.p7700g.p99005.gb5
    public void V(T t, @Nullable f05<? super Throwable, yq4> f05Var) {
        L(t, this.u, f05Var);
    }

    @Override // com.p7700g.p99005.gb5
    public boolean a(@Nullable Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof ue5)) {
                return false;
            }
            z = obj instanceof eb5;
        } while (!w.compareAndSet(this, obj, new kb5(this, th, z)));
        eb5 eb5Var = z ? (eb5) obj : null;
        if (eb5Var != null) {
            l(eb5Var, th);
        }
        t();
        v(this.u);
        return true;
    }

    @Override // com.p7700g.p99005.ad5
    public void c(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof ue5)) {
                if (obj2 instanceof ub5) {
                    return;
                }
                if (obj2 instanceof tb5) {
                    tb5 tb5Var = (tb5) obj2;
                    if (!tb5Var.h()) {
                        if (w.compareAndSet(this, obj2, tb5.g(tb5Var, null, null, null, null, th, 15, null))) {
                            tb5Var.i(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (w.compareAndSet(this, obj2, new tb5(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // com.p7700g.p99005.ad5
    @NotNull
    public final uv4<T> d() {
        return this.x;
    }

    @Override // com.p7700g.p99005.ad5
    @Nullable
    public Throwable e(@Nullable Object obj) {
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        d();
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.ad5
    public <T> T f(@Nullable Object obj) {
        return obj instanceof tb5 ? (T) ((tb5) obj).a : obj;
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        return this.y;
    }

    @Override // com.p7700g.p99005.gb5
    public boolean h() {
        return y() instanceof ue5;
    }

    @Override // com.p7700g.p99005.ad5
    @Nullable
    public Object i() {
        return y();
    }

    @Override // com.p7700g.p99005.gb5
    public boolean isCancelled() {
        return y() instanceof kb5;
    }

    public final void l(@NotNull eb5 eb5Var, @Nullable Throwable th) {
        try {
            eb5Var.a(th);
        } catch (Throwable th2) {
            hc5.b(getContext(), new xb5(c25.C("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    @Override // com.p7700g.p99005.gb5
    public boolean m() {
        return !(y() instanceof ue5);
    }

    @Override // com.p7700g.p99005.gb5
    @Nullable
    public Object n(T t, @Nullable Object obj) {
        return Q(t, obj, null);
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public lw4 o() {
        uv4<T> uv4Var = this.x;
        if (uv4Var instanceof lw4) {
            return (lw4) uv4Var;
        }
        return null;
    }

    public final void q(@NotNull f05<? super Throwable, yq4> f05Var, @NotNull Throwable th) {
        try {
            f05Var.M(th);
        } catch (Throwable th2) {
            hc5.b(getContext(), new xb5(c25.C("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public final void s() {
        gd5 gd5Var = this.z;
        if (gd5Var == null) {
            return;
        }
        gd5Var.w();
        this.z = te5.s;
    }

    @NotNull
    public String toString() {
        return F() + '(' + qc5.c(this.x) + "){" + z() + "}@" + qc5.b(this);
    }

    @Override // com.p7700g.p99005.uv4
    public void u(@NotNull Object obj) {
        M(this, ac5.c(obj, this), this.u, null, 4, null);
    }

    @NotNull
    public Throwable w(@NotNull ee5 ee5Var) {
        return ee5Var.c1();
    }

    @Override // com.p7700g.p99005.gb5
    public void w0(@NotNull Object obj) {
        v(this.u);
    }

    @np4
    @Nullable
    public final Object x() {
        ee5 ee5Var;
        boolean B = B();
        if (U()) {
            if (this.z == null) {
                A();
            }
            if (B) {
                I();
            }
            return gw4.h();
        }
        if (B) {
            I();
        }
        Object y = y();
        if (y instanceof ub5) {
            throw ((ub5) y).b;
        }
        if (bd5.c(this.u) && (ee5Var = (ee5) getContext().get(ee5.m0)) != null && !ee5Var.h()) {
            CancellationException c1 = ee5Var.c1();
            c(y, c1);
            throw c1;
        }
        return f(y);
    }

    @Nullable
    public final Object y() {
        return this._state;
    }
}