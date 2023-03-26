package com.p7700g.p99005;

import com.p7700g.p99005.hm5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0014\u0010\u0016\u001a\u00020\u00122\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001f\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/Closed;", "E", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "closeCause", "", "(Ljava/lang/Throwable;)V", "offerResult", "getOfferResult", "()Lkotlinx/coroutines/channels/Closed;", "pollResult", "getPollResult", "receiveException", "getReceiveException", "()Ljava/lang/Throwable;", "sendException", "getSendException", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "completeResumeSend", "resumeSendClosed", "closed", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "tryResumeSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class xg5<E> extends mh5 implements kh5<E> {
    @cz4
    @Nullable
    public final Throwable v;

    public xg5(@Nullable Throwable th) {
        this.v = th;
    }

    @Override // com.p7700g.p99005.kh5
    public void A(E e) {
    }

    @Override // com.p7700g.p99005.mh5
    public void D0() {
    }

    @Override // com.p7700g.p99005.kh5
    @NotNull
    public an5 F(E e, @Nullable hm5.d dVar) {
        an5 an5Var = ib5.d;
        if (dVar != null) {
            dVar.d();
        }
        return an5Var;
    }

    @Override // com.p7700g.p99005.mh5
    public void F0(@NotNull xg5<?> xg5Var) {
    }

    @Override // com.p7700g.p99005.mh5
    @NotNull
    public an5 G0(@Nullable hm5.d dVar) {
        an5 an5Var = ib5.d;
        if (dVar != null) {
            dVar.d();
        }
        return an5Var;
    }

    @Override // com.p7700g.p99005.kh5
    @NotNull
    /* renamed from: I0 */
    public xg5<E> l() {
        return this;
    }

    @Override // com.p7700g.p99005.mh5
    @NotNull
    /* renamed from: J0 */
    public xg5<E> E0() {
        return this;
    }

    @NotNull
    public final Throwable K0() {
        Throwable th = this.v;
        return th == null ? new yg5(tg5.a) : th;
    }

    @NotNull
    public final Throwable L0() {
        Throwable th = this.v;
        return th == null ? new zg5(tg5.a) : th;
    }

    @Override // com.p7700g.p99005.hm5
    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Closed@");
        G.append(qc5.b(this));
        G.append(f14.u);
        G.append(this.v);
        G.append(f14.v);
        return G.toString();
    }
}