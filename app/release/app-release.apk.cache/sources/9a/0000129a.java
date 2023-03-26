package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0838Mw implements View.OnClickListener {
    public final /* synthetic */ C0840My A00;

    public View$OnClickListenerC0838Mw(C0840My c0840My) {
        this.A00 = c0840My;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0825Mi interfaceC0825Mi;
        if (KU.A02(this)) {
            return;
        }
        try {
            interfaceC0825Mi = this.A00.A02;
            interfaceC0825Mi.A7D();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}