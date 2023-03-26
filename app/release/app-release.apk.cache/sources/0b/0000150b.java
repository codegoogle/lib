package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class X5 implements KS {
    @Override // com.facebook.ads.redexgen.X.KS
    public final void ACR(Throwable th, Object obj) {
        if (obj instanceof C8F) {
            C1080Wh A5G = ((C8F) obj).A5G();
            if (A5G != null) {
                A5G.A0E(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C1080Wh)) {
                return;
            }
            ((C1080Wh) context).A0E(th);
        }
    }
}