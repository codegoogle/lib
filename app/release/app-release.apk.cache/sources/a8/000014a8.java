package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public class VU implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public VU(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        String[] strArr;
        String[] strArr2;
        C04325z c04325z;
        String[] strArr3;
        strArr = this.A00.A06;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            strArr2 = this.A00.A06;
            int length = strArr2.length;
            c04325z = this.A00.A03;
            int min = Math.min(length, c04325z.A0U());
            for (int i = 0; i < min; i++) {
                strArr3 = this.A00.A06;
                arrayList.add(strArr3[i]);
            }
            return this.A00.A0F(arrayList);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}