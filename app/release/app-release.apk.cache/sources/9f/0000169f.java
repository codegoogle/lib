package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcex;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public @interface AppOpenAdOrientation {
    }

    public static void load(@x1 final Context context, @x1 final String str, @x1 final AdRequest adRequest, @AppOpenAdOrientation final int i, @x1 final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzd.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbco(context2, str2, adRequest2.zza(), i, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbyy.zza(context2).zzd(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbco(context, str, adRequest.zza(), i, appOpenAdLoadCallback).zza();
    }

    @x1
    public abstract String getAdUnitId();

    @z1
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @z1
    public abstract OnPaidEventListener getOnPaidEventListener();

    @x1
    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(@z1 FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(@z1 OnPaidEventListener onPaidEventListener);

    public abstract void show(@x1 Activity activity);

    public static void load(@x1 final Context context, @x1 final String str, @x1 final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i, @x1 final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzd.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbco(context2, str2, adManagerAdRequest2.zza(), i, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbyy.zza(context2).zzd(e, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbco(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).zza();
    }
}