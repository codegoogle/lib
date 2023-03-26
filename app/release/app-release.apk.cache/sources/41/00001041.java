package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Cz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0595Cz extends T4 {
    public InterfaceC0876Oi A00;

    public final void A05(NativeAdLayout nativeAdLayout, C1080Wh c1080Wh, NativeAd nativeAd, C0745Jb c0745Jb) {
        C0847Nf c0847Nf = new C0847Nf(c1080Wh);
        MediaView mediaView = new MediaView(c1080Wh);
        AdOptionsView adOptionsView = new AdOptionsView(c1080Wh, nativeAd, nativeAdLayout);
        c0745Jb.A09(adOptionsView, 28);
        this.A00 = new MP(c1080Wh, nativeAd, c0745Jb, C1267bZ.A0J(nativeAd.getInternalNativeAd()).A13(), c0847Nf, mediaView, adOptionsView);
        C0795Le.A0P(nativeAdLayout, c0745Jb.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0847Nf, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}