package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpq;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@e2(api = 21)
/* loaded from: classes2.dex */
public final class H5AdsWebViewClient extends zzbpd {
    private final zzbpq zza;

    public H5AdsWebViewClient(@x1 Context context, @x1 WebView webView) {
        this.zza = new zzbpq(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @x1
    public WebViewClient getDelegate() {
        return this.zza;
    }

    @z1
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@z1 WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}