package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class T9 implements AnonymousClass79 {
    public final List<RG> A00;
    public final /* synthetic */ TA A01;

    public T9(TA ta, List<RG> list) {
        this.A01 = ta;
        this.A00 = list;
    }

    private void A00() {
        C5H c5h;
        C5H c5h2;
        C5H c5h3;
        C1080Wh c1080Wh;
        C5H c5h4;
        C5H c5h5;
        C1080Wh c1080Wh2;
        c5h = this.A01.A00;
        c5h.A07(true);
        c5h2 = this.A01.A00;
        c5h2.A04();
        c5h3 = this.A01.A00;
        c5h3.A05(0);
        for (RG rg : this.A00) {
            c1080Wh = this.A01.A01;
            JY A0I = C1267bZ.A0I();
            c5h4 = this.A01.A00;
            C1267bZ c1267bZ = new C1267bZ(c1080Wh, rg, null, A0I, c5h4.A03());
            c5h5 = this.A01.A00;
            c1080Wh2 = this.A01.A01;
            c5h5.A06(new NativeAd(c1080Wh2, c1267bZ));
        }
        KT.A00(new T8(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A97() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A9E() {
        A00();
    }
}