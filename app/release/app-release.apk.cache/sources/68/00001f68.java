package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbng {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    @z1
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    @z1
    @k1("this")
    private NativeCustomTemplateAd zzc;

    public zzbng(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @z1 NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomTemplateAd zzf(zzblv zzblvVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzblw zzblwVar = new zzblw(zzblvVar);
        this.zzc = zzblwVar;
        return zzblwVar;
    }

    @z1
    public final zzbmf zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbnd(this, null);
    }

    public final zzbmi zze() {
        return new zzbnf(this, null);
    }
}