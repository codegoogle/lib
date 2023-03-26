package com.anythink.core.common.e.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.l;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends BaseAd implements a {
    private int a;
    private int b;
    private int c;
    private int d;
    private BaseAd e;

    public e(BaseAd baseAd, Map<String, Object> map) {
        this.e = baseAd;
        if (map.containsKey("orientation")) {
            this.a = Integer.parseInt(map.get("orientation").toString());
        }
        if (map.containsKey(com.anythink.expressad.d.a.b.dk)) {
            this.b = Integer.parseInt(map.get(com.anythink.expressad.d.a.b.dk).toString());
        }
        if (map.containsKey("allows_skip")) {
            this.c = Integer.parseInt(map.get("allows_skip").toString());
        }
        if (map.containsKey("button_type")) {
            this.d = Integer.parseInt(map.get("button_type").toString());
        }
    }

    private void a(Map<String, Object> map) {
        if (map.containsKey("orientation")) {
            this.a = Integer.parseInt(map.get("orientation").toString());
        }
        if (map.containsKey(com.anythink.expressad.d.a.b.dk)) {
            this.b = Integer.parseInt(map.get(com.anythink.expressad.d.a.b.dk).toString());
        }
        if (map.containsKey("allows_skip")) {
            this.c = Integer.parseInt(map.get("allows_skip").toString());
        }
        if (map.containsKey("button_type")) {
            this.d = Integer.parseInt(map.get("button_type").toString());
        }
    }

    @Override // com.anythink.core.common.e.a.a
    public final long b() {
        return this.b;
    }

    @Override // com.anythink.core.common.e.a.a
    public final int c() {
        int i = this.c;
        return (i != 1 && i == 0) ? 1 : 0;
    }

    @Override // com.anythink.core.common.e.a.a
    public final int d() {
        return this.d == 1 ? 0 : 1;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void destroy() {
        this.e.destroy();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        return this.e.getAdAppInfo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.e.getAdChoiceIconUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        return this.e.getAdFrom();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        return this.e.getAdLogo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        return this.e.getAdLogoView();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        return this.e.getAdMediaView(objArr);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        return this.e.getAdType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        return this.e.getAdvertiserName();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        return this.e.getAppCommentNum();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAppDownloadButton() {
        return this.e.getAppDownloadButton();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        return this.e.getAppPrice();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        return this.e.getCallToActionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final ViewGroup getCustomAdContainer() {
        return this.e.getCustomAdContainer();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        return this.e.getDescriptionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final com.anythink.core.common.e.e getDetail() {
        return this.e.getDetail();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        return this.e.getIconImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.e.getImageUrlList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        return this.e.getMainImageHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        return this.e.getMainImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        return this.e.getMainImageWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        return this.e.getNativeAdInteractionType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        return this.e.getNativeCustomVideo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        return this.e.getNativeExpressHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        return this.e.getNativeExpressWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        return this.e.getNativeType();
    }

    @Override // com.anythink.core.api.BaseAd, com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.e.getNetworkInfoMap();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        return this.e.getStarRating();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        return this.e.getTitle();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        return this.e.getVideoDuration();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        return this.e.getVideoHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        return this.e.getVideoUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        return this.e.getVideoWidth();
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        this.e.registerListener(view, list, layoutParams);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNativeEventListener(l lVar) {
        this.e.setNativeEventListener(lVar);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.e.setNetworkInfoMap(map);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setTrackingInfo(com.anythink.core.common.e.e eVar) {
        this.e.setTrackingInfo(eVar);
    }

    @Override // com.anythink.core.common.e.a.a
    public final int a() {
        return this.a;
    }
}