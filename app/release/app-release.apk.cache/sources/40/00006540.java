package com.p7700g.p99005;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.q03;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x93 extends l13 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    private final q13 e;
    @NotNull
    private Ad f;
    @NotNull
    private final Activity g;
    @Nullable
    private final hc3 h;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements q03.a {
        public b() {
            x93.this = r1;
        }

        @Override // com.p7700g.p99005.q03.a
        public void a() {
            Ad.p(x93.this.i(), true, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var);
        AppConfig r;
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(ad, "mAd");
        this.e = q13Var;
        this.f = ad;
        this.g = g().a().f();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        hc3 hc3Var = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            hc3Var = r.p();
        }
        this.h = hc3Var;
    }

    public static final void j(x93 x93Var, View view) {
        c25.p(x93Var, "this$0");
        x93Var.e.a().a();
    }

    public static /* synthetic */ void k(x93 x93Var, View view) {
        j(x93Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        this.g.setContentView(b03.k.E);
        FrameLayout frameLayout = (FrameLayout) this.g.findViewById(b03.h.f5);
        this.g.getWindow().setLayout(-1, -1);
        o03 a2 = q03.s.a(this.f, new b());
        if (a2 == null) {
            xz2.c("S2SInterstitialActivity", "Could not find the webiew, finishing");
            this.g.finish();
            return;
        }
        my2.a(a2, frameLayout, new FrameLayout.LayoutParams(-1, -1));
        ((CloseImageView) this.g.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.s63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x93.k(x93.this, view);
            }
        });
    }

    @NotNull
    public final Ad i() {
        return this.f;
    }
}