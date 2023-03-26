package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FA implements Runnable {
    public final /* synthetic */ C0552Az A00;

    public FA(C0552Az c0552Az) {
        this.A00 = c0552Az;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}