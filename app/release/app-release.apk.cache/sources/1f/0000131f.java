package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P6 implements View.OnClickListener {
    public final /* synthetic */ HS A00;

    public P6(HS hs) {
        this.A00 = hs;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JL jl;
        C1080Wh c1080Wh;
        C0792Lb c0792Lb;
        boolean A08;
        C0792Lb c0792Lb2;
        C0792Lb c0792Lb3;
        if (KU.A02(this)) {
            return;
        }
        try {
            jl = this.A00.A03;
            jl.A03(JK.A0Z, null);
            c1080Wh = this.A00.A02;
            c1080Wh.A0A().A33();
            c0792Lb = this.A00.A00;
            if (c0792Lb != null) {
                A08 = this.A00.A08();
                if (A08) {
                    c0792Lb3 = this.A00.A00;
                    c0792Lb3.setVolume(1.0f);
                } else {
                    c0792Lb2 = this.A00.A00;
                    c0792Lb2.setVolume(0.0f);
                }
                this.A00.A0A();
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}