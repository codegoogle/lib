package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.p7700g.p99005.x1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface NativeMediationAdRequest extends MediationAdRequest {
    float getAdVolume();

    @x1
    @Deprecated
    NativeAdOptions getNativeAdOptions();

    @x1
    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isAdMuted();

    boolean isUnifiedNativeAdRequested();

    @x1
    Map zza();

    boolean zzb();
}