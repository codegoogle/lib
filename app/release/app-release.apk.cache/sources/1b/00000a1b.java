package com.anythink.expressad.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.g;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.j20;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkClickMiniCardView extends AnythinkH5EndCardView {
    private static final float z = 0.7f;
    private boolean A;

    public AnythinkClickMiniCardView(Context context) {
        super(context);
        this.A = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        c cVar = this.b_;
        if (cVar != null) {
            c.C0061c L = cVar.L();
            String d = L != null ? L.d() : null;
            if (TextUtils.isEmpty(d) || !d.contains(j20.w)) {
                return d;
            }
            String c = g.a().c(d);
            return !TextUtils.isEmpty(c) ? c : d;
        }
        return null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    @e2(api = 11)
    public final void e() {
        super.e();
        if (this.f_) {
            setBackgroundResource(findColor("anythink_reward_minicard_bg"));
            a(this.o);
            setClickable(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    @e2(api = 11)
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f_) {
            a(this.o);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i, int i2) {
        View findViewById = ((Activity) this.a_).getWindow().findViewById(16908290);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i <= 0 || i2 <= 0 || i > width || i2 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.o.setLayoutParams(layoutParams);
    }

    public void setAnythinkClickMiniCardViewClickable(boolean z2) {
        setClickable(z2);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.A = true;
        resizeMiniCard(i3, i4);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(s.b(getContext(), i));
            gradientDrawable.setColor(-1);
            this.r.setBackground(gradientDrawable);
            this.r.setClipToOutline(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.r;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        n.a(AnythinkBaseView.TAG, "webviewshow");
                        int[] iArr = new int[2];
                        AnythinkClickMiniCardView.this.r.getLocationOnScreen(iArr);
                        n.d(AnythinkBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("startX", s.a(m.a().e(), (float) iArr[0]));
                        jSONObject.put("startY", s.a(m.a().e(), (float) iArr[1]));
                        String encodeToString = Base64.encodeToString(jSONObject.toString().toString().getBytes(), 2);
                        j.a();
                        j.a((WebView) AnythinkClickMiniCardView.this.r, "webviewshow", encodeToString);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public AnythinkClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = false;
    }

    @e2(api = 11)
    private void a(View view) {
        int f = s.f(this.a_);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((f * 0.7f) + 0.5f);
        layoutParams.height = (int) ((s.e(this.a_) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }
}