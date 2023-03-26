package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M4 implements View.OnClickListener {
    public final /* synthetic */ DialogC1169Zw A00;
    public final /* synthetic */ C1162Zn A01;
    public final /* synthetic */ MQ A02;

    public M4(C1162Zn c1162Zn, MQ mq, DialogC1169Zw dialogC1169Zw) {
        this.A01 = c1162Zn;
        this.A02 = mq;
        this.A00 = dialogC1169Zw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A02.A8p();
            this.A00.hide();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}