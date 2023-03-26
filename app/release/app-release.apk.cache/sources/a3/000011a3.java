package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;
import androidx.annotation.NonNull;

@TargetApi(23)
/* renamed from: com.facebook.ads.redexgen.X.Ir  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0735Ir implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C03311y A00;

    public C0735Ir(C03311y c03311y, MediaCodec mediaCodec) {
        this.A00 = c03311y;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1T();
    }
}