package com.anythink.expressad.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;

/* loaded from: classes2.dex */
public final class b extends com.anythink.expressad.atsignalcommon.base.b {
    public String a;
    public com.anythink.expressad.splash.d.a b;
    private final String c = "SplashWebViewClient";

    public b(String str, com.anythink.expressad.splash.d.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.anythink.expressad.d.b.a.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.view.b.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            n.b("SplashWebViewClient", "onPageStarted", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.a.b.a.c) {
                windVaneWebView.getUrl();
                int i = com.anythink.expressad.a.b.a.b;
                if (com.anythink.expressad.a.b.a.a(((SplashJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0))) {
                    return false;
                }
            }
            n.d("SplashWebViewClient", "Use html to open url.");
            com.anythink.expressad.splash.d.a aVar = this.b;
            if (aVar != null) {
                aVar.b(str);
                return true;
            }
            return true;
        } catch (Throwable th) {
            n.b("SplashWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}