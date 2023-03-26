package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.nativead.api.ATNativeAdRenderer;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.p7700g.p99005.zg3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ToponNativeSmallTop.java */
/* loaded from: classes3.dex */
public class hh3 implements ATNativeAdRenderer<CustomNativeAd> {
    private static dh3 a;
    public List<View> b = new ArrayList();
    public View c;
    public Context d;
    public View e;
    public int f;
    private Activity g;
    private String h;

    public hh3(Activity context, String mdirection) {
        this.d = context;
        this.g = context;
        this.h = mdirection;
    }

    private Resources b() {
        if (a == null) {
            a = new dh3(this.g.getResources());
        }
        return a;
    }

    public List<View> a() {
        return this.b;
    }

    @Override // com.anythink.nativead.api.ATNativeAdRenderer
    /* renamed from: c */
    public void renderAdView(View view, CustomNativeAd customNativeAd) {
        this.b.clear();
        TextView textView = (TextView) view.findViewById(zg3.e.f0);
        TextView textView2 = (TextView) view.findViewById(zg3.e.X);
        TextView textView3 = (TextView) view.findViewById(zg3.e.Y);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(zg3.e.a0);
        TextView textView4 = (TextView) view.findViewById(zg3.e.e);
        ih3.R(textView4);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) b().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{b().getColor(zg3.b.c), b().getColor(zg3.b.b)});
        dh3 dh3Var = a;
        int i = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{b().getColor(zg3.b.e), b().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(a.getDimension(i));
        dh3 dh3Var2 = a;
        int i2 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i2), (int) a.getDimension(i2), (int) a.getDimension(i2), (int) a.getDimension(i2));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        ATNativeImageView aTNativeImageView = (ATNativeImageView) view.findViewById(zg3.e.b0);
        customNativeAd.setExtraInfo(new CustomNativeAd.ExtraInfo.Builder().setCloseView(this.c).build());
        textView.setText("");
        textView2.setText("");
        textView4.setText("");
        textView3.setText("");
        textView.setText("");
        frameLayout.removeAllViews();
        aTNativeImageView.setImageDrawable(null);
        String adType = customNativeAd.getAdType();
        adType.hashCode();
        if (!adType.equals("1")) {
            adType.equals("2");
        }
        if (customNativeAd.isNativeExpress()) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            aTNativeImageView.setVisibility(8);
            frameLayout.setVisibility(8);
            View view2 = this.c;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView4.setVisibility(0);
        aTNativeImageView.setVisibility(0);
        frameLayout.setVisibility(0);
        View view3 = this.c;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View adIconView = customNativeAd.getAdIconView();
        ATNativeImageView aTNativeImageView2 = new ATNativeImageView(this.d);
        if (adIconView == null) {
            frameLayout.addView(aTNativeImageView2);
            aTNativeImageView2.setImage(customNativeAd.getIconImageUrl());
            this.b.add(aTNativeImageView2);
        } else {
            frameLayout.addView(adIconView);
        }
        if (!TextUtils.isEmpty(customNativeAd.getAdChoiceIconUrl())) {
            aTNativeImageView.setImage(customNativeAd.getAdChoiceIconUrl());
        }
        textView.setText(customNativeAd.getTitle());
        textView2.setText(customNativeAd.getDescriptionText());
        if (yg3.e(bh3.Y).equals("")) {
            textView4.setText(customNativeAd.getCallToActionText());
        }
        if (!TextUtils.isEmpty(customNativeAd.getAdFrom())) {
            textView3.setText(customNativeAd.getAdFrom() != null ? customNativeAd.getAdFrom() : "");
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        this.b.add(textView);
        this.b.add(textView2);
        this.b.add(textView4);
    }

    @Override // com.anythink.nativead.api.ATNativeAdRenderer
    public View createView(Context context, int i) {
        if (this.e == null) {
            this.e = LayoutInflater.from(context).inflate(zg3.g.A, (ViewGroup) null);
        }
        this.f = i;
        if (this.e.getParent() != null) {
            ((ViewGroup) this.e.getParent()).removeView(this.e);
        }
        return this.e;
    }

    public void d(ImageView imageView) {
        this.c = imageView;
    }
}