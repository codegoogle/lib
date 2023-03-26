package com.p7700g.p99005;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelCoroutine.kt */
@vo4(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020\u0003H\u0016J\u0012\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0016\u0010\"\u001a\u00020\u00032\u000e\u0010#\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0016J\u0013\u0010(\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0001J.\u0010)\u001a\u00020\u00032#\u0010*\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010$¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030+H\u0097\u0001J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096\u0003J\u0016\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u00102J\u0010\u00103\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0002\u00104J\u0011\u00105\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u00106J\"\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b8\u00106J\u0013\u00109\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0002\u00106J\u0019\u0010:\u001a\u00020\u00032\u0006\u00101\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010;J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b=\u00104J'\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u00101\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0015X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R$\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "_channel", "initParentJob", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;ZZ)V", "get_channel", "()Lkotlinx/coroutines/channels/Channel;", "channel", "getChannel", "isClosedForReceive", "()Z", "isClosedForSend", "isEmpty", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", com.anythink.expressad.d.a.b.dO, "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", com.anythink.expressad.foundation.d.c.cd, "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "offer", "element", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveOrNull", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReceive", "tryReceive-PtdJZtk", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class pg5<E> extends qa5<yq4> implements og5<E> {
    @NotNull
    private final og5<E> u;

    public pg5(@NotNull xv4 xv4Var, @NotNull og5<E> og5Var, boolean z, boolean z2) {
        super(xv4Var, z, z2);
        this.u = og5Var;
    }

    @Override // com.p7700g.p99005.nh5
    @td5
    public void B(@NotNull f05<? super Throwable, yq4> f05Var) {
        this.u.B(f05Var);
    }

    @Override // com.p7700g.p99005.jh5
    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @op4(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E C() {
        return this.u.C();
    }

    @NotNull
    public Object F(E e) {
        return this.u.F(e);
    }

    @Nullable
    public Object I(E e, @NotNull uv4<? super yq4> uv4Var) {
        return this.u.I(e, uv4Var);
    }

    @Override // com.p7700g.p99005.nh5
    public boolean K() {
        return this.u.K();
    }

    @Override // com.p7700g.p99005.me5, com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        f0(new fe5(i0(), null, this));
        return true;
    }

    @Override // com.p7700g.p99005.me5, com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    public final void b(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new fe5(i0(), null, this);
        }
        f0(cancellationException);
    }

    @NotNull
    public final og5<E> c() {
        return this;
    }

    @Override // com.p7700g.p99005.me5, com.p7700g.p99005.ee5
    public /* synthetic */ void cancel() {
        f0(new fe5(i0(), null, this));
    }

    @Override // com.p7700g.p99005.me5
    public void f0(@NotNull Throwable th) {
        CancellationException k1 = me5.k1(this, th, null, 1, null);
        this.u.b(k1);
        d0(k1);
    }

    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
    public boolean g(E e) {
        return this.u.g(e);
    }

    @Override // com.p7700g.p99005.jh5
    public boolean isEmpty() {
        return this.u.isEmpty();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public qg5<E> iterator() {
        return this.u.iterator();
    }

    @Override // com.p7700g.p99005.jh5
    public boolean j() {
        return this.u.j();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public lo5<E> k() {
        return this.u.k();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public lo5<sg5<E>> l() {
        return this.u.l();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public lo5<E> p() {
        return this.u.p();
    }

    @Override // com.p7700g.p99005.jh5
    @NotNull
    public Object q() {
        return this.u.q();
    }

    @Override // com.p7700g.p99005.jh5
    @fx4
    @xn4(level = zn4.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @op4(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object s(@NotNull uv4<? super E> uv4Var) {
        return this.u.s(uv4Var);
    }

    @Override // com.p7700g.p99005.jh5
    @Nullable
    public Object t(@NotNull uv4<? super sg5<? extends E>> uv4Var) {
        Object t = this.u.t(uv4Var);
        gw4.h();
        return t;
    }

    @NotNull
    public mo5<E, nh5<E>> v() {
        return this.u.v();
    }

    @Override // com.p7700g.p99005.jh5
    @Nullable
    public Object w(@NotNull uv4<? super E> uv4Var) {
        return this.u.w(uv4Var);
    }

    @NotNull
    public final og5<E> w1() {
        return this.u;
    }

    public boolean x(@Nullable Throwable th) {
        return this.u.x(th);
    }
}