package com.p7700g.p99005;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGRatingBar;
import com.greedygame.core.uii.CloseImageView;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class a83 extends l13 {
    @NotNull
    private final NativeAd d;
    @NotNull
    private final Activity e;

    /* loaded from: classes3.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ TextView s;

        public a(TextView textView) {
            this.s = textView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.s.getLineCount() > 3) {
                int lineEnd = this.s.getLayout().getLineEnd(2);
                this.s.setText(((Object) this.s.getText().subSequence(0, lineEnd - 3)) + "...");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a83(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(nativeAd, "mAd");
        this.d = nativeAd;
        e(n13Var);
        this.e = q13Var.a().f();
    }

    public static final void j(a83 a83Var, View view) {
        c25.p(a83Var, "this$0");
        a83Var.g().a().a();
    }

    public static /* synthetic */ void k(a83 a83Var, View view) {
        j(a83Var, view);
    }

    @Override // com.p7700g.p99005.l13
    @t0
    public void f() {
        AppConfig r;
        hc3 p;
        this.e.getWindow().setLayout(-1, -1);
        NativeAdView nativeAdView = (NativeAdView) this.e.findViewById(b03.h.o0);
        if (this.d.getHeadline() != null) {
            TextView textView = (TextView) this.e.findViewById(b03.h.O4);
            textView.setText(this.d.getHeadline());
            nativeAdView.setHeadlineView(textView);
        }
        if (this.d.getIcon() != null) {
            ImageView imageView = (ImageView) this.e.findViewById(b03.h.P4);
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
            Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf(uri), options);
            if (decodeFile != null) {
                imageView.setImageBitmap(decodeFile);
            }
            nativeAdView.setIconView(imageView);
        }
        MediaView mediaView = (MediaView) this.e.findViewById(b03.h.Q4);
        this.e.findViewById(b03.h.s2).setVisibility(0);
        mediaView.setVisibility(0);
        nativeAdView.setMediaView(mediaView);
        if (this.d.getCallToAction() != null) {
            TextView textView2 = (TextView) this.e.findViewById(b03.h.M4);
            textView2.setText(this.d.getCallToAction());
            nativeAdView.setCallToActionView(textView2);
        }
        if (this.d.getAdvertiser() != null) {
            TextView textView3 = (TextView) this.e.findViewById(b03.h.J4);
            textView3.setText(this.d.getAdvertiser());
            nativeAdView.setAdvertiserView(textView3);
        }
        if (this.d.getBody() != null) {
            TextView textView4 = (TextView) this.e.findViewById(b03.h.N4);
            textView4.setText(this.d.getBody());
            textView4.getViewTreeObserver().addOnGlobalLayoutListener(new a(textView4));
            nativeAdView.setBodyView(textView4);
        }
        if (this.d.getPrice() != null) {
            TextView textView5 = (TextView) this.e.findViewById(b03.h.R4);
            textView5.setText(this.d.getPrice());
            nativeAdView.setPriceView(textView5);
        }
        if (this.d.getStarRating() != null) {
            GGRatingBar gGRatingBar = (GGRatingBar) this.e.findViewById(b03.h.S4);
            gGRatingBar.setNumStars(5);
            try {
                Double starRating = this.d.getStarRating();
                c25.m(starRating);
                gGRatingBar.setRating(Float.parseFloat(String.valueOf(starRating.doubleValue())));
            } catch (Exception unused) {
                gGRatingBar.setRating(0.0f);
            }
            nativeAdView.setStarRatingView(gGRatingBar);
        }
        if (this.d.getStore() != null) {
            TextView textView6 = (TextView) this.e.findViewById(b03.h.U4);
            textView6.setText(this.d.getStore());
            nativeAdView.setStoreView(textView6);
        } else {
            ((TextView) this.e.findViewById(b03.h.U4)).setVisibility(8);
        }
        ((CloseImageView) this.e.findViewById(b03.h.L4)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.v53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a83.k(a83.this, view);
            }
        });
        nativeAdView.setNativeAd(this.d);
    }

    @NotNull
    public final Activity i() {
        return this.e;
    }
}