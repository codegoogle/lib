package com.p7700g.p99005;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGButton;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.lp5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ha3 extends l13 {
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
    @NotNull
    private final qo4 i;
    @Nullable
    private lp5 j;
    public FrameLayout k;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements lp5.i {
        public b() {
            ha3.this = r1;
        }

        @Override // com.p7700g.p99005.lp5.i
        public void a() {
            lp5 w = ha3.this.w();
            if (w == null) {
                return;
            }
            w.Q();
        }

        @Override // com.p7700g.p99005.lp5.i
        public void b() {
            ha3.this.G();
        }

        @Override // com.p7700g.p99005.lp5.i
        public void c(@Nullable Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            if (exc != null) {
                xz2.e("S2SVideoInterstitialActivity", "Failed to play VAST", exc);
                ha3.this.i().d(c25.C("Failed to play VAST reason - ", exc.getMessage()));
                ha3.this.q().finish();
            }
        }

        @Override // com.p7700g.p99005.lp5.i
        public void d() {
        }

        @Override // com.p7700g.p99005.lp5.i
        public void e() {
            lp5 w = ha3.this.w();
            if (w == null) {
                return;
            }
            w.Q();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<kp5> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            ha3.this = r1;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final kp5 x() {
            return new kp5(ha3.this.q());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha3(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
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
        this.i = so4.c(new c());
    }

    private final Bitmap B() {
        AppConfig r;
        hc3 p;
        BitmapFactory.Options options = new BitmapFactory.Options();
        String i = h().b().i();
        if (i == null) {
            i = "";
        }
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Uri uri = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
            uri = p.a(i);
        }
        return BitmapFactory.decodeFile(String.valueOf(uri), options);
    }

    public static /* synthetic */ void C(ha3 ha3Var, View view) {
        p(ha3Var, view);
    }

    public static /* synthetic */ void D(ha3 ha3Var) {
        s(ha3Var);
    }

    public static /* synthetic */ void E(ha3 ha3Var, View view) {
        t(ha3Var, view);
    }

    private final void F() {
        this.j = new lp5(this.g);
        x().removeAllViews();
        FrameLayout x = x();
        lp5 lp5Var = this.j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, cz2.a(250, this.g));
        layoutParams.gravity = 17;
        yq4 yq4Var = yq4.a;
        x.addView(lp5Var, layoutParams);
        b bVar = new b();
        lp5 lp5Var2 = this.j;
        if (lp5Var2 != null) {
            lp5Var2.setListener(bVar);
        }
        lp5 lp5Var3 = this.j;
        if (lp5Var3 == null) {
            return;
        }
        lp5Var3.post(new Runnable() { // from class: com.p7700g.p99005.a73
            @Override // java.lang.Runnable
            public final void run() {
                ha3.D(ha3.this);
            }
        });
    }

    public final void G() {
        lp5 lp5Var = this.j;
        if (lp5Var != null) {
            lp5Var.P();
        }
        this.e.w(true);
    }

    private final void k(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    public static final void p(ha3 ha3Var, View view) {
        c25.p(ha3Var, "this$0");
        ha3Var.e.a().a();
    }

    public static final void s(ha3 ha3Var) {
        c25.p(ha3Var, "this$0");
        Boolean e = kp5.e(ha3Var.u().c());
        c25.o(e, "hasParsed(nativeMediatedAsset.adm)");
        if (e.booleanValue()) {
            lp5 w = ha3Var.w();
            if (w == null) {
                return;
            }
            w.J(kp5.d(ha3Var.u().c()));
            return;
        }
        ha3Var.i().d("VAST Failed to cache");
        ha3Var.q().finish();
    }

    public static final void t(ha3 ha3Var, View view) {
        c25.p(ha3Var, "this$0");
        ha3Var.G();
    }

    public final void A() {
        lp5 lp5Var = this.j;
        if (lp5Var == null) {
            return;
        }
        lp5Var.y();
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        AppConfig r;
        Typeface h;
        AppConfig r2;
        Typeface h2;
        AppConfig r3;
        Typeface h3;
        Activity activity = this.g;
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        } else {
            yz2 yz2Var = yz2.a;
            if (yz2Var.e(activity)) {
                i = 0;
            } else {
                yz2Var.e(this.g);
            }
        }
        activity.setRequestedOrientation(i);
        Activity activity2 = this.g;
        activity2.setContentView(b03.k.d0);
        activity2.getWindow().setLayout(-1, -1);
        CloseImageView closeImageView = (CloseImageView) this.g.findViewById(b03.h.L4);
        if (closeImageView != null) {
            closeImageView.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.z63
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ha3.C(ha3.this, view);
                }
            });
        }
        View findViewById = this.g.findViewById(b03.h.Q4);
        c25.o(findViewById, "mActivity.findViewById(R.id.unifiedMediaView)");
        j((FrameLayout) findViewById);
        F();
        Bitmap B = B();
        hz2 b2 = B == null ? null : cz2.b(B);
        if (b2 == null) {
            b2 = new hz2(0, 0, null, null, 15, null);
        }
        View findViewById2 = this.g.findViewById(b03.h.O4);
        c25.o(findViewById2, "tv");
        TextView textView = (TextView) findViewById2;
        m(textView);
        GreedyGameAds.Companion companion = GreedyGameAds.a;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r3 = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (h3 = r3.h()) != null && textView != null) {
            textView.setTypeface(h3);
        }
        View findViewById3 = this.g.findViewById(b03.h.N4);
        c25.o(findViewById3, "tv");
        TextView textView2 = (TextView) findViewById3;
        r(textView2);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (h2 = r2.h()) != null && textView2 != null) {
            textView2.setTypeface(h2);
        }
        GGButton gGButton = (GGButton) this.g.findViewById(b03.h.M4);
        gGButton.setBackgroundColor(b2.h());
        gGButton.setTextColor(b2.j().f());
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core3 != null && (r = iNSTANCE$com_greedygame_sdkx_core3.r()) != null && (h = r.h()) != null && gGButton != null) {
            gGButton.setTypeface(h);
        }
        c25.o(gGButton, "ctaButton");
        v(gGButton);
        gGButton.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.b73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ha3.E(ha3.this, view);
            }
        });
        ImageView imageView = (ImageView) this.g.findViewById(b03.h.P4);
        hc3 hc3Var = this.h;
        if (hc3Var == null) {
            return;
        }
        c25.o(imageView, "iconImageVIew");
        String i2 = u().i();
        if (i2 == null) {
            i2 = "";
        }
        l(imageView, hc3Var, i2);
    }

    @NotNull
    public final Ad i() {
        return this.f;
    }

    public final void j(@NotNull FrameLayout frameLayout) {
        c25.p(frameLayout, "<set-?>");
        this.k = frameLayout;
    }

    public final void l(@NotNull ImageView imageView, @NotNull hc3 hc3Var, @NotNull String str) {
        c25.p(imageView, "imageView");
        c25.p(hc3Var, "assetManager");
        c25.p(str, "url");
        String uri = hc3Var.a(str).toString();
        c25.o(uri, "assetManager.getCachedPath(url).toString()");
        Bitmap decodeFile = BitmapFactory.decodeFile(uri);
        if (decodeFile == null) {
            ay2 ay2Var = ay2.a;
            Activity activity = this.g;
            String e = this.f.v().e();
            if (e == null && (e = this.f.v().q()) == null) {
                e = "";
            }
            decodeFile = ay2Var.a(activity, e);
        }
        if (decodeFile == null) {
            return;
        }
        k(imageView, decodeFile);
    }

    @r2(otherwise = 2)
    public final void m(@NotNull TextView textView) {
        c25.p(textView, "tv");
        String q = u().q();
        if (q == null) {
            return;
        }
        n(textView, q);
    }

    @r2(otherwise = 2)
    public final void n(@NotNull TextView textView, @Nullable String str) {
        c25.p(textView, "tv");
        textView.setText(str);
    }

    @NotNull
    public final Activity q() {
        return this.g;
    }

    @r2(otherwise = 2)
    public final void r(@NotNull TextView textView) {
        c25.p(textView, "tv");
        n(textView, u().g());
    }

    @NotNull
    public final NativeMediatedAsset u() {
        return this.f.v();
    }

    @r2(otherwise = 2)
    public final void v(@NotNull TextView textView) {
        c25.p(textView, "tv");
        n(textView, u().e());
    }

    @Nullable
    public final lp5 w() {
        return this.j;
    }

    @NotNull
    public final FrameLayout x() {
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            return frameLayout;
        }
        c25.S("mAdPlayerContainer");
        throw null;
    }

    public final void y() {
        lp5 lp5Var = this.j;
        if (lp5Var != null) {
            lp5Var.setLifecycleState(lp5.h.OnResume);
        }
        lp5 lp5Var2 = this.j;
        if (lp5Var2 == null) {
            return;
        }
        lp5Var2.Q();
    }

    public final void z() {
        lp5 lp5Var = this.j;
        if (lp5Var != null) {
            lp5Var.setLifecycleState(lp5.h.OnPause);
        }
        lp5 lp5Var2 = this.j;
        if (lp5Var2 == null) {
            return;
        }
        lp5Var2.P();
    }
}