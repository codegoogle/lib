package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.h2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class MobileAds {
    @x1
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@x1 Context context) {
        zzed.zzf().zzl(context);
    }

    @z1
    public static InitializationStatus getInitializationStatus() {
        return zzed.zzf().zze();
    }

    @x1
    public static RequestConfiguration getRequestConfiguration() {
        return zzed.zzf().zzc();
    }

    @x1
    public static VersionInfo getVersion() {
        zzed.zzf();
        String[] split = TextUtils.split("21.1.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @x1
    @Deprecated
    public static String getVersionString() {
        return zzed.zzf().zzh();
    }

    @h2("android.permission.INTERNET")
    public static void initialize(@x1 Context context) {
        zzed.zzf().zzm(context, null, null);
    }

    public static void openAdInspector(@x1 Context context, @x1 OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzed.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@x1 Context context, @x1 String str) {
        zzed.zzf().zzq(context, str);
    }

    @KeepForSdk
    public static void registerRtbAdapter(@x1 Class<? extends RtbAdapter> cls) {
        zzed.zzf().zzr(cls);
    }

    @e2(api = 21)
    public static void registerWebView(@x1 WebView webView) {
        zzed.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzcfi.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzcdz zza = zzbym.zza(webView.getContext());
        if (zza == null) {
            zzcfi.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzi(ObjectWrapper.wrap(webView));
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzed.zzf().zzs(z);
    }

    public static void setAppVolume(float f) {
        zzed.zzf().zzt(f);
    }

    public static void setRequestConfiguration(@x1 RequestConfiguration requestConfiguration) {
        zzed.zzf().zzu(requestConfiguration);
    }

    public static void initialize(@x1 Context context, @x1 OnInitializationCompleteListener onInitializationCompleteListener) {
        zzed.zzf().zzm(context, null, onInitializationCompleteListener);
    }
}