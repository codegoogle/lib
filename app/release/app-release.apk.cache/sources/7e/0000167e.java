package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    @z1
    Drawable getMainImage();

    @x1
    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(@z1 Drawable drawable);
}