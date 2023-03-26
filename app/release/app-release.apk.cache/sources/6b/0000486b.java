package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.bg5;
import com.p7700g.p99005.dg5;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArrayChannel.kt */
@vo4(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000BB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "currentSize", "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", AFHydra.STATUS_IDLE, "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ig5<E> extends bg5<E> {
    @NotNull
    private volatile /* synthetic */ int size;
    private final int v;
    @NotNull
    private final ng5 w;
    @NotNull
    private final ReentrantLock x;
    @NotNull
    private Object[] y;
    private int z;

    /* compiled from: ArrayChannel.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            ng5.values();
            int[] iArr = new int[3];
            iArr[ng5.SUSPEND.ordinal()] = 1;
            iArr[ng5.DROP_LATEST.ordinal()] = 2;
            iArr[ng5.DROP_OLDEST.ordinal()] = 3;
            a = iArr;
        }
    }

    public ig5(int i, @NotNull ng5 ng5Var, @Nullable f05<? super E, yq4> f05Var) {
        super(f05Var);
        this.v = i;
        this.w = ng5Var;
        if (i >= 1) {
            this.x = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            zr4.w2(objArr, cg5.c, 0, 0, 6, null);
            this.y = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(wo1.n("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    private final void u0(int i, E e) {
        if (i < this.v) {
            v0(i);
            Object[] objArr = this.y;
            objArr[(this.z + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.y;
        int i2 = this.z;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.z = (i2 + 1) % objArr2.length;
    }

    private final void v0(int i) {
        Object[] objArr = this.y;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.v);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.y;
                objArr2[i2] = objArr3[(this.z + i2) % objArr3.length];
            }
            zr4.n2(objArr2, cg5.c, i, min);
            this.y = objArr2;
            this.z = 0;
        }
    }

    private final an5 w0(int i) {
        if (i < this.v) {
            this.size = i + 1;
            return null;
        }
        int ordinal = this.w.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return cg5.d;
                }
                throw new wo4();
            }
            return null;
        }
        return cg5.e;
    }

    @Override // com.p7700g.p99005.dg5
    public final boolean M() {
        return false;
    }

    @Override // com.p7700g.p99005.dg5
    public final boolean N() {
        return this.size == this.v && this.w == ng5.SUSPEND;
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object P(E e) {
        kh5<E> V;
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            int i = this.size;
            xg5<?> y = y();
            if (y == null) {
                an5 w0 = w0(i);
                if (w0 == null) {
                    if (i == 0) {
                        do {
                            V = V();
                            if (V != null) {
                                if (V instanceof xg5) {
                                    this.size = i;
                                    return V;
                                }
                            }
                        } while (V.F(e, null) == null);
                        this.size = i;
                        yq4 yq4Var = yq4.a;
                        reentrantLock.unlock();
                        V.A(e);
                        return V.l();
                    }
                    u0(i, e);
                    return cg5.d;
                }
                return w0;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public Object Q(E e, @NotNull no5<?> no5Var) {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            int i = this.size;
            xg5<?> y = y();
            if (y == null) {
                an5 w0 = w0(i);
                if (w0 == null) {
                    if (i == 0) {
                        while (true) {
                            dg5.d<E> n = n(e);
                            Object E = no5Var.E(n);
                            if (E == null) {
                                this.size = i;
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
                                this.size = i;
                                return E;
                            }
                        }
                    }
                    if (!no5Var.p()) {
                        this.size = i;
                        return oo5.d();
                    }
                    u0(i, e);
                    return cg5.d;
                }
                return w0;
            }
            return y;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    public boolean e0(@NotNull ih5<? super E> ih5Var) {
        ReentrantLock reentrantLock = this.x;
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
        return this.size == 0;
    }

    @Override // com.p7700g.p99005.bg5, com.p7700g.p99005.jh5
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            return j0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5, com.p7700g.p99005.jh5
    public boolean j() {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            return super.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    public void k0(boolean z) {
        f05<E, yq4> f05Var = this.t;
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            int i = this.size;
            mn5 mn5Var = null;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                Object obj = this.y[this.z];
                if (f05Var != null && obj != cg5.c) {
                    mn5Var = rm5.c(f05Var, obj, mn5Var);
                }
                Object[] objArr = this.y;
                int i3 = this.z;
                objArr[i3] = cg5.c;
                this.z = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            yq4 yq4Var = yq4.a;
            reentrantLock.unlock();
            super.k0(z);
            if (mn5Var != null) {
                throw mn5Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.dg5
    @Nullable
    public Object o(@NotNull mh5 mh5Var) {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            return super.o(mh5Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.bg5
    @Nullable
    public Object o0() {
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object y = y();
                if (y == null) {
                    y = cg5.f;
                }
                return y;
            }
            Object[] objArr = this.y;
            int i2 = this.z;
            Object obj = objArr[i2];
            mh5 mh5Var = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = cg5.f;
            boolean z = false;
            if (i == this.v) {
                mh5 mh5Var2 = null;
                while (true) {
                    mh5 W = W();
                    if (W == null) {
                        mh5Var = mh5Var2;
                        break;
                    } else if (W.G0(null) != null) {
                        obj2 = W.E0();
                        mh5Var = W;
                        z = true;
                        break;
                    } else {
                        W.H0();
                        mh5Var2 = W;
                    }
                }
            }
            if (obj2 != cg5.f && !(obj2 instanceof xg5)) {
                this.size = i;
                Object[] objArr2 = this.y;
                objArr2[(this.z + i) % objArr2.length] = obj2;
            }
            this.z = (this.z + 1) % this.y.length;
            yq4 yq4Var = yq4.a;
            if (z) {
                c25.m(mh5Var);
                mh5Var.D0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:33:0x0077, B:35:0x007b, B:37:0x007f, B:43:0x00a1, B:38:0x008b, B:40:0x0091, B:16:0x0043, B:19:0x0048, B:22:0x004d, B:24:0x0053, B:27:0x005f, B:30:0x0066, B:31:0x0075), top: B:51:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    @Override // com.p7700g.p99005.bg5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p0(@NotNull no5<?> no5Var) {
        boolean z;
        ReentrantLock reentrantLock = this.x;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object y = y();
                if (y == null) {
                    y = cg5.f;
                }
                return y;
            }
            Object[] objArr = this.y;
            int i2 = this.z;
            Object obj = objArr[i2];
            mh5 mh5Var = null;
            objArr[i2] = null;
            this.size = i - 1;
            an5 an5Var = cg5.f;
            if (i == this.v) {
                while (true) {
                    bg5.g<E> c0 = c0();
                    Object E = no5Var.E(c0);
                    if (E == null) {
                        mh5Var = c0.o();
                        c25.m(mh5Var);
                        an5Var = mh5Var.E0();
                        break;
                    } else if (E == cg5.f) {
                        break;
                    } else if (E != ll5.b) {
                        if (E == oo5.d()) {
                            this.size = i;
                            this.y[this.z] = obj;
                            return E;
                        } else if (!(E instanceof xg5)) {
                            throw new IllegalStateException(c25.C("performAtomicTrySelect(describeTryOffer) returned ", E).toString());
                        } else {
                            an5Var = E;
                            mh5Var = an5Var;
                        }
                    }
                }
                z = true;
                if (an5Var == cg5.f && !(an5Var instanceof xg5)) {
                    this.size = i;
                    Object[] objArr2 = this.y;
                    objArr2[(this.z + i) % objArr2.length] = an5Var;
                } else if (!no5Var.p()) {
                    this.size = i;
                    this.y[this.z] = obj;
                    return oo5.d();
                }
                this.z = (this.z + 1) % this.y.length;
                yq4 yq4Var = yq4.a;
                if (z) {
                    c25.m(mh5Var);
                    mh5Var.D0();
                }
                return obj;
            }
            z = false;
            if (an5Var == cg5.f) {
            }
            if (!no5Var.p()) {
            }
            this.z = (this.z + 1) % this.y.length;
            yq4 yq4Var2 = yq4.a;
            if (z) {
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p7700g.p99005.dg5
    @NotNull
    public String r() {
        StringBuilder G = wo1.G("(buffer:capacity=");
        G.append(this.v);
        G.append(",size=");
        return wo1.y(G, this.size, ')');
    }
}