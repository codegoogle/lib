package com.p7700g.p99005;

import com.p7700g.p99005.nh5;
import org.jetbrains.annotations.NotNull;

/* compiled from: Produce.kt */
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0014J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u0013R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;)V", "isActive", "", "()Z", "onCancelled", "", "cause", "", "handled", "onCompleted", "value", "(Lkotlin/Unit;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class gh5<E> extends pg5<E> implements hh5<E> {
    public gh5(@NotNull xv4 xv4Var, @NotNull og5<E> og5Var) {
        super(xv4Var, og5Var, true, true);
    }

    @Override // com.p7700g.p99005.pg5, com.p7700g.p99005.hh5
    public /* bridge */ /* synthetic */ nh5 c() {
        return c();
    }

    @Override // com.p7700g.p99005.qa5, com.p7700g.p99005.me5, com.p7700g.p99005.ee5
    public boolean h() {
        return super.h();
    }

    @Override // com.p7700g.p99005.qa5
    public void t1(@NotNull Throwable th, boolean z) {
        if (w1().x(th) || z) {
            return;
        }
        hc5.b(getContext(), th);
    }

    @Override // com.p7700g.p99005.qa5
    /* renamed from: x1 */
    public void u1(@NotNull yq4 yq4Var) {
        nh5.a.a(w1(), null, 1, null);
    }
}