package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateFlow.kt */
@vo4(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", "allocateLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/coroutines/Continuation;", "freeLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class dk5 extends kk5<bk5<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(dk5.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state = null;

    @Override // com.p7700g.p99005.kk5
    /* renamed from: c */
    public boolean a(@NotNull bk5<?> bk5Var) {
        an5 an5Var;
        if (this._state != null) {
            return false;
        }
        an5Var = ck5.a;
        this._state = an5Var;
        return true;
    }

    @Nullable
    public final Object d(@NotNull uv4<? super yq4> uv4Var) {
        an5 an5Var;
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        an5Var = ck5.a;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, an5Var, hb5Var)) {
            qp4.a aVar = qp4.s;
            hb5Var.u(qp4.b(yq4.a));
        }
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4.a;
    }

    @Override // com.p7700g.p99005.kk5
    @NotNull
    /* renamed from: e */
    public uv4<yq4>[] b(@NotNull bk5<?> bk5Var) {
        this._state = null;
        return jk5.a;
    }

    public final void f() {
        an5 an5Var;
        an5 an5Var2;
        an5 an5Var3;
        an5 an5Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            an5Var = ck5.b;
            if (obj == an5Var) {
                return;
            }
            an5Var2 = ck5.a;
            if (obj == an5Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                an5Var3 = ck5.b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, an5Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                an5Var4 = ck5.a;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, an5Var4)) {
                    qp4.a aVar = qp4.s;
                    ((hb5) obj).u(qp4.b(yq4.a));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        an5 an5Var;
        an5 an5Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        an5Var = ck5.a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, an5Var);
        c25.m(andSet);
        an5Var2 = ck5.b;
        return andSet == an5Var2;
    }
}