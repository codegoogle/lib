package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.greedygame.core.AppConfig;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u73 extends t73 {
    @NotNull
    public static final a t = new a(null);
    @Nullable
    private NativeAd u;
    @NotNull
    private final c03 v;
    @NotNull
    private final AppConfig w;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AdListener {
        public b() {
            u73.this = r1;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            u73.this.u();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
            c25.p(loadAdError, "error");
            xz2.d(cz2.c(this), c25.C("AdMob native ad failed to load. ErrorCode -> ", loadAdError));
            u73.this.g(c25.C("Admob ad load failed reason--", loadAdError));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            u73.this.t();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u73(@NotNull f83.a aVar, @NotNull h73 h73Var) {
        super(aVar, h73Var);
        c25.p(aVar, "builder");
        c25.p(h73Var, "sdkHelper");
        this.v = aVar.v();
        this.w = aVar.u();
    }

    public static final void x(InitializationStatus initializationStatus) {
    }

    public static final void y(u73 u73Var, NativeAd nativeAd) {
        Uri uri;
        String uri2;
        String uri3;
        c25.p(u73Var, "this$0");
        xz2.c(cz2.c(u73Var), "Native ad loaded");
        u73Var.u = nativeAd;
        NativeMediatedAsset v = u73Var.n().v();
        String callToAction = nativeAd.getCallToAction();
        if (callToAction == null) {
            callToAction = "";
        }
        v.u(callToAction);
        String body = nativeAd.getBody();
        if (body == null) {
            body = "";
        }
        v.v(body);
        String headline = nativeAd.getHeadline();
        if (headline == null) {
            headline = "";
        }
        v.F(headline);
        if (nativeAd.getImages().size() >= 1) {
            Uri uri4 = nativeAd.getImages().get(0).getUri();
            if (uri4 == null || (uri3 = uri4.toString()) == null) {
                uri3 = "";
            }
            v.x(uri3);
        }
        NativeAd.Image icon = nativeAd.getIcon();
        if (icon == null || (uri = icon.getUri()) == null || (uri2 = uri.toString()) == null) {
            uri2 = "";
        }
        v.w(uri2);
        String store = nativeAd.getStore();
        if (store == null) {
            store = "";
        }
        v.D(store);
        String price = nativeAd.getPrice();
        if (price == null) {
            price = "";
        }
        v.y(price);
        Double starRating = nativeAd.getStarRating();
        if (starRating == null) {
            starRating = Double.valueOf((double) zg2.s);
        }
        v.B(starRating);
        String advertiser = nativeAd.getAdvertiser();
        v.t(advertiser != null ? advertiser : "");
        u73Var.b(u73Var.j());
    }

    public static /* synthetic */ void z(u73 u73Var, NativeAd nativeAd) {
        y(u73Var, nativeAd);
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        NativeAd nativeAd = this.u;
        if (nativeAd != null) {
            c25.m(nativeAd);
            return new n13<>(nativeAd, n().v(), j());
        }
        return new n13<>(null, n().v(), j());
    }

    @Override // com.p7700g.p99005.f83
    public void d() {
        super.d();
        NativeAd nativeAd = this.u;
        if (nativeAd == null) {
            return;
        }
        nativeAd.destroy();
    }

    @Override // com.p7700g.p99005.f83
    @SuppressLint({"MissingPermission"})
    public synchronized void e() {
        if (q() == f83.c.FINISHED) {
            xz2.c(cz2.c(this), "Ad loading is finished");
            super.e();
        } else if (q() == f83.c.LOADING) {
            xz2.c(cz2.c(this), "Ad is already loading. Wait for the callback");
        } else if (!g83.a.b()) {
            g("Admob sdk not found");
            super.e();
        } else {
            RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
            if (this.v.a()) {
                builder.setTagForChildDirectedTreatment(1);
            }
            MobileAds.setRequestConfiguration(builder.build());
            MobileAds.initialize(i(), u53.a);
            new AdLoader.Builder(i(), j().j()).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.p7700g.p99005.t53
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    u73.z(u73.this, nativeAd);
                }
            }).withAdListener(new b()).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(3).build()).build().loadAd(new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, w()).build());
        }
    }

    public /* synthetic */ u73(f83.a aVar, h73 h73Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? h73.a.a() : h73Var);
    }
}