package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.p7700g.p99005.e2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@e2(api = 21)
/* loaded from: classes2.dex */
public final class zzbpe extends zzbpg {
    private final OnH5AdsEventListener zza;

    public zzbpe(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}