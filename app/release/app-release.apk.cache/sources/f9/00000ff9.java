package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0558Bg extends Thread {
    public final /* synthetic */ AbstractC1123Xy A00;

    public C0558Bg(AbstractC1123Xy abstractC1123Xy) {
        this.A00 = abstractC1123Xy;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0N();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}