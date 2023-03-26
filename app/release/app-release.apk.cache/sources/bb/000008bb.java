package com.anythink.expressad.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.base.BaseWebView;
import com.anythink.expressad.atsignalcommon.base.b;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends b {
    public String a;
    public List<c> b;
    public com.anythink.expressad.mbbanner.a.c.a c;
    private final String d = "BannerWebViewClient";

    public a(String str, List<c> list, com.anythink.expressad.mbbanner.a.c.a aVar) {
        this.a = str;
        this.b = list;
        this.c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.anythink.expressad.d.b.a.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.view.a.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            n.b("BannerWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            n.d("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.anythink.expressad.a.b.a.c) {
                baseWebView.getUrl();
                int i = com.anythink.expressad.a.b.a.b;
                if (com.anythink.expressad.a.b.a.a(this.b.get(0))) {
                    return false;
                }
            }
            if (this.b.size() > 1) {
                m.a().e().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.c;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable th) {
            n.b("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}