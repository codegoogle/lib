package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.NativeAd;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface NativeCustomFormatAd {
    @x1
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface DisplayOpenMeasurement {
        void setView(@x1 View view);

        boolean start();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface OnCustomClickListener {
        void onCustomClick(@x1 NativeCustomFormatAd nativeCustomFormatAd, @x1 String str);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(@x1 NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    @z1
    List<String> getAvailableAssetNames();

    @z1
    String getCustomFormatId();

    @x1
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @z1
    NativeAd.Image getImage(@x1 String str);

    @z1
    CharSequence getText(@x1 String str);

    @x1
    VideoController getVideoController();

    @z1
    MediaView getVideoMediaView();

    void performClick(@x1 String str);

    void recordImpression();
}