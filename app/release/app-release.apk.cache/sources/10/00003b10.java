package com.p7700g.p99005;

import com.p7700g.p99005.dg5;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConflatedChannel.kt */
@vo4(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class bh5<E> extends bg5<E> {
    @NotNull
    private final ReentrantLock v;
    @Nullable
    private Object w;

    public bh5(@Nullable f05<? super E, yq4> f05Var) {
        super(f05Var);
        this.v = new ReentrantLock();
        this.w = cg5.c;
    }

    private final mn5 u0(Object obj) {
        f05<E, yq4> f05Var;
        Object obj2 = this.w;
        mn5 mn5Var = null;
        if (obj2 != cg5.c && (f05Var = this.t) != null) {
            mn5Var = rm5.d(f05Var, obj2, null, 2, null);
        }
        this.w = obj;
        return mn5Var;
    }

    @Override // com.p7700g.p99005.dg5
    public final boolean M() {
        return false;
    }

    @Override // com.p7700g.p99005.dg5
    public final boolean N() {
        return false;
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object P(E e) {
        kh5<E> V;
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            xg5<?> y = y();
            if (y == null) {
                if (this.w == cg5.c) {
                    do {
                        V = V();
                        if (V != null) {
                            if (V instanceof xg5) {
                                return V;
                            }
                        }
                    } while (V.F(e, null) == null);
                    yq4 yq4Var = yq4.a;
                    reentrantLock.unlock();
                    V.A(e);
                    return V.l();
                }
                mn5 u0 = u0(e);
                if (u0 == null) {
                    return cg5.d;
                }
                throw u0;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object Q(E e, @NotNull no5<?> no5Var) {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            xg5<?> y = y();
            if (y == null) {
                if (this.w == cg5.c) {
                    while (true) {
                        dg5.d<E> n = n(e);
                        Object E = no5Var.E(n);
                        if (E == null) {
                            kh5<? super E> o = n.o();
                            yq4 yq4Var = yq4.a;
                            reentrantLock.unlock();
                            c25.m(o);
                            kh5<? super E> kh5Var = o;
                            kh5Var.A(e);
                            return kh5Var.l();
                        } else if (E == cg5.e) {
                            break;
                        } else if (E != ll5.b) {
                            if (E != oo5.d() && !(E instanceof xg5)) {
                                throw new IllegalStateException(c25.C("performAtomicTrySelect(describeTryOffer) returned ", E).toString());
                            }
                            return E;
                        }
                    }
                }
                if (!no5Var.p()) {
                    return oo5.d();
                }
                mn5 u0 = u0(e);
                if (u0 == null) {
                    return cg5.d;
                }
                throw u0;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    public boolean e0(@NotNull ih5<? super E> ih5Var) {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            return super.e0(ih5Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    public final boolean h0() {
        return false;
    }

    @Override // com.p7700g.p99005.bg5
    public final boolean i0() {
        return this.w == cg5.c;
    }

    @Override // com.p7700g.p99005.bg5, com.p7700g.p99005.jh5
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            return j0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    public void k0(boolean z) {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            mn5 u0 = u0(cg5.c);
            yq4 yq4Var = yq4.a;
            reentrantLock.unlock();
            super.k0(z);
            if (u0 != null) {
                throw u0;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.bg5
    @Nullable
    public Object o0() {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            Object obj = this.w;
            an5 an5Var = cg5.c;
            if (obj != an5Var) {
                this.w = an5Var;
                yq4 yq4Var = yq4.a;
                return obj;
            }
            Object y = y();
            if (y == null) {
                y = cg5.f;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    @Nullable
    public Object p0(@NotNull no5<?> no5Var) {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            Object obj = this.w;
            an5 an5Var = cg5.c;
            if (obj == an5Var) {
                Object y = y();
                if (y == null) {
                    y = cg5.f;
                }
                return y;
            } else if (!no5Var.p()) {
                return oo5.d();
            } else {
                Object obj2 = this.w;
                this.w = an5Var;
                yq4 yq4Var = yq4.a;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public String r() {
        StringBuilder G = wo1.G("(value=");
        G.append(this.w);
        G.append(')');
        return G.toString();
    }
}