package com.p7700g.p99005;

import com.p7700g.p99005.jg5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConflatedBroadcastChannel.kt */
@ve5
@vo4(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b\u0007\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000G:\u0004CBDEB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u0007¢\u0006\u0004\b\u0003\u0010\u0005J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00132\u000e\u0010\r\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00130\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b$\u0010%JX\u0010.\u001a\u00020\u0013\"\u0004\b\u0001\u0010&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'2\u0006\u0010\u001f\u001a\u00028\u00002(\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010+\u0012\u0006\u0012\u0004\u0018\u00010,0)H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b0\u0010\u000bJ\u001b\u00101\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J&\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013032\u0006\u0010\u001f\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010\u0002\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b?\u0010\u0005\u001a\u0004\b=\u0010>R\u0013\u0010A\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010>\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "value", "<init>", "(Ljava/lang/Object;)V", "()V", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "list", "subscriber", "addSubscriber", "([Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "", "cause", "", com.anythink.expressad.d.a.b.dO, "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", com.anythink.expressad.foundation.d.c.cd, "closeSubscriber", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "offerInternal", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeSubscriber", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "getValueOrNull", "valueOrNull", "Companion", "Closed", "State", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ah5<E> implements jg5<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater t;
    private static final /* synthetic */ AtomicIntegerFieldUpdater u;
    private static final /* synthetic */ AtomicReferenceFieldUpdater v;
    @Deprecated
    @NotNull
    private static final an5 x;
    @Deprecated
    @NotNull
    private static final c<Object> y;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull
    private volatile /* synthetic */ int _updating;
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler;
    @NotNull
    private static final b s = new b(null);
    @Deprecated
    @NotNull
    private static final a w = new a(null);

    /* compiled from: ConflatedBroadcastChannel.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "", "closeCause", "", "(Ljava/lang/Throwable;)V", "sendException", "getSendException", "()Ljava/lang/Throwable;", "valueException", "getValueException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        @cz4
        @Nullable
        public final Throwable a;

        public a(@Nullable Throwable th) {
            this.a = th;
        }

        @NotNull
        public final Throwable a() {
            Throwable th = this.a;
            return th == null ? new zg5(tg5.a) : th;
        }

        @NotNull
        public final Throwable b() {
            Throwable th = this.a;
            return th == null ? new IllegalStateException(tg5.a) : th;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Companion;", "", "()V", "CLOSED", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "E", "", "value", "subscribers", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<E> {
        @cz4
        @Nullable
        public final Object a;
        @cz4
        @Nullable
        public final d<E>[] b;

        public c(@Nullable Object obj, @Nullable d<E>[] dVarArr) {
            this.a = obj;
            this.b = dVarArr;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ConflatedChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "broadcastChannel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;)V", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "onCancelIdempotent", "", "wasClosed", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d<E> extends bh5<E> implements jh5<E> {
        @NotNull
        private final ah5<E> x;

        public d(@NotNull ah5<E> ah5Var) {
            super(null);
            this.x = ah5Var;
        }

        @Override // com.p7700g.p99005.bh5, com.p7700g.p99005.dg5
        @NotNull
        public Object P(E e) {
            return super.P(e);
        }

        @Override // com.p7700g.p99005.bh5, com.p7700g.p99005.bg5
        public void k0(boolean z) {
            if (z) {
                this.x.h(this);
            }
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @vo4(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JV\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00028\u00002(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/ConflatedBroadcastChannel$onSend$1", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "registerSelectClause2", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "param", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements mo5<E, nh5<? super E>> {
        public final /* synthetic */ ah5<E> s;

        public e(ah5<E> ah5Var) {
            this.s = ah5Var;
        }

        @Override // com.p7700g.p99005.mo5
        public <R> void G(@NotNull no5<? super R> no5Var, E e, @NotNull j05<? super nh5<? super E>, ? super uv4<? super R>, ? extends Object> j05Var) {
            this.s.n(no5Var, e, j05Var);
        }
    }

    static {
        an5 an5Var = new an5("UNDEFINED");
        x = an5Var;
        y = new c<>(an5Var, null);
        t = AtomicReferenceFieldUpdater.newUpdater(ah5.class, Object.class, "_state");
        u = AtomicIntegerFieldUpdater.newUpdater(ah5.class, "_updating");
        v = AtomicReferenceFieldUpdater.newUpdater(ah5.class, Object.class, "onCloseHandler");
    }

    public ah5() {
        this._state = y;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    private final d<E>[] f(d<E>[] dVarArr, d<E> dVar) {
        if (dVarArr == null) {
            d<E>[] dVarArr2 = new d[1];
            for (int i = 0; i < 1; i++) {
                dVarArr2[i] = dVar;
            }
            return dVarArr2;
        }
        return (d[]) zr4.X3(dVarArr, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                obj2 = cVar.a;
                dVarArr = cVar.b;
                c25.m(dVarArr);
            } else {
                throw new IllegalStateException(c25.C("Invalid state ", obj).toString());
            }
        } while (!t.compareAndSet(this, obj, new c(obj2, o(dVarArr, dVar))));
    }

    public static /* synthetic */ void j() {
    }

    private final void l(Throwable th) {
        an5 an5Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (an5Var = cg5.h) || !v.compareAndSet(this, obj, an5Var)) {
            return;
        }
        ((f05) k35.q(obj, 1)).M(th);
    }

    private final a m(E e2) {
        Object obj;
        if (u.compareAndSet(this, 0, 1)) {
            do {
                try {
                    obj = this._state;
                    if (obj instanceof a) {
                        return (a) obj;
                    }
                    if (obj instanceof c) {
                    } else {
                        throw new IllegalStateException(c25.C("Invalid state ", obj).toString());
                    }
                } finally {
                    this._updating = 0;
                }
            } while (!t.compareAndSet(this, obj, new c(e2, ((c) obj).b)));
            d<E>[] dVarArr = ((c) obj).b;
            if (dVarArr != null) {
                int length = dVarArr.length;
                int i = 0;
                while (i < length) {
                    d<E> dVar = dVarArr[i];
                    i++;
                    dVar.P(e2);
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void n(no5<? super R> no5Var, E e2, j05<? super nh5<? super E>, ? super uv4<? super R>, ? extends Object> j05Var) {
        if (no5Var.p()) {
            a m = m(e2);
            if (m == null) {
                pn5.d(j05Var, this, no5Var.y());
            } else {
                no5Var.C(m.a());
            }
        }
    }

    private final d<E>[] o(d<E>[] dVarArr, d<E> dVar) {
        int length = dVarArr.length;
        int jg = as4.jg(dVarArr, dVar);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[length - 1];
        zr4.l1(dVarArr, dVarArr2, 0, 0, jg, 6, null);
        zr4.l1(dVarArr, dVarArr2, jg, jg + 1, 0, 8, null);
        return dVarArr2;
    }

    @Override // com.p7700g.p99005.nh5
    public void B(@NotNull f05<? super Throwable, yq4> f05Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, f05Var)) {
            Object obj = this.onCloseHandler;
            if (obj == cg5.h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(c25.C("Another handler was already registered: ", obj));
        }
        Object obj2 = this._state;
        if ((obj2 instanceof a) && atomicReferenceFieldUpdater.compareAndSet(this, f05Var, cg5.h)) {
            f05Var.M(((a) obj2).a);
        }
    }

    @Override // com.p7700g.p99005.nh5
    @NotNull
    public Object F(E e2) {
        a m = m(e2);
        if (m == null) {
            return sg5.a.c(yq4.a);
        }
        return sg5.a.a(m.a());
    }

    @Override // com.p7700g.p99005.nh5
    @Nullable
    public Object I(E e2, @NotNull uv4<? super yq4> uv4Var) {
        a m = m(e2);
        if (m == null) {
            if (gw4.h() == null) {
                return null;
            }
            return yq4.a;
        }
        throw m.a();
    }

    @Override // com.p7700g.p99005.nh5
    public boolean K() {
        return this._state instanceof a;
    }

    @Override // com.p7700g.p99005.jg5
    public void b(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    @Override // com.p7700g.p99005.nh5
    @xn4(level = zn4.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @op4(expression = "trySend(element).isSuccess", imports = {}))
    public boolean g(E e2) {
        return jg5.a.c(this, e2);
    }

    public final E i() {
        Object obj = this._state;
        if (!(obj instanceof a)) {
            if (obj instanceof c) {
                E e2 = (E) ((c) obj).a;
                if (e2 != x) {
                    return e2;
                }
                throw new IllegalStateException("No value");
            }
            throw new IllegalStateException(c25.C("Invalid state ", obj).toString());
        }
        throw ((a) obj).b();
    }

    @Nullable
    public final E k() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (obj instanceof c) {
            an5 an5Var = x;
            E e2 = (E) ((c) obj).a;
            if (e2 == an5Var) {
                return null;
            }
            return e2;
        }
        throw new IllegalStateException(c25.C("Invalid state ", obj).toString());
    }

    @Override // com.p7700g.p99005.nh5
    @NotNull
    public mo5<E, nh5<E>> v() {
        return new e(this);
    }

    @Override // com.p7700g.p99005.jg5
    /* renamed from: x */
    public boolean a(@Nullable Throwable th) {
        Object obj;
        int i;
        do {
            obj = this._state;
            i = 0;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(c25.C("Invalid state ", obj).toString());
            }
        } while (!t.compareAndSet(this, obj, th == null ? w : new a(th)));
        d<E>[] dVarArr = ((c) obj).b;
        if (dVarArr != null) {
            int length = dVarArr.length;
            while (i < length) {
                d<E> dVar = dVarArr[i];
                i++;
                dVar.x(th);
            }
        }
        l(th);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.jg5
    @NotNull
    public jh5<E> z() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.x(((a) obj).a);
                return dVar;
            } else if (obj instanceof c) {
                cVar = (c) obj;
                Object obj2 = cVar.a;
                if (obj2 != x) {
                    dVar.P(obj2);
                }
            } else {
                throw new IllegalStateException(c25.C("Invalid state ", obj).toString());
            }
        } while (!t.compareAndSet(this, obj, new c(cVar.a, f(cVar.b, dVar))));
        return dVar;
    }

    public ah5(E e2) {
        this();
        t.lazySet(this, new c(e2, null));
    }
}