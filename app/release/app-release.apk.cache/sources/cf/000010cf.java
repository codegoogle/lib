package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FL implements Runnable {
    public final /* synthetic */ FT A00;
    public final /* synthetic */ FU A01;
    public final /* synthetic */ FV A02;
    public final /* synthetic */ FW A03;

    public FL(FT ft, FW fw, FU fu, FV fv) {
        this.A00 = ft;
        this.A03 = fw;
        this.A01 = fu;
        this.A02 = fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A03.AA3(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}