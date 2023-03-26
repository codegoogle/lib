package com.p7700g.p99005;

import com.p7700g.p99005.hm5;
import com.p7700g.p99005.qp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@vo4(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/SendElement;", "E", "Lkotlinx/coroutines/channels/Send;", "pollResult", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class oh5<E> extends mh5 {
    private final E v;
    @cz4
    @NotNull
    public final gb5<yq4> w;

    /* JADX WARN: Multi-variable type inference failed */
    public oh5(E e, @NotNull gb5<? super yq4> gb5Var) {
        this.v = e;
        this.w = gb5Var;
    }

    @Override // com.p7700g.p99005.mh5
    public void D0() {
        this.w.w0(ib5.d);
    }

    @Override // com.p7700g.p99005.mh5
    public E E0() {
        return this.v;
    }

    @Override // com.p7700g.p99005.mh5
    public void F0(@NotNull xg5<?> xg5Var) {
        gb5<yq4> gb5Var = this.w;
        qp4.a aVar = qp4.s;
        gb5Var.u(qp4.b(rp4.a(xg5Var.L0())));
    }

    @Override // com.p7700g.p99005.mh5
    @Nullable
    public an5 G0(@Nullable hm5.d dVar) {
        if (this.w.n(yq4.a, dVar == null ? null : dVar.c) == null) {
            return null;
        }
        if (dVar != null) {
            dVar.d();
        }
        return ib5.d;
    }

    @Override // com.p7700g.p99005.hm5
    @NotNull
    public String toString() {
        return qc5.a(this) + '@' + qc5.b(this) + '(' + E0() + ')';
    }
}