package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public interface zzcli extends com.google.android.gms.ads.internal.client.zza, zzdjg, zzckz, zzbrd, zzcmf, zzcmj, zzbrq, zzban, zzcmn, com.google.android.gms.ads.internal.zzl, zzcmq, zzcmr, zzchr, zzcms {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzchr
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzchr
    void zzE(zzcme zzcmeVar);

    @Override // com.google.android.gms.internal.ads.zzckz
    zzfbl zzF();

    Context zzG();

    @Override // com.google.android.gms.internal.ads.zzcms
    View zzH();

    WebView zzI();

    WebViewClient zzJ();

    @Override // com.google.android.gms.internal.ads.zzcmq
    zzaoc zzK();

    zzbca zzL();

    zzbko zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    zzcmv zzP();

    @Override // com.google.android.gms.internal.ads.zzcmp
    zzcmx zzQ();

    @Override // com.google.android.gms.internal.ads.zzcmf
    zzfbo zzR();

    IObjectWrapper zzS();

    zzfvl zzT();

    String zzU();

    void zzV(zzfbl zzfblVar, zzfbo zzfboVar);

    void zzW();

    void zzX();

    void zzY(int i);

    void zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa();

    void zzab(boolean z);

    void zzac();

    void zzad(String str, String str2, String str3);

    void zzae();

    void zzaf(String str, zzbom zzbomVar);

    void zzag();

    void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzai(zzcmx zzcmxVar);

    void zzaj(zzbca zzbcaVar);

    void zzak(boolean z);

    void zzal();

    void zzam(Context context);

    void zzan(boolean z);

    void zzao(zzbkm zzbkmVar);

    void zzap(boolean z);

    void zzaq(zzbko zzbkoVar);

    void zzar(IObjectWrapper iObjectWrapper);

    void zzas(int i);

    void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzau(boolean z);

    void zzav(boolean z);

    void zzaw(String str, zzbom zzbomVar);

    void zzax(String str, Predicate predicate);

    boolean zzay();

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    Activity zzk();

    @Override // com.google.android.gms.internal.ads.zzchr
    com.google.android.gms.ads.internal.zza zzm();

    @Override // com.google.android.gms.internal.ads.zzchr
    zzbim zzo();

    @Override // com.google.android.gms.internal.ads.zzcmr, com.google.android.gms.internal.ads.zzchr
    zzcfo zzp();

    @Override // com.google.android.gms.internal.ads.zzchr
    zzcme zzs();

    @Override // com.google.android.gms.internal.ads.zzchr
    void zzv(String str, zzcju zzcjuVar);
}