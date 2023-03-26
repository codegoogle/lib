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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;
import com.p7700g.p99005.zg3;
import java.util.ArrayList;

/* compiled from: Facebook_Native_Inflate.java */
/* loaded from: classes3.dex */
public class uf3 {
    private static String a = "Facebook_Native_Inflate";
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
        nativeAd.unregisterView();
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.r, (ViewGroup) null);
        viewGroup.addView(inflate);
        TextView textView = (TextView) inflate.findViewById(zg3.e.e);
        ih3.R(textView);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) a().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{a().getColor(zg3.b.c), a().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{a().getColor(zg3.b.e), a().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i));
        dh3 dh3Var2 = b;
        int i2 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i2), (int) b.getDimension(i2), (int) b.getDimension(i2), (int) b.getDimension(i2));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(zg3.e.f);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, (NativeAdLayout) inflate.findViewById(zg3.e.j0));
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        TextView textView2 = (TextView) inflate.findViewById(zg3.e.f0);
        TextView textView3 = (TextView) inflate.findViewById(zg3.e.d0);
        MediaView mediaView = (MediaView) inflate.findViewById(zg3.e.g0);
        if (nativeAd.getAdCallToAction() == null) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                textView.setText(nativeAd.getAdCallToAction());
            }
        }
        textView2.setText(nativeAd.getAdvertiserName());
        textView3.setText(nativeAd.getAdBodyText());
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView2);
        arrayList.add(textView);
        arrayList.add(mediaView);
        arrayList.add(textView3);
        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(8);
        }
        nativeAd.registerViewForInteraction(inflate, mediaView, arrayList);
    }

    public static void c(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        nativeAd.unregisterView();
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.s, (ViewGroup) null);
        viewGroup.addView(inflate);
        TextView textView = (TextView) inflate.findViewById(zg3.e.e);
        ih3.R(textView);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) a().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{a().getColor(zg3.b.c), a().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{a().getColor(zg3.b.e), a().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i));
        dh3 dh3Var2 = b;
        int i2 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i2), (int) b.getDimension(i2), (int) b.getDimension(i2), (int) b.getDimension(i2));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(zg3.e.f);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, (NativeAdLayout) inflate.findViewById(zg3.e.j0));
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        TextView textView2 = (TextView) inflate.findViewById(zg3.e.f0);
        TextView textView3 = (TextView) inflate.findViewById(zg3.e.d0);
        MediaView mediaView = (MediaView) inflate.findViewById(zg3.e.g0);
        if (nativeAd.getAdCallToAction() == null) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                textView.setText(nativeAd.getAdCallToAction());
            }
        }
        textView2.setText(nativeAd.getAdvertiserName());
        textView3.setText(nativeAd.getAdBodyText());
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView2);
        arrayList.add(textView);
        arrayList.add(mediaView);
        arrayList.add(textView3);
        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(8);
        }
        nativeAd.registerViewForInteraction(inflate, mediaView, arrayList);
    }

    public static void d(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.q, (ViewGroup) null);
        viewGroup.addView(inflate);
        CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
        int i = zg3.e.f0;
        TextView textView = (TextView) inflate.findViewById(i);
        int i2 = zg3.e.d0;
        TextView textView2 = (TextView) inflate.findViewById(i2);
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
        TextView textView3 = (TextView) inflate.findViewById(zg3.e.e);
        ih3.R(textView3);
        CardView cardView2 = (CardView) inflate.findViewById(zg3.e.z);
        cardView2.setCardBackgroundColor(a().getColor(zg3.b.e));
        cardView2.setRadius(b.getDimension(zg3.c.e));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(zg3.e.f);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, (NativeAdLayout) inflate.findViewById(zg3.e.j0));
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        TextView textView4 = (TextView) inflate.findViewById(i);
        TextView textView5 = (TextView) inflate.findViewById(i2);
        MediaView mediaView = (MediaView) inflate.findViewById(zg3.e.g0);
        if (nativeAd.getAdCallToAction() == null) {
            textView3.setVisibility(4);
        } else {
            textView3.setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                textView3.setText(nativeAd.getAdCallToAction());
            }
        }
        textView4.setText(nativeAd.getAdvertiserName());
        textView5.setText(nativeAd.getAdBodyText());
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView4);
        arrayList.add(textView3);
        arrayList.add(mediaView);
        arrayList.add(textView5);
        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(8);
        }
        nativeAd.registerViewForInteraction(inflate, mediaView, arrayList);
    }

    public static void e(Activity activity, ViewGroup viewGroup, NativeBannerAd nativeBannerAd) {
        c = activity;
        nativeBannerAd.unregisterView();
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.q, (ViewGroup) null);
        viewGroup.addView(inflate);
        TextView textView = (TextView) inflate.findViewById(zg3.e.e);
        ih3.R(textView);
        CardView cardView = (CardView) inflate.findViewById(zg3.e.z);
        cardView.setCardBackgroundColor(a().getColor(zg3.b.e));
        cardView.setRadius(b.getDimension(zg3.c.e));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(zg3.e.f);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeBannerAd, (NativeAdLayout) inflate.findViewById(zg3.e.j0));
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        TextView textView2 = (TextView) inflate.findViewById(zg3.e.f0);
        TextView textView3 = (TextView) inflate.findViewById(zg3.e.d0);
        MediaView mediaView = (MediaView) inflate.findViewById(zg3.e.g0);
        if (nativeBannerAd.getAdCallToAction() == null) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                textView.setText(nativeBannerAd.getAdCallToAction());
            }
        }
        textView2.setText(nativeBannerAd.getAdvertiserName());
        textView3.setText(nativeBannerAd.getAdBodyText());
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView2);
        arrayList.add(textView);
        arrayList.add(mediaView);
        arrayList.add(textView3);
        if (nativeBannerAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(8);
        }
        nativeBannerAd.registerViewForInteraction(inflate, mediaView, arrayList);
    }

    public static void f(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        LayoutInflater from = LayoutInflater.from(activity);
        yg3.e(bh3.E0);
        if (yg3.e(bh3.E0).equals("1")) {
            View inflate = from.inflate(zg3.g.g, (ViewGroup) null);
            viewGroup.addView(inflate);
            CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
            int i = zg3.e.f0;
            TextView textView = (TextView) inflate.findViewById(i);
            int i2 = zg3.e.U;
            TextView textView2 = (TextView) inflate.findViewById(i2);
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
            TextView textView3 = (TextView) inflate.findViewById(zg3.e.V);
            if (!yg3.e(bh3.Y).equals("")) {
                StringBuilder G = wo1.G("");
                G.append(yg3.e(bh3.Y));
                textView3.setText(G.toString());
            }
            if (!yg3.e(bh3.X).equals("")) {
                wo1.b0(bh3.X, textView3);
            }
            CardView cardView2 = (CardView) inflate.findViewById(zg3.e.z);
            cardView2.setCardBackgroundColor(a().getColor(zg3.b.e));
            cardView2.setRadius(b.getDimension(zg3.c.e));
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(zg3.e.f);
            AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, (NativeAdLayout) inflate.findViewById(zg3.e.j0));
            linearLayout.removeAllViews();
            linearLayout.addView(adOptionsView, 0);
            MediaView mediaView = (MediaView) inflate.findViewById(zg3.e.Z);
            TextView textView4 = (TextView) inflate.findViewById(i);
            MediaView mediaView2 = (MediaView) inflate.findViewById(zg3.e.c0);
            TextView textView5 = (TextView) inflate.findViewById(zg3.e.d0);
            TextView textView6 = (TextView) inflate.findViewById(i2);
            textView4.setText(nativeAd.getAdvertiserName());
            textView6.setText(nativeAd.getAdBodyText());
            textView5.setText(nativeAd.getAdSocialContext());
            if (nativeAd.getAdCallToAction() == null) {
                textView3.setVisibility(4);
            } else {
                textView3.setVisibility(0);
                if (yg3.e(bh3.Y).equals("")) {
                    textView3.setText(nativeAd.getAdCallToAction());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(textView4);
            arrayList.add(textView6);
            arrayList.add(textView3);
            arrayList.add(mediaView);
            arrayList.add(textView5);
            if (nativeAd.getAdvertiserName() == null) {
                viewGroup.setVisibility(8);
            }
            nativeAd.registerViewForInteraction(inflate, mediaView2, mediaView, arrayList);
            return;
        }
        View inflate2 = from.inflate(zg3.g.h, (ViewGroup) null);
        viewGroup.addView(inflate2);
        TextView textView7 = (TextView) inflate2.findViewById(zg3.e.e);
        if (!yg3.e(bh3.Y).equals("")) {
            StringBuilder G2 = wo1.G("");
            G2.append(yg3.e(bh3.Y));
            textView7.setText(G2.toString());
        }
        if (!yg3.e(bh3.X).equals("")) {
            wo1.b0(bh3.X, textView7);
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate2.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) a().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{a().getColor(zg3.b.c), a().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i3 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i3));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{a().getColor(zg3.b.e), a().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i3));
        dh3 dh3Var2 = b;
        int i4 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i4), (int) b.getDimension(i4), (int) b.getDimension(i4), (int) b.getDimension(i4));
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
        LinearLayout linearLayout2 = (LinearLayout) inflate2.findViewById(zg3.e.f);
        AdOptionsView adOptionsView2 = new AdOptionsView(activity, nativeAd, (NativeAdLayout) inflate2.findViewById(zg3.e.j0));
        linearLayout2.removeAllViews();
        linearLayout2.addView(adOptionsView2, 0);
        MediaView mediaView3 = (MediaView) inflate2.findViewById(zg3.e.Z);
        TextView textView8 = (TextView) inflate2.findViewById(zg3.e.f0);
        MediaView mediaView4 = (MediaView) inflate2.findViewById(zg3.e.c0);
        TextView textView9 = (TextView) inflate2.findViewById(zg3.e.d0);
        TextView textView10 = (TextView) inflate2.findViewById(zg3.e.U);
        textView8.setText(nativeAd.getAdvertiserName());
        textView10.setText(nativeAd.getAdBodyText());
        textView9.setText(nativeAd.getAdSocialContext());
        if (nativeAd.getAdCallToAction() == null) {
            textView7.setVisibility(4);
        } else {
            textView7.setVisibility(0);
            if (yg3.e(bh3.Y).equals("")) {
                textView7.setText(nativeAd.getAdCallToAction());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(textView8);
        arrayList2.add(textView10);
        arrayList2.add(textView7);
        arrayList2.add(mediaView3);
        arrayList2.add(textView9);
        if (nativeAd.getAdvertiserName() == null) {
            viewGroup.setVisibility(8);
        }
        nativeAd.registerViewForInteraction(inflate2, mediaView4, mediaView3, arrayList2);
    }
}