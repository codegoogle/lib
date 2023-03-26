package com.p7700g.p99005;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.p7700g.p99005.nh5;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Broadcast.kt */
@vo4(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B#\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J.\u0010 \u001a\u00020\u00032#\u0010!\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\"H\u0097\u0001J\u0016\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\nH\u0014J\u0015\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0014¢\u0006\u0002\u0010,J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0096\u0001J\u0019\u0010/\u001a\u00020\u00032\u0006\u0010&\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u00100J'\u00101\u001a\b\u0012\u0004\u0012\u00020\u0003022\u0006\u0010&\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b3\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R$\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "_channel", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Z)V", "get_channel", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "isActive", "()Z", "isClosedForSend", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", com.anythink.expressad.d.a.b.dO, "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", com.anythink.expressad.foundation.d.c.cd, "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "offer", "element", "(Ljava/lang/Object;)Z", "onCancelled", "handled", "onCompleted", "value", "(Lkotlin/Unit;)V", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class lg5<E> extends qa5<yq4> implements hh5<E>, jg5<E> {
    @NotNull
    private final jg5<E> u;

    public lg5(@NotNull xv4 xv4Var, @NotNull jg5<E> jg5Var, boolean z) {
        super(xv4Var, false, z);
        this.u = jg5Var;
        F0((ee5) xv4Var.get(ee5.m0));
    }

    @Override // com.p7700g.p99005.nh5
    @td5
    public void B(@NotNull f05<? super Throwable, yq4> f05Var) {
        this.u.B(f05Var);
    }

    @Override // com.p7700g.p99005.nh5
    @NotNull
    public Object F(E e) {
        return this.u.F(e);
    }

    @Override // com.p7700g.p99005.nh5
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
        if (th == null) {
            th = new fe5(i0(), null, this);
        }
        f0(th);
        return true;
    }

    @Override // com.p7700g.p99005.me5, com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    public final void b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new fe5(i0(), null, this);
        }
        f0(cancellationException);
    }

    @Override // com.p7700g.p99005.hh5
    @NotNull
    public nh5<E> c() {
        return this;
    }

    @Override // com.p7700g.p99005.me5
    public void f0(@NotNull Throwable th) {
        CancellationException k1 = me5.k1(this, th, null, 1, null);
        this.u.b(k1);
        d0(k1);
    }

    @Override // com.p7700g.p99005.nh5
    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
    public boolean g(E e) {
        return this.u.g(e);
    }

    @Override // com.p7700g.p99005.qa5, com.p7700g.p99005.me5, com.p7700g.p99005.ee5
    public boolean h() {
        return super.h();
    }

    @Override // com.p7700g.p99005.qa5
    public void t1(@NotNull Throwable th, boolean z) {
        if (this.u.x(th) || z) {
            return;
        }
        hc5.b(getContext(), th);
    }

    @Override // com.p7700g.p99005.nh5
    @NotNull
    public mo5<E, nh5<E>> v() {
        return this.u.v();
    }

    @NotNull
    public final jg5<E> w1() {
        return this.u;
    }

    @Override // com.p7700g.p99005.nh5
    public boolean x(@Nullable Throwable th) {
        boolean x = this.u.x(th);
        start();
        return x;
    }

    @Override // com.p7700g.p99005.qa5
    /* renamed from: x1 */
    public void u1(@NotNull yq4 yq4Var) {
        nh5.a.a(this.u, null, 1, null);
    }

    @NotNull
    public jh5<E> z() {
        return this.u.z();
    }
}