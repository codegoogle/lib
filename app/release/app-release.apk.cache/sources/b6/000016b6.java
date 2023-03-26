package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public abstract class UnifiedNativeAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnUnifiedNativeAdLoadedListener {
        void onUnifiedNativeAdLoaded(@x1 UnifiedNativeAd unifiedNativeAd);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(@x1 String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    public abstract void enableCustomClickGesture();

    @x1
    public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

    @x1
    public abstract String getAdvertiser();

    @x1
    public abstract String getBody();

    @x1
    public abstract String getCallToAction();

    @x1
    public abstract Bundle getExtras();

    @x1
    public abstract String getHeadline();

    @x1
    public abstract NativeAd.Image getIcon();

    @x1
    public abstract List<NativeAd.Image> getImages();

    @x1
    public abstract MediaContent getMediaContent();

    @x1
    @Deprecated
    public abstract String getMediationAdapterClassName();

    @x1
    public abstract List<MuteThisAdReason> getMuteThisAdReasons();

    @x1
    public abstract String getPrice();

    @z1
    public abstract ResponseInfo getResponseInfo();

    @x1
    public abstract Double getStarRating();

    @x1
    public abstract String getStore();

    @x1
    @Deprecated
    public abstract VideoController getVideoController();

    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(@x1 MuteThisAdReason muteThisAdReason);

    @KeepForSdk
    public abstract void performClick(@x1 Bundle bundle);

    public abstract void recordCustomClickGesture();

    @KeepForSdk
    public abstract boolean recordImpression(@x1 Bundle bundle);

    @KeepForSdk
    public abstract void reportTouchEvent(@x1 Bundle bundle);

    public abstract void setMuteThisAdListener(@x1 MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(@z1 OnPaidEventListener onPaidEventListener);

    public abstract void setUnconfirmedClickListener(@x1 UnconfirmedClickListener unconfirmedClickListener);

    @x1
    public abstract Object zza();
}