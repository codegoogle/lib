package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.k;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class AsseblemSplashAdView extends BaseSplashAdView {
    public View a;

    public AsseblemSplashAdView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public void a_() {
        TextView textView;
        TextView textView2;
        RelativeLayout.LayoutParams layoutParams;
        TextView textView3 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_title", "id"));
        TextView textView4 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_install_btn", "id"));
        TextView textView5 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_desc", "id"));
        final FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_bg", "id"));
        final RoundImageView roundImageView2 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_icon", "id"));
        ViewGroup viewGroup = (ViewGroup) findViewById(h.a(getContext(), "myoffer_splash_container", "id"));
        TextView textView6 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_publisher_name", "id"));
        TextView textView7 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_privacy_agreement", "id"));
        TextView textView8 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_permission_manage", "id"));
        TextView textView9 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_version_name", "id"));
        this.a = textView4;
        if (!TextUtils.isEmpty(this.f.o())) {
            roundImageView2.setVisibility(0);
            roundImageView2.setNeedRadiu(true);
            roundImageView2.setRadiusInDip(3);
            int i = roundImageView2.getLayoutParams().width;
            textView2 = textView9;
            textView = textView8;
            b.a(getContext()).a(new e(1, this.f.o()), i, i, new b.a() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemSplashAdView.this.f.o())) {
                        roundImageView2.setImageBitmap(bitmap);
                    }
                }
            });
        } else {
            textView = textView8;
            textView2 = textView9;
            com.anythink.basead.ui.a.a.a(roundImageView2, this.e.m.o() == 1, this.e.m.o() == 2);
            if (this.e.m.o() == 1 && (layoutParams = (RelativeLayout.LayoutParams) roundImageView2.getLayoutParams()) != null) {
                layoutParams.rightMargin = 0;
                roundImageView2.setLayoutParams(layoutParams);
            }
        }
        this.t.add(roundImageView2);
        AppRatingView appRatingView = (AppRatingView) findViewById(h.a(getContext(), "myoffer_rating_view", "id"));
        if (appRatingView != null) {
            int A = this.f.A();
            if (A > 5) {
                appRatingView.setVisibility(0);
                appRatingView.setStarNum(5);
                appRatingView.setRating(5);
            } else if (A > 0) {
                appRatingView.setVisibility(0);
                appRatingView.setStarNum(5);
                appRatingView.setRating(A);
            } else {
                appRatingView.setVisibility(8);
            }
            this.t.add(appRatingView);
        }
        frameLayout.removeAllViews();
        final WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        wrapRoundImageView.setLayoutParams(layoutParams2);
        wrapRoundImageView.setNeedRadiu(false);
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView.setVisibility(4);
        frameLayout.addView(wrapRoundImageView, layoutParams2);
        frameLayout.setVisibility(0);
        roundImageView.setNeedRadiu(false);
        if (TextUtils.isEmpty(this.f.p())) {
            roundImageView.setBackgroundColor(Color.parseColor("#EFEFEF"));
        } else {
            b.a(getContext()).a(new e(1, this.f.p()), getResources().getDisplayMetrics().widthPixels, (getResources().getDisplayMetrics().widthPixels * 627) / IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new b.a() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, final Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemSplashAdView.this.f.p())) {
                        frameLayout.post(new Runnable() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                wrapRoundImageView.setBitmapAndResize(bitmap, frameLayout.getWidth(), frameLayout.getHeight());
                                wrapRoundImageView.setVisibility(0);
                            }
                        });
                        roundImageView.setImageBitmap(com.anythink.core.common.j.b.a(AsseblemSplashAdView.this.getContext(), bitmap));
                    }
                }
            });
            this.t.add(wrapRoundImageView);
        }
        if (!TextUtils.isEmpty(this.f.m())) {
            textView3.setText(this.f.m());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(4);
        }
        this.t.add(textView3);
        if (!TextUtils.isEmpty(this.f.r())) {
            textView4.setText(this.f.r());
        } else {
            textView4.setText(com.anythink.basead.a.e.a(getContext(), this.f));
        }
        this.t.add(textView4);
        if (textView5 != null) {
            if (!TextUtils.isEmpty(this.f.n())) {
                textView5.setText(this.f.n());
            } else {
                textView5.setVisibility(8);
            }
            this.t.add(textView5);
        }
        if (this.f.G()) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (textView6 != null) {
                textView6.setVisibility(0);
                textView6.setText(this.f.B());
                textView6.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            if (textView7 != null) {
                textView7.setVisibility(0);
                textView7.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k.b(m.a().e(), AsseblemSplashAdView.this.f.D());
                    }
                });
            }
            if (textView != null) {
                TextView textView10 = textView;
                textView10.setVisibility(0);
                textView10.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k.b(m.a().e(), AsseblemSplashAdView.this.f.E());
                    }
                });
            }
            if (textView2 != null) {
                TextView textView11 = textView2;
                textView11.setVisibility(0);
                textView11.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.f.C()));
                textView11.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public void c() {
        super.a(new Runnable() { // from class: com.anythink.basead.ui.AsseblemSplashAdView.7
            @Override // java.lang.Runnable
            public final void run() {
                AsseblemSplashAdView asseblemSplashAdView = AsseblemSplashAdView.this;
                if (asseblemSplashAdView.x == null) {
                    return;
                }
                AsseblemSplashAdView.super.h();
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public boolean d() {
        return false;
    }

    public AsseblemSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a() {
        if (this.e.m.o() == 2) {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_land", "layout"), this);
        } else {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_port", "layout"), this);
        }
        m();
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public final void a(long j) {
        if (this.e.m.n() == 0) {
            TextView textView = this.b;
            textView.setText(((j / 1000) + 1) + "s | " + this.v);
            return;
        }
        TextView textView2 = this.b;
        textView2.setText(((j / 1000) + 1) + " s");
    }
}