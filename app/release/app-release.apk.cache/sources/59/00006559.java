package com.p7700g.p99005;

import android.view.View;
import android.widget.FrameLayout;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.p03;
import com.p7700g.p99005.q03;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xc3 extends y03 {

    /* loaded from: classes3.dex */
    public static final class a implements q03.a {
        public a() {
            xc3.this = r1;
        }

        @Override // com.p7700g.p99005.q03.a
        public void a() {
            Ad.p(xc3.this.j(), true, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc3(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var, ad);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "ggAdView");
        c25.p(ad, "ad");
    }

    public static final void u(xc3 xc3Var, View view) {
        c25.p(xc3Var, "this$0");
        xc3Var.g().w(true);
    }

    public static /* synthetic */ void v(xc3 xc3Var, View view) {
        u(xc3Var, view);
    }

    @Override // com.p7700g.p99005.y03
    @Nullable
    public View q() {
        o03 a2 = q03.s.a(j(), new a());
        if (a2 == null) {
            xz2.c("S2SInterstitialActivity", "Could not find the webiew, finishing");
            n().finish();
            return null;
        }
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.d73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xc3.v(xc3.this, view);
            }
        });
        p03.a aVar = p03.a;
        Partner w = j().w();
        p03 b = aVar.b(w == null ? null : w.d());
        if (c25.g(b, aVar.g())) {
            xz2.c("S2SInterstitialActivity", "Invalid banner size");
            n().finish();
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(n());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(), (int) b.b());
        layoutParams.gravity = 17;
        my2.a(a2, frameLayout, layoutParams);
        return frameLayout;
    }
}