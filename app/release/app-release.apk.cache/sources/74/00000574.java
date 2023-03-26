package com.anythink.core.api;

import android.graphics.Bitmap;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IATThirdPartyMaterial {
    ATAdAppInfo getAdAppInfo();

    String getAdChoiceIconUrl();

    String getAdFrom();

    View getAdIconView();

    Bitmap getAdLogo();

    @Deprecated
    View getAdLogoView();

    View getAdMediaView(Object... objArr);

    String getAdType();

    String getAdvertiserName();

    int getAppCommentNum();

    View getAppDownloadButton();

    double getAppPrice();

    String getCallToActionText();

    String getDescriptionText();

    String getIconImageUrl();

    List<String> getImageUrlList();

    int getMainImageHeight();

    String getMainImageUrl();

    int getMainImageWidth();

    int getNativeAdInteractionType();

    ATCustomVideo getNativeCustomVideo();

    int getNativeExpressHeight();

    int getNativeExpressWidth();

    int getNativeType();

    Map<String, Object> getNetworkInfoMap();

    Double getStarRating();

    String getTitle();

    double getVideoDuration();

    int getVideoHeight();

    String getVideoUrl();

    int getVideoWidth();
}