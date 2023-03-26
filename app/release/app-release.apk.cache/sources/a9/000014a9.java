package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class VV implements InterfaceC04416i {
    public final /* synthetic */ C1057Vk A00;

    public VV(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        String[] strArr;
        String[] strArr2;
        strArr = this.A00.A06;
        if (strArr == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1057Vk c1057Vk = this.A00;
        strArr2 = c1057Vk.A06;
        return c1057Vk.A05(strArr2.length);
    }
}