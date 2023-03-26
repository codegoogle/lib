package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeContinuationJvm.kt */
@np4
@vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u001aB\u0015\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0001J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "(Lkotlin/coroutines/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "getOrThrow", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public final class bw4<T> implements uv4<T>, lw4 {
    @NotNull
    private static final a s = new a(null);
    @Deprecated
    private static final AtomicReferenceFieldUpdater<bw4<?>, Object> t = AtomicReferenceFieldUpdater.newUpdater(bw4.class, Object.class, "result");
    @Nullable
    private volatile Object result;
    @NotNull
    private final uv4<T> u;

    /* compiled from: SafeContinuationJvm.kt */
    @vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Rd\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\b"}, d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "()V", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "kotlin.jvm.PlatformType", "getRESULT$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bw4(@NotNull uv4<? super T> uv4Var, @Nullable Object obj) {
        c25.p(uv4Var, "delegate");
        this.u = uv4Var;
        this.result = obj;
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public StackTraceElement H() {
        return null;
    }

    @np4
    @Nullable
    public final Object b() {
        Object obj = this.result;
        dw4 dw4Var = dw4.UNDECIDED;
        if (obj == dw4Var) {
            if (t.compareAndSet(this, dw4Var, gw4.h())) {
                return gw4.h();
            }
            obj = this.result;
        }
        if (obj == dw4.RESUMED) {
            return gw4.h();
        }
        if (obj instanceof qp4.b) {
            throw ((qp4.b) obj).s;
        }
        return obj;
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        return this.u.getContext();
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public lw4 o() {
        uv4<T> uv4Var = this.u;
        if (uv4Var instanceof lw4) {
            return (lw4) uv4Var;
        }
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("SafeContinuation for ");
        G.append(this.u);
        return G.toString();
    }

    @Override // com.p7700g.p99005.uv4
    public void u(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            dw4 dw4Var = dw4.UNDECIDED;
            if (obj2 == dw4Var) {
                if (t.compareAndSet(this, dw4Var, obj)) {
                    return;
                }
            } else if (obj2 != gw4.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (t.compareAndSet(this, gw4.h(), dw4.RESUMED)) {
                    this.u.u(obj);
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @np4
    public bw4(@NotNull uv4<? super T> uv4Var) {
        this(uv4Var, dw4.UNDECIDED);
        c25.p(uv4Var, "delegate");
    }
}