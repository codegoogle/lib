package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0828Ml implements View.OnClickListener {
    public final /* synthetic */ XX A00;

    public View$OnClickListenerC0828Ml(XX xx) {
        this.A00 = xx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.A43();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}