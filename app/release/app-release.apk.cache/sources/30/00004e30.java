package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.mystique2.models.NativeAdViewTypes;
import com.p7700g.p99005.hc3;
import com.p7700g.p99005.t43;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l93 implements xx2, k93 {
    @NotNull
    public static final a b = new a(null);
    @NotNull
    private final GGAdview c;
    @NotNull
    private final n03 d;
    @NotNull
    private final n13<?> e;
    @NotNull
    private final o33 f;

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
        public final /* synthetic */ wx2 a;

        public b(wx2 wx2Var) {
            this.a = wx2Var;
        }

        @Override // com.p7700g.p99005.hc3.b
        public void a(@NotNull ez2 ez2Var) {
            c25.p(ez2Var, "cacheResModel");
            this.a.a(ez2Var);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ NativeAdView t;
        public final /* synthetic */ NativeAd u;

        public c(Object obj, NativeAdView nativeAdView, NativeAd nativeAd) {
            this.s = obj;
            this.t = nativeAdView;
            this.u = nativeAd;
        }

        @Override // java.lang.Runnable
        public final void run() {
            yq4 yq4Var;
            l93 l93Var = (l93) this.s;
            NativeAdView nativeAdView = this.t;
            if (nativeAdView == null) {
                yq4Var = null;
            } else {
                nativeAdView.setNativeAd(this.u);
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                xz2.c("AdmobAdViewMapper", "Unified View for Admob is null");
            }
        }
    }

    public l93(@NotNull GGAdview gGAdview, @NotNull n03 n03Var, @NotNull n13<?> n13Var, @NotNull o33 o33Var) {
        c25.p(gGAdview, "ggAdview");
        c25.p(n03Var, "unitConfig");
        c25.p(n13Var, "partnerAdInfo");
        c25.p(o33Var, com.anythink.expressad.a.B);
        this.c = gGAdview;
        this.d = n03Var;
        this.e = n13Var;
        this.f = o33Var;
    }

    @Override // com.p7700g.p99005.k93
    public void a() {
        yq4 yq4Var;
        yq4 yq4Var2;
        int a2;
        Resources resources;
        MediaView mediaView;
        int childCount;
        Object a3 = this.e.a();
        DisplayMetrics displayMetrics = null;
        NativeAd nativeAd = a3 instanceof NativeAd ? (NativeAd) a3 : null;
        ViewGroup nativeAdView = this.f.getNativeAdView();
        NativeAdView nativeAdView2 = nativeAdView instanceof NativeAdView ? (NativeAdView) nativeAdView : null;
        if (nativeAd == null) {
            yq4Var = null;
        } else {
            if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                if (nativeAdView2 == null) {
                    yq4Var2 = null;
                } else {
                    nativeAdView2.setNativeAd(nativeAd);
                    yq4Var2 = yq4.a;
                }
                if (yq4Var2 == null) {
                    xz2.c("AdmobAdViewMapper", "Unified View for Admob is null");
                }
            } else {
                new Handler(Looper.getMainLooper()).post(new c(this, nativeAdView2, nativeAd));
            }
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c("AdmobAdViewMapper", "Unified Native Ad for Admob is null");
        }
        boolean z = false;
        View childAt = nativeAdView2 == null ? null : nativeAdView2.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt2 = ((ViewGroup) childAt).getChildAt(i);
                if (childAt2 instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) childAt2;
                    if (c25.g(frameLayout.getTag(), NativeAdViewTypes.MEDIA_VIEW.getValue())) {
                        View childAt3 = frameLayout.getChildAt(0);
                        ImageView imageView = childAt3 instanceof ImageView ? (ImageView) childAt3 : null;
                        String j = e().b().j();
                        if (j == null) {
                            j = "";
                        }
                        String uri = b(j).toString();
                        c25.o(uri, "imageUrl.toString()");
                        Bitmap c2 = wz2.c(uri);
                        uz2 uz2Var = uz2.a;
                        Context context = f().getContext();
                        c25.o(context, "view.context");
                        Bitmap d = uz2.d(uz2Var, context, c2, f().getDominantColor(), 0.0f, 8, null);
                        if (imageView != null) {
                            imageView.setImageBitmap(d);
                        }
                    }
                }
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        if (nativeAdView2 != null && (mediaView = nativeAdView2.getMediaView()) != null) {
            mediaView.setMediaContent(nativeAd == null ? null : nativeAd.getMediaContent());
        }
        if (this.d.k() != null) {
            ViewGroup.LayoutParams k = this.d.k();
            if (k != null && Integer.valueOf(k.height).equals(-2)) {
                z = true;
            }
            if (z) {
                if (this.c.getAdsMaxHeight() > 0) {
                    int adsMaxHeight = this.c.getAdsMaxHeight();
                    Context context2 = this.f.getContext();
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        displayMetrics = resources.getDisplayMetrics();
                    }
                    if (adsMaxHeight >= ac3.a(50, displayMetrics)) {
                        a2 = this.c.getAdsMaxHeight();
                        this.f.setViewLayoutParams(new FrameLayout.LayoutParams(this.d.j(), a2));
                    }
                }
                cc3 cc3Var = cc3.a;
                Context context3 = this.f.getContext();
                c25.o(context3, "view.context");
                int j2 = this.d.j();
                Context context4 = this.f.getContext();
                c25.o(context4, "view.context");
                int b2 = cc3Var.b(context3, cz2.e(j2, context4));
                Context context5 = this.f.getContext();
                c25.o(context5, "view.context");
                a2 = cz2.a(b2, context5);
                this.f.setViewLayoutParams(new FrameLayout.LayoutParams(this.d.j(), a2));
            }
        }
    }

    @Override // com.p7700g.p99005.xx2
    @NotNull
    public Uri b(@NotNull String str) {
        AppConfig r;
        hc3 p;
        c25.p(str, "url");
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Uri uri = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
            uri = p.a(str);
        }
        if (uri == null) {
            Uri uri2 = Uri.EMPTY;
            c25.o(uri2, "EMPTY");
            return uri2;
        }
        return uri;
    }

    @Override // com.p7700g.p99005.xx2
    public void c(@NotNull List<String> list, @NotNull String str, @NotNull wx2 wx2Var) {
        AppConfig r;
        hc3 p;
        c25.p(list, "urls");
        c25.p(str, "directive");
        c25.p(wx2Var, "assetDownloadListener");
        dz2 dz2Var = new dz2(rs4.T5(list), str, t43.d.HIGH);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (p = r.p()) == null) {
            return;
        }
        hc3.e(p, dz2Var, new b(wx2Var), null, 4, null);
    }

    @Override // com.p7700g.p99005.xx2
    @Nullable
    public byte[] d(@NotNull String str) {
        AppConfig r;
        hc3 p;
        c25.p(str, "url");
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (p = r.p()) == null) {
            return null;
        }
        return p.h(str);
    }

    @NotNull
    public final n13<?> e() {
        return this.e;
    }

    @NotNull
    public final o33 f() {
        return this.f;
    }

    @Override // com.p7700g.p99005.xx2
    public void a(@NotNull List<String> list) {
        AppConfig r;
        hc3 p;
        c25.p(list, "urls");
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || (p = r.p()) == null) {
            return;
        }
        p.f(list);
    }
}