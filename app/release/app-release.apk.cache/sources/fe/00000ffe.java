package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0562Bn implements Runnable {
    public final /* synthetic */ C0566Br A00;
    public final /* synthetic */ Bs A01;
    public final /* synthetic */ Exception A02;

    public RunnableC0562Bn(C0566Br c0566Br, Bs bs, Exception exc) {
        this.A00 = c0566Br;
        this.A01 = bs;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A01.A9S(this.A02);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}