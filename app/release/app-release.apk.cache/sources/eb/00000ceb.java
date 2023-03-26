package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.p7700g.p99005.z1;

@Keep
/* loaded from: classes2.dex */
public interface NativeAdViewApi {
    View render(Context context, NativeAd nativeAd);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type, @z1 NativeAdViewAttributes nativeAdViewAttributes);

    View render(Context context, NativeAd nativeAd, @z1 NativeAdViewAttributes nativeAdViewAttributes);
}