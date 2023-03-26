package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class QF implements Runnable {
    public final /* synthetic */ QG A00;

    public QF(QG qg) {
        this.A00 = qg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}