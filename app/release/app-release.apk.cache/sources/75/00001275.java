package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class MK implements View.OnClickListener {
    public final /* synthetic */ MF A00;
    public final /* synthetic */ C1118Xt A01;

    public MK(C1118Xt c1118Xt, MF mf) {
        this.A01 = c1118Xt;
        this.A00 = mf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RelativeLayout relativeLayout;
        M1 m1;
        if (KU.A02(this)) {
            return;
        }
        try {
            C0795Le.A0M(this.A00);
            relativeLayout = this.A01.A0N;
            C0795Le.A0O(relativeLayout);
            m1 = this.A01.A04;
            C0795Le.A0O(m1);
            this.A01.A0L();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}