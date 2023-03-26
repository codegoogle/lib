package com.google.android.gms.ads.formats;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.p7700g.p99005.x1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface NativeCustomTemplateAd {
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
        void onCustomClick(@x1 NativeCustomTemplateAd nativeCustomTemplateAd, @x1 String str);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(@x1 NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    void destroy();

    @x1
    List<String> getAvailableAssetNames();

    @x1
    String getCustomTemplateId();

    @x1
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @x1
    NativeAd.Image getImage(@x1 String str);

    @x1
    CharSequence getText(@x1 String str);

    @x1
    VideoController getVideoController();

    @x1
    MediaView getVideoMediaView();

    void performClick(@x1 String str);

    void recordImpression();
}