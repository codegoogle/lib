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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i93 extends l13 {
    @NotNull
    private final q13 d;
    @NotNull
    private Ad e;
    @NotNull
    private final NativeAd f;
    @NotNull
    private final Activity g;
    @Nullable
    private final hc3 h;
    private NativeAdLayout i;
    @NotNull
    private final List<View> j;
    private MediaView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core;
        AppConfig r;
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(ad, "mAd");
        c25.p(nativeAd, "nativeAd");
        this.d = q13Var;
        this.e = ad;
        this.f = nativeAd;
        this.g = g().a().f();
        GreedyGameAds.Companion companion = GreedyGameAds.a;
        hc3 hc3Var = null;
        if (companion != null && (iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core()) != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            hc3Var = r.p();
        }
        this.h = hc3Var;
        this.j = new ArrayList();
    }

    private final void j(ImageView imageView) {
        hc3 i;
        if (imageView != null && (i = i()) != null) {
            String i2 = q().i();
            if (i2 == null) {
                i2 = "";
            }
            l(imageView, i, i2);
        }
        this.j.add(imageView);
    }

    private final void k(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    private final void l(ImageView imageView, hc3 hc3Var, String str) {
        String uri = hc3Var.a(str).toString();
        c25.o(uri, "assetManager.getCachedPath(url).toString()");
        Bitmap decodeFile = BitmapFactory.decodeFile(uri);
        if (decodeFile == null) {
            ay2 ay2Var = ay2.a;
            Activity activity = this.g;
            String e = this.e.v().e();
            if (e == null && (e = this.e.v().q()) == null) {
                e = "";
            }
            decodeFile = ay2Var.a(activity, e);
        }
        if (decodeFile == null) {
            return;
        }
        k(imageView, decodeFile);
    }

    public static final void p(i93 i93Var, View view) {
        c25.p(i93Var, "this$0");
        i93Var.d.a().a();
    }

    private final Bitmap s() {
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

    public static /* synthetic */ void u(i93 i93Var, View view) {
        p(i93Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        AppConfig r;
        Typeface h;
        AppConfig r2;
        Typeface h2;
        AppConfig r3;
        Typeface h3;
        View inflate = LayoutInflater.from(this.g).inflate(b03.k.c0, (ViewGroup) null, false);
        NativeAdLayout nativeAdLayout = new NativeAdLayout(this.g);
        this.i = nativeAdLayout;
        if (nativeAdLayout != null) {
            nativeAdLayout.addView(inflate, -1, -1);
            Activity activity = this.g;
            NativeAdLayout nativeAdLayout2 = this.i;
            if (nativeAdLayout2 != null) {
                activity.setContentView(nativeAdLayout2);
                this.g.getWindow().setLayout(-1, -1);
                LinearLayout linearLayout = new LinearLayout(this.g);
                NativeAdLayout nativeAdLayout3 = this.i;
                if (nativeAdLayout3 != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 8388691;
                    yq4 yq4Var = yq4.a;
                    nativeAdLayout3.addView(linearLayout, layoutParams);
                    Activity activity2 = this.g;
                    NativeAd nativeAd = this.f;
                    NativeAdLayout nativeAdLayout4 = this.i;
                    if (nativeAdLayout4 != null) {
                        AdOptionsView adOptionsView = new AdOptionsView(activity2, nativeAd, nativeAdLayout4);
                        linearLayout.removeAllViews();
                        linearLayout.addView(adOptionsView, 0);
                        Bitmap s = s();
                        hz2 b = s == null ? null : cz2.b(s);
                        if (b == null) {
                            b = new hz2(0, 0, null, null, 15, null);
                        }
                        View findViewById = this.g.findViewById(b03.h.O4);
                        c25.o(findViewById, "tv");
                        TextView textView = (TextView) findViewById;
                        m(textView);
                        GreedyGameAds.Companion companion = GreedyGameAds.a;
                        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
                        if (iNSTANCE$com_greedygame_sdkx_core != null && (r3 = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (h3 = r3.h()) != null && textView != null) {
                            textView.setTypeface(h3);
                        }
                        View findViewById2 = this.g.findViewById(b03.h.N4);
                        c25.o(findViewById2, "tv");
                        TextView textView2 = (TextView) findViewById2;
                        r(textView2);
                        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
                        if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (h2 = r2.h()) != null && textView2 != null) {
                            textView2.setTypeface(h2);
                        }
                        Button button = (Button) this.g.findViewById(b03.h.M4);
                        button.setBackgroundColor(b.h());
                        button.setTextColor(b.j().f());
                        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
                        if (iNSTANCE$com_greedygame_sdkx_core3 != null && (r = iNSTANCE$com_greedygame_sdkx_core3.r()) != null && (h = r.h()) != null && button != null) {
                            button.setTypeface(h);
                        }
                        c25.o(button, "ctaButton");
                        t(button);
                        MediaView mediaView = new MediaView(this.g);
                        o(mediaView);
                        ((FrameLayout) this.g.findViewById(b03.h.Q4)).addView(mediaView, new FrameLayout.LayoutParams(-1, -1));
                        j((ImageView) this.g.findViewById(b03.h.P4));
                        NativeAd nativeAd2 = this.f;
                        MediaView mediaView2 = this.k;
                        if (mediaView2 != null) {
                            nativeAd2.registerViewForInteraction(inflate, mediaView2, this.j);
                            ((CloseImageView) this.g.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.e63
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    i93.u(i93.this, view);
                                }
                            });
                            return;
                        }
                        c25.S("mMediaView");
                        throw null;
                    }
                    c25.S("nativeAdLayout");
                    throw null;
                }
                c25.S("nativeAdLayout");
                throw null;
            }
            c25.S("nativeAdLayout");
            throw null;
        }
        c25.S("nativeAdLayout");
        throw null;
    }

    @Nullable
    public final hc3 i() {
        return this.h;
    }

    @r2(otherwise = 2)
    public final void m(@NotNull TextView textView) {
        c25.p(textView, "tv");
        String q = q().q();
        if (q != null) {
            n(textView, q);
        }
        this.j.add(textView);
    }

    @r2(otherwise = 2)
    public final void n(@NotNull TextView textView, @Nullable String str) {
        c25.p(textView, "tv");
        textView.setText(str);
    }

    @r2(otherwise = 2)
    public final void o(@NotNull MediaView mediaView) {
        c25.p(mediaView, "mediaView");
        this.k = mediaView;
        this.j.add(mediaView);
    }

    @NotNull
    public final NativeMediatedAsset q() {
        return this.e.v();
    }

    @r2(otherwise = 2)
    public final void r(@NotNull TextView textView) {
        c25.p(textView, "tv");
        n(textView, q().g());
        this.j.add(textView);
    }

    @r2(otherwise = 2)
    public final void t(@NotNull TextView textView) {
        c25.p(textView, "tv");
        n(textView, q().e());
        this.j.add(textView);
    }
}