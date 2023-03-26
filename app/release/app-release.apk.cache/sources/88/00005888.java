package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineScheduler.kt */
@vo4(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010!\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\u0082\b¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b$\u0010\u0017J-\u0010&\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\n\u0010(\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b-\u0010\u0017J\u001b\u0010/\u001a\u00020\u00012\n\u0010.\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\f2\n\u0010.\u001a\u00060 R\u00020\u0000¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u00132\n\u0010.\u001a\u00060 R\u00020\u00002\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b8\u0010,J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0013¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\fH\u0082\b¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ+\u0010I\u001a\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JR\u0015\u0010\u0010\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010LR\u0015\u0010\u001f\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010O\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0014\u0010\u0003\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u001e\u0010V\u001a\f\u0012\b\u0012\u00060 R\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", CallMraidJS.b, "availableCpuPermits", "(J)I", "blockingTasks", "", com.anythink.expressad.foundation.d.c.cd, "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", AFHydra.STATUS_IDLE, "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class qn5 implements Executor, Closeable {
    private static final int A = 21;
    private static final long B = 2097151;
    private static final long C = 4398044413952L;
    private static final int D = 42;
    private static final long E = 9223367638808264704L;
    public static final int F = 1;
    public static final int G = 2097150;
    private static final long H = 2097151;
    private static final long I = -2097152;
    private static final long J = 2097152;
    private static final int x = -1;
    private static final int y = 0;
    private static final int z = 1;
    @cz4
    public final int K;
    @cz4
    public final int L;
    @cz4
    public final long M;
    @cz4
    @NotNull
    public final String N;
    @cz4
    @NotNull
    public final vn5 O;
    @cz4
    @NotNull
    public final vn5 P;
    @cz4
    @NotNull
    public final vm5<c> Q;
    @NotNull
    private volatile /* synthetic */ int _isTerminated;
    @NotNull
    public volatile /* synthetic */ long controlState;
    @NotNull
    private volatile /* synthetic */ long parkedWorkersStack;
    @NotNull
    public static final a s = new a(null);
    @cz4
    @NotNull
    public static final an5 w = new an5("NOT_IN_STACK");
    private static final /* synthetic */ AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(qn5.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(qn5.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(qn5.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            d.values();
            int[] iArr = new int[5];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @vo4(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public qn5(int i, int i2, long j, @NotNull String str) {
        this.K = i;
        this.L = i2;
        this.M = j;
        this.N = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(wo1.n("Core pool size ", i, " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(wo1.o("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(wo1.n("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j > 0) {
            this.O = new vn5();
            this.P = new vn5();
            this.parkedWorkersStack = 0L;
            this.Q = new vm5<>(i + 1);
            this.controlState = i << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
    }

    private final c A() {
        while (true) {
            long j = this.parkedWorkersStack;
            c b2 = this.Q.b((int) (2097151 & j));
            if (b2 == null) {
                return null;
            }
            long j2 = (2097152 + j) & I;
            int z2 = z(b2);
            if (z2 >= 0 && t.compareAndSet(this, j, z2 | j2)) {
                b2.q(w);
                return b2;
            }
        }
    }

    private final long K() {
        return u.addAndGet(this, 4398046511104L);
    }

    private final void W(boolean z2) {
        long addAndGet = u.addAndGet(this, 2097152L);
        if (z2 || c1() || x0(addAndGet)) {
            return;
        }
        c1();
    }

    public static /* synthetic */ boolean X0(qn5 qn5Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = qn5Var.controlState;
        }
        return qn5Var.x0(j);
    }

    private final ao5 Y(c cVar, ao5 ao5Var, boolean z2) {
        if (cVar == null || cVar.u == d.TERMINATED) {
            return ao5Var;
        }
        if (ao5Var.t.l() == 0 && cVar.u == d.BLOCKING) {
            return ao5Var;
        }
        cVar.y = true;
        return cVar.t.a(ao5Var, z2);
    }

    private final boolean Z() {
        long j;
        do {
            j = this.controlState;
            if (((int) ((E & j) >> 42)) == 0) {
                return false;
            }
        } while (!u.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    private final boolean a(ao5 ao5Var) {
        if (ao5Var.t.l() == 1) {
            return this.P.a(ao5Var);
        }
        return this.O.a(ao5Var);
    }

    private final boolean c1() {
        c A2;
        do {
            A2 = A();
            if (A2 == null) {
                return false;
            }
        } while (!c.s.compareAndSet(A2, -1, 0));
        LockSupport.unpark(A2);
        return true;
    }

    private final int d(long j) {
        return (int) ((j & C) >> 21);
    }

    private final int e() {
        synchronized (this.Q) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int n = i55.n(i - ((int) ((j & C) >> 21)), 0);
            if (n >= this.K) {
                return 0;
            }
            if (i >= this.L) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.Q.b(i2) == null) {
                c cVar = new c(i2);
                this.Q.c(i2, cVar);
                if (i2 == ((int) (2097151 & u.incrementAndGet(this)))) {
                    cVar.start();
                    return n + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final int h(long j) {
        return (int) (j & 2097151);
    }

    private final c j() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && c25.g(qn5.this, this)) {
            return cVar;
        }
        return null;
    }

    private final void k() {
        u.addAndGet(this, I);
    }

    private final int l() {
        return (int) (u.getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void q(qn5 qn5Var, Runnable runnable, bo5 bo5Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            bo5Var = eo5.i;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        qn5Var.m(runnable, bo5Var, z2);
    }

    private final int r() {
        return (int) ((this.controlState & E) >> 42);
    }

    private final int s() {
        return (int) (this.controlState & 2097151);
    }

    private final long v() {
        return u.addAndGet(this, 2097152L);
    }

    private final int w() {
        return (int) (u.incrementAndGet(this) & 2097151);
    }

    private final boolean x0(long j) {
        if (i55.n(((int) (2097151 & j)) - ((int) ((j & C) >> 21)), 0) < this.K) {
            int e = e();
            if (e == 1 && this.K > 1) {
                e();
            }
            if (e > 0) {
                return true;
            }
        }
        return false;
    }

    private final int z(c cVar) {
        Object h = cVar.h();
        while (h != w) {
            if (h == null) {
                return 0;
            }
            c cVar2 = (c) h;
            int g = cVar2.g();
            if (g != 0) {
                return g;
            }
            h = cVar2.h();
        }
        return -1;
    }

    public final boolean E(@NotNull c cVar) {
        long j;
        long j2;
        int g;
        if (cVar.h() != w) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            j2 = (2097152 + j) & I;
            g = cVar.g();
            cVar.q(this.Q.b((int) (2097151 & j)));
        } while (!t.compareAndSet(this, j, j2 | g));
        return true;
    }

    public final void F(@NotNull c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & I;
            if (i3 == i) {
                i3 = i2 == 0 ? z(cVar) : i2;
            }
            if (i3 >= 0 && t.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public final void P(@NotNull ao5 ao5Var) {
        try {
            ao5Var.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                ra5 b2 = sa5.b();
                if (b2 == null) {
                }
            } finally {
                ra5 b3 = sa5.b();
                if (b3 != null) {
                    b3.f();
                }
            }
        }
    }

    public final void U(long j) {
        int i;
        if (v.compareAndSet(this, 0, 1)) {
            c j2 = j();
            synchronized (this.Q) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    c b2 = this.Q.b(i2);
                    c25.m(b2);
                    c cVar = b2;
                    if (cVar != j2) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.t.g(this.P);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.P.b();
            this.O.b();
            while (true) {
                ao5 f = j2 == null ? null : j2.f(true);
                if (f == null && (f = this.O.g()) == null && (f = this.P.g()) == null) {
                    break;
                }
                P(f);
            }
            if (j2 != null) {
                j2.t(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void X() {
        if (c1() || X0(this, 0L, 1, null)) {
            return;
        }
        c1();
    }

    public final int b(long j) {
        return (int) ((j & E) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        U(gc0.c);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        q(this, runnable, null, false, 6, null);
    }

    @NotNull
    public final ao5 f(@NotNull Runnable runnable, @NotNull bo5 bo5Var) {
        long a2 = eo5.f.a();
        if (runnable instanceof ao5) {
            ao5 ao5Var = (ao5) runnable;
            ao5Var.s = a2;
            ao5Var.t = bo5Var;
            return ao5Var;
        }
        return new do5(runnable, a2, bo5Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void m(@NotNull Runnable runnable, @NotNull bo5 bo5Var, boolean z2) {
        ra5 b2 = sa5.b();
        if (b2 != null) {
            b2.e();
        }
        ao5 f = f(runnable, bo5Var);
        c j = j();
        ao5 Y = Y(j, f, z2);
        if (Y != null && !a(Y)) {
            throw new RejectedExecutionException(c25.C(this.N, " was terminated"));
        }
        boolean z3 = z2 && j != null;
        if (f.t.l() != 0) {
            W(z3);
        } else if (z3) {
        } else {
            X();
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.Q.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a2) {
            int i7 = i6 + 1;
            c b2 = this.Q.b(i6);
            if (b2 != null) {
                int f = b2.t.f();
                int ordinal = b2.u.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i5++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.N + '@' + qc5.b(this) + "[Pool Size {core = " + this.K + ", max = " + this.L + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.O.c() + ", global blocking queue size = " + this.P.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((C & j) >> 21)) + ", CPUs acquired = " + (this.K - ((int) ((E & j) >> 42))) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    @vo4(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0080\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u001cR*\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0014\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0012\u0010B\u001a\u00020?8Æ\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00106¨\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", la1.l, "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", AFHydra.STATUS_IDLE, "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", CallMraidJS.b, "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class c extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        @Nullable
        private volatile Object nextParkedWorker;
        @cz4
        @NotNull
        public final go5 t;
        @cz4
        @NotNull
        public d u;
        private long v;
        private long w;
        @NotNull
        public volatile /* synthetic */ int workerCtl;
        private int x;
        @cz4
        public boolean y;

        private c() {
            setDaemon(true);
            this.t = new go5();
            this.u = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = qn5.w;
            this.x = n45.s.y();
        }

        private final void b(int i) {
            if (i == 0) {
                return;
            }
            qn5.u.addAndGet(qn5.this, qn5.I);
            if (this.u != d.TERMINATED) {
                this.u = d.DORMANT;
            }
        }

        private final void c(int i) {
            if (i != 0 && t(d.BLOCKING)) {
                qn5.this.X();
            }
        }

        private final void d(ao5 ao5Var) {
            int l = ao5Var.t.l();
            j(l);
            c(l);
            qn5.this.P(ao5Var);
            b(l);
        }

        private final ao5 e(boolean z) {
            ao5 n;
            ao5 n2;
            if (z) {
                boolean z2 = l(qn5.this.K * 2) == 0;
                if (z2 && (n2 = n()) != null) {
                    return n2;
                }
                ao5 h = this.t.h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (n = n()) != null) {
                    return n;
                }
            } else {
                ao5 n3 = n();
                if (n3 != null) {
                    return n3;
                }
            }
            return u(false);
        }

        private final void j(int i) {
            this.v = 0L;
            if (this.u == d.PARKING) {
                this.u = d.BLOCKING;
            }
        }

        private final boolean k() {
            return this.nextParkedWorker != qn5.w;
        }

        private final void m() {
            if (this.v == 0) {
                this.v = System.nanoTime() + qn5.this.M;
            }
            LockSupport.parkNanos(qn5.this.M);
            if (System.nanoTime() - this.v >= 0) {
                this.v = 0L;
                v();
            }
        }

        private final ao5 n() {
            if (l(2) == 0) {
                ao5 g = qn5.this.O.g();
                return g == null ? qn5.this.P.g() : g;
            }
            ao5 g2 = qn5.this.P.g();
            return g2 == null ? qn5.this.O.g() : g2;
        }

        private final void o() {
            loop0: while (true) {
                boolean z = false;
                while (!qn5.this.isTerminated() && this.u != d.TERMINATED) {
                    ao5 f = f(this.y);
                    if (f != null) {
                        this.w = 0L;
                        d(f);
                    } else {
                        this.y = false;
                        if (this.w == 0) {
                            s();
                        } else if (z) {
                            t(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.w);
                            this.w = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            t(d.TERMINATED);
        }

        private final boolean r() {
            boolean z;
            if (this.u != d.CPU_ACQUIRED) {
                qn5 qn5Var = qn5.this;
                while (true) {
                    long j = qn5Var.controlState;
                    if (((int) ((qn5.E & j) >> 42)) != 0) {
                        if (qn5.u.compareAndSet(qn5Var, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.u = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void s() {
            if (!k()) {
                qn5.this.E(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !qn5.this.isTerminated() && this.u != d.TERMINATED) {
                t(d.PARKING);
                Thread.interrupted();
                m();
            }
        }

        private final ao5 u(boolean z) {
            long l;
            int i = (int) (qn5.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int l2 = l(i);
            qn5 qn5Var = qn5.this;
            int i2 = 0;
            long j = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                l2++;
                if (l2 > i) {
                    l2 = 1;
                }
                c b = qn5Var.Q.b(l2);
                if (b != null && b != this) {
                    if (z) {
                        l = this.t.k(b.t);
                    } else {
                        l = this.t.l(b.t);
                    }
                    if (l == -1) {
                        return this.t.h();
                    }
                    if (l > 0) {
                        j = Math.min(j, l);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.w = j;
            return null;
        }

        private final void v() {
            qn5 qn5Var = qn5.this;
            synchronized (qn5Var.Q) {
                if (qn5Var.isTerminated()) {
                    return;
                }
                if (((int) (qn5Var.controlState & 2097151)) <= qn5Var.K) {
                    return;
                }
                if (s.compareAndSet(this, -1, 1)) {
                    int g = g();
                    p(0);
                    qn5Var.F(this, g, 0);
                    int andDecrement = (int) (qn5.u.getAndDecrement(qn5Var) & 2097151);
                    if (andDecrement != g) {
                        c b = qn5Var.Q.b(andDecrement);
                        c25.m(b);
                        c cVar = b;
                        qn5Var.Q.c(g, cVar);
                        cVar.p(g);
                        qn5Var.F(cVar, andDecrement, g);
                    }
                    qn5Var.Q.c(andDecrement, null);
                    yq4 yq4Var = yq4.a;
                    this.u = d.TERMINATED;
                }
            }
        }

        @Nullable
        public final ao5 f(boolean z) {
            ao5 g;
            if (r()) {
                return e(z);
            }
            if (z) {
                g = this.t.h();
                if (g == null) {
                    g = qn5.this.P.g();
                }
            } else {
                g = qn5.this.P.g();
            }
            return g == null ? u(true) : g;
        }

        public final int g() {
            return this.indexInArray;
        }

        @Nullable
        public final Object h() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final qn5 i() {
            return qn5.this;
        }

        public final int l(int i) {
            int i2 = this.x;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.x = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final void p(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(qn5.this.N);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void q(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final boolean t(@NotNull d dVar) {
            d dVar2 = this.u;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                qn5.u.addAndGet(qn5.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.u = dVar;
            }
            return z;
        }

        public c(int i) {
            this();
            p(i);
        }
    }

    public /* synthetic */ qn5(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? eo5.e : j, (i3 & 8) != 0 ? eo5.a : str);
    }
}