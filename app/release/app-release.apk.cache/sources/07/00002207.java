package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.foundation.g.a;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzfnw;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzcmb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcli {
    public static final /* synthetic */ int zza = 0;
    @GuardedBy("this")
    private boolean zzA;
    @GuardedBy("this")
    private boolean zzB;
    @GuardedBy("this")
    private zzbko zzC;
    @GuardedBy("this")
    private zzbkm zzD;
    @GuardedBy("this")
    private zzbca zzE;
    @GuardedBy("this")
    private int zzF;
    @GuardedBy("this")
    private int zzG;
    private zzbil zzH;
    private final zzbil zzI;
    private zzbil zzJ;
    private final zzbim zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    @GuardedBy("this")
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbdm zzX;
    private final zzcmw zzb;
    private final zzaoc zzc;
    private final zzbiy zzd;
    private final zzcfo zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbl zzj;
    private zzfbo zzk;
    private boolean zzl;
    private boolean zzm;
    private zzclp zzn;
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    @GuardedBy("this")
    private IObjectWrapper zzp;
    @GuardedBy("this")
    private zzcmx zzq;
    @GuardedBy("this")
    private final String zzr;
    @GuardedBy("this")
    private boolean zzs;
    @GuardedBy("this")
    private boolean zzt;
    @GuardedBy("this")
    private boolean zzu;
    @GuardedBy("this")
    private boolean zzv;
    @GuardedBy("this")
    private Boolean zzw;
    @GuardedBy("this")
    private boolean zzx;
    @GuardedBy("this")
    private final String zzy;
    @GuardedBy("this")
    private zzcme zzz;

    @VisibleForTesting
    public zzcmb(zzcmw zzcmwVar, zzcmx zzcmxVar, String str, boolean z, boolean z2, zzaoc zzaocVar, zzbiy zzbiyVar, zzcfo zzcfoVar, zzbio zzbioVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, zzfbl zzfblVar, zzfbo zzfboVar) {
        super(zzcmwVar);
        zzfbo zzfboVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcmwVar;
        this.zzq = zzcmxVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaocVar;
        this.zzd = zzbiyVar;
        this.zze = zzcfoVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzr = com.google.android.gms.ads.internal.util.zzs.zzr(windowManager);
        this.zzh = zzr;
        this.zzi = zzr.density;
        this.zzX = zzbdmVar;
        this.zzj = zzfblVar;
        this.zzk = zzfboVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcmwVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcfi.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcmwVar, zzcfoVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfnw zzfnwVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaE)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaU();
        addJavascriptInterface(new zzcmi(this, new zzcmh(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbim zzbimVar = new zzbim(new zzbio(true, "make_wv", this.zzr));
        this.zzK = zzbimVar;
        zzbimVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && (zzfboVar2 = this.zzk) != null && zzfboVar2.zzb != null) {
            zzbimVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbimVar.zza();
        zzbil zzf = zzbio.zzf();
        this.zzI = zzf;
        zzbimVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcmwVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        zzfbl zzfblVar = this.zzj;
        if (zzfblVar != null && zzfblVar.zzao) {
            zzcfi.zze("Disabling hardware acceleration on an overlay.");
            zzaW();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzcfi.zze("Enabling hardware acceleration on an AdView.");
            zzaY();
            return;
        }
        zzcfi.zze("Enabling hardware acceleration on an overlay.");
        zzaY();
    }

    private final synchronized void zzaV() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzp();
    }

    private final synchronized void zzaW() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaX(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaY() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaZ(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcfi.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzba() {
        zzbig.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzbb() {
        Map map = this.zzV;
        if (map != null) {
            for (zzcju zzcjuVar : map.values()) {
                zzcjuVar.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbim zzbimVar = this.zzK;
        if (zzbimVar == null) {
            return;
        }
        zzbio zza2 = zzbimVar.zza();
        zzbie zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbd() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaS(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaS(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzy();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzbb();
        this.zzt = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzik)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaZ("about:blank");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
        zzW();
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaB()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcfi.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzy();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzbb();
                    zzaV();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void loadUrl(String str) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzQ.zzc();
        }
        boolean z = this.zzA;
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null && zzclpVar.zzK()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaT();
            z = true;
        }
        zzaX(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzclp zzclpVar;
        synchronized (this) {
            if (!zzaB()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzclpVar = this.zzn) != null && zzclpVar.zzK() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaX(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzI(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcfi.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (zzaB()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaT = zzaT();
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN == null || !zzaT) {
            return;
        }
        zzN.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        zzcmx zzcmxVar;
        boolean z;
        int i4 = 0;
        if (zzaB()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzu && !this.zzq.zzf()) {
            if (this.zzq.zzh()) {
                super.onMeasure(i, i2);
                return;
            } else if (this.zzq.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcT)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcme zzs = zzs();
                float zze = zzs != null ? zzs.zze() : 0.0f;
                if (zze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i5 = (int) (size2 * zze);
                int i6 = (int) (size / zze);
                if (size2 == 0) {
                    if (i6 != 0) {
                        i5 = (int) (i6 * zze);
                        i4 = size;
                        size2 = i6;
                        setMeasuredDimension(Math.min(i5, i4), Math.min(i6, size2));
                        return;
                    }
                    size2 = 0;
                }
                if (size != 0) {
                    i4 = size;
                } else if (i5 != 0) {
                    i6 = (int) (i5 / zze);
                    i4 = i5;
                }
                setMeasuredDimension(Math.min(i5, i4), Math.min(i6, size2));
                return;
            } else if (this.zzq.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcZ)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzaf("/contentHeight", new zzclz(this));
                zzaQ("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f = this.zzh.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i7 = this.zzG;
                setMeasuredDimension(size3, i7 != -1 ? (int) (i7 * f) : View.MeasureSpec.getSize(i2));
                return;
            } else if (this.zzq.zzi()) {
                DisplayMetrics displayMetrics = this.zzh;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size4 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size5 = View.MeasureSpec.getSize(i2);
                int i8 = Integer.MAX_VALUE;
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i3 = Integer.MAX_VALUE;
                    if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                        i8 = size5;
                    }
                    zzcmxVar = this.zzq;
                    if (zzcmxVar.zzb <= i3 && zzcmxVar.zza <= i8) {
                        z = false;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzet)).booleanValue()) {
                            zzcmx zzcmxVar2 = this.zzq;
                            int i9 = zzcmxVar2.zzb;
                            float f2 = this.zzi;
                            z &= ((float) i9) / f2 <= ((float) i3) / f2 && ((float) zzcmxVar2.zza) / f2 <= ((float) i8) / f2;
                        }
                        if (!z) {
                            zzcmx zzcmxVar3 = this.zzq;
                            int i10 = zzcmxVar3.zzb;
                            float f3 = this.zzi;
                            int i11 = zzcmxVar3.zza;
                            zzcfi.zzj("Not enough space to show ad. Needs " + ((int) (i10 / f3)) + "x" + ((int) (i11 / f3)) + " dp, but only has " + ((int) (size4 / f3)) + "x" + ((int) (size5 / f3)) + " dp.");
                            if (getVisibility() != 8) {
                                setVisibility(4);
                            }
                            setMeasuredDimension(0, 0);
                            if (this.zzl) {
                                return;
                            }
                            this.zzX.zzc(10001);
                            this.zzl = true;
                            return;
                        }
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzm) {
                            this.zzX.zzc(10002);
                            this.zzm = true;
                        }
                        zzcmx zzcmxVar4 = this.zzq;
                        setMeasuredDimension(zzcmxVar4.zzb, zzcmxVar4.zza);
                        return;
                    }
                    z = true;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzet)).booleanValue()) {
                    }
                    if (!z) {
                    }
                }
                i3 = size4;
                if (mode2 != Integer.MIN_VALUE) {
                }
                i8 = size5;
                zzcmxVar = this.zzq;
                if (zzcmxVar.zzb <= i3) {
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzet)).booleanValue()) {
                    }
                    if (!z) {
                    }
                }
                z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzet)).booleanValue()) {
                }
                if (!z) {
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void onPause() {
        if (zzaB()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzcfi.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void onResume() {
        if (zzaB()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzcfi.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzK() || this.zzn.zzI()) {
            zzaoc zzaocVar = this.zzc;
            if (zzaocVar != null) {
                zzaocVar.zzd(motionEvent);
            }
            zzbiy zzbiyVar = this.zzd;
            if (zzbiyVar != null) {
                zzbiyVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbko zzbkoVar = this.zzC;
                if (zzbkoVar != null) {
                    zzbkoVar.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclp) {
            this.zzn = (zzclp) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzcfi.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzA(int i) {
        this.zzM = i;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzB(boolean z) {
        this.zzn.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzC(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzD(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzE(zzcme zzcmeVar) {
        if (this.zzz != null) {
            zzcfi.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcmeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzckz
    public final zzfbl zzF() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final Context zzG() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcms
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final WebView zzI() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final WebViewClient zzJ() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmq
    public final zzaoc zzK() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized zzbca zzL() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized zzbko zzM() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final /* synthetic */ zzcmv zzP() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmp
    public final synchronized zzcmx zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmf
    public final zzfbo zzR() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized IObjectWrapper zzS() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final zzfvl zzT() {
        zzbiy zzbiyVar = this.zzd;
        return zzbiyVar == null ? zzfvc.zzi(null) : zzbiyVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized String zzU() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzV(zzfbl zzfblVar, zzfbo zzfboVar) {
        this.zzj = zzfblVar;
        this.zzk = zzfboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzW() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaV();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcma(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzX() {
        zzba();
        HashMap hashMap = new HashMap(1);
        hashMap.put(a.h, this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzY(int i) {
        if (i == 0) {
            zzbig.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzba();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(a.h, this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzZ() {
        if (this.zzH == null) {
            zzbig.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbil zzf = zzbio.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(a.h, this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        this.zzX.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzcly
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbfb zzbfbVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = zzcmb.zza;
                zzbhg zza2 = zzbhh.zza();
                if (zza2.zzc() != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i2);
                zzbfbVar.zzj((zzbhh) zza2.zzal());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaB() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaC() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaE() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzr(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaG(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzees zzeesVar, zzdwh zzdwhVar, zzfgp zzfgpVar, String str, String str2, int i) {
        this.zzn.zzs(zzbrVar, zzeesVar, zzdwhVar, zzfgpVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaH(boolean z, int i, boolean z2) {
        this.zzn.zzt(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.zzn.zzv(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzw(z, i, str, str2, z2);
    }

    public final zzclp zzaL() {
        return this.zzn;
    }

    @VisibleForTesting
    public final synchronized Boolean zzaM() {
        return this.zzw;
    }

    public final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaQ(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaM() == null) {
                zzbd();
            }
            if (zzaM().booleanValue()) {
                zzaP(str, null);
                return;
            } else {
                zzaR("javascript:".concat(str));
                return;
            }
        }
        zzaR("javascript:".concat(str));
    }

    public final synchronized void zzaR(String str) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @VisibleForTesting
    public final void zzaS(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzu(bool);
    }

    public final boolean zzaT() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzn.zzJ() || this.zzn.zzK()) {
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            DisplayMetrics displayMetrics = this.zzh;
            int zzu = zzcfb.zzu(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzu2 = zzcfb.zzu(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i = zzu;
                i2 = zzu2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzM = com.google.android.gms.ads.internal.util.zzs.zzM(zza2);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int zzu3 = zzcfb.zzu(this.zzh, zzM[0]);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                i2 = zzcfb.zzu(this.zzh, zzM[1]);
                i = zzu3;
            }
            int i3 = this.zzS;
            if (i3 == zzu && this.zzR == zzu2 && this.zzT == i && this.zzU == i2) {
                return false;
            }
            z = (i3 == zzu && this.zzR == zzu2) ? true : true;
            this.zzS = zzu;
            this.zzR = zzu2;
            this.zzT = i;
            this.zzU = i2;
            new zzbwv(this, "").zzi(zzu, zzu2, i, i2, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzab(boolean z) {
        this.zzn.zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzac() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzad(String str, String str2, String str3) {
        String str4;
        if (!zzaB()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzN);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(a.h, str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zzcfi.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcmo.zza(str2, strArr), tm4.D, "UTF-8", null);
            return;
        }
        zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzae() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbil zzf = zzbio.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaf(String str, zzbom zzbomVar) {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzx(str, zzbomVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzag() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzai(zzcmx zzcmxVar) {
        this.zzq = zzcmxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzaj(zzbca zzbcaVar) {
        this.zzE = zzbcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzak(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzal() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzam(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzan(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(this.zzn.zzJ(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzao(zzbkm zzbkmVar) {
        this.zzD = zzbkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzap(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaU();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzO)).booleanValue() || !this.zzq.zzi()) {
                new zzbwv(this, "").zzk(true != z ? "default" : CallMraidJS.g);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzaq(zzbko zzbkoVar) {
        this.zzC = zzbkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzar(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzas(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzau(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzav(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzz(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaw(String str, zzbom zzbomVar) {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzG(str, zzbomVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzax(String str, Predicate predicate) {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzH(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzay() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaz() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzb(String str, String str2) {
        zzaQ(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzchg zzbp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbamVar) {
        boolean z;
        synchronized (this) {
            z = zzbamVar.zzj;
            this.zzA = z;
        }
        zzaX(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder N = wo1.N("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcfi.zze("Dispatching AFMA event: ".concat(N.toString()));
        zzaQ(N.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzg() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized int zzh() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzi() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzj() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    public final Activity zzk() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final com.google.android.gms.ads.internal.zza zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzbil zzn() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final zzbim zzo() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmr, com.google.android.gms.internal.ads.zzchr
    public final zzcfo zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized zzcju zzr(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcju) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final synchronized zzcme zzs() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized String zzt() {
        zzfbo zzfboVar = this.zzk;
        if (zzfboVar != null) {
            return zzfboVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized String zzu() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzv(String str, zzcju zzcjuVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcjuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzw() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzx(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzy() {
        zzbkm zzbkmVar = this.zzD;
        if (zzbkmVar != null) {
            final zzdre zzdreVar = (zzdre) zzbkmVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrc
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdre.this.zzd();
                    } catch (RemoteException e) {
                        zzcfi.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzz(int i) {
        this.zzN = i;
    }
}