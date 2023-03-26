package com.anythink.expressad.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.advanced.d.c;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.atsignalcommon.base.b;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.kg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class a extends b {
    public String a;
    public com.anythink.expressad.advanced.d.a b;
    private final String c = "NativeAdvancedWebViewClient";
    private c d;

    public a(String str, com.anythink.expressad.advanced.d.a aVar, c cVar) {
        this.a = str;
        this.b = aVar;
        this.d = cVar;
    }

    private WebResourceResponse a(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z = false;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && "mb-h5".equals(parse.getScheme())) {
            z = true;
        }
        if (!z || this.d == null) {
            return null;
        }
        String a = this.d.a(URLDecoder.decode(Uri.parse(str).getQueryParameter(kg.m.a.e)));
        try {
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            n.a("webviewclient", "relace url".concat(String.valueOf(a)));
            if (a.contains("127.0.0.1") || a.startsWith("http")) {
                return null;
            }
            return new WebResourceResponse("video/mp4", "utf-8", new FileInputStream(a));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean b(String str) {
        Uri parse;
        return (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || !"mb-h5".equals(parse.getScheme())) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.anythink.expressad.d.b.a.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.view.a.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            n.b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        n.a("NativeAdvancedWebViewClient", "============shouldInterceptRequest:".concat(String.valueOf(str)));
        return a(str);
    }

    @Override // com.anythink.expressad.atsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.a.b.a.c) {
                    windVaneWebView.getUrl();
                    int i = com.anythink.expressad.a.b.a.b;
                    if (com.anythink.expressad.a.b.a.a(((NativeAdvancedJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0))) {
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            n.d("NativeAdvancedWebViewClient", "Use html to open url.");
            com.anythink.expressad.advanced.d.a aVar = this.b;
            if (aVar != null) {
                aVar.a(str);
                return true;
            }
            return true;
        } catch (Throwable th) {
            n.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl().toString());
    }

    public final void a() {
        if (this.d != null) {
            this.d = null;
        }
    }
}