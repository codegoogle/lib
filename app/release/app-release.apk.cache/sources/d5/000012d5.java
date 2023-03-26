package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0861Nt implements View.OnClickListener {
    public final /* synthetic */ C05029a A00;

    public View$OnClickListenerC0861Nt(C05029a c05029a) {
        this.A00 = c05029a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        M1 m1;
        C0792Lb c0792Lb;
        H2 h2;
        FrameLayout frameLayout;
        C0792Lb c0792Lb2;
        M1 m12;
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = false;
            m1 = this.A00.A04;
            if (m1 != null) {
                m12 = this.A00.A04;
                C0795Le.A0O(m12);
            }
            c0792Lb = this.A00.A0A;
            C0795Le.A0Q(c0792Lb, 0);
            h2 = this.A00.A0B;
            C0795Le.A0Q(h2, 0);
            C0795Le.A0Q(this.A00.getAdDetailsView(), 0);
            frameLayout = this.A00.A08;
            C0795Le.A0M(frameLayout);
            c0792Lb2 = this.A00.A0A;
            c0792Lb2.A0Y(EnumC0886Os.A03, 14);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}