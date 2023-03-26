package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FB implements Runnable {
    public final /* synthetic */ C0552Az A00;

    public FB(C0552Az c0552Az) {
        this.A00 = c0552Az;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC1166Zt interfaceC1166Zt;
        if (KU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0G;
            if (!z) {
                interfaceC1166Zt = this.A00.A08;
                interfaceC1166Zt.A9F(this.A00);
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}