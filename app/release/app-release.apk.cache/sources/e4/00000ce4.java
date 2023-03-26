package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.zg2;

@Keep
/* loaded from: classes2.dex */
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    @p1(from = 0)
    int getCurrentTimeMs();

    @p1(from = 0)
    int getDuration();

    View getVideoView();

    @g1(from = zg2.s, to = 1.0d)
    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z);

    void play(VideoStartReason videoStartReason);

    void seekTo(@p1(from = 0) int i);

    void setVolume(@g1(from = 0.0d, to = 1.0d) float f);

    boolean shouldAutoplay();
}