package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OS implements View.OnClickListener {
    public final /* synthetic */ OT A00;

    public OS(OT ot) {
        this.A00 = ot;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7B c7b;
        if (KU.A02(this)) {
            return;
        }
        try {
            c7b = this.A00.A04;
            c7b.performClick();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}