package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@e2(api = 21)
/* loaded from: classes2.dex */
public final class zzbpq extends zzbpd {
    public static final /* synthetic */ int zza = 0;
    @z1
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbpq(Context context, final WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        zzfou.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbpp
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i = zzbpq.zza;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        zzcfi.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @z1
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @e2(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzc(this.zzd)) {
            if (this.zzc.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@z1 WebViewClient webViewClient) {
        zzfou.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (zzc(webView)) {
            if (this.zzc.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }
}