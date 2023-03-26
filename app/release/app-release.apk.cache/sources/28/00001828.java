package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(@x1 Context context, @x1 CustomEventBannerListener customEventBannerListener, @z1 String str, @x1 AdSize adSize, @x1 MediationAdRequest mediationAdRequest, @z1 Bundle bundle);
}