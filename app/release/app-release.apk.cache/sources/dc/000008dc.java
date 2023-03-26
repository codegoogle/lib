package com.anythink.expressad.playercommon;

import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    public static final String TAG = "DefaultVideoPlayerStatusListener";

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        n.a(TAG, "OnBufferingEnd");
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        n.a(TAG, "OnBufferingStart:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        n.a(TAG, "onPlayCompleted");
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        n.a(TAG, "onPlayError:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        n.a(TAG, "onPlayProgress:" + i + ",allDuration:" + i2);
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i, int i2) {
        n.a(TAG, "onPlayProgressMS:");
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        n.a(TAG, "onPlaySetDataSourceError:".concat(String.valueOf(str)));
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        wo1.Z(i, "onPlayStarted:", TAG);
    }
}