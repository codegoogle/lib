package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbk implements Runnable {
    public final ValueCallback zza;
    public final /* synthetic */ zzbbc zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzbbm zze;

    public zzbbk(zzbbm zzbbmVar, final zzbbc zzbbcVar, final WebView webView, final boolean z) {
        this.zze = zzbbmVar;
        this.zzb = zzbbcVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbbj
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzbbk zzbbkVar = zzbbk.this;
                zzbbc zzbbcVar2 = zzbbcVar;
                WebView webView2 = webView;
                boolean z2 = z;
                zzbbkVar.zze.zzd(zzbbcVar2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}