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
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d93 extends l13 implements xx2 {
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
    private NativeAdView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var);
        AppConfig r;
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(ad, "mAd");
        c25.p(nativeAd, "nativeAd");
        this.d = q13Var;
        this.e = ad;
        this.f = nativeAd;
        this.g = g().a().f();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        hc3 hc3Var = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            hc3Var = r.p();
        }
        this.h = hc3Var;
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
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            nativeAdView.setIconView(imageView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
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

    public static final void p(d93 d93Var, View view) {
        c25.p(d93Var, "this$0");
        d93Var.d.a().a();
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

    public static /* synthetic */ void u(d93 d93Var, View view) {
        p(d93Var, view);
    }

    @Override // com.p7700g.p99005.xx2
    public void a(@NotNull List<String> list) {
        c25.p(list, "urls");
    }

    @Override // com.p7700g.p99005.xx2
    @NotNull
    public Uri b(@NotNull String str) {
        c25.p(str, "url");
        hc3 hc3Var = this.h;
        Uri a = hc3Var == null ? null : hc3Var.a(str);
        if (a == null) {
            Uri uri = Uri.EMPTY;
            c25.o(uri, "EMPTY");
            return uri;
        }
        return a;
    }

    @Override // com.p7700g.p99005.xx2
    public void c(@NotNull List<String> list, @NotNull String str, @NotNull wx2 wx2Var) {
        c25.p(list, "urls");
        c25.p(str, "directive");
        c25.p(wx2Var, "assetDownloadListener");
    }

    @Override // com.p7700g.p99005.xx2
    @Nullable
    public byte[] d(@NotNull String str) {
        c25.p(str, "url");
        hc3 hc3Var = this.h;
        if (hc3Var == null) {
            return null;
        }
        return hc3Var.h(str);
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
        NativeAdView nativeAdView = new NativeAdView(this.g);
        this.i = nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
            Activity activity = this.g;
            NativeAdView nativeAdView2 = this.i;
            if (nativeAdView2 != null) {
                activity.setContentView(nativeAdView2);
                this.g.getWindow().setLayout(-1, -1);
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
                NativeAdView nativeAdView3 = this.i;
                if (nativeAdView3 != null) {
                    nativeAdView3.setNativeAd(this.f);
                    ((CloseImageView) this.g.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.c63
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d93.u(d93.this, view);
                        }
                    });
                    return;
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
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            nativeAdView.setHeadlineView(textView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    @r2(otherwise = 2)
    public final void n(@NotNull TextView textView, @Nullable String str) {
        c25.p(textView, "tv");
        textView.setText(str);
    }

    @r2(otherwise = 2)
    public final void o(@NotNull MediaView mediaView) {
        c25.p(mediaView, "mediaView");
        mediaView.setMediaContent(this.f.getMediaContent());
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            nativeAdView.setMediaView(mediaView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    @NotNull
    public final NativeMediatedAsset q() {
        return this.e.v();
    }

    @r2(otherwise = 2)
    public final void r(@NotNull TextView textView) {
        c25.p(textView, "tv");
        n(textView, q().g());
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            nativeAdView.setBodyView(textView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }

    @r2(otherwise = 2)
    public final void t(@NotNull TextView textView) {
        c25.p(textView, "tv");
        n(textView, q().e());
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            nativeAdView.setCallToActionView(textView);
        } else {
            c25.S("nativeAdView");
            throw null;
        }
    }
}