package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class RewardedAd {
    public static void load(@x1 final Context context, @x1 final String str, @x1 final AdRequest adRequest, @x1 final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzcbn(context2, str2).zza(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbyy.zza(context2).zzd(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzcfi.zze("Loading on UI thread");
        new zzcbn(context, str).zza(adRequest.zza(), rewardedAdLoadCallback);
    }

    @x1
    public abstract Bundle getAdMetadata();

    @x1
    public abstract String getAdUnitId();

    @z1
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @z1
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @z1
    public abstract OnPaidEventListener getOnPaidEventListener();

    @x1
    public abstract ResponseInfo getResponseInfo();

    @x1
    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(@z1 FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(@z1 OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(@z1 OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(@z1 ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@x1 Activity activity, @x1 OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@x1 final Context context, @x1 final String str, @x1 final AdManagerAdRequest adManagerAdRequest, @x1 final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(context);
        if (((Boolean) zzbjn.zzi.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcfi.zze("Loading on background thread");
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzcbn(context2, str2).zza(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbyy.zza(context2).zzd(e, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzcfi.zze("Loading on UI thread");
        new zzcbn(context, str).zza(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}