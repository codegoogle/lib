package com.anythink.basead.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.common.e.a.b;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.h;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ThirdPartySplashAdView extends AsseblemSplashAdView {
    public ThirdPartySplashAdView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.AsseblemSplashAdView, com.anythink.basead.ui.BaseSplashAdView
    public final void a_() {
        super.a_();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.t.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (this.f.H() != null) {
            View H = this.f.H();
            if (H.getParent() != null) {
                ((ViewGroup) H.getParent()).removeView(H);
            }
            frameLayout2.addView(H, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.anythink.basead.ui.AsseblemSplashAdView, com.anythink.basead.ui.BaseSplashAdView
    public final void c() {
    }

    @Override // com.anythink.basead.ui.AsseblemSplashAdView, com.anythink.basead.ui.BaseSplashAdView
    public final boolean d() {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public final void n() {
    }

    public void registerNativeClickListener(View view) {
        if (this.f instanceof b) {
            if (this.e.m.u() == 0) {
                this.t.add(this);
                ((b) this.f).a(view, this.t);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(((AsseblemSplashAdView) this).a);
            ((b) this.f).a(view, arrayList);
        }
    }

    public ThirdPartySplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
    }
}