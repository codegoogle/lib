package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MJ implements View.OnClickListener {
    public final /* synthetic */ MF A00;
    public final /* synthetic */ C1118Xt A01;

    public MJ(C1118Xt c1118Xt, MF mf) {
        this.A01 = c1118Xt;
        this.A00 = mf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View v;
        View v2;
        View v3;
        C0792Lb c0792Lb;
        if (KU.A02(this)) {
            return;
        }
        try {
            View v4 = this.A00;
            C0795Le.A0M(v4);
            v = this.A01.A0N;
            C0795Le.A0O(v);
            v2 = this.A01.A04;
            C0795Le.A0O(v2);
            v3 = this.A01.A09;
            if (v3 == null) {
                return;
            }
            c0792Lb = this.A01.A09;
            c0792Lb.A0Y(EnumC0886Os.A03, 15);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}