package com.anythink.nativead.api;

import com.anythink.core.api.ATAdInfo;

/* loaded from: classes2.dex */
public interface ATNativeEventListener {
    void onAdClicked(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo);

    void onAdImpressed(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo);

    void onAdVideoEnd(ATNativeAdView aTNativeAdView);

    void onAdVideoProgress(ATNativeAdView aTNativeAdView, int i);

    void onAdVideoStart(ATNativeAdView aTNativeAdView);
}