package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.qp4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedContinuation.kt */
@vo4(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000O2\u00060?j\u0002`@2\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJH\u0010+\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u0011\u00105\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u0004\u0018\u00010\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u000309¢\u0006\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\nR\u001c\u0010C\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010G\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "", "awaitReusability", "()V", "", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable", "()Z", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "release", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", CallMraidJS.b, "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "(Ljava/lang/Object;)V", "resumeWith", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ul5<T> extends ad5<T> implements lw4, uv4<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(ul5.class, Object.class, "_reusableCancellableContinuation");
    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @cz4
    @NotNull
    public final ec5 w;
    @cz4
    @NotNull
    public final uv4<T> x;
    @cz4
    @Nullable
    public Object y;
    @cz4
    @NotNull
    public final Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public ul5(@NotNull ec5 ec5Var, @NotNull uv4<? super T> uv4Var) {
        super(-1);
        this.w = ec5Var;
        this.x = uv4Var;
        this.y = vl5.a();
        this.z = fn5.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final hb5<?> p() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof hb5) {
            return (hb5) obj;
        }
        return null;
    }

    public static /* synthetic */ void q() {
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public StackTraceElement H() {
        return null;
    }

    @Override // com.p7700g.p99005.ad5
    public void c(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof vb5) {
            ((vb5) obj).b.M(th);
        }
    }

    @Override // com.p7700g.p99005.ad5
    @NotNull
    public uv4<T> d() {
        return this;
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        return this.x.getContext();
    }

    @Override // com.p7700g.p99005.ad5
    @Nullable
    public Object i() {
        Object obj = this.y;
        this.y = vl5.a();
        return obj;
    }

    public final void j() {
        do {
        } while (this._reusableCancellableContinuation == vl5.b);
    }

    @Nullable
    public final hb5<T> k() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = vl5.b;
                return null;
            } else if (obj instanceof hb5) {
                if (v.compareAndSet(this, obj, vl5.b)) {
                    return (hb5) obj;
                }
            } else if (obj != vl5.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(c25.C("Inconsistent state ", obj).toString());
            }
        }
    }

    public final void l(@NotNull xv4 xv4Var, T t) {
        this.y = t;
        this.u = 1;
        this.w.v(xv4Var, this);
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

    public final boolean r() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean s(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            an5 an5Var = vl5.b;
            if (c25.g(obj, an5Var)) {
                if (v.compareAndSet(this, an5Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (v.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void t() {
        j();
        hb5<?> p = p();
        if (p == null) {
            return;
        }
        p.s();
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("DispatchedContinuation[");
        G.append(this.w);
        G.append(", ");
        G.append(qc5.c(this.x));
        G.append(f14.v);
        return G.toString();
    }

    @Override // com.p7700g.p99005.uv4
    public void u(@NotNull Object obj) {
        xv4 context = this.x.getContext();
        Object d = ac5.d(obj, null, 1, null);
        if (this.w.w(context)) {
            this.y = d;
            this.u = 0;
            this.w.s(context, this);
            return;
        }
        kd5 b = lf5.a.b();
        if (b.a2()) {
            this.y = d;
            this.u = 0;
            b.J1(this);
            return;
        }
        b.T1(true);
        try {
            xv4 context2 = getContext();
            Object c = fn5.c(context2, this.z);
            this.x.u(obj);
            yq4 yq4Var = yq4.a;
            fn5.a(context2, c);
            do {
            } while (b.d2());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void v(@NotNull Object obj, @Nullable f05<? super Throwable, yq4> f05Var) {
        boolean z;
        Object b = ac5.b(obj, f05Var);
        if (this.w.w(getContext())) {
            this.y = b;
            this.u = 1;
            this.w.s(getContext(), this);
            return;
        }
        kd5 b2 = lf5.a.b();
        if (b2.a2()) {
            this.y = b;
            this.u = 1;
            b2.J1(this);
            return;
        }
        b2.T1(true);
        try {
            ee5 ee5Var = (ee5) getContext().get(ee5.m0);
            if (ee5Var == null || ee5Var.h()) {
                z = false;
            } else {
                CancellationException c1 = ee5Var.c1();
                c(b, c1);
                qp4.a aVar = qp4.s;
                u(qp4.b(rp4.a(c1)));
                z = true;
            }
            if (!z) {
                uv4<T> uv4Var = this.x;
                Object obj2 = this.z;
                xv4 context = uv4Var.getContext();
                Object c = fn5.c(context, obj2);
                sf5<?> g = c != fn5.a ? dc5.g(uv4Var, context, c) : null;
                this.x.u(obj);
                yq4 yq4Var = yq4.a;
                z15.d(1);
                if (g == null || g.x1()) {
                    fn5.a(context, c);
                }
                z15.c(1);
            }
            do {
            } while (b2.d2());
            z15.d(1);
        } catch (Throwable th) {
            try {
                g(th, null);
                z15.d(1);
            } catch (Throwable th2) {
                z15.d(1);
                b2.K(true);
                z15.c(1);
                throw th2;
            }
        }
        b2.K(true);
        z15.c(1);
    }

    public final boolean w(@Nullable Object obj) {
        ee5 ee5Var = (ee5) getContext().get(ee5.m0);
        if (ee5Var == null || ee5Var.h()) {
            return false;
        }
        CancellationException c1 = ee5Var.c1();
        c(obj, c1);
        qp4.a aVar = qp4.s;
        u(qp4.b(rp4.a(c1)));
        return true;
    }

    public final void x(@NotNull Object obj) {
        uv4<T> uv4Var = this.x;
        Object obj2 = this.z;
        xv4 context = uv4Var.getContext();
        Object c = fn5.c(context, obj2);
        sf5<?> g = c != fn5.a ? dc5.g(uv4Var, context, c) : null;
        try {
            this.x.u(obj);
            yq4 yq4Var = yq4.a;
        } finally {
            z15.d(1);
            if (g == null || g.x1()) {
                fn5.a(context, c);
            }
            z15.c(1);
        }
    }

    @Nullable
    public final Throwable y(@NotNull gb5<?> gb5Var) {
        an5 an5Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            an5Var = vl5.b;
            if (obj != an5Var) {
                if (obj instanceof Throwable) {
                    if (v.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(c25.C("Inconsistent state ", obj).toString());
            }
        } while (!v.compareAndSet(this, an5Var, gb5Var));
        return null;
    }
}