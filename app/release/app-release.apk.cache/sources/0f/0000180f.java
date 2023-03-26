package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerAdapter extends MediationAdapter {
    @x1
    View getBannerView();

    void requestBannerAd(@x1 Context context, @x1 MediationBannerListener mediationBannerListener, @x1 Bundle bundle, @x1 AdSize adSize, @x1 MediationAdRequest mediationAdRequest, @z1 Bundle bundle2);
}