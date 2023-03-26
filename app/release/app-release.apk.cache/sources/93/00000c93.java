package com.facebook.ads;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.p7700g.p99005.z1;

@Keep
@Deprecated
/* loaded from: classes2.dex */
public class InstreamVideoAdView extends RelativeLayout implements Ad {
    private final InstreamVideoAdViewApi mInstreamVideoAdViewApi;

    @Keep
    @Deprecated
    /* loaded from: classes2.dex */
    public interface InstreamVideoLoadAdConfig extends Ad.LoadAdConfig {
    }

    @Keep
    @Deprecated
    /* loaded from: classes2.dex */
    public interface InstreamVideoLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Deprecated
        InstreamVideoLoadAdConfig build();

        @Deprecated
        InstreamVideoLoadConfigBuilder withAdListener(InstreamVideoAdListener instreamVideoAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Deprecated
        InstreamVideoLoadConfigBuilder withBid(String str);
    }

    @Deprecated
    public InstreamVideoAdView(Context context, Bundle bundle) {
        super(context);
        this.mInstreamVideoAdViewApi = DynamicLoaderFactory.makeLoader(context).createInstreamVideoAdViewApi(this, context, bundle);
    }

    @Deprecated
    public InstreamVideoLoadConfigBuilder buildLoadAdConfig() {
        return this.mInstreamVideoAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void destroy() {
        this.mInstreamVideoAdViewApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public String getPlacementId() {
        return this.mInstreamVideoAdViewApi.getPlacementId();
    }

    @z1
    @Deprecated
    public Bundle getSaveInstanceState() {
        return this.mInstreamVideoAdViewApi.getSaveInstanceState();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public boolean isAdInvalidated() {
        return this.mInstreamVideoAdViewApi.isAdInvalidated();
    }

    @Deprecated
    public boolean isAdLoaded() {
        return this.mInstreamVideoAdViewApi.isAdLoaded();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void loadAd() {
        this.mInstreamVideoAdViewApi.loadAd();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void loadAdFromBid(String str) {
        this.mInstreamVideoAdViewApi.loadAdFromBid(str);
    }

    @Deprecated
    public void setAdListener(InstreamVideoAdListener instreamVideoAdListener) {
        this.mInstreamVideoAdViewApi.setAdListener(instreamVideoAdListener);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mInstreamVideoAdViewApi.setExtraHints(extraHints);
    }

    @Deprecated
    public boolean show() {
        return this.mInstreamVideoAdViewApi.show();
    }

    @Deprecated
    public void loadAd(InstreamVideoLoadAdConfig instreamVideoLoadAdConfig) {
        this.mInstreamVideoAdViewApi.loadAd(instreamVideoLoadAdConfig);
    }

    @Deprecated
    public InstreamVideoAdView(Context context, String str, AdSize adSize) {
        super(context);
        this.mInstreamVideoAdViewApi = DynamicLoaderFactory.makeLoader(context).createInstreamVideoAdViewApi(this, context, str, adSize);
    }
}