package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* renamed from: com.facebook.ads.redexgen.X.Dm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0608Dm extends T4 {
    public InterfaceC0876Oi A00;

    public final void A05(C1080Wh c1080Wh, NativeBannerAd nativeBannerAd, C0745Jb c0745Jb, NativeAdLayout nativeAdLayout) {
        MediaView adIconView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        c0745Jb.A09(adOptionsView, 20);
        this.A00 = new MX(c1080Wh, nativeBannerAd, c0745Jb, C1267bZ.A0J(nativeBannerAd.getInternalNativeAd()).A13(), adIconView, adOptionsView);
        C0795Le.A0P(nativeAdLayout, c0745Jb.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, adIconView, this.A00.getViewsForInteraction());
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