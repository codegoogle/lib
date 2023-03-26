package com.facebook.ads.internal.api;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.p7700g.p99005.z1;

@Keep
/* loaded from: classes2.dex */
public interface NativeAdBaseApi {
    NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase);

    void destroy();

    void downloadMedia();

    @z1
    String getAdBodyText();

    @z1
    String getAdCallToAction();

    @z1
    NativeAdImageApi getAdChoicesIcon();

    @z1
    String getAdChoicesImageUrl();

    @z1
    String getAdChoicesLinkUrl();

    @z1
    String getAdChoicesText();

    @z1
    NativeAdImageApi getAdCoverImage();

    @z1
    String getAdHeadline();

    @z1
    NativeAdImageApi getAdIcon();

    @z1
    String getAdLinkDescription();

    @z1
    String getAdSocialContext();

    @z1
    @Deprecated
    NativeAdRatingApi getAdStarRating();

    @z1
    String getAdTranslation();

    @z1
    String getAdUntrimmedBodyText();

    @z1
    String getAdvertiserName();

    float getAspectRatio();

    @z1
    String getId();

    String getPlacementId();

    @z1
    Drawable getPreloadedIconViewDrawable();

    @z1
    String getPromotedTranslation();

    @z1
    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    @Deprecated
    void loadAd(NativeAdBase.MediaCacheFlag mediaCacheFlag);

    void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig);

    @Deprecated
    void loadAdFromBid(String str);

    @Deprecated
    void loadAdFromBid(String str, NativeAdBase.MediaCacheFlag mediaCacheFlag);

    void onCtaBroadcast();

    void setAdListener(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase);

    void setExtraHints(ExtraHints extraHints);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void unregisterView();
}