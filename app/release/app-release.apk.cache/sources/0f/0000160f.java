package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* renamed from: com.facebook.ads.redexgen.X.bL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1254bL implements JV {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C1258bP A01;

    public C1254bL(C1258bP c1258bP, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c1258bP;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void ACy() {
        this.A00.setVolume(0.0f);
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void AD1(NativeAd nativeAd) {
        this.A01.A0J(C1267bZ.A0J(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void ADc() {
        this.A01.A0D();
    }
}