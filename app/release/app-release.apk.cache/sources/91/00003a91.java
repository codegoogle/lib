package com.p7700g.p99005;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b93 extends l13 {
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
    public b93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad, @NotNull AdView adView) {
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

    public static final void i(b93 b93Var, View view) {
        c25.p(b93Var, "this$0");
        b93Var.d.a().a();
    }

    public static /* synthetic */ void j(b93 b93Var, View view) {
        i(b93Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        this.g.setContentView(LayoutInflater.from(this.g).inflate(b03.k.G, (ViewGroup) null, false));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        my2.a(this.f, (FrameLayout) this.g.findViewById(b03.h.D0), layoutParams);
        ((CloseImageView) this.g.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.b63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b93.j(b93.this, view);
            }
        });
    }
}