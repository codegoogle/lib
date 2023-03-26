package com.p7700g.p99005;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@vo4(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0017\u0018\u00002\u00020C:\u0005JKLMNB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\f\b\u0000\u0010\u001c*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00060\u0000j\u0002`\u00032\n\u0010#\u001a\u00060\u0000j\u0002`\u0003H\u0082\u0010¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0002J\u000f\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0002J,\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0081\b¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\u0086\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0001¢\u0006\u0004\b3\u0010-J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010:\u001a\u00020)H\u0001¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020\u00052\n\u0010>\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010/R\u0011\u0010\u0013\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0015\u0010G\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0015\u0010I\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010-¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "helpRemove", "helpRemovePrev", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", la1.b, "()Z", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removeOrNext", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public class hm5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(hm5.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(hm5.class, Object.class, "_prev");
    private static final /* synthetic */ AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(hm5.class, Object.class, "_removedRef");
    @NotNull
    public volatile /* synthetic */ Object _next = this;
    @NotNull
    public volatile /* synthetic */ Object _prev = this;
    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0014J \u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H$J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\u0018\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\f\u001a\u00020\u001cH\u0014J \u0010\u001d\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H&R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "()V", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", com.anythink.expressad.foundation.d.c.bV, "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "", "affected", "finishOnSuccess", "next", "finishPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "onPrepare", "onRemoved", "prepare", qk3.a, "", "takeAffectedNode", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class a extends kl5 {
        @Override // com.p7700g.p99005.kl5
        public final void a(@NotNull ml5<?> ml5Var, @Nullable Object obj) {
            hm5 i;
            boolean z = obj == null;
            hm5 h = h();
            if (h == null || (i = i()) == null) {
                return;
            }
            if (hm5.s.compareAndSet(h, ml5Var, z ? n(h, i) : i) && z) {
                f(h, i);
            }
        }

        @Override // com.p7700g.p99005.kl5
        @Nullable
        public final Object c(@NotNull ml5<?> ml5Var) {
            while (true) {
                hm5 m = m(ml5Var);
                if (m == null) {
                    return ll5.b;
                }
                Object obj = m._next;
                if (obj == ml5Var || ml5Var.h()) {
                    return null;
                }
                if (obj instanceof sm5) {
                    sm5 sm5Var = (sm5) obj;
                    if (ml5Var.b(sm5Var)) {
                        return ll5.b;
                    }
                    sm5Var.c(m);
                } else {
                    Object e = e(m);
                    if (e != null) {
                        return e;
                    }
                    if (l(m, obj)) {
                        continue;
                    } else {
                        d dVar = new d(m, (hm5) obj, this);
                        if (hm5.s.compareAndSet(m, obj, dVar)) {
                            try {
                                if (dVar.c(m) != im5.a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                hm5.s.compareAndSet(m, dVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @Nullable
        public Object e(@NotNull hm5 hm5Var) {
            return null;
        }

        public abstract void f(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2);

        public abstract void g(@NotNull d dVar);

        @Nullable
        public abstract hm5 h();

        @Nullable
        public abstract hm5 i();

        @Nullable
        public Object j(@NotNull d dVar) {
            g(dVar);
            return null;
        }

        public void k(@NotNull hm5 hm5Var) {
        }

        public boolean l(@NotNull hm5 hm5Var, @NotNull Object obj) {
            return false;
        }

        @Nullable
        public hm5 m(@NotNull sm5 sm5Var) {
            hm5 h = h();
            c25.m(h);
            return h;
        }

        @NotNull
        public abstract Object n(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2);
    }

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020!B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\t\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00102\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0004\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "T", "queue", "node", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "next", "", "finishOnSuccess", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", "", qk3.a, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getOriginalNext", "originalNext", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class b<T extends hm5> extends a {
        private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @cz4
        @NotNull
        public final hm5 c;
        @cz4
        @NotNull
        public final T d;

        public b(@NotNull hm5 hm5Var, @NotNull T t) {
            this.c = hm5Var;
            this.d = t;
        }

        @Override // com.p7700g.p99005.hm5.a
        public void f(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2) {
            this.d.l0(this.c);
        }

        @Override // com.p7700g.p99005.hm5.a
        public void g(@NotNull d dVar) {
            b.compareAndSet(this, null, dVar.a);
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public final hm5 h() {
            return (hm5) this._affectedNode;
        }

        @Override // com.p7700g.p99005.hm5.a
        @NotNull
        public final hm5 i() {
            return this.c;
        }

        @Override // com.p7700g.p99005.hm5.a
        public boolean l(@NotNull hm5 hm5Var, @NotNull Object obj) {
            return obj != this.c;
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public final hm5 m(@NotNull sm5 sm5Var) {
            return this.c.h0(sm5Var);
        }

        @Override // com.p7700g.p99005.hm5.a
        @NotNull
        public Object n(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2) {
            T t = this.d;
            hm5.t.compareAndSet(t, t, hm5Var);
            T t2 = this.d;
            hm5.s.compareAndSet(t2, t2, this.c);
            return this.d;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @np4
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", com.anythink.expressad.foundation.d.c.bV, "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class c extends ml5<hm5> {
        @cz4
        @NotNull
        public final hm5 b;
        @cz4
        @Nullable
        public hm5 c;

        public c(@NotNull hm5 hm5Var) {
            this.b = hm5Var;
        }

        @Override // com.p7700g.p99005.ml5
        /* renamed from: j */
        public void d(@NotNull hm5 hm5Var, @Nullable Object obj) {
            boolean z = obj == null;
            hm5 hm5Var2 = z ? this.b : this.c;
            if (hm5Var2 != null && hm5.s.compareAndSet(hm5Var, this, hm5Var2) && z) {
                hm5 hm5Var3 = this.b;
                hm5 hm5Var4 = this.c;
                c25.m(hm5Var4);
                hm5Var3.l0(hm5Var4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "next", "desc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "finishPrepare", "", "perform", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends sm5 {
        @cz4
        @NotNull
        public final hm5 a;
        @cz4
        @NotNull
        public final hm5 b;
        @cz4
        @NotNull
        public final a c;

        public d(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2, @NotNull a aVar) {
            this.a = hm5Var;
            this.b = hm5Var2;
            this.c = aVar;
        }

        @Override // com.p7700g.p99005.sm5
        @NotNull
        public ml5<?> a() {
            return this.c.b();
        }

        @Override // com.p7700g.p99005.sm5
        @Nullable
        public Object c(@Nullable Object obj) {
            Object f;
            Object obj2;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            hm5 hm5Var = (hm5) obj;
            Object j = this.c.j(this);
            Object obj3 = im5.a;
            if (j == obj3) {
                hm5 hm5Var2 = this.b;
                if (hm5.s.compareAndSet(hm5Var, this, hm5Var2.A0())) {
                    this.c.k(hm5Var);
                    hm5Var2.h0(null);
                }
                return obj3;
            }
            if (j != null) {
                f = a().e(j);
            } else {
                f = a().f();
            }
            if (f == ll5.a) {
                obj2 = a();
            } else if (f == null) {
                obj2 = this.c.n(hm5Var, this.b);
            } else {
                obj2 = this.b;
            }
            hm5.s.compareAndSet(hm5Var, this, obj2);
            return null;
        }

        public final void d() {
            this.c.g(this);
        }

        @Override // com.p7700g.p99005.sm5
        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("PrepareOp(op=");
            G.append(a());
            G.append(')');
            return G.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020(B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0017\u0010&\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "queue", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "next", "", "finishOnSuccess", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "prepareOp", "finishPrepare", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "", qk3.a, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "updatedNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class e<T> extends a {
        private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");
        private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;
        @cz4
        @NotNull
        public final hm5 d;

        public e(@NotNull hm5 hm5Var) {
            this.d = hm5Var;
        }

        public static /* synthetic */ void p() {
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public Object e(@NotNull hm5 hm5Var) {
            if (hm5Var == this.d) {
                return gm5.d();
            }
            return null;
        }

        @Override // com.p7700g.p99005.hm5.a
        public final void f(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2) {
            hm5Var2.h0(null);
        }

        @Override // com.p7700g.p99005.hm5.a
        public void g(@NotNull d dVar) {
            b.compareAndSet(this, null, dVar.a);
            c.compareAndSet(this, null, dVar.b);
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public final hm5 h() {
            return (hm5) this._affectedNode;
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public final hm5 i() {
            return (hm5) this._originalNext;
        }

        @Override // com.p7700g.p99005.hm5.a
        public final boolean l(@NotNull hm5 hm5Var, @NotNull Object obj) {
            if (obj instanceof um5) {
                ((um5) obj).a.q0();
                return true;
            }
            return false;
        }

        @Override // com.p7700g.p99005.hm5.a
        @Nullable
        public final hm5 m(@NotNull sm5 sm5Var) {
            hm5 hm5Var = this.d;
            while (true) {
                Object obj = hm5Var._next;
                if (obj instanceof sm5) {
                    sm5 sm5Var2 = (sm5) obj;
                    if (sm5Var.b(sm5Var2)) {
                        return null;
                    }
                    sm5Var2.c(this.d);
                } else {
                    return (hm5) obj;
                }
            }
        }

        @Override // com.p7700g.p99005.hm5.a
        @NotNull
        public final Object n(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2) {
            return hm5Var2.A0();
        }

        public final T o() {
            T t = (T) h();
            c25.m(t);
            return t;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class f extends c {
        public final /* synthetic */ uz4<Boolean> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(uz4<Boolean> uz4Var) {
            super(hm5.this);
            this.e = uz4Var;
        }

        @Override // com.p7700g.p99005.ml5
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull hm5 hm5Var) {
            if (this.e.x().booleanValue()) {
                return null;
            }
            return gm5.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final um5 A0() {
        um5 um5Var = (um5) this._removedRef;
        if (um5Var == null) {
            um5 um5Var2 = new um5(this);
            u.lazySet(this, um5Var2);
            return um5Var2;
        }
        return um5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (com.p7700g.p99005.hm5.s.compareAndSet(r3, r2, ((com.p7700g.p99005.um5) r4).a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hm5 h0(sm5 sm5Var) {
        while (true) {
            hm5 hm5Var = (hm5) this._prev;
            hm5 hm5Var2 = hm5Var;
            while (true) {
                hm5 hm5Var3 = null;
                while (true) {
                    Object obj = hm5Var2._next;
                    if (obj == this) {
                        if (hm5Var == hm5Var2 || t.compareAndSet(this, hm5Var, hm5Var2)) {
                            return hm5Var2;
                        }
                    } else if (r0()) {
                        return null;
                    } else {
                        if (obj == sm5Var) {
                            return hm5Var2;
                        }
                        if (obj instanceof sm5) {
                            if (sm5Var != null && sm5Var.b((sm5) obj)) {
                                return null;
                            }
                            ((sm5) obj).c(hm5Var2);
                        } else if (!(obj instanceof um5)) {
                            hm5Var3 = hm5Var2;
                            hm5Var2 = (hm5) obj;
                        } else if (hm5Var3 != null) {
                            break;
                        } else {
                            hm5Var2 = (hm5) hm5Var2._prev;
                        }
                    }
                }
                hm5Var2 = hm5Var3;
            }
        }
    }

    private final hm5 k0(hm5 hm5Var) {
        while (hm5Var.r0()) {
            hm5Var = (hm5) hm5Var._prev;
        }
        return hm5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(hm5 hm5Var) {
        hm5 hm5Var2;
        do {
            hm5Var2 = (hm5) hm5Var._prev;
            if (m0() != hm5Var) {
                return;
            }
        } while (!t.compareAndSet(hm5Var, hm5Var2, this));
        if (r0()) {
            hm5Var.h0(null);
        }
    }

    @np4
    public final int B0(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2, @NotNull c cVar) {
        t.lazySet(hm5Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        atomicReferenceFieldUpdater.lazySet(hm5Var, hm5Var2);
        cVar.c = hm5Var2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, hm5Var2, cVar)) {
            return cVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void C0(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2) {
    }

    public final void b0(@NotNull hm5 hm5Var) {
        do {
        } while (!o0().f0(hm5Var, this));
    }

    public final boolean c0(@NotNull hm5 hm5Var, @NotNull uz4<Boolean> uz4Var) {
        int B0;
        f fVar = new f(uz4Var);
        do {
            B0 = o0().B0(hm5Var, this, fVar);
            if (B0 == 1) {
                return true;
            }
        } while (B0 != 2);
        return false;
    }

    public final boolean d0(@NotNull hm5 hm5Var, @NotNull f05<? super hm5, Boolean> f05Var) {
        hm5 o0;
        do {
            o0 = o0();
            if (!f05Var.M(o0).booleanValue()) {
                return false;
            }
        } while (!o0.f0(hm5Var, this));
        return true;
    }

    public final boolean e0(@NotNull hm5 hm5Var, @NotNull f05<? super hm5, Boolean> f05Var, @NotNull uz4<Boolean> uz4Var) {
        int B0;
        f fVar = new f(uz4Var);
        do {
            hm5 o0 = o0();
            if (!f05Var.M(o0).booleanValue()) {
                return false;
            }
            B0 = o0.B0(hm5Var, this, fVar);
            if (B0 == 1) {
                return true;
            }
        } while (B0 != 2);
        return false;
    }

    @np4
    public final boolean f0(@NotNull hm5 hm5Var, @NotNull hm5 hm5Var2) {
        t.lazySet(hm5Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        atomicReferenceFieldUpdater.lazySet(hm5Var, hm5Var2);
        if (atomicReferenceFieldUpdater.compareAndSet(this, hm5Var2, hm5Var)) {
            hm5Var.l0(hm5Var2);
            return true;
        }
        return false;
    }

    public final boolean g0(@NotNull hm5 hm5Var) {
        t.lazySet(hm5Var, this);
        s.lazySet(hm5Var, this);
        while (m0() == this) {
            if (s.compareAndSet(this, this, hm5Var)) {
                hm5Var.l0(this);
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final <T extends hm5> b<T> i0(@NotNull T t2) {
        return new b<>(this, t2);
    }

    @NotNull
    public final e<hm5> j0() {
        return new e<>(this);
    }

    @NotNull
    public final Object m0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof sm5)) {
                return obj;
            }
            ((sm5) obj).c(this);
        }
    }

    @NotNull
    public final hm5 n0() {
        return gm5.h(m0());
    }

    @NotNull
    public final hm5 o0() {
        hm5 h0 = h0(null);
        return h0 == null ? k0((hm5) this._prev) : h0;
    }

    public final void p0() {
        ((um5) m0()).a.q0();
    }

    @np4
    public final void q0() {
        hm5 hm5Var = this;
        while (true) {
            Object m0 = hm5Var.m0();
            if (!(m0 instanceof um5)) {
                hm5Var.h0(null);
                return;
            }
            hm5Var = ((um5) m0).a;
        }
    }

    public boolean r0() {
        return m0() instanceof um5;
    }

    @np4
    @NotNull
    public final c s0(@NotNull hm5 hm5Var, @NotNull uz4<Boolean> uz4Var) {
        return new f(uz4Var);
    }

    @Nullable
    public hm5 t0() {
        Object m0 = m0();
        um5 um5Var = m0 instanceof um5 ? (um5) m0 : null;
        if (um5Var == null) {
            return null;
        }
        return um5Var.a;
    }

    @NotNull
    public String toString() {
        return new v25(this) { // from class: com.p7700g.p99005.hm5.g
            @Override // com.p7700g.p99005.v25, com.p7700g.p99005.g65
            @Nullable
            public Object get() {
                return qc5.a(this.u);
            }
        } + '@' + qc5.b(this);
    }

    public boolean u0() {
        return z0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, com.p7700g.p99005.hm5] */
    public final /* synthetic */ <T> T v0(f05<? super T, Boolean> f05Var) {
        hm5 z0;
        while (true) {
            hm5 hm5Var = (hm5) m0();
            if (hm5Var == this) {
                return null;
            }
            c25.y(3, "T");
            if (!(hm5Var instanceof Object)) {
                return null;
            }
            if ((f05Var.M(hm5Var).booleanValue() && !hm5Var.r0()) || (z0 = hm5Var.z0()) == null) {
                return hm5Var;
            }
            z0.q0();
        }
    }

    @Nullable
    public final hm5 y0() {
        while (true) {
            hm5 hm5Var = (hm5) m0();
            if (hm5Var == this) {
                return null;
            }
            if (hm5Var.u0()) {
                return hm5Var;
            }
            hm5Var.p0();
        }
    }

    @np4
    @Nullable
    public final hm5 z0() {
        Object m0;
        hm5 hm5Var;
        do {
            m0 = m0();
            if (m0 instanceof um5) {
                return ((um5) m0).a;
            }
            if (m0 == this) {
                return (hm5) m0;
            }
            hm5Var = (hm5) m0;
        } while (!s.compareAndSet(this, m0, hm5Var.A0()));
        hm5Var.h0(null);
        return null;
    }
}