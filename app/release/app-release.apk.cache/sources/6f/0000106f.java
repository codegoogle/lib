package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.Dj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0605Dj extends AbstractC0754Jk {
    public final /* synthetic */ C5C A00;

    public C0605Dj(C5C c5c) {
        this.A00 = c5c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(C0761Jt c0761Jt) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            C1267bZ.A0J(this.A00.A08.getInternalNativeAd()).A1U(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}