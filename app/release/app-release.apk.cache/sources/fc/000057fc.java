package com.p7700g.p99005;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.p7700g.p99005.zg3;

/* compiled from: Admob_Native_Inflate.java */
/* loaded from: classes3.dex */
public class qf3 {
    private static String a = "Admob_Native_Inflate";
    private static dh3 b;
    private static Activity c;

    private static Resources a() {
        if (b == null) {
            b = new dh3(c.getResources());
        }
        return b;
    }

    public static void b(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.o, (ViewGroup) null);
        viewGroup.addView(inflate);
        int i = zg3.e.e;
        ih3.R((TextView) inflate.findViewById(i));
        int i2 = zg3.e.g;
        Resources a2 = a();
        int i3 = zg3.b.a;
        ((TextView) inflate.findViewById(i2)).setTextColor(a2.getColor(i3));
        int i4 = zg3.e.d;
        ((TextView) inflate.findViewById(i4)).setTextColor(a().getColor(i3));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) a().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{a().getColor(zg3.b.c), a().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i5 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i5));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{a().getColor(zg3.b.e), a().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i5));
        dh3 dh3Var2 = b;
        int i6 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i6), (int) b.getDimension(i6), (int) b.getDimension(i6), (int) b.getDimension(i6));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(zg3.e.A0);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(zg3.e.h));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(i2));
        nativeAdView.setBodyView(nativeAdView.findViewById(i4));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(i));
        nativeAdView.setIconView(nativeAdView.findViewById(zg3.e.c));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }
        if (nativeAd.getIcon() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    public static void c(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.p, (ViewGroup) null);
        viewGroup.addView(inflate);
        int i = zg3.e.e;
        TextView textView = (TextView) inflate.findViewById(i);
        if (!yg3.e(bh3.Y).equals("")) {
            StringBuilder G = wo1.G("");
            G.append(yg3.e(bh3.Y));
            textView.setText(G.toString());
        }
        if (!yg3.e(bh3.X).equals("")) {
            wo1.b0(bh3.X, textView);
        }
        int i2 = zg3.e.g;
        Resources a2 = a();
        int i3 = zg3.b.a;
        ((TextView) inflate.findViewById(i2)).setTextColor(a2.getColor(i3));
        int i4 = zg3.e.d;
        ((TextView) inflate.findViewById(i4)).setTextColor(a().getColor(i3));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) a().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{a().getColor(zg3.b.c), a().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i5 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i5));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{a().getColor(zg3.b.e), a().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i5));
        dh3 dh3Var2 = b;
        int i6 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i6), (int) b.getDimension(i6), (int) b.getDimension(i6), (int) b.getDimension(i6));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(zg3.e.A0);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(zg3.e.h));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(i2));
        nativeAdView.setBodyView(nativeAdView.findViewById(i4));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(i));
        nativeAdView.setIconView(nativeAdView.findViewById(zg3.e.c));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }
        if (nativeAd.getIcon() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    public static void d(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.n, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        CardView cardView = (CardView) inflate.findViewById(zg3.e.z);
        cardView.setCardBackgroundColor(a().getColor(zg3.b.e));
        cardView.setRadius(b.getDimension(zg3.c.e));
        CardView cardView2 = (CardView) inflate.findViewById(zg3.e.y);
        int i = zg3.e.g;
        TextView textView = (TextView) inflate.findViewById(i);
        int i2 = zg3.e.d;
        TextView textView2 = (TextView) inflate.findViewById(i2);
        Resources a2 = a();
        int i3 = zg3.b.a;
        textView.setTextColor(a2.getColor(i3));
        textView2.setTextColor(a().getColor(i3));
        if (yg3.e(bh3.N0).equals("")) {
            cardView2.setCardBackgroundColor(Color.parseColor("#00000000"));
            cardView2.setCardElevation(0.0f);
            cardView2.setMaxCardElevation(0.0f);
            if (!yg3.e(bh3.O0).equals("")) {
                wo1.b0(bh3.O0, textView);
                wo1.b0(bh3.O0, textView2);
            }
        } else {
            cardView2.setCardBackgroundColor(Color.parseColor(yg3.e(bh3.N0)));
            wo1.b0(bh3.O0, textView);
            wo1.b0(bh3.O0, textView2);
        }
        int i4 = zg3.e.e;
        ih3.R((TextView) inflate.findViewById(i4));
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(zg3.e.A0);
        nativeAdView.setHeadlineView(nativeAdView.findViewById(i));
        nativeAdView.setBodyView(nativeAdView.findViewById(i2));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(i4));
        nativeAdView.setIconView(nativeAdView.findViewById(zg3.e.c));
        nativeAdView.setPriceView(nativeAdView.findViewById(zg3.e.i));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(zg3.e.j));
        nativeAdView.setStoreView(nativeAdView.findViewById(zg3.e.k));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(zg3.e.b));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }
        if (nativeAd.getIcon() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.getStarRating() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    public static void e(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        View inflate;
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        LayoutInflater from = LayoutInflater.from(activity);
        yg3.e(bh3.E0);
        if (yg3.e(bh3.E0).equals("1")) {
            inflate = from.inflate(zg3.g.e, (ViewGroup) null);
            CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
            TextView textView = (TextView) inflate.findViewById(zg3.e.g);
            Resources a2 = a();
            int i = zg3.b.a;
            textView.setTextColor(a2.getColor(i));
            TextView textView2 = (TextView) inflate.findViewById(zg3.e.d);
            textView2.setTextColor(a().getColor(i));
            if (yg3.e(bh3.N0).equals("")) {
                cardView.setCardBackgroundColor(Color.parseColor("#00000000"));
                cardView.setCardElevation(0.0f);
                cardView.setMaxCardElevation(0.0f);
                if (!yg3.e(bh3.O0).equals("")) {
                    wo1.b0(bh3.O0, textView);
                    wo1.b0(bh3.O0, textView2);
                }
            } else {
                cardView.setCardBackgroundColor(Color.parseColor(yg3.e(bh3.N0)));
                wo1.b0(bh3.O0, textView);
                wo1.b0(bh3.O0, textView2);
            }
        } else {
            inflate = from.inflate(zg3.g.f, (ViewGroup) null);
        }
        viewGroup.addView(inflate);
        int i2 = zg3.e.e;
        TextView textView3 = (TextView) inflate.findViewById(i2);
        if (!yg3.e(bh3.Y).equals("")) {
            StringBuilder G = wo1.G("");
            G.append(yg3.e(bh3.Y));
            textView3.setText(G.toString());
        }
        if (!yg3.e(bh3.X).equals("")) {
            wo1.b0(bh3.X, textView3);
        }
        int i3 = zg3.e.g;
        Resources a3 = a();
        int i4 = zg3.b.a;
        ((TextView) inflate.findViewById(i3)).setTextColor(a3.getColor(i4));
        int i5 = zg3.e.d;
        ((TextView) inflate.findViewById(i5)).setTextColor(a().getColor(i4));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) a().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{a().getColor(zg3.b.c), a().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i6 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i6));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{a().getColor(zg3.b.e), a().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i6));
        dh3 dh3Var2 = b;
        int i7 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i7), (int) b.getDimension(i7), (int) b.getDimension(i7), (int) b.getDimension(i7));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        if (direction.equals(bh3.Y0)) {
            if (yg3.e(bh3.C0).equals("1")) {
                tg3.d(sg3.FadeIn).m(1000L).w(6).v(relativeLayout);
            } else if (yg3.e(bh3.C0).equals("2")) {
                tg3.d(sg3.Bounce).m(1000L).w(6).v(relativeLayout);
            } else if (yg3.e(bh3.C0).equals("3")) {
                tg3.d(sg3.Shake).m(1000L).w(6).v(relativeLayout);
            }
        }
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(zg3.e.A0);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(zg3.e.h));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(i3));
        nativeAdView.setBodyView(nativeAdView.findViewById(i5));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(i2));
        nativeAdView.setIconView(nativeAdView.findViewById(zg3.e.c));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        }
        if (nativeAd.getIcon() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }
}