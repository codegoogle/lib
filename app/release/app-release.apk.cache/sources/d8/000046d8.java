package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractSharedFlow.kt */
@vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "(I)V", "value", "getValue", "()Ljava/lang/Integer;", "increment", "", "delta", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class hl5 extends qj5<Integer> implements ak5<Integer> {
    public hl5(int i) {
        super(1, Integer.MAX_VALUE, ng5.DROP_OLDEST);
        A(Integer.valueOf(i));
    }

    @Override // com.p7700g.p99005.ak5
    @NotNull
    /* renamed from: g0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(S().intValue());
        }
        return valueOf;
    }

    public final boolean h0(int i) {
        boolean A;
        synchronized (this) {
            A = A(Integer.valueOf(S().intValue() + i));
        }
        return A;
    }
}