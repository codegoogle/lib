package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.z1;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbbm extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbbd zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzbbm() {
        zzbbd zzbbdVar = new zzbbd();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbbdVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbjh.zzd.zze()).intValue();
        this.zzg = ((Long) zzbjh.zza.zze()).intValue();
        this.zzh = ((Long) zzbjh.zze.zze()).intValue();
        this.zzi = ((Long) zzbjh.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzQ)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzR)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzS)).intValue();
        this.zze = ((Long) zzbjh.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzU);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzV)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzW)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzX)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.importance != 100) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.inKeyguardRestrictedInputMode() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0.isScreenOn() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r0 = com.google.android.gms.ads.internal.zzt.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        com.google.android.gms.internal.ads.zzcfi.zze("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r0.getWindow() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r0.getWindow().getDecorView() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzt(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzcfi.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context zzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
                if (zzb != null) {
                    ActivityManager activityManager = (ActivityManager) zzb.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                    KeyguardManager keyguardManager = (KeyguardManager) zzb.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "ContentFetchTask.isInForeground");
            }
            zzcfi.zze("ContentFetchTask: sleeping");
            zzf();
            Thread.sleep(this.zze * 1000);
            synchronized (this.zzc) {
                while (this.zzb) {
                    try {
                        zzcfi.zze("ContentFetchTask: waiting");
                        this.zzc.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new zzbbi(this, view));
        }
        Thread.sleep(this.zze * 1000);
        synchronized (this.zzc) {
        }
    }

    public final zzbbc zza() {
        return this.zzd.zza(this.zzp);
    }

    @VisibleForTesting
    public final zzbbl zzb(@z1 View view, zzbbc zzbbcVar) {
        if (view == null) {
            return new zzbbl(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbbl(this, 0, 0);
            }
            zzbbcVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbbl(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzcli)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzbbcVar.zzh();
                webView.post(new zzbbk(this, zzbbcVar, webView, globalVisibleRect));
                return new zzbbl(this, 0, 1);
            }
            return new zzbbl(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzbbl zzb = zzb(viewGroup.getChildAt(i3), zzbbcVar);
                i += zzb.zza;
                i2 += zzb.zzb;
            }
            return new zzbbl(this, i, i2);
        } else {
            return new zzbbl(this, 0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r11 == 0) goto L24;
     */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(View view) {
        try {
            zzbbc zzbbcVar = new zzbbc(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
            if (zzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(zzb.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzT), "id", zzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzbbl zzb2 = zzb(view, zzbbcVar);
            zzbbcVar.zzm();
            if (zzb2.zza == 0 && zzb2.zzb == 0) {
                return;
            }
            int i = zzb2.zzb;
            if (i == 0) {
                if (zzbbcVar.zzc() == 0) {
                    return;
                }
            }
            if (this.zzd.zzd(zzbbcVar)) {
                return;
            }
            this.zzd.zzb(zzbbcVar);
        } catch (Exception e) {
            zzcfi.zzh("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    public final void zzd(zzbbc zzbbcVar, WebView webView, String str, boolean z) {
        zzbbcVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    zzbbcVar.zzl(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzbbcVar.zzl(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzbbcVar.zzo()) {
                this.zzd.zzc(zzbbcVar);
            }
        } catch (JSONException unused) {
            zzcfi.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzcfi.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzcfi.zze("Content hash thread already started, quiting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzcfi.zze("ContentFetchThread: paused, mPause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzcfi.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}