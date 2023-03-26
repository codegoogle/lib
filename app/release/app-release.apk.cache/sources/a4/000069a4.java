package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Semaphore.kt */
@vo4(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", AFHydra.STATUS_IDLE, "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class zo5 implements yo5 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zo5.class, Object.class, "head");
    private static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(zo5.class, "deqIdx");
    private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(zo5.class, Object.class, "tail");
    private static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(zo5.class, "enqIdx");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(zo5.class, "_availablePermits");
    @NotNull
    public volatile /* synthetic */ int _availablePermits;
    @NotNull
    private volatile /* synthetic */ long deqIdx = 0;
    @NotNull
    private volatile /* synthetic */ long enqIdx = 0;
    private final int f;
    @NotNull
    private final f05<Throwable, yq4> g;
    @NotNull
    private volatile /* synthetic */ Object head;
    @NotNull
    private volatile /* synthetic */ Object tail;

    /* compiled from: Semaphore.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements f05<Throwable, yq4> {
        public a() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@NotNull Throwable th) {
            zo5.this.release();
        }
    }

    public zo5(int i, int i2) {
        this.f = i;
        boolean z = true;
        if (!(i > 0)) {
            throw new IllegalArgumentException(c25.C("Semaphore should have at least 1 permit, but had ", Integer.valueOf(i)).toString());
        }
        if ((i2 < 0 || i2 > i) ? false : false) {
            bp5 bp5Var = new bp5(0L, null, 2);
            this.head = bp5Var;
            this.tail = bp5Var;
            this._availablePermits = i - i2;
            this.g = new a();
            return;
        }
        throw new IllegalArgumentException(c25.C("The number of acquired permits should be in 0..", Integer.valueOf(i)).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(uv4<? super yq4> uv4Var) {
        hb5 b2 = jb5.b(fw4.d(uv4Var));
        while (true) {
            if (!h(b2)) {
                if (e.getAndDecrement(this) > 0) {
                    b2.V(yq4.a, this.g);
                    break;
                }
            } else {
                break;
            }
        }
        Object x = b2.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0074, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(gb5<? super yq4> gb5Var) {
        int i;
        Object b2;
        int i2;
        an5 an5Var;
        an5 an5Var2;
        boolean z;
        xm5 xm5Var = (bp5) this.tail;
        long andIncrement = d.getAndIncrement(this);
        i = ap5.f;
        long j = andIncrement / i;
        do {
            xm5 xm5Var2 = xm5Var;
            while (true) {
                if (xm5Var2.o() < j || xm5Var2.g()) {
                    Object e2 = xm5Var2.e();
                    if (e2 == pl5.b) {
                        b2 = ym5.b(pl5.b);
                        break;
                    }
                    xm5 xm5Var3 = (xm5) ((ql5) e2);
                    if (xm5Var3 == null) {
                        xm5Var3 = ap5.j(xm5Var2.o() + 1, (bp5) xm5Var2);
                        if (xm5Var2.m(xm5Var3)) {
                            if (xm5Var2.g()) {
                                xm5Var2.l();
                            }
                        }
                    }
                    xm5Var2 = xm5Var3;
                } else {
                    b2 = ym5.b(xm5Var2);
                    break;
                }
            }
            if (!ym5.h(b2)) {
                xm5 f = ym5.f(b2);
                while (true) {
                    xm5 xm5Var4 = (xm5) this.tail;
                    if (xm5Var4.o() >= f.o()) {
                        break;
                    } else if (!f.r()) {
                        z = false;
                        continue;
                        break;
                    } else if (c.compareAndSet(this, xm5Var4, f)) {
                        if (xm5Var4.n()) {
                            xm5Var4.l();
                        }
                    } else if (f.n()) {
                        f.l();
                    }
                }
            } else {
                break;
            }
        } while (!z);
        bp5 bp5Var = (bp5) ym5.f(b2);
        i2 = ap5.f;
        int i3 = (int) (andIncrement % i2);
        if (!bp5Var.e.compareAndSet(i3, null, gb5Var)) {
            an5Var = ap5.b;
            an5Var2 = ap5.c;
            if (bp5Var.e.compareAndSet(i3, an5Var, an5Var2)) {
                gb5Var.V(yq4.a, this.g);
                return true;
            }
            return false;
        }
        gb5Var.D(new to5(bp5Var, i3));
        return true;
    }

    private final boolean i(gb5<? super yq4> gb5Var) {
        Object N = gb5Var.N(yq4.a, null, this.g);
        if (N == null) {
            return false;
        }
        gb5Var.w0(N);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0070, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean j() {
        int i;
        Object b2;
        int i2;
        int i3;
        an5 an5Var;
        an5 an5Var2;
        int i4;
        an5 an5Var3;
        an5 an5Var4;
        an5 an5Var5;
        boolean z;
        xm5 xm5Var = (bp5) this.head;
        long andIncrement = b.getAndIncrement(this);
        i = ap5.f;
        long j = andIncrement / i;
        do {
            xm5 xm5Var2 = xm5Var;
            while (true) {
                if (xm5Var2.o() < j || xm5Var2.g()) {
                    Object e2 = xm5Var2.e();
                    if (e2 == pl5.b) {
                        b2 = ym5.b(pl5.b);
                        break;
                    }
                    xm5 xm5Var3 = (xm5) ((ql5) e2);
                    if (xm5Var3 == null) {
                        xm5Var3 = ap5.j(xm5Var2.o() + 1, (bp5) xm5Var2);
                        if (xm5Var2.m(xm5Var3)) {
                            if (xm5Var2.g()) {
                                xm5Var2.l();
                            }
                        }
                    }
                    xm5Var2 = xm5Var3;
                } else {
                    b2 = ym5.b(xm5Var2);
                    break;
                }
            }
            i2 = 0;
            if (!ym5.h(b2)) {
                xm5 f = ym5.f(b2);
                while (true) {
                    xm5 xm5Var4 = (xm5) this.head;
                    if (xm5Var4.o() >= f.o()) {
                        break;
                    } else if (!f.r()) {
                        z = false;
                        continue;
                        break;
                    } else if (a.compareAndSet(this, xm5Var4, f)) {
                        if (xm5Var4.n()) {
                            xm5Var4.l();
                        }
                    } else if (f.n()) {
                        f.l();
                    }
                }
            } else {
                break;
            }
        } while (!z);
        bp5 bp5Var = (bp5) ym5.f(b2);
        bp5Var.b();
        if (bp5Var.o() > j) {
            return false;
        }
        i3 = ap5.f;
        int i5 = (int) (andIncrement % i3);
        an5Var = ap5.b;
        Object andSet = bp5Var.e.getAndSet(i5, an5Var);
        if (andSet == null) {
            i4 = ap5.a;
            while (i2 < i4) {
                i2++;
                Object obj = bp5Var.e.get(i5);
                an5Var5 = ap5.c;
                if (obj == an5Var5) {
                    return true;
                }
            }
            an5Var3 = ap5.b;
            an5Var4 = ap5.d;
            return !bp5Var.e.compareAndSet(i5, an5Var3, an5Var4);
        }
        an5Var2 = ap5.e;
        if (andSet == an5Var2) {
            return false;
        }
        return i((gb5) andSet);
    }

    @Override // com.p7700g.p99005.yo5
    public int a() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // com.p7700g.p99005.yo5
    @Nullable
    public Object b(@NotNull uv4<? super yq4> uv4Var) {
        if (e.getAndDecrement(this) > 0) {
            return yq4.a;
        }
        Object g = g(uv4Var);
        return g == gw4.h() ? g : yq4.a;
    }

    @Override // com.p7700g.p99005.yo5
    public boolean c() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!e.compareAndSet(this, i, i - 1));
        return true;
    }

    @Override // com.p7700g.p99005.yo5
    public void release() {
        while (true) {
            int i = this._availablePermits;
            int i2 = this.f;
            if (i < i2) {
                if (e.compareAndSet(this, i, i + 1) && (i >= 0 || j())) {
                    return;
                }
            } else {
                throw new IllegalStateException(c25.C("The number of released permits cannot be greater than ", Integer.valueOf(i2)).toString());
            }
        }
    }
}