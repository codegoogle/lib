package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxf {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    @z1
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    @z1
    @k1("this")
    private NativeCustomFormatAd zzc;

    public zzbxf(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @z1 NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzblv zzblvVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbxg zzbxgVar = new zzbxg(zzblvVar);
        this.zzc = zzbxgVar;
        return zzbxgVar;
    }

    @z1
    public final zzbmf zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbxc(this, null);
    }

    public final zzbmi zzb() {
        return new zzbxe(this, null);
    }
}