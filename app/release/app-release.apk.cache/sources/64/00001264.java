package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M3 implements View.OnClickListener {
    public final /* synthetic */ C1162Zn A00;

    public M3(C1162Zn c1162Zn) {
        this.A00 = c1162Zn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        M0 m0;
        Zm zm;
        M0 m02;
        if (KU.A02(this)) {
            return;
        }
        try {
            m0 = this.A00.A00;
            if (m0 == null) {
                return;
            }
            zm = this.A00.A04;
            if (!zm.A03()) {
                return;
            }
            m02 = this.A00.A00;
            m02.A9A();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}