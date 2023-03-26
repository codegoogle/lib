package com.facebook.ads.internal.api;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InstreamVideoAdListener;
import com.facebook.ads.InstreamVideoAdView;
import com.p7700g.p99005.z1;

@Keep
/* loaded from: classes2.dex */
public interface InstreamVideoAdViewApi extends Ad {
    InstreamVideoAdView.InstreamVideoLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.Ad
    void destroy();

    @Override // com.facebook.ads.Ad
    String getPlacementId();

    @z1
    Bundle getSaveInstanceState();

    boolean isAdLoaded();

    @Override // com.facebook.ads.Ad
    void loadAd();

    void loadAd(InstreamVideoAdView.InstreamVideoLoadAdConfig instreamVideoLoadAdConfig);

    @Override // com.facebook.ads.Ad
    @Deprecated
    void loadAdFromBid(String str);

    void setAdListener(@z1 InstreamVideoAdListener instreamVideoAdListener);

    @Override // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    void setIsAdLoaded(boolean z);

    boolean show();
}