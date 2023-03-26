package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* loaded from: assets/audience_network.dex */
public class MA implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public MA(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        M0 m0;
        MT mt;
        M0 m02;
        if (KU.A02(this)) {
            return;
        }
        try {
            m0 = this.A00.A00;
            if (m0 != null) {
                mt = this.A00.A05;
                if (mt.A03()) {
                    m02 = this.A00.A00;
                    m02.A9A();
                }
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}