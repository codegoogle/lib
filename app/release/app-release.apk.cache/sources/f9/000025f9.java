package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxl {
    private final zzbph zza;

    public zzdxl(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    private final void zzs(zzdxk zzdxkVar) throws RemoteException {
        String zza = zzdxk.zza(zzdxkVar);
        zzcfi.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdxk("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdClicked";
        this.zza.zzb(zzdxk.zza(zzdxkVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdClosed";
        zzs(zzdxkVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdFailedToLoad";
        zzdxkVar.zzd = Integer.valueOf(i);
        zzs(zzdxkVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdLoaded";
        zzs(zzdxkVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxkVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("interstitial", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdOpened";
        zzs(zzdxkVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("creation", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "nativeObjectCreated";
        zzs(zzdxkVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("creation", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "nativeObjectNotCreated";
        zzs(zzdxkVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdClicked";
        zzs(zzdxkVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onRewardedAdClosed";
        zzs(zzdxkVar);
    }

    public final void zzl(long j, zzcbb zzcbbVar) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onUserEarnedReward";
        zzdxkVar.zze = zzcbbVar.zzf();
        zzdxkVar.zzf = Integer.valueOf(zzcbbVar.zze());
        zzs(zzdxkVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onRewardedAdFailedToLoad";
        zzdxkVar.zzd = Integer.valueOf(i);
        zzs(zzdxkVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onRewardedAdFailedToShow";
        zzdxkVar.zzd = Integer.valueOf(i);
        zzs(zzdxkVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onAdImpression";
        zzs(zzdxkVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onRewardedAdLoaded";
        zzs(zzdxkVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxkVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdxk zzdxkVar = new zzdxk("rewarded", null);
        zzdxkVar.zza = Long.valueOf(j);
        zzdxkVar.zzc = "onRewardedAdOpened";
        zzs(zzdxkVar);
    }
}