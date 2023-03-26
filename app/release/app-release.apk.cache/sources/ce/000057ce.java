package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractCoroutine.kt */
@vo4(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u001aH\u0010¢\u0006\u0002\b J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\tH\u0014J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0004J\u001c\u0010(\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*ø\u0001\u0000¢\u0006\u0002\u0010&JM\u0010+\u001a\u00020\u0016\"\u0004\b\u0001\u0010,2\u0006\u0010+\u001a\u00020-2\u0006\u0010.\u001a\u0002H,2'\u0010/\u001a#\b\u0001\u0012\u0004\u0012\u0002H,\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001800¢\u0006\u0002\b1ø\u0001\u0000¢\u0006\u0002\u00102R\u0017\u0010\f\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "initParentJob", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "context", "getContext$annotations", "()V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "isActive", "()Z", "afterResume", "", CallMraidJS.b, "", "cancellationExceptionMessage", "", "handleOnCompletionException", "exception", "", "handleOnCompletionException$kotlinx_coroutines_core", "nameString", "nameString$kotlinx_coroutines_core", "onCancelled", "cause", "handled", "onCompleted", "value", "(Ljava/lang/Object;)V", "onCompletionInternal", "resumeWith", "result", "Lkotlin/Result;", com.anythink.expressad.foundation.d.c.bR, "R", "Lkotlinx/coroutines/CoroutineStart;", "receiver", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public abstract class qa5<T> extends me5 implements ee5, uv4<T>, lc5 {
    @NotNull
    private final xv4 t;

    public qa5(@NotNull xv4 xv4Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            F0((ee5) xv4Var.get(ee5.m0));
        }
        this.t = xv4Var.plus(this);
    }

    public static /* synthetic */ void s1() {
    }

    @Override // com.p7700g.p99005.me5
    public final void E0(@NotNull Throwable th) {
        hc5.b(this.t, th);
    }

    @Override // com.p7700g.p99005.me5
    @NotNull
    public String Q0() {
        String b = dc5.b(this.t);
        if (b == null) {
            return super.Q0();
        }
        return h95.b + b + "\":" + super.Q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.me5
    public final void W0(@Nullable Object obj) {
        if (obj instanceof ub5) {
            ub5 ub5Var = (ub5) obj;
            t1(ub5Var.b, ub5Var.a());
            return;
        }
        u1(obj);
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public final xv4 getContext() {
        return this.t;
    }

    @Override // com.p7700g.p99005.me5, com.p7700g.p99005.ee5
    public boolean h() {
        return super.h();
    }

    @Override // com.p7700g.p99005.me5
    @NotNull
    public String i0() {
        return c25.C(qc5.a(this), " was cancelled");
    }

    public void r1(@Nullable Object obj) {
        a0(obj);
    }

    public void t1(@NotNull Throwable th, boolean z) {
    }

    @Override // com.p7700g.p99005.uv4
    public final void u(@NotNull Object obj) {
        Object O0 = O0(ac5.d(obj, null, 1, null));
        if (O0 == ne5.b) {
            return;
        }
        r1(O0);
    }

    public void u1(T t) {
    }

    public final <R> void v1(@NotNull nc5 nc5Var, R r, @NotNull j05<? super R, ? super uv4<? super T>, ? extends Object> j05Var) {
        nc5Var.h(j05Var, r, this);
    }

    @Override // com.p7700g.p99005.lc5
    @NotNull
    public xv4 y() {
        return this.t;
    }
}