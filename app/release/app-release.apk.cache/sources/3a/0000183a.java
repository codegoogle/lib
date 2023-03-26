package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class NativeAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static abstract class AdChoicesInfo {
        @x1
        public abstract List<Image> getImages();

        @x1
        public abstract CharSequence getText();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static abstract class Image {
        @z1
        public abstract Drawable getDrawable();

        public abstract double getScale();

        @z1
        public abstract Uri getUri();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface OnNativeAdLoadedListener {
        void onNativeAdLoaded(@x1 NativeAd nativeAd);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(@x1 String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    public abstract void enableCustomClickGesture();

    @z1
    public abstract AdChoicesInfo getAdChoicesInfo();

    @z1
    public abstract String getAdvertiser();

    @z1
    public abstract String getBody();

    @z1
    public abstract String getCallToAction();

    @x1
    public abstract Bundle getExtras();

    @z1
    public abstract String getHeadline();

    @z1
    public abstract Image getIcon();

    @x1
    public abstract List<Image> getImages();

    @z1
    public abstract MediaContent getMediaContent();

    @x1
    public abstract List<MuteThisAdReason> getMuteThisAdReasons();

    @z1
    public abstract String getPrice();

    @z1
    public abstract ResponseInfo getResponseInfo();

    @z1
    public abstract Double getStarRating();

    @z1
    public abstract String getStore();

    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(@x1 MuteThisAdReason muteThisAdReason);

    public abstract void performClick(@x1 Bundle bundle);

    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(@x1 Bundle bundle);

    public abstract void reportTouchEvent(@x1 Bundle bundle);

    public abstract void setMuteThisAdListener(@x1 MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(@z1 OnPaidEventListener onPaidEventListener);

    public abstract void setUnconfirmedClickListener(@x1 UnconfirmedClickListener unconfirmedClickListener);

    @z1
    public abstract Object zza();
}