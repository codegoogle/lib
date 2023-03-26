package com.p7700g.p99005;

import android.view.ViewTreeObserver;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.f83;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r73 extends t73 {
    @NotNull
    private final h73 t;
    private AdView u;

    /* loaded from: classes3.dex */
    public static final class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@Nullable LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            r73.this.g(c25.C("Admob banner ad load failed reason- ", loadAdError));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            r73 r73Var = r73.this;
            r73Var.b(r73Var.j());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            r73.this.t();
            r73.this.u();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            AdView adView = r73.this.u;
            if (adView != null) {
                adView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                String c = cz2.c(this);
                String[] strArr = new String[1];
                StringBuilder G = wo1.G("Banner Adview Size ");
                AdView adView2 = r73.this.u;
                if (adView2 == null) {
                    c25.S("bannerView");
                    throw null;
                }
                G.append(adView2.getWidth());
                G.append(" - ");
                AdView adView3 = r73.this.u;
                if (adView3 == null) {
                    c25.S("bannerView");
                    throw null;
                }
                G.append(adView3.getHeight());
                strArr[0] = G.toString();
                xz2.c(c, strArr);
                return;
            }
            c25.S("bannerView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(@NotNull f83.a aVar, @NotNull h73 h73Var) {
        super(aVar, h73Var);
        c25.p(aVar, "builder");
        c25.p(h73Var, "sdkHelper");
        this.t = h73Var;
    }

    private final AdSize y() {
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(i(), (int) (r().j() / i().getResources().getDisplayMetrics().density));
        c25.o(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adWidth)");
        return currentOrientationAnchoredAdaptiveBannerAdSize;
    }

    private final AdSize z() {
        AdSize y;
        Partner w = n().w();
        Integer d = w == null ? null : w.d();
        if (d != null && d.intValue() == 0) {
            y = y();
        } else if (d != null && d.intValue() == 1) {
            y = AdSize.BANNER;
        } else if (d != null && d.intValue() == 2) {
            y = AdSize.LARGE_BANNER;
        } else if (d != null && d.intValue() == 3) {
            y = AdSize.MEDIUM_RECTANGLE;
        } else if (d != null && d.intValue() == 4) {
            y = AdSize.FULL_BANNER;
        } else if (d != null && d.intValue() == 5) {
            y = AdSize.LEADERBOARD;
        } else {
            y = (d != null && d.intValue() == 6) ? AdSize.SMART_BANNER : y();
        }
        String c = cz2.c(this);
        StringBuilder G = wo1.G("Chose ");
        G.append(y.getWidth());
        G.append(" x ");
        G.append(y.getHeight());
        xz2.c(c, G.toString());
        c25.o(y, "when (mAd.partner?.bannerType) {\n            0 -> adaptiveBannerSize\n            1 -> AdSize.BANNER\n            2 -> AdSize.LARGE_BANNER\n            3 -> AdSize.MEDIUM_RECTANGLE\n            4 -> AdSize.FULL_BANNER\n            5 -> AdSize.LEADERBOARD\n            6 -> AdSize.SMART_BANNER\n            else -> adaptiveBannerSize\n        }.also {\n            Logger.d(TAG, \"Chose ${it.width} x ${it.height}\")\n        }");
        return y;
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        AdView adView = this.u;
        if (adView != null) {
            return new n13<>(adView, new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
        }
        c25.S("bannerView");
        throw null;
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        AdView adView = new AdView(i());
        Partner w = n().w();
        adView.setAdUnitId(w == null ? null : w.j());
        adView.setAdSize(z());
        adView.setAdListener(new a());
        yq4 yq4Var = yq4.a;
        this.u = adView;
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, w()).build();
        AdView adView2 = this.u;
        if (adView2 != null) {
            adView2.loadAd(build);
            AdView adView3 = this.u;
            if (adView3 != null) {
                adView3.getViewTreeObserver().addOnGlobalLayoutListener(new b());
                return;
            } else {
                c25.S("bannerView");
                throw null;
            }
        }
        c25.S("bannerView");
        throw null;
    }

    public /* synthetic */ r73(f83.a aVar, h73 h73Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? h73.a.a() : h73Var);
    }
}