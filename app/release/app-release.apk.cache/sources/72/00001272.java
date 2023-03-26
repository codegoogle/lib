package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MH implements View.OnClickListener {
    public final /* synthetic */ YA A00;

    public MH(YA ya) {
        this.A00 = ya;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0V(false);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}