package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class T2 implements ME {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ T3 A01;

    public T2(T3 t3, MediaViewListener mediaViewListener) {
        this.A01 = t3;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void A9B() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void A9U() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void A9a() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void A9d() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void A9e() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void AAQ() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void ABO() {
        MediaView mediaView;
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewVideoRenderer = this.A01.A04;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.facebook.ads.redexgen.X.ME
    public final void onPause() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A02;
        mediaViewListener.onPause(mediaView);
    }
}