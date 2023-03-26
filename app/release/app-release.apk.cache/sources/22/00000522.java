package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.j.h;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class SinglePictureSplashAdView extends BaseSplashAdView {
    public SinglePictureSplashAdView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public final void a_() {
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_install_btn", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_bg", "id"));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_splash_container", "id"));
        TextView textView2 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_publisher_name", "id"));
        TextView textView3 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_privacy_agreement", "id"));
        TextView textView4 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_permission_manage", "id"));
        TextView textView5 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_version_name", "id"));
        b.a(getContext()).a(new e(1, this.f.p()), getResources().getDisplayMetrics().widthPixels, (getResources().getDisplayMetrics().widthPixels * 627) / IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new b.a() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.1
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, SinglePictureSplashAdView.this.f.p())) {
                    SinglePictureSplashAdView singlePictureSplashAdView = SinglePictureSplashAdView.this;
                    final WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureSplashAdView.findViewById(h.a(singlePictureSplashAdView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                    if (SinglePictureSplashAdView.this.e.m.h() == 2) {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        wrapRoundImageView.setImageBitmap(bitmap);
                    } else {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashAdView.this.getWidth(), SinglePictureSplashAdView.this.getHeight());
                            }
                        });
                    }
                    if (roundImageView != null) {
                        roundImageView.setImageBitmap(com.anythink.core.common.j.b.a(SinglePictureSplashAdView.this.getContext(), bitmap));
                    }
                }
            }
        });
        k kVar = this.e.m;
        if (kVar != null && textView != null) {
            if (kVar.u() != 0) {
                textView.setVisibility(0);
                if (!TextUtils.isEmpty(this.f.r())) {
                    textView.setText(this.f.r());
                } else {
                    textView.setText(com.anythink.basead.a.e.a(getContext(), this.f));
                }
                this.t.add(textView);
            } else {
                textView.setVisibility(8);
            }
        }
        if (this.f.G()) {
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(this.f.B());
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.core.common.j.k.b(m.a().e(), SinglePictureSplashAdView.this.f.D());
                    }
                });
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
                textView4.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.anythink.core.common.j.k.b(m.a().e(), SinglePictureSplashAdView.this.f.E());
                    }
                });
            }
            if (textView5 != null) {
                textView5.setVisibility(0);
                textView5.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", "string"), this.f.C()));
                textView5.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
        if (d()) {
            ShakeView shakeView = (ShakeView) findViewById(h.a(getContext(), "myoffer_shake_view", "id"));
            this.A = shakeView;
            shakeView.setVisibility(0);
            textView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public final void c() {
        super.a(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.6
            @Override // java.lang.Runnable
            public final void run() {
                SinglePictureSplashAdView singlePictureSplashAdView = SinglePictureSplashAdView.this;
                if (singlePictureSplashAdView.x == null) {
                    return;
                }
                int width = singlePictureSplashAdView.getWidth();
                int height = SinglePictureSplashAdView.this.getHeight();
                int i = (int) (SinglePictureSplashAdView.this.getResources().getDisplayMetrics().widthPixels * 0.75d);
                int i2 = (int) (SinglePictureSplashAdView.this.getResources().getDisplayMetrics().heightPixels * 0.75d);
                if (width >= i && height >= i2) {
                    SinglePictureSplashAdView.super.h();
                }
            }
        });
    }

    public SinglePictureSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a() {
        if (this.e.m.o() == 2) {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_land", "layout"), this);
        } else {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_port", "layout"), this);
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