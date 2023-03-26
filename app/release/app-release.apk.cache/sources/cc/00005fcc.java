package com.p7700g.p99005;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.b03;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uc3 extends y03 {
    private NativeAdView m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc3(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var, ad);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "ggAdView");
        c25.p(ad, "ad");
    }

    private final NativeMediatedAsset D() {
        return j().v();
    }

    private final NativeAd E() {
        Object a = h().a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAd");
        return (NativeAd) a;
    }

    private final Bitmap F() {
        AppConfig r;
        hc3 p;
        BitmapFactory.Options options = new BitmapFactory.Options();
        String i = D().i();
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

    private final void u(ImageView imageView) {
        hc3 C;
        if (imageView != null && (C = C()) != null) {
            String i = D().i();
            if (i == null) {
                i = "";
            }
            w(imageView, C, i);
        }
        NativeAdView nativeAdView = this.m;
        if (nativeAdView != null) {
            nativeAdView.setIconView(imageView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    private final void v(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    private final void w(ImageView imageView, hc3 hc3Var, String str) {
        String uri = hc3Var.a(str).toString();
        c25.o(uri, "assetManager.getCachedPath(url).toString()");
        Bitmap decodeFile = BitmapFactory.decodeFile(uri);
        if (decodeFile == null) {
            ay2 ay2Var = ay2.a;
            Activity n = n();
            String e = j().v().e();
            if (e == null && (e = j().v().q()) == null) {
                e = "";
            }
            decodeFile = ay2Var.a(n, e);
        }
        if (decodeFile == null) {
            return;
        }
        v(imageView, decodeFile);
    }

    @r2(otherwise = 2)
    public final void A(@NotNull TextView textView) {
        c25.p(textView, "tv");
        y(textView, D().g());
        NativeAdView nativeAdView = this.m;
        if (nativeAdView != null) {
            nativeAdView.setBodyView(textView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    @r2(otherwise = 2)
    public final void B(@NotNull TextView textView) {
        c25.p(textView, "tv");
        y(textView, D().e());
        NativeAdView nativeAdView = this.m;
        if (nativeAdView != null) {
            nativeAdView.setCallToActionView(textView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    @Nullable
    public final hc3 C() {
        AppConfig r;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null) {
            return null;
        }
        return r.p();
    }

    @Override // com.p7700g.p99005.y03
    @Nullable
    public View q() {
        AppConfig r;
        Typeface h;
        AppConfig r2;
        Typeface h2;
        AppConfig r3;
        Typeface h3;
        View inflate = LayoutInflater.from(n()).inflate(b03.k.C0, (ViewGroup) p(), false);
        NativeAdView nativeAdView = new NativeAdView(n());
        this.m = nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
            Bitmap F = F();
            hz2 b = F == null ? null : cz2.b(F);
            if (b == null) {
                b = new hz2(0, 0, null, null, 15, null);
            }
            View findViewById = inflate.findViewById(b03.h.O4);
            c25.o(findViewById, "tv");
            TextView textView = (TextView) findViewById;
            x(textView);
            GreedyGameAds.Companion companion = GreedyGameAds.a;
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core != null && (r3 = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (h3 = r3.h()) != null && textView != null) {
                textView.setTypeface(h3);
            }
            View findViewById2 = inflate.findViewById(b03.h.N4);
            c25.o(findViewById2, "tv");
            TextView textView2 = (TextView) findViewById2;
            A(textView2);
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (h2 = r2.h()) != null && textView2 != null) {
                textView2.setTypeface(h2);
            }
            Button button = (Button) inflate.findViewById(b03.h.M4);
            button.setBackgroundColor(b.h());
            button.setTextColor(b.j().f());
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core3 != null && (r = iNSTANCE$com_greedygame_sdkx_core3.r()) != null && (h = r.h()) != null && button != null) {
                button.setTypeface(h);
            }
            c25.o(button, "ctaButton");
            B(button);
            MediaView mediaView = new MediaView(n());
            z(mediaView);
            ((FrameLayout) inflate.findViewById(b03.h.Q4)).addView(mediaView, new FrameLayout.LayoutParams(-1, -1));
            u((ImageView) inflate.findViewById(b03.h.P4));
            NativeAdView nativeAdView2 = this.m;
            if (nativeAdView2 != null) {
                nativeAdView2.setNativeAd(E());
                NativeAdView nativeAdView3 = this.m;
                if (nativeAdView3 != null) {
                    return nativeAdView3;
                }
                c25.S("nativeAdView");
                throw null;
            }
            c25.S("nativeAdView");
            throw null;
        }
        c25.S("nativeAdView");
        throw null;
    }

    @r2(otherwise = 2)
    public final void x(@NotNull TextView textView) {
        c25.p(textView, "tv");
        String q = D().q();
        if (q != null) {
            y(textView, q);
        }
        NativeAdView nativeAdView = this.m;
        if (nativeAdView != null) {
            nativeAdView.setHeadlineView(textView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    @r2(otherwise = 2)
    public final void y(@NotNull TextView textView, @Nullable String str) {
        c25.p(textView, "tv");
        textView.setText(str);
    }

    @r2(otherwise = 2)
    public final void z(@NotNull MediaView mediaView) {
        c25.p(mediaView, "mediaView");
        mediaView.setMediaContent(E().getMediaContent());
        NativeAdView nativeAdView = this.m;
        if (nativeAdView != null) {
            nativeAdView.setMediaView(mediaView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }
}