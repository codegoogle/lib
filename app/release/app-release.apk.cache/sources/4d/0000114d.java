package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class HR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1208aZ A03;

    public HR(C1208aZ c1208aZ, int i, long j, long j2) {
        this.A03 = c1208aZ;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HG hg;
        if (KU.A02(this)) {
            return;
        }
        try {
            hg = this.A03.A07;
            hg.A90(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}