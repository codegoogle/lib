package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ao  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0541Ao {
    void onAudioSessionId(C0540An c0540An, int i);

    void onAudioUnderrun(C0540An c0540An, int i, long j, long j2);

    void onDecoderDisabled(C0540An c0540An, int i, C0557Be c0557Be);

    void onDecoderEnabled(C0540An c0540An, int i, C0557Be c0557Be);

    void onDecoderInitialized(C0540An c0540An, int i, String str, long j);

    void onDecoderInputFormatChanged(C0540An c0540An, int i, Format format);

    void onDownstreamFormatChanged(C0540An c0540An, FV fv);

    void onDrmKeysLoaded(C0540An c0540An);

    void onDrmKeysRemoved(C0540An c0540An);

    void onDrmKeysRestored(C0540An c0540An);

    void onDrmSessionManagerError(C0540An c0540An, Exception exc);

    void onDroppedVideoFrames(C0540An c0540An, int i, long j);

    void onLoadError(C0540An c0540An, FU fu, FV fv, IOException iOException, boolean z);

    void onLoadingChanged(C0540An c0540An, boolean z);

    void onMediaPeriodCreated(C0540An c0540An);

    void onMediaPeriodReleased(C0540An c0540An);

    void onMetadata(C0540An c0540An, Metadata metadata);

    void onPlaybackParametersChanged(C0540An c0540An, AP ap);

    void onPlayerError(C0540An c0540An, A4 a4);

    void onPlayerStateChanged(C0540An c0540An, boolean z, int i);

    void onPositionDiscontinuity(C0540An c0540An, int i);

    void onReadingStarted(C0540An c0540An);

    void onRenderedFirstFrame(C0540An c0540An, Surface surface);

    void onSeekProcessed(C0540An c0540An);

    void onSeekStarted(C0540An c0540An);

    void onTimelineChanged(C0540An c0540An, int i);

    void onTracksChanged(C0540An c0540An, TrackGroupArray trackGroupArray, H9 h9);

    void onVideoSizeChanged(C0540An c0540An, int i, int i2, int i3, float f);
}