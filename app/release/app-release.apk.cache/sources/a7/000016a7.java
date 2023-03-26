package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.x1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public abstract class NativeAd {
    @x1
    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public static abstract class AdChoicesInfo {
        @x1
        public abstract List<Image> getImages();

        @x1
        public abstract CharSequence getText();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public static abstract class Image {
        @x1
        public abstract Drawable getDrawable();

        public abstract double getScale();

        @x1
        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    @Deprecated
    public abstract void performClick(@x1 Bundle bundle);

    @Deprecated
    public abstract boolean recordImpression(@x1 Bundle bundle);

    @Deprecated
    public abstract void reportTouchEvent(@x1 Bundle bundle);
}