package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MU implements View.OnClickListener {
    public final /* synthetic */ C1106Xh A00;

    public MU(C1106Xh c1106Xh) {
        this.A00 = c1106Xh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MW mw;
        if (KU.A02(this)) {
            return;
        }
        try {
            mw = this.A00.A05;
            mw.A9c();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}