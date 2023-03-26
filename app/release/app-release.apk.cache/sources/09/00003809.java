package com.p7700g.p99005;

import android.content.Context;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.lc3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a13 extends q13 {
    @NotNull
    private final yb3 l;
    @NotNull
    private final String m;
    @Nullable
    private y03 n;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            lc3.values();
            int[] iArr = new int[17];
            iArr[lc3.ADMOB.ordinal()] = 1;
            iArr[lc3.ADMOB_BANNER.ordinal()] = 2;
            iArr[lc3.FACEBOOK.ordinal()] = 3;
            iArr[lc3.FACEBOOK_BANNER.ordinal()] = 4;
            iArr[lc3.S2S.ordinal()] = 5;
            iArr[lc3.S2S_BANNER.ordinal()] = 6;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a13(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.l = yb3Var;
        this.m = "GGAppOpenAds";
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
        a03 a03Var = a03.a;
        Context context = a().getContext();
        Ad p = p();
        String str = "";
        if (p != null && (y = p.y()) != null) {
            str = y;
        }
        a03Var.d(context, str);
    }

    @Override // com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.l;
    }

    @Override // com.p7700g.p99005.s23
    public void i() {
        y03 y03Var = this.n;
        if (y03Var == null) {
            return;
        }
        y03Var.r();
    }

    @Override // com.p7700g.p99005.q13
    public void w(boolean z) {
        lc3.a aVar = lc3.s;
        Ad p = p();
        if (a.a[aVar.b(p == null ? null : p.w()).ordinal()] == 5) {
            Ad p2 = p();
            boolean z2 = false;
            if (p2 != null && !p2.H()) {
                z2 = true;
            }
            if (z2) {
                xz2.c(this.m, "Ad is not clickable. Not sending signals or redirecting");
                return;
            }
            Ad p3 = p();
            if (p3 != null) {
                Ad.p(p3, true, null, 2, null);
            }
            Ad p4 = p();
            if (p4 != null) {
                p4.q();
            }
            B();
        }
    }

    @Override // com.p7700g.p99005.q13
    public void x() {
        A();
        if (y() != null && p() != null) {
            lc3.a aVar = lc3.s;
            Ad p = p();
            y03 y03Var = null;
            switch (a.a[aVar.b(p == null ? null : p.w()).ordinal()]) {
                case 1:
                    n13<?> y = y();
                    c25.m(y);
                    Ad p2 = p();
                    c25.m(p2);
                    y03Var = new uc3(this, y, p2);
                    break;
                case 2:
                    n13<?> y2 = y();
                    c25.m(y2);
                    Ad p3 = p();
                    c25.m(p3);
                    y03Var = new tc3(this, y2, p3);
                    break;
                case 3:
                    n13<?> y3 = y();
                    c25.m(y3);
                    Ad p4 = p();
                    c25.m(p4);
                    y03Var = new wc3(this, y3, p4);
                    break;
                case 4:
                    n13<?> y4 = y();
                    c25.m(y4);
                    Ad p5 = p();
                    c25.m(p5);
                    y03Var = new vc3(this, y4, p5);
                    break;
                case 5:
                    n13<?> y5 = y();
                    c25.m(y5);
                    Ad p6 = p();
                    c25.m(p6);
                    y03Var = new yc3(this, y5, p6);
                    break;
                case 6:
                    n13<?> y6 = y();
                    c25.m(y6);
                    Ad p7 = p();
                    c25.m(p7);
                    y03Var = new xc3(this, y6, p7);
                    break;
                default:
                    xz2.c(this.m, "Partner is not supported for app open ads in UII.Finishing");
                    a().f().finish();
                    break;
            }
            this.n = y03Var;
            if (y03Var == null) {
                return;
            }
            y03Var.f();
            return;
        }
        String str = this.m;
        StringBuilder G = wo1.G("GGAdView<*> ");
        G.append(y());
        G.append(" or mAd ");
        G.append(p());
        G.append(" is null. Finishing");
        xz2.c(str, G.toString());
        a().f().finish();
    }
}