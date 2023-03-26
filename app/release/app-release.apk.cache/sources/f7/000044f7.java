package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WorkQueue.kt */
@vo4(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020*B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", com.anythink.expressad.d.a.b.ay, "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "pollBuffer", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "victim", "", "tryStealBlockingFrom", "(Lkotlinx/coroutines/scheduling/WorkQueue;)J", "tryStealFrom", "blockingOnly", "tryStealLastScheduled", "(Lkotlinx/coroutines/scheduling/WorkQueue;Z)J", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "", "getBufferSize$kotlinx_coroutines_core", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class go5 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(go5.class, Object.class, "lastScheduledTask");
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(go5.class, "producerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(go5.class, "consumerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(go5.class, "blockingTasksInBuffer");
    @NotNull
    private final AtomicReferenceArray<ao5> e = new AtomicReferenceArray<>(128);
    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ ao5 b(go5 go5Var, ao5 ao5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return go5Var.a(ao5Var, z);
    }

    private final ao5 c(ao5 ao5Var) {
        if (ao5Var.t.l() == 1) {
            d.incrementAndGet(this);
        }
        if (e() == 127) {
            return ao5Var;
        }
        int i = this.producerIndex & 127;
        while (this.e.get(i) != null) {
            Thread.yield();
        }
        this.e.lazySet(i, ao5Var);
        b.incrementAndGet(this);
        return null;
    }

    private final void d(ao5 ao5Var) {
        if (ao5Var != null) {
            if (ao5Var.t.l() == 1) {
                d.decrementAndGet(this);
            }
        }
    }

    private final ao5 i() {
        ao5 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (c.compareAndSet(this, i, i + 1) && (andSet = this.e.getAndSet(i2, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(vn5 vn5Var) {
        ao5 i = i();
        if (i == null) {
            return false;
        }
        vn5Var.a(i);
        return true;
    }

    private final long m(go5 go5Var, boolean z) {
        ao5 ao5Var;
        do {
            ao5Var = (ao5) go5Var.lastScheduledTask;
            if (ao5Var == null) {
                return -2L;
            }
            if (z) {
                if (!(ao5Var.t.l() == 1)) {
                    return -2L;
                }
            }
            long a2 = eo5.f.a() - ao5Var.s;
            long j = eo5.b;
            if (a2 < j) {
                return j - a2;
            }
        } while (!a.compareAndSet(go5Var, ao5Var, null));
        b(this, ao5Var, false, 2, null);
        return -1L;
    }

    @Nullable
    public final ao5 a(@NotNull ao5 ao5Var, boolean z) {
        if (z) {
            return c(ao5Var);
        }
        ao5 ao5Var2 = (ao5) a.getAndSet(this, ao5Var);
        if (ao5Var2 == null) {
            return null;
        }
        return c(ao5Var2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(@NotNull vn5 vn5Var) {
        ao5 ao5Var = (ao5) a.getAndSet(this, null);
        if (ao5Var != null) {
            vn5Var.a(ao5Var);
        }
        do {
        } while (j(vn5Var));
    }

    @Nullable
    public final ao5 h() {
        ao5 ao5Var = (ao5) a.getAndSet(this, null);
        return ao5Var == null ? i() : ao5Var;
    }

    public final long k(@NotNull go5 go5Var) {
        int i = go5Var.consumerIndex;
        int i2 = go5Var.producerIndex;
        AtomicReferenceArray<ao5> atomicReferenceArray = go5Var.e;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (go5Var.blockingTasksInBuffer == 0) {
                break;
            }
            ao5 ao5Var = atomicReferenceArray.get(i3);
            if (ao5Var != null) {
                if ((ao5Var.t.l() == 1) && atomicReferenceArray.compareAndSet(i3, ao5Var, null)) {
                    d.decrementAndGet(go5Var);
                    b(this, ao5Var, false, 2, null);
                    return -1L;
                }
            }
            i++;
        }
        return m(go5Var, true);
    }

    public final long l(@NotNull go5 go5Var) {
        ao5 i = go5Var.i();
        if (i != null) {
            b(this, i, false, 2, null);
            return -1L;
        }
        return m(go5Var, false);
    }
}