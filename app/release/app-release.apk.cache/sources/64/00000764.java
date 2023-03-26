package com.anythink.expressad.atsignalcommon.a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.n;

/* loaded from: classes2.dex */
public class a implements com.anythink.expressad.atsignalcommon.windvane.c {
    public static final String a = "RVWindVaneWebView";

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(Object obj) {
        n.a(a, "getEndScreenInfo");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void loadingResourceStatus(WebView webView, int i) {
        n.a(a, "loadingResourceStatus");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onPageFinished(WebView webView, String str) {
        n.a(a, "onPageFinished");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        n.a(a, "onPageStarted");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onProgressChanged(WebView webView, int i) {
        n.a(a, "onProgressChanged");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        n.a(a, "onReceivedError");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        n.a(a, "onReceivedSslError");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public void readyState(WebView webView, int i) {
        n.a(a, "readyState");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        n.a(a, "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(String str, int i, int i2) {
        n.a(a, "loadAds");
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public String a(String str) {
        n.a(a, "getFileInfo");
        return "{}";
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(Object obj, String str) {
        n.a(a, "operateComponent");
    }
}