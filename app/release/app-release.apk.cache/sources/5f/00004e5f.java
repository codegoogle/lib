package com.p7700g.p99005;

import com.p7700g.p99005.vc5;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventLoop.common.kt */
@vo4(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0014\u00103\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ld5 extends md5 implements vc5 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(ld5.class, Object.class, "_queue");
    private static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(ld5.class, Object.class, "_delayed");
    @NotNull
    private volatile /* synthetic */ Object _queue = null;
    @NotNull
    private volatile /* synthetic */ Object _delayed = null;
    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a extends c {
        @NotNull
        private final gb5<yq4> v;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, @NotNull gb5<? super yq4> gb5Var) {
            super(j);
            this.v = gb5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.v.S(ld5.this, yq4.a);
        }

        @Override // com.p7700g.p99005.ld5.c
        @NotNull
        public String toString() {
            return c25.C(super.toString(), this.v);
        }
    }

    /* compiled from: EventLoop.common.kt */
    @vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends c {
        @NotNull
        private final Runnable v;

        public b(long j, @NotNull Runnable runnable) {
            super(j);
            this.v = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.v.run();
        }

        @Override // com.p7700g.p99005.ld5.c
        @NotNull
        public String toString() {
            return c25.C(super.toString(), this.v);
        }
    }

    /* compiled from: EventLoop.common.kt */
    @vo4(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", la1.l, "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class c implements Runnable, Comparable<c>, gd5, kn5 {
        @cz4
        public long s;
        @Nullable
        private Object t;
        private int u = -1;

        public c(long j) {
            this.s = j;
        }

        @Override // com.p7700g.p99005.kn5
        public void a(@Nullable jn5<?> jn5Var) {
            an5 an5Var;
            Object obj = this.t;
            an5Var = od5.a;
            if (obj != an5Var) {
                this.t = jn5Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // com.p7700g.p99005.kn5
        @Nullable
        public jn5<?> b() {
            Object obj = this.t;
            if (obj instanceof jn5) {
                return (jn5) obj;
            }
            return null;
        }

        @Override // com.p7700g.p99005.kn5
        public void c(int i) {
            this.u = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(@NotNull c cVar) {
            int i = ((this.s - cVar.s) > 0L ? 1 : ((this.s - cVar.s) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        public final synchronized int e(long j, @NotNull d dVar, @NotNull ld5 ld5Var) {
            an5 an5Var;
            Object obj = this.t;
            an5Var = od5.a;
            if (obj == an5Var) {
                return 2;
            }
            synchronized (dVar) {
                c e = dVar.e();
                if (ld5Var.m()) {
                    return 1;
                }
                if (e == null) {
                    dVar.b = j;
                } else {
                    long j2 = e.s;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.b > 0) {
                        dVar.b = j;
                    }
                }
                long j3 = this.s;
                long j4 = dVar.b;
                if (j3 - j4 < 0) {
                    this.s = j4;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean f(long j) {
            return j - this.s >= 0;
        }

        @Override // com.p7700g.p99005.kn5
        public int p() {
            return this.u;
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("Delayed[nanos=");
            G.append(this.s);
            G.append(f14.v);
            return G.toString();
        }

        @Override // com.p7700g.p99005.gd5
        public final synchronized void w() {
            an5 an5Var;
            an5 an5Var2;
            Object obj = this.t;
            an5Var = od5.a;
            if (obj == an5Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.j(this);
            }
            an5Var2 = od5.a;
            this.t = an5Var2;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @vo4(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends jn5<c> {
        @cz4
        public long b;

        public d(long j) {
            this.b = j;
        }
    }

    private final void j2() {
        an5 an5Var;
        an5 an5Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                an5Var = od5.h;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, an5Var)) {
                    return;
                }
            } else if (!(obj instanceof km5)) {
                an5Var2 = od5.h;
                if (obj == an5Var2) {
                    return;
                }
                km5 km5Var = new km5(8, true);
                km5Var.a((Runnable) obj);
                if (w.compareAndSet(this, obj, km5Var)) {
                    return;
                }
            } else {
                ((km5) obj).d();
                return;
            }
        }
    }

    private final Runnable k2() {
        an5 an5Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof km5)) {
                an5Var = od5.h;
                if (obj == an5Var) {
                    return null;
                }
                if (w.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                km5 km5Var = (km5) obj;
                Object l = km5Var.l();
                if (l != km5.p) {
                    return (Runnable) l;
                }
                w.compareAndSet(this, obj, km5Var.k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean m() {
        return this._isCompleted;
    }

    private final boolean m2(Runnable runnable) {
        an5 an5Var;
        while (true) {
            Object obj = this._queue;
            if (m()) {
                return false;
            }
            if (obj == null) {
                if (w.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof km5)) {
                an5Var = od5.h;
                if (obj == an5Var) {
                    return false;
                }
                km5 km5Var = new km5(8, true);
                km5Var.a((Runnable) obj);
                km5Var.a(runnable);
                if (w.compareAndSet(this, obj, km5Var)) {
                    return true;
                }
            } else {
                km5 km5Var2 = (km5) obj;
                int a2 = km5Var2.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    w.compareAndSet(this, obj, km5Var2.k());
                } else if (a2 == 2) {
                    return false;
                }
            }
        }
    }

    private final void n2() {
        ra5 b2 = sa5.b();
        Long valueOf = b2 == null ? null : Long.valueOf(b2.b());
        long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
        while (true) {
            d dVar = (d) this._delayed;
            c m = dVar == null ? null : dVar.m();
            if (m == null) {
                return;
            }
            g2(nanoTime, m);
        }
    }

    private final int q2(long j, c cVar) {
        if (m()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            x.compareAndSet(this, null, new d(j));
            Object obj = this._delayed;
            c25.m(obj);
            dVar = (d) obj;
        }
        return cVar.e(j, dVar, this);
    }

    private final void s2(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean t2(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar == null ? null : dVar.h()) == cVar;
    }

    @Override // com.p7700g.p99005.kd5
    public long K1() {
        an5 an5Var;
        if (super.K1() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof km5)) {
                an5Var = od5.h;
                return obj == an5Var ? Long.MAX_VALUE : 0L;
            } else if (!((km5) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        c h = dVar == null ? null : dVar.h();
        if (h == null) {
            return Long.MAX_VALUE;
        }
        long j = h.s;
        ra5 b2 = sa5.b();
        Long valueOf = b2 != null ? Long.valueOf(b2.b()) : null;
        return i55.o(j - (valueOf == null ? System.nanoTime() : valueOf.longValue()), 0L);
    }

    @Override // com.p7700g.p99005.kd5
    public boolean Z1() {
        an5 an5Var;
        if (b2()) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.g()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof km5) {
                        return ((km5) obj).h();
                    }
                    an5Var = od5.h;
                    if (obj != an5Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    @Override // com.p7700g.p99005.kd5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long c2() {
        Runnable k2;
        c k;
        if (d2()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.g()) {
            ra5 b2 = sa5.b();
            Long valueOf = b2 == null ? null : Long.valueOf(b2.b());
            long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
            do {
                synchronized (dVar) {
                    c e = dVar.e();
                    if (e == null) {
                        k = null;
                    } else {
                        c cVar = e;
                        k = cVar.f(nanoTime) ? m2(cVar) : false ? dVar.k(0) : null;
                    }
                }
            } while (k != null);
            k2 = k2();
            if (k2 == null) {
            }
        } else {
            k2 = k2();
            if (k2 == null) {
                k2.run();
                return 0L;
            }
            return K1();
        }
    }

    @Override // com.p7700g.p99005.vc5
    public void j(long j, @NotNull gb5<? super yq4> gb5Var) {
        long d2 = od5.d(j);
        if (d2 < q95.c) {
            ra5 b2 = sa5.b();
            Long valueOf = b2 == null ? null : Long.valueOf(b2.b());
            long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
            a aVar = new a(d2 + nanoTime, gb5Var);
            jb5.a(gb5Var, aVar);
            p2(nanoTime, aVar);
        }
    }

    public void l2(@NotNull Runnable runnable) {
        if (m2(runnable)) {
            h2();
        } else {
            rc5.y.l2(runnable);
        }
    }

    public final void o2() {
        this._queue = null;
        this._delayed = null;
    }

    public final void p2(long j, @NotNull c cVar) {
        int q2 = q2(j, cVar);
        if (q2 == 0) {
            if (t2(cVar)) {
                h2();
            }
        } else if (q2 == 1) {
            g2(j, cVar);
        } else if (q2 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // com.p7700g.p99005.vc5
    @NotNull
    public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
        return vc5.a.b(this, j, runnable, xv4Var);
    }

    @Override // com.p7700g.p99005.vc5
    @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object r(long j, @NotNull uv4<? super yq4> uv4Var) {
        return vc5.a.a(this, j, uv4Var);
    }

    @NotNull
    public final gd5 r2(long j, @NotNull Runnable runnable) {
        long d2 = od5.d(j);
        if (d2 < q95.c) {
            ra5 b2 = sa5.b();
            Long valueOf = b2 == null ? null : Long.valueOf(b2.b());
            long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
            b bVar = new b(d2 + nanoTime, runnable);
            p2(nanoTime, bVar);
            return bVar;
        }
        return te5.s;
    }

    @Override // com.p7700g.p99005.ec5
    public final void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        l2(runnable);
    }

    @Override // com.p7700g.p99005.kd5
    public void shutdown() {
        lf5.a.c();
        s2(true);
        j2();
        do {
        } while (c2() <= 0);
        n2();
    }
}