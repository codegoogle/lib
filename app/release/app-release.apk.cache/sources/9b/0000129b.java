package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0839Mx implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass26 A00;
    public final /* synthetic */ C0827Mk A01;
    public final /* synthetic */ C0840My A02;

    public View$OnClickListenerC0839Mx(C0840My c0840My, C0827Mk c0827Mk, AnonymousClass26 anonymousClass26) {
        this.A02 = c0840My;
        this.A01 = c0827Mk;
        this.A00 = anonymousClass26;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0825Mi interfaceC0825Mi;
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC0825Mi = this.A02.A02;
            interfaceC0825Mi.AAK(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}