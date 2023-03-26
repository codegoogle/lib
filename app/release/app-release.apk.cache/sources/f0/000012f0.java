package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class OL extends AbstractC0900Pg {
    public final /* synthetic */ JE A00;
    public final /* synthetic */ LX A01;
    public final /* synthetic */ OQ A02;
    public final /* synthetic */ C0852Nk A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public OL(C0852Nk c0852Nk, String str, OQ oq, JE je, Map map, LX lx) {
        this.A03 = c0852Nk;
        this.A04 = str;
        this.A02 = oq;
        this.A00 = je;
        this.A05 = map;
        this.A01 = lx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A04() {
        C0901Ph c0901Ph;
        SparseBooleanArray sparseBooleanArray;
        C0901Ph c0901Ph2;
        SparseBooleanArray sparseBooleanArray2;
        c0901Ph = this.A03.A01;
        if (!c0901Ph.A0b() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A07;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                JE je = this.A00;
                String str = this.A04;
                NU nu = new NU(this.A05);
                c0901Ph2 = this.A03.A02;
                je.A86(str, nu.A04(c0901Ph2).A03(this.A01).A06());
                sparseBooleanArray2 = this.A03.A07;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}