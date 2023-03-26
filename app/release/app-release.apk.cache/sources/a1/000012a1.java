package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N3 implements View.OnClickListener {
    public final /* synthetic */ XT A00;

    public N3(XT xt) {
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