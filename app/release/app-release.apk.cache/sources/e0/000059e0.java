package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import org.jetbrains.annotations.NotNull;

/* compiled from: JobSupport.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", CallMraidJS.b, "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class re5 extends fm5 implements xd5 {
    @NotNull
    public final String H0(@NotNull String str) {
        StringBuilder M = wo1.M("List{", str, "}[");
        boolean z = true;
        for (hm5 hm5Var = (hm5) m0(); !c25.g(hm5Var, this); hm5Var = hm5Var.n0()) {
            if (hm5Var instanceof le5) {
                le5 le5Var = (le5) hm5Var;
                if (z) {
                    z = false;
                } else {
                    M.append(", ");
                }
                M.append(le5Var);
            }
        }
        M.append("]");
        String sb = M.toString();
        c25.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @Override // com.p7700g.p99005.xd5
    public boolean h() {
        return true;
    }

    @Override // com.p7700g.p99005.xd5
    @NotNull
    public re5 r() {
        return this;
    }

    @Override // com.p7700g.p99005.hm5
    @NotNull
    public String toString() {
        return super.toString();
    }
}