package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.p7700g.p99005.q2;

@q2
@Keep
/* loaded from: classes2.dex */
public interface AdSizeApi {
    @Deprecated
    public static final int BANNER_320_50 = 4;
    public static final int BANNER_HEIGHT_50 = 5;
    public static final int BANNER_HEIGHT_90 = 6;
    public static final int INTERSTITIAL = 100;
    public static final int RECTANGLE_HEIGHT_250 = 7;

    int getHeight();

    int getWidth();
}