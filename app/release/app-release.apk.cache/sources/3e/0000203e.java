package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbve extends zzbuo {
    private final UnifiedNativeAdMapper zza;

    public zzbve(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zza = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final boolean zzA() {
        return this.zza.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final boolean zzB() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final double zze() {
        if (this.zza.getStarRating() != null) {
            return this.zza.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final float zzf() {
        return this.zza.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final float zzg() {
        return this.zza.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final float zzh() {
        return this.zza.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final Bundle zzi() {
        return this.zza.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    @z1
    public final com.google.android.gms.ads.internal.client.zzdk zzj() {
        if (this.zza.zzb() != null) {
            return this.zza.zzb().zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    @z1
    public final zzbkt zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    @z1
    public final zzblb zzl() {
        NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new zzbkn(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    @z1
    public final IObjectWrapper zzm() {
        View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    @z1
    public final IObjectWrapper zzn() {
        View zza = this.zza.zza();
        if (zza == null) {
            return null;
        }
        return ObjectWrapper.wrap(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    @z1
    public final IObjectWrapper zzo() {
        Object zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzp() {
        return this.zza.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzq() {
        return this.zza.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzr() {
        return this.zza.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzs() {
        return this.zza.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzt() {
        return this.zza.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final String zzu() {
        return this.zza.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final List zzv() {
        List<NativeAd.Image> images = this.zza.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbkn(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zza.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zzx() {
        this.zza.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zza.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zzz(IObjectWrapper iObjectWrapper) {
        this.zza.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}