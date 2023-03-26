package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1159Zj implements NH {
    public final /* synthetic */ C1158Zi A00;

    public C1159Zj(C1158Zi c1158Zi) {
        this.A00 = c1158Zi;
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAL(String str) {
        NA na;
        na = this.A00.A0A;
        na.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAN(String str) {
        N9 n9;
        this.A00.A05 = true;
        n9 = this.A00.A09;
        n9.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAd(int i) {
        boolean z;
        NA na;
        z = this.A00.A05;
        if (z) {
            na = this.A00.A0A;
            na.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAi(String str) {
        N9 n9;
        n9 = this.A00.A09;
        n9.setTitle(str);
    }
}