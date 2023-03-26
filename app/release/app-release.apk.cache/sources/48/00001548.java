package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class Y4 extends AbstractC0900Pg {
    public final /* synthetic */ C1118Xt A00;

    public Y4(C1118Xt c1118Xt) {
        this.A00 = c1118Xt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A04() {
        LX lx;
        LX lx2;
        RR rr;
        M6 m6;
        M6 m62;
        C0901Ph c0901Ph;
        LX lx3;
        RR rr2;
        JE je;
        RR rr3;
        C1080Wh c1080Wh;
        lx = this.A00.A0V;
        if (!lx.A08()) {
            lx2 = this.A00.A0V;
            lx2.A06();
            rr = this.A00.A0P;
            if (!TextUtils.isEmpty(rr.A0Q())) {
                NU nu = new NU();
                c0901Ph = this.A00.A0f;
                NU A04 = nu.A04(c0901Ph);
                lx3 = this.A00.A0V;
                NU A03 = A04.A03(lx3);
                rr2 = this.A00.A0P;
                Map<String, String> A06 = A03.A05(rr2.A0S()).A06();
                je = this.A00.A0S;
                rr3 = this.A00.A0P;
                je.A86(rr3.A0Q(), A06);
                c1080Wh = this.A00.A0R;
                c1080Wh.A0A().A2a();
            }
            m6 = this.A00.A05;
            if (m6 != null) {
                m62 = this.A00.A05;
                m62.A3s(EnumC0888Ou.A0A.A02());
            }
        }
    }
}