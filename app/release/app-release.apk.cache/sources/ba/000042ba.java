package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\b\"\u000e\b\u0000\u0010\t\u0018\u0001*\u00060\u0001j\u0002`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\b0\fH\u0086\bJ\u0010\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "()V", "isEmpty", "", "()Z", "isRemoved", "forEach", "", "T", "Lkotlinx/coroutines/internal/Node;", "block", "Lkotlin/Function1;", "nextIfRemoved", la1.b, "", "validate", "validate$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class fm5 extends hm5 {
    public final /* synthetic */ <T extends hm5> void D0(f05<? super T, yq4> f05Var) {
        for (hm5 hm5Var = (hm5) m0(); !c25.g(hm5Var, this); hm5Var = hm5Var.n0()) {
            c25.y(3, "T");
            if (hm5Var instanceof hm5) {
                f05Var.M(hm5Var);
            }
        }
    }

    public final boolean E0() {
        return m0() == this;
    }

    @NotNull
    public final Void F0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void G0() {
        hm5 hm5Var = (hm5) m0();
        hm5 hm5Var2 = this;
        while (!c25.g(hm5Var, this)) {
            hm5 n0 = hm5Var.n0();
            hm5Var.C0(hm5Var2, n0);
            hm5Var2 = hm5Var;
            hm5Var = n0;
        }
        C0(hm5Var2, (hm5) m0());
    }

    @Override // com.p7700g.p99005.hm5
    public boolean r0() {
        return false;
    }

    @Override // com.p7700g.p99005.hm5
    @Nullable
    public hm5 t0() {
        return null;
    }

    @Override // com.p7700g.p99005.hm5
    public /* bridge */ /* synthetic */ boolean u0() {
        return ((Boolean) F0()).booleanValue();
    }
}