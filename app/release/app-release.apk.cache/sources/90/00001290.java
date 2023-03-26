package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0829Mm implements View.OnClickListener {
    public final /* synthetic */ XX A00;

    public View$OnClickListenerC0829Mm(XX xx) {
        this.A00 = xx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.AAC(AnonymousClass24.A03);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}