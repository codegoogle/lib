package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0934Qo implements NH {
    public final /* synthetic */ C0932Qm A00;

    public C0934Qo(C0932Qm c0932Qm) {
        this.A00 = c0932Qm;
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAL(String str) {
        NA na;
        NA na2;
        this.A00.A0I = false;
        na = this.A00.A0C;
        na.setProgress(100);
        na2 = this.A00.A0C;
        C0795Le.A0Q(na2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAN(String str) {
        NA na;
        N9 n9;
        this.A00.A0I = true;
        na = this.A00.A0C;
        C0795Le.A0Q(na, 0);
        n9 = this.A00.A0B;
        n9.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAd(int i) {
        boolean z;
        NA na;
        z = this.A00.A0I;
        if (z) {
            na = this.A00.A0C;
            na.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void AAi(String str) {
        N9 n9;
        n9 = this.A00.A0B;
        n9.setTitle(str);
    }
}