package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Md  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0820Md implements View.OnClickListener {
    public final /* synthetic */ C0822Mf A00;

    public View$OnClickListenerC0820Md(C0822Mf c0822Mf) {
        this.A00 = c0822Mf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0825Mi interfaceC0825Mi;
        if (KU.A02(this)) {
            return;
        }
        try {
            interfaceC0825Mi = this.A00.A03;
            interfaceC0825Mi.A7o();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}