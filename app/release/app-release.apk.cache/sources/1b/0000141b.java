package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.InstreamVideoAdListener;
import com.facebook.ads.InstreamVideoAdView;

/* loaded from: assets/audience_network.dex */
public class TD extends KP {
    public final /* synthetic */ C5Q A00;

    public TD(C5Q c5q) {
        this.A00 = c5q;
    }

    @Override // com.facebook.ads.redexgen.X.KP
    public final void A04() {
        InstreamVideoAdListener instreamVideoAdListener;
        InstreamVideoAdListener instreamVideoAdListener2;
        InstreamVideoAdView instreamVideoAdView;
        instreamVideoAdListener = this.A00.A01;
        if (instreamVideoAdListener != null) {
            instreamVideoAdListener2 = this.A00.A01;
            instreamVideoAdView = this.A00.A03;
            instreamVideoAdListener2.onError(instreamVideoAdView, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
        }
    }
}