package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Iz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0743Iz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ J3 A02;

    public RunnableC0743Iz(J3 j3, int i, long j) {
        this.A02 = j3;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J4 j4;
        if (KU.A02(this)) {
            return;
        }
        try {
            j4 = this.A02.A01;
            j4.A9T(this.A00, this.A01);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}