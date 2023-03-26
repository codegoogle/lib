package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Yield.kt */
@vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class vf5 {
    @Nullable
    public static final Object a(@NotNull uv4<? super yq4> uv4Var) {
        Object h;
        xv4 context = uv4Var.getContext();
        ie5.z(context);
        uv4 d = fw4.d(uv4Var);
        ul5 ul5Var = d instanceof ul5 ? (ul5) d : null;
        if (ul5Var == null) {
            h = yq4.a;
        } else {
            if (ul5Var.w.w(context)) {
                ul5Var.l(context, yq4.a);
            } else {
                uf5 uf5Var = new uf5();
                xv4 plus = context.plus(uf5Var);
                yq4 yq4Var = yq4.a;
                ul5Var.l(plus, yq4Var);
                if (uf5Var.t) {
                    h = vl5.h(ul5Var) ? gw4.h() : yq4Var;
                }
            }
            h = gw4.h();
        }
        if (h == gw4.h()) {
            ow4.c(uv4Var);
        }
        return h == gw4.h() ? h : yq4.a;
    }
}