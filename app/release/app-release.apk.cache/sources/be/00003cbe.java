package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Actor.kt */
@vo4(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003BM\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\rH\u0014JV\u0010\u001d\u001a\u00020\r\"\u0004\b\u0001\u0010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0 2\u0006\u0010!\u001a\u00028\u00002(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0&2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ActorCoroutine;", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function2;)V", "continuation", "onSend", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", com.anythink.expressad.foundation.d.c.cd, "", "cause", "", "offer", "element", "(Ljava/lang/Object;)Z", "onStart", "registerSelectClause2", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "param", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ch5<E> extends eg5<E> implements mo5<E, nh5<? super E>> {
    @NotNull
    private uv4<? super yq4> v;

    public ch5(@NotNull xv4 xv4Var, @NotNull og5<E> og5Var, @NotNull j05<? super gg5<E>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        super(xv4Var, og5Var, false);
        this.v = fw4.c(j05Var, this, this);
    }

    @Override // com.p7700g.p99005.pg5, com.p7700g.p99005.nh5
    @NotNull
    public Object F(E e) {
        start();
        return super.F(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.mo5
    public <R> void G(@NotNull no5<? super R> no5Var, E e, @NotNull j05<? super nh5<? super E>, ? super uv4<? super R>, ? extends Object> j05Var) {
        start();
        super.v().G(no5Var, e, j05Var);
    }

    @Override // com.p7700g.p99005.pg5, com.p7700g.p99005.nh5
    @Nullable
    public Object I(E e, @NotNull uv4<? super yq4> uv4Var) {
        start();
        Object I = super.I(e, uv4Var);
        return I == gw4.h() ? I : yq4.a;
    }

    @Override // com.p7700g.p99005.me5
    public void Y0() {
        on5.c(this.v, this);
    }

    @Override // com.p7700g.p99005.pg5, com.p7700g.p99005.nh5
    public boolean g(E e) {
        start();
        return super.g(e);
    }

    @Override // com.p7700g.p99005.pg5, com.p7700g.p99005.nh5
    @NotNull
    public mo5<E, nh5<E>> v() {
        return this;
    }

    @Override // com.p7700g.p99005.pg5, com.p7700g.p99005.nh5
    public boolean x(@Nullable Throwable th) {
        boolean x = super.x(th);
        start();
        return x;
    }
}