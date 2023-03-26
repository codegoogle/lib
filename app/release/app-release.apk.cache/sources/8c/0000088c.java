package com.anythink.expressad.mbbanner.a.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.google.android.gms.ads.AdError;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private static final String a = "BannerCallJS";

    private static void a(WebView webView) {
        n.d(a, "fireOnJSBridgeConnected");
        j.a();
        j.b(webView);
    }

    private static void a(WebView webView, float f, float f2) {
        n.d(a, "fireOnBannerWebViewShow");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f2);
            jSONObject.put("scale", s.c(m.a().e()));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            j.a();
            j.a(webView, "webviewshow", encodeToString);
        } catch (Throwable th) {
            n.b(a, "fireOnBannerWebViewShow", th);
        }
    }

    private static void a(WebView webView, int i, int i2) {
        n.d(a, "fireOnBannerViewSizeChange");
        try {
            CallMraidJS.getInstance().fireSizeChangeEvent(webView, i, i2);
        } catch (Throwable th) {
            n.b(a, "fireOnBannerViewSizeChange", th);
        }
    }

    private static void a(WindVaneWebView windVaneWebView, boolean z) {
        try {
            CallMraidJS.getInstance().fireSetIsViewable(windVaneWebView, z ? "true" : "false");
        } catch (Throwable th) {
            n.b(a, "fireMraidIsViewable", th);
        }
    }

    private static void a(WebView webView, int i, int i2, int i3, int i4) {
        n.d(a, "transInfoForMraid");
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
            hashMap.put(CallMraidJS.a, CallMraidJS.k);
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
            n.b(a, "transInfoForMraid", th);
        }
    }
}