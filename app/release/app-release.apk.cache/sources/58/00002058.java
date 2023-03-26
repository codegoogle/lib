package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwd implements MediationAdLoadCallback {
    public final /* synthetic */ zzbvq zza;
    public final /* synthetic */ zzbug zzb;
    public final /* synthetic */ zzbwe zzc;

    public zzbwd(zzbwe zzbweVar, zzbvq zzbvqVar, zzbug zzbugVar) {
        this.zzc = zzbweVar;
        this.zza = zzbvqVar;
        this.zzb = zzbugVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @z1
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd == null) {
            zzcfi.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
                return null;
            }
        }
        try {
            this.zzc.zzc = mediationRewardedAd;
            this.zza.zzg();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
        return new zzbwf(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}