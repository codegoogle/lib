package com.p7700g.p99005;

import android.content.Context;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.lc3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class v83 extends q13 {
    @NotNull
    private final yb3 l;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.S2S.ordinal()] = 1;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v83(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.l = yb3Var;
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

    private final void B() {
        String y;
        j73 j73Var = j73.a;
        Context context = a().getContext();
        Ad p = p();
        String str = "";
        if (p != null && (y = p.y()) != null) {
            str = y;
        }
        j73Var.a(context, str);
    }

    @Override // com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.l;
    }

    @Override // com.p7700g.p99005.q13
    public void w(boolean z) {
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
            B();
        }
    }

    @Override // com.p7700g.p99005.q13
    public void x() {
        A();
        n13<?> y = y();
        yq4 yq4Var = null;
        if (y != null) {
            Ad p = p();
            ba3 ba3Var = p == null ? null : new ba3(this, y, p);
            if (ba3Var != null) {
                ba3Var.f();
                yq4Var = yq4.a;
            }
        }
        if (yq4Var == null) {
            a().a();
        }
    }
}