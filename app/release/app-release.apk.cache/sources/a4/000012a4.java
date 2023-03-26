package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N6 implements View.OnClickListener {
    public final /* synthetic */ N9 A00;

    public N6(N9 n9) {
        this.A00 = n9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        N8 n8;
        N8 n82;
        if (KU.A02(this)) {
            return;
        }
        try {
            n8 = this.A00.A02;
            if (n8 == null) {
                return;
            }
            n82 = this.A00.A02;
            n82.A9A();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}