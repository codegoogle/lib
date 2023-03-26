package com.p7700g.p99005;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.AdView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f93 extends l13 {
    @NotNull
    private final q13 d;
    @NotNull
    private Ad e;
    @NotNull
    private final AdView f;
    @NotNull
    private final Activity g;
    @Nullable
    private final hc3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad, @NotNull AdView adView) {
        super(q13Var, n13Var);
        AppConfig r;
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(ad, "mAd");
        c25.p(adView, "bannerAdView");
        this.d = q13Var;
        this.e = ad;
        this.f = adView;
        this.g = g().a().f();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        hc3 hc3Var = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            hc3Var = r.p();
        }
        this.h = hc3Var;
    }

    public static final void i(f93 f93Var, View view) {
        c25.p(f93Var, "this$0");
        f93Var.d.a().a();
    }

    public static /* synthetic */ void j(f93 f93Var, View view) {
        i(f93Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        this.g.setContentView(b03.k.G);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        my2.a(this.f, (FrameLayout) this.g.findViewById(b03.h.D0), layoutParams);
        ((CloseImageView) this.g.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.d63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f93.j(f93.this, view);
            }
        });
    }
}