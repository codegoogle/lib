package com.p7700g.p99005;

import android.content.Context;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.greedygame.core.network.model.responses.UiiConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w93 extends q13 {
    @NotNull
    public static final a l = new a(null);
    @NotNull
    private final yb3 m;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            UiiConfiguration.c.values();
            int[] iArr = new int[3];
            iArr[UiiConfiguration.c.FLAT.ordinal()] = 1;
            iArr[UiiConfiguration.c.WRAP.ordinal()] = 2;
            iArr[UiiConfiguration.c.WRAP_GRADIENT.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w93(@NotNull yb3 yb3Var) {
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
        return this.m;
    }

    @Override // com.p7700g.p99005.q13
    public void w(boolean z) {
        super.w(z);
        B();
    }

    @Override // com.p7700g.p99005.q13
    public void x() {
        l13 ea3Var;
        UiiConfiguration F;
        A();
        n13<?> y = y();
        yq4 yq4Var = null;
        r1 = null;
        UiiConfiguration.c cVar = null;
        if (y != null) {
            if (yz2.a.e(a().f())) {
                ea3Var = new ga3(this, y);
            } else {
                Ad p = p();
                if (p != null && (F = p.F()) != null) {
                    cVar = F.d();
                }
                int i = cVar == null ? -1 : b.a[cVar.ordinal()];
                if (i == -1 || i == 1) {
                    ea3Var = new ea3(this, y);
                } else if (i == 2) {
                    ea3Var = new ga3(this, y);
                } else if (i != 3) {
                    throw new wo4();
                } else {
                    ea3Var = new fa3(this, y);
                }
            }
            ea3Var.f();
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            a().a();
        }
    }
}