package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.p7700g.p99005.z1;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface NativeAdApi {
    NativeAd.AdCreativeType getAdCreativeType();

    VideoAutoplayBehavior getVideoAutoplayBehavior();

    void registerViewForInteraction(View view, MediaView mediaView);

    void registerViewForInteraction(View view, MediaView mediaView, @z1 ImageView imageView);

    void registerViewForInteraction(View view, MediaView mediaView, @z1 ImageView imageView, @z1 List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView, @z1 MediaView mediaView2);

    void registerViewForInteraction(View view, MediaView mediaView, @z1 MediaView mediaView2, @z1 List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView, @z1 List<View> list);
}