package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface zzbxp {
    @z1
    IObjectWrapper zza(String str, WebView webView, String str2, String str3, @z1 String str4, zzbxr zzbxrVar, zzbxq zzbxqVar, @z1 String str5);

    @z1
    IObjectWrapper zzb(String str, WebView webView, String str2, String str3, @z1 String str4, String str5, zzbxr zzbxrVar, zzbxq zzbxqVar, @z1 String str6);

    void zzc(IObjectWrapper iObjectWrapper, View view);

    void zzd(IObjectWrapper iObjectWrapper);

    boolean zze(Context context);
}