package com.anythink.core.basead.ui.web;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public final class a extends WebViewClient {
    private WebLandPageActivity a;

    public a(WebLandPageActivity webLandPageActivity) {
        this.a = webLandPageActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.b(webView.canGoBack());
        this.a.a(webView.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebProgressBarView a = this.a.a();
        if (a != null) {
            a.setVisibility(0);
            a.setProgress(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    @e2(26)
    public final boolean onRenderProcessGone(@z1 WebView webView, @z1 RenderProcessGoneDetail renderProcessGoneDetail) {
        this.a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && !"about:blank".equals(str)) {
            if (com.anythink.core.basead.a.a.a(webView.getContext(), str, false)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme().equals("intent")) {
                    try {
                        String stringExtra = Intent.parseUri(str, 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                            webView.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!parse.getScheme().equals("http")) {
                    if (!parse.getScheme().equals("https")) {
                        return true;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }
}