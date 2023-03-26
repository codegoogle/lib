package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.kk5;
import com.p7700g.p99005.qp4;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractSharedFlow.kt */
@vo4(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001c\u001a\u00020\tH$¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0!H\u0084\bJ\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010$R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "S", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", "", "nCollectors", "getNCollectors", "()I", "nextIndex", "", "slots", "getSlots$annotations", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", "", "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ik5<S extends kk5<?>> {
    @Nullable
    private S[] s;
    private int t;
    private int u;
    @Nullable
    private hl5 v;

    public static final /* synthetic */ int e(ik5 ik5Var) {
        return ik5Var.t;
    }

    public static final /* synthetic */ kk5[] f(ik5 ik5Var) {
        return ik5Var.s;
    }

    public static /* synthetic */ void n() {
    }

    @NotNull
    public final ak5<Integer> E() {
        hl5 hl5Var;
        synchronized (this) {
            hl5Var = this.v;
            if (hl5Var == null) {
                hl5Var = new hl5(l());
                this.v = hl5Var;
            }
        }
        return hl5Var;
    }

    @NotNull
    public final S g() {
        S s;
        hl5 hl5Var;
        synchronized (this) {
            S[] m = m();
            if (m == null) {
                m = i(2);
                this.s = m;
            } else if (l() >= m.length) {
                Object[] copyOf = Arrays.copyOf(m, m.length * 2);
                c25.o(copyOf, "copyOf(this, newSize)");
                this.s = (S[]) ((kk5[]) copyOf);
                m = (S[]) ((kk5[]) copyOf);
            }
            int i = this.u;
            do {
                s = m[i];
                if (s == null) {
                    s = h();
                    m[i] = s;
                }
                i++;
                if (i >= m.length) {
                    i = 0;
                }
            } while (!s.a(this));
            this.u = i;
            this.t = l() + 1;
            hl5Var = this.v;
        }
        if (hl5Var != null) {
            hl5Var.h0(1);
        }
        return s;
    }

    @NotNull
    public abstract S h();

    @NotNull
    public abstract S[] i(int i);

    public final void j(@NotNull f05<? super S, yq4> f05Var) {
        kk5[] kk5VarArr;
        if (this.t == 0 || (kk5VarArr = this.s) == null) {
            return;
        }
        int i = 0;
        int length = kk5VarArr.length;
        while (i < length) {
            kk5 kk5Var = kk5VarArr[i];
            i++;
            if (kk5Var != null) {
                f05Var.M(kk5Var);
            }
        }
    }

    public final void k(@NotNull S s) {
        hl5 hl5Var;
        int i;
        uv4<yq4>[] b;
        synchronized (this) {
            this.t = l() - 1;
            hl5Var = this.v;
            i = 0;
            if (l() == 0) {
                this.u = 0;
            }
            b = s.b(this);
        }
        int length = b.length;
        while (i < length) {
            uv4<yq4> uv4Var = b[i];
            i++;
            if (uv4Var != null) {
                qp4.a aVar = qp4.s;
                uv4Var.u(qp4.b(yq4.a));
            }
        }
        if (hl5Var == null) {
            return;
        }
        hl5Var.h0(-1);
    }

    public final int l() {
        return this.t;
    }

    @Nullable
    public final S[] m() {
        return this.s;
    }
}