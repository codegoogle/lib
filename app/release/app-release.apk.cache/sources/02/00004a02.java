package com.p7700g.p99005;

import android.content.Context;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.lc3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ja3 extends v83 {
    @NotNull
    private final yb3 m;
    @Nullable
    private ha3 n;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.S2S_VIDEO.ordinal()] = 1;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja3(@NotNull yb3 yb3Var) {
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

    @Override // com.p7700g.p99005.s23
    public void k() {
        ha3 ha3Var = this.n;
        if (ha3Var == null) {
            return;
        }
        ha3Var.z();
    }

    @Override // com.p7700g.p99005.s23
    public void l() {
        ha3 ha3Var = this.n;
        if (ha3Var == null) {
            return;
        }
        ha3Var.y();
    }

    @Override // com.p7700g.p99005.s23
    public void m() {
        super.m();
        ha3 ha3Var = this.n;
        if (ha3Var == null) {
            return;
        }
        ha3Var.A();
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13
    public void w(boolean z) {
        NativeMediatedAsset v;
        String o;
        lc3.a aVar = lc3.s;
        Ad p = p();
        if (a.a[aVar.b(p == null ? null : p.w()).ordinal()] == 1) {
            Ad p2 = p();
            if (p2 != null) {
                Ad.p(p2, true, null, 2, null);
            }
            Ad p3 = p();
            if (p3 != null) {
                p3.q();
            }
            j73 j73Var = j73.a;
            Context context = a().getContext();
            Ad p4 = p();
            String str = "";
            if (p4 != null && (v = p4.v()) != null && (o = v.o()) != null) {
                str = o;
            }
            j73Var.a(context, str);
        }
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13
    public void x() {
        Ad p;
        A();
        n13<?> y = y();
        yq4 yq4Var = null;
        if (y != null && (p = p()) != null) {
            ha3 ha3Var = new ha3(this, y, p);
            ha3Var.f();
            yq4 yq4Var2 = yq4.a;
            this.n = ha3Var;
            yq4Var = yq4Var2;
        }
        if (yq4Var == null) {
            a().a();
        }
    }
}