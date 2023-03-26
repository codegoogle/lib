package com.p7700g.p99005;

import com.p7700g.p99005.ee5;
import com.p7700g.p99005.hm5;
import com.p7700g.p99005.io5;
import com.p7700g.p99005.qp4;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Select.kt */
@np4
@vo4(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020Y2\b\u0012\u0004\u0012\u00028\u00000Z2\b\u0012\u0004\u0012\u00028\u00000[2\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060Bj\u0002`C:\u0004TUVWB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ8\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001cJ \u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J5\u00108\u001a\u00020\b*\u0002072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109JG\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00010;2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010=J[\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010>\"\u0004\b\u0002\u0010:*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020?2\u0006\u0010@\u001a\u00028\u00012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010AR\u001c\u0010F\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00102R(\u0010R\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010S\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "handle", "", "disposeOnSelect", "(Lkotlinx/coroutines/DisposableHandle;)V", "doAfterSelect", "()V", "Lkotlin/Function0;", "", "value", "block", "doResume", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "e", "handleBuilderException", "(Ljava/lang/Throwable;)V", "initCancellability", "", "timeMillis", "Lkotlin/Function1;", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "performAtomicTrySelect", "(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;", "exception", "resumeSelectWithException", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "trySelect", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "trySelectOther", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getCompletion", "()Lkotlin/coroutines/Continuation;", "completion", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "isSelected", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "parentHandle", "Lkotlin/coroutines/Continuation;", "AtomicSelectOp", "DisposeNode", "PairSelectOp", "SelectOnCancelling", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class jo5<R> extends fm5 implements io5<R>, no5<R>, uv4<R>, lw4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(jo5.class, Object.class, "_state");
    private static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(jo5.class, Object.class, "_result");
    @NotNull
    private final uv4<R> x;
    @NotNull
    public volatile /* synthetic */ Object _state = oo5.f();
    @NotNull
    private volatile /* synthetic */ Object _result = oo5.c();
    @NotNull
    private volatile /* synthetic */ Object _parentHandle = null;

    /* compiled from: Select.kt */
    @vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "impl", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;)V", "opSequence", "", "getOpSequence", "()J", com.anythink.expressad.foundation.d.c.bV, "", "affected", "failure", "completeSelect", "prepare", "prepareSelectOp", "toString", "", "undoPrepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends ml5<Object> {
        @cz4
        @NotNull
        public final jo5<?> b;
        @cz4
        @NotNull
        public final kl5 c;
        private final long d = oo5.b().a();

        public a(@NotNull jo5<?> jo5Var, @NotNull kl5 kl5Var) {
            this.b = jo5Var;
            this.c = kl5Var;
            kl5Var.d(this);
        }

        private final void j(Object obj) {
            boolean z = obj == null;
            if (jo5.v.compareAndSet(this.b, this, z ? null : oo5.f()) && z) {
                this.b.I0();
            }
        }

        private final Object k() {
            jo5<?> jo5Var = this.b;
            while (true) {
                Object obj = jo5Var._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof sm5) {
                    ((sm5) obj).c(this.b);
                } else if (obj == oo5.f()) {
                    if (jo5.v.compareAndSet(this.b, oo5.f(), this)) {
                        return null;
                    }
                } else {
                    return oo5.d();
                }
            }
        }

        private final void l() {
            jo5.v.compareAndSet(this.b, this, oo5.f());
        }

        @Override // com.p7700g.p99005.ml5
        public void d(@Nullable Object obj, @Nullable Object obj2) {
            j(obj2);
            this.c.a(this, obj2);
        }

        @Override // com.p7700g.p99005.ml5
        public long g() {
            return this.d;
        }

        @Override // com.p7700g.p99005.ml5
        @Nullable
        public Object i(@Nullable Object obj) {
            Object k;
            if (obj != null || (k = k()) == null) {
                try {
                    return this.c.c(this);
                } catch (Throwable th) {
                    if (obj == null) {
                        l();
                    }
                    throw th;
                }
            }
            return k;
        }

        @Override // com.p7700g.p99005.sm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("AtomicSelectOp(sequence=");
            G.append(g());
            G.append(')');
            return G.toString();
        }
    }

    /* compiled from: Select.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends hm5 {
        @cz4
        @NotNull
        public final gd5 v;

        public b(@NotNull gd5 gd5Var) {
            this.v = gd5Var;
        }
    }

    /* compiled from: Select.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$PairSelectOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends sm5 {
        @cz4
        @NotNull
        public final hm5.d a;

        public c(@NotNull hm5.d dVar) {
            this.a = dVar;
        }

        @Override // com.p7700g.p99005.sm5
        @NotNull
        public ml5<?> a() {
            return this.a.a();
        }

        @Override // com.p7700g.p99005.sm5
        @Nullable
        public Object c(@Nullable Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            jo5 jo5Var = (jo5) obj;
            this.a.d();
            Object e = this.a.a().e(null);
            jo5.v.compareAndSet(jo5Var, this, e == null ? this.a.c : oo5.f());
            return e;
        }
    }

    /* compiled from: Select.kt */
    @vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class d extends ge5 {
        public d() {
        }

        @Override // com.p7700g.p99005.wb5
        public void D0(@Nullable Throwable th) {
            if (jo5.this.p()) {
                jo5.this.C(E0().c1());
            }
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            D0(th);
            return yq4.a;
        }
    }

    /* compiled from: Runnable.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ f05 t;

        public e(f05 f05Var) {
            this.t = f05Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (jo5.this.p()) {
                on5.d(this.t, jo5.this.y());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jo5(@NotNull uv4<? super R> uv4Var) {
        this.x = uv4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        gd5 K0 = K0();
        if (K0 != null) {
            K0.w();
        }
        for (hm5 hm5Var = (hm5) m0(); !c25.g(hm5Var, this); hm5Var = hm5Var.n0()) {
            if (hm5Var instanceof b) {
                ((b) hm5Var).v.w();
            }
        }
    }

    private final void J0(uz4<? extends Object> uz4Var, uz4<yq4> uz4Var2) {
        while (true) {
            Object obj = this._result;
            if (obj == oo5.c()) {
                if (w.compareAndSet(this, oo5.c(), uz4Var.x())) {
                    return;
                }
            } else if (obj != gw4.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (w.compareAndSet(this, gw4.h(), oo5.a())) {
                    uz4Var2.x();
                    return;
                }
            }
        }
    }

    private final gd5 K0() {
        return (gd5) this._parentHandle;
    }

    private final void N0(gd5 gd5Var) {
        this._parentHandle = gd5Var;
    }

    private final void T() {
        ee5 ee5Var = (ee5) getContext().get(ee5.m0);
        if (ee5Var == null) {
            return;
        }
        gd5 f = ee5.a.f(ee5Var, true, false, new d(), 2, null);
        N0(f);
        if (v()) {
            f.w();
        }
    }

    @Override // com.p7700g.p99005.no5
    public void C(@NotNull Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == oo5.c()) {
                if (w.compareAndSet(this, oo5.c(), new ub5(th, false, 2, null))) {
                    return;
                }
            } else if (obj != gw4.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (w.compareAndSet(this, gw4.h(), oo5.a())) {
                    uv4 d2 = fw4.d(this.x);
                    qp4.a aVar = qp4.s;
                    d2.u(qp4.b(rp4.a(th)));
                    return;
                }
            }
        }
    }

    @Override // com.p7700g.p99005.no5
    @Nullable
    public Object E(@NotNull kl5 kl5Var) {
        return new a(this, kl5Var).c(null);
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public StackTraceElement H() {
        return null;
    }

    @Override // com.p7700g.p99005.no5
    public void K(@NotNull gd5 gd5Var) {
        b bVar = new b(gd5Var);
        if (!v()) {
            b0(bVar);
            if (!v()) {
                return;
            }
        }
        gd5Var.w();
    }

    @np4
    @Nullable
    public final Object L0() {
        if (!v()) {
            T();
        }
        Object obj = this._result;
        if (obj == oo5.c()) {
            if (w.compareAndSet(this, oo5.c(), gw4.h())) {
                return gw4.h();
            }
            obj = this._result;
        }
        if (obj != oo5.a()) {
            if (obj instanceof ub5) {
                throw ((ub5) obj).b;
            }
            return obj;
        }
        throw new IllegalStateException("Already resumed");
    }

    @np4
    public final void M0(@NotNull Throwable th) {
        if (p()) {
            qp4.a aVar = qp4.s;
            u(qp4.b(rp4.a(th)));
        } else if (th instanceof CancellationException) {
        } else {
            Object L0 = L0();
            if ((L0 instanceof ub5) && ((ub5) L0).b == th) {
                return;
            }
            hc5.b(getContext(), th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.io5
    public <Q> void W(@NotNull lo5<? extends Q> lo5Var, @NotNull j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
        lo5Var.i(this, j05Var);
    }

    @Override // com.p7700g.p99005.io5
    public void b(@NotNull ko5 ko5Var, @NotNull f05<? super uv4<? super R>, ? extends Object> f05Var) {
        ko5Var.r(this, f05Var);
    }

    @Override // com.p7700g.p99005.uv4
    @NotNull
    public xv4 getContext() {
        return this.x.getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        I0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        return com.p7700g.p99005.ib5.d;
     */
    @Override // com.p7700g.p99005.no5
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(@Nullable hm5.d dVar) {
        while (true) {
            Object obj = this._state;
            if (obj == oo5.f()) {
                if (dVar == null) {
                    if (v.compareAndSet(this, oo5.f(), null)) {
                        break;
                    }
                } else {
                    c cVar = new c(dVar);
                    if (v.compareAndSet(this, oo5.f(), cVar)) {
                        Object c2 = cVar.c(this);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
            } else if (obj instanceof sm5) {
                if (dVar != null) {
                    ml5<?> a2 = dVar.a();
                    if ((a2 instanceof a) && ((a) a2).b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (a2.b((sm5) obj)) {
                        return ll5.b;
                    }
                }
                ((sm5) obj).c(this);
            } else if (dVar != null && obj == dVar.c) {
                return ib5.d;
            } else {
                return null;
            }
        }
    }

    @Override // com.p7700g.p99005.io5
    public <P, Q> void k(@NotNull mo5<? super P, ? extends Q> mo5Var, @NotNull j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
        io5.a.a(this, mo5Var, j05Var);
    }

    @Override // com.p7700g.p99005.lw4
    @Nullable
    public lw4 o() {
        uv4<R> uv4Var = this.x;
        if (uv4Var instanceof lw4) {
            return (lw4) uv4Var;
        }
        return null;
    }

    @Override // com.p7700g.p99005.no5
    public boolean p() {
        Object j = j(null);
        if (j == ib5.d) {
            return true;
        }
        if (j == null) {
            return false;
        }
        throw new IllegalStateException(c25.C("Unexpected trySelectIdempotent result ", j).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.io5
    public <P, Q> void s(@NotNull mo5<? super P, ? extends Q> mo5Var, P p, @NotNull j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
        mo5Var.G(this, p, j05Var);
    }

    @Override // com.p7700g.p99005.hm5
    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("SelectInstance(state=");
        G.append(this._state);
        G.append(", result=");
        G.append(this._result);
        G.append(')');
        return G.toString();
    }

    @Override // com.p7700g.p99005.uv4
    public void u(@NotNull Object obj) {
        while (true) {
            Object obj2 = this._result;
            if (obj2 == oo5.c()) {
                if (w.compareAndSet(this, oo5.c(), ac5.d(obj, null, 1, null))) {
                    return;
                }
            } else if (obj2 != gw4.h()) {
                throw new IllegalStateException("Already resumed");
            } else {
                if (w.compareAndSet(this, gw4.h(), oo5.a())) {
                    if (qp4.i(obj)) {
                        uv4<R> uv4Var = this.x;
                        Throwable e2 = qp4.e(obj);
                        c25.m(e2);
                        qp4.a aVar = qp4.s;
                        uv4Var.u(qp4.b(rp4.a(e2)));
                        return;
                    }
                    this.x.u(obj);
                    return;
                }
            }
        }
    }

    @Override // com.p7700g.p99005.no5
    public boolean v() {
        while (true) {
            Object obj = this._state;
            if (obj == oo5.f()) {
                return false;
            }
            if (!(obj instanceof sm5)) {
                return true;
            }
            ((sm5) obj).c(this);
        }
    }

    @Override // com.p7700g.p99005.no5
    @NotNull
    public uv4<R> y() {
        return this;
    }

    @Override // com.p7700g.p99005.io5
    public void z(long j, @NotNull f05<? super uv4<? super R>, ? extends Object> f05Var) {
        if (j <= 0) {
            if (p()) {
                pn5.c(f05Var, y());
                return;
            }
            return;
        }
        K(wc5.d(getContext()).q(j, new e(f05Var), getContext()));
    }
}