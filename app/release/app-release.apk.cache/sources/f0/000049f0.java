package com.p7700g.p99005;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.f83;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j83 extends l83 {
    @NotNull
    public static final a o = new a(null);
    @NotNull
    private static final String p = "FacebookBannerMediator";
    private AdView q;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return j83.p;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements AdListener {
        public b() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(@Nullable Ad ad) {
            xz2.c(j83.o.a(), "Facebook banner ad clicked");
            j83.this.u();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(@Nullable Ad ad) {
            xz2.c(j83.o.a(), "Facebook banner ad loaded");
            j83 j83Var = j83.this;
            j83Var.b(j83Var.j());
        }

        @Override // com.facebook.ads.AdListener
        public void onError(@Nullable Ad ad, @Nullable AdError adError) {
            String errorMessage;
            String errorMessage2;
            String a = j83.o.a();
            String str = pg1.d;
            if (adError != null && (errorMessage2 = adError.getErrorMessage()) != null) {
                str = errorMessage2;
            }
            xz2.d(a, c25.C("Facebook banner ad failed to load. Error -> ", str));
            j83 j83Var = j83.this;
            String str2 = "";
            if (adError != null && (errorMessage = adError.getErrorMessage()) != null) {
                str2 = errorMessage;
            }
            j83Var.g(c25.C("Facebook banner ad load failed reason- ", str2));
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(@Nullable Ad ad) {
            xz2.c(j83.o.a(), "Facebook banner ad impression fired");
            j83.this.t();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    private final AdSize x() {
        Partner w = n().w();
        Integer d = w == null ? null : w.d();
        if (d != null && d.intValue() == 0) {
            AdSize adSize = AdSize.BANNER_HEIGHT_50;
            c25.o(adSize, "BANNER_HEIGHT_50");
            return adSize;
        } else if (d != null && d.intValue() == 1) {
            AdSize adSize2 = AdSize.BANNER_HEIGHT_90;
            c25.o(adSize2, "BANNER_HEIGHT_90");
            return adSize2;
        } else if (d != null && d.intValue() == 2) {
            AdSize adSize3 = AdSize.RECTANGLE_HEIGHT_250;
            c25.o(adSize3, "RECTANGLE_HEIGHT_250");
            return adSize3;
        } else {
            AdSize adSize4 = AdSize.BANNER_HEIGHT_50;
            c25.o(adSize4, "BANNER_HEIGHT_50");
            return adSize4;
        }
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        AdView adView = this.q;
        if (adView != null) {
            return new n13<>(adView, new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
        }
        c25.S("bannerView");
        throw null;
    }

    @Override // com.p7700g.p99005.f83
    public void d() {
        super.d();
        AdView adView = this.q;
        if (adView != null) {
            if (adView != null) {
                adView.destroy();
            } else {
                c25.S("bannerView");
                throw null;
            }
        }
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        String j;
        Context i = i();
        Partner w = n().w();
        String str = "";
        if (w != null && (j = w.j()) != null) {
            str = j;
        }
        this.q = new AdView(i, str, x());
        b bVar = new b();
        AdView adView = this.q;
        if (adView == null) {
            c25.S("bannerView");
            throw null;
        } else if (adView != null) {
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(bVar).build());
        } else {
            c25.S("bannerView");
            throw null;
        }
    }
}