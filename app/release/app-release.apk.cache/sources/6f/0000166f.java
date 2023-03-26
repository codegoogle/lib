package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.h2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbl zzc;

    public AdLoader(Context context, zzbl zzblVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzblVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdr zzdrVar) {
        zzbhz.zzc(this.zzb);
        if (((Boolean) zzbjn.zzc.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdrVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e) {
            zzcfi.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e) {
            zzcfi.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @h2("android.permission.INTERNET")
    public void loadAd(@x1 AdRequest adRequest) {
        zzb(adRequest.zza());
    }

    @h2("android.permission.INTERNET")
    public void loadAds(@x1 AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza()), i);
        } catch (RemoteException e) {
            zzcfi.zzh("Failed to load ads.", e);
        }
    }

    public final /* synthetic */ void zza(zzdr zzdrVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e) {
            zzcfi.zzh("Failed to load ad.", e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final Context zza;
        private final zzbo zzb;

        public Builder(@x1 Context context, @x1 String str) {
            zzbo zzc = zzaw.zza().zzc(context, str, new zzbtx());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzc;
        }

        @x1
        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e) {
                zzcfi.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzeo().zzc(), zzp.zza);
            }
        }

        @x1
        public Builder forAdManagerAdView(@x1 OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @x1 AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new zzbni(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
                } catch (RemoteException e) {
                    zzcfi.zzk("Failed to add Google Ad Manager banner ad listener", e);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        @x1
        public Builder forCustomFormatAd(@x1 String str, @x1 NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @z1 NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbxf zzbxfVar = new zzbxf(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbxfVar.zzb(), zzbxfVar.zza());
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @x1
        @Deprecated
        public Builder forCustomTemplateAd(@x1 String str, @x1 NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @z1 NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbng zzbngVar = new zzbng(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbngVar.zze(), zzbngVar.zzd());
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @x1
        public Builder forNativeAd(@x1 NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbxh(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @x1
        @Deprecated
        public Builder forUnifiedNativeAd(@x1 UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbnj(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @x1
        public Builder withAdListener(@x1 AdListener adListener) {
            try {
                this.zzb.zzl(new zzg(adListener));
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        @x1
        public Builder withAdManagerAdViewOptions(@x1 AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @x1
        @Deprecated
        public Builder withNativeAdOptions(@x1 NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbkp(nativeAdOptions));
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        @x1
        public Builder withNativeAdOptions(@x1 com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbkp(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e) {
                zzcfi.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public void loadAd(@x1 AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}