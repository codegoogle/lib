package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anythink.nativead.api.ATNativeAdRenderer;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.p7700g.p99005.zg3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ToponNativeSmallBanner.java */
/* loaded from: classes3.dex */
public class fh3 implements ATNativeAdRenderer<CustomNativeAd> {
    private static dh3 a;
    public List<View> b = new ArrayList();
    public View c;
    public Context d;
    public View e;
    public int f;
    private Activity g;

    public fh3(Activity context) {
        this.d = context;
        this.g = context;
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
            View inflate = LayoutInflater.from(context).inflate(zg3.g.y, (ViewGroup) null);
            this.e = inflate;
            CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
            TextView textView = (TextView) this.e.findViewById(zg3.e.f0);
            TextView textView2 = (TextView) this.e.findViewById(zg3.e.X);
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