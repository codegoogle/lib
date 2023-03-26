package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class OA extends WebViewClient {
    public final /* synthetic */ C0924Qe A00;

    public OA(C0924Qe c0924Qe) {
        this.A00 = c0924Qe;
    }

    public /* synthetic */ OA(C0924Qe c0924Qe, C0929Qj c0929Qj) {
        this(c0924Qe);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        JL jl;
        jl = this.A00.A09;
        jl.A03(JK.A0R, null);
        this.A00.A0O();
        this.A00.A03 = true;
        this.A00.A0F();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        JL jl;
        String str;
        O7 o7;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.A00.A0O();
        jl = this.A00.A09;
        jl.A03(JK.A0Q, null);
        if (Build.VERSION.SDK_INT >= 23) {
            str = webResourceError.getDescription().toString();
        } else {
            str = "";
        }
        o7 = this.A00.A0F;
        o7.A05(C04848i.A0s, str);
    }
}