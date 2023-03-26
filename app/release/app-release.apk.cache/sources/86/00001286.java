package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0819Mc implements View.OnClickListener {
    public final /* synthetic */ C0822Mf A00;

    public View$OnClickListenerC0819Mc(C0822Mf c0822Mf) {
        this.A00 = c0822Mf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC0825Mi interfaceC0825Mi;
        InterfaceC0825Mi interfaceC0825Mi2;
        if (KU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A04;
            if (z) {
                interfaceC0825Mi2 = this.A00.A03;
                interfaceC0825Mi2.A42();
                return;
            }
            interfaceC0825Mi = this.A00.A03;
            interfaceC0825Mi.A43();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}