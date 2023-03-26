package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArrayBroadcastChannel.kt */
@vo4(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000L2\b\u0012\u0004\u0012\u00028\u00000M:\u0001JB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\r2\u000e\u0010\u0007\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J4\u0010'\u001a\u00020\r2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$H\u0082\u0010¢\u0006\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00102\u001a\u000600j\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R$\u0010;\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=R$\u0010A\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b?\u00106\"\u0004\b@\u0010\u0005R6\u0010D\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0Bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$`C8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u0010\u0011R$\u0010I\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010:¨\u0006K"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "", "capacity", "<init>", "(I)V", "", "cause", "", com.anythink.expressad.d.a.b.dO, "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "checkSubOffers", "()V", com.anythink.expressad.foundation.d.c.cd, "", "computeMinHead", "()J", la1.l, "elementAt", "(J)Ljava/lang/Object;", "element", "", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "addSub", "removeSub", "updateHead", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;)V", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "bufferLock", "Ljava/util/concurrent/locks/ReentrantLock;", AFHydra.STATUS_IDLE, "getCapacity", "()I", "value", "getHead", "setHead", "(J)V", "head", "isBufferAlwaysFull", "()Z", "isBufferFull", "getSize", "setSize", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "Lkotlinx/coroutines/internal/SubscribersList;", "subscribers", "Ljava/util/List;", "getSubscribers$annotations", "getTail", "setTail", "tail", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class hg5<E> extends dg5<E> implements jg5<E> {
    @NotNull
    private volatile /* synthetic */ long _head;
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    private volatile /* synthetic */ long _tail;
    private final int v;
    @NotNull
    private final ReentrantLock w;
    @NotNull
    private final Object[] x;
    @NotNull
    private final List<a<E>> y;

    /* compiled from: ArrayBroadcastChannel.kt */
    @vo4(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010'2\b\u0012\u0004\u0012\u00028\u00010(B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "", "checkOffer", "()Z", "", "cause", com.anythink.expressad.foundation.d.c.cd, "(Ljava/lang/Throwable;)Z", "needsToCheckOfferWithoutLock", "", "peekUnderLock", "()Ljava/lang/Object;", "pollInternal", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "isBufferAlwaysEmpty", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "", "value", "getSubHead", "()J", "setSubHead", "(J)V", "subHead", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "subLock", "Ljava/util/concurrent/locks/ReentrantLock;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<E> extends bg5<E> implements jh5<E> {
        @NotNull
        private volatile /* synthetic */ long _subHead;
        @NotNull
        private final hg5<E> v;
        @NotNull
        private final ReentrantLock w;

        public a(@NotNull hg5<E> hg5Var) {
            super(null);
            this.v = hg5Var;
            this.w = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean w0() {
            if (u() != null) {
                return false;
            }
            return (i0() && this.v.u() == null) ? false : true;
        }

        private final Object x0() {
            long v0 = v0();
            xg5<?> u = this.v.u();
            if (v0 >= this.v.h0()) {
                if (u == null) {
                    u = u();
                }
                return u == null ? cg5.f : u;
            }
            Object c0 = this.v.c0(v0);
            xg5<?> u2 = u();
            return u2 != null ? u2 : c0;
        }

        @Override // com.p7700g.p99005.dg5
        public boolean M() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // com.p7700g.p99005.dg5
        public boolean N() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // com.p7700g.p99005.bg5
        public boolean h0() {
            return false;
        }

        @Override // com.p7700g.p99005.bg5
        public boolean i0() {
            return v0() >= this.v.h0();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
        @Override // com.p7700g.p99005.bg5
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object o0() {
            boolean z;
            xg5 xg5Var;
            ReentrantLock reentrantLock = this.w;
            reentrantLock.lock();
            try {
                Object x0 = x0();
                if (!(x0 instanceof xg5) && x0 != cg5.f) {
                    y0(v0() + 1);
                    z = true;
                    reentrantLock.unlock();
                    xg5Var = !(x0 instanceof xg5) ? (xg5) x0 : null;
                    if (xg5Var != null) {
                        x(xg5Var.v);
                    }
                    if (u0() ? true : z) {
                        hg5.m0(this.v, null, null, 3, null);
                    }
                    return x0;
                }
                z = false;
                reentrantLock.unlock();
                if (!(x0 instanceof xg5)) {
                }
                if (xg5Var != null) {
                }
                if (u0() ? true : z) {
                }
                return x0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // com.p7700g.p99005.bg5
        @Nullable
        public Object p0(@NotNull no5<?> no5Var) {
            ReentrantLock reentrantLock = this.w;
            reentrantLock.lock();
            try {
                Object x0 = x0();
                boolean z = false;
                if (!(x0 instanceof xg5) && x0 != cg5.f) {
                    if (!no5Var.p()) {
                        x0 = oo5.d();
                    } else {
                        y0(v0() + 1);
                        z = true;
                    }
                }
                reentrantLock.unlock();
                xg5 xg5Var = x0 instanceof xg5 ? (xg5) x0 : null;
                if (xg5Var != null) {
                    x(xg5Var.v);
                }
                if (u0() ? true : z) {
                    hg5.m0(this.v, null, null, 3, null);
                }
                return x0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
            r2 = (com.p7700g.p99005.xg5) r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean u0() {
            xg5 xg5Var;
            boolean z = false;
            while (true) {
                xg5Var = null;
                if (!w0() || !this.w.tryLock()) {
                    break;
                }
                try {
                    E e = (E) x0();
                    if (e != cg5.f) {
                        if (e instanceof xg5) {
                            break;
                        }
                        kh5<E> V = V();
                        if (V != null && !(V instanceof xg5)) {
                            if (V.F(e, null) != null) {
                                y0(v0() + 1);
                                z = true;
                                this.w.unlock();
                                V.A(e);
                            }
                        }
                    }
                } finally {
                    this.w.unlock();
                }
            }
            if (xg5Var != null) {
                x(xg5Var.v);
            }
            return z;
        }

        public final long v0() {
            return this._subHead;
        }

        @Override // com.p7700g.p99005.dg5, com.p7700g.p99005.nh5
        public boolean x(@Nullable Throwable th) {
            boolean x = super.x(th);
            if (x) {
                hg5.m0(this.v, null, this, 1, null);
                ReentrantLock reentrantLock = this.w;
                reentrantLock.lock();
                try {
                    y0(this.v.h0());
                    yq4 yq4Var = yq4.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return x;
        }

        public final void y0(long j) {
            this._subHead = j;
        }
    }

    public hg5(int i) {
        super(null);
        this.v = i;
        if (i >= 1) {
            this.w = new ReentrantLock();
            this.x = new Object[i];
            this._head = 0L;
            this._tail = 0L;
            this._size = 0;
            this.y = ol5.d();
            return;
        }
        StringBuilder G = wo1.G("ArrayBroadcastChannel capacity must be at least 1, but ");
        G.append(d0());
        G.append(" was specified");
        throw new IllegalArgumentException(G.toString().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p7700g.p99005.jg5
    /* renamed from: Z */
    public final boolean a(Throwable th) {
        boolean x = x(th);
        for (a<E> aVar : this.y) {
            aVar.a(th);
        }
        return x;
    }

    private final void a0() {
        boolean z = false;
        boolean z2 = false;
        for (a<E> aVar : this.y) {
            if (aVar.u0()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            m0(this, null, null, 3, null);
        }
    }

    private final long b0() {
        long j = Long.MAX_VALUE;
        for (a<E> aVar : this.y) {
            j = i55.v(j, aVar.v0());
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E c0(long j) {
        return (E) this.x[(int) (j % this.v)];
    }

    private final long e0() {
        return this._head;
    }

    private final int f0() {
        return this._size;
    }

    private static /* synthetic */ void g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long h0() {
        return this._tail;
    }

    private final void i0(long j) {
        this._head = j;
    }

    private final void j0(int i) {
        this._size = i;
    }

    private final void k0(long j) {
        this._tail = j;
    }

    private final void l0(a<E> aVar, a<E> aVar2) {
        mh5 W;
        while (true) {
            ReentrantLock reentrantLock = this.w;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.y0(h0());
                    boolean isEmpty = this.y.isEmpty();
                    this.y.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.y.remove(aVar2);
                if (e0() != aVar2.v0()) {
                    return;
                }
            }
            long b0 = b0();
            long h0 = h0();
            long e0 = e0();
            long v = i55.v(b0, h0);
            if (v <= e0) {
                return;
            }
            int f0 = f0();
            while (e0 < v) {
                this.x[(int) (e0 % d0())] = null;
                boolean z = f0 >= d0();
                e0++;
                i0(e0);
                f0--;
                j0(f0);
                if (z) {
                    do {
                        W = W();
                        if (W != null && !(W instanceof xg5)) {
                        }
                    } while (W.G0(null) == null);
                    this.x[(int) (h0 % d0())] = W.E0();
                    j0(f0 + 1);
                    k0(h0 + 1);
                    yq4 yq4Var = yq4.a;
                    reentrantLock.unlock();
                    W.D0();
                    a0();
                    aVar = null;
                    aVar2 = null;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m0(hg5 hg5Var, a aVar, a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        hg5Var.l0(aVar, aVar2);
    }

    @Override // com.p7700g.p99005.dg5
    public boolean M() {
        return false;
    }

    @Override // com.p7700g.p99005.dg5
    public boolean N() {
        return f0() >= this.v;
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object P(E e) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            xg5<?> y = y();
            if (y == null) {
                int f0 = f0();
                if (f0 >= d0()) {
                    return cg5.e;
                }
                long h0 = h0();
                this.x[(int) (h0 % d0())] = e;
                j0(f0 + 1);
                k0(h0 + 1);
                yq4 yq4Var = yq4.a;
                reentrantLock.unlock();
                a0();
                return cg5.d;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object Q(E e, @NotNull no5<?> no5Var) {
        ReentrantLock reentrantLock = this.w;
        reentrantLock.lock();
        try {
            xg5<?> y = y();
            if (y == null) {
                int f0 = f0();
                if (f0 >= d0()) {
                    return cg5.e;
                }
                if (!no5Var.p()) {
                    return oo5.d();
                }
                long h0 = h0();
                this.x[(int) (h0 % d0())] = e;
                j0(f0 + 1);
                k0(h0 + 1);
                yq4 yq4Var = yq4.a;
                reentrantLock.unlock();
                a0();
                return cg5.d;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.jg5
    public void b(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    public final int d0() {
        return this.v;
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public String r() {
        StringBuilder G = wo1.G("(buffer:capacity=");
        G.append(this.x.length);
        G.append(",size=");
        return wo1.y(G, f0(), ')');
    }

    @Override // com.p7700g.p99005.dg5, com.p7700g.p99005.nh5
    public boolean x(@Nullable Throwable th) {
        if (super.x(th)) {
            a0();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.jg5
    @NotNull
    public jh5<E> z() {
        a aVar = new a(this);
        m0(this, aVar, null, 2, null);
        return aVar;
    }
}