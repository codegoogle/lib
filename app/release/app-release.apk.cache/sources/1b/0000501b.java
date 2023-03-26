package com.p7700g.p99005;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.hc3;
import com.p7700g.p99005.t43;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m83 extends l83 {
    @NotNull
    public static final a o = new a(null);
    private NativeAd p;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements hc3.b {

        /* loaded from: classes3.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                fz2.values();
                int[] iArr = new int[2];
                iArr[fz2.SUCCESS.ordinal()] = 1;
                iArr[fz2.FAILURE.ordinal()] = 2;
                a = iArr;
            }
        }

        public b() {
        }

        @Override // com.p7700g.p99005.hc3.b
        public void a(@NotNull ez2 ez2Var) {
            c25.p(ez2Var, "cacheResModel");
            int i = a.a[ez2Var.c().ordinal()];
            if (i == 1) {
                xz2.c("FacebookMediator", c25.C("Asset cache success ", m83.this.n().B()));
                m83 m83Var = m83.this;
                m83Var.b(m83Var.j());
            } else if (i == 2) {
                StringBuilder G = wo1.G("Asset cache failed: ");
                G.append((Object) m83.this.p());
                G.append(gl4.R);
                G.append((Object) m83.this.n().B());
                xz2.c("FacebookMediator", G.toString());
                m83.this.g("Facebook asset cache Failed");
            } else {
                throw new wo4();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements NativeAdListener {
        public c() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(@Nullable Ad ad) {
            xz2.c("FacebookMediator", "Facebook Native ad clicked");
            m83.this.u();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(@Nullable Ad ad) {
            xz2.c("FacebookMediator", "Facebook Native ad loaded");
            m83.this.w();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(@Nullable Ad ad, @Nullable AdError adError) {
            xz2.d("FacebookMediator", c25.C("Facebook native ad load failed reason- ", adError == null ? null : adError.getErrorMessage()));
            m83.this.g(c25.C("Facebook native ad load failed reason- ", adError != null ? adError.getErrorMessage() : null));
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(@Nullable Ad ad) {
            xz2.c("FacebookMediator", "Facebook Native ad impression");
            m83.this.t();
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(@Nullable Ad ad) {
            xz2.c("FacebookMediator", "Facebook Native ad media downloaded");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m83(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        NativeAd nativeAd = this.p;
        if (nativeAd != null) {
            return new n13<>(nativeAd, n().v(), j());
        }
        c25.S("mNativeAd");
        throw null;
    }

    @Override // com.p7700g.p99005.f83
    public void d() {
        super.d();
        NativeAd nativeAd = this.p;
        if (nativeAd != null) {
            nativeAd.destroy();
        } else {
            c25.S("mNativeAd");
            throw null;
        }
    }

    @Override // com.p7700g.p99005.f83
    public synchronized void e() {
        this.p = new NativeAd(i(), j().j());
        c cVar = new c();
        NativeAd nativeAd = this.p;
        if (nativeAd == null) {
            c25.S("mNativeAd");
            throw null;
        } else if (nativeAd == null) {
            c25.S("mNativeAd");
            throw null;
        } else {
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(cVar).build());
        }
    }

    public final void w() {
        NativeMediatedAsset v = n().v();
        NativeAd nativeAd = this.p;
        if (nativeAd != null) {
            v.u(nativeAd.getAdCallToAction());
            v.v(nativeAd.getAdBodyText());
            v.F(nativeAd.getAdHeadline());
            NativeAdImageApi adCoverImage = nativeAd.getInternalNativeAd().getAdCoverImage();
            v.x(adCoverImage == null ? null : adCoverImage.getUrl());
            NativeAdImageApi adIcon = nativeAd.getInternalNativeAd().getAdIcon();
            v.w(adIcon != null ? adIcon.getUrl() : null);
            List<String> k = n().v().k();
            xz2.c("FacebookMediator", c25.C("Fan native download started ", n().B()));
            hc3.e(m(), new dz2(k, l(), t43.d.IMMEDIATE), new b(), null, 4, null);
            return;
        }
        c25.S("mNativeAd");
        throw null;
    }
}