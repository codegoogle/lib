package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mopub.common.MoPub;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.nativeads.MediaViewBinder;
import com.mopub.nativeads.MoPubNative;
import com.mopub.nativeads.MoPubStaticNativeAdRenderer;
import com.mopub.nativeads.MoPubVideoNativeAdRenderer;
import com.mopub.nativeads.NativeAd;
import com.mopub.nativeads.NativeErrorCode;
import com.mopub.nativeads.RequestParameters;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.mopub.nativeads.ViewBinder;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.hc3;
import com.p7700g.p99005.t43;
import java.io.File;
import java.util.EnumSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p93 extends f83 {
    @NotNull
    public static final a o = new a(null);
    @NotNull
    private static final String p = c25.C(com.anythink.expressad.foundation.g.a.f.a, File.separator);
    @Nullable
    private StaticNativeAd q;
    @Nullable
    private VideoNativeAd r;
    @NotNull
    private final c s;
    @NotNull
    private final d t;

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
                xz2.c("MopuMed", "Asset Cache Success");
                p93 p93Var = p93.this;
                p93Var.b(p93Var.j());
            } else if (i != 2) {
            } else {
                p93.this.g("Mopub asset cache failed");
                xz2.c("MopuMed", c25.C("Asset Cache Failed: ", p93.this.p()));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements NativeAd.MoPubNativeEventListener {
        public c() {
        }

        public void a(@Nullable View view) {
            p93.this.u();
        }

        public void b(@Nullable View view) {
            p93.this.t();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements MoPubNative.MoPubNativeNetworkListener {
        public d() {
        }

        public void a(@NotNull NativeErrorCode nativeErrorCode) {
            c25.p(nativeErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
            xz2.c("MopuMed", c25.C("Ad Load Failed: ", nativeErrorCode));
            p93.this.g(c25.C("Mopub ad load failed-", nativeErrorCode));
        }

        public void b(@NotNull NativeAd nativeAd) {
            c25.p(nativeAd, "nativeAd");
            try {
                xz2.c("MopuMed", "MoPub Ad Loaded");
                nativeAd.setMoPubNativeEventListener(p93.this.s);
                StaticNativeAd baseNativeAd = nativeAd.getBaseNativeAd();
                c25.o(baseNativeAd, "nativeAd.baseNativeAd");
                if (baseNativeAd instanceof StaticNativeAd) {
                    p93.this.x(baseNativeAd);
                } else if (baseNativeAd instanceof VideoNativeAd) {
                    p93.this.y((VideoNativeAd) baseNativeAd);
                }
            } catch (NoClassDefFoundError unused) {
                xz2.d("MopuMed", "MoPub SDK not found in game");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p93(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
        this.s = new c();
        this.t = new d();
    }

    private static final void A(p93 p93Var) {
        c25.p(p93Var, "this$0");
        xz2.g("MopuMed", "MoPub sdk initialized. Making request.");
        p93Var.C();
    }

    private final SdkInitializationListener B() {
        return new SdkInitializationListener() { // from class: com.p7700g.p99005.i63
            public final void a() {
                p93.lambda$nYwxnKQIvC5H8MM2QpTOLtnol8s(p93.this);
            }
        };
    }

    private final void C() {
        MediaViewBinder mediaViewBinder;
        Context i = i();
        String j = j().j();
        c25.m(j);
        MoPubNative moPubNative = new MoPubNative(i, j, this.t);
        ViewBinder build = new ViewBinder.Builder(0).build();
        c25.o(build, "Builder(0)\n                .build()");
        try {
            mediaViewBinder = new MediaViewBinder.Builder(0).build();
        } catch (NoClassDefFoundError unused) {
            xz2.c("MopuMed", "Mopub Video SDK not found");
            mediaViewBinder = null;
        }
        RequestParameters build2 = new RequestParameters.Builder().desiredAssets(EnumSet.of(RequestParameters.NativeAdAsset.TITLE, RequestParameters.NativeAdAsset.TEXT, RequestParameters.NativeAdAsset.CALL_TO_ACTION_TEXT, RequestParameters.NativeAdAsset.MAIN_IMAGE, RequestParameters.NativeAdAsset.ICON_IMAGE)).build();
        c25.o(build2, "Builder()\n                .desiredAssets(assetsSet)\n                .build()");
        moPubNative.registerAdRenderer(new MoPubStaticNativeAdRenderer(build));
        if (mediaViewBinder != null) {
            moPubNative.registerAdRenderer(new MoPubVideoNativeAdRenderer(mediaViewBinder));
        }
        moPubNative.makeRequest(build2);
    }

    private final void z(List<String> list) {
        hc3.e(m(), new dz2(list, l(), t43.d.IMMEDIATE), new b(), null, 4, null);
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        StaticNativeAd staticNativeAd = this.q;
        if (staticNativeAd == null) {
            VideoNativeAd videoNativeAd = this.r;
            if (videoNativeAd == null) {
                return new n13<>(null, n().v(), j());
            }
            return new n13<>(videoNativeAd, n().v(), j());
        }
        return new n13<>(staticNativeAd, n().v(), j());
    }

    @Override // com.p7700g.p99005.f83
    public void d() {
        super.d();
        StaticNativeAd staticNativeAd = this.q;
        if (staticNativeAd != null) {
            staticNativeAd.destroy();
        }
        VideoNativeAd videoNativeAd = this.r;
        if (videoNativeAd == null) {
            return;
        }
        videoNativeAd.destroy();
    }

    @Override // com.p7700g.p99005.f83
    public synchronized void e() {
        if (q() == f83.c.FINISHED) {
            xz2.c("MopuMed", "Ad loading is finished");
            super.e();
        } else if (q() == f83.c.LOADING) {
            xz2.c("MopuMed", "Ad is already loading. Wait for the callback");
        } else if (!g83.a.d()) {
            g("Mopub sdk not found");
        } else {
            try {
                Class.forName("com.mopub.common.SdkConfiguration");
                String j = j().j();
                if (j == null) {
                    j = "";
                }
                SdkConfiguration build = new SdkConfiguration.Builder(j).build();
                if (!MoPub.isSdkInitialized()) {
                    MoPub.initializeSdk(i(), build, B());
                } else {
                    C();
                }
            } catch (ClassNotFoundException unused) {
                xz2.c("MopuMed", "Mopub version not above 5.5 so we are making the request directly.");
                C();
            }
            super.e();
        }
    }

    public final void x(@NotNull StaticNativeAd staticNativeAd) {
        c25.p(staticNativeAd, "staticNativeAd");
        this.q = staticNativeAd;
        NativeMediatedAsset v = n().v();
        v.x(staticNativeAd.getMainImageUrl());
        v.w(staticNativeAd.getIconImageUrl());
        v.u(staticNativeAd.getCallToAction());
        v.v(staticNativeAd.getText());
        v.F(staticNativeAd.getTitle());
        v.z(staticNativeAd.getPrivacyInformationIconImageUrl());
        v.C(staticNativeAd.getClickDestinationUrl());
        z(n().v().k());
    }

    public final void y(@NotNull VideoNativeAd videoNativeAd) {
        c25.p(videoNativeAd, "videoNativeAd");
        this.r = videoNativeAd;
        NativeMediatedAsset v = n().v();
        v.x(videoNativeAd.getMainImageUrl());
        v.w(videoNativeAd.getIconImageUrl());
        v.u(videoNativeAd.getCallToAction());
        v.v(videoNativeAd.getText());
        v.F(videoNativeAd.getTitle());
        v.z(videoNativeAd.getPrivacyInformationIconImageUrl());
        v.C(videoNativeAd.getClickDestinationUrl());
        z(n().v().k());
    }
}