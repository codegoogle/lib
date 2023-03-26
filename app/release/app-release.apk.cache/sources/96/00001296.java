package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Ms implements View.OnClickListener {
    public final /* synthetic */ C0827Mk A00;
    public final /* synthetic */ XU A01;

    public Ms(XU xu, C0827Mk c0827Mk) {
        this.A01 = xu;
        this.A00 = c0827Mk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0A.A7p();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}