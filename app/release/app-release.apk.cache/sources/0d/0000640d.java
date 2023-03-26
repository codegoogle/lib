package com.p7700g.p99005;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Mutex.kt */
@vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 :\u0006$%&'()B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJT\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\"\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "", "locked", "<init>", "(Z)V", "", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class wo5 implements vo5, mo5<Object, vo5> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(wo5.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a extends c {
        @NotNull
        private final gb5<yq4> y;

        /* compiled from: Mutex.kt */
        @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.wo5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0266a extends e25 implements f05<Throwable, yq4> {
            public final /* synthetic */ wo5 t;
            public final /* synthetic */ a u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0266a(wo5 wo5Var, a aVar) {
                super(1);
                this.t = wo5Var;
                this.u = aVar;
            }

            @Override // com.p7700g.p99005.f05
            public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
                a(th);
                return yq4.a;
            }

            public final void a(@NotNull Throwable th) {
                this.t.d(this.u.w);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable Object obj, @NotNull gb5<? super yq4> gb5Var) {
            super(obj);
            this.y = gb5Var;
        }

        @Override // com.p7700g.p99005.wo5.c
        public void D0() {
            this.y.w0(ib5.d);
        }

        @Override // com.p7700g.p99005.wo5.c
        public boolean F0() {
            return E0() && this.y.N(yq4.a, null, new C0266a(wo5.this, this)) != null;
        }

        @Override // com.p7700g.p99005.hm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("LockCont[");
            G.append(this.w);
            G.append(", ");
            G.append(this.y);
            G.append("] for ");
            G.append(wo5.this);
            return G.toString();
        }
    }

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BD\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R1\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "completeResumeLockWaiter", "", "toString", "", "tryResumeLockWaiter", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class b<R> extends c {
        @cz4
        @NotNull
        public final no5<R> y;
        @cz4
        @NotNull
        public final j05<vo5, uv4<? super R>, Object> z;

        /* compiled from: Mutex.kt */
        @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends e25 implements f05<Throwable, yq4> {
            public final /* synthetic */ wo5 t;
            public final /* synthetic */ b<R> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wo5 wo5Var, b<R> bVar) {
                super(1);
                this.t = wo5Var;
                this.u = bVar;
            }

            @Override // com.p7700g.p99005.f05
            public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
                a(th);
                return yq4.a;
            }

            public final void a(@NotNull Throwable th) {
                this.t.d(this.u.w);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Nullable Object obj, @NotNull no5<? super R> no5Var, @NotNull j05<? super vo5, ? super uv4<? super R>, ? extends Object> j05Var) {
            super(obj);
            this.y = no5Var;
            this.z = j05Var;
        }

        @Override // com.p7700g.p99005.wo5.c
        public void D0() {
            on5.e(this.z, wo5.this, this.y.y(), new a(wo5.this, this));
        }

        @Override // com.p7700g.p99005.wo5.c
        public boolean F0() {
            return E0() && this.y.p();
        }

        @Override // com.p7700g.p99005.hm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("LockSelect[");
            G.append(this.w);
            G.append(", ");
            G.append(this.y);
            G.append("] for ");
            G.append(wo5.this);
            return G.toString();
        }
    }

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b¢\u0004\u0018\u00002\u00020\u000f2\u00020\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "", "completeResumeLockWaiter", "()V", "dispose", "", "take", "()Z", "tryResumeLockWaiter", "Ljava/lang/Object;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public abstract class c extends hm5 implements gd5 {
        private static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(c.class, "isTaken");
        @NotNull
        private volatile /* synthetic */ int isTaken = 0;
        @cz4
        @Nullable
        public final Object w;

        public c(@Nullable Object obj) {
            this.w = obj;
        }

        public abstract void D0();

        public final boolean E0() {
            return v.compareAndSet(this, 0, 1);
        }

        public abstract boolean F0();

        @Override // com.p7700g.p99005.gd5
        public final void w() {
            u0();
        }
    }

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", "", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends fm5 {
        @cz4
        @NotNull
        public Object v;

        public d(@NotNull Object obj) {
            this.v = obj;
        }

        @Override // com.p7700g.p99005.hm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("LockedQueue[");
            G.append(this.v);
            G.append(f14.v);
            return G.toString();
        }
    }

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", com.anythink.expressad.foundation.d.c.bV, "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "prepare", "PrepareOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends kl5 {
        @cz4
        @NotNull
        public final wo5 b;
        @cz4
        @Nullable
        public final Object c;

        /* compiled from: Mutex.kt */
        @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "(Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;Lkotlinx/coroutines/internal/AtomicOp;)V", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public final class a extends sm5 {
            @NotNull
            private final ml5<?> a;

            public a(@NotNull ml5<?> ml5Var) {
                this.a = ml5Var;
            }

            @Override // com.p7700g.p99005.sm5
            @NotNull
            public ml5<?> a() {
                return this.a;
            }

            @Override // com.p7700g.p99005.sm5
            @Nullable
            public Object c(@Nullable Object obj) {
                Object a = a().h() ? xo5.f : a();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                wo5.s.compareAndSet((wo5) obj, this, a);
                return null;
            }
        }

        public e(@NotNull wo5 wo5Var, @Nullable Object obj) {
            this.b = wo5Var;
            this.c = obj;
        }

        @Override // com.p7700g.p99005.kl5
        public void a(@NotNull ml5<?> ml5Var, @Nullable Object obj) {
            uo5 uo5Var;
            if (obj != null) {
                uo5Var = xo5.f;
            } else {
                Object obj2 = this.c;
                uo5Var = obj2 == null ? xo5.e : new uo5(obj2);
            }
            wo5.s.compareAndSet(this.b, ml5Var, uo5Var);
        }

        @Override // com.p7700g.p99005.kl5
        @Nullable
        public Object c(@NotNull ml5<?> ml5Var) {
            uo5 uo5Var;
            an5 an5Var;
            a aVar = new a(ml5Var);
            wo5 wo5Var = this.b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wo5.s;
            uo5Var = xo5.f;
            if (!atomicReferenceFieldUpdater.compareAndSet(wo5Var, uo5Var, aVar)) {
                an5Var = xo5.a;
                return an5Var;
            }
            return aVar.c(this.b);
        }
    }

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", com.anythink.expressad.foundation.d.c.bV, "", "affected", "failure", "", "prepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends ml5<wo5> {
        @cz4
        @NotNull
        public final d b;

        public f(@NotNull d dVar) {
            this.b = dVar;
        }

        @Override // com.p7700g.p99005.ml5
        /* renamed from: j */
        public void d(@NotNull wo5 wo5Var, @Nullable Object obj) {
            wo5.s.compareAndSet(wo5Var, this, obj == null ? xo5.f : this.b);
        }

        @Override // com.p7700g.p99005.ml5
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull wo5 wo5Var) {
            an5 an5Var;
            if (this.b.E0()) {
                return null;
            }
            an5Var = xo5.b;
            return an5Var;
        }
    }

    /* compiled from: Mutex.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ Object u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj) {
            super(1);
            this.u = obj;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@NotNull Throwable th) {
            wo5.this.d(this.u);
        }
    }

    public wo5(boolean z) {
        this._state = z ? xo5.e : xo5.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        com.p7700g.p99005.jb5.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, uv4<? super yq4> uv4Var) {
        an5 an5Var;
        hb5 b2 = jb5.b(fw4.d(uv4Var));
        a aVar = new a(obj, b2);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof uo5) {
                uo5 uo5Var = (uo5) obj2;
                Object obj3 = uo5Var.a;
                an5Var = xo5.d;
                if (obj3 != an5Var) {
                    s.compareAndSet(this, obj2, new d(uo5Var.a));
                } else {
                    if (s.compareAndSet(this, obj2, obj == null ? xo5.e : new uo5(obj))) {
                        b2.V(yq4.a, new g(obj));
                        break;
                    }
                }
            } else if (obj2 instanceof d) {
                d dVar = (d) obj2;
                if (dVar.v != obj) {
                    dVar.b0(aVar);
                    if (this._state == obj2 || !aVar.E0()) {
                        break;
                    }
                    aVar = new a(obj, b2);
                } else {
                    throw new IllegalStateException(c25.C("Already locked by ", obj).toString());
                }
            } else if (!(obj2 instanceof sm5)) {
                throw new IllegalStateException(c25.C("Illegal state ", obj2).toString());
            } else {
                ((sm5) obj2).c(this);
            }
        }
        Object x = b2.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4.a;
    }

    @Override // com.p7700g.p99005.mo5
    public <R> void G(@NotNull no5<? super R> no5Var, @Nullable Object obj, @NotNull j05<? super vo5, ? super uv4<? super R>, ? extends Object> j05Var) {
        an5 an5Var;
        an5 an5Var2;
        while (!no5Var.v()) {
            Object obj2 = this._state;
            if (obj2 instanceof uo5) {
                uo5 uo5Var = (uo5) obj2;
                Object obj3 = uo5Var.a;
                an5Var = xo5.d;
                if (obj3 != an5Var) {
                    s.compareAndSet(this, obj2, new d(uo5Var.a));
                } else {
                    Object E = no5Var.E(new e(this, obj));
                    if (E == null) {
                        pn5.d(j05Var, this, no5Var.y());
                        return;
                    } else if (E == oo5.d()) {
                        return;
                    } else {
                        an5Var2 = xo5.a;
                        if (E != an5Var2 && E != ll5.b) {
                            throw new IllegalStateException(c25.C("performAtomicTrySelect(TryLockDesc) returned ", E).toString());
                        }
                    }
                }
            } else if (obj2 instanceof d) {
                d dVar = (d) obj2;
                if (dVar.v != obj) {
                    b bVar = new b(obj, no5Var, j05Var);
                    dVar.b0(bVar);
                    if (this._state == obj2 || !bVar.E0()) {
                        no5Var.K(bVar);
                        return;
                    }
                } else {
                    throw new IllegalStateException(c25.C("Already locked by ", obj).toString());
                }
            } else if (!(obj2 instanceof sm5)) {
                throw new IllegalStateException(c25.C("Illegal state ", obj2).toString());
            } else {
                ((sm5) obj2).c(this);
            }
        }
    }

    @Override // com.p7700g.p99005.vo5
    public boolean a(@Nullable Object obj) {
        an5 an5Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof uo5) {
                Object obj3 = ((uo5) obj2).a;
                an5Var = xo5.d;
                if (obj3 != an5Var) {
                    return false;
                }
                if (s.compareAndSet(this, obj2, obj == null ? xo5.e : new uo5(obj))) {
                    return true;
                }
            } else if (obj2 instanceof d) {
                if (((d) obj2).v != obj) {
                    return false;
                }
                throw new IllegalStateException(c25.C("Already locked by ", obj).toString());
            } else if (!(obj2 instanceof sm5)) {
                throw new IllegalStateException(c25.C("Illegal state ", obj2).toString());
            } else {
                ((sm5) obj2).c(this);
            }
        }
    }

    @Override // com.p7700g.p99005.vo5
    public boolean b() {
        an5 an5Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof uo5) {
                Object obj2 = ((uo5) obj).a;
                an5Var = xo5.d;
                return obj2 != an5Var;
            } else if (obj instanceof d) {
                return true;
            } else {
                if (!(obj instanceof sm5)) {
                    throw new IllegalStateException(c25.C("Illegal state ", obj).toString());
                }
                ((sm5) obj).c(this);
            }
        }
    }

    @Override // com.p7700g.p99005.vo5
    @Nullable
    public Object c(@Nullable Object obj, @NotNull uv4<? super yq4> uv4Var) {
        Object i;
        return (!a(obj) && (i = i(obj, uv4Var)) == gw4.h()) ? i : yq4.a;
    }

    @Override // com.p7700g.p99005.vo5
    public void d(@Nullable Object obj) {
        uo5 uo5Var;
        an5 an5Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof uo5) {
                if (obj == null) {
                    Object obj3 = ((uo5) obj2).a;
                    an5Var = xo5.d;
                    if (!(obj3 != an5Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    uo5 uo5Var2 = (uo5) obj2;
                    if (!(uo5Var2.a == obj)) {
                        StringBuilder G = wo1.G("Mutex is locked by ");
                        G.append(uo5Var2.a);
                        G.append(" but expected ");
                        G.append(obj);
                        throw new IllegalStateException(G.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                uo5Var = xo5.f;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, uo5Var)) {
                    return;
                }
            } else if (obj2 instanceof sm5) {
                ((sm5) obj2).c(this);
            } else if (obj2 instanceof d) {
                if (obj != null) {
                    d dVar = (d) obj2;
                    if (!(dVar.v == obj)) {
                        StringBuilder G2 = wo1.G("Mutex is locked by ");
                        G2.append(dVar.v);
                        G2.append(" but expected ");
                        G2.append(obj);
                        throw new IllegalStateException(G2.toString().toString());
                    }
                }
                d dVar2 = (d) obj2;
                hm5 y0 = dVar2.y0();
                if (y0 == null) {
                    f fVar = new f(dVar2);
                    if (s.compareAndSet(this, obj2, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) y0;
                    if (cVar.F0()) {
                        Object obj4 = cVar.w;
                        if (obj4 == null) {
                            obj4 = xo5.c;
                        }
                        dVar2.v = obj4;
                        cVar.D0();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(c25.C("Illegal state ", obj2).toString());
            }
        }
    }

    @Override // com.p7700g.p99005.vo5
    public boolean e(@NotNull Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof uo5) {
            if (((uo5) obj2).a == obj) {
                return true;
            }
        } else if ((obj2 instanceof d) && ((d) obj2).v == obj) {
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.vo5
    @NotNull
    public mo5<Object, vo5> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof d) && ((d) obj).E0();
    }

    @NotNull
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof uo5) {
                StringBuilder G = wo1.G("Mutex[");
                G.append(((uo5) obj).a);
                G.append(f14.v);
                return G.toString();
            } else if (!(obj instanceof sm5)) {
                if (obj instanceof d) {
                    StringBuilder G2 = wo1.G("Mutex[");
                    G2.append(((d) obj).v);
                    G2.append(f14.v);
                    return G2.toString();
                }
                throw new IllegalStateException(c25.C("Illegal state ", obj).toString());
            } else {
                ((sm5) obj).c(this);
            }
        }
    }
}