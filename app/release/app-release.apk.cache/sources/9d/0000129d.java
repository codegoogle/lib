package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0841Mz implements View.OnClickListener {
    public final /* synthetic */ XT A00;

    public View$OnClickListenerC0841Mz(XT xt) {
        this.A00 = xt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.A7D();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}