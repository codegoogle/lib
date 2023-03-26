package com.anythink.expressad.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.r;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.google.android.gms.ads.AdError;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ATSplashView extends RelativeLayout {
    public static final String a = "webviewshow";
    public static final String b = "updateCountdown";
    private static String c = "ATSplashView";
    private int d;
    private ATSplashWebview e;
    private ViewGroup f;
    private View g;
    private View h;
    private int i;
    private boolean j;
    private boolean k;
    private ViewGroup l;
    private boolean m;
    private View n;
    private boolean o;
    private boolean p;
    private RelativeLayout.LayoutParams q;
    private SplashJSBridgeImpl r;

    public ATSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.d = getResources().getConfiguration().orientation;
    }

    private void c() {
        View view;
        View view2;
        View view3;
        if (this.h == null) {
            if (this.o && (view3 = this.n) != null) {
                if (view3.getParent() != null) {
                    r.a(this.n);
                }
                addView(this.n, new ViewGroup.LayoutParams(-1, -1));
            } else {
                ATSplashWebview aTSplashWebview = this.e;
                if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                    addView(this.e, new ViewGroup.LayoutParams(-1, -1));
                }
                d();
            }
        } else {
            if (this.f == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.d == 2) {
                this.i = s.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f.getId());
                if (this.o && (view2 = this.n) != null) {
                    if (view2.getParent() != null) {
                        r.a(this.n);
                    }
                    addView(this.n, layoutParams);
                } else {
                    ATSplashWebview aTSplashWebview2 = this.e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.e, layoutParams);
                    }
                    d();
                }
                ViewGroup viewGroup = this.f;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i = this.q.width;
                    int i2 = this.i;
                    if (i > i2 / 4) {
                        i = i2 / 4;
                    }
                    this.f.addView(this.h, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f, layoutParams2);
                }
            } else {
                this.i = s.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f.getId());
                if (this.o && (view = this.n) != null) {
                    if (view.getParent() != null) {
                        r.a(this.n);
                    }
                    addView(this.n, layoutParams3);
                } else {
                    ATSplashWebview aTSplashWebview3 = this.e;
                    if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                        addView(this.e, layoutParams3);
                    }
                    d();
                }
                ViewGroup viewGroup2 = this.f;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i3 = this.q.height;
                    int i4 = this.i;
                    if (i3 > i4 / 4) {
                        i3 = i4 / 4;
                    }
                    this.f.addView(this.h, -1, i3);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i3);
                    layoutParams4.addRule(12);
                    addView(this.f, layoutParams4);
                }
            }
        }
        View view4 = this.g;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(s.b(getContext(), 100.0f), s.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = s.b(getContext(), 10.0f);
                layoutParams5.topMargin = s.b(getContext(), 10.0f);
                addView(this.g, layoutParams5);
                return;
            }
            bringChildToFront(this.g);
        }
    }

    private void d() {
        ATSplashWebview aTSplashWebview = this.e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.r);
            this.e.post(new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        n.a(ATSplashView.c, "webviewshow");
                        int[] iArr = new int[2];
                        ATSplashView.this.e.getLocationOnScreen(iArr);
                        String str = ATSplashView.c;
                        n.d(str, "coordinate:" + iArr[0] + "--" + iArr[1]);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("startX", s.a(m.a().e(), (float) iArr[0]));
                        jSONObject.put("startY", s.a(m.a().e(), (float) iArr[1]));
                        String jSONObject2 = jSONObject.toString();
                        int[] iArr2 = new int[2];
                        ATSplashView.this.e.getLocationInWindow(iArr2);
                        ATSplashView.transInfoForMraid(ATSplashView.this.e, iArr2[0], iArr2[1], ATSplashView.this.e.getWidth(), ATSplashView.this.e.getHeight());
                        String encodeToString = Base64.encodeToString(jSONObject2.toString().getBytes(), 2);
                        j.a();
                        j.a((WebView) ATSplashView.this.e, "webviewshow", encodeToString);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        n.d(c, "transInfoForMraid");
        try {
            int i5 = m.a().e().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i5 == 2 ? "landscape" : i5 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float e = com.anythink.expressad.foundation.h.j.e(m.a().e());
            float f = com.anythink.expressad.foundation.h.j.f(m.a().e());
            HashMap g = com.anythink.expressad.foundation.h.j.g(m.a().e());
            int intValue = ((Integer) g.get("width")).intValue();
            int intValue2 = ((Integer) g.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.a, "Interstitial");
            hashMap.put(CallMraidJS.b, "default");
            hashMap.put(CallMraidJS.c, "true");
            hashMap.put(CallMraidJS.d, jSONObject);
            float f2 = i;
            float f3 = i2;
            float f4 = i3;
            float f5 = i4;
            CallMraidJS.getInstance().fireSetDefaultPosition(webView, f2, f3, f4, f5);
            CallMraidJS.getInstance().fireSetCurrentPosition(webView, f2, f3, f4, f5);
            CallMraidJS.getInstance().fireSetScreenSize(webView, e, f);
            CallMraidJS.getInstance().fireSetMaxSize(webView, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(webView, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(webView);
        } catch (Throwable th) {
            n.b(c, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.g;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.m = false;
        this.k = false;
        this.j = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ATSplashWebview aTSplashWebview = this.e;
        if (aTSplashWebview == null || aTSplashWebview.isDestroyed()) {
            return;
        }
        this.e.release();
        SplashJsUtils.sendEventToH5(this.e, "onSystemDestory", "");
    }

    public View getCloseView() {
        return this.g;
    }

    public ViewGroup getDevContainer() {
        return this.l;
    }

    public View getIconVg() {
        return this.h;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.r;
    }

    public ATSplashWebview getSplashWebview() {
        return this.e;
    }

    public boolean isAttach() {
        return this.p;
    }

    public boolean isDynamicView() {
        return this.o;
    }

    public boolean isH5Ready() {
        return this.j;
    }

    public boolean isImageReady() {
        return this.m;
    }

    public boolean isVideoReady() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.n;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.n;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.k = false;
        this.j = false;
    }

    public void setCloseView(View view) {
        this.g = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.l = viewGroup;
    }

    public void setDynamicView(boolean z) {
        this.o = z;
    }

    public void setH5Ready(boolean z) {
        this.j = z;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.h = view;
        this.q = layoutParams;
    }

    public void setImageReady(boolean z) {
        this.m = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        View view = this.n;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setNotchPadding(i, i2, i3, i4);
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.r = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.n = view;
        }
    }

    public void setSplashWebview(ATSplashWebview aTSplashWebview) {
        this.e = aTSplashWebview;
        SplashJSBridgeImpl splashJSBridgeImpl = this.r;
        if (splashJSBridgeImpl != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setVideoReady(boolean z) {
        this.k = z;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        if (this.r != null && (viewGroup = this.l) != null && (viewGroup.getContext() instanceof Activity)) {
            this.r.updateContext(this.l.getContext());
        }
        if (this.h == null) {
            if (this.o && (view3 = this.n) != null) {
                if (view3.getParent() != null) {
                    r.a(this.n);
                }
                addView(this.n, new ViewGroup.LayoutParams(-1, -1));
            } else {
                ATSplashWebview aTSplashWebview = this.e;
                if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                    addView(this.e, new ViewGroup.LayoutParams(-1, -1));
                }
                d();
            }
        } else {
            if (this.f == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.d == 2) {
                this.i = s.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f.getId());
                if (this.o && (view2 = this.n) != null) {
                    if (view2.getParent() != null) {
                        r.a(this.n);
                    }
                    addView(this.n, layoutParams);
                } else {
                    ATSplashWebview aTSplashWebview2 = this.e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.e, layoutParams);
                    }
                    d();
                }
                ViewGroup viewGroup2 = this.f;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i = this.q.width;
                    int i2 = this.i;
                    if (i > i2 / 4) {
                        i = i2 / 4;
                    }
                    this.f.addView(this.h, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f, layoutParams2);
                }
            } else {
                this.i = s.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f.getId());
                if (this.o && (view = this.n) != null) {
                    if (view.getParent() != null) {
                        r.a(this.n);
                    }
                    addView(this.n, layoutParams3);
                } else {
                    ATSplashWebview aTSplashWebview3 = this.e;
                    if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                        addView(this.e, layoutParams3);
                    }
                    d();
                }
                ViewGroup viewGroup3 = this.f;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i3 = this.q.height;
                    int i4 = this.i;
                    if (i3 > i4 / 4) {
                        i3 = i4 / 4;
                    }
                    this.f.addView(this.h, -1, i3);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i3);
                    layoutParams4.addRule(12);
                    addView(this.f, layoutParams4);
                }
            }
        }
        View view4 = this.g;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(s.b(getContext(), 100.0f), s.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = s.b(getContext(), 10.0f);
                layoutParams5.topMargin = s.b(getContext(), 10.0f);
                addView(this.g, layoutParams5);
            } else {
                bringChildToFront(this.g);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i) {
        View view;
        if (this.e != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.d.a.b.dk, i);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                j.a();
                j.a((WebView) this.e, b, encodeToString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (this.o && (view = this.n) != null && (view instanceof ATSplashNativeView)) {
                ((ATSplashNativeView) view).updateCountDown(i);
            }
        }
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}