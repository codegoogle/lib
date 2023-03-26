package com.p7700g.p99005;

import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y93 extends v83 {
    @NotNull
    private final yb3 m;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.S2S_INTERSTITIAL.ordinal()] = 1;
            iArr[lc3.S2S_BANNER.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y93(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.m = yb3Var;
    }

    private final void A() {
        Ad p;
        Partner w;
        Ad p2;
        NativeMediatedAsset v;
        if (y() != null || (p = p()) == null || (w = p.w()) == null || (p2 = p()) == null || (v = p2.v()) == null) {
            return;
        }
        u(new n13<>(null, v, w));
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.m;
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13
    public void x() {
        Ad p;
        A();
        n13<?> y = y();
        yq4 yq4Var = null;
        if (y != null && (p = p()) != null) {
            int i = a.a[lc3.s.b(p.w()).ordinal()];
            if (i == 1) {
                new x93(this, y, p).f();
            } else if (i == 2) {
                new z93(this, y, p).f();
            }
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            a().a();
        }
    }
}