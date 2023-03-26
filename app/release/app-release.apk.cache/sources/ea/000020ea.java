package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcbn extends RewardedAd {
    private final String zza;
    private final zzcbe zzb;
    private final Context zzc;
    private final zzcbw zzd = new zzcbw();
    @z1
    private OnAdMetadataChangedListener zze;
    @z1
    private OnPaidEventListener zzf;
    @z1
    private FullScreenContentCallback zzg;

    public zzcbn(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzaw.zza().zzp(context, str, new zzbtx());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                return zzcbeVar.zzb();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @x1
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @z1
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @z1
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @z1
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @x1
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar = null;
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzdhVar = zzcbeVar.zzc();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdhVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @x1
    public final RewardItem getRewardItem() {
        try {
            zzcbe zzcbeVar = this.zzb;
            zzcbb zzd = zzcbeVar != null ? zzcbeVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzcbo(zzd);
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(@z1 FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(@z1 OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzi(new com.google.android.gms.ads.internal.client.zzex(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(@z1 OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzj(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(@z1 ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzcbe zzcbeVar = this.zzb;
                if (zzcbeVar != null) {
                    zzcbeVar.zzl(new zzcbs(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(@x1 Activity activity, @x1 OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcfi.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzcbe zzcbeVar = this.zzb;
            if (zzcbeVar != null) {
                zzcbeVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdrVar), new zzcbr(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}