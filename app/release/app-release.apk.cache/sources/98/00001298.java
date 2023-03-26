package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0836Mu implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass26 A00;
    public final /* synthetic */ C0827Mk A01;
    public final /* synthetic */ XU A02;

    public View$OnClickListenerC0836Mu(XU xu, C0827Mk c0827Mk, AnonymousClass26 anonymousClass26) {
        this.A02 = xu;
        this.A01 = c0827Mk;
        this.A00 = anonymousClass26;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0A.AAK(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}