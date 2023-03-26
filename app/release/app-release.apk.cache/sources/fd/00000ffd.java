package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0561Bm implements Runnable {
    public final /* synthetic */ C0566Br A00;
    public final /* synthetic */ Bs A01;

    public RunnableC0561Bm(C0566Br c0566Br, Bs bs) {
        this.A00 = c0566Br;
        this.A01 = bs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A01.A9P();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}