package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0830Mn implements View.OnClickListener {
    public final /* synthetic */ XX A00;

    public View$OnClickListenerC0830Mn(XX xx) {
        this.A00 = xx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.AAC(AnonymousClass24.A05);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}